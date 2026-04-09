package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class yc0 {
    public static final gs3 a;
    public static final gs3 b;
    public static final int[] c = {1, 2, 3, 6};
    public static final int[] d = {48000, 44100, 32000};
    public static final int[] e = {24000, 22050, 16000};
    public static final int[] f = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] g = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] h = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final rv1 i = new rv1(13);
    public static final zq2 j = new zq2(12);
    public static final p63 k = new p63(2);
    public static final p63 l = new p63(17);
    public static boolean m = true;

    static {
        int i2 = 3;
        a = new gs3("RESUME_TOKEN", i2);
        b = new gs3("NULL", i2);
    }

    public yc0(Context context) {
        if (pu1.g == null) {
            synchronized (pu1.class) {
                try {
                    if (pu1.g == null) {
                        bu1 bu1Var = sv1.f.b;
                        s62 s62Var = new s62();
                        bu1Var.getClass();
                        pu1.g = (kh2) new qp1(bu1Var, context, s62Var).d(context, false);
                    }
                } finally {
                }
            }
        }
        context.getApplicationContext();
    }

    public static final void a(Closeable closeable, Throwable th) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                gi2.a(th, th2);
            }
        }
    }

    public static b4 e(j40 j40Var, u80 u80Var) {
        return new b4(0, z40.a(j40Var, u80Var, 1.0f, fr.g, false));
    }

    public static c4 f(i40 i40Var, u80 u80Var, boolean z) {
        return new c4(2, z40.a(i40Var, u80Var, z ? l41.c() : 1.0f, pz.i, false));
    }

    public static b4 g(j40 j40Var, u80 u80Var, int i2) {
        h80 h80Var = new h80(1);
        h80Var.g = i2;
        ArrayList arrayListA = z40.a(j40Var, u80Var, 1.0f, h80Var, false);
        for (int i3 = 0; i3 < arrayListA.size(); i3++) {
            w40 w40Var = (w40) arrayListA.get(i3);
            qz qzVar = (qz) w40Var.b;
            qz qzVar2 = (qz) w40Var.c;
            if (qzVar != null && qzVar2 != null) {
                float[] fArr = qzVar.a;
                int length = fArr.length;
                float[] fArr2 = qzVar2.a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f2 = Float.NaN;
                    int i4 = 0;
                    for (int i5 = 0; i5 < length2; i5++) {
                        float f3 = fArr3[i5];
                        if (f3 != f2) {
                            fArr3[i4] = f3;
                            i4++;
                            f2 = fArr3[i5];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i4);
                    w40Var = new w40(qzVar.b(fArrCopyOfRange), qzVar2.b(fArrCopyOfRange));
                }
            }
            arrayListA.set(i3, w40Var);
        }
        return new b4(1, arrayListA);
    }

    public static b4 h(i40 i40Var, u80 u80Var) {
        return new b4(2, z40.a(i40Var, u80Var, 1.0f, pz.j, false));
    }

    public static b4 i(j40 j40Var, u80 u80Var) {
        return new b4(3, z40.a(j40Var, u80Var, l41.c(), pz.l, true));
    }

    public static final void j(Object[] objArr, int i2, int i3) {
        i30.m(objArr, "<this>");
        while (i2 < i3) {
            objArr[i2] = null;
            i2++;
        }
    }

    public static final void k(kd kdVar, oj ojVar, boolean z) {
        Object obj = kd.l.get(kdVar);
        Throwable thF = kdVar.f(obj);
        Object objK = thF != null ? bd2.k(thF) : kdVar.g(obj);
        if (!z) {
            ojVar.e(objK);
            return;
        }
        i30.k(ojVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        cp cpVar = (cp) ojVar;
        qj qjVar = cpVar.j;
        Object obj2 = cpVar.l;
        hk context = qjVar.getContext();
        Object objY = wl2.y(context, obj2);
        x31 x31VarY = objY != wl2.i ? bd2.y(qjVar, context, objY) : null;
        try {
            qjVar.e(objK);
            if (x31VarY == null || x31VarY.R()) {
                wl2.v(context, objY);
            }
        } catch (Throwable th) {
            if (x31VarY == null || x31VarY.R()) {
                wl2.v(context, objY);
            }
            throw th;
        }
    }

    public static void l(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            j61.b(viewGroup, z);
        } else if (m) {
            try {
                j61.b(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                m = false;
            }
        }
    }

    public static long m(String str) {
        String str2 = v23.a;
        String[] strArrSplit = str.split("\\.", 2);
        long j2 = 0;
        for (String str3 : strArrSplit[0].split(":", -1)) {
            j2 = (j2 * 60) + Long.parseLong(str3);
        }
        long j3 = j2 * 1000;
        if (strArrSplit.length == 2) {
            String strTrim = strArrSplit[1].trim();
            if (strTrim.length() != 3) {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(strTrim));
            }
            j3 += Long.parseLong(strTrim);
        }
        return j3 * 1000;
    }

    public static Date o(long j2) {
        return new Date((j2 - 2082844800) * 1000);
    }

    public static void p(int i2, Throwable th, String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 20);
        sb.append("Ad failed to load : ");
        sb.append(i2);
        gi2.f0(sb.toString());
        gi2.R();
        if (i2 == 3) {
            return;
        }
        hg4.C.h.e(str, th);
    }

    public static void q(Context context) throws IOException {
        if (((Boolean) tw1.e.c.a(mz1.C6)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            mf3 mf3VarF = mf3.f(context);
            nf3 nf3VarF = nf3.f(context);
            of3 of3VarF = of3.f(context);
            mf3VarF.getClass();
            synchronized (mf3.class) {
                mf3VarF.c(false);
            }
            synchronized (mf3.class) {
                mf3VarF.c(true);
            }
            nf3VarF.h();
            of3VarF.h();
        } catch (IOException e2) {
            hg4.C.h.d("clearStorageOnIdlessMode", e2);
        }
        try {
            if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
            } else {
                throw new IOException("Failed to remove query_info_shared_prefs");
            }
        } catch (IOException e3) {
            hg4.C.h.d("clearStorageOnIdlessMode_scar", e3);
        }
    }

    public static void r(String str, long j2) {
        if (j2 >= 0) {
            return;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + length + 2 + 14);
        sb.append(str);
        sb.append(" (");
        sb.append(j2);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public static boolean s(String str) {
        return str == null || str.isEmpty();
    }

    public static float t(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static Bundle u(Context context, String str) {
        JSONArray jSONArray;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (TextUtils.isEmpty(str)) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException unused) {
                gi2.q0(3);
            }
        }
        if (jSONArray == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
            String strOptString = jSONObjectOptJSONObject.optString("bk");
            String strOptString2 = jSONObjectOptJSONObject.optString("sk");
            int iOptInt = jSONObjectOptJSONObject.optInt("type", -1);
            int i3 = iOptInt != 0 ? iOptInt != 1 ? iOptInt != 2 ? 0 : 3 : 2 : 1;
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && i3 != 0) {
                List listV = sq0.p(new yk3('/')).v(strOptString2);
                if (listV.size() > 2 || listV.isEmpty()) {
                    obj = null;
                } else {
                    if (listV.size() == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str2 = (String) listV.get(0);
                    } else {
                        sharedPreferences = context.getSharedPreferences((String) listV.get(0), 0);
                        str2 = (String) listV.get(1);
                    }
                    obj = sharedPreferences.getAll().get(str2);
                }
                if (obj != null) {
                    int i4 = i3 - 1;
                    if (i4 != 0) {
                        if (i4 != 1) {
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

    public static void v(Context context, boolean z) {
        if (z) {
            gi2.f0("This request is sent from a test device.");
            return;
        }
        j63 j63Var = sv1.f.a;
        String strC = j63.c(context);
        StringBuilder sb = new StringBuilder(String.valueOf(strC).length() + 102);
        sb.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
        sb.append(strC);
        sb.append("\")) to get test ads on this device.");
        gi2.f0(sb.toString());
    }

    public static void w(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static int x(int i2, int i3) {
        int i4;
        if (i2 < 0 || i2 >= 3 || i3 < 0 || (i4 = i3 >> 1) >= 19) {
            return -1;
        }
        int i5 = d[i2];
        if (i5 == 44100) {
            int i6 = h[i4] + (i3 & 1);
            return i6 + i6;
        }
        int i7 = g[i4];
        return i5 == 32000 ? i7 * 6 : i7 * 4;
    }

    public abstract void b();

    public abstract void d();

    public abstract Object n(jr3 jr3Var, hv3 hv3Var, Class cls);

    public void c(r2 r2Var) {
    }
}
