package O4;

import Q4.f0;
import java.io.File;

/* compiled from: AutoValue_CrashlyticsReportWithSessionId.java */
/* renamed from: O4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1456b extends H {

    /* renamed from: a, reason: collision with root package name */
    public final Q4.A f10298a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10299b;

    /* renamed from: c, reason: collision with root package name */
    public final File f10300c;

    public C1456b(Q4.A a10, String str, File file) {
        this.f10298a = a10;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f10299b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f10300c = file;
    }

    @Override // O4.H
    public final f0 a() {
        return this.f10298a;
    }

    @Override // O4.H
    public final File b() {
        return this.f10300c;
    }

    @Override // O4.H
    public final String c() {
        return this.f10299b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h10 = (H) obj;
        return this.f10298a.equals(h10.a()) && this.f10299b.equals(h10.c()) && this.f10300c.equals(h10.b());
    }

    public final int hashCode() {
        return ((((this.f10298a.hashCode() ^ 1000003) * 1000003) ^ this.f10299b.hashCode()) * 1000003) ^ this.f10300c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f10298a + ", sessionId=" + this.f10299b + ", reportFile=" + this.f10300c + "}";
    }
}
