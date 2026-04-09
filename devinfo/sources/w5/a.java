package w5;

import java.io.IOException;
import java.util.Locale;
import nk.k;
import vk.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements d6.a {

    /* renamed from: a, reason: collision with root package name */
    public final e6.a f36470a;

    public a(e6.a aVar) {
        k.e(aVar, "db");
        this.f36470a = aVar;
    }

    @Override // d6.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final g S(String str) {
        k.e(str, "sql");
        e6.a aVar = this.f36470a;
        k.e(aVar, "db");
        String string = i.V0(str).toString();
        if (string.length() >= 3) {
            String strSubstring = string.substring(0, 3);
            k.d(strSubstring, "substring(...)");
            String upperCase = strSubstring.toUpperCase(Locale.ROOT);
            k.d(upperCase, "toUpperCase(...)");
            int iHashCode = upperCase.hashCode();
            if (iHashCode == 79487 ? upperCase.equals("PRA") : !(iHashCode == 81978 ? !upperCase.equals("SEL") : !(iHashCode == 85954 && upperCase.equals("WIT")))) {
                e eVar = new e(aVar, str);
                eVar.f36478d = new int[0];
                eVar.f36479e = new long[0];
                eVar.f36480f = new double[0];
                eVar.g = new String[0];
                eVar.f36481h = new byte[0][];
                return eVar;
            }
        }
        return new f(aVar, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f36470a.close();
    }
}
