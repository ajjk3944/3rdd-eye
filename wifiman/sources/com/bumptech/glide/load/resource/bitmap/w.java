package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.l;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class w implements C2.i {

    /* renamed from: a, reason: collision with root package name */
    private final l f34590a;

    /* renamed from: b, reason: collision with root package name */
    private final F2.b f34591b;

    static class a implements l.b {

        /* renamed from: a, reason: collision with root package name */
        private final u f34592a;

        /* renamed from: b, reason: collision with root package name */
        private final W2.d f34593b;

        a(u uVar, W2.d dVar) {
            this.f34592a = uVar;
            this.f34593b = dVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l.b
        public void a(F2.d dVar, Bitmap bitmap) throws IOException {
            IOException iOExceptionA = this.f34593b.a();
            if (iOExceptionA != null) {
                if (bitmap == null) {
                    throw iOExceptionA;
                }
                dVar.c(bitmap);
                throw iOExceptionA;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l.b
        public void b() {
            this.f34592a.g();
        }
    }

    public w(l lVar, F2.b bVar) {
        this.f34590a = lVar;
        this.f34591b = bVar;
    }

    @Override // C2.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public E2.c b(InputStream inputStream, int i10, int i11, C2.g gVar) {
        boolean z10;
        u uVar;
        if (inputStream instanceof u) {
            uVar = (u) inputStream;
            z10 = false;
        } else {
            z10 = true;
            uVar = new u(inputStream, this.f34591b);
        }
        W2.d dVarG = W2.d.g(uVar);
        try {
            return this.f34590a.f(new W2.i(dVarG), i10, i11, gVar, new a(uVar, dVarG));
        } finally {
            dVarG.h();
            if (z10) {
                uVar.h();
            }
        }
    }

    @Override // C2.i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, C2.g gVar) {
        return this.f34590a.p(inputStream);
    }
}
