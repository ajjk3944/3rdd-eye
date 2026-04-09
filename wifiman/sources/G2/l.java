package g2;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c0.AbstractC4174c;
import c0.AbstractC4183l;
import c0.InterfaceC4182k;
import c0.InterfaceC4184m;
import f2.AbstractC5498D;
import f2.w;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public abstract class l {

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f47591a = new a();

        a() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke(InterfaceC4184m interfaceC4184m, w wVar) {
            return wVar.p0();
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f47592a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(1);
            this.f47592a = context;
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w invoke(Bundle bundle) {
            w wVarC = l.c(this.f47592a);
            wVarC.n0(bundle);
            return wVarC;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f47593a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context) {
            super(0);
            this.f47593a = context;
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w invoke() {
            return l.c(this.f47593a);
        }
    }

    private static final InterfaceC4182k a(Context context) {
        return AbstractC4183l.a(a.f47591a, new b(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w c(Context context) {
        w wVar = new w(context);
        wVar.K().b(new C5854d(wVar.K()));
        wVar.K().b(new C5855e());
        wVar.K().b(new C5859i());
        return wVar;
    }

    public static final w d(AbstractC5498D[] abstractC5498DArr, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-312215566, i10, -1, "androidx.navigation.compose.rememberNavController (NavHostController.kt:57)");
        }
        Context context = (Context) interfaceC3540l.t(AndroidCompositionLocals_androidKt.g());
        Object[] objArrCopyOf = Arrays.copyOf(abstractC5498DArr, abstractC5498DArr.length);
        InterfaceC4182k interfaceC4182kA = a(context);
        boolean zL = interfaceC3540l.l(context);
        Object objF = interfaceC3540l.f();
        if (zL || objF == InterfaceC3540l.f21100a.a()) {
            objF = new c(context);
            interfaceC3540l.K(objF);
        }
        w wVar = (w) AbstractC4174c.e(objArrCopyOf, interfaceC4182kA, null, (InterfaceC6824a) objF, interfaceC3540l, 0, 4);
        for (AbstractC5498D abstractC5498D : abstractC5498DArr) {
            wVar.K().b(abstractC5498D);
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return wVar;
    }
}
