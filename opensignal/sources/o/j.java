package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final m f18606a;

    /* renamed from: b, reason: collision with root package name */
    public int f18607b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18608c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18609d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f18610e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18611f;

    public j(m mVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f18609d = z10;
        this.f18610e = layoutInflater;
        this.f18606a = mVar;
        this.f18611f = i10;
        a();
    }

    public final void a() {
        m mVar = this.f18606a;
        o oVar = mVar.f18632v;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((o) arrayList.get(i10)) == oVar) {
                    this.f18607b = i10;
                    return;
                }
            }
        }
        this.f18607b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i10) {
        ArrayList arrayListL;
        boolean z10 = this.f18609d;
        m mVar = this.f18606a;
        if (z10) {
            mVar.i();
            arrayListL = mVar.j;
        } else {
            arrayListL = mVar.l();
        }
        int i11 = this.f18607b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (o) arrayListL.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z10 = this.f18609d;
        m mVar = this.f18606a;
        if (z10) {
            mVar.i();
            arrayListL = mVar.j;
        } else {
            arrayListL = mVar.l();
        }
        return this.f18607b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        boolean z10 = false;
        if (view == null) {
            view = this.f18610e.inflate(this.f18611f, viewGroup, false);
        }
        int i11 = getItem(i10).f18639b;
        int i12 = i10 - 1;
        int i13 = i12 >= 0 ? getItem(i12).f18639b : i11;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f18606a.m() && i11 != i13) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        z zVar = (z) view;
        if (this.f18608c) {
            listMenuItemView.setForceShowIcon(true);
        }
        zVar.a(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
