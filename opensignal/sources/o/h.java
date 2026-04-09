package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f18598a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f18599b;

    public h(i iVar) {
        this.f18599b = iVar;
        a();
    }

    public final void a() {
        m mVar = this.f18599b.f18602g;
        o oVar = mVar.f18632v;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((o) arrayList.get(i10)) == oVar) {
                    this.f18598a = i10;
                    return;
                }
            }
        }
        this.f18598a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i10) {
        i iVar = this.f18599b;
        m mVar = iVar.f18602g;
        mVar.i();
        ArrayList arrayList = mVar.j;
        iVar.getClass();
        int i11 = this.f18598a;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (o) arrayList.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        i iVar = this.f18599b;
        m mVar = iVar.f18602g;
        mVar.i();
        int size = mVar.j.size();
        iVar.getClass();
        return this.f18598a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            i iVar = this.f18599b;
            view = iVar.f18601d.inflate(iVar.f18604x, viewGroup, false);
        }
        ((z) view).a(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
