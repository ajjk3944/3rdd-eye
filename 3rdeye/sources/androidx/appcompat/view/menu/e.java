package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* compiled from: MenuAdapter.java */
/* loaded from: classes.dex */
public final class e extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    public final f f14424b;

    /* renamed from: c, reason: collision with root package name */
    public int f14425c = -1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14426d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14427e;

    /* renamed from: f, reason: collision with root package name */
    public final LayoutInflater f14428f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14429g;

    public e(f fVar, LayoutInflater layoutInflater, boolean z10, int i) {
        this.f14427e = z10;
        this.f14428f = layoutInflater;
        this.f14424b = fVar;
        this.f14429g = i;
        a();
    }

    public final void a() {
        f fVar = this.f14424b;
        h hVar = fVar.f14451v;
        if (hVar != null) {
            fVar.i();
            ArrayList<h> arrayList = fVar.f14439j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == hVar) {
                    this.f14425c = i;
                    return;
                }
            }
        }
        this.f14425c = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final h getItem(int i) {
        ArrayList<h> arrayListL;
        f fVar = this.f14424b;
        if (this.f14427e) {
            fVar.i();
            arrayListL = fVar.f14439j;
        } else {
            arrayListL = fVar.l();
        }
        int i10 = this.f14425c;
        if (i10 >= 0 && i >= i10) {
            i++;
        }
        return arrayListL.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<h> arrayListL;
        f fVar = this.f14424b;
        if (this.f14427e) {
            fVar.i();
            arrayListL = fVar.f14439j;
        } else {
            arrayListL = fVar.l();
        }
        return this.f14425c < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z10 = false;
        if (view == null) {
            view = this.f14428f.inflate(this.f14429g, viewGroup, false);
        }
        int i10 = getItem(i).f14461b;
        int i11 = i - 1;
        int i12 = i11 >= 0 ? getItem(i11).f14461b : i10;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f14424b.m() && i10 != i12) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        k.a aVar = (k.a) view;
        if (this.f14426d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.i(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
