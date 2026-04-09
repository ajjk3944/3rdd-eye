package ra;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import ma.q;

/* compiled from: ZoneRules.java */
/* loaded from: classes3.dex */
public abstract class f {

    /* compiled from: ZoneRules.java */
    public static final class a extends f implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public final q f45860b;

        public a(q qVar) {
            this.f45860b = qVar;
        }

        @Override // ra.f
        public final q a(ma.d dVar) {
            return this.f45860b;
        }

        @Override // ra.f
        public final d b(ma.f fVar) {
            return null;
        }

        @Override // ra.f
        public final List<q> c(ma.f fVar) {
            return Collections.singletonList(this.f45860b);
        }

        @Override // ra.f
        public final boolean d(ma.f fVar, q qVar) {
            return this.f45860b.equals(qVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            boolean z10 = obj instanceof a;
            q qVar = this.f45860b;
            if (z10) {
                return qVar.equals(((a) obj).f45860b);
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.g() && qVar.equals(bVar.a(ma.d.f44090d))) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = this.f45860b.f44150c;
            return ((i + 31) ^ (i + 31)) ^ 1;
        }

        public final String toString() {
            return "FixedRules:" + this.f45860b;
        }
    }

    public abstract q a(ma.d dVar);

    public abstract d b(ma.f fVar);

    public abstract List<q> c(ma.f fVar);

    public abstract boolean d(ma.f fVar, q qVar);
}
