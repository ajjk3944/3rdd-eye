package com.ui.core.ui.sso;

import Eb.SsoUser;
import U9.C3615b;
import Yg.q;
import Zi.C0;
import Zi.C3710i;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W0;
import aj.AbstractC3868b;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.ui.core.ui.sso.UiSSO;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import kotlinx.serialization.UnknownFieldException;
import mh.InterfaceC6824a;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes3.dex */
public final class UiSSO {

    /* renamed from: a, reason: collision with root package name */
    public static final UiSSO f41376a = new UiSSO();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0005\u0006\u0007B\t\b\u0005¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/ui/core/ui/sso/UiSSO$Error;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "InvalidMFAParams", "MissingMFAToken", "MissingSsoPassword", "Lcom/ui/core/ui/sso/UiSSO$Error$InvalidMFAParams;", "Lcom/ui/core/ui/sso/UiSSO$Error$MissingMFAToken;", "Lcom/ui/core/ui/sso/UiSSO$Error$MissingSsoPassword;", "core-ui-sso_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends RuntimeException {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ui/core/ui/sso/UiSSO$Error$InvalidMFAParams;", "Lcom/ui/core/ui/sso/UiSSO$Error;", "", "message", "<init>", "(Ljava/lang/String;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "core-ui-sso_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class InvalidMFAParams extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvalidMFAParams(String message) {
                super(null);
                AbstractC6492s.i(message, "message");
                this.message = message;
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ui/core/ui/sso/UiSSO$Error$MissingMFAToken;", "Lcom/ui/core/ui/sso/UiSSO$Error;", "", "message", "<init>", "(Ljava/lang/String;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "core-ui-sso_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class MissingMFAToken extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MissingMFAToken(String message) {
                super(null);
                AbstractC6492s.i(message, "message");
                this.message = message;
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/core/ui/sso/UiSSO$Error$MissingSsoPassword;", "Lcom/ui/core/ui/sso/UiSSO$Error;", "<init>", "()V", "core-ui-sso_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class MissingSsoPassword extends Error {
            public MissingSsoPassword() {
                super(null);
            }
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ui/core/ui/sso/UiSSO$SuppressedError;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "core-ui-sso_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SuppressedError extends RuntimeException {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String message;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Throwable cause;

        public SuppressedError() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public /* synthetic */ SuppressedError(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "SSO UI Lib Error" : str, (i10 & 2) != 0 ? null : th2);
        }

        public SuppressedError(String message, Throwable th2) {
            AbstractC6492s.i(message, "message");
            this.message = message;
            this.cause = th2;
        }
    }

    @Vi.n
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00192\u00020\u0001:\u0003\u001a\u001b\u001cB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0001\u0002\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcom/ui/core/ui/sso/UiSSO$a;", "", "<init>", "()V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "f", "(Lcom/ui/core/ui/sso/UiSSO$a;LYi/d;LXi/f;)V", "Landroid/os/Bundle;", "bundle", "d", "(Landroid/os/Bundle;)V", "LEb/r;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "()LEb/r;", "user", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_COMMUNITY, "Lcom/ui/core/ui/sso/UiSSO$a$b;", "Lcom/ui/core/ui/sso/UiSSO$a$c;", "core-ui-sso_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class a {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        private static final Yg.m f41381a = Yg.n.a(q.PUBLICATION, new InterfaceC6824a() { // from class: P9.m
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return UiSSO.a.b();
            }
        });

        /* renamed from: com.ui.core.ui.sso.UiSSO$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private final /* synthetic */ Vi.b b() {
                return (Vi.b) a.f41381a.getValue();
            }

            public final a a(Bundle bundle) {
                AbstractC6492s.i(bundle, "bundle");
                String string = bundle.getString("auth_response");
                if (string == null) {
                    return null;
                }
                AbstractC3868b.a aVar = AbstractC3868b.f26328d;
                aVar.a();
                return (a) aVar.b(Wi.a.u(a.INSTANCE.serializer()), string);
            }

            public final Vi.b serializer() {
                return b();
            }

            private Companion() {
            }
        }

        @Vi.n
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u0000 42\u00020\u0001:\u00025#B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBU\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u001fH×\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b,\u0010\u001cR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00101\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/ui/core/ui/sso/UiSSO$a$b;", "Lcom/ui/core/ui/sso/UiSSO$a;", "LEb/r;", "user", "", "ubicCookie", "oAuthToken", "password", "Lcom/ui/core/ui/sso/UiSSO$b;", "deviceIdentifiers", "", "isNewAccount", "<init>", "(LEb/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ui/core/ui/sso/UiSSO$b;Z)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILEb/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ui/core/ui/sso/UiSSO$b;ZLZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "l", "(Lcom/ui/core/ui/sso/UiSSO$a$b;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "LEb/r;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "()LEb/r;", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", "j", "d", "h", "i", "f", "Lcom/ui/core/ui/sso/UiSSO$b;", "g", "()Lcom/ui/core/ui/sso/UiSSO$b;", "Z", "k", "()Z", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, "core-ui-sso_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: com.ui.core.ui.sso.UiSSO$a$b, reason: from toString */
        public static final /* data */ class Cookie extends a {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: h, reason: collision with root package name */
            public static final int f41382h = 8;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final SsoUser user;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String ubicCookie;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String oAuthToken;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final String password;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final DeviceIdentifiers deviceIdentifiers;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isNewAccount;

            /* renamed from: com.ui.core.ui.sso.UiSSO$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C1310a implements M {

                /* renamed from: a, reason: collision with root package name */
                public static final C1310a f41389a;

                /* renamed from: b, reason: collision with root package name */
                public static final int f41390b;
                private static final Xi.f descriptor;

                static {
                    C1310a c1310a = new C1310a();
                    f41389a = c1310a;
                    f41390b = 8;
                    H0 h02 = new H0("com.ui.core.ui.sso.UiSSO.AuthResponse.Cookie", c1310a, 6);
                    h02.p("user", false);
                    h02.p("ubicCookie", false);
                    h02.p("oAuthToken", false);
                    h02.p("password", false);
                    h02.p("deviceIdentifiers", false);
                    h02.p("isNewAccount", false);
                    descriptor = h02;
                }

                private C1310a() {
                }

                @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
                public final Xi.f a() {
                    return descriptor;
                }

                @Override // Zi.M
                public final Vi.b[] d() {
                    W0 w02 = W0.f25599a;
                    return new Vi.b[]{SsoUser.a.f4508a, w02, w02, w02, DeviceIdentifiers.a.f41405a, C3710i.f25639a};
                }

                @Override // Vi.InterfaceC3627a
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Cookie c(Yi.e decoder) {
                    boolean zU;
                    int i10;
                    SsoUser ssoUser;
                    String str;
                    String str2;
                    String str3;
                    DeviceIdentifiers deviceIdentifiers;
                    AbstractC6492s.i(decoder, "decoder");
                    Xi.f fVar = descriptor;
                    Yi.c cVarC = decoder.c(fVar);
                    int i11 = 5;
                    if (cVarC.B()) {
                        SsoUser ssoUser2 = (SsoUser) cVarC.p(fVar, 0, SsoUser.a.f4508a, null);
                        String strW = cVarC.w(fVar, 1);
                        String strW2 = cVarC.w(fVar, 2);
                        String strW3 = cVarC.w(fVar, 3);
                        DeviceIdentifiers deviceIdentifiers2 = (DeviceIdentifiers) cVarC.p(fVar, 4, DeviceIdentifiers.a.f41405a, null);
                        ssoUser = ssoUser2;
                        zU = cVarC.u(fVar, 5);
                        str3 = strW3;
                        deviceIdentifiers = deviceIdentifiers2;
                        str2 = strW2;
                        str = strW;
                        i10 = 63;
                    } else {
                        boolean z10 = true;
                        boolean zU2 = false;
                        SsoUser ssoUser3 = null;
                        String strW4 = null;
                        String strW5 = null;
                        String strW6 = null;
                        DeviceIdentifiers deviceIdentifiers3 = null;
                        int i12 = 0;
                        while (z10) {
                            int iK = cVarC.k(fVar);
                            switch (iK) {
                                case -1:
                                    z10 = false;
                                    i11 = 5;
                                case 0:
                                    ssoUser3 = (SsoUser) cVarC.p(fVar, 0, SsoUser.a.f4508a, ssoUser3);
                                    i12 |= 1;
                                    i11 = 5;
                                case 1:
                                    strW4 = cVarC.w(fVar, 1);
                                    i12 |= 2;
                                case 2:
                                    strW5 = cVarC.w(fVar, 2);
                                    i12 |= 4;
                                case 3:
                                    strW6 = cVarC.w(fVar, 3);
                                    i12 |= 8;
                                case 4:
                                    deviceIdentifiers3 = (DeviceIdentifiers) cVarC.p(fVar, 4, DeviceIdentifiers.a.f41405a, deviceIdentifiers3);
                                    i12 |= 16;
                                case 5:
                                    zU2 = cVarC.u(fVar, i11);
                                    i12 |= 32;
                                default:
                                    throw new UnknownFieldException(iK);
                            }
                        }
                        zU = zU2;
                        i10 = i12;
                        ssoUser = ssoUser3;
                        str = strW4;
                        str2 = strW5;
                        str3 = strW6;
                        deviceIdentifiers = deviceIdentifiers3;
                    }
                    cVarC.b(fVar);
                    return new Cookie(i10, ssoUser, str, str2, str3, deviceIdentifiers, zU, null);
                }

                @Override // Vi.o
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public final void e(Yi.f encoder, Cookie value) {
                    AbstractC6492s.i(encoder, "encoder");
                    AbstractC6492s.i(value, "value");
                    Xi.f fVar = descriptor;
                    Yi.d dVarC = encoder.c(fVar);
                    Cookie.l(value, dVarC, fVar);
                    dVarC.b(fVar);
                }
            }

            /* renamed from: com.ui.core.ui.sso.UiSSO$a$b$b, reason: collision with other inner class name and from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                public final Vi.b serializer() {
                    return C1310a.f41389a;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Cookie(int i10, SsoUser ssoUser, String str, String str2, String str3, DeviceIdentifiers deviceIdentifiers, boolean z10, R0 r02) {
                super(i10, r02);
                if (63 != (i10 & 63)) {
                    C0.a(i10, 63, C1310a.f41389a.a());
                }
                this.user = ssoUser;
                this.ubicCookie = str;
                this.oAuthToken = str2;
                this.password = str3;
                this.deviceIdentifiers = deviceIdentifiers;
                this.isNewAccount = z10;
            }

            public static final /* synthetic */ void l(Cookie self, Yi.d output, Xi.f serialDesc) {
                a.f(self, output, serialDesc);
                output.q(serialDesc, 0, SsoUser.a.f4508a, self.getUser());
                output.y(serialDesc, 1, self.getUbicCookie());
                output.y(serialDesc, 2, self.getOAuthToken());
                output.y(serialDesc, 3, self.getPassword());
                output.q(serialDesc, 4, DeviceIdentifiers.a.f41405a, self.getDeviceIdentifiers());
                output.i(serialDesc, 5, self.getIsNewAccount());
            }

            @Override // com.ui.core.ui.sso.UiSSO.a
            /* renamed from: e, reason: from getter */
            public SsoUser getUser() {
                return this.user;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Cookie)) {
                    return false;
                }
                Cookie cookie = (Cookie) other;
                return AbstractC6492s.d(this.user, cookie.user) && AbstractC6492s.d(this.ubicCookie, cookie.ubicCookie) && AbstractC6492s.d(this.oAuthToken, cookie.oAuthToken) && AbstractC6492s.d(this.password, cookie.password) && AbstractC6492s.d(this.deviceIdentifiers, cookie.deviceIdentifiers) && this.isNewAccount == cookie.isNewAccount;
            }

            /* renamed from: g, reason: from getter */
            public DeviceIdentifiers getDeviceIdentifiers() {
                return this.deviceIdentifiers;
            }

            /* renamed from: h, reason: from getter */
            public String getOAuthToken() {
                return this.oAuthToken;
            }

            public int hashCode() {
                return (((((((((this.user.hashCode() * 31) + this.ubicCookie.hashCode()) * 31) + this.oAuthToken.hashCode()) * 31) + this.password.hashCode()) * 31) + this.deviceIdentifiers.hashCode()) * 31) + Boolean.hashCode(this.isNewAccount);
            }

            /* renamed from: i, reason: from getter */
            public String getPassword() {
                return this.password;
            }

            /* renamed from: j, reason: from getter */
            public String getUbicCookie() {
                return this.ubicCookie;
            }

            /* renamed from: k, reason: from getter */
            public boolean getIsNewAccount() {
                return this.isNewAccount;
            }

            public String toString() {
                return "Cookie(user=" + this.user + ", ubicCookie=" + this.ubicCookie + ", oAuthToken=" + this.oAuthToken + ", password=" + this.password + ", deviceIdentifiers=" + this.deviceIdentifiers + ", isNewAccount=" + this.isNewAccount + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Cookie(SsoUser user, String ubicCookie, String oAuthToken, String password, DeviceIdentifiers deviceIdentifiers, boolean z10) {
                super(null);
                AbstractC6492s.i(user, "user");
                AbstractC6492s.i(ubicCookie, "ubicCookie");
                AbstractC6492s.i(oAuthToken, "oAuthToken");
                AbstractC6492s.i(password, "password");
                AbstractC6492s.i(deviceIdentifiers, "deviceIdentifiers");
                this.user = user;
                this.ubicCookie = ubicCookie;
                this.oAuthToken = oAuthToken;
                this.password = password;
                this.deviceIdentifiers = deviceIdentifiers;
                this.isNewAccount = z10;
            }
        }

        @Vi.n
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00029%BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fBi\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0010H×\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010!H×\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010*\u001a\u0004\b.\u0010\u001eR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00103\u001a\u0004\b4\u00105R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u0010*\u001a\u0004\b6\u0010\u001eR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b7\u0010\u001e¨\u0006:"}, d2 = {"Lcom/ui/core/ui/sso/UiSSO$a$c;", "Lcom/ui/core/ui/sso/UiSSO$a;", "LEb/r;", "user", "", "ubicCookie", "oAuthToken", "password", "Lcom/ui/core/ui/sso/UiSSO$b;", "deviceIdentifiers", "", "isNewAccount", "method", "verifier", "<init>", "(LEb/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ui/core/ui/sso/UiSSO$b;ZLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILEb/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ui/core/ui/sso/UiSSO$b;ZLjava/lang/String;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_CONTEXT_NAME, "(Lcom/ui/core/ui/sso/UiSSO$a$c;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_BIND_ADDRESS, "LEb/r;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "()LEb/r;", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", "k", "d", "i", "j", "f", "Lcom/ui/core/ui/sso/UiSSO$b;", "g", "()Lcom/ui/core/ui/sso/UiSSO$b;", "Z", "m", "()Z", "h", "l", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, "core-ui-sso_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: com.ui.core.ui.sso.UiSSO$a$c, reason: from toString */
        public static final /* data */ class PKCECookie extends a {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            /* renamed from: j, reason: collision with root package name */
            public static final int f41391j = 8;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final SsoUser user;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String ubicCookie;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String oAuthToken;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final String password;

            /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final DeviceIdentifiers deviceIdentifiers;

            /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isNewAccount;

            /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final String method;

            /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final String verifier;

            /* renamed from: com.ui.core.ui.sso.UiSSO$a$c$a, reason: collision with other inner class name */
            public /* synthetic */ class C1312a implements M {

                /* renamed from: a, reason: collision with root package name */
                public static final C1312a f41400a;

                /* renamed from: b, reason: collision with root package name */
                public static final int f41401b;
                private static final Xi.f descriptor;

                static {
                    C1312a c1312a = new C1312a();
                    f41400a = c1312a;
                    f41401b = 8;
                    H0 h02 = new H0("com.ui.core.ui.sso.UiSSO.AuthResponse.PKCECookie", c1312a, 8);
                    h02.p("user", false);
                    h02.p("ubicCookie", false);
                    h02.p("oAuthToken", false);
                    h02.p("password", false);
                    h02.p("deviceIdentifiers", false);
                    h02.p("isNewAccount", false);
                    h02.p("method", false);
                    h02.p("verifier", false);
                    descriptor = h02;
                }

                private C1312a() {
                }

                @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
                public final Xi.f a() {
                    return descriptor;
                }

                @Override // Zi.M
                public final Vi.b[] d() {
                    W0 w02 = W0.f25599a;
                    return new Vi.b[]{SsoUser.a.f4508a, w02, w02, w02, DeviceIdentifiers.a.f41405a, C3710i.f25639a, w02, w02};
                }

                @Override // Vi.InterfaceC3627a
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public final PKCECookie c(Yi.e decoder) {
                    boolean z10;
                    DeviceIdentifiers deviceIdentifiers;
                    int i10;
                    SsoUser ssoUser;
                    String str;
                    String str2;
                    String str3;
                    String str4;
                    String strW;
                    AbstractC6492s.i(decoder, "decoder");
                    Xi.f fVar = descriptor;
                    Yi.c cVarC = decoder.c(fVar);
                    int i11 = 7;
                    int i12 = 6;
                    if (cVarC.B()) {
                        SsoUser ssoUser2 = (SsoUser) cVarC.p(fVar, 0, SsoUser.a.f4508a, null);
                        String strW2 = cVarC.w(fVar, 1);
                        String strW3 = cVarC.w(fVar, 2);
                        String strW4 = cVarC.w(fVar, 3);
                        DeviceIdentifiers deviceIdentifiers2 = (DeviceIdentifiers) cVarC.p(fVar, 4, DeviceIdentifiers.a.f41405a, null);
                        boolean zU = cVarC.u(fVar, 5);
                        String strW5 = cVarC.w(fVar, 6);
                        ssoUser = ssoUser2;
                        strW = cVarC.w(fVar, 7);
                        str4 = strW5;
                        z10 = zU;
                        str3 = strW4;
                        deviceIdentifiers = deviceIdentifiers2;
                        str2 = strW3;
                        str = strW2;
                        i10 = 255;
                    } else {
                        boolean z11 = true;
                        boolean zU2 = false;
                        SsoUser ssoUser3 = null;
                        String strW6 = null;
                        String strW7 = null;
                        String strW8 = null;
                        String strW9 = null;
                        String strW10 = null;
                        DeviceIdentifiers deviceIdentifiers3 = null;
                        int i13 = 0;
                        while (z11) {
                            int iK = cVarC.k(fVar);
                            switch (iK) {
                                case -1:
                                    z11 = false;
                                    i12 = 6;
                                case 0:
                                    ssoUser3 = (SsoUser) cVarC.p(fVar, 0, SsoUser.a.f4508a, ssoUser3);
                                    i13 |= 1;
                                    i11 = 7;
                                    i12 = 6;
                                case 1:
                                    strW6 = cVarC.w(fVar, 1);
                                    i13 |= 2;
                                case 2:
                                    strW7 = cVarC.w(fVar, 2);
                                    i13 |= 4;
                                case 3:
                                    strW8 = cVarC.w(fVar, 3);
                                    i13 |= 8;
                                case 4:
                                    deviceIdentifiers3 = (DeviceIdentifiers) cVarC.p(fVar, 4, DeviceIdentifiers.a.f41405a, deviceIdentifiers3);
                                    i13 |= 16;
                                case 5:
                                    zU2 = cVarC.u(fVar, 5);
                                    i13 |= 32;
                                case 6:
                                    strW9 = cVarC.w(fVar, i12);
                                    i13 |= 64;
                                case 7:
                                    strW10 = cVarC.w(fVar, i11);
                                    i13 |= 128;
                                default:
                                    throw new UnknownFieldException(iK);
                            }
                        }
                        z10 = zU2;
                        deviceIdentifiers = deviceIdentifiers3;
                        i10 = i13;
                        ssoUser = ssoUser3;
                        str = strW6;
                        str2 = strW7;
                        str3 = strW8;
                        str4 = strW9;
                        strW = strW10;
                    }
                    cVarC.b(fVar);
                    return new PKCECookie(i10, ssoUser, str, str2, str3, deviceIdentifiers, z10, str4, strW, null);
                }

                @Override // Vi.o
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public final void e(Yi.f encoder, PKCECookie value) {
                    AbstractC6492s.i(encoder, "encoder");
                    AbstractC6492s.i(value, "value");
                    Xi.f fVar = descriptor;
                    Yi.d dVarC = encoder.c(fVar);
                    PKCECookie.n(value, dVarC, fVar);
                    dVarC.b(fVar);
                }
            }

            /* renamed from: com.ui.core.ui.sso.UiSSO$a$c$b, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                public final Vi.b serializer() {
                    return C1312a.f41400a;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ PKCECookie(int i10, SsoUser ssoUser, String str, String str2, String str3, DeviceIdentifiers deviceIdentifiers, boolean z10, String str4, String str5, R0 r02) {
                super(i10, r02);
                if (255 != (i10 & 255)) {
                    C0.a(i10, 255, C1312a.f41400a.a());
                }
                this.user = ssoUser;
                this.ubicCookie = str;
                this.oAuthToken = str2;
                this.password = str3;
                this.deviceIdentifiers = deviceIdentifiers;
                this.isNewAccount = z10;
                this.method = str4;
                this.verifier = str5;
            }

            public static final /* synthetic */ void n(PKCECookie self, Yi.d output, Xi.f serialDesc) {
                a.f(self, output, serialDesc);
                output.q(serialDesc, 0, SsoUser.a.f4508a, self.getUser());
                output.y(serialDesc, 1, self.getUbicCookie());
                output.y(serialDesc, 2, self.getOAuthToken());
                output.y(serialDesc, 3, self.getPassword());
                output.q(serialDesc, 4, DeviceIdentifiers.a.f41405a, self.getDeviceIdentifiers());
                output.i(serialDesc, 5, self.getIsNewAccount());
                output.y(serialDesc, 6, self.method);
                output.y(serialDesc, 7, self.verifier);
            }

            @Override // com.ui.core.ui.sso.UiSSO.a
            /* renamed from: e, reason: from getter */
            public SsoUser getUser() {
                return this.user;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PKCECookie)) {
                    return false;
                }
                PKCECookie pKCECookie = (PKCECookie) other;
                return AbstractC6492s.d(this.user, pKCECookie.user) && AbstractC6492s.d(this.ubicCookie, pKCECookie.ubicCookie) && AbstractC6492s.d(this.oAuthToken, pKCECookie.oAuthToken) && AbstractC6492s.d(this.password, pKCECookie.password) && AbstractC6492s.d(this.deviceIdentifiers, pKCECookie.deviceIdentifiers) && this.isNewAccount == pKCECookie.isNewAccount && AbstractC6492s.d(this.method, pKCECookie.method) && AbstractC6492s.d(this.verifier, pKCECookie.verifier);
            }

            /* renamed from: g, reason: from getter */
            public DeviceIdentifiers getDeviceIdentifiers() {
                return this.deviceIdentifiers;
            }

            /* renamed from: h, reason: from getter */
            public final String getMethod() {
                return this.method;
            }

            public int hashCode() {
                return (((((((((((((this.user.hashCode() * 31) + this.ubicCookie.hashCode()) * 31) + this.oAuthToken.hashCode()) * 31) + this.password.hashCode()) * 31) + this.deviceIdentifiers.hashCode()) * 31) + Boolean.hashCode(this.isNewAccount)) * 31) + this.method.hashCode()) * 31) + this.verifier.hashCode();
            }

            /* renamed from: i, reason: from getter */
            public String getOAuthToken() {
                return this.oAuthToken;
            }

            /* renamed from: j, reason: from getter */
            public String getPassword() {
                return this.password;
            }

            /* renamed from: k, reason: from getter */
            public String getUbicCookie() {
                return this.ubicCookie;
            }

            /* renamed from: l, reason: from getter */
            public final String getVerifier() {
                return this.verifier;
            }

            /* renamed from: m, reason: from getter */
            public boolean getIsNewAccount() {
                return this.isNewAccount;
            }

            public String toString() {
                return "PKCECookie(user=" + this.user + ", ubicCookie=" + this.ubicCookie + ", oAuthToken=" + this.oAuthToken + ", password=" + this.password + ", deviceIdentifiers=" + this.deviceIdentifiers + ", isNewAccount=" + this.isNewAccount + ", method=" + this.method + ", verifier=" + this.verifier + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PKCECookie(SsoUser user, String ubicCookie, String oAuthToken, String password, DeviceIdentifiers deviceIdentifiers, boolean z10, String method, String verifier) {
                super(null);
                AbstractC6492s.i(user, "user");
                AbstractC6492s.i(ubicCookie, "ubicCookie");
                AbstractC6492s.i(oAuthToken, "oAuthToken");
                AbstractC6492s.i(password, "password");
                AbstractC6492s.i(deviceIdentifiers, "deviceIdentifiers");
                AbstractC6492s.i(method, "method");
                AbstractC6492s.i(verifier, "verifier");
                this.user = user;
                this.ubicCookie = ubicCookie;
                this.oAuthToken = oAuthToken;
                this.password = password;
                this.deviceIdentifiers = deviceIdentifiers;
                this.isNewAccount = z10;
                this.method = method;
                this.verifier = verifier;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Vi.b b() {
            return new Vi.k("com.ui.core.ui.sso.UiSSO.AuthResponse", O.b(a.class), new th.d[]{O.b(Cookie.class), O.b(PKCECookie.class)}, new Vi.b[]{Cookie.C1310a.f41389a, PKCECookie.C1312a.f41400a}, new Annotation[0]);
        }

        public static final /* synthetic */ void f(a self, Yi.d output, Xi.f serialDesc) {
        }

        public final void d(Bundle bundle) {
            AbstractC6492s.i(bundle, "bundle");
            AbstractC3868b.a aVar = AbstractC3868b.f26328d;
            aVar.a();
            bundle.putString("auth_response", aVar.c(INSTANCE.serializer(), this));
        }

        /* renamed from: e */
        public abstract SsoUser getUser();

        private a() {
        }

        public /* synthetic */ a(int i10, R0 r02) {
        }
    }

    @Vi.n
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002$&B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bH×\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH×\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b&\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b'\u0010\u001d¨\u0006)"}, d2 = {"Lcom/ui/core/ui/sso/UiSSO$b;", "Landroid/os/Parcelable;", "", "deviceId", "deviceName", "deviceModel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_COMMUNITY, "(Lcom/ui/core/ui/sso/UiSSO$b;LYi/d;LXi/f;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "getDeviceModel", "Companion", "core-ui-sso_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.ui.core.ui.sso.UiSSO$b, reason: from toString */
    public static final /* data */ class DeviceIdentifiers implements Parcelable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String deviceId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String deviceName;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String deviceModel;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<DeviceIdentifiers> CREATOR = new c();

        /* renamed from: com.ui.core.ui.sso.UiSSO$b$a */
        public /* synthetic */ class a implements M {

            /* renamed from: a, reason: collision with root package name */
            public static final a f41405a;

            /* renamed from: b, reason: collision with root package name */
            public static final int f41406b;
            private static final Xi.f descriptor;

            static {
                a aVar = new a();
                f41405a = aVar;
                f41406b = 8;
                H0 h02 = new H0("com.ui.core.ui.sso.UiSSO.DeviceIdentifiers", aVar, 3);
                h02.p("deviceId", false);
                h02.p("deviceName", false);
                h02.p("deviceModel", false);
                descriptor = h02;
            }

            private a() {
            }

            @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
            public final Xi.f a() {
                return descriptor;
            }

            @Override // Zi.M
            public final Vi.b[] d() {
                W0 w02 = W0.f25599a;
                return new Vi.b[]{w02, w02, w02};
            }

            @Override // Vi.InterfaceC3627a
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final DeviceIdentifiers c(Yi.e decoder) {
                String str;
                String strW;
                String str2;
                int i10;
                AbstractC6492s.i(decoder, "decoder");
                Xi.f fVar = descriptor;
                Yi.c cVarC = decoder.c(fVar);
                if (cVarC.B()) {
                    String strW2 = cVarC.w(fVar, 0);
                    String strW3 = cVarC.w(fVar, 1);
                    str = strW2;
                    strW = cVarC.w(fVar, 2);
                    str2 = strW3;
                    i10 = 7;
                } else {
                    String strW4 = null;
                    String strW5 = null;
                    String strW6 = null;
                    boolean z10 = true;
                    int i11 = 0;
                    while (z10) {
                        int iK = cVarC.k(fVar);
                        if (iK == -1) {
                            z10 = false;
                        } else if (iK == 0) {
                            strW4 = cVarC.w(fVar, 0);
                            i11 |= 1;
                        } else if (iK == 1) {
                            strW6 = cVarC.w(fVar, 1);
                            i11 |= 2;
                        } else {
                            if (iK != 2) {
                                throw new UnknownFieldException(iK);
                            }
                            strW5 = cVarC.w(fVar, 2);
                            i11 |= 4;
                        }
                    }
                    str = strW4;
                    strW = strW5;
                    str2 = strW6;
                    i10 = i11;
                }
                cVarC.b(fVar);
                return new DeviceIdentifiers(i10, str, str2, strW, null);
            }

            @Override // Vi.o
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void e(Yi.f encoder, DeviceIdentifiers value) {
                AbstractC6492s.i(encoder, "encoder");
                AbstractC6492s.i(value, "value");
                Xi.f fVar = descriptor;
                Yi.d dVarC = encoder.c(fVar);
                DeviceIdentifiers.c(value, dVarC, fVar);
                dVarC.b(fVar);
            }
        }

        /* renamed from: com.ui.core.ui.sso.UiSSO$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final Vi.b serializer() {
                return a.f41405a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: com.ui.core.ui.sso.UiSSO$b$c */
        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DeviceIdentifiers createFromParcel(Parcel parcel) {
                AbstractC6492s.i(parcel, "parcel");
                return new DeviceIdentifiers(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final DeviceIdentifiers[] newArray(int i10) {
                return new DeviceIdentifiers[i10];
            }
        }

        public /* synthetic */ DeviceIdentifiers(int i10, String str, String str2, String str3, R0 r02) {
            if (7 != (i10 & 7)) {
                C0.a(i10, 7, a.f41405a.a());
            }
            this.deviceId = str;
            this.deviceName = str2;
            this.deviceModel = str3;
        }

        public static final /* synthetic */ void c(DeviceIdentifiers self, Yi.d output, Xi.f serialDesc) {
            output.y(serialDesc, 0, self.deviceId);
            output.y(serialDesc, 1, self.deviceName);
            output.y(serialDesc, 2, self.deviceModel);
        }

        /* renamed from: a, reason: from getter */
        public final String getDeviceId() {
            return this.deviceId;
        }

        /* renamed from: b, reason: from getter */
        public final String getDeviceName() {
            return this.deviceName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeviceIdentifiers)) {
                return false;
            }
            DeviceIdentifiers deviceIdentifiers = (DeviceIdentifiers) other;
            return AbstractC6492s.d(this.deviceId, deviceIdentifiers.deviceId) && AbstractC6492s.d(this.deviceName, deviceIdentifiers.deviceName) && AbstractC6492s.d(this.deviceModel, deviceIdentifiers.deviceModel);
        }

        public int hashCode() {
            return (((this.deviceId.hashCode() * 31) + this.deviceName.hashCode()) * 31) + this.deviceModel.hashCode();
        }

        public String toString() {
            return "DeviceIdentifiers(deviceId=" + this.deviceId + ", deviceName=" + this.deviceName + ", deviceModel=" + this.deviceModel + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC6492s.i(dest, "dest");
            dest.writeString(this.deviceId);
            dest.writeString(this.deviceName);
            dest.writeString(this.deviceModel);
        }

        public DeviceIdentifiers(String deviceId, String deviceName, String deviceModel) {
            AbstractC6492s.i(deviceId, "deviceId");
            AbstractC6492s.i(deviceName, "deviceName");
            AbstractC6492s.i(deviceModel, "deviceModel");
            this.deviceId = deviceId;
            this.deviceName = deviceName;
            this.deviceModel = deviceModel;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c implements Parcelable {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final Parcelable.Creator<c> CREATOR;
        public static final c REGISTER = new c("REGISTER", 0);
        public static final c LOGIN = new c("LOGIN", 1);

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC6492s.i(parcel, "parcel");
                return c.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i10) {
                return new c[i10];
            }
        }

        private static final /* synthetic */ c[] $values() {
            return new c[]{REGISTER, LOGIN};
        }

        static {
            c[] cVarArr$values = $values();
            $VALUES = cVarArr$values;
            $ENTRIES = AbstractC5827b.a(cVarArr$values);
            CREATOR = new a();
        }

        private c(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            AbstractC6492s.i(dest, "dest");
            dest.writeString(name());
        }
    }

    public static final class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f41407a;

        /* renamed from: b, reason: collision with root package name */
        private final C3615b f41408b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC6492s.i(parcel, "parcel");
                return new d(parcel.readString(), C3615b.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d(String mfaToken, C3615b methods) {
            AbstractC6492s.i(mfaToken, "mfaToken");
            AbstractC6492s.i(methods, "methods");
            this.f41407a = mfaToken;
            this.f41408b = methods;
        }

        public final C3615b a() {
            return this.f41408b;
        }

        public final String b() {
            return this.f41407a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC6492s.d(this.f41407a, dVar.f41407a) && AbstractC6492s.d(this.f41408b, dVar.f41408b);
        }

        public int hashCode() {
            return (this.f41407a.hashCode() * 31) + this.f41408b.hashCode();
        }

        public String toString() {
            return "MFAParams(mfaToken=" + this.f41407a + ", methods=" + this.f41408b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            AbstractC6492s.i(dest, "dest");
            dest.writeString(this.f41407a);
            this.f41408b.writeToParcel(dest, i10);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class f implements Parcelable {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ f[] $VALUES;
        public static final Parcelable.Creator<f> CREATOR;
        public static final f LOGIN = new f("LOGIN", 0);
        public static final f RESET_PASSWORD = new f("RESET_PASSWORD", 1);
        public static final f MFA = new f("MFA", 2);

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f createFromParcel(Parcel parcel) {
                AbstractC6492s.i(parcel, "parcel");
                return f.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final f[] newArray(int i10) {
                return new f[i10];
            }
        }

        private static final /* synthetic */ f[] $values() {
            return new f[]{LOGIN, RESET_PASSWORD, MFA};
        }

        static {
            f[] fVarArr$values = $values();
            $VALUES = fVarArr$values;
            $ENTRIES = AbstractC5827b.a(fVarArr$values);
            CREATOR = new a();
        }

        private f(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            AbstractC6492s.i(dest, "dest");
            dest.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class g implements Parcelable {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ g[] $VALUES;
        public static final Parcelable.Creator<g> CREATOR;
        public static final g FOLLOW_SYSTEM = new g("FOLLOW_SYSTEM", 0);
        public static final g LIGHT = new g("LIGHT", 1);
        public static final g DARK = new g("DARK", 2);

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g createFromParcel(Parcel parcel) {
                AbstractC6492s.i(parcel, "parcel");
                return g.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i10) {
                return new g[i10];
            }
        }

        private static final /* synthetic */ g[] $values() {
            return new g[]{FOLLOW_SYSTEM, LIGHT, DARK};
        }

        static {
            g[] gVarArr$values = $values();
            $VALUES = gVarArr$values;
            $ENTRIES = AbstractC5827b.a(gVarArr$values);
            CREATOR = new a();
        }

        private g(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            AbstractC6492s.i(dest, "dest");
            dest.writeString(name());
        }
    }

    private UiSSO() {
    }

    public static /* synthetic */ Intent c(UiSSO uiSSO, Context context, c cVar, String str, String str2, boolean z10, g gVar, e eVar, int i10, Object obj) {
        return uiSSO.b(context, (i10 & 2) != 0 ? c.LOGIN : cVar, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? g.FOLLOW_SYSTEM : gVar, (i10 & 64) == 0 ? eVar : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent f(Context context, String str, String str2) {
        AbstractC6492s.i(context, "context");
        return c(f41376a, context, null, str, str2, false, null, null, 98, null);
    }

    public final Intent b(Context context, c entryPoint, String str, String str2, boolean z10, g theme, e eVar) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(entryPoint, "entryPoint");
        AbstractC6492s.i(theme, "theme");
        Intent intent = new Intent(context, (Class<?>) SSOAccountActivity.class);
        f fVar = f.LOGIN;
        AbstractC6492s.g(fVar, "null cannot be cast to non-null type android.os.Parcelable");
        intent.putExtra("screen", (Parcelable) fVar);
        intent.putExtra("entry_point", (Parcelable) entryPoint);
        intent.putExtra("username", str);
        intent.putExtra("password", str2);
        intent.putExtra("hasToolbarClose", z10);
        intent.putExtra("theme", (Parcelable) theme);
        if (eVar != null) {
            intent.putExtra("pkce_params", eVar);
        }
        return intent;
    }

    public final void d(P9.j ssoRecaptchaConfig) {
        AbstractC6492s.i(ssoRecaptchaConfig, "ssoRecaptchaConfig");
        P9.n.f18488a.l(ssoRecaptchaConfig);
    }

    public final void e() {
        Ma.a.f13069a.e(new mh.q() { // from class: P9.l
            @Override // mh.q
            public final Object s(Object obj, Object obj2, Object obj3) {
                return UiSSO.f((Context) obj, (String) obj2, (String) obj3);
            }
        });
    }

    public static final class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f41409a;

        /* renamed from: b, reason: collision with root package name */
        private final String f41410b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC6492s.i(parcel, "parcel");
                return new e(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e(String method, String str) {
            AbstractC6492s.i(method, "method");
            this.f41409a = method;
            this.f41410b = str;
        }

        public final String a() {
            return this.f41409a;
        }

        public final String b() {
            return this.f41410b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC6492s.d(this.f41409a, eVar.f41409a) && AbstractC6492s.d(this.f41410b, eVar.f41410b);
        }

        public int hashCode() {
            int iHashCode = this.f41409a.hashCode() * 31;
            String str = this.f41410b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "PKCEParams(method=" + this.f41409a + ", verifier=" + this.f41410b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            AbstractC6492s.i(dest, "dest");
            dest.writeString(this.f41409a);
            dest.writeString(this.f41410b);
        }

        public /* synthetic */ e(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "S256" : str, (i10 & 2) != 0 ? null : str2);
        }
    }
}
