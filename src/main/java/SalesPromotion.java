import java.util.List;

public class SalesPromotion {
    private String type;
    private String displayName;
    private List<String> halfSalesProItemList;

    public SalesPromotion(String type, String displayName, List<String> halfSalesProItemList) {
        this.type = type;
        this.displayName = displayName;
        this.halfSalesProItemList = halfSalesProItemList;
    }

    public String getType() {
        return type;
    }

    public String getDisplayName() {
        return displayName;
    }

    public List<String> gethalfSalesProItemList() {
        return halfSalesProItemList;
    }
}
