package g8;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r implements x7.l {

    /* renamed from: b, reason: collision with root package name */
    public final x7.l f24596b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24597c;

    public r(x7.l lVar, boolean z3) {
        this.f24596b = lVar;
        this.f24597c = z3;
    }

    @Override // x7.l
    public final z7.y a(Context context, z7.y yVar, int i4, int i10) {
        a8.b bVar = com.bumptech.glide.b.a(context).f6470a;
        Drawable drawable = (Drawable) yVar.get();
        c cVarA = q.a(bVar, drawable, i4, i10);
        if (cVarA != null) {
            z7.y yVarA = this.f24596b.a(context, cVarA, i4, i10);
            if (!yVarA.equals(cVarA)) {
                return new c(context.getResources(), yVarA);
            }
            yVarA.a();
            return yVar;
        }
        if (!this.f24597c) {
            return yVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // x7.e
    public final void b(MessageDigest messageDigest) {
        this.f24596b.b(messageDigest);
    }

    @Override // x7.e
    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f24596b.equals(((r) obj).f24596b);
        }
        return false;
    }

    @Override // x7.e
    public final int hashCode() {
        return this.f24596b.hashCode();
    }
}
