package Q4;

import N7.G8;
import Q4.f0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.java */
/* loaded from: classes2.dex */
public final class T extends f0.e.d.a.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f11103a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11104b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11105c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11106d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.java */
    public static final class a extends f0.e.d.a.c.AbstractC0143a {

        /* renamed from: a, reason: collision with root package name */
        public String f11107a;

        /* renamed from: b, reason: collision with root package name */
        public int f11108b;

        /* renamed from: c, reason: collision with root package name */
        public int f11109c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f11110d;

        /* renamed from: e, reason: collision with root package name */
        public byte f11111e;

        public final T a() {
            String str;
            if (this.f11111e == 7 && (str = this.f11107a) != null) {
                return new T(this.f11108b, this.f11109c, str, this.f11110d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f11107a == null) {
                sb.append(" processName");
            }
            if ((this.f11111e & 1) == 0) {
                sb.append(" pid");
            }
            if ((this.f11111e & 2) == 0) {
                sb.append(" importance");
            }
            if ((this.f11111e & 4) == 0) {
                sb.append(" defaultProcess");
            }
            throw new IllegalStateException(G8.t(sb, "Missing required properties:"));
        }
    }

    public T(int i, int i10, String str, boolean z10) {
        this.f11103a = str;
        this.f11104b = i;
        this.f11105c = i10;
        this.f11106d = z10;
    }

    @Override // Q4.f0.e.d.a.c
    public final int a() {
        return this.f11105c;
    }

    @Override // Q4.f0.e.d.a.c
    public final int b() {
        return this.f11104b;
    }

    @Override // Q4.f0.e.d.a.c
    public final String c() {
        return this.f11103a;
    }

    @Override // Q4.f0.e.d.a.c
    public final boolean d() {
        return this.f11106d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.c)) {
            return false;
        }
        f0.e.d.a.c cVar = (f0.e.d.a.c) obj;
        return this.f11103a.equals(cVar.c()) && this.f11104b == cVar.b() && this.f11105c == cVar.a() && this.f11106d == cVar.d();
    }

    public final int hashCode() {
        return ((((((this.f11103a.hashCode() ^ 1000003) * 1000003) ^ this.f11104b) * 1000003) ^ this.f11105c) * 1000003) ^ (this.f11106d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails{processName=");
        sb.append(this.f11103a);
        sb.append(", pid=");
        sb.append(this.f11104b);
        sb.append(", importance=");
        sb.append(this.f11105c);
        sb.append(", defaultProcess=");
        return androidx.work.s.h(sb, this.f11106d, "}");
    }
}
