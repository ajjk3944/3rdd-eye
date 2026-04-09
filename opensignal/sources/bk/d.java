package bk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ sq.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d CELLULAR_CONNECTED_STATE_UPDATED = new d("CELLULAR_CONNECTED_STATE_UPDATED", 0);
    public static final d WIFI_CONNECTED_STATE_UPDATED = new d("WIFI_CONNECTED_STATE_UPDATED", 1);
    public static final d WIFI_ON_OFF = new d("WIFI_ON_OFF", 2);
    public static final d CONNECTIVITY_STATE_UPDATED = new d("CONNECTIVITY_STATE_UPDATED", 3);
    public static final d CONNECTIVITY_CHANGE_UPDATED = new d("CONNECTIVITY_CHANGE_UPDATED", 4);
    public static final d NETWORK_BLOCKED_UPDATED = new d("NETWORK_BLOCKED_UPDATED", 5);

    private static final /* synthetic */ d[] $values() {
        return new d[]{CELLULAR_CONNECTED_STATE_UPDATED, WIFI_CONNECTED_STATE_UPDATED, WIFI_ON_OFF, CONNECTIVITY_STATE_UPDATED, CONNECTIVITY_CHANGE_UPDATED, NETWORK_BLOCKED_UPDATED};
    }

    static {
        d[] dVarArr$values = $values();
        $VALUES = dVarArr$values;
        $ENTRIES = a.a.j(dVarArr$values);
    }

    private d(String str, int i10) {
    }

    public static sq.a getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
