package o;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: SuggestionsAdapter.java */
/* loaded from: classes.dex */
public final class Q extends S0.c implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public int f44589f;

    /* renamed from: g, reason: collision with root package name */
    public int f44590g;

    /* renamed from: h, reason: collision with root package name */
    public int f44591h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f44592j;

    /* renamed from: k, reason: collision with root package name */
    public int f44593k;

    /* renamed from: l, reason: collision with root package name */
    public int f44594l;

    /* compiled from: SuggestionsAdapter.java */
    public static final class a {
    }

    public Q() {
        throw null;
    }

    @Override // S0.a
    public final void a(View view, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i = this.f44594l;
        int i10 = i != -1 ? cursor.getInt(i) : 0;
        aVar.getClass();
        int i11 = this.f44589f;
        if (i11 != 2 && (i11 != 1 || (i10 & 1) == 0)) {
            throw null;
        }
        throw null;
    }

    @Override // S0.a
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f44590g = cursor.getColumnIndex("suggest_text_1");
                this.f44591h = cursor.getColumnIndex("suggest_text_2");
                this.i = cursor.getColumnIndex("suggest_text_2_url");
                this.f44592j = cursor.getColumnIndex("suggest_icon_1");
                this.f44593k = cursor.getColumnIndex("suggest_icon_2");
                this.f44594l = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e4) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable c(java.lang.String r3) throws java.lang.NumberFormatException {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L23
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L23
            java.lang.String r1 = "0"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L12
            goto L23
        L12:
            java.lang.Integer.parseInt(r3)     // Catch: android.content.res.Resources.NotFoundException -> L16 java.lang.NumberFormatException -> L22
            throw r0
        L16:
            java.lang.String r1 = "Icon resource not found: "
            java.lang.String r3 = r1.concat(r3)
            java.lang.String r1 = "SuggestionsAdapter"
            android.util.Log.w(r1, r3)
            return r0
        L22:
            throw r0
        L23:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.Q.c(java.lang.String):android.graphics.drawable.Drawable");
    }

    @Override // S0.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e4) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e4);
            throw null;
        }
    }

    @Override // S0.a, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            super.getView(i, view, viewGroup);
            return view;
        } catch (RuntimeException e4) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e4);
            throw null;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f11842c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f11842c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getTag() instanceof CharSequence) {
            throw null;
        }
    }
}
