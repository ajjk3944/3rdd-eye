package hb;

import Yg.InterfaceC3665i;
import Yg.J;
import eb.InterfaceC5446j;
import eb.InterfaceC5447k;
import java.nio.ByteBuffer;
import kb.s;
import kb.t;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.C6490p;
import kotlin.jvm.internal.InterfaceC6487m;
import mh.InterfaceC6835l;
import org.webrtc.DataChannel;
import tb.C8060f;

/* loaded from: classes3.dex */
public final class h implements InterfaceC5446j {

    /* renamed from: a, reason: collision with root package name */
    private final C8060f f48569a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5447k f48570b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f48571c;

    /* renamed from: d, reason: collision with root package name */
    private final s f48572d;

    /* synthetic */ class a implements C8060f.b, InterfaceC6487m {
        a() {
        }

        @Override // tb.C8060f.b
        public final void b(ByteBuffer p02) {
            AbstractC6492s.i(p02, "p0");
            h.this.e(p02);
        }

        @Override // kotlin.jvm.internal.InterfaceC6487m
        public final InterfaceC3665i c() {
            return new C6490p(1, h.this, h.class, "onWebRtcMessage", "onWebRtcMessage(Ljava/nio/ByteBuffer;)V", 0);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof C8060f.b) && (obj instanceof InterfaceC6487m)) {
                return AbstractC6492s.d(c(), ((InterfaceC6487m) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48574a;

        static {
            int[] iArr = new int[DataChannel.State.values().length];
            try {
                iArr[DataChannel.State.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataChannel.State.CLOSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DataChannel.State.CLOSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f48574a = iArr;
        }
    }

    public h(C8060f hub, InterfaceC5447k listener, boolean z10) {
        AbstractC6492s.i(hub, "hub");
        AbstractC6492s.i(listener, "listener");
        this.f48569a = hub;
        this.f48570b = listener;
        this.f48571c = z10;
        hub.g(new C8060f.c() { // from class: hb.f
            @Override // tb.C8060f.c
            public final void a(DataChannel.State state) {
                h.c(this.f48567a, state);
            }
        });
        hub.B(new a());
        this.f48572d = new s(new InterfaceC6835l() { // from class: hb.g
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return h.f(this.f48568a, (t) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(h hVar, DataChannel.State state) {
        AbstractC6492s.i(state, "state");
        int i10 = b.f48574a[state.ordinal()];
        if (i10 == 1) {
            hVar.f48570b.c();
        } else if (i10 == 2 || i10 == 3) {
            hVar.f48570b.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(ByteBuffer byteBuffer) {
        if (this.f48571c) {
            g(byteBuffer);
        } else {
            this.f48570b.b(byteBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J f(h hVar, t response) {
        AbstractC6492s.i(response, "response");
        InterfaceC5447k interfaceC5447k = hVar.f48570b;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(response.b());
        AbstractC6492s.h(byteBufferWrap, "wrap(...)");
        interfaceC5447k.b(byteBufferWrap);
        return J.f24997a;
    }

    private final void g(ByteBuffer byteBuffer) {
        this.f48572d.a(byteBuffer);
    }

    @Override // eb.InterfaceC5446j
    public void close() {
        this.f48569a.i();
    }
}
