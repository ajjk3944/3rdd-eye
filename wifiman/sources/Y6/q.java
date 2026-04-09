package Y6;

import Y6.h;
import com.squareup.moshi.JsonDataException;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class q extends h {

    /* renamed from: c, reason: collision with root package name */
    public static final h.d f24725c = new a();

    /* renamed from: a, reason: collision with root package name */
    private final h f24726a;

    /* renamed from: b, reason: collision with root package name */
    private final h f24727b;

    class a implements h.d {
        a() {
        }

        @Override // Y6.h.d
        public h a(Type type, Set set, r rVar) {
            Class clsG;
            if (!set.isEmpty() || (clsG = v.g(type)) != Map.class) {
                return null;
            }
            Type[] typeArrI = v.i(type, clsG);
            return new q(rVar, typeArrI[0], typeArrI[1]).g();
        }
    }

    q(r rVar, Type type, Type type2) {
        this.f24726a = rVar.d(type);
        this.f24727b = rVar.d(type2);
    }

    @Override // Y6.h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Map b(k kVar) {
        p pVar = new p();
        kVar.g();
        while (kVar.s()) {
            kVar.m0();
            Object objB = this.f24726a.b(kVar);
            Object objB2 = this.f24727b.b(kVar);
            Object objPut = pVar.put(objB, objB2);
            if (objPut != null) {
                throw new JsonDataException("Map key '" + objB + "' has multiple values at path " + kVar.getPath() + ": " + objPut + " and " + objB2);
            }
        }
        kVar.j();
        return pVar;
    }

    @Override // Y6.h
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(o oVar, Map map) {
        oVar.h();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() == null) {
                throw new JsonDataException("Map key is null at " + oVar.getPath());
            }
            oVar.Y();
            this.f24726a.j(oVar, entry.getKey());
            this.f24727b.j(oVar, entry.getValue());
        }
        oVar.v();
    }

    public String toString() {
        return "JsonAdapter(" + this.f24726a + "=" + this.f24727b + ")";
    }
}
