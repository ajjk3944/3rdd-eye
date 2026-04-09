package androidx.compose.material3;

import a0.i;
import g1.s;
import kotlin.Metadata;
import x1.h;
import x1.h1;
import x1.j;
import x1.k;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material3/DelegatingThemeAwareRippleNode;", "Lx1/j;", "Lx1/h;", "Lx1/h1;", "Lg1/s;", "color", "Lg1/s;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class DelegatingThemeAwareRippleNode extends j implements h, h1 {
    private final s color;

    /* renamed from: r, reason: collision with root package name */
    public final i f1108r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f1109s;

    /* renamed from: t, reason: collision with root package name */
    public final float f1110t = Float.NaN;

    /* renamed from: u, reason: collision with root package name */
    public j0.a f1111u;

    public DelegatingThemeAwareRippleNode(i iVar, boolean z10, s sVar) {
        this.f1108r = iVar;
        this.f1109s = z10;
        this.color = sVar;
    }

    @Override // x1.h1
    public final void E() {
        k.p(this, new a(this, 0));
    }

    @Override // z0.l
    public final void U() {
        k.p(this, new a(this, 0));
    }
}
