package H;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.mp.MPv3;

/* loaded from: classes.dex */
public interface k {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7551a = a.f7552a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f7552a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final k f7553b;

        static {
            int i10 = 0;
            f7553b = new b(i10, i10, 3, null);
        }

        private a() {
        }

        public final k a() {
            return f7553b;
        }
    }

    public static final class c implements k {

        /* renamed from: b, reason: collision with root package name */
        public static final c f7556b = new c();

        private c() {
        }

        public String toString() {
            return "TextFieldLineLimits.SingleLine";
        }
    }

    public static final class b implements k {

        /* renamed from: b, reason: collision with root package name */
        private final int f7554b;

        /* renamed from: c, reason: collision with root package name */
        private final int f7555c;

        public b(int i10, int i11) {
            this.f7554b = i10;
            this.f7555c = i11;
            if (1 > i10 || i10 > i11) {
                throw new IllegalArgumentException(("Expected 1 ≤ minHeightInLines ≤ maxHeightInLines, were " + i10 + ", " + i11).toString());
            }
        }

        public final int a() {
            return this.f7555c;
        }

        public final int b() {
            return this.f7554b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f7554b == bVar.f7554b && this.f7555c == bVar.f7555c;
        }

        public int hashCode() {
            return (this.f7554b * 31) + this.f7555c;
        }

        public String toString() {
            return "MultiLine(minHeightInLines=" + this.f7554b + ", maxHeightInLines=" + this.f7555c + ')';
        }

        public /* synthetic */ b(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? 1 : i10, (i12 & 2) != 0 ? MPv3.MAX_MESSAGE_ID : i11);
        }
    }
}
