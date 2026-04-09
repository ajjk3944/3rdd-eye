package lr;

import com.google.android.gms.internal.measurement.e5;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p.v2;

/* loaded from: classes.dex */
public abstract class z1 {

    /* renamed from: a, reason: collision with root package name */
    public static final qs.c f15721a = new qs.c("kotlin.jvm.JvmStatic");

    public static final r a(ir.c cVar) {
        r rVar = cVar instanceof r ? (r) cVar : null;
        if (rVar != null) {
            return rVar;
        }
        f0 f0VarB = b(cVar);
        return f0VarB != null ? f0VarB : c(cVar);
    }

    public static final f0 b(Object obj) {
        f0 f0Var = obj instanceof f0 ? (f0) obj : null;
        if (f0Var != null) {
            return f0Var;
        }
        br.j jVar = obj instanceof br.j ? (br.j) obj : null;
        ir.c cVarG = jVar != null ? jVar.g() : null;
        if (cVarG instanceof f0) {
            return (f0) cVarG;
        }
        return null;
    }

    public static final j1 c(Object obj) {
        j1 j1Var = obj instanceof j1 ? (j1) obj : null;
        if (j1Var != null) {
            return j1Var;
        }
        br.s sVar = obj instanceof br.s ? (br.s) obj : null;
        ir.c cVarG = sVar != null ? sVar.g() : null;
        if (cVarG instanceof j1) {
            return (j1) cVarG;
        }
        return null;
    }

    public static final ArrayList d(sr.a aVar) throws IllegalAccessException, IllegalArgumentException, NegativeArraySizeException, InvocationTargetException {
        List listH;
        br.l.e(aVar, "<this>");
        sr.h annotations = aVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        Iterator it = annotations.iterator();
        while (true) {
            Annotation annotationI = null;
            if (!it.hasNext()) {
                break;
            }
            sr.b bVar = (sr.b) it.next();
            rr.o0 o0VarH = bVar.h();
            if (o0VarH instanceof wr.a) {
                annotationI = ((wr.a) o0VarH).f24587a;
            } else if (o0VarH instanceof wr.f) {
                xr.s sVar = ((wr.f) o0VarH).f24595a;
                xr.e eVar = sVar instanceof xr.e ? (xr.e) sVar : null;
                if (eVar != null) {
                    annotationI = eVar.f25501a;
                }
            } else {
                annotationI = i(bVar);
            }
            if (annotationI != null) {
                arrayList.add(annotationI);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (ir.f0.D(ir.f0.z((Annotation) it2.next())).getSimpleName().equals("Container")) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        Annotation annotation = (Annotation) it3.next();
                        Class clsD = ir.f0.D(ir.f0.z(annotation));
                        if (!clsD.getSimpleName().equals("Container") || clsD.getAnnotation(br.z.class) == null) {
                            listH = e5.H(annotation);
                        } else {
                            Object objInvoke = clsD.getDeclaredMethod("value", null).invoke(annotation, null);
                            br.l.c(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                            listH = mq.l.X((Annotation[]) objInvoke);
                        }
                        mq.t.d0(arrayList2, listH);
                    }
                    return arrayList2;
                }
            }
        }
        return arrayList;
    }

    public static final Object e(Type type) {
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return null;
        }
        if (type.equals(Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (type.equals(Character.TYPE)) {
            return (char) 0;
        }
        if (type.equals(Byte.TYPE)) {
            return (byte) 0;
        }
        if (type.equals(Short.TYPE)) {
            return (short) 0;
        }
        if (type.equals(Integer.TYPE)) {
            return 0;
        }
        if (type.equals(Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (type.equals(Long.TYPE)) {
            return 0L;
        }
        if (type.equals(Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (type.equals(Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final rr.b f(Class cls, rs.m mVar, ns.f fVar, h7.h0 h0Var, ns.a aVar, ar.n nVar) {
        List list;
        br.l.e(cls, "moduleAnchor");
        br.l.e(mVar, "proto");
        br.l.e(fVar, "nameResolver");
        br.l.e(aVar, "metadataVersion");
        wr.e eVarA = q1.a(cls);
        if (mVar instanceof ls.y) {
            list = ((ls.y) mVar).E;
        } else {
            if (!(mVar instanceof ls.g0)) {
                throw new IllegalStateException(("Unsupported message: " + mVar).toString());
            }
            list = ((ls.g0) mVar).E;
        }
        List list2 = list;
        dt.k kVar = eVarA.f24593a;
        rr.a0 a0Var = kVar.f7494b;
        br.l.d(list2, "typeParameters");
        return (rr.b) nVar.w(new dt.t(new al.b(kVar, fVar, (rr.l) a0Var, h0Var, ns.h.f18553a, aVar, (ft.k) null, (v2) null, list2)), mVar);
    }

    public static final ur.v g(rr.d dVar) {
        br.l.e(dVar, "<this>");
        if (dVar.f0() == null) {
            return null;
        }
        rr.l lVarO = dVar.o();
        br.l.c(lVarO, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((rr.f) lVarO).R0();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class h(ClassLoader classLoader, qs.b bVar, int i10) {
        String str = qr.d.f20965a;
        qs.e eVarI = bVar.b().i();
        br.l.d(eVarI, "kotlinClassId.asSingleFqName().toUnsafe()");
        qs.b bVarF = qr.d.f(eVarI);
        if (bVarF != null) {
            bVar = bVarF;
        }
        String strB = bVar.g().b();
        String strB2 = bVar.h().b();
        if (strB.equals("kotlin")) {
            switch (strB2.hashCode()) {
                case -901856463:
                    if (strB2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (strB2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (strB2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (strB2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (strB2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (strB2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (strB2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (strB2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (strB2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (i10 > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append("[");
            }
            sb2.append("L");
        }
        if (strB.length() > 0) {
            sb2.append(strB.concat("."));
        }
        sb2.append(tt.s.k0(strB2, '.', '$'));
        if (i10 > 0) {
            sb2.append(";");
        }
        String string = sb2.toString();
        br.l.d(string, "StringBuilder().apply(builderAction).toString()");
        return kc.f.X(classLoader, string);
    }

    public static final Annotation i(sr.b bVar) throws NegativeArraySizeException {
        rr.f fVarD = xs.d.d(bVar);
        Class clsJ = fVarD != null ? j(fVarD) : null;
        if (clsJ == null) {
            clsJ = null;
        }
        if (clsJ == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = bVar.b().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            qs.g gVar = (qs.g) entry.getKey();
            vs.g gVar2 = (vs.g) entry.getValue();
            ClassLoader classLoader = clsJ.getClassLoader();
            br.l.d(classLoader, "annotationClass.classLoader");
            Object objK = k(gVar2, classLoader);
            lq.l lVar = objK != null ? new lq.l(gVar.b(), objK) : null;
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        Map mapV = mq.b0.V(arrayList);
        Set setKeySet = mapV.keySet();
        ArrayList arrayList2 = new ArrayList(mq.p.a0(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList2.add(clsJ.getDeclaredMethod((String) it.next(), null));
        }
        return (Annotation) ic.a.k(clsJ, mapV, arrayList2);
    }

    public static final Class j(rr.f fVar) {
        br.l.e(fVar, "<this>");
        rr.o0 o0VarH = fVar.h();
        br.l.d(o0VarH, "source");
        if (o0VarH instanceof js.r) {
            return ((js.r) o0VarH).f13825a.f24588a;
        }
        if (o0VarH instanceof wr.f) {
            xr.s sVar = ((wr.f) o0VarH).f24595a;
            br.l.c(sVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((xr.o) sVar).f25509a;
        }
        qs.b bVarF = xs.d.f(fVar);
        if (bVarF == null) {
            return null;
        }
        return h(xr.d.d(fVar.getClass()), bVarF, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object k(vs.g gVar, ClassLoader classLoader) throws NegativeArraySizeException {
        ht.x xVar;
        Class clsH;
        if (gVar instanceof vs.a) {
            return i((sr.b) ((vs.a) gVar).f23957a);
        }
        int i10 = 0;
        if (gVar instanceof vs.b) {
            vs.b bVar = (vs.b) gVar;
            vs.z zVar = bVar instanceof vs.z ? (vs.z) bVar : null;
            if (zVar != null && (xVar = zVar.f23967c) != null) {
                Object obj = bVar.f23957a;
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(mq.p.a0(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(k((vs.g) it.next(), classLoader));
                }
                qs.g gVar2 = or.h.f19672e;
                rr.i iVarP = xVar.Z().p();
                or.k kVarR = iVarP == null ? null : or.h.r(iVarP);
                switch (kVarR == null ? -1 : y1.f15717a[kVarR.ordinal()]) {
                    case -1:
                        if (!or.h.y(xVar)) {
                            throw new IllegalStateException(("Not an array type: " + xVar).toString());
                        }
                        ht.x xVarB = ((ht.p0) mq.o.I0(xVar.L())).b();
                        br.l.d(xVarB, "type.arguments.single().type");
                        rr.i iVarP2 = xVarB.Z().p();
                        rr.f fVar = iVarP2 instanceof rr.f ? (rr.f) iVarP2 : null;
                        if (fVar == null) {
                            throw new IllegalStateException(("Not a class type: " + xVarB).toString());
                        }
                        if (or.h.G(xVarB)) {
                            int size = ((List) obj).size();
                            String[] strArr = new String[size];
                            while (i10 < size) {
                                Object obj2 = arrayList.get(i10);
                                br.l.c(obj2, "null cannot be cast to non-null type kotlin.String");
                                strArr[i10] = obj2;
                                i10++;
                            }
                            return strArr;
                        }
                        if (or.h.b(fVar, or.n.P)) {
                            int size2 = ((List) obj).size();
                            Class[] clsArr = new Class[size2];
                            while (i10 < size2) {
                                Object obj3 = arrayList.get(i10);
                                br.l.c(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                                clsArr[i10] = obj3;
                                i10++;
                            }
                            return clsArr;
                        }
                        qs.b bVarF = xs.d.f(fVar);
                        if (bVarF != null && (clsH = h(classLoader, bVarF, 0)) != null) {
                            Object objNewInstance = Array.newInstance((Class<?>) clsH, ((List) obj).size());
                            br.l.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                            Object[] objArr = (Object[]) objNewInstance;
                            int size3 = arrayList.size();
                            while (i10 < size3) {
                                objArr[i10] = arrayList.get(i10);
                                i10++;
                            }
                            return objArr;
                        }
                        break;
                    case 0:
                    default:
                        throw new bf.n();
                    case 1:
                        int size4 = ((List) obj).size();
                        boolean[] zArr = new boolean[size4];
                        while (i10 < size4) {
                            Object obj4 = arrayList.get(i10);
                            br.l.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            zArr[i10] = ((Boolean) obj4).booleanValue();
                            i10++;
                        }
                        return zArr;
                    case 2:
                        int size5 = ((List) obj).size();
                        char[] cArr = new char[size5];
                        while (i10 < size5) {
                            Object obj5 = arrayList.get(i10);
                            br.l.c(obj5, "null cannot be cast to non-null type kotlin.Char");
                            cArr[i10] = ((Character) obj5).charValue();
                            i10++;
                        }
                        return cArr;
                    case 3:
                        int size6 = ((List) obj).size();
                        byte[] bArr = new byte[size6];
                        while (i10 < size6) {
                            Object obj6 = arrayList.get(i10);
                            br.l.c(obj6, "null cannot be cast to non-null type kotlin.Byte");
                            bArr[i10] = ((Byte) obj6).byteValue();
                            i10++;
                        }
                        return bArr;
                    case 4:
                        int size7 = ((List) obj).size();
                        short[] sArr = new short[size7];
                        while (i10 < size7) {
                            Object obj7 = arrayList.get(i10);
                            br.l.c(obj7, "null cannot be cast to non-null type kotlin.Short");
                            sArr[i10] = ((Short) obj7).shortValue();
                            i10++;
                        }
                        return sArr;
                    case g4.j.STRING_FIELD_NUMBER /* 5 */:
                        int size8 = ((List) obj).size();
                        int[] iArr = new int[size8];
                        while (i10 < size8) {
                            Object obj8 = arrayList.get(i10);
                            br.l.c(obj8, "null cannot be cast to non-null type kotlin.Int");
                            iArr[i10] = ((Integer) obj8).intValue();
                            i10++;
                        }
                        return iArr;
                    case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                        int size9 = ((List) obj).size();
                        float[] fArr = new float[size9];
                        while (i10 < size9) {
                            Object obj9 = arrayList.get(i10);
                            br.l.c(obj9, "null cannot be cast to non-null type kotlin.Float");
                            fArr[i10] = ((Float) obj9).floatValue();
                            i10++;
                        }
                        return fArr;
                    case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        int size10 = ((List) obj).size();
                        long[] jArr = new long[size10];
                        while (i10 < size10) {
                            Object obj10 = arrayList.get(i10);
                            br.l.c(obj10, "null cannot be cast to non-null type kotlin.Long");
                            jArr[i10] = ((Long) obj10).longValue();
                            i10++;
                        }
                        return jArr;
                    case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                        int size11 = ((List) obj).size();
                        double[] dArr = new double[size11];
                        while (i10 < size11) {
                            Object obj11 = arrayList.get(i10);
                            br.l.c(obj11, "null cannot be cast to non-null type kotlin.Double");
                            dArr[i10] = ((Double) obj11).doubleValue();
                            i10++;
                        }
                        return dArr;
                }
            }
        } else if (gVar instanceof vs.i) {
            lq.l lVar = (lq.l) ((vs.i) gVar).f23957a;
            qs.b bVar2 = (qs.b) lVar.f15571a;
            qs.g gVar3 = (qs.g) lVar.f15572d;
            Class clsH2 = h(classLoader, bVar2, 0);
            if (clsH2 != null) {
                return Enum.valueOf(clsH2, gVar3.b());
            }
        } else if (gVar instanceof vs.u) {
            vs.t tVar = (vs.t) ((vs.u) gVar).f23957a;
            if (tVar instanceof vs.s) {
                vs.f fVar2 = ((vs.s) tVar).f23966a;
                return h(classLoader, fVar2.f23955a, fVar2.f23956b);
            }
            if (!(tVar instanceof vs.r)) {
                throw new bf.n();
            }
            rr.i iVarP3 = ((vs.r) tVar).f23965a.Z().p();
            rr.f fVar3 = iVarP3 instanceof rr.f ? (rr.f) iVarP3 : null;
            if (fVar3 != null) {
                return j(fVar3);
            }
        } else {
            if (!(gVar instanceof vs.j ? true : gVar instanceof vs.w)) {
                return gVar.b();
            }
        }
        return null;
    }
}
