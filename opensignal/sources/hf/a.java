package hf;

import java.io.File;
import lf.b0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f10636a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10637b;

    /* renamed from: c, reason: collision with root package name */
    public final File f10638c;

    public a(b0 b0Var, String str, File file) {
        this.f10636a = b0Var;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f10637b = str;
        this.f10638c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f10636a.equals(aVar.f10636a) && this.f10637b.equals(aVar.f10637b) && this.f10638c.equals(aVar.f10638c);
    }

    public final int hashCode() {
        return ((((this.f10636a.hashCode() ^ 1000003) * 1000003) ^ this.f10637b.hashCode()) * 1000003) ^ this.f10638c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f10636a + ", sessionId=" + this.f10637b + ", reportFile=" + this.f10638c + "}";
    }
}
