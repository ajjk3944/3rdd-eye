package di;

import Bh.G;
import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: di.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5403l extends AbstractC5398g {

    /* renamed from: b, reason: collision with root package name */
    public static final a f46100b = new a(null);

    /* renamed from: di.l$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC5403l a(String message) {
            AbstractC6492s.i(message, "message");
            return new b(message);
        }

        private a() {
        }
    }

    /* renamed from: di.l$b */
    public static final class b extends AbstractC5403l {

        /* renamed from: c, reason: collision with root package name */
        private final String f46101c;

        public b(String message) {
            AbstractC6492s.i(message, "message");
            this.f46101c = message;
        }

        @Override // di.AbstractC5398g
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public kotlin.reflect.jvm.internal.impl.types.error.i a(G module) {
            AbstractC6492s.i(module, "module");
            return kotlin.reflect.jvm.internal.impl.types.error.l.d(kotlin.reflect.jvm.internal.impl.types.error.k.ERROR_CONSTANT_VALUE, this.f46101c);
        }

        @Override // di.AbstractC5398g
        public String toString() {
            return this.f46101c;
        }
    }

    public AbstractC5403l() {
        super(J.f24997a);
    }

    @Override // di.AbstractC5398g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public J b() {
        throw new UnsupportedOperationException();
    }
}
