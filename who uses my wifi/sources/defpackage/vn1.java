package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class vn1 implements zk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vn1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.zk3
    public final Object apply(Object obj) throws JSONException, IOException {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        boolean z;
        String str;
        float f;
        float f2;
        int iHeight;
        int i;
        String strP;
        int i2;
        int i3;
        WindowManager windowManager;
        DisplayMetrics displayMetrics;
        File file;
        File file2;
        yg3 yg3VarA;
        int i4 = 5;
        int i5 = 2;
        int i6 = -1;
        int i7 = 0;
        String str2 = null;
        switch (this.a) {
            case 0:
                Uri uri = (Uri) this.b;
                String str3 = (String) obj;
                return !TextUtils.isEmpty(str3) ? cr1.I3(uri, "nas", str3) : uri;
            case 1:
                g4 g4Var = (g4) this.b;
                JSONObject jSONObject = (JSONObject) obj;
                iz1 iz1Var = mz1.a;
                tw1 tw1Var = tw1.e;
                us0 us0Var = tw1Var.b;
                xb4 xb4Var = tw1Var.a;
                Context context = (Context) g4Var.j;
                try {
                    sharedPreferences = context.getSharedPreferences("google_ads_flags", 0);
                } catch (IllegalStateException unused) {
                    gi2.q0(5);
                    sharedPreferences = null;
                }
                if (sharedPreferences == null) {
                    return null;
                }
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                Objects.requireNonNull(xb4Var);
                ArrayList arrayList = (ArrayList) xb4Var.g;
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj2 = arrayList.get(i8);
                    i8++;
                    iz1 iz1Var2 = (iz1) obj2;
                    if (iz1Var2.a == 1) {
                        Object objA = iz1Var2.a(jSONObject);
                        switch (iz1Var2.e) {
                            case 0:
                                editorEdit.putBoolean(iz1Var2.b, ((Boolean) objA).booleanValue());
                                break;
                            case 1:
                                editorEdit.putInt(iz1Var2.b, ((Integer) objA).intValue());
                                break;
                            case 2:
                                editorEdit.putLong(iz1Var2.b, ((Long) objA).longValue());
                                break;
                            case 3:
                                editorEdit.putFloat(iz1Var2.b, ((Float) objA).floatValue());
                                break;
                            default:
                                editorEdit.putString(iz1Var2.b, (String) objA);
                                break;
                        }
                    }
                }
                if (jSONObject != null) {
                    editorEdit.putString("flag_configuration", jSONObject.toString());
                } else {
                    gi2.Z("Flag Json is null.");
                }
                us0 us0Var2 = tw1.e.b;
                editorEdit.commit();
                if (((Boolean) s02.c.w()).booleanValue() && !TextUtils.equals(context.getPackageName(), "com.google.android.gms")) {
                    try {
                        sharedPreferences2 = context.getSharedPreferences("google_adapter_flags", 0);
                    } catch (IllegalStateException unused2) {
                        gi2.q0(5);
                        sharedPreferences2 = null;
                    }
                    if (sharedPreferences2 != null) {
                        SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                        JSONObject jSONObject2 = new JSONObject();
                        Iterator<String> itKeys = jSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            if (next.startsWith("adapter:")) {
                                try {
                                    jSONObject2.put(next, jSONObject.get(next));
                                } catch (JSONException unused3) {
                                }
                            }
                        }
                        editorEdit2.putString("flag_configuration", jSONObject2.toString());
                        editorEdit2.commit();
                    }
                }
                SharedPreferences sharedPreferences3 = (SharedPreferences) g4Var.h;
                if (sharedPreferences3 == null) {
                    return null;
                }
                SharedPreferences.Editor editorEdit3 = sharedPreferences3.edit();
                hg4.C.k.getClass();
                editorEdit3.putLong("js_last_update", System.currentTimeMillis()).apply();
                return null;
            case 2:
                au2 au2Var = (au2) this.b;
                ag2 ag2Var = (ag2) obj;
                ag2Var.v0("/result", au2Var.h);
                sg2 sg2VarE0 = ag2Var.e0();
                su1 su1Var = new su1(au2Var.c, null);
                jz2 jz2Var = au2Var.i;
                eb3 eb3Var = au2Var.j;
                mv2 mv2Var = au2Var.d;
                vt2 vt2Var = au2Var.a;
                sg2VarE0.p(null, vt2Var, vt2Var, vt2Var, vt2Var, false, null, su1Var, null, null, jz2Var, eb3Var, mv2Var, null, null, null, null, null, null, null, null);
                return ag2Var;
            case 3:
                return ((ai2) this.b).z();
            case 4:
                e33 e33Var = (e33) this.b;
                l83 l83Var = (l83) e33Var.b;
                xe4 xe4Var = l83Var.f;
                xe4[] xe4VarArr = xe4Var.l;
                if (xe4VarArr == null) {
                    str = xe4Var.f;
                    z = xe4Var.n;
                } else {
                    z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    str = null;
                    for (xe4 xe4Var2 : xe4VarArr) {
                        boolean z4 = xe4Var2.n;
                        if (!z4 && !z2) {
                            str = xe4Var2.f;
                            z2 = true;
                        }
                        if (z4) {
                            if (!z3) {
                                z = true;
                            }
                            z3 = true;
                        }
                        if (!z2 || !z3) {
                        }
                    }
                }
                Context context2 = (Context) e33Var.c;
                Resources resources = context2.getResources();
                if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
                    f = 0.0f;
                    f2 = 0.0f;
                    iHeight = 0;
                    i = 0;
                    strP = null;
                } else {
                    gd2 gd2Var = (gd2) e33Var.e;
                    float f3 = displayMetrics.density;
                    f = 0.0f;
                    i = displayMetrics.widthPixels;
                    iHeight = displayMetrics.heightPixels;
                    strP = gd2Var.g().p();
                    f2 = f3;
                }
                iz1 iz1Var3 = mz1.de;
                tw1 tw1Var2 = tw1.e;
                y20 y20VarB = (!((Boolean) tw1Var2.c.a(iz1Var3)).booleanValue() || Build.VERSION.SDK_INT < 35) ? null : e33Var.b(f2);
                if (((Boolean) tw1Var2.c.a(mz1.ee)).booleanValue() && (i3 = Build.VERSION.SDK_INT) <= 34 && i3 >= 28 && (windowManager = (WindowManager) context2.getSystemService("window")) != null) {
                    if (i3 >= 30) {
                        WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                        int iWidth = currentWindowMetrics.getBounds().width();
                        iHeight = currentWindowMetrics.getBounds().height();
                        i = iWidth;
                    } else {
                        Point point = new Point();
                        windowManager.getDefaultDisplay().getRealSize(point);
                        i = point.x;
                        iHeight = point.y;
                    }
                    y20VarB = e33Var.b(f2);
                }
                int i9 = i;
                StringBuilder sb = new StringBuilder();
                if (xe4VarArr != null) {
                    boolean z5 = false;
                    for (xe4 xe4Var3 : xe4VarArr) {
                        if (xe4Var3.n) {
                            z5 = true;
                        } else {
                            if (sb.length() != 0) {
                                sb.append("|");
                            }
                            int i10 = xe4Var3.j;
                            if (i10 == -1) {
                                i10 = f2 != f ? (int) (xe4Var3.k / f2) : -1;
                            }
                            sb.append(i10);
                            sb.append("x");
                            int i11 = xe4Var3.g;
                            if (i11 == -2) {
                                i11 = f2 != f ? (int) (xe4Var3.h / f2) : -2;
                            }
                            sb.append(i11);
                        }
                    }
                    if (z5) {
                        if (sb.length() != 0) {
                            i2 = 0;
                            sb.insert(0, "|");
                        } else {
                            i2 = 0;
                        }
                        sb.insert(i2, "320x50");
                    }
                }
                return new l33(xe4Var, str, z, sb.toString(), f2, i9, iHeight, strP, l83Var.r, y20VarB);
            case 5:
                ((s33) this.b).a.d("AppSetIdInfoSignal", (Exception) obj);
                return new t33(str2, i6, i7);
            case 6:
                ((gd2) ((k33) this.b).b).d("AppSetIdInfoGmscoreSignal", (Exception) obj);
                return new t33(str2, i6, i5);
            case 7:
                ((o63) this.b).a.d("TrustlessTokenSignal", (Exception) obj);
                return new j33(str2, i4);
            case 8:
                e93 e93Var = (e93) this.b;
                e93Var.c = (el2) obj;
                return e93Var;
            case 9:
                return (kh3) this.b;
            case 10:
                kh3 kh3Var = (kh3) obj;
                ((oh3) this.b).f.set(kh3Var);
                return kh3Var;
            case 11:
                if (((fj3) this.b).a.b((jh3) obj)) {
                    return new Integer(0);
                }
                throw new zi3();
            case 12:
                lj3 lj3Var = (lj3) this.b;
                jh3 jh3Var = (jh3) obj;
                gk3 gk3Var = lj3Var.e;
                if (!lj3Var.c.a(jh3Var) || jh3Var == null) {
                    gk3Var.b(15003);
                    throw new rg(1);
                }
                rj3 rj3Var = lj3Var.b;
                switch (rj3Var.a) {
                    case 0:
                        file = ((lg3) rj3Var.d.d()).a;
                        break;
                    default:
                        file = ((lg3) rj3Var.d.d()).a;
                        break;
                }
                if (Build.VERSION.SDK_INT >= 34) {
                    file.setReadOnly();
                }
                File file3 = lj3Var.d;
                fv1 fv1VarA = jh3Var.A();
                switch (rj3Var.a) {
                    case 0:
                        file2 = rj3Var.c.a;
                        break;
                    default:
                        file2 = rj3Var.c.a;
                        break;
                }
                gk3Var.e(15002, new gi(lj3Var, new g4(fv1VarA, file, file2, file3), jh3Var, 21));
                return null;
            case 13:
                mj3 mj3Var = (mj3) this.b;
                byte[] bArr = (byte[]) obj;
                nb nbVar = new nb(3);
                fk3 fk3VarA = mj3Var.e.a(20102);
                try {
                    try {
                        fk3VarA.a();
                        synchronized (mj3Var.f) {
                            mj3Var.j = cj1.a(nbVar, bArr);
                        }
                        fk3VarA.c();
                        return null;
                    } catch (hp1 e) {
                        e = e;
                        fk3VarA.b(e);
                        throw new rg("r: 2", e);
                    } catch (kp1 e2) {
                        e = e2;
                        fk3VarA.b(e);
                        throw new rg("r: 2", e);
                    } catch (Throwable th) {
                        fk3VarA.b(th);
                        throw th;
                    }
                } catch (Throwable th2) {
                    fk3VarA.c();
                    throw th2;
                }
            case 14:
                pj3 pj3Var = (pj3) this.b;
                gg3 gg3Var = (gg3) obj;
                gk3 gk3Var2 = pj3Var.d;
                if (gg3Var.a != 200) {
                    ((wg3) gk3Var2.a).b(20002, -1L, null, new String(yb.z(), StandardCharsets.UTF_8));
                    return pj3.a(7);
                }
                try {
                    String str4 = new String(gg3Var.b);
                    if (TextUtils.isEmpty(str4)) {
                        gk3Var2.b(20004);
                        yg3VarA = pj3.a(8);
                    } else {
                        ku1 ku1VarB = ku1.B(m54.M(str4, true), h54.a());
                        if (!ku1VarB.A().C() || !ku1VarB.A().A()) {
                            gk3Var2.b(20004);
                            yg3VarA = pj3.a(8);
                        } else if (((qj3) pj3Var.h).a(ku1VarB)) {
                            xg3 xg3VarD = yg3.D();
                            zg3 zg3VarD = jh3.D();
                            dv1 dv1VarB = ku1VarB.A().B();
                            zg3VarD.b();
                            ((jh3) zg3VarD.g).G(dv1VarB);
                            xg3VarD.b();
                            ((yg3) xg3VarD.g).E((jh3) zg3VarD.d());
                            a54 a54VarD = ku1VarB.A().D();
                            xg3VarD.b();
                            ((yg3) xg3VarD.g).F(a54VarD);
                            xg3VarD.b();
                            ((yg3) xg3VarD.g).I(2);
                            yg3VarA = (yg3) xg3VarD.d();
                        } else {
                            gk3Var2.b(20006);
                            yg3VarA = pj3.a(12);
                        }
                    }
                    return yg3VarA;
                } catch (Throwable th3) {
                    gk3Var2.c(20005, th3);
                    return pj3.a(6);
                }
            default:
                zj3 zj3Var = (zj3) this.b;
                String str5 = (String) obj;
                if (!yc0.s(str5)) {
                    return str5;
                }
                File file4 = new File(zj3Var.b.getPackageResourcePath());
                if (file4.exists() && file4.canRead()) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file4);
                        try {
                            byte[] bArr2 = new byte[16384];
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                            for (int i12 = fileInputStream.read(bArr2); i12 != -1; i12 = fileInputStream.read(bArr2)) {
                                messageDigest.update(bArr2, 0, i12);
                            }
                            jo3 jo3VarF = jo3.f.f();
                            byte[] bArrDigest = messageDigest.digest();
                            String strG = jo3VarF.g(bArrDigest.length, bArrDigest);
                            fileInputStream.close();
                            return strG;
                        } finally {
                        }
                    } catch (IOException | UnsupportedOperationException | NoSuchAlgorithmException unused4) {
                    }
                }
                return "";
        }
    }
}
