package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    e f587b;

    /* renamed from: c, reason: collision with root package name */
    private int f588c = -1;

    /* renamed from: d, reason: collision with root package name */
    private boolean f589d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f590e;

    /* renamed from: f, reason: collision with root package name */
    private final LayoutInflater f591f;

    /* renamed from: g, reason: collision with root package name */
    private final int f592g;

    public d(e eVar, LayoutInflater layoutInflater, boolean z2, int i2) {
        this.f590e = z2;
        this.f591f = layoutInflater;
        this.f587b = eVar;
        this.f592g = i2;
        a();
    }

    void a() {
        g gVarV = this.f587b.v();
        if (gVarV != null) {
            ArrayList<g> arrayListZ = this.f587b.z();
            int size = arrayListZ.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (arrayListZ.get(i2) == gVarV) {
                    this.f588c = i2;
                    return;
                }
            }
        }
        this.f588c = -1;
    }

    public e b() {
        return this.f587b;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public g getItem(int i2) {
        ArrayList<g> arrayListZ = this.f590e ? this.f587b.z() : this.f587b.E();
        int i3 = this.f588c;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return arrayListZ.get(i2);
    }

    public void d(boolean z2) {
        this.f589d = z2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<g> arrayListZ = this.f590e ? this.f587b.z() : this.f587b.E();
        int i2 = this.f588c;
        int size = arrayListZ.size();
        return i2 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f591f.inflate(this.f592g, viewGroup, false);
        }
        int groupId = getItem(i2).getGroupId();
        int i3 = i2 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f587b.F() && groupId != (i3 >= 0 ? getItem(i3).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f589d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i2), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
