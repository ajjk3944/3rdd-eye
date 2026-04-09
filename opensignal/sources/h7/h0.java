package h7;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import coil.memory.MemoryCache$Key;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.i4;
import h9.r2;
import io.sentry.m2;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class h0 implements y1, o.x, o.k, o5.y0, j8.f, js.o, mh.k, wn.a {

    /* renamed from: a, reason: collision with root package name */
    public Object f10078a;

    public /* synthetic */ h0(Object obj) {
        this.f10078a = obj;
    }

    public static String B() {
        String languageTag = Locale.getDefault().toLanguageTag();
        br.l.d(languageTag, "toLanguageTag(...)");
        return languageTag;
    }

    public static io.sentry.protocol.s E(Throwable th2, io.sentry.protocol.k kVar, Long l10, List list, boolean z10) {
        Package r02 = th2.getClass().getPackage();
        String name = th2.getClass().getName();
        io.sentry.protocol.s sVar = new io.sentry.protocol.s();
        String message = th2.getMessage();
        if (r02 != null) {
            name = name.replace(r02.getName() + ".", "");
        }
        String name2 = r02 != null ? r02.getName() : null;
        if (list != null && !list.isEmpty()) {
            io.sentry.protocol.y yVar = new io.sentry.protocol.y(list);
            if (z10) {
                yVar.f12659g = Boolean.TRUE;
            }
            sVar.f12634x = yVar;
        }
        sVar.f12633r = l10;
        sVar.f12630a = name;
        sVar.f12635y = kVar;
        sVar.f12632g = name2;
        sVar.f12631d = message;
        return sVar;
    }

    public static boolean H(String str) {
        String upperCase = str.toUpperCase();
        br.l.d(upperCase, "toUpperCase(...)");
        byte[] bytes = upperCase.getBytes(tt.a.f22975a);
        br.l.d(bytes, "getBytes(...)");
        for (byte b2 : bytes) {
            if (b2 < 65 || b2 > 90) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x040a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a1  */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList T(h7.h0 r38, java.lang.String r39) {
        /*
            Method dump skipped, instructions count: 1742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.h0.T(h7.h0, java.lang.String):java.util.ArrayList");
    }

    @Override // o.k
    public void A(o.m mVar) {
        i.h0 h0Var = (i.h0) this.f10078a;
        Window.Callback callback = h0Var.f11055d;
        if (h0Var.f11054c.f20152a.o()) {
            callback.onPanelClosed(108, mVar);
        } else if (callback.onPreparePanel(0, null, mVar)) {
            callback.onMenuOpened(108, mVar);
        }
    }

    public i5.d C() {
        return (i5.d) this.f10078a;
    }

    public UUID D() {
        return androidx.media3.common.j.f1701a;
    }

    public int F() {
        return 1;
    }

    public void G(float f10, float f11, float f12, float f13) {
        bm.d dVar = (bm.d) this.f10078a;
        g1.p pVarY = dVar.y();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.H() >> 32)) - (f12 + f10);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.H() & 4294967295L)) - (f13 + f11)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (!(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) >= 0.0f && Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) >= 0.0f)) {
            g1.y.a("Width and height must be greater than or equal to zero");
        }
        dVar.R(jFloatToRawIntBits);
        pVarY.m(f10, f11);
    }

    public void I(int i10, int i11) {
        int i12;
        int i13;
        RecyclerView recyclerView = (RecyclerView) this.f10078a;
        int iB = recyclerView.f2085y.B();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < iB; i15++) {
            View viewA = recyclerView.f2085y.A(i15);
            n1 n1VarM = RecyclerView.M(viewA);
            if (n1VarM != null && !n1VarM.o() && (i13 = n1VarM.f10157c) >= i10 && i13 < i14) {
                n1VarM.a(2);
                n1VarM.a(1024);
                ((z0) viewA.getLayoutParams()).f10294c = true;
            }
        }
        f1 f1Var = recyclerView.f2064g;
        ArrayList arrayList = f1Var.f10060c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            n1 n1Var = (n1) arrayList.get(size);
            if (n1Var != null && (i12 = n1Var.f10157c) >= i10 && i12 < i14) {
                n1Var.a(2);
                f1Var.h(size);
            }
        }
        recyclerView.H0 = true;
    }

    public void J(int i10, int i11) {
        RecyclerView recyclerView = (RecyclerView) this.f10078a;
        int iB = recyclerView.f2085y.B();
        for (int i12 = 0; i12 < iB; i12++) {
            n1 n1VarM = RecyclerView.M(recyclerView.f2085y.A(i12));
            if (n1VarM != null && !n1VarM.o() && n1VarM.f10157c >= i10) {
                if (RecyclerView.X0) {
                    n1VarM.toString();
                }
                n1VarM.l(i11, false);
                recyclerView.D0.f10106f = true;
            }
        }
        ArrayList arrayList = recyclerView.f2064g.f10060c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            n1 n1Var = (n1) arrayList.get(i13);
            if (n1Var != null && n1Var.f10157c >= i10) {
                if (RecyclerView.X0) {
                    n1Var.toString();
                }
                n1Var.l(i11, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.G0 = true;
    }

    @Override // js.o
    public js.o K(qs.b bVar, qs.g gVar) {
        return null;
    }

    @Override // mh.k
    public void L(mh.m mVar) {
        long[] jArr;
        String str;
        Integer numValueOf;
        Integer numValueOf2;
        String str2;
        String string;
        String str3;
        int i10;
        int i11;
        Long lValueOf;
        String string2;
        LinkedHashMap linkedHashMap;
        int i12;
        int i13;
        ch.n.b("UdpVerificationJob", "onStop() called with: udpTestResult = " + mVar);
        mi.z zVar = (mi.z) this.f10078a;
        r2 r2Var = zVar.S;
        LinkedHashMap linkedHashMap2 = zVar.f16830g0;
        LinkedHashMap linkedHashMap3 = zVar.f16831h0;
        LinkedHashMap linkedHashMap4 = zVar.f16832i0;
        ArrayList arrayList = zVar.f16828e0;
        ArrayList arrayList2 = zVar.f16827d0;
        br.l.e(linkedHashMap2, "payloadsSent");
        br.l.e(linkedHashMap3, "payloadsReceived");
        br.l.e(linkedHashMap4, "responseAgesInNanosMapping");
        ArrayList arrayList3 = zVar.f16829f0;
        arrayList3.clear();
        ak.g1 g1Var = zVar.W;
        String str4 = "udpConfigItem";
        if (g1Var == null) {
            br.l.l("udpConfigItem");
            throw null;
        }
        int i14 = g1Var.f533c;
        int i15 = 0;
        while (true) {
            String str5 = str4;
            if (i15 >= i14) {
                int i16 = 1;
                zVar.t("RESPONSE_STATES", new fh.d[]{new fh.d(arrayList2.toString(), "CUSTOM")});
                zVar.t("PAYLOAD_STATES", new fh.d[]{new fh.d(arrayList.toString(), "CUSTOM")});
                ak.g1 g1Var2 = zVar.W;
                if (g1Var2 == null) {
                    br.l.l(str5);
                    throw null;
                }
                hr.d dVarT = vc.e.T(0, g1Var2.f533c);
                ArrayList arrayList4 = new ArrayList(mq.p.a0(dVarT, 10));
                Iterator it = dVarT.iterator();
                while (true) {
                    hr.c cVar = (hr.c) it;
                    long millis = -1;
                    if (!cVar.f10868g) {
                        break;
                    }
                    Long l10 = (Long) linkedHashMap4.get(Integer.valueOf(cVar.nextInt()));
                    if (l10 != null) {
                        millis = TimeUnit.NANOSECONDS.toMillis(l10.longValue());
                    }
                    arrayList4.add(Long.valueOf(millis));
                }
                if (arrayList4.isEmpty()) {
                    arrayList4 = null;
                } else {
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        if (((Number) it2.next()).longValue() != -1) {
                            break;
                        }
                    }
                    arrayList4 = null;
                }
                if (arrayList4 != null) {
                    zVar.t("RESPONSE_AGES", new fh.d[]{new fh.d(arrayList4.toString(), "CUSTOM")});
                }
                long[] jArr2 = mVar.f16777i;
                long jG = zVar.g();
                long j = zVar.f23926y;
                String str6 = zVar.Z;
                String str7 = zVar.f23922d;
                String str8 = zVar.D;
                zVar.Q.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                String str9 = mVar.f16769a;
                long[] jArr3 = mVar.f16776h;
                if (jArr3 != null) {
                    str = str7;
                    int length = jArr3.length;
                    jArr = jArr3;
                    int i17 = 0;
                    for (int i18 = 0; i18 < length; i18++) {
                        if (jArr[i18] != -1) {
                            i17++;
                        }
                    }
                    numValueOf = Integer.valueOf(i17);
                } else {
                    jArr = jArr3;
                    str = str7;
                    numValueOf = null;
                }
                if (jArr2 != null) {
                    int i19 = 0;
                    for (long j7 : jArr2) {
                        if (j7 != -1) {
                            i19++;
                        }
                    }
                    numValueOf2 = Integer.valueOf(i19);
                } else {
                    numValueOf2 = null;
                }
                int i20 = zVar.f16825b0;
                long j10 = zVar.f16826c0;
                long jLongValue = 0;
                Long lValueOf2 = j10 == 0 ? null : Long.valueOf(j10);
                if (jArr != null) {
                    String string3 = Arrays.toString(jArr);
                    br.l.d(string3, "toString(...)");
                    str2 = string3;
                } else {
                    str2 = null;
                }
                if (jArr2 != null) {
                    if (jArr2.length == 0) {
                        string = Arrays.toString(jArr2);
                        br.l.d(string, "toString(...)");
                    } else {
                        for (long j11 : jArr2) {
                            if (j11 != -1) {
                                string = Arrays.toString(jArr2);
                                br.l.d(string, "toString(...)");
                            }
                        }
                        str3 = null;
                    }
                    str3 = string;
                    break;
                } else {
                    str3 = null;
                }
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    i10 = 0;
                    while (it3.hasNext()) {
                        int iIntValue = ((Number) it3.next()).intValue();
                        Iterator it4 = it3;
                        int i21 = i16;
                        if (iIntValue == i21) {
                            i10++;
                            if (i10 < 0) {
                                e5.P();
                                throw null;
                            }
                            it3 = it4;
                            i16 = 1;
                        } else {
                            i16 = i21;
                            it3 = it4;
                        }
                    }
                } else {
                    i10 = 0;
                }
                ak.g1 g1Var3 = zVar.W;
                if (g1Var3 == null) {
                    br.l.l(str5);
                    throw null;
                }
                boolean z10 = i10 == g1Var3.f533c;
                if (arrayList2 == null || !arrayList2.isEmpty()) {
                    Iterator it5 = arrayList2.iterator();
                    i11 = 0;
                    while (it5.hasNext()) {
                        boolean z11 = z10;
                        if (((Number) it5.next()).intValue() == 1 && (i11 = i11 + 1) < 0) {
                            e5.P();
                            throw null;
                        }
                        z10 = z11;
                    }
                } else {
                    i11 = 0;
                }
                boolean z12 = z10;
                boolean z13 = i11 > 0;
                br.l.e(linkedHashMap4, "responseAgesInNanosMapping");
                ArrayList arrayListP0 = mq.o.p0(linkedHashMap4.values());
                if (arrayListP0.isEmpty()) {
                    lValueOf = null;
                } else {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    Iterator it6 = arrayListP0.iterator();
                    while (it6.hasNext()) {
                        jLongValue = ((Number) it6.next()).longValue() + jLongValue;
                    }
                    lValueOf = Long.valueOf(timeUnit.toMillis(jLongValue / arrayListP0.size()));
                }
                br.l.e(arrayList3, "rawResponses");
                if (arrayList3.isEmpty()) {
                    string2 = null;
                } else {
                    Iterator it7 = arrayList3.iterator();
                    while (it7.hasNext()) {
                        String str10 = (String) it7.next();
                        if (str10.length() != 0 && !str10.equals("-1")) {
                            string2 = new JSONArray((Collection) arrayList3).toString();
                            break;
                        }
                    }
                    string2 = null;
                }
                String strN = zVar.n();
                br.l.b(str9);
                zVar.f16833j0 = new ni.b1(jG, j, str, str6, str8, jCurrentTimeMillis, str9, numValueOf, numValueOf2, Integer.valueOf(i20), strN, lValueOf2, str2, str3, Boolean.valueOf(z12), Boolean.valueOf(z13), lValueOf, string2);
                r2Var.m1(zVar.f23926y, mVar.f16775g);
                r2Var.n1(zVar.f23926y, mVar.f16774f);
                ch.n.b("UdpVerificationJob", "Mapped Result: " + zVar.f16833j0);
                return;
            }
            mh.c cVar2 = (mh.c) linkedHashMap2.get(Integer.valueOf(i15));
            LinkedHashMap linkedHashMap5 = linkedHashMap2;
            mh.c cVar3 = (mh.c) linkedHashMap3.get(Integer.valueOf(i15));
            if (cVar2 == null || cVar3 == null) {
                linkedHashMap = linkedHashMap3;
                i12 = i14;
                arrayList.add(-1);
                arrayList2.add(-1);
                arrayList3.add("-1");
            } else {
                byte[] bArr = cVar3.k;
                linkedHashMap = linkedHashMap3;
                jk.c cVar4 = zVar.T;
                byte[] bArr2 = cVar2.j;
                i12 = i14;
                br.l.d(bArr2, "getSecurityToken(...)");
                byte[] bArr3 = cVar3.j;
                br.l.d(bArr3, "getSecurityToken(...)");
                boolean zA = cVar4.a(bArr2, bArr3, null);
                if (zVar.Y == null) {
                    br.l.l("udpResponseValidator");
                    throw null;
                }
                br.l.d(bArr, "getServerVerificationResponseBytes(...)");
                if (bArr.length == 8) {
                    for (byte b2 : bArr) {
                        if (b2 != 0) {
                            i13 = 1;
                            break;
                        }
                    }
                    i13 = 0;
                    if (zA && i13 != 0) {
                        zVar.f16825b0++;
                    }
                    arrayList2.add(Integer.valueOf(i13));
                    arrayList.add(Integer.valueOf(zA ? 1 : 0));
                    arrayList3.add(mq.l.t0(bArr, "", mi.a0.f16778d, 30));
                } else {
                    i13 = 0;
                    if (zA) {
                        zVar.f16825b0++;
                    }
                    arrayList2.add(Integer.valueOf(i13));
                    arrayList.add(Integer.valueOf(zA ? 1 : 0));
                    arrayList3.add(mq.l.t0(bArr, "", mi.a0.f16778d, 30));
                }
            }
            i15++;
            str4 = str5;
            linkedHashMap2 = linkedHashMap5;
            linkedHashMap3 = linkedHashMap;
            i14 = i12;
        }
    }

    public void N(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = (RecyclerView) this.f10078a;
        int iB = recyclerView.f2085y.B();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < iB; i20++) {
            n1 n1VarM = RecyclerView.M(recyclerView.f2085y.A(i20));
            if (n1VarM != null && (i18 = n1VarM.f10157c) >= i13 && i18 <= i12) {
                if (RecyclerView.X0) {
                    n1VarM.toString();
                }
                if (n1VarM.f10157c == i10) {
                    n1VarM.l(i11 - i10, false);
                } else {
                    n1VarM.l(i14, false);
                }
                recyclerView.D0.f10106f = true;
            }
        }
        ArrayList arrayList = recyclerView.f2064g.f10060c;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            n1 n1Var = (n1) arrayList.get(i21);
            if (n1Var != null && (i17 = n1Var.f10157c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    n1Var.l(i11 - i10, false);
                } else {
                    n1Var.l(i19, false);
                }
                if (RecyclerView.X0) {
                    n1Var.toString();
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.G0 = true;
    }

    public void O(jc.c cVar) {
        jc.a aVar = (jc.a) this.f10078a;
        aVar.f13586a = cVar;
        Iterator it = aVar.f13588c.iterator();
        while (it.hasNext()) {
            ((jc.j) it.next()).b();
        }
        aVar.f13588c.clear();
        aVar.f13587b = null;
    }

    @Override // js.o
    public js.p P(qs.g gVar) {
        if ("b".equals(gVar.b())) {
            return new ks.e(this, 2);
        }
        return null;
    }

    @Override // o.x
    public boolean Q(o.m mVar) {
        Window.Callback callback = ((i.a0) this.f10078a).H.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, mVar);
        return true;
    }

    public void R() {
        j5.m mVar = (j5.m) this.f10078a;
        int i10 = mVar.O - 1;
        mVar.O = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (j5.s sVar : mVar.Q) {
            sVar.b();
            i11 += sVar.f13322e0.f18958a;
        }
        androidx.media3.common.b1[] b1VarArr = new androidx.media3.common.b1[i11];
        int i12 = 0;
        for (j5.s sVar2 : mVar.Q) {
            sVar2.b();
            int i13 = sVar2.f13322e0.f18958a;
            int i14 = 0;
            while (i14 < i13) {
                sVar2.b();
                b1VarArr[i12] = sVar2.f13322e0.a(i14);
                i14++;
                i12++;
            }
        }
        mVar.P = new o5.h1(b1VarArr);
        mVar.N.j(mVar);
    }

    public void S(al.b bVar, Thread thread, Throwable th2) {
        dd.r rVarF;
        hf.l lVar = (hf.l) this.f10078a;
        synchronized (lVar) {
            Objects.toString(th2);
            thread.getName();
            Log.isLoggable("FirebaseCrashlytics", 3);
            a.a.w();
            long jCurrentTimeMillis = System.currentTimeMillis();
            jf.b bVar2 = lVar.f10671e.f13707a;
            hf.j jVar = new hf.j(lVar, jCurrentTimeMillis, th2, thread, bVar);
            synchronized (bVar2.f13704d) {
                rVarF = bVar2.f13705g.f(bVar2.f13703a, new io.sentry.android.replay.capture.e(8, jVar));
                bVar2.f13705g = rVarF;
            }
            try {
                try {
                    hf.a0.a(rVarF);
                } catch (Exception e4) {
                    io.sentry.android.core.e0.c("FirebaseCrashlytics", "Error handling uncaught exception", e4);
                }
            } catch (TimeoutException unused) {
                io.sentry.android.core.e0.c("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            }
        }
    }

    public void V(float f10, float f11, long j) {
        g1.p pVarY = ((bm.d) this.f10078a).y();
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        pVarY.m(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
        pVarY.a(f10, f11);
        pVarY.m(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
    }

    public void W(float f10, float f11) {
        ((bm.d) this.f10078a).y().m(f10, f11);
    }

    @Override // mh.k
    public void a() {
        ch.n.b("UdpVerificationJob", "Start UDP verification test");
    }

    @Override // o.x
    public void c(o.m mVar, boolean z10) {
        ((i.a0) this.f10078a).p(mVar);
    }

    @Override // h7.y1
    public int d(View view) {
        return (view.getTop() - ((z0) view.getLayoutParams()).f10293b.top) - ((ViewGroup.MarginLayoutParams) ((z0) view.getLayoutParams())).topMargin;
    }

    @Override // h7.y1
    public int e() {
        return ((y0) this.f10078a).G();
    }

    @Override // mh.k
    public void f(mh.c cVar) {
        mi.z zVar = (mi.z) this.f10078a;
        if (cVar == null) {
            ch.n.g("UdpVerificationJob", "Send progress payload is null");
            return;
        }
        zVar.f16830g0.put(Integer.valueOf(cVar.f16713d), cVar);
        if (zVar.B) {
            ni.a1 a1VarU = mi.z.u(zVar, true, cVar);
            hk.h hVar = zVar.E;
            if (hVar != null) {
                hVar.f(zVar.Z, a1VarU);
            }
        }
    }

    @Override // mh.k
    public void g(mh.c cVar) {
        Long lValueOf;
        mi.z zVar = (mi.z) this.f10078a;
        if (cVar == null) {
            ch.n.g("UdpVerificationJob", "Receive progress payload is null");
            return;
        }
        zVar.f16831h0.put(Integer.valueOf(cVar.f16713d), cVar);
        long j = cVar.f16719l;
        zVar.f16826c0 = j;
        if (j != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            zVar.Q.getClass();
            lValueOf = Long.valueOf(timeUnit.toNanos(System.currentTimeMillis()) - zVar.f16826c0);
        } else {
            lValueOf = null;
        }
        zVar.f16832i0.put(Integer.valueOf(cVar.f16713d), lValueOf);
        if (zVar.B) {
            ni.a1 a1VarU = mi.z.u(zVar, false, cVar);
            hk.h hVar = zVar.E;
            if (hVar != null) {
                hVar.f(zVar.Z, a1VarU);
            }
        }
    }

    @Override // h7.y1
    public int h() {
        y0 y0Var = (y0) this.f10078a;
        return y0Var.f10285o - y0Var.D();
    }

    @Override // j8.f
    public void i(MemoryCache$Key memoryCache$Key, Bitmap bitmap, Map map) {
        ((ag.b) this.f10078a).s(memoryCache$Key, bitmap, map, i4.r(bitmap));
    }

    @Override // h7.y1
    public View k(int i10) {
        return ((y0) this.f10078a).u(i10);
    }

    @Override // h7.y1
    public int m(View view) {
        return view.getBottom() + ((z0) view.getLayoutParams()).f10293b.bottom + ((ViewGroup.MarginLayoutParams) ((z0) view.getLayoutParams())).bottomMargin;
    }

    @Override // o.k
    public boolean n(o.m mVar, MenuItem menuItem) {
        return false;
    }

    public void p(io.sentry.android.core.j0 j0Var) {
        ((io.sentry.android.core.f0) this.f10078a).getClass();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26 || i10 > 28) {
            return;
        }
        String callingPackage = j0Var.getCallingPackage();
        String packageName = j0Var.getContext().getPackageName();
        if (callingPackage == null || !callingPackage.equals(packageName)) {
            throw new SecurityException("Provider does not allow for granting of Uri permissions");
        }
    }

    @Override // o5.y0
    public void r(o5.z0 z0Var) {
        j5.m mVar = (j5.m) this.f10078a;
        mVar.N.r(mVar);
    }

    public void s(a aVar) {
        RecyclerView recyclerView = (RecyclerView) this.f10078a;
        int i10 = aVar.f9994a;
        if (i10 == 1) {
            recyclerView.J.Y(aVar.f9995b, aVar.f9996c);
            return;
        }
        if (i10 == 2) {
            recyclerView.J.b0(aVar.f9995b, aVar.f9996c);
        } else if (i10 == 4) {
            recyclerView.J.c0(aVar.f9995b, aVar.f9996c);
        } else {
            if (i10 != 8) {
                return;
            }
            recyclerView.J.a0(aVar.f9995b, aVar.f9996c);
        }
    }

    @Override // j8.f
    public j8.a t(MemoryCache$Key memoryCache$Key) {
        return null;
    }

    public void u(Throwable th2, AtomicInteger atomicInteger, HashSet hashSet, ArrayDeque arrayDeque, String str) {
        Thread threadCurrentThread;
        io.sentry.protocol.k kVar;
        boolean z10;
        int iIncrementAndGet = atomicInteger.get();
        while (th2 != null && hashSet.add(th2)) {
            if (str == null) {
                str = "chained";
            }
            if (th2 instanceof io.sentry.exception.a) {
                io.sentry.exception.a aVar = (io.sentry.exception.a) th2;
                io.sentry.protocol.k kVar2 = aVar.f12241a;
                Throwable th3 = aVar.f12242d;
                threadCurrentThread = aVar.f12243g;
                z10 = aVar.f12244r;
                th2 = th3;
                kVar = kVar2;
            } else {
                io.sentry.protocol.k kVar3 = new io.sentry.protocol.k();
                threadCurrentThread = Thread.currentThread();
                kVar = kVar3;
                z10 = false;
            }
            arrayDeque.addFirst(E(th2, kVar, Long.valueOf(threadCurrentThread.getId()), ((i.g0) this.f10078a).z(th2.getStackTrace(), Boolean.FALSE.equals(kVar.f12583r)), z10));
            if (kVar.f12580a == null) {
                kVar.f12580a = str;
            }
            if (atomicInteger.get() >= 0) {
                kVar.E = Integer.valueOf(iIncrementAndGet);
            }
            iIncrementAndGet = atomicInteger.incrementAndGet();
            kVar.D = Integer.valueOf(iIncrementAndGet);
            Throwable[] suppressed = th2.getSuppressed();
            if (suppressed != null && suppressed.length > 0) {
                for (Throwable th4 : suppressed) {
                    u(th4, atomicInteger, hashSet, arrayDeque, "suppressed");
                }
            }
            th2 = th2.getCause();
            str = null;
            atomicInteger = atomicInteger;
            hashSet = hashSet;
            arrayDeque = arrayDeque;
        }
    }

    public n1 v(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.f10078a;
        int iB = recyclerView.f2085y.B();
        int i11 = 0;
        n1 n1Var = null;
        while (true) {
            if (i11 >= iB) {
                break;
            }
            n1 n1VarM = RecyclerView.M(recyclerView.f2085y.A(i11));
            if (n1VarM != null && !n1VarM.h() && n1VarM.f10157c == i10) {
                if (!((ArrayList) recyclerView.f2085y.f2797x).contains(n1VarM.f10155a)) {
                    n1Var = n1VarM;
                    break;
                }
                n1Var = n1VarM;
            }
            i11++;
        }
        if (n1Var == null) {
            return null;
        }
        if (!((ArrayList) recyclerView.f2085y.f2797x).contains(n1Var.f10155a)) {
            return n1Var;
        }
        boolean z10 = RecyclerView.W0;
        return null;
    }

    public Object w(iu.e eVar, mu.m mVar) {
        br.l.e(eVar, "descriptor");
        Map map = (Map) ((ConcurrentHashMap) this.f10078a).get(eVar);
        Object obj = map != null ? map.get(mVar) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public ls.q0 x(int i10) {
        return (ls.q0) ((List) this.f10078a).get(i10);
    }

    public String y() {
        String country = ((Locale) this.f10078a).getCountry();
        br.l.b(country);
        byte[] bytes = country.getBytes(tt.a.f22975a);
        br.l.d(bytes, "getBytes(...)");
        if (bytes.length == 2 && H(country)) {
            return country;
        }
        return null;
    }

    public h0(int i10) {
        switch (i10) {
            case 26:
                this.f10078a = new ConcurrentHashMap(16);
                break;
            default:
                this.f10078a = new io.sentry.android.core.f0(m2.f12434a);
                break;
        }
    }

    public h0(ls.w0 w0Var) {
        br.l.e(w0Var, "typeTable");
        List list = w0Var.f15905g;
        if ((w0Var.f15904d & 1) == 1) {
            int i10 = w0Var.f15906r;
            br.l.d(list, "typeTable.typeList");
            ArrayList arrayList = new ArrayList(mq.p.a0(list, 10));
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    e5.Q();
                    throw null;
                }
                ls.q0 q0VarG = (ls.q0) obj;
                if (i11 >= i10) {
                    q0VarG.getClass();
                    ls.p0 p0VarR = ls.q0.r(q0VarG);
                    p0VarR.f15855r |= 2;
                    p0VarR.f15857y = true;
                    q0VarG = p0VarR.g();
                    if (!q0VarG.b()) {
                        throw new bf.n();
                    }
                }
                arrayList.add(q0VarG);
                i11 = i12;
            }
            list = arrayList;
        }
        br.l.d(list, "run {\n        val origin… else originalTypes\n    }");
        this.f10078a = list;
    }

    @Override // js.o
    public void b() {
    }

    public void U(i5.f fVar) {
    }

    public void o(i5.f fVar) {
    }

    @Override // j8.f
    public void z(int i10) {
    }

    @Override // js.o
    public void M(qs.g gVar, vs.f fVar) {
    }

    @Override // js.o
    public void l(qs.g gVar, Object obj) {
    }

    @Override // js.o
    public void q(qs.g gVar, qs.b bVar, qs.g gVar2) {
    }
}
