package S9;

/* compiled from: Composers.kt */
/* renamed from: S9.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1585q extends C1584p {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12103c;

    public C1585q(L l5, boolean z10) {
        super(l5);
        this.f12103c = z10;
    }

    @Override // S9.C1584p
    public final void h(String value) {
        kotlin.jvm.internal.l.f(value, "value");
        if (this.f12103c) {
            super.h(value);
        } else {
            f(value);
        }
    }
}
