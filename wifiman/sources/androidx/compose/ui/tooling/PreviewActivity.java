package androidx.compose.ui.tooling;

import C0.C;
import E0.InterfaceC2629g;
import N.C0;
import N.X;
import T.AbstractC3528f1;
import T.AbstractC3536j;
import T.AbstractC3546o;
import T.E1;
import T.InterfaceC3540l;
import T.InterfaceC3545n0;
import T.InterfaceC3563x;
import Yg.J;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.o;
import androidx.compose.ui.e;
import c.AbstractActivityC4155j;
import com.google.ar.core.ImageMetadata;
import d.AbstractC5264b;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.text.t;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import mh.q;
import z.N;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/tooling/PreviewActivity;", "Lc/j;", "<init>", "()V", "", "composableFqn", "LYg/J;", "q0", "(Ljava/lang/String;)V", "className", "methodName", "parameterProvider", "r0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "w", "Ljava/lang/String;", "TAG", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PreviewActivity extends AbstractActivityC4155j {

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final String TAG = "PreviewActivity";

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f29745a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f29746b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, String str2) {
            super(2);
            this.f29745a = str;
            this.f29746b = str2;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) throws Exception {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-840626948, i10, -1, "androidx.compose.ui.tooling.PreviewActivity.setComposableContent.<anonymous> (PreviewActivity.android.kt:76)");
            }
            X0.a.f24005a.g(this.f29745a, this.f29746b, interfaceC3540l, new Object[0]);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Exception {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f29747a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f29748b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f29749c;

        static final class a extends AbstractC6494u implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object[] f29750a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC3545n0 f29751b;

            /* renamed from: androidx.compose.ui.tooling.PreviewActivity$b$a$a, reason: collision with other inner class name */
            static final class C1078a extends AbstractC6494u implements InterfaceC6824a {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC3545n0 f29752a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Object[] f29753b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1078a(InterfaceC3545n0 interfaceC3545n0, Object[] objArr) {
                    super(0);
                    this.f29752a = interfaceC3545n0;
                    this.f29753b = objArr;
                }

                public final void a() {
                    InterfaceC3545n0 interfaceC3545n0 = this.f29752a;
                    interfaceC3545n0.l((interfaceC3545n0.e() + 1) % this.f29753b.length);
                }

                @Override // mh.InterfaceC6824a
                public /* bridge */ /* synthetic */ Object invoke() {
                    a();
                    return J.f24997a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object[] objArr, InterfaceC3545n0 interfaceC3545n0) {
                super(2);
                this.f29750a = objArr;
                this.f29751b = interfaceC3545n0;
            }

            public final void a(InterfaceC3540l interfaceC3540l, int i10) {
                if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(958604965, i10, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:123)");
                }
                InterfaceC6839p interfaceC6839pA = X0.b.f24006a.a();
                boolean zL = interfaceC3540l.l(this.f29750a);
                InterfaceC3545n0 interfaceC3545n0 = this.f29751b;
                Object[] objArr = this.f29750a;
                Object objF = interfaceC3540l.f();
                if (zL || objF == InterfaceC3540l.f21100a.a()) {
                    objF = new C1078a(interfaceC3545n0, objArr);
                    interfaceC3540l.K(objF);
                }
                X.a(interfaceC6839pA, (InterfaceC6824a) objF, null, null, null, null, 0L, 0L, null, interfaceC3540l, 6, 508);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.InterfaceC6839p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC3540l) obj, ((Number) obj2).intValue());
                return J.f24997a;
            }
        }

        /* renamed from: androidx.compose.ui.tooling.PreviewActivity$b$b, reason: collision with other inner class name */
        static final class C1079b extends AbstractC6494u implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f29754a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f29755b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object[] f29756c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC3545n0 f29757d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1079b(String str, String str2, Object[] objArr, InterfaceC3545n0 interfaceC3545n0) {
                super(3);
                this.f29754a = str;
                this.f29755b = str2;
                this.f29756c = objArr;
                this.f29757d = interfaceC3545n0;
            }

            public final void a(N n10, InterfaceC3540l interfaceC3540l, int i10) throws Exception {
                if ((i10 & 6) == 0) {
                    i10 |= interfaceC3540l.T(n10) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && interfaceC3540l.v()) {
                    interfaceC3540l.C();
                    return;
                }
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(57310875, i10, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:113)");
                }
                e eVarH = o.h(e.f28771b0, n10);
                String str = this.f29754a;
                String str2 = this.f29755b;
                Object[] objArr = this.f29756c;
                InterfaceC3545n0 interfaceC3545n0 = this.f29757d;
                C cH = d.h(f0.c.f46573a.o(), false);
                int iA = AbstractC3536j.a(interfaceC3540l, 0);
                InterfaceC3563x interfaceC3563xG = interfaceC3540l.G();
                e eVarE = androidx.compose.ui.c.e(interfaceC3540l, eVarH);
                InterfaceC2629g.a aVar = InterfaceC2629g.f3916K;
                InterfaceC6824a interfaceC6824aA = aVar.a();
                if (interfaceC3540l.x() == null) {
                    AbstractC3536j.c();
                }
                interfaceC3540l.u();
                if (interfaceC3540l.o()) {
                    interfaceC3540l.D(interfaceC6824aA);
                } else {
                    interfaceC3540l.I();
                }
                InterfaceC3540l interfaceC3540lA = E1.a(interfaceC3540l);
                E1.c(interfaceC3540lA, cH, aVar.e());
                E1.c(interfaceC3540lA, interfaceC3563xG, aVar.g());
                InterfaceC6839p interfaceC6839pB = aVar.b();
                if (interfaceC3540lA.o() || !AbstractC6492s.d(interfaceC3540lA.f(), Integer.valueOf(iA))) {
                    interfaceC3540lA.K(Integer.valueOf(iA));
                    interfaceC3540lA.Q(Integer.valueOf(iA), interfaceC6839pB);
                }
                E1.c(interfaceC3540lA, eVarE, aVar.f());
                f fVar = f.f28130a;
                X0.a.f24005a.g(str, str2, interfaceC3540l, objArr[interfaceC3545n0.e()]);
                interfaceC3540l.R();
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
            }

            @Override // mh.q
            public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) throws Exception {
                a((N) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object[] objArr, String str, String str2) {
            super(2);
            this.f29747a = objArr;
            this.f29748b = str;
            this.f29749c = str2;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-861939235, i10, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:109)");
            }
            Object objF = interfaceC3540l.f();
            if (objF == InterfaceC3540l.f21100a.a()) {
                objF = AbstractC3528f1.a(0);
                interfaceC3540l.K(objF);
            }
            InterfaceC3545n0 interfaceC3545n0 = (InterfaceC3545n0) objF;
            C0.a(null, null, null, null, null, b0.c.e(958604965, true, new a(this.f29747a, interfaceC3545n0), interfaceC3540l, 54), 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, b0.c.e(57310875, true, new C1079b(this.f29748b, this.f29749c, this.f29747a, interfaceC3545n0), interfaceC3540l, 54), interfaceC3540l, ImageMetadata.EDGE_MODE, 12582912, 131039);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f29758a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f29759b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object[] f29760c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, Object[] objArr) {
            super(2);
            this.f29758a = str;
            this.f29759b = str2;
            this.f29760c = objArr;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) throws Exception {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1901447514, i10, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:134)");
            }
            X0.a aVar = X0.a.f24005a;
            String str = this.f29758a;
            String str2 = this.f29759b;
            Object[] objArr = this.f29760c;
            aVar.g(str, str2, interfaceC3540l, Arrays.copyOf(objArr, objArr.length));
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Exception {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    private final void q0(String composableFqn) throws IllegalAccessException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Log.d(this.TAG, "PreviewActivity has composable " + composableFqn);
        String strO1 = t.o1(composableFqn, '.', null, 2, null);
        String strG1 = t.g1(composableFqn, '.', null, 2, null);
        String stringExtra = getIntent().getStringExtra("parameterProviderClassName");
        if (stringExtra != null) {
            r0(strO1, strG1, stringExtra);
            return;
        }
        Log.d(this.TAG, "Previewing '" + strG1 + "' without a parameter provider.");
        AbstractC5264b.b(this, null, b0.c.c(-840626948, true, new a(strO1, strG1)), 1, null);
    }

    private final void r0(String className, String methodName, String parameterProvider) throws IllegalAccessException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Log.d(this.TAG, "Previewing '" + methodName + "' with parameter provider: '" + parameterProvider + '\'');
        Object[] objArrB = X0.d.b(X0.d.a(parameterProvider), getIntent().getIntExtra("parameterProviderIndex", -1));
        if (objArrB.length > 1) {
            AbstractC5264b.b(this, null, b0.c.c(-861939235, true, new b(objArrB, className, methodName)), 1, null);
        } else {
            AbstractC5264b.b(this, null, b0.c.c(-1901447514, true, new c(className, methodName, objArrB)), 1, null);
        }
    }

    @Override // c.AbstractActivityC4155j, s1.g, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws IllegalAccessException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String stringExtra;
        super.onCreate(savedInstanceState);
        if ((getApplicationInfo().flags & 2) == 0) {
            Log.d(this.TAG, "Application is not debuggable. Compose Preview not allowed.");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("composable")) == null) {
            return;
        }
        q0(stringExtra);
    }
}
