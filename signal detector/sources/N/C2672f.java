package n;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.apm.insight.R;
import java.util.ArrayList;

/* renamed from: n.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2672f extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f22052a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2673g f22053b;

    public C2672f(C2673g c2673g) {
        this.f22053b = c2673g;
        a();
    }

    public final void a() {
        MenuC2677k menuC2677k = this.f22053b.f22056c;
        m mVar = menuC2677k.f22073J;
        if (mVar != null) {
            menuC2677k.i();
            ArrayList arrayList = menuC2677k.f22084j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((m) arrayList.get(i)) == mVar) {
                    this.f22052a = i;
                    return;
                }
            }
        }
        this.f22052a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m getItem(int i) {
        C2673g c2673g = this.f22053b;
        MenuC2677k menuC2677k = c2673g.f22056c;
        menuC2677k.i();
        ArrayList arrayList = menuC2677k.f22084j;
        c2673g.getClass();
        int i3 = this.f22052a;
        if (i3 >= 0 && i >= i3) {
            i++;
        }
        return (m) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C2673g c2673g = this.f22053b;
        MenuC2677k menuC2677k = c2673g.f22056c;
        menuC2677k.i();
        int size = menuC2677k.f22084j.size();
        c2673g.getClass();
        return this.f22052a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f22053b.f22055b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((x) view).a(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
