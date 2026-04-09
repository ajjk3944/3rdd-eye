package androidx.compose.foundation.text.modifiers;

import C0.D;
import C0.InterfaceC2534n;
import C0.InterfaceC2535o;
import E0.AbstractC2635m;
import E0.B;
import E0.E;
import E0.InterfaceC2641t;
import E0.r;
import L.g;
import L0.C3174d;
import L0.U;
import Q0.AbstractC3434k;
import W0.t;
import androidx.compose.ui.layout.m;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.InterfaceC6739y0;
import mh.InterfaceC6835l;
import o0.InterfaceC7036c;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes.dex */
public final class a extends AbstractC2635m implements B, r, InterfaceC2641t {

    /* renamed from: p, reason: collision with root package name */
    private g f28533p;

    /* renamed from: q, reason: collision with root package name */
    private InterfaceC6835l f28534q;

    /* renamed from: r, reason: collision with root package name */
    private final b f28535r;

    public /* synthetic */ a(C3174d c3174d, U u10, AbstractC3434k.b bVar, InterfaceC6835l interfaceC6835l, int i10, boolean z10, int i11, int i12, List list, InterfaceC6835l interfaceC6835l2, g gVar, InterfaceC6739y0 interfaceC6739y0, InterfaceC6835l interfaceC6835l3, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3174d, u10, bVar, interfaceC6835l, i10, z10, i11, i12, list, interfaceC6835l2, gVar, interfaceC6739y0, interfaceC6835l3);
    }

    @Override // E0.B
    public int A(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return this.f28535r.R2(interfaceC2535o, interfaceC2534n, i10);
    }

    @Override // E0.InterfaceC2641t
    public void B(C0.r rVar) {
    }

    @Override // E0.r
    public void J(InterfaceC7036c interfaceC7036c) {
        this.f28535r.L2(interfaceC7036c);
    }

    public final void J2(C3174d c3174d, U u10, List list, int i10, int i11, boolean z10, AbstractC3434k.b bVar, int i12, InterfaceC6835l interfaceC6835l, InterfaceC6835l interfaceC6835l2, g gVar, InterfaceC6739y0 interfaceC6739y0) {
        b bVar2 = this.f28535r;
        bVar2.K2(bVar2.X2(interfaceC6739y0, u10), this.f28535r.Z2(c3174d), this.f28535r.Y2(u10, list, i10, i11, z10, bVar, i12), this.f28535r.W2(interfaceC6835l, interfaceC6835l2, gVar, this.f28534q));
        E.b(this);
    }

    @Override // E0.B
    public D b(m mVar, C0.B b10, long j10) {
        return this.f28535r.S2(mVar, b10, j10);
    }

    @Override // E0.B
    public int p(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return this.f28535r.T2(interfaceC2535o, interfaceC2534n, i10);
    }

    @Override // E0.B
    public int r(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return this.f28535r.U2(interfaceC2535o, interfaceC2534n, i10);
    }

    @Override // E0.B
    public int v(InterfaceC2535o interfaceC2535o, InterfaceC2534n interfaceC2534n, int i10) {
        return this.f28535r.Q2(interfaceC2535o, interfaceC2534n, i10);
    }

    public /* synthetic */ a(C3174d c3174d, U u10, AbstractC3434k.b bVar, InterfaceC6835l interfaceC6835l, int i10, boolean z10, int i11, int i12, List list, InterfaceC6835l interfaceC6835l2, g gVar, InterfaceC6739y0 interfaceC6739y0, InterfaceC6835l interfaceC6835l3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3174d, u10, bVar, (i13 & 8) != 0 ? null : interfaceC6835l, (i13 & 16) != 0 ? t.f23567a.a() : i10, (i13 & 32) != 0 ? true : z10, (i13 & 64) != 0 ? Integer.MAX_VALUE : i11, (i13 & 128) != 0 ? 1 : i12, (i13 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : list, (i13 & 512) != 0 ? null : interfaceC6835l2, (i13 & 1024) != 0 ? null : gVar, (i13 & 2048) != 0 ? null : interfaceC6739y0, (i13 & 4096) != 0 ? null : interfaceC6835l3, null);
    }

    private a(C3174d c3174d, U u10, AbstractC3434k.b bVar, InterfaceC6835l interfaceC6835l, int i10, boolean z10, int i11, int i12, List list, InterfaceC6835l interfaceC6835l2, g gVar, InterfaceC6739y0 interfaceC6739y0, InterfaceC6835l interfaceC6835l3) {
        this.f28534q = interfaceC6835l3;
        this.f28535r = (b) D2(new b(c3174d, u10, bVar, interfaceC6835l, i10, z10, i11, i12, list, interfaceC6835l2, this.f28533p, interfaceC6739y0, this.f28534q, null));
        throw new IllegalArgumentException("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
    }
}
