package sk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import br.l;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final int f22063a;

    /* renamed from: b, reason: collision with root package name */
    public final List f22064b;

    /* renamed from: c, reason: collision with root package name */
    public mn.a f22065c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f22066d;

    /* renamed from: e, reason: collision with root package name */
    public final a f22067e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, int i10, ArrayList arrayList) {
        super(context, i10, arrayList);
        l.e(arrayList, "cityList");
        this.f22063a = i10;
        this.f22064b = arrayList;
        this.f22066d = new ArrayList();
        this.f22067e = new a(this);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sm.a getItem(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f22066d;
            if (i10 < arrayList.size()) {
                return (sm.a) arrayList.get(i10);
            }
        }
        return new sm.a("", "", "", "", 51.532531d, -0.105936d);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        return this.f22066d.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public final Filter getFilter() {
        return this.f22067e;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        l.e(viewGroup, "parent");
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(this.f22063a, viewGroup, false);
        }
        sm.a item = getItem(i10);
        View viewFindViewById = view.findViewById(qk.h.tvPlaceName);
        l.d(viewFindViewById, "findViewById(...)");
        String str = item.f22103b;
        String str2 = item.f22105d;
        ((TextView) viewFindViewById).setText(str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(item.f22102a);
        sb2.append(!tt.l.D0(str2) ? ", ".concat(str2) : "");
        String string = sb2.toString();
        View viewFindViewById2 = view.findViewById(qk.h.tvCountryName);
        l.d(viewFindViewById2, "findViewById(...)");
        ((TextView) viewFindViewById2).setText(string);
        View viewFindViewById3 = view.findViewById(qk.h.rootPlaceWidget);
        l.d(viewFindViewById3, "findViewById(...)");
        ((ConstraintLayout) viewFindViewById3).setOnClickListener(new dn.j(this, 4, item));
        return view;
    }
}
