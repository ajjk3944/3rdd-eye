package J7;

import I7.C2997g;
import J7.v;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import gg.InterfaceC5910A;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import okhttp3.OkHttpClient;

/* loaded from: classes3.dex */
public final class v implements TeleportCloud.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f9892a;

    /* renamed from: b, reason: collision with root package name */
    private final G f9893b;

    /* renamed from: c, reason: collision with root package name */
    private final OkHttpClient f9894c;

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TeleportCloud.e f9895a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f9896b;

        /* renamed from: J7.v$a$a, reason: collision with other inner class name */
        static final class C0397a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ v f9897a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TeleportCloud.e f9898b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f9899c;

            /* renamed from: J7.v$a$a$a, reason: collision with other inner class name */
            static final class C0398a extends AbstractC6494u implements InterfaceC6835l {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ TeleportCloud.e f9900a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ String f9901b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f9902c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0398a(TeleportCloud.e eVar, String str, String str2) {
                    super(1);
                    this.f9900a = eVar;
                    this.f9901b = str;
                    this.f9902c = str2;
                }

                @Override // mh.InterfaceC6835l
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final gg.D invoke(TeleportCloud teleportCloud) {
                    TeleportCloud.e.b bVar = (TeleportCloud.e.b) this.f9900a;
                    String clientId = this.f9901b;
                    AbstractC6492s.h(clientId, "clientId");
                    String clientName = this.f9902c;
                    AbstractC6492s.h(clientName, "clientName");
                    return teleportCloud.e(bVar, clientId, clientName);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0397a(v vVar, TeleportCloud.e eVar, String str) {
                super(1);
                this.f9897a = vVar;
                this.f9898b = eVar;
                this.f9899c = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final gg.D h(InterfaceC6835l tmp0, Object obj) {
                AbstractC6492s.i(tmp0, "$tmp0");
                return (gg.D) tmp0.invoke(obj);
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final gg.D invoke(String str) {
                gg.z zVarA = this.f9897a.a();
                final C0398a c0398a = new C0398a(this.f9898b, str, this.f9899c);
                return zVarA.s(new kg.n() { // from class: J7.u
                    @Override // kg.n
                    public final Object apply(Object obj) {
                        return v.a.C0397a.h(c0398a, obj);
                    }
                });
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ v f9903a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f9904b;

            /* renamed from: J7.v$a$b$a, reason: collision with other inner class name */
            static final class C0399a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ TeleportCloud.e.a f9905a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0399a(TeleportCloud.e.a aVar) {
                    super(0);
                    this.f9905a = aVar;
                }

                @Override // mh.InterfaceC6824a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Instantiating Teleport cloud with token " + this.f9905a.a();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(v vVar, String str) {
                super(1);
                this.f9903a = vVar;
                this.f9904b = str;
            }

            @Override // mh.InterfaceC6835l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m invoke(TeleportCloud.e.a longTermSecret) {
                N7.a.b(new C0399a(longTermSecret));
                OkHttpClient okHttpClient = this.f9903a.f9894c;
                String clientName = this.f9904b;
                AbstractC6492s.h(clientName, "clientName");
                AbstractC6492s.h(longTermSecret, "longTermSecret");
                return new m(okHttpClient, null, clientName, longTermSecret, 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(TeleportCloud.e eVar, v vVar) {
            super(1);
            this.f9895a = eVar;
            this.f9896b = vVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.D j(InterfaceC6835l tmp0, Object obj) {
            AbstractC6492s.i(tmp0, "$tmp0");
            return (gg.D) tmp0.invoke(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m l(InterfaceC6835l tmp0, Object obj) {
            AbstractC6492s.i(tmp0, "$tmp0");
            return (m) tmp0.invoke(obj);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final gg.D invoke(String str) {
            gg.z zVarZ;
            TeleportCloud.e eVar = this.f9895a;
            if (eVar instanceof TeleportCloud.e.b) {
                gg.z clientId = this.f9896b.f9893b.getClientId();
                final C0397a c0397a = new C0397a(this.f9896b, this.f9895a, str);
                zVarZ = clientId.s(new kg.n() { // from class: J7.s
                    @Override // kg.n
                    public final Object apply(Object obj) {
                        return v.a.j(c0397a, obj);
                    }
                });
            } else {
                if (!(eVar instanceof TeleportCloud.e.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                zVarZ = gg.z.z(eVar);
            }
            final b bVar = new b(this.f9896b, str);
            return zVarZ.A(new kg.n() { // from class: J7.t
                @Override // kg.n
                public final Object apply(Object obj) {
                    return v.a.l(bVar, obj);
                }
            });
        }
    }

    public static final class b implements gg.C {
        public b() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(new F(v.this.f9894c, v.this.f9892a));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    public v(String url, G clientDelegate, OkHttpClient sharedOkhttpClient) {
        AbstractC6492s.i(url, "url");
        AbstractC6492s.i(clientDelegate, "clientDelegate");
        AbstractC6492s.i(sharedOkhttpClient, "sharedOkhttpClient");
        this.f9892a = url;
        this.f9893b = clientDelegate;
        this.f9894c = sharedOkhttpClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.D g(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        return (gg.D) tmp0.invoke(obj);
    }

    @Override // com.ubnt.teleport.unifi.cloud.TeleportCloud.c
    public gg.z a() {
        gg.z zVarI = gg.z.i(new b());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        return zVarI;
    }

    @Override // com.ubnt.teleport.unifi.cloud.TeleportCloud.c
    public gg.z b(TeleportCloud.e token) {
        AbstractC6492s.i(token, "token");
        gg.z zVarF = this.f9893b.f();
        final a aVar = new a(token, this);
        gg.z zVarS = zVarF.s(new kg.n() { // from class: J7.r
            @Override // kg.n
            public final Object apply(Object obj) {
                return v.g(aVar, obj);
            }
        });
        AbstractC6492s.h(zVarS, "override fun newAuthenti…          }\n            }");
        return zVarS;
    }

    public /* synthetic */ v(String str, G g10, OkHttpClient okHttpClient, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C2997g.f8908a.b() : str, g10, okHttpClient);
    }
}
