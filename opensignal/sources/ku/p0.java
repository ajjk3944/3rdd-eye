package ku;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final iu.e[] f14594a = new iu.e[0];

    /* renamed from: b, reason: collision with root package name */
    public static final gu.a[] f14595b = new gu.a[0];

    public static final a0 a(gu.a aVar, String str) {
        return new a0(str, new b0(aVar));
    }

    public static final Set b(iu.e eVar) {
        br.l.e(eVar, "<this>");
        if (eVar instanceof j) {
            return ((j) eVar).a();
        }
        HashSet hashSet = new HashSet(eVar.k());
        int iK = eVar.k();
        for (int i10 = 0; i10 < iK; i10++) {
            hashSet.add(eVar.l(i10));
        }
        return hashSet;
    }

    public static final iu.e[] c(List list) {
        iu.e[] eVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (eVarArr = (iu.e[]) list.toArray(new iu.e[0])) == null) ? f14594a : eVarArr;
    }

    public static final v d(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr) {
        br.l.e(enumArr, "values");
        u uVar = new u(str, enumArr.length);
        int length = enumArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            Enum r52 = enumArr[i10];
            int i12 = i11 + 1;
            String strName = (String) mq.l.q0(i11, strArr);
            if (strName == null) {
                strName = r52.name();
            }
            uVar.b(strName, false);
            Annotation[] annotationArr2 = (Annotation[]) mq.l.q0(i11, annotationArr);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    br.l.e(annotation, "annotation");
                    int i13 = uVar.f14609d;
                    List[] listArr = uVar.f14611f;
                    List arrayList = listArr[i13];
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                        listArr[uVar.f14609d] = arrayList;
                    }
                    arrayList.add(annotation);
                }
            }
            i10++;
            i11 = i12;
        }
        return new v(str, enumArr, uVar);
    }

    public static final int e(iu.e eVar, iu.e[] eVarArr) {
        br.l.e(eVarArr, "typeParams");
        int iHashCode = (eVar.h().hashCode() * 31) + Arrays.hashCode(eVarArr);
        int iK = eVar.k();
        int i10 = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iK > 0)) {
                break;
            }
            int i11 = iK - 1;
            int i12 = i10 * 31;
            String strH = eVar.n(eVar.k() - iK).h();
            if (strH != null) {
                iHashCode2 = strH.hashCode();
            }
            i10 = i12 + iHashCode2;
            iK = i11;
        }
        int iK2 = eVar.k();
        int iHashCode3 = 1;
        while (true) {
            if (!(iK2 > 0)) {
                return (((iHashCode * 31) + i10) * 31) + iHashCode3;
            }
            int i13 = iK2 - 1;
            int i14 = iHashCode3 * 31;
            i3.g gVarF = eVar.n(eVar.k() - iK2).f();
            iHashCode3 = i14 + (gVarF != null ? gVarF.hashCode() : 0);
            iK2 = i13;
        }
    }

    public static final void f(int i10, int i11, iu.e eVar) {
        br.l.e(eVar, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i12 = (~i10) & i11;
        for (int i13 = 0; i13 < 32; i13++) {
            if ((i12 & 1) != 0) {
                arrayList.add(eVar.l(i13));
            }
            i12 >>>= 1;
        }
        String strH = eVar.h();
        br.l.e(strH, "serialName");
        throw new gu.b(arrayList, arrayList.size() == 1 ? "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + strH + "', but it was missing" : "Fields " + arrayList + " are required for type with serial name '" + strH + "', but they were missing", null);
    }

    public static final void g(ir.d dVar, String str) {
        String string;
        br.l.e(dVar, "baseClass");
        String str2 = "in the polymorphic scope of '" + dVar.p() + '\'';
        if (str == null) {
            string = h0.b.g('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sb2 = new StringBuilder("Serializer for subclass '");
            sb2.append(str);
            sb2.append("' is not found ");
            sb2.append(str2);
            sb2.append(".\nCheck if class with serial name '");
            w.g.q(sb2, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sb2.append(dVar.p());
            sb2.append("' has to be sealed and '@Serializable'.");
            string = sb2.toString();
        }
        throw new gu.e(string);
    }
}
