package sa;

import U9.D;
import U9.p;
import U9.s;
import U9.t;
import U9.v;
import U9.w;
import U9.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* compiled from: RequestBuilder.java */
/* loaded from: classes3.dex */
public final class s {

    /* renamed from: l, reason: collision with root package name */
    public static final char[] f46285l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f46286m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a, reason: collision with root package name */
    public final String f46287a;

    /* renamed from: b, reason: collision with root package name */
    public final U9.t f46288b;

    /* renamed from: c, reason: collision with root package name */
    public String f46289c;

    /* renamed from: d, reason: collision with root package name */
    public t.a f46290d;

    /* renamed from: e, reason: collision with root package name */
    public final z.a f46291e = new z.a();

    /* renamed from: f, reason: collision with root package name */
    public final s.a f46292f;

    /* renamed from: g, reason: collision with root package name */
    public U9.v f46293g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f46294h;
    public final w.a i;

    /* renamed from: j, reason: collision with root package name */
    public final p.a f46295j;

    /* renamed from: k, reason: collision with root package name */
    public D f46296k;

    /* compiled from: RequestBuilder.java */
    public static class a extends D {

        /* renamed from: a, reason: collision with root package name */
        public final D f46297a;

        /* renamed from: b, reason: collision with root package name */
        public final U9.v f46298b;

        public a(D d10, U9.v vVar) {
            this.f46297a = d10;
            this.f46298b = vVar;
        }

        @Override // U9.D
        public final long contentLength() throws IOException {
            return this.f46297a.contentLength();
        }

        @Override // U9.D
        public final U9.v contentType() {
            return this.f46298b;
        }

        @Override // U9.D
        public final void writeTo(ia.f fVar) throws IOException {
            this.f46297a.writeTo(fVar);
        }
    }

    public s(String str, U9.t tVar, String str2, U9.s sVar, U9.v vVar, boolean z10, boolean z11, boolean z12) {
        this.f46287a = str;
        this.f46288b = tVar;
        this.f46289c = str2;
        this.f46293g = vVar;
        this.f46294h = z10;
        if (sVar != null) {
            this.f46292f = sVar.e();
        } else {
            this.f46292f = new s.a();
        }
        if (z11) {
            this.f46295j = new p.a();
            return;
        }
        if (z12) {
            w.a aVar = new w.a();
            this.i = aVar;
            U9.v type = U9.w.f12735f;
            kotlin.jvm.internal.l.f(type, "type");
            if (type.f12732b.equals("multipart")) {
                aVar.f12743b = type;
            } else {
                throw new IllegalArgumentException(("multipart != " + type).toString());
            }
        }
    }

    public final void a(String name, String str, boolean z10) {
        p.a aVar = this.f46295j;
        if (z10) {
            aVar.getClass();
            kotlin.jvm.internal.l.f(name, "name");
            aVar.f12700a.add(t.b.a(0, 0, 83, name, " \"':;<=>@[]^`{}|/\\?#&!$(),~"));
            aVar.f12701b.add(t.b.a(0, 0, 83, str, " \"':;<=>@[]^`{}|/\\?#&!$(),~"));
            return;
        }
        aVar.getClass();
        kotlin.jvm.internal.l.f(name, "name");
        aVar.f12700a.add(t.b.a(0, 0, 91, name, " \"':;<=>@[]^`{}|/\\?#&!$(),~"));
        aVar.f12701b.add(t.b.a(0, 0, 91, str, " \"':;<=>@[]^`{}|/\\?#&!$(),~"));
    }

    public final void b(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f46292f.a(str, str2);
            return;
        }
        try {
            Pattern pattern = U9.v.f12729d;
            this.f46293g = v.a.a(str2);
        } catch (IllegalArgumentException e4) {
            throw new IllegalArgumentException(androidx.work.s.d("Malformed content type: ", str2), e4);
        }
    }

    public final void c(U9.s sVar, D body) {
        w.a aVar = this.i;
        aVar.getClass();
        kotlin.jvm.internal.l.f(body, "body");
        if (sVar.c("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (sVar.c("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        aVar.f12744c.add(new w.b(sVar, body));
    }

    public final void d(String name, String str, boolean z10) {
        String str2 = this.f46289c;
        if (str2 != null) {
            U9.t tVar = this.f46288b;
            t.a aVarG = tVar.g(str2);
            this.f46290d = aVarG;
            if (aVarG == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + tVar + ", Relative: " + this.f46289c);
            }
            this.f46289c = null;
        }
        if (z10) {
            t.a aVar = this.f46290d;
            aVar.getClass();
            kotlin.jvm.internal.l.f(name, "encodedName");
            if (aVar.f12727g == null) {
                aVar.f12727g = new ArrayList();
            }
            ArrayList arrayList = aVar.f12727g;
            kotlin.jvm.internal.l.c(arrayList);
            arrayList.add(t.b.a(0, 0, 211, name, " \"'<>#&="));
            ArrayList arrayList2 = aVar.f12727g;
            kotlin.jvm.internal.l.c(arrayList2);
            arrayList2.add(str != null ? t.b.a(0, 0, 211, str, " \"'<>#&=") : null);
            return;
        }
        t.a aVar2 = this.f46290d;
        aVar2.getClass();
        kotlin.jvm.internal.l.f(name, "name");
        if (aVar2.f12727g == null) {
            aVar2.f12727g = new ArrayList();
        }
        ArrayList arrayList3 = aVar2.f12727g;
        kotlin.jvm.internal.l.c(arrayList3);
        arrayList3.add(t.b.a(0, 0, 219, name, " !\"#$&'(),/:;<=>?@[]\\^`{|}~"));
        ArrayList arrayList4 = aVar2.f12727g;
        kotlin.jvm.internal.l.c(arrayList4);
        arrayList4.add(str != null ? t.b.a(0, 0, 219, str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~") : null);
    }
}
