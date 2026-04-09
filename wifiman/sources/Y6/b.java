package Y6;

import Y6.h;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes3.dex */
final class b extends h {

    /* renamed from: c, reason: collision with root package name */
    public static final h.d f24632c = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Class f24633a;

    /* renamed from: b, reason: collision with root package name */
    private final h f24634b;

    class a implements h.d {
        a() {
        }

        @Override // Y6.h.d
        public h a(Type type, Set set, r rVar) {
            Type typeA = v.a(type);
            if (typeA != null && set.isEmpty()) {
                return new b(v.g(typeA), rVar.d(typeA)).g();
            }
            return null;
        }
    }

    b(Class cls, h hVar) {
        this.f24633a = cls;
        this.f24634b = hVar;
    }

    @Override // Y6.h
    public Object b(k kVar) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        ArrayList arrayList = new ArrayList();
        kVar.a();
        while (kVar.s()) {
            arrayList.add(this.f24634b.b(kVar));
        }
        kVar.h();
        Object objNewInstance = Array.newInstance((Class<?>) this.f24633a, arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // Y6.h
    public void j(o oVar, Object obj) {
        oVar.a();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f24634b.j(oVar, Array.get(obj, i10));
        }
        oVar.p();
    }

    public String toString() {
        return this.f24634b + ".array()";
    }
}
