package X1;

import N7.H7;

/* compiled from: WorkConstraintsTracker.kt */
/* loaded from: classes.dex */
public abstract class b {

    /* compiled from: WorkConstraintsTracker.kt */
    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f13538a = new a();
    }

    /* compiled from: WorkConstraintsTracker.kt */
    /* renamed from: X1.b$b, reason: collision with other inner class name */
    public static final class C0195b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final int f13539a;

        public C0195b(int i) {
            this.f13539a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0195b) && this.f13539a == ((C0195b) obj).f13539a;
        }

        public final int hashCode() {
            return this.f13539a;
        }

        public final String toString() {
            return H7.p(new StringBuilder("ConstraintsNotMet(reason="), this.f13539a, ')');
        }
    }
}
