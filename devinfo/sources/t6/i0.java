package t6;

import a0.x0;
import android.app.Activity;
import android.app.UiModeManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.database.SQLException;
import android.graphics.Color;
import android.net.Uri;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.ads.ut;
import com.google.android.gms.internal.measurement.d5;
import i2.d1;
import i2.w1;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p4.w0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile o7.d f34368a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile o7.c f34369b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f34370c;

    public static final String a(Object[] objArr, int i4, int i10, zj.g gVar) {
        StringBuilder sb2 = new StringBuilder((i10 * 3) + 2);
        sb2.append("[");
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i4 + i11];
            if (obj == gVar) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        String string = sb2.toString();
        nk.k.d(string, "toString(...)");
        return string;
    }

    public static final boolean b(byte[] bArr, int i4, byte[] bArr2, int i10, int i11) {
        nk.k.e(bArr, "a");
        nk.k.e(bArr2, "b");
        for (int i12 = 0; i12 < i11; i12++) {
            if (bArr[i12 + i4] != bArr2[i12 + i10]) {
                return false;
            }
        }
        return true;
    }

    public static final Object c(i2.i iVar, mk.a aVar, ek.j jVar) {
        Object obj;
        d1 d1VarR;
        Object objN;
        com.google.android.gms.internal.consent_sdk.a0 a0Var;
        i1.m mVar = (i1.m) iVar;
        boolean z3 = mVar.f25554a.f25565n;
        if (z3) {
            if (!z3) {
                f2.a.b("visitAncestors called on an unattached node");
            }
            i1.m mVar2 = mVar.f25554a.f25558e;
            i2.e0 e0VarS = i2.k.s(iVar);
            loop0: while (true) {
                obj = null;
                if (e0VarS == null) {
                    break;
                }
                if ((((i1.m) e0VarS.G.g).f25557d & 524288) != 0) {
                    while (mVar2 != null) {
                        if ((mVar2.f25556c & 524288) != 0) {
                            i1.m mVarE = mVar2;
                            w0.e eVar = null;
                            while (mVarE != null) {
                                if (mVarE instanceof m2.a) {
                                    obj = mVarE;
                                    break loop0;
                                }
                                if ((mVarE.f25556c & 524288) != 0 && (mVarE instanceof i2.j)) {
                                    int i4 = 0;
                                    for (i1.m mVar3 = ((i2.j) mVarE).f25691p; mVar3 != null; mVar3 = mVar3.f25559f) {
                                        if ((mVar3.f25556c & 524288) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                mVarE = mVar3;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new w0.e(new i1.m[16]);
                                                }
                                                if (mVarE != null) {
                                                    eVar.b(mVarE);
                                                    mVarE = null;
                                                }
                                                eVar.b(mVar3);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                mVarE = i2.k.e(eVar);
                            }
                        }
                        mVar2 = mVar2.f25558e;
                    }
                }
                e0VarS = e0VarS.v();
                mVar2 = (e0VarS == null || (a0Var = e0VarS.G) == null) ? null : (w1) a0Var.f19259f;
            }
            m2.a aVar2 = (m2.a) obj;
            if (aVar2 != null && (objN = aVar2.n((d1VarR = i2.k.r(iVar)), new c2.c(12, aVar, d1VarR), jVar)) == dk.a.f22275a) {
                return objN;
            }
        }
        return yj.u.f37649a;
    }

    public static final void d(long j, long j8, long j9) {
        if ((j8 | j9) < 0 || j8 > j || j - j8 < j9) {
            StringBuilder sbY = d.h.y(j, "size=", " offset=");
            sbY.append(j8);
            sbY.append(" byteCount=");
            sbY.append(j9);
            throw new ArrayIndexOutOfBoundsException(sbY.toString());
        }
    }

    public static p4.z e(w0 w0Var, m1.g gVar, List list, cl.d dVar, mk.a aVar) {
        nk.k.e(list, "migrations");
        p4.d0 d0Var = new p4.d0(w0Var, p4.c0.f31176a, aVar);
        p4.c cVar = gVar;
        if (gVar == null) {
            cVar = new ja.c();
        }
        return new p4.z(d0Var, cm.g.s(new al.p(list, (ck.c) null, 26)), cVar, dVar);
    }

    public static final void g(d6.a aVar, String str) throws Exception {
        nk.k.e(aVar, "<this>");
        nk.k.e(str, "sql");
        d6.c cVarS = aVar.S(str);
        try {
            cVarS.P();
            d5.c(cVarS, null);
        } finally {
        }
    }

    public static final int h(v2.k kVar, int i4) {
        boolean z3 = nk.k.f(kVar.f35780a, v2.k.f35776b.f35780a) >= 0;
        boolean z10 = i4 == 1;
        if (z10 && z3) {
            return 3;
        }
        if (z3) {
            return 1;
        }
        return z10 ? 2 : 0;
    }

    public static int i(int i4, View view) {
        Context context = view.getContext();
        TypedValue typedValueB = ii.a.B(view.getContext(), i4, view.getClass().getCanonicalName());
        int i10 = typedValueB.resourceId;
        return i10 != 0 ? context.getColor(i10) : typedValueB.data;
    }

    public static int j(Context context, int i4, int i10) {
        Integer numValueOf;
        TypedValue typedValueY = ii.a.y(i4, context);
        if (typedValueY != null) {
            int i11 = typedValueY.resourceId;
            numValueOf = Integer.valueOf(i11 != 0 ? context.getColor(i11) : typedValueY.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i10;
    }

    public static final boolean k() {
        Boolean boolValueOf;
        Boolean bool = f34370c;
        if (bool != null) {
            return bool.booleanValue();
        }
        Context context = pk.a.f32022a;
        nk.k.b(context);
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
        if (uiModeManager == null) {
            boolValueOf = Boolean.valueOf(zHasSystemFeature);
        } else {
            boolValueOf = Boolean.valueOf(uiModeManager.getCurrentModeType() == 4 || zHasSystemFeature);
        }
        f34370c = boolValueOf;
        return boolValueOf.booleanValue();
    }

    public static final boolean l(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }

    public static boolean m(int i4) {
        if (i4 == 0) {
            return false;
        }
        ThreadLocal threadLocal = v3.a.f35791a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i4);
        int iGreen = Color.green(i4);
        int iBlue = Color.blue(i4);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d10 = iRed / 255.0d;
        double dPow = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        double d11 = iGreen / 255.0d;
        double dPow2 = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        double d12 = iBlue / 255.0d;
        double dPow3 = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d13 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d13;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d13 / 100.0d > 0.5d;
    }

    public static final boolean n(Context context) {
        nk.k.e(context, "context");
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static int o(float f10, int i4, int i10) {
        return v3.a.b(v3.a.d(i10, Math.round(Color.alpha(i10) * f10)), i4);
    }

    public static final long p(long j, float f10) {
        return (Float.isNaN(f10) || f10 >= 1.0f) ? j : p1.s.b(j, p1.s.d(j) * f10);
    }

    public static o7.c q(Context context) {
        o7.c cVar;
        Context applicationContext = context.getApplicationContext();
        o7.c cVar2 = f34369b;
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (o7.c.class) {
            try {
                cVar = f34369b;
                if (cVar == null) {
                    cVar = new o7.c(0, new f7.d(applicationContext));
                    f34369b = cVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    public static rl.m r(String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        nk.k.e(strArr2, "inputNamesAndValues");
        if (strArr2.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        int length = strArr3.length;
        int i4 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (strArr3[i10] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr3[i10] = vk.i.V0(strArr2[i10]).toString();
        }
        int iE = com.bumptech.glide.e.E(0, strArr3.length - 1, 2);
        if (iE >= 0) {
            while (true) {
                String str = strArr3[i4];
                String str2 = strArr3[i4 + 1];
                com.bumptech.glide.d.r(str);
                com.bumptech.glide.d.s(str2, str);
                if (i4 == iE) {
                    break;
                }
                i4 += 2;
            }
        }
        return new rl.m(strArr3);
    }

    public static final void s(Context context, String str) {
        Intent data = new Intent("android.intent.action.VIEW").addFlags(268435456).addCategory("android.intent.category.BROWSABLE").setData(Uri.parse(str));
        nk.k.d(data, "setData(...)");
        try {
            context.startActivity(data);
        } catch (ActivityNotFoundException | SecurityException unused) {
        }
    }

    public static String t(File file) throws NoSuchAlgorithmException, IOException {
        int i4;
        if (file.isFile()) {
            byte[] bArr = new byte[Segment.SHARE_MINIMUM];
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                while (true) {
                    int i10 = bufferedInputStream.read(bArr, 0, Segment.SHARE_MINIMUM);
                    if (i10 == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i10);
                }
                if (!TextUtils.isEmpty(null)) {
                    throw null;
                }
                bufferedInputStream.close();
                byte[] bArrDigest = messageDigest.digest();
                if (bArrDigest != null && bArrDigest.length > 0) {
                    char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
                    char[] cArr2 = new char[bArrDigest.length * 2];
                    int i11 = 0;
                    for (byte b10 : bArrDigest) {
                        int i12 = i11 + 1;
                        cArr2[i11] = cArr[(b10 >>> 4) & 15];
                        i11 += 2;
                        cArr2[i12] = cArr[b10 & 15];
                    }
                    return new String(cArr2);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return "";
            }
        }
        return "";
    }

    public static final void u(Object[] objArr, int i4, int i10) {
        nk.k.e(objArr, "<this>");
        while (i4 < i10) {
            objArr[i4] = null;
            i4++;
        }
    }

    public static final void v(int i4, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error code: " + i4);
        if (str != null) {
            sb2.append(", message: ".concat(str));
        }
        throw new SQLException(sb2.toString());
    }

    public static final String w(int i4) {
        if (i4 == 0) {
            return "0";
        }
        char[] cArr = im.b.f26018a;
        int i10 = 0;
        char[] cArr2 = {cArr[(i4 >> 28) & 15], cArr[(i4 >> 24) & 15], cArr[(i4 >> 20) & 15], cArr[(i4 >> 16) & 15], cArr[(i4 >> 12) & 15], cArr[(i4 >> 8) & 15], cArr[(i4 >> 4) & 15], cArr[i4 & 15]};
        while (i10 < 8 && cArr2[i10] == '0') {
            i10++;
        }
        return vk.p.n0(cArr2, i10, 8);
    }

    public static int x(int i4) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i10 = 0; i10 < 6; i10++) {
            int i11 = iArr[i10];
            int i12 = i11 - 1;
            if (i11 == 0) {
                throw null;
            }
            if (i12 == i4) {
                return i11;
            }
        }
        return 1;
    }

    public static Object y(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th2) {
            za.i.f("Unexpected exception.", th2);
            ut.a(context).d("StrictModeUtil.runWithLaxStrictMode", th2);
            return null;
        }
    }

    public static /* synthetic */ boolean z(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, com.google.android.gms.internal.play_billing.k0 k0Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(k0Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(k0Var) != obj && atomicReferenceFieldUpdater.get(k0Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public void f(j0 j0Var) {
        nk.k.e(j0Var, "request");
        List listS = cm.g.s(j0Var);
        u6.r rVar = (u6.r) this;
        if (listS.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        u6.l lVar = new u6.l(rVar, listS);
        if (!lVar.f35163i) {
            pd.b.l(rVar.f35176e.f34322m, "EnqueueRunnable_" + l.f34379a.name(), (c7.l) ((x0) rVar.g).f148e, new a6.e(24, lVar));
            return;
        }
        v.e().h(u6.l.j, "Already enqueued work ids (" + TextUtils.join(", ", lVar.g) + ")");
    }
}
