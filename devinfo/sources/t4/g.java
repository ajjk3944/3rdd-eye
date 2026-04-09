package t4;

import ac.m;
import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.y;
import com.google.android.gms.internal.play_billing.m1;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import nk.k;
import p4.w0;
import zj.n;
import zj.w;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g f34170a = new g();

    @Override // p4.w0
    public final Object a() {
        return new b(true);
    }

    @Override // p4.w0
    public final Object b(FileInputStream fileInputStream) throws p4.b {
        byte[] bArr;
        try {
            s4.c cVarO = s4.c.o(fileInputStream);
            b bVar = new b(false);
            e[] eVarArr = (e[]) Arrays.copyOf(new e[0], 0);
            k.e(eVarArr, "pairs");
            bVar.b();
            if (eVarArr.length > 0) {
                e eVar = eVarArr[0];
                throw null;
            }
            Map mapM = cVarO.m();
            k.d(mapM, "preferencesProto.preferencesMap");
            for (Map.Entry entry : mapM.entrySet()) {
                String str = (String) entry.getKey();
                s4.g gVar = (s4.g) entry.getValue();
                k.d(str, "name");
                k.d(gVar, "value");
                int iC = gVar.C();
                switch (iC == 0 ? -1 : f.f34169a[i3.e.c(iC)]) {
                    case -1:
                        throw new p4.b("Value case is null.", null);
                    case 0:
                    default:
                        throw new m();
                    case 1:
                        bVar.e(new d(str), Boolean.valueOf(gVar.t()));
                        break;
                    case 2:
                        bVar.e(new d(str), Float.valueOf(gVar.x()));
                        break;
                    case 3:
                        bVar.e(new d(str), Double.valueOf(gVar.w()));
                        break;
                    case 4:
                        bVar.e(new d(str), Integer.valueOf(gVar.y()));
                        break;
                    case 5:
                        bVar.e(new d(str), Long.valueOf(gVar.z()));
                        break;
                    case 6:
                        d dVar = new d(str);
                        String strA = gVar.A();
                        k.d(strA, "value.string");
                        bVar.e(dVar, strA);
                        break;
                    case 7:
                        d dVarD = m1.D(str);
                        x xVarN = gVar.B().n();
                        k.d(xVarN, "value.stringSet.stringsList");
                        bVar.e(dVarD, n.v0(xVarN));
                        break;
                    case 8:
                        d dVar2 = new d(str);
                        androidx.datastore.preferences.protobuf.g gVarU = gVar.u();
                        int size = gVarU.size();
                        if (size == 0) {
                            bArr = y.f1082b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            gVarU.f(size, bArr2);
                            bArr = bArr2;
                        }
                        k.d(bArr, "value.bytes.toByteArray()");
                        bVar.e(dVar2, bArr);
                        break;
                    case 9:
                        throw new p4.b("Value not set.", null);
                }
            }
            return new b(w.M(bVar.a()), true);
        } catch (a0 e2) {
            throw new p4.b("Unable to parse preferences proto.", e2);
        }
    }

    @Override // p4.w0
    public final void c(Object obj, hm.d dVar) throws IOException {
        androidx.datastore.preferences.protobuf.w wVarA;
        Map mapA = ((b) obj).a();
        s4.a aVarN = s4.c.n();
        for (Map.Entry entry : mapA.entrySet()) {
            d dVar2 = (d) entry.getKey();
            Object value = entry.getValue();
            String str = dVar2.f34168a;
            if (value instanceof Boolean) {
                s4.f fVarD = s4.g.D();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                fVarD.d();
                s4.g.q((s4.g) fVarD.f1070b, zBooleanValue);
                wVarA = fVarD.a();
            } else if (value instanceof Float) {
                s4.f fVarD2 = s4.g.D();
                float fFloatValue = ((Number) value).floatValue();
                fVarD2.d();
                s4.g.r((s4.g) fVarD2.f1070b, fFloatValue);
                wVarA = fVarD2.a();
            } else if (value instanceof Double) {
                s4.f fVarD3 = s4.g.D();
                double dDoubleValue = ((Number) value).doubleValue();
                fVarD3.d();
                s4.g.o((s4.g) fVarD3.f1070b, dDoubleValue);
                wVarA = fVarD3.a();
            } else if (value instanceof Integer) {
                s4.f fVarD4 = s4.g.D();
                int iIntValue = ((Number) value).intValue();
                fVarD4.d();
                s4.g.s((s4.g) fVarD4.f1070b, iIntValue);
                wVarA = fVarD4.a();
            } else if (value instanceof Long) {
                s4.f fVarD5 = s4.g.D();
                long jLongValue = ((Number) value).longValue();
                fVarD5.d();
                s4.g.l((s4.g) fVarD5.f1070b, jLongValue);
                wVarA = fVarD5.a();
            } else if (value instanceof String) {
                s4.f fVarD6 = s4.g.D();
                fVarD6.d();
                s4.g.m((s4.g) fVarD6.f1070b, (String) value);
                wVarA = fVarD6.a();
            } else if (value instanceof Set) {
                s4.f fVarD7 = s4.g.D();
                s4.d dVarO = s4.e.o();
                dVarO.d();
                s4.e.l((s4.e) dVarO.f1070b, (Set) value);
                fVarD7.d();
                s4.g.n((s4.g) fVarD7.f1070b, (s4.e) dVarO.a());
                wVarA = fVarD7.a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                s4.f fVarD8 = s4.g.D();
                byte[] bArr = (byte[]) value;
                androidx.datastore.preferences.protobuf.g gVarD = androidx.datastore.preferences.protobuf.g.d(0, bArr.length, bArr);
                fVarD8.d();
                s4.g.p((s4.g) fVarD8.f1070b, gVarD);
                wVarA = fVarD8.a();
            }
            aVarN.getClass();
            str.getClass();
            aVarN.d();
            s4.c.l((s4.c) aVarN.f1070b).put(str, (s4.g) wVarA);
        }
        s4.c cVar = (s4.c) aVarN.a();
        int iA = cVar.a(null);
        Logger logger = androidx.datastore.preferences.protobuf.m.f1013o;
        if (iA > 4096) {
            iA = 4096;
        }
        androidx.datastore.preferences.protobuf.m mVar = new androidx.datastore.preferences.protobuf.m(dVar, iA);
        cVar.b(mVar);
        if (mVar.f1017m > 0) {
            mVar.O();
        }
    }
}
