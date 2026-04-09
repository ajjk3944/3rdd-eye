package P2;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    private final F2.d f18013a;

    /* renamed from: b, reason: collision with root package name */
    private final e f18014b;

    /* renamed from: c, reason: collision with root package name */
    private final e f18015c;

    public c(F2.d dVar, e eVar, e eVar2) {
        this.f18013a = dVar;
        this.f18014b = eVar;
        this.f18015c = eVar2;
    }

    private static E2.c b(E2.c cVar) {
        return cVar;
    }

    @Override // P2.e
    public E2.c a(E2.c cVar, C2.g gVar) {
        Drawable drawable = (Drawable) cVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f18014b.a(com.bumptech.glide.load.resource.bitmap.g.f(((BitmapDrawable) drawable).getBitmap(), this.f18013a), gVar);
        }
        if (drawable instanceof O2.c) {
            return this.f18015c.a(b(cVar), gVar);
        }
        return null;
    }
}
