package androidx.work;

import androidx.work.w;

/* compiled from: OneTimeWorkRequest.kt */
/* loaded from: classes.dex */
public final class p extends w {

    /* compiled from: OneTimeWorkRequest.kt */
    public static final class a extends w.a<a, p> {
        @Override // androidx.work.w.a
        public final p b() {
            if (this.f17045a && this.f17047c.f17146j.f16884c) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new p(this.f17046b, this.f17047c, this.f17048d);
        }
    }
}
