package nh;

import android.animation.TimeInterpolator;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import android.widget.Toast;
import com.applovin.shadow.okio.Utf8;
import com.bumptech.glide.g;
import com.google.android.gms.internal.ads.kx0;
import com.google.android.gms.internal.ads.lx0;
import com.google.android.gms.internal.ads.mx0;
import com.google.android.gms.internal.ads.rg0;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.y21;
import com.liuzh.deviceinfo.R;
import d3.n;
import d3.o;
import e4.c2;
import hm.h;
import j1.q;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.List;
import nk.k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t6.i0;
import u0.c;
import u0.e2;
import ua.j;
import v3.b;
import va.s;
import wb.e;
import za.i;
import zj.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a {
    public static Bundle A(Context context, String str) {
        JSONArray jSONArray;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (TextUtils.isEmpty(str)) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e2) {
                i.d("JSON parsing error", e2);
            }
        }
        if (jSONArray == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i4);
            String strOptString = jSONObjectOptJSONObject.optString("bk");
            String strOptString2 = jSONObjectOptJSONObject.optString("sk");
            int iOptInt = jSONObjectOptJSONObject.optInt("type", -1);
            int i10 = iOptInt != 0 ? iOptInt != 1 ? iOptInt != 2 ? 0 : 3 : 2 : 1;
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && i10 != 0) {
                List listR = rg0.k(new y21('/')).r(strOptString2);
                if (listR.size() > 2 || listR.isEmpty()) {
                    obj = null;
                } else {
                    if (listR.size() == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str2 = (String) listR.get(0);
                    } else {
                        sharedPreferences = context.getSharedPreferences((String) listR.get(0), 0);
                        str2 = (String) listR.get(1);
                    }
                    obj = sharedPreferences.getAll().get(str2);
                }
                if (obj != null) {
                    int i11 = i10 - 1;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(strOptString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(strOptString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(strOptString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(strOptString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(strOptString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    public static final void a(int i4, View view, b bVar) {
        k.e(view, "target");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = bVar.f35793a + i4;
        marginLayoutParams.rightMargin = bVar.f35795c + i4;
        view.setLayoutParams(marginLayoutParams);
    }

    public static final void c(Context context, String str, String str2, boolean z3) {
        k.e(context, "context");
        k.e(str, "label");
        k.e(str2, "text");
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (clipboardManager != null) {
            try {
                clipboardManager.setPrimaryClip(ClipData.newPlainText(str, str2));
                if (z3) {
                    Toast.makeText(context, R.string.bu_copied_to_clipboard, 0).show();
                }
            } catch (SecurityException unused) {
                if (z3) {
                    Toast.makeText(context, R.string.bu_copy_toclipboard_failed_no_permission, 0).show();
                }
            }
        }
    }

    public static final void d(Context context, String str) {
        k.e(context, "context");
        k.e(str, "text");
        c(context, "", str, true);
    }

    public static final float e(float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f10) & 8589934591L) / 3)) + 709952852);
        float f11 = fIntBitsToFloat - ((fIntBitsToFloat - (f10 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f11 - ((f11 - (f10 / (f11 * f11))) * 0.33333334f);
    }

    public static q f(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new q(ub.a.d(view));
        }
        return null;
    }

    public static float g(int i4, String[] strArr) throws NumberFormatException {
        float f10 = Float.parseFloat(strArr[i4]);
        if (f10 >= 0.0f && f10 <= 1.0f) {
            return f10;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f10);
    }

    public static final long h(double d10) {
        return p(4294967296L, (float) d10);
    }

    public static final long i(int i4) {
        return p(4294967296L, i4);
    }

    public static final void j(Context context, String str) {
        k.e(str, "pkgName");
        k(context, str, true);
    }

    public static final void k(Context context, String str, boolean z3) {
        k.e(str, "pkgName");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setData(Uri.parse("package:".concat(str)));
        intent.addFlags(335577088);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            if (z3) {
                Toast.makeText(context, R.string.bu_activity_not_found, 0).show();
            }
        } catch (SecurityException unused2) {
            if (z3) {
                Toast.makeText(context, R.string.bu_permission_denied, 0).show();
            }
        } catch (RuntimeException unused3) {
        }
    }

    public static final boolean l(Context context, String str) {
        k.e(context, "context");
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0) != null;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean m(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static void n(InputConnection inputConnection, EditorInfo editorInfo, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static boolean o() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static final long p(long j, float f10) {
        long jFloatToRawIntBits = j | (Float.floatToRawIntBits(f10) & 4294967295L);
        o[] oVarArr = n.f21970b;
        return jFloatToRawIntBits;
    }

    public static String q(X509Certificate x509Certificate) throws NoSuchAlgorithmException {
        StringBuilder sb2 = new StringBuilder("sha256/");
        h hVar = h.f25175d;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        k.d(encoded, "getEncoded(...)");
        int length = encoded.length;
        int i4 = 0;
        i0.d(encoded.length, 0, length);
        byte[] bArrS = m.S(0, length, encoded);
        h hVar2 = new h(bArrS);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArrS, 0, hVar2.a());
        byte[] bArrDigest = messageDigest.digest();
        k.b(bArrDigest);
        new h(bArrDigest);
        byte[] bArr = hm.a.f25161a;
        k.e(bArr, "map");
        byte[] bArr2 = new byte[((bArrDigest.length + 2) / 3) * 4];
        int length2 = bArrDigest.length - (bArrDigest.length % 3);
        int i10 = 0;
        while (i4 < length2) {
            byte b10 = bArrDigest[i4];
            int i11 = i4 + 2;
            byte b11 = bArrDigest[i4 + 1];
            i4 += 3;
            byte b12 = bArrDigest[i11];
            bArr2[i10] = bArr[(b10 & 255) >> 2];
            bArr2[i10 + 1] = bArr[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i12 = i10 + 3;
            bArr2[i10 + 2] = bArr[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i10 += 4;
            bArr2[i12] = bArr[b12 & Utf8.REPLACEMENT_BYTE];
        }
        int length3 = bArrDigest.length - length2;
        if (length3 == 1) {
            byte b13 = bArrDigest[i4];
            bArr2[i10] = bArr[(b13 & 255) >> 2];
            bArr2[i10 + 1] = bArr[(b13 & 3) << 4];
            bArr2[i10 + 2] = 61;
            bArr2[i10 + 3] = 61;
        } else if (length3 == 2) {
            int i13 = i4 + 1;
            byte b14 = bArrDigest[i4];
            byte b15 = bArrDigest[i13];
            bArr2[i10] = bArr[(b14 & 255) >> 2];
            bArr2[i10 + 1] = bArr[((b14 & 3) << 4) | ((b15 & 255) >> 4)];
            bArr2[i10 + 2] = bArr[(b15 & 15) << 2];
            bArr2[i10 + 3] = 61;
        }
        sb2.append(new String(bArr2, vk.a.f36267a));
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:244:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018f A[PHI: r6 r20 r21 r22 r23 r24 r25 r26 r27 r28 r29
  0x018f: PHI (r6v12 j1.d) = (r6v11 j1.d), (r6v13 j1.d) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
  0x018f: PHI (r20v6 boolean) = (r20v5 boolean), (r20v7 boolean) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
  0x018f: PHI (r21v5 r2.a) = (r21v4 r2.a), (r21v6 r2.a) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
  0x018f: PHI (r22v5 s2.e) = (r22v4 s2.e), (r22v6 s2.e) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
  0x018f: PHI (r23v13 j1.f) = (r23v12 j1.f), (r23v14 j1.f) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
  0x018f: PHI (r24v6 j1.o) = (r24v5 j1.o), (r24v7 j1.o) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
  0x018f: PHI (r25v6 java.lang.Boolean) = (r25v5 java.lang.Boolean), (r25v7 java.lang.Boolean) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
  0x018f: PHI (r26v13 p2.h) = (r26v12 p2.h), (r26v14 p2.h) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
  0x018f: PHI (r27v6 boolean) = (r27v5 boolean), (r27v7 boolean) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
  0x018f: PHI (r28v7 boolean) = (r28v6 boolean), (r28v8 boolean) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]
  0x018f: PHI (r29v6 java.lang.Integer) = (r29v5 java.lang.Integer), (r29v7 java.lang.Integer) binds: [B:10:0x004c, B:68:0x018d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void r(android.view.ViewStructure r39, i2.e0 r40, android.view.autofill.AutofillId r41, java.lang.String r42, q2.b r43) {
        /*
            Method dump skipped, instructions count: 1057
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nh.a.r(android.view.ViewStructure, i2.e0, android.view.autofill.AutofillId, java.lang.String, q2.b):void");
    }

    public static final void s(e2 e2Var, c cVar, int i4) {
        while (true) {
            int i10 = e2Var.f34798v;
            if (i4 > i10 && i4 < e2Var.f34797u) {
                return;
            }
            if (i10 == 0 && i4 == 0) {
                return;
            }
            e2Var.M();
            if (e2Var.y(e2Var.f34798v)) {
                cVar.j();
            }
            e2Var.j();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e2, code lost:
    
        r0 = com.bumptech.glide.d.c(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e6, code lost:
    
        com.google.android.gms.internal.measurement.d5.c(r2, null);
        r10 = r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static z5.j t(d6.a r31, java.lang.String r32) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nh.a.t(d6.a, java.lang.String):z5.j");
    }

    public static int v(Context context, int i4, int i10) {
        TypedValue typedValueY = ii.a.y(i4, context);
        return (typedValueY == null || typedValueY.type != 16) ? i10 : typedValueY.data;
    }

    public static TimeInterpolator w(Context context, int i4, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i4, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!m(strValueOf, "cubic-bezier") && !m(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!m(strValueOf, "cubic-bezier")) {
            if (m(strValueOf, "path")) {
                return new PathInterpolator(e.l(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return new PathInterpolator(g(0, strArrSplit), g(1, strArrSplit), g(2, strArrSplit), g(3, strArrSplit));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    public static final b x(c2 c2Var) {
        k.e(c2Var, "<this>");
        b bVarG = c2Var.f22315a.g(647);
        k.d(bVarG, "getInsets(...)");
        return bVarG;
    }

    public static int y(int i4) {
        return (int) (Integer.rotateLeft((int) (i4 * (-862048943)), 15) * 461845907);
    }

    public static void z(Context context) throws IOException {
        if (((Boolean) s.f36163e.f36166c.a(sk.W6)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            kx0 kx0VarF = kx0.f(context);
            lx0 lx0VarF = lx0.f(context);
            mx0 mx0VarG = mx0.g(context);
            kx0VarF.h();
            synchronized (kx0.class) {
                kx0VarF.c(true);
            }
            lx0VarF.h();
            mx0VarG.a();
        } catch (IOException e2) {
            j.C.f35265h.f("clearStorageOnIdlessMode", e2);
        }
        try {
            if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
            } else {
                throw new IOException("Failed to remove query_info_shared_prefs");
            }
        } catch (IOException e10) {
            j.C.f35265h.f("clearStorageOnIdlessMode_scar", e10);
        }
    }

    public void b(Context context, g gVar) {
    }

    public void u(Context context, com.bumptech.glide.b bVar, com.bumptech.glide.k kVar) {
    }
}
