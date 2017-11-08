package turtleManager.Domain;

/**
 * Created by Killer on 2017/3/27.
 */
public class TieziDeal  {
    private int tiezi_dealId;
    private int price;//价格
    private int warrantyPeriod;//质保时间
    private String flawDescription;//瑕疵描述

    public TieziDeal() {
    }

    public int getTiezi_dealId() {
        return tiezi_dealId;
    }

    public void setTiezi_dealId(int tiezi_dealId) {
        this.tiezi_dealId = tiezi_dealId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getFlawDescription() {
        return flawDescription;
    }

    public void setFlawDescription(String flawDescription) {
        this.flawDescription = flawDescription;
    }
}
