package q8;

import android.widget.ImageView;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final l8.c f20732a = new l8.c();

    public static final boolean a(l8.j jVar) {
        m8.d dVar = jVar.f14926e;
        n8.a aVar = jVar.f14924c;
        m8.i iVar = jVar.f14941v;
        int i10 = e.f20731a[dVar.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                throw new bf.n();
            }
            if (!(iVar instanceof m8.c) && (!(aVar instanceof n8.a) || !(iVar instanceof m8.f) || !(aVar.getView() instanceof ImageView) || aVar.getView() != ((m8.f) iVar).f16323a)) {
                return false;
            }
        }
        return true;
    }
}
