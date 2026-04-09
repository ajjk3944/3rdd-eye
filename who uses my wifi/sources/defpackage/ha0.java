package defpackage;

import android.widget.TextView;
import com.phuongpn.whousemywifi.networkscanner.MainActivity;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class ha0 implements dy {
    public final /* synthetic */ MainActivity f;
    public final /* synthetic */ ap0 g;
    public final /* synthetic */ bp0 h;

    public /* synthetic */ ha0(MainActivity mainActivity, ap0 ap0Var, bp0 bp0Var) {
        this.f = mainActivity;
        this.g = ap0Var;
        this.h = bp0Var;
    }

    @Override // defpackage.dy
    public final Object g(Object obj) {
        d10 d10Var = (d10) obj;
        MainActivity mainActivity = this.f;
        if (mainActivity.a0) {
            ap0 ap0Var = this.g;
            ap0Var.f = ap0Var.f + 1;
            long j = this.h.f;
            if (j > 0) {
                mainActivity.runOnUiThread(new ma0(mainActivity, (int) ((r2 * 10000) / j), 0));
            }
            if (d10Var != null) {
                ArrayList arrayList = mainActivity.N;
                if (arrayList == null) {
                    i30.S("hosts");
                    throw null;
                }
                arrayList.add(d10Var);
                f2 f2Var = mainActivity.C;
                if (f2Var == null) {
                    i30.S("binding");
                    throw null;
                }
                TextView textView = (TextView) f2Var.l;
                ArrayList arrayList2 = mainActivity.N;
                if (arrayList2 == null) {
                    i30.S("hosts");
                    throw null;
                }
                textView.setText(mainActivity.getString(R.string.txt_host_size, String.valueOf(arrayList2.size()), mainActivity.getString(R.string.title_host_discovered)));
                String string = mainActivity.C().getString("sortPref", "ip");
                if (string != null) {
                    int iHashCode = string.hashCode();
                    if (iHashCode != 3367) {
                        if (iHashCode == 3373707 && string.equals("name")) {
                            ArrayList arrayList3 = mainActivity.N;
                            if (arrayList3 == null) {
                                i30.S("hosts");
                                throw null;
                            }
                            if (arrayList3.size() > 1) {
                                dg.l0(arrayList3, new bk(4));
                            }
                        }
                    } else if (string.equals("ip")) {
                        ArrayList arrayList4 = mainActivity.N;
                        if (arrayList4 == null) {
                            i30.S("hosts");
                            throw null;
                        }
                        if (arrayList4.size() > 1) {
                            dg.l0(arrayList4, new bk(3));
                        }
                    }
                }
                c10 c10Var = mainActivity.O;
                if (c10Var == null) {
                    i30.S("hostAdapter");
                    throw null;
                }
                c10Var.f.b();
            }
        }
        return z31.a;
    }
}
