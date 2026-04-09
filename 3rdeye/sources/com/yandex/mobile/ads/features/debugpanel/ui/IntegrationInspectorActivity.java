package com.yandex.mobile.ads.features.debugpanel.ui;

import A9.C0575f;
import A9.E;
import B2.s;
import D9.I;
import D9.InterfaceC0644f;
import D9.InterfaceC0645g;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import b9.C1992A;
import b9.C1998e;
import b9.C2001h;
import b9.InterfaceC2000g;
import b9.n;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.features.debugpanel.common.BaseActivity;
import com.yandex.mobile.ads.impl.ay;
import com.yandex.mobile.ads.impl.cy;
import com.yandex.mobile.ads.impl.gx;
import com.yandex.mobile.ads.impl.ih2;
import com.yandex.mobile.ads.impl.lw;
import com.yandex.mobile.ads.impl.so0;
import com.yandex.mobile.ads.impl.ug2;
import com.yandex.mobile.ads.impl.wg2;
import com.yandex.mobile.ads.impl.xx;
import com.yandex.mobile.ads.impl.yw;
import com.yandex.mobile.ads.impl.yx;
import com.yandex.mobile.ads.impl.zx;
import f9.InterfaceC4347e;
import h9.i;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;
import p9.p;

/* loaded from: classes3.dex */
public final class IntegrationInspectorActivity extends BaseActivity<so0> {

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC2000g f24009d = C2001h.b(new a());

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC2000g f24010e = C2001h.b(new e());

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC2000g f24011f = C2001h.b(new d());

    public static final class a extends m implements InterfaceC5480a<yw> {
        public a() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final yw invoke() {
            Context applicationContext = IntegrationInspectorActivity.this.getApplicationContext();
            l.e(applicationContext, "getApplicationContext(...)");
            return new yw(applicationContext);
        }
    }

    @h9.e(c = "com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity$setupUiHandlers$1$1", f = "IntegrationInspectorActivity.kt", l = {43}, m = "invokeSuspend")
    public static final class b extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f24013b;

        public static final class a<T> implements InterfaceC0645g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ IntegrationInspectorActivity f24015a;

            public a(IntegrationInspectorActivity integrationInspectorActivity) {
                this.f24015a = integrationInspectorActivity;
            }

            @Override // D9.InterfaceC0645g
            public final Object emit(Object obj, InterfaceC4347e interfaceC4347e) {
                IntegrationInspectorActivity.b(this.f24015a).a((yx) obj);
                return C1992A.f18074a;
            }
        }

        public b(InterfaceC4347e<? super b> interfaceC4347e) {
            super(2, interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return IntegrationInspectorActivity.this.new b(interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return IntegrationInspectorActivity.this.new b(interfaceC4347e).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f24013b;
            if (i == 0) {
                n.b(obj);
                InterfaceC0644f<yx> interfaceC0644fC = IntegrationInspectorActivity.d(IntegrationInspectorActivity.this).c();
                a aVar2 = new a(IntegrationInspectorActivity.this);
                this.f24013b = 1;
                if (interfaceC0644fC.b(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
            }
            return C1992A.f18074a;
        }
    }

    @h9.e(c = "com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity$setupUiHandlers$1$2", f = "IntegrationInspectorActivity.kt", l = {48}, m = "invokeSuspend")
    public static final class c extends i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f24016b;

        public static final class a<T> implements InterfaceC0645g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ IntegrationInspectorActivity f24018a;

            public a(IntegrationInspectorActivity integrationInspectorActivity) {
                this.f24018a = integrationInspectorActivity;
            }

            @Override // D9.InterfaceC0645g
            public final Object emit(Object obj, InterfaceC4347e interfaceC4347e) {
                IntegrationInspectorActivity.c(this.f24018a).a((ay) obj);
                return C1992A.f18074a;
            }
        }

        public c(InterfaceC4347e<? super c> interfaceC4347e) {
            super(2, interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return IntegrationInspectorActivity.this.new c(interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return IntegrationInspectorActivity.this.new c(interfaceC4347e).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f24016b;
            if (i == 0) {
                n.b(obj);
                I<ay> iD = IntegrationInspectorActivity.d(IntegrationInspectorActivity.this).d();
                a aVar2 = new a(IntegrationInspectorActivity.this);
                this.f24016b = 1;
                if (iD.b(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
            }
            throw new C1998e();
        }
    }

    public static final class d extends m implements InterfaceC5480a<zx> {
        public d() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final zx invoke() {
            return new zx(IntegrationInspectorActivity.this);
        }
    }

    public static final class e extends m implements InterfaceC5480a<cy> {
        public e() {
            super(0);
        }

        @Override // p9.InterfaceC5480a
        public final cy invoke() {
            IntegrationInspectorActivity integrationInspectorActivity = IntegrationInspectorActivity.this;
            com.yandex.mobile.ads.features.debugpanel.ui.a aVar = new com.yandex.mobile.ads.features.debugpanel.ui.a(IntegrationInspectorActivity.d(IntegrationInspectorActivity.this));
            gx gxVarA = IntegrationInspectorActivity.a(IntegrationInspectorActivity.this).a();
            return new cy(integrationInspectorActivity, aVar, gxVarA, new LinearLayoutManager(1), new lw(aVar, gxVarA, new ug2(aVar, gxVarA), new ih2()));
        }
    }

    public static final yw a(IntegrationInspectorActivity integrationInspectorActivity) {
        return (yw) integrationInspectorActivity.f24009d.getValue();
    }

    public static final zx b(IntegrationInspectorActivity integrationInspectorActivity) {
        return (zx) integrationInspectorActivity.f24011f.getValue();
    }

    public static final cy c(IntegrationInspectorActivity integrationInspectorActivity) {
        return (cy) integrationInspectorActivity.f24010e.getValue();
    }

    private final void e() {
        E eA = a();
        C0575f.e(eA, null, null, new b(null), 3);
        C0575f.e(eA, null, null, new c(null), 3);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        b().a(xx.d.f35529a);
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_debug);
        d();
        b().a(xx.a.f35526a);
        e();
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity, android.app.Activity
    public final void onDestroy() {
        ((yw) this.f24009d.getValue()).a().a();
        super.onDestroy();
    }

    public static final /* synthetic */ so0 d(IntegrationInspectorActivity integrationInspectorActivity) {
        return integrationInspectorActivity.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IntegrationInspectorActivity this$0, View view) {
        l.f(this$0, "this$0");
        this$0.b().a(xx.g.f35532a);
    }

    private final void d() {
        ((ImageButton) findViewById(R.id.toolbar_share_button)).setOnClickListener(new s(this, 3));
    }

    @Override // com.yandex.mobile.ads.features.debugpanel.common.BaseActivity
    public final wg2<so0> c() {
        return ((yw) this.f24009d.getValue()).b();
    }
}
