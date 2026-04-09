package C0;

import android.graphics.Point;
import android.graphics.Typeface;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import c.AbstractActivityC0389n;
import c.C0371K;
import c.C0383h;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.lefan.signal.ui.wifi.PingActivity;
import com.lefan.signal.ui.wifi.TraceRouteActivity;
import com.lefan.signal.view.DelayCureView;
import h.AbstractActivityC2349g;
import java.util.ArrayList;
import k0.C2605i;
import k0.U;

/* loaded from: classes.dex */
public final /* synthetic */ class A implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1023b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1024c;

    public /* synthetic */ A(B b5, Runnable runnable) {
        this.f1022a = 6;
        this.f1024c = b5;
        this.f1023b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1022a;
        int i3 = 0;
        Object obj = this.f1024c;
        Object obj2 = this.f1023b;
        switch (i) {
            case 0:
                Runnable runnable = (Runnable) obj2;
                q5.i.e(runnable, "$command");
                q5.i.e((B) obj, "this$0");
                try {
                    runnable.run();
                    return;
                } finally {
                }
            case 1:
                ((I.b) obj2).i((Typeface) obj);
                return;
            case 2:
                q5.o oVar = (q5.o) obj;
                AppCompatTextView appCompatTextView = ((PingActivity) obj2).f19350S;
                if (appCompatTextView != null) {
                    appCompatTextView.setText((CharSequence) oVar.f23299a);
                    return;
                } else {
                    q5.i.g("pingLog");
                    throw null;
                }
            case 3:
                q5.o oVar2 = (q5.o) obj2;
                oVar2.f23299a = oVar2.f23299a + "\n" + ((Throwable) obj).getMessage() + "\n";
                return;
            case 4:
                com.lefan.signal.tracroute.f fVar = (com.lefan.signal.tracroute.f) obj2;
                TraceRouteActivity traceRouteActivity = (TraceRouteActivity) obj;
                ArrayList arrayList = traceRouteActivity.b0;
                int i6 = TraceRouteActivity.f19379c0;
                if (fVar.f18868c.equals("timeout")) {
                    return;
                }
                if (fVar.f18866a == 1) {
                    arrayList.add(fVar);
                }
                traceRouteActivity.f19383R.a(fVar);
                DelayCureView delayCureView = traceRouteActivity.f19385T;
                if (delayCureView == null) {
                    q5.i.g("delayCurveView");
                    throw null;
                }
                Float fU = y5.j.U(y5.l.f0(fVar.f18869d, "ms", ""));
                float fFloatValue = fU != null ? fU.floatValue() : 0.0f;
                int size = arrayList.size();
                int i7 = delayCureView.f19516b;
                float f2 = fFloatValue <= 460.0f ? fFloatValue : 460.0f;
                int i8 = delayCureView.i;
                int i9 = (int) f2;
                if (i8 < i9) {
                    i8 = i9;
                }
                delayCureView.i = i8;
                while (true) {
                    if (i3 < 10) {
                        int i10 = (i3 * 10) + 10;
                        if (delayCureView.i <= i10) {
                            delayCureView.i = i10;
                        } else {
                            i3++;
                        }
                    }
                }
                float f5 = i7;
                if (f2 >= delayCureView.f19522h * f5) {
                    float f6 = f2;
                    while (((int) f6) % i7 != 0) {
                        f6 += 1.0f;
                    }
                    delayCureView.f19522h = f6 / f5;
                }
                if (size > 9) {
                    delayCureView.f19512F.add(Integer.valueOf(size));
                }
                delayCureView.f19513G.add(new Point(size, R3.b.x(f2)));
                delayCureView.invalidate();
                delayCureView.requestLayout();
                return;
            case 5:
                AbstractActivityC2349g abstractActivityC2349g = (AbstractActivityC2349g) obj2;
                int i11 = AbstractActivityC0389n.f5849H;
                abstractActivityC2349g.f1476a.a(new C0383h((C0371K) obj, i3, abstractActivityC2349g));
                return;
            case 6:
                Runnable runnable2 = (Runnable) obj2;
                ((B) obj).getClass();
                try {
                    runnable2.run();
                    return;
                } finally {
                }
            default:
                ArrayList arrayList2 = (ArrayList) obj2;
                U u6 = (U) obj;
                if (arrayList2.contains(u6)) {
                    arrayList2.remove(u6);
                    View view = u6.f21579c.f21696T;
                    int i12 = u6.f21577a;
                    q5.i.d(view, "view");
                    AbstractC1135f5.c(i12, view);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ A(Object obj, int i, Object obj2) {
        this.f1022a = i;
        this.f1023b = obj;
        this.f1024c = obj2;
    }

    public /* synthetic */ A(ArrayList arrayList, U u6, C2605i c2605i) {
        this.f1022a = 7;
        this.f1023b = arrayList;
        this.f1024c = u6;
    }
}
