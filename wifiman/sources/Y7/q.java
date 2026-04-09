package y7;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s7.InterfaceC7921h;

/* loaded from: classes3.dex */
public abstract class q implements InterfaceC7921h {

    public static final class a extends q {

        /* renamed from: a, reason: collision with root package name */
        private final EnumC8621a f66416a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f66417b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC8621a value) {
            super(null);
            AbstractC6492s.i(value, "value");
            this.f66416a = value;
            this.f66417b = true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f66416a == ((a) obj).f66416a;
        }

        public int hashCode() {
            return this.f66416a.hashCode();
        }

        @Override // s7.InterfaceC7921h
        public boolean isSingle() {
            return this.f66417b;
        }

        public String toString() {
            return "AmpConnectionType(value=" + this.f66416a + ")";
        }
    }

    public /* synthetic */ q(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private q() {
    }
}
