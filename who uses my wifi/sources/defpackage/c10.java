package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class c10 extends ao0 {
    public final /* synthetic */ int i;
    public final ArrayList j;
    public final py k;

    public /* synthetic */ c10(ArrayList arrayList, py pyVar, int i) {
        this.i = i;
        this.j = arrayList;
        this.k = pyVar;
    }

    @Override // defpackage.ao0
    public final int a() {
        switch (this.i) {
        }
        return this.j.size();
    }

    @Override // defpackage.ao0
    public final void d(wo0 wo0Var, int i) {
        String strSubstring;
        String strSubstring2;
        switch (this.i) {
            case 0:
                b10 b10Var = (b10) wo0Var;
                TextView textView = b10Var.x;
                Button button = b10Var.A;
                Object obj = this.j.get(i);
                i30.l(obj, "get(...)");
                d10 d10Var = (d10) obj;
                b10Var.a.setOnClickListener(new a10(this, b10Var, d10Var, 0));
                b10Var.v.setText(d10Var.c);
                b10Var.w.setText(d10Var.e);
                if (!i30.c(d10Var.d, "00:00:00:00:00:00") && d10Var.d.length() > 0) {
                    b10Var.z.setText(d10Var.d);
                }
                String str = d10Var.b;
                try {
                    i30.m(str, "<this>");
                    int iD = sy0.D(6, str, ".");
                    if (iD == -1) {
                        strSubstring = str;
                    } else {
                        strSubstring = str.substring(0, iD);
                        i30.l(strSubstring, "substring(...)");
                    }
                    textView.setText(strSubstring.concat("."));
                    TextView textView2 = b10Var.y;
                    int iD2 = sy0.D(6, str, ".");
                    if (iD2 == -1) {
                        strSubstring2 = str;
                    } else {
                        strSubstring2 = str.substring(1 + iD2, str.length());
                        i30.l(strSubstring2, "substring(...)");
                    }
                    textView2.setText(strSubstring2);
                } catch (Exception unused) {
                    textView.setText(str);
                }
                b10Var.u.setImageResource(d10Var.f);
                if (d10Var.a != ro.h) {
                    button.setVisibility(8);
                    break;
                } else {
                    button.setVisibility(0);
                    button.setOnClickListener(new a10(this, b10Var, d10Var, 1));
                    break;
                }
                break;
            case 1:
                yk0 yk0Var = (yk0) wo0Var;
                Object obj2 = this.j.get(i);
                i30.l(obj2, "get(...)");
                zk0 zk0Var = (zk0) obj2;
                yk0Var.a.setOnClickListener(new ia0(this, zk0Var, 1));
                yk0Var.u.setImageResource(zk0Var.a);
                yk0Var.v.setText(zk0Var.b);
                yk0Var.w.setText(zk0Var.d);
                yk0Var.x.setText(zk0Var.c);
                break;
            default:
                ml0 ml0Var = (ml0) wo0Var;
                TextView textView3 = ml0Var.x;
                Object obj3 = this.j.get(i);
                i30.l(obj3, "get(...)");
                ol0 ol0Var = (ol0) obj3;
                ml0Var.a.setOnClickListener(new ia0(this, ol0Var, 2));
                ml0Var.u.setImageResource(ol0Var.a);
                ml0Var.v.setText(ol0Var.b);
                ml0Var.w.setText(ol0Var.c);
                int i2 = ol0Var.d;
                if (i2 == -1) {
                    textView3.setText("");
                    textView3.setVisibility(4);
                    break;
                } else {
                    textView3.setText(String.valueOf(i2));
                    textView3.setVisibility(0);
                    break;
                }
        }
    }

    @Override // defpackage.ao0
    public final wo0 e(ViewGroup viewGroup, int i) {
        switch (this.i) {
            case 0:
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_host, viewGroup, false);
                i30.j(viewInflate);
                b10 b10Var = new b10(viewInflate);
                View viewFindViewById = viewInflate.findViewById(R.id.logo);
                i30.l(viewFindViewById, "findViewById(...)");
                b10Var.u = (ImageView) viewFindViewById;
                View viewFindViewById2 = viewInflate.findViewById(R.id.name);
                i30.l(viewFindViewById2, "findViewById(...)");
                b10Var.v = (TextView) viewFindViewById2;
                View viewFindViewById3 = viewInflate.findViewById(R.id.vendor);
                i30.l(viewFindViewById3, "findViewById(...)");
                b10Var.w = (TextView) viewFindViewById3;
                View viewFindViewById4 = viewInflate.findViewById(R.id.ip);
                i30.l(viewFindViewById4, "findViewById(...)");
                b10Var.x = (TextView) viewFindViewById4;
                View viewFindViewById5 = viewInflate.findViewById(R.id.ipEnd);
                i30.l(viewFindViewById5, "findViewById(...)");
                b10Var.y = (TextView) viewFindViewById5;
                View viewFindViewById6 = viewInflate.findViewById(R.id.mAddress);
                i30.l(viewFindViewById6, "findViewById(...)");
                b10Var.z = (TextView) viewFindViewById6;
                View viewFindViewById7 = viewInflate.findViewById(R.id.btnMore);
                i30.l(viewFindViewById7, "findViewById(...)");
                b10Var.A = (Button) viewFindViewById7;
                return b10Var;
            case 1:
                View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_ping, viewGroup, false);
                i30.j(viewInflate2);
                return new yk0(viewInflate2);
            default:
                View viewInflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_port, viewGroup, false);
                i30.j(viewInflate3);
                return new ml0(viewInflate3);
        }
    }
}
