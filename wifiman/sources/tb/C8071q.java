package tb;

import com.ui.unifi.core.base.net.exceptions.ApiRequestException;
import gg.AbstractC5912b;
import gg.InterfaceC5910A;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import kb.RequestHeader;
import kb.SimpleResponseHeader;
import kg.InterfaceC6468e;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import org.webrtc.DataChannel;
import tb.C8060f;

/* renamed from: tb.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8071q {

    /* renamed from: a, reason: collision with root package name */
    private final C8060f f62044a;

    /* renamed from: b, reason: collision with root package name */
    private final String f62045b;

    /* renamed from: c, reason: collision with root package name */
    private String f62046c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f62047d;

    /* renamed from: tb.q$a */
    private class a extends b {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C8071q f62048e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C8071q c8071q, C8063i request, InterfaceC5910A emitter) {
            super(c8071q, request, emitter);
            AbstractC6492s.i(request, "request");
            AbstractC6492s.i(emitter, "emitter");
            this.f62048e = c8071q;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kb.r
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public kb.t c() {
            return new kb.t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tb.q$b */
    abstract class b extends W {

        /* renamed from: b, reason: collision with root package name */
        private final C8063i f62049b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC5910A f62050c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C8071q f62051d;

        public b(C8071q c8071q, C8063i request, InterfaceC5910A emitter) {
            AbstractC6492s.i(request, "request");
            AbstractC6492s.i(emitter, "emitter");
            this.f62051d = c8071q;
            this.f62049b = request;
            this.f62050c = emitter;
        }

        @Override // kb.r
        protected void d(kb.p response) {
            AbstractC6492s.i(response, "response");
            SimpleResponseHeader simpleResponseHeader = (SimpleResponseHeader) response.c();
            if (simpleResponseHeader != null && AbstractC6492s.d(simpleResponseHeader.getId(), this.f62049b.b())) {
                this.f62051d.n(true);
                if (this.f62050c.isDisposed()) {
                    Sj.a.f20830a.o("Uh oh! Response subscriber unsubscribed: %s", this.f62051d.d());
                    return;
                }
                Integer statusCode = simpleResponseHeader.getStatusCode();
                int iIntValue = statusCode != null ? statusCode.intValue() : 0;
                if (200 <= iIntValue && iIntValue < 300) {
                    this.f62050c.onSuccess(response);
                    return;
                }
                kb.f fVarB = this.f62049b.a().b();
                RequestHeader nVar = fVarB instanceof RequestHeader ? (RequestHeader) fVarB : null;
                this.f62050c.c(new ApiRequestException(nVar != null ? nVar.getPath() : null, nVar != null ? nVar.getMethod() : null, response));
            }
        }
    }

    public C8071q(C8060f dataChannelObserverHub, String name) {
        AbstractC6492s.i(dataChannelObserverHub, "dataChannelObserverHub");
        AbstractC6492s.i(name, "name");
        this.f62044a = dataChannelObserverHub;
        this.f62045b = name;
    }

    private final gg.z g(final C8063i c8063i) {
        gg.z zVarQ = j(c8063i, new InterfaceC6835l() { // from class: tb.n
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return C8071q.h(this.f62038a, c8063i, (InterfaceC5910A) obj);
            }
        }).Q(30L, TimeUnit.SECONDS);
        AbstractC6492s.h(zVarQ, "timeout(...)");
        return zVarQ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b h(C8071q c8071q, C8063i c8063i, InterfaceC5910A emitter) {
        AbstractC6492s.i(emitter, "emitter");
        return new a(c8071q, c8063i, emitter);
    }

    private final AbstractC5912b i() {
        return this.f62044a.u();
    }

    private final gg.z j(final C8063i c8063i, final InterfaceC6835l interfaceC6835l) {
        gg.z zVarI = gg.z.i(new gg.C() { // from class: tb.o
            @Override // gg.C
            public final void a(InterfaceC5910A interfaceC5910A) {
                C8071q.k(this.f62040a, interfaceC6835l, c8063i, interfaceC5910A);
            }
        });
        AbstractC6492s.h(zVarI, "create(...)");
        return zVarI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(final C8071q c8071q, InterfaceC6835l interfaceC6835l, C8063i c8063i, InterfaceC5910A emitter) {
        AbstractC6492s.i(emitter, "emitter");
        c8071q.f62047d = false;
        c8071q.f62044a.B((C8060f.b) interfaceC6835l.invoke(emitter));
        emitter.d(new InterfaceC6468e() { // from class: tb.p
            @Override // kg.InterfaceC6468e
            public final void cancel() {
                C8071q.l(this.f62043a);
            }
        });
        ByteBuffer byteBufferA = c8063i.a().a();
        int iLimit = byteBufferA.limit();
        if (iLimit <= 8192) {
            c8071q.f62044a.w(new DataChannel.Buffer(byteBufferA, false));
            return;
        }
        while (byteBufferA.position() < iLimit) {
            byteBufferA.limit(Math.min(byteBufferA.position() + 8192, iLimit));
            c8071q.f62044a.w(new DataChannel.Buffer(byteBufferA, false));
            byteBufferA.position(byteBufferA.limit());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(C8071q c8071q) {
        c8071q.f62044a.h();
    }

    public final String d() {
        return this.f62045b;
    }

    public final boolean e() {
        return this.f62047d;
    }

    public final String f() {
        return this.f62046c;
    }

    public final gg.z m(C8063i request) {
        AbstractC6492s.i(request, "request");
        gg.z zVarK = i().k(g(request));
        AbstractC6492s.h(zVarK, "andThen(...)");
        return zVarK;
    }

    public final void n(boolean z10) {
        this.f62047d = z10;
    }

    public final void o(String str) {
        this.f62046c = str;
    }
}
