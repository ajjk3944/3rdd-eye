package a5;

import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import io.sentry.android.core.e0;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import oe.f0;
import oe.h0;
import oe.u0;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f84a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f85b = {"", "A", "B", "C"};

    /* renamed from: c, reason: collision with root package name */
    public static final Object f86c = new Object();

    public static void A(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer(h0.b.h(i10, "csd-"), ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }

    public static void B(String str, String str2) {
        synchronized (f86c) {
            e0.p(str, str2);
        }
    }

    public static void C(String str, String str2, Exception exc) {
        B(str, a(str2, exc));
    }

    public static String a(String str, Throwable th2) {
        String strR = r(th2);
        if (TextUtils.isEmpty(strR)) {
            return str;
        }
        StringBuilder sbL = w.g.l(str, "\n  ");
        sbL.append(strR.replace("\n", "\n  "));
        sbL.append('\n');
        return sbL.toString();
    }

    public static void b(String str) {
        if (d0.f105a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static String c(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        Object[] objArr = {f85b[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(z10 ? 'H' : 'L'), Integer.valueOf(i13)};
        int i14 = d0.f105a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i15 = 0; i15 < length; i15++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i15])));
        }
        return sb2.toString();
    }

    public static void d(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void e(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void f(String str, boolean z10) throws f {
        if (!z10) {
            throw new f(str);
        }
    }

    public static void g(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void i(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void j(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static void k(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void l() {
        synchronized (f86c) {
        }
    }

    public static void m(String str, String str2) {
        synchronized (f86c) {
            e0.d(str, str2);
        }
    }

    public static void n(String str, String str2, Throwable th2) {
        m(str, a(str2, th2));
    }

    public static void o() {
        if (d0.f105a >= 18) {
            Trace.endSection();
        }
    }

    public static u0 p(androidx.media3.common.h hVar, ArrayList arrayList) {
        f0 f0Var = h0.f19336d;
        oe.s.c(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i10 = 0;
        int i11 = 0;
        while (i10 < arrayList.size()) {
            Bundle bundle = (Bundle) arrayList.get(i10);
            bundle.getClass();
            androidx.media3.common.i iVarD = hVar.d(bundle);
            iVarD.getClass();
            int i12 = i11 + 1;
            if (objArrCopyOf.length < i12) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, oe.e0.e(objArrCopyOf.length, i12));
            }
            objArrCopyOf[i11] = iVarD;
            i10++;
            i11 = i12;
        }
        return h0.k(i11, objArrCopyOf);
    }

    public static String q(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static String r(Throwable th2) {
        boolean z10;
        synchronized (f86c) {
            try {
                if (th2 == null) {
                    return null;
                }
                Throwable cause = th2;
                while (true) {
                    if (cause == null) {
                        z10 = false;
                        break;
                    }
                    if (cause instanceof UnknownHostException) {
                        z10 = true;
                        break;
                    }
                    cause = cause.getCause();
                }
                if (z10) {
                    return "UnknownHostException (no network)";
                }
                return Log.getStackTraceString(th2).trim().replace("\t", "    ");
            } finally {
            }
        }
    }

    public static int[] s(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i10 = iIndexOf5 + 2;
        if (i10 < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i10) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static void t() {
        synchronized (f86c) {
        }
    }

    public static boolean u(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean v(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static void w(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static String x(StringBuilder sb2, int i10, int i11) {
        int i12;
        int iLastIndexOf;
        if (i10 >= i11) {
            return sb2.toString();
        }
        if (sb2.charAt(i10) == '/') {
            i10++;
        }
        int i13 = i10;
        int i14 = i13;
        while (i13 <= i11) {
            if (i13 == i11) {
                i12 = i13;
            } else if (sb2.charAt(i13) == '/') {
                i12 = i13 + 1;
            } else {
                i13++;
            }
            int i15 = i14 + 1;
            if (i13 == i15 && sb2.charAt(i14) == '.') {
                sb2.delete(i14, i12);
                i11 -= i12 - i14;
            } else {
                if (i13 == i14 + 2 && sb2.charAt(i14) == '.' && sb2.charAt(i15) == '.') {
                    iLastIndexOf = sb2.lastIndexOf("/", i14 - 2) + 1;
                    int i16 = iLastIndexOf > i10 ? iLastIndexOf : i10;
                    sb2.delete(i16, i12);
                    i11 -= i12 - i16;
                } else {
                    iLastIndexOf = i13 + 1;
                }
                i14 = iLastIndexOf;
            }
            i13 = i14;
        }
        return sb2.toString();
    }

    public static String y(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] iArrS = s(str2);
        if (iArrS[0] != -1) {
            sb2.append(str2);
            x(sb2, iArrS[1], iArrS[2]);
            return sb2.toString();
        }
        int[] iArrS2 = s(str);
        if (iArrS[3] == 0) {
            sb2.append((CharSequence) str, 0, iArrS2[3]);
            sb2.append(str2);
            return sb2.toString();
        }
        if (iArrS[2] == 0) {
            sb2.append((CharSequence) str, 0, iArrS2[2]);
            sb2.append(str2);
            return sb2.toString();
        }
        int i10 = iArrS[1];
        if (i10 != 0) {
            int i11 = iArrS2[0] + 1;
            sb2.append((CharSequence) str, 0, i11);
            sb2.append(str2);
            return x(sb2, iArrS[1] + i11, i11 + iArrS[2]);
        }
        if (str2.charAt(i10) == '/') {
            sb2.append((CharSequence) str, 0, iArrS2[1]);
            sb2.append(str2);
            int i12 = iArrS2[1];
            return x(sb2, i12, iArrS[2] + i12);
        }
        int i13 = iArrS2[0] + 2;
        int i14 = iArrS2[1];
        if (i13 >= i14 || i14 != iArrS2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrS2[2] - 1);
            int i15 = iLastIndexOf == -1 ? iArrS2[1] : iLastIndexOf + 1;
            sb2.append((CharSequence) str, 0, i15);
            sb2.append(str2);
            return x(sb2, iArrS2[1], i15 + iArrS[2]);
        }
        sb2.append((CharSequence) str, 0, i14);
        sb2.append('/');
        sb2.append(str2);
        int i16 = iArrS2[1];
        return x(sb2, i16, iArrS[2] + i16 + 1);
    }

    public static Uri z(String str, String str2) {
        return Uri.parse(y(str, str2));
    }
}
