package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class a30 {
    public static Context g;
    public static Boolean h;
    public static final gs3 i = new gs3("NO_DECISION", 3);
    public static final ve0 j = new ve0(null, null, null);
    public static ve0 k;
    public static final ju l;
    public static final ju[] m;
    public static final rv1 n;
    public static final Object o;
    public static final zq2 p;
    public static final p63 q;
    public static volatile vg0 r;
    public static volatile ug0 s;
    public final /* synthetic */ int f;

    static {
        ju juVar = new ju("CLIENT_TELEMETRY");
        l = juVar;
        m = new ju[]{juVar};
        n = new rv1(11);
        o = new Object();
        p = new zq2(27);
        q = new p63(15);
    }

    public static void A(String str, String str2) {
        synchronized (o) {
            Log.e(str, E(str2, null));
        }
    }

    public static void B(pv2 pv2Var, String str, Pair... pairArr) {
        if (((Boolean) tw1.e.c.a(mz1.n7)).booleanValue()) {
            md2.a.execute(new hj4(1, pv2Var, pairArr, str));
        }
    }

    public static void C(String str, String str2, Throwable th) {
        synchronized (o) {
            Log.e(str, E(str2, th));
        }
    }

    public static int D(l83 l83Var) {
        if (l83Var.s) {
            return 2;
        }
        pc4 pc4Var = l83Var.d;
        ec2 ec2Var = pc4Var.x;
        String str = pc4Var.C;
        if (ec2Var == null && str == null) {
            return 1;
        }
        if (ec2Var == null || str == null) {
            return ec2Var != null ? 3 : 4;
        }
        return 5;
    }

    public static String E(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (o) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                        } else {
                            cause = cause.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        String strReplace2 = strReplace.replace("\n", "\n  ");
        int length = String.valueOf(str).length();
        return ex0.m(new StringBuilder(String.valueOf(strReplace2).length() + length + 3 + 1), str, "\n  ", strReplace2, "\n");
    }

    public static int a(int i2) {
        if (i2 == 1) {
            return 4;
        }
        if (i2 == 2) {
            return 16;
        }
        throw new IllegalArgumentException("unknown address family");
    }

    public static mv b(Context context) {
        ProviderInfo providerInfo;
        g4 g4Var;
        ApplicationInfo applicationInfo;
        fr zmVar = Build.VERSION.SDK_INT >= 28 ? new zm(17) : new fr(17);
        PackageManager packageManager = context.getPackageManager();
        pu1.i(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            g4Var = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrL = zmVar.l(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrL) {
                    arrayList.add(signature.toByteArray());
                }
                g4Var = new g4(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
            }
        }
        if (g4Var == null) {
            return null;
        }
        return new mv(new lv(context, g4Var));
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int d(InetAddress inetAddress) {
        if (inetAddress instanceof Inet4Address) {
            return 1;
        }
        if (inetAddress instanceof Inet6Address) {
            return 2;
        }
        throw new IllegalArgumentException("unknown address family");
    }

    public static View e(View view, int i2) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View viewFindViewById = viewGroup.getChildAt(i3).findViewById(i2);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    public static synchronized boolean f(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = g;
        if (context2 != null && (bool = h) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        h = null;
        Boolean boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        h = boolValueOf;
        g = applicationContext;
        return boolValueOf.booleanValue();
    }

    public static final boolean g(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static int h(Context context, int i2) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i2});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static byte[] i(String str, int i2) throws NumberFormatException {
        int i3;
        byte[] bArrI;
        if (i2 == 1) {
            byte[] bArr = new byte[4];
            int length = str.length();
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                char cCharAt = str.charAt(i7);
                if (cCharAt < '0' || cCharAt > '9') {
                    if (cCharAt != '.' || i4 == 3 || i5 == 0) {
                        return null;
                    }
                    bArr[i4] = (byte) i6;
                    i6 = 0;
                    i4++;
                    i5 = 0;
                } else {
                    if (i5 == 3) {
                        return null;
                    }
                    if (i5 > 0 && i6 == 0) {
                        return null;
                    }
                    i5++;
                    int i8 = (cCharAt - '0') + (i6 * 10);
                    if (i8 > 255) {
                        return null;
                    }
                    i6 = i8;
                }
            }
            if (i4 != 3 || i5 == 0) {
                return null;
            }
            bArr[i4] = (byte) i6;
            return bArr;
        }
        if (i2 != 2) {
            throw new IllegalArgumentException("unknown address family");
        }
        byte[] bArr2 = new byte[16];
        int i9 = -1;
        String[] strArrSplit = str.split(":", -1);
        int length2 = strArrSplit.length;
        int i10 = length2 - 1;
        if (!strArrSplit[0].isEmpty()) {
            i3 = 0;
        } else {
            if (i10 <= 0 || !strArrSplit[1].isEmpty()) {
                return null;
            }
            i3 = 1;
        }
        if (strArrSplit[i10].isEmpty()) {
            if (i10 - i3 <= 0) {
                return null;
            }
            i10 = length2 - 2;
            if (!strArrSplit[i10].isEmpty()) {
                return null;
            }
        }
        if ((i10 - i3) + 1 > 8) {
            return null;
        }
        int i11 = 0;
        while (true) {
            if (i3 > i10) {
                break;
            }
            if (strArrSplit[i3].isEmpty()) {
                if (i9 >= 0) {
                    return null;
                }
                i9 = i11;
            } else if (strArrSplit[i3].indexOf(46) < 0) {
                for (int i12 = 0; i12 < strArrSplit[i3].length(); i12++) {
                    try {
                        if (Character.digit(strArrSplit[i3].charAt(i12), 16) < 0) {
                            return null;
                        }
                    } catch (NumberFormatException unused) {
                        return null;
                    }
                }
                int i13 = Integer.parseInt(strArrSplit[i3], 16);
                if (!(i13 >= 0 && i13 <= 65535)) {
                    return null;
                }
                int i14 = i11 + 1;
                bArr2[i11] = (byte) (i13 >>> 8);
                i11 += 2;
                bArr2[i14] = (byte) (i13 & 255);
            } else {
                if (i3 < i10 || i3 > 6 || (bArrI = i(strArrSplit[i3], 1)) == null) {
                    return null;
                }
                int i15 = 0;
                while (i15 < 4) {
                    bArr2[i11] = bArrI[i15];
                    i15++;
                    i11++;
                }
            }
            i3++;
        }
        if (i11 < 16 && i9 < 0) {
            return null;
        }
        if (i9 >= 0) {
            int i16 = (16 - i11) + i9;
            System.arraycopy(bArr2, i9, bArr2, i16, i11 - i9);
            while (i9 < i16) {
                bArr2[i9] = 0;
                i9++;
            }
        }
        return bArr2;
    }

    public static String j(byte[] bArr) {
        return (bArr[0] & 255) + "." + (bArr[1] & 255) + "." + (bArr[2] & 255) + "." + (bArr[3] & 255);
    }

    public static String k(a54 a54Var) {
        StringBuilder sb = new StringBuilder(a54Var.d());
        for (int i2 = 0; i2 < a54Var.d(); i2++) {
            byte b = a54Var.b(i2);
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static sz1 m(Context context, String str) {
        String strConcat;
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("/", -1);
        int length = strArrSplit.length;
        if (length == 1) {
            String strValueOf = String.valueOf(context.getPackageName());
            str2 = strArrSplit[0];
            strConcat = strValueOf.concat("_preferences");
        } else {
            if (length != 2) {
                return null;
            }
            strConcat = strArrSplit[0];
            str2 = strArrSplit[1];
        }
        if (TextUtils.isEmpty(strConcat) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new sz1(strConcat, str2);
    }

    public static xe4 n(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b83 b83Var = (b83) it.next();
            if (b83Var.c) {
                arrayList.add(d3.j);
            } else {
                arrayList.add(new d3(b83Var.a, b83Var.b));
            }
        }
        return new xe4(context, (d3[]) arrayList.toArray(new d3[arrayList.size()]));
    }

    public static void o(String str) {
        synchronized (o) {
            E(str, null);
        }
    }

    public static void p(hk1 hk1Var, lk1 lk1Var) {
        for (int i2 = 0; i2 < hk1Var.a(); i2++) {
            long jC = hk1Var.c(i2);
            ArrayList arrayListB = hk1Var.b(jC);
            if (!arrayListB.isEmpty()) {
                if (i2 == hk1Var.a() - 1) {
                    throw new IllegalStateException();
                }
                long jC2 = hk1Var.c(i2 + 1) - hk1Var.c(i2);
                if (jC2 > 0) {
                    lk1Var.mo6c(new gk1(arrayListB, jC, jC2));
                }
            }
        }
    }

    public static byte[] q(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        throw new IllegalArgumentException("n must not be negative");
    }

    public static int r(int i2, int i3) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i3 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i4 = i2 / i3;
        int i5 = i2 - (i3 * i4);
        if (i5 == 0) {
            return i4;
        }
        int i6 = ((i2 ^ i3) >> 31) | 1;
        switch (ro3.a[roundingMode.ordinal()]) {
            case 1:
                yc0.w(false);
                return i4;
            case 2:
                return i4;
            case 3:
                if (i6 >= 0) {
                    return i4;
                }
                break;
            case 4:
                break;
            case 5:
                if (i6 <= 0) {
                    return i4;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i5);
                int iAbs2 = iAbs - (Math.abs(i3) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i4;
                }
                if (iAbs2 <= 0) {
                    return i4;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i4 + i6;
    }

    public static String s(String str) {
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str.hashCode()) {
            case 1743582862:
                return str.equals("requester_type_0") ? "0" : str;
            case 1743582863:
                return str.equals("requester_type_1") ? "1" : str;
            case 1743582864:
                return str.equals("requester_type_2") ? "2" : str;
            case 1743582865:
                return str.equals("requester_type_3") ? "3" : str;
            case 1743582866:
                return str.equals("requester_type_4") ? "4" : str;
            case 1743582867:
                return str.equals("requester_type_5") ? "5" : str;
            case 1743582868:
                return str.equals("requester_type_6") ? "6" : str;
            case 1743582869:
                return str.equals("requester_type_7") ? "7" : str;
            case 1743582870:
                return str.equals("requester_type_8") ? "8" : str;
            default:
                return str;
        }
    }

    public static HashMap t(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (HashMap) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str.getBytes(), 0))).readObject();
        } catch (IOException | ClassNotFoundException unused) {
            return null;
        }
    }

    public static void u(String str) {
        synchronized (o) {
            E(str, null);
        }
    }

    public static byte[] v(BigInteger bigInteger, int i2) throws GeneralSecurityException {
        if (bigInteger.signum() == -1) {
            throw new IllegalArgumentException("integer must be nonnegative");
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length == i2) {
            return byteArray;
        }
        int i3 = i2 + 1;
        if (length > i3) {
            throw new GeneralSecurityException("integer too large");
        }
        if (length == i3) {
            if (byteArray[0] == 0) {
                return Arrays.copyOfRange(byteArray, 1, length);
            }
            throw new GeneralSecurityException("integer too large");
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(byteArray, 0, bArr, i2 - length, length);
        return bArr;
    }

    public static String w(pc4 pc4Var) {
        Bundle bundle;
        return (pc4Var == null || (bundle = pc4Var.h) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    public static void x(String str) {
        synchronized (o) {
            E(str, null);
        }
    }

    public static int y(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        if (TextUtils.isEmpty(string)) {
            return 2;
        }
        switch (string.hashCode()) {
            case 1743582862:
                return string.equals("requester_type_0") ? 1 : 2;
            case 1743582863:
                return string.equals("requester_type_1") ? 3 : 2;
            case 1743582864:
                return string.equals("requester_type_2") ? 4 : 2;
            case 1743582865:
                return string.equals("requester_type_3") ? 5 : 2;
            case 1743582866:
                return string.equals("requester_type_4") ? 6 : 2;
            case 1743582867:
                return string.equals("requester_type_5") ? 7 : 2;
            case 1743582868:
                return string.equals("requester_type_6") ? 8 : 2;
            case 1743582869:
                return string.equals("requester_type_7") ? 9 : 2;
            case 1743582870:
                return string.equals("requester_type_8") ? 10 : 2;
            default:
                return 2;
        }
    }

    public static void z(String str, Throwable th) {
        synchronized (o) {
            E(str, th);
        }
    }

    public abstract HashMap l();

    public String toString() throws IOException {
        switch (this.f) {
            case 18:
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(l());
                    objectOutputStream.close();
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                } catch (IOException unused) {
                    return null;
                }
            default:
                return super.toString();
        }
    }
}
