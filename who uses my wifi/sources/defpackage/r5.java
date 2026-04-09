package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;
import com.github.mikephil.charting.charts.LineChart;
import com.google.android.material.textfield.TextInputEditText;
import com.phuongpn.whousemywifi.networkscanner.MainActivity;
import com.phuongpn.whousemywifi.networkscanner.PingActivity;
import com.phuongpn.whousemywifi.networkscanner.R;
import com.phuongpn.whousemywifi.networkscanner.RouterAdminActivity;
import java.net.InetAddress;
import java.text.DecimalFormat;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class r5 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ r5(Object obj, Object obj2, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                s5 s5Var = (s5) obj2;
                Runnable runnable = (Runnable) obj;
                s5Var.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    s5Var.a();
                }
            case 1:
                i5 i5Var = (i5) obj2;
                i5Var.f.a(new ug((aj0) obj, i5Var));
                return;
            case 2:
                cp0 cp0Var = (cp0) obj2;
                MainActivity mainActivity = (MainActivity) obj;
                int[] iArr = MainActivity.d0;
                if (((CharSequence) cp0Var.f).length() == 0) {
                    f2 f2Var = mainActivity.C;
                    if (f2Var != null) {
                        ((xi) f2Var.f).k.setText(mainActivity.getString(R.string.txt_router));
                        return;
                    } else {
                        i30.S("binding");
                        throw null;
                    }
                }
                f2 f2Var2 = mainActivity.C;
                if (f2Var2 != null) {
                    ((xi) f2Var2.f).k.setText((CharSequence) cp0Var.f);
                    return;
                } else {
                    i30.S("binding");
                    throw null;
                }
            case 3:
                PingActivity pingActivity = (PingActivity) obj2;
                bl0 bl0Var = (bl0) obj;
                g2 g2Var = pingActivity.D;
                DecimalFormat decimalFormat = pingActivity.J;
                if (g2Var == null) {
                    i30.S("binding");
                    throw null;
                }
                TextView textView = g2Var.m;
                InetAddress inetAddress = bl0Var.a;
                String hostAddress = inetAddress.getHostAddress();
                textView.setText((hostAddress == null || hostAddress.length() == 0) ? inetAddress.getHostAddress() : inetAddress.getHostName());
                g2Var.k.setText(decimalFormat.format(Float.valueOf(bl0Var.e)) + " ms");
                g2Var.j.setText(decimalFormat.format(Float.valueOf(bl0Var.f)) + " ms");
                g2Var.i.setText(decimalFormat.format(Float.valueOf(bl0Var.d)) + " ms");
                g2Var.l.setText(decimalFormat.format((bl0Var.c / bl0Var.b) * ((long) 100)) + " %");
                return;
            case 4:
                al0 al0Var = (al0) obj;
                o9 o9Var = ((PingActivity) obj2).K;
                if (o9Var == null) {
                    i30.S("pingChart");
                    throw null;
                }
                int i2 = (int) al0Var.b;
                g2 g2Var2 = (g2) o9Var.d;
                j60 j60Var = (j60) g2Var2.e.getData();
                if (j60Var != null) {
                    l60 l60VarB = (l60) j60Var.d(0);
                    if (l60VarB == null) {
                        l60VarB = o9Var.b();
                        j60Var.a(l60VarB);
                    }
                    j60Var.b(new xs(l60VarB.o.size(), i2), 0);
                    LineChart lineChart = g2Var2.e;
                    lineChart.d();
                    lineChart.invalidate();
                    return;
                }
                return;
            case 5:
                ((g82) obj2).p((Typeface) obj);
                return;
            default:
                String str = (String) obj;
                mc2 mc2Var = ((RouterAdminActivity) obj2).C;
                if (mc2Var != null) {
                    ((TextInputEditText) ((p21) mc2Var.h).i).setText(str);
                    return;
                } else {
                    i30.S("binding");
                    throw null;
                }
        }
    }
}
