package z;

import C0.InterfaceC2535o;
import androidx.compose.ui.layout.t;
import f0.c;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import z.C8680c;

/* renamed from: z.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8686i implements C0.C, T {

    /* renamed from: a, reason: collision with root package name */
    private final C8680c.m f66909a;

    /* renamed from: b, reason: collision with root package name */
    private final c.b f66910b;

    /* renamed from: z.i$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t[] f66911a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C8686i f66912b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f66913c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f66914d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.m f66915e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int[] f66916f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.t[] tVarArr, C8686i c8686i, int i10, int i11, androidx.compose.ui.layout.m mVar, int[] iArr) {
            super(1);
            this.f66911a = tVarArr;
            this.f66912b = c8686i;
            this.f66913c = i10;
            this.f66914d = i11;
            this.f66915e = mVar;
            this.f66916f = iArr;
        }

        public final void a(t.a aVar) {
            androidx.compose.ui.layout.t[] tVarArr = this.f66911a;
            C8686i c8686i = this.f66912b;
            int i10 = this.f66913c;
            int i11 = this.f66914d;
            androidx.compose.ui.layout.m mVar = this.f66915e;
            int[] iArr = this.f66916f;
            int length = tVarArr.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                androidx.compose.ui.layout.t tVar = tVarArr[i12];
                AbstractC6492s.f(tVar);
                t.a.h(aVar, tVar, c8686i.r(tVar, S.d(tVar), i10, i11, mVar.getLayoutDirection()), iArr[i13], 0.0f, 4, null);
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

    public C8686i(C8680c.m mVar, c.b bVar) {
        this.f66909a = mVar;
        this.f66910b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int r(androidx.compose.ui.layout.t tVar, V v10, int i10, int i11, Y0.t tVar2) {
        AbstractC8690m abstractC8690mA = v10 != null ? v10.a() : null;
        return abstractC8690mA != null ? abstractC8690mA.a(i10 - tVar.I0(), tVar2, tVar, i11) : this.f66910b.a(0, i10 - tVar.I0(), tVar2);
    }

    @Override // z.T
    public void a(int i10, int[] iArr, int[] iArr2, androidx.compose.ui.layout.m mVar) {
        this.f66909a.b(mVar, i10, iArr, iArr2);
    }

    @Override // C0.C
    public C0.D b(androidx.compose.ui.layout.m mVar, List list, long j10) {
        return U.a(this, Y0.b.m(j10), Y0.b.n(j10), Y0.b.k(j10), Y0.b.l(j10), mVar.x1(this.f66909a.a()), mVar, list, new androidx.compose.ui.layout.t[list.size()], 0, list.size(), (3072 & 1024) != 0 ? null : null, (3072 & 2048) != 0 ? 0 : 0);
    }

    @Override // C0.C
    public int c(InterfaceC2535o interfaceC2535o, List list, int i10) {
        return I.f66803a.e(list, i10, interfaceC2535o.x1(this.f66909a.a()));
    }

    @Override // z.T
    public C0.D d(androidx.compose.ui.layout.t[] tVarArr, androidx.compose.ui.layout.m mVar, int i10, int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15) {
        return androidx.compose.ui.layout.m.x0(mVar, i12, i11, null, new a(tVarArr, this, i12, i10, mVar, iArr), 4, null);
    }

    @Override // C0.C
    public int e(InterfaceC2535o interfaceC2535o, List list, int i10) {
        return I.f66803a.f(list, i10, interfaceC2535o.x1(this.f66909a.a()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8686i)) {
            return false;
        }
        C8686i c8686i = (C8686i) obj;
        return AbstractC6492s.d(this.f66909a, c8686i.f66909a) && AbstractC6492s.d(this.f66910b, c8686i.f66910b);
    }

    @Override // C0.C
    public int f(InterfaceC2535o interfaceC2535o, List list, int i10) {
        return I.f66803a.h(list, i10, interfaceC2535o.x1(this.f66909a.a()));
    }

    @Override // z.T
    public long g(int i10, int i11, int i12, int i13, boolean z10) {
        return AbstractC8685h.b(z10, i10, i11, i12, i13);
    }

    @Override // z.T
    public int h(androidx.compose.ui.layout.t tVar) {
        return tVar.C0();
    }

    public int hashCode() {
        return (this.f66909a.hashCode() * 31) + this.f66910b.hashCode();
    }

    @Override // C0.C
    public int i(InterfaceC2535o interfaceC2535o, List list, int i10) {
        return I.f66803a.g(list, i10, interfaceC2535o.x1(this.f66909a.a()));
    }

    @Override // z.T
    public int k(androidx.compose.ui.layout.t tVar) {
        return tVar.I0();
    }

    public String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f66909a + ", horizontalAlignment=" + this.f66910b + ')';
    }
}
