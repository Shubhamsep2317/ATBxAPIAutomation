package Payload_Management.Tool;

public class BookingDates {

    private String checkin;
    private String checkout;
    private String additionalProperties;

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public String getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name) {
        this.additionalProperties=additionalProperties;
    }

}
