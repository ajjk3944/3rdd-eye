package J2;

import I2.h;
import I2.m;
import I2.n;
import I2.o;
import I2.r;
import com.bumptech.glide.load.data.j;

/* loaded from: classes.dex */
public class a implements n {

    /* renamed from: b, reason: collision with root package name */
    public static final C2.f f9726b = C2.f.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a, reason: collision with root package name */
    private final m f9727a;

    /* renamed from: J2.a$a, reason: collision with other inner class name */
    public static class C0387a implements o {

        /* renamed from: a, reason: collision with root package name */
        private final m f9728a = new m(500);

        @Override // I2.o
        public n d(r rVar) {
            return new a(this.f9728a);
        }
    }

    public a(m mVar) {
        this.f9727a = mVar;
    }

    @Override // I2.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(h hVar, int i10, int i11, C2.g gVar) {
        m mVar = this.f9727a;
        if (mVar != null) {
            h hVar2 = (h) mVar.a(hVar, 0, 0);
            if (hVar2 == null) {
                this.f9727a.b(hVar, 0, 0, hVar);
            } else {
                hVar = hVar2;
            }
        }
        return new n.a(hVar, new j(hVar, ((Integer) gVar.c(f9726b)).intValue()));
    }

    @Override // I2.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(h hVar) {
        return true;
    }
}
