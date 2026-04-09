package M6;

import N7.G7;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: PagerIndicatorConnector.kt */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f4307a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4308b = new ArrayList();

    /* compiled from: PagerIndicatorConnector.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final O6.s f4309a;

        /* renamed from: b, reason: collision with root package name */
        public final G7 f4310b;

        public a(O6.s indicator, G7 g72) {
            kotlin.jvm.internal.l.f(indicator, "indicator");
            this.f4309a = indicator;
            this.f4310b = g72;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.l.b(this.f4309a, aVar.f4309a) && kotlin.jvm.internal.l.b(this.f4310b, aVar.f4310b);
        }

        public final int hashCode() {
            return this.f4310b.hashCode() + (this.f4309a.hashCode() * 31);
        }

        public final String toString() {
            return "IndicatorData(indicator=" + this.f4309a + ", pagerDiv=" + this.f4310b + ')';
        }
    }
}
