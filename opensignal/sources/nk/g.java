package nk;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class g extends r {

    /* renamed from: d, reason: collision with root package name */
    public static final f f18382d = new f(0);

    /* renamed from: e, reason: collision with root package name */
    public static final f f18383e = new f(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18384a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final r f18385b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18386c;

    public g(Class cls, r rVar) {
        this.f18386c = cls;
        this.f18385b = rVar;
    }

    @Override // nk.r
    public final Object fromJson(w wVar) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        switch (this.f18384a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                wVar.b();
                while (wVar.w()) {
                    arrayList.add(this.f18385b.fromJson(wVar));
                }
                wVar.h();
                Object objNewInstance = Array.newInstance((Class<?>) this.f18386c, arrayList.size());
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    Array.set(objNewInstance, i10, arrayList.get(i10));
                }
                return objNewInstance;
            case 1:
                g0 g0Var = new g0();
                wVar.f();
                while (wVar.w()) {
                    wVar.i0();
                    Object objFromJson = this.f18385b.fromJson(wVar);
                    Object objFromJson2 = ((r) this.f18386c).fromJson(wVar);
                    Object objPut = g0Var.put(objFromJson, objFromJson2);
                    if (objPut != null) {
                        throw new bf.n("Map key '" + objFromJson + "' has multiple values at path " + wVar.q() + ": " + objPut + " and " + objFromJson2);
                    }
                }
                wVar.i();
                return g0Var;
            default:
                return this.f18385b.fromJson(wVar);
        }
    }

    @Override // nk.r
    public boolean isLenient() {
        switch (this.f18384a) {
            case 2:
                return this.f18385b.isLenient();
            default:
                return super.isLenient();
        }
    }

    @Override // nk.r
    public final void toJson(c0 c0Var, Object obj) {
        switch (this.f18384a) {
            case 0:
                c0Var.b();
                int length = Array.getLength(obj);
                for (int i10 = 0; i10 < length; i10++) {
                    this.f18385b.toJson(c0Var, Array.get(obj, i10));
                }
                c0Var.i();
                return;
            case 1:
                c0Var.f();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (entry.getKey() == null) {
                        throw new bf.n("Map key is null at " + c0Var.w());
                    }
                    int iL = c0Var.L();
                    if (iL != 5 && iL != 3) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    c0Var.D = true;
                    this.f18385b.toJson(c0Var, entry.getKey());
                    ((r) this.f18386c).toJson(c0Var, entry.getValue());
                }
                c0Var.q();
                return;
            default:
                String str = c0Var.f18357x;
                if (str == null) {
                    str = "";
                }
                c0Var.V((String) this.f18386c);
                try {
                    this.f18385b.toJson(c0Var, obj);
                    return;
                } finally {
                    c0Var.V(str);
                }
        }
    }

    public final String toString() {
        switch (this.f18384a) {
            case 0:
                return this.f18385b + ".array()";
            case 1:
                return "JsonAdapter(" + this.f18385b + "=" + ((r) this.f18386c) + ")";
            default:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f18385b);
                sb2.append(".indent(\"");
                return w.g.j(sb2, (String) this.f18386c, "\")");
        }
    }

    public g(r rVar, String str) {
        this.f18385b = rVar;
        this.f18386c = str;
    }

    public g(j0 j0Var, Type type, Type type2) {
        Set set = ok.f.f19537a;
        this.f18385b = j0Var.b(type, set, null);
        this.f18386c = j0Var.b(type2, set, null);
    }
}
