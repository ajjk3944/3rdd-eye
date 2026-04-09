package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.o0;
import f.AbstractC5487d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class r {

    /* renamed from: d, reason: collision with root package name */
    private static final r f30950d = new r(true);

    /* renamed from: a, reason: collision with root package name */
    private final f0 f30951a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f30952b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30953c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30954a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f30955b;

        static {
            int[] iArr = new int[o0.b.values().length];
            f30955b = iArr;
            try {
                iArr[o0.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30955b[o0.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30955b[o0.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30955b[o0.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30955b[o0.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30955b[o0.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30955b[o0.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f30955b[o0.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f30955b[o0.b.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f30955b[o0.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f30955b[o0.b.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f30955b[o0.b.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f30955b[o0.b.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f30955b[o0.b.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f30955b[o0.b.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f30955b[o0.b.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f30955b[o0.b.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f30955b[o0.b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[o0.c.values().length];
            f30954a = iArr2;
            try {
                iArr2[o0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f30954a[o0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f30954a[o0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f30954a[o0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f30954a[o0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f30954a[o0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f30954a[o0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f30954a[o0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f30954a[o0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface b extends Comparable {
        int getNumber();

        boolean isPacked();

        boolean m();

        o0.b o();
    }

    private r() {
        this.f30951a = f0.u(16);
    }

    static int b(o0.b bVar, int i10, Object obj) {
        int iP = CodedOutputStream.P(i10);
        if (bVar == o0.b.GROUP) {
            iP *= 2;
        }
        return iP + c(bVar, obj);
    }

    static int c(o0.b bVar, Object obj) {
        switch (a.f30955b[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.i(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.q(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.x(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.T(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.v(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.o(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.m(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.d(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.s((M) obj);
            case 10:
                return CodedOutputStream.A((M) obj);
            case 11:
                return obj instanceof AbstractC3971g ? CodedOutputStream.g((AbstractC3971g) obj) : CodedOutputStream.O((String) obj);
            case 12:
                return obj instanceof AbstractC3971g ? CodedOutputStream.g((AbstractC3971g) obj) : CodedOutputStream.e((byte[]) obj);
            case 13:
                return CodedOutputStream.R(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.G(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.I(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.K(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.M(((Long) obj).longValue());
            case 18:
                return CodedOutputStream.k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(b bVar, Object obj) {
        o0.b bVarO = bVar.o();
        int number = bVar.getNumber();
        if (!bVar.m()) {
            return b(bVarO, number, obj);
        }
        int iB = 0;
        if (bVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iB += c(bVarO, it.next());
            }
            return CodedOutputStream.P(number) + iB + CodedOutputStream.E(iB);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iB += b(bVarO, number, it2.next());
        }
        return iB;
    }

    private int g(Map.Entry entry) {
        AbstractC5487d.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    static int i(o0.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.getWireType();
    }

    private static boolean l(Map.Entry entry) {
        AbstractC5487d.a(entry.getKey());
        throw null;
    }

    private static boolean m(o0.b bVar, Object obj) {
        AbstractC3987x.a(obj);
        switch (a.f30954a[bVar.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof AbstractC3971g) || (obj instanceof byte[]);
            case 8:
                return obj instanceof Integer;
            case 9:
                return obj instanceof M;
            default:
                return false;
        }
    }

    private void q(Map.Entry entry) {
        AbstractC5487d.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public static r r() {
        return new r();
    }

    private void t(o0.b bVar, Object obj) {
        if (!m(bVar, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    static void u(CodedOutputStream codedOutputStream, o0.b bVar, int i10, Object obj) {
        if (bVar == o0.b.GROUP) {
            codedOutputStream.r0(i10, (M) obj);
        } else {
            codedOutputStream.N0(i10, i(bVar, false));
            v(codedOutputStream, bVar, obj);
        }
    }

    static void v(CodedOutputStream codedOutputStream, o0.b bVar, Object obj) {
        switch (a.f30955b[bVar.ordinal()]) {
            case 1:
                codedOutputStream.i0(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.q0(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.y0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.R0(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.w0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.o0(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.m0(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.c0(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.t0((M) obj);
                break;
            case 10:
                codedOutputStream.A0((M) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC3971g)) {
                    codedOutputStream.M0((String) obj);
                    break;
                } else {
                    codedOutputStream.g0((AbstractC3971g) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof AbstractC3971g)) {
                    codedOutputStream.d0((byte[]) obj);
                    break;
                } else {
                    codedOutputStream.g0((AbstractC3971g) obj);
                    break;
                }
            case 13:
                codedOutputStream.P0(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.E0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.G0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.I0(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.K0(((Long) obj).longValue());
                break;
            case 18:
                codedOutputStream.k0(((Integer) obj).intValue());
                break;
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public r clone() {
        r rVarR = r();
        for (int i10 = 0; i10 < this.f30951a.n(); i10++) {
            Map.Entry entryL = this.f30951a.l(i10);
            AbstractC5487d.a(entryL.getKey());
            rVarR.s(null, entryL.getValue());
        }
        for (Map.Entry entry : this.f30951a.q()) {
            AbstractC5487d.a(entry.getKey());
            rVarR.s(null, entry.getValue());
        }
        rVarR.f30953c = this.f30953c;
        return rVarR;
    }

    Iterator e() {
        return this.f30953c ? new C3989z(this.f30951a.j().iterator()) : this.f30951a.j().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return this.f30951a.equals(((r) obj).f30951a);
        }
        return false;
    }

    public int f() {
        int iG = 0;
        for (int i10 = 0; i10 < this.f30951a.n(); i10++) {
            iG += g(this.f30951a.l(i10));
        }
        Iterator it = this.f30951a.q().iterator();
        while (it.hasNext()) {
            iG += g((Map.Entry) it.next());
        }
        return iG;
    }

    public int h() {
        int iD = 0;
        for (int i10 = 0; i10 < this.f30951a.n(); i10++) {
            Map.Entry entryL = this.f30951a.l(i10);
            AbstractC5487d.a(entryL.getKey());
            iD += d(null, entryL.getValue());
        }
        for (Map.Entry entry : this.f30951a.q()) {
            AbstractC5487d.a(entry.getKey());
            iD += d(null, entry.getValue());
        }
        return iD;
    }

    public int hashCode() {
        return this.f30951a.hashCode();
    }

    boolean j() {
        return this.f30951a.isEmpty();
    }

    public boolean k() {
        for (int i10 = 0; i10 < this.f30951a.n(); i10++) {
            if (!l(this.f30951a.l(i10))) {
                return false;
            }
        }
        Iterator it = this.f30951a.q().iterator();
        while (it.hasNext()) {
            if (!l((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator n() {
        return this.f30953c ? new C3989z(this.f30951a.entrySet().iterator()) : this.f30951a.entrySet().iterator();
    }

    public void o() {
        if (this.f30952b) {
            return;
        }
        this.f30951a.t();
        this.f30952b = true;
    }

    public void p(r rVar) {
        for (int i10 = 0; i10 < rVar.f30951a.n(); i10++) {
            q(rVar.f30951a.l(i10));
        }
        Iterator it = rVar.f30951a.q().iterator();
        while (it.hasNext()) {
            q((Map.Entry) it.next());
        }
    }

    public void s(b bVar, Object obj) {
        if (!bVar.m()) {
            t(bVar.o(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t(bVar.o(), it.next());
            }
            obj = arrayList;
        }
        this.f30951a.v(bVar, obj);
    }

    private r(boolean z10) {
        this(f0.u(0));
        o();
    }

    private r(f0 f0Var) {
        this.f30951a = f0Var;
        o();
    }
}
