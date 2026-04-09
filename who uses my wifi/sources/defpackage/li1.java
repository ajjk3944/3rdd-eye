package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class li1 implements Comparable {
    public final long f;
    public final long g;

    public li1(long j, long j2) {
        this.f = j;
        this.g = j2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f, ((li1) obj).f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li1)) {
            return false;
        }
        li1 li1Var = (li1) obj;
        return this.f == li1Var.f && this.g == li1Var.g;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f), Long.valueOf(this.g));
    }
}
