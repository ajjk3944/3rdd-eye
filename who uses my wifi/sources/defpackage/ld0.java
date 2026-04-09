package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ld0 extends BaseAdapter {
    public final od0 f;
    public int g = -1;
    public boolean h;
    public final boolean i;
    public final LayoutInflater j;
    public final int k;

    public ld0(od0 od0Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.i = z;
        this.j = layoutInflater;
        this.f = od0Var;
        this.k = i;
        a();
    }

    public final void a() {
        od0 od0Var = this.f;
        sd0 sd0Var = od0Var.v;
        if (sd0Var != null) {
            od0Var.i();
            ArrayList arrayList = od0Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((sd0) arrayList.get(i)) == sd0Var) {
                    this.g = i;
                    return;
                }
            }
        }
        this.g = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final sd0 getItem(int i) {
        ArrayList arrayListL;
        boolean z = this.i;
        od0 od0Var = this.f;
        if (z) {
            od0Var.i();
            arrayListL = od0Var.j;
        } else {
            arrayListL = od0Var.l();
        }
        int i2 = this.g;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (sd0) arrayListL.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z = this.i;
        od0 od0Var = this.f;
        if (z) {
            od0Var.i();
            arrayListL = od0Var.j;
        } else {
            arrayListL = od0Var.l();
        }
        return this.g < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.j.inflate(this.k, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        ge0 ge0Var = (ge0) view;
        if (this.h) {
            listMenuItemView.setForceShowIcon(true);
        }
        ge0Var.c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
