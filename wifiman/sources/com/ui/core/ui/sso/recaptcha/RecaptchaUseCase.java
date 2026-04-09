package com.ui.core.ui.sso.recaptcha;

import Ii.N;
import Yg.J;
import Yg.u;
import Yg.v;
import android.app.Application;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.ui.core.ui.sso.recaptcha.RecaptchaUseCase;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import gg.D;
import gg.z;
import java.util.concurrent.Callable;
import kg.n;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
public final class RecaptchaUseCase {

    /* renamed from: a, reason: collision with root package name */
    private final Application f41580a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ui/core/ui/sso/recaptcha/RecaptchaUseCase$RecaptchaFailureException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "core-ui-sso_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RecaptchaFailureException extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecaptchaFailureException(Throwable cause) {
            super("Problem executing recaptcha request!", cause);
            AbstractC6492s.i(cause, "cause");
        }
    }

    static final class a extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f41581a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RecaptchaClient f41582b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ RecaptchaAction f41583c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(RecaptchaClient recaptchaClient, RecaptchaAction recaptchaAction, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f41582b = recaptchaClient;
            this.f41583c = recaptchaAction;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f41582b, this.f41583c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objMo9executegIAlus;
            Object objG = AbstractC5467b.g();
            int i10 = this.f41581a;
            if (i10 == 0) {
                v.b(obj);
                RecaptchaClient recaptchaClient = this.f41582b;
                RecaptchaAction recaptchaAction = this.f41583c;
                this.f41581a = 1;
                objMo9executegIAlus = recaptchaClient.mo9executegIAlus(recaptchaAction, this);
                if (objMo9executegIAlus == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                objMo9executegIAlus = ((u) obj).o();
            }
            return u.a(objMo9executegIAlus);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class b implements n {
        b() {
        }

        public final D a(Object obj) {
            RecaptchaUseCase recaptchaUseCase = RecaptchaUseCase.this;
            AbstractC6492s.f(u.a(obj));
            return recaptchaUseCase.h(obj);
        }

        @Override // kg.n
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return a(((u) obj).o());
        }
    }

    static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f41585a = new c();

        c() {
        }

        public final String a(String it) {
            AbstractC6492s.i(it, "it");
            return ca.b.b(it);
        }

        @Override // kg.n
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return ca.b.a(a((String) obj));
        }
    }

    static final class d extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f41586a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f41588c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f41588c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return RecaptchaUseCase.this.new d(this.f41588c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objM6getClientBWLJW6A$default;
            Object objG = AbstractC5467b.g();
            int i10 = this.f41586a;
            if (i10 == 0) {
                v.b(obj);
                Recaptcha recaptcha = Recaptcha.INSTANCE;
                Application application = RecaptchaUseCase.this.f41580a;
                String str = this.f41588c;
                this.f41586a = 1;
                objM6getClientBWLJW6A$default = Recaptcha.m6getClientBWLJW6A$default(recaptcha, application, str, 0L, this, 4, null);
                if (objM6getClientBWLJW6A$default == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                objM6getClientBWLJW6A$default = ((u) obj).o();
            }
            return u.a(objM6getClientBWLJW6A$default);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((d) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class e implements n {
        e() {
        }

        public final D a(Object obj) {
            RecaptchaUseCase recaptchaUseCase = RecaptchaUseCase.this;
            AbstractC6492s.f(u.a(obj));
            return recaptchaUseCase.h(obj);
        }

        @Override // kg.n
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return a(((u) obj).o());
        }
    }

    static final class f implements n {
        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(RecaptchaClient client) {
            AbstractC6492s.i(client, "client");
            return RecaptchaUseCase.this.e(client, RecaptchaAction.LOGIN);
        }
    }

    static final class g implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f41591a = new g();

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Throwable it) {
            AbstractC6492s.i(it, "it");
            return z.p(new RecaptchaFailureException(it));
        }
    }

    public RecaptchaUseCase(Application app) {
        AbstractC6492s.i(app, "app");
        this.f41580a = app;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z e(RecaptchaClient recaptchaClient, RecaptchaAction recaptchaAction) {
        z zVarA = Qi.l.c(null, new a(recaptchaClient, recaptchaAction, null), 1, null).s(new b()).A(c.f41585a);
        AbstractC6492s.h(zVarA, "map(...)");
        return zVarA;
    }

    private final z f(String str) {
        z zVarS = Qi.l.c(null, new d(str, null), 1, null).s(new e());
        AbstractC6492s.h(zVarS, "flatMap(...)");
        return zVarS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z h(final Object obj) {
        z zVarX = z.x(new Callable() { // from class: ca.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return RecaptchaUseCase.i(obj);
            }
        });
        AbstractC6492s.h(zVarX, "fromCallable(...)");
        return zVarX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(Object obj) {
        v.b(obj);
        return obj;
    }

    public final z g(String siteKey) {
        AbstractC6492s.i(siteKey, "siteKey");
        z zVarF = f(siteKey).s(new f()).F(g.f41591a);
        AbstractC6492s.h(zVarF, "onErrorResumeNext(...)");
        return zVarF;
    }
}
