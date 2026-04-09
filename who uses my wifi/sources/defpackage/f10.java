package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class f10 extends ao0 {
    public final /* synthetic */ int i = 0;
    public final List j;

    public f10(Context context, ArrayList arrayList) {
        i30.m(arrayList, "dataList");
        this.j = arrayList;
    }

    @Override // defpackage.ao0
    public final int a() {
        switch (this.i) {
            case 0:
                return ((ArrayList) this.j).size();
            default:
                return this.j.size();
        }
    }

    @Override // defpackage.ao0
    public final void d(wo0 wo0Var, int i) {
        switch (this.i) {
            case 0:
                Object obj = ((ArrayList) this.j).get(i);
                i30.l(obj, "get(...)");
                g10 g10Var = (g10) obj;
                TextView textView = ((e10) wo0Var).u;
                textView.setCompoundDrawablesWithIntrinsicBounds(ob1.h(textView.getContext(), g10Var.a.f), (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setText(textView.getContext().getString(g10Var.a.g) + " • " + g10Var.b);
                break;
            default:
                i81 i81Var = (i81) wo0Var;
                k81 k81Var = (k81) this.j.get(i);
                i81Var.u.setImageResource(k81Var.a);
                i81Var.v.setText(k81Var.b);
                i81Var.w.setText(k81Var.c);
                break;
        }
    }

    @Override // defpackage.ao0
    public final wo0 e(ViewGroup viewGroup, int i) {
        switch (this.i) {
            case 0:
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_host_type, viewGroup, false);
                i30.j(viewInflate);
                return new e10(viewInflate);
            default:
                View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_frag_wifi_info, viewGroup, false);
                i30.j(viewInflate2);
                return new i81(viewInflate2);
        }
    }

    public f10(ArrayList arrayList) {
        i30.m(arrayList, "mList");
        this.j = arrayList;
    }
}
