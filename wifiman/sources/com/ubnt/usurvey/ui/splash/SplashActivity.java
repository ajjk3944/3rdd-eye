package com.ubnt.usurvey.ui.splash;

import C1.c;
import Yg.J;
import Yg.m;
import android.annotation.SuppressLint;
import android.os.Bundle;
import com.ubnt.usurvey.ui.splash.SplashActivity;
import f8.h1;
import gg.AbstractC5912b;
import h8.EnumC5958c;
import h8.InterfaceC5966k;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import mh.InterfaceC6824a;
import org.kodein.di.d;
import org.kodein.type.i;
import org.kodein.type.o;
import org.kodein.type.s;
import org.snmp4j.util.SnmpConfigurator;
import th.l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/ubnt/usurvey/ui/splash/SplashActivity;", "Lf8/h1;", "<init>", "()V", "LC1/c;", "LYg/J;", "T1", "(LC1/c;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/ubnt/usurvey/ui/splash/SplashActivity$b;", "n1", "LYg/m;", "R1", "()Lcom/ubnt/usurvey/ui/splash/SplashActivity$b;", "controller", "o1", SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_AUTH_PROTOCOL, "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"CustomSplashScreen"})
/* loaded from: classes3.dex */
public final class SplashActivity extends h1 {

    /* renamed from: n1, reason: collision with root package name and from kotlin metadata */
    private final m controller;

    /* renamed from: p1, reason: collision with root package name */
    static final /* synthetic */ l[] f40964p1 = {O.h(new F(SplashActivity.class, "controller", "getController()Lcom/ubnt/usurvey/ui/splash/SplashActivity$Controller;", 0))};

    /* renamed from: q1, reason: collision with root package name */
    public static final int f40965q1 = 8;

    public interface b {
        AbstractC5912b a();

        boolean b();
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends o<b> {
    }

    public SplashActivity() {
        i iVarE = s.e(new c().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.controller = d.a(this, new org.kodein.type.d(iVarE, b.class), null).a(this, f40964p1[0]);
    }

    private final b R1() {
        return (b) this.controller.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J S1() {
        Z7.b.g("Splash screen APP Setup completed", "SPLASH");
        return J.f24997a;
    }

    private final void T1(C1.c cVar) {
        cVar.c(new c.d() { // from class: F8.b
            @Override // C1.c.d
            public final boolean a() {
                return SplashActivity.U1(this.f6033a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean U1(SplashActivity splashActivity) {
        Z7.b.h("Splash screen check.", null, 2, null);
        if (splashActivity.R1().b()) {
            Z7.b.g("Splash screen dismissed.", "SPLASH");
        }
        return !splashActivity.R1().b();
    }

    @Override // f8.h1, g8.l, androidx.fragment.app.AbstractActivityC3999j, c.AbstractActivityC4155j, s1.g, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        T1(C1.c.f2174b.a(this));
        super.onCreate(savedInstanceState);
        InterfaceC5966k.a.o(this, R1().a(), EnumC5958c.DESTROYED, null, false, new InterfaceC6824a() { // from class: F8.a
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return SplashActivity.S1();
            }
        }, 6, null);
    }
}
