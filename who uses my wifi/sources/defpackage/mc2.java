package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonWriter;
import android.util.SparseArray;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mc2 implements kk1, iq3, td2, p93, bb4, gj4 {
    public static mc2 k;
    public final /* synthetic */ int f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;

    public mc2(Context context, ym ymVar, ra4 ra4Var, oc2 oc2Var) {
        this.f = 0;
        this.g = ymVar;
        da4 da4VarA = da4.a(context);
        da4 da4VarA2 = da4.a(ra4Var);
        int i = 0;
        this.h = ba4.a(new ub2(da4VarA, da4VarA2, i));
        da4 da4VarA3 = da4.a(ymVar);
        ba4 ba4VarA = ba4.a(new wb2(da4VarA3, da4VarA2, da4.a(oc2Var), i));
        this.i = ba4VarA;
        this.j = ba4.a(new rc2(da4VarA, new xb2(da4VarA3, ba4VarA), 0));
    }

    public static synchronized mc2 m(Context context) {
        try {
            mc2 mc2Var = k;
            if (mc2Var != null) {
                return mc2Var;
            }
            Context applicationContext = context.getApplicationContext();
            mz1.a(applicationContext);
            hg4 hg4Var = hg4.C;
            ra4 ra4VarG = hg4Var.h.g();
            ra4VarG.j(applicationContext);
            applicationContext.getClass();
            ym ymVar = hg4Var.k;
            ymVar.getClass();
            oc2 oc2Var = hg4Var.y;
            i41.P(oc2Var, oc2.class);
            mc2 mc2Var2 = new mc2(applicationContext, ymVar, ra4VarG, oc2Var);
            k = mc2Var2;
            tb2 tb2Var = (tb2) ((ba4) mc2Var2.h).d();
            SharedPreferences sharedPreferences = tb2Var.b;
            sharedPreferences.registerOnSharedPreferenceChangeListener(tb2Var);
            tb2Var.onSharedPreferenceChanged(sharedPreferences, "gad_has_consent_for_cookies");
            iz1 iz1Var = mz1.J0;
            tw1 tw1Var = tw1.e;
            if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                tb2Var.onSharedPreferenceChanged(sharedPreferences, "IABTCF_TCString");
            } else {
                tb2Var.onSharedPreferenceChanged(sharedPreferences, "IABTCF_PurposeConsents");
            }
            qc2 qc2Var = (qc2) ((ba4) k.j).d();
            if (((Boolean) tw1Var.c.a(mz1.D0)).booleanValue()) {
                HashMap mapP = lf4.P((String) tw1Var.c.a(mz1.E0));
                Iterator it = mapP.keySet().iterator();
                while (it.hasNext()) {
                    qc2Var.a((String) it.next());
                }
                pc2 pc2Var = new pc2(qc2Var, mapP);
                synchronized (qc2Var) {
                    qc2Var.b.add(pc2Var);
                }
            }
            return k;
        } catch (Throwable th) {
            throw th;
        }
    }

    public zw3 A() throws GeneralSecurityException {
        Integer num = (Integer) this.g;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (((Integer) this.h) == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((xw3) this.i) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.g));
        }
        Integer num2 = (Integer) this.h;
        int iIntValue = num2.intValue();
        xw3 xw3Var = (xw3) this.i;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (xw3Var == xw3.b) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (xw3Var == xw3.c) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (xw3Var == xw3.d) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (xw3Var == xw3.e) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (xw3Var != xw3.f) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new zw3(((Integer) this.g).intValue(), ((Integer) this.h).intValue(), (yw3) this.j, (xw3) this.i);
    }

    public String B() {
        int i = ((av1) this.j).f;
        return ex0.j(new StringBuilder(String.valueOf(i).length() + 6), "LATMTD", i);
    }

    @Override // defpackage.p93
    /* renamed from: a */
    public /* synthetic */ void mo13a() {
        b23 b23Var = (b23) this.g;
        ((f03) b23Var.e).b((h83) this.h, (a83) this.i, (c03) this.j);
    }

    public void b(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((bw0) this.h).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                b(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    @Override // defpackage.td2, defpackage.dp2
    /* renamed from: c */
    public void mo14c(Object obj) throws JSONException {
        c62 c62Var = (c62) obj;
        gi2.G("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.h;
        pd2 pd2Var = (pd2) this.i;
        k62 k62Var = (k62) this.j;
        x52 x52Var = (x52) this.g;
        k62Var.getClass();
        try {
            lf4 lf4Var = hg4.C.c;
            String string = UUID.randomUUID().toString();
            x32.j.a(string, new j62(k62Var, x52Var, pd2Var));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", ((g62) k62Var.d).p(obj2));
            String str = (String) k62Var.b;
            m52 m52Var = (m52) c62Var;
            m52Var.getClass();
            m52Var.s(str, jSONObject.toString());
        } catch (Exception e) {
            try {
                pd2Var.b(e);
                gi2.c0("Unable to invokeJavascript", e);
            } finally {
                x52Var.w();
            }
        }
    }

    @Override // defpackage.bb4
    public void d(JsonWriter jsonWriter) throws IOException {
        String str = (String) this.g;
        String str2 = (String) this.h;
        Map map = (Map) this.i;
        byte[] bArr = (byte[]) this.j;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        wb4.d(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    @Override // defpackage.gj4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.sn3 e(int r17, defpackage.d02 r18, int[] r19) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mc2.e(int, d02, int[]):sn3");
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x026f, code lost:
    
        r11 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0271 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0215  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(defpackage.jw0 r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mc2.f(jw0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01e1  */
    @Override // defpackage.kk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(byte[] r25, int r26, int r27, defpackage.lk1 r28) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mc2.g(byte[], int, int, lk1):void");
    }

    public void h(String str) {
        Bundle bundle = new Bundle();
        synchronized (this.g) {
            try {
                try {
                    ((n10) ((p10) this.h)).U((nl) this.i, str, bundle);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(int i) throws InvalidAlgorithmParameterException {
        switch (this.f) {
            case 24:
                if (i != 16 && i != 24 && i != 32) {
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
                }
                this.g = Integer.valueOf(i);
                return;
            default:
                this.g = Integer.valueOf(i);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r10 == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean j(defpackage.bv1 r9, defpackage.us0 r10) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mc2.j(bv1, us0):boolean");
    }

    public void n() {
        this.h = 12;
    }

    public void o(int i) {
        this.h = Integer.valueOf(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:244:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d5  */
    @Override // defpackage.iq3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void p(java.lang.Object r30) throws java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 1982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mc2.p(java.lang.Object):void");
    }

    public synchronized void q(jo1 jo1Var) {
        try {
            HashMap map = (HashMap) this.g;
            String strD = jo1Var.d();
            List list = (List) map.remove(strD);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (ro1.a) {
                ro1.a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strD);
            }
            jo1 jo1Var2 = (jo1) list.remove(0);
            map.put(strD, list);
            synchronized (jo1Var2.j) {
                jo1Var2.p = this;
            }
            try {
                ((BlockingQueue) this.i).put(jo1Var2);
            } catch (InterruptedException e) {
                ro1.b("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                bo1 bo1Var = (bo1) this.h;
                bo1Var.i = true;
                bo1Var.interrupt();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public fv1 r(int i) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.i;
        String string = i == 1 ? sharedPreferences.getString(B(), null) : sharedPreferences.getString(w(), null);
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] bArrX = uk2.x(string);
                fv1 fv1VarF = fv1.F(a54.n(bArrX, 0, bArrX.length));
                String strA = fv1VarF.A();
                File fileJ = uk2.J(strA, "pcam.jar", v());
                if (!fileJ.exists()) {
                    fileJ = uk2.J(strA, "pcam", v());
                }
                File fileJ2 = uk2.J(strA, "pcbc", v());
                if (fileJ.exists()) {
                    if (fileJ2.exists()) {
                        return fv1VarF;
                    }
                }
            } catch (a64 unused) {
            }
        }
        return null;
    }

    @Override // defpackage.iq3
    public void s(Throwable th) {
        switch (this.f) {
            case 10:
                hg4.C.h.d("OpenGmsgHandler.attributionReportingManager", th);
                break;
            case 12:
                gi2.i0("Failed to parse gmsg params for: ".concat(String.valueOf((Uri) this.i)));
                break;
            case 13:
                ((ld2) ((gj2) this.j).e).a(new ea1(this, th, (eb3) this.g, (String) this.h, (x34) this.i, 2, false));
                break;
            case 15:
            case 20:
                break;
            default:
                aa3 aa3Var = (aa3) this.g;
                if (aa3Var != null) {
                    aa3Var.b(false);
                    da3 da3Var = (da3) this.h;
                    if (da3Var != null) {
                        da3Var.a(aa3Var);
                        da3Var.h();
                        break;
                    } else {
                        eb3 eb3Var = (eb3) this.j;
                        eb3Var.f.b(aa3Var.n());
                        break;
                    }
                }
                break;
        }
    }

    public void t() {
        this.i = 16;
    }

    public synchronized boolean u(jo1 jo1Var) {
        try {
            HashMap map = (HashMap) this.g;
            String strD = jo1Var.d();
            if (!map.containsKey(strD)) {
                map.put(strD, null);
                synchronized (jo1Var.j) {
                    jo1Var.p = this;
                }
                if (ro1.a) {
                    ro1.c("new request, sending to network %s", strD);
                }
                return false;
            }
            List arrayList = (List) map.get(strD);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            jo1Var.a("waiting-for-response");
            arrayList.add(jo1Var);
            map.put(strD, arrayList);
            if (ro1.a) {
                ro1.c("Request for cacheKey=%s is in flight, putting on hold.", strD);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public File v() {
        File file = new File((File) this.g, Integer.toString(((av1) this.j).f));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public String w() {
        int i = ((av1) this.j).f;
        return ex0.j(new StringBuilder(String.valueOf(i).length() + 6), "FBAMTD", i);
    }

    public g93 x() {
        l83 l83VarD = ((lm2) this.h).d();
        pc4 pc4Var = l83VarD.d;
        String str = l83VarD.g;
        vi4 vi4Var = l83VarD.k;
        d93 d93Var = (d93) ((t83) this.g).h;
        return new g93(pc4Var, str, new ha2(d93Var.f).a().j, d93Var.l, vi4Var);
    }

    public xr3 y() throws GeneralSecurityException {
        yf3 yf3Var;
        v34 v34VarB;
        ds3 ds3Var = (ds3) this.g;
        if (ds3Var == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        yf3 yf3Var2 = (yf3) this.h;
        if (yf3Var2 == null || (yf3Var = (yf3) this.i) == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (ds3Var.a != ((v34) yf3Var2.f).a.length) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (ds3Var.b != ((v34) yf3Var.f).a.length) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (ds3Var.a() && ((Integer) this.j) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((ds3) this.g).a() && ((Integer) this.j) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        cs3 cs3Var = ((ds3) this.g).e;
        if (cs3Var == cs3.j) {
            v34VarB = sv3.a;
        } else if (cs3Var == cs3.i) {
            v34VarB = sv3.a(((Integer) this.j).intValue());
        } else {
            if (cs3Var != cs3.h) {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(((ds3) this.g).e)));
            }
            v34VarB = sv3.b(((Integer) this.j).intValue());
        }
        return new xr3((ds3) this.g, (yf3) this.h, (yf3) this.i, v34VarB, (Integer) this.j);
    }

    public ms3 z() throws GeneralSecurityException {
        Integer num = (Integer) this.g;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (((Integer) this.h) == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (((Integer) this.i) == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        ((Integer) this.h).getClass();
        ((Integer) this.i).getClass();
        return new ms3(iIntValue, (ls3) this.j);
    }

    public /* synthetic */ mc2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f = i;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
        this.j = obj;
    }

    public /* synthetic */ mc2(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
    }

    public mc2(t83 t83Var, lm2 lm2Var, Executor executor) {
        this.f = 19;
        this.g = t83Var;
        this.h = lm2Var;
        this.i = executor;
    }

    public mc2(Context context, av1 av1Var) {
        this.f = 22;
        this.i = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        uk2.W(dir, false);
        this.g = dir;
        File dir2 = context.getDir("tmppccache", 0);
        uk2.W(dir2, true);
        this.h = dir2;
        this.j = av1Var;
    }

    public mc2(AudioTrack audioTrack, x03 x03Var) {
        this.f = 27;
        this.g = audioTrack;
        this.h = x03Var;
        this.j = new AudioRouting.OnRoutingChangedListener() { // from class: bf4
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final /* synthetic */ void onRoutingChanged(AudioRouting audioRouting) {
                mc2 mc2Var = this.a;
                if (((bf4) mc2Var.j) == null) {
                    return;
                }
                wl2.B().execute(new ve4(mc2Var, audioRouting, 0));
            }
        };
        Handler handler = new Handler(Looper.myLooper());
        this.i = handler;
        audioTrack.addOnRoutingChangedListener((bf4) this.j, handler);
    }

    public mc2(List list) throws NumberFormatException {
        int i;
        this.f = 8;
        this.g = new kz2();
        this.h = new kz2();
        ml1 ml1Var = new ml1();
        this.i = ml1Var;
        String strTrim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = v23.a;
        for (String str2 : strTrim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] strArrSplit = str2.substring(9).split(",", -1);
                ml1Var.d = new int[strArrSplit.length];
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    int[] iArr = ml1Var.d;
                    try {
                        i = Integer.parseInt(strArrSplit[i2].trim(), 16);
                    } catch (RuntimeException unused) {
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] strArrSplit2 = str2.substring(6).trim().split("x", -1);
                if (strArrSplit2.length == 2) {
                    try {
                        ml1Var.e = Integer.parseInt(strArrSplit2[0]);
                        ml1Var.f = Integer.parseInt(strArrSplit2[1]);
                        ml1Var.b = true;
                    } catch (RuntimeException e) {
                        a30.z("Parsing IDX failed", e);
                    }
                }
            }
        }
    }

    private final void k(Throwable th) {
    }

    private final void l(Throwable th) {
    }

    public mc2(bo1 bo1Var, BlockingQueue blockingQueue, f20 f20Var) {
        this.f = 9;
        this.g = new HashMap();
        this.j = f20Var;
        this.h = bo1Var;
        this.i = blockingQueue;
    }

    public mc2(gj2 gj2Var, eb3 eb3Var, String str, x34 x34Var) {
        this.f = 13;
        this.g = eb3Var;
        this.h = str;
        this.i = x34Var;
        Objects.requireNonNull(gj2Var);
        this.j = gj2Var;
    }

    public mc2(qk qkVar, cu0 cu0Var, lw0 lw0Var) {
        this.f = 5;
        this.g = qkVar;
        this.h = lw0Var;
        this.i = new bc(Integer.MAX_VALUE);
        this.j = new AtomicInteger(0);
        w30 w30Var = (w30) qkVar.b().h(fr.j);
        if (w30Var == null) {
            return;
        }
        ((g40) w30Var).E(false, true, new e30(new ek(cu0Var, this, 1)));
    }

    public mc2(WorkDatabase_Impl workDatabase_Impl) {
        this.f = 7;
        this.g = workDatabase_Impl;
        this.h = new io(workDatabase_Impl, 4);
        this.i = new tz0(workDatabase_Impl, 1);
        this.j = new tz0(workDatabase_Impl, 2);
    }

    public mc2(int i) {
        this.f = i;
        switch (i) {
            case 6:
                this.g = new s8(0);
                this.h = new SparseArray();
                this.i = new l80();
                this.j = new s8(0);
                break;
            case 23:
                this.g = null;
                this.h = null;
                this.i = null;
                this.j = null;
                break;
            case 24:
                this.g = null;
                this.h = null;
                this.i = null;
                this.j = ls3.e;
                break;
            case 25:
                this.g = null;
                this.h = null;
                this.i = null;
                this.j = yw3.e;
                break;
            default:
                this.g = new hl0(10);
                this.h = new bw0(0);
                this.i = new ArrayList();
                this.j = new HashSet();
                break;
        }
    }

    public mc2(CoordinatorLayout coordinatorLayout, RelativeLayout relativeLayout, p21 p21Var, TextView textView, WebView webView) {
        this.f = 1;
        this.g = relativeLayout;
        this.h = p21Var;
        this.i = textView;
        this.j = webView;
    }

    public mc2(Typeface typeface, pe0 pe0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        this.f = 4;
        this.j = typeface;
        this.g = pe0Var;
        this.i = new qe0(1024);
        int iA = pe0Var.a(6);
        if (iA != 0) {
            int i5 = iA + pe0Var.f;
            i = ((ByteBuffer) pe0Var.i).getInt(((ByteBuffer) pe0Var.i).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.h = new char[i * 2];
        int iA2 = pe0Var.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + pe0Var.f;
            i2 = ((ByteBuffer) pe0Var.i).getInt(((ByteBuffer) pe0Var.i).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            q31 q31Var = new q31(this, i7);
            oe0 oe0VarB = q31Var.b();
            int iA3 = oe0VarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) oe0VarB.i).getInt(iA3 + oe0VarB.f) : 0, (char[]) this.h, i7 * 2);
            oe0 oe0VarB2 = q31Var.b();
            int iA4 = oe0VarB2.a(16);
            if (iA4 != 0) {
                int i8 = iA4 + oe0VarB2.f;
                i3 = ((ByteBuffer) oe0VarB2.i).getInt(((ByteBuffer) oe0VarB2.i).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            pu1.g("invalid metadata codepoint length", i3 > 0);
            qe0 qe0Var = (qe0) this.i;
            oe0 oe0VarB3 = q31Var.b();
            int iA5 = oe0VarB3.a(16);
            if (iA5 != 0) {
                int i9 = iA5 + oe0VarB3.f;
                i4 = ((ByteBuffer) oe0VarB3.i).getInt(((ByteBuffer) oe0VarB3.i).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            qe0Var.a(q31Var, 0, i4 - 1);
        }
    }

    public mc2(p10 p10Var, nl nlVar, ComponentName componentName) {
        this.f = 2;
        this.g = new Object();
        this.h = p10Var;
        this.i = nlVar;
        this.j = componentName;
    }
}
