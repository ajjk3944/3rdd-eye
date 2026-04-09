package nk;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import lr.m1;
import lr.t0;

/* loaded from: classes.dex */
public final class n0 extends r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18424a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.t f18425b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18426c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f18427d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f18428e;

    public n0(ir.g gVar, ArrayList arrayList, ArrayList arrayList2, io.sentry.t tVar) {
        this.f18426c = gVar;
        this.f18427d = arrayList;
        this.f18428e = arrayList2;
        this.f18425b = tVar;
    }

    @Override // nk.r
    public final Object fromJson(w wVar) {
        int i10 = this.f18424a;
        Object obj = this.f18428e;
        io.sentry.t tVar = this.f18425b;
        Object obj2 = this.f18427d;
        switch (i10) {
            case 0:
                int iQ0 = wVar.q0(tVar);
                if (iQ0 != -1) {
                    return ((Enum[]) obj)[iQ0];
                }
                throw new bf.n("Expected one of " + Arrays.asList((String[]) obj2) + " but was " + wVar.Z() + " at path " + wVar.q());
            default:
                br.l.e(wVar, "reader");
                ir.g gVar = (ir.g) this.f18426c;
                int size = gVar.o().size();
                ArrayList arrayList = (ArrayList) obj2;
                int size2 = arrayList.size();
                Object[] objArr = new Object[size2];
                int i11 = 0;
                while (true) {
                    Object obj3 = pk.c.f20590a;
                    if (i11 >= size2) {
                        wVar.f();
                        while (wVar.w()) {
                            int iP0 = wVar.p0(tVar);
                            if (iP0 == -1) {
                                wVar.r0();
                                wVar.s0();
                            } else {
                                pk.a aVar = (pk.a) ((ArrayList) obj).get(iP0);
                                int i12 = aVar.f20587e;
                                ir.s sVar = aVar.f20585c;
                                if (objArr[i12] != obj3) {
                                    throw new bf.n("Multiple values for '" + sVar.getName() + "' at " + wVar.q());
                                }
                                Object objFromJson = aVar.f20584b.fromJson(wVar);
                                objArr[i12] = objFromJson;
                                if (objFromJson == null && !((m1) sVar.i()).f15644a.c0()) {
                                    String name = sVar.getName();
                                    String str = aVar.f20583a;
                                    Set set = ok.f.f19537a;
                                    String strQ = wVar.q();
                                    throw new bf.n(str.equals(name) ? "Non-null value '" + name + "' was null at " + strQ : "Non-null value '" + name + "' (JSON name '" + str + "') was null at " + strQ);
                                }
                            }
                        }
                        wVar.i();
                        boolean z10 = arrayList.size() == size;
                        for (int i13 = 0; i13 < size; i13++) {
                            if (objArr[i13] == obj3) {
                                if (((t0) ((ir.m) gVar.o().get(i13))).f()) {
                                    z10 = false;
                                } else {
                                    if (!((t0) ((ir.m) gVar.o().get(i13))).c().f15644a.c0()) {
                                        String name2 = ((t0) ((ir.m) gVar.o().get(i13))).getName();
                                        pk.a aVar2 = (pk.a) arrayList.get(i13);
                                        String str2 = aVar2 != null ? aVar2.f20583a : null;
                                        Set set2 = ok.f.f19537a;
                                        String strQ2 = wVar.q();
                                        throw new bf.n(str2.equals(name2) ? "Required value '" + name2 + "' missing at " + strQ2 : "Required value '" + name2 + "' (JSON name '" + str2 + "') missing at " + strQ2);
                                    }
                                    objArr[i13] = null;
                                }
                            }
                        }
                        Object objS = z10 ? gVar.s(Arrays.copyOf(objArr, size2)) : gVar.t(new pk.b(gVar.o(), objArr));
                        int size3 = arrayList.size();
                        while (size < size3) {
                            Object obj4 = arrayList.get(size);
                            br.l.b(obj4);
                            pk.a aVar3 = (pk.a) obj4;
                            Object obj5 = objArr[size];
                            if (obj5 != obj3) {
                                ((ir.j) aVar3.f20585c).u(objS, obj5);
                            }
                            size++;
                        }
                        return objS;
                    }
                    objArr[i11] = obj3;
                    i11++;
                }
                break;
        }
    }

    @Override // nk.r
    public final void toJson(c0 c0Var, Object obj) {
        switch (this.f18424a) {
            case 0:
                c0Var.i0(((String[]) this.f18427d)[((Enum) obj).ordinal()]);
                return;
            default:
                br.l.e(c0Var, "writer");
                if (obj == null) {
                    throw new NullPointerException("value == null");
                }
                c0Var.f();
                Iterator it = ((ArrayList) this.f18427d).iterator();
                while (it.hasNext()) {
                    pk.a aVar = (pk.a) it.next();
                    if (aVar != null) {
                        c0Var.y(aVar.f20583a);
                        aVar.f20584b.toJson(c0Var, aVar.f20585c.get(obj));
                    }
                }
                c0Var.q();
                return;
        }
    }

    public final String toString() {
        switch (this.f18424a) {
            case 0:
                return "JsonAdapter(" + ((Class) this.f18426c).getName() + ")";
            default:
                return "KotlinJsonAdapter(" + ((ir.g) this.f18426c).i() + ')';
        }
    }

    public n0(Class cls) throws NoSuchFieldException {
        int i10 = 0;
        this.f18426c = cls;
        try {
            Enum[] enumArr = (Enum[]) cls.getEnumConstants();
            this.f18428e = enumArr;
            this.f18427d = new String[enumArr.length];
            while (true) {
                Enum[] enumArr2 = (Enum[]) this.f18428e;
                if (i10 < enumArr2.length) {
                    String strName = enumArr2[i10].name();
                    String[] strArr = (String[]) this.f18427d;
                    Field field = cls.getField(strName);
                    Set set = ok.f.f19537a;
                    o oVar = (o) field.getAnnotation(o.class);
                    if (oVar != null) {
                        String strName2 = oVar.name();
                        if (!"\u0000".equals(strName2)) {
                            strName = strName2;
                        }
                    }
                    strArr[i10] = strName;
                    i10++;
                } else {
                    this.f18425b = io.sentry.t.G((String[]) this.f18427d);
                    return;
                }
            }
        } catch (NoSuchFieldException e4) {
            throw new AssertionError("Missing field in ".concat(cls.getName()), e4);
        }
    }
}
