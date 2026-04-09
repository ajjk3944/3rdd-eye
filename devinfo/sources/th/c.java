package th;

import android.content.Context;
import android.content.Intent;
import android.widget.FrameLayout;
import com.google.android.gms.internal.consent_sdk.a0;
import com.liuzho.module.app_analyzer.ui.AppsAnalyzeActivity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f34606b;

    public /* synthetic */ c(f fVar, int i4) {
        this.f34605a = i4;
        this.f34606b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i4 = this.f34605a;
        f fVar = this.f34606b;
        switch (i4) {
            case 0:
                a0 a0Var = fVar.Z;
                if (a0Var == null) {
                    nk.k.k("binding");
                    throw null;
                }
                ((FrameLayout) a0Var.f19259f).removeAllViews();
                Context contextW = fVar.W();
                int i10 = AppsAnalyzeActivity.S;
                Intent intent = new Intent(contextW, (Class<?>) AppsAnalyzeActivity.class);
                intent.putExtra("type", 2);
                contextW.startActivity(intent);
                cg.a.f2848b.f(null, "app_ana_click");
                return;
            default:
                a0 a0Var2 = fVar.Z;
                if (a0Var2 == null) {
                    nk.k.k("binding");
                    throw null;
                }
                ((FrameLayout) a0Var2.f19259f).removeAllViews();
                a0 a0Var3 = fVar.Z;
                if (a0Var3 == null) {
                    nk.k.k("binding");
                    throw null;
                }
                FrameLayout frameLayout = (FrameLayout) a0Var3.f19259f;
                nk.k.d(frameLayout, "permissionContainer");
                frameLayout.setVisibility(8);
                return;
        }
    }
}
