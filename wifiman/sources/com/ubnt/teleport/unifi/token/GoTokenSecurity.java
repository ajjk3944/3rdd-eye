package com.ubnt.teleport.unifi.token;

import Yg.J;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ubnt.teleport.unifi.token.GoTokenSecurity;
import gg.AbstractC5912b;
import gg.C;
import gg.InterfaceC5910A;
import gg.z;
import kg.InterfaceC6469f;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.text.t;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ubnt/teleport/unifi/token/GoTokenSecurity;", "LM7/b;", "<init>", "()V", "", "secret", "bridgeConvertSecretToToken", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;", "Lgg/z;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$e;)Lgg/z;", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class GoTokenSecurity implements M7.b {

    public static final class a implements C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TeleportCloud.e f39641b;

        public a(TeleportCloud.e eVar) {
            this.f39641b = eVar;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(GoTokenSecurity.this.bridgeConvertSecretToToken(this.f39641b.a()));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TeleportCloud.e f39642a;

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TeleportCloud.e f39643a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f39644b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TeleportCloud.e eVar, String str) {
                super(0);
                this.f39643a = eVar;
                this.f39644b = str;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Token - conversion SUCCESS from SECRET xx");
                sb2.append(t.y1(this.f39643a.a(), 4));
                sb2.append(" -> TOKEN xx");
                String it = this.f39644b;
                AbstractC6492s.h(it, "it");
                sb2.append(t.y1(it, 4));
                return sb2.toString();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(TeleportCloud.e eVar) {
            super(1);
            this.f39642a = eVar;
        }

        public final void a(String str) {
            N7.a.b(new a(this.f39642a, str));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((String) obj);
            return J.f24997a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final native String bridgeConvertSecretToToken(String secret);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(InterfaceC6835l tmp0, Object obj) {
        AbstractC6492s.i(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // M7.b
    public z a(TeleportCloud.e secret) {
        AbstractC6492s.i(secret, "secret");
        AbstractC5912b abstractC5912bA = N7.b.f15414a.a();
        z zVarI = z.i(new a(secret));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        z zVarK = abstractC5912bA.k(zVarI);
        final b bVar = new b(secret);
        z zVarO = zVarK.o(new InterfaceC6469f() { // from class: M7.a
            @Override // kg.InterfaceC6469f
            public final void accept(Object obj) {
                GoTokenSecurity.d(bVar, obj);
            }
        });
        AbstractC6492s.h(zVarO, "secret: TeleportCloud.To… xx${it.takeLast(4)}\" } }");
        return zVarO;
    }
}
