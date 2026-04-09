package com.google.gson.internal;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.o;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class Excluder implements o, Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public static final Excluder f23372d = new Excluder();

    /* renamed from: b, reason: collision with root package name */
    public final List<com.google.gson.a> f23373b;

    /* renamed from: c, reason: collision with root package name */
    public final List<com.google.gson.a> f23374c;

    public Excluder() {
        List<com.google.gson.a> list = Collections.EMPTY_LIST;
        this.f23373b = list;
        this.f23374c = list;
    }

    @Override // com.google.gson.o
    public final <T> TypeAdapter<T> a(final Gson gson, final D5.a<T> aVar) {
        Class<? super T> cls = aVar.f1061a;
        boolean zB = b(cls);
        final boolean z10 = zB || d(cls, true);
        final boolean z11 = zB || d(cls, false);
        if (z10 || z11) {
            return new TypeAdapter<T>() { // from class: com.google.gson.internal.Excluder.1

                /* renamed from: a, reason: collision with root package name */
                public TypeAdapter<T> f23375a;

                @Override // com.google.gson.TypeAdapter
                public final T b(E5.a aVar2) throws IOException {
                    if (z11) {
                        aVar2.Q0();
                        return null;
                    }
                    TypeAdapter<T> typeAdapterE = this.f23375a;
                    if (typeAdapterE == null) {
                        typeAdapterE = gson.e(Excluder.this, aVar);
                        this.f23375a = typeAdapterE;
                    }
                    return typeAdapterE.b(aVar2);
                }

                @Override // com.google.gson.TypeAdapter
                public final void c(E5.c cVar, T t10) throws IOException {
                    if (z10) {
                        cVar.B();
                        return;
                    }
                    TypeAdapter<T> typeAdapterE = this.f23375a;
                    if (typeAdapterE == null) {
                        typeAdapterE = gson.e(Excluder.this, aVar);
                        this.f23375a = typeAdapterE;
                    }
                    typeAdapterE.c(cVar, t10);
                }
            };
        }
        return null;
    }

    public final boolean b(Class<?> cls) {
        if (Enum.class.isAssignableFrom(cls)) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    public final Object clone() throws CloneNotSupportedException {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    public final boolean d(Class<?> cls, boolean z10) {
        Iterator<com.google.gson.a> it = (z10 ? this.f23373b : this.f23374c).iterator();
        while (it.hasNext()) {
            if (it.next().a()) {
                return true;
            }
        }
        return false;
    }
}
