package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class b70 extends BaseAdapter {
    public int f = -1;
    public final /* synthetic */ c70 g;

    public b70(c70 c70Var) {
        this.g = c70Var;
        a();
    }

    public final void a() {
        od0 od0Var = this.g.h;
        sd0 sd0Var = od0Var.v;
        if (sd0Var != null) {
            od0Var.i();
            ArrayList arrayList = od0Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((sd0) arrayList.get(i)) == sd0Var) {
                    this.f = i;
                    return;
                }
            }
        }
        this.f = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final sd0 getItem(int i) {
        c70 c70Var = this.g;
        od0 od0Var = c70Var.h;
        od0Var.i();
        ArrayList arrayList = od0Var.j;
        c70Var.getClass();
        int i2 = this.f;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (sd0) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        c70 c70Var = this.g;
        od0 od0Var = c70Var.h;
        od0Var.i();
        int size = od0Var.j.size();
        c70Var.getClass();
        return this.f < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.g.g.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((ge0) view).c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
