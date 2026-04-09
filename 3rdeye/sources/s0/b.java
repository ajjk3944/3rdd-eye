package S0;

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import o.Q;

/* compiled from: CursorFilter.java */
/* loaded from: classes.dex */
public final class b extends Filter {

    /* renamed from: a, reason: collision with root package name */
    public a f11845a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        Cursor cursor = (Cursor) obj;
        ((Q) this.f11845a).getClass();
        if (cursor == null) {
            return null;
        }
        int columnIndex = cursor.getColumnIndex("suggest_intent_query");
        String string = null;
        if (columnIndex != -1) {
            try {
                string = cursor.getString(columnIndex);
            } catch (Exception e4) {
                Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e4);
            }
        }
        string.getClass();
        return string;
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Q q10 = (Q) this.f11845a;
        if (charSequence != null) {
            q10.getClass();
            charSequence.toString();
        }
        q10.getClass();
        throw null;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        a aVar = this.f11845a;
        Cursor cursor = aVar.f11842c;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((Q) aVar).b((Cursor) obj);
    }
}
