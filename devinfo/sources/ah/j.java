package ah;

import android.content.DialogInterface;
import android.widget.FrameLayout;
import com.google.android.gms.internal.play_billing.m1;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements DialogInterface.OnShowListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f391a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f392b;

    public /* synthetic */ j(int i4, Object obj) {
        this.f391a = i4;
        this.f392b = obj;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.f391a) {
            case 0:
                o.f400d.b((i) this.f392b);
                break;
            default:
                xg.g gVar = (xg.g) this.f392b;
                Float fValueOf = Float.valueOf(24.0f);
                nk.k.c(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                FrameLayout frameLayout = (FrameLayout) ((oc.f) dialogInterface).findViewById(R.id.design_bottom_sheet);
                if (frameLayout != null) {
                    ed.m mVar = new ed.m();
                    ed.m mVar2 = new ed.m();
                    ed.a aVar = new ed.a(0.0f);
                    ed.a aVar2 = new ed.a(0.0f);
                    ed.f fVar = new ed.f(0);
                    ed.f fVar2 = new ed.f(0);
                    ed.f fVar3 = new ed.f(0);
                    ed.f fVar4 = new ed.f(0);
                    float fJ = pd.b.j(fValueOf);
                    m1 m1VarI = ii.a.i(0);
                    ed.a aVar3 = new ed.a(fJ);
                    float fJ2 = pd.b.j(fValueOf);
                    m1 m1VarI2 = ii.a.i(0);
                    ed.a aVar4 = new ed.a(fJ2);
                    ed.o oVar = new ed.o();
                    oVar.f23353a = m1VarI;
                    oVar.f23354b = m1VarI2;
                    oVar.f23355c = mVar;
                    oVar.f23356d = mVar2;
                    oVar.f23357e = aVar3;
                    oVar.f23358f = aVar4;
                    oVar.g = aVar;
                    oVar.f23359h = aVar2;
                    oVar.f23360i = fVar;
                    oVar.j = fVar2;
                    oVar.f23361k = fVar3;
                    oVar.f23362l = fVar4;
                    ed.j jVar = new ed.j(oVar);
                    jVar.o(cm.g.m(R.attr.colorBackgroundFloating, gVar.W()));
                    frameLayout.setBackground(jVar);
                    break;
                }
                break;
        }
    }
}
