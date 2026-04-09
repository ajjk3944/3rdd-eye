package K6;

import H6.C0672i;
import N7.C1175g0;
import N7.X2;
import O6.InterfaceC1478d;
import android.content.res.Resources;
import android.view.View;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.util.List;

/* compiled from: DivFocusBinder.kt */
/* renamed from: K6.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0735j0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0745n f3493a;

    /* compiled from: DivFocusBinder.kt */
    /* renamed from: K6.j0$a */
    public final class a implements View.OnFocusChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final C0672i f3494a;

        /* renamed from: b, reason: collision with root package name */
        public X2 f3495b;

        /* renamed from: c, reason: collision with root package name */
        public X2 f3496c;

        /* renamed from: d, reason: collision with root package name */
        public List<C1175g0> f3497d;

        /* renamed from: e, reason: collision with root package name */
        public List<C1175g0> f3498e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ C0735j0 f3499f;

        public a(C0735j0 c0735j0, C0672i context) {
            kotlin.jvm.internal.l.f(context, "context");
            this.f3499f = c0735j0;
            this.f3494a = context;
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View v10, boolean z10) throws Resources.NotFoundException {
            kotlin.jvm.internal.l.f(v10, "v");
            C0735j0 c0735j0 = this.f3499f;
            C0672i c0672i = this.f3494a;
            if (z10) {
                C0735j0.a(c0672i, this.f3495b, v10);
                List<C1175g0> list = this.f3497d;
                if (list != null) {
                    c0735j0.f3493a.e(c0672i, v10, list, "focus");
                    return;
                }
                return;
            }
            if (this.f3495b != null) {
                C0735j0.a(c0672i, this.f3496c, v10);
            }
            List<C1175g0> list2 = this.f3498e;
            if (list2 != null) {
                c0735j0.f3493a.e(c0672i, v10, list2, "blur");
            }
        }
    }

    public C0735j0(C0745n c0745n) {
        this.f3493a = c0745n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(C0672i c0672i, X2 x22, View view) throws Resources.NotFoundException {
        if (view instanceof InterfaceC1478d) {
            ((InterfaceC1478d) view).d(c0672i, x22, view);
            return;
        }
        float dimension = 0.0f;
        if (x22 != null && !C0713c.R(x22)) {
            if (x22.f7689c.a(c0672i.f2147b).booleanValue() && x22.f7690d == null) {
                dimension = view.getResources().getDimension(R.dimen.div_shadow_elevation);
            }
        }
        view.setElevation(dimension);
    }
}
