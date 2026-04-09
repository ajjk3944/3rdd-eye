package androidx.compose.foundation.layout;

import C0.B;
import C0.C;
import C0.D;
import Yg.J;
import androidx.compose.ui.layout.t;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.L;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
final class e implements C {

    /* renamed from: a, reason: collision with root package name */
    private final f0.c f28115a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f28116b;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f28117a = new a();

        a() {
            super(1);
        }

        public final void a(t.a aVar) {
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f28118a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ B f28119b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.m f28120c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f28121d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f28122e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e f28123f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.layout.t tVar, B b10, androidx.compose.ui.layout.m mVar, int i10, int i11, e eVar) {
            super(1);
            this.f28118a = tVar;
            this.f28119b = b10;
            this.f28120c = mVar;
            this.f28121d = i10;
            this.f28122e = i11;
            this.f28123f = eVar;
        }

        public final void a(t.a aVar) {
            d.i(aVar, this.f28118a, this.f28119b, this.f28120c.getLayoutDirection(), this.f28121d, this.f28122e, this.f28123f.f28115a);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t[] f28124a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f28125b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.m f28126c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ L f28127d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ L f28128e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e f28129f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.layout.t[] tVarArr, List list, androidx.compose.ui.layout.m mVar, L l10, L l11, e eVar) {
            super(1);
            this.f28124a = tVarArr;
            this.f28125b = list;
            this.f28126c = mVar;
            this.f28127d = l10;
            this.f28128e = l11;
            this.f28129f = eVar;
        }

        public final void a(t.a aVar) {
            androidx.compose.ui.layout.t[] tVarArr = this.f28124a;
            List list = this.f28125b;
            androidx.compose.ui.layout.m mVar = this.f28126c;
            L l10 = this.f28127d;
            L l11 = this.f28128e;
            e eVar = this.f28129f;
            int length = tVarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                androidx.compose.ui.layout.t tVar = tVarArr[i10];
                AbstractC6492s.g(tVar, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                d.i(aVar, tVar, (B) list.get(i11), mVar.getLayoutDirection(), l10.f51687a, l11.f51687a, eVar.f28115a);
                i10++;
                i11++;
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    public e(f0.c cVar, boolean z10) {
        this.f28115a = cVar;
        this.f28116b = z10;
    }

    @Override // C0.C
    public D b(androidx.compose.ui.layout.m mVar, List list, long j10) {
        int iN;
        int iM;
        androidx.compose.ui.layout.t tVarT;
        if (list.isEmpty()) {
            return androidx.compose.ui.layout.m.x0(mVar, Y0.b.n(j10), Y0.b.m(j10), null, a.f28117a, 4, null);
        }
        long jD = this.f28116b ? j10 : Y0.b.d(j10, 0, 0, 0, 0, 10, null);
        if (list.size() == 1) {
            B b10 = (B) list.get(0);
            if (d.g(b10)) {
                iN = Y0.b.n(j10);
                iM = Y0.b.m(j10);
                tVarT = b10.T(Y0.b.f24516b.c(Y0.b.n(j10), Y0.b.m(j10)));
            } else {
                tVarT = b10.T(jD);
                iN = Math.max(Y0.b.n(j10), tVarT.I0());
                iM = Math.max(Y0.b.m(j10), tVarT.C0());
            }
            int i10 = iN;
            int i11 = iM;
            return androidx.compose.ui.layout.m.x0(mVar, i10, i11, null, new b(tVarT, b10, mVar, i10, i11, this), 4, null);
        }
        androidx.compose.ui.layout.t[] tVarArr = new androidx.compose.ui.layout.t[list.size()];
        L l10 = new L();
        l10.f51687a = Y0.b.n(j10);
        L l11 = new L();
        l11.f51687a = Y0.b.m(j10);
        int size = list.size();
        boolean z10 = false;
        for (int i12 = 0; i12 < size; i12++) {
            B b11 = (B) list.get(i12);
            if (d.g(b11)) {
                z10 = true;
            } else {
                androidx.compose.ui.layout.t tVarT2 = b11.T(jD);
                tVarArr[i12] = tVarT2;
                l10.f51687a = Math.max(l10.f51687a, tVarT2.I0());
                l11.f51687a = Math.max(l11.f51687a, tVarT2.C0());
            }
        }
        if (z10) {
            int i13 = l10.f51687a;
            int i14 = i13 != Integer.MAX_VALUE ? i13 : 0;
            int i15 = l11.f51687a;
            long jA = Y0.c.a(i14, i13, i15 != Integer.MAX_VALUE ? i15 : 0, i15);
            int size2 = list.size();
            for (int i16 = 0; i16 < size2; i16++) {
                B b12 = (B) list.get(i16);
                if (d.g(b12)) {
                    tVarArr[i16] = b12.T(jA);
                }
            }
        }
        return androidx.compose.ui.layout.m.x0(mVar, l10.f51687a, l11.f51687a, null, new c(tVarArr, list, mVar, l10, l11, this), 4, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return AbstractC6492s.d(this.f28115a, eVar.f28115a) && this.f28116b == eVar.f28116b;
    }

    public int hashCode() {
        return (this.f28115a.hashCode() * 31) + Boolean.hashCode(this.f28116b);
    }

    public String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f28115a + ", propagateMinConstraints=" + this.f28116b + ')';
    }
}
