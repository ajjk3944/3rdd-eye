package w7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import s7.C7920g;
import u7.AbstractC8138a;
import u7.InterfaceC8139b;
import z7.k;
import z7.y;

/* renamed from: w7.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8276e {

    /* renamed from: w7.e$a */
    public static final class a extends AbstractC8276e {

        /* renamed from: a, reason: collision with root package name */
        private final List f64483a;

        /* renamed from: w7.e$a$a, reason: collision with other inner class name */
        static final class C2282a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final C2282a f64484a = new C2282a();

            C2282a() {
                super(1);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long invoke(C7920g it) {
                AbstractC6492s.i(it, "it");
                return 5000L;
            }
        }

        public a() {
            super(null);
            this.f64483a = new ArrayList();
        }

        @Override // w7.AbstractC8276e
        public AbstractC8138a a() {
            if (this.f64483a.isEmpty()) {
                throw new IllegalStateException("You need to add at least one packet (use add(Packet)!");
            }
            return new z7.g("UiIpv4", this.f64483a, new C7.b(), null, new y(null, 1, null), C2282a.f64484a, false, null, 192, null);
        }

        public final a c(EnumC8273b type) {
            AbstractC6492s.i(type, "type");
            this.f64483a.add(type.getFactory$library_server_lan_release().invoke());
            return this;
        }
    }

    /* renamed from: w7.e$b */
    public static final class b extends AbstractC8276e {

        /* renamed from: a, reason: collision with root package name */
        private final List f64485a;

        /* renamed from: w7.e$b$a */
        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            public static final a f64486a = new a();

            a() {
                super(1);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long invoke(C7920g it) {
                AbstractC6492s.i(it, "it");
                return 5000L;
            }
        }

        public b() {
            super(null);
            this.f64485a = new ArrayList();
        }

        @Override // w7.AbstractC8276e
        public AbstractC8138a a() {
            if (this.f64485a.isEmpty()) {
                throw new IllegalStateException("You need to add at least one packet (use add(Packet)!");
            }
            return new z7.g("UiIpv6", this.f64485a, new C7.b(), null, new k(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0), a.f64486a, false, null, 192, null);
        }

        public final b c(EnumC8274c type) {
            AbstractC6492s.i(type, "type");
            this.f64485a.add(type.getFactory$library_server_lan_release().invoke());
            return this;
        }
    }

    public /* synthetic */ AbstractC8276e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract AbstractC8138a a();

    public final InterfaceC8139b b() {
        return new C8277f(this);
    }

    private AbstractC8276e() {
    }
}
