package eb;

import Yg.J;
import com.ui.unifi.core.base.net.client.SocketOpenException;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import gg.D;
import gg.EnumC5911a;
import gg.s;
import gg.z;
import java.nio.ByteBuffer;
import kg.InterfaceC6465b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: eb.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5449m {

    /* renamed from: i, reason: collision with root package name */
    public static final a f46355i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5451o f46356a;

    /* renamed from: b, reason: collision with root package name */
    private final String f46357b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f46358c;

    /* renamed from: d, reason: collision with root package name */
    private final long f46359d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC5446j f46360e;

    /* renamed from: f, reason: collision with root package name */
    private final Hg.a f46361f;

    /* renamed from: g, reason: collision with root package name */
    private final Fg.e f46362g;

    /* renamed from: h, reason: collision with root package name */
    private final f f46363h;

    /* renamed from: eb.m$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z a(InterfaceC5451o deviceClient, String path, boolean z10, long j10) {
            AbstractC6492s.i(deviceClient, "deviceClient");
            AbstractC6492s.i(path, "path");
            return new C5449m(deviceClient, path, z10, j10, null).g();
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: eb.m$b */
    public static final class b {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b OPEN = new b("OPEN", 0);
        public static final b CLOSED = new b("CLOSED", 1);

        private static final /* synthetic */ b[] $values() {
            return new b[]{OPEN, CLOSED};
        }

        static {
            b[] bVarArr$values = $values();
            $VALUES = bVarArr$values;
            $ENTRIES = AbstractC5827b.a(bVarArr$values);
        }

        private b(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* renamed from: eb.m$c */
    static final class c implements InterfaceC6465b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f46364a = new c();

        c() {
        }

        @Override // kg.InterfaceC6465b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ByteBuffer apply(ByteBuffer byteBuffer, b bVar) {
            if (bVar == b.OPEN) {
                return byteBuffer;
            }
            throw new IllegalStateException("Web socket is closed");
        }
    }

    /* renamed from: eb.m$d */
    static final class d implements kg.n {

        /* renamed from: eb.m$d$a */
        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f46366a = new a();

            a() {
            }

            public final void a(b state) {
                AbstractC6492s.i(state, "state");
                if (state == b.OPEN) {
                    return;
                }
                throw new IllegalStateException("Could not open web socket. Current state: " + state);
            }

            @Override // kg.n
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                a((b) obj);
                return J.f24997a;
            }
        }

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(InterfaceC5446j webSocket) {
            AbstractC6492s.i(webSocket, "webSocket");
            C5449m.this.f46360e = webSocket;
            return C5449m.this.h().P().A(a.f46366a);
        }
    }

    /* renamed from: eb.m$e */
    static final class e implements kg.n {
        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C5449m apply(J it) {
            AbstractC6492s.i(it, "it");
            return C5449m.this;
        }
    }

    /* renamed from: eb.m$f */
    public static final class f implements InterfaceC5447k {
        f() {
        }

        @Override // eb.InterfaceC5447k
        public void a(Throwable error) {
            AbstractC6492s.i(error, "error");
            if (!C5449m.this.f46361f.n1() && !C5449m.this.f46361f.o1()) {
                if (C5449m.this.f46361f.m1() == b.OPEN) {
                    C5449m.this.f46361f.onError(error);
                } else {
                    C5449m.this.f46361f.onError(new SocketOpenException(error));
                }
            }
            C5449m.this.f46362g.a();
        }

        @Override // eb.InterfaceC5447k
        public void b(ByteBuffer message) {
            AbstractC6492s.i(message, "message");
            C5449m.this.f46362g.h(message);
        }

        @Override // eb.InterfaceC5447k
        public void c() {
            C5449m.this.f46361f.h(b.OPEN);
        }

        @Override // eb.InterfaceC5447k
        public void d() {
            C5449m.this.f46361f.h(b.CLOSED);
            C5449m.this.f46361f.a();
            C5449m.this.f46362g.a();
        }
    }

    public /* synthetic */ C5449m(InterfaceC5451o interfaceC5451o, String str, boolean z10, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC5451o, str, z10, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z g() {
        z zVarA = this.f46356a.c(this.f46357b, this.f46363h, this.f46358c, this.f46359d).s(new d()).A(new e());
        AbstractC6492s.h(zVarA, "map(...)");
        return zVarA;
    }

    public void e() {
        InterfaceC5446j interfaceC5446j = this.f46360e;
        if (interfaceC5446j == null) {
            AbstractC6492s.v("webSocket");
            interfaceC5446j = null;
        }
        interfaceC5446j.close();
    }

    public gg.i f() {
        gg.i iVarV = gg.i.v(this.f46362g, this.f46361f.d1(EnumC5911a.LATEST), c.f46364a);
        AbstractC6492s.h(iVarV, "combineLatest(...)");
        return iVarV;
    }

    public final s h() {
        return this.f46361f;
    }

    private C5449m(InterfaceC5451o interfaceC5451o, String str, boolean z10, long j10) {
        this.f46356a = interfaceC5451o;
        this.f46357b = str;
        this.f46358c = z10;
        this.f46359d = j10;
        Hg.a aVarK1 = Hg.a.k1();
        AbstractC6492s.h(aVarK1, "create(...)");
        this.f46361f = aVarK1;
        Fg.e eVarJ2 = Fg.e.j2();
        AbstractC6492s.h(eVarJ2, "create(...)");
        this.f46362g = eVarJ2;
        this.f46363h = new f();
    }
}
