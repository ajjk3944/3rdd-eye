package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.http.DatesKt;
import com.bumptech.glide.e;
import j$.time.Instant;
import j$.util.DateRetargetClass;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import nk.f;
import nk.k;
import ok.a;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import vk.p;
import yj.i;
import zj.n;
import zj.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class Headers implements Iterable<i>, a {
    public static final Companion Companion = new Companion(null);
    private final String[] namesAndValues;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList(20);

        public final Builder add(String str) {
            k.e(str, "line");
            int iE0 = vk.i.E0(str, ':', 0, 6);
            if (iE0 == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(str).toString());
            }
            String strSubstring = str.substring(0, iE0);
            k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String string = vk.i.V0(strSubstring).toString();
            String strSubstring2 = str.substring(iE0 + 1);
            k.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
            add(string, strSubstring2);
            return this;
        }

        public final Builder addAll(Headers headers) {
            k.e(headers, "headers");
            int size = headers.size();
            for (int i4 = 0; i4 < size; i4++) {
                addLenient$okhttp(headers.name(i4), headers.value(i4));
            }
            return this;
        }

        public final Builder addLenient$okhttp(String str) {
            k.e(str, "line");
            int iE0 = vk.i.E0(str, ':', 1, 4);
            if (iE0 != -1) {
                String strSubstring = str.substring(0, iE0);
                k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = str.substring(iE0 + 1);
                k.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(strSubstring, strSubstring2);
                return this;
            }
            if (str.charAt(0) != ':') {
                addLenient$okhttp("", str);
                return this;
            }
            String strSubstring3 = str.substring(1);
            k.d(strSubstring3, "this as java.lang.String).substring(startIndex)");
            addLenient$okhttp("", strSubstring3);
            return this;
        }

        public final Builder addUnsafeNonAscii(String str, String str2) {
            k.e(str, "name");
            k.e(str2, "value");
            Headers.Companion.checkName(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Headers build() {
            return new Headers((String[]) this.namesAndValues.toArray(new String[0]), null);
        }

        public final String get(String str) {
            k.e(str, "name");
            int size = this.namesAndValues.size() - 2;
            int iE = e.E(size, 0, -2);
            if (iE > size) {
                return null;
            }
            while (!str.equalsIgnoreCase(this.namesAndValues.get(size))) {
                if (size == iE) {
                    return null;
                }
                size -= 2;
            }
            return this.namesAndValues.get(size + 1);
        }

        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final Builder removeAll(String str) {
            k.e(str, "name");
            int i4 = 0;
            while (i4 < this.namesAndValues.size()) {
                if (str.equalsIgnoreCase(this.namesAndValues.get(i4))) {
                    this.namesAndValues.remove(i4);
                    this.namesAndValues.remove(i4);
                    i4 -= 2;
                }
                i4 += 2;
            }
            return this;
        }

        public final Builder set(String str, Date date) {
            k.e(str, "name");
            k.e(date, "value");
            set(str, DatesKt.toHttpDateString(date));
            return this;
        }

        @IgnoreJRERequirement
        public final Builder set(String str, Instant instant) {
            k.e(str, "name");
            k.e(instant, "value");
            return set(str, new Date(instant.toEpochMilli()));
        }

        public final Builder set(String str, String str2) {
            k.e(str, "name");
            k.e(str2, "value");
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            removeAll(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Builder add(String str, String str2) {
            k.e(str, "name");
            k.e(str2, "value");
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Builder add(String str, Date date) {
            k.e(str, "name");
            k.e(date, "value");
            add(str, DatesKt.toHttpDateString(date));
            return this;
        }

        public final Builder addLenient$okhttp(String str, String str2) {
            k.e(str, "name");
            k.e(str2, "value");
            this.namesAndValues.add(str);
            this.namesAndValues.add(vk.i.V0(str2).toString());
            return this;
        }

        @IgnoreJRERequirement
        public final Builder add(String str, Instant instant) {
            k.e(str, "name");
            k.e(instant, "value");
            add(str, new Date(instant.toEpochMilli()));
            return this;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i4 = 0; i4 < length; i4++) {
                char cCharAt = str.charAt(i4);
                if ('!' > cCharAt || cCharAt >= 127) {
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i4), str).toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkValue(String str, String str2) {
            int length = str.length();
            for (int i4 = 0; i4 < length; i4++) {
                char cCharAt = str.charAt(i4);
                if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(Util.format("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i4), str2));
                    sb2.append(Util.isSensitiveHeader(str2) ? "" : ": ".concat(str));
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String get(String[] strArr, String str) {
            int length = strArr.length - 2;
            int iE = e.E(length, 0, -2);
            if (iE > length) {
                return null;
            }
            while (!p.q0(str, strArr[length])) {
                if (length == iE) {
                    return null;
                }
                length -= 2;
            }
            return strArr[length + 1];
        }

        @yj.a
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m50deprecated_of(String... strArr) {
            k.e(strArr, "namesAndValues");
            return of((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final Headers of(String... strArr) {
            k.e(strArr, "namesAndValues");
            if (strArr.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            int i4 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                String str = strArr2[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr2[i10] = vk.i.V0(str).toString();
            }
            int iE = e.E(0, strArr2.length - 1, 2);
            if (iE >= 0) {
                while (true) {
                    String str2 = strArr2[i4];
                    String str3 = strArr2[i4 + 1];
                    checkName(str2);
                    checkValue(str3, str2);
                    if (i4 == iE) {
                        break;
                    }
                    i4 += 2;
                }
            }
            return new Headers(strArr2, null);
        }

        private Companion() {
        }

        @yj.a
        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m49deprecated_of(Map<String, String> map) {
            k.e(map, "headers");
            return of(map);
        }

        public final Headers of(Map<String, String> map) {
            k.e(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i4 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String string = vk.i.V0(key).toString();
                String string2 = vk.i.V0(value).toString();
                checkName(string);
                checkValue(string2, string);
                strArr[i4] = string;
                strArr[i4 + 1] = string2;
                i4 += 2;
            }
            return new Headers(strArr, null);
        }
    }

    public /* synthetic */ Headers(String[] strArr, f fVar) {
        this(strArr);
    }

    public static final Headers of(Map<String, String> map) {
        return Companion.of(map);
    }

    @yj.a
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m48deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        for (int i4 = 0; i4 < strArr.length; i4++) {
            length += this.namesAndValues[i4].length();
        }
        return length;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues);
    }

    public final String get(String str) {
        k.e(str, "name");
        return Companion.get(this.namesAndValues, str);
    }

    public final Date getDate(String str) {
        k.e(str, "name");
        String str2 = get(str);
        if (str2 != null) {
            return DatesKt.toHttpDateOrNull(str2);
        }
        return null;
    }

    @IgnoreJRERequirement
    public final Instant getInstant(String str) {
        k.e(str, "name");
        Date date = getDate(str);
        if (date != null) {
            return DateRetargetClass.toInstant(date);
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    public Iterator<i> iterator() {
        int size = size();
        i[] iVarArr = new i[size];
        for (int i4 = 0; i4 < size; i4++) {
            iVarArr[i4] = new i(name(i4), value(i4));
        }
        return k.i(iVarArr);
    }

    public final String name(int i4) {
        return this.namesAndValues[i4 * 2];
    }

    public final Set<String> names() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        k.d(comparator, "CASE_INSENSITIVE_ORDER");
        TreeSet treeSet = new TreeSet(comparator);
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            treeSet.add(name(i4));
        }
        Set<String> setUnmodifiableSet = DesugarCollections.unmodifiableSet(treeSet);
        k.d(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        n.X(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public final Map<String, List<String>> toMultimap() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        k.d(comparator, "CASE_INSENSITIVE_ORDER");
        TreeMap treeMap = new TreeMap(comparator);
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            String strName = name(i4);
            Locale locale = Locale.US;
            k.d(locale, "US");
            String lowerCase = strName.toLowerCase(locale);
            k.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(value(i4));
        }
        return treeMap;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            String strName = name(i4);
            String strValue = value(i4);
            sb2.append(strName);
            sb2.append(": ");
            if (Util.isSensitiveHeader(strName)) {
                strValue = "██";
            }
            sb2.append(strValue);
            sb2.append("\n");
        }
        String string = sb2.toString();
        k.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String value(int i4) {
        return this.namesAndValues[(i4 * 2) + 1];
    }

    public final List<String> values(String str) {
        k.e(str, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < size; i4++) {
            if (str.equalsIgnoreCase(name(i4))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i4));
            }
        }
        if (arrayList == null) {
            return s.f38317a;
        }
        List<String> listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        k.d(listUnmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return listUnmodifiableList;
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    public static final Headers of(String... strArr) {
        return Companion.of(strArr);
    }
}
