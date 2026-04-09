package Y4;

import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import c5.C0412i;
import com.apm.insight.R;
import com.google.android.material.button.MaterialButton;
import com.lefan.signal.ui.wifi.TraceRouteActivity;
import com.lefan.signal.view.DelayCureView;
import com.lefan.signal.view.DiagnosisLevelView;
import h5.InterfaceC2370d;
import i5.EnumC2380a;
import java.util.ArrayList;
import z5.AbstractC3046w;
import z5.InterfaceC3044u;

/* loaded from: classes.dex */
public final class r extends j5.g implements p5.p {

    /* renamed from: e, reason: collision with root package name */
    public int f4493e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TraceRouteActivity f4494f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f4495g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(TraceRouteActivity traceRouteActivity, String str, InterfaceC2370d interfaceC2370d) {
        super(2, interfaceC2370d);
        this.f4494f = traceRouteActivity;
        this.f4495g = str;
    }

    @Override // p5.p
    public final Object h(Object obj, Object obj2) {
        return ((r) j((InterfaceC2370d) obj2, (InterfaceC3044u) obj)).l(C0412i.f5929a);
    }

    @Override // j5.b
    public final InterfaceC2370d j(InterfaceC2370d interfaceC2370d, Object obj) {
        return new r(this.f4494f, this.f4495g, interfaceC2370d);
    }

    @Override // j5.b
    public final Object l(Object obj) throws Throwable {
        IBinder windowToken;
        TraceRouteActivity traceRouteActivity = this.f4494f;
        N4.j jVar = traceRouteActivity.f19383R;
        int i = this.f4493e;
        if (i == 0) {
            R2.a.H(obj);
            AppCompatImageView appCompatImageView = traceRouteActivity.f19391Z;
            if (appCompatImageView == null) {
                q5.i.g("copyBtn");
                throw null;
            }
            appCompatImageView.setVisibility(8);
            traceRouteActivity.b0.clear();
            DelayCureView delayCureView = traceRouteActivity.f19385T;
            if (delayCureView == null) {
                q5.i.g("delayCurveView");
                throw null;
            }
            delayCureView.i = 10;
            delayCureView.f19522h = 16.0f;
            ArrayList arrayList = delayCureView.f19512F;
            arrayList.clear();
            delayCureView.f19513G.clear();
            for (int i3 = 1; i3 < 10; i3++) {
                arrayList.add(Integer.valueOf(i3));
            }
            delayCureView.f19521g = delayCureView.a(30);
            delayCureView.invalidate();
            delayCureView.requestLayout();
            DiagnosisLevelView diagnosisLevelView = traceRouteActivity.f19387V;
            if (diagnosisLevelView == null) {
                q5.i.g("innerDiagnosisLevelView");
                throw null;
            }
            diagnosisLevelView.setVisibility(4);
            DiagnosisLevelView diagnosisLevelView2 = traceRouteActivity.f19388W;
            if (diagnosisLevelView2 == null) {
                q5.i.g("outerDiagnosisLevelView");
                throw null;
            }
            diagnosisLevelView2.setVisibility(4);
            AppCompatTextView appCompatTextView = traceRouteActivity.f19389X;
            if (appCompatTextView == null) {
                q5.i.g("innerAvgDelayTime");
                throw null;
            }
            appCompatTextView.setText(traceRouteActivity.getString(R.string.default_value));
            AppCompatTextView appCompatTextView2 = traceRouteActivity.f19389X;
            if (appCompatTextView2 == null) {
                q5.i.g("innerAvgDelayTime");
                throw null;
            }
            appCompatTextView2.setTextColor(traceRouteActivity.getColor(R.color.text_color));
            AppCompatTextView appCompatTextView3 = traceRouteActivity.f19390Y;
            if (appCompatTextView3 == null) {
                q5.i.g("outerAvgDelayTime");
                throw null;
            }
            appCompatTextView3.setText(traceRouteActivity.getString(R.string.default_value));
            AppCompatTextView appCompatTextView4 = traceRouteActivity.f19390Y;
            if (appCompatTextView4 == null) {
                q5.i.g("outerAvgDelayTime");
                throw null;
            }
            appCompatTextView4.setTextColor(traceRouteActivity.getColor(R.color.text_color));
            MaterialButton materialButton = traceRouteActivity.f19381P;
            if (materialButton == null) {
                q5.i.g("startBtn");
                throw null;
            }
            B3.v vVar = traceRouteActivity.f19386U;
            if (vVar == null) {
                q5.i.g("progressIndicatorDrawable");
                throw null;
            }
            materialButton.setIcon(vVar);
            MaterialButton materialButton2 = traceRouteActivity.f19381P;
            if (materialButton2 == null) {
                q5.i.g("startBtn");
                throw null;
            }
            materialButton2.setText(traceRouteActivity.getString(R.string.stop_trace));
            com.lefan.signal.tracroute.e eVar = (com.lefan.signal.tracroute.e) traceRouteActivity.f19382Q.getValue();
            com.lefan.signal.tracroute.d dVar = new com.lefan.signal.tracroute.d();
            String str = this.f4495g;
            dVar.f18862b = str;
            dVar.f18863c = System.currentTimeMillis();
            eVar.b(dVar);
            jVar.f4668b.clear();
            String string = traceRouteActivity.getString(R.string.tools_traceroute_route_tracing);
            q5.i.d(string, "getString(...)");
            jVar.a(new com.lefan.signal.tracroute.f(string, "", 0, 0, false));
            View currentFocus = traceRouteActivity.getCurrentFocus();
            if (currentFocus != null && (windowToken = currentFocus.getWindowToken()) != null) {
                Object systemService = traceRouteActivity.getSystemService("input_method");
                q5.i.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(windowToken, 0);
            }
            G5.d dVar2 = z5.D.f24486b;
            C0237q c0237q = new C0237q(traceRouteActivity, str, null);
            this.f4493e = 1;
            Object objR = AbstractC3046w.r(dVar2, this, c0237q);
            EnumC2380a enumC2380a = EnumC2380a.f20635a;
            if (objR == enumC2380a) {
                return enumC2380a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R2.a.H(obj);
        }
        AppCompatImageView appCompatImageView2 = traceRouteActivity.f19391Z;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setVisibility(0);
            return C0412i.f5929a;
        }
        q5.i.g("copyBtn");
        throw null;
    }
}
