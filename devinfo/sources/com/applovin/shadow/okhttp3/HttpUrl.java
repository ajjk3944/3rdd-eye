package com.applovin.shadow.okhttp3;

import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.shadow.okhttp3.internal.HostnamesKt;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import com.applovin.shadow.okio.Buffer;
import com.bumptech.glide.e;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import je.u;
import nk.f;
import nk.k;
import r5.c;
import sk.b;
import vk.i;
import vk.p;
import yj.a;
import zj.o;
import zj.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class HttpUrl {
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final String FRAGMENT_ENCODE_SET = "";
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    private final String host;
    private final boolean isHttps;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;
    public static final Companion Companion = new Companion(null);
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class Builder {
        public static final Companion Companion = new Companion(null);
        public static final String INVALID_HOST = "Invalid URL host";
        private String encodedFragment;
        private final List<String> encodedPathSegments;
        private List<String> encodedQueryNamesAndValues;
        private String host;
        private String scheme;
        private String encodedUsername = "";
        private String encodedPassword = "";
        private int port = -1;

        /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int parsePort(String str, int i4, int i10) throws NumberFormatException {
                int i11;
                try {
                    i11 = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i4, i10, "", false, false, false, false, null, 248, null));
                } catch (NumberFormatException unused) {
                }
                if (1 > i11 || i11 >= 65536) {
                    return -1;
                }
                return i11;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int portColonOffset(String str, int i4, int i10) {
                while (i4 < i10) {
                    char cCharAt = str.charAt(i4);
                    if (cCharAt == '[') {
                        do {
                            i4++;
                            if (i4 < i10) {
                            }
                        } while (str.charAt(i4) != ']');
                    } else if (cCharAt == ':') {
                        return i4;
                    }
                    i4++;
                }
                return i10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int schemeDelimiterOffset(String str, int i4, int i10) {
                if (i10 - i4 < 2) {
                    return -1;
                }
                char cCharAt = str.charAt(i4);
                if ((k.f(cCharAt, 97) >= 0 && k.f(cCharAt, 122) <= 0) || (k.f(cCharAt, 65) >= 0 && k.f(cCharAt, 90) <= 0)) {
                    while (true) {
                        i4++;
                        if (i4 >= i10) {
                            break;
                        }
                        char cCharAt2 = str.charAt(i4);
                        if ('a' > cCharAt2 || cCharAt2 >= '{') {
                            if ('A' > cCharAt2 || cCharAt2 >= '[') {
                                if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                    if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                        if (cCharAt2 == ':') {
                                            return i4;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int slashCount(String str, int i4, int i10) {
                int i11 = 0;
                while (i4 < i10) {
                    char cCharAt = str.charAt(i4);
                    if (cCharAt != '\\' && cCharAt != '/') {
                        break;
                    }
                    i11++;
                    i4++;
                }
                return i11;
            }

            private Companion() {
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private final int effectivePort() {
            int i4 = this.port;
            if (i4 != -1) {
                return i4;
            }
            Companion companion = HttpUrl.Companion;
            String str = this.scheme;
            k.b(str);
            return companion.defaultPort(str);
        }

        private final boolean isDot(String str) {
            return k.a(str, ".") || p.q0(str, "%2e");
        }

        private final boolean isDotDot(String str) {
            return k.a(str, "..") || p.q0(str, "%2e.") || p.q0(str, ".%2e") || p.q0(str, "%2e%2e");
        }

        private final void pop() {
            if (this.encodedPathSegments.remove(r0.size() - 1).length() != 0 || this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            } else {
                this.encodedPathSegments.set(r0.size() - 1, "");
            }
        }

        private final void push(String str, int i4, int i10, boolean z3, boolean z10) {
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i4, i10, HttpUrl.PATH_SEGMENT_ENCODE_SET, z10, false, false, false, null, 240, null);
            if (isDot(strCanonicalize$okhttp$default)) {
                return;
            }
            if (isDotDot(strCanonicalize$okhttp$default)) {
                pop();
                return;
            }
            if (this.encodedPathSegments.get(r14.size() - 1).length() == 0) {
                this.encodedPathSegments.set(r14.size() - 1, strCanonicalize$okhttp$default);
            } else {
                this.encodedPathSegments.add(strCanonicalize$okhttp$default);
            }
            if (z3) {
                this.encodedPathSegments.add("");
            }
        }

        private final void removeAllCanonicalQueryParameters(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            k.b(list);
            int size = list.size() - 2;
            int iE = e.E(size, 0, -2);
            if (iE > size) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                k.b(list2);
                if (k.a(str, list2.get(size))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    k.b(list3);
                    list3.remove(size + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    k.b(list4);
                    list4.remove(size);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    k.b(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size == iE) {
                    return;
                } else {
                    size -= 2;
                }
            }
        }

        private final void resolvePath(String str, int i4, int i10) {
            if (i4 == i10) {
                return;
            }
            char cCharAt = str.charAt(i4);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                i4++;
            } else {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            }
            int i11 = i4;
            while (i11 < i10) {
                int iDelimiterOffset = Util.delimiterOffset(str, "/\\", i11, i10);
                boolean z3 = iDelimiterOffset < i10;
                String str2 = str;
                push(str2, i11, iDelimiterOffset, z3, true);
                if (z3) {
                    i11 = iDelimiterOffset + 1;
                    str = str2;
                } else {
                    str = str2;
                    i11 = iDelimiterOffset;
                }
            }
        }

        public final Builder addEncodedPathSegment(String str) {
            k.e(str, "encodedPathSegment");
            push(str, 0, str.length(), false, true);
            return this;
        }

        public final Builder addEncodedPathSegments(String str) {
            k.e(str, "encodedPathSegments");
            return addPathSegments(str, true);
        }

        public final Builder addEncodedQueryParameter(String str, String str2) {
            k.e(str, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            k.b(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            k.b(list2);
            list2.add(str2 != null ? Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null) : null);
            return this;
        }

        public final Builder addPathSegment(String str) {
            k.e(str, "pathSegment");
            push(str, 0, str.length(), false, false);
            return this;
        }

        public final Builder addPathSegments(String str) {
            k.e(str, "pathSegments");
            return addPathSegments(str, false);
        }

        public final Builder addQueryParameter(String str, String str2) {
            k.e(str, "name");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            k.b(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            k.b(list2);
            list2.add(str2 != null ? Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null) : null);
            return this;
        }

        public final HttpUrl build() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            Companion companion = HttpUrl.Companion;
            String strPercentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, null);
            String strPercentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, null);
            String str2 = this.host;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iEffectivePort = effectivePort();
            List<String> list = this.encodedPathSegments;
            ArrayList arrayList2 = new ArrayList(o.T(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.Companion, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                ArrayList arrayList3 = new ArrayList(o.T(list2, 10));
                for (String str3 : list2) {
                    arrayList3.add(str3 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.encodedFragment;
            return new HttpUrl(str, strPercentDecode$okhttp$default, strPercentDecode$okhttp$default2, str2, iEffectivePort, arrayList2, arrayList, str4 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str4, 0, 0, false, 7, null) : null, toString());
        }

        public final Builder encodedFragment(String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", true, false, false, true, null, 179, null) : null;
            return this;
        }

        public final Builder encodedPassword(String str) {
            k.e(str, "encodedPassword");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final Builder encodedPath(String str) {
            k.e(str, "encodedPath");
            if (!p.w0(str, "/", false)) {
                throw new IllegalArgumentException("unexpected encodedPath: ".concat(str).toString());
            }
            resolvePath(str, 0, str.length());
            return this;
        }

        public final Builder encodedQuery(String str) {
            Companion companion;
            String strCanonicalize$okhttp$default;
            this.encodedQueryNamesAndValues = (str == null || (strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default((companion = HttpUrl.Companion), str, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 211, null)) == null) ? null : companion.toQueryNamesAndValues$okhttp(strCanonicalize$okhttp$default);
            return this;
        }

        public final Builder encodedUsername(String str) {
            k.e(str, "encodedUsername");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final Builder fragment(String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", false, false, false, true, null, 187, null) : null;
            return this;
        }

        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        public final String getScheme$okhttp() {
            return this.scheme;
        }

        public final Builder host(String str) {
            k.e(str, "host");
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, 0, 0, false, 7, null));
            if (canonicalHost == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(str));
            }
            this.host = canonicalHost;
            return this;
        }

        public final Builder parse$okhttp(HttpUrl httpUrl, String str) throws NumberFormatException {
            int iDelimiterOffset;
            int i4;
            String str2;
            int i10;
            String str3;
            boolean z3;
            char c9;
            int i11;
            int i12;
            char c10;
            int i13;
            String str4 = str;
            k.e(str4, "input");
            int iIndexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(str4, 0, 0, 3, null);
            int iIndexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(str4, iIndexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = Companion;
            int iSchemeDelimiterOffset = companion.schemeDelimiterOffset(str4, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            String str5 = "this as java.lang.String…ing(startIndex, endIndex)";
            boolean z10 = true;
            char c11 = 65535;
            if (iSchemeDelimiterOffset != -1) {
                if (p.v0(str4, iIndexOfFirstNonAsciiWhitespace$default, "https:", true)) {
                    this.scheme = "https";
                    iIndexOfFirstNonAsciiWhitespace$default += 6;
                } else {
                    if (!p.v0(str4, iIndexOfFirstNonAsciiWhitespace$default, "http:", true)) {
                        StringBuilder sb2 = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = str4.substring(0, iSchemeDelimiterOffset);
                        k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(strSubstring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.scheme = "http";
                    iIndexOfFirstNonAsciiWhitespace$default += 5;
                }
            } else {
                if (httpUrl == null) {
                    throw new IllegalArgumentException(u.t("Expected URL scheme 'http' or 'https' but no scheme was found for ", str4.length() > 6 ? i.U0(6, str4).concat("...") : str4));
                }
                this.scheme = httpUrl.scheme();
            }
            int iSlashCount = companion.slashCount(str4, iIndexOfFirstNonAsciiWhitespace$default, iIndexOfLastNonAsciiWhitespace$default);
            char c12 = '?';
            char c13 = '#';
            if (iSlashCount >= 2 || httpUrl == null || !k.a(httpUrl.scheme(), this.scheme)) {
                int i14 = iIndexOfFirstNonAsciiWhitespace$default + iSlashCount;
                boolean z11 = false;
                boolean z12 = false;
                while (true) {
                    iDelimiterOffset = Util.delimiterOffset(str4, "@/\\?#", i14, iIndexOfLastNonAsciiWhitespace$default);
                    char cCharAt = iDelimiterOffset != iIndexOfLastNonAsciiWhitespace$default ? str4.charAt(iDelimiterOffset) : c11;
                    if (cCharAt == c11 || cCharAt == c13 || cCharAt == '/' || cCharAt == '\\' || cCharAt == c12) {
                        break;
                    }
                    if (cCharAt == '@') {
                        if (z11) {
                            i10 = iIndexOfLastNonAsciiWhitespace$default;
                            str3 = str5;
                            z3 = z10;
                            c9 = c11;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.encodedPassword);
                            sb3.append("%40");
                            str4 = str;
                            i11 = iDelimiterOffset;
                            sb3.append(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str4, i14, iDelimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.encodedPassword = sb3.toString();
                        } else {
                            int iDelimiterOffset2 = Util.delimiterOffset(str4, ':', i14, iDelimiterOffset);
                            Companion companion2 = HttpUrl.Companion;
                            str3 = str5;
                            c9 = c11;
                            i10 = iIndexOfLastNonAsciiWhitespace$default;
                            z3 = z10;
                            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion2, str4, i14, iDelimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z12) {
                                strCanonicalize$okhttp$default = c.m(new StringBuilder(), this.encodedUsername, "%40", strCanonicalize$okhttp$default);
                            }
                            this.encodedUsername = strCanonicalize$okhttp$default;
                            if (iDelimiterOffset2 != iDelimiterOffset) {
                                i12 = iDelimiterOffset;
                                this.encodedPassword = Companion.canonicalize$okhttp$default(companion2, str, iDelimiterOffset2 + 1, i12, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z11 = z3;
                            } else {
                                i12 = iDelimiterOffset;
                            }
                            str4 = str;
                            i11 = i12;
                            z12 = z3;
                        }
                        i14 = i11 + 1;
                        c11 = c9;
                        iIndexOfLastNonAsciiWhitespace$default = i10;
                        str5 = str3;
                        z10 = z3;
                        c12 = '?';
                        c13 = '#';
                    }
                }
                i4 = iIndexOfLastNonAsciiWhitespace$default;
                String str6 = str5;
                char c14 = c11;
                Companion companion3 = Companion;
                int iPortColonOffset = companion3.portColonOffset(str4, i14, iDelimiterOffset);
                int i15 = iPortColonOffset + 1;
                if (i15 < iDelimiterOffset) {
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str4, i14, iPortColonOffset, false, 4, null));
                    int port = companion3.parsePort(str4, i15, iDelimiterOffset);
                    this.port = port;
                    if (port == c14) {
                        StringBuilder sb4 = new StringBuilder("Invalid URL port: \"");
                        String strSubstring2 = str4.substring(i15, iDelimiterOffset);
                        k.d(strSubstring2, str6);
                        sb4.append(strSubstring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                    str2 = str6;
                } else {
                    str2 = str6;
                    Companion companion4 = HttpUrl.Companion;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, str4, i14, iPortColonOffset, false, 4, null));
                    String str7 = this.scheme;
                    k.b(str7);
                    this.port = companion4.defaultPort(str7);
                }
                if (this.host == null) {
                    StringBuilder sb5 = new StringBuilder("Invalid URL host: \"");
                    String strSubstring3 = str4.substring(i14, iPortColonOffset);
                    k.d(strSubstring3, str2);
                    sb5.append(strSubstring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                iIndexOfFirstNonAsciiWhitespace$default = iDelimiterOffset;
            } else {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host();
                this.port = httpUrl.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (iIndexOfFirstNonAsciiWhitespace$default == iIndexOfLastNonAsciiWhitespace$default || str4.charAt(iIndexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
                i4 = iIndexOfLastNonAsciiWhitespace$default;
            }
            int i16 = i4;
            int iDelimiterOffset3 = Util.delimiterOffset(str4, "?#", iIndexOfFirstNonAsciiWhitespace$default, i16);
            resolvePath(str4, iIndexOfFirstNonAsciiWhitespace$default, iDelimiterOffset3);
            if (iDelimiterOffset3 >= i16 || str4.charAt(iDelimiterOffset3) != '?') {
                c10 = '#';
                i13 = iDelimiterOffset3;
            } else {
                c10 = '#';
                int iDelimiterOffset4 = Util.delimiterOffset(str4, '#', iDelimiterOffset3, i16);
                Companion companion5 = HttpUrl.Companion;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, str4, iDelimiterOffset3 + 1, iDelimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 208, null));
                i13 = iDelimiterOffset4;
            }
            if (i13 < i16 && str4.charAt(i13) == c10) {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str4, i13 + 1, i16, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final Builder password(String str) {
            k.e(str, "password");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final Builder port(int i4) {
            if (1 > i4 || i4 >= 65536) {
                throw new IllegalArgumentException(u.r(i4, "unexpected port: ").toString());
            }
            this.port = i4;
            return this;
        }

        public final Builder query(String str) {
            Companion companion;
            String strCanonicalize$okhttp$default;
            this.encodedQueryNamesAndValues = (str == null || (strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default((companion = HttpUrl.Companion), str, 0, 0, HttpUrl.QUERY_ENCODE_SET, false, false, true, false, null, 219, null)) == null) ? null : companion.toQueryNamesAndValues$okhttp(strCanonicalize$okhttp$default);
            return this;
        }

        public final Builder reencodeForUri$okhttp() {
            String strReplaceAll;
            String str = this.host;
            if (str != null) {
                Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
                k.d(patternCompile, "compile(...)");
                strReplaceAll = patternCompile.matcher(str).replaceAll("");
                k.d(strReplaceAll, "replaceAll(...)");
            } else {
                strReplaceAll = null;
            }
            this.host = strReplaceAll;
            int size = this.encodedPathSegments.size();
            for (int i4 = 0; i4 < size; i4++) {
                List<String> list = this.encodedPathSegments;
                list.set(i4, Companion.canonicalize$okhttp$default(HttpUrl.Companion, list.get(i4), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    String str2 = list2.get(i10);
                    list2.set(i10, str2 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195, null) : null);
                }
            }
            String str3 = this.encodedFragment;
            this.encodedFragment = str3 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str3, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, 163, null) : null;
            return this;
        }

        public final Builder removeAllEncodedQueryParameters(String str) {
            k.e(str, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            return this;
        }

        public final Builder removeAllQueryParameters(String str) {
            k.e(str, "name");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            return this;
        }

        public final Builder removePathSegment(int i4) {
            this.encodedPathSegments.remove(i4);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add("");
            }
            return this;
        }

        public final Builder scheme(String str) {
            k.e(str, "scheme");
            if (str.equalsIgnoreCase("http")) {
                this.scheme = "http";
                return this;
            }
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            this.scheme = "https";
            return this;
        }

        public final void setEncodedFragment$okhttp(String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(String str) {
            k.e(str, "<set-?>");
            this.encodedPassword = str;
        }

        public final Builder setEncodedPathSegment(int i4, String str) {
            k.e(str, "encodedPathSegment");
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, 243, null);
            this.encodedPathSegments.set(i4, strCanonicalize$okhttp$default);
            if (isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) {
                throw new IllegalArgumentException("unexpected path segment: ".concat(str).toString());
            }
            return this;
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final Builder setEncodedQueryParameter(String str, String str2) {
            k.e(str, "encodedName");
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        public final void setEncodedUsername$okhttp(String str) {
            k.e(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(String str) {
            this.host = str;
        }

        public final Builder setPathSegment(int i4, String str) {
            k.e(str, "pathSegment");
            String strCanonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, 251, null);
            if (isDot(strCanonicalize$okhttp$default) || isDotDot(strCanonicalize$okhttp$default)) {
                throw new IllegalArgumentException("unexpected path segment: ".concat(str).toString());
            }
            this.encodedPathSegments.set(i4, strCanonicalize$okhttp$default);
            return this;
        }

        public final void setPort$okhttp(int i4) {
            this.port = i4;
        }

        public final Builder setQueryParameter(String str, String str2) {
            k.e(str, "name");
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        public final void setScheme$okhttp(String str) {
            this.scheme = str;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.scheme;
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            if (this.encodedUsername.length() > 0 || this.encodedPassword.length() > 0) {
                sb2.append(this.encodedUsername);
                if (this.encodedPassword.length() > 0) {
                    sb2.append(':');
                    sb2.append(this.encodedPassword);
                }
                sb2.append('@');
            }
            String str2 = this.host;
            if (str2 != null) {
                if (i.z0(str2, ':')) {
                    sb2.append('[');
                    sb2.append(this.host);
                    sb2.append(']');
                } else {
                    sb2.append(this.host);
                }
            }
            if (this.port != -1 || this.scheme != null) {
                int iEffectivePort = effectivePort();
                String str3 = this.scheme;
                if (str3 == null || iEffectivePort != HttpUrl.Companion.defaultPort(str3)) {
                    sb2.append(':');
                    sb2.append(iEffectivePort);
                }
            }
            Companion companion = HttpUrl.Companion;
            companion.toPathString$okhttp(this.encodedPathSegments, sb2);
            if (this.encodedQueryNamesAndValues != null) {
                sb2.append('?');
                List<String> list = this.encodedQueryNamesAndValues;
                k.b(list);
                companion.toQueryString$okhttp(list, sb2);
            }
            if (this.encodedFragment != null) {
                sb2.append('#');
                sb2.append(this.encodedFragment);
            }
            String string = sb2.toString();
            k.d(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        public final Builder username(String str) {
            k.e(str, AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER);
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        private final Builder addPathSegments(String str, boolean z3) {
            boolean z10;
            Builder builder;
            String str2;
            boolean z11;
            int i4 = 0;
            while (true) {
                int iDelimiterOffset = Util.delimiterOffset(str, "/\\", i4, str.length());
                if (iDelimiterOffset < str.length()) {
                    z10 = true;
                    str2 = str;
                    z11 = z3;
                    builder = this;
                } else {
                    z10 = false;
                    builder = this;
                    str2 = str;
                    z11 = z3;
                }
                builder.push(str2, i4, iDelimiterOffset, z10, z11);
                i4 = iDelimiterOffset + 1;
                if (i4 > str2.length()) {
                    return builder;
                }
                str = str2;
                z3 = z11;
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i4, int i10, String str2, boolean z3, boolean z10, boolean z11, boolean z12, Charset charset, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i4 = 0;
            }
            if ((i11 & 2) != 0) {
                i10 = str.length();
            }
            if ((i11 & 8) != 0) {
                z3 = false;
            }
            if ((i11 & 16) != 0) {
                z10 = false;
            }
            if ((i11 & 32) != 0) {
                z11 = false;
            }
            if ((i11 & 64) != 0) {
                z12 = false;
            }
            if ((i11 & 128) != 0) {
                charset = null;
            }
            return companion.canonicalize$okhttp(str, i4, i10, str2, z3, z10, z11, z12, charset);
        }

        private final boolean isPercentEncoded(String str, int i4, int i10) {
            int i11 = i4 + 2;
            return i11 < i10 && str.charAt(i4) == '%' && Util.parseHexDigit(str.charAt(i4 + 1)) != -1 && Util.parseHexDigit(str.charAt(i11)) != -1;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i4, int i10, boolean z3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i4 = 0;
            }
            if ((i11 & 2) != 0) {
                i10 = str.length();
            }
            if ((i11 & 4) != 0) {
                z3 = false;
            }
            return companion.percentDecode$okhttp(str, i4, i10, z3);
        }

        private final void writeCanonicalized(Buffer buffer, String str, int i4, int i10, String str2, boolean z3, boolean z10, boolean z11, boolean z12, Charset charset) throws EOFException {
            Buffer buffer2 = null;
            while (i4 < i10) {
                int iCodePointAt = str.codePointAt(i4);
                if (!z3 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                    if (iCodePointAt == 43 && z11) {
                        buffer.writeUtf8(z3 ? "+" : "%2B");
                    } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z12) || i.z0(str2, (char) iCodePointAt) || (iCodePointAt == 37 && (!z3 || (z10 && !isPercentEncoded(str, i4, i10)))))) {
                        if (buffer2 == null) {
                            buffer2 = new Buffer();
                        }
                        if (charset == null || charset.equals(StandardCharsets.UTF_8)) {
                            buffer2.writeUtf8CodePoint(iCodePointAt);
                        } else {
                            buffer2.writeString(str, i4, Character.charCount(iCodePointAt) + i4, charset);
                        }
                        while (!buffer2.exhausted()) {
                            byte b10 = buffer2.readByte();
                            buffer.writeByte(37);
                            buffer.writeByte((int) HttpUrl.HEX_DIGITS[((b10 & 255) >> 4) & 15]);
                            buffer.writeByte((int) HttpUrl.HEX_DIGITS[b10 & 15]);
                        }
                    } else {
                        buffer.writeUtf8CodePoint(iCodePointAt);
                    }
                }
                i4 += Character.charCount(iCodePointAt);
            }
        }

        private final void writePercentDecoded(Buffer buffer, String str, int i4, int i10, boolean z3) {
            int i11;
            while (i4 < i10) {
                int iCodePointAt = str.codePointAt(i4);
                if (iCodePointAt == 37 && (i11 = i4 + 2) < i10) {
                    int hexDigit = Util.parseHexDigit(str.charAt(i4 + 1));
                    int hexDigit2 = Util.parseHexDigit(str.charAt(i11));
                    if (hexDigit == -1 || hexDigit2 == -1) {
                        buffer.writeUtf8CodePoint(iCodePointAt);
                        i4 += Character.charCount(iCodePointAt);
                    } else {
                        buffer.writeByte((hexDigit << 4) + hexDigit2);
                        i4 = Character.charCount(iCodePointAt) + i11;
                    }
                } else if (iCodePointAt == 43 && z3) {
                    buffer.writeByte(32);
                    i4++;
                } else {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                    i4 += Character.charCount(iCodePointAt);
                }
            }
        }

        @a
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m70deprecated_get(String str) {
            k.e(str, "url");
            return get(str);
        }

        @a
        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final HttpUrl m73deprecated_parse(String str) {
            k.e(str, "url");
            return parse(str);
        }

        public final String canonicalize$okhttp(String str, int i4, int i10, String str2, boolean z3, boolean z10, boolean z11, boolean z12, Charset charset) throws EOFException {
            k.e(str, "<this>");
            k.e(str2, "encodeSet");
            int iCharCount = i4;
            while (iCharCount < i10) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z12) || i.z0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z3 || (z10 && !isPercentEncoded(str, iCharCount, i10)))) || (iCodePointAt == 43 && z11)))) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(str, i4, iCharCount);
                    writeCanonicalized(buffer, str, iCharCount, i10, str2, z3, z10, z11, z12, charset);
                    return buffer.readUtf8();
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            String strSubstring = str.substring(i4, i10);
            k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final int defaultPort(String str) {
            k.e(str, "scheme");
            if (str.equals("http")) {
                return 80;
            }
            return str.equals("https") ? 443 : -1;
        }

        public final HttpUrl get(String str) {
            k.e(str, "<this>");
            return new Builder().parse$okhttp(null, str).build();
        }

        public final HttpUrl parse(String str) {
            k.e(str, "<this>");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String percentDecode$okhttp(String str, int i4, int i10, boolean z3) {
            k.e(str, "<this>");
            for (int i11 = i4; i11 < i10; i11++) {
                char cCharAt = str.charAt(i11);
                if (cCharAt == '%' || (cCharAt == '+' && z3)) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(str, i4, i11);
                    writePercentDecoded(buffer, str, i11, i10, z3);
                    return buffer.readUtf8();
                }
            }
            String strSubstring = str.substring(i4, i10);
            k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public final void toPathString$okhttp(List<String> list, StringBuilder sb2) {
            k.e(list, "<this>");
            k.e(sb2, "out");
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                sb2.append('/');
                sb2.append(list.get(i4));
            }
        }

        public final List<String> toQueryNamesAndValues$okhttp(String str) {
            k.e(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            while (i4 <= str.length()) {
                int iE0 = i.E0(str, '&', i4, 4);
                if (iE0 == -1) {
                    iE0 = str.length();
                }
                int iE02 = i.E0(str, '=', i4, 4);
                if (iE02 == -1 || iE02 > iE0) {
                    String strSubstring = str.substring(i4, iE0);
                    k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i4, iE02);
                    k.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iE02 + 1, iE0);
                    k.d(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i4 = iE0 + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(List<String> list, StringBuilder sb2) {
            k.e(list, "<this>");
            k.e(sb2, "out");
            b bVarC = ci.b.C(ci.b.E(0, list.size()), 2);
            int i4 = bVarC.f33817a;
            int i10 = bVarC.f33818b;
            int i11 = bVarC.f33819c;
            if ((i11 <= 0 || i4 > i10) && (i11 >= 0 || i10 > i4)) {
                return;
            }
            while (true) {
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
                if (i4 == i10) {
                    return;
                } else {
                    i4 += i11;
                }
            }
        }

        private Companion() {
        }

        @a
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m72deprecated_get(URL url) {
            k.e(url, "url");
            return get(url);
        }

        public final HttpUrl get(URL url) {
            k.e(url, "<this>");
            String string = url.toString();
            k.d(string, "toString()");
            return parse(string);
        }

        @a
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final HttpUrl m71deprecated_get(URI uri) {
            k.e(uri, "uri");
            return get(uri);
        }

        public final HttpUrl get(URI uri) {
            k.e(uri, "<this>");
            String string = uri.toString();
            k.d(string, "toString()");
            return parse(string);
        }
    }

    public HttpUrl(String str, String str2, String str3, String str4, int i4, List<String> list, List<String> list2, String str5, String str6) {
        k.e(str, "scheme");
        k.e(str2, AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER);
        k.e(str3, "password");
        k.e(str4, "host");
        k.e(list, "pathSegments");
        k.e(str6, "url");
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i4;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
        this.isHttps = k.a(str, "https");
    }

    public static final int defaultPort(String str) {
        return Companion.defaultPort(str);
    }

    public static final HttpUrl get(String str) {
        return Companion.get(str);
    }

    public static final HttpUrl parse(String str) {
        return Companion.parse(str);
    }

    @a
    /* renamed from: -deprecated_encodedFragment, reason: not valid java name */
    public final String m51deprecated_encodedFragment() {
        return encodedFragment();
    }

    @a
    /* renamed from: -deprecated_encodedPassword, reason: not valid java name */
    public final String m52deprecated_encodedPassword() {
        return encodedPassword();
    }

    @a
    /* renamed from: -deprecated_encodedPath, reason: not valid java name */
    public final String m53deprecated_encodedPath() {
        return encodedPath();
    }

    @a
    /* renamed from: -deprecated_encodedPathSegments, reason: not valid java name */
    public final List<String> m54deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    @a
    /* renamed from: -deprecated_encodedQuery, reason: not valid java name */
    public final String m55deprecated_encodedQuery() {
        return encodedQuery();
    }

    @a
    /* renamed from: -deprecated_encodedUsername, reason: not valid java name */
    public final String m56deprecated_encodedUsername() {
        return encodedUsername();
    }

    @a
    /* renamed from: -deprecated_fragment, reason: not valid java name */
    public final String m57deprecated_fragment() {
        return this.fragment;
    }

    @a
    /* renamed from: -deprecated_host, reason: not valid java name */
    public final String m58deprecated_host() {
        return this.host;
    }

    @a
    /* renamed from: -deprecated_password, reason: not valid java name */
    public final String m59deprecated_password() {
        return this.password;
    }

    @a
    /* renamed from: -deprecated_pathSegments, reason: not valid java name */
    public final List<String> m60deprecated_pathSegments() {
        return this.pathSegments;
    }

    @a
    /* renamed from: -deprecated_pathSize, reason: not valid java name */
    public final int m61deprecated_pathSize() {
        return pathSize();
    }

    @a
    /* renamed from: -deprecated_port, reason: not valid java name */
    public final int m62deprecated_port() {
        return this.port;
    }

    @a
    /* renamed from: -deprecated_query, reason: not valid java name */
    public final String m63deprecated_query() {
        return query();
    }

    @a
    /* renamed from: -deprecated_queryParameterNames, reason: not valid java name */
    public final Set<String> m64deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    @a
    /* renamed from: -deprecated_querySize, reason: not valid java name */
    public final int m65deprecated_querySize() {
        return querySize();
    }

    @a
    /* renamed from: -deprecated_scheme, reason: not valid java name */
    public final String m66deprecated_scheme() {
        return this.scheme;
    }

    @a
    /* renamed from: -deprecated_uri, reason: not valid java name */
    public final URI m67deprecated_uri() {
        return uri();
    }

    @a
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final URL m68deprecated_url() {
        return url();
    }

    @a
    /* renamed from: -deprecated_username, reason: not valid java name */
    public final String m69deprecated_username() {
        return this.username;
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        String strSubstring = this.url.substring(i.E0(this.url, '#', 0, 6) + 1);
        k.d(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        String strSubstring = this.url.substring(i.E0(this.url, ':', this.scheme.length() + 3, 4) + 1, i.E0(this.url, '@', 0, 6));
        k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String encodedPath() {
        int iE0 = i.E0(this.url, '/', this.scheme.length() + 3, 4);
        String str = this.url;
        String strSubstring = this.url.substring(iE0, Util.delimiterOffset(str, "?#", iE0, str.length()));
        k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final List<String> encodedPathSegments() {
        int iE0 = i.E0(this.url, '/', this.scheme.length() + 3, 4);
        String str = this.url;
        int iDelimiterOffset = Util.delimiterOffset(str, "?#", iE0, str.length());
        ArrayList arrayList = new ArrayList();
        while (iE0 < iDelimiterOffset) {
            int i4 = iE0 + 1;
            int iDelimiterOffset2 = Util.delimiterOffset(this.url, '/', i4, iDelimiterOffset);
            String strSubstring = this.url.substring(i4, iDelimiterOffset2);
            k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iE0 = iDelimiterOffset2;
        }
        return arrayList;
    }

    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int iE0 = i.E0(this.url, '?', 0, 6) + 1;
        String str = this.url;
        String strSubstring = this.url.substring(iE0, Util.delimiterOffset(str, '#', iE0, str.length()));
        k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        String strSubstring = this.url.substring(length, Util.delimiterOffset(str, ":@", length, str.length()));
        k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && k.a(((HttpUrl) obj).url, this.url);
    }

    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final String password() {
        return this.password;
    }

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Companion.toQueryString$okhttp(this.queryNamesAndValues, sb2);
        return sb2.toString();
    }

    public final String queryParameter(String str) {
        k.e(str, "name");
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        b bVarC = ci.b.C(ci.b.E(0, list.size()), 2);
        int i4 = bVarC.f33817a;
        int i10 = bVarC.f33818b;
        int i11 = bVarC.f33819c;
        if ((i11 <= 0 || i4 > i10) && (i11 >= 0 || i10 > i4)) {
            return null;
        }
        while (!str.equals(this.queryNamesAndValues.get(i4))) {
            if (i4 == i10) {
                return null;
            }
            i4 += i11;
        }
        return this.queryNamesAndValues.get(i4 + 1);
    }

    public final String queryParameterName(int i4) {
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        String str = list.get(i4 * 2);
        k.b(str);
        return str;
    }

    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return zj.u.f38319a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b bVarC = ci.b.C(ci.b.E(0, this.queryNamesAndValues.size()), 2);
        int i4 = bVarC.f33817a;
        int i10 = bVarC.f33818b;
        int i11 = bVarC.f33819c;
        if ((i11 > 0 && i4 <= i10) || (i11 < 0 && i10 <= i4)) {
            while (true) {
                String str = this.queryNamesAndValues.get(i4);
                k.b(str);
                linkedHashSet.add(str);
                if (i4 == i10) {
                    break;
                }
                i4 += i11;
            }
        }
        Set<String> setUnmodifiableSet = DesugarCollections.unmodifiableSet(linkedHashSet);
        k.d(setUnmodifiableSet, "unmodifiableSet(result)");
        return setUnmodifiableSet;
    }

    public final String queryParameterValue(int i4) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i4 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List<String> queryParameterValues(String str) {
        k.e(str, "name");
        if (this.queryNamesAndValues == null) {
            return s.f38317a;
        }
        ArrayList arrayList = new ArrayList();
        b bVarC = ci.b.C(ci.b.E(0, this.queryNamesAndValues.size()), 2);
        int i4 = bVarC.f33817a;
        int i10 = bVarC.f33818b;
        int i11 = bVarC.f33819c;
        if ((i11 > 0 && i4 <= i10) || (i11 < 0 && i10 <= i4)) {
            while (true) {
                if (str.equals(this.queryNamesAndValues.get(i4))) {
                    arrayList.add(this.queryNamesAndValues.get(i4 + 1));
                }
                if (i4 == i10) {
                    break;
                }
                i4 += i11;
            }
        }
        List<String> listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        k.d(listUnmodifiableList, "unmodifiableList(result)");
        return listUnmodifiableList;
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String redact() {
        Builder builderNewBuilder = newBuilder("/...");
        k.b(builderNewBuilder);
        return builderNewBuilder.username("").password("").build().toString();
    }

    public final HttpUrl resolve(String str) {
        k.e(str, "link");
        Builder builderNewBuilder = newBuilder(str);
        if (builderNewBuilder != null) {
            return builderNewBuilder.build();
        }
        return null;
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.url;
    }

    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    public final URI uri() {
        String string = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e2) {
            try {
                Pattern patternCompile = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                k.d(patternCompile, "compile(...)");
                k.e(string, "input");
                String strReplaceAll = patternCompile.matcher(string).replaceAll("");
                k.d(strReplaceAll, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll);
                k.d(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final String username() {
        return this.username;
    }

    public static final HttpUrl get(URI uri) {
        return Companion.get(uri);
    }

    public static final HttpUrl get(URL url) {
        return Companion.get(url);
    }

    public final Builder newBuilder(String str) {
        k.e(str, "link");
        try {
            return new Builder().parse$okhttp(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
