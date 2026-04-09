package z6;

import N7.H7;
import z6.C5866e;

/* compiled from: PagerState.kt */
/* loaded from: classes.dex */
public final class g implements C5866e.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f48469a;

    public g(int i) {
        this.f48469a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f48469a == ((g) obj).f48469a;
    }

    public final int hashCode() {
        return this.f48469a;
    }

    public final String toString() {
        return H7.p(new StringBuilder("PagerState(currentPageIndex="), this.f48469a, ')');
    }
}
