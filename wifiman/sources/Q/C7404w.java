package q;

import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import r.H;

/* renamed from: q.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7404w {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f58325a;

    /* renamed from: b, reason: collision with root package name */
    private final H f58326b;

    public C7404w(InterfaceC6835l interfaceC6835l, H h10) {
        this.f58325a = interfaceC6835l;
        this.f58326b = h10;
    }

    public final H a() {
        return this.f58326b;
    }

    public final InterfaceC6835l b() {
        return this.f58325a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7404w)) {
            return false;
        }
        C7404w c7404w = (C7404w) obj;
        return AbstractC6492s.d(this.f58325a, c7404w.f58325a) && AbstractC6492s.d(this.f58326b, c7404w.f58326b);
    }

    public int hashCode() {
        return (this.f58325a.hashCode() * 31) + this.f58326b.hashCode();
    }

    public String toString() {
        return "Slide(slideOffset=" + this.f58325a + ", animationSpec=" + this.f58326b + ')';
    }
}
