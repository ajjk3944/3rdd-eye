package S2;

import L2.h;
import R2.i;
import R2.q;
import R2.r;
import R2.u;
import java.io.InputStream;
import java.net.URL;

/* compiled from: UrlLoader.java */
/* loaded from: classes.dex */
public final class e implements q<URL, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    public final q<i, InputStream> f11888a;

    /* compiled from: UrlLoader.java */
    public static class a implements r<URL, InputStream> {
        @Override // R2.r
        public final q<URL, InputStream> c(u uVar) {
            return new e(uVar.b(i.class, InputStream.class));
        }
    }

    public e(q<i, InputStream> qVar) {
        this.f11888a = qVar;
    }

    @Override // R2.q
    public final /* bridge */ /* synthetic */ boolean a(URL url) {
        return true;
    }

    @Override // R2.q
    public final q.a<InputStream> b(URL url, int i, int i10, h hVar) {
        return this.f11888a.b(new i(url), i, i10, hVar);
    }
}
