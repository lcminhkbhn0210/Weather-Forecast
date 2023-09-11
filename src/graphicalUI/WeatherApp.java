package graphicalUI;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WeatherApp extends javax.swing.JFrame {
    
    public WeatherApp() {
        initComponents();
        this.setLocationRelativeTo(null);
        btn_next.setVisible(false);
        btn_pre.setVisible(false);
        btn_shrink.setVisible(false);
        btn_details.setVisible(false);
        btn_hourly.setVisible(false);
        btn_daily.setVisible(false);
        btn_prevHourly.setVisible(false);
        btn_nextHourly.setVisible(false);
        lb_iconNextToTemp.setVisible(false);
        lb_windAndIcon.setVisible(false);
        btn_swapUnit.setVisible(false);
    }

    public JLabel getLb_windAndIcon() {
        return lb_windAndIcon;
    }

    public JLabel getLb_iconNextToTemp() {
        return lb_iconNextToTemp;
    }

    public JButton getBtn_daily() {
        return btn_daily;
    }

    public JButton getBtn_hourly() {
        return btn_hourly;
    }

    public JButton getBtn_shrink() {
        return btn_shrink;
    }

    public JButton getBtn_nextHourly() {
        return btn_nextHourly;
    }

    public JButton getBtn_prevHourly() {
        return btn_prevHourly;
    }

    public JLabel getLb_feelsLike() {
        return lb_feelsLike;
    }

    public JLabel getLb_time() {
        return lb_time;
    }

    public JLabel getLb_visibility() {
        return lb_visibility;
    }

    public JLabel getLb_currentUnit() {
        return lb_currentUnit;
    }

    public JButton getBtn_swapUnit() {
        return btn_swapUnit;
    }

    public JTextField getjTextField_Search() {
        return jTextField_Search;
    }
    
    public JLabel getLb_hour11() {
        return lb_hour11;
    }

    public JLabel getLb_hour12() {
        return lb_hour12;
    }

    public JLabel getLb_hour13() {
        return lb_hour13;
    }

    public JLabel getLb_hour14() {
        return lb_hour14;
    }

    public JLabel getLb_hour15() {
        return lb_hour15;
    }

    public JLabel getLb_hour21() {
        return lb_hour21;
    }

    public JLabel getLb_hour22() {
        return lb_hour22;
    }

    public JLabel getLb_hour23() {
        return lb_hour23;
    }

    public JLabel getLb_hour24() {
        return lb_hour24;
    }

    public JLabel getLb_hour25() {
        return lb_hour25;
    }

    public JLabel getLb_hour31() {
        return lb_hour31;
    }

    public JLabel getLb_hour32() {
        return lb_hour32;
    }

    public JLabel getLb_hour33() {
        return lb_hour33;
    }

    public JLabel getLb_hour34() {
        return lb_hour34;
    }

    public JLabel getLb_hour35() {
        return lb_hour35;
    }

    public JLabel getLb_hour41() {
        return lb_hour41;
    }

    public JLabel getLb_hour42() {
        return lb_hour42;
    }

    public JLabel getLb_hour43() {
        return lb_hour43;
    }

    public JLabel getLb_hour44() {
        return lb_hour44;
    }

    public JLabel getLb_hour45() {
        return lb_hour45;
    }

    public JLabel getLb_hour51() {
        return lb_hour51;
    }

    public JLabel getLb_hour52() {
        return lb_hour52;
    }

    public JLabel getLb_hour53() {
        return lb_hour53;
    }

    public JLabel getLb_hour54() {
        return lb_hour54;
    }

    public JLabel getLb_hour55() {
        return lb_hour55;
    }
    
    

    public JLabel getLb_day14() {
        return lb_day14;
    }

    public JLabel getLb_day24() {
        return lb_day24;
    }

    public JLabel getLb_day34() {
        return lb_day34;
    }

    public JLabel getLb_day44() {
        return lb_day44;
    }
    
    public JLabel getLb_day54() {
        return lb_day54;
    }

    public JLabel getLb_day11() {
        return lb_day11;
    }

    public JLabel getLb_day12() {
        return lb_day12;
    }

    public JLabel getLb_day13() {
        return lb_day13;
    }

    public JLabel getLb_day21() {
        return lb_day21;
    }

    public JLabel getLb_day22() {
        return lb_day22;
    }

    public JLabel getLb_day23() {
        return lb_day23;
    }

    public JLabel getLb_day31() {
        return lb_day31;
    }

    public JLabel getLb_day32() {
        return lb_day32;
    }

    public JLabel getLb_day33() {
        return lb_day33;
    }

    public JLabel getLb_day41() {
        return lb_day41;
    }

    public JLabel getLb_day42() {
        return lb_day42;
    }

    public JLabel getLb_day43() {
        return lb_day43;
    }
    
    public JLabel getLb_day51() {
        return lb_day51;
    }

    public JLabel getLb_day52() {
        return lb_day52;
    }

    public JLabel getLb_day53() {
        return lb_day53;
    }
    
    public JButton getBtn_details() {
        return btn_details;
    }
    
    public JButton getBtn_find() {
        return btn_find;
    }

    public JButton getBtn_next() {
        return btn_next;
    }

    public JButton getBtn_pre() {
        return btn_pre;
    }

    public JTextArea getTextArea_details() {
        return textArea_details;
    }
    
    public JLabel getLb_apXuat() {
        return lb_apXuat;
    }

    public JLabel getLb_cloud() {
        return lb_cloud;
    }

    public JLabel getLb_date() {
        return lb_date;
    }

    public JLabel getLb_doAm() {
        return lb_doAm;
    }

    public JLabel getLb_nation() {
        return lb_nation;
    }

    public JLabel getLb_nhietDo() {
        return lb_nhietDo;
    }

    public JLabel getLb_weather() {
        return lb_weather;
    }

    public JLabel getLb_windSpeed() {
        return lb_windSpeed;
    }
    public  JLabel getlb_iconNextToTemp(){
        return  lb_iconNextToTemp;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lb_nameApp = new javax.swing.JLabel();
        btn_find = new javax.swing.JButton();
        btn_pre = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        btn_hourly = new javax.swing.JButton();
        btn_daily = new javax.swing.JButton();
        btn_shrink = new javax.swing.JButton();
        jScrollPane_Details = new javax.swing.JScrollPane();
        textArea_details = new javax.swing.JTextArea();
        lb_day11 = new javax.swing.JLabel();
        lb_day12 = new javax.swing.JLabel();
        lb_day13 = new javax.swing.JLabel();
        lb_day14 = new javax.swing.JLabel();
        lb_day21 = new javax.swing.JLabel();
        lb_day22 = new javax.swing.JLabel();
        lb_day23 = new javax.swing.JLabel();
        lb_day24 = new javax.swing.JLabel();
        lb_day31 = new javax.swing.JLabel();
        lb_day32 = new javax.swing.JLabel();
        lb_day33 = new javax.swing.JLabel();
        lb_day34 = new javax.swing.JLabel();
        lb_day41 = new javax.swing.JLabel();
        lb_day42 = new javax.swing.JLabel();
        lb_day43 = new javax.swing.JLabel();
        lb_day44 = new javax.swing.JLabel();
        lb_day51 = new javax.swing.JLabel();
        lb_day52 = new javax.swing.JLabel();
        lb_day53 = new javax.swing.JLabel();
        lb_day54 = new javax.swing.JLabel();
        jSeparatorDay1 = new javax.swing.JSeparator();
        jSeparatorDay2 = new javax.swing.JSeparator();
        jSeparatorDay3 = new javax.swing.JSeparator();
        jSeparatorDay4 = new javax.swing.JSeparator();
        jSeparatorDay5 = new javax.swing.JSeparator();
        jSeparatorMain2 = new javax.swing.JSeparator();
        lb_hour11 = new javax.swing.JLabel();
        lb_hour12 = new javax.swing.JLabel();
        lb_hour13 = new javax.swing.JLabel();
        lb_hour14 = new javax.swing.JLabel();
        lb_hour21 = new javax.swing.JLabel();
        lb_hour22 = new javax.swing.JLabel();
        lb_hour23 = new javax.swing.JLabel();
        lb_hour24 = new javax.swing.JLabel();
        lb_hour31 = new javax.swing.JLabel();
        lb_hour32 = new javax.swing.JLabel();
        lb_hour33 = new javax.swing.JLabel();
        lb_hour34 = new javax.swing.JLabel();
        lb_hour41 = new javax.swing.JLabel();
        lb_hour42 = new javax.swing.JLabel();
        lb_hour43 = new javax.swing.JLabel();
        lb_hour44 = new javax.swing.JLabel();
        lb_hour51 = new javax.swing.JLabel();
        lb_hour52 = new javax.swing.JLabel();
        lb_hour53 = new javax.swing.JLabel();
        lb_hour54 = new javax.swing.JLabel();
        lb_hour15 = new javax.swing.JLabel();
        lb_hour25 = new javax.swing.JLabel();
        lb_hour35 = new javax.swing.JLabel();
        lb_hour45 = new javax.swing.JLabel();
        lb_hour55 = new javax.swing.JLabel();
        jSeparatorHour1 = new javax.swing.JSeparator();
        jSeparatorHour2 = new javax.swing.JSeparator();
        jSeparatorHour3 = new javax.swing.JSeparator();
        jSeparatorHour4 = new javax.swing.JSeparator();
        jSeparatorHour5 = new javax.swing.JSeparator();
        jSeparatorHour6 = new javax.swing.JSeparator();
        jSeparatorHour7 = new javax.swing.JSeparator();
        jSeparatorHour8 = new javax.swing.JSeparator();
        jSeparatorHour9 = new javax.swing.JSeparator();
        jSeparatorHour10 = new javax.swing.JSeparator();
        jTextField_Search = new javax.swing.JTextField();
        btn_swapUnit = new javax.swing.JButton();
        lb_iconNextToTemp = new javax.swing.JLabel();
        lb_feelsLike = new javax.swing.JLabel();
        lb_visibility = new javax.swing.JLabel();
        lb_apXuat = new javax.swing.JLabel();
        lb_cloud = new javax.swing.JLabel();
        lb_windSpeed = new javax.swing.JLabel();
        lb_doAm = new javax.swing.JLabel();
        lb_time = new javax.swing.JLabel();
        lb_date = new javax.swing.JLabel();
        lb_nation = new javax.swing.JLabel();
        lb_currentUnit = new javax.swing.JLabel();
        lb_weather = new javax.swing.JLabel();
        lb_nhietDo = new javax.swing.JLabel();
        btn_nextHourly = new javax.swing.JButton();
        btn_prevHourly = new javax.swing.JButton();
        lb_windAndIcon = new javax.swing.JLabel();
        lb_bg1 = new javax.swing.JLabel();
        btn_details = new javax.swing.JButton();
        lb_bg2 = new javax.swing.JLabel();
        jComboBoxMode = new javax.swing.JComboBox<>();
        lb_banner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Weather Forecast APP");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(894, 655));
        setResizable(false);
        getContentPane().setLayout(null);

        lb_nameApp.setBackground(new java.awt.Color(15, 44, 79));
        lb_nameApp.setFont(new java.awt.Font("Harlow Solid Italic", 1, 70)); // NOI18N
        lb_nameApp.setForeground(new java.awt.Color(255, 255, 255));
        lb_nameApp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_nameApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/avatar (1).png"))); // NOI18N
        lb_nameApp.setText(" Weather");
        getContentPane().add(lb_nameApp);
        lb_nameApp.setBounds(70, 20, 370, 80);

        btn_find.setBackground(new java.awt.Color(122, 139, 150));
        btn_find.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        btn_find.setForeground(new java.awt.Color(255, 255, 255));
        btn_find.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        btn_find.setBorder(null);
        btn_find.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_findActionPerformed(evt);
            }
        });
        getContentPane().add(btn_find);
        btn_find.setBounds(770, 70, 60, 40);

        btn_pre.setBackground(new java.awt.Color(122, 139, 150));
        btn_pre.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_pre.setForeground(new java.awt.Color(255, 255, 255));
        btn_pre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BackgroundAbove.jpg"))); // NOI18N
        btn_pre.setText("- 3h");
        btn_pre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_pre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(btn_pre);
        btn_pre.setBounds(370, 470, 60, 30);

        btn_next.setBackground(new java.awt.Color(122, 139, 150));
        btn_next.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_next.setForeground(new java.awt.Color(255, 255, 255));
        btn_next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BackgroundAbove.jpg"))); // NOI18N
        btn_next.setText("+ 3h");
        btn_next.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_next.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });
        getContentPane().add(btn_next);
        btn_next.setBounds(450, 470, 60, 30);

        btn_hourly.setBackground(new java.awt.Color(122, 139, 150));
        btn_hourly.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_hourly.setForeground(new java.awt.Color(255, 255, 255));
        btn_hourly.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BackgroundAbove.jpg"))); // NOI18N
        btn_hourly.setText("Hourly");
        btn_hourly.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_hourly.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_hourly.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_hourly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hourlyActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hourly);
        btn_hourly.setBounds(170, 560, 100, 30);

        btn_daily.setBackground(new java.awt.Color(122, 139, 150));
        btn_daily.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_daily.setForeground(new java.awt.Color(255, 255, 255));
        btn_daily.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BackgroundAbove.jpg"))); // NOI18N
        btn_daily.setText("Daily");
        btn_daily.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_daily.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_daily.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_daily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dailyActionPerformed(evt);
            }
        });
        getContentPane().add(btn_daily);
        btn_daily.setBounds(290, 560, 100, 30);

        btn_shrink.setBackground(new java.awt.Color(122, 139, 150));
        btn_shrink.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn_shrink.setForeground(new java.awt.Color(255, 255, 255));
        btn_shrink.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BackgroundAbove.jpg"))); // NOI18N
        btn_shrink.setText("-");
        btn_shrink.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_shrink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_shrink.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_shrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_shrinkActionPerformed(evt);
            }
        });
        getContentPane().add(btn_shrink);
        btn_shrink.setBounds(780, 560, 50, 30);

        textArea_details.setEditable(false);
        textArea_details.setBackground(new java.awt.Color(0, 0, 0));
        textArea_details.setColumns(20);
        textArea_details.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        textArea_details.setForeground(new java.awt.Color(255, 255, 255));
        textArea_details.setRows(5);
        textArea_details.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(4, 32, 52)));
        jScrollPane_Details.setViewportView(textArea_details);

        getContentPane().add(jScrollPane_Details);
        jScrollPane_Details.setBounds(150, 630, 580, 170);

        lb_day11.setBackground(new java.awt.Color(0, 0, 0));
        lb_day11.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lb_day11.setForeground(new java.awt.Color(255, 255, 255));
        lb_day11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_day11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sun (2).png"))); // NOI18N
        lb_day11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_day11.setOpaque(true);
        lb_day11.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(lb_day11);
        lb_day11.setBounds(70, 630, 100, 70);

        lb_day12.setBackground(new java.awt.Color(0, 0, 0));
        lb_day12.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lb_day12.setForeground(new java.awt.Color(255, 255, 255));
        lb_day12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_day12.setOpaque(true);
        getContentPane().add(lb_day12);
        lb_day12.setBounds(70, 710, 50, 30);

        lb_day13.setBackground(new java.awt.Color(0, 0, 0));
        lb_day13.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lb_day13.setForeground(new java.awt.Color(255, 255, 255));
        lb_day13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_day13.setOpaque(true);
        getContentPane().add(lb_day13);
        lb_day13.setBounds(130, 710, 40, 30);

        lb_day14.setBackground(new java.awt.Color(0, 0, 0));
        lb_day14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb_day14.setForeground(new java.awt.Color(255, 255, 255));
        lb_day14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_day14.setText("jLabel4");
        lb_day14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_day14.setOpaque(true);
        getContentPane().add(lb_day14);
        lb_day14.setBounds(60, 760, 120, 20);

        lb_day21.setBackground(new java.awt.Color(0, 0, 0));
        lb_day21.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lb_day21.setForeground(new java.awt.Color(255, 255, 255));
        lb_day21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_day21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cloud (1).png"))); // NOI18N
        lb_day21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_day21.setOpaque(true);
        lb_day21.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(lb_day21);
        lb_day21.setBounds(230, 630, 100, 70);

        lb_day22.setBackground(new java.awt.Color(0, 0, 0));
        lb_day22.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lb_day22.setForeground(new java.awt.Color(255, 255, 255));
        lb_day22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_day22.setOpaque(true);
        getContentPane().add(lb_day22);
        lb_day22.setBounds(230, 710, 50, 30);

        lb_day23.setBackground(new java.awt.Color(0, 0, 0));
        lb_day23.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lb_day23.setForeground(new java.awt.Color(255, 255, 255));
        lb_day23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_day23.setOpaque(true);
        getContentPane().add(lb_day23);
        lb_day23.setBounds(290, 710, 40, 30);

        lb_day24.setBackground(new java.awt.Color(0, 0, 0));
        lb_day24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb_day24.setForeground(new java.awt.Color(255, 255, 255));
        lb_day24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_day24.setText("jLabel4");
        lb_day24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_day24.setOpaque(true);
        getContentPane().add(lb_day24);
        lb_day24.setBounds(220, 760, 120, 20);

        lb_day31.setBackground(new java.awt.Color(0, 0, 0));
        lb_day31.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lb_day31.setForeground(new java.awt.Color(255, 255, 255));
        lb_day31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_day31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rain (1).png"))); // NOI18N
        lb_day31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_day31.setOpaque(true);
        lb_day31.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(lb_day31);
        lb_day31.setBounds(390, 630, 100, 70);

        lb_day32.setBackground(new java.awt.Color(0, 0, 0));
        lb_day32.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lb_day32.setForeground(new java.awt.Color(255, 255, 255));
        lb_day32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_day32.setOpaque(true);
        getContentPane().add(lb_day32);
        lb_day32.setBounds(390, 710, 50, 30);

        lb_day33.setBackground(new java.awt.Color(0, 0, 0));
        lb_day33.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lb_day33.setForeground(new java.awt.Color(255, 255, 255));
        lb_day33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_day33.setOpaque(true);
        getContentPane().add(lb_day33);
        lb_day33.setBounds(450, 710, 40, 30);

        lb_day34.setBackground(new java.awt.Color(0, 0, 0));
        lb_day34.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb_day34.setForeground(new java.awt.Color(255, 255, 255));
        lb_day34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_day34.setText("jLabel4");
        lb_day34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_day34.setOpaque(true);
        getContentPane().add(lb_day34);
        lb_day34.setBounds(380, 760, 120, 20);

        lb_day41.setBackground(new java.awt.Color(0, 0, 0));
        lb_day41.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lb_day41.setForeground(new java.awt.Color(255, 255, 255));
        lb_day41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_day41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sun-day (1).png"))); // NOI18N
        lb_day41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_day41.setOpaque(true);
        lb_day41.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(lb_day41);
        lb_day41.setBounds(550, 630, 100, 70);

        lb_day42.setBackground(new java.awt.Color(0, 0, 0));
        lb_day42.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lb_day42.setForeground(new java.awt.Color(255, 255, 255));
        lb_day42.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_day42.setOpaque(true);
        getContentPane().add(lb_day42);
        lb_day42.setBounds(550, 710, 50, 30);

        lb_day43.setBackground(new java.awt.Color(0, 0, 0));
        lb_day43.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lb_day43.setForeground(new java.awt.Color(255, 255, 255));
        lb_day43.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_day43.setOpaque(true);
        getContentPane().add(lb_day43);
        lb_day43.setBounds(610, 710, 40, 30);

        lb_day44.setBackground(new java.awt.Color(0, 0, 0));
        lb_day44.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb_day44.setForeground(new java.awt.Color(255, 255, 255));
        lb_day44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_day44.setText("jLabel4");
        lb_day44.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_day44.setOpaque(true);
        getContentPane().add(lb_day44);
        lb_day44.setBounds(540, 760, 120, 20);

        lb_day51.setBackground(new java.awt.Color(0, 0, 0));
        lb_day51.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lb_day51.setForeground(new java.awt.Color(255, 255, 255));
        lb_day51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_day51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sun-day (1).png"))); // NOI18N
        lb_day51.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_day51.setOpaque(true);
        lb_day51.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(lb_day51);
        lb_day51.setBounds(710, 630, 100, 70);

        lb_day52.setBackground(new java.awt.Color(0, 0, 0));
        lb_day52.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lb_day52.setForeground(new java.awt.Color(255, 255, 255));
        lb_day52.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_day52.setOpaque(true);
        getContentPane().add(lb_day52);
        lb_day52.setBounds(710, 710, 50, 30);

        lb_day53.setBackground(new java.awt.Color(0, 0, 0));
        lb_day53.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lb_day53.setForeground(new java.awt.Color(255, 255, 255));
        lb_day53.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_day53.setOpaque(true);
        getContentPane().add(lb_day53);
        lb_day53.setBounds(770, 710, 40, 30);

        lb_day54.setBackground(new java.awt.Color(0, 0, 0));
        lb_day54.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb_day54.setForeground(new java.awt.Color(255, 255, 255));
        lb_day54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_day54.setText("jLabel4");
        lb_day54.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lb_day54.setOpaque(true);
        getContentPane().add(lb_day54);
        lb_day54.setBounds(700, 760, 120, 20);

        jSeparatorDay1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jSeparatorDay1);
        jSeparatorDay1.setBounds(50, 620, 140, 180);

        jSeparatorDay2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jSeparatorDay2);
        jSeparatorDay2.setBounds(210, 620, 140, 180);

        jSeparatorDay3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jSeparatorDay3);
        jSeparatorDay3.setBounds(370, 620, 140, 180);

        jSeparatorDay4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jSeparatorDay4);
        jSeparatorDay4.setBounds(530, 620, 140, 180);

        jSeparatorDay5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jSeparatorDay5);
        jSeparatorDay5.setBounds(690, 620, 140, 180);
        getContentPane().add(jSeparatorMain2);
        jSeparatorMain2.setBounds(50, 540, 780, 20);

        lb_hour11.setBackground(new java.awt.Color(0, 0, 0));
        lb_hour11.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lb_hour11.setForeground(new java.awt.Color(255, 255, 255));
        lb_hour11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sun-day (1).png"))); // NOI18N
        lb_hour11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_hour11.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lb_hour11.setOpaque(true);
        lb_hour11.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(lb_hour11);
        lb_hour11.setBounds(60, 630, 110, 50);

        lb_hour12.setBackground(new java.awt.Color(0, 0, 0));
        lb_hour12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lb_hour12.setForeground(new java.awt.Color(255, 255, 255));
        lb_hour12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_hour12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_hour12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lb_hour12.setOpaque(true);
        getContentPane().add(lb_hour12);
        lb_hour12.setBounds(60, 680, 100, 20);

        lb_hour13.setBackground(new java.awt.Color(0, 0, 0));
        lb_hour13.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lb_hour13.setForeground(new java.awt.Color(255, 255, 255));
        lb_hour13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_hour13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/droplet (1).png"))); // NOI18N
        lb_hour13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_hour13.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lb_hour13.setOpaque(true);
        getContentPane().add(lb_hour13);
        lb_hour13.setBounds(60, 710, 120, 20);

        lb_hour14.setBackground(new java.awt.Color(0, 0, 0));
        lb_hour14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lb_hour14.setForeground(new java.awt.Color(255, 255, 255));
        lb_hour14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_hour14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/windDirection (1).png"))); // NOI18N
        lb_hour14.setText("jLabel4");
        lb_hour14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_hour14.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lb_hour14.setOpaque(true);
        getContentPane().add(lb_hour14);
        lb_hour14.setBounds(60, 730, 120, 20);

        lb_hour21.setBackground(new java.awt.Color(0, 0, 0));
        lb_hour21.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lb_hour21.setForeground(new java.awt.Color(255, 255, 255));
        lb_hour21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cloudy (1).png"))); // NOI18N
        lb_hour21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_hour21.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lb_hour21.setOpaque(true);
        lb_hour21.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(lb_hour21);
        lb_hour21.setBounds(220, 630, 110, 50);

        lb_hour22.setBackground(new java.awt.Color(0, 0, 0));
        lb_hour22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lb_hour22.setForeground(new java.awt.Color(255, 255, 255));
        lb_hour22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_hour22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_hour22.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lb_hour22.setOpaque(true);
        getContentPane().add(lb_hour22);
        lb_hour22.setBounds(220, 680, 100, 20);

        lb_hour23.setBackground(new java.awt.Color(0, 0, 0));
        lb_hour23.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lb_hour23.setForeground(new java.awt.Color(255, 255, 255));
        lb_hour23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_hour23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/droplet (1).png"))); // NOI18N
        lb_hour23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_hour23.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lb_hour23.setOpaque(true);
        getContentPane().add(lb_hour23);
        lb_hour23.setBounds(220, 710, 120, 20);

        lb_hour24.setBackground(new java.awt.Color(0, 0, 0));
        lb_hour24.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lb_hour24.setForeground(new java.awt.Color(255, 255, 255));
        lb_hour24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_hour24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/windDirection (1).png"))); // NOI18N
        lb_hour24.setText("jLabel4");
        lb_hour24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_hour24.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lb_hour24.setOpaque(true);
        getContentPane().add(lb_hour24);
        lb_hour24.setBounds(220, 730, 120, 20);

        lb_hour31.setBackground(new java.awt.Color(0, 0, 0));
        lb_hour31.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lb_hour31.setForeground(new java.awt.Color(255, 255, 255));
        lb_hour31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rainy-day (1).png"))); // NOI18N
        lb_hour31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_hour31.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lb_hour31.setOpaque(true);
        lb_hour31.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(lb_hour31);
        lb_hour31.setBounds(380, 630, 110, 50);

        lb_hour32.setBackground(new java.awt.Color(0, 0, 0));
        lb_hour32.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lb_hour32.setForeground(new java.awt.Color(255, 255, 255));
        lb_hour32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_hour32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_hour32.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lb_hour32.setOpaque(true);
        getContentPane().add(lb_hour32);
        lb_hour32.setBounds(380, 680, 100, 20);

        lb_hour33.setBackground(new java.awt.Color(0, 0, 0));
        lb_hour33.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lb_hour33.setForeground(new java.awt.Color(255, 255, 255));
        lb_hour33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_hour33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/droplet (1).png"))); // NOI18N
        lb_hour33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_hour33.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lb_hour33.setOpaque(true);
        getContentPane().add(lb_hour33);
        lb_hour33.setBounds(380, 710, 120, 20);

        lb_hour34.setBackground(new java.awt.Color(0, 0, 0));
        lb_hour34.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lb_hour34.setForeground(new java.awt.Color(255, 255, 255));
        lb_hour34.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_hour34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/windDirection (1).png"))); // NOI18N
        lb_hour34.setText("jLabel4");
        lb_hour34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_hour34.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lb_hour34.setOpaque(true);
        getContentPane().add(lb_hour34);
        lb_hour34.setBounds(380, 730, 120, 20);

        lb_hour41.setBackground(new java.awt.Color(0, 0, 0));
        lb_hour41.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lb_hour41.setForeground(new java.awt.Color(255, 255, 255));
        lb_hour41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rain (1).png"))); // NOI18N
        lb_hour41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_hour41.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lb_hour41.setOpaque(true);
        lb_hour41.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(lb_hour41);
        lb_hour41.setBounds(540, 630, 110, 50);

        lb_hour42.setBackground(new java.awt.Color(0, 0, 0));
        lb_hour42.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lb_hour42.setForeground(new java.awt.Color(255, 255, 255));
        lb_hour42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_hour42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_hour42.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lb_hour42.setOpaque(true);
        getContentPane().add(lb_hour42);
        lb_hour42.setBounds(540, 680, 100, 20);

        lb_hour43.setBackground(new java.awt.Color(0, 0, 0));
        lb_hour43.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lb_hour43.setForeground(new java.awt.Color(255, 255, 255));
        lb_hour43.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_hour43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/droplet (1).png"))); // NOI18N
        lb_hour43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_hour43.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lb_hour43.setOpaque(true);
        getContentPane().add(lb_hour43);
        lb_hour43.setBounds(540, 710, 120, 20);

        lb_hour44.setBackground(new java.awt.Color(0, 0, 0));
        lb_hour44.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lb_hour44.setForeground(new java.awt.Color(255, 255, 255));
        lb_hour44.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_hour44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/windDirection (1).png"))); // NOI18N
        lb_hour44.setText("jLabel4");
        lb_hour44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_hour44.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lb_hour44.setOpaque(true);
        getContentPane().add(lb_hour44);
        lb_hour44.setBounds(540, 730, 120, 20);

        lb_hour51.setBackground(new java.awt.Color(0, 0, 0));
        lb_hour51.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        lb_hour51.setForeground(new java.awt.Color(255, 255, 255));
        lb_hour51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cloud (1).png"))); // NOI18N
        lb_hour51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_hour51.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lb_hour51.setOpaque(true);
        lb_hour51.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(lb_hour51);
        lb_hour51.setBounds(700, 630, 110, 50);

        lb_hour52.setBackground(new java.awt.Color(0, 0, 0));
        lb_hour52.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lb_hour52.setForeground(new java.awt.Color(255, 255, 255));
        lb_hour52.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_hour52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_hour52.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lb_hour52.setOpaque(true);
        getContentPane().add(lb_hour52);
        lb_hour52.setBounds(700, 680, 100, 20);

        lb_hour53.setBackground(new java.awt.Color(0, 0, 0));
        lb_hour53.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lb_hour53.setForeground(new java.awt.Color(255, 255, 255));
        lb_hour53.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_hour53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/droplet (1).png"))); // NOI18N
        lb_hour53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_hour53.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lb_hour53.setOpaque(true);
        getContentPane().add(lb_hour53);
        lb_hour53.setBounds(700, 710, 120, 20);

        lb_hour54.setBackground(new java.awt.Color(0, 0, 0));
        lb_hour54.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lb_hour54.setForeground(new java.awt.Color(255, 255, 255));
        lb_hour54.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_hour54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/windDirection (1).png"))); // NOI18N
        lb_hour54.setText("jLabel4");
        lb_hour54.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_hour54.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lb_hour54.setOpaque(true);
        getContentPane().add(lb_hour54);
        lb_hour54.setBounds(700, 730, 120, 20);

        lb_hour15.setBackground(new java.awt.Color(0, 0, 0));
        lb_hour15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lb_hour15.setForeground(new java.awt.Color(255, 255, 255));
        lb_hour15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_hour15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_hour15.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lb_hour15.setOpaque(true);
        getContentPane().add(lb_hour15);
        lb_hour15.setBounds(60, 770, 120, 20);

        lb_hour25.setBackground(new java.awt.Color(0, 0, 0));
        lb_hour25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lb_hour25.setForeground(new java.awt.Color(255, 255, 255));
        lb_hour25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_hour25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_hour25.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lb_hour25.setOpaque(true);
        getContentPane().add(lb_hour25);
        lb_hour25.setBounds(220, 770, 120, 20);

        lb_hour35.setBackground(new java.awt.Color(0, 0, 0));
        lb_hour35.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lb_hour35.setForeground(new java.awt.Color(255, 255, 255));
        lb_hour35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_hour35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_hour35.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lb_hour35.setOpaque(true);
        getContentPane().add(lb_hour35);
        lb_hour35.setBounds(380, 770, 120, 20);

        lb_hour45.setBackground(new java.awt.Color(0, 0, 0));
        lb_hour45.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lb_hour45.setForeground(new java.awt.Color(255, 255, 255));
        lb_hour45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_hour45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_hour45.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lb_hour45.setOpaque(true);
        getContentPane().add(lb_hour45);
        lb_hour45.setBounds(540, 770, 120, 20);

        lb_hour55.setBackground(new java.awt.Color(0, 0, 0));
        lb_hour55.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lb_hour55.setForeground(new java.awt.Color(255, 255, 255));
        lb_hour55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_hour55.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lb_hour55.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lb_hour55.setOpaque(true);
        getContentPane().add(lb_hour55);
        lb_hour55.setBounds(700, 770, 120, 20);
        getContentPane().add(jSeparatorHour1);
        jSeparatorHour1.setBounds(50, 620, 140, 130);
        getContentPane().add(jSeparatorHour2);
        jSeparatorHour2.setBounds(210, 620, 140, 130);
        getContentPane().add(jSeparatorHour3);
        jSeparatorHour3.setBounds(370, 620, 140, 130);
        getContentPane().add(jSeparatorHour4);
        jSeparatorHour4.setBounds(530, 620, 140, 130);
        getContentPane().add(jSeparatorHour5);
        jSeparatorHour5.setBounds(690, 620, 140, 130);
        getContentPane().add(jSeparatorHour6);
        jSeparatorHour6.setBounds(700, 760, 120, 40);
        getContentPane().add(jSeparatorHour7);
        jSeparatorHour7.setBounds(540, 760, 120, 40);
        getContentPane().add(jSeparatorHour8);
        jSeparatorHour8.setBounds(380, 760, 120, 40);
        getContentPane().add(jSeparatorHour9);
        jSeparatorHour9.setBounds(220, 760, 120, 40);
        getContentPane().add(jSeparatorHour10);
        jSeparatorHour10.setBounds(60, 760, 120, 40);

        jTextField_Search.setBackground(new java.awt.Color(122, 139, 150));
        jTextField_Search.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextField_Search.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_Search.setText("    Search");
        jTextField_Search.setBorder(null);
        jTextField_Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_SearchMouseClicked(evt);
            }
        });
        jTextField_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SearchActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_Search);
        jTextField_Search.setBounds(530, 70, 240, 40);

        btn_swapUnit.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_swapUnit.setForeground(new java.awt.Color(255, 255, 255));
        btn_swapUnit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BackgroundAbove.jpg"))); // NOI18N
        btn_swapUnit.setText("F");
        btn_swapUnit.setBorder(null);
        btn_swapUnit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_swapUnit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_swapUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_swapUnitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_swapUnit);
        btn_swapUnit.setBounds(520, 230, 20, 30);

        lb_iconNextToTemp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_iconNextToTemp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bigCloud.png"))); // NOI18N
        getContentPane().add(lb_iconNextToTemp);
        lb_iconNextToTemp.setBounds(290, 180, 80, 80);

        lb_feelsLike.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb_feelsLike.setForeground(new java.awt.Color(255, 255, 255));
        lb_feelsLike.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lb_feelsLike);
        lb_feelsLike.setBounds(230, 310, 120, 30);

        lb_visibility.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb_visibility.setForeground(new java.awt.Color(255, 255, 255));
        lb_visibility.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(lb_visibility);
        lb_visibility.setBounds(530, 350, 120, 30);

        lb_apXuat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb_apXuat.setForeground(new java.awt.Color(255, 255, 255));
        lb_apXuat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lb_apXuat);
        lb_apXuat.setBounds(230, 350, 120, 30);

        lb_cloud.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb_cloud.setForeground(new java.awt.Color(255, 255, 255));
        lb_cloud.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(lb_cloud);
        lb_cloud.setBounds(530, 310, 120, 30);

        lb_windSpeed.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb_windSpeed.setForeground(new java.awt.Color(255, 255, 255));
        lb_windSpeed.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_windSpeed.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(lb_windSpeed);
        lb_windSpeed.setBounds(440, 310, 70, 30);

        lb_doAm.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb_doAm.setForeground(new java.awt.Color(255, 255, 255));
        lb_doAm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lb_doAm);
        lb_doAm.setBounds(360, 350, 160, 30);

        lb_time.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lb_time.setForeground(new java.awt.Color(255, 255, 255));
        lb_time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lb_time);
        lb_time.setBounds(30, 430, 820, 30);

        lb_date.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb_date.setForeground(new java.awt.Color(255, 255, 255));
        lb_date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lb_date);
        lb_date.setBounds(340, 400, 200, 30);

        lb_nation.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lb_nation.setForeground(new java.awt.Color(255, 255, 255));
        lb_nation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lb_nation);
        lb_nation.setBounds(30, 150, 820, 30);

        lb_currentUnit.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lb_currentUnit.setForeground(new java.awt.Color(255, 255, 255));
        lb_currentUnit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(lb_currentUnit);
        lb_currentUnit.setBounds(520, 180, 50, 50);

        lb_weather.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb_weather.setForeground(new java.awt.Color(255, 255, 255));
        lb_weather.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lb_weather);
        lb_weather.setBounds(340, 260, 200, 30);

        lb_nhietDo.setFont(new java.awt.Font("Arial", 0, 70)); // NOI18N
        lb_nhietDo.setForeground(new java.awt.Color(255, 255, 255));
        lb_nhietDo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_nhietDo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lb_nhietDo);
        lb_nhietDo.setBounds(370, 180, 130, 80);

        btn_nextHourly.setBackground(new java.awt.Color(122, 139, 150));
        btn_nextHourly.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_nextHourly.setForeground(new java.awt.Color(255, 255, 255));
        btn_nextHourly.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BackgroundAbove.jpg"))); // NOI18N
        btn_nextHourly.setText(">");
        btn_nextHourly.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_nextHourly.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_nextHourly.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(btn_nextHourly);
        btn_nextHourly.setBounds(840, 690, 30, 50);

        btn_prevHourly.setBackground(new java.awt.Color(122, 139, 150));
        btn_prevHourly.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_prevHourly.setForeground(new java.awt.Color(255, 255, 255));
        btn_prevHourly.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BackgroundAbove.jpg"))); // NOI18N
        btn_prevHourly.setText("<");
        btn_prevHourly.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_prevHourly.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_prevHourly.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_prevHourly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prevHourlyActionPerformed(evt);
            }
        });
        getContentPane().add(btn_prevHourly);
        btn_prevHourly.setBounds(10, 690, 30, 50);

        lb_windAndIcon.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lb_windAndIcon.setForeground(new java.awt.Color(255, 255, 255));
        lb_windAndIcon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_windAndIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/windDirection (1).png"))); // NOI18N
        lb_windAndIcon.setText("Wind ");
        lb_windAndIcon.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(lb_windAndIcon);
        lb_windAndIcon.setBounds(360, 310, 80, 30);

        lb_bg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BackgroundAbove.jpg"))); // NOI18N
        getContentPane().add(lb_bg1);
        lb_bg1.setBounds(0, 120, 880, 420);

        btn_details.setBackground(new java.awt.Color(122, 139, 150));
        btn_details.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_details.setForeground(new java.awt.Color(255, 255, 255));
        btn_details.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BackgroundAbove.jpg"))); // NOI18N
        btn_details.setText("Day Details");
        btn_details.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_details.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_details.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detailsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_details);
        btn_details.setBounds(50, 560, 100, 30);

        lb_bg2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BackgroundAbove.jpg"))); // NOI18N
        lb_bg2.setText("jLabel2");
        getContentPane().add(lb_bg2);
        lb_bg2.setBounds(0, 540, 880, 310);

        jComboBoxMode.setBackground(new java.awt.Color(122, 139, 150));
        jComboBoxMode.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jComboBoxMode.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxMode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  Night", "  Day" }));
        jComboBoxMode.setBorder(null);
        jComboBoxMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxModeActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxMode);
        jComboBoxMode.setBounds(740, 10, 90, 40);

        lb_banner.setBackground(new java.awt.Color(39, 46, 50));
        lb_banner.setOpaque(true);
        getContentPane().add(lb_banner);
        lb_banner.setBounds(0, 0, 880, 120);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_shrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_shrinkActionPerformed
        // TODO add your handling code here:
        this.setSize(894, 655);
        this.setLocationRelativeTo(null);
        btn_shrink.setVisible(false);
        btn_prevHourly.setVisible(false);
        btn_nextHourly.setVisible(false);
    }//GEN-LAST:event_btn_shrinkActionPerformed

    private void btn_dailyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dailyActionPerformed
        // TODO add your handling code here:
        this.setSize(894, 870);
        this.setLocationRelativeTo(null);

        jScrollPane_Details.setVisible(false);
        btn_prevHourly.setVisible(false);
        btn_nextHourly.setVisible(false);
        btn_shrink.setVisible(true);
        
        lb_day11.setVisible(true);
        lb_day12.setVisible(true);
        lb_day13.setVisible(true);
        lb_day14.setVisible(true);
        lb_day21.setVisible(true);
        lb_day22.setVisible(true);
        lb_day23.setVisible(true);
        lb_day24.setVisible(true);
        lb_day31.setVisible(true);
        lb_day32.setVisible(true);
        lb_day33.setVisible(true);
        lb_day34.setVisible(true);
        lb_day41.setVisible(true);
        lb_day42.setVisible(true);
        lb_day43.setVisible(true);
        lb_day44.setVisible(true);
        lb_day51.setVisible(true);
        lb_day52.setVisible(true);
        lb_day53.setVisible(true);
        lb_day54.setVisible(true);
        jSeparatorDay1.setVisible(true);
        jSeparatorDay2.setVisible(true);
        jSeparatorDay3.setVisible(true);
        jSeparatorDay4.setVisible(true);
        jSeparatorDay5.setVisible(true);
        
        lb_hour11.setVisible(false);
        lb_hour12.setVisible(false);
        lb_hour13.setVisible(false);
        lb_hour14.setVisible(false);
        lb_hour15.setVisible(false);
        lb_hour21.setVisible(false);
        lb_hour22.setVisible(false);
        lb_hour23.setVisible(false);
        lb_hour24.setVisible(false);
        lb_hour25.setVisible(false);
        lb_hour31.setVisible(false);
        lb_hour32.setVisible(false);
        lb_hour33.setVisible(false);
        lb_hour34.setVisible(false);
        lb_hour35.setVisible(false);
        lb_hour41.setVisible(false);
        lb_hour42.setVisible(false);
        lb_hour43.setVisible(false);
        lb_hour44.setVisible(false);
        lb_hour45.setVisible(false);
        lb_hour51.setVisible(false);
        lb_hour52.setVisible(false);
        lb_hour53.setVisible(false);
        lb_hour54.setVisible(false);
        lb_hour55.setVisible(false);
        jSeparatorHour1.setVisible(false);
        jSeparatorHour2.setVisible(false);
        jSeparatorHour3.setVisible(false);
        jSeparatorHour4.setVisible(false);
        jSeparatorHour5.setVisible(false);
        jSeparatorHour6.setVisible(false);
        jSeparatorHour7.setVisible(false);
        jSeparatorHour8.setVisible(false);
        jSeparatorHour9.setVisible(false);
        jSeparatorHour10.setVisible(false);
    }//GEN-LAST:event_btn_dailyActionPerformed

    private void btn_hourlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hourlyActionPerformed
        // TODO add your handling code here:
        jScrollPane_Details.setVisible(false);
        btn_shrink.setVisible(true);
        btn_prevHourly.setVisible(true);
        btn_nextHourly.setVisible(true);
        
        this.setSize(894, 870);
        this.setLocationRelativeTo(null);

        lb_hour11.setVisible(true);
        lb_hour12.setVisible(true);
        lb_hour13.setVisible(true);
        lb_hour14.setVisible(true);
        lb_hour15.setVisible(true);
        lb_hour21.setVisible(true);
        lb_hour22.setVisible(true);
        lb_hour23.setVisible(true);
        lb_hour24.setVisible(true);
        lb_hour25.setVisible(true);
        lb_hour31.setVisible(true);
        lb_hour32.setVisible(true);
        lb_hour33.setVisible(true);
        lb_hour34.setVisible(true);
        lb_hour35.setVisible(true);
        lb_hour41.setVisible(true);
        lb_hour42.setVisible(true);
        lb_hour43.setVisible(true);
        lb_hour44.setVisible(true);
        lb_hour45.setVisible(true);
        lb_hour51.setVisible(true);
        lb_hour52.setVisible(true);
        lb_hour53.setVisible(true);
        lb_hour54.setVisible(true);
        lb_hour55.setVisible(true);
        jSeparatorHour1.setVisible(false);
        jSeparatorHour2.setVisible(false);
        jSeparatorHour3.setVisible(false);
        jSeparatorHour4.setVisible(false);
        jSeparatorHour5.setVisible(false);
        jSeparatorHour6.setVisible(true);
        jSeparatorHour7.setVisible(true);
        jSeparatorHour8.setVisible(true);
        jSeparatorHour9.setVisible(true);
        jSeparatorHour10.setVisible(true);
        
        lb_day11.setVisible(false);
        lb_day12.setVisible(false);
        lb_day13.setVisible(false);
        lb_day14.setVisible(false);
        lb_day21.setVisible(false);
        lb_day22.setVisible(false);
        lb_day23.setVisible(false);
        lb_day24.setVisible(false);
        lb_day31.setVisible(false);
        lb_day32.setVisible(false);
        lb_day33.setVisible(false);
        lb_day34.setVisible(false);
        lb_day41.setVisible(false);
        lb_day42.setVisible(false);
        lb_day43.setVisible(false);
        lb_day44.setVisible(false);
        lb_day51.setVisible(false);
        lb_day52.setVisible(false);
        lb_day53.setVisible(false);
        lb_day54.setVisible(false);
        jSeparatorDay1.setVisible(false);
        jSeparatorDay2.setVisible(false);
        jSeparatorDay3.setVisible(false);
        jSeparatorDay4.setVisible(false);
        jSeparatorDay5.setVisible(false);
    }//GEN-LAST:event_btn_hourlyActionPerformed

    private void jTextField_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SearchActionPerformed

    private void jTextField_SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_SearchMouseClicked
        // TODO add your handling code here:
        jTextField_Search.setText("   ");
    }//GEN-LAST:event_jTextField_SearchMouseClicked

    private void btn_detailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detailsActionPerformed
        // TODO add your handling code here:
        jScrollPane_Details.setVisible(true);
        btn_shrink.setVisible(true);
        btn_prevHourly.setVisible(false);
        btn_nextHourly.setVisible(false);
        
        this.setSize(894, 870);
        this.setLocationRelativeTo(null);

        lb_hour11.setVisible(false);
        lb_hour12.setVisible(false);
        lb_hour13.setVisible(false);
        lb_hour14.setVisible(false);
        lb_hour15.setVisible(false);
        lb_hour21.setVisible(false);
        lb_hour22.setVisible(false);
        lb_hour23.setVisible(false);
        lb_hour24.setVisible(false);
        lb_hour25.setVisible(false);
        lb_hour31.setVisible(false);
        lb_hour32.setVisible(false);
        lb_hour33.setVisible(false);
        lb_hour34.setVisible(false);
        lb_hour35.setVisible(false);
        lb_hour41.setVisible(false);
        lb_hour42.setVisible(false);
        lb_hour43.setVisible(false);
        lb_hour44.setVisible(false);
        lb_hour45.setVisible(false);
        lb_hour51.setVisible(false);
        lb_hour52.setVisible(false);
        lb_hour53.setVisible(false);
        lb_hour54.setVisible(false);
        lb_hour55.setVisible(false);
        jSeparatorHour1.setVisible(false);
        jSeparatorHour2.setVisible(false);
        jSeparatorHour3.setVisible(false);
        jSeparatorHour4.setVisible(false);
        jSeparatorHour5.setVisible(false);
        jSeparatorHour6.setVisible(false);
        jSeparatorHour7.setVisible(false);
        jSeparatorHour8.setVisible(false);
        jSeparatorHour9.setVisible(false);
        jSeparatorHour10.setVisible(false);
        
        lb_day11.setVisible(false);
        lb_day12.setVisible(false);
        lb_day13.setVisible(false);
        lb_day14.setVisible(false);
        lb_day21.setVisible(false);
        lb_day22.setVisible(false);
        lb_day23.setVisible(false);
        lb_day24.setVisible(false);
        lb_day31.setVisible(false);
        lb_day32.setVisible(false);
        lb_day33.setVisible(false);
        lb_day34.setVisible(false);
        lb_day41.setVisible(false);
        lb_day42.setVisible(false);
        lb_day43.setVisible(false);
        lb_day44.setVisible(false);
        lb_day51.setVisible(false);
        lb_day52.setVisible(false);
        lb_day53.setVisible(false);
        lb_day54.setVisible(false);
        jSeparatorDay1.setVisible(false);
        jSeparatorDay2.setVisible(false);
        jSeparatorDay3.setVisible(false);
        jSeparatorDay4.setVisible(false);
        jSeparatorDay5.setVisible(false);
    }//GEN-LAST:event_btn_detailsActionPerformed

    private void btn_swapUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_swapUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_swapUnitActionPerformed

    private void btn_prevHourlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prevHourlyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_prevHourlyActionPerformed

    private void jComboBoxModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxModeActionPerformed
        // TODO add your handling code here:
        if (jComboBoxMode.getSelectedItem().equals("  Day")) {
            ImageIcon icon = new ImageIcon(getClass().getResource("/image/blueSky.jpg"));
            lb_bg1.setIcon(icon);
            lb_bg2.setIcon(icon);
            lb_banner.setIcon(icon);
            
            btn_daily.setIcon(icon);
            btn_details.setIcon(icon);
            btn_hourly.setIcon(icon);
            btn_next.setIcon(icon);
            btn_pre.setIcon(icon);
            btn_nextHourly.setIcon(icon);
            btn_prevHourly.setIcon(icon);
            btn_shrink.setIcon(icon);
            btn_swapUnit.setIcon(icon);
            lb_day11.setBackground(new Color(11,149,234));
            lb_day12.setBackground(new Color(11,149,234));
            lb_day13.setBackground(new Color(11,149,234));
            lb_day14.setBackground(new Color(11,149,234));
            lb_day21.setBackground(new Color(11,149,234));
            lb_day22.setBackground(new Color(11,149,234));
            lb_day23.setBackground(new Color(11,149,234));
            lb_day24.setBackground(new Color(11,149,234));
            lb_day31.setBackground(new Color(11,149,234));
            lb_day32.setBackground(new Color(11,149,234));
            lb_day33.setBackground(new Color(11,149,234));
            lb_day34.setBackground(new Color(11,149,234));
            lb_day41.setBackground(new Color(11,149,234));
            lb_day42.setBackground(new Color(11,149,234));
            lb_day43.setBackground(new Color(11,149,234));
            lb_day44.setBackground(new Color(11,149,234));
            lb_day51.setBackground(new Color(11,149,234));
            lb_day52.setBackground(new Color(11,149,234));
            lb_day53.setBackground(new Color(11,149,234));
            lb_day54.setBackground(new Color(11,149,234));
            lb_hour11.setBackground(new Color(11,149,234));
            lb_hour12.setBackground(new Color(11,149,234));
            lb_hour13.setBackground(new Color(11,149,234));
            lb_hour14.setBackground(new Color(11,149,234));
            lb_hour15.setBackground(new Color(11,149,234));
            lb_hour21.setBackground(new Color(11,149,234));
            lb_hour22.setBackground(new Color(11,149,234));
            lb_hour23.setBackground(new Color(11,149,234));
            lb_hour24.setBackground(new Color(11,149,234));
            lb_hour25.setBackground(new Color(11,149,234));
            lb_hour31.setBackground(new Color(11,149,234));
            lb_hour32.setBackground(new Color(11,149,234));
            lb_hour33.setBackground(new Color(11,149,234));
            lb_hour34.setBackground(new Color(11,149,234));
            lb_hour35.setBackground(new Color(11,149,234));
            lb_hour41.setBackground(new Color(11,149,234));
            lb_hour42.setBackground(new Color(11,149,234));
            lb_hour43.setBackground(new Color(11,149,234));
            lb_hour44.setBackground(new Color(11,149,234));
            lb_hour45.setBackground(new Color(11,149,234));
            lb_hour51.setBackground(new Color(11,149,234));
            lb_hour52.setBackground(new Color(11,149,234));
            lb_hour53.setBackground(new Color(11,149,234));
            lb_hour54.setBackground(new Color(11,149,234));
            lb_hour55.setBackground(new Color(11,149,234));
        }
        else {
            ImageIcon icon = new ImageIcon(getClass().getResource("/image/BackgroundAbove.jpg"));
            lb_bg1.setIcon(icon);
            lb_bg2.setIcon(icon);
            lb_banner.setIcon(icon);
            
            btn_daily.setIcon(icon);
            btn_details.setIcon(icon);
            btn_hourly.setIcon(icon);
            btn_next.setIcon(icon);
            btn_pre.setIcon(icon);
            btn_nextHourly.setIcon(icon);
            btn_prevHourly.setIcon(icon);
            btn_shrink.setIcon(icon);
            btn_swapUnit.setIcon(icon);
            lb_banner.setBackground(Color.getHSBColor(39, 46, 50));
            lb_day11.setBackground(new Color(0,0,0));
            lb_day12.setBackground(new Color(0,0,0));
            lb_day13.setBackground(new Color(0,0,0));
            lb_day14.setBackground(new Color(0,0,0));
            lb_day21.setBackground(new Color(0,0,0));
            lb_day22.setBackground(new Color(0,0,0));
            lb_day23.setBackground(new Color(0,0,0));
            lb_day24.setBackground(new Color(0,0,0));
            lb_day31.setBackground(new Color(0,0,0));
            lb_day32.setBackground(new Color(0,0,0));
            lb_day33.setBackground(new Color(0,0,0));
            lb_day34.setBackground(new Color(0,0,0));
            lb_day41.setBackground(new Color(0,0,0));
            lb_day42.setBackground(new Color(0,0,0));
            lb_day43.setBackground(new Color(0,0,0));
            lb_day44.setBackground(new Color(0,0,0));
            lb_day51.setBackground(new Color(0,0,0));
            lb_day52.setBackground(new Color(0,0,0));
            lb_day53.setBackground(new Color(0,0,0));
            lb_day54.setBackground(new Color(0,0,0));
            lb_hour11.setBackground(new Color(0,0,0));
            lb_hour12.setBackground(new Color(0,0,0));
            lb_hour13.setBackground(new Color(0,0,0));
            lb_hour14.setBackground(new Color(0,0,0));
            lb_hour15.setBackground(new Color(0,0,0));
            lb_hour21.setBackground(new Color(0,0,0));
            lb_hour22.setBackground(new Color(0,0,0));
            lb_hour23.setBackground(new Color(0,0,0));
            lb_hour24.setBackground(new Color(0,0,0));
            lb_hour25.setBackground(new Color(0,0,0));
            lb_hour31.setBackground(new Color(0,0,0));
            lb_hour32.setBackground(new Color(0,0,0));
            lb_hour33.setBackground(new Color(0,0,0));
            lb_hour34.setBackground(new Color(0,0,0));
            lb_hour35.setBackground(new Color(0,0,0));
            lb_hour41.setBackground(new Color(0,0,0));
            lb_hour42.setBackground(new Color(0,0,0));
            lb_hour43.setBackground(new Color(0,0,0));
            lb_hour44.setBackground(new Color(0,0,0));
            lb_hour45.setBackground(new Color(0,0,0));
            lb_hour51.setBackground(new Color(0,0,0));
            lb_hour52.setBackground(new Color(0,0,0));
            lb_hour53.setBackground(new Color(0,0,0));
            lb_hour54.setBackground(new Color(0,0,0));
            lb_hour55.setBackground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jComboBoxModeActionPerformed

    private void cb_cityActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cb_cityActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_cb_cityActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_nextActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_btn_nextActionPerformed

    private void btn_findActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_findActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_btn_findActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WeatherApp.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WeatherApp.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WeatherApp.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WeatherApp.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WeatherApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_daily;
    private javax.swing.JButton btn_details;
    private javax.swing.JButton btn_find;
    private javax.swing.JButton btn_hourly;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_nextHourly;
    private javax.swing.JButton btn_pre;
    private javax.swing.JButton btn_prevHourly;
    private javax.swing.JButton btn_shrink;
    private javax.swing.JButton btn_swapUnit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBoxMode;
    private javax.swing.JScrollPane jScrollPane_Details;
    private javax.swing.JSeparator jSeparatorDay1;
    private javax.swing.JSeparator jSeparatorDay2;
    private javax.swing.JSeparator jSeparatorDay3;
    private javax.swing.JSeparator jSeparatorDay4;
    private javax.swing.JSeparator jSeparatorDay5;
    private javax.swing.JSeparator jSeparatorHour1;
    private javax.swing.JSeparator jSeparatorHour10;
    private javax.swing.JSeparator jSeparatorHour2;
    private javax.swing.JSeparator jSeparatorHour3;
    private javax.swing.JSeparator jSeparatorHour4;
    private javax.swing.JSeparator jSeparatorHour5;
    private javax.swing.JSeparator jSeparatorHour6;
    private javax.swing.JSeparator jSeparatorHour7;
    private javax.swing.JSeparator jSeparatorHour8;
    private javax.swing.JSeparator jSeparatorHour9;
    private javax.swing.JSeparator jSeparatorMain2;
    private javax.swing.JTextField jTextField_Search;
    private javax.swing.JLabel lb_apXuat;
    private javax.swing.JLabel lb_banner;
    private javax.swing.JLabel lb_bg1;
    private javax.swing.JLabel lb_bg2;
    private javax.swing.JLabel lb_cloud;
    private javax.swing.JLabel lb_currentUnit;
    private javax.swing.JLabel lb_date;
    private javax.swing.JLabel lb_day11;
    private javax.swing.JLabel lb_day12;
    private javax.swing.JLabel lb_day13;
    private javax.swing.JLabel lb_day14;
    private javax.swing.JLabel lb_day21;
    private javax.swing.JLabel lb_day22;
    private javax.swing.JLabel lb_day23;
    private javax.swing.JLabel lb_day24;
    private javax.swing.JLabel lb_day31;
    private javax.swing.JLabel lb_day32;
    private javax.swing.JLabel lb_day33;
    private javax.swing.JLabel lb_day34;
    private javax.swing.JLabel lb_day41;
    private javax.swing.JLabel lb_day42;
    private javax.swing.JLabel lb_day43;
    private javax.swing.JLabel lb_day44;
    private javax.swing.JLabel lb_day51;
    private javax.swing.JLabel lb_day52;
    private javax.swing.JLabel lb_day53;
    private javax.swing.JLabel lb_day54;
    private javax.swing.JLabel lb_doAm;
    private javax.swing.JLabel lb_feelsLike;
    private javax.swing.JLabel lb_hour11;
    private javax.swing.JLabel lb_hour12;
    private javax.swing.JLabel lb_hour13;
    private javax.swing.JLabel lb_hour14;
    private javax.swing.JLabel lb_hour15;
    private javax.swing.JLabel lb_hour21;
    private javax.swing.JLabel lb_hour22;
    private javax.swing.JLabel lb_hour23;
    private javax.swing.JLabel lb_hour24;
    private javax.swing.JLabel lb_hour25;
    private javax.swing.JLabel lb_hour31;
    private javax.swing.JLabel lb_hour32;
    private javax.swing.JLabel lb_hour33;
    private javax.swing.JLabel lb_hour34;
    private javax.swing.JLabel lb_hour35;
    private javax.swing.JLabel lb_hour41;
    private javax.swing.JLabel lb_hour42;
    private javax.swing.JLabel lb_hour43;
    private javax.swing.JLabel lb_hour44;
    private javax.swing.JLabel lb_hour45;
    private javax.swing.JLabel lb_hour51;
    private javax.swing.JLabel lb_hour52;
    private javax.swing.JLabel lb_hour53;
    private javax.swing.JLabel lb_hour54;
    private javax.swing.JLabel lb_hour55;
    private javax.swing.JLabel lb_iconNextToTemp;
    private javax.swing.JLabel lb_nameApp;
    private javax.swing.JLabel lb_nation;
    private javax.swing.JLabel lb_nhietDo;
    private javax.swing.JLabel lb_time;
    private javax.swing.JLabel lb_visibility;
    private javax.swing.JLabel lb_weather;
    private javax.swing.JLabel lb_windAndIcon;
    private javax.swing.JLabel lb_windSpeed;
    private javax.swing.JTextArea textArea_details;
    // End of variables declaration//GEN-END:variables
}
