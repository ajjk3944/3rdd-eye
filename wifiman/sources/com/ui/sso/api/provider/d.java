package com.ui.sso.api.provider;

import Vi.k;
import Vi.n;
import Yg.m;
import Yg.q;
import Zi.C0;
import Zi.H0;
import Zi.M;
import Zi.R0;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00112\u00020\u0001:\u0007\u0012\u000f\u0013\u0014\u0015\u0016\u0017B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fHÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0005\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lcom/ui/sso/api/provider/d;", "", "<init>", "()V", "", "seen1", "LZi/R0;", "serializationConstructorMarker", "(ILZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_BIND_ADDRESS, "(Lcom/ui/sso/api/provider/d;LYi/d;LXi/f;)V", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, SnmpConfigurator.O_COMMUNITY, "d", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "g", "h", "Lcom/ui/sso/api/provider/d$a;", "Lcom/ui/sso/api/provider/d$b;", "Lcom/ui/sso/api/provider/d$c;", "Lcom/ui/sso/api/provider/d$d;", "Lcom/ui/sso/api/provider/d$e;", "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private static final m f42100a = Yg.n.a(q.PUBLICATION, f.f42118a);

    @n
    @Vi.m("com.ui.sso.api.UiAccountApiRequest.AccountDelete")
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0014¨\u0006#"}, d2 = {"Lcom/ui/sso/api/provider/d$a;", "Lcom/ui/sso/api/provider/d;", "", "accountId", "<init>", "(Ljava/lang/String;)V", "", "seen1", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "d", "(Lcom/ui/sso/api/provider/d$a;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", SnmpConfigurator.O_COMMUNITY, "getAccountId$annotations", "()V", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ui.sso.api.provider.d$a, reason: from toString */
    public static final /* data */ class AccountDelete extends d {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String accountId;

        /* renamed from: com.ui.sso.api.provider.d$a$a, reason: collision with other inner class name */
        public static final class C1364a implements M {

            /* renamed from: a, reason: collision with root package name */
            public static final C1364a f42102a;
            private static final /* synthetic */ H0 descriptor;

            static {
                C1364a c1364a = new C1364a();
                f42102a = c1364a;
                H0 h02 = new H0("com.ui.sso.api.UiAccountApiRequest.AccountDelete", c1364a, 1);
                h02.p("accountId", false);
                descriptor = h02;
            }

            private C1364a() {
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
                return new Vi.b[]{W0.f25599a};
            }

            @Override // Vi.InterfaceC3627a
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public AccountDelete c(Yi.e decoder) {
                String strW;
                AbstractC6492s.i(decoder, "decoder");
                Xi.f fVarA = a();
                Yi.c cVarC = decoder.c(fVarA);
                int i10 = 1;
                R0 r02 = null;
                if (cVarC.B()) {
                    strW = cVarC.w(fVarA, 0);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    strW = null;
                    while (z10) {
                        int iK = cVarC.k(fVarA);
                        if (iK == -1) {
                            z10 = false;
                        } else {
                            if (iK != 0) {
                                throw new UnknownFieldException(iK);
                            }
                            strW = cVarC.w(fVarA, 0);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarC.b(fVarA);
                return new AccountDelete(i10, strW, r02);
            }

            @Override // Vi.o
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public void e(Yi.f encoder, AccountDelete value) {
                AbstractC6492s.i(encoder, "encoder");
                AbstractC6492s.i(value, "value");
                Xi.f fVarA = a();
                Yi.d dVarC = encoder.c(fVarA);
                AccountDelete.d(value, dVarC, fVarA);
                dVarC.b(fVarA);
            }
        }

        /* renamed from: com.ui.sso.api.provider.d$a$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Vi.b serializer() {
                return C1364a.f42102a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AccountDelete(int i10, String str, R0 r02) {
            super(i10, r02);
            if (1 != (i10 & 1)) {
                C0.a(i10, 1, C1364a.f42102a.a());
            }
            this.accountId = str;
        }

        public static final /* synthetic */ void d(AccountDelete self, Yi.d output, Xi.f serialDesc) {
            d.b(self, output, serialDesc);
            output.y(serialDesc, 0, self.accountId);
        }

        /* renamed from: c, reason: from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AccountDelete) && AbstractC6492s.d(this.accountId, ((AccountDelete) other).accountId);
        }

        public int hashCode() {
            return this.accountId.hashCode();
        }

        public String toString() {
            return "AccountDelete(accountId=" + this.accountId + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AccountDelete(String accountId) {
            super(null);
            AbstractC6492s.i(accountId, "accountId");
            this.accountId = accountId;
        }
    }

    @n
    @Vi.m("com.ui.sso.api.UiAccountApiRequest.AccountUpdate")
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+\u001fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBK\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u0017R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010 \u0012\u0004\b(\u0010#\u001a\u0004\b'\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010 \u0012\u0004\b)\u0010#\u001a\u0004\b&\u0010\u0017¨\u0006,"}, d2 = {"Lcom/ui/sso/api/provider/d$b;", "Lcom/ui/sso/api/provider/d;", "", "accountId", "username", "email", "avatar", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "g", "(Lcom/ui/sso/api/provider/d$b;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", SnmpConfigurator.O_COMMUNITY, "getAccountId$annotations", "()V", "f", "getUsername$annotations", "d", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "getEmail$annotations", "getAvatar$annotations", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ui.sso.api.provider.d$b, reason: from toString */
    public static final /* data */ class AccountUpdate extends d {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String accountId;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String username;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String email;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String avatar;

        /* renamed from: com.ui.sso.api.provider.d$b$a */
        public static final class a implements M {

            /* renamed from: a, reason: collision with root package name */
            public static final a f42107a;
            private static final /* synthetic */ H0 descriptor;

            static {
                a aVar = new a();
                f42107a = aVar;
                H0 h02 = new H0("com.ui.sso.api.UiAccountApiRequest.AccountUpdate", aVar, 4);
                h02.p("accountId", false);
                h02.p("username", false);
                h02.p("email", false);
                h02.p("avatar", false);
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
                return new Vi.b[]{w02, w02, w02, Wi.a.u(w02)};
            }

            @Override // Vi.InterfaceC3627a
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public AccountUpdate c(Yi.e decoder) {
                int i10;
                String str;
                String str2;
                String str3;
                String str4;
                AbstractC6492s.i(decoder, "decoder");
                Xi.f fVarA = a();
                Yi.c cVarC = decoder.c(fVarA);
                String strW = null;
                if (cVarC.B()) {
                    String strW2 = cVarC.w(fVarA, 0);
                    String strW3 = cVarC.w(fVarA, 1);
                    String strW4 = cVarC.w(fVarA, 2);
                    str = strW2;
                    str4 = (String) cVarC.h(fVarA, 3, W0.f25599a, null);
                    str3 = strW4;
                    str2 = strW3;
                    i10 = 15;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    String strW5 = null;
                    String strW6 = null;
                    String str5 = null;
                    while (z10) {
                        int iK = cVarC.k(fVarA);
                        if (iK == -1) {
                            z10 = false;
                        } else if (iK == 0) {
                            strW = cVarC.w(fVarA, 0);
                            i11 |= 1;
                        } else if (iK == 1) {
                            strW5 = cVarC.w(fVarA, 1);
                            i11 |= 2;
                        } else if (iK == 2) {
                            strW6 = cVarC.w(fVarA, 2);
                            i11 |= 4;
                        } else {
                            if (iK != 3) {
                                throw new UnknownFieldException(iK);
                            }
                            str5 = (String) cVarC.h(fVarA, 3, W0.f25599a, str5);
                            i11 |= 8;
                        }
                    }
                    i10 = i11;
                    str = strW;
                    str2 = strW5;
                    str3 = strW6;
                    str4 = str5;
                }
                cVarC.b(fVarA);
                return new AccountUpdate(i10, str, str2, str3, str4, null);
            }

            @Override // Vi.o
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public void e(Yi.f encoder, AccountUpdate value) {
                AbstractC6492s.i(encoder, "encoder");
                AbstractC6492s.i(value, "value");
                Xi.f fVarA = a();
                Yi.d dVarC = encoder.c(fVarA);
                AccountUpdate.g(value, dVarC, fVarA);
                dVarC.b(fVarA);
            }
        }

        /* renamed from: com.ui.sso.api.provider.d$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Vi.b serializer() {
                return a.f42107a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AccountUpdate(int i10, String str, String str2, String str3, String str4, R0 r02) {
            super(i10, r02);
            if (15 != (i10 & 15)) {
                C0.a(i10, 15, a.f42107a.a());
            }
            this.accountId = str;
            this.username = str2;
            this.email = str3;
            this.avatar = str4;
        }

        public static final /* synthetic */ void g(AccountUpdate self, Yi.d output, Xi.f serialDesc) {
            d.b(self, output, serialDesc);
            output.y(serialDesc, 0, self.accountId);
            output.y(serialDesc, 1, self.username);
            output.y(serialDesc, 2, self.email);
            output.t(serialDesc, 3, W0.f25599a, self.avatar);
        }

        /* renamed from: c, reason: from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        /* renamed from: d, reason: from getter */
        public final String getAvatar() {
            return this.avatar;
        }

        /* renamed from: e, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountUpdate)) {
                return false;
            }
            AccountUpdate accountUpdate = (AccountUpdate) other;
            return AbstractC6492s.d(this.accountId, accountUpdate.accountId) && AbstractC6492s.d(this.username, accountUpdate.username) && AbstractC6492s.d(this.email, accountUpdate.email) && AbstractC6492s.d(this.avatar, accountUpdate.avatar);
        }

        /* renamed from: f, reason: from getter */
        public final String getUsername() {
            return this.username;
        }

        public int hashCode() {
            int iHashCode = ((((this.accountId.hashCode() * 31) + this.username.hashCode()) * 31) + this.email.hashCode()) * 31;
            String str = this.avatar;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "AccountUpdate(accountId=" + this.accountId + ", username=" + this.username + ", email=" + this.email + ", avatar=" + this.avatar + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AccountUpdate(String accountId, String username, String email, String str) {
            super(null);
            AbstractC6492s.i(accountId, "accountId");
            AbstractC6492s.i(username, "username");
            AbstractC6492s.i(email, "email");
            this.accountId = accountId;
            this.username = username;
            this.email = email;
            this.avatar = str;
        }
    }

    @n
    @Vi.m("com.ui.sso.api.UiAccountApiRequest.AuthGet")
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0015R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u001e\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Lcom/ui/sso/api/provider/d$c;", "Lcom/ui/sso/api/provider/d;", "", "accountId", "authType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Lcom/ui/sso/api/provider/d$c;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", SnmpConfigurator.O_COMMUNITY, "getAccountId$annotations", "()V", "d", "getAuthType$annotations", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ui.sso.api.provider.d$c, reason: from toString */
    public static final /* data */ class AuthGet extends d {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String accountId;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String authType;

        /* renamed from: com.ui.sso.api.provider.d$c$a */
        public static final class a implements M {

            /* renamed from: a, reason: collision with root package name */
            public static final a f42110a;
            private static final /* synthetic */ H0 descriptor;

            static {
                a aVar = new a();
                f42110a = aVar;
                H0 h02 = new H0("com.ui.sso.api.UiAccountApiRequest.AuthGet", aVar, 2);
                h02.p("accountId", false);
                h02.p("authType", false);
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
                return new Vi.b[]{w02, w02};
            }

            @Override // Vi.InterfaceC3627a
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public AuthGet c(Yi.e decoder) {
                String strW;
                String strW2;
                int i10;
                AbstractC6492s.i(decoder, "decoder");
                Xi.f fVarA = a();
                Yi.c cVarC = decoder.c(fVarA);
                R0 r02 = null;
                if (cVarC.B()) {
                    strW = cVarC.w(fVarA, 0);
                    strW2 = cVarC.w(fVarA, 1);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    strW = null;
                    String strW3 = null;
                    while (z10) {
                        int iK = cVarC.k(fVarA);
                        if (iK == -1) {
                            z10 = false;
                        } else if (iK == 0) {
                            strW = cVarC.w(fVarA, 0);
                            i11 |= 1;
                        } else {
                            if (iK != 1) {
                                throw new UnknownFieldException(iK);
                            }
                            strW3 = cVarC.w(fVarA, 1);
                            i11 |= 2;
                        }
                    }
                    strW2 = strW3;
                    i10 = i11;
                }
                cVarC.b(fVarA);
                return new AuthGet(i10, strW, strW2, r02);
            }

            @Override // Vi.o
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public void e(Yi.f encoder, AuthGet value) {
                AbstractC6492s.i(encoder, "encoder");
                AbstractC6492s.i(value, "value");
                Xi.f fVarA = a();
                Yi.d dVarC = encoder.c(fVarA);
                AuthGet.e(value, dVarC, fVarA);
                dVarC.b(fVarA);
            }
        }

        /* renamed from: com.ui.sso.api.provider.d$c$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Vi.b serializer() {
                return a.f42110a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AuthGet(int i10, String str, String str2, R0 r02) {
            super(i10, r02);
            if (3 != (i10 & 3)) {
                C0.a(i10, 3, a.f42110a.a());
            }
            this.accountId = str;
            this.authType = str2;
        }

        public static final /* synthetic */ void e(AuthGet self, Yi.d output, Xi.f serialDesc) {
            d.b(self, output, serialDesc);
            output.y(serialDesc, 0, self.accountId);
            output.y(serialDesc, 1, self.authType);
        }

        /* renamed from: c, reason: from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        /* renamed from: d, reason: from getter */
        public final String getAuthType() {
            return this.authType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthGet)) {
                return false;
            }
            AuthGet authGet = (AuthGet) other;
            return AbstractC6492s.d(this.accountId, authGet.accountId) && AbstractC6492s.d(this.authType, authGet.authType);
        }

        public int hashCode() {
            return (this.accountId.hashCode() * 31) + this.authType.hashCode();
        }

        public String toString() {
            return "AuthGet(accountId=" + this.accountId + ", authType=" + this.authType + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthGet(String accountId, String authType) {
            super(null);
            AbstractC6492s.i(accountId, "accountId");
            AbstractC6492s.i(authType, "authType");
            this.accountId = accountId;
            this.authType = authType;
        }
    }

    @n
    @Vi.m("com.ui.sso.api.UiAccountApiRequest.AuthTokenInvalidate")
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0015R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u001e\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Lcom/ui/sso/api/provider/d$d;", "Lcom/ui/sso/api/provider/d;", "", "accountId", "authType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Lcom/ui/sso/api/provider/d$d;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", SnmpConfigurator.O_COMMUNITY, "getAccountId$annotations", "()V", "d", "getAuthType$annotations", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ui.sso.api.provider.d$d, reason: collision with other inner class name and from toString */
    public static final /* data */ class AuthTokenInvalidate extends d {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String accountId;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String authType;

        /* renamed from: com.ui.sso.api.provider.d$d$a */
        public static final class a implements M {

            /* renamed from: a, reason: collision with root package name */
            public static final a f42113a;
            private static final /* synthetic */ H0 descriptor;

            static {
                a aVar = new a();
                f42113a = aVar;
                H0 h02 = new H0("com.ui.sso.api.UiAccountApiRequest.AuthTokenInvalidate", aVar, 2);
                h02.p("accountId", false);
                h02.p("authType", false);
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
                return new Vi.b[]{w02, w02};
            }

            @Override // Vi.InterfaceC3627a
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public AuthTokenInvalidate c(Yi.e decoder) {
                String strW;
                String strW2;
                int i10;
                AbstractC6492s.i(decoder, "decoder");
                Xi.f fVarA = a();
                Yi.c cVarC = decoder.c(fVarA);
                R0 r02 = null;
                if (cVarC.B()) {
                    strW = cVarC.w(fVarA, 0);
                    strW2 = cVarC.w(fVarA, 1);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    strW = null;
                    String strW3 = null;
                    while (z10) {
                        int iK = cVarC.k(fVarA);
                        if (iK == -1) {
                            z10 = false;
                        } else if (iK == 0) {
                            strW = cVarC.w(fVarA, 0);
                            i11 |= 1;
                        } else {
                            if (iK != 1) {
                                throw new UnknownFieldException(iK);
                            }
                            strW3 = cVarC.w(fVarA, 1);
                            i11 |= 2;
                        }
                    }
                    strW2 = strW3;
                    i10 = i11;
                }
                cVarC.b(fVarA);
                return new AuthTokenInvalidate(i10, strW, strW2, r02);
            }

            @Override // Vi.o
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public void e(Yi.f encoder, AuthTokenInvalidate value) {
                AbstractC6492s.i(encoder, "encoder");
                AbstractC6492s.i(value, "value");
                Xi.f fVarA = a();
                Yi.d dVarC = encoder.c(fVarA);
                AuthTokenInvalidate.e(value, dVarC, fVarA);
                dVarC.b(fVarA);
            }
        }

        /* renamed from: com.ui.sso.api.provider.d$d$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Vi.b serializer() {
                return a.f42113a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AuthTokenInvalidate(int i10, String str, String str2, R0 r02) {
            super(i10, r02);
            if (3 != (i10 & 3)) {
                C0.a(i10, 3, a.f42113a.a());
            }
            this.accountId = str;
            this.authType = str2;
        }

        public static final /* synthetic */ void e(AuthTokenInvalidate self, Yi.d output, Xi.f serialDesc) {
            d.b(self, output, serialDesc);
            output.y(serialDesc, 0, self.accountId);
            output.y(serialDesc, 1, self.authType);
        }

        /* renamed from: c, reason: from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        /* renamed from: d, reason: from getter */
        public final String getAuthType() {
            return this.authType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthTokenInvalidate)) {
                return false;
            }
            AuthTokenInvalidate authTokenInvalidate = (AuthTokenInvalidate) other;
            return AbstractC6492s.d(this.accountId, authTokenInvalidate.accountId) && AbstractC6492s.d(this.authType, authTokenInvalidate.authType);
        }

        public int hashCode() {
            return (this.accountId.hashCode() * 31) + this.authType.hashCode();
        }

        public String toString() {
            return "AuthTokenInvalidate(accountId=" + this.accountId + ", authType=" + this.authType + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthTokenInvalidate(String accountId, String authType) {
            super(null);
            AbstractC6492s.i(accountId, "accountId");
            AbstractC6492s.i(authType, "authType");
            this.accountId = accountId;
            this.authType = authType;
        }
    }

    @n
    @Vi.m("com.ui.sso.api.UiAccountApiRequest.AuthTokenUpdate")
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002(\u001eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B?\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u001f\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010\u0016R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001f\u0012\u0004\b&\u0010\"\u001a\u0004\b%\u0010\u0016¨\u0006)"}, d2 = {"Lcom/ui/sso/api/provider/d$e;", "Lcom/ui/sso/api/provider/d;", "", "accountId", "authType", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "f", "(Lcom/ui/sso/api/provider/d$e;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", SnmpConfigurator.O_COMMUNITY, "getAccountId$annotations", "()V", "d", "getAuthType$annotations", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "getToken$annotations", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ui.sso.api.provider.d$e, reason: from toString */
    public static final /* data */ class AuthTokenUpdate extends d {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String accountId;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String authType;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String token;

        /* renamed from: com.ui.sso.api.provider.d$e$a */
        public static final class a implements M {

            /* renamed from: a, reason: collision with root package name */
            public static final a f42117a;
            private static final /* synthetic */ H0 descriptor;

            static {
                a aVar = new a();
                f42117a = aVar;
                H0 h02 = new H0("com.ui.sso.api.UiAccountApiRequest.AuthTokenUpdate", aVar, 3);
                h02.p("accountId", false);
                h02.p("authType", false);
                h02.p("token", false);
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
            public AuthTokenUpdate c(Yi.e decoder) {
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
                return new AuthTokenUpdate(i10, str, str2, strW, null);
            }

            @Override // Vi.o
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public void e(Yi.f encoder, AuthTokenUpdate value) {
                AbstractC6492s.i(encoder, "encoder");
                AbstractC6492s.i(value, "value");
                Xi.f fVarA = a();
                Yi.d dVarC = encoder.c(fVarA);
                AuthTokenUpdate.f(value, dVarC, fVarA);
                dVarC.b(fVarA);
            }
        }

        /* renamed from: com.ui.sso.api.provider.d$e$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Vi.b serializer() {
                return a.f42117a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AuthTokenUpdate(int i10, String str, String str2, String str3, R0 r02) {
            super(i10, r02);
            if (7 != (i10 & 7)) {
                C0.a(i10, 7, a.f42117a.a());
            }
            this.accountId = str;
            this.authType = str2;
            this.token = str3;
        }

        public static final /* synthetic */ void f(AuthTokenUpdate self, Yi.d output, Xi.f serialDesc) {
            d.b(self, output, serialDesc);
            output.y(serialDesc, 0, self.accountId);
            output.y(serialDesc, 1, self.authType);
            output.y(serialDesc, 2, self.token);
        }

        /* renamed from: c, reason: from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        /* renamed from: d, reason: from getter */
        public final String getAuthType() {
            return this.authType;
        }

        /* renamed from: e, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthTokenUpdate)) {
                return false;
            }
            AuthTokenUpdate authTokenUpdate = (AuthTokenUpdate) other;
            return AbstractC6492s.d(this.accountId, authTokenUpdate.accountId) && AbstractC6492s.d(this.authType, authTokenUpdate.authType) && AbstractC6492s.d(this.token, authTokenUpdate.token);
        }

        public int hashCode() {
            return (((this.accountId.hashCode() * 31) + this.authType.hashCode()) * 31) + this.token.hashCode();
        }

        public String toString() {
            return "AuthTokenUpdate(accountId=" + this.accountId + ", authType=" + this.authType + ", token=" + this.token + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthTokenUpdate(String accountId, String authType, String token) {
            super(null);
            AbstractC6492s.i(accountId, "accountId");
            AbstractC6492s.i(authType, "authType");
            AbstractC6492s.i(token, "token");
            this.accountId = accountId;
            this.authType = authType;
            this.token = token;
        }
    }

    static final class f extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f42118a = new f();

        f() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Vi.b invoke() {
            return new k("com.ui.sso.api.provider.UiAccountProviderRequest", O.b(d.class), new th.d[]{O.b(AccountDelete.class), O.b(AccountUpdate.class), O.b(AuthGet.class), O.b(AuthTokenInvalidate.class), O.b(AuthTokenUpdate.class)}, new Vi.b[]{AccountDelete.C1364a.f42102a, AccountUpdate.a.f42107a, AuthGet.a.f42110a, AuthTokenInvalidate.a.f42113a, AuthTokenUpdate.a.f42117a}, new Annotation[0]);
        }
    }

    /* renamed from: com.ui.sso.api.provider.d$g, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ Vi.b a() {
            return (Vi.b) d.f42100a.getValue();
        }

        public final Vi.b serializer() {
            return a();
        }

        private Companion() {
        }
    }

    public static final class h implements UiAccountProviderMessageSerializer {

        /* renamed from: b, reason: collision with root package name */
        public static final a f42119b = new a(null);

        /* renamed from: a, reason: collision with root package name */
        private final UiAccountProviderMessageSerializer.a f42120a = new UiAccountProviderMessageSerializer.a(O.l(d.class));

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        static final class b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f42121a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(0);
                this.f42121a = str;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Request to deserialize: " + this.f42121a;
            }
        }

        static final class c extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f42122a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str) {
                super(0);
                this.f42122a = str;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Request serialized: " + this.f42122a;
            }
        }

        @Override // com.ui.sso.api.provider.UiAccountProviderMessageSerializer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d b(Bundle bundle) throws UiAccountProviderMessageSerializer.SerializationError {
            AbstractC6492s.i(bundle, "bundle");
            String string = bundle.getString("params");
            if (string == null) {
                throw new UiAccountProviderMessageSerializer.SerializationError("Key params not found in request bundle", null, 2, null);
            }
            Ua.a.e(new b(string));
            Object objA = this.f42120a.a(string);
            d dVar = objA instanceof d ? (d) objA : null;
            if (dVar != null) {
                return dVar;
            }
            throw new UiAccountProviderMessageSerializer.SerializationError("Deserialized request msg with invalid type", null, 2, null);
        }

        public final Bundle d() {
            return new Bundle();
        }

        @Override // com.ui.sso.api.provider.UiAccountProviderMessageSerializer
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Bundle a(d message) throws UiAccountProviderMessageSerializer.SerializationError {
            AbstractC6492s.i(message, "message");
            String strB = this.f42120a.b(message);
            Ua.a.e(new c(strB));
            Bundle bundleD = d();
            bundleD.putString("params", strB);
            return bundleD;
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ void b(d self, Yi.d output, Xi.f serialDesc) {
    }

    private d() {
    }

    public /* synthetic */ d(int i10, R0 r02) {
    }
}
