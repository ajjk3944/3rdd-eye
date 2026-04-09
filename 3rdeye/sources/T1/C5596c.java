package t1;

import B4.i;
import androidx.work.s;

/* compiled from: Topic.kt */
/* renamed from: t1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5596c {

    /* renamed from: a, reason: collision with root package name */
    public final long f46375a;

    /* renamed from: b, reason: collision with root package name */
    public final long f46376b;

    /* renamed from: c, reason: collision with root package name */
    public final int f46377c;

    public C5596c(long j4, long j10, int i) {
        this.f46375a = j4;
        this.f46376b = j10;
        this.f46377c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5596c)) {
            return false;
        }
        C5596c c5596c = (C5596c) obj;
        return this.f46375a == c5596c.f46375a && this.f46376b == c5596c.f46376b && this.f46377c == c5596c.f46377c;
    }

    public final int hashCode() {
        long j4 = this.f46375a;
        int i = ((int) (j4 ^ (j4 >>> 32))) * 31;
        long j10 = this.f46376b;
        return ((i + ((int) ((j10 >>> 32) ^ j10))) * 31) + this.f46377c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxonomyVersion=");
        sb.append(this.f46375a);
        sb.append(", ModelVersion=");
        sb.append(this.f46376b);
        sb.append(", TopicCode=");
        return s.d("Topic { ", i.j(sb, this.f46377c, " }"));
    }
}
