package Y2;

import L2.l;
import N2.u;
import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;
import t4.C5606d;

/* compiled from: GifDrawableTransformation.java */
/* loaded from: classes.dex */
public final class e implements l<c> {

    /* renamed from: b, reason: collision with root package name */
    public final l<Bitmap> f13738b;

    public e(l<Bitmap> lVar) {
        C5606d.l(lVar, "Argument must not be null");
        this.f13738b = lVar;
    }

    @Override // L2.l
    public final u<c> a(Context context, u<c> uVar, int i, int i10) {
        c cVar = uVar.get();
        u<Bitmap> eVar = new U2.e(com.bumptech.glide.b.a(context).f22237b, cVar.f13728b.f13737a.f13749l);
        l<Bitmap> lVar = this.f13738b;
        u<Bitmap> uVarA = lVar.a(context, eVar, i, i10);
        if (!eVar.equals(uVarA)) {
            eVar.a();
        }
        cVar.f13728b.f13737a.c(lVar, uVarA.get());
        return uVar;
    }

    @Override // L2.f
    public final void b(MessageDigest messageDigest) {
        this.f13738b.b(messageDigest);
    }

    @Override // L2.f
    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f13738b.equals(((e) obj).f13738b);
        }
        return false;
    }

    @Override // L2.f
    public final int hashCode() {
        return this.f13738b.hashCode();
    }
}
