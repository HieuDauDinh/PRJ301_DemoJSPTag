/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Admin
 */
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ConvertToVnDateTag extends SimpleTagSupport {
    private String value;

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void doTag() throws JspException, IOException {
        String formattedDate = convertToVnDate(value);
        getJspContext().getOut().write(formattedDate);
    }

    private String convertToVnDate(String value) {
        try {
            // Định dạng ngày ban đầu
            SimpleDateFormat inputFormat = new SimpleDateFormat("MM-dd-yyyy");
            // Định dạng ngày mới
            SimpleDateFormat outputFormat = new SimpleDateFormat("'Ngay' dd, 'thang' MM, 'nam' yyyy");
            
            // Chuyển đổi ngày
            Date date = inputFormat.parse(value);
            String formattedDate = outputFormat.format(date);
            
            return formattedDate;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
