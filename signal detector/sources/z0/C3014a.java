package z0;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3014a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24438a;

    public C3014a(boolean z6) {
        this.f24438a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3014a)) {
            return false;
        }
        C3014a c3014a = (C3014a) obj;
        c3014a.getClass();
        return this.f24438a == c3014a.f24438a;
    }

    public final int hashCode() {
        return 1169068184 + (this.f24438a ? 1231 : 1237);
    }

    public final String toString() {
        return "GetTopicsRequest: adsSdkName=com.google.android.gms.ads, shouldRecordObservation=" + this.f24438a;
    }
}
