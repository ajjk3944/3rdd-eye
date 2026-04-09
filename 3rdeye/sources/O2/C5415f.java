package o2;

import android.graphics.PointF;
import java.util.List;
import l2.AbstractC5268a;
import l2.m;
import v2.C5673a;

/* compiled from: AnimatableSplitDimensionPathValue.java */
/* renamed from: o2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5415f implements InterfaceC5418i<PointF, PointF> {

    /* renamed from: a, reason: collision with root package name */
    public final C5411b f44809a;

    /* renamed from: b, reason: collision with root package name */
    public final C5411b f44810b;

    public C5415f(C5411b c5411b, C5411b c5411b2) {
        this.f44809a = c5411b;
        this.f44810b = c5411b2;
    }

    @Override // o2.InterfaceC5418i
    public final AbstractC5268a<PointF, PointF> a() {
        return new m(this.f44809a.a(), this.f44810b.a());
    }

    @Override // o2.InterfaceC5418i
    public final List<C5673a<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // o2.InterfaceC5418i
    public final boolean c() {
        return this.f44809a.c() && this.f44810b.c();
    }
}
