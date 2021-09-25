/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizador;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author mdelgado
 */
public class FrmAnalizador extends javax.swing.JFrame {

    /**
     * Creates new form FrmAnalizador
     */
    File arc;

    public FrmAnalizador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonAnalisis = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultado = new javax.swing.JTextArea();
        BotonSintactico = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnalizarLex = new javax.swing.JTextArea();
        btnArchivo = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAnalizarSin = new javax.swing.JTextArea();
        Borrar1 = new javax.swing.JButton();
        Borrar2 = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        btnIntermedio = new javax.swing.JButton();
        btnAssembler = new javax.swing.JButton();
        btnObjeto = new javax.swing.JButton();
        btnEjecutar = new javax.swing.JButton();
        btnEjecutable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonAnalisis.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BotonAnalisis.setText("Análisis Léxico");
        BotonAnalisis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnalisisActionPerformed(evt);
            }
        });

        Resultado.setColumns(20);
        Resultado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Resultado.setRows(5);
        Resultado.setText("#include \"stdio.h\"\nint main(){\nint a;\nif(a==4){\nint b;\n}\ncout<<a<<\"alo\";\nreturn 0;\n}\n");
        jScrollPane1.setViewportView(Resultado);

        BotonSintactico.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BotonSintactico.setText("Análisis Sintático");
        BotonSintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSintacticoActionPerformed(evt);
            }
        });

        txtAnalizarLex.setColumns(20);
        txtAnalizarLex.setRows(5);
        jScrollPane2.setViewportView(txtAnalizarLex);

        btnArchivo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnArchivo.setText("Abrir Fuente");
        btnArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoActionPerformed(evt);
            }
        });

        txtAnalizarSin.setColumns(20);
        txtAnalizarSin.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtAnalizarSin.setRows(5);
        jScrollPane3.setViewportView(txtAnalizarSin);

        Borrar1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Borrar1.setText("Borrar");
        Borrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Borrar1ActionPerformed(evt);
            }
        });

        Borrar2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Borrar2.setText("Borrar");
        Borrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Borrar2ActionPerformed(evt);
            }
        });

        Guardar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        btnIntermedio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnIntermedio.setText("Intermedio");
        btnIntermedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntermedioActionPerformed(evt);
            }
        });

        btnAssembler.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAssembler.setText("Assembler");
        btnAssembler.setEnabled(false);
        btnAssembler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssemblerActionPerformed(evt);
            }
        });

        btnObjeto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnObjeto.setText("Objeto");
        btnObjeto.setEnabled(false);
        btnObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObjetoActionPerformed(evt);
            }
        });

        btnEjecutar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnEjecutar.setText("Ejecutar");
        btnEjecutar.setEnabled(false);
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        btnEjecutable.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnEjecutable.setText("Ejecutable");
        btnEjecutable.setEnabled(false);
        btnEjecutable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonSintactico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Borrar2))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonAnalisis)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(Borrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIntermedio, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnAssembler, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEjecutable, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BotonAnalisis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Borrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonSintactico, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Borrar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIntermedio, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssembler, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEjecutable, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void analizarLexico() throws IOException {
        int cont = 1;

        String expr = (String) Resultado.getText();
        Lexico lexicos = new Lexico(new StringReader(expr));
        String resultado = "LINEA " + cont + "\t\tSIMBOLO\n";
        while (true) {
            Tokens token = lexicos.yylex();
            if (token == null) {
                txtAnalizarLex.setText(resultado);
                return;
            }
            switch (token) {
                case Linea:
                    cont++;
                    resultado += "LINEA " + cont + "\n";
                    break;
                case Comillas:
                    resultado += "  <Comillas>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Cadena:
                    resultado += "  <Tipo de dato>\t" + lexicos.lexemas + "\n";
                    break;
                case T_dato:
                    resultado += "  <Tipo de dato>\t" + lexicos.lexemas + "\n";
                    break;
                case If:
                    resultado += "  <Reservada if>\t" + lexicos.lexemas + "\n";
                    break;
                case Int:
                    resultado += "  <Reservada int>\t" + lexicos.lexemas + "\n";
                    break;
                case Break:
                    resultado += "  <Reservada break>\t" + lexicos.lexemas + "\n";
                    break;
                case Case:
                    resultado += "  <Reservada case>\t" + lexicos.lexemas + "\n";
                    break;
                case Char:
                    resultado += "  <Reservada char>\t" + lexicos.lexemas + "\n";
                    break;
                case Const:
                    resultado += "  <Reservada const>\t" + lexicos.lexemas + "\n";
                    break;
                case Continue:
                    resultado += "  <Reservada continue>\t" + lexicos.lexemas + "\n";
                    break;
                case Default:
                    resultado += "  <Reservada default>\t" + lexicos.lexemas + "\n";
                    break;
                case Double:
                    resultado += "  <Reservada double>\t" + lexicos.lexemas + "\n";
                    break;
                case Enum:
                    resultado += "  <Reservada enum>\t" + lexicos.lexemas + "\n";
                    break;
                case Extern:
                    resultado += "  <Reservada extern>\t" + lexicos.lexemas + "\n";
                    break;
                case Float:
                    resultado += "  <Reservada float>\t" + lexicos.lexemas + "\n";
                    break;
                case GoTo:
                    resultado += "  <Reservada goto>\t" + lexicos.lexemas + "\n";
                    break;
                case Long:
                    resultado += "  <Reservada long>\t" + lexicos.lexemas + "\n";
                    break;
                case Register:
                    resultado += "  <Reservada register>\t" + lexicos.lexemas + "\n";
                    break;
                case Return:
                    resultado += "  <Reservada return>\t" + lexicos.lexemas + "\n";
                    break;
                case Union:
                    resultado += "  <Reservada union>\t" + lexicos.lexemas + "\n";
                    break;
                case Short:
                    resultado += "  <Reservada short>\t" + lexicos.lexemas + "\n";
                    break;
                case Unsigned:
                    resultado += "  <Reservada unsigned>\t" + lexicos.lexemas + "\n";
                    break;
                case Struct:
                    resultado += "  <Reservada struct>\t" + lexicos.lexemas + "\n";
                    break;
                case Switch:
                    resultado += "  <Reservada switch>\t" + lexicos.lexemas + "\n";
                    break;
                case Typedef:
                    resultado += "  <Reservada typedef>\t" + lexicos.lexemas + "\n";
                    break;
                case Using:
                    resultado += "  <Reservada using>\t" + lexicos.lexemas + "\n";
                    break;
                case Namespace:
                    resultado += "  <Reservada namespace>\t" + lexicos.lexemas + "\n";
                    break;
                case System_r:
                    resultado += "  <Reservada System>\t" + lexicos.lexemas + "\n";
                    break;
                case Printf:
                    resultado += "  <Funcion printf>\t" + lexicos.lexemas + "\n";
                    break;
                case Scanf:
                    resultado += "  <Funcion scanf>\t" + lexicos.lexemas + "\n";
                    break;
                case Cin:
                    resultado += "  <Funcion cin>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Cout:
                    resultado += "  <Funcion cout>\t" + lexicos.lexemas + "\n";
                    break;
                case Else:
                    resultado += "  <Reservada else>\t" + lexicos.lexemas + "\n";
                    break;
                case Do:
                    resultado += "  <Reservada do>\t" + lexicos.lexemas + "\n";
                    break;
                case While:
                    resultado += "  <Reservada while>\t" + lexicos.lexemas + "\n";
                    break;
                case For:
                    resultado += "  <Reservada while>\t" + lexicos.lexemas + "\n";
                    break;
                case Igual:
                    resultado += "  <Operador igual>\t" + lexicos.lexemas + "\n";
                    break;
                case Suma:
                    resultado += "  <Operador suma>\t" + lexicos.lexemas + "\n";
                    break;
                case Resta:
                    resultado += "  <Operador resta>\t" + lexicos.lexemas + "\n";
                    break;
                case Multiplicacion:
                    resultado += "  <Operador multiplicacion>\t" + lexicos.lexemas + "\n";
                    break;
                case Division:
                    resultado += "  <Operador division>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_logico:
                    resultado += "  <Operador logico>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_incremento:
                    resultado += "  <Operador incremento>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_relacional:
                    resultado += "  <Operador relacional>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_atribucion:
                    resultado += "  <Operador atribucion>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_booleano:
                    resultado += "  <Operador booleano>\t" + lexicos.lexemas + "\n";
                    break;
                case Parent_a:
                    resultado += "  <Parentesis de apertura>\t" + lexicos.lexemas + "\n";
                    break;
                case Parent_c:
                    resultado += "  <Parentesis de cierre>\t" + lexicos.lexemas + "\n";
                    break;
                case Llave_a:
                    resultado += "  <Llave de apertura>\t" + lexicos.lexemas + "\n";
                    break;
                case Llave_c:
                    resultado += "  <Llave de cierre>\t" + lexicos.lexemas + "\n";
                    break;
                case Corchete_a:
                    resultado += "  <Corchete de apertura>\t" + lexicos.lexemas + "\n";
                    break;
                case Corchete_c:
                    resultado += "  <Corchete de cierre>\t" + lexicos.lexemas + "\n";
                    break;
                case Main:
                    resultado += "  <Reservada main>\t" + lexicos.lexemas + "\n";
                    break;
                case P_Coma:
                    resultado += "  <Punto y coma>\t" + lexicos.lexemas + "\n";
                    break;
                case Punto:
                    resultado += "  <Punto>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Coma:
                    resultado += "  <Coma>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Identificador:
                    resultado += "  <Identificador>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Numero:
                    resultado += "  <Numero>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Numeral:
                    resultado += "  <Numeral>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Define:
                    resultado += "  <Define>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Include:
                    resultado += "  <Include>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Mayor:
                    resultado += "  <Operador Mayor>\t" + lexicos.lexemas + "\n";
                    break;
                case Menor:
                    resultado += "  <Operador Menor>\t" + lexicos.lexemas + "\n";
                    break;
                case Bool:
                    resultado += "  <Reservada bool>\t" + lexicos.lexemas + "\n";
                    break;
                case Dos_puntos:
                    resultado += "  <Dos puntos>\t\t" + lexicos.lexemas + "\n";
                    break;
                case Comilla_simple:
                    resultado += "  <Comilla_simple>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_cout:
                    resultado += "  <Operador cout>\t" + lexicos.lexemas + "\n";
                    break;
                case Op_cin:
                    resultado += "  <Operador cin>\t" + lexicos.lexemas + "\n";
                    break;
                case ERROR:
                    resultado += "  <Simbolo no definido>\n";
                    break;

                default:
                    resultado += "  < " + lexicos.lexemas + " >\n";
                    break;
            }
        }

    }

    private void BotonAnalisisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnalisisActionPerformed
        try {
            analizarLexico();
        } catch (IOException ex) {
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotonAnalisisActionPerformed

    private void Borrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Borrar2ActionPerformed
        txtAnalizarSin.setText(null);
    }//GEN-LAST:event_Borrar2ActionPerformed

    private void btnArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoActionPerformed
        int cont = 1;
        JFileChooser escoger = new JFileChooser();
        escoger.showOpenDialog(null);
        arc = new File(escoger.getSelectedFile().getAbsolutePath());

        try {
            String ST = new String(Files.readAllBytes(arc.toPath()));
            Resultado.setText(ST);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnArchivoActionPerformed

    private void BotonSintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSintacticoActionPerformed
        String ST = Resultado.getText();
        Sintaxis s = new Sintaxis(new Analizador.LexicoCup(new StringReader(ST)));
        try {
            s.parse();
            txtAnalizarSin.setText("Analisis realizado correctamente");
            txtAnalizarSin.setForeground(new Color(25, 111, 61));
        } catch (Exception ex) {
            Symbol sym = s.getS();
            txtAnalizarSin.setText("Error de sintaxis. Linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            txtAnalizarSin.setForeground(Color.red);
        }
    }//GEN-LAST:event_BotonSintacticoActionPerformed

    private void Borrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Borrar1ActionPerformed
        txtAnalizarLex.setText(null);
    }//GEN-LAST:event_Borrar1ActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        System.out.println("hola");
        String contenido = Resultado.getText();
        String respuesta;
        if(arc!=null){
            GuardarATexto(arc, contenido);
            File arc2 = new File("Programa.cpp"); 
            respuesta = GuardarATexto(arc2, contenido);
        }else{
           arc = new File("Programa.cpp"); 
           respuesta = GuardarATexto(arc, contenido);
        }
        if (respuesta != null) {
            JOptionPane.showMessageDialog(null, respuesta);
        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar texto.");
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void btnObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObjetoActionPerformed
        try {
            String[] gobjeto = {"objeto.bat"};
            Runtime.getRuntime().exec(gobjeto);
            System.out.println("Ejecucion del convertidor assembler a objeto");
            btnEjecutable.setEnabled(true);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnObjetoActionPerformed

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        try {
            String [] comando={"correr.bat"};
            Runtime.getRuntime().exec(comando);
            System.out.println("Ejecucion del programa en el sistema operativo");
            btnAssembler.setEnabled(false);
            btnObjeto.setEnabled(false);
            btnEjecutable.setEnabled(false);
            btnEjecutar.setEnabled(false);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void btnIntermedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntermedioActionPerformed
        try {
            String[] intermedio = {"intermedio.bat"};
            Runtime.getRuntime().exec(intermedio);
            System.out.println("Ejecucion del convertidor de código fuente a código intermedio");
            btnAssembler.setEnabled(true);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnIntermedioActionPerformed

    private void btnAssemblerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssemblerActionPerformed
        try {
            String[] gassembler = {"ensamblador.bat"};
            Runtime.getRuntime().exec(gassembler);
            System.out.println("Ejecucion del convertidor de código intermedio a assembler");
            btnObjeto.setEnabled(true);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnAssemblerActionPerformed

    private void btnEjecutableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutableActionPerformed
        try {
            String[] gejecutable = {"ejecutable.bat"};
            Runtime.getRuntime().exec(gejecutable);
            System.out.println("Ejecucion del generador del programa ejecutable");
            btnEjecutar.setEnabled(true);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnEjecutableActionPerformed
    public String GuardarATexto(File archivo, String contenido) {
        FileOutputStream salida;
        String respuesta = null;
        try {
            salida = new FileOutputStream(archivo);
            byte[] bytesTxt = contenido.getBytes();
            salida.write(bytesTxt);
            respuesta = "Se guardo con exito el archivo";
        } catch (Exception e) {
        }
        return respuesta;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAnalizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrar1;
    private javax.swing.JButton Borrar2;
    private javax.swing.JButton BotonAnalisis;
    private javax.swing.JButton BotonSintactico;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextArea Resultado;
    private javax.swing.JButton btnArchivo;
    private javax.swing.JButton btnAssembler;
    private javax.swing.JButton btnEjecutable;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnIntermedio;
    private javax.swing.JButton btnObjeto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtAnalizarLex;
    private javax.swing.JTextArea txtAnalizarSin;
    // End of variables declaration//GEN-END:variables
}
