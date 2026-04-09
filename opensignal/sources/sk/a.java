package sk;

import android.widget.Filter;
import br.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a extends Filter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f22062a;

    public a(b bVar) {
        this.f22062a = bVar;
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        l.c(obj, "null cannot be cast to non-null type com.staircase3.opensignal.models.City");
        return ((sm.a) obj).f22103b;
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        String lowerCase = String.valueOf(charSequence).toLowerCase(Locale.ROOT);
        l.d(lowerCase, "toLowerCase(...)");
        String string = tt.l.a1(lowerCase).toString();
        List list = this.f22062a.f22064b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String lowerCase2 = ((sm.a) obj).f22104c.toLowerCase(Locale.ROOT);
            l.d(lowerCase2, "toLowerCase(...)");
            if (tt.l.q0(tt.l.a1(lowerCase2).toString(), string, false)) {
                arrayList.add(obj);
            }
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        filterResults.values = arrayList;
        filterResults.count = arrayList.size();
        Objects.toString(charSequence);
        arrayList.toString();
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        l.e(filterResults, "results");
        Objects.toString(charSequence);
        Objects.toString(filterResults.values);
        b bVar = this.f22062a;
        ArrayList arrayList = bVar.f22066d;
        arrayList.clear();
        Object obj = filterResults.values;
        l.c(obj, "null cannot be cast to non-null type java.util.ArrayList<com.staircase3.opensignal.models.City>");
        arrayList.addAll((ArrayList) obj);
        bVar.notifyDataSetChanged();
    }
}
