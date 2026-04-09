package h4;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.e0;
import bf.n;
import br.l;
import d4.h1;
import d4.z0;
import g4.i;
import g4.j;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import lf.t1;
import mq.o;

/* loaded from: classes.dex */
public final class h implements z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h f9897a = new h();

    @Override // d4.z0
    public final Object a() {
        return new b(true);
    }

    @Override // d4.z0
    public final Object b(FileInputStream fileInputStream) throws d4.b {
        byte[] bArr;
        l.e(fileInputStream, "input");
        try {
            g4.e eVarO = g4.e.o(fileInputStream);
            b bVar = new b(false);
            f[] fVarArr = (f[]) Arrays.copyOf(new f[0], 0);
            l.e(fVarArr, "pairs");
            bVar.b();
            if (fVarArr.length > 0) {
                f fVar = fVarArr[0];
                throw null;
            }
            Map mapM = eVarO.m();
            l.d(mapM, "preferencesProto.preferencesMap");
            for (Map.Entry entry : mapM.entrySet()) {
                String str = (String) entry.getKey();
                j jVar = (j) entry.getValue();
                l.d(str, "name");
                l.d(jVar, "value");
                i iVarC = jVar.C();
                switch (iVarC == null ? -1 : g.f9896a[iVarC.ordinal()]) {
                    case -1:
                        throw new d4.b("Value case is null.", null);
                    case 0:
                    default:
                        throw new n();
                    case 1:
                        bVar.e(new e(str), Boolean.valueOf(jVar.t()));
                        break;
                    case 2:
                        bVar.e(new e(str), Float.valueOf(jVar.x()));
                        break;
                    case 3:
                        bVar.e(new e(str), Double.valueOf(jVar.w()));
                        break;
                    case 4:
                        bVar.e(new e(str), Integer.valueOf(jVar.y()));
                        break;
                    case j.STRING_FIELD_NUMBER /* 5 */:
                        bVar.e(new e(str), Long.valueOf(jVar.z()));
                        break;
                    case j.STRING_SET_FIELD_NUMBER /* 6 */:
                        e eVar = new e(str);
                        String strA = jVar.A();
                        l.d(strA, "value.string");
                        bVar.e(eVar, strA);
                        break;
                    case j.DOUBLE_FIELD_NUMBER /* 7 */:
                        e eVarF = t1.F(str);
                        b0 b0VarN = jVar.B().n();
                        l.d(b0VarN, "value.stringSet.stringsList");
                        bVar.e(eVarF, o.U0(b0VarN));
                        break;
                    case j.BYTES_FIELD_NUMBER /* 8 */:
                        e eVar2 = new e(str);
                        androidx.datastore.preferences.protobuf.g gVarU = jVar.u();
                        int size = gVarU.size();
                        if (size == 0) {
                            bArr = c0.f1254b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            gVarU.d(size, bArr2);
                            bArr = bArr2;
                        }
                        l.d(bArr, "value.bytes.toByteArray()");
                        bVar.e(eVar2, bArr);
                        break;
                    case 9:
                        throw new d4.b("Value not set.", null);
                }
            }
            return new b(mq.b0.Y(bVar.a()), true);
        } catch (e0 e4) {
            throw new d4.b("Unable to parse preferences proto.", e4);
        }
    }

    @Override // d4.z0
    public final void c(Object obj, h1 h1Var) throws IOException {
        a0 a0VarA;
        Map mapA = ((b) obj).a();
        g4.c cVarN = g4.e.n();
        for (Map.Entry entry : mapA.entrySet()) {
            e eVar = (e) entry.getKey();
            Object value = entry.getValue();
            String str = eVar.f9895a;
            if (value instanceof Boolean) {
                g4.h hVarD = j.D();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                hVarD.c();
                j.q((j) hVarD.f1378d, zBooleanValue);
                a0VarA = hVarD.a();
            } else if (value instanceof Float) {
                g4.h hVarD2 = j.D();
                float fFloatValue = ((Number) value).floatValue();
                hVarD2.c();
                j.r((j) hVarD2.f1378d, fFloatValue);
                a0VarA = hVarD2.a();
            } else if (value instanceof Double) {
                g4.h hVarD3 = j.D();
                double dDoubleValue = ((Number) value).doubleValue();
                hVarD3.c();
                j.o((j) hVarD3.f1378d, dDoubleValue);
                a0VarA = hVarD3.a();
            } else if (value instanceof Integer) {
                g4.h hVarD4 = j.D();
                int iIntValue = ((Number) value).intValue();
                hVarD4.c();
                j.s((j) hVarD4.f1378d, iIntValue);
                a0VarA = hVarD4.a();
            } else if (value instanceof Long) {
                g4.h hVarD5 = j.D();
                long jLongValue = ((Number) value).longValue();
                hVarD5.c();
                j.l((j) hVarD5.f1378d, jLongValue);
                a0VarA = hVarD5.a();
            } else if (value instanceof String) {
                g4.h hVarD6 = j.D();
                hVarD6.c();
                j.m((j) hVarD6.f1378d, (String) value);
                a0VarA = hVarD6.a();
            } else if (value instanceof Set) {
                g4.h hVarD7 = j.D();
                g4.f fVarO = g4.g.o();
                fVarO.c();
                g4.g.l((g4.g) fVarO.f1378d, (Set) value);
                hVarD7.c();
                j.n((j) hVarD7.f1378d, (g4.g) fVarO.a());
                a0VarA = hVarD7.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                g4.h hVarD8 = j.D();
                byte[] bArr = (byte[]) value;
                androidx.datastore.preferences.protobuf.g gVarC = androidx.datastore.preferences.protobuf.g.c(bArr, 0, bArr.length);
                hVarD8.c();
                j.p((j) hVarD8.f1378d, gVarC);
                a0VarA = hVarD8.a();
            }
            cVarN.getClass();
            str.getClass();
            cVarN.c();
            g4.e.l((g4.e) cVarN.f1378d).put(str, (j) a0VarA);
        }
        g4.e eVar2 = (g4.e) cVarN.a();
        int iA = eVar2.a(null);
        Logger logger = androidx.datastore.preferences.protobuf.n.f1320f;
        if (iA > 4096) {
            iA = 4096;
        }
        androidx.datastore.preferences.protobuf.n nVar = new androidx.datastore.preferences.protobuf.n(h1Var, iA);
        eVar2.b(nVar);
        if (nVar.f1325d > 0) {
            nVar.Y();
        }
    }
}
