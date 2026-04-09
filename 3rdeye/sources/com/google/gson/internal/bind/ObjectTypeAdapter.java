package com.google.gson.internal.bind;

import E5.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.f;
import com.google.gson.o;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ObjectTypeAdapter extends TypeAdapter<Object> {

    /* renamed from: b, reason: collision with root package name */
    public static final o f23406b = new o() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
        @Override // com.google.gson.o
        public final <T> TypeAdapter<T> a(Gson gson, D5.a<T> aVar) {
            if (aVar.f1061a == Object.class) {
                return new ObjectTypeAdapter(gson);
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final Gson f23407a;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23408a;

        static {
            int[] iArr = new int[E5.b.values().length];
            f23408a = iArr;
            try {
                iArr[E5.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23408a[E5.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23408a[E5.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23408a[E5.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23408a[E5.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23408a[E5.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ObjectTypeAdapter(Gson gson) {
        this.f23407a = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final Object b(E5.a aVar) throws IOException {
        switch (a.f23408a[aVar.C0().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.B()) {
                    arrayList.add(b(aVar));
                }
                aVar.k();
                return arrayList;
            case 2:
                f fVar = new f();
                aVar.c();
                while (aVar.B()) {
                    fVar.put(aVar.q0(), b(aVar));
                }
                aVar.l();
                return fVar;
            case 3:
                return aVar.y0();
            case 4:
                return Double.valueOf(aVar.k0());
            case 5:
                return Boolean.valueOf(aVar.W());
            case 6:
                aVar.v0();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.B();
            return;
        }
        Class<?> cls = obj.getClass();
        Gson gson = this.f23407a;
        gson.getClass();
        TypeAdapter typeAdapterD = gson.d(new D5.a(cls));
        if (!(typeAdapterD instanceof ObjectTypeAdapter)) {
            typeAdapterD.c(cVar, obj);
        } else {
            cVar.d();
            cVar.l();
        }
    }
}
