package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class dj0 {

    /* renamed from: a, reason: collision with root package name */
    private final ej0 f26196a;

    /* renamed from: b, reason: collision with root package name */
    private final cj0 f26197b;

    public dj0(ej0 imageProvider, cj0 imagePreviewCreator) {
        kotlin.jvm.internal.l.f(imageProvider, "imageProvider");
        kotlin.jvm.internal.l.f(imagePreviewCreator, "imagePreviewCreator");
        this.f26196a = imageProvider;
        this.f26197b = imagePreviewCreator;
    }

    public final void a(Set<jj0> imageValues) {
        Bitmap bitmapA;
        kotlin.jvm.internal.l.f(imageValues, "imageValues");
        ArrayList arrayList = new ArrayList();
        for (Object obj : imageValues) {
            if (((jj0) obj).c() != null && (!y9.q.i0(r2))) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jj0 jj0Var = (jj0) it.next();
            if (this.f26196a.a(jj0Var) == null && this.f26196a.b(jj0Var) == null && (bitmapA = this.f26197b.a(jj0Var)) != null) {
                this.f26196a.a(bitmapA, jj0Var);
            }
        }
    }
}
