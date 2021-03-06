/**
 * Copyright (c) 2015 Translation Exchange, Inc. All rights reserved.
 *
 *  _______                  _       _   _             ______          _
 * |__   __|                | |     | | (_)           |  ____|        | |
 *    | |_ __ __ _ _ __  ___| | __ _| |_ _  ___  _ __ | |__  __  _____| |__   __ _ _ __   __ _  ___
 *    | | '__/ _` | '_ \/ __| |/ _` | __| |/ _ \| '_ \|  __| \ \/ / __| '_ \ / _` | '_ \ / _` |/ _ \
 *    | | | | (_| | | | \__ \ | (_| | |_| | (_) | | | | |____ >  < (__| | | | (_| | | | | (_| |  __/
 *    |_|_|  \__,_|_| |_|___/_|\__,_|\__|_|\___/|_| |_|______/_/\_\___|_| |_|\__,_|_| |_|\__, |\___|
 *                                                                                        __/ |
 *                                                                                       |___/
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.translationexchange.samples.swing.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import com.translationexchange.core.Utils;
import com.translationexchange.samples.swing.components.AttributedLabel;
import com.translationexchange.samples.swing.models.AttributedStringSample;
import com.translationexchange.samples.swing.models.Sample;

public class SampleListItem extends JPanel {

	private static final long serialVersionUID = 1050865463391736606L;

	private Sample sample;

	JPanel contentPanel;
	
	JLabel lblResults;
	JLabel lblTml;
	JLabel lblTokens;
	
	JTextPane txtTml;
	JTextPane txtResults;
	JTextPane txtTokens;
	
	AttributedLabel attributedLabel;
	
	
	/**
	 * Create the panel.
	 */
	public SampleListItem() {
		setBackground(Color.WHITE);
		setLayout(new BorderLayout());
		
		contentPanel = new JPanel();
		contentPanel.setBackground(Color.WHITE);
		add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWeights = new double[]{0.0, 1.0};
		gbl_contentPanel.rowWeights = new double[]{1.0, 1.0, 1.0};
		contentPanel.setLayout(gbl_contentPanel);
		
		lblResults = new JLabel("Result:");
		lblResults.setForeground(Color.GRAY);
		lblResults.setHorizontalAlignment(SwingConstants.LEFT);
		lblResults.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_lblResults = new GridBagConstraints();
		gbc_lblResults.fill = GridBagConstraints.BOTH;
		gbc_lblResults.insets = new Insets(0, 5, 15, 5);
		gbc_lblResults.gridx = 0;
		gbc_lblResults.gridy = 0;
		contentPanel.add(lblResults, gbc_lblResults);
		
		txtResults = new JTextPane();
		txtResults.setContentType("text/html");
		txtResults.setEditable(false);
		txtResults.setText("Result");
		GridBagConstraints gbc_txtResults = new GridBagConstraints();
		gbc_txtResults.fill = GridBagConstraints.BOTH;
		gbc_txtResults.insets = new Insets(0, 10, 15, 0);
		gbc_txtResults.gridx = 1;
		gbc_txtResults.gridy = 0;
		contentPanel.add(txtResults, gbc_txtResults);
		
		lblTml = new JLabel("TML:");
		lblTml.setForeground(Color.GRAY);
		lblTml.setHorizontalAlignment(SwingConstants.LEFT);
		lblTml.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_lblTml = new GridBagConstraints();
		gbc_lblTml.fill = GridBagConstraints.BOTH;
		gbc_lblTml.insets = new Insets(0, 5, 5, 5);
		gbc_lblTml.gridx = 0;
		gbc_lblTml.gridy = 1;
		contentPanel.add(lblTml, gbc_lblTml);
		
		txtTml = new JTextPane();
		txtTml.setForeground(Color.GRAY);
		txtTml.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		txtTml.setEditable(false);
		txtTml.setText("Hello World");
		GridBagConstraints gbc_txtTml = new GridBagConstraints();
		gbc_txtTml.fill = GridBagConstraints.BOTH;
		gbc_txtTml.insets = new Insets(0, 10, 5, 0);
		gbc_txtTml.gridx = 1;
		gbc_txtTml.gridy = 1;
		contentPanel.add(txtTml, gbc_txtTml);
		
		lblTokens = new JLabel("Tokens:");
		lblTokens.setForeground(Color.GRAY);
		lblTokens.setVerticalAlignment(SwingConstants.TOP);
		lblTokens.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblTokens = new GridBagConstraints();
		gbc_lblTokens.fill = GridBagConstraints.BOTH;
		gbc_lblTokens.insets = new Insets(0, 5, 10, 5);
		gbc_lblTokens.gridx = 0;
		gbc_lblTokens.gridy = 2;
		contentPanel.add(lblTokens, gbc_lblTokens);
		
		txtTokens = new JTextPane();
		txtTokens.setForeground(Color.GRAY);
		txtTokens.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
		txtTokens.setEditable(false);
		txtTokens.setText("Tokens");
		GridBagConstraints gbc_txtTokens = new GridBagConstraints();
		gbc_txtTokens.insets = new Insets(0, 10, 10, 0);
		gbc_txtTokens.fill = GridBagConstraints.BOTH;
		gbc_txtTokens.gridx = 1;
		gbc_txtTokens.gridy = 2;
		contentPanel.add(txtTokens, gbc_txtTokens);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(1);
		flowLayout.setHgap(1);
		add(panel, BorderLayout.SOUTH);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		add(panel_1, BorderLayout.NORTH);
	}

	public Sample getSample() {
		return sample;
	}

	public void setSample(Sample sample) {
		this.sample = sample;
		txtTml.setText(sample.getLabel());
		txtTokens.setText(Utils.buildJSON(sample.getTokens()));
		
		if (sample instanceof AttributedStringSample) {
			contentPanel.remove(txtResults);
			attributedLabel = new AttributedLabel(((AttributedStringSample) sample).getAttributedString());
			attributedLabel.setMinimumSize(new Dimension(300, 30));
			GridBagConstraints gbc_txtResults = new GridBagConstraints();
			gbc_txtResults.fill = GridBagConstraints.BOTH;
			gbc_txtResults.insets = new Insets(0, 10, 15, 0);
			gbc_txtResults.gridx = 1;
			gbc_txtResults.gridy = 0;
			contentPanel.add(attributedLabel, gbc_txtResults);
		} else {
			txtResults.setText(sample.getTranslation());
		}
		
		if (sample.hasSource()) 
			txtTokens.setText("Source:");
	}
	
}
