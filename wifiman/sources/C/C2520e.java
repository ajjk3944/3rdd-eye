package C;

import androidx.compose.ui.layout.t;
import f0.c;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.mp.PduHandle;

/* renamed from: C.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2520e implements f {

    /* renamed from: a, reason: collision with root package name */
    private final int f1980a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1981b;

    /* renamed from: c, reason: collision with root package name */
    private final List f1982c;

    /* renamed from: d, reason: collision with root package name */
    private final long f1983d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f1984e;

    /* renamed from: f, reason: collision with root package name */
    private final c.b f1985f;

    /* renamed from: g, reason: collision with root package name */
    private final c.InterfaceC1752c f1986g;

    /* renamed from: h, reason: collision with root package name */
    private final Y0.t f1987h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f1988i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f1989j;

    /* renamed from: k, reason: collision with root package name */
    private final int f1990k;

    /* renamed from: l, reason: collision with root package name */
    private final int[] f1991l;

    /* renamed from: m, reason: collision with root package name */
    private int f1992m;

    /* renamed from: n, reason: collision with root package name */
    private int f1993n;

    public /* synthetic */ C2520e(int i10, int i11, List list, long j10, Object obj, w.q qVar, c.b bVar, c.InterfaceC1752c interfaceC1752c, Y0.t tVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, list, j10, obj, qVar, bVar, interfaceC1752c, tVar, z10);
    }

    private final int e(androidx.compose.ui.layout.t tVar) {
        return this.f1989j ? tVar.C0() : tVar.I0();
    }

    private final long f(int i10) {
        int[] iArr = this.f1991l;
        int i11 = i10 * 2;
        return Y0.o.a(iArr[i11], iArr[i11 + 1]);
    }

    public final void a(int i10) {
        this.f1992m = b() + i10;
        int length = this.f1991l.length;
        for (int i11 = 0; i11 < length; i11++) {
            boolean z10 = this.f1989j;
            if ((z10 && i11 % 2 == 1) || (!z10 && i11 % 2 == 0)) {
                int[] iArr = this.f1991l;
                iArr[i11] = iArr[i11] + i10;
            }
        }
    }

    @Override // C.f
    public int b() {
        return this.f1992m;
    }

    public final int c() {
        return this.f1990k;
    }

    public Object d() {
        return this.f1984e;
    }

    public final int g() {
        return this.f1981b;
    }

    @Override // C.f
    public int getIndex() {
        return this.f1980a;
    }

    public final void h(t.a aVar) {
        if (this.f1993n == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        int size = this.f1982c.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.layout.t tVar = (androidx.compose.ui.layout.t) this.f1982c.get(i10);
            long jF = f(i10);
            if (this.f1988i) {
                jF = Y0.o.a(this.f1989j ? Y0.n.h(jF) : (this.f1993n - Y0.n.h(jF)) - e(tVar), this.f1989j ? (this.f1993n - Y0.n.i(jF)) - e(tVar) : Y0.n.i(jF));
            }
            long jL = Y0.n.l(jF, this.f1983d);
            if (this.f1989j) {
                t.a.y(aVar, tVar, jL, 0.0f, null, 6, null);
            } else {
                t.a.s(aVar, tVar, jL, 0.0f, null, 6, null);
            }
        }
    }

    public final void i(int i10, int i11, int i12) {
        int iI0;
        this.f1992m = i10;
        this.f1993n = this.f1989j ? i12 : i11;
        List list = this.f1982c;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            androidx.compose.ui.layout.t tVar = (androidx.compose.ui.layout.t) list.get(i13);
            int i14 = i13 * 2;
            if (this.f1989j) {
                int[] iArr = this.f1991l;
                c.b bVar = this.f1985f;
                if (bVar == null) {
                    throw new IllegalArgumentException("null horizontalAlignment");
                }
                iArr[i14] = bVar.a(tVar.I0(), i11, this.f1987h);
                this.f1991l[i14 + 1] = i10;
                iI0 = tVar.C0();
            } else {
                int[] iArr2 = this.f1991l;
                iArr2[i14] = i10;
                int i15 = i14 + 1;
                c.InterfaceC1752c interfaceC1752c = this.f1986g;
                if (interfaceC1752c == null) {
                    throw new IllegalArgumentException("null verticalAlignment");
                }
                iArr2[i15] = interfaceC1752c.a(tVar.C0(), i12);
                iI0 = tVar.I0();
            }
            i10 += iI0;
        }
    }

    private C2520e(int i10, int i11, List list, long j10, Object obj, w.q qVar, c.b bVar, c.InterfaceC1752c interfaceC1752c, Y0.t tVar, boolean z10) {
        this.f1980a = i10;
        this.f1981b = i11;
        this.f1982c = list;
        this.f1983d = j10;
        this.f1984e = obj;
        this.f1985f = bVar;
        this.f1986g = interfaceC1752c;
        this.f1987h = tVar;
        this.f1988i = z10;
        this.f1989j = qVar == w.q.Vertical;
        int size = list.size();
        int iMax = 0;
        for (int i12 = 0; i12 < size; i12++) {
            androidx.compose.ui.layout.t tVar2 = (androidx.compose.ui.layout.t) list.get(i12);
            iMax = Math.max(iMax, !this.f1989j ? tVar2.C0() : tVar2.I0());
        }
        this.f1990k = iMax;
        this.f1991l = new int[this.f1982c.size() * 2];
        this.f1993n = PduHandle.NONE;
    }
}
