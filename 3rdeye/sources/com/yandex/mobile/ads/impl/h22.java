package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes3.dex */
public final class h22 {

    /* renamed from: a, reason: collision with root package name */
    public final gm1 f28085a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28086b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28087c;

    public static final class a {
        public static h22 a(String statusLine) throws NumberFormatException, IOException {
            gm1 gm1Var;
            int i;
            String strSubstring;
            kotlin.jvm.internal.l.f(statusLine, "statusLine");
            if (y9.n.a0(statusLine, "HTTP/1.", false)) {
                i = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    gm1Var = gm1.f27817d;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                    }
                    gm1Var = gm1.f27818e;
                }
            } else {
                if (!y9.n.a0(statusLine, "ICY ", false)) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                gm1Var = gm1.f27817d;
                i = 4;
            }
            int i10 = i + 3;
            if (statusLine.length() < i10) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            try {
                String strSubstring2 = statusLine.substring(i, i10);
                kotlin.jvm.internal.l.e(strSubstring2, "substring(...)");
                int i11 = Integer.parseInt(strSubstring2);
                if (statusLine.length() <= i10) {
                    strSubstring = "";
                } else {
                    if (statusLine.charAt(i10) != ' ') {
                        throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                    }
                    strSubstring = statusLine.substring(i + 4);
                    kotlin.jvm.internal.l.e(strSubstring, "substring(...)");
                }
                return new h22(gm1Var, i11, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
        }
    }

    public h22(gm1 protocol, int i, String message) {
        kotlin.jvm.internal.l.f(protocol, "protocol");
        kotlin.jvm.internal.l.f(message, "message");
        this.f28085a = protocol;
        this.f28086b = i;
        this.f28087c = message;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f28085a == gm1.f27817d) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.f28086b);
        sb.append(' ');
        sb.append(this.f28087c);
        String string = sb.toString();
        kotlin.jvm.internal.l.e(string, "toString(...)");
        return string;
    }
}
