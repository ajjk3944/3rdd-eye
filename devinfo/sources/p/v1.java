package p;

import android.view.View;
import android.widget.AdapterView;
import com.liuzho.module.app_analyzer.ui.AppsAnalyzeActivity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v1 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30894a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30895b;

    public /* synthetic */ v1(int i4, Object obj) {
        this.f30894a = i4;
        this.f30895b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i4, long j) {
        p1 p1Var;
        switch (this.f30894a) {
            case 0:
                if (i4 != -1 && (p1Var = ((b2) this.f30895b).f30633c) != null) {
                    p1Var.setListSelectionHidden(false);
                    break;
                }
                break;
            case 1:
                ((z2) this.f30895b).o(i4);
                break;
            case 2:
                th.f fVar = (th.f) this.f30895b;
                if (!fVar.c0()) {
                    th.q qVarH0 = fVar.h0();
                    qVarH0.getClass();
                    th.j jVar = i4 != 0 ? i4 != 1 ? th.j.f34625c : th.j.f34624b : th.j.f34623a;
                    al.i1 i1Var = qVarH0.f34648b;
                    i1Var.getClass();
                    i1Var.j(null, jVar);
                    break;
                }
                break;
            default:
                AppsAnalyzeActivity appsAnalyzeActivity = (AppsAnalyzeActivity) this.f30895b;
                appsAnalyzeActivity.G = i4;
                if (!appsAnalyzeActivity.R) {
                    appsAnalyzeActivity.R = true;
                    appsAnalyzeActivity.H.setEnabled(false);
                    new Thread(new ig.l(23, appsAnalyzeActivity)).start();
                    break;
                }
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i4 = this.f30894a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }

    private final void c(AdapterView adapterView) {
    }

    private final void d(AdapterView adapterView) {
    }
}
