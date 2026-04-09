package com.marsounjan.icmp4a;

import Ii.AbstractC3059i;
import Ii.C3048c0;
import Ii.N;
import Ii.W0;
import Ki.t;
import Li.AbstractC3222i;
import Li.InterfaceC3220g;
import Yg.J;
import Yg.v;
import android.net.Network;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.marsounjan.icmp4a.Icmp;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.io.FileDescriptor;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.TimeoutCancellationException;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
public final class a implements Icmp {

    /* renamed from: a, reason: collision with root package name */
    public static final C1230a f39175a = new C1230a(null);

    /* renamed from: com.marsounjan.icmp4a.a$a, reason: collision with other inner class name */
    public static final class C1230a {
        public /* synthetic */ C1230a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1230a() {
        }
    }

    private static abstract class b {

        /* renamed from: com.marsounjan.icmp4a.a$b$a, reason: collision with other inner class name */
        public static final class C1231a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final String f39176a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1231a(String host) {
                super(null);
                AbstractC6492s.i(host, "host");
                this.f39176a = host;
            }

            public final String a() {
                return this.f39176a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1231a) && AbstractC6492s.d(this.f39176a, ((C1231a) obj).f39176a);
            }

            public int hashCode() {
                return this.f39176a.hashCode();
            }

            public String toString() {
                return "Hostname(host=" + this.f39176a + ')';
            }
        }

        /* renamed from: com.marsounjan.icmp4a.a$b$b, reason: collision with other inner class name */
        public static final class C1232b extends b {
            public abstract InetAddress a();
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    private static abstract class c {

        /* renamed from: com.marsounjan.icmp4a.a$c$a, reason: collision with other inner class name */
        public static abstract class AbstractC1233a extends c {

            /* renamed from: com.marsounjan.icmp4a.a$c$a$a, reason: collision with other inner class name */
            public static final class C1234a extends AbstractC1233a {

                /* renamed from: a, reason: collision with root package name */
                private final SecurityException f39177a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1234a(SecurityException cause) {
                    super(null);
                    AbstractC6492s.i(cause, "cause");
                    this.f39177a = cause;
                }
            }

            /* renamed from: com.marsounjan.icmp4a.a$c$a$b */
            public static final class b extends AbstractC1233a {

                /* renamed from: a, reason: collision with root package name */
                private final TimeoutCancellationException f39178a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(TimeoutCancellationException cause) {
                    super(null);
                    AbstractC6492s.i(cause, "cause");
                    this.f39178a = cause;
                }
            }

            /* renamed from: com.marsounjan.icmp4a.a$c$a$c, reason: collision with other inner class name */
            public static final class C1235c extends AbstractC1233a {

                /* renamed from: a, reason: collision with root package name */
                private final UnknownHostException f39179a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1235c(UnknownHostException cause) {
                    super(null);
                    AbstractC6492s.i(cause, "cause");
                    this.f39179a = cause;
                }
            }

            public /* synthetic */ AbstractC1233a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC1233a() {
                super(null);
            }
        }

        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            private final InetAddress f39180a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InetAddress inetAddress) {
                super(null);
                AbstractC6492s.i(inetAddress, "inetAddress");
                this.f39180a = inetAddress;
            }

            public final InetAddress a() {
                return this.f39180a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC6492s.d(this.f39180a, ((b) obj).f39180a);
            }

            public int hashCode() {
                return this.f39180a.hashCode();
            }

            public String toString() {
                return "Success(inetAddress=" + this.f39180a + ')';
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f39181a;

        /* renamed from: b, reason: collision with root package name */
        Object f39182b;

        /* renamed from: c, reason: collision with root package name */
        Object f39183c;

        /* renamed from: d, reason: collision with root package name */
        Object f39184d;

        /* renamed from: e, reason: collision with root package name */
        Object f39185e;

        /* renamed from: f, reason: collision with root package name */
        Object f39186f;

        /* renamed from: g, reason: collision with root package name */
        int f39187g;

        /* renamed from: h, reason: collision with root package name */
        int f39188h;

        /* renamed from: i, reason: collision with root package name */
        long f39189i;

        /* renamed from: j, reason: collision with root package name */
        int f39190j;

        /* renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f39191k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ b f39192l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ a f39193m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Network f39194n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ long f39195o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f39196p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Integer f39197q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ long f39198r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b bVar, a aVar, Network network, long j10, int i10, Integer num, long j11, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f39192l = bVar;
            this.f39193m = aVar;
            this.f39194n = network;
            this.f39195o = j10;
            this.f39196p = i10;
            this.f39197q = num;
            this.f39198r = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            d dVar = new d(this.f39192l, this.f39193m, this.f39194n, this.f39195o, this.f39196p, this.f39197q, this.f39198r, interfaceC5380e);
            dVar.f39191k = obj;
            return dVar;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Not initialized variable reg: 1, insn: 0x00ce: MOVE (r0 I:??[long, double]) = (r1 I:??[long, double]), block:B:26:0x00cd */
        /* JADX WARN: Not initialized variable reg: 1, insn: 0x00da: MOVE (r0 I:??[long, double]) = (r1 I:??[long, double]), block:B:29:0x00d9 */
        /* JADX WARN: Not initialized variable reg: 12, insn: 0x006f: MOVE (r6 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:16:0x006f */
        /* JADX WARN: Not initialized variable reg: 13, insn: 0x00c9: MOVE (r6 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:24:0x00c9 */
        /* JADX WARN: Not initialized variable reg: 13, insn: 0x00d3: MOVE (r6 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:26:0x00cd */
        /* JADX WARN: Not initialized variable reg: 13, insn: 0x00df: MOVE (r6 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:29:0x00d9 */
        /* JADX WARN: Not initialized variable reg: 3, insn: 0x00cf: MOVE (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:26:0x00cd */
        /* JADX WARN: Not initialized variable reg: 3, insn: 0x00db: MOVE (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:29:0x00d9 */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x00d0: MOVE (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:26:0x00cd */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x00dc: MOVE (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:29:0x00d9 */
        /* JADX WARN: Not initialized variable reg: 5, insn: 0x00d1: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:26:0x00cd */
        /* JADX WARN: Not initialized variable reg: 5, insn: 0x00dd: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:29:0x00d9 */
        /* JADX WARN: Not initialized variable reg: 6, insn: 0x00d2: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:26:0x00cd */
        /* JADX WARN: Not initialized variable reg: 6, insn: 0x00de: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:29:0x00d9 */
        /* JADX WARN: Path cross not found for [B:228:0x03cb, B:204:0x0412], limit reached: 227 */
        /* JADX WARN: Removed duplicated region for block: B:182:0x0539 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0224 A[Catch: all -> 0x0251, TryCatch #15 {all -> 0x0251, blocks: (B:57:0x021f, B:59:0x0224, B:69:0x0257, B:70:0x0259, B:72:0x0267, B:74:0x0270, B:92:0x02cd, B:94:0x02de, B:96:0x02e7, B:103:0x032b, B:105:0x032f, B:107:0x0351, B:109:0x036e, B:129:0x03bd, B:131:0x03cb, B:133:0x03d4, B:141:0x0412, B:143:0x0425, B:145:0x042b, B:147:0x0443, B:158:0x0462, B:159:0x046a, B:62:0x022e), top: B:212:0x021f }] */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0255  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0267 A[Catch: all -> 0x0251, SocketException -> 0x02c8, ErrnoException -> 0x02ca, TRY_LEAVE, TryCatch #15 {all -> 0x0251, blocks: (B:57:0x021f, B:59:0x0224, B:69:0x0257, B:70:0x0259, B:72:0x0267, B:74:0x0270, B:92:0x02cd, B:94:0x02de, B:96:0x02e7, B:103:0x032b, B:105:0x032f, B:107:0x0351, B:109:0x036e, B:129:0x03bd, B:131:0x03cb, B:133:0x03d4, B:141:0x0412, B:143:0x0425, B:145:0x042b, B:147:0x0443, B:158:0x0462, B:159:0x046a, B:62:0x022e), top: B:212:0x021f }] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x02cc A[LOOP:0: B:91:0x02cc->B:154:0x0459, LOOP_START, PHI: r3
  0x02cc: PHI (r3v28 long) = (r3v21 long), (r3v42 long) binds: [B:71:0x0265, B:154:0x0459] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:181:0x0537 -> B:9:0x0040). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r28) {
            /*
                Method dump skipped, instructions count: 1486
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marsounjan.icmp4a.a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t tVar, InterfaceC5380e interfaceC5380e) {
            return ((d) create(tVar, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f39199a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f39200b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f39201c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Network f39202d;

        /* renamed from: com.marsounjan.icmp4a.a$e$a, reason: collision with other inner class name */
        static final class C1236a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f39203a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Network f39204b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f39205c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1236a(Network network, String str, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f39204b = network;
                this.f39205c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new C1236a(this.f39204b, this.f39205c, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f39203a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                Network network = this.f39204b;
                InetAddress byName = network != null ? network.getByName(this.f39205c) : InetAddress.getByName(this.f39205c);
                AbstractC6492s.f(byName);
                return new c.b(byName);
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((C1236a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, long j10, Network network, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f39200b = str;
            this.f39201c = j10;
            this.f39202d = network;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new e(this.f39200b, this.f39201c, this.f39202d, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            Object objG = AbstractC5467b.g();
            int i10 = this.f39199a;
            try {
                if (i10 == 0) {
                    v.b(obj);
                    if (kotlin.text.t.m0(this.f39200b)) {
                        return new c.AbstractC1233a.C1235c(new UnknownHostException("Cannot resolve empty host"));
                    }
                    long j10 = this.f39201c;
                    C1236a c1236a = new C1236a(this.f39202d, this.f39200b, null);
                    this.f39199a = 1;
                    obj = W0.c(j10, c1236a, this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                return (c) obj;
            } catch (SecurityException e10) {
                bVar = new c.AbstractC1233a.C1234a(e10);
                return bVar;
            } catch (UnknownHostException e11) {
                bVar = new c.AbstractC1233a.C1235c(e11);
                return bVar;
            } catch (TimeoutCancellationException e12) {
                bVar = new c.AbstractC1233a.b(e12);
                return bVar;
            }
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((e) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(FileDescriptor fileDescriptor, Network network) throws IOException, Icmp.Error.SocketException {
        try {
            network.bindSocket(fileDescriptor);
        } catch (IOException unused) {
            throw new Icmp.Error.SocketException("Failed to bind socket to specified network", null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FileDescriptor i(InetAddress inetAddress) throws Icmp.Error.SocketException, ErrnoException {
        FileDescriptor fileDescriptorSocket;
        try {
            if (inetAddress instanceof Inet4Address) {
                fileDescriptorSocket = Os.socket(OsConstants.AF_INET, OsConstants.SOCK_DGRAM, OsConstants.IPPROTO_ICMP);
            } else {
                if (!(inetAddress instanceof Inet6Address)) {
                    throw new IllegalStateException("Unsupported destination address type " + inetAddress.getClass().getCanonicalName());
                }
                fileDescriptorSocket = Os.socket(OsConstants.AF_INET6, OsConstants.SOCK_DGRAM, OsConstants.IPPROTO_ICMPV6);
            }
            if (!fileDescriptorSocket.valid()) {
                throw new Icmp.Error.SocketException("Created file descriptor is invalid", null, 2, null);
            }
            AbstractC6492s.f(fileDescriptorSocket);
            return fileDescriptorSocket;
        } catch (ErrnoException e10) {
            throw new Icmp.Error.SocketException("Socket creation failed", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.marsounjan.icmp4a.b j(InetAddress inetAddress, int i10) {
        if (inetAddress instanceof Inet4Address) {
            return new h(i10);
        }
        if (inetAddress instanceof Inet6Address) {
            return new m(i10);
        }
        throw new IllegalArgumentException("Unsupported destination address type " + inetAddress.getClass().getCanonicalName());
    }

    private final InterfaceC3220g k(b bVar, Integer num, long j10, int i10, long j11, Network network) {
        if (num != null && num.intValue() <= 0) {
            throw new IllegalArgumentException("packet count must be null (infinite ping) or > 0");
        }
        if (j10 <= 0) {
            throw new IllegalArgumentException("timeout must be > 0");
        }
        if (i10 > 0) {
            return AbstractC3222i.C(AbstractC3222i.e(new d(bVar, this, network, j10, i10, num, j11, null)), C3048c0.b());
        }
        throw new IllegalArgumentException("packet size must be > 0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int l(FileDescriptor fileDescriptor, byte[] bArr) throws SocketException, ErrnoException {
        int iRecvfrom = Os.recvfrom(fileDescriptor, bArr, 0, bArr.length, 64, null);
        return iRecvfrom == OsConstants.EMSGSIZE ? bArr.length : iRecvfrom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(Network network, String str, long j10, InterfaceC5380e interfaceC5380e) {
        return AbstractC3059i.g(C3048c0.b(), new e(str, j10, network, null), interfaceC5380e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(FileDescriptor fileDescriptor) throws Icmp.Error.SocketException, ErrnoException {
        try {
            Os.setsockoptInt(fileDescriptor, OsConstants.IPPROTO_IP, OsConstants.IP_TOS, 16);
        } catch (ErrnoException unused) {
            throw new Icmp.Error.SocketException("Failed to set IP_TOS to low delay", null, 2, null);
        }
    }

    @Override // com.marsounjan.icmp4a.Icmp
    public InterfaceC3220g a(String host, Integer num, long j10, int i10, long j11, Network network) {
        AbstractC6492s.i(host, "host");
        return k(new b.C1231a(host), num, j10, i10, j11, network);
    }
}
