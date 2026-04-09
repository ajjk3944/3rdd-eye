package Q4;

import N7.C1094a9;
import Q4.f0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
/* loaded from: classes2.dex */
public final class P extends f0.e.d.a.b.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f11086a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11087b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11088c;

    public P(String str, String str2, long j4) {
        this.f11086a = str;
        this.f11087b = str2;
        this.f11088c = j4;
    }

    @Override // Q4.f0.e.d.a.b.c
    public final long a() {
        return this.f11088c;
    }

    @Override // Q4.f0.e.d.a.b.c
    public final String b() {
        return this.f11087b;
    }

    @Override // Q4.f0.e.d.a.b.c
    public final String c() {
        return this.f11086a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.b.c)) {
            return false;
        }
        f0.e.d.a.b.c cVar = (f0.e.d.a.b.c) obj;
        return this.f11086a.equals(cVar.c()) && this.f11087b.equals(cVar.b()) && this.f11088c == cVar.a();
    }

    public final int hashCode() {
        int iHashCode = (((this.f11086a.hashCode() ^ 1000003) * 1000003) ^ this.f11087b.hashCode()) * 1000003;
        long j4 = this.f11088c;
        return iHashCode ^ ((int) (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Signal{name=");
        sb.append(this.f11086a);
        sb.append(", code=");
        sb.append(this.f11087b);
        sb.append(", address=");
        return C1094a9.f(sb, this.f11088c, "}");
    }
}
