package androidx.lifecycle;

import androidx.lifecycle.AbstractC1781n;

/* compiled from: LegacySavedStateHandleController.kt */
/* renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1779l implements InterfaceC1788v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC1781n f16162b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D1.c f16163c;

    public C1779l(D1.c cVar, AbstractC1781n abstractC1781n) {
        this.f16162b = abstractC1781n;
        this.f16163c = cVar;
    }

    @Override // androidx.lifecycle.InterfaceC1788v
    public final void c(InterfaceC1790x interfaceC1790x, AbstractC1781n.a aVar) {
        if (aVar == AbstractC1781n.a.ON_START) {
            this.f16162b.removeObserver(this);
            this.f16163c.d();
        }
    }
}
