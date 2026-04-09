package b9;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: UInt.kt */
/* loaded from: classes3.dex */
public final class t implements Comparable<t> {

    /* renamed from: b, reason: collision with root package name */
    public final int f18100b;

    public /* synthetic */ t(int i) {
        this.f18100b = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(t tVar) {
        return kotlin.jvm.internal.l.h(this.f18100b ^ RecyclerView.UNDEFINED_DURATION, tVar.f18100b ^ RecyclerView.UNDEFINED_DURATION);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.f18100b == ((t) obj).f18100b;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18100b;
    }

    public final String toString() {
        return String.valueOf(this.f18100b & 4294967295L);
    }
}
