package jj;

import com.google.android.gms.internal.measurement.e5;
import h9.r2;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends androidx.lifecycle.o {

    /* renamed from: g, reason: collision with root package name */
    public final r2 f13715g;

    /* renamed from: r, reason: collision with root package name */
    public final io.sentry.internal.debugmeta.c f13716r;

    /* renamed from: x, reason: collision with root package name */
    public final m0 f13717x;

    /* renamed from: y, reason: collision with root package name */
    public final List f13718y;

    public a(r2 r2Var, io.sentry.internal.debugmeta.c cVar) {
        super(10, false);
        this.f13715g = r2Var;
        this.f13716r = cVar;
        this.f13717x = m0.APP_ACTIVE_OR_SCREEN_UNLOCKED_TRIGGER;
        this.f13718y = e5.H(o0.APP_ACTIVE_OR_SCREEN_UNLOCKED);
    }

    @Override // androidx.lifecycle.o
    public final m0 h1() {
        return this.f13717x;
    }

    @Override // androidx.lifecycle.o
    public final List i1() {
        return this.f13718y;
    }
}
