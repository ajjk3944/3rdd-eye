package com.yandex.mobile.ads.impl;

import N7.G8;
import c9.C2095p;
import c9.C2099t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import q9.InterfaceC5499a;

/* loaded from: classes3.dex */
public final class kf0 implements Iterable<b9.l<? extends String, ? extends String>>, InterfaceC5499a {

    /* renamed from: b, reason: collision with root package name */
    private final String[] f29648b;

    public static final class b {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(t82.a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str).toString());
                }
            }
        }

        public /* synthetic */ b(int i) {
            this();
        }

        public static kf0 a(Map map) {
            kotlin.jvm.internal.l.f(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i = 0;
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                String string = y9.q.w0(str).toString();
                String string2 = y9.q.w0(str2).toString();
                b(string);
                b(string2, string);
                strArr[i10] = string;
                strArr[i10 + 1] = string2;
                i10 += 2;
            }
            return new kf0(strArr, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(String str, String str2) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    throw new IllegalArgumentException(G8.s(t82.a("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2), t82.c(str2) ? "" : ": ".concat(str)).toString());
                }
            }
        }

        public static kf0 a(String... namesAndValues) {
            kotlin.jvm.internal.l.f(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 == 0) {
                String[] strArr = (String[]) namesAndValues.clone();
                int length = strArr.length;
                int i = 0;
                for (int i10 = 0; i10 < length; i10++) {
                    String str = strArr[i10];
                    if (str != null) {
                        strArr[i10] = y9.q.w0(str).toString();
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null");
                    }
                }
                int iP = B7.d.p(0, strArr.length - 1, 2);
                if (iP >= 0) {
                    int i11 = 0;
                    while (true) {
                        String str2 = strArr[i11];
                        String str3 = strArr[i11 + 1];
                        b(str2);
                        b(str3, str2);
                        if (i11 == iP) {
                            break;
                        }
                        i11 += 2;
                    }
                }
                return new kf0(strArr, i);
            }
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
    }

    private kf0(String[] strArr) {
        this.f29648b = strArr;
    }

    public final String a(String name) {
        kotlin.jvm.internal.l.f(name, "name");
        String[] strArr = this.f29648b;
        int length = strArr.length - 2;
        int iP = B7.d.p(length, 0, -2);
        if (iP > length) {
            return null;
        }
        while (!name.equalsIgnoreCase(strArr[length])) {
            if (length == iP) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String b(int i) {
        return this.f29648b[(i * 2) + 1];
    }

    public final TreeMap c() {
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.l.e(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(CASE_INSENSITIVE_ORDER);
        int length = this.f29648b.length / 2;
        for (int i = 0; i < length; i++) {
            String str = this.f29648b[i * 2];
            Locale US = Locale.US;
            kotlin.jvm.internal.l.e(US, "US");
            String lowerCase = str.toLowerCase(US);
            kotlin.jvm.internal.l.e(lowerCase, "toLowerCase(...)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(b(i));
        }
        return treeMap;
    }

    public final List d() {
        int length = this.f29648b.length / 2;
        ArrayList arrayList = null;
        for (int i = 0; i < length; i++) {
            if ("Set-Cookie".equalsIgnoreCase(this.f29648b[i * 2])) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(b(i));
            }
        }
        if (arrayList == null) {
            return C2099t.f18581b;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        kotlin.jvm.internal.l.c(listUnmodifiableList);
        return listUnmodifiableList;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof kf0) && Arrays.equals(this.f29648b, ((kf0) obj).f29648b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f29648b);
    }

    @Override // java.lang.Iterable
    public final Iterator<b9.l<? extends String, ? extends String>> iterator() {
        int length = this.f29648b.length / 2;
        b9.l[] lVarArr = new b9.l[length];
        for (int i = 0; i < length; i++) {
            lVarArr[i] = new b9.l(this.f29648b[i * 2], b(i));
        }
        return T1.B.q(lVarArr);
    }

    public final int size() {
        return this.f29648b.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.f29648b.length / 2;
        for (int i = 0; i < length; i++) {
            String str = this.f29648b[i * 2];
            String strB = b(i);
            sb.append(str);
            sb.append(": ");
            if (t82.c(str)) {
                strB = "██";
            }
            sb.append(strB);
            sb.append("\n");
        }
        String string = sb.toString();
        kotlin.jvm.internal.l.e(string, "toString(...)");
        return string;
    }

    public final a b() {
        a aVar = new a();
        C2095p.c0(aVar.b(), this.f29648b);
        return aVar;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f29649a = new ArrayList(20);

        public final void a(String name, String value) {
            kotlin.jvm.internal.l.f(name, "name");
            kotlin.jvm.internal.l.f(value, "value");
            this.f29649a.add(name);
            this.f29649a.add(y9.q.w0(value).toString());
        }

        public final ArrayList b() {
            return this.f29649a;
        }

        public final a a(String name) {
            kotlin.jvm.internal.l.f(name, "name");
            int i = 0;
            while (i < this.f29649a.size()) {
                if (name.equalsIgnoreCase((String) this.f29649a.get(i))) {
                    this.f29649a.remove(i);
                    this.f29649a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final kf0 a() {
            return new kf0((String[]) this.f29649a.toArray(new String[0]), 0);
        }
    }

    public /* synthetic */ kf0(String[] strArr, int i) {
        this(strArr);
    }

    public final String a(int i) {
        return this.f29648b[i * 2];
    }
}
