package com.google.gson;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class TypeAdapter<T> {

    /* renamed from: com.google.gson.TypeAdapter$1, reason: invalid class name */
    public class AnonymousClass1 extends TypeAdapter<T> {
        public AnonymousClass1() {
        }

        @Override // com.google.gson.TypeAdapter
        public final T b(E5.a aVar) throws IOException {
            if (aVar.C0() != E5.b.NULL) {
                return (T) TypeAdapter.this.b(aVar);
            }
            aVar.v0();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(E5.c cVar, T t10) throws IOException {
            if (t10 == null) {
                cVar.B();
            } else {
                TypeAdapter.this.c(cVar, t10);
            }
        }
    }

    public final TypeAdapter<T> a() {
        return new AnonymousClass1();
    }

    public abstract T b(E5.a aVar) throws IOException;

    public abstract void c(E5.c cVar, T t10) throws IOException;
}
