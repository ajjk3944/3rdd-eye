package a1;

import X0.C1638a;
import X0.l;
import X0.o;
import Z0.d;
import Z0.e;
import Z0.f;
import a1.d;
import androidx.datastore.preferences.protobuf.AbstractC1733k;
import androidx.datastore.preferences.protobuf.C1746y;
import androidx.datastore.preferences.protobuf.C1747z;
import b9.C1992A;
import b9.j;
import c9.C2078B;
import c9.C2097r;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

/* compiled from: PreferencesSerializer.kt */
/* loaded from: classes.dex */
public final class f implements l<d> {

    /* renamed from: a, reason: collision with root package name */
    public static final f f14094a = new f();

    /* compiled from: PreferencesSerializer.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14095a;

        static {
            int[] iArr = new int[f.b.values().length];
            iArr[f.b.BOOLEAN.ordinal()] = 1;
            iArr[f.b.FLOAT.ordinal()] = 2;
            iArr[f.b.DOUBLE.ordinal()] = 3;
            iArr[f.b.INTEGER.ordinal()] = 4;
            iArr[f.b.LONG.ordinal()] = 5;
            iArr[f.b.STRING.ordinal()] = 6;
            iArr[f.b.STRING_SET.ordinal()] = 7;
            iArr[f.b.VALUE_NOT_SET.ordinal()] = 8;
            f14095a = iArr;
        }
    }

    @Override // X0.l
    public final C1992A a(Object obj, o.b bVar) throws IOException {
        Z0.f fVarD;
        Map<d.a<?>, Object> mapA = ((d) obj).a();
        d.a aVarN = Z0.d.n();
        for (Map.Entry<d.a<?>, Object> entry : mapA.entrySet()) {
            d.a<?> key = entry.getKey();
            Object value = entry.getValue();
            String str = key.f14090a;
            if (value instanceof Boolean) {
                f.a aVarB = Z0.f.B();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                aVarB.f();
                Z0.f.p((Z0.f) aVarB.f15703c, zBooleanValue);
                fVarD = aVarB.d();
            } else if (value instanceof Float) {
                f.a aVarB2 = Z0.f.B();
                float fFloatValue = ((Number) value).floatValue();
                aVarB2.f();
                Z0.f.q((Z0.f) aVarB2.f15703c, fFloatValue);
                fVarD = aVarB2.d();
            } else if (value instanceof Double) {
                f.a aVarB3 = Z0.f.B();
                double dDoubleValue = ((Number) value).doubleValue();
                aVarB3.f();
                Z0.f.n((Z0.f) aVarB3.f15703c, dDoubleValue);
                fVarD = aVarB3.d();
            } else if (value instanceof Integer) {
                f.a aVarB4 = Z0.f.B();
                int iIntValue = ((Number) value).intValue();
                aVarB4.f();
                Z0.f.r((Z0.f) aVarB4.f15703c, iIntValue);
                fVarD = aVarB4.d();
            } else if (value instanceof Long) {
                f.a aVarB5 = Z0.f.B();
                long jLongValue = ((Number) value).longValue();
                aVarB5.f();
                Z0.f.k((Z0.f) aVarB5.f15703c, jLongValue);
                fVarD = aVarB5.d();
            } else if (value instanceof String) {
                f.a aVarB6 = Z0.f.B();
                aVarB6.f();
                Z0.f.l((Z0.f) aVarB6.f15703c, (String) value);
                fVarD = aVarB6.d();
            } else {
                if (!(value instanceof Set)) {
                    throw new IllegalStateException(kotlin.jvm.internal.l.k(value.getClass().getName(), "PreferencesSerializer does not support type: "));
                }
                f.a aVarB7 = Z0.f.B();
                e.a aVarO = Z0.e.o();
                aVarO.f();
                Z0.e.l((Z0.e) aVarO.f15703c, (Set) value);
                aVarB7.f();
                Z0.f.m((Z0.f) aVarB7.f15703c, aVarO);
                fVarD = aVarB7.d();
            }
            aVarN.getClass();
            aVarN.f();
            Z0.d.l((Z0.d) aVarN.f15703c).put(str, fVarD);
        }
        Z0.d dVarD = aVarN.d();
        int serializedSize = dVarD.getSerializedSize();
        Logger logger = AbstractC1733k.f15650b;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        AbstractC1733k.d dVar = new AbstractC1733k.d(bVar, serializedSize);
        dVarD.b(dVar);
        if (dVar.f15655f > 0) {
            dVar.P();
        }
        return C1992A.f18074a;
    }

    @Override // X0.l
    public final d b() {
        return new C1643a(true, 1);
    }

    @Override // X0.l
    public final Object c(FileInputStream fileInputStream) throws IOException {
        try {
            Z0.d dVarO = Z0.d.o(fileInputStream);
            C1643a c1643a = new C1643a(false, 1);
            d.b[] pairs = (d.b[]) Arrays.copyOf(new d.b[0], 0);
            kotlin.jvm.internal.l.f(pairs, "pairs");
            if (c1643a.f14084b.get()) {
                throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
            }
            if (pairs.length > 0) {
                pairs[0].getClass();
                c1643a.c(null, null);
                throw null;
            }
            Map<String, Z0.f> mapM = dVarO.m();
            kotlin.jvm.internal.l.e(mapM, "preferencesProto.preferencesMap");
            for (Map.Entry<String, Z0.f> entry : mapM.entrySet()) {
                String name = entry.getKey();
                Z0.f value = entry.getValue();
                kotlin.jvm.internal.l.e(name, "name");
                kotlin.jvm.internal.l.e(value, "value");
                f.b bVarA = value.A();
                switch (bVarA == null ? -1 : a.f14095a[bVarA.ordinal()]) {
                    case -1:
                        throw new C1638a("Value case is null.", null);
                    case 0:
                    default:
                        throw new j();
                    case 1:
                        c1643a.c(new d.a<>(name), Boolean.valueOf(value.s()));
                        break;
                    case 2:
                        c1643a.c(new d.a<>(name), Float.valueOf(value.v()));
                        break;
                    case 3:
                        c1643a.c(new d.a<>(name), Double.valueOf(value.u()));
                        break;
                    case 4:
                        c1643a.c(new d.a<>(name), Integer.valueOf(value.w()));
                        break;
                    case 5:
                        c1643a.c(new d.a<>(name), Long.valueOf(value.x()));
                        break;
                    case 6:
                        d.a<?> aVar = new d.a<>(name);
                        String strY = value.y();
                        kotlin.jvm.internal.l.e(strY, "value.string");
                        c1643a.c(aVar, strY);
                        break;
                    case 7:
                        d.a<?> aVar2 = new d.a<>(name);
                        C1746y.c cVarN = value.z().n();
                        kotlin.jvm.internal.l.e(cVarN, "value.stringSet.stringsList");
                        c1643a.c(aVar2, C2097r.L0(cVarN));
                        break;
                    case 8:
                        throw new C1638a("Value not set.", null);
                }
            }
            return new C1643a(C2078B.u(c1643a.a()), true);
        } catch (C1747z e4) {
            throw new C1638a("Unable to parse preferences proto.", e4);
        }
    }
}
