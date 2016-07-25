package mybnb.gui;

import java.util.Date;
import java.util.List;
import java.util.Map.Entry;
import javax.swing.DefaultListModel;
import mybnb.data.DateConstants;
import mybnb.main.Client;
import mybnb.main.Reports;
import mybnb.struct.Listing;
import mybnb.struct.User;

/**
 *
 * @author user
 */
public class ReportsPanel extends javax.swing.JPanel {

  /**
   * Creates new form ReportsPanel
   */
  public ReportsPanel() {
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

    rankCountries = new javax.swing.JButton();
    rankCities = new javax.swing.JButton();
    rankCodes = new javax.swing.JButton();
    rankHostCountry = new javax.swing.JButton();
    rankHostCity = new javax.swing.JButton();
    rankCancelHost = new javax.swing.JButton();
    rankCancelRenter = new javax.swing.JButton();
    marketShare = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    list = new javax.swing.JList<>();
    wordClouds = new javax.swing.JButton();
    startDate = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    endDate = new javax.swing.JTextField();
    rankRenters = new javax.swing.JButton();
    rankRentersCity = new javax.swing.JButton();
    rankBookingsCity = new javax.swing.JButton();
    rankBookingsPostal = new javax.swing.JButton();

    rankCountries.setText("Number of Listings per Country");
    rankCountries.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rankCountriesActionPerformed(evt);
      }
    });

    rankCities.setText("Number of Listings per City");
    rankCities.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rankCitiesActionPerformed(evt);
      }
    });

    rankCodes.setText("Number of Listings per Postal Code");
    rankCodes.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rankCodesActionPerformed(evt);
      }
    });

    rankHostCountry.setText("Rank Hosts by Country");
    rankHostCountry.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rankHostCountryActionPerformed(evt);
      }
    });

    rankHostCity.setText("Rank Hosts by City");
    rankHostCity.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rankHostCityActionPerformed(evt);
      }
    });

    rankCancelHost.setText("Rank Cancellations by Host");
    rankCancelHost.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rankCancelHostActionPerformed(evt);
      }
    });

    rankCancelRenter.setText("Rank Cancellations by Renter");
    rankCancelRenter.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rankCancelRenterActionPerformed(evt);
      }
    });

    marketShare.setText("Find Commercial Hosts");
    marketShare.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        marketShareActionPerformed(evt);
      }
    });

    jScrollPane1.setViewportView(list);

    wordClouds.setText("Get Word Clouds");
    wordClouds.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        wordCloudsActionPerformed(evt);
      }
    });

    startDate.setText("YYYY-MM-DD");

    jLabel1.setText("Start date:");

    jLabel2.setText("End date:");

    endDate.setText("YYYY-MM-DD");

    rankRenters.setText("Rank Renters in Date Range");
    rankRenters.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rankRentersActionPerformed(evt);
      }
    });

    rankRentersCity.setText("Rank Renters by City in Date Range");
    rankRentersCity.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rankRentersCityActionPerformed(evt);
      }
    });

    rankBookingsCity.setText("Rank Bookings (City) in Date Range");
    rankBookingsCity.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rankBookingsCityActionPerformed(evt);
      }
    });

    rankBookingsPostal.setText("Rank Bookings (ZIP) in Date Range");
    rankBookingsPostal.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rankBookingsPostalActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addComponent(rankRenters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(rankBookingsCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(marketShare, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(wordClouds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(rankRentersCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(rankBookingsPostal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(startDate))
                  .addComponent(rankHostCountry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(rankCancelHost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                  .addComponent(rankCountries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(rankCodes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(rankCities, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(endDate))
              .addComponent(rankHostCity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(rankCancelRenter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(rankCountries)
          .addComponent(rankCities))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(rankCodes)
            .addGap(33, 33, 33)
            .addComponent(rankHostCountry))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(62, 62, 62)
            .addComponent(rankHostCity)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(rankCancelHost)
          .addComponent(rankCancelRenter))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(wordClouds)
          .addComponent(marketShare))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel1)
          .addComponent(jLabel2)
          .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(rankRenters)
          .addComponent(rankRentersCity))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(rankBookingsCity)
          .addComponent(rankBookingsPostal))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
  }// </editor-fold>//GEN-END:initComponents

  private void rankCountriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankCountriesActionPerformed
    DefaultListModel lm = new DefaultListModel();
    for (Entry<String, Integer> c : Reports.rankCountries()) {
      lm.addElement(c.getKey() + " has " + c.getValue() + " listings");
    }
    list.setModel(lm);
  }//GEN-LAST:event_rankCountriesActionPerformed

  private void rankCitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankCitiesActionPerformed
    DefaultListModel lm = new DefaultListModel();
    for (Entry<String, Integer> c : Reports.rankCities()) {
      lm.addElement(c.getKey() + " has " + c.getValue() + " listings");
    }
    list.setModel(lm);
  }//GEN-LAST:event_rankCitiesActionPerformed

  private void rankCodesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankCodesActionPerformed
    DefaultListModel lm = new DefaultListModel();
    for (Entry<String, Integer> c : Reports.rankPostalCodes()) {
      lm.addElement(c.getKey() + " has " + c.getValue() + " listings");
    }
    list.setModel(lm);
  }//GEN-LAST:event_rankCodesActionPerformed

  private void rankHostCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankHostCountryActionPerformed
    DefaultListModel lm = new DefaultListModel();
    for (Entry<Entry<Integer, String>, Integer> c : Reports.rankHostsByCountry()) {
      User u = Client.get().toUser(c.getKey().getKey(), "", false);
      if (u == null) {
        continue;
      }
      lm.addElement(u.getFirstName() + " " + u.getLastName() + "(" + 
              c.getKey().getValue() + ") : " + c.getValue() + " listings");
    }
    list.setModel(lm);
  }//GEN-LAST:event_rankHostCountryActionPerformed

  private void rankHostCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankHostCityActionPerformed
    DefaultListModel lm = new DefaultListModel();
    for (Entry<Entry<Integer, String>, Integer> c : Reports.rankHostsByCity()) {
      User u = Client.get().toUser(c.getKey().getKey(), "", false);
      if (u == null) {
        continue;
      }
      lm.addElement(u.getFirstName() + " " + u.getLastName() + "(" + 
              c.getKey().getValue() + ") : " + c.getValue() + " listings");
    }
    list.setModel(lm);
  }//GEN-LAST:event_rankHostCityActionPerformed

  private void rankCancelHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankCancelHostActionPerformed
    DefaultListModel lm = new DefaultListModel();
    for (Entry<Integer, Integer> c : Reports.rankCancels(true)) {
      User u = Client.get().toUser(c.getKey(), "", false);
      if (u == null) {
        continue;
      }
      lm.addElement(u.getFirstName() + " " + u.getLastName() + 
              " : " + c.getValue() + " cancellations");
    }
    list.setModel(lm);
  }//GEN-LAST:event_rankCancelHostActionPerformed

  private void rankCancelRenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankCancelRenterActionPerformed
    DefaultListModel lm = new DefaultListModel();
    for (Entry<Integer, Integer> c : Reports.rankCancels(false)) {
      User u = Client.get().toUser(c.getKey(), "", false);
      if (u == null) {
        continue;
      }
      lm.addElement(u.getFirstName() + " " + u.getLastName() + 
              " : " + c.getValue() + " cancellations");
    }
    list.setModel(lm);
  }//GEN-LAST:event_rankCancelRenterActionPerformed

  private void marketShareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marketShareActionPerformed
    DefaultListModel lm = new DefaultListModel();
    for (Entry<Entry<Integer, String>, Double> c : Reports.marketShares()) {
      User u = Client.get().toUser(c.getKey().getKey(), "", false);
      if (u == null) {
        continue;
      }
      lm.addElement(u.getFirstName() + " " + u.getLastName() + "(" + 
              c.getKey().getValue() + ") : " + (Math.round(c.getValue() * 100) / 100)
              + "% market share");
    }
    list.setModel(lm);
  }//GEN-LAST:event_marketShareActionPerformed

  private void wordCloudsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordCloudsActionPerformed
    DefaultListModel lm = new DefaultListModel();
    for (Entry<Integer, List<Entry<String, Integer>>> c : Reports.getWordClouds().entrySet()) {
      Listing l = Client.get().getListing(c.getKey());
      if (l == null) {
        continue;
      }
      String s = l.getTitle() + " : [";
      for (Entry<String, Integer> d : c.getValue()) {
        s += d.getKey() + " = " + d.getValue() + " times, ";
      }
      lm.addElement(s.substring(0, s.length() - (c.getValue().size() > 0 ? 2 : 0)) + "]");
    }
    list.setModel(lm);
  }//GEN-LAST:event_wordCloudsActionPerformed

  private void rankRentersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankRentersActionPerformed
    Date begin = DateConstants.parseDate(startDate.getText());
    Date end = DateConstants.parseDate(endDate.getText());
    if (begin == null || end == null) {
      return;
    }
    DefaultListModel lm = new DefaultListModel();
    for (Entry<Integer, Integer> c : Reports.rankRenters(begin, end)) {
      User u = Client.get().toUser(c.getKey(), "", false);
      if (u == null) {
        continue;
      }
      lm.addElement(u.getFirstName() + " " + u.getLastName() + 
              " : " + c.getValue() + " bookings");
    }
    list.setModel(lm);
  }//GEN-LAST:event_rankRentersActionPerformed

  private void rankRentersCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankRentersCityActionPerformed
    Date begin = DateConstants.parseDate(startDate.getText());
    Date end = DateConstants.parseDate(endDate.getText());
    if (begin == null || end == null) {
      return;
    }
    DefaultListModel lm = new DefaultListModel();
    for (Entry<Entry<Integer, String>, Integer> c : Reports.rankRentersByCity(begin, end)) {
      User u = Client.get().toUser(c.getKey().getKey(), "", false);
      if (u == null) {
        continue;
      }
      lm.addElement(u.getFirstName() + " " + u.getLastName() + "(" + 
              c.getKey().getValue() + ") : " + c.getValue() + " bookings");
    }
    list.setModel(lm);
  }//GEN-LAST:event_rankRentersCityActionPerformed

  private void rankBookingsCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankBookingsCityActionPerformed
    Date begin = DateConstants.parseDate(startDate.getText());
    Date end = DateConstants.parseDate(endDate.getText());
    if (begin == null || end == null) {
      return;
    }
    DefaultListModel lm = new DefaultListModel();
    for (Entry<String, Integer> c : Reports.rankCityBookings(begin, end)) {
      lm.addElement(c.getKey() + " : " + c.getValue() + " bookings");
    }
    list.setModel(lm);
  }//GEN-LAST:event_rankBookingsCityActionPerformed

  private void rankBookingsPostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankBookingsPostalActionPerformed
    Date begin = DateConstants.parseDate(startDate.getText());
    Date end = DateConstants.parseDate(endDate.getText());
    if (begin == null || end == null) {
      return;
    }
    DefaultListModel lm = new DefaultListModel();
    for (Entry<String, Integer> c : Reports.rankPostalCodeBookings(begin, end)) {
      lm.addElement(c.getKey() + " : " + c.getValue() + " bookings");
    }
    list.setModel(lm);
  }//GEN-LAST:event_rankBookingsPostalActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextField endDate;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JList<String> list;
  private javax.swing.JButton marketShare;
  private javax.swing.JButton rankBookingsCity;
  private javax.swing.JButton rankBookingsPostal;
  private javax.swing.JButton rankCancelHost;
  private javax.swing.JButton rankCancelRenter;
  private javax.swing.JButton rankCities;
  private javax.swing.JButton rankCodes;
  private javax.swing.JButton rankCountries;
  private javax.swing.JButton rankHostCity;
  private javax.swing.JButton rankHostCountry;
  private javax.swing.JButton rankRenters;
  private javax.swing.JButton rankRentersCity;
  private javax.swing.JTextField startDate;
  private javax.swing.JButton wordClouds;
  // End of variables declaration//GEN-END:variables
}
