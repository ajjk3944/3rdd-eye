package z;

import androidx.compose.ui.layout.t;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import z.C8680c;

/* renamed from: z.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC8700x extends T {

    /* renamed from: z.x$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int[] f66997a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f66998b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f66999c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f67000d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t[] f67001e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC8700x f67002f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f67003g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.m f67004h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f67005i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int[] f67006j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int[] iArr, int i10, int i11, int i12, androidx.compose.ui.layout.t[] tVarArr, InterfaceC8700x interfaceC8700x, int i13, androidx.compose.ui.layout.m mVar, int i14, int[] iArr2) {
            super(1);
            this.f66997a = iArr;
            this.f66998b = i10;
            this.f66999c = i11;
            this.f67000d = i12;
            this.f67001e = tVarArr;
            this.f67002f = interfaceC8700x;
            this.f67003g = i13;
            this.f67004h = mVar;
            this.f67005i = i14;
            this.f67006j = iArr2;
        }

        public final void a(t.a aVar) {
            int[] iArr = this.f66997a;
            int i10 = iArr != null ? iArr[this.f66998b] : 0;
            for (int i11 = this.f66999c; i11 < this.f67000d; i11++) {
                androidx.compose.ui.layout.t tVar = this.f67001e[i11];
                AbstractC6492s.f(tVar);
                int iM = this.f67002f.m(tVar, S.d(tVar), this.f67003g, this.f67004h.getLayoutDirection(), this.f67005i) + i10;
                if (this.f67002f.j()) {
                    t.a.h(aVar, tVar, this.f67006j[i11 - this.f66999c], iM, 0.0f, 4, null);
                } else {
                    t.a.h(aVar, tVar, iM, this.f67006j[i11 - this.f66999c], 0.0f, 4, null);
                }
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return Yg.J.f24997a;
        }
    }

    @Override // z.T
    default void a(int i10, int[] iArr, int[] iArr2, androidx.compose.ui.layout.m mVar) {
        if (j()) {
            o().c(mVar, i10, iArr, mVar.getLayoutDirection(), iArr2);
        } else {
            p().b(mVar, i10, iArr, iArr2);
        }
    }

    @Override // z.T
    default C0.D d(androidx.compose.ui.layout.t[] tVarArr, androidx.compose.ui.layout.m mVar, int i10, int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15) {
        int i16;
        int i17;
        if (j()) {
            i17 = i11;
            i16 = i12;
        } else {
            i16 = i11;
            i17 = i12;
        }
        return androidx.compose.ui.layout.m.x0(mVar, i17, i16, null, new a(iArr2, i13, i14, i15, tVarArr, this, i12, mVar, i10, iArr), 4, null);
    }

    @Override // z.T
    default long g(int i10, int i11, int i12, int i13, boolean z10) {
        return j() ? W.a(z10, i10, i11, i12, i13) : AbstractC8685h.b(z10, i10, i11, i12, i13);
    }

    @Override // z.T
    default int h(androidx.compose.ui.layout.t tVar) {
        return j() ? tVar.G0() : tVar.D0();
    }

    boolean j();

    @Override // z.T
    default int k(androidx.compose.ui.layout.t tVar) {
        return j() ? tVar.D0() : tVar.G0();
    }

    AbstractC8690m l();

    default int m(androidx.compose.ui.layout.t tVar, V v10, int i10, Y0.t tVar2, int i11) {
        AbstractC8690m abstractC8690mL;
        if (v10 == null || (abstractC8690mL = v10.a()) == null) {
            abstractC8690mL = l();
        }
        int iK = i10 - k(tVar);
        if (j()) {
            tVar2 = Y0.t.Ltr;
        }
        return abstractC8690mL.a(iK, tVar2, tVar, i11);
    }

    C8680c.e o();

    C8680c.m p();
}
