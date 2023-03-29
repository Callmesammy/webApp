package com.example.application.views.list;


import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;


import java.awt.*;
import java.util.Collection;

@PageTitle("list")
@Route(value = "")
public class ListView extends VerticalLayout {

    public ListView() {
        com.vaadin.flow.component.button.Button btn = new com.vaadin.flow.component.button.Button("Enter");
        com.vaadin.flow.component.textfield.TextField textField = new com.vaadin.flow.component.textfield.TextField("Enter text");
        HorizontalLayout li = new HorizontalLayout(textField, btn);
        li.setDefaultVerticalComponentAlignment(Alignment.BASELINE);

        btn.addClickListener(click -> Notification.show("hi ," +textField.getValue()));
        add(li);


    }

}
