package md;

import T7.c;
import com.ui.wifiman.db.RoomPersistentInstance;
import com.ui.wifiman.model.support.a;
import gg.AbstractC5912b;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: md.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6798c extends RoomPersistentInstance implements InterfaceC6797b {

    /* renamed from: c, reason: collision with root package name */
    private final com.ui.wifiman.model.support.a f53966c;

    /* renamed from: md.c$a */
    public static final class a implements InterfaceC5915e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C6796a f53967a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6798c f53968b;

        public a(C6796a c6796a, C6798c c6798c) {
            this.f53967a = c6796a;
            this.f53968b = c6798c;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                Z7.b.h("AppSettings: " + this.f53967a, null, 2, null);
                this.f53968b.f53966c.b(new a.AbstractC1437a.C1438a(this.f53967a));
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6798c(Vb.a dao, com.ui.wifiman.model.support.a supportFileDataCollector) {
        super(dao);
        AbstractC6492s.i(dao, "dao");
        AbstractC6492s.i(supportFileDataCollector, "supportFileDataCollector");
        this.f53966c = supportFileDataCollector;
    }

    @Override // md.InterfaceC6797b
    public C6796a c() {
        T7.b bVarA = O7.e.f17622a.a();
        c.a aVar = T7.c.Companion;
        Locale locale = Locale.getDefault();
        AbstractC6492s.h(locale, "getDefault(...)");
        return new C6796a(bVarA, aVar.a(locale), false, true, true, true, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC5912b d(C6796a instance) {
        AbstractC6492s.i(instance, "instance");
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(instance, this));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        return abstractC5912bR;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C6796a e(Vb.c persistent) {
        AbstractC6492s.i(persistent, "persistent");
        return new C6796a(persistent.d(), persistent.f(), persistent.a(), persistent.b(), persistent.e(), persistent.j(), persistent.k());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C6796a f() {
        return c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ui.wifiman.db.RoomPersistentInstance
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Vb.c g(C6796a instance) {
        AbstractC6492s.i(instance, "instance");
        return new Vb.c(instance.e(), instance.g(), instance.c(), instance.d(), instance.f(), instance.h(), instance.i());
    }
}
