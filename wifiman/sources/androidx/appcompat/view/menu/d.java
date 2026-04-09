package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    e f26835a;

    /* renamed from: b, reason: collision with root package name */
    private int f26836b = -1;

    /* renamed from: c, reason: collision with root package name */
    private boolean f26837c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f26838d;

    /* renamed from: e, reason: collision with root package name */
    private final LayoutInflater f26839e;

    /* renamed from: f, reason: collision with root package name */
    private final int f26840f;

    public d(e eVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f26838d = z10;
        this.f26839e = layoutInflater;
        this.f26835a = eVar;
        this.f26840f = i10;
        a();
    }

    void a() {
        g gVarV = this.f26835a.v();
        if (gVarV != null) {
            ArrayList arrayListZ = this.f26835a.z();
            int size = arrayListZ.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((g) arrayListZ.get(i10)) == gVarV) {
                    this.f26836b = i10;
                    return;
                }
            }
        }
        this.f26836b = -1;
    }

    public e b() {
        return this.f26835a;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public g getItem(int i10) {
        ArrayList arrayListZ = this.f26838d ? this.f26835a.z() : this.f26835a.E();
        int i11 = this.f26836b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (g) arrayListZ.get(i10);
    }

    public void d(boolean z10) {
        this.f26837c = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f26836b < 0 ? (this.f26838d ? this.f26835a.z() : this.f26835a.E()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f26839e.inflate(this.f26840f, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i11 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f26835a.G() && groupId != (i11 >= 0 ? getItem(i11).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f26837c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.e(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
