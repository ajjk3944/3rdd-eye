package o;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.apm.insight.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class V0 extends V.c implements View.OnClickListener {
    public static final /* synthetic */ int M = 0;

    /* renamed from: C, reason: collision with root package name */
    public final WeakHashMap f22446C;

    /* renamed from: D, reason: collision with root package name */
    public final int f22447D;

    /* renamed from: E, reason: collision with root package name */
    public int f22448E;

    /* renamed from: F, reason: collision with root package name */
    public ColorStateList f22449F;

    /* renamed from: G, reason: collision with root package name */
    public int f22450G;

    /* renamed from: H, reason: collision with root package name */
    public int f22451H;

    /* renamed from: I, reason: collision with root package name */
    public int f22452I;

    /* renamed from: J, reason: collision with root package name */
    public int f22453J;

    /* renamed from: K, reason: collision with root package name */
    public int f22454K;

    /* renamed from: L, reason: collision with root package name */
    public int f22455L;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f22456j;

    /* renamed from: k, reason: collision with root package name */
    public final LayoutInflater f22457k;

    /* renamed from: l, reason: collision with root package name */
    public final SearchView f22458l;

    /* renamed from: m, reason: collision with root package name */
    public final SearchableInfo f22459m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f22460n;

    public V0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f3790b = true;
        this.f3791c = null;
        this.f3789a = false;
        this.f3792d = context;
        this.f3793e = -1;
        this.f3794f = new V.a(this);
        this.f3795g = new V.b(0, this);
        this.f22456j = suggestionRowLayout;
        this.i = suggestionRowLayout;
        this.f22457k = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f22448E = 1;
        this.f22450G = -1;
        this.f22451H = -1;
        this.f22452I = -1;
        this.f22453J = -1;
        this.f22454K = -1;
        this.f22455L = -1;
        this.f22458l = searchView;
        this.f22459m = searchableInfo;
        this.f22447D = searchView.getSuggestionCommitIconResId();
        this.f22460n = context;
        this.f22446C = weakHashMap;
    }

    public static String m(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e6) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e6);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134  */
    @Override // V.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.View r21, android.database.Cursor r22) throws android.content.pm.PackageManager.NameNotFoundException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.V0.a(android.view.View, android.database.Cursor):void");
    }

    @Override // V.c
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f22450G = cursor.getColumnIndex("suggest_text_1");
                this.f22451H = cursor.getColumnIndex("suggest_text_2");
                this.f22452I = cursor.getColumnIndex("suggest_text_2_url");
                this.f22453J = cursor.getColumnIndex("suggest_icon_1");
                this.f22454K = cursor.getColumnIndex("suggest_icon_2");
                this.f22455L = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e6) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e6);
        }
    }

    @Override // V.c
    public final String c(Cursor cursor) {
        String strM;
        String strM2;
        if (cursor == null) {
            return null;
        }
        String strM3 = m(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strM3 != null) {
            return strM3;
        }
        SearchableInfo searchableInfo = this.f22459m;
        if (searchableInfo.shouldRewriteQueryFromData() && (strM2 = m(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strM2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strM = m(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strM;
    }

    @Override // V.c
    public final View d(ViewGroup viewGroup) {
        View viewInflate = this.f22457k.inflate(this.i, viewGroup, false);
        viewInflate.setTag(new U0(viewInflate));
        ((ImageView) viewInflate.findViewById(R.id.edit_query)).setImageResource(this.f22447D);
        return viewInflate;
    }

    public final Drawable e(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f22460n.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable f(java.lang.String r11) throws android.content.pm.PackageManager.NameNotFoundException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.V0.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    @Override // V.c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e6) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e6);
            View viewInflate = this.f22457k.inflate(this.f22456j, viewGroup, false);
            if (viewInflate != null) {
                ((U0) viewInflate.getTag()).f22441a.setText(e6.toString());
            }
            return viewInflate;
        }
    }

    @Override // V.c, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e6) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e6);
            View viewD = d(viewGroup);
            ((U0) viewD.getTag()).f22441a.setText(e6.toString());
            return viewD;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    public final Cursor j(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f22460n.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f3791c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f3791c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f22458l.p((CharSequence) tag);
        }
    }
}
