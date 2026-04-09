package ah;

import android.widget.Toast;
import com.liuzh.deviceinfo.R;
import com.liuzh.deviceinfo.pro.ProActivity;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e implements si.i, si.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProActivity f379a;

    public /* synthetic */ e(ProActivity proActivity) {
        this.f379a = proActivity;
    }

    @Override // si.a
    public void c() {
        Toast.makeText(this.f379a, R.string.failed_try_again_later, 0).show();
    }

    @Override // si.a
    public void cancel() {
        Toast.makeText(this.f379a, R.string.canceled, 0).show();
    }

    @Override // si.i
    public void f() {
        Toast.makeText(this.f379a, R.string.failed, 0).show();
    }

    @Override // si.a
    public void g(si.c cVar) {
        o.f400d.a();
        Toast.makeText(this.f379a, R.string.pay_suc_actived_pro, 0).show();
    }

    @Override // si.i
    public void p() {
        int i4 = ProActivity.L;
        o oVar = o.f400d;
        ProActivity proActivity = this.f379a;
        oVar.t(proActivity, 1, new f(proActivity, "devinfo_vip", false, true));
    }
}
