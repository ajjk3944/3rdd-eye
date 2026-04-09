package D8;

import androidx.work.s;

/* compiled from: TotoListItem.kt */
/* loaded from: classes3.dex */
public abstract class n {

    /* compiled from: TotoListItem.kt */
    public static final class a extends n {

        /* renamed from: a, reason: collision with root package name */
        public final String f1124a;

        public a(String name) {
            kotlin.jvm.internal.l.f(name, "name");
            this.f1124a = name;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.l.b(this.f1124a, ((a) obj).f1124a);
        }

        public final int hashCode() {
            return this.f1124a.hashCode();
        }

        public final String toString() {
            return B4.f.c(new StringBuilder("Key(name="), this.f1124a, ")");
        }
    }

    /* compiled from: TotoListItem.kt */
    public static final class b extends n {

        /* renamed from: a, reason: collision with root package name */
        public final String f1125a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1126b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f1127c;

        public b(String value, int i, boolean z10) {
            kotlin.jvm.internal.l.f(value, "value");
            this.f1125a = value;
            this.f1126b = i;
            this.f1127c = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.l.b(this.f1125a, bVar.f1125a) && this.f1126b == bVar.f1126b && this.f1127c == bVar.f1127c;
        }

        public final int hashCode() {
            return (((this.f1125a.hashCode() * 31) + this.f1126b) * 31) + (this.f1127c ? 1231 : 1237);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Value(value=");
            sb.append(this.f1125a);
            sb.append(", weight=");
            sb.append(this.f1126b);
            sb.append(", isActive=");
            return s.h(sb, this.f1127c, ")");
        }
    }
}
