package c5;

import androidx.work.s;
import c5.C2065a;
import c5.d;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.singular.sdk.internal.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: ProtobufDataEncoderContext.java */
/* loaded from: classes2.dex */
public final class f implements Z4.e {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f18491f = Charset.forName(Constants.ENCODING);

    /* renamed from: g, reason: collision with root package name */
    public static final Z4.c f18492g;

    /* renamed from: h, reason: collision with root package name */
    public static final Z4.c f18493h;
    public static final e i;

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f18494a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f18495b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f18496c;

    /* renamed from: d, reason: collision with root package name */
    public final g f18497d;

    /* renamed from: e, reason: collision with root package name */
    public final i f18498e = new i(this);

    /* compiled from: ProtobufDataEncoderContext.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18499a;

        static {
            int[] iArr = new int[d.a.values().length];
            f18499a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18499a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18499a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        C2065a c2065aB = C2065a.b();
        c2065aB.f18486a = 1;
        f18492g = new Z4.c("key", s.k(com.google.android.gms.measurement.internal.a.h(d.class, c2065aB.a())));
        C2065a c2065aB2 = C2065a.b();
        c2065aB2.f18486a = 2;
        f18493h = new Z4.c(AppMeasurementSdk.ConditionalUserProperty.VALUE, s.k(com.google.android.gms.measurement.internal.a.h(d.class, c2065aB2.a())));
        i = new e();
    }

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, g gVar) {
        this.f18494a = byteArrayOutputStream;
        this.f18495b = map;
        this.f18496c = map2;
        this.f18497d = gVar;
    }

    public static int k(Z4.c cVar) {
        d dVar = (d) ((Annotation) cVar.f14015b.get(d.class));
        if (dVar != null) {
            return ((C2065a.C0279a) dVar).f18488a;
        }
        throw new Z4.b("Field has no @Protobuf config");
    }

    @Override // Z4.e
    public final Z4.e a(Z4.c cVar, Object obj) throws IOException {
        i(cVar, obj, true);
        return this;
    }

    @Override // Z4.e
    public final Z4.e b(Z4.c cVar, long j4) throws IOException {
        h(cVar, j4, true);
        return this;
    }

    @Override // Z4.e
    public final Z4.e c(Z4.c cVar, int i10) throws IOException {
        g(cVar, i10, true);
        return this;
    }

    @Override // Z4.e
    public final Z4.e d(Z4.c cVar, double d10) throws IOException {
        f(cVar, d10, true);
        return this;
    }

    @Override // Z4.e
    public final Z4.e e(Z4.c cVar, boolean z10) throws IOException {
        g(cVar, z10 ? 1 : 0, true);
        return this;
    }

    public final void f(Z4.c cVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return;
        }
        l((k(cVar) << 3) | 1);
        this.f18494a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d10).array());
    }

    public final void g(Z4.c cVar, int i10, boolean z10) throws IOException {
        if (z10 && i10 == 0) {
            return;
        }
        d dVar = (d) ((Annotation) cVar.f14015b.get(d.class));
        if (dVar == null) {
            throw new Z4.b("Field has no @Protobuf config");
        }
        C2065a.C0279a c0279a = (C2065a.C0279a) dVar;
        int i11 = a.f18499a[c0279a.f18489b.ordinal()];
        int i12 = c0279a.f18488a;
        if (i11 == 1) {
            l(i12 << 3);
            l(i10);
        } else if (i11 == 2) {
            l(i12 << 3);
            l((i10 << 1) ^ (i10 >> 31));
        } else {
            if (i11 != 3) {
                return;
            }
            l((i12 << 3) | 5);
            this.f18494a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i10).array());
        }
    }

    public final void h(Z4.c cVar, long j4, boolean z10) throws IOException {
        if (z10 && j4 == 0) {
            return;
        }
        d dVar = (d) ((Annotation) cVar.f14015b.get(d.class));
        if (dVar == null) {
            throw new Z4.b("Field has no @Protobuf config");
        }
        C2065a.C0279a c0279a = (C2065a.C0279a) dVar;
        int i10 = a.f18499a[c0279a.f18489b.ordinal()];
        int i11 = c0279a.f18488a;
        if (i10 == 1) {
            l(i11 << 3);
            m(j4);
        } else if (i10 == 2) {
            l(i11 << 3);
            m((j4 >> 63) ^ (j4 << 1));
        } else {
            if (i10 != 3) {
                return;
            }
            l((i11 << 3) | 1);
            this.f18494a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j4).array());
        }
    }

    public final void i(Z4.c cVar, Object obj, boolean z10) throws IOException {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return;
            }
            l((k(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f18491f);
            l(bytes.length);
            this.f18494a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                i(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                j(i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            f(cVar, ((Double) obj).doubleValue(), z10);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z10 && fFloatValue == 0.0f) {
                return;
            }
            l((k(cVar) << 3) | 5);
            this.f18494a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            h(cVar, ((Number) obj).longValue(), z10);
            return;
        }
        if (obj instanceof Boolean) {
            g(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return;
            }
            l((k(cVar) << 3) | 2);
            l(bArr.length);
            this.f18494a.write(bArr);
            return;
        }
        Z4.d dVar = (Z4.d) this.f18495b.get(obj.getClass());
        if (dVar != null) {
            j(dVar, cVar, obj, z10);
            return;
        }
        Z4.f fVar = (Z4.f) this.f18496c.get(obj.getClass());
        if (fVar != null) {
            i iVar = this.f18498e;
            iVar.f18504a = false;
            iVar.f18506c = cVar;
            iVar.f18505b = z10;
            fVar.a(obj, iVar);
            return;
        }
        if (obj instanceof InterfaceC2067c) {
            g(cVar, ((InterfaceC2067c) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            g(cVar, ((Enum) obj).ordinal(), true);
        } else {
            j(this.f18497d, cVar, obj, z10);
        }
    }

    public final void j(Z4.d dVar, Z4.c cVar, Object obj, boolean z10) throws IOException {
        C2066b c2066b = new C2066b();
        c2066b.f18490b = 0L;
        try {
            OutputStream outputStream = this.f18494a;
            this.f18494a = c2066b;
            try {
                dVar.a(obj, this);
                this.f18494a = outputStream;
                long j4 = c2066b.f18490b;
                c2066b.close();
                if (z10 && j4 == 0) {
                    return;
                }
                l((k(cVar) << 3) | 2);
                m(j4);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f18494a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c2066b.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void l(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f18494a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f18494a.write(i10 & 127);
    }

    public final void m(long j4) throws IOException {
        while (((-128) & j4) != 0) {
            this.f18494a.write((((int) j4) & 127) | 128);
            j4 >>>= 7;
        }
        this.f18494a.write(((int) j4) & 127);
    }
}
