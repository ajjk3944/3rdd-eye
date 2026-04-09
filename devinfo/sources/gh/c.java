package gh;

import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.utilities.f;
import i.x;
import i.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements DialogInterface.OnShowListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24728a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f24729b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f24730c;

    public /* synthetic */ c(x xVar, y yVar, int i4) {
        this.f24728a = i4;
        this.f24729b = xVar;
        this.f24730c = yVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int i4 = this.f24728a;
        y yVar = this.f24730c;
        x xVar = this.f24729b;
        switch (i4) {
            case 0:
                i.e eVar = (i.e) xVar;
                eVar.f(-1).setOnClickListener(new com.applovin.mediation.nativeAds.a(5, (d) yVar));
                f fVar = f.f21256b;
                f.a();
                dj.b.t(eVar, f.d());
                break;
            case 1:
                hg.b bVar = (hg.b) yVar;
                View viewFindViewById = ((oc.f) xVar).findViewById(R.id.design_bottom_sheet);
                if (viewFindViewById != null) {
                    viewFindViewById.setBackground(bVar.W().getDrawable(R.drawable.bg_bottom_sheet));
                    bVar.k0(viewFindViewById, BottomSheetBehavior.B(viewFindViewById));
                    break;
                }
                break;
            default:
                i.e eVar2 = (i.e) xVar;
                eVar2.f(-1).setOnClickListener(new com.applovin.mediation.nativeAds.a(12, (ih.b) yVar));
                f fVar2 = f.f21256b;
                f.a();
                dj.b.t(eVar2, f.d());
                break;
        }
    }
}
