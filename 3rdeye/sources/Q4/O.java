package Q4;

import Q4.f0;
import java.util.List;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.java */
/* loaded from: classes2.dex */
public final class O extends f0.e.d.a.b.AbstractC0139b {

    /* renamed from: a, reason: collision with root package name */
    public final String f11081a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11082b;

    /* renamed from: c, reason: collision with root package name */
    public final List<f0.e.d.a.b.AbstractC0140d.AbstractC0141a> f11083c;

    /* renamed from: d, reason: collision with root package name */
    public final f0.e.d.a.b.AbstractC0139b f11084d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11085e;

    public O() {
        throw null;
    }

    public O(String str, String str2, List list, f0.e.d.a.b.AbstractC0139b abstractC0139b, int i) {
        this.f11081a = str;
        this.f11082b = str2;
        this.f11083c = list;
        this.f11084d = abstractC0139b;
        this.f11085e = i;
    }

    @Override // Q4.f0.e.d.a.b.AbstractC0139b
    public final f0.e.d.a.b.AbstractC0139b a() {
        return this.f11084d;
    }

    @Override // Q4.f0.e.d.a.b.AbstractC0139b
    public final List<f0.e.d.a.b.AbstractC0140d.AbstractC0141a> b() {
        return this.f11083c;
    }

    @Override // Q4.f0.e.d.a.b.AbstractC0139b
    public final int c() {
        return this.f11085e;
    }

    @Override // Q4.f0.e.d.a.b.AbstractC0139b
    public final String d() {
        return this.f11082b;
    }

    @Override // Q4.f0.e.d.a.b.AbstractC0139b
    public final String e() {
        return this.f11081a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.b.AbstractC0139b)) {
            return false;
        }
        f0.e.d.a.b.AbstractC0139b abstractC0139b = (f0.e.d.a.b.AbstractC0139b) obj;
        if (!this.f11081a.equals(abstractC0139b.e())) {
            return false;
        }
        String str = this.f11082b;
        if (str == null) {
            if (abstractC0139b.d() != null) {
                return false;
            }
        } else if (!str.equals(abstractC0139b.d())) {
            return false;
        }
        if (!this.f11083c.equals(abstractC0139b.b())) {
            return false;
        }
        f0.e.d.a.b.AbstractC0139b abstractC0139b2 = this.f11084d;
        if (abstractC0139b2 == null) {
            if (abstractC0139b.a() != null) {
                return false;
            }
        } else if (!abstractC0139b2.equals(abstractC0139b.a())) {
            return false;
        }
        return this.f11085e == abstractC0139b.c();
    }

    public final int hashCode() {
        int iHashCode = (this.f11081a.hashCode() ^ 1000003) * 1000003;
        String str = this.f11082b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f11083c.hashCode()) * 1000003;
        f0.e.d.a.b.AbstractC0139b abstractC0139b = this.f11084d;
        return ((iHashCode2 ^ (abstractC0139b != null ? abstractC0139b.hashCode() : 0)) * 1000003) ^ this.f11085e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.f11081a);
        sb.append(", reason=");
        sb.append(this.f11082b);
        sb.append(", frames=");
        sb.append(this.f11083c);
        sb.append(", causedBy=");
        sb.append(this.f11084d);
        sb.append(", overflowCount=");
        return B4.i.j(sb, this.f11085e, "}");
    }
}
