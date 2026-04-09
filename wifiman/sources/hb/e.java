package hb;

import eb.C5450n;
import eb.InterfaceC5443g;
import eb.InterfaceC5447k;
import eb.InterfaceC5448l;
import gg.AbstractC5912b;
import gg.z;
import java.util.Map;
import kb.o;
import kb.t;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import mb.x;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import tb.C8060f;
import tb.C8074u;

/* loaded from: classes3.dex */
public final class e implements InterfaceC5443g.c {

    /* renamed from: b, reason: collision with root package name */
    private final C8074u f48560b;

    /* renamed from: c, reason: collision with root package name */
    private final x f48561c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC5448l f48562d;

    static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f48563a = new a();

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final byte[] apply(t it) {
            AbstractC6492s.i(it, "it");
            return it.b();
        }
    }

    static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5447k f48564a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f48565b;

        b(InterfaceC5447k interfaceC5447k, boolean z10) {
            this.f48564a = interfaceC5447k;
            this.f48565b = z10;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h apply(C8060f it) {
            AbstractC6492s.i(it, "it");
            return new h(it, this.f48564a, this.f48565b);
        }
    }

    static final class c implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5447k f48566a;

        c(InterfaceC5447k interfaceC5447k) {
            this.f48566a = interfaceC5447k;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            this.f48566a.a(it);
        }
    }

    public e(C8074u webRtcClient, x xVar) {
        AbstractC6492s.i(webRtcClient, "webRtcClient");
        this.f48560b = webRtcClient;
        this.f48561c = xVar;
        this.f48562d = webRtcClient.h() ? new C5450n(webRtcClient) : null;
    }

    private final z e(String str, o oVar, String str2, Map map) {
        return this.f48560b.k(g(str), oVar, str2, map);
    }

    private final String g(String str) {
        if (f() == null || kotlin.text.t.P(str, MqttTopic.TOPIC_LEVEL_SEPARATOR, false, 2, null) || sb.g.a(str)) {
            return str;
        }
        return f().getUi().getApiPrefix() + str;
    }

    @Override // eb.InterfaceC5443g.c
    public z a(String str, boolean z10, long j10) {
        return InterfaceC5443g.c.b.b(this, str, z10, j10);
    }

    @Override // eb.InterfaceC5443g.c
    public z b(String path, o method, String str, Map map) {
        AbstractC6492s.i(path, "path");
        AbstractC6492s.i(method, "method");
        z zVarA = e(path, method, str, map).A(a.f48563a);
        AbstractC6492s.h(zVarA, "map(...)");
        return zVarA;
    }

    @Override // eb.InterfaceC5451o
    public z c(String path, InterfaceC5447k listener, boolean z10, long j10) {
        AbstractC6492s.i(path, "path");
        AbstractC6492s.i(listener, "listener");
        z zVarM = this.f48560b.g(g(path)).A(new b(listener, z10)).m(new c(listener));
        AbstractC6492s.h(zVarM, "doOnError(...)");
        return zVarM;
    }

    @Override // eb.InterfaceC5443g.c
    public AbstractC5912b d(String path, o method, String str, Map map) {
        AbstractC6492s.i(path, "path");
        AbstractC6492s.i(method, "method");
        AbstractC5912b abstractC5912bY = e(path, method, str, map).y();
        AbstractC6492s.h(abstractC5912bY, "ignoreElement(...)");
        return abstractC5912bY;
    }

    public x f() {
        return this.f48561c;
    }
}
