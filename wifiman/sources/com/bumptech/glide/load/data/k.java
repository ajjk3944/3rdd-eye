package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.resource.bitmap.u;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class k implements e {

    /* renamed from: a, reason: collision with root package name */
    private final u f34284a;

    public static final class a implements e.a {

        /* renamed from: a, reason: collision with root package name */
        private final F2.b f34285a;

        public a(F2.b bVar) {
            this.f34285a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e b(InputStream inputStream) {
            return new k(inputStream, this.f34285a);
        }
    }

    public k(InputStream inputStream, F2.b bVar) {
        u uVar = new u(inputStream, bVar);
        this.f34284a = uVar;
        uVar.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
        this.f34284a.h();
    }

    public void c() {
        this.f34284a.g();
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream a() {
        this.f34284a.reset();
        return this.f34284a;
    }
}
