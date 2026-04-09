package rg;

import android.content.DialogInterface;
import yj.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32945a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f32946b;

    public /* synthetic */ e(int i4, Runnable runnable) {
        this.f32945a = i4;
        this.f32946b = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        int i10 = this.f32945a;
        Runnable runnable = this.f32946b;
        switch (i10) {
            case 0:
                runnable.run();
                break;
            default:
                n nVar = gg.b.g;
                com.bumptech.glide.c.m().a();
                com.liuzh.deviceinfo.utilities.f.k("user_granted_all_apps_permission", true);
                runnable.run();
                break;
        }
    }
}
