package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.util.HashMap;

/* compiled from: DataRewinderRegistry.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final a f22302b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f22303a = new HashMap();

    /* compiled from: DataRewinderRegistry.java */
    public class a implements e.a<Object> {
        @Override // com.bumptech.glide.load.data.e.a
        public final Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.e.a
        public final e<Object> b(Object obj) {
            return new b(obj);
        }
    }

    /* compiled from: DataRewinderRegistry.java */
    public static final class b implements e<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f22304a;

        public b(Object obj) {
            this.f22304a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        public final Object a() {
            return this.f22304a;
        }

        @Override // com.bumptech.glide.load.data.e
        public final void b() {
        }
    }
}
