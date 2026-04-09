package com.ui.core.ui.sso.login;

import Ab.a;
import Eb.SsoUser;
import Eb.TwoFaRequiredResponse;
import H.l;
import Ii.N;
import Li.F;
import Li.InterfaceC3220g;
import Li.P;
import Li.y;
import Li.z;
import Q9.j;
import U9.AbstractC3618e;
import U9.C3615b;
import Yg.J;
import Yg.v;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.E;
import com.ui.core.ui.sso.SSOAccountVM;
import com.ui.core.ui.sso.UiSSO;
import com.ui.core.ui.sso.a;
import com.ui.core.ui.sso.c;
import com.ui.core.ui.sso.login.UiLoginVMImpl;
import com.ui.core.ui.sso.login.g;
import com.ui.unifi.core.http.exceptions.UnauthorisedException;
import com.ui.unifi.core.sso.exceptions.EmailNotVerifiedException;
import com.ui.unifi.core.sso.exceptions.TwoFaRequiredException;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import ga.C5884a;
import gg.AbstractC5912b;
import gg.D;
import hg.InterfaceC6043c;
import ia.AbstractC6138a;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import ka.InterfaceC6411a;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import org.snmp4j.util.SnmpConfigurator;
import retrofit2.HttpException;
import s9.d;

/* loaded from: classes3.dex */
public final class UiLoginVMImpl extends com.ui.core.ui.sso.login.g {

    /* renamed from: w, reason: collision with root package name */
    public static final a f41471w = new a(null);

    /* renamed from: x, reason: collision with root package name */
    public static final int f41472x = 8;

    /* renamed from: y, reason: collision with root package name */
    private static final b f41473y = b.IDLE;

    /* renamed from: e, reason: collision with root package name */
    private final SSOAccountVM f41474e;

    /* renamed from: f, reason: collision with root package name */
    private final E f41475f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC6411a f41476g;

    /* renamed from: h, reason: collision with root package name */
    private final z f41477h;

    /* renamed from: i, reason: collision with root package name */
    private final l f41478i;

    /* renamed from: j, reason: collision with root package name */
    private final z f41479j;

    /* renamed from: k, reason: collision with root package name */
    private final z f41480k;

    /* renamed from: l, reason: collision with root package name */
    private final z f41481l;

    /* renamed from: m, reason: collision with root package name */
    private final l f41482m;

    /* renamed from: n, reason: collision with root package name */
    private final z f41483n;

    /* renamed from: o, reason: collision with root package name */
    private final z f41484o;

    /* renamed from: p, reason: collision with root package name */
    private final z f41485p;

    /* renamed from: q, reason: collision with root package name */
    private final z f41486q;

    /* renamed from: r, reason: collision with root package name */
    private final z f41487r;

    /* renamed from: s, reason: collision with root package name */
    private final Fg.c f41488s;

    /* renamed from: t, reason: collision with root package name */
    private b f41489t;

    /* renamed from: u, reason: collision with root package name */
    private final y f41490u;

    /* renamed from: v, reason: collision with root package name */
    private final InterfaceC3220g f41491v;

    private static abstract class LoginProcessError extends RuntimeException {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/core/ui/sso/login/UiLoginVMImpl$LoginProcessError$EmailNotVerified;", "Lcom/ui/core/ui/sso/login/UiLoginVMImpl$LoginProcessError;", "<init>", "()V", "core-ui-sso_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class EmailNotVerified extends LoginProcessError {
            public EmailNotVerified() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/core/ui/sso/login/UiLoginVMImpl$LoginProcessError$InvalidCredentials;", "Lcom/ui/core/ui/sso/login/UiLoginVMImpl$LoginProcessError;", "<init>", "()V", "core-ui-sso_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class InvalidCredentials extends LoginProcessError {
            public InvalidCredentials() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH×\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH×\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ui/core/ui/sso/login/UiLoginVMImpl$LoginProcessError$Network;", "Lcom/ui/core/ui/sso/login/UiLoginVMImpl$LoginProcessError;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "core-ui-sso_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Network extends LoginProcessError {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Throwable cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Network(Throwable cause) {
                super(null);
                AbstractC6492s.i(cause, "cause");
                this.cause = cause;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Network) && AbstractC6492s.d(this.cause, ((Network) other).cause);
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.cause;
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "Network(cause=" + this.cause + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H×\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH×\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH×\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/ui/core/ui/sso/login/UiLoginVMImpl$LoginProcessError$TwoFARequired;", "Lcom/ui/core/ui/sso/login/UiLoginVMImpl$LoginProcessError;", "Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;", "cause", "<init>", "(Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;", "()Lcom/ui/unifi/core/sso/exceptions/TwoFaRequiredException;", "core-ui-sso_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TwoFARequired extends LoginProcessError {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final TwoFaRequiredException cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TwoFARequired(TwoFaRequiredException cause) {
                super(null);
                AbstractC6492s.i(cause, "cause");
                this.cause = cause;
            }

            @Override // java.lang.Throwable
            /* renamed from: a, reason: from getter */
            public TwoFaRequiredException getCause() {
                return this.cause;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TwoFARequired) && AbstractC6492s.d(this.cause, ((TwoFARequired) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            @Override // java.lang.Throwable
            public String toString() {
                return "TwoFARequired(cause=" + this.cause + ")";
            }
        }

        public /* synthetic */ LoginProcessError(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private LoginProcessError() {
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class b {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b IDLE = new b("IDLE", 0);
        public static final b LOGGING_IN = new b("LOGGING_IN", 1);
        public static final b SUCCESS = new b("SUCCESS", 2);

        private static final /* synthetic */ b[] $values() {
            return new b[]{IDLE, LOGGING_IN, SUCCESS};
        }

        static {
            b[] bVarArr$values = $values();
            $VALUES = bVarArr$values;
            $ENTRIES = AbstractC5827b.a(bVarArr$values);
        }

        private b(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    private static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final g.b f41494a;

        /* renamed from: b, reason: collision with root package name */
        private final String f41495b;

        /* renamed from: c, reason: collision with root package name */
        private final String f41496c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC6492s.i(parcel, "parcel");
                return new c(g.b.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(g.b scene, String username, String password) {
            AbstractC6492s.i(scene, "scene");
            AbstractC6492s.i(username, "username");
            AbstractC6492s.i(password, "password");
            this.f41494a = scene;
            this.f41495b = username;
            this.f41496c = password;
        }

        public final String a() {
            return this.f41496c;
        }

        public final g.b b() {
            return this.f41494a;
        }

        public final String c() {
            return this.f41495b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f41494a == cVar.f41494a && AbstractC6492s.d(this.f41495b, cVar.f41495b) && AbstractC6492s.d(this.f41496c, cVar.f41496c);
        }

        public int hashCode() {
            return (((this.f41494a.hashCode() * 31) + this.f41495b.hashCode()) * 31) + this.f41496c.hashCode();
        }

        public String toString() {
            return "SavedState(scene=" + this.f41494a + ", username=" + this.f41495b + ", password=" + this.f41496c + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i10) {
            AbstractC6492s.i(dest, "dest");
            dest.writeString(this.f41494a.name());
            dest.writeString(this.f41495b);
            dest.writeString(this.f41496c);
        }
    }

    private static abstract class d {

        public static final class a extends d {

            /* renamed from: a, reason: collision with root package name */
            private final String f41497a;

            /* renamed from: b, reason: collision with root package name */
            private final String f41498b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String username, String password) {
                super(null);
                AbstractC6492s.i(username, "username");
                AbstractC6492s.i(password, "password");
                this.f41497a = username;
                this.f41498b = password;
            }

            public final String a() {
                return this.f41498b;
            }

            public final String b() {
                return this.f41497a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return AbstractC6492s.d(this.f41497a, aVar.f41497a) && AbstractC6492s.d(this.f41498b, aVar.f41498b);
            }

            public int hashCode() {
                return (this.f41497a.hashCode() * 31) + this.f41498b.hashCode();
            }

            public String toString() {
                return "Authenticate(username=" + this.f41497a + ", password=" + this.f41498b + ")";
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    public /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f41499a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.LOGGING_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f41499a = iArr;
        }
    }

    static final class f implements n {
        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UiSSO.a apply(SsoUser it) {
            AbstractC6492s.i(it, "it");
            return C5884a.b(C5884a.f47755a, it, UiLoginVMImpl.this.f41474e.r0().h(), UiLoginVMImpl.this.f41474e.r0().e(), false, 8, null);
        }
    }

    static final class g implements n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d.a f41502b;

        g(d.a aVar) {
            this.f41502b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c() {
            return "Sign in failed with unexpected error!";
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final D apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            if (error instanceof TwoFaRequiredException) {
                UiLoginVMImpl.this.f41474e.r0().h().n(this.f41502b.a());
                return gg.z.p(new LoginProcessError.TwoFARequired((TwoFaRequiredException) error));
            }
            if (error instanceof UnauthorisedException) {
                return gg.z.p(new LoginProcessError.InvalidCredentials());
            }
            if (error instanceof EmailNotVerifiedException) {
                return gg.z.p(new LoginProcessError.EmailNotVerified());
            }
            if ((error instanceof HttpException) || (error instanceof IOException)) {
                return gg.z.p(new LoginProcessError.Network(error));
            }
            S9.a.c(new InterfaceC6824a() { // from class: com.ui.core.ui.sso.login.h
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return UiLoginVMImpl.g.c();
                }
            }, error);
            return gg.z.p(error);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f41503a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ UiSSO.a f41505c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(UiSSO.a aVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f41505c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return UiLoginVMImpl.this.new h(this.f41505c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f41503a;
            if (i10 == 0) {
                v.b(obj);
                c.a aVarC = UiLoginVMImpl.this.f41474e.r0().c();
                UiSSO.a aVar = this.f41505c;
                this.f41503a = 1;
                if (aVarC.G(aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((h) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class i implements n {

        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UiLoginVMImpl f41507a;

            /* renamed from: com.ui.core.ui.sso.login.UiLoginVMImpl$i$a$a, reason: collision with other inner class name */
            static final class C1324a implements InterfaceC6469f {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ UiLoginVMImpl f41508a;

                C1324a(UiLoginVMImpl uiLoginVMImpl) {
                    this.f41508a = uiLoginVMImpl;
                }

                @Override // kg.InterfaceC6469f
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void accept(InterfaceC6043c it) {
                    AbstractC6492s.i(it, "it");
                    this.f41508a.K0(b.SUCCESS);
                }
            }

            a(UiLoginVMImpl uiLoginVMImpl) {
                this.f41507a = uiLoginVMImpl;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(UiSSO.a authResponse) {
                AbstractC6492s.i(authResponse, "authResponse");
                return this.f41507a.D0(authResponse).B(new C1324a(this.f41507a));
            }
        }

        static final class b implements InterfaceC6469f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UiLoginVMImpl f41509a;

            b(UiLoginVMImpl uiLoginVMImpl) {
                this.f41509a = uiLoginVMImpl;
            }

            @Override // kg.InterfaceC6469f
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void accept(InterfaceC6043c it) {
                AbstractC6492s.i(it, "it");
                this.f41509a.K0(b.LOGGING_IN);
            }
        }

        static final class c implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UiLoginVMImpl f41510a;

            public static final class a implements Callable {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ UiLoginVMImpl f41511a;

                public a(UiLoginVMImpl uiLoginVMImpl) {
                    this.f41511a = uiLoginVMImpl;
                }

                public final void a() {
                    this.f41511a.f41476g.a(InterfaceC6411a.EnumC1899a.TICK);
                    this.f41511a.L0(new d.b(P9.b.f18451m));
                }

                @Override // java.util.concurrent.Callable
                public /* bridge */ /* synthetic */ Object call() {
                    a();
                    return J.f24997a;
                }
            }

            public static final class b implements Callable {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ UiLoginVMImpl f41512a;

                public b(UiLoginVMImpl uiLoginVMImpl) {
                    this.f41512a = uiLoginVMImpl;
                }

                public final void a() {
                    this.f41512a.L0(new d.b(P9.b.f18453n));
                }

                @Override // java.util.concurrent.Callable
                public /* bridge */ /* synthetic */ Object call() {
                    a();
                    return J.f24997a;
                }
            }

            /* renamed from: com.ui.core.ui.sso.login.UiLoginVMImpl$i$c$c, reason: collision with other inner class name */
            public static final class CallableC1325c implements Callable {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ UiLoginVMImpl f41513a;

                public CallableC1325c(UiLoginVMImpl uiLoginVMImpl) {
                    this.f41513a = uiLoginVMImpl;
                }

                public final void a() {
                    this.f41513a.f41476g.a(InterfaceC6411a.EnumC1899a.TICK);
                    this.f41513a.L0(new d.b(P9.b.f18447k));
                }

                @Override // java.util.concurrent.Callable
                public /* bridge */ /* synthetic */ Object call() {
                    a();
                    return J.f24997a;
                }
            }

            c(UiLoginVMImpl uiLoginVMImpl) {
                this.f41510a = uiLoginVMImpl;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String c() {
                return "Unexpected error in sign in process";
            }

            @Override // kg.n
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final gg.f apply(Throwable error) {
                AbstractC6492s.i(error, "error");
                boolean z10 = error instanceof LoginProcessError.TwoFARequired;
                if (!z10) {
                    this.f41510a.K0(b.IDLE);
                }
                if (z10) {
                    return this.f41510a.I0(((LoginProcessError.TwoFARequired) error).getCause());
                }
                if (error instanceof LoginProcessError.InvalidCredentials) {
                    AbstractC5912b abstractC5912bF = AbstractC5912b.F(new a(this.f41510a));
                    AbstractC6492s.h(abstractC5912bF, "fromCallable(...)");
                    return abstractC5912bF;
                }
                if (error instanceof LoginProcessError.Network) {
                    AbstractC5912b abstractC5912bF2 = AbstractC5912b.F(new b(this.f41510a));
                    AbstractC6492s.h(abstractC5912bF2, "fromCallable(...)");
                    return abstractC5912bF2;
                }
                if (!(error instanceof LoginProcessError.EmailNotVerified)) {
                    S9.a.c(new InterfaceC6824a() { // from class: com.ui.core.ui.sso.login.j
                        @Override // mh.InterfaceC6824a
                        public final Object invoke() {
                            return UiLoginVMImpl.i.c.c();
                        }
                    }, error);
                    return AbstractC5912b.D(error);
                }
                AbstractC5912b abstractC5912bF3 = AbstractC5912b.F(new CallableC1325c(this.f41510a));
                AbstractC6492s.h(abstractC5912bF3, "fromCallable(...)");
                return abstractC5912bF3;
            }
        }

        i() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(UiLoginVMImpl uiLoginVMImpl) {
            uiLoginVMImpl.K0(b.IDLE);
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(d dVar) {
            if (!(dVar instanceof d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC5912b abstractC5912bG = UiLoginVMImpl.this.B0((d.a) dVar).t(new a(UiLoginVMImpl.this)).B(new b(UiLoginVMImpl.this)).O(new c(UiLoginVMImpl.this)).g(AbstractC5912b.a0(1L, TimeUnit.SECONDS));
            final UiLoginVMImpl uiLoginVMImpl = UiLoginVMImpl.this;
            return abstractC5912bG.x(new InterfaceC6464a() { // from class: com.ui.core.ui.sso.login.i
                @Override // kg.InterfaceC6464a
                public final void run() {
                    UiLoginVMImpl.i.c(uiLoginVMImpl);
                }
            });
        }
    }

    static final class j implements InterfaceC6469f {
        j() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            UiLoginVMImpl.this.K0(b.IDLE);
        }
    }

    public static final class k implements Callable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TwoFaRequiredException f41515a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ UiLoginVMImpl f41516b;

        public k(TwoFaRequiredException twoFaRequiredException, UiLoginVMImpl uiLoginVMImpl) {
            this.f41515a = twoFaRequiredException;
            this.f41516b = uiLoginVMImpl;
        }

        public final void a() {
            C3615b c3615bC;
            String strA;
            TwoFaRequiredResponse response;
            UiSSO.e eVar = null;
            try {
                response = this.f41515a.getResponse();
            } catch (UiSSO.Error.InvalidMFAParams unused) {
                this.f41516b.L0(new d.b(P9.b.f18449l));
                c3615bC = null;
            }
            if (response == null || (c3615bC = AbstractC3618e.c(response)) == null) {
                throw new UiSSO.Error.InvalidMFAParams("mfa params unavailable");
            }
            if (c3615bC != null) {
                if (AbstractC6138a.a(this.f41516b.f41474e.r0().e())) {
                    UiSSO.e eVarE = this.f41516b.f41474e.r0().e();
                    if (eVarE == null || (strA = eVarE.a()) == null) {
                        strA = "S256";
                    }
                    UiSSO.e eVarE2 = this.f41516b.f41474e.r0().e();
                    eVar = new UiSSO.e(strA, eVarE2 != null ? eVarE2.b() : null);
                }
                y yVar = this.f41516b.f41490u;
                String strZ = this.f41516b.f41474e.r0().h().z();
                if (strZ == null) {
                    throw new UiSSO.Error.MissingMFAToken("mfa token was not set");
                }
                yVar.j(new g.a.b(new UiSSO.d(strZ, c3615bC), eVar));
            }
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ Object call() {
            a();
            return J.f24997a;
        }
    }

    public UiLoginVMImpl(SSOAccountVM sessionVM, E savedState, InterfaceC6411a vibrator) {
        l lVarL0;
        l lVarK0;
        AbstractC6492s.i(sessionVM, "sessionVM");
        AbstractC6492s.i(savedState, "savedState");
        AbstractC6492s.i(vibrator, "vibrator");
        this.f41474e = sessionVM;
        this.f41475f = savedState;
        this.f41476g = vibrator;
        this.f41477h = P.a(g.b.INITIAL);
        this.f41478i = new l("", 0L, 2, (DefaultConstructorMarker) null);
        Boolean bool = Boolean.TRUE;
        this.f41479j = P.a(bool);
        this.f41480k = P.a(new d.b(P9.b.f18441h));
        this.f41481l = P.a(bool);
        this.f41482m = new l("", 0L, 2, (DefaultConstructorMarker) null);
        this.f41483n = P.a(bool);
        this.f41484o = P.a(null);
        this.f41485p = P.a(new d.b(P9.b.f18443i));
        this.f41486q = P.a(Boolean.FALSE);
        this.f41487r = P.a(bool);
        Fg.c cVarJ2 = Fg.c.j2();
        AbstractC6492s.h(cVarJ2, "create(...)");
        this.f41488s = cVarJ2;
        c cVar = (c) savedState.d("saved_state_login");
        if (cVar != null) {
            F0().setValue(cVar.b());
            lVarL0 = l0();
            H.f fVarR = lVarL0.r();
            try {
                fVarR.append(cVar.c());
                lVarL0.d(fVarR);
                lVarL0.f();
                lVarK0 = k0();
                H.f fVarR2 = lVarK0.r();
                try {
                    fVarR2.append(cVar.a());
                    lVarK0.d(fVarR2);
                    lVarK0.f();
                } finally {
                }
            } finally {
            }
        } else {
            lVarL0 = l0();
            H.f fVarR3 = lVarL0.r();
            try {
                String str = (String) savedState.d("username");
                String str2 = "";
                fVarR3.append(str == null ? "" : str);
                lVarL0.d(fVarR3);
                lVarL0.f();
                lVarK0 = k0();
                H.f fVarR4 = lVarK0.r();
                try {
                    String str3 = (String) savedState.d("password");
                    if (str3 != null) {
                        str2 = str3;
                    }
                    fVarR4.append(str2);
                    lVarK0.d(fVarR4);
                } finally {
                }
            } finally {
            }
        }
        H0();
        b bVar = f41473y;
        this.f41489t = bVar;
        K0(bVar);
        y yVarB = F.b(0, 1, null, 5, null);
        this.f41490u = yVarB;
        this.f41491v = yVarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.z B0(d.a aVar) {
        gg.z zVarF = a.C0015a.b(this.f41474e.r0().g(), aVar.b(), aVar.a(), null, false, 12, null).A(new f()).F(new g(aVar));
        AbstractC6492s.h(zVarF, "onErrorResumeNext(...)");
        return zVarF;
    }

    private final void C0() {
        j0().setValue(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b D0(UiSSO.a aVar) {
        AbstractC5912b abstractC5912bP = AbstractC5912b.p(AbstractC5912b.a0(1000L, TimeUnit.MILLISECONDS), Qi.g.c(null, new h(aVar, null), 1, null));
        AbstractC6492s.h(abstractC5912bP, "concatArray(...)");
        return abstractC5912bP;
    }

    private final void H0() {
        InterfaceC6043c interfaceC6043cS = this.f41488s.L1(new i()).B(new j()).S();
        AbstractC6492s.h(interfaceC6043cS, "subscribe(...)");
        c0(interfaceC6043cS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b I0(TwoFaRequiredException twoFaRequiredException) {
        AbstractC5912b abstractC5912bF = AbstractC5912b.F(new k(twoFaRequiredException, this));
        AbstractC6492s.h(abstractC5912bF, "fromCallable(...)");
        return abstractC5912bF;
    }

    private final void J0() {
        K0(this.f41489t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K0(b bVar) {
        this.f41489t = bVar;
        int i10 = e.f41499a[bVar.ordinal()];
        if (i10 == 1) {
            z zVarE0 = E0();
            Boolean bool = Boolean.TRUE;
            zVarE0.setValue(bool);
            G0().setValue(bool);
            h0().setValue(Boolean.valueOf((t.m0(l0().i()) || t.m0(k0().i())) ? false : true));
            i0().setValue(new d.b(P9.b.f18443i));
            return;
        }
        if (i10 == 2) {
            z zVarE02 = E0();
            Boolean bool2 = Boolean.FALSE;
            zVarE02.setValue(bool2);
            G0().setValue(bool2);
            h0().setValue(bool2);
            i0().setValue(new d.b(P9.b.f18445j));
            C0();
            return;
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        z zVarE03 = E0();
        Boolean bool3 = Boolean.FALSE;
        zVarE03.setValue(bool3);
        G0().setValue(bool3);
        h0().setValue(bool3);
        i0().setValue(new d.c("✔"));
        C0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L0(s9.d dVar) {
        j0().setValue(dVar);
    }

    public z E0() {
        return this.f41483n;
    }

    public z F0() {
        return this.f41477h;
    }

    public z G0() {
        return this.f41479j;
    }

    @Override // R9.a
    public void Y() {
        F0().setValue(g.b.ANIMATED);
    }

    @Override // R9.a
    public void a0() {
        super.a0();
        this.f41475f.i("saved_state_login", new c((g.b) F0().getValue(), l0().i().toString(), k0().i().toString()));
    }

    @Override // com.ui.core.ui.sso.login.g
    public InterfaceC3220g b() {
        return this.f41491v;
    }

    @Override // com.ui.core.ui.sso.login.g
    public z e0() {
        return this.f41487r;
    }

    @Override // com.ui.core.ui.sso.login.g
    public z f0() {
        return this.f41481l;
    }

    @Override // com.ui.core.ui.sso.login.g
    public z g0() {
        return this.f41480k;
    }

    @Override // com.ui.core.ui.sso.login.g
    public z h0() {
        return this.f41486q;
    }

    @Override // com.ui.core.ui.sso.login.g
    public z i0() {
        return this.f41485p;
    }

    @Override // com.ui.core.ui.sso.login.g
    public z j0() {
        return this.f41484o;
    }

    @Override // com.ui.core.ui.sso.login.g
    public l k0() {
        return this.f41482m;
    }

    @Override // com.ui.core.ui.sso.login.g
    public l l0() {
        return this.f41478i;
    }

    @Override // com.ui.core.ui.sso.login.g
    public Object m0(InterfaceC5380e interfaceC5380e) {
        this.f41474e.X().b(new j.a.d(a.c.f41415a));
        return J.f24997a;
    }

    @Override // com.ui.core.ui.sso.login.g
    public void n0() {
        J0();
        C0();
    }

    @Override // com.ui.core.ui.sso.login.g
    public void o0() {
        this.f41490u.j(g.a.C1334a.f41573a);
    }

    @Override // com.ui.core.ui.sso.login.g
    public Object p0(InterfaceC5380e interfaceC5380e) {
        Object objR0;
        return (((Boolean) h0().getValue()).booleanValue() && (objR0 = r0(interfaceC5380e)) == AbstractC5467b.g()) ? objR0 : J.f24997a;
    }

    @Override // com.ui.core.ui.sso.login.g
    public Object q0(InterfaceC5380e interfaceC5380e) {
        this.f41474e.X().b(new j.a.d(a.d.f41417a));
        return J.f24997a;
    }

    @Override // com.ui.core.ui.sso.login.g
    public Object r0(InterfaceC5380e interfaceC5380e) {
        if (((Boolean) h0().getValue()).booleanValue()) {
            this.f41488s.h(new d.a(l0().i().toString(), k0().i().toString()));
        }
        return J.f24997a;
    }

    @Override // com.ui.core.ui.sso.login.g
    public void s0() {
        X().b(j.a.C0677a.f19270a);
    }
}
