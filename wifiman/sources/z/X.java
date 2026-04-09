package z;

import C0.InterfaceC2535o;
import androidx.compose.ui.layout.t;
import f0.c;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import z.C8680c;

/* loaded from: classes.dex */
public final class X implements C0.C, T {

    /* renamed from: a, reason: collision with root package name */
    private final C8680c.e f66816a;

    /* renamed from: b, reason: collision with root package name */
    private final c.InterfaceC1752c f66817b;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t[] f66818a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X f66819b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f66820c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f66821d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int[] f66822e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.t[] tVarArr, X x10, int i10, int i11, int[] iArr) {
            super(1);
            this.f66818a = tVarArr;
            this.f66819b = x10;
            this.f66820c = i10;
            this.f66821d = i11;
            this.f66822e = iArr;
        }

        public final void a(t.a aVar) {
            androidx.compose.ui.layout.t[] tVarArr = this.f66818a;
            X x10 = this.f66819b;
            int i10 = this.f66820c;
            int i11 = this.f66821d;
            int[] iArr = this.f66822e;
            int length = tVarArr.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                androidx.compose.ui.layout.t tVar = tVarArr[i12];
                AbstractC6492s.f(tVar);
                t.a.h(aVar, tVar, iArr[i13], x10.r(tVar, S.d(tVar), i10, i11), 0.0f, 4, null);
                i12++;
                i13++;
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return Yg.J.f24997a;
        }
    }

    public X(C8680c.e eVar, c.InterfaceC1752c interfaceC1752c) {
        this.f66816a = eVar;
        this.f66817b = interfaceC1752c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int r(androidx.compose.ui.layout.t tVar, V v10, int i10, int i11) {
        AbstractC8690m abstractC8690mA = v10 != null ? v10.a() : null;
        return abstractC8690mA != null ? abstractC8690mA.a(i10 - tVar.C0(), Y0.t.Ltr, tVar, i11) : this.f66817b.a(0, i10 - tVar.C0());
    }

    @Override // z.T
    public void a(int i10, int[] iArr, int[] iArr2, androidx.compose.ui.layout.m mVar) {
        this.f66816a.c(mVar, i10, iArr, mVar.getLayoutDirection(), iArr2);
    }

    @Override // C0.C
    public C0.D b(androidx.compose.ui.layout.m mVar, List list, long j10) {
        return U.a(this, Y0.b.n(j10), Y0.b.m(j10), Y0.b.l(j10), Y0.b.k(j10), mVar.x1(this.f66816a.a()), mVar, list, new androidx.compose.ui.layout.t[list.size()], 0, list.size(), (3072 & 1024) != 0 ? null : null, (3072 & 2048) != 0 ? 0 : 0);
    }

    @Override // C0.C
    public int c(InterfaceC2535o interfaceC2535o, List list, int i10) {
        return I.f66803a.a(list, i10, interfaceC2535o.x1(this.f66816a.a()));
    }

    @Override // z.T
    public C0.D d(androidx.compose.ui.layout.t[] tVarArr, androidx.compose.ui.layout.m mVar, int i10, int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15) {
        return androidx.compose.ui.layout.m.x0(mVar, i11, i12, null, new a(tVarArr, this, i12, i10, iArr), 4, null);
    }

    @Override // C0.C
    public int e(InterfaceC2535o interfaceC2535o, List list, int i10) {
        return I.f66803a.b(list, i10, interfaceC2535o.x1(this.f66816a.a()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x10 = (X) obj;
        return AbstractC6492s.d(this.f66816a, x10.f66816a) && AbstractC6492s.d(this.f66817b, x10.f66817b);
    }

    @Override // C0.C
    public int f(InterfaceC2535o interfaceC2535o, List list, int i10) {
        return I.f66803a.d(list, i10, interfaceC2535o.x1(this.f66816a.a()));
    }

    @Override // z.T
    public long g(int i10, int i11, int i12, int i13, boolean z10) {
        return W.a(z10, i10, i11, i12, i13);
    }

    @Override // z.T
    public int h(androidx.compose.ui.layout.t tVar) {
        return tVar.I0();
    }

    public int hashCode() {
        return (this.f66816a.hashCode() * 31) + this.f66817b.hashCode();
    }

    @Override // C0.C
    public int i(InterfaceC2535o interfaceC2535o, List list, int i10) {
        return I.f66803a.c(list, i10, interfaceC2535o.x1(this.f66816a.a()));
    }

    @Override // z.T
    public int k(androidx.compose.ui.layout.t tVar) {
        return tVar.C0();
    }

    public String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.f66816a + ", verticalAlignment=" + this.f66817b + ')';
    }
}
