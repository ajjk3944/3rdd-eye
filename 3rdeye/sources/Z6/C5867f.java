package z6;

import N7.H7;
import z6.C5866e;

/* compiled from: GalleryState.kt */
/* renamed from: z6.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5867f implements C5866e.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f48467a;

    /* renamed from: b, reason: collision with root package name */
    public final int f48468b;

    public C5867f(int i, int i10) {
        this.f48467a = i;
        this.f48468b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5867f)) {
            return false;
        }
        C5867f c5867f = (C5867f) obj;
        return this.f48467a == c5867f.f48467a && this.f48468b == c5867f.f48468b;
    }

    public final int hashCode() {
        return (this.f48467a * 31) + this.f48468b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GalleryState(visibleItemIndex=");
        sb.append(this.f48467a);
        sb.append(", scrollOffset=");
        return H7.p(sb, this.f48468b, ')');
    }
}
