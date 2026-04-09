package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class jr0 extends ao0 implements Filterable {
    public final ArrayList i;
    public ArrayList j;

    public jr0(ArrayList arrayList, wk0 wk0Var) {
        i30.m(arrayList, "arrayList");
        this.i = arrayList;
        this.j = arrayList;
    }

    @Override // defpackage.ao0
    public final int a() {
        return this.j.size();
    }

    @Override // defpackage.ao0
    public final void d(wo0 wo0Var, int i) {
        try {
            ir0 ir0Var = (ir0) wo0Var;
            Object obj = this.j.get(i);
            i30.l(obj, "get(...)");
            hr0 hr0Var = (hr0) obj;
            ir0Var.u.setText(hr0Var.a);
            ir0Var.v.setText(hr0Var.b);
            ir0Var.w.setText(hr0Var.c);
            ir0Var.x.setText(hr0Var.d);
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.ao0
    public final wo0 e(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_router_password, viewGroup, false);
        i30.j(viewInflate);
        ir0 ir0Var = new ir0(viewInflate);
        View viewFindViewById = viewInflate.findViewById(R.id.tv_brand);
        i30.l(viewFindViewById, "findViewById(...)");
        ir0Var.u = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.tv_type);
        i30.l(viewFindViewById2, "findViewById(...)");
        ir0Var.v = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.tv_username);
        i30.l(viewFindViewById3, "findViewById(...)");
        ir0Var.w = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.tv_password);
        i30.l(viewFindViewById4, "findViewById(...)");
        ir0Var.x = (TextView) viewFindViewById4;
        return ir0Var;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return new cl(this);
    }
}
