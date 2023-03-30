package com.example.application.views.list;


import com.example.application.data.entity.Contact;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;


import java.awt.*;
import java.util.Collection;

@Route(value = "")
@PageTitle("Contacts | SamMy")
public class ListView extends VerticalLayout {

  Grid<Contact> grid = new Grid<>(Contact.class);
  TextField filed = new TextField("Enter text");

    public ListView() {
        setClassName("list-view");
        setSizeFull();
        configuraGrid();
        add(toolKit(), grid);

    }

    private Component toolKit() {
        filed.setPlaceholder("Filter by name...");
        filed.setClearButtonVisible(true);
        filed.setValueChangeMode(ValueChangeMode.LAZY);

        Button btn = new Button("Exit");
        HorizontalLayout hr = new HorizontalLayout(filed, btn);
        hr.getDefaultVerticalComponentAlignment();
        hr.addClassName("toobal");
        return  hr;
    }

    private void configuraGrid() {
        grid.setClassName("contact-grid");
        grid.setSizeFull();
        grid.setColumns("firstName", "lastName", "email");
        grid.addColumn(contact -> contact.getStatus().getName()).setHeader("status");
        grid.addColumn(contact -> contact.getCompany().getName()).setHeader("Company");
        grid.getColumns().forEach(cl->cl.setAutoWidth(true));
    }


}
