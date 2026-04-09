package com.ui.btle.v2.encryption.dh;

import Z8.c;
import b9.AbstractC4077a;
import c9.InterfaceC4232a;
import com.ui.btle.v2.d;
import com.ui.btle.v2.encryption.dh.DiffieHellman$Error;
import com.ui.btle.v2.encryption.dh.a;
import d9.AbstractC5316a;
import gg.C;
import gg.D;
import gg.InterfaceC5910A;
import gg.s;
import gg.t;
import gg.z;
import hg.InterfaceC6043c;
import java.util.ArrayList;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import org.snmp4j.security.dh.DHOperations;
import yj.o;
import yj.u;
import zj.l;

/* loaded from: classes3.dex */
public final class a extends com.ui.btle.v2.encryption.dh.d {

    /* renamed from: a, reason: collision with root package name */
    private final d.b f41140a;

    /* renamed from: b, reason: collision with root package name */
    private final d.a f41141b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4232a f41142c;

    /* renamed from: d, reason: collision with root package name */
    private final String f41143d;

    /* renamed from: e, reason: collision with root package name */
    private final z f41144e;

    /* renamed from: f, reason: collision with root package name */
    private final Z8.c f41145f;

    /* renamed from: g, reason: collision with root package name */
    private final Z8.c f41146g;

    /* renamed from: com.ui.btle.v2.encryption.dh.a$a, reason: collision with other inner class name */
    private enum EnumC1288a {
        REQUEST_PROTOCOL_TYPE(new l("AUTH")),
        REQUEST_PROTOCOL_SERVER(new l(DHOperations.DIFFIE_HELLMAN));

        public static final C1289a Companion = new C1289a(null);
        private final u value;

        /* renamed from: com.ui.btle.v2.encryption.dh.a$a$a, reason: collision with other inner class name */
        public static final class C1289a {
            public /* synthetic */ C1289a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final boolean a(com.ui.btle.v2.d packet) {
                AbstractC6492s.i(packet, "packet");
                o oVarW0 = org.msgpack.core.d.b(packet.a()).w0();
                AbstractC6492s.g(oVarW0, "null cannot be cast to non-null type org.msgpack.value.impl.ImmutableArrayValueImpl");
                zj.c cVar = (zj.c) oVarW0;
                for (EnumC1288a enumC1288a : EnumC1288a.values()) {
                    if (enumC1288a.getValue() != null && !AbstractC6492s.d(enumC1288a.getValue(), cVar.Z(enumC1288a.ordinal()))) {
                        return false;
                    }
                }
                return EnumC1288a.values().length == cVar.size();
            }

            public final byte[] b(byte[] publicKey) {
                AbstractC6492s.i(publicKey, "publicKey");
                ArrayList arrayList = new ArrayList();
                for (EnumC1288a enumC1288a : EnumC1288a.values()) {
                    if (enumC1288a.getValue() != null) {
                        arrayList.add(enumC1288a.getValue());
                    }
                }
                arrayList.add(new zj.e(publicKey));
                org.msgpack.core.b bVarA = org.msgpack.core.d.a();
                bVarA.T(new zj.c((u[]) arrayList.toArray(new u[0])));
                byte[] bArrR0 = bVarA.r0();
                AbstractC6492s.h(bArrR0, "messageBufferPacker.toByteArray()");
                return bArrR0;
            }

            private C1289a() {
            }
        }

        EnumC1288a(u uVar) {
            this.value = uVar;
        }

        protected final u getValue() {
            return this.value;
        }
    }

    private enum b {
        REQUEST_PROTOCOL_TYPE(new l("DHPK"), new l("DHPK")),
        REQUEST_PROTOCOL_SERVER(zj.f.f67400b, zj.f.f67401c),
        PUBLIC_KEY(null, null);

        public static final C1290a Companion = new C1290a(null);
        private final u readValue;
        private final u writeValue;

        /* renamed from: com.ui.btle.v2.encryption.dh.a$b$a, reason: collision with other inner class name */
        public static final class C1290a {
            public /* synthetic */ C1290a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final byte[] a(com.ui.btle.v2.d packet) {
                AbstractC6492s.i(packet, "packet");
                o oVarW0 = org.msgpack.core.d.b(packet.a()).w0();
                AbstractC6492s.g(oVarW0, "null cannot be cast to non-null type org.msgpack.value.impl.ImmutableArrayValueImpl");
                zj.c cVar = (zj.c) oVarW0;
                for (b bVar : b.values()) {
                    if (bVar.getReadValue() != null && !AbstractC6492s.d(bVar.getReadValue(), cVar.Z(bVar.ordinal()))) {
                        return null;
                    }
                }
                u uVarZ = cVar.Z(b.PUBLIC_KEY.ordinal());
                AbstractC6492s.g(uVarZ, "null cannot be cast to non-null type org.msgpack.value.impl.ImmutableBinaryValueImpl");
                return ((zj.e) uVarZ).u();
            }

            public final byte[] b(byte[] publicKey) {
                AbstractC6492s.i(publicKey, "publicKey");
                ArrayList arrayList = new ArrayList();
                for (b bVar : b.values()) {
                    if (bVar.getWriteValue() != null) {
                        arrayList.add(bVar.getWriteValue());
                    }
                }
                arrayList.add(new zj.e(publicKey));
                org.msgpack.core.b bVarA = org.msgpack.core.d.a();
                bVarA.T(new zj.c((u[]) arrayList.toArray(new u[0])));
                byte[] bArrR0 = bVarA.r0();
                AbstractC6492s.h(bArrR0, "messageBufferPacker.toByteArray()");
                return bArrR0;
            }

            private C1290a() {
            }
        }

        b(u uVar, u uVar2) {
            this.readValue = uVar;
            this.writeValue = uVar2;
        }

        protected final u getReadValue() {
            return this.readValue;
        }

        protected final u getWriteValue() {
            return this.writeValue;
        }
    }

    static final class c implements n {

        /* renamed from: com.ui.btle.v2.encryption.dh.a$c$a, reason: collision with other inner class name */
        static final class C1291a implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            public static final C1291a f41148a = new C1291a();

            /* renamed from: com.ui.btle.v2.encryption.dh.a$c$a$a, reason: collision with other inner class name */
            static final class C1292a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                public static final C1292a f41149a = new C1292a();

                C1292a() {
                    super(0);
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "DH - Sending Auth Message";
                }
            }

            C1291a() {
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(InterfaceC6043c it) {
                AbstractC6492s.i(it, "it");
                AbstractC4077a.c(C1292a.f41149a);
            }
        }

        static final class b implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            public static final b f41150a = new b();

            /* renamed from: com.ui.btle.v2.encryption.dh.a$c$b$a, reason: collision with other inner class name */
            static final class C1293a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                public static final C1293a f41151a = new C1293a();

                C1293a() {
                    super(0);
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "DH - Received Auth Message Response";
                }
            }

            b() {
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(com.ui.btle.v2.d it) {
                AbstractC6492s.i(it, "it");
                AbstractC4077a.c(C1293a.f41151a);
            }
        }

        /* renamed from: com.ui.btle.v2.encryption.dh.a$c$c, reason: collision with other inner class name */
        static final class C1294c implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f41152a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ byte[] f41153b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ byte[] f41154c;

            /* renamed from: com.ui.btle.v2.encryption.dh.a$c$c$a, reason: collision with other inner class name */
            static final class C1295a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                public static final C1295a f41155a = new C1295a();

                C1295a() {
                    super(0);
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "DH - Generating shared key";
                }
            }

            C1294c(a aVar, byte[] bArr, byte[] bArr2) {
                this.f41152a = aVar;
                this.f41153b = bArr;
                this.f41154c = bArr2;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final byte[] apply(com.ui.btle.v2.d it) {
                AbstractC6492s.i(it, "it");
                AbstractC4077a.c(C1295a.f41155a);
                a aVar = this.f41152a;
                byte[] bArr = this.f41153b;
                byte[] bArr2 = this.f41154c;
                byte[] bArrA = b.Companion.a(it);
                if (bArrA == null) {
                    throw new DiffieHellman$Error.KeyExchange("Failed to parse DH server public key", null, 2, null);
                }
                String str = this.f41152a.f41143d;
                return aVar.a(bArr, bArr2, bArrA, str != null ? AbstractC5316a.a(str) : null);
            }
        }

        static final class d implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f41156a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ byte[] f41157b;

            /* renamed from: com.ui.btle.v2.encryption.dh.a$c$d$a, reason: collision with other inner class name */
            static final class C1296a implements InterfaceC6469f {

                /* renamed from: a, reason: collision with root package name */
                public static final C1296a f41158a = new C1296a();

                /* renamed from: com.ui.btle.v2.encryption.dh.a$c$d$a$a, reason: collision with other inner class name */
                static final class C1297a extends AbstractC6494u implements InterfaceC6824a {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C1297a f41159a = new C1297a();

                    C1297a() {
                        super(0);
                    }

                    @Override // mh.InterfaceC6824a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "DH - Sending Auth Message 2";
                    }
                }

                C1296a() {
                }

                @Override // kg.InterfaceC6469f
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void accept(InterfaceC6043c it) {
                    AbstractC6492s.i(it, "it");
                    AbstractC4077a.c(C1297a.f41159a);
                }
            }

            static final class b implements InterfaceC6469f {

                /* renamed from: a, reason: collision with root package name */
                public static final b f41160a = new b();

                /* renamed from: com.ui.btle.v2.encryption.dh.a$c$d$b$a, reason: collision with other inner class name */
                static final class C1298a extends AbstractC6494u implements InterfaceC6824a {

                    /* renamed from: a, reason: collision with root package name */
                    public static final C1298a f41161a = new C1298a();

                    C1298a() {
                        super(0);
                    }

                    @Override // mh.InterfaceC6824a
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "DH - Received Auth Message 2 Response";
                    }
                }

                b() {
                }

                @Override // kg.InterfaceC6469f
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void accept(com.ui.btle.v2.d it) {
                    AbstractC6492s.i(it, "it");
                    AbstractC4077a.c(C1298a.f41161a);
                }
            }

            /* renamed from: com.ui.btle.v2.encryption.dh.a$c$d$c, reason: collision with other inner class name */
            static final class C1299c implements n {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ byte[] f41162a;

                C1299c(byte[] bArr) {
                    this.f41162a = bArr;
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final D apply(com.ui.btle.v2.d it) {
                    AbstractC6492s.i(it, "it");
                    return EnumC1288a.Companion.a(it) ? z.z(c.a.a(c.a.b(this.f41162a))) : z.p(new DiffieHellman$Error.Auth("DH Authentication failed", null, 2, null));
                }
            }

            d(a aVar, byte[] bArr) {
                this.f41156a = aVar;
                this.f41157b = bArr;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void c(a this$0, byte[] publicKey, t it) {
                AbstractC6492s.i(this$0, "this$0");
                AbstractC6492s.i(publicKey, "$publicKey");
                AbstractC6492s.i(it, "it");
                it.h(new com.ui.btle.v2.d(this$0.f41142c.a(), com.ui.btle.v2.c.AUTHENTICATION, EnumC1288a.Companion.b(publicKey), null));
                it.a();
            }

            @Override // kg.n
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final D apply(byte[] sharedKey) {
                AbstractC6492s.i(sharedKey, "sharedKey");
                d.b bVar = this.f41156a.f41140a;
                final a aVar = this.f41156a;
                final byte[] bArr = this.f41157b;
                s sVarO = s.o(new gg.u() { // from class: com.ui.btle.v2.encryption.dh.c
                    @Override // gg.u
                    public final void a(t tVar) {
                        a.c.d.c(aVar, bArr, tVar);
                    }
                });
                AbstractC6492s.h(sVarO, "create {\n               …                        }");
                return bVar.a(sVarO, this.f41156a.f41145f).B(C1296a.f41158a).k(this.f41156a.f41141b.a(this.f41156a.f41146g)).o(b.f41160a).s(new C1299c(sharedKey));
            }
        }

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(a this$0, byte[] publicKey, t it) {
            AbstractC6492s.i(this$0, "this$0");
            AbstractC6492s.i(publicKey, "$publicKey");
            AbstractC6492s.i(it, "it");
            it.h(new com.ui.btle.v2.d(this$0.f41142c.a(), com.ui.btle.v2.c.AUTHENTICATION, b.Companion.b(publicKey), null));
            it.a();
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final D apply(Yg.s sVar) {
            AbstractC6492s.i(sVar, "<name for destructuring parameter 0>");
            byte[] bArr = (byte[]) sVar.a();
            final byte[] bArr2 = (byte[]) sVar.c();
            d.b bVar = a.this.f41140a;
            final a aVar = a.this;
            s sVarO = s.o(new gg.u() { // from class: com.ui.btle.v2.encryption.dh.b
                @Override // gg.u
                public final void a(t tVar) {
                    a.c.c(aVar, bArr2, tVar);
                }
            });
            AbstractC6492s.h(sVarO, "create {\n               …e()\n                    }");
            return bVar.a(sVarO, a.this.f41145f).B(C1291a.f41148a).k(a.this.f41141b.a(a.this.f41146g)).o(b.f41150a).A(new C1294c(a.this, bArr, bArr2)).s(new d(a.this, bArr2));
        }
    }

    static final class d implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final d f41163a = new d();

        /* renamed from: com.ui.btle.v2.encryption.dh.a$d$a, reason: collision with other inner class name */
        static final class C1300a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1300a f41164a = new C1300a();

            C1300a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "DH Key Exchange Subscribed";
            }
        }

        d() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            AbstractC4077a.c(C1300a.f41164a);
        }
    }

    static final class e implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final e f41165a = new e();

        /* renamed from: com.ui.btle.v2.encryption.dh.a$e$a, reason: collision with other inner class name */
        static final class C1301a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1301a f41166a = new C1301a();

            C1301a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "DH Key Exchange Finished";
            }
        }

        e() {
        }

        public final void a(byte[] it) {
            AbstractC6492s.i(it, "it");
            AbstractC4077a.c(C1301a.f41166a);
        }

        @Override // kg.InterfaceC6469f
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            a(((c.a) obj).f());
        }
    }

    static final class f implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f41167a = new f();

        /* renamed from: com.ui.btle.v2.encryption.dh.a$f$a, reason: collision with other inner class name */
        static final class C1302a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1302a f41168a = new C1302a();

            C1302a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "DH Key Exchange Failed";
            }
        }

        f() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable it) {
            AbstractC6492s.i(it, "it");
            AbstractC4077a.b(C1302a.f41168a, it);
        }
    }

    public static final class g implements C {
        public g() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                byte[] bArrB = a.this.b();
                interfaceC5910A.onSuccess(Yg.z.a(bArrB, a.this.c(bArrB)));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    public a(d.b sender, d.a reader, InterfaceC4232a packetSequence, String publicSharedKey, String str) {
        AbstractC6492s.i(sender, "sender");
        AbstractC6492s.i(reader, "reader");
        AbstractC6492s.i(packetSequence, "packetSequence");
        AbstractC6492s.i(publicSharedKey, "publicSharedKey");
        this.f41140a = sender;
        this.f41141b = reader;
        this.f41142c = packetSequence;
        this.f41143d = str;
        z zVarI = z.i(new g());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        this.f41144e = zVarI;
        DefaultConstructorMarker defaultConstructorMarker = null;
        this.f41145f = new Z8.c(c.a.b(AbstractC5316a.a(publicSharedKey)), packetSequence.b(), defaultConstructorMarker);
        this.f41146g = new Z8.c(c.a.b(AbstractC5316a.a(publicSharedKey)), packetSequence.b(), defaultConstructorMarker);
    }

    public z j() {
        z zVarM = this.f41144e.s(new c()).n(d.f41163a).o(e.f41165a).m(f.f41167a);
        AbstractC6492s.h(zVarM, "override fun keyExchange…Exchange Failed\" }, it) }");
        return zVarM;
    }
}
