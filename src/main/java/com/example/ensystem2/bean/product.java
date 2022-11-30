package com.example.ensystem2.bean;

public class product {

    private String id;		//ID序列号
    private String Name;	//名
    private String  Type;		//类别
    private String Author;		//作者
    private long Price ;		//价格
    private long Amount ;		//总数量
    /**
     * 初始化
     */
    public product() {
        id = "";
        Name = "";
        Type = "";
        Author = "";
        Price = 0;
        Amount = 0;
    }
    public void setid(String newid){
        this.id = newid;
    }
    public String getid(){
        return id;
    }
    public void setName(String newName) {
        this.Name = newName;
    }
    public String getName() {
        return Name;
    }
    public void setType(String newType) {
        this.Type = newType;
    }
    public String getType() {
        return Type;
    }
    public void setAuthor(String newAuthor) {
        this.Author = newAuthor;
    }
    public String getAuthor() {
        return Author;
    }
    public void setPrice(long newPrice) {
        this.Price = newPrice;
    }
    public long getPrice() {
        return Price;
    }
    public void setAmount(long newAmount) {
        this.Amount = newAmount;
    }
    public long getAmount() {
        return Amount;
    }

}