package U2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* compiled from: DrawableTransformation.java */
/* loaded from: classes.dex */
public final class o implements L2.l<Drawable> {

    /* renamed from: b, reason: collision with root package name */
    public final L2.l<Bitmap> f12426b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12427c;

    public o(L2.l<Bitmap> lVar, boolean z10) {
        this.f12426b = lVar;
        this.f12427c = z10;
    }

    @Override // L2.l
    public final N2.u<Drawable> a(Context context, N2.u<Drawable> uVar, int i, int i10) {
        O2.b bVar = com.bumptech.glide.b.a(context).f22237b;
        Drawable drawable = uVar.get();
        e eVarA = n.a(bVar, drawable, i, i10);
        if (eVarA != null) {
            N2.u<Bitmap> uVarA = this.f12426b.a(context, eVarA, i, i10);
            if (!uVarA.equals(eVarA)) {
                return new u(context.getResources(), uVarA);
            }
            uVarA.a();
            return uVar;
        }
        if (!this.f12427c) {
            return uVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // L2.f
    public final void b(MessageDigest messageDigest) {
        this.f12426b.b(messageDigest);
    }

    @Override // L2.f
    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f12426b.equals(((o) obj).f12426b);
        }
        return false;
    }

    @Override // L2.f
    public final int hashCode() {
        return this.f12426b.hashCode();
    }
}
