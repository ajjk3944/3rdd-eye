package rk;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.staircase3.opensignal.activities.TowersActivity;

/* loaded from: classes.dex */
public final class n implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21648a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TowersActivity f21649d;

    public /* synthetic */ n(TowersActivity towersActivity, int i10) {
        this.f21648a = i10;
        this.f21649d = towersActivity;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, lq.h] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f21648a) {
            case 0:
                this.f21649d.finish();
                break;
            case 1:
                TowersActivity.x(this.f21649d);
                break;
            case 2:
                TowersActivity towersActivity = this.f21649d;
                towersActivity.z(((el.b) towersActivity.E0.getValue()).f8211i);
                break;
            case 3:
                TowersActivity towersActivity2 = this.f21649d;
                ((qm.f) towersActivity2.A0.getValue()).getClass();
                qm.f.d(towersActivity2, 11);
                break;
            case 4:
                Intent intent = new Intent();
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", "com.staircase3.opensignal", null));
                intent.setFlags(268435456);
                this.f21649d.startActivity(intent);
                break;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                this.f21649d.H0.dismiss();
                break;
            default:
                TowersActivity towersActivity3 = this.f21649d;
                towersActivity3.H0.dismiss();
                ((com.staircase3.opensignal.utils.a) towersActivity3.D0.getValue()).c(towersActivity3.f6059w0, "click_icon", "icon_map");
                break;
        }
    }
}
