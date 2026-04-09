package Q4;

import Q4.g0;
import android.os.Build;

/* compiled from: AutoValue_StaticSessionData_OsData.java */
/* loaded from: classes2.dex */
public final class e0 extends g0.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f11196a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11197b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11198c;

    public e0(boolean z10) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f11196a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f11197b = str2;
        this.f11198c = z10;
    }

    @Override // Q4.g0.c
    public final boolean a() {
        return this.f11198c;
    }

    @Override // Q4.g0.c
    public final String b() {
        return this.f11197b;
    }

    @Override // Q4.g0.c
    public final String c() {
        return this.f11196a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.c)) {
            return false;
        }
        g0.c cVar = (g0.c) obj;
        return this.f11196a.equals(cVar.c()) && this.f11197b.equals(cVar.b()) && this.f11198c == cVar.a();
    }

    public final int hashCode() {
        return ((((this.f11196a.hashCode() ^ 1000003) * 1000003) ^ this.f11197b.hashCode()) * 1000003) ^ (this.f11198c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OsData{osRelease=");
        sb.append(this.f11196a);
        sb.append(", osCodeName=");
        sb.append(this.f11197b);
        sb.append(", isRooted=");
        return androidx.work.s.h(sb, this.f11198c, "}");
    }
}
