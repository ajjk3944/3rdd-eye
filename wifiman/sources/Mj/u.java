package Mj;

import ej.C5481e;
import ej.InterfaceC5482f;
import java.io.EOFException;
import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

/* loaded from: classes2.dex */
final class u {

    /* renamed from: l, reason: collision with root package name */
    private static final char[] f13441l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f13442m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a, reason: collision with root package name */
    private final String f13443a;

    /* renamed from: b, reason: collision with root package name */
    private final HttpUrl f13444b;

    /* renamed from: c, reason: collision with root package name */
    private String f13445c;

    /* renamed from: d, reason: collision with root package name */
    private HttpUrl.Builder f13446d;

    /* renamed from: e, reason: collision with root package name */
    private final Request.Builder f13447e = new Request.Builder();

    /* renamed from: f, reason: collision with root package name */
    private final Headers.Builder f13448f;

    /* renamed from: g, reason: collision with root package name */
    private MediaType f13449g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f13450h;

    /* renamed from: i, reason: collision with root package name */
    private MultipartBody.Builder f13451i;

    /* renamed from: j, reason: collision with root package name */
    private FormBody.Builder f13452j;

    /* renamed from: k, reason: collision with root package name */
    private RequestBody f13453k;

    private static class a extends RequestBody {

        /* renamed from: b, reason: collision with root package name */
        private final RequestBody f13454b;

        /* renamed from: c, reason: collision with root package name */
        private final MediaType f13455c;

        a(RequestBody requestBody, MediaType mediaType) {
            this.f13454b = requestBody;
            this.f13455c = mediaType;
        }

        @Override // okhttp3.RequestBody
        public long a() {
            return this.f13454b.a();
        }

        @Override // okhttp3.RequestBody
        /* renamed from: b */
        public MediaType getContentType() {
            return this.f13455c;
        }

        @Override // okhttp3.RequestBody
        public void h(InterfaceC5482f interfaceC5482f) {
            this.f13454b.h(interfaceC5482f);
        }
    }

    u(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z10, boolean z11, boolean z12) {
        this.f13443a = str;
        this.f13444b = httpUrl;
        this.f13445c = str2;
        this.f13449g = mediaType;
        this.f13450h = z10;
        if (headers != null) {
            this.f13448f = headers.g();
        } else {
            this.f13448f = new Headers.Builder();
        }
        if (z11) {
            this.f13452j = new FormBody.Builder();
        } else if (z12) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.f13451i = builder;
            builder.d(MultipartBody.f56067l);
        }
    }

    private static String i(String str, boolean z10) throws EOFException {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z10 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                C5481e c5481e = new C5481e();
                c5481e.H(str, 0, iCharCount);
                j(c5481e, str, iCharCount, length, z10);
                return c5481e.z0();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    private static void j(C5481e c5481e, String str, int i10, int i11, boolean z10) throws EOFException {
        C5481e c5481e2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z10 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (c5481e2 == null) {
                        c5481e2 = new C5481e();
                    }
                    c5481e2.U0(iCodePointAt);
                    while (!c5481e2.t()) {
                        byte b10 = c5481e2.readByte();
                        c5481e.u(37);
                        char[] cArr = f13441l;
                        c5481e.u(cArr[((b10 & 255) >> 4) & 15]);
                        c5481e.u(cArr[b10 & 15]);
                    }
                } else {
                    c5481e.U0(iCodePointAt);
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    void a(String str, String str2, boolean z10) {
        if (z10) {
            this.f13452j.b(str, str2);
        } else {
            this.f13452j.a(str, str2);
        }
    }

    void b(String str, String str2, boolean z10) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            if (z10) {
                this.f13448f.e(str, str2);
                return;
            } else {
                this.f13448f.a(str, str2);
                return;
            }
        }
        try {
            this.f13449g = MediaType.e(str2);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e10);
        }
    }

    void c(Headers headers) {
        this.f13448f.b(headers);
    }

    void d(Headers headers, RequestBody requestBody) {
        this.f13451i.a(headers, requestBody);
    }

    void e(MultipartBody.Part part) {
        this.f13451i.b(part);
    }

    void f(String str, String str2, boolean z10) throws EOFException {
        if (this.f13445c == null) {
            throw new AssertionError();
        }
        String strI = i(str2, z10);
        String strReplace = this.f13445c.replace("{" + str + "}", strI);
        if (!f13442m.matcher(strReplace).matches()) {
            this.f13445c = strReplace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    void g(String str, String str2, boolean z10) {
        String str3 = this.f13445c;
        if (str3 != null) {
            HttpUrl.Builder builderL = this.f13444b.l(str3);
            this.f13446d = builderL;
            if (builderL == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f13444b + ", Relative: " + this.f13445c);
            }
            this.f13445c = null;
        }
        if (z10) {
            this.f13446d.a(str, str2);
        } else {
            this.f13446d.c(str, str2);
        }
    }

    void h(Class cls, Object obj) {
        this.f13447e.g(cls, obj);
    }

    Request.Builder k() {
        HttpUrl httpUrlS;
        HttpUrl.Builder builder = this.f13446d;
        if (builder != null) {
            httpUrlS = builder.d();
        } else {
            httpUrlS = this.f13444b.s(this.f13445c);
            if (httpUrlS == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f13444b + ", Relative: " + this.f13445c);
            }
        }
        RequestBody aVar = this.f13453k;
        if (aVar == null) {
            FormBody.Builder builder2 = this.f13452j;
            if (builder2 != null) {
                aVar = builder2.c();
            } else {
                MultipartBody.Builder builder3 = this.f13451i;
                if (builder3 != null) {
                    aVar = builder3.c();
                } else if (this.f13450h) {
                    aVar = RequestBody.e(null, new byte[0]);
                }
            }
        }
        MediaType mediaType = this.f13449g;
        if (mediaType != null) {
            if (aVar != null) {
                aVar = new a(aVar, mediaType);
            } else {
                this.f13448f.a("Content-Type", mediaType.getMediaType());
            }
        }
        return this.f13447e.i(httpUrlS).d(this.f13448f.f()).e(this.f13443a, aVar);
    }

    void l(RequestBody requestBody) {
        this.f13453k = requestBody;
    }

    void m(Object obj) {
        this.f13445c = obj.toString();
    }
}
