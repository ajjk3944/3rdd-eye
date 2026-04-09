package okhttp3.internal.http;

import ej.C5481e;
import ej.h;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.text.t;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\n*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0015\u001a!\u0010\u001b\u001a\u00020\n*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0011\u0010\u001e\u001a\u00020\r*\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001f\"\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!\"\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!¨\u0006$"}, d2 = {"Lokhttp3/Headers;", "", "headerName", "", "Lokhttp3/Challenge;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lokhttp3/Headers;Ljava/lang/String;)Ljava/util/List;", "Lej/e;", "", "result", "LYg/J;", SnmpConfigurator.O_COMMUNITY, "(Lej/e;Ljava/util/List;)V", "", "g", "(Lej/e;)Z", "", "prefix", "h", "(Lej/e;B)Z", "d", "(Lej/e;)Ljava/lang/String;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", "headers", "f", "(Lokhttp3/CookieJar;Lokhttp3/HttpUrl;Lokhttp3/Headers;)V", "Lokhttp3/Response;", SnmpConfigurator.O_BIND_ADDRESS, "(Lokhttp3/Response;)Z", "Lej/h;", "Lej/h;", "QUOTED_STRING_DELIMITERS", "TOKEN_DELIMITERS", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HttpHeaders {

    /* renamed from: a, reason: collision with root package name */
    private static final h f56463a;

    /* renamed from: b, reason: collision with root package name */
    private static final h f56464b;

    static {
        h.a aVar = h.f46470d;
        f56463a = aVar.d("\"\\");
        f56464b = aVar.d("\t ,=");
    }

    public static final List a(Headers headers, String headerName) {
        AbstractC6492s.i(headers, "<this>");
        AbstractC6492s.i(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (t.C(headerName, headers.e(i10), true)) {
                try {
                    c(new C5481e().F(headers.j(i10)), arrayList);
                } catch (EOFException e10) {
                    Platform.INSTANCE.g().k("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(Response response) {
        AbstractC6492s.i(response, "<this>");
        if (AbstractC6492s.d(response.getRequest().getMethod(), "HEAD")) {
            return false;
        }
        int code = response.getCode();
        return (((code >= 100 && code < 200) || code == 204 || code == 304) && Util.v(response) == -1 && !t.C("chunked", Response.C(response, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ba, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ba, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void c(ej.C5481e r7, java.util.List r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            g(r7)
            java.lang.String r1 = e(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = g(r7)
            java.lang.String r3 = e(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.t()
            if (r7 != 0) goto L1f
            return
        L1f:
            okhttp3.Challenge r7 = new okhttp3.Challenge
            java.util.Map r0 = Zg.U.h()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            int r5 = okhttp3.internal.Util.L(r7, r4)
            boolean r6 = g(r7)
            if (r2 != 0) goto L67
            if (r6 != 0) goto L40
            boolean r2 = r7.t()
            if (r2 == 0) goto L67
        L40:
            okhttp3.Challenge r2 = new okhttp3.Challenge
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = kotlin.text.t.H(r3, r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap<String, Str…ek + \"=\".repeat(eqCount))"
            kotlin.jvm.internal.AbstractC6492s.h(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L67:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = okhttp3.internal.Util.L(r7, r4)
            int r5 = r5 + r6
        L71:
            if (r3 != 0) goto L81
            java.lang.String r3 = e(r7)
            boolean r5 = g(r7)
            if (r5 != 0) goto Lba
            int r5 = okhttp3.internal.Util.L(r7, r4)
        L81:
            if (r5 == 0) goto Lba
            r6 = 1
            if (r5 <= r6) goto L87
            return
        L87:
            boolean r6 = g(r7)
            if (r6 == 0) goto L8e
            return
        L8e:
            r6 = 34
            boolean r6 = h(r7, r6)
            if (r6 == 0) goto L9b
            java.lang.String r6 = d(r7)
            goto L9f
        L9b:
            java.lang.String r6 = e(r7)
        L9f:
            if (r6 != 0) goto La2
            return
        La2:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lab
            return
        Lab:
            boolean r3 = g(r7)
            if (r3 != 0) goto Lb8
            boolean r3 = r7.t()
            if (r3 != 0) goto Lb8
            return
        Lb8:
            r3 = r0
            goto L71
        Lba:
            okhttp3.Challenge r4 = new okhttp3.Challenge
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.c(ej.e, java.util.List):void");
    }

    private static final String d(C5481e c5481e) throws EOFException {
        if (c5481e.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C5481e c5481e2 = new C5481e();
        while (true) {
            long jM = c5481e.M(f56463a);
            if (jM == -1) {
                return null;
            }
            if (c5481e.f0(jM) == 34) {
                c5481e2.Z(c5481e, jM);
                c5481e.readByte();
                return c5481e2.z0();
            }
            if (c5481e.D0() == jM + 1) {
                return null;
            }
            c5481e2.Z(c5481e, jM);
            c5481e.readByte();
            c5481e2.Z(c5481e, 1L);
        }
    }

    private static final String e(C5481e c5481e) {
        long jM = c5481e.M(f56464b);
        if (jM == -1) {
            jM = c5481e.D0();
        }
        if (jM != 0) {
            return c5481e.A0(jM);
        }
        return null;
    }

    public static final void f(CookieJar cookieJar, HttpUrl url, Headers headers) {
        AbstractC6492s.i(cookieJar, "<this>");
        AbstractC6492s.i(url, "url");
        AbstractC6492s.i(headers, "headers");
        if (cookieJar == CookieJar.f55998b) {
            return;
        }
        List listE = Cookie.INSTANCE.e(url, headers);
        if (listE.isEmpty()) {
            return;
        }
        cookieJar.a(url, listE);
    }

    private static final boolean g(C5481e c5481e) throws EOFException {
        boolean z10 = false;
        while (!c5481e.t()) {
            byte bF0 = c5481e.f0(0L);
            if (bF0 == 44) {
                c5481e.readByte();
                z10 = true;
            } else {
                if (bF0 != 32 && bF0 != 9) {
                    break;
                }
                c5481e.readByte();
            }
        }
        return z10;
    }

    private static final boolean h(C5481e c5481e, byte b10) {
        return !c5481e.t() && c5481e.f0(0L) == b10;
    }
}
