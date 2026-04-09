package U9;

import U9.v;
import ia.C4468d;
import ia.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: MultipartBody.kt */
/* loaded from: classes3.dex */
public final class w extends D {

    /* renamed from: e, reason: collision with root package name */
    public static final v f12734e;

    /* renamed from: f, reason: collision with root package name */
    public static final v f12735f;

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f12736g;

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f12737h;
    public static final byte[] i;

    /* renamed from: a, reason: collision with root package name */
    public final ia.h f12738a;

    /* renamed from: b, reason: collision with root package name */
    public final List<b> f12739b;

    /* renamed from: c, reason: collision with root package name */
    public final v f12740c;

    /* renamed from: d, reason: collision with root package name */
    public long f12741d;

    /* compiled from: MultipartBody.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ia.h f12742a;

        /* renamed from: b, reason: collision with root package name */
        public v f12743b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f12744c;

        public a() {
            String string = UUID.randomUUID().toString();
            kotlin.jvm.internal.l.e(string, "randomUUID().toString()");
            ia.h hVar = ia.h.f38646e;
            this.f12742a = h.a.c(string);
            this.f12743b = w.f12734e;
            this.f12744c = new ArrayList();
        }
    }

    /* compiled from: MultipartBody.kt */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final s f12745a;

        /* renamed from: b, reason: collision with root package name */
        public final D f12746b;

        public b(s sVar, D d10) {
            this.f12745a = sVar;
            this.f12746b = d10;
        }
    }

    static {
        Pattern pattern = v.f12729d;
        f12734e = v.a.a("multipart/mixed");
        v.a.a("multipart/alternative");
        v.a.a("multipart/digest");
        v.a.a("multipart/parallel");
        f12735f = v.a.a("multipart/form-data");
        f12736g = new byte[]{58, 32};
        f12737h = new byte[]{13, 10};
        i = new byte[]{45, 45};
    }

    public w(ia.h boundaryByteString, v type, List<b> list) {
        kotlin.jvm.internal.l.f(boundaryByteString, "boundaryByteString");
        kotlin.jvm.internal.l.f(type, "type");
        this.f12738a = boundaryByteString;
        this.f12739b = list;
        Pattern pattern = v.f12729d;
        this.f12740c = v.a.a(type + "; boundary=" + boundaryByteString.j());
        this.f12741d = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a(ia.f fVar, boolean z10) throws IOException {
        C4468d c4468d;
        ia.f c4468d2;
        if (z10) {
            c4468d2 = new C4468d();
            c4468d = c4468d2;
        } else {
            c4468d = 0;
            c4468d2 = fVar;
        }
        List<b> list = this.f12739b;
        int size = list.size();
        long j4 = 0;
        int i10 = 0;
        while (true) {
            ia.h hVar = this.f12738a;
            byte[] bArr = i;
            byte[] bArr2 = f12737h;
            if (i10 >= size) {
                kotlin.jvm.internal.l.c(c4468d2);
                c4468d2.t0(bArr);
                c4468d2.P(hVar);
                c4468d2.t0(bArr);
                c4468d2.t0(bArr2);
                if (!z10) {
                    return j4;
                }
                kotlin.jvm.internal.l.c(c4468d);
                long j10 = j4 + c4468d.f38643c;
                c4468d.a();
                return j10;
            }
            b bVar = list.get(i10);
            s sVar = bVar.f12745a;
            kotlin.jvm.internal.l.c(c4468d2);
            c4468d2.t0(bArr);
            c4468d2.P(hVar);
            c4468d2.t0(bArr2);
            int size2 = sVar.size();
            for (int i11 = 0; i11 < size2; i11++) {
                c4468d2.c0(sVar.d(i11)).t0(f12736g).c0(sVar.f(i11)).t0(bArr2);
            }
            D d10 = bVar.f12746b;
            v vVarContentType = d10.contentType();
            if (vVarContentType != null) {
                c4468d2.c0("Content-Type: ").c0(vVarContentType.f12731a).t0(bArr2);
            }
            long jContentLength = d10.contentLength();
            if (jContentLength != -1) {
                c4468d2.c0("Content-Length: ").H0(jContentLength).t0(bArr2);
            } else if (z10) {
                kotlin.jvm.internal.l.c(c4468d);
                c4468d.a();
                return -1L;
            }
            c4468d2.t0(bArr2);
            if (z10) {
                j4 += jContentLength;
            } else {
                d10.writeTo(c4468d2);
            }
            c4468d2.t0(bArr2);
            i10++;
        }
    }

    @Override // U9.D
    public final long contentLength() throws IOException {
        long j4 = this.f12741d;
        if (j4 != -1) {
            return j4;
        }
        long jA = a(null, true);
        this.f12741d = jA;
        return jA;
    }

    @Override // U9.D
    public final v contentType() {
        return this.f12740c;
    }

    @Override // U9.D
    public final void writeTo(ia.f sink) throws IOException {
        kotlin.jvm.internal.l.f(sink, "sink");
        a(sink, false);
    }
}
