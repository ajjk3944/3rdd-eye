package com.bytedance.sdk.component.vt.ouw;

import com.applovin.shadow.okhttp3.HttpUrl;
import j$.util.DesugarCollections;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import r5.c;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ra {
    private static final char[] yu = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final String bly;
    private final String fkw;

    /* renamed from: le, reason: collision with root package name */
    private final String f7658le;

    /* renamed from: lh, reason: collision with root package name */
    final int f7659lh;
    final String ouw;
    private final List<String> pno;
    private final List<String> ra;
    private final String tlj;
    final String vt;

    public ra(ouw ouwVar) {
        this.ouw = ouwVar.ouw;
        this.fkw = ouw(ouwVar.vt, false);
        this.f7658le = ouw(ouwVar.f7661lh, false);
        this.vt = ouwVar.yu;
        this.f7659lh = ouwVar.ouw();
        this.ra = ouw(ouwVar.f7660le, false);
        List<String> list = ouwVar.ra;
        this.pno = list != null ? ouw(list, true) : null;
        String str = ouwVar.pno;
        this.bly = str != null ? ouw(str, false) : null;
        this.tlj = ouwVar.toString();
    }

    private static List<String> lh(String str) {
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (i4 <= str.length()) {
            int iIndexOf = str.indexOf(38, i4);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i4);
            if (iIndexOf2 == -1 || iIndexOf2 > iIndexOf) {
                arrayList.add(str.substring(i4, iIndexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i4, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            }
            i4 = iIndexOf + 1;
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ra) && ((ra) obj).tlj.equals(this.tlj);
    }

    public final int hashCode() {
        return this.tlj.hashCode();
    }

    public final URL ouw() {
        try {
            return new URL(this.tlj);
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final String toString() {
        return this.tlj;
    }

    public final List<String> vt() {
        int iIndexOf = this.tlj.indexOf(47, this.ouw.length() + 3);
        String str = this.tlj;
        int iOuw = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iOuw) {
            int i4 = iIndexOf + 1;
            int iOuw2 = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(this.tlj, i4, iOuw, '/');
            arrayList.add(this.tlj.substring(i4, iOuw2));
            iIndexOf = iOuw2;
        }
        return arrayList;
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class ouw {

        /* renamed from: le, reason: collision with root package name */
        final List<String> f7660le;
        String ouw;
        String pno;
        List<String> ra;
        String yu;
        String vt = "";

        /* renamed from: lh, reason: collision with root package name */
        String f7661lh = "";
        int fkw = -1;

        /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
        /* renamed from: com.bytedance.sdk.component.vt.ouw.ra$ouw$ouw, reason: collision with other inner class name */
        public enum EnumC0063ouw {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public ouw() {
            ArrayList arrayList = new ArrayList();
            this.f7660le = arrayList;
            arrayList.add("");
        }

        private static boolean fkw(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private static boolean le(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private ouw yu(String str) {
            int i4 = 0;
            do {
                int iOuw = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(str, i4, str.length(), "/\\");
                ouw(str, i4, iOuw, iOuw < str.length());
                i4 = iOuw + 1;
            } while (i4 <= str.length());
            return this;
        }

        public final ouw lh(String str) {
            if (str != null) {
                return yu(str);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        public final ouw ouw(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.ouw = "http";
                return this;
            }
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            this.ouw = "https";
            return this;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.ouw);
            sb2.append("://");
            if (!this.vt.isEmpty() || !this.f7661lh.isEmpty()) {
                sb2.append(this.vt);
                if (!this.f7661lh.isEmpty()) {
                    sb2.append(':');
                    sb2.append(this.f7661lh);
                }
                sb2.append('@');
            }
            if (this.yu.indexOf(58) != -1) {
                sb2.append('[');
                sb2.append(this.yu);
                sb2.append(']');
            } else {
                sb2.append(this.yu);
            }
            int iOuw = ouw();
            if (iOuw != ra.ouw(this.ouw)) {
                sb2.append(':');
                sb2.append(iOuw);
            }
            ra.ouw(sb2, this.f7660le);
            if (this.ra != null) {
                sb2.append('?');
                ra.vt(sb2, this.ra);
            }
            if (this.pno != null) {
                sb2.append('#');
                sb2.append(this.pno);
            }
            return sb2.toString();
        }

        public final ouw vt(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strLh = lh(str, 0, str.length());
            if (strLh == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            this.yu = strLh;
            return this;
        }

        private void lh() {
            if (this.f7660le.remove(r0.size() - 1).isEmpty() && !this.f7660le.isEmpty()) {
                this.f7660le.set(r0.size() - 1, "");
            } else {
                this.f7660le.add("");
            }
        }

        public static int yu(String str, int i4, int i10) throws NumberFormatException {
            int i11;
            try {
                i11 = Integer.parseInt(ra.ouw(str, i4, i10, "", false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (i11 <= 0 || i11 > 65535) {
                return -1;
            }
            return i11;
        }

        public final ra vt() {
            if (this.ouw != null) {
                if (this.yu != null) {
                    return new ra(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public static String lh(String str, int i4, int i10) {
            return com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(ra.ouw(str, i4, i10, false));
        }

        public final int ouw() {
            int i4 = this.fkw;
            return i4 != -1 ? i4 : ra.ouw(this.ouw);
        }

        public final ouw ouw(String str, String str2) {
            if (str != null) {
                if (this.ra == null) {
                    this.ra = new ArrayList();
                }
                this.ra.add(ra.ouw(str, HttpUrl.QUERY_COMPONENT_REENCODE_SET));
                this.ra.add(str2 != null ? ra.ouw(str2, HttpUrl.QUERY_COMPONENT_REENCODE_SET) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        public static int vt(String str, int i4, int i10) {
            while (i4 < i10) {
                char cCharAt = str.charAt(i4);
                if (cCharAt == ':') {
                    return i4;
                }
                if (cCharAt == '[') {
                    do {
                        i4++;
                        if (i4 < i10) {
                        }
                    } while (str.charAt(i4) != ']');
                }
                i4++;
            }
            return i10;
        }

        public final void ouw(String str, int i4, int i10) {
            if (i4 == i10) {
                return;
            }
            char cCharAt = str.charAt(i4);
            if (cCharAt != '/' && cCharAt != '\\') {
                List<String> list = this.f7660le;
                list.set(list.size() - 1, "");
            } else {
                this.f7660le.clear();
                this.f7660le.add("");
                i4++;
            }
            while (i4 < i10) {
                int iOuw = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(str, i4, i10, "/\\");
                boolean z3 = iOuw < i10;
                ouw(str, i4, iOuw, z3);
                if (z3) {
                    iOuw++;
                }
                i4 = iOuw;
            }
        }

        private void ouw(String str, int i4, int i10, boolean z3) {
            String strOuw = ra.ouw(str, i4, i10, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, true, null);
            if (fkw(strOuw)) {
                return;
            }
            if (le(strOuw)) {
                lh();
                return;
            }
            if (this.f7660le.get(r10.size() - 1).isEmpty()) {
                this.f7660le.set(r10.size() - 1, strOuw);
            } else {
                this.f7660le.add(strOuw);
            }
            if (z3) {
                this.f7660le.add("");
            }
        }
    }

    public static int ouw(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static void ouw(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            sb2.append('/');
            sb2.append(list.get(i4));
        }
    }

    public static void vt(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4 += 2) {
            String str = list.get(i4);
            String str2 = list.get(i4 + 1);
            if (i4 > 0) {
                sb2.append('&');
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append('=');
                sb2.append(str2);
            }
        }
    }

    private static String ouw(String str, boolean z3) {
        return ouw(str, 0, str.length(), z3);
    }

    private static List<String> ouw(List<String> list, boolean z3) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            String str = list.get(i4);
            arrayList.add(str != null ? ouw(str, z3) : null);
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static ra vt(String str) throws NumberFormatException {
        int i4;
        ouw.EnumC0063ouw enumC0063ouw;
        String str2;
        int i10;
        char c9;
        int iOuw;
        char c10;
        char cCharAt;
        char cCharAt2;
        ouw ouwVar = new ouw();
        int iOuw2 = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(str, str.length());
        int iOuw3 = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(str, iOuw2, str.length());
        char c11 = ':';
        if (iOuw3 - iOuw2 < 2 || (((cCharAt2 = str.charAt(iOuw2)) < 'a' || cCharAt2 > 'z') && (cCharAt2 < 'A' || cCharAt2 > 'Z'))) {
            i4 = -1;
        } else {
            i4 = iOuw2 + 1;
            while (true) {
                if (i4 >= iOuw3) {
                    break;
                }
                char cCharAt3 = str.charAt(i4);
                if ((cCharAt3 >= 'a' && cCharAt3 <= 'z') || ((cCharAt3 >= 'A' && cCharAt3 <= 'Z') || ((cCharAt3 >= '0' && cCharAt3 <= '9') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                    i4++;
                } else if (cCharAt3 != ':') {
                    break;
                }
            }
            i4 = -1;
        }
        if (i4 != -1) {
            if (str.regionMatches(true, iOuw2, "https:", 0, 6)) {
                ouwVar.ouw = "https";
                i10 = iOuw2 + 6;
                str2 = str;
            } else {
                str2 = str;
                if (str2.regionMatches(true, iOuw2, "http:", 0, 5)) {
                    ouwVar.ouw = "http";
                    i10 = iOuw2 + 5;
                } else {
                    enumC0063ouw = ouw.EnumC0063ouw.UNSUPPORTED_SCHEME;
                }
            }
            int i11 = 0;
            int i12 = i10;
            while (true) {
                c9 = '/';
                if (i12 >= iOuw3 || !((cCharAt = str2.charAt(i12)) == '\\' || cCharAt == '/')) {
                    break;
                }
                i11++;
                i12++;
            }
            boolean z3 = false;
            boolean z10 = false;
            int i13 = i10 + i11;
            while (true) {
                iOuw = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(str2, i13, iOuw3, "@/\\?#");
                char cCharAt4 = iOuw != iOuw3 ? str2.charAt(iOuw) : (char) 65535;
                if (cCharAt4 == 65535 || cCharAt4 == '#' || cCharAt4 == c9 || cCharAt4 == '\\' || cCharAt4 == '?') {
                    break;
                }
                if (cCharAt4 == '@') {
                    if (!z3) {
                        int iOuw4 = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(str2, i13, iOuw, c11);
                        String strOuw = ouw(str2, i13, iOuw4, " \"':;<=>@[]^`{}|/\\?#", true, false, true, null);
                        if (z10) {
                            strOuw = c.m(new StringBuilder(), ouwVar.vt, "%40", strOuw);
                        }
                        ouwVar.vt = strOuw;
                        if (iOuw4 != iOuw) {
                            int i14 = iOuw4 + 1;
                            iOuw = iOuw;
                            ouwVar.f7661lh = ouw(str, i14, iOuw, " \"':;<=>@[]^`{}|/\\?#", true, false, true, null);
                            z3 = true;
                        } else {
                            iOuw = iOuw;
                        }
                        str2 = str;
                        z10 = true;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(ouwVar.f7661lh);
                        sb2.append("%40");
                        str2 = str;
                        sb2.append(ouw(str2, i13, iOuw, " \"':;<=>@[]^`{}|/\\?#", true, false, true, null));
                        ouwVar.f7661lh = sb2.toString();
                    }
                    i13 = iOuw + 1;
                    c11 = ':';
                    c9 = '/';
                }
            }
            int iVt = ouw.vt(str2, i13, iOuw);
            int i15 = iVt + 1;
            if (i15 < iOuw) {
                ouwVar.yu = ouw.lh(str2, i13, iVt);
                int iYu = ouw.yu(str2, i15, iOuw);
                ouwVar.fkw = iYu;
                if (iYu == -1) {
                    enumC0063ouw = ouw.EnumC0063ouw.INVALID_PORT;
                }
            } else {
                ouwVar.yu = ouw.lh(str2, i13, iVt);
                ouwVar.fkw = ouw(ouwVar.ouw);
            }
            if (ouwVar.yu == null) {
                enumC0063ouw = ouw.EnumC0063ouw.INVALID_HOST;
            } else {
                int iOuw5 = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(str2, iOuw, iOuw3, "?#");
                ouwVar.ouw(str2, iOuw, iOuw5);
                if (iOuw5 >= iOuw3 || str2.charAt(iOuw5) != '?') {
                    c10 = '#';
                } else {
                    int iOuw6 = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(str2, iOuw5, iOuw3, '#');
                    c10 = '#';
                    ouwVar.ra = lh(ouw(str2, iOuw5 + 1, iOuw6, HttpUrl.QUERY_ENCODE_SET, true, true, true, null));
                    iOuw5 = iOuw6;
                }
                if (iOuw5 < iOuw3 && str2.charAt(iOuw5) == c10) {
                    ouwVar.pno = ouw(str2, iOuw5 + 1, iOuw3, "", true, false, false, null);
                }
                enumC0063ouw = ouw.EnumC0063ouw.SUCCESS;
            }
        } else {
            enumC0063ouw = ouw.EnumC0063ouw.MISSING_SCHEME;
        }
        if (enumC0063ouw == ouw.EnumC0063ouw.SUCCESS) {
            return ouwVar.vt();
        }
        return null;
    }

    public static String ouw(String str, int i4, int i10, boolean z3) {
        for (int i11 = i4; i11 < i10; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '%' || (cCharAt == '+' && z3)) {
                com.bytedance.sdk.component.vt.ouw.vt.ouw ouwVar = new com.bytedance.sdk.component.vt.ouw.vt.ouw();
                ouwVar.ouw(str, i4, i11);
                ouw(ouwVar, str, i11, i10, z3);
                return ouwVar.lh();
            }
        }
        return str.substring(i4, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ouw(com.bytedance.sdk.component.vt.ouw.vt.ouw r5, java.lang.String r6, int r7, int r8, boolean r9) {
        /*
        L0:
            if (r7 >= r8) goto L42
            int r0 = r6.codePointAt(r7)
            r1 = 37
            if (r0 != r1) goto L2d
            int r1 = r7 + 2
            if (r1 >= r8) goto L2d
            int r2 = r7 + 1
            char r2 = r6.charAt(r2)
            int r2 = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(r2)
            char r3 = r6.charAt(r1)
            int r3 = com.bytedance.sdk.component.vt.ouw.vt.bly.ouw(r3)
            r4 = -1
            if (r2 == r4) goto L39
            if (r3 == r4) goto L39
            int r7 = r2 << 4
            int r7 = r7 + r3
            r5.vt(r7)
            r7 = r1
            goto L3c
        L2d:
            r1 = 43
            if (r0 != r1) goto L39
            if (r9 == 0) goto L39
            r1 = 32
            r5.vt(r1)
            goto L3c
        L39:
            r5.ouw(r0)
        L3c:
            int r0 = java.lang.Character.charCount(r0)
            int r7 = r7 + r0
            goto L0
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.vt.ouw.ra.ouw(com.bytedance.sdk.component.vt.ouw.vt.ouw, java.lang.String, int, int, boolean):void");
    }

    public static String ouw(String str, int i4, int i10, String str2, boolean z3, boolean z10, boolean z11, Charset charset) {
        int iCharCount = i4;
        while (iCharCount < i10) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z11) && str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || z3) && (iCodePointAt != 43 || !z10)))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                com.bytedance.sdk.component.vt.ouw.vt.ouw ouwVar = new com.bytedance.sdk.component.vt.ouw.vt.ouw();
                ouwVar.ouw(str, i4, iCharCount);
                ouw(ouwVar, str, iCharCount, i10, str2, z3, z10, z11, charset);
                return ouwVar.lh();
            }
        }
        return str.substring(i4, i10);
    }

    private static void ouw(com.bytedance.sdk.component.vt.ouw.vt.ouw ouwVar, String str, int i4, int i10, String str2, boolean z3, boolean z10, boolean z11, Charset charset) {
        com.bytedance.sdk.component.vt.ouw.vt.ouw ouwVar2 = null;
        while (i4 < i10) {
            int iCodePointAt = str.codePointAt(i4);
            if (!z3 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z10) {
                    ouwVar.ouw(z3 ? "+" : "%2B");
                } else if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z11) && str2.indexOf(iCodePointAt) == -1 && (iCodePointAt != 37 || z3))) {
                    ouwVar.ouw(iCodePointAt);
                } else {
                    if (ouwVar2 == null) {
                        ouwVar2 = new com.bytedance.sdk.component.vt.ouw.vt.ouw();
                    }
                    if (charset != null && !charset.equals(com.bytedance.sdk.component.vt.ouw.vt.bly.ouw)) {
                        ouwVar2.ouw(str, i4, Character.charCount(iCodePointAt) + i4, charset);
                    } else {
                        ouwVar2.ouw(iCodePointAt);
                    }
                    while (!ouwVar2.ouw()) {
                        byte bVt = ouwVar2.vt();
                        ouwVar.vt(37);
                        char[] cArr = yu;
                        ouwVar.vt(cArr[((bVt & 255) >> 4) & 15]);
                        ouwVar.vt(cArr[bVt & 15]);
                    }
                }
            }
            i4 += Character.charCount(iCodePointAt);
        }
    }

    public static String ouw(String str, String str2) {
        return ouw(str, 0, str.length(), str2, true, true, true, null);
    }
}
