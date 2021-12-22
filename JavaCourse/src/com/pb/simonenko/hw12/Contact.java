package com.pb.simonenko.hw12;

import java.util.Date;
import java.util.List;

public class Contact {
    private String fio;
    private String dateBD;
    private List<String> phones;
    private String address;
    private Date redactTime = new Date();

    public Date getRedactTime() {
        return redactTime;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getDateBD() {
        return dateBD;
    }

    public void setDateBD(String dateBD) {
        this.dateBD = dateBD;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void addPhone(String phone)
    {
        phones.add(phone);
    }

    public void deletePhone(String phone)
    {
        int id = 0;
        for (int i = 0; i < phones.stream().count(); i++) {
            if(phones.get(i).equals(phone))
                id = i;
        }
        phones.remove(id);
    }

    public void setRedactTime() {
        this.redactTime = new Date();
    }

    public Contact(String fio, String dateBD, List<String> phoneList, String address)
    {
        this.fio = fio;
        this.dateBD = dateBD;
        this.phones = phoneList;
        this.address = address;
        this.redactTime = new Date();
    }

    @Override
    public String toString() {
        return "Contact{" +
                "fio='" + fio + '\'' +
                ", dateBD='" + dateBD + '\'' +
                ", phones=" + String.join(", ",phones) +
                ", address='" + address + '\'' +
                ", redactTime=" + redactTime +
                '}';
    }
}
