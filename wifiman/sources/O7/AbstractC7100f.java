package o7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u7.InterfaceC8139b;

/* renamed from: o7.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7100f {

    /* renamed from: a, reason: collision with root package name */
    public static final b f55524a = new b(null);

    /* renamed from: o7.f$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f55525a = new ArrayList();

        public final a a(InterfaceC8139b factory, int i10) {
            AbstractC6492s.i(factory, "factory");
            this.f55525a.add(new p(factory, i10));
            return this;
        }

        public final AbstractC7100f b() {
            return new l(this.f55525a, null, 0L, null, 14, null);
        }
    }

    /* renamed from: o7.f$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return new a();
        }

        private b() {
        }
    }

    public abstract gg.i a();
}
