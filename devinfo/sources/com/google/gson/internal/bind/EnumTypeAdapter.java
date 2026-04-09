package com.google.gson.internal.bind;

import com.google.gson.j;
import com.google.gson.w;
import com.google.gson.x;
import java.io.IOException;
import java.lang.Enum;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
class EnumTypeAdapter<T extends Enum<T>> extends w {

    /* renamed from: d, reason: collision with root package name */
    public static final x f20757d = new x() { // from class: com.google.gson.internal.bind.EnumTypeAdapter.1
        @Override // com.google.gson.x
        public final w a(j jVar, xf.a aVar) {
            Class superclass = aVar.f37087a;
            if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
                return null;
            }
            if (!superclass.isEnum()) {
                superclass = superclass.getSuperclass();
            }
            return new EnumTypeAdapter(superclass);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f20758a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f20759b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f20760c = new HashMap();

    public EnumTypeAdapter(Class cls) throws SecurityException {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i4 = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i4] = field;
                    i4++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i4);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r42 = (Enum) field2.get(null);
                String strName = r42.name();
                String string = r42.toString();
                uf.b bVar = (uf.b) field2.getAnnotation(uf.b.class);
                if (bVar != null) {
                    strName = bVar.value();
                    for (String str : bVar.alternate()) {
                        this.f20758a.put(str, r42);
                    }
                }
                this.f20758a.put(strName, r42);
                this.f20759b.put(string, r42);
                this.f20760c.put(r42, strName);
            }
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // com.google.gson.w
    public final Object b(yf.b bVar) throws IOException {
        if (bVar.Z() == 9) {
            bVar.V();
            return null;
        }
        String strX = bVar.X();
        Enum r02 = (Enum) this.f20758a.get(strX);
        return r02 == null ? (Enum) this.f20759b.get(strX) : r02;
    }

    @Override // com.google.gson.w
    public final void c(yf.c cVar, Object obj) throws IOException {
        Enum r32 = (Enum) obj;
        cVar.U(r32 == null ? null : (String) this.f20760c.get(r32));
    }
}
