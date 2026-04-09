package uk;

import android.graphics.Bitmap;
import android.os.Handler;
import com.staircase3.opensignal.activities.TowersActivity;
import pb.l0;
import rk.o;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f23573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f23574b;

    public a(b bVar, String str) {
        this.f23574b = bVar;
        this.f23573a = str;
    }

    public final void a(Bitmap bitmap) {
        if (b.f23575e == null) {
            b.f23575e = bitmap;
        }
        o oVar = this.f23574b.f23578c;
        if (oVar != null) {
            TowersActivity towersActivity = oVar.f21650a;
            if (b.f23575e == null) {
                towersActivity.F0++;
                new Handler().postDelayed(new l0(4, oVar), 1000L);
            } else {
                int i10 = TowersActivity.Y0;
                towersActivity.M();
                towersActivity.F0 = 0;
            }
        }
    }
}
