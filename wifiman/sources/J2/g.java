package J2;

import I2.h;
import I2.n;
import I2.o;
import I2.r;
import java.io.InputStream;
import java.net.URL;

/* loaded from: classes.dex */
public class g implements n {

    /* renamed from: a, reason: collision with root package name */
    private final n f9750a;

    public static class a implements o {
        @Override // I2.o
        public n d(r rVar) {
            return new g(rVar.d(h.class, InputStream.class));
        }
    }

    public g(n nVar) {
        this.f9750a = nVar;
    }

    @Override // I2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(URL url, int i10, int i11, C2.g gVar) {
        return this.f9750a.a(new h(url), i10, i11, gVar);
    }

    @Override // I2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(URL url) {
        return true;
    }
}
