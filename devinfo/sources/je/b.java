package je;

import java.io.File;
import me.b0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f27535a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27536b;

    /* renamed from: c, reason: collision with root package name */
    public final File f27537c;

    public b(b0 b0Var, String str, File file) {
        this.f27535a = b0Var;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f27536b = str;
        this.f27537c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f27535a.equals(bVar.f27535a) && this.f27536b.equals(bVar.f27536b) && this.f27537c.equals(bVar.f27537c);
    }

    public final int hashCode() {
        return ((((this.f27535a.hashCode() ^ 1000003) * 1000003) ^ this.f27536b.hashCode()) * 1000003) ^ this.f27537c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f27535a + ", sessionId=" + this.f27536b + ", reportFile=" + this.f27537c + "}";
    }
}
