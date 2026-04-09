package s7;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: s7.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7919f {

    /* renamed from: s7.f$a */
    public static final class a extends AbstractC7919f {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f61370a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(byte[] value) {
            super(null);
            AbstractC6492s.i(value, "value");
            this.f61370a = value;
        }

        public final byte[] a() {
            return this.f61370a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!AbstractC6492s.d(a.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            AbstractC6492s.g(obj, "null cannot be cast to non-null type com.ubnt.discovery.base.model.device.DeviceIdentifier.HwAddress");
            return Arrays.equals(this.f61370a, ((a) obj).f61370a);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f61370a);
        }

        public String toString() {
            return "HwAddress[" + v7.c.f63489a.b(this.f61370a, ":") + "]";
        }
    }

    public /* synthetic */ AbstractC7919f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC7919f() {
    }
}
