package f8;

import android.webkit.MimeTypeMap;
import cv.w;
import cv.z;
import ir.f0;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import l8.n;
import ou.a0;
import ou.v;
import tt.s;

/* loaded from: classes.dex */
public final class l implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final ou.h f8694f = new ou.h(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* renamed from: g, reason: collision with root package name */
    public static final ou.h f8695g = new ou.h(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);

    /* renamed from: a, reason: collision with root package name */
    public final String f8696a;

    /* renamed from: b, reason: collision with root package name */
    public final n f8697b;

    /* renamed from: c, reason: collision with root package name */
    public final lq.h f8698c;

    /* renamed from: d, reason: collision with root package name */
    public final lq.h f8699d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8700e;

    public l(String str, n nVar, lq.h hVar, lq.h hVar2, boolean z10) {
        this.f8696a = str;
        this.f8697b = nVar;
        this.f8698c = hVar;
        this.f8699d = hVar2;
        this.f8700e = z10;
    }

    public static String d(String str, v vVar) {
        String strB;
        String str2 = vVar != null ? vVar.f19978a : null;
        if ((str2 == null || s.n0(str2, "text/plain", false)) && (strB = q8.i.b(MimeTypeMap.getSingleton(), str)) != null) {
            return strB;
        }
        if (str2 != null) {
            return tt.l.U0(str2, ';');
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0215 A[Catch: Exception -> 0x018f, TryCatch #0 {Exception -> 0x018f, blocks: (B:92:0x01e1, B:94:0x01e7, B:96:0x020c, B:98:0x0211, B:97:0x020f, B:100:0x0215, B:101:0x021a, B:68:0x015f, B:71:0x016b, B:73:0x0177, B:75:0x0185, B:79:0x0191, B:81:0x019d, B:83:0x01bd, B:85:0x01c2, B:84:0x01c0, B:87:0x01c6), top: B:109:0x015f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[Catch: Exception -> 0x00d1, TRY_ENTER, TryCatch #3 {Exception -> 0x00d1, blocks: (B:102:0x021b, B:103:0x021e, B:66:0x0157, B:104:0x021f, B:105:0x0224, B:36:0x0095, B:38:0x00a1, B:47:0x00d5, B:49:0x00d9, B:52:0x00f2, B:62:0x013e, B:54:0x010a, B:56:0x0116, B:57:0x011f, B:41:0x00b7, B:43:0x00c1, B:59:0x0129, B:60:0x0130, B:61:0x0131), top: B:114:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0131 A[Catch: Exception -> 0x00d1, TryCatch #3 {Exception -> 0x00d1, blocks: (B:102:0x021b, B:103:0x021e, B:66:0x0157, B:104:0x021f, B:105:0x0224, B:36:0x0095, B:38:0x00a1, B:47:0x00d5, B:49:0x00d9, B:52:0x00f2, B:62:0x013e, B:54:0x010a, B:56:0x0116, B:57:0x011f, B:41:0x00b7, B:43:0x00c1, B:59:0x0129, B:60:0x0130, B:61:0x0131), top: B:114:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e7 A[Catch: Exception -> 0x018f, TryCatch #0 {Exception -> 0x018f, blocks: (B:92:0x01e1, B:94:0x01e7, B:96:0x020c, B:98:0x0211, B:97:0x020f, B:100:0x0215, B:101:0x021a, B:68:0x015f, B:71:0x016b, B:73:0x0177, B:75:0x0185, B:79:0x0191, B:81:0x019d, B:83:0x01bd, B:85:0x01c2, B:84:0x01c0, B:87:0x01c6), top: B:109:0x015f }] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, lq.h] */
    @Override // f8.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(pq.c r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.l.a(pq.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(ou.a0 r8, rq.c r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.l.b(ou.a0, rq.c):java.lang.Object");
    }

    public final cv.l c() {
        Object value = this.f8699d.getValue();
        br.l.b(value);
        return ((d8.h) value).f7175a;
    }

    public final a0 e() {
        cj.a aVar = new cj.a();
        aVar.N(this.f8696a);
        n nVar = this.f8697b;
        ou.s sVar = nVar.j;
        l8.b bVar = nVar.f14959n;
        br.l.e(sVar, "headers");
        aVar.f3976r = sVar.c();
        for (Map.Entry entry : nVar.k.f14971a.entrySet()) {
            Object key = entry.getKey();
            br.l.c(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            Class cls = (Class) key;
            Object value = entry.getValue();
            if (value == null) {
                ((LinkedHashMap) aVar.f3978y).remove(cls);
            } else {
                if (((LinkedHashMap) aVar.f3978y).isEmpty()) {
                    aVar.f3978y = new LinkedHashMap();
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) aVar.f3978y;
                Object objCast = cls.cast(value);
                br.l.b(objCast);
                linkedHashMap.put(cls, objCast);
            }
        }
        boolean readEnabled = bVar.getReadEnabled();
        boolean readEnabled2 = nVar.f14960o.getReadEnabled();
        if (!readEnabled2 && readEnabled) {
            aVar.s(ou.h.f19909o);
        } else if (!readEnabled2 || readEnabled) {
            if (!readEnabled2 && !readEnabled) {
                aVar.s(f8695g);
            }
        } else if (bVar.getWriteEnabled()) {
            aVar.s(ou.h.f19908n);
        } else {
            aVar.s(f8694f);
        }
        return aVar.r();
    }

    public final k8.b f(b9.a aVar) throws Throwable {
        Throwable th2;
        k8.b bVar;
        try {
            cv.l lVarC = c();
            d8.c cVar = (d8.c) aVar.f2476d;
            if (cVar.f7161d) {
                throw new IllegalStateException("snapshot is closed");
            }
            z zVarE = a.a.e(lVarC.l((w) cVar.f7160a.f7153c.get(0)));
            try {
                bVar = new k8.b(zVarE);
                try {
                    zVarE.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                try {
                    zVarE.close();
                } catch (Throwable th5) {
                    f0.c(th4, th5);
                }
                th2 = th4;
                bVar = null;
            }
            if (th2 == null) {
                return bVar;
            }
            throw th2;
        } catch (IOException unused) {
            return null;
        }
    }

    public final c8.s g(b9.a aVar) {
        d8.c cVar = (d8.c) aVar.f2476d;
        if (cVar.f7161d) {
            throw new IllegalStateException("snapshot is closed");
        }
        w wVar = (w) cVar.f7160a.f7153c.get(1);
        cv.l lVarC = c();
        String str = this.f8697b.f14956i;
        if (str == null) {
            str = this.f8696a;
        }
        return new c8.s(wVar, lVarC, str, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final b9.a h(b9.a r4, ou.a0 r5, ou.c0 r6, k8.b r7) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.l.h(b9.a, ou.a0, ou.c0, k8.b):b9.a");
    }
}
