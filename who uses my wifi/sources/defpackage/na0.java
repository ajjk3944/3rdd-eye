package defpackage;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.phuongpn.whousemywifi.networkscanner.MainActivity;
import com.phuongpn.whousemywifi.networkscanner.R;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class na0 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ MainActivity h;

    public /* synthetic */ na0(boolean z, MainActivity mainActivity, int i) {
        this.f = i;
        this.g = z;
        this.h = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                boolean z = this.g;
                MainActivity mainActivity = this.h;
                if (!z) {
                    f2 f2Var = mainActivity.C;
                    if (f2Var == null) {
                        i30.S("binding");
                        throw null;
                    }
                    FloatingActionButton floatingActionButton = (FloatingActionButton) f2Var.g;
                    floatingActionButton.setOnClickListener(new ea0(mainActivity, 3));
                    floatingActionButton.setImageResource(R.drawable.ic_searcher);
                    f2 f2Var2 = mainActivity.C;
                    if (f2Var2 != null) {
                        ((LinearProgressIndicator) f2Var2.i).setVisibility(8);
                        return;
                    } else {
                        i30.S("binding");
                        throw null;
                    }
                }
                f2 f2Var3 = mainActivity.C;
                if (f2Var3 == null) {
                    i30.S("binding");
                    throw null;
                }
                FloatingActionButton floatingActionButton2 = (FloatingActionButton) f2Var3.g;
                floatingActionButton2.setOnClickListener(new ea0(mainActivity, 2));
                floatingActionButton2.setImageResource(R.drawable.ic_baseline_stop);
                f2 f2Var4 = mainActivity.C;
                if (f2Var4 == null) {
                    i30.S("binding");
                    throw null;
                }
                ((LinearProgressIndicator) f2Var4.i).setVisibility(0);
                f2 f2Var5 = mainActivity.C;
                if (f2Var5 == null) {
                    i30.S("binding");
                    throw null;
                }
                if (((MaterialCardView) f2Var5.c).getVisibility() == 8) {
                    f2 f2Var6 = mainActivity.C;
                    if (f2Var6 != null) {
                        ((MaterialCardView) f2Var6.c).setVisibility(0);
                        return;
                    } else {
                        i30.S("binding");
                        throw null;
                    }
                }
                return;
            default:
                boolean z2 = this.g;
                MainActivity mainActivity2 = this.h;
                if (z2) {
                    f2 f2Var7 = mainActivity2.C;
                    if (f2Var7 != null) {
                        ((xi) f2Var7.f).c.setImageResource(R.drawable.ic_connected_on);
                        return;
                    } else {
                        i30.S("binding");
                        throw null;
                    }
                }
                f2 f2Var8 = mainActivity2.C;
                if (f2Var8 != null) {
                    ((xi) f2Var8.f).c.setImageResource(R.drawable.ic_connected_off);
                    return;
                } else {
                    i30.S("binding");
                    throw null;
                }
        }
    }
}
