package com.ui.sso.api.provider;

import Vi.k;
import Vi.n;
import Yg.m;
import Yg.q;
import Zi.C0;
import Zi.C3710i;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W;
import Zi.W0;
import android.os.Bundle;
import com.ui.sso.api.provider.UiAccountProviderMessageSerializer;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import kotlinx.serialization.UnknownFieldException;
import mh.InterfaceC6824a;
import org.snmp4j.util.SnmpConfigurator;

@n
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00112\u00020\u0001:\u0007\u0012\u000f\u0013\u0014\u0015\u0016\u0017B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fHÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0005\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/ui/sso/api/provider/e;", "", "<init>", "()V", "", "seen1", "LZi/R0;", "serializationConstructorMarker", "(ILZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_BIND_ADDRESS, "(Lcom/ui/sso/api/provider/e;LYi/d;LXi/f;)V", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, "d", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "f", "g", "h", "Lcom/ui/sso/api/provider/e$a;", "Lcom/ui/sso/api/provider/e$b;", "Lcom/ui/sso/api/provider/e$e;", "Lcom/ui/sso/api/provider/e$g;", "Lcom/ui/sso/api/provider/e$h;", "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private static final m f42123a = Yg.n.a(q.PUBLICATION, c.f42128a);

    @n
    @Vi.m("com.ui.sso.api.UiAccountApiResponse.Action")
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/ui/sso/api/provider/e$a;", "Lcom/ui/sso/api/provider/e;", "", "success", "<init>", "(Z)V", "", "seen1", "LZi/R0;", "serializationConstructorMarker", "(IZLZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "d", "(Lcom/ui/sso/api/provider/e$a;LYi/d;LXi/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Z", SnmpConfigurator.O_COMMUNITY, "()Z", "getSuccess$annotations", "()V", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ui.sso.api.provider.e$a, reason: from toString */
    public static final /* data */ class Action extends e {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean success;

        /* renamed from: com.ui.sso.api.provider.e$a$a, reason: collision with other inner class name */
        public static final class C1367a implements M {

            /* renamed from: a, reason: collision with root package name */
            public static final C1367a f42125a;
            private static final /* synthetic */ H0 descriptor;

            static {
                C1367a c1367a = new C1367a();
                f42125a = c1367a;
                H0 h02 = new H0("com.ui.sso.api.UiAccountApiResponse.Action", c1367a, 1);
                h02.p("success", false);
                descriptor = h02;
            }

            private C1367a() {
            }

            @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
            public Xi.f a() {
                return descriptor;
            }

            @Override // Zi.M
            public Vi.b[] b() {
                return M.a.a(this);
            }

            @Override // Zi.M
            public Vi.b[] d() {
                return new Vi.b[]{C3710i.f25639a};
            }

            @Override // Vi.InterfaceC3627a
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public Action c(Yi.e decoder) {
                boolean zU;
                AbstractC6492s.i(decoder, "decoder");
                Xi.f fVarA = a();
                Yi.c cVarC = decoder.c(fVarA);
                int i10 = 1;
                if (cVarC.B()) {
                    zU = cVarC.u(fVarA, 0);
                } else {
                    boolean z10 = true;
                    zU = false;
                    int i11 = 0;
                    while (z10) {
                        int iK = cVarC.k(fVarA);
                        if (iK == -1) {
                            z10 = false;
                        } else {
                            if (iK != 0) {
                                throw new UnknownFieldException(iK);
                            }
                            zU = cVarC.u(fVarA, 0);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarC.b(fVarA);
                return new Action(i10, zU, null);
            }

            @Override // Vi.o
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public void e(Yi.f encoder, Action value) {
                AbstractC6492s.i(encoder, "encoder");
                AbstractC6492s.i(value, "value");
                Xi.f fVarA = a();
                Yi.d dVarC = encoder.c(fVarA);
                Action.d(value, dVarC, fVarA);
                dVarC.b(fVarA);
            }
        }

        /* renamed from: com.ui.sso.api.provider.e$a$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Vi.b serializer() {
                return C1367a.f42125a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Action(int i10, boolean z10, R0 r02) {
            super(i10, r02);
            if (1 != (i10 & 1)) {
                C0.a(i10, 1, C1367a.f42125a.a());
            }
            this.success = z10;
        }

        public static final /* synthetic */ void d(Action self, Yi.d output, Xi.f serialDesc) {
            e.b(self, output, serialDesc);
            output.i(serialDesc, 0, self.success);
        }

        /* renamed from: c, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Action) && this.success == ((Action) other).success;
        }

        public int hashCode() {
            boolean z10 = this.success;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "Action(success=" + this.success + ")";
        }

        public Action(boolean z10) {
            super(null);
            this.success = z10;
        }
    }

    @n
    @Vi.m("com.ui.sso.api.UiAccountApiResponse.Auth")
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"\u001cB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0014¨\u0006#"}, d2 = {"Lcom/ui/sso/api/provider/e$b;", "Lcom/ui/sso/api/provider/e;", "", "serializedAuth", "<init>", "(Ljava/lang/String;)V", "", "seen1", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "d", "(Lcom/ui/sso/api/provider/e$b;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", SnmpConfigurator.O_COMMUNITY, "getSerializedAuth$annotations", "()V", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ui.sso.api.provider.e$b, reason: from toString */
    public static final /* data */ class Auth extends e {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String serializedAuth;

        /* renamed from: com.ui.sso.api.provider.e$b$a */
        public static final class a implements M {

            /* renamed from: a, reason: collision with root package name */
            public static final a f42127a;
            private static final /* synthetic */ H0 descriptor;

            static {
                a aVar = new a();
                f42127a = aVar;
                H0 h02 = new H0("com.ui.sso.api.UiAccountApiResponse.Auth", aVar, 1);
                h02.p("ubic", false);
                descriptor = h02;
            }

            private a() {
            }

            @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
            public Xi.f a() {
                return descriptor;
            }

            @Override // Zi.M
            public Vi.b[] b() {
                return M.a.a(this);
            }

            @Override // Zi.M
            public Vi.b[] d() {
                return new Vi.b[]{Wi.a.u(W0.f25599a)};
            }

            @Override // Vi.InterfaceC3627a
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public Auth c(Yi.e decoder) {
                String str;
                AbstractC6492s.i(decoder, "decoder");
                Xi.f fVarA = a();
                Yi.c cVarC = decoder.c(fVarA);
                int i10 = 1;
                R0 r02 = null;
                if (cVarC.B()) {
                    str = (String) cVarC.h(fVarA, 0, W0.f25599a, null);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    str = null;
                    while (z10) {
                        int iK = cVarC.k(fVarA);
                        if (iK == -1) {
                            z10 = false;
                        } else {
                            if (iK != 0) {
                                throw new UnknownFieldException(iK);
                            }
                            str = (String) cVarC.h(fVarA, 0, W0.f25599a, str);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarC.b(fVarA);
                return new Auth(i10, str, r02);
            }

            @Override // Vi.o
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public void e(Yi.f encoder, Auth value) {
                AbstractC6492s.i(encoder, "encoder");
                AbstractC6492s.i(value, "value");
                Xi.f fVarA = a();
                Yi.d dVarC = encoder.c(fVarA);
                Auth.d(value, dVarC, fVarA);
                dVarC.b(fVarA);
            }
        }

        /* renamed from: com.ui.sso.api.provider.e$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Vi.b serializer() {
                return a.f42127a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Auth(int i10, String str, R0 r02) {
            super(i10, r02);
            if (1 != (i10 & 1)) {
                C0.a(i10, 1, a.f42127a.a());
            }
            this.serializedAuth = str;
        }

        public static final /* synthetic */ void d(Auth self, Yi.d output, Xi.f serialDesc) {
            e.b(self, output, serialDesc);
            output.t(serialDesc, 0, W0.f25599a, self.serializedAuth);
        }

        /* renamed from: c, reason: from getter */
        public final String getSerializedAuth() {
            return this.serializedAuth;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Auth) && AbstractC6492s.d(this.serializedAuth, ((Auth) other).serializedAuth);
        }

        public int hashCode() {
            String str = this.serializedAuth;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Auth(serializedAuth=" + this.serializedAuth + ")";
        }

        public Auth(String str) {
            super(null);
            this.serializedAuth = str;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f42128a = new c();

        c() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Vi.b invoke() {
            return new k("com.ui.sso.api.provider.UiAccountProviderResponse", O.b(e.class), new th.d[]{O.b(Action.class), O.b(Auth.class), O.b(DeviceIdentifiers.class), O.b(StateV1.class), O.b(StateV2.class)}, new Vi.b[]{Action.C1367a.f42125a, Auth.a.f42127a, DeviceIdentifiers.a.f42132a, StateV1.a.f42140a, StateV2.a.f42147a}, new Annotation[0]);
        }
    }

    /* renamed from: com.ui.sso.api.provider.e$d, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ Vi.b a() {
            return (Vi.b) e.f42123a.getValue();
        }

        public final Vi.b serializer() {
            return a();
        }

        private Companion() {
        }
    }

    @n
    @Vi.m("com.ui.sso.api.UiAccountApiResponse.DeviceIdentifiers")
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002(\u001eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B?\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u001f\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010\u0016R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u001f\u0012\u0004\b&\u0010\"\u001a\u0004\b%\u0010\u0016¨\u0006)"}, d2 = {"Lcom/ui/sso/api/provider/e$e;", "Lcom/ui/sso/api/provider/e;", "", "id", "name", "model", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "f", "(Lcom/ui/sso/api/provider/e$e;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", SnmpConfigurator.O_COMMUNITY, "getId$annotations", "()V", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "getName$annotations", "d", "getModel$annotations", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ui.sso.api.provider.e$e, reason: collision with other inner class name and from toString */
    public static final /* data */ class DeviceIdentifiers extends e {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String model;

        /* renamed from: com.ui.sso.api.provider.e$e$a */
        public static final class a implements M {

            /* renamed from: a, reason: collision with root package name */
            public static final a f42132a;
            private static final /* synthetic */ H0 descriptor;

            static {
                a aVar = new a();
                f42132a = aVar;
                H0 h02 = new H0("com.ui.sso.api.UiAccountApiResponse.DeviceIdentifiers", aVar, 3);
                h02.p("id", false);
                h02.p("name", false);
                h02.p("model", false);
                descriptor = h02;
            }

            private a() {
            }

            @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
            public Xi.f a() {
                return descriptor;
            }

            @Override // Zi.M
            public Vi.b[] b() {
                return M.a.a(this);
            }

            @Override // Zi.M
            public Vi.b[] d() {
                W0 w02 = W0.f25599a;
                return new Vi.b[]{w02, w02, w02};
            }

            @Override // Vi.InterfaceC3627a
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public DeviceIdentifiers c(Yi.e decoder) {
                String str;
                String strW;
                String str2;
                int i10;
                AbstractC6492s.i(decoder, "decoder");
                Xi.f fVarA = a();
                Yi.c cVarC = decoder.c(fVarA);
                if (cVarC.B()) {
                    String strW2 = cVarC.w(fVarA, 0);
                    String strW3 = cVarC.w(fVarA, 1);
                    str = strW2;
                    strW = cVarC.w(fVarA, 2);
                    str2 = strW3;
                    i10 = 7;
                } else {
                    String strW4 = null;
                    String strW5 = null;
                    String strW6 = null;
                    boolean z10 = true;
                    int i11 = 0;
                    while (z10) {
                        int iK = cVarC.k(fVarA);
                        if (iK == -1) {
                            z10 = false;
                        } else if (iK == 0) {
                            strW4 = cVarC.w(fVarA, 0);
                            i11 |= 1;
                        } else if (iK == 1) {
                            strW6 = cVarC.w(fVarA, 1);
                            i11 |= 2;
                        } else {
                            if (iK != 2) {
                                throw new UnknownFieldException(iK);
                            }
                            strW5 = cVarC.w(fVarA, 2);
                            i11 |= 4;
                        }
                    }
                    str = strW4;
                    strW = strW5;
                    str2 = strW6;
                    i10 = i11;
                }
                cVarC.b(fVarA);
                return new DeviceIdentifiers(i10, str, str2, strW, null);
            }

            @Override // Vi.o
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public void e(Yi.f encoder, DeviceIdentifiers value) {
                AbstractC6492s.i(encoder, "encoder");
                AbstractC6492s.i(value, "value");
                Xi.f fVarA = a();
                Yi.d dVarC = encoder.c(fVarA);
                DeviceIdentifiers.f(value, dVarC, fVarA);
                dVarC.b(fVarA);
            }
        }

        /* renamed from: com.ui.sso.api.provider.e$e$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Vi.b serializer() {
                return a.f42132a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DeviceIdentifiers(int i10, String str, String str2, String str3, R0 r02) {
            super(i10, r02);
            if (7 != (i10 & 7)) {
                C0.a(i10, 7, a.f42132a.a());
            }
            this.id = str;
            this.name = str2;
            this.model = str3;
        }

        public static final /* synthetic */ void f(DeviceIdentifiers self, Yi.d output, Xi.f serialDesc) {
            e.b(self, output, serialDesc);
            output.y(serialDesc, 0, self.id);
            output.y(serialDesc, 1, self.name);
            output.y(serialDesc, 2, self.model);
        }

        /* renamed from: c, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: d, reason: from getter */
        public final String getModel() {
            return this.model;
        }

        /* renamed from: e, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeviceIdentifiers)) {
                return false;
            }
            DeviceIdentifiers deviceIdentifiers = (DeviceIdentifiers) other;
            return AbstractC6492s.d(this.id, deviceIdentifiers.id) && AbstractC6492s.d(this.name, deviceIdentifiers.name) && AbstractC6492s.d(this.model, deviceIdentifiers.model);
        }

        public int hashCode() {
            return (((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.model.hashCode();
        }

        public String toString() {
            return "DeviceIdentifiers(id=" + this.id + ", name=" + this.name + ", model=" + this.model + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeviceIdentifiers(String id2, String name, String model) {
            super(null);
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(model, "model");
            this.id = id2;
            this.name = name;
            this.model = model;
        }
    }

    public static final class f implements UiAccountProviderMessageSerializer {

        /* renamed from: b, reason: collision with root package name */
        public static final a f42133b = new a(null);

        /* renamed from: a, reason: collision with root package name */
        private final UiAccountProviderMessageSerializer.a f42134a = new UiAccountProviderMessageSerializer.a(O.l(e.class));

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f42135a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(0);
                this.f42135a = str;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Response to deserialized: " + this.f42135a;
            }
        }

        private final StateV1 c(StateV2 stateV2) {
            return new StateV1(stateV2.getVersion(), stateV2.getAccountType(), stateV2.getAppPackage(), stateV2.getIsAndroidAccountManagerAccountOwner());
        }

        private final StateV2 d(StateV1 stateV1) {
            return new StateV2(stateV1.getVersion(), stateV1.getAccountType(), stateV1.getIsAccountOwner(), stateV1.getAppPackage(), false, false);
        }

        @Override // com.ui.sso.api.provider.UiAccountProviderMessageSerializer
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public e b(Bundle bundle) throws UiAccountProviderMessageSerializer.SerializationError {
            e eVar;
            AbstractC6492s.i(bundle, "bundle");
            String string = bundle.getString("response");
            if (string == null) {
                throw new UiAccountProviderMessageSerializer.SerializationError("Key response not found in response bundle", null, 2, null);
            }
            Ua.a.e(new b(string));
            e eVarD = (e) this.f42134a.a(string);
            if (eVarD instanceof StateV1) {
                String string2 = bundle.getString("responseV2");
                eVarD = (string2 == null || (eVar = (e) this.f42134a.a(string2)) == null) ? d((StateV1) eVarD) : eVar;
            }
            if (eVarD == null) {
                eVarD = null;
            }
            if (eVarD != null) {
                return eVarD;
            }
            throw new UiAccountProviderMessageSerializer.SerializationError("Received response of unexpected type", null, 2, null);
        }

        public final Bundle f() {
            return new Bundle();
        }

        @Override // com.ui.sso.api.provider.UiAccountProviderMessageSerializer
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Bundle a(e message) {
            AbstractC6492s.i(message, "message");
            Bundle bundleF = f();
            if (message instanceof StateV2) {
                bundleF.putString("responseV2", this.f42134a.b(message));
                UiAccountProviderMessageSerializer.a aVar = this.f42134a;
                StateV1 stateV1C = c((StateV2) message);
                AbstractC6492s.g(stateV1C, "null cannot be cast to non-null type com.ui.sso.api.provider.UiAccountProviderResponse");
                bundleF.putString("response", aVar.b(stateV1C));
            } else {
                bundleF.putString("response", this.f42134a.b(message));
            }
            return bundleF;
        }
    }

    @n
    @Vi.m("com.ui.sso.api.UiAccountApiResponse.State")
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.\u001fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBG\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b&\u0010#\u001a\u0004\b$\u0010\u0018R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010%\u0012\u0004\b(\u0010#\u001a\u0004\b'\u0010\u0018R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010)\u0012\u0004\b,\u0010#\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/ui/sso/api/provider/e$g;", "Lcom/ui/sso/api/provider/e;", "", "version", "", "accountType", "appPackage", "", "isAccountOwner", "<init>", "(ILjava/lang/String;Ljava/lang/String;Z)V", "seen1", "LZi/R0;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;ZLZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "g", "(Lcom/ui/sso/api/provider/e$g;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "I", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "getVersion$annotations", "()V", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", "getAccountType$annotations", "d", "getAppPackage$annotations", "Z", "f", "()Z", "isAccountOwner$annotations", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ui.sso.api.provider.e$g, reason: from toString */
    public static final /* data */ class StateV1 extends e {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int version;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String accountType;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String appPackage;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isAccountOwner;

        /* renamed from: com.ui.sso.api.provider.e$g$a */
        public static final class a implements M {

            /* renamed from: a, reason: collision with root package name */
            public static final a f42140a;
            private static final /* synthetic */ H0 descriptor;

            static {
                a aVar = new a();
                f42140a = aVar;
                H0 h02 = new H0("com.ui.sso.api.UiAccountApiResponse.State", aVar, 4);
                h02.p("version", false);
                h02.p("state_type", false);
                h02.p("appPackage", false);
                h02.p("isAccountOwner", false);
                descriptor = h02;
            }

            private a() {
            }

            @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
            public Xi.f a() {
                return descriptor;
            }

            @Override // Zi.M
            public Vi.b[] b() {
                return M.a.a(this);
            }

            @Override // Zi.M
            public Vi.b[] d() {
                W0 w02 = W0.f25599a;
                return new Vi.b[]{W.f25597a, w02, w02, C3710i.f25639a};
            }

            @Override // Vi.InterfaceC3627a
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public StateV1 c(Yi.e decoder) {
                int i10;
                boolean zU;
                String str;
                String str2;
                int i11;
                AbstractC6492s.i(decoder, "decoder");
                Xi.f fVarA = a();
                Yi.c cVarC = decoder.c(fVarA);
                if (cVarC.B()) {
                    int i12 = cVarC.i(fVarA, 0);
                    String strW = cVarC.w(fVarA, 1);
                    String strW2 = cVarC.w(fVarA, 2);
                    i10 = i12;
                    zU = cVarC.u(fVarA, 3);
                    str = strW2;
                    str2 = strW;
                    i11 = 15;
                } else {
                    String strW3 = null;
                    String strW4 = null;
                    boolean z10 = true;
                    int i13 = 0;
                    boolean zU2 = false;
                    int i14 = 0;
                    while (z10) {
                        int iK = cVarC.k(fVarA);
                        if (iK == -1) {
                            z10 = false;
                        } else if (iK == 0) {
                            i13 = cVarC.i(fVarA, 0);
                            i14 |= 1;
                        } else if (iK == 1) {
                            strW4 = cVarC.w(fVarA, 1);
                            i14 |= 2;
                        } else if (iK == 2) {
                            strW3 = cVarC.w(fVarA, 2);
                            i14 |= 4;
                        } else {
                            if (iK != 3) {
                                throw new UnknownFieldException(iK);
                            }
                            zU2 = cVarC.u(fVarA, 3);
                            i14 |= 8;
                        }
                    }
                    i10 = i13;
                    zU = zU2;
                    str = strW3;
                    str2 = strW4;
                    i11 = i14;
                }
                cVarC.b(fVarA);
                return new StateV1(i11, i10, str2, str, zU, null);
            }

            @Override // Vi.o
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public void e(Yi.f encoder, StateV1 value) {
                AbstractC6492s.i(encoder, "encoder");
                AbstractC6492s.i(value, "value");
                Xi.f fVarA = a();
                Yi.d dVarC = encoder.c(fVarA);
                StateV1.g(value, dVarC, fVarA);
                dVarC.b(fVarA);
            }
        }

        /* renamed from: com.ui.sso.api.provider.e$g$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Vi.b serializer() {
                return a.f42140a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ StateV1(int i10, int i11, String str, String str2, boolean z10, R0 r02) {
            super(i10, r02);
            if (15 != (i10 & 15)) {
                C0.a(i10, 15, a.f42140a.a());
            }
            this.version = i11;
            this.accountType = str;
            this.appPackage = str2;
            this.isAccountOwner = z10;
        }

        public static final /* synthetic */ void g(StateV1 self, Yi.d output, Xi.f serialDesc) {
            e.b(self, output, serialDesc);
            output.C(serialDesc, 0, self.version);
            output.y(serialDesc, 1, self.accountType);
            output.y(serialDesc, 2, self.appPackage);
            output.i(serialDesc, 3, self.isAccountOwner);
        }

        /* renamed from: c, reason: from getter */
        public final String getAccountType() {
            return this.accountType;
        }

        /* renamed from: d, reason: from getter */
        public final String getAppPackage() {
            return this.appPackage;
        }

        /* renamed from: e, reason: from getter */
        public final int getVersion() {
            return this.version;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StateV1)) {
                return false;
            }
            StateV1 stateV1 = (StateV1) other;
            return this.version == stateV1.version && AbstractC6492s.d(this.accountType, stateV1.accountType) && AbstractC6492s.d(this.appPackage, stateV1.appPackage) && this.isAccountOwner == stateV1.isAccountOwner;
        }

        /* renamed from: f, reason: from getter */
        public final boolean getIsAccountOwner() {
            return this.isAccountOwner;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iHashCode = ((((Integer.hashCode(this.version) * 31) + this.accountType.hashCode()) * 31) + this.appPackage.hashCode()) * 31;
            boolean z10 = this.isAccountOwner;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return iHashCode + i10;
        }

        public String toString() {
            return "StateV1(version=" + this.version + ", accountType=" + this.accountType + ", appPackage=" + this.appPackage + ", isAccountOwner=" + this.isAccountOwner + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateV1(int i10, String accountType, String appPackage, boolean z10) {
            super(null);
            AbstractC6492s.i(accountType, "accountType");
            AbstractC6492s.i(appPackage, "appPackage");
            this.version = i10;
            this.accountType = accountType;
            this.appPackage = appPackage;
            this.isAccountOwner = z10;
        }
    }

    @n
    @Vi.m("com.ui.sso.api.UiAccountApiResponse.StateV2")
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u0000 32\u00020\u0001:\u00024!B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fB[\b\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\t\u001a\u00020\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÇ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b(\u0010%\u001a\u0004\b&\u0010\u001aR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010%\u001a\u0004\b+\u0010,R \u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010'\u0012\u0004\b.\u0010%\u001a\u0004\b)\u0010\u001aR \u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010*\u0012\u0004\b0\u0010%\u001a\u0004\b/\u0010,R \u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010*\u0012\u0004\b2\u0010%\u001a\u0004\b1\u0010,¨\u00065"}, d2 = {"Lcom/ui/sso/api/provider/e$h;", "Lcom/ui/sso/api/provider/e;", "", "version", "", "accountType", "", "isAndroidAccountManagerAccountOwner", "appPackage", "isAndroidStorageOwner", "isLocalStorageOwner", "<init>", "(ILjava/lang/String;ZLjava/lang/String;ZZ)V", "seen1", "LZi/R0;", "serializationConstructorMarker", "(IILjava/lang/String;ZLjava/lang/String;ZZLZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "i", "(Lcom/ui/sso/api/provider/e$h;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "I", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "getVersion$annotations", "()V", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", "getAccountType$annotations", "d", "Z", "f", "()Z", "isAndroidAccountManagerAccountOwner$annotations", "getAppPackage$annotations", "g", "isAndroidStorageOwner$annotations", "h", "isLocalStorageOwner$annotations", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ui.sso.api.provider.e$h, reason: from toString */
    public static final /* data */ class StateV2 extends e {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int version;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String accountType;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isAndroidAccountManagerAccountOwner;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String appPackage;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isAndroidStorageOwner;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLocalStorageOwner;

        /* renamed from: com.ui.sso.api.provider.e$h$a */
        public static final class a implements M {

            /* renamed from: a, reason: collision with root package name */
            public static final a f42147a;
            private static final /* synthetic */ H0 descriptor;

            static {
                a aVar = new a();
                f42147a = aVar;
                H0 h02 = new H0("com.ui.sso.api.UiAccountApiResponse.StateV2", aVar, 6);
                h02.p("version", false);
                h02.p("accountType", false);
                h02.p("isAccountOwner", false);
                h02.p("appPackage", false);
                h02.p("isAndroidStorageOwner", false);
                h02.p("isLocalStorageOwner", false);
                descriptor = h02;
            }

            private a() {
            }

            @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
            public Xi.f a() {
                return descriptor;
            }

            @Override // Zi.M
            public Vi.b[] b() {
                return M.a.a(this);
            }

            @Override // Zi.M
            public Vi.b[] d() {
                W0 w02 = W0.f25599a;
                C3710i c3710i = C3710i.f25639a;
                return new Vi.b[]{W.f25597a, w02, c3710i, w02, c3710i, c3710i};
            }

            @Override // Vi.InterfaceC3627a
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public StateV2 c(Yi.e decoder) {
                int i10;
                boolean zU;
                String str;
                boolean z10;
                boolean z11;
                String str2;
                int i11;
                AbstractC6492s.i(decoder, "decoder");
                Xi.f fVarA = a();
                Yi.c cVarC = decoder.c(fVarA);
                if (cVarC.B()) {
                    int i12 = cVarC.i(fVarA, 0);
                    String strW = cVarC.w(fVarA, 1);
                    boolean zU2 = cVarC.u(fVarA, 2);
                    String strW2 = cVarC.w(fVarA, 3);
                    boolean zU3 = cVarC.u(fVarA, 4);
                    i10 = i12;
                    zU = cVarC.u(fVarA, 5);
                    str = strW2;
                    z10 = zU3;
                    z11 = zU2;
                    str2 = strW;
                    i11 = 63;
                } else {
                    String strW3 = null;
                    String strW4 = null;
                    boolean z12 = true;
                    int i13 = 0;
                    boolean zU4 = false;
                    boolean zU5 = false;
                    boolean zU6 = false;
                    int i14 = 0;
                    while (z12) {
                        int iK = cVarC.k(fVarA);
                        switch (iK) {
                            case -1:
                                z12 = false;
                                continue;
                            case 0:
                                i13 = cVarC.i(fVarA, 0);
                                i14 |= 1;
                                continue;
                            case 1:
                                strW4 = cVarC.w(fVarA, 1);
                                i14 |= 2;
                                break;
                            case 2:
                                zU6 = cVarC.u(fVarA, 2);
                                i14 |= 4;
                                break;
                            case 3:
                                strW3 = cVarC.w(fVarA, 3);
                                i14 |= 8;
                                break;
                            case 4:
                                zU5 = cVarC.u(fVarA, 4);
                                i14 |= 16;
                                break;
                            case 5:
                                zU4 = cVarC.u(fVarA, 5);
                                i14 |= 32;
                                break;
                            default:
                                throw new UnknownFieldException(iK);
                        }
                    }
                    i10 = i13;
                    zU = zU4;
                    str = strW3;
                    z10 = zU5;
                    z11 = zU6;
                    str2 = strW4;
                    i11 = i14;
                }
                cVarC.b(fVarA);
                return new StateV2(i11, i10, str2, z11, str, z10, zU, null);
            }

            @Override // Vi.o
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public void e(Yi.f encoder, StateV2 value) {
                AbstractC6492s.i(encoder, "encoder");
                AbstractC6492s.i(value, "value");
                Xi.f fVarA = a();
                Yi.d dVarC = encoder.c(fVarA);
                StateV2.i(value, dVarC, fVarA);
                dVarC.b(fVarA);
            }
        }

        /* renamed from: com.ui.sso.api.provider.e$h$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Vi.b serializer() {
                return a.f42147a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ StateV2(int i10, int i11, String str, boolean z10, String str2, boolean z11, boolean z12, R0 r02) {
            super(i10, r02);
            if (63 != (i10 & 63)) {
                C0.a(i10, 63, a.f42147a.a());
            }
            this.version = i11;
            this.accountType = str;
            this.isAndroidAccountManagerAccountOwner = z10;
            this.appPackage = str2;
            this.isAndroidStorageOwner = z11;
            this.isLocalStorageOwner = z12;
        }

        public static final /* synthetic */ void i(StateV2 self, Yi.d output, Xi.f serialDesc) {
            e.b(self, output, serialDesc);
            output.C(serialDesc, 0, self.version);
            output.y(serialDesc, 1, self.accountType);
            output.i(serialDesc, 2, self.isAndroidAccountManagerAccountOwner);
            output.y(serialDesc, 3, self.appPackage);
            output.i(serialDesc, 4, self.isAndroidStorageOwner);
            output.i(serialDesc, 5, self.isLocalStorageOwner);
        }

        /* renamed from: c, reason: from getter */
        public final String getAccountType() {
            return this.accountType;
        }

        /* renamed from: d, reason: from getter */
        public final String getAppPackage() {
            return this.appPackage;
        }

        /* renamed from: e, reason: from getter */
        public final int getVersion() {
            return this.version;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StateV2)) {
                return false;
            }
            StateV2 stateV2 = (StateV2) other;
            return this.version == stateV2.version && AbstractC6492s.d(this.accountType, stateV2.accountType) && this.isAndroidAccountManagerAccountOwner == stateV2.isAndroidAccountManagerAccountOwner && AbstractC6492s.d(this.appPackage, stateV2.appPackage) && this.isAndroidStorageOwner == stateV2.isAndroidStorageOwner && this.isLocalStorageOwner == stateV2.isLocalStorageOwner;
        }

        /* renamed from: f, reason: from getter */
        public final boolean getIsAndroidAccountManagerAccountOwner() {
            return this.isAndroidAccountManagerAccountOwner;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getIsAndroidStorageOwner() {
            return this.isAndroidStorageOwner;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getIsLocalStorageOwner() {
            return this.isLocalStorageOwner;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.version) * 31) + this.accountType.hashCode()) * 31;
            boolean z10 = this.isAndroidAccountManagerAccountOwner;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            int iHashCode2 = (((iHashCode + i10) * 31) + this.appPackage.hashCode()) * 31;
            boolean z11 = this.isAndroidStorageOwner;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            int i12 = (iHashCode2 + i11) * 31;
            boolean z12 = this.isLocalStorageOwner;
            return i12 + (z12 ? 1 : z12 ? 1 : 0);
        }

        public String toString() {
            return "StateV2(version=" + this.version + ", accountType=" + this.accountType + ", isAndroidAccountManagerAccountOwner=" + this.isAndroidAccountManagerAccountOwner + ", appPackage=" + this.appPackage + ", isAndroidStorageOwner=" + this.isAndroidStorageOwner + ", isLocalStorageOwner=" + this.isLocalStorageOwner + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateV2(int i10, String accountType, boolean z10, String appPackage, boolean z11, boolean z12) {
            super(null);
            AbstractC6492s.i(accountType, "accountType");
            AbstractC6492s.i(appPackage, "appPackage");
            this.version = i10;
            this.accountType = accountType;
            this.isAndroidAccountManagerAccountOwner = z10;
            this.appPackage = appPackage;
            this.isAndroidStorageOwner = z11;
            this.isLocalStorageOwner = z12;
        }
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ void b(e self, Yi.d output, Xi.f serialDesc) {
    }

    private e() {
    }

    public /* synthetic */ e(int i10, R0 r02) {
    }
}
