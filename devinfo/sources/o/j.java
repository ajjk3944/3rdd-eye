package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final m f30231a;

    /* renamed from: b, reason: collision with root package name */
    public int f30232b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30233c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f30234d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f30235e;

    /* renamed from: f, reason: collision with root package name */
    public final int f30236f;

    public j(m mVar, LayoutInflater layoutInflater, boolean z3, int i4) {
        this.f30234d = z3;
        this.f30235e = layoutInflater;
        this.f30231a = mVar;
        this.f30236f = i4;
        a();
    }

    public final void a() {
        m mVar = this.f30231a;
        o oVar = mVar.f30257v;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.j;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((o) arrayList.get(i4)) == oVar) {
                    this.f30232b = i4;
                    return;
                }
            }
        }
        this.f30232b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i4) {
        ArrayList arrayListL;
        boolean z3 = this.f30234d;
        m mVar = this.f30231a;
        if (z3) {
            mVar.i();
            arrayListL = mVar.j;
        } else {
            arrayListL = mVar.l();
        }
        int i10 = this.f30232b;
        if (i10 >= 0 && i4 >= i10) {
            i4++;
        }
        return (o) arrayListL.get(i4);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z3 = this.f30234d;
        m mVar = this.f30231a;
        if (z3) {
            mVar.i();
            arrayListL = mVar.j;
        } else {
            arrayListL = mVar.l();
        }
        return this.f30232b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        boolean z3 = false;
        if (view == null) {
            view = this.f30235e.inflate(this.f30236f, viewGroup, false);
        }
        int i10 = getItem(i4).f30264b;
        int i11 = i4 - 1;
        int i12 = i11 >= 0 ? getItem(i11).f30264b : i10;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f30231a.m() && i10 != i12) {
            z3 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z3);
        z zVar = (z) view;
        if (this.f30233c) {
            listMenuItemView.setForceShowIcon(true);
        }
        zVar.a(getItem(i4));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
