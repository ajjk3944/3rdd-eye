package defpackage;

import com.phuongpn.whousemywifi.networkscanner.MainActivity;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class ka0 implements Runnable {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ String g;
    public final /* synthetic */ MainActivity h;

    public /* synthetic */ ka0(MainActivity mainActivity, String str) {
        this.h = mainActivity;
        this.g = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException, UnknownHostException {
        int i = this.f;
        MainActivity mainActivity = this.h;
        String str = this.g;
        switch (i) {
            case 0:
                f2 f2Var = mainActivity.C;
                if (f2Var != null) {
                    ((xi) f2Var.f).j.setText(str);
                    return;
                } else {
                    i30.S("binding");
                    throw null;
                }
            default:
                int[] iArr = MainActivity.d0;
                Thread.sleep(500L);
                cp0 cp0Var = new cp0();
                cp0Var.f = "";
                try {
                    InetAddress byName = InetAddress.getByName(str);
                    i30.l(byName, "getByName(...)");
                    cp0Var.f = yb.o(byName, str);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                mainActivity.runOnUiThread(new r5(cp0Var, mainActivity, 2));
                return;
        }
    }

    public /* synthetic */ ka0(String str, MainActivity mainActivity) {
        this.g = str;
        this.h = mainActivity;
    }
}
