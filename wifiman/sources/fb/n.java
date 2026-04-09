package fb;

import Mj.w;
import aj.AbstractC3866G;
import com.ui.unifi.core.base.net.exceptions.ApiRequestException;
import com.ui.unifi.core.http.exceptions.UnauthorisedException;
import eb.InterfaceC5443g;
import eb.InterfaceC5447k;
import gg.AbstractC5912b;
import gg.z;
import java.util.Map;
import kg.InterfaceC6469f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import lb.C6569c;
import mb.x;
import mh.InterfaceC6824a;
import okhttp3.ResponseBody;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import xb.AbstractC8444e;

/* loaded from: classes3.dex */
public final class n implements InterfaceC5443g.c {

    /* renamed from: b, reason: collision with root package name */
    private final fb.e f47271b;

    /* renamed from: c, reason: collision with root package name */
    private final x f47272c;

    /* renamed from: d, reason: collision with root package name */
    private final C6569c f47273d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6824a f47274e;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47275a;

        static {
            int[] iArr = new int[kb.o.values().length];
            try {
                iArr[kb.o.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kb.o.PATCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kb.o.GET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[kb.o.PUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[kb.o.DELETE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[kb.o.COMMAND.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f47275a = iArr;
        }
    }

    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f47278a = new d();

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final byte[] apply(kb.b it) {
            AbstractC6492s.i(it, "it");
            return it.a();
        }
    }

    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f47279a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kb.o f47280b;

        e(String str, kb.o oVar) {
            this.f47279a = str;
            this.f47280b = oVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kb.b apply(w response) throws ApiRequestException {
            AbstractC6492s.i(response, "response");
            if (response.f()) {
                return kb.b.f51351c.a(response);
            }
            throw new ApiRequestException(this.f47279a, this.f47280b.name(), response);
        }
    }

    public n(fb.e httpClient, x controller, C6569c meta, InterfaceC6824a onUnauthorised) {
        AbstractC6492s.i(httpClient, "httpClient");
        AbstractC6492s.i(controller, "controller");
        AbstractC6492s.i(meta, "meta");
        AbstractC6492s.i(onUnauthorised, "onUnauthorised");
        this.f47271b = httpClient;
        this.f47272c = controller;
        this.f47273d = meta;
        this.f47274e = onUnauthorised;
    }

    private final AbstractC5912b f(AbstractC5912b abstractC5912b) {
        AbstractC5912b abstractC5912bZ = AbstractC8444e.b(abstractC5912b).z(new InterfaceC6469f() { // from class: fb.n.b
            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Throwable p02) {
                AbstractC6492s.i(p02, "p0");
                n.this.h(p02);
            }
        });
        AbstractC6492s.h(abstractC5912bZ, "doOnError(...)");
        return abstractC5912bZ;
    }

    private final z g(z zVar) {
        z zVarM = AbstractC8444e.c(zVar).m(new InterfaceC6469f() { // from class: fb.n.c
            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(Throwable p02) {
                AbstractC6492s.i(p02, "p0");
                n.this.h(p02);
            }
        });
        AbstractC6492s.h(zVarM, "doOnError(...)");
        return zVarM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(Throwable th2) {
        if (th2 instanceof UnauthorisedException) {
            this.f47274e.invoke();
        }
    }

    private final AbstractC5912b i(String str, kb.o oVar, String str2, Map map) {
        Map<String, AbstractC3866G> mapA = InterfaceC5443g.c.f46347a.a(map, this.f47273d);
        switch (a.f47275a[oVar.ordinal()]) {
            case 1:
                return str2 != null ? this.f47271b.c().p(str, ub.f.b(str2), mapA) : this.f47271b.c().h(str, mapA);
            case 2:
                return str2 != null ? this.f47271b.c().k(str, ub.f.b(str2), mapA) : this.f47271b.c().q(str, mapA);
            case 3:
                return this.f47271b.c().i(str, mapA);
            case 4:
                return str2 != null ? this.f47271b.c().l(str, ub.f.b(str2), mapA) : this.f47271b.c().g(str, mapA);
            case 5:
                return this.f47271b.c().e(str);
            case 6:
                return this.f47271b.c().i(str, mapA);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final z j(String str, kb.o oVar, String str2, Map map) {
        z<w<ResponseBody>> zVarM;
        Map<String, AbstractC3866G> mapA = InterfaceC5443g.c.f46347a.a(map, this.f47273d);
        switch (a.f47275a[oVar.ordinal()]) {
            case 1:
                if (str2 == null) {
                    zVarM = this.f47271b.c().m(str, mapA);
                    break;
                } else {
                    zVarM = this.f47271b.c().o(str, ub.f.b(str2), mapA);
                    break;
                }
            case 2:
                if (str2 == null) {
                    zVarM = this.f47271b.c().c(str, mapA);
                    break;
                } else {
                    zVarM = this.f47271b.c().f(str, ub.f.b(str2), mapA);
                    break;
                }
            case 3:
                zVarM = this.f47271b.c().a(str, mapA);
                break;
            case 4:
                if (str2 == null) {
                    zVarM = this.f47271b.c().d(str, mapA);
                    break;
                } else {
                    zVarM = this.f47271b.c().j(str, ub.f.b(str2), mapA);
                    break;
                }
            case 5:
                zVarM = this.f47271b.c().b(str);
                break;
            case 6:
                zVarM = this.f47271b.c().a(str, mapA);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        z zVarA = zVarM.A(new e(str, oVar));
        AbstractC6492s.h(zVarA, "map(...)");
        return zVarA;
    }

    private final String l(String str) {
        String strSubstring = null;
        if (kotlin.text.t.P(str, MqttTopic.TOPIC_LEVEL_SEPARATOR, false, 2, null)) {
            String strF = this.f47271b.f();
            String strSubstring2 = str.substring(1);
            AbstractC6492s.h(strSubstring2, "substring(...)");
            return strF + strSubstring2;
        }
        String strF2 = this.f47271b.f();
        String apiPrefix = k().getUi().getApiPrefix();
        if (apiPrefix != null) {
            strSubstring = apiPrefix.substring(1);
            AbstractC6492s.h(strSubstring, "substring(...)");
        }
        return strF2 + strSubstring + str;
    }

    private final String m(String str) {
        if (sb.g.a(str)) {
            return str;
        }
        String strB = this.f47271b.b();
        String str2 = MqttTopic.TOPIC_LEVEL_SEPARATOR;
        if (!kotlin.text.t.P(str, MqttTopic.TOPIC_LEVEL_SEPARATOR, false, 2, null)) {
            String apiPrefix = k().getUi().getApiPrefix();
            if (apiPrefix != null) {
                String str3 = kotlin.text.t.m0(apiPrefix) ? null : apiPrefix;
                if (str3 != null) {
                    str2 = str3;
                }
            }
            str = str2 + str;
        }
        return "wss://" + strB + str;
    }

    @Override // eb.InterfaceC5443g.c
    public z a(String str, boolean z10, long j10) {
        return InterfaceC5443g.c.b.b(this, str, z10, j10);
    }

    @Override // eb.InterfaceC5443g.c
    public z b(String path, kb.o method, String str, Map map) {
        AbstractC6492s.i(path, "path");
        AbstractC6492s.i(method, "method");
        z zVarA = j(l(path), method, str, map).A(d.f47278a);
        AbstractC6492s.h(zVarA, "map(...)");
        return g(zVarA);
    }

    @Override // eb.InterfaceC5451o
    public z c(String path, InterfaceC5447k listener, boolean z10, long j10) {
        AbstractC6492s.i(path, "path");
        AbstractC6492s.i(listener, "listener");
        String strM = m(path);
        v vVarA = this.f47271b.a();
        fb.e eVar = this.f47271b;
        z zVarZ = z.z(new q(strM, vVarA, eVar.d(eVar.e()), this.f47271b.e(), listener, j10));
        AbstractC6492s.h(zVarZ, "just(...)");
        return zVarZ;
    }

    @Override // eb.InterfaceC5443g.c
    public AbstractC5912b d(String path, kb.o method, String str, Map map) {
        AbstractC6492s.i(path, "path");
        AbstractC6492s.i(method, "method");
        return f(i(l(path), method, str, map));
    }

    public x k() {
        return this.f47272c;
    }
}
