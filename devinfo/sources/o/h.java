package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.liuzh.deviceinfo.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f30223a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f30224b;

    public h(i iVar) {
        this.f30224b = iVar;
        a();
    }

    public final void a() {
        m mVar = this.f30224b.f30227c;
        o oVar = mVar.f30257v;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.j;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((o) arrayList.get(i4)) == oVar) {
                    this.f30223a = i4;
                    return;
                }
            }
        }
        this.f30223a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i4) {
        i iVar = this.f30224b;
        m mVar = iVar.f30227c;
        mVar.i();
        ArrayList arrayList = mVar.j;
        iVar.getClass();
        int i10 = this.f30223a;
        if (i10 >= 0 && i4 >= i10) {
            i4++;
        }
        return (o) arrayList.get(i4);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        i iVar = this.f30224b;
        m mVar = iVar.f30227c;
        mVar.i();
        int size = mVar.j.size();
        iVar.getClass();
        return this.f30223a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f30224b.f30226b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((z) view).a(getItem(i4));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
