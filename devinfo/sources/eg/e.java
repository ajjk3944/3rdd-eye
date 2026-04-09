package eg;

import android.content.DialogInterface;
import android.content.res.Resources;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements DialogInterface.OnShowListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i.e f23457b;

    public /* synthetic */ e(i.e eVar) {
        this.f23456a = 1;
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        this.f23457b = eVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) throws Resources.NotFoundException {
        int i4 = this.f23456a;
        i.e eVar = this.f23457b;
        switch (i4) {
            case 0:
                com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
                dj.b.s(eVar, com.liuzh.deviceinfo.utilities.f.d());
                break;
            case 1:
                com.liuzh.deviceinfo.utilities.f fVar2 = com.liuzh.deviceinfo.utilities.f.f21256b;
                dj.b.s(eVar, com.liuzh.deviceinfo.utilities.f.d());
                break;
            case 2:
                com.liuzh.deviceinfo.utilities.f fVar3 = com.liuzh.deviceinfo.utilities.f.f21256b;
                dj.b.s(eVar, com.liuzh.deviceinfo.utilities.f.d());
                break;
            default:
                ((z2.k) a.a.f3c.f189b).d(eVar);
                break;
        }
    }

    public /* synthetic */ e(i.e eVar, int i4) {
        this.f23456a = i4;
        this.f23457b = eVar;
    }
}
