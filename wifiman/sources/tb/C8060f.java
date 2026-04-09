package tb;

import com.ui.unifi.core.base.net.webrtc.ClosedException;
import ej.InterfaceC5482f;
import ej.InterfaceC5483g;
import gg.AbstractC5912b;
import hg.InterfaceC6043c;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import okhttp3.internal.Util;
import org.webrtc.DataChannel;

/* renamed from: tb.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8060f implements DataChannel.Observer {

    /* renamed from: m, reason: collision with root package name */
    public static final a f62012m = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f62013a;

    /* renamed from: b, reason: collision with root package name */
    private final gg.y f62014b;

    /* renamed from: c, reason: collision with root package name */
    private String f62015c;

    /* renamed from: d, reason: collision with root package name */
    private DataChannel f62016d;

    /* renamed from: e, reason: collision with root package name */
    private final CopyOnWriteArrayList f62017e;

    /* renamed from: f, reason: collision with root package name */
    private b f62018f;

    /* renamed from: g, reason: collision with root package name */
    private final Hg.a f62019g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC6043c f62020h;

    /* renamed from: i, reason: collision with root package name */
    private final ej.v f62021i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC5482f f62022j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC5483g f62023k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC6043c f62024l;

    /* renamed from: tb.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: tb.f$b */
    public interface b {
        void b(ByteBuffer byteBuffer);
    }

    /* renamed from: tb.f$c */
    public interface c {
        void a(DataChannel.State state);
    }

    /* renamed from: tb.f$d */
    static final class d implements kg.p {

        /* renamed from: a, reason: collision with root package name */
        public static final d f62025a = new d();

        /* renamed from: tb.f$d$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f62026a;

            static {
                int[] iArr = new int[DataChannel.State.values().length];
                try {
                    iArr[DataChannel.State.CONNECTING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DataChannel.State.OPEN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DataChannel.State.CLOSING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[DataChannel.State.CLOSED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f62026a = iArr;
            }
        }

        d() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(DataChannel.State state) {
            int i10 = state == null ? -1 : a.f62026a[state.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2 || i10 == 3 || i10 == 4) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: tb.f$e */
    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f62027a = new e();

        /* renamed from: tb.f$e$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f62028a;

            static {
                int[] iArr = new int[DataChannel.State.values().length];
                try {
                    iArr[DataChannel.State.OPEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DataChannel.State.CONNECTING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DataChannel.State.CLOSING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[DataChannel.State.CLOSED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f62028a = iArr;
            }
        }

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(DataChannel.State state) {
            int i10 = state == null ? -1 : a.f62028a[state.ordinal()];
            if (i10 == 1 || i10 == 2) {
                return true;
            }
            if (i10 == 3 || i10 == 4) {
                throw new ClosedException();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: tb.f$f, reason: collision with other inner class name */
    /* synthetic */ class C2176f extends C6490p implements InterfaceC6835l {
        C2176f(Object obj) {
            super(1, obj, C8060f.class, "processState", "processState(Lorg/webrtc/DataChannel$State;)V", 0);
        }

        public final void a(DataChannel.State p02) throws IOException {
            AbstractC6492s.i(p02, "p0");
            ((C8060f) this.receiver).v(p02);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IOException {
            a((DataChannel.State) obj);
            return Yg.J.f24997a;
        }
    }

    public C8060f(String connection, gg.y webRtcScheduler) {
        AbstractC6492s.i(connection, "connection");
        AbstractC6492s.i(webRtcScheduler, "webRtcScheduler");
        this.f62013a = connection;
        this.f62014b = webRtcScheduler;
        this.f62017e = new CopyOnWriteArrayList();
        Hg.a aVarK1 = Hg.a.k1();
        AbstractC6492s.h(aVarK1, "create(...)");
        this.f62019g = aVarK1;
        InterfaceC6043c interfaceC6043cN = InterfaceC6043c.n();
        AbstractC6492s.h(interfaceC6043cN, "disposed(...)");
        this.f62020h = interfaceC6043cN;
        ej.v vVar = new ej.v(1024000L);
        this.f62021i = vVar;
        this.f62022j = ej.p.c(vVar.k());
        this.f62023k = ej.p.d(vVar.l());
        InterfaceC6043c interfaceC6043cN2 = InterfaceC6043c.n();
        AbstractC6492s.h(interfaceC6043cN2, "disposed(...)");
        this.f62024l = interfaceC6043cN2;
    }

    private final void j() throws IOException {
        this.f62020h.dispose();
        this.f62018f = null;
        DataChannel dataChannelL = l();
        if (dataChannelL != null) {
            dataChannelL.unregisterObserver();
        }
        DataChannel dataChannelL2 = l();
        if (dataChannelL2 != null) {
            dataChannelL2.close();
        }
        A(null);
        k().dispose();
        Util.m(this.f62022j);
        Util.m(n());
        this.f62019g.onError(new ClosedException());
    }

    private final String m() {
        if (this.f62015c == null) {
            Sj.a.f20830a.o("Uh oh! Trying to get DataChannel label while it was not initialised yet", new Object[0]);
        }
        String str = this.f62015c;
        return str == null ? "" : str;
    }

    private final void p() {
        if (k().isDisposed()) {
            gg.s sVarO0 = gg.s.o(new gg.u() { // from class: tb.a
                @Override // gg.u
                public final void a(gg.t tVar) {
                    C8060f.q(this.f62008a, tVar);
                }
            }).M0(Gg.a.d()).o0(Gg.a.d());
            AbstractC6492s.h(sVarO0, "observeOn(...)");
            x(Ag.f.f(sVarO0, new InterfaceC6835l() { // from class: tb.b
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return C8060f.r(this.f62009a, (Throwable) obj);
                }
            }, new InterfaceC6824a() { // from class: tb.c
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return C8060f.s(this.f62010a);
                }
            }, new InterfaceC6835l() { // from class: tb.d
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return C8060f.t(this.f62011a, (ByteBuffer) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(C8060f c8060f, gg.t emitter) {
        AbstractC6492s.i(emitter, "emitter");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(10240);
        while (!emitter.isDisposed() && c8060f.n().read(byteBufferAllocate) != -1) {
            try {
                byteBufferAllocate.flip();
                AbstractC6492s.f(byteBufferAllocate);
                emitter.h(AbstractC8061g.b(byteBufferAllocate));
                byteBufferAllocate.clear();
            } catch (IOException e10) {
                emitter.c(e10);
                return;
            }
        }
        emitter.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J r(C8060f c8060f, Throwable throwable) {
        AbstractC6492s.i(throwable, "throwable");
        Sj.a.f20830a.p(throwable, "Uh oh! Error while observing data channel data: " + c8060f.m(), new Object[0]);
        c8060f.i();
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J s(C8060f c8060f) {
        Sj.a.f20830a.o("Closing data channel since end of stream reached!", new Object[0]);
        c8060f.i();
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J t(C8060f c8060f, ByteBuffer byteBuffer) {
        AbstractC6492s.i(byteBuffer, "byteBuffer");
        b bVar = c8060f.f62018f;
        if (bVar != null) {
            bVar.b(byteBuffer);
        }
        byteBuffer.clear();
        return Yg.J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(DataChannel.State state) throws IOException {
        if (state == DataChannel.State.CLOSED || state == DataChannel.State.CLOSING) {
            j();
        }
        Iterator it = o().iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(state);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Yg.J z(Throwable it) {
        AbstractC6492s.i(it, "it");
        Sj.a.f20830a.p(it, "Error processing state", new Object[0]);
        return Yg.J.f24997a;
    }

    public void A(DataChannel dataChannel) {
        this.f62016d = dataChannel;
    }

    public final void B(b onMessageListener) {
        AbstractC6492s.i(onMessageListener, "onMessageListener");
        this.f62018f = onMessageListener;
        p();
    }

    public final void g(c listener) {
        AbstractC6492s.i(listener, "listener");
        o().add(listener);
        DataChannel dataChannelL = l();
        if (dataChannelL != null) {
            DataChannel.State state = dataChannelL.state();
            AbstractC6492s.h(state, "state(...)");
            listener.a(state);
        }
    }

    public final void h() {
        this.f62018f = null;
    }

    public final void i() {
        this.f62019g.h(DataChannel.State.CLOSED);
    }

    public InterfaceC6043c k() {
        return this.f62024l;
    }

    public DataChannel l() {
        return this.f62016d;
    }

    public InterfaceC5483g n() {
        return this.f62023k;
    }

    public CopyOnWriteArrayList o() {
        return this.f62017e;
    }

    @Override // org.webrtc.DataChannel.Observer
    public void onBufferedAmountChange(long j10) {
    }

    @Override // org.webrtc.DataChannel.Observer
    public void onMessage(DataChannel.Buffer buf) throws IOException {
        AbstractC6492s.i(buf, "buf");
        try {
            this.f62022j.write(buf.data);
            this.f62022j.flush();
        } catch (Exception e10) {
            Sj.a.f20830a.p(e10, "Error while writing data into buffer. DataChannel name: " + m(), new Object[0]);
        }
        long jD0 = n().b().D0();
        if (jD0 > 512000) {
            Sj.a.f20830a.o("Uh oh, buffer size " + jD0 + " exceeded the limit 512000. Channel: " + m(), new Object[0]);
            i();
        }
    }

    @Override // org.webrtc.DataChannel.Observer
    public void onStateChange() {
        DataChannel dataChannelL = l();
        if (dataChannelL == null) {
            Sj.a.f20830a.o("Uh oh! Hub abused without DataChannel", new Object[0]);
        } else {
            this.f62019g.h(dataChannelL.state());
        }
    }

    public final AbstractC5912b u() {
        AbstractC5912b abstractC5912bY = this.f62019g.N(d.f62025a).i0(e.f62027a).P().y();
        AbstractC6492s.h(abstractC5912bY, "ignoreElement(...)");
        return abstractC5912bY;
    }

    public final void w(DataChannel.Buffer data) {
        AbstractC6492s.i(data, "data");
        DataChannel dataChannelL = l();
        if (dataChannelL != null) {
            dataChannelL.send(data);
        }
    }

    public void x(InterfaceC6043c interfaceC6043c) {
        AbstractC6492s.i(interfaceC6043c, "<set-?>");
        this.f62024l = interfaceC6043c;
    }

    public final void y(DataChannel dataChannel) {
        AbstractC6492s.i(dataChannel, "dataChannel");
        A(dataChannel);
        this.f62015c = dataChannel.label();
        gg.s sVarO0 = this.f62019g.o0(this.f62014b);
        AbstractC6492s.h(sVarO0, "observeOn(...)");
        this.f62020h = Ag.f.i(sVarO0, new InterfaceC6835l() { // from class: tb.e
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return C8060f.z((Throwable) obj);
            }
        }, null, new C2176f(this), 2, null);
        dataChannel.registerObserver(this);
        onStateChange();
    }
}
