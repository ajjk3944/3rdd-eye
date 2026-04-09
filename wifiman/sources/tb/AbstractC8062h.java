package tb;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: tb.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8062h {

    /* renamed from: tb.h$a */
    public static final class a extends AbstractC8062h {

        /* renamed from: a, reason: collision with root package name */
        private final String f62029a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String msid) {
            super(null);
            AbstractC6492s.i(msid, "msid");
            this.f62029a = msid;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC6492s.d(this.f62029a, ((a) obj).f62029a);
        }

        public int hashCode() {
            return this.f62029a.hashCode();
        }

        public String toString() {
            return "StreamAdded(msid=" + this.f62029a + ")";
        }
    }

    /* renamed from: tb.h$b */
    public static final class b extends AbstractC8062h {

        /* renamed from: a, reason: collision with root package name */
        private final String f62030a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String msid) {
            super(null);
            AbstractC6492s.i(msid, "msid");
            this.f62030a = msid;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC6492s.d(this.f62030a, ((b) obj).f62030a);
        }

        public int hashCode() {
            return this.f62030a.hashCode();
        }

        public String toString() {
            return "StreamRemoved(msid=" + this.f62030a + ")";
        }
    }

    public /* synthetic */ AbstractC8062h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC8062h() {
    }
}
