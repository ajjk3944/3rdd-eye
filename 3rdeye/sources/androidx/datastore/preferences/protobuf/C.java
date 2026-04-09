package androidx.datastore.preferences.protobuf;

/* compiled from: LazyFieldLite.java */
/* loaded from: classes.dex */
public class C {

    /* renamed from: a, reason: collision with root package name */
    public volatile P f15539a;

    /* renamed from: b, reason: collision with root package name */
    public volatile AbstractC1730h f15540b;

    static {
        C1737o.a();
    }

    public final P a(P p10) {
        if (this.f15539a == null) {
            synchronized (this) {
                if (this.f15539a == null) {
                    try {
                        this.f15539a = p10;
                        this.f15540b = AbstractC1730h.f15603c;
                    } catch (C1747z unused) {
                        this.f15539a = p10;
                        this.f15540b = AbstractC1730h.f15603c;
                    }
                }
            }
        }
        return this.f15539a;
    }

    public final AbstractC1730h b() {
        if (this.f15540b != null) {
            return this.f15540b;
        }
        synchronized (this) {
            try {
                if (this.f15540b != null) {
                    return this.f15540b;
                }
                if (this.f15539a == null) {
                    this.f15540b = AbstractC1730h.f15603c;
                } else {
                    this.f15540b = this.f15539a.toByteString();
                }
                return this.f15540b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        P p10 = this.f15539a;
        P p11 = c10.f15539a;
        return (p10 == null && p11 == null) ? b().equals(c10.b()) : (p10 == null || p11 == null) ? p10 != null ? p10.equals(c10.a(p10.a())) : a(p11.a()).equals(p11) : p10.equals(p11);
    }

    public int hashCode() {
        return 1;
    }
}
