package com.bumptech.glide.load.data;

import U2.w;
import com.bumptech.glide.load.data.e;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: InputStreamRewinder.java */
/* loaded from: classes.dex */
public final class k implements e<InputStream> {

    /* renamed from: a, reason: collision with root package name */
    public final w f22314a;

    /* compiled from: InputStreamRewinder.java */
    public static final class a implements e.a<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final O2.g f22315a;

        public a(O2.g gVar) {
            this.f22315a = gVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public final Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public final e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.f22315a);
        }
    }

    public k(InputStream inputStream, O2.g gVar) {
        w wVar = new w(inputStream, gVar);
        this.f22314a = wVar;
        wVar.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    public final InputStream a() throws IOException {
        w wVar = this.f22314a;
        wVar.reset();
        return wVar;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        this.f22314a.release();
    }
}
