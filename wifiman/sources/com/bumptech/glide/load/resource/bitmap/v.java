package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes.dex */
public class v implements C2.i {

    /* renamed from: a, reason: collision with root package name */
    private final M2.l f34588a;

    /* renamed from: b, reason: collision with root package name */
    private final F2.d f34589b;

    public v(M2.l lVar, F2.d dVar) {
        this.f34588a = lVar;
        this.f34589b = dVar;
    }

    @Override // C2.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public E2.c b(Uri uri, int i10, int i11, C2.g gVar) {
        E2.c cVarB = this.f34588a.b(uri, i10, i11, gVar);
        if (cVarB == null) {
            return null;
        }
        return m.a(this.f34589b, (Drawable) cVarB.get(), i10, i11);
    }

    @Override // C2.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri, C2.g gVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
