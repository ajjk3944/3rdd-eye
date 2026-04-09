package com.ubnt.usurvey;

import Fd.v;
import I7.C2997g;
import I7.InterfaceC2985a;
import X7.u;
import Yg.J;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import ca.C4234a;
import com.ubnt.teleport.unifi.UnifiTeleportTunnel;
import com.ubnt.teleport.unifi.cloud.TeleportCloud;
import com.ubnt.usurvey.WifimanApplication;
import com.ui.core.ui.sso.UiSSO;
import com.ui.speedtest.UiSpeedtestLib;
import com.ui.sso.api.UiAccountApi;
import com.ui.uidb.UiDB;
import com.ui.unifi.core.base.net.exceptions.ApiRequestException;
import com.ui.unifi.core.base.net.webrtc.WebRtcClientDisconnectedException;
import com.ui.wmw.WMWizard;
import e9.C5430b;
import i9.InterfaceC6137a;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import j8.InterfaceC6259a;
import j9.C6260a;
import java.net.UnknownHostException;
import java.util.concurrent.TimeoutException;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.O;
import ld.InterfaceC6575b;
import mh.InterfaceC6835l;
import org.kodein.di.DI;
import org.kodein.di.c;
import org.kodein.type.o;
import org.kodein.type.s;
import org.snmp4j.util.SnmpConfigurator;
import retrofit2.HttpException;
import rj.AbstractC7726l2;
import rj.InterfaceC7810x2;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006*²\u0006\f\u0010\u001f\u001a\u00020\u001e8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001f\u001a\u00020\u001e8\nX\u008a\u0084\u0002²\u0006\f\u0010!\u001a\u00020 8\nX\u008a\u0084\u0002²\u0006\f\u0010#\u001a\u00020\"8\nX\u008a\u0084\u0002²\u0006\f\u0010%\u001a\u00020$8\nX\u008a\u0084\u0002²\u0006\f\u0010'\u001a\u00020&8\nX\u008a\u0084\u0002²\u0006\f\u0010)\u001a\u00020(8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/ubnt/usurvey/WifimanApplication;", "Landroid/app/Application;", "Lorg/kodein/di/c;", "<init>", "()V", "LYg/J;", "k", "h", SnmpConfigurator.O_OPERATION, "m", "z", SnmpConfigurator.O_TIMEOUT, "B", "s", "onCreate", "Landroid/content/Context;", "base", "attachBaseContext", "(Landroid/content/Context;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", SnmpConfigurator.O_RETRIES, "Lorg/kodein/di/DI;", SnmpConfigurator.O_AUTH_PROTOCOL, "Lorg/kodein/di/DI;", "d", "()Lorg/kodein/di/DI;", "di", "LY7/a;", "localeService", "LQ7/a;", "crashReporting", "Lld/b;", "sessionManager", "Lj8/a;", "themeManager", "LI7/a;", "teleport", "LFd/v;", "teleportNotification", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class WifimanApplication extends Application implements org.kodein.di.c {

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ th.l[] f39645b = {O.g(new D(WifimanApplication.class, "localeService", "<v#0>", 0)), O.g(new D(WifimanApplication.class, "localeService", "<v#1>", 0)), O.g(new D(WifimanApplication.class, "crashReporting", "<v#2>", 0)), O.g(new D(WifimanApplication.class, "sessionManager", "<v#3>", 0)), O.g(new D(WifimanApplication.class, "themeManager", "<v#4>", 0)), O.g(new D(WifimanApplication.class, "teleport", "<v#5>", 0)), O.g(new D(WifimanApplication.class, "teleportNotification", "<v#6>", 0))};

    /* renamed from: c, reason: collision with root package name */
    public static final int f39646c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final DI di = DI.c.d(DI.f56898e1, false, new InterfaceC6835l() { // from class: O7.g
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return WifimanApplication.g(this.f17625a, (DI.f) obj);
        }
    }, 1, null).getDi();

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends o<Y7.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends o<Y7.a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends o<Q7.a> {
    }

    public static final class d implements P9.j {
        d() {
        }

        @Override // P9.j
        public String a() {
            return C4234a.b("6LdLj8UoAAAAAB-hODMJzDENcTy2lcnvP-sfl-9Q");
        }
    }

    public static final class e implements InterfaceC6137a {

        /* renamed from: a, reason: collision with root package name */
        private final String f39648a = "UiAccount";

        e() {
        }

        @Override // i9.InterfaceC6137a
        public void a(String message, Throwable th2) {
            AbstractC6492s.i(message, "message");
            Z7.b.c(message, th2, this.f39648a);
        }

        @Override // i9.InterfaceC6137a
        public void b(String message) {
            AbstractC6492s.i(message, "message");
            Z7.b.g(message, this.f39648a);
        }

        @Override // i9.InterfaceC6137a
        public void c(String message, Throwable th2) {
            AbstractC6492s.i(message, "message");
            Z7.b.i(message, th2, this.f39648a);
        }
    }

    public static final class f implements InterfaceC6137a {

        /* renamed from: a, reason: collision with root package name */
        private final String f39649a = "SPEEDLib";

        f() {
        }

        @Override // i9.InterfaceC6137a
        public void a(String message, Throwable th2) {
            AbstractC6492s.i(message, "message");
            Z7.b.c(message, th2, this.f39649a);
        }

        @Override // i9.InterfaceC6137a
        public void b(String message) {
            AbstractC6492s.i(message, "message");
            Z7.b.g(message, this.f39649a);
        }

        @Override // i9.InterfaceC6137a
        public void c(String message, Throwable th2) {
            AbstractC6492s.i(message, "message");
            Z7.b.i(message, th2, this.f39649a);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class g extends o<InterfaceC2985a> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class h extends o<v> {
    }

    static final class i implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final i f39650a = new i();

        i() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable error) {
            AbstractC6492s.i(error, "error");
            Z7.b.e("Error in Teleport notification subscriber", error, null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class j extends o<InterfaceC6575b> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class k extends o<InterfaceC6259a> {
    }

    public static final class l implements InterfaceC6137a {

        /* renamed from: a, reason: collision with root package name */
        private final String f39651a = "WMW";

        l() {
        }

        @Override // i9.InterfaceC6137a
        public void a(String message, Throwable th2) {
            AbstractC6492s.i(message, "message");
            Z7.b.c(message, th2, this.f39651a);
        }

        @Override // i9.InterfaceC6137a
        public void b(String message) {
            AbstractC6492s.i(message, "message");
            Z7.b.g(message, this.f39651a);
        }

        @Override // i9.InterfaceC6137a
        public void c(String message, Throwable th2) {
            AbstractC6492s.i(message, "message");
            Z7.b.i(message, th2, this.f39651a);
        }
    }

    public static final class m implements InterfaceC6137a {

        /* renamed from: a, reason: collision with root package name */
        private final String f39652a = "BTLE";

        m() {
        }

        @Override // i9.InterfaceC6137a
        public void a(String message, Throwable th2) {
            AbstractC6492s.i(message, "message");
            Z7.b.c(message, th2, this.f39652a);
        }

        @Override // i9.InterfaceC6137a
        public void b(String message) {
            AbstractC6492s.i(message, "message");
            Z7.b.g(message, this.f39652a);
        }

        @Override // i9.InterfaceC6137a
        public void c(String message, Throwable th2) {
            AbstractC6492s.i(message, "message");
            Z7.b.i(message, th2, this.f39652a);
        }
    }

    public static final class n implements InterfaceC6137a {

        /* renamed from: a, reason: collision with root package name */
        private final String f39653a = "UICom";

        n() {
        }

        @Override // i9.InterfaceC6137a
        public void a(String message, Throwable th2) {
            AbstractC6492s.i(message, "message");
            Z7.b.c(message, th2, this.f39653a);
        }

        @Override // i9.InterfaceC6137a
        public void b(String message) {
            AbstractC6492s.i(message, "message");
            Z7.b.g(message, this.f39653a);
        }

        @Override // i9.InterfaceC6137a
        public void c(String message, Throwable th2) {
            AbstractC6492s.i(message, "message");
            Z7.b.i(message, th2, this.f39653a);
        }
    }

    private static final InterfaceC6259a A(Yg.m mVar) {
        return (InterfaceC6259a) mVar.getValue();
    }

    private final void B() {
        WMWizard.f45247a.d(new l());
        T8.a.f21453a.b(new m());
        C5430b.f46259a.b(new n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J g(WifimanApplication wifimanApplication, DI.f lazy) {
        AbstractC6492s.i(lazy, "$this$lazy");
        DI.b.a.a(lazy, u.e(wifimanApplication), false, 2, null);
        return J.f24997a;
    }

    private final void h() {
        o7.o.f55558a.e(this);
    }

    private static final Y7.a j(Yg.m mVar) {
        return (Y7.a) mVar.getValue();
    }

    private final void k() {
        org.kodein.type.i iVarE = s.e(new b().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        l(org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, Y7.a.class), null).a(null, f39645b[1])).b(this);
    }

    private static final Y7.a l(Yg.m mVar) {
        return (Y7.a) mVar.getValue();
    }

    private final void m() {
        org.kodein.type.i iVarE = s.e(new c().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        n(org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, Q7.a.class), null).a(null, f39645b[2])).b(this);
    }

    private static final Q7.a n(Yg.m mVar) {
        return (Q7.a) mVar.getValue();
    }

    private final void o() {
        final InterfaceC6835l interfaceC6835l = new InterfaceC6835l() { // from class: O7.j
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return WifimanApplication.p((Throwable) obj);
            }
        };
        Eg.a.E(new C6260a(interfaceC6835l, new InterfaceC6835l() { // from class: O7.k
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return WifimanApplication.q(interfaceC6835l, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J p(Throwable it) {
        AbstractC6492s.i(it, "it");
        Z7.b.e("Undeliverable exception in RxStream", it, null, 4, null);
        return J.f24997a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J q(InterfaceC6835l interfaceC6835l, Throwable error) throws Throwable {
        AbstractC6492s.i(error, "error");
        if (error instanceof OnErrorNotImplementedException) {
            Z7.b.j("Throwing uncaught Rx stream error", error, null, 4, null);
            throw error;
        }
        if ((error instanceof HttpException) || (error instanceof UnknownHostException) || WMWizard.f45247a.e(error) || (error instanceof Wc.d) || (error instanceof TeleportCloud.Error) || (error instanceof UnifiTeleportTunnel.Error) || (error instanceof WebRtcClientDisconnectedException) || (error instanceof UiAccountApi.Error) || (error instanceof TimeoutException) || (error instanceof ApiRequestException) || (((error instanceof RuntimeException) && (error.getCause() instanceof ApiRequestException)) || (error instanceof UiSpeedtestLib.Error) || (error instanceof UiDB.Error))) {
            return J.f24997a;
        }
        interfaceC6835l.invoke(error);
        throw new UndeliverableException(error);
    }

    private final void s() {
        UiSpeedtestLib.f41625a.b(new f());
    }

    private final void t() {
        C2997g c2997g = C2997g.f8908a;
        c2997g.h(new J8.a());
        c2997g.g(false);
        c2997g.f(new UnifiTeleportTunnel.b(new UnifiTeleportTunnel.b.a.C1245a(2, 1000L), 1280));
        org.kodein.type.i iVarE = s.e(new g().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, InterfaceC2985a.class), null);
        th.l[] lVarArr = f39645b;
        x(interfaceC7810x2A.a(null, lVarArr[5])).c(new InterfaceC6835l() { // from class: O7.h
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return WifimanApplication.u((Throwable) obj);
            }
        });
        org.kodein.type.i iVarE2 = s.e(new h().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        v(org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, v.class), null).a(null, lVarArr[6])).a().W(Gg.a.d()).U(new InterfaceC6464a() { // from class: O7.i
            @Override // kg.InterfaceC6464a
            public final void run() {
                WifimanApplication.w();
            }
        }, i.f39650a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J u(Throwable error) {
        AbstractC6492s.i(error, "error");
        Z7.b.j("Teleport Always on tunnel restore failed", error, null, 4, null);
        return J.f24997a;
    }

    private static final v v(Yg.m mVar) {
        return (v) mVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w() {
    }

    private static final InterfaceC2985a x(Yg.m mVar) {
        return (InterfaceC2985a) mVar.getValue();
    }

    private final void z() {
        org.kodein.type.i iVarE = s.e(new j().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, InterfaceC6575b.class), null);
        th.l[] lVarArr = f39645b;
        interfaceC7810x2A.a(null, lVarArr[3]);
        org.kodein.type.i iVarE2 = s.e(new k().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        A(org.kodein.di.d.a(this, new org.kodein.type.d(iVarE2, InterfaceC6259a.class), null).a(null, lVarArr[4])).b();
    }

    @Override // org.kodein.di.c
    public org.kodein.di.f I() {
        return c.a.a(this);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context base) {
        AbstractC6492s.i(base, "base");
        super.attachBaseContext(base);
        com.ubnt.usurvey.a.f39654r.b(this);
        r();
    }

    @Override // org.kodein.di.c
    /* renamed from: d, reason: from getter */
    public DI getDi() {
        return this.di;
    }

    @Override // org.kodein.di.c
    public AbstractC7726l2 i() {
        c.a.b(this);
        return null;
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC6492s.i(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        org.kodein.type.i iVarE = s.e(new a().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        j(org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, Y7.a.class), null).a(null, f39645b[0])).c(this, newConfig);
    }

    @Override // android.app.Application
    public void onCreate() throws Resources.NotFoundException {
        super.onCreate();
        o();
        long jCurrentTimeMillis = System.currentTimeMillis();
        R8.a.f19591a.a(this);
        Z7.b.h("GoogleServiceProviderUtil init took " + (System.currentTimeMillis() - jCurrentTimeMillis), null, 2, null);
        m();
        k();
        t();
        h();
        z();
        B();
        s();
    }

    public void r() {
        UiSSO uiSSO = UiSSO.f41376a;
        uiSSO.e();
        uiSSO.d(new d());
        P9.n nVar = P9.n.f18488a;
        nVar.k(com.ubnt.usurvey.a.f39654r.a().getConfig().n());
        nVar.i("wifiman/android");
        nVar.j("2.12.1");
        Ma.a.f13069a.d(new e());
    }
}
