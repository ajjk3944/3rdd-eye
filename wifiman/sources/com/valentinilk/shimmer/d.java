package com.valentinilk.shimmer;

import E0.InterfaceC2641t;
import E0.r;
import Vf.k;
import androidx.compose.ui.e;
import kotlin.jvm.internal.AbstractC6492s;
import o0.InterfaceC7036c;

/* loaded from: classes4.dex */
final class d extends e.c implements r, InterfaceC2641t {

    /* renamed from: n, reason: collision with root package name */
    private Vf.c f45585n;

    /* renamed from: o, reason: collision with root package name */
    private Vf.d f45586o;

    public d(Vf.c area, Vf.d effect) {
        AbstractC6492s.i(area, "area");
        AbstractC6492s.i(effect, "effect");
        this.f45585n = area;
        this.f45586o = effect;
    }

    @Override // E0.InterfaceC2641t
    public void B(C0.r coordinates) {
        AbstractC6492s.i(coordinates, "coordinates");
        this.f45585n.h(k.a(coordinates));
    }

    public final void D2(Vf.c cVar) {
        AbstractC6492s.i(cVar, "<set-?>");
        this.f45585n = cVar;
    }

    public final void E2(Vf.d dVar) {
        AbstractC6492s.i(dVar, "<set-?>");
        this.f45586o = dVar;
    }

    @Override // E0.r
    public void J(InterfaceC7036c interfaceC7036c) {
        AbstractC6492s.i(interfaceC7036c, "<this>");
        this.f45586o.a(interfaceC7036c, this.f45585n);
    }
}
