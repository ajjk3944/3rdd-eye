package ae;

import ae.AbstractC3789a;
import ae.InterfaceC3790b;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import e8.EnumC5428a;
import gg.C;
import gg.InterfaceC5910A;
import gg.z;
import h9.C5969a;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6835l;
import nc.InterfaceC6924a;
import nc.j;

/* renamed from: ae.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3791c implements InterfaceC3790b {

    /* renamed from: c, reason: collision with root package name */
    public static final a f25969c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final j f25970a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6924a f25971b;

    /* renamed from: ae.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: ae.c$b */
    static final class b implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Intent f25972a;

        b(Intent intent) {
            this.f25972a = intent;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent invoke(Context it) {
            AbstractC6492s.i(it, "it");
            return this.f25972a;
        }
    }

    /* renamed from: ae.c$c, reason: collision with other inner class name */
    static final class C1004c implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Intent f25973a;

        C1004c(Intent intent) {
            this.f25973a = intent;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent invoke(Context it) {
            AbstractC6492s.i(it, "it");
            return this.f25973a;
        }
    }

    /* renamed from: ae.c$d */
    public static final class d implements C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ UUID f25975b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f25976c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C5969a f25977d;

        public d(UUID uuid, String str, C5969a c5969a) {
            this.f25975b = uuid;
            this.f25976c = str;
            this.f25977d = c5969a;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            Object c1003b;
            try {
                if (C3791c.this.f25971b.a(EnumC5428a.NETWORK.getPackageName()) == null) {
                    c1003b = InterfaceC3790b.a.C1002a.f25966a;
                } else {
                    Intent intent = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("unifi").authority("deeplink").appendPath("v1").appendPath("console").appendPath("remote").appendPath("devices").appendPath("settings").appendQueryParameter("sso_uuid", this.f25975b.toString()).appendQueryParameter("console_id", this.f25976c).appendQueryParameter("unifi_device_mac", this.f25977d.toString()).build());
                    c1003b = C3791c.this.f25970a.a(new b(intent)) ? new InterfaceC3790b.a.C1003b(new AbstractC3789a.C1001a(this.f25975b, this.f25976c, this.f25977d, new C1004c(intent), null)) : InterfaceC3790b.a.c.f25968a;
                }
                interfaceC5910A.onSuccess(c1003b);
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    public C3791c(j intentService, InterfaceC6924a intentFactory) {
        AbstractC6492s.i(intentService, "intentService");
        AbstractC6492s.i(intentFactory, "intentFactory");
        this.f25970a = intentService;
        this.f25971b = intentFactory;
    }

    @Override // ae.InterfaceC3790b
    public z a(UUID ssoAccountId, String consoleId, C5969a deviceMac) {
        AbstractC6492s.i(ssoAccountId, "ssoAccountId");
        AbstractC6492s.i(consoleId, "consoleId");
        AbstractC6492s.i(deviceMac, "deviceMac");
        z zVarI = z.i(new d(ssoAccountId, consoleId, deviceMac));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        z zVarO = zVarI.O(Gg.a.a());
        AbstractC6492s.h(zVarO, "subscribeOn(...)");
        return zVarO;
    }
}
