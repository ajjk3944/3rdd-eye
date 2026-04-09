package ah;

import android.view.View;
import com.liuzh.deviceinfo.pro.ProActivity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f373a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProActivity f374b;

    public /* synthetic */ c(ProActivity proActivity, int i4) {
        this.f373a = i4;
        this.f374b = proActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i4 = this.f373a;
        String str = "devinfo_vip";
        boolean z3 = false;
        ProActivity proActivity = this.f374b;
        switch (i4) {
            case 0:
                int i10 = ProActivity.L;
                o.f400d.e(proActivity, new y4.a(z3, proActivity, str));
                break;
            case 1:
                int i11 = ProActivity.L;
                o.f400d.e(proActivity, new e(proActivity));
                break;
            case 2:
                int i12 = ProActivity.L;
                proActivity.finish();
                break;
            case 3:
                int i13 = ProActivity.L;
                o.f400d.e(proActivity, new y4.a(z3, proActivity, str));
                break;
            default:
                o.f400d.e(proActivity, new y4.a(z3, proActivity, proActivity.D.f33801a));
                break;
        }
    }
}
