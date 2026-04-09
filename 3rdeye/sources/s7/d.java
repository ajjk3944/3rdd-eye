package s7;

import N7.B8;
import N7.H7;
import kotlin.jvm.internal.l;
import s7.AbstractC5584c;

/* compiled from: IndicatorParams.kt */
/* loaded from: classes.dex */
public abstract class d {

    /* compiled from: IndicatorParams.kt */
    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public final int f46129a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC5584c.a f46130b;

        public a(int i, AbstractC5584c.a aVar) {
            this.f46129a = i;
            this.f46130b = aVar;
        }

        @Override // s7.d
        public final int a() {
            return this.f46129a;
        }

        @Override // s7.d
        public final AbstractC5584c b() {
            return this.f46130b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f46129a == aVar.f46129a && l.b(this.f46130b, aVar.f46130b);
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f46130b.f46125a) + (this.f46129a * 31);
        }

        public final String toString() {
            return "Circle(color=" + this.f46129a + ", itemSize=" + this.f46130b + ')';
        }
    }

    /* compiled from: IndicatorParams.kt */
    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        public final int f46131a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC5584c.b f46132b;

        /* renamed from: c, reason: collision with root package name */
        public final float f46133c;

        /* renamed from: d, reason: collision with root package name */
        public final int f46134d;

        public b(int i, AbstractC5584c.b bVar, float f10, int i10) {
            this.f46131a = i;
            this.f46132b = bVar;
            this.f46133c = f10;
            this.f46134d = i10;
        }

        @Override // s7.d
        public final int a() {
            return this.f46131a;
        }

        @Override // s7.d
        public final AbstractC5584c b() {
            return this.f46132b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f46131a == bVar.f46131a && l.b(this.f46132b, bVar.f46132b) && Float.compare(this.f46133c, bVar.f46133c) == 0 && this.f46134d == bVar.f46134d;
        }

        public final int hashCode() {
            return B8.g(this.f46133c, (this.f46132b.hashCode() + (this.f46131a * 31)) * 31, 31) + this.f46134d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RoundedRect(color=");
            sb.append(this.f46131a);
            sb.append(", itemSize=");
            sb.append(this.f46132b);
            sb.append(", strokeWidth=");
            sb.append(this.f46133c);
            sb.append(", strokeColor=");
            return H7.p(sb, this.f46134d, ')');
        }
    }

    public abstract int a();

    public abstract AbstractC5584c b();
}
