package n;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: n.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2674h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final MenuC2677k f22060a;

    /* renamed from: b, reason: collision with root package name */
    public int f22061b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22062c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f22063d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f22064e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22065f;

    public C2674h(MenuC2677k menuC2677k, LayoutInflater layoutInflater, boolean z6, int i) {
        this.f22063d = z6;
        this.f22064e = layoutInflater;
        this.f22060a = menuC2677k;
        this.f22065f = i;
        a();
    }

    public final void a() {
        MenuC2677k menuC2677k = this.f22060a;
        m mVar = menuC2677k.f22073J;
        if (mVar != null) {
            menuC2677k.i();
            ArrayList arrayList = menuC2677k.f22084j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((m) arrayList.get(i)) == mVar) {
                    this.f22061b = i;
                    return;
                }
            }
        }
        this.f22061b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m getItem(int i) {
        ArrayList arrayListL;
        boolean z6 = this.f22063d;
        MenuC2677k menuC2677k = this.f22060a;
        if (z6) {
            menuC2677k.i();
            arrayListL = menuC2677k.f22084j;
        } else {
            arrayListL = menuC2677k.l();
        }
        int i3 = this.f22061b;
        if (i3 >= 0 && i >= i3) {
            i++;
        }
        return (m) arrayListL.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z6 = this.f22063d;
        MenuC2677k menuC2677k = this.f22060a;
        if (z6) {
            menuC2677k.i();
            arrayListL = menuC2677k.f22084j;
        } else {
            arrayListL = menuC2677k.l();
        }
        return this.f22061b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z6 = false;
        if (view == null) {
            view = this.f22064e.inflate(this.f22065f, viewGroup, false);
        }
        int i3 = getItem(i).f22107b;
        int i6 = i - 1;
        int i7 = i6 >= 0 ? getItem(i6).f22107b : i3;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f22060a.m() && i3 != i7) {
            z6 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z6);
        x xVar = (x) view;
        if (this.f22062c) {
            listMenuItemView.setForceShowIcon(true);
        }
        xVar.a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
