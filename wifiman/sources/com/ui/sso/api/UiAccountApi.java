package com.ui.sso.api;

import Ii.C3048c0;
import Ii.J;
import Ii.N;
import Li.InterfaceC3220g;
import Wa.i;
import Wa.j;
import Zg.AbstractC3689v;
import android.content.Context;
import android.content.pm.PackageManager;
import com.ui.sso.auth.a;
import dh.InterfaceC5380e;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes3.dex */
public interface UiAccountApi {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/ui/sso/api/UiAccountApi$Error;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "AccountManager", "CallerSignCertMismatch", "ContentProvider", "Unsupported", "Lcom/ui/sso/api/UiAccountApi$Error$AccountManager;", "Lcom/ui/sso/api/UiAccountApi$Error$CallerSignCertMismatch;", "Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider;", "Lcom/ui/sso/api/UiAccountApi$Error$Unsupported;", "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Error extends Exception {

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/ui/sso/api/UiAccountApi$Error$AccountManager;", "Lcom/ui/sso/api/UiAccountApi$Error;", "()V", "AccessRestricted", "AccountNotFound", "IO", "Lcom/ui/sso/api/UiAccountApi$Error$AccountManager$AccessRestricted;", "Lcom/ui/sso/api/UiAccountApi$Error$AccountManager$AccountNotFound;", "Lcom/ui/sso/api/UiAccountApi$Error$AccountManager$IO;", "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class AccountManager extends Error {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ui/sso/api/UiAccountApi$Error$AccountManager$AccessRestricted;", "Lcom/ui/sso/api/UiAccountApi$Error$AccountManager;", "", "message", "<init>", "(Ljava/lang/String;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class AccessRestricted extends AccountManager {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String message;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AccessRestricted(String message) {
                    super(null);
                    AbstractC6492s.i(message, "message");
                    this.message = message;
                }

                @Override // java.lang.Throwable
                public String getMessage() {
                    return this.message;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ui/sso/api/UiAccountApi$Error$AccountManager$AccountNotFound;", "Lcom/ui/sso/api/UiAccountApi$Error$AccountManager;", "", "message", "<init>", "(Ljava/lang/String;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class AccountNotFound extends AccountManager {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String message;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AccountNotFound(String message) {
                    super(null);
                    AbstractC6492s.i(message, "message");
                    this.message = message;
                }

                @Override // java.lang.Throwable
                public String getMessage() {
                    return this.message;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ui/sso/api/UiAccountApi$Error$AccountManager$IO;", "Lcom/ui/sso/api/UiAccountApi$Error$AccountManager;", "", "message", "<init>", "(Ljava/lang/String;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class IO extends AccountManager {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String message;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IO(String message) {
                    super(null);
                    AbstractC6492s.i(message, "message");
                    this.message = message;
                }

                @Override // java.lang.Throwable
                public String getMessage() {
                    return this.message;
                }
            }

            public /* synthetic */ AccountManager(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AccountManager() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/ui/sso/api/UiAccountApi$Error$CallerSignCertMismatch;", "Lcom/ui/sso/api/UiAccountApi$Error;", "<init>", "()V", "", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CallerSignCertMismatch extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            public CallerSignCertMismatch() {
                super(null);
                this.message = "API package with requested Account type not recognise cert of this package. This should never happen for GA build. For proper configuration of Internal builds, please visit docs https://github.com/ubiquiti/shared-utils.android-sso/wiki/Internal-Build-Configuration";
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider;", "Lcom/ui/sso/api/UiAccountApi$Error;", "()V", "IllegalState", "ProviderUnavailable", "ReceivedInvalidResponse", "Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$IllegalState;", "Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ProviderUnavailable;", "Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ReceivedInvalidResponse;", "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class ContentProvider extends Error {

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$IllegalState;", "Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class IllegalState extends ContentProvider {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String message;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                private final Throwable cause;

                public /* synthetic */ IllegalState(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, (i10 & 2) != 0 ? null : th2);
                }

                @Override // java.lang.Throwable
                public Throwable getCause() {
                    return this.cause;
                }

                @Override // java.lang.Throwable
                public String getMessage() {
                    return this.message;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IllegalState(String message, Throwable th2) {
                    super(null);
                    AbstractC6492s.i(message, "message");
                    this.message = message;
                    this.cause = th2;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ProviderUnavailable;", "Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class ProviderUnavailable extends ContentProvider {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final Throwable cause;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ProviderUnavailable(Throwable cause) {
                    super(null);
                    AbstractC6492s.i(cause, "cause");
                    this.cause = cause;
                }

                @Override // java.lang.Throwable
                public Throwable getCause() {
                    return this.cause;
                }
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider$ReceivedInvalidResponse;", "Lcom/ui/sso/api/UiAccountApi$Error$ContentProvider;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class ReceivedInvalidResponse extends ContentProvider {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String message;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                private final Throwable cause;

                public /* synthetic */ ReceivedInvalidResponse(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, (i10 & 2) != 0 ? null : th2);
                }

                @Override // java.lang.Throwable
                public Throwable getCause() {
                    return this.cause;
                }

                @Override // java.lang.Throwable
                public String getMessage() {
                    return this.message;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ReceivedInvalidResponse(String message, Throwable th2) {
                    super(null);
                    AbstractC6492s.i(message, "message");
                    this.message = message;
                    this.cause = th2;
                }
            }

            public /* synthetic */ ContentProvider(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private ContentProvider() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ui/sso/api/UiAccountApi$Error$Unsupported;", "Lcom/ui/sso/api/UiAccountApi$Error;", "", "message", "<init>", "(Ljava/lang/String;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "account_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Unsupported extends Error {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Unsupported(String message) {
                super(null);
                AbstractC6492s.i(message, "message");
                this.message = message;
            }

            @Override // java.lang.Throwable
            public String getMessage() {
                return this.message;
            }
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a CONTENT_PROVIDER = new a("CONTENT_PROVIDER", 0);
        public static final a DIRECT = new a("DIRECT", 1);

        private static final /* synthetic */ a[] $values() {
            return new a[]{CONTENT_PROVIDER, DIRECT};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        private a(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f41671a = a.f41672a;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f41672a = new a();

            private a() {
            }

            public final b a(Context context) {
                AbstractC6492s.i(context, "context");
                PackageManager packageManager = context.getPackageManager();
                AbstractC6492s.h(packageManager, "getPackageManager(...)");
                j jVar = new j(new i(packageManager, null, 2, null), Ma.a.f13069a.a());
                String packageName = context.getPackageName();
                AbstractC6492s.h(packageName, "getPackageName(...)");
                if (!jVar.a(packageName)) {
                    throw new IllegalStateException("App signing certificate is not listed. This should never happen for production build since production certificate list is stale and shouldn't be configured. For internal builds, make sure your app certificate is listed in [UiAccountLib.allowedCertFingerprint]");
                }
                Context applicationContext = context.getApplicationContext();
                AbstractC6492s.h(applicationContext, "getApplicationContext(...)");
                return b(applicationContext, C3048c0.b(), C3048c0.a());
            }

            public final b b(Context context, J dispatcherIO, J dispatcherDefault) {
                AbstractC6492s.i(context, "context");
                AbstractC6492s.i(dispatcherIO, "dispatcherIO");
                AbstractC6492s.i(dispatcherDefault, "dispatcherDefault");
                return new com.ui.sso.api.a(context, dispatcherIO, dispatcherDefault, null, null, null, null, null, null, null, null, null, 4088, null);
            }
        }

        InterfaceC3220g a(N n10);
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final int f41673a;

        /* renamed from: b, reason: collision with root package name */
        private final String f41674b;

        /* renamed from: c, reason: collision with root package name */
        private final String f41675c;

        /* renamed from: d, reason: collision with root package name */
        private final Na.c f41676d;

        /* renamed from: e, reason: collision with root package name */
        private final a f41677e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f41678f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f41679g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f41680h;

        public c(int i10, String accountType, String appPackage, Na.c storageType, a accessType, boolean z10, boolean z11, boolean z12) {
            AbstractC6492s.i(accountType, "accountType");
            AbstractC6492s.i(appPackage, "appPackage");
            AbstractC6492s.i(storageType, "storageType");
            AbstractC6492s.i(accessType, "accessType");
            this.f41673a = i10;
            this.f41674b = accountType;
            this.f41675c = appPackage;
            this.f41676d = storageType;
            this.f41677e = accessType;
            this.f41678f = z10;
            this.f41679g = z11;
            this.f41680h = z12;
        }

        public final a a() {
            return this.f41677e;
        }

        public final String b() {
            return this.f41674b;
        }

        public final int c() {
            return this.f41673a;
        }

        public final String d() {
            return this.f41675c;
        }

        public final Na.c e() {
            return this.f41676d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f41673a == cVar.f41673a && AbstractC6492s.d(this.f41674b, cVar.f41674b) && AbstractC6492s.d(this.f41675c, cVar.f41675c) && this.f41676d == cVar.f41676d && this.f41677e == cVar.f41677e && this.f41678f == cVar.f41678f && this.f41679g == cVar.f41679g && this.f41680h == cVar.f41680h;
        }

        public final boolean f() {
            return this.f41678f;
        }

        public final boolean g() {
            return this.f41679g;
        }

        public final boolean h() {
            return this.f41680h;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iHashCode = ((((((((Integer.hashCode(this.f41673a) * 31) + this.f41674b.hashCode()) * 31) + this.f41675c.hashCode()) * 31) + this.f41676d.hashCode()) * 31) + this.f41677e.hashCode()) * 31;
            boolean z10 = this.f41678f;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            int i11 = (iHashCode + i10) * 31;
            boolean z11 = this.f41679g;
            int i12 = z11;
            if (z11 != 0) {
                i12 = 1;
            }
            int i13 = (i11 + i12) * 31;
            boolean z12 = this.f41680h;
            return i13 + (z12 ? 1 : z12 ? 1 : 0);
        }

        public String toString() {
            return "State(apiVersion=" + this.f41673a + ", accountType=" + this.f41674b + ", appPackage=" + this.f41675c + ", storageType=" + this.f41676d + ", accessType=" + this.f41677e + ", isAndroidAccountStorageAccessible=" + this.f41678f + ", isAndroidAccountStorageApiOwner=" + this.f41679g + ", isLocalAccountStorageApiOwner=" + this.f41680h + ")";
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private a f41681a;

        /* renamed from: b, reason: collision with root package name */
        private final List f41682b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final Set f41683c = new LinkedHashSet();

        /* renamed from: d, reason: collision with root package name */
        private final Set f41684d = new LinkedHashSet();

        /* renamed from: e, reason: collision with root package name */
        private final Set f41685e = new LinkedHashSet();

        /* renamed from: f, reason: collision with root package name */
        private c f41686f;

        /* renamed from: g, reason: collision with root package name */
        private Integer f41687g;

        public interface a {

            /* renamed from: com.ui.sso.api.UiAccountApi$d$a$a, reason: collision with other inner class name */
            public static final class C1338a implements a {

                /* renamed from: a, reason: collision with root package name */
                private final String f41688a;

                /* renamed from: b, reason: collision with root package name */
                private final Throwable f41689b;

                public C1338a(String pkg, Throwable error) {
                    AbstractC6492s.i(pkg, "pkg");
                    AbstractC6492s.i(error, "error");
                    this.f41688a = pkg;
                    this.f41689b = error;
                }

                public String a() {
                    return this.f41688a;
                }

                public String toString() {
                    String str;
                    String message;
                    String strA = a();
                    String message2 = this.f41689b.getMessage();
                    Throwable cause = this.f41689b.getCause();
                    if (cause == null || (message = cause.getMessage()) == null) {
                        str = null;
                    } else {
                        str = "CAUSE: " + message;
                    }
                    return "pkg:'" + strA + "' FAILED - " + message2 + " " + str;
                }
            }

            public static final class b implements a {

                /* renamed from: a, reason: collision with root package name */
                private final c f41690a;

                public b(c state) {
                    AbstractC6492s.i(state, "state");
                    this.f41690a = state;
                }

                public String a() {
                    return this.f41690a.d();
                }

                public String toString() {
                    return "pkg:'" + a() + "' STATE - " + this.f41690a;
                }
            }
        }

        public final List a() {
            return this.f41682b;
        }

        public final Set b() {
            return this.f41684d;
        }

        public final Set c() {
            return this.f41685e;
        }

        public final Set d() {
            return this.f41683c;
        }

        public final void e(a aVar) {
            this.f41681a = aVar;
        }

        public final void f(c cVar) {
            this.f41686f = cVar;
        }

        public final void g(Integer num) {
            this.f41687g = num;
        }

        public String toString() {
            return "Account API Support File { \nFINAL API:\n\t" + this.f41686f + "\nRETRY COUNT: " + this.f41687g + "\nDirect API:\n\t" + this.f41681a + "\nCNT PROVIDER API:\n\t" + AbstractC3689v.z0(this.f41682b, "\n\t", null, null, 0, null, null, 62, null) + "\nCNT Provider authorities with an API: \n\t" + AbstractC3689v.z0(this.f41685e, "\n\t", null, null, 0, null, null, 62, null) + "\nCNT Provider authorities with an API: \n\t" + AbstractC3689v.z0(this.f41685e, "'\n\t", null, null, 0, null, null, 62, null) + "\nCNT Provider packages: \n\t" + AbstractC3689v.z0(this.f41683c, "\n\t", null, null, 0, null, null, 62, null) + "\nCNT Provider authorities: \n\t " + AbstractC3689v.z0(this.f41684d, "\n\t", null, null, 0, null, null, 62, null) + "\n}";
        }
    }

    InterfaceC3220g a();

    Object b(Na.b bVar, InterfaceC5380e interfaceC5380e);

    Object c(UUID uuid, InterfaceC5380e interfaceC5380e);

    Object d(UUID uuid, a.EnumC1372a enumC1372a, InterfaceC5380e interfaceC5380e);

    Object e(UUID uuid, a.EnumC1372a enumC1372a, InterfaceC5380e interfaceC5380e);

    InterfaceC3220g f();

    Object g(UUID uuid, com.ui.sso.auth.a aVar, InterfaceC5380e interfaceC5380e);

    c getState();

    Object h(InterfaceC5380e interfaceC5380e);

    d i();
}
