package com.survicate.surveys.infrastructure.network;

import bc.f0;
import br.l;
import cj.a;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.Metadata;
import ou.a0;
import ou.c0;
import ou.d;
import ou.e0;
import ou.v;
import ou.w;
import ou.x;
import pu.b;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/SurvicateHttpClient;", "", "<init>", "()V", "Lou/c0;", "response", "", "readErrorBodySafely", "(Lou/c0;)Ljava/lang/String;", "Lcom/survicate/surveys/infrastructure/network/URLRequest;", "request", "Lou/a0;", "buildOkHttpRequest", "(Lcom/survicate/surveys/infrastructure/network/URLRequest;)Lou/a0;", "loadUrlResponse", "(Lcom/survicate/surveys/infrastructure/network/URLRequest;)Ljava/lang/String;", "Lou/x;", "okHttp", "Lou/x;", "Companion", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurvicateHttpClient {
    public static final long CONNECT_TIMEOUT_MS = 10000;
    private static final String CONTENT_TYPE_VALUE = "application/json; charset=utf-8";
    public static final long READ_TIMEOUT_MS = 10000;
    public static final long WRITE_TIMEOUT_MS = 10000;
    private final x okHttp;

    public SurvicateHttpClient() {
        w wVar = new w();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        l.e(timeUnit, "unit");
        wVar.f20000w = b.b(10000L, timeUnit);
        wVar.f20001x = b.b(10000L, timeUnit);
        wVar.f20002y = b.b(10000L, timeUnit);
        this.okHttp = new x(wVar);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [byte[], java.io.Serializable, java.lang.Object] */
    private final a0 buildOkHttpRequest(URLRequest request) throws MalformedURLException {
        a aVar = new a();
        URL url = request.getUrl().toURL();
        l.d(url, "toURL(...)");
        String string = url.toString();
        l.d(string, "url.toString()");
        ee.x xVar = new ee.x(1);
        v vVarE = null;
        xVar.f(null, string);
        aVar.f3974d = xVar.b();
        String body = request.getBody();
        if (body == null || body.length() == 0) {
            aVar.B(request.getMethod(), null);
        } else {
            Pattern pattern = v.f19976c;
            v vVarE2 = d.e(CONTENT_TYPE_VALUE);
            String body2 = request.getBody();
            l.e(body2, "<this>");
            Charset charset = tt.a.f22975a;
            Charset charsetA = vVarE2.a(null);
            if (charsetA == null) {
                String str = vVarE2 + "; charset=utf-8";
                l.e(str, "<this>");
                try {
                    vVarE = d.e(str);
                } catch (IllegalArgumentException unused) {
                }
                vVarE2 = vVarE;
            } else {
                charset = charsetA;
            }
            ?? bytes = body2.getBytes(charset);
            l.d(bytes, "this as java.lang.String).getBytes(charset)");
            int length = bytes.length;
            b.c(bytes.length, 0, length);
            aVar.B(request.getMethod(), new f0(vVarE2, length, bytes, 9));
        }
        return aVar.r();
    }

    private final String readErrorBodySafely(c0 response) {
        try {
            e0 e0Var = response.B;
            if (e0Var == null) {
                return null;
            }
            String strI = e0Var.i();
            if (strI.length() > 0) {
                return strI;
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    public final String loadUrlResponse(URLRequest request) throws IOException {
        l.e(request, "request");
        c0 c0VarE = this.okHttp.a(buildOkHttpRequest(request)).e();
        int i10 = c0VarE.f19887r;
        boolean z10 = false;
        if (200 <= i10 && i10 < 300) {
            z10 = true;
        }
        try {
            if (!z10) {
                throw new HttpException(i10, readErrorBodySafely(c0VarE));
            }
            e0 e0Var = c0VarE.B;
            String str = null;
            if (e0Var != null) {
                String strI = e0Var.i();
                if (strI.length() > 0) {
                    str = strI;
                }
            }
            c0VarE.close();
            return str;
        } finally {
        }
    }
}
