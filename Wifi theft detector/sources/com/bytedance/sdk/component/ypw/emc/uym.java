package com.bytedance.sdk.component.ypw.emc;

import com.unity3d.services.core.network.model.HttpRequest;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.slf4j.Marker;

/* loaded from: classes.dex */
public final class uym {
    private static final char[] dg = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final String bw;
    final String emc;
    private final List<String> msw;
    private final String ru;
    private final List<String> uym;
    final int xq;
    private final String ycc;
    final String ypw;
    private final String zz;

    public static final class emc {
        String dg;
        String emc;
        String msw;
        List<String> uym;
        final List<String> ycc;
        String ypw = "";
        String xq = "";
        int bw = -1;

        /* renamed from: com.bytedance.sdk.component.ypw.emc.uym$emc$emc, reason: collision with other inner class name */
        public enum EnumC0129emc {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public emc() {
            ArrayList arrayList = new ArrayList();
            this.ycc = arrayList;
            arrayList.add("");
        }

        private boolean bw(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean ycc(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        public emc dg(String str) {
            this.uym = str != null ? uym.ypw(uym.emc(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public emc emc(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.emc = "http";
                return this;
            }
            if (!str.equalsIgnoreCase(HttpRequest.DEFAULT_SCHEME)) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            this.emc = HttpRequest.DEFAULT_SCHEME;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.emc);
            sb.append("://");
            if (!this.ypw.isEmpty() || !this.xq.isEmpty()) {
                sb.append(this.ypw);
                if (!this.xq.isEmpty()) {
                    sb.append(':');
                    sb.append(this.xq);
                }
                sb.append('@');
            }
            if (this.dg.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.dg);
                sb.append(']');
            } else {
                sb.append(this.dg);
            }
            int iEmc = emc();
            if (iEmc != uym.emc(this.emc)) {
                sb.append(':');
                sb.append(iEmc);
            }
            uym.emc(sb, this.ycc);
            if (this.uym != null) {
                sb.append('?');
                uym.ypw(sb, this.uym);
            }
            if (this.msw != null) {
                sb.append('#');
                sb.append(this.msw);
            }
            return sb.toString();
        }

        public emc xq(String str) {
            if (str != null) {
                return emc(str, true);
            }
            throw new NullPointerException("encodedPathSegments == null");
        }

        public emc ypw(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String strBw = bw(str, 0, str.length());
            if (strBw == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            this.dg = strBw;
            return this;
        }

        private static String bw(String str, int i10, int i11) {
            return com.bytedance.sdk.component.ypw.emc.ypw.zz.emc(uym.emc(str, i10, i11, false));
        }

        private static int dg(String str, int i10, int i11) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == ':') {
                    return i10;
                }
                if (cCharAt == '[') {
                    do {
                        i10++;
                        if (i10 < i11) {
                        }
                    } while (str.charAt(i10) != ']');
                }
                i10++;
            }
            return i11;
        }

        private void xq() {
            if (this.ycc.remove(r0.size() - 1).isEmpty() && !this.ycc.isEmpty()) {
                this.ycc.set(r0.size() - 1, "");
            } else {
                this.ycc.add("");
            }
        }

        private static int ycc(String str, int i10, int i11) throws NumberFormatException {
            int i12;
            try {
                i12 = Integer.parseInt(uym.emc(str, i10, i11, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (i12 <= 0 || i12 > 65535) {
                return -1;
            }
            return i12;
        }

        public uym ypw() {
            if (this.emc != null) {
                if (this.dg != null) {
                    return new uym(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        private static int xq(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\\' && cCharAt != '/') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        public int emc() {
            int i10 = this.bw;
            return i10 != -1 ? i10 : uym.emc(this.emc);
        }

        private emc emc(String str, boolean z10) {
            boolean z11;
            emc emcVar;
            String str2;
            boolean z12;
            int i10 = 0;
            while (true) {
                int iEmc = com.bytedance.sdk.component.ypw.emc.ypw.zz.emc(str, i10, str.length(), "/\\");
                if (iEmc < str.length()) {
                    z11 = true;
                    str2 = str;
                    z12 = z10;
                    emcVar = this;
                } else {
                    z11 = false;
                    emcVar = this;
                    str2 = str;
                    z12 = z10;
                }
                emcVar.emc(str2, i10, iEmc, z11, z12);
                i10 = iEmc + 1;
                if (i10 > str2.length()) {
                    return emcVar;
                }
                str = str2;
                z10 = z12;
            }
        }

        private static int ypw(String str, int i10, int i11) {
            if (i11 - i10 < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i10);
            if ((cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z')) {
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i10);
                    if (cCharAt2 < 'a' || cCharAt2 > 'z') {
                        if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        public emc emc(String str, String str2) {
            if (str != null) {
                if (this.uym == null) {
                    this.uym = new ArrayList();
                }
                this.uym.add(uym.emc(str, " \"'<>#&=", true, false, true, true));
                this.uym.add(str2 != null ? uym.emc(str2, " \"'<>#&=", true, false, true, true) : null);
                return this;
            }
            throw new NullPointerException("encodedName == null");
        }

        public EnumC0129emc emc(uym uymVar, String str) throws NumberFormatException {
            int iEmc;
            String str2;
            int i10;
            String str3;
            String str4 = str;
            int iEmc2 = com.bytedance.sdk.component.ypw.emc.ypw.zz.emc(str4, 0, str4.length());
            int iYpw = com.bytedance.sdk.component.ypw.emc.ypw.zz.ypw(str4, iEmc2, str4.length());
            if (ypw(str4, iEmc2, iYpw) != -1) {
                if (str4.regionMatches(true, iEmc2, "https:", 0, 6)) {
                    this.emc = HttpRequest.DEFAULT_SCHEME;
                    iEmc2 += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (str4.regionMatches(true, iEmc2, "http:", 0, 5)) {
                        this.emc = "http";
                        iEmc2 += 5;
                    } else {
                        return EnumC0129emc.UNSUPPORTED_SCHEME;
                    }
                }
            } else if (uymVar != null) {
                this.emc = uymVar.emc;
            } else {
                return EnumC0129emc.MISSING_SCHEME;
            }
            int iXq = xq(str4, iEmc2, iYpw);
            char c10 = '#';
            if (iXq < 2 && uymVar != null && uymVar.emc.equals(this.emc)) {
                this.ypw = uymVar.ypw();
                this.xq = uymVar.xq();
                this.dg = uymVar.ypw;
                this.bw = uymVar.xq;
                this.ycc.clear();
                this.ycc.addAll(uymVar.dg());
                if (iEmc2 == iYpw || str4.charAt(iEmc2) == '#') {
                    dg(uymVar.bw());
                }
                str2 = str4;
            } else {
                int i11 = iEmc2 + iXq;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    iEmc = com.bytedance.sdk.component.ypw.emc.ypw.zz.emc(str4, i11, iYpw, "@/\\?#");
                    char cCharAt = iEmc != iYpw ? str4.charAt(iEmc) : (char) 65535;
                    if (cCharAt == 65535 || cCharAt == c10 || cCharAt == '/' || cCharAt == '\\' || cCharAt == '?') {
                        break;
                    }
                    if (cCharAt == '@') {
                        if (!z10) {
                            int iEmc3 = com.bytedance.sdk.component.ypw.emc.ypw.zz.emc(str4, i11, iEmc, ':');
                            String strEmc = uym.emc(str, i11, iEmc3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z11) {
                                strEmc = this.ypw + "%40" + strEmc;
                            }
                            this.ypw = strEmc;
                            if (iEmc3 != iEmc) {
                                i10 = iEmc;
                                this.xq = uym.emc(str, iEmc3 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z10 = true;
                            } else {
                                i10 = iEmc;
                            }
                            str3 = str;
                            z11 = true;
                        } else {
                            i10 = iEmc;
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.xq);
                            sb.append("%40");
                            str3 = str;
                            sb.append(uym.emc(str3, i11, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                            this.xq = sb.toString();
                        }
                        i11 = i10 + 1;
                        str4 = str3;
                        c10 = '#';
                    }
                }
                str2 = str4;
                int i12 = i11;
                int iDg = dg(str2, i12, iEmc);
                int i13 = iDg + 1;
                if (i13 < iEmc) {
                    this.dg = bw(str2, i12, iDg);
                    int iYcc = ycc(str2, i13, iEmc);
                    this.bw = iYcc;
                    if (iYcc == -1) {
                        return EnumC0129emc.INVALID_PORT;
                    }
                } else {
                    this.dg = bw(str2, i12, iDg);
                    this.bw = uym.emc(this.emc);
                }
                if (this.dg == null) {
                    return EnumC0129emc.INVALID_HOST;
                }
                iEmc2 = iEmc;
            }
            int iEmc4 = com.bytedance.sdk.component.ypw.emc.ypw.zz.emc(str2, iEmc2, iYpw, "?#");
            emc(str2, iEmc2, iEmc4);
            if (iEmc4 < iYpw && str2.charAt(iEmc4) == '?') {
                int iEmc5 = com.bytedance.sdk.component.ypw.emc.ypw.zz.emc(str2, iEmc4, iYpw, '#');
                this.uym = uym.ypw(uym.emc(str2, iEmc4 + 1, iEmc5, " \"'<>#", true, false, true, true, null));
                iEmc4 = iEmc5;
            }
            if (iEmc4 < iYpw && str2.charAt(iEmc4) == '#') {
                this.msw = uym.emc(str2, iEmc4 + 1, iYpw, "", true, false, false, false, null);
            }
            return EnumC0129emc.SUCCESS;
        }

        private void emc(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt != '/' && cCharAt != '\\') {
                List<String> list = this.ycc;
                list.set(list.size() - 1, "");
            } else {
                this.ycc.clear();
                this.ycc.add("");
                i10++;
            }
            int i12 = i10;
            while (i12 < i11) {
                int iEmc = com.bytedance.sdk.component.ypw.emc.ypw.zz.emc(str, i12, i11, "/\\");
                boolean z10 = iEmc < i11;
                String str2 = str;
                emc(str2, i12, iEmc, z10, true);
                if (z10) {
                    iEmc++;
                }
                i12 = iEmc;
                str = str2;
            }
        }

        private void emc(String str, int i10, int i11, boolean z10, boolean z11) {
            String strEmc = uym.emc(str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, true, null);
            if (bw(strEmc)) {
                return;
            }
            if (ycc(strEmc)) {
                xq();
                return;
            }
            if (this.ycc.get(r11.size() - 1).isEmpty()) {
                this.ycc.set(r11.size() - 1, strEmc);
            } else {
                this.ycc.add(strEmc);
            }
            if (z10) {
                this.ycc.add("");
            }
        }
    }

    public uym(emc emcVar) {
        this.emc = emcVar.emc;
        this.bw = emc(emcVar.ypw, false);
        this.ycc = emc(emcVar.xq, false);
        this.ypw = emcVar.dg;
        this.xq = emcVar.emc();
        this.uym = emc(emcVar.ycc, false);
        List<String> list = emcVar.uym;
        this.msw = list != null ? emc(list, true) : null;
        String str = emcVar.msw;
        this.zz = str != null ? emc(str, false) : null;
        this.ru = emcVar.toString();
    }

    public String bw() {
        if (this.msw == null) {
            return null;
        }
        int iIndexOf = this.ru.indexOf(63) + 1;
        String str = this.ru;
        return this.ru.substring(iIndexOf, com.bytedance.sdk.component.ypw.emc.ypw.zz.emc(str, iIndexOf, str.length(), '#'));
    }

    public List<String> dg() {
        int iIndexOf = this.ru.indexOf(47, this.emc.length() + 3);
        String str = this.ru;
        int iEmc = com.bytedance.sdk.component.ypw.emc.ypw.zz.emc(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iEmc) {
            int i10 = iIndexOf + 1;
            int iEmc2 = com.bytedance.sdk.component.ypw.emc.ypw.zz.emc(this.ru, i10, iEmc, '/');
            arrayList.add(this.ru.substring(i10, iEmc2));
            iIndexOf = iEmc2;
        }
        return arrayList;
    }

    public URL emc() {
        try {
            return new URL(this.ru);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof uym) && ((uym) obj).ru.equals(this.ru);
    }

    public int hashCode() {
        return this.ru.hashCode();
    }

    public String toString() {
        return this.ru;
    }

    public String xq() {
        if (this.ycc.isEmpty()) {
            return "";
        }
        return this.ru.substring(this.ru.indexOf(58, this.emc.length() + 3) + 1, this.ru.indexOf(64));
    }

    public String ypw() {
        if (this.bw.isEmpty()) {
            return "";
        }
        int length = this.emc.length() + 3;
        String str = this.ru;
        return this.ru.substring(length, com.bytedance.sdk.component.ypw.emc.ypw.zz.emc(str, length, str.length(), ":@"));
    }

    public static int emc(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(HttpRequest.DEFAULT_SCHEME) ? 443 : -1;
    }

    public static void emc(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb.append('/');
            sb.append(list.get(i10));
        }
    }

    public static uym xq(String str) {
        emc emcVar = new emc();
        if (emcVar.emc((uym) null, str) == emc.EnumC0129emc.SUCCESS) {
            return emcVar.ypw();
        }
        return null;
    }

    public static void ypw(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            String str = list.get(i10);
            String str2 = list.get(i10 + 1);
            if (i10 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    public static String emc(String str, boolean z10) {
        return emc(str, 0, str.length(), z10);
    }

    private List<String> emc(List<String> list, boolean z10) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            arrayList.add(str != null ? emc(str, z10) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static List<String> ypw(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int iIndexOf = str.indexOf(38, i10);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i10);
            if (iIndexOf2 != -1 && iIndexOf2 <= iIndexOf) {
                arrayList.add(str.substring(i10, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            } else {
                arrayList.add(str.substring(i10, iIndexOf));
                arrayList.add(null);
            }
            i10 = iIndexOf + 1;
        }
        return arrayList;
    }

    public static String emc(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                com.bytedance.sdk.component.ypw.emc.ypw.emc emcVar = new com.bytedance.sdk.component.ypw.emc.ypw.emc();
                emcVar.emc(str, i10, i12);
                emc(emcVar, str, i12, i11, z10);
                return emcVar.xq();
            }
        }
        return str.substring(i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void emc(com.bytedance.sdk.component.ypw.emc.ypw.emc r5, java.lang.String r6, int r7, int r8, boolean r9) {
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
            int r2 = com.bytedance.sdk.component.ypw.emc.ypw.zz.emc(r2)
            char r3 = r6.charAt(r1)
            int r3 = com.bytedance.sdk.component.ypw.emc.ypw.zz.emc(r3)
            r4 = -1
            if (r2 == r4) goto L39
            if (r3 == r4) goto L39
            int r7 = r2 << 4
            int r7 = r7 + r3
            r5.ypw(r7)
            r7 = r1
            goto L3c
        L2d:
            r1 = 43
            if (r0 != r1) goto L39
            if (r9 == 0) goto L39
            r1 = 32
            r5.ypw(r1)
            goto L3c
        L39:
            r5.emc(r0)
        L3c:
            int r0 = java.lang.Character.charCount(r0)
            int r7 = r7 + r0
            goto L0
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.ypw.emc.uym.emc(com.bytedance.sdk.component.ypw.emc.ypw.emc, java.lang.String, int, int, boolean):void");
    }

    public static boolean emc(String str, int i10, int i11) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && com.bytedance.sdk.component.ypw.emc.ypw.zz.emc(str.charAt(i10 + 1)) != -1 && com.bytedance.sdk.component.ypw.emc.ypw.zz.emc(str.charAt(i12)) != -1;
    }

    public static String emc(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        int iCharCount = i10;
        while (iCharCount < i11) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z13) && str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z10 && (!z11 || emc(str, iCharCount, i11)))) && (iCodePointAt != 43 || !z12)))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                com.bytedance.sdk.component.ypw.emc.ypw.emc emcVar = new com.bytedance.sdk.component.ypw.emc.ypw.emc();
                emcVar.emc(str, i10, iCharCount);
                emc(emcVar, str, iCharCount, i11, str2, z10, z11, z12, z13, charset);
                return emcVar.xq();
            }
        }
        return str.substring(i10, i11);
    }

    public static void emc(com.bytedance.sdk.component.ypw.emc.ypw.emc emcVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        com.bytedance.sdk.component.ypw.emc.ypw.emc emcVar2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt == 43 && z12) {
                    emcVar.emc(z10 ? Marker.ANY_NON_NULL_MARKER : "%2B");
                } else if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z13) && str2.indexOf(iCodePointAt) == -1 && (iCodePointAt != 37 || (z10 && (!z11 || emc(str, i10, i11)))))) {
                    emcVar.emc(iCodePointAt);
                } else {
                    if (emcVar2 == null) {
                        emcVar2 = new com.bytedance.sdk.component.ypw.emc.ypw.emc();
                    }
                    if (charset != null && !charset.equals(com.bytedance.sdk.component.ypw.emc.ypw.zz.emc)) {
                        emcVar2.emc(str, i10, Character.charCount(iCodePointAt) + i10, charset);
                    } else {
                        emcVar2.emc(iCodePointAt);
                    }
                    while (!emcVar2.emc()) {
                        byte bYpw = emcVar2.ypw();
                        emcVar.ypw(37);
                        char[] cArr = dg;
                        emcVar.ypw((int) cArr[((bYpw & 255) >> 4) & 15]);
                        emcVar.ypw((int) cArr[bYpw & 15]);
                    }
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    public static String emc(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        return emc(str, 0, str.length(), str2, z10, z11, z12, z13, null);
    }
}
