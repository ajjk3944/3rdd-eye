package Z9;

import U9.y;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.l;
import y9.n;

/* compiled from: StatusLine.kt */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final y f14080a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14081b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14082c;

    /* compiled from: StatusLine.kt */
    public static final class a {
        public static i a(String statusLine) throws NumberFormatException, IOException {
            y yVar;
            int i;
            String strSubstring;
            l.f(statusLine, "statusLine");
            if (n.a0(statusLine, "HTTP/1.", false)) {
                i = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                int iCharAt = statusLine.charAt(7) - '0';
                if (iCharAt == 0) {
                    yVar = y.HTTP_1_0;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                    }
                    yVar = y.HTTP_1_1;
                }
            } else {
                if (!n.a0(statusLine, "ICY ", false)) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                yVar = y.HTTP_1_0;
                i = 4;
            }
            int i10 = i + 3;
            if (statusLine.length() < i10) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            try {
                String strSubstring2 = statusLine.substring(i, i10);
                l.e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                int i11 = Integer.parseInt(strSubstring2);
                if (statusLine.length() <= i10) {
                    strSubstring = "";
                } else {
                    if (statusLine.charAt(i10) != ' ') {
                        throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                    }
                    strSubstring = statusLine.substring(i + 4);
                    l.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                }
                return new i(yVar, i11, strSubstring);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
        }
    }

    public i(y protocol, int i, String str) {
        l.f(protocol, "protocol");
        this.f14080a = protocol;
        this.f14081b = i;
        this.f14082c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f14080a == y.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.f14081b);
        sb.append(' ');
        sb.append(this.f14082c);
        String string = sb.toString();
        l.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
