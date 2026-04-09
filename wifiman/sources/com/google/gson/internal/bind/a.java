package com.google.gson.internal.bind;

import com.google.gson.p;
import com.google.gson.q;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import t5.AbstractC8031b;
import w5.C8268a;
import w5.C8270c;
import w5.EnumC8269b;

/* loaded from: classes3.dex */
public final class a extends p {

    /* renamed from: c, reason: collision with root package name */
    public static final q f38983c = new C1224a();

    /* renamed from: a, reason: collision with root package name */
    private final Class f38984a;

    /* renamed from: b, reason: collision with root package name */
    private final p f38985b;

    /* renamed from: com.google.gson.internal.bind.a$a, reason: collision with other inner class name */
    class C1224a implements q {
        C1224a() {
        }

        @Override // com.google.gson.q
        public p b(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
            Type typeD = aVar.d();
            if (!(typeD instanceof GenericArrayType) && (!(typeD instanceof Class) || !((Class) typeD).isArray())) {
                return null;
            }
            Type typeG = AbstractC8031b.g(typeD);
            return new a(eVar, eVar.l(com.google.gson.reflect.a.b(typeG)), AbstractC8031b.k(typeG));
        }
    }

    public a(com.google.gson.e eVar, p pVar, Class cls) {
        this.f38985b = new k(eVar, pVar, cls);
        this.f38984a = cls;
    }

    @Override // com.google.gson.p
    public Object b(C8268a c8268a) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (c8268a.v0() == EnumC8269b.NULL) {
            c8268a.r0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c8268a.g();
        while (c8268a.T()) {
            arrayList.add(this.f38985b.b(c8268a));
        }
        c8268a.v();
        int size = arrayList.size();
        if (!this.f38984a.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.f38984a, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) this.f38984a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // com.google.gson.p
    public void d(C8270c c8270c, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj == null) {
            c8270c.b0();
            return;
        }
        c8270c.h();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f38985b.d(c8270c, Array.get(obj, i10));
        }
        c8270c.s();
    }
}
