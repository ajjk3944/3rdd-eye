package kj;

/* loaded from: classes3.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static n f51630a;

    public static final String b(int i10) {
        if (f51630a == null) {
            if (i.c("java.util.ResourceBundle")) {
                try {
                    f51630a = (n) r.class.newInstance();
                } catch (Exception unused) {
                    return "";
                }
            } else if (i.c("org.eclipse.paho.client.mqttv3.internal.MIDPCatalog")) {
                try {
                    f51630a = (n) Class.forName("org.eclipse.paho.client.mqttv3.internal.MIDPCatalog").newInstance();
                } catch (Exception unused2) {
                    return "";
                }
            }
        }
        return f51630a.a(i10);
    }

    protected abstract String a(int i10);
}
