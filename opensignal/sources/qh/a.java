package qh;

/* loaded from: classes.dex */
public enum a {
    SD("sd_src:\""),
    HD("hd_src:\"");

    private String quality;

    a(String str) {
        this.quality = str;
    }

    public String getQuality() {
        return this.quality;
    }
}
