package y3;

import android.util.Base64;
import y3.j;

/* compiled from: TransportContext.java */
/* loaded from: classes.dex */
public abstract class r {

    /* compiled from: TransportContext.java */
    public static abstract class a {
    }

    public static j.a a() {
        j.a aVar = new j.a();
        v3.e eVar = v3.e.DEFAULT;
        if (eVar == null) {
            throw new NullPointerException("Null priority");
        }
        aVar.f48080c = eVar;
        return aVar;
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract v3.e d();

    public final j e(v3.e eVar) {
        j.a aVarA = a();
        aVarA.b(b());
        if (eVar == null) {
            throw new NullPointerException("Null priority");
        }
        aVarA.f48080c = eVar;
        aVarA.f48079b = c();
        return aVarA.a();
    }

    public final String toString() {
        String strB = b();
        v3.e eVarD = d();
        String strEncodeToString = c() == null ? "" : Base64.encodeToString(c(), 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(strB);
        sb.append(", ");
        sb.append(eVarD);
        sb.append(", ");
        return B4.f.c(sb, strEncodeToString, ")");
    }
}
