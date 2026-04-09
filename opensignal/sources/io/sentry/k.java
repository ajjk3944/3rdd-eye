package io.sentry;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.CrossProcessCursor;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.exoplayer2.Format;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.io.EOFException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class k implements z0, k8.e, o9.b, ma.a0, pb.m, po.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12396a;

    /* renamed from: d, reason: collision with root package name */
    public Object f12397d;

    /* renamed from: g, reason: collision with root package name */
    public Object f12398g;

    /* renamed from: r, reason: collision with root package name */
    public Object f12399r;

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, int i10) {
        this.f12396a = i10;
        this.f12397d = obj;
        this.f12398g = obj2;
        this.f12399r = obj3;
    }

    public static String O(String str, HashMap map) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        sb2.append("=");
        sb2.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append("&");
            sb2.append((String) entry2.getKey());
            sb2.append("=");
            sb2.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String string = sb2.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return w.g.g(str, "?", string);
        }
        if (!str.endsWith("&")) {
            string = "&".concat(string);
        }
        return w.g.f(str, string);
    }

    public static boolean P(Editable editable, KeyEvent keyEvent, boolean z10) {
        j4.v[] vVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (vVarArr = (j4.v[]) editable.getSpans(selectionStart, selectionEnd, j4.v.class)) != null && vVarArr.length > 0) {
                for (j4.v vVar : vVarArr) {
                    int spanStart = editable.getSpanStart(vVar);
                    int spanEnd = editable.getSpanEnd(vVar);
                    if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static l8.f R(l8.j jVar, Throwable th2) {
        if (th2 instanceof l8.m) {
            jVar.getClass();
            l8.c cVar = jVar.f14945z;
            cVar.getClass();
            l8.c cVar2 = q8.f.f20732a;
            cVar.getClass();
        } else {
            jVar.f14945z.getClass();
            l8.c cVar3 = q8.f.f20732a;
        }
        return new l8.f(null, jVar, th2);
    }

    public static boolean f0(l8.j jVar, Bitmap.Config config) {
        if (!com.google.android.gms.internal.measurement.i4.t(config)) {
            return true;
        }
        if (!jVar.k) {
            return false;
        }
        n8.a aVar = jVar.f14924c;
        if (!(aVar instanceof n8.a)) {
            return true;
        }
        View view = aVar.getView();
        return !view.isAttachedToWindow() || view.isHardwareAccelerated();
    }

    public static k h0(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new k(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public static final void m(k kVar, Network network, boolean z10) {
        boolean z11;
        Network[] allNetworks = ((ConnectivityManager) kVar.f12397d).getAllNetworks();
        int length = allNetworks.length;
        boolean z12 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Network network2 = allNetworks[i10];
            if (br.l.a(network2, network)) {
                z11 = z10;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) kVar.f12397d).getNetworkCapabilities(network2);
                z11 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z11) {
                z12 = true;
                break;
            }
            i10++;
        }
        q8.n nVar = (q8.n) kVar.f12398g;
        synchronized (nVar) {
            try {
                if (((a8.l) nVar.f20751a.get()) != null) {
                    nVar.f20755x = z12;
                } else {
                    nVar.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.sentry.z0
    public List A() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(((z0) this.f12397d).A());
        copyOnWriteArrayList.addAll(((z0) this.f12398g).A());
        copyOnWriteArrayList.addAll(((z0) this.f12399r).A());
        Collections.sort(copyOnWriteArrayList);
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.z0
    public List B() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(((z0) this.f12397d).B());
        copyOnWriteArrayList.addAll(((z0) this.f12398g).B());
        copyOnWriteArrayList.addAll(((z0) this.f12399r).B());
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.z0
    public void C(t4 t4Var) {
        ((z0) this.f12397d).C(t4Var);
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.c D() {
        z0 z0Var = (z0) this.f12397d;
        return new i(z0Var.D(), ((z0) this.f12398g).D(), ((z0) this.f12399r).D(), z0Var.k().getDefaultScopeType());
    }

    @Override // io.sentry.z0
    public k E(m3 m3Var) {
        return Z(null).E(m3Var);
    }

    @Override // io.sentry.z0
    public String F() {
        String strF = ((z0) this.f12399r).F();
        if (strF != null) {
            return strF;
        }
        String strF2 = ((z0) this.f12398g).F();
        return strF2 != null ? strF2 : ((z0) this.f12397d).F();
    }

    @Override // io.sentry.z0
    public void G(o3 o3Var) {
        Z(null).G(o3Var);
    }

    @Override // io.sentry.z0
    public void H(io.sentry.protocol.t tVar) {
        ((z0) this.f12397d).H(tVar);
        ((z0) this.f12398g).H(tVar);
        ((z0) this.f12399r).H(tVar);
    }

    @Override // io.sentry.z0
    public void I(k1 k1Var) {
        Z(null).I(k1Var);
    }

    @Override // io.sentry.z0
    public List J() {
        List listJ = ((z0) this.f12399r).J();
        if (!listJ.isEmpty()) {
            return listJ;
        }
        List listJ2 = ((z0) this.f12398g).J();
        return !listJ2.isEmpty() ? listJ2 : ((z0) this.f12397d).J();
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.e0 K() {
        io.sentry.protocol.e0 e0VarK = ((z0) this.f12399r).K();
        if (e0VarK != null) {
            return e0VarK;
        }
        io.sentry.protocol.e0 e0VarK2 = ((z0) this.f12398g).K();
        return e0VarK2 != null ? e0VarK2 : ((z0) this.f12397d).K();
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.n L() {
        io.sentry.protocol.n nVarL = ((z0) this.f12399r).L();
        if (nVarL != null) {
            return nVarL;
        }
        io.sentry.protocol.n nVarL2 = ((z0) this.f12398g).L();
        return nVarL2 != null ? nVarL2 : ((z0) this.f12397d).L();
    }

    @Override // io.sentry.z0
    public List M() {
        return com.google.android.gms.internal.measurement.i4.K((CopyOnWriteArrayList) A());
    }

    @Override // io.sentry.z0
    public String N() {
        String strN = ((z0) this.f12399r).N();
        if (strN != null) {
            return strN;
        }
        String strN2 = ((z0) this.f12398g).N();
        return strN2 != null ? strN2 : ((z0) this.f12397d).N();
    }

    public String Q(byte[] bArr) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] bArr2 = new byte[16];
        ((SecureRandom) this.f12399r).nextBytes(bArr2);
        SecretKeySpec secretKeySpec = new SecretKeySpec((byte[]) this.f12397d, "AES/CBC/PKCS7Padding");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        Cipher cipher = (Cipher) this.f12398g;
        cipher.init(1, secretKeySpec, ivParameterSpec);
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        br.l.b(bArrDoFinal);
        int length = bArrDoFinal.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr2, 16 + length);
        System.arraycopy(bArrDoFinal, 0, bArrCopyOf, 16, length);
        br.l.b(bArrCopyOf);
        Charset charset = tt.a.f22975a;
        ch.n.b("SimpleAesEncryptor", "ivBytes: ".concat(new String(bArr2, charset)));
        ch.n.b("SimpleAesEncryptor", "message: ".concat(new String(bArrDoFinal, charset)));
        String strEncodeToString = Base64.encodeToString(bArrCopyOf, 0);
        br.l.d(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ag.b S() throws java.lang.Throwable {
        /*
            r8 = this;
            jf.d.b()
            r0 = 0
            java.lang.Object r1 = r8.f12397d     // Catch: java.lang.Throwable -> La2
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> La2
            java.lang.Object r2 = r8.f12398g     // Catch: java.lang.Throwable -> La2
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> La2
            java.lang.String r1 = O(r1, r2)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r2 = "FirebaseCrashlytics"
            r3 = 2
            android.util.Log.isLoggable(r2, r3)     // Catch: java.lang.Throwable -> La2
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L9f
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L9f
            java.net.URLConnection r1 = r2.openConnection()     // Catch: java.lang.Throwable -> L9f
            javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch: java.lang.Throwable -> L9f
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L56
            r1.setConnectTimeout(r2)     // Catch: java.lang.Throwable -> L56
            java.lang.String r2 = "GET"
            r1.setRequestMethod(r2)     // Catch: java.lang.Throwable -> L56
            java.lang.Object r2 = r8.f12399r     // Catch: java.lang.Throwable -> L56
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L56
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L56
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L56
        L3a:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L58
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L56
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L56
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L56
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L56
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L56
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L56
            r1.addRequestProperty(r4, r3)     // Catch: java.lang.Throwable -> L56
            goto L3a
        L56:
            r2 = move-exception
            goto La5
        L58:
            r1.connect()     // Catch: java.lang.Throwable -> L56
            int r2 = r1.getResponseCode()     // Catch: java.lang.Throwable -> L56
            java.io.InputStream r3 = r1.getInputStream()     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L91
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L8d
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L8d
            java.lang.String r5 = "UTF-8"
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L8d
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L8d
            r4 = 8192(0x2000, float:1.148E-41)
            char[] r4 = new char[r4]     // Catch: java.lang.Throwable -> L8d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r5.<init>()     // Catch: java.lang.Throwable -> L8d
        L7a:
            int r6 = r0.read(r4)     // Catch: java.lang.Throwable -> L8d
            r7 = -1
            if (r6 == r7) goto L86
            r7 = 0
            r5.append(r4, r7, r6)     // Catch: java.lang.Throwable -> L8d
            goto L7a
        L86:
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L8d
            goto L91
        L8b:
            r2 = r0
            goto L8f
        L8d:
            r0 = move-exception
            goto L8b
        L8f:
            r0 = r3
            goto La5
        L91:
            if (r3 == 0) goto L96
            r3.close()
        L96:
            r1.disconnect()
            ag.b r1 = new ag.b
            r1.<init>(r2, r0)
            return r1
        L9f:
            r2 = move-exception
        La0:
            r1 = r0
            goto La5
        La2:
            r1 = move-exception
            r2 = r1
            goto La0
        La5:
            if (r0 == 0) goto Laa
            r0.close()
        Laa:
            if (r1 == 0) goto Laf
            r1.disconnect()
        Laf:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.k.S():ag.b");
    }

    public ColorStateList T(int i10) {
        int resourceId;
        ColorStateList colorStateListC;
        TypedArray typedArray = (TypedArray) this.f12398g;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListC = h3.c.c((Context) this.f12397d, resourceId)) == null) ? typedArray.getColorStateList(i10) : colorStateListC;
    }

    public Drawable U(int i10) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f12398g;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) ? typedArray.getDrawable(i10) : ic.a.r((Context) this.f12397d, resourceId);
    }

    public Drawable V(int i10) {
        int resourceId;
        Drawable drawableD;
        if (!((TypedArray) this.f12398g).hasValue(i10) || (resourceId = ((TypedArray) this.f12398g).getResourceId(i10, 0)) == 0) {
            return null;
        }
        p.p pVarA = p.p.a();
        Context context = (Context) this.f12397d;
        synchronized (pVarA) {
            drawableD = pVarA.f20132a.d(context, resourceId, true);
        }
        return drawableD;
    }

    public String W(String str, String str2) {
        return tt.s.l0(w.g.f(str, str2), "{workspaceKey}", ((g4.a) ((po.b) this.f12397d)).a());
    }

    public Typeface X(int i10, int i11, p.i0 i0Var) {
        int resourceId = ((TypedArray) this.f12398g).getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f12399r) == null) {
            this.f12399r = new TypedValue();
        }
        Context context = (Context) this.f12397d;
        TypedValue typedValue = (TypedValue) this.f12399r;
        ThreadLocal threadLocal = j3.k.f13193a;
        if (context.isRestricted()) {
            return null;
        }
        return j3.k.b(context, resourceId, typedValue, i11, i0Var, true, false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    public ArrayList Y() {
        ?? r02 = this.f12399r;
        ArrayList arrayList = new ArrayList();
        for (Object obj : r02) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    public z0 Z(t3 t3Var) {
        z0 z0Var = (z0) this.f12398g;
        z0 z0Var2 = (z0) this.f12399r;
        z0 z0Var3 = (z0) this.f12397d;
        if (t3Var != null) {
            int i10 = j.f12372a[t3Var.ordinal()];
            if (i10 == 1) {
                return z0Var2;
            }
            if (i10 == 2) {
                return z0Var;
            }
            if (i10 == 3) {
                return z0Var3;
            }
            if (i10 == 4) {
                return this;
            }
        }
        int i11 = j.f12372a[z0Var3.k().getDefaultScopeType().ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? z0Var2 : z0Var3 : z0Var : z0Var2;
    }

    @Override // pb.m
    public pb.n a() {
        pb.s sVar = new pb.s((Context) this.f12397d, ((pb.t) this.f12399r).a());
        pb.u0 u0Var = (pb.u0) this.f12398g;
        if (u0Var != null) {
            sVar.s(u0Var);
        }
        return sVar;
    }

    public String a0() {
        Boolean bool = (Boolean) this.f12399r;
        String str = (bool == null || !bool.booleanValue()) ? "00" : "01";
        return "00-" + ((io.sentry.protocol.t) this.f12397d) + "-" + ((n6) this.f12398g) + "-" + str;
    }

    @Override // io.sentry.z0
    public void b(String str, String str2) {
        Z(null).b(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0205 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0224  */
    /* JADX WARN: Type inference failed for: r0v124, types: [int] */
    /* JADX WARN: Type inference failed for: r0v147 */
    /* JADX WARN: Type inference failed for: r0v200 */
    /* JADX WARN: Type inference failed for: r0v201 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b0() throws org.json.JSONException, android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 1670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.k.b0():boolean");
    }

    @Override // ma.a0
    public void c(fb.f fVar) {
        long jC;
        long j;
        qb.b.k((qb.u) this.f12398g);
        int i10 = qb.v.f20828a;
        qb.u uVar = (qb.u) this.f12398g;
        synchronized (uVar) {
            try {
                long j7 = uVar.f20826c;
                jC = j7 != -9223372036854775807L ? j7 + uVar.f20825b : uVar.c();
            } finally {
            }
        }
        qb.u uVar2 = (qb.u) this.f12398g;
        synchronized (uVar2) {
            j = uVar2.f20825b;
        }
        if (jC == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        Format format = (Format) this.f12397d;
        if (j != format.L) {
            com.google.android.exoplayer2.g0 g0VarD = format.d();
            g0VarD.f4154o = j;
            Format format2 = new Format(g0VarD);
            this.f12397d = format2;
            ((ca.x) this.f12399r).e(format2);
        }
        int iA = fVar.a();
        ((ca.x) this.f12399r).a(iA, fVar);
        ((ca.x) this.f12399r).d(jC, 1, iA, 0, null);
    }

    public boolean c0(CharSequence charSequence, int i10, int i11, j4.u uVar) {
        if ((uVar.f13247c & 3) == 0) {
            j4.e eVar = (j4.e) this.f12399r;
            k4.a aVarB = uVar.b();
            int iA = aVarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) aVarB.f14040r).getShort(iA + aVarB.f14037a);
            }
            j4.c cVar = (j4.c) eVar;
            cVar.getClass();
            ThreadLocal threadLocal = j4.c.f13205b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i10 < i11) {
                sb2.append(charSequence.charAt(i10));
                i10++;
            }
            TextPaint textPaint = cVar.f13206a;
            String string = sb2.toString();
            int i12 = k3.e.f14018a;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i13 = uVar.f13247c & 4;
            uVar.f13247c = zHasGlyph ? i13 | 2 : i13 | 1;
        }
        return (uVar.f13247c & 3) == 2;
    }

    @Override // io.sentry.z0
    public void clear() {
        Z(null).clear();
    }

    /* renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m38clone() {
        switch (this.f12396a) {
            case 0:
                return clone();
            default:
                return super.clone();
        }
    }

    @Override // ma.a0
    public void d(qb.u uVar, ca.m mVar, ma.g0 g0Var) {
        this.f12398g = uVar;
        g0Var.a();
        g0Var.b();
        ca.x xVarN = mVar.n(g0Var.f16468e, 5);
        this.f12399r = xVarN;
        xVarN.e((Format) this.f12397d);
    }

    public void d0(String str, String str2) {
        ((HashMap) this.f12399r).put(str, str2);
    }

    @Override // k8.e
    public boolean e() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f12397d;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    public void e0(b5.h hVar, Uri uri, Map map, long j, long j7, o5.p0 p0Var) throws o5.i1 {
        u5.k[] kVarArr;
        u5.h hVar2 = new u5.h(hVar, j, j7);
        this.f12399r = hVar2;
        if (((u5.k) this.f12398g) != null) {
            return;
        }
        u5.i iVar = (u5.i) this.f12397d;
        synchronized (iVar) {
            try {
                int[] iArr = u5.i.f23291b;
                ArrayList arrayList = new ArrayList(16);
                List list = (List) map.get("Content-Type");
                int iJ = ir.f0.J((list == null || list.isEmpty()) ? null : (String) list.get(0));
                if (iJ != -1) {
                    iVar.a(iJ, arrayList);
                }
                int iK = ir.f0.K(uri);
                if (iK != -1 && iK != iJ) {
                    iVar.a(iK, arrayList);
                }
                for (int i10 = 0; i10 < 16; i10++) {
                    int i11 = iArr[i10];
                    if (i11 != iJ && i11 != iK) {
                        iVar.a(i11, arrayList);
                    }
                }
                kVarArr = (u5.k[]) arrayList.toArray(new u5.k[arrayList.size()]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        boolean z10 = true;
        if (kVarArr.length == 1) {
            this.f12398g = kVarArr[0];
        } else {
            int length = kVarArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                u5.k kVar = kVarArr[i12];
                try {
                } catch (EOFException unused) {
                    if (((u5.k) this.f12398g) != null || hVar2.f23288r == j) {
                    }
                } catch (Throwable th3) {
                    if (((u5.k) this.f12398g) == null && hVar2.f23288r != j) {
                        z10 = false;
                    }
                    a5.a.i(z10);
                    hVar2.f23290y = 0;
                    throw th3;
                }
                if (kVar.h(hVar2)) {
                    this.f12398g = kVar;
                    hVar2.f23290y = 0;
                    break;
                } else {
                    boolean z11 = ((u5.k) this.f12398g) != null || hVar2.f23288r == j;
                    a5.a.i(z11);
                    hVar2.f23290y = 0;
                    i12++;
                }
            }
            if (((u5.k) this.f12398g) == null) {
                StringBuilder sb2 = new StringBuilder("None of the available extractors (");
                int i13 = a5.d0.f105a;
                StringBuilder sb3 = new StringBuilder();
                for (int i14 = 0; i14 < kVarArr.length; i14++) {
                    sb3.append(kVarArr[i14].getClass().getSimpleName());
                    if (i14 < kVarArr.length - 1) {
                        sb3.append(", ");
                    }
                }
                sb2.append(sb3.toString());
                sb2.append(") could read the stream.");
                throw new o5.i1(sb2.toString(), null, false, 1);
            }
        }
        ((u5.k) this.f12398g).f(p0Var);
    }

    @Override // io.sentry.z0
    public void f(Throwable th2, j6 j6Var, String str) {
        ((z0) this.f12397d).f(th2, j6Var, str);
    }

    @Override // io.sentry.z0
    public void g(e eVar, h0 h0Var) {
        Z(null).g(eVar, h0Var);
    }

    public boolean g0() {
        if (((n0.g2) this.f12397d).getValue() != this.f12399r) {
            return true;
        }
        k kVar = (k) this.f12398g;
        return kVar != null && kVar.g0();
    }

    @Override // kq.a
    public Object get() {
        return new m9.o(new et.d(), new ee.f(27), (r9.b) ((cj.a) this.f12397d).get(), (al.b) ((of.b) this.f12398g).get(), (js.e) ((js.e) this.f12399r).get());
    }

    @Override // io.sentry.z0
    public Map getExtras() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(((z0) this.f12397d).getExtras());
        concurrentHashMap.putAll(((z0) this.f12398g).getExtras());
        concurrentHashMap.putAll(((z0) this.f12399r).getExtras());
        return concurrentHashMap;
    }

    @Override // io.sentry.z0
    public i1 h() {
        i1 i1VarH = ((z0) this.f12399r).h();
        if (i1VarH != null) {
            return i1VarH;
        }
        i1 i1VarH2 = ((z0) this.f12398g).h();
        return i1VarH2 != null ? i1VarH2 : ((z0) this.f12397d).h();
    }

    @Override // io.sentry.z0
    public io.sentry.protocol.t i() {
        io.sentry.protocol.t tVarI = ((z0) this.f12399r).i();
        io.sentry.protocol.t tVar = io.sentry.protocol.t.f12636d;
        if (!tVar.equals(tVarI)) {
            return tVarI;
        }
        io.sentry.protocol.t tVarI2 = ((z0) this.f12398g).i();
        return !tVar.equals(tVarI2) ? tVarI2 : ((z0) this.f12397d).i();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l8.n i0(l8.j r17, m8.h r18) {
        /*
            r16 = this;
            r0 = r17
            r4 = r18
            java.util.List r1 = r0.f14927f
            android.graphics.Bitmap$Config r2 = r0.f14925d
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L1a
            android.graphics.Bitmap$Config[] r1 = q8.i.f20736a
            boolean r1 = mq.l.Z(r2, r1)
            if (r1 == 0) goto L17
            goto L1a
        L17:
            r1 = r16
            goto L36
        L1a:
            boolean r1 = com.google.android.gms.internal.measurement.i4.t(r2)
            if (r1 != 0) goto L23
            r1 = r16
            goto L38
        L23:
            boolean r1 = f0(r0, r2)
            if (r1 == 0) goto L17
            r1 = r16
            java.lang.Object r3 = r1.f12399r
            q8.k r3 = (q8.k) r3
            boolean r3 = r3.a(r4)
            if (r3 == 0) goto L36
            goto L38
        L36:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L38:
            a.a r3 = r4.f16325a
            m8.b r5 = m8.b.f16321f
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L4f
            a.a r3 = r4.f16326b
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L4b
            goto L4f
        L4b:
            m8.g r3 = r0.f14942w
        L4d:
            r5 = r3
            goto L52
        L4f:
            m8.g r3 = m8.g.FIT
            goto L4d
        L52:
            boolean r3 = r0.f14931l
            if (r3 == 0) goto L65
            java.util.List r3 = r0.f14927f
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L65
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ALPHA_8
            if (r2 == r3) goto L65
            r3 = 1
        L63:
            r7 = r3
            goto L67
        L65:
            r3 = 0
            goto L63
        L67:
            l8.n r3 = new l8.n
            android.content.Context r1 = r0.f14922a
            boolean r6 = q8.f.a(r0)
            boolean r8 = r0.f14932m
            ou.s r10 = r0.f14929h
            l8.r r11 = r0.f14930i
            l8.o r12 = r0.f14943x
            l8.b r13 = r0.f14933n
            l8.b r14 = r0.f14934o
            l8.b r15 = r0.f14935p
            r0 = r3
            r3 = 0
            r9 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.k.i0(l8.j, m8.h):l8.n");
    }

    @Override // io.sentry.z0
    public void j(io.sentry.protocol.t tVar) {
        Z(null).j(tVar);
    }

    public Object j0(String str, ar.a aVar) throws Throwable {
        i1 i1VarJ;
        i.g0 g0Var;
        Object obj;
        k6 k6VarT;
        i.g0 g0Var2 = (i.g0) this.f12399r;
        String str2 = (String) this.f12398g;
        br.l.e(str, "sql");
        b1 b1Var = (b1) this.f12397d;
        k4 k4VarA = b1Var.k().getDateProvider().a();
        try {
            Object objC = aVar.c();
            if (objC instanceof CrossProcessCursor) {
                return new io.sentry.android.sqlite.c((CrossProcessCursor) objC, this, str);
            }
            i1 i1VarH = b1Var.h();
            if (i1VarH != null) {
                obj = objC;
                i1VarJ = i1VarH.j("db.sql.query", str, k4VarA, p1.SENTRY);
            } else {
                obj = objC;
                i1VarJ = null;
            }
            if (i1VarJ != null) {
                try {
                    k6VarT = i1VarJ.t();
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        i1 i1VarH2 = b1Var.h();
                        if (i1VarH2 != null) {
                            g0Var = g0Var2;
                            try {
                                i1VarJ = i1VarH2.j("db.sql.query", str, k4VarA, p1.SENTRY);
                            } catch (Throwable th3) {
                                th = th3;
                                if (i1VarJ != null) {
                                    boolean zC = b1Var.k().getThreadChecker().c();
                                    i1VarJ.l(Boolean.valueOf(zC), "blocked_main_thread");
                                    if (zC) {
                                        i1VarJ.l(g0Var.u(), "call_stack");
                                    }
                                    if (str2 != null) {
                                        i1VarJ.l("sqlite", "db.system");
                                        i1VarJ.l(str2, "db.name");
                                    } else {
                                        i1VarJ.l("in-memory", "db.system");
                                    }
                                    i1VarJ.k();
                                }
                                throw th;
                            }
                        } else {
                            g0Var = g0Var2;
                            i1VarJ = null;
                        }
                        k6 k6VarT2 = i1VarJ != null ? i1VarJ.t() : null;
                        if (k6VarT2 != null) {
                            k6VarT2.E = "auto.db.sqlite";
                        }
                        if (i1VarJ != null) {
                            i1VarJ.a(o6.INTERNAL_ERROR);
                        }
                        if (i1VarJ != null) {
                            i1VarJ.f(th);
                        }
                        throw th;
                    } catch (Throwable th4) {
                        th = th4;
                        g0Var = g0Var2;
                    }
                }
            } else {
                k6VarT = null;
            }
            if (k6VarT != null) {
                k6VarT.E = "auto.db.sqlite";
            }
            if (i1VarJ != null) {
                i1VarJ.a(o6.OK);
            }
            if (i1VarJ != null) {
                boolean zC2 = b1Var.k().getThreadChecker().c();
                i1VarJ.l(Boolean.valueOf(zC2), "blocked_main_thread");
                if (zC2) {
                    i1VarJ.l(g0Var2.u(), "call_stack");
                }
                if (str2 != null) {
                    i1VarJ.l("sqlite", "db.system");
                    i1VarJ.l(str2, "db.name");
                } else {
                    i1VarJ.l("in-memory", "db.system");
                }
                i1VarJ.k();
            }
            return obj;
        } catch (Throwable th5) {
            th = th5;
            i1VarJ = null;
        }
    }

    @Override // io.sentry.z0
    public x5 k() {
        return ((z0) this.f12397d).k();
    }

    public Object k0(CharSequence charSequence, int i10, int i11, int i12, boolean z10, j4.m mVar) {
        int i13;
        char c4;
        j4.n nVar = new j4.n((j4.r) ((kg.r) this.f12398g).f14397g);
        int iCodePointAt = Character.codePointAt(charSequence, i10);
        int i14 = 0;
        boolean zA = true;
        int iCharCount = i10;
        loop0: while (true) {
            i13 = iCharCount;
            while (iCharCount < i11 && i14 < i12 && zA) {
                SparseArray sparseArray = nVar.f13223c.f13238a;
                j4.r rVar = sparseArray == null ? null : (j4.r) sparseArray.get(iCodePointAt);
                if (nVar.f13221a == 2) {
                    if (rVar != null) {
                        nVar.f13223c = rVar;
                        nVar.f13226f++;
                    } else {
                        if (iCodePointAt == 65038) {
                            nVar.a();
                        } else if (iCodePointAt != 65039) {
                            j4.r rVar2 = nVar.f13223c;
                            if (rVar2.f13239b != null) {
                                if (nVar.f13226f != 1) {
                                    nVar.f13224d = rVar2;
                                    nVar.a();
                                } else if (nVar.b()) {
                                    nVar.f13224d = nVar.f13223c;
                                    nVar.a();
                                } else {
                                    nVar.a();
                                }
                                c4 = 3;
                            } else {
                                nVar.a();
                            }
                        }
                        c4 = 1;
                    }
                    c4 = 2;
                } else if (rVar == null) {
                    nVar.a();
                    c4 = 1;
                } else {
                    nVar.f13221a = 2;
                    nVar.f13223c = rVar;
                    nVar.f13226f = 1;
                    c4 = 2;
                }
                nVar.f13225e = iCodePointAt;
                if (c4 == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i13)) + i13;
                    if (iCharCount < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c4 == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c4 == 3) {
                    if (z10 || !c0(charSequence, i13, iCharCount, nVar.f13224d.f13239b)) {
                        zA = mVar.a(charSequence, i13, iCharCount, nVar.f13224d.f13239b);
                        i14++;
                    }
                }
            }
            break loop0;
        }
        if (nVar.f13221a == 2 && nVar.f13223c.f13239b != null && ((nVar.f13226f > 1 || nVar.b()) && i14 < i12 && zA && (z10 || !c0(charSequence, i13, iCharCount, nVar.f13223c.f13239b)))) {
            mVar.a(charSequence, i13, iCharCount, nVar.f13223c.f13239b);
        }
        return mVar.b();
    }

    @Override // io.sentry.z0
    public k1 l() {
        k1 k1VarL = ((z0) this.f12399r).l();
        if (k1VarL != null) {
            return k1VarL;
        }
        k1 k1VarL2 = ((z0) this.f12398g).l();
        return k1VarL2 != null ? k1VarL2 : ((z0) this.f12397d).l();
    }

    public void l0() {
        ((TypedArray) this.f12398g).recycle();
    }

    public void m0(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f12397d = str;
    }

    public m9.i n() {
        String strConcat = ((String) this.f12397d) == null ? " backendName" : "";
        if (((j9.d) this.f12399r) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new m9.i((String) this.f12397d, (byte[]) this.f12398g, (j9.d) this.f12399r);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l8.n n0(l8.n r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            android.graphics.Bitmap$Config r2 = r0.f14949b
            l8.b r3 = r0.f14960o
            boolean r4 = com.google.android.gms.internal.measurement.i4.t(r2)
            r5 = 1
            if (r4 == 0) goto L1f
            java.lang.Object r4 = r1.f12399r
            q8.k r4 = (q8.k) r4
            boolean r4 = r4.b()
            if (r4 == 0) goto L1a
            goto L1f
        L1a:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            r4 = r5
        L1d:
            r8 = r2
            goto L21
        L1f:
            r4 = 0
            goto L1d
        L21:
            l8.b r2 = r0.f14960o
            boolean r2 = r2.getReadEnabled()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.f12398g
            q8.n r2 = (q8.n) r2
            monitor-enter(r2)
            r2.a()     // Catch: java.lang.Throwable -> L3b
            boolean r6 = r2.f20755x     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r2)
            if (r6 != 0) goto L3e
            l8.b r3 = l8.b.DISABLED
        L38:
            r21 = r3
            goto L40
        L3b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3b
            throw r0
        L3e:
            r5 = r4
            goto L38
        L40:
            if (r5 == 0) goto L6c
            android.content.Context r7 = r0.f14948a
            android.graphics.ColorSpace r9 = r0.f14950c
            m8.h r10 = r0.f14951d
            m8.g r11 = r0.f14952e
            boolean r12 = r0.f14953f
            boolean r13 = r0.f14954g
            boolean r14 = r0.f14955h
            java.lang.String r15 = r0.f14956i
            ou.s r2 = r0.j
            l8.r r3 = r0.k
            l8.o r4 = r0.f14957l
            l8.b r5 = r0.f14958m
            l8.b r0 = r0.f14959n
            l8.n r6 = new l8.n
            r20 = r0
            r16 = r2
            r17 = r3
            r18 = r4
            r19 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r6
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.k.n0(l8.n):l8.n");
    }

    @Override // io.sentry.z0
    public i6 o() {
        return Z(null).o();
    }

    @Override // io.sentry.z0
    public t p() {
        return Z(null).p();
    }

    @Override // io.sentry.z0
    public void q() {
        Z(null).q();
    }

    @Override // io.sentry.z0
    public i6 r() {
        i6 i6VarR = ((z0) this.f12399r).r();
        if (i6VarR != null) {
            return i6VarR;
        }
        i6 i6VarR2 = ((z0) this.f12398g).r();
        return i6VarR2 != null ? i6VarR2 : ((z0) this.f12397d).r();
    }

    @Override // io.sentry.z0
    public Queue s() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((z0) this.f12397d).s());
        arrayList.addAll(((z0) this.f12398g).s());
        z0 z0Var = (z0) this.f12399r;
        arrayList.addAll(z0Var.s());
        Collections.sort(arrayList);
        Queue queueA = p3.a(z0Var.k().getMaxBreadcrumbs());
        queueA.addAll(arrayList);
        return queueA;
    }

    @Override // k8.e
    public void shutdown() {
        ((ConnectivityManager) this.f12397d).unregisterNetworkCallback((io.sentry.android.core.internal.util.b) this.f12399r);
    }

    @Override // io.sentry.z0
    public void t(k kVar) {
        Z(null).t(kVar);
    }

    public String toString() {
        switch (this.f12396a) {
            case 18:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f12397d);
                sb2.append('{');
                i4.b bVar = (i4.b) ((i4.b) this.f12398g).f11197d;
                String str = "";
                while (bVar != null) {
                    Object obj = bVar.f11196a;
                    sb2.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    bVar = (i4.b) bVar.f11197d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // io.sentry.z0
    public b5 u() {
        b5 b5VarU = ((z0) this.f12399r).u();
        if (b5VarU != null) {
            return b5VarU;
        }
        b5 b5VarU2 = ((z0) this.f12398g).u();
        return b5VarU2 != null ? b5VarU2 : ((z0) this.f12397d).u();
    }

    @Override // io.sentry.z0
    public k v() {
        return Z(null).v();
    }

    @Override // io.sentry.z0
    public i6 w(n3 n3Var) {
        return Z(null).w(n3Var);
    }

    @Override // io.sentry.z0
    public void x(String str) {
        Z(null).x(str);
    }

    @Override // io.sentry.z0
    public d1 y() {
        d1 d1VarY = ((z0) this.f12399r).y();
        if (!(d1VarY instanceof q2)) {
            return d1VarY;
        }
        d1 d1VarY2 = ((z0) this.f12398g).y();
        return !(d1VarY2 instanceof q2) ? d1VarY2 : ((z0) this.f12397d).y();
    }

    @Override // io.sentry.z0
    public Map z() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(((z0) this.f12397d).z());
        concurrentHashMap.putAll(((z0) this.f12398g).z());
        concurrentHashMap.putAll(((z0) this.f12399r).z());
        return concurrentHashMap;
    }

    public k(Handler handler, on.k kVar) {
        this.f12396a = 24;
        br.l.e(kVar, "persistenceManager");
        this.f12397d = handler;
        this.f12398g = kVar;
        this.f12399r = mq.w.f16945a;
    }

    @Override // io.sentry.z0
    public z0 clone() {
        return new k((z0) this.f12397d, ((z0) this.f12398g).clone(), ((z0) this.f12399r).clone(), 0);
    }

    public k(String str, int i10) {
        this.f12396a = i10;
        switch (i10) {
            case 14:
                com.google.android.exoplayer2.g0 g0Var = new com.google.android.exoplayer2.g0();
                g0Var.k = str;
                this.f12397d = new Format(g0Var);
                break;
            case 18:
                i4.b bVar = new i4.b();
                this.f12398g = bVar;
                this.f12399r = bVar;
                this.f12397d = str;
                break;
            default:
                v3 v3Var = v3.f12830a;
                this.f12397d = v3Var;
                this.f12398g = str;
                this.f12399r = new i.g0(v3Var.k());
                z4.d().a("SQLite");
                break;
        }
    }

    public k(a8.l lVar, q8.n nVar) {
        Object dVar;
        this.f12396a = 11;
        this.f12397d = lVar;
        this.f12398g = nVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            boolean z10 = q8.b.f20726a;
        } else {
            if (!q8.b.f20726a) {
                if (i10 != 26 && i10 != 27) {
                    dVar = new a5.d(3, true);
                } else {
                    dVar = new q8.m();
                }
            }
            this.f12399r = dVar;
        }
        dVar = new a5.d(3, false);
        this.f12399r = dVar;
    }

    public k(om.f fVar, g4.a aVar) {
        this.f12396a = 29;
        br.l.e(fVar, "hostProvider");
        br.l.e(aVar, "workspaceKeyProvider");
        this.f12397d = aVar;
        this.f12398g = fVar.p("com.survicate.surveys.surveyBaseUrl", "https://survey.survicate.com/");
        this.f12399r = fVar.p("com.survicate.surveys.respondentBaseUrl", "https://respondent.survicate.com/");
    }

    public k(hr.d dVar, Method[] methodArr, Method method) {
        this.f12396a = 15;
        br.l.e(dVar, "argumentRange");
        this.f12397d = dVar;
        this.f12398g = methodArr;
        this.f12399r = method;
    }

    public k(String str, HashMap map) {
        this.f12396a = 19;
        this.f12397d = str;
        this.f12398g = map;
        this.f12399r = new HashMap();
    }

    public k(FirebaseMessagingService firebaseMessagingService, i.g0 g0Var, ExecutorService executorService) {
        this.f12396a = 10;
        this.f12397d = executorService;
        this.f12398g = firebaseMessagingService;
        this.f12399r = g0Var;
    }

    public k(u5.i iVar) {
        this.f12396a = 23;
        this.f12397d = iVar;
    }

    public k(Context context, String str, pb.u0 u0Var) {
        this.f12396a = 26;
        pb.t tVar = new pb.t(0);
        tVar.f20427g = str;
        this.f12397d = context.getApplicationContext();
        this.f12398g = u0Var;
        this.f12399r = tVar;
    }

    public k(Context context, TypedArray typedArray) {
        this.f12396a = 25;
        this.f12397d = context;
        this.f12398g = typedArray;
    }

    public k(ConnectivityManager connectivityManager, q8.n nVar) {
        this.f12396a = 8;
        this.f12397d = connectivityManager;
        this.f12398g = nVar;
        io.sentry.android.core.internal.util.b bVar = new io.sentry.android.core.internal.util.b(1, this);
        this.f12399r = bVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), bVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(int i10) throws NoSuchPaddingException, NoSuchAlgorithmException {
        this(new io.sentry.protocol.t(), new n6(), (c) null);
        this.f12396a = i10;
        switch (i10) {
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f12397d = new h7.w1(16);
                long[] jArr = u.g0.f23071a;
                this.f12398g = new u.a0();
                this.f12399r = new df.c();
                break;
            case 12:
                break;
            case 16:
                this.f12399r = new df.c();
                break;
            case 22:
                this.f12397d = new WeakHashMap();
                this.f12398g = new WeakHashMap();
                this.f12399r = new WeakHashMap();
                break;
            case 28:
                byte[] bArrDecode = Base64.decode("YpwB4iJrU5AJSXUWdfPW6LXf8xtH/DFIZOw29NI5kN0=", 0);
                br.l.d(bArrDecode, "decode(...)");
                this.f12397d = bArrDecode;
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                br.l.d(cipher, "getInstance(...)");
                this.f12398g = cipher;
                this.f12399r = new SecureRandom();
                break;
            default:
                break;
        }
    }

    public k(io.sentry.protocol.t tVar, n6 n6Var, c cVar) {
        this.f12396a = 1;
        this.f12397d = tVar;
        this.f12398g = n6Var;
        this.f12399r = se.b.v(cVar, null, null, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(k kVar) {
        this((io.sentry.protocol.t) kVar.f12397d, (n6) kVar.f12398g, (c) kVar.f12399r);
        this.f12396a = 1;
    }

    public k(kg.r rVar, ee.f fVar, j4.c cVar, Set set) {
        this.f12396a = 6;
        this.f12397d = fVar;
        this.f12398g = rVar;
        this.f12399r = cVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            k0(str, 0, str.length(), 1, true, new hf.y(str, 2));
        }
    }

    public k(k2.d0 d0Var, k kVar) {
        this.f12396a = 21;
        this.f12397d = d0Var;
        this.f12398g = kVar;
        this.f12399r = d0Var.getValue();
    }
}
