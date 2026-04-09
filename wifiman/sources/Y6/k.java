package Y6;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import ej.C5481e;
import ej.InterfaceC5483g;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class k implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    int f24660a;

    /* renamed from: b, reason: collision with root package name */
    int[] f24661b;

    /* renamed from: c, reason: collision with root package name */
    String[] f24662c;

    /* renamed from: d, reason: collision with root package name */
    int[] f24663d;

    /* renamed from: e, reason: collision with root package name */
    boolean f24664e;

    /* renamed from: f, reason: collision with root package name */
    boolean f24665f;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f24666a;

        static {
            int[] iArr = new int[c.values().length];
            f24666a = iArr;
            try {
                iArr[c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24666a[c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24666a[c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24666a[c.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24666a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24666a[c.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final String[] f24667a;

        /* renamed from: b, reason: collision with root package name */
        final ej.s f24668b;

        private b(String[] strArr, ej.s sVar) {
            this.f24667a = strArr;
            this.f24668b = sVar;
        }

        public static b a(String... strArr) {
            try {
                ej.h[] hVarArr = new ej.h[strArr.length];
                C5481e c5481e = new C5481e();
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    n.A0(c5481e, strArr[i10]);
                    c5481e.readByte();
                    hVarArr[i10] = c5481e.v0();
                }
                return new b((String[]) strArr.clone(), ej.s.b0(hVarArr));
            } catch (IOException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public enum c {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    k() {
        this.f24661b = new int[32];
        this.f24662c = new String[32];
        this.f24663d = new int[32];
    }

    public static k b0(InterfaceC5483g interfaceC5483g) {
        return new m(interfaceC5483g);
    }

    public abstract double C();

    public abstract int J();

    public abstract long P();

    public abstract String S();

    public abstract Object T();

    public abstract String Y();

    public abstract void a();

    public abstract c d0();

    public abstract k f0();

    public abstract void g();

    public final String getPath() {
        return l.a(this.f24660a, this.f24661b, this.f24662c, this.f24663d);
    }

    public abstract void h();

    public abstract void j();

    public abstract void m0();

    final void n0(int i10) {
        int i11 = this.f24660a;
        int[] iArr = this.f24661b;
        if (i11 == iArr.length) {
            if (i11 == 256) {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
            this.f24661b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f24662c;
            this.f24662c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f24663d;
            this.f24663d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f24661b;
        int i12 = this.f24660a;
        this.f24660a = i12 + 1;
        iArr3[i12] = i10;
    }

    public final Object o0() {
        switch (a.f24666a[d0().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                a();
                while (s()) {
                    arrayList.add(o0());
                }
                h();
                return arrayList;
            case 2:
                p pVar = new p();
                g();
                while (s()) {
                    String strS = S();
                    Object objO0 = o0();
                    Object objPut = pVar.put(strS, objO0);
                    if (objPut != null) {
                        throw new JsonDataException("Map key '" + strS + "' has multiple values at path " + getPath() + ": " + objPut + " and " + objO0);
                    }
                }
                j();
                return pVar;
            case 3:
                return Y();
            case 4:
                return Double.valueOf(C());
            case 5:
                return Boolean.valueOf(y());
            case 6:
                return T();
            default:
                throw new IllegalStateException("Expected a value but was " + d0() + " at path " + getPath());
        }
    }

    public final boolean p() {
        return this.f24665f;
    }

    public abstract int p0(b bVar);

    public abstract int q0(b bVar);

    public final void r0(boolean z10) {
        this.f24665f = z10;
    }

    public abstract boolean s();

    public final void s0(boolean z10) {
        this.f24664e = z10;
    }

    public abstract void t0();

    public abstract void u0();

    public final boolean v() {
        return this.f24664e;
    }

    final JsonEncodingException v0(String str) throws JsonEncodingException {
        throw new JsonEncodingException(str + " at path " + getPath());
    }

    public abstract boolean y();

    k(k kVar) {
        this.f24660a = kVar.f24660a;
        this.f24661b = (int[]) kVar.f24661b.clone();
        this.f24662c = (String[]) kVar.f24662c.clone();
        this.f24663d = (int[]) kVar.f24663d.clone();
        this.f24664e = kVar.f24664e;
        this.f24665f = kVar.f24665f;
    }
}
