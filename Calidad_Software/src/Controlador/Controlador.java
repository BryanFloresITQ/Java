/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.Conector;
import Modelo.Datos_Libro;
import Modelo.Factura;
import Modelo.Facturass;
import Modelo.Ingreso_Usuario;
import Modelo.Libros;
import Modelo.Usuario;
import Vista.Facturas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class Controlador {

    ArrayList nombres = new ArrayList();
    ArrayList apellidos = new ArrayList();
    ArrayList cedulas = new ArrayList();
    ArrayList roles = new ArrayList();
    ArrayList telefonos = new ArrayList();
    ArrayList direcciones = new ArrayList();
    ArrayList usuarios = new ArrayList();
    ArrayList contrasenias = new ArrayList();
    PreparedStatement ps = null;
    Conector conn = new Conector();
    ResultSet rs = null;

    public void Logueo(Usuario datos, String id_Rol) {

        String traer = "SELECT * FROM usuario";

        if (id_Rol != null) {

            traer = "SELECT * FROM usuario WHERE ID_ROLL = " + id_Rol;

        }

        try {
            ps = conn.getConexion().prepareStatement(traer);
            rs = ps.executeQuery();

            while (rs.next()) {

                nombres.add(rs.getString(1));
                apellidos.add(rs.getString(2));
                cedulas.add(rs.getInt(3));
                roles.add(rs.getInt(4));
                telefonos.add(rs.getInt(5));
                direcciones.add(rs.getString(6));
                usuarios.add(rs.getString(7));
                contrasenias.add(rs.getString(8));

            }

            datos.setNombres(nombres);
            datos.setApellidos(apellidos);
            datos.setCedulas(cedulas);
            datos.setRoles(roles);
            datos.setTelefonos(telefonos);
            datos.setDirecciones(direcciones);
            datos.setUsuarios(usuarios);
            datos.setContrasenias(contrasenias);

        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void TraerClientes(Ingreso_Usuario datos, String usuario) {

        String traer = "SELECT * FROM usuario WHERE NOMBRE_DE_USUARIO = '" + usuario + "'";

        try {
            ps = conn.getConexion().prepareStatement(traer);
            rs = ps.executeQuery();

            while (rs.next()) {

                datos.setNombre(rs.getString(1));
                datos.setApellido(rs.getString(2));
                datos.setCedula(rs.getInt(3));
                datos.setTelefono(rs.getInt(5));
                datos.setDireccion(rs.getString(6));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void ingresarUsuario(Ingreso_Usuario datos) {

        String ingresar = "insert into " + "usuario (NOMBRE, APELLIDO, CEDULA_DE_IDENTIDAD, ID_ROLL, TELEFONO, DIRECCION, NOMBRE_DE_USUARIO, CONTRASENIA)"
                + " values (?,?,?,?,?,?,?,?) ";

        try {
            ps = conn.getConexion().prepareStatement(ingresar);
            ps.setString(1, datos.getNombre());
            ps.setString(2, datos.getApellido());
            ps.setInt(3, datos.getCedula());
            ps.setInt(4, datos.getRol());
            ps.setInt(5, datos.getTelefono());
            ps.setString(6, datos.getDireccion());
            ps.setString(7, datos.getUsuario());
            ps.setString(8, datos.getContrasenia());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos Ingresados");

        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Eliminar(int ci) {

        String delete = "delete from usuario where CEDULA_DE_IDENTIDAD= ?";

        try {
            ps = conn.getConexion().prepareStatement(delete);
            ps.setInt(1, ci);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void LlenarActualizar(Usuario datos, String Ci) {

        String traer = "SELECT * FROM usuario WHERE CEDULA_DE_IDENTIDAD = " + Ci;

        try {
            ps = conn.getConexion().prepareStatement(traer);
            rs = ps.executeQuery();

            while (rs.next()) {

                nombres.add(rs.getString(1));
                apellidos.add(rs.getString(2));
                cedulas.add(rs.getInt(3));
                roles.add(rs.getInt(4));
                telefonos.add(rs.getInt(5));
                direcciones.add(rs.getString(6));
                usuarios.add(rs.getString(7));
                contrasenias.add(rs.getString(8));

            }

            datos.setNombres(nombres);
            datos.setApellidos(apellidos);
            datos.setCedulas(cedulas);
            datos.setRoles(roles);
            datos.setTelefonos(telefonos);
            datos.setDirecciones(direcciones);
            datos.setUsuarios(usuarios);
            datos.setContrasenias(contrasenias);

        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Actualizar(int ci, Ingreso_Usuario datos) {

        String Update = "UPDATE usuario SET NOMBRE= ?, APELLIDO= ?, ID_ROLL= ?, TELEFONO= ?, DIRECCION= ?, "
                + "NOMBRE_DE_USUARIO= ?, CONTRASENIA= ? WHERE CEDULA_DE_IDENTIDAD= " + ci;

        try {
            ps = conn.getConexion().prepareStatement(Update);
            ps.setString(1, datos.getNombre());
            ps.setString(2, datos.getApellido());
            ps.setInt(3, datos.getRol());
            ps.setInt(4, datos.getTelefono());
            ps.setString(5, datos.getDireccion());
            ps.setString(6, datos.getUsuario());
            ps.setString(7, datos.getContrasenia());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos Actualizados", "Actualizar", 1);

        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void ActualizarStock(Datos_Libro datos, int codigo) {

        String Update = "UPDATE libros SET STOCK= ? WHERE CODIGO_DE_LIBRO= " + codigo;

        try {
            ps = conn.getConexion().prepareStatement(Update);
            ps.setInt(1, datos.getStock());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void traerStock(Datos_Libro datos, int codigo) {

        String traer = "SELECT STOCK FROM libros WHERE CODIGO_DE_LIBRO = " + codigo;

        try {
            ps = conn.getConexion().prepareStatement(traer);
            rs = ps.executeQuery();

            while (rs.next()) {
                datos.setStock(rs.getInt(1));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void TraerLibros(Libros datos, String codigo) {

        ArrayList autores = new ArrayList();
        ArrayList anios = new ArrayList();
        ArrayList titulos = new ArrayList();
        ArrayList codigos = new ArrayList();
        ArrayList generos = new ArrayList();
        ArrayList descripciones = new ArrayList();
        ArrayList stocks = new ArrayList();
        ArrayList precios = new ArrayList();

        String traer = "SELECT * FROM libros";

        if (codigo != null) {

            traer = "SELECT * FROM libros WHERE CODIGO_DE_LIBRO = " + codigo;

        }

        try {
            ps = conn.getConexion().prepareStatement(traer);
            rs = ps.executeQuery();

            while (rs.next()) {

                autores.add(rs.getString(1));
                anios.add(rs.getInt(2));
                titulos.add(rs.getString(3));
                codigos.add(rs.getInt(4));
                generos.add(rs.getString(7));
                descripciones.add(rs.getString(8));
                stocks.add(rs.getInt(9));
                precios.add(rs.getFloat(10));

            }

            datos.setAutores(autores);
            datos.setAnios(anios);
            datos.setTitulos(titulos);
            datos.setCodigos(codigos);
            datos.setGeneros(generos);
            datos.setDescripciones(descripciones);
            datos.setStocks(stocks);
            datos.setPrecios(precios);

        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void InsertarLibro(Datos_Libro datos) {

        String insertar = "INSERT INTO libros (AUTOR, ANIO_DE_PUBLICACION, TITULO, GENERO, DESCRIPCION_DE_LIBRO, STOCK, PRECIO) "
                + "VALUES (?,?,?,?,?,?,?)";

        try {
            ps = conn.getConexion().prepareStatement(insertar);

            ps.setString(1, datos.getAutor());
            ps.setInt(2, datos.getAnio());
            ps.setString(3, datos.getTitulo());
            ps.setString(4, datos.getGenero());
            ps.setString(5, datos.getDescripcion());
            ps.setInt(6, datos.getStock());
            ps.setFloat(7, datos.getPrecio());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos Ingresados");

        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void IngresarFacturas(Factura datos) {

        String insertar = "INSERT INTO factura (CEDULA_DE_IDENTIDAD, NOMBRE, DESCRIPCION, VALOR_TOTAL, CODIGO_LIBRO, CANTIDAD, PRECIO_UNIT) "
                + "VALUES (?,?,?,?,?,?,?)";

        try {
            ps = conn.getConexion().prepareStatement(insertar);

            ps.setInt(1, datos.getCedula());
            ps.setString(2, datos.getNombre());
            ps.setString(3, datos.getDescripcion());
            ps.setFloat(4, datos.getTotal());
            ps.setInt(5, 1);
            ps.setInt(6, datos.getCantidad());
            ps.setFloat(7, 1);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Compra Realizada con Éxito");

        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void TraerFacturas(Facturass datos) {

        ArrayList ids = new ArrayList();
        ArrayList cedulas = new ArrayList();
        ArrayList cantidades = new ArrayList();
        ArrayList nombres = new ArrayList();
        ArrayList descripciones = new ArrayList();
        ArrayList totales = new ArrayList();

        String traer = "SELECT * FROM factura";

        try {
            ps = conn.getConexion().prepareStatement(traer);
            rs = ps.executeQuery();

            while (rs.next()) {

                ids.add(rs.getString(1));
                cedulas.add(rs.getInt(2));
                cantidades.add(rs.getInt(4));
                nombres.add(rs.getString(5));
                descripciones.add(rs.getString(6));
                totales.add(rs.getFloat(8));
                
            }
            
            datos.setIds(ids);
            datos.setCedulas(cedulas);
            datos.setCantidades(cantidades);
            datos.setNombres(nombres);
            datos.setDescripciones(descripciones);
            datos.setTotales(totales);
            
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void TraerActualizar(Datos_Libro datos, String codigo) {

        String traer = "SELECT * FROM libros WHERE CODIGO_DE_LIBRO = " + codigo;

        try {
            ps = conn.getConexion().prepareStatement(traer);
            rs = ps.executeQuery();

            while (rs.next()) {

                datos.setAutor(rs.getString(1));
                datos.setAnio(rs.getInt(2));
                datos.setTitulo(rs.getString(3));
                datos.setGenero(rs.getString(7));
                datos.setDescripcion(rs.getString(8));
                datos.setStock(rs.getInt(9));
                datos.setPrecio(rs.getFloat(10));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Actualizar_Libro(Datos_Libro datos, String codigo) {

        String Update = "UPDATE libros SET AUTOR= ?, ANIO_DE_PUBLICACION= ?, TITULO= ?, GENERO= ?, DESCRIPCION_DE_LIBRO= ?, STOCK= ?, PRECIO= ? WHERE "
                + "CODIGO_DE_LIBRO= " + codigo;

        try {
            ps = conn.getConexion().prepareStatement(Update);

            ps.setString(1, datos.getAutor());
            ps.setInt(2, datos.getAnio());
            ps.setString(3, datos.getTitulo());
            ps.setString(4, datos.getGenero());
            ps.setString(5, datos.getDescripcion());
            ps.setInt(6, datos.getStock());
            ps.setFloat(7, datos.getPrecio());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos Actualizados", "Actualizar", 1);
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Eliminar_Libro(String codigo) {

        String delete = "DELETE FROM libros WHERE CODIGO_DE_LIBRO= " + codigo;

        try {
            ps = conn.getConexion().prepareStatement(delete);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Eliminados", "Actualizar", 1);
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Buscar_Nombre(Libros datos, String nombre) {

        ArrayList autores = new ArrayList();
        ArrayList anios = new ArrayList();
        ArrayList titulos = new ArrayList();
        ArrayList codigos = new ArrayList();
        ArrayList generos = new ArrayList();
        ArrayList descripciones = new ArrayList();
        ArrayList stocks = new ArrayList();
        ArrayList precios = new ArrayList();

        String sqlBuscarNombre = "select * from libros where TITULO LIKE " + "'%" + nombre + "%'" + "";

        try {
            ps = conn.getConexion().prepareStatement(sqlBuscarNombre);
            rs = ps.executeQuery();

            while (rs.next()) {

                autores.add(rs.getString(1));
                anios.add(rs.getInt(2));
                titulos.add(rs.getString(3));
                codigos.add(rs.getInt(4));
                generos.add(rs.getString(7));
                descripciones.add(rs.getString(8));
                stocks.add(rs.getInt(9));
                precios.add(rs.getFloat(10));

            }

            datos.setAutores(autores);
            datos.setAnios(anios);
            datos.setTitulos(titulos);
            datos.setCodigos(codigos);
            datos.setGeneros(generos);
            datos.setDescripciones(descripciones);
            datos.setStocks(stocks);
            datos.setPrecios(precios);
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }}}
