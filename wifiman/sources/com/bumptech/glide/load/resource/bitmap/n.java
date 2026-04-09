package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class n implements C2.k {

    /* renamed from: b, reason: collision with root package name */
    private final C2.k f34559b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f34560c;

    public n(C2.k kVar, boolean z10) {
        this.f34559b = kVar;
        this.f34560c = z10;
    }

    private E2.c d(Context context, E2.c cVar) {
        return s.f(context.getResources(), cVar);
    }

    @Override // C2.e
    public void a(MessageDigest messageDigest) {
        this.f34559b.a(messageDigest);
    }

    @Override // C2.k
    public E2.c b(Context context, E2.c cVar, int i10, int i11) {
        F2.d dVarF = com.bumptech.glide.b.c(context).f();
        Drawable drawable = (Drawable) cVar.get();
        E2.c cVarA = m.a(dVarF, drawable, i10, i11);
        if (cVarA != null) {
            E2.c cVarB = this.f34559b.b(context, cVarA, i10, i11);
            if (!cVarB.equals(cVarA)) {
                return d(context, cVarB);
            }
            cVarB.c();
            return cVar;
        }
        if (!this.f34560c) {
            return cVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    public C2.k c() {
        return this;
    }

    @Override // C2.e
    public boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f34559b.equals(((n) obj).f34559b);
        }
        return false;
    }

    @Override // C2.e
    public int hashCode() {
        return this.f34559b.hashCode();
    }
}
