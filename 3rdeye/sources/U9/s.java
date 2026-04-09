package U9;

import c9.C2095p;
import c9.C2099t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import q9.InterfaceC5499a;

/* compiled from: Headers.kt */
/* loaded from: classes3.dex */
public final class s implements Iterable<b9.l<? extends String, ? extends String>>, InterfaceC5499a {

    /* renamed from: b, reason: collision with root package name */
    public final String[] f12709b;

    /* compiled from: Headers.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f12710a = new ArrayList(20);

        public final void a(String name, String value) {
            kotlin.jvm.internal.l.f(name, "name");
            kotlin.jvm.internal.l.f(value, "value");
            b.a(name);
            b.b(value, name);
            c(name, value);
        }

        public final void b(String str) {
            int iF0 = y9.q.f0(str, ':', 1, 4);
            if (iF0 != -1) {
                String strSubstring = str.substring(0, iF0);
                kotlin.jvm.internal.l.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = str.substring(iF0 + 1);
                kotlin.jvm.internal.l.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                c(strSubstring, strSubstring2);
                return;
            }
            if (str.charAt(0) != ':') {
                c("", str);
                return;
            }
            String strSubstring3 = str.substring(1);
            kotlin.jvm.internal.l.e(strSubstring3, "this as java.lang.String).substring(startIndex)");
            c("", strSubstring3);
        }

        public final void c(String name, String value) {
            kotlin.jvm.internal.l.f(name, "name");
            kotlin.jvm.internal.l.f(value, "value");
            ArrayList arrayList = this.f12710a;
            arrayList.add(name);
            arrayList.add(y9.q.w0(value).toString());
        }

        public final s d() {
            return new s((String[]) this.f12710a.toArray(new String[0]));
        }

        public final String e(String name) {
            kotlin.jvm.internal.l.f(name, "name");
            ArrayList arrayList = this.f12710a;
            int size = arrayList.size() - 2;
            int iP = B7.d.p(size, 0, -2);
            if (iP > size) {
                return null;
            }
            while (!name.equalsIgnoreCase((String) arrayList.get(size))) {
                if (size == iP) {
                    return null;
                }
                size -= 2;
            }
            return (String) arrayList.get(size + 1);
        }

        public final void f(String name) {
            kotlin.jvm.internal.l.f(name, "name");
            int i = 0;
            while (true) {
                ArrayList arrayList = this.f12710a;
                if (i >= arrayList.size()) {
                    return;
                }
                if (name.equalsIgnoreCase((String) arrayList.get(i))) {
                    arrayList.remove(i);
                    arrayList.remove(i);
                    i -= 2;
                }
                i += 2;
            }
        }
    }

    /* compiled from: Headers.kt */
    public static final class b {
        public static void a(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(V9.b.h("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
                }
            }
        }

        public static void b(String str, String str2) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(V9.b.h("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2));
                    sb.append(V9.b.p(str2) ? "" : ": ".concat(str));
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        public static s c(String... strArr) {
            if (strArr.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            int i = 0;
            for (int i10 = 0; i10 < length; i10++) {
                String str = strArr2[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr2[i10] = y9.q.w0(str).toString();
            }
            int iP = B7.d.p(0, strArr2.length - 1, 2);
            if (iP >= 0) {
                while (true) {
                    String str2 = strArr2[i];
                    String str3 = strArr2[i + 1];
                    a(str2);
                    b(str3, str2);
                    if (i == iP) {
                        break;
                    }
                    i += 2;
                }
            }
            return new s(strArr2);
        }
    }

    public s(String[] strArr) {
        this.f12709b = strArr;
    }

    public final String c(String name) {
        kotlin.jvm.internal.l.f(name, "name");
        String[] strArr = this.f12709b;
        int length = strArr.length - 2;
        int iP = B7.d.p(length, 0, -2);
        if (iP > length) {
            return null;
        }
        while (!y9.n.U(name, strArr[length], true)) {
            if (length == iP) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String d(int i) {
        return this.f12709b[i * 2];
    }

    public final a e() {
        a aVar = new a();
        C2095p.c0(aVar.f12710a, this.f12709b);
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return Arrays.equals(this.f12709b, ((s) obj).f12709b);
        }
        return false;
    }

    public final String f(int i) {
        return this.f12709b[(i * 2) + 1];
    }

    public final List<String> g(String name) {
        kotlin.jvm.internal.l.f(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (name.equalsIgnoreCase(d(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(f(i));
            }
        }
        if (arrayList == null) {
            return C2099t.f18581b;
        }
        List<String> listUnmodifiableList = Collections.unmodifiableList(arrayList);
        kotlin.jvm.internal.l.e(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12709b);
    }

    @Override // java.lang.Iterable
    public final Iterator<b9.l<? extends String, ? extends String>> iterator() {
        int size = size();
        b9.l[] lVarArr = new b9.l[size];
        for (int i = 0; i < size; i++) {
            lVarArr[i] = new b9.l(d(i), f(i));
        }
        return T1.B.q(lVarArr);
    }

    public final int size() {
        return this.f12709b.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strD = d(i);
            String strF = f(i);
            sb.append(strD);
            sb.append(": ");
            if (V9.b.p(strD)) {
                strF = "██";
            }
            sb.append(strF);
            sb.append("\n");
        }
        String string = sb.toString();
        kotlin.jvm.internal.l.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
