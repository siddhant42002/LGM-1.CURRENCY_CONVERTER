import java.awt.Color;

public class CurrencyConverter extends javax.swing.JFrame {
    // Variable declarations
    private javax.swing.JComboBox<String> cbSource;
    private javax.swing.JLabel lblSource;
    private javax.swing.JComboBox<String> cbTarget;
    private javax.swing.JLabel lblTarget;
    private javax.swing.JButton btnConvert;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblFrom;
    private javax.swing.JLabel lblTo;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JTextField txtSource;
    private javax.swing.JTextField txtTarget;

    // Currency exchange rates
    double US_Dollar = 1.31;
    double Canadian_Dollar = 1.71;
    double Indonesian_Rupiah = 19554.94;
    double Indian_Rupee = 95.21;
    double Japanese_Yen = 180.79;
    double Chinese_Yuan = 91.40;

    // Currency units
    String[] currencyUnits = {
            "not selected",
            "Indian Rupee",
            "Japanese Yen",
            "Chinese Yuan",
            "US Dollar",
            "Canadian Dollar",
            "Indonesian Rupiah",
    };

    public CurrencyConverter() {
        initComponents();
    }

    // Setting the panel designs
    @SuppressWarnings("unchecked")
    private void initComponents() {
        pnlMain = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        cbSource = new javax.swing.JComboBox<>();
        cbTarget = new javax.swing.JComboBox<>();
        lblFrom = new javax.swing.JLabel();
        lblTo = new javax.swing.JLabel();
        txtSource = new javax.swing.JTextField();
        txtTarget = new javax.swing.JTextField();
        btnConvert = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblTarget = new javax.swing.JLabel();
        lblSource = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Ariel", 1, 24));
        lblTitle.setText("Currency Converter");

        cbSource.setFont(new java.awt.Font("Ariel", 0, 18));
        cbSource.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "From ...", "India", "Japan", "China", "USA", "Canada", "Indonesia"}));
        cbSource.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSourceItemStateChanged(evt);
            }
        });
        cbSource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSourceActionPerformed(evt);
            }
        });

        cbTarget.setFont(new java.awt.Font("minimal", 0, 18));
        cbTarget.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "To ...", "India", "Japan", "China", "USA", "Canada", "Indonesia"}));
        cbTarget.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTargetItemStateChanged(evt);
            }
        });

        lblFrom.setFont(new java.awt.Font("Ariel", 1, 14));
        lblFrom.setText("Source currency");

        lblTo.setFont(new java.awt.Font("Ariel", 1, 14));
        lblTo.setText("Target currency");

        txtSource.setFont(new java.awt.Font("Ariel", 1, 14));

        txtTarget.setFont(new java.awt.Font("Ariel", 1, 14));

        btnConvert.setFont(new java.awt.Font("Ariel", 0, 18));
        btnConvert.setText("Convert");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Ariel", 0, 18));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        lblSource.setFont(new java.awt.Font("Ariel", 0, 14));
        lblSource.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSource.setText("not selected");
        lblTarget.setFont(new java.awt.Font("Ariel", 0, 14));
        lblTarget.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTarget.setText("not selected");

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMain.setBackground(new Color(245, 245, 245));
        pnlMainLayout.setHorizontalGroup(
                pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTitle)
                                .addGap(290, 290, 290))
                        .addGroup(pnlMainLayout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnConvert)
                                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cbSource, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtSource)
                                                .addComponent(lblFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblSource, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)))
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlMainLayout.createSequentialGroup()
                                                .addGap(81, 81, 81)
                                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(lblTo)
                                                                .addComponent(cbTarget, 0, 272, Short.MAX_VALUE)
                                                                .addComponent(txtTarget))
                                                        .addComponent(lblTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(pnlMainLayout.createSequentialGroup()
                                                .addGap(270, 270, 270)
                                                .addComponent(btnReset)))
                                .addContainerGap(114, Short.MAX_VALUE))
        );
        pnlMainLayout.setVerticalGroup(
                pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlMainLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTitle)
                                .addGap(28, 28, 28)
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblFrom)
                                        .addComponent(lblTo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbSource, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                                        .addComponent(cbTarget))
                                .addGap(18, 18, 18)
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtSource, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                                        .addComponent(txtTarget))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlMainLayout.createSequentialGroup()
                                                .addComponent(lblTarget, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(14, 14, 14))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                                                .addComponent(lblSource, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnConvert)
                                        .addComponent(btnReset))
                                .addContainerGap(57, Short.MAX_VALUE))
        );

        // Setting the horizontal and vertical groups
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
    }

    // Action listeners
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {
        cbSource.setSelectedIndex(0);
        cbTarget.setSelectedIndex(0);
        txtSource.setText("");
        txtTarget.setText("");
    }

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {
        double amountToChange=Double.parseDouble(txtSource.getText());
        double amountChanged=0.0;
        double amountInPounds=0.0;

        // UK pound sterling(GBP) is used as the base
        switch(cbSource.getSelectedItem().toString()) {
            case "India":amountInPounds = amountToChange/Indian_Rupee;break;
            case "Japan":amountInPounds = amountToChange/Japanese_Yen;break;
            case "China":amountInPounds = amountToChange/Chinese_Yuan;break;
            case "USA": amountInPounds = amountToChange/US_Dollar;break;
            case "Canada":amountInPounds = amountToChange/Canadian_Dollar;break;
            case "Indonesia":amountInPounds = amountToChange/Indonesian_Rupiah;break;
            default:amountInPounds = 0.0;
        }

        //amount is Changed in pounds

        switch(cbTarget.getSelectedItem().toString()) {
            case "India":amountChanged = amountInPounds * Indian_Rupee;break;
            case "Japan":amountChanged = amountInPounds * Japanese_Yen;break;
            case "China":amountChanged = amountInPounds * Chinese_Yuan;break;
            case "USA":amountChanged = amountInPounds * US_Dollar;break;
            case "Canada":amountChanged = amountInPounds * Canadian_Dollar;break;
            case "Indonesia":amountChanged = amountInPounds * Indonesian_Rupiah;break;
            default:amountChanged = amountInPounds * 0.0;
        }

        String value = String.format("%.2f",amountChanged);
        txtTarget.setText(value);
    }

    private void cbSourceActionPerformed(java.awt.event.ActionEvent evt) {
        // empty
    }

    private void cbSourceItemStateChanged(java.awt.event.ItemEvent evt) {
        lblSource.setText(currencyUnits[cbSource.getSelectedIndex()]);
    }

    private void cbTargetItemStateChanged(java.awt.event.ItemEvent evt) {
        lblTarget.setText(currencyUnits[cbTarget.getSelectedIndex()]);
    }

    // Main code

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrencyConverter().setVisible(true);
            }
        });
    }
}
