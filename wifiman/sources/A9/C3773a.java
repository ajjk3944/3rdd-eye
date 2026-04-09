package a9;

import Yg.J;
import Zg.AbstractC3682n;
import b9.AbstractC4077a;
import com.ui.btle.v2.BTLEv2$Error;
import com.ui.btle.v2.e;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.L;
import mh.InterfaceC6824a;

/* renamed from: a9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3773a {

    /* renamed from: e, reason: collision with root package name */
    public static final C0982a f25757e = new C0982a(null);

    /* renamed from: b, reason: collision with root package name */
    private int f25759b;

    /* renamed from: c, reason: collision with root package name */
    private int f25760c;

    /* renamed from: a, reason: collision with root package name */
    private byte[] f25758a = new byte[8192];

    /* renamed from: d, reason: collision with root package name */
    private final LinkedBlockingQueue f25761d = new LinkedBlockingQueue();

    /* renamed from: a9.a$a, reason: collision with other inner class name */
    public static final class C0982a {
        public /* synthetic */ C0982a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0982a() {
        }
    }

    /* renamed from: a9.a$b */
    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f25762a = new b();

        b() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Incoming Packet Buffer capacity insufficient. Buffer cleanup and maybe enlargement necessary...";
        }
    }

    /* renamed from: a9.a$c */
    static final class c extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f25763a = new c();

        c() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Incoming Packet Buffer data move to buffer start to make the place for incoming data...";
        }
    }

    /* renamed from: a9.a$d */
    static final class d extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f25764a = new d();

        d() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Incoming Packet Buffer data was moved to buffer successfully. There is a place for incoming data now.";
        }
    }

    /* renamed from: a9.a$e */
    static final class e extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final e f25765a = new e();

        e() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Incoming Packet Buffer capacity enlargement necessary. Calculating final size...";
        }
    }

    /* renamed from: a9.a$f */
    static final class f extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L f25766a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(L l10) {
            super(0);
            this.f25766a = l10;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Incoming Buffer capacity will be enlarged to " + this.f25766a.f51687a;
        }
    }

    /* renamed from: a9.a$g */
    static final class g extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ L f25767a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(L l10) {
            super(0);
            this.f25767a = l10;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "New buffer with capacity " + this.f25767a.f51687a + " created and data copied successfully.";
        }
    }

    private final void b(byte[] bArr) {
        if (this.f25758a.length >= this.f25760c + bArr.length) {
            return;
        }
        AbstractC4077a.c(b.f25762a);
        int iE = e() + bArr.length;
        if (this.f25758a.length >= e() + bArr.length) {
            AbstractC4077a.c(c.f25763a);
            byte[] bArr2 = this.f25758a;
            AbstractC3682n.h(bArr2, bArr2, 0, this.f25759b, this.f25760c);
            int iE2 = e();
            this.f25759b = 0;
            this.f25760c = iE2;
            AbstractC4077a.c(d.f25764a);
            return;
        }
        AbstractC4077a.c(e.f25765a);
        L l10 = new L();
        l10.f51687a = this.f25758a.length;
        while (true) {
            int i10 = l10.f51687a;
            if (i10 >= iE) {
                AbstractC4077a.c(new f(l10));
                byte[] bArr3 = new byte[l10.f51687a];
                AbstractC3682n.h(this.f25758a, bArr3, 0, this.f25759b, this.f25760c);
                int iE3 = e();
                this.f25759b = 0;
                this.f25760c = iE3;
                this.f25758a = bArr3;
                AbstractC4077a.c(new g(l10));
                return;
            }
            l10.f51687a = i10 * 2;
        }
    }

    private final byte[] c() {
        try {
            ByteBuffer buff = ByteBuffer.wrap(this.f25758a);
            buff.position(this.f25759b);
            int iE = e();
            e.a.C1287a c1287a = e.a.C1287a.f41130a;
            if (iE < c1287a.a()) {
                return null;
            }
            AbstractC6492s.h(buff, "buff");
            int iB = c1287a.b(buff) & 65535;
            if (iB == 0) {
                this.f25759b += c1287a.a();
                return null;
            }
            if (iB > e()) {
                return null;
            }
            int iA = iB - c1287a.a();
            byte[] bArr = new byte[iA];
            buff.get(bArr, 0, iA);
            this.f25759b += iB;
            return com.ui.btle.v2.f.b(bArr);
        } catch (BTLEv2$Error.Protocol.InvalidPacketFragmentLength unused) {
            return null;
        }
    }

    private final int e() {
        return this.f25760c - this.f25759b;
    }

    private final void f(byte[] bArr) {
        AbstractC3682n.h(bArr, this.f25758a, this.f25760c, 0, bArr.length);
        this.f25760c += bArr.length;
    }

    public final void a(byte[] bytes) {
        AbstractC6492s.i(bytes, "bytes");
        synchronized (this) {
            try {
                b(bytes);
                f(bytes);
                byte[] bArrC = c();
                while (bArrC != null) {
                    this.f25761d.add(com.ui.btle.v2.f.a(bArrC));
                    bArrC = c();
                }
                J j10 = J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final LinkedBlockingQueue d() {
        return this.f25761d;
    }
}
