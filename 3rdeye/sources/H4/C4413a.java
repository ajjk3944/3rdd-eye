package h4;

import I9.g;
import android.graphics.Typeface;
import d4.C4275a;

/* compiled from: CancelableFontCallback.java */
/* renamed from: h4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4413a extends g {

    /* renamed from: b, reason: collision with root package name */
    public final Typeface f38221b;

    /* renamed from: c, reason: collision with root package name */
    public final F3.f f38222c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f38223d;

    public C4413a(F3.f fVar, Typeface typeface) {
        this.f38221b = typeface;
        this.f38222c = fVar;
    }

    @Override // I9.g
    public final void Y(int i) {
        if (this.f38223d) {
            return;
        }
        C4275a c4275a = (C4275a) this.f38222c.f1607b;
        if (c4275a.j(this.f38221b)) {
            c4275a.h(false);
        }
    }

    @Override // I9.g
    public final void Z(Typeface typeface, boolean z10) {
        if (this.f38223d) {
            return;
        }
        C4275a c4275a = (C4275a) this.f38222c.f1607b;
        if (c4275a.j(typeface)) {
            c4275a.h(false);
        }
    }
}
