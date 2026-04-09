package Lg;

import java.net.InetAddress;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes4.dex */
public interface n {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11783a;

        static {
            int[] iArr = new int[d.values().length];
            f11783a = iArr;
            try {
                iArr[d.HOST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11783a[d.SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class b implements n {
        protected String b(String str) {
            StringBuilder sb2 = new StringBuilder(str.length() + 5);
            int iIndexOf = str.indexOf(".local.");
            int iLastIndexOf = str.lastIndexOf(45);
            int i10 = 1;
            if (iLastIndexOf < 0) {
                sb2.append(str.substring(0, iIndexOf));
            } else {
                try {
                    int i11 = Integer.parseInt(str.substring(iLastIndexOf + 1, iIndexOf)) + 1;
                    sb2.append(str.substring(0, iLastIndexOf));
                    i10 = i11;
                } catch (Exception unused) {
                    sb2.append(str.substring(0, iIndexOf));
                }
            }
            sb2.append('-');
            sb2.append(i10);
            sb2.append(".local.");
            return sb2.toString();
        }

        protected String c(String str) {
            StringBuilder sb2 = new StringBuilder(str.length() + 5);
            int iLastIndexOf = str.lastIndexOf(40);
            int iLastIndexOf2 = str.lastIndexOf(41);
            if (iLastIndexOf < 0 || iLastIndexOf >= iLastIndexOf2) {
                sb2.append(str);
                sb2.append(" (2)");
            } else {
                try {
                    sb2.append(str.substring(0, iLastIndexOf));
                    sb2.append('(');
                    sb2.append(Integer.parseInt(str.substring(iLastIndexOf + 1, iLastIndexOf2)) + 1);
                    sb2.append(')');
                } catch (NumberFormatException unused) {
                    sb2.setLength(0);
                    sb2.append(str);
                    sb2.append(" (2)");
                }
            }
            return sb2.toString();
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private static volatile n f11784a;

        public static n a() {
            if (f11784a == null) {
                f11784a = new e();
            }
            return f11784a;
        }
    }

    public enum d {
        HOST,
        SERVICE
    }

    public static class e extends b {

        /* renamed from: a, reason: collision with root package name */
        private final ConcurrentMap f11785a = new ConcurrentHashMap();

        /* renamed from: b, reason: collision with root package name */
        private final ConcurrentMap f11786b = new ConcurrentHashMap();

        @Override // Lg.n
        public String a(InetAddress inetAddress, String str, d dVar) {
            int i10 = a.f11783a[dVar.ordinal()];
            return i10 != 1 ? i10 != 2 ? str : c(str) : b(str);
        }
    }

    String a(InetAddress inetAddress, String str, d dVar);
}
