package k8;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;
import x7.l;
import z7.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements l {

    /* renamed from: b, reason: collision with root package name */
    public final l f28083b;

    public c(l lVar) {
        t8.f.c(lVar, "Argument must not be null");
        this.f28083b = lVar;
    }

    @Override // x7.l
    public final y a(Context context, y yVar, int i4, int i10) {
        b bVar = (b) yVar.get();
        y cVar = new g8.c(com.bumptech.glide.b.a(context).f6470a, ((f) bVar.f28075a.f27975b).f28099l);
        l lVar = this.f28083b;
        y yVarA = lVar.a(context, cVar, i4, i10);
        if (!cVar.equals(yVarA)) {
            cVar.a();
        }
        ((f) bVar.f28075a.f27975b).c(lVar, (Bitmap) yVarA.get());
        return yVar;
    }

    @Override // x7.e
    public final void b(MessageDigest messageDigest) {
        this.f28083b.b(messageDigest);
    }

    @Override // x7.e
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f28083b.equals(((c) obj).f28083b);
        }
        return false;
    }

    @Override // x7.e
    public final int hashCode() {
        return this.f28083b.hashCode();
    }
}
