package q0;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class D extends J {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f22921m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D(int i, boolean z6) {
        super(z6);
        this.f22921m = i;
    }

    public static float[] f(String str) {
        q5.i.e(str, "value");
        return new float[]{((Number) J.f22932g.c(str)).floatValue()};
    }

    public static int[] g(String str) {
        q5.i.e(str, "value");
        return new int[]{((Number) J.f22927b.c(str)).intValue()};
    }

    public static long[] h(String str) {
        q5.i.e(str, "value");
        return new long[]{((Number) J.f22930e.c(str)).longValue()};
    }

    public static boolean[] i(String str) {
        q5.i.e(str, "value");
        return new boolean[]{((Boolean) J.i.c(str)).booleanValue()};
    }

    @Override // q0.J
    public final Object a(String str, Bundle bundle) {
        switch (this.f22921m) {
            case 0:
                q5.i.e(str, "key");
                return (boolean[]) bundle.get(str);
            case 1:
                q5.i.e(str, "key");
                return (Boolean) bundle.get(str);
            case 2:
                q5.i.e(str, "key");
                return (float[]) bundle.get(str);
            case 3:
                q5.i.e(str, "key");
                Object obj = bundle.get(str);
                q5.i.c(obj, "null cannot be cast to non-null type kotlin.Float");
                return (Float) obj;
            case 4:
                q5.i.e(str, "key");
                return (int[]) bundle.get(str);
            case 5:
                q5.i.e(str, "key");
                Object obj2 = bundle.get(str);
                q5.i.c(obj2, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj2;
            case 6:
                q5.i.e(str, "key");
                return (long[]) bundle.get(str);
            case 7:
                q5.i.e(str, "key");
                Object obj3 = bundle.get(str);
                q5.i.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                return (Long) obj3;
            case 8:
                q5.i.e(str, "key");
                Object obj4 = bundle.get(str);
                q5.i.c(obj4, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj4;
            case 9:
                q5.i.e(str, "key");
                return (String[]) bundle.get(str);
            default:
                q5.i.e(str, "key");
                return (String) bundle.get(str);
        }
    }

    @Override // q0.J
    public final String b() {
        switch (this.f22921m) {
            case 0:
                return "boolean[]";
            case 1:
                return "boolean";
            case 2:
                return "float[]";
            case 3:
                return "float";
            case 4:
                return "integer[]";
            case 5:
                return "integer";
            case 6:
                return "long[]";
            case 7:
                return "long";
            case 8:
                return "reference";
            case 9:
                return "string[]";
            default:
                return "string";
        }
    }

    @Override // q0.J
    public final Object c(String str) throws NumberFormatException {
        boolean z6;
        int i;
        String strSubstring;
        long j6;
        int i3;
        switch (this.f22921m) {
            case 0:
                return i(str);
            case 1:
                q5.i.e(str, "value");
                if (str.equals("true")) {
                    z6 = true;
                } else {
                    if (!str.equals("false")) {
                        throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                    }
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            case 2:
                return f(str);
            case 3:
                q5.i.e(str, "value");
                return Float.valueOf(Float.parseFloat(str));
            case 4:
                return g(str);
            case 5:
                q5.i.e(str, "value");
                if (str.startsWith("0x")) {
                    String strSubstring2 = str.substring(2);
                    q5.i.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    d5.y.d(16);
                    i = Integer.parseInt(strSubstring2, 16);
                } else {
                    i = Integer.parseInt(str);
                }
                return Integer.valueOf(i);
            case 6:
                return h(str);
            case 7:
                q5.i.e(str, "value");
                if (y5.l.W(str, "L")) {
                    strSubstring = str.substring(0, str.length() - 1);
                    q5.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                } else {
                    strSubstring = str;
                }
                if (str.startsWith("0x")) {
                    String strSubstring3 = strSubstring.substring(2);
                    q5.i.d(strSubstring3, "this as java.lang.String).substring(startIndex)");
                    d5.y.d(16);
                    j6 = Long.parseLong(strSubstring3, 16);
                } else {
                    j6 = Long.parseLong(strSubstring);
                }
                return Long.valueOf(j6);
            case 8:
                q5.i.e(str, "value");
                if (str.startsWith("0x")) {
                    String strSubstring4 = str.substring(2);
                    q5.i.d(strSubstring4, "this as java.lang.String).substring(startIndex)");
                    d5.y.d(16);
                    i3 = Integer.parseInt(strSubstring4, 16);
                } else {
                    i3 = Integer.parseInt(str);
                }
                return Integer.valueOf(i3);
            case 9:
                q5.i.e(str, "value");
                return new String[]{str};
            default:
                q5.i.e(str, "value");
                if (str.equals("null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // q0.J
    public Object d(String str, Object obj) {
        switch (this.f22921m) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    return i(str);
                }
                boolean[] zArrI = i(str);
                int length = zArr.length;
                boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + 1);
                System.arraycopy(zArrI, 0, zArrCopyOf, length, 1);
                q5.i.b(zArrCopyOf);
                return zArrCopyOf;
            case 2:
                float[] fArr = (float[]) obj;
                if (fArr == null) {
                    return f(str);
                }
                float[] fArrF = f(str);
                int length2 = fArr.length;
                float[] fArrCopyOf = Arrays.copyOf(fArr, length2 + 1);
                System.arraycopy(fArrF, 0, fArrCopyOf, length2, 1);
                q5.i.b(fArrCopyOf);
                return fArrCopyOf;
            case 4:
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    return g(str);
                }
                int[] iArrG = g(str);
                int length3 = iArr.length;
                int[] iArrCopyOf = Arrays.copyOf(iArr, length3 + 1);
                System.arraycopy(iArrG, 0, iArrCopyOf, length3, 1);
                q5.i.b(iArrCopyOf);
                return iArrCopyOf;
            case 6:
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    return h(str);
                }
                long[] jArrH = h(str);
                int length4 = jArr.length;
                long[] jArrCopyOf = Arrays.copyOf(jArr, length4 + 1);
                System.arraycopy(jArrH, 0, jArrCopyOf, length4, 1);
                q5.i.b(jArrCopyOf);
                return jArrCopyOf;
            case 9:
                String[] strArr = (String[]) obj;
                if (strArr == null) {
                    return new String[]{str};
                }
                int length5 = strArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(strArr, length5 + 1);
                System.arraycopy(new String[]{str}, 0, objArrCopyOf, length5, 1);
                q5.i.b(objArrCopyOf);
                return (String[]) objArrCopyOf;
            default:
                return super.d(str, obj);
        }
    }

    @Override // q0.J
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f22921m) {
            case 0:
                q5.i.e(str, "key");
                bundle.putBooleanArray(str, (boolean[]) obj);
                break;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                q5.i.e(str, "key");
                bundle.putBoolean(str, zBooleanValue);
                break;
            case 2:
                q5.i.e(str, "key");
                bundle.putFloatArray(str, (float[]) obj);
                break;
            case 3:
                float fFloatValue = ((Number) obj).floatValue();
                q5.i.e(str, "key");
                bundle.putFloat(str, fFloatValue);
                break;
            case 4:
                q5.i.e(str, "key");
                bundle.putIntArray(str, (int[]) obj);
                break;
            case 5:
                int iIntValue = ((Number) obj).intValue();
                q5.i.e(str, "key");
                bundle.putInt(str, iIntValue);
                break;
            case 6:
                q5.i.e(str, "key");
                bundle.putLongArray(str, (long[]) obj);
                break;
            case 7:
                long jLongValue = ((Number) obj).longValue();
                q5.i.e(str, "key");
                bundle.putLong(str, jLongValue);
                break;
            case 8:
                int iIntValue2 = ((Number) obj).intValue();
                q5.i.e(str, "key");
                bundle.putInt(str, iIntValue2);
                break;
            case 9:
                q5.i.e(str, "key");
                bundle.putStringArray(str, (String[]) obj);
                break;
            default:
                q5.i.e(str, "key");
                bundle.putString(str, (String) obj);
                break;
        }
    }
}
