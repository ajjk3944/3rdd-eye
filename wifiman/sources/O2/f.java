package O2;

import C2.k;
import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class f implements k {

    /* renamed from: b, reason: collision with root package name */
    private final k f16917b;

    public f(k kVar) {
        this.f16917b = (k) W2.k.d(kVar);
    }

    @Override // C2.e
    public void a(MessageDigest messageDigest) {
        this.f16917b.a(messageDigest);
    }

    @Override // C2.k
    public E2.c b(Context context, E2.c cVar, int i10, int i11) {
        c cVar2 = (c) cVar.get();
        E2.c gVar = new com.bumptech.glide.load.resource.bitmap.g(cVar2.e(), com.bumptech.glide.b.c(context).f());
        E2.c cVarB = this.f16917b.b(context, gVar, i10, i11);
        if (!gVar.equals(cVarB)) {
            gVar.c();
        }
        cVar2.m(this.f16917b, (Bitmap) cVarB.get());
        return cVar;
    }

    @Override // C2.e
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f16917b.equals(((f) obj).f16917b);
        }
        return false;
    }

    @Override // C2.e
    public int hashCode() {
        return this.f16917b.hashCode();
    }
}
