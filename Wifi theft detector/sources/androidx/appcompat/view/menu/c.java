package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public d f706a;

    /* renamed from: b, reason: collision with root package name */
    public int f707b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f708c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f709d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f710e;

    /* renamed from: f, reason: collision with root package name */
    public final int f711f;

    public c(d dVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f709d = z10;
        this.f710e = layoutInflater;
        this.f706a = dVar;
        this.f711f = i10;
        a();
    }

    public void a() {
        f fVarX = this.f706a.x();
        if (fVarX != null) {
            ArrayList arrayListB = this.f706a.B();
            int size = arrayListB.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((f) arrayListB.get(i10)) == fVarX) {
                    this.f707b = i10;
                    return;
                }
            }
        }
        this.f707b = -1;
    }

    public d b() {
        return this.f706a;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public f getItem(int i10) {
        ArrayList arrayListB = this.f709d ? this.f706a.B() : this.f706a.G();
        int i11 = this.f707b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (f) arrayListB.get(i10);
    }

    public void d(boolean z10) {
        this.f708c = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f707b < 0 ? (this.f709d ? this.f706a.B() : this.f706a.G()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f710e.inflate(this.f711f, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f706a.I() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        i.a aVar = (i.a) view;
        if (this.f708c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.c(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
