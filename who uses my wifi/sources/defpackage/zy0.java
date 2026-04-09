package defpackage;

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
import com.phuongpn.whousemywifi.networkscanner.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zy0 extends bl implements View.OnClickListener {
    public static final /* synthetic */ int C = 0;
    public int A;
    public int B;
    public final int m;
    public final int n;
    public final LayoutInflater o;
    public final SearchView p;
    public final SearchableInfo q;
    public final Context r;
    public final WeakHashMap s;
    public final int t;
    public int u;
    public ColorStateList v;
    public int w;
    public int x;
    public int y;
    public int z;

    public zy0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.g = true;
        this.h = null;
        this.f = false;
        this.i = -1;
        this.j = new zk(this);
        this.k = new al(0, this);
        this.n = suggestionRowLayout;
        this.m = suggestionRowLayout;
        this.o = (LayoutInflater) context.getSystemService("layout_inflater");
        this.u = 1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.A = -1;
        this.B = -1;
        this.p = searchView;
        this.q = searchableInfo;
        this.t = searchView.getSuggestionCommitIconResId();
        this.r = context;
        this.s = weakHashMap;
    }

    public static String l(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011a  */
    @Override // defpackage.bl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.View r21, android.database.Cursor r22) throws android.content.pm.PackageManager.NameNotFoundException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy0.a(android.view.View, android.database.Cursor):void");
    }

    @Override // defpackage.bl
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.w = cursor.getColumnIndex("suggest_text_1");
                this.x = cursor.getColumnIndex("suggest_text_2");
                this.y = cursor.getColumnIndex("suggest_text_2_url");
                this.z = cursor.getColumnIndex("suggest_icon_1");
                this.A = cursor.getColumnIndex("suggest_icon_2");
                this.B = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // defpackage.bl
    public final String c(Cursor cursor) {
        String strL;
        String strL2;
        if (cursor == null) {
            return null;
        }
        String strL3 = l(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strL3 != null) {
            return strL3;
        }
        SearchableInfo searchableInfo = this.q;
        if (searchableInfo.shouldRewriteQueryFromData() && (strL2 = l(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strL2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strL = l(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strL;
    }

    @Override // defpackage.bl
    public final View d(ViewGroup viewGroup) {
        View viewInflate = this.o.inflate(this.m, viewGroup, false);
        viewInflate.setTag(new yy0(viewInflate));
        ((ImageView) viewInflate.findViewById(R.id.edit_query)).setImageResource(this.t);
        return viewInflate;
    }

    public final Drawable e(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.r.getPackageManager().getResourcesForApplication(authority);
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

    @Override // defpackage.bl, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View viewInflate = this.o.inflate(this.n, viewGroup, false);
            if (viewInflate != null) {
                ((yy0) viewInflate.getTag()).a.setText(e.toString());
            }
            return viewInflate;
        }
    }

    @Override // defpackage.bl, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View viewD = d(viewGroup);
            ((yy0) viewD.getTag()).a.setText(e.toString());
            return viewD;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable h(java.lang.String r11) throws android.content.pm.PackageManager.NameNotFoundException, java.lang.NumberFormatException, java.io.IOException {
        /*
            r10 = this;
            java.util.WeakHashMap r0 = r10.s
            android.content.Context r1 = r10.r
            java.lang.String r2 = "android.resource://"
            r3 = 0
            if (r11 == 0) goto Lf1
            boolean r4 = r11.isEmpty()
            if (r4 != 0) goto Lf1
            java.lang.String r4 = "0"
            boolean r4 = r4.equals(r11)
            if (r4 == 0) goto L19
            goto Lf1
        L19:
            int r4 = java.lang.Integer.parseInt(r11)     // Catch: java.lang.NumberFormatException -> L54 android.content.res.Resources.NotFoundException -> Lf1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L54 android.content.res.Resources.NotFoundException -> Lf1
            r5.<init>(r2)     // Catch: java.lang.NumberFormatException -> L54 android.content.res.Resources.NotFoundException -> Lf1
            java.lang.String r2 = r1.getPackageName()     // Catch: java.lang.NumberFormatException -> L54 android.content.res.Resources.NotFoundException -> Lf1
            r5.append(r2)     // Catch: java.lang.NumberFormatException -> L54 android.content.res.Resources.NotFoundException -> Lf1
            java.lang.String r2 = "/"
            r5.append(r2)     // Catch: java.lang.NumberFormatException -> L54 android.content.res.Resources.NotFoundException -> Lf1
            r5.append(r4)     // Catch: java.lang.NumberFormatException -> L54 android.content.res.Resources.NotFoundException -> Lf1
            java.lang.String r2 = r5.toString()     // Catch: java.lang.NumberFormatException -> L54 android.content.res.Resources.NotFoundException -> Lf1
            java.lang.Object r5 = r0.get(r2)     // Catch: java.lang.NumberFormatException -> L54 android.content.res.Resources.NotFoundException -> Lf1
            android.graphics.drawable.Drawable$ConstantState r5 = (android.graphics.drawable.Drawable.ConstantState) r5     // Catch: java.lang.NumberFormatException -> L54 android.content.res.Resources.NotFoundException -> Lf1
            if (r5 != 0) goto L3f
            r5 = r3
            goto L43
        L3f:
            android.graphics.drawable.Drawable r5 = r5.newDrawable()     // Catch: java.lang.NumberFormatException -> L54 android.content.res.Resources.NotFoundException -> Lf1
        L43:
            if (r5 == 0) goto L46
            return r5
        L46:
            android.graphics.drawable.Drawable r4 = defpackage.jj.b(r1, r4)     // Catch: java.lang.NumberFormatException -> L54 android.content.res.Resources.NotFoundException -> Lf1
            if (r4 == 0) goto L53
            android.graphics.drawable.Drawable$ConstantState r5 = r4.getConstantState()     // Catch: java.lang.NumberFormatException -> L54 android.content.res.Resources.NotFoundException -> Lf1
            r0.put(r2, r5)     // Catch: java.lang.NumberFormatException -> L54 android.content.res.Resources.NotFoundException -> Lf1
        L53:
            return r4
        L54:
            java.lang.Object r2 = r0.get(r11)
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
            if (r2 != 0) goto L5e
            r2 = r3
            goto L62
        L5e:
            android.graphics.drawable.Drawable r2 = r2.newDrawable()
        L62:
            if (r2 == 0) goto L65
            return r2
        L65:
            android.net.Uri r2 = android.net.Uri.parse(r11)
            java.lang.String r4 = "SuggestionsAdapter"
            java.lang.String r5 = "Error closing icon stream for "
            java.lang.String r6 = "Failed to open "
            java.lang.String r7 = "Resource does not exist: "
            java.lang.String r8 = r2.getScheme()     // Catch: java.io.FileNotFoundException -> L82
            java.lang.String r9 = "android.resource"
            boolean r8 = r9.equals(r8)     // Catch: java.io.FileNotFoundException -> L82
            if (r8 == 0) goto L96
            android.graphics.drawable.Drawable r3 = r10.e(r2)     // Catch: java.io.FileNotFoundException -> L82 android.content.res.Resources.NotFoundException -> L84
            goto Le8
        L82:
            r1 = move-exception
            goto Le2
        L84:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> L82
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L82
            r4.<init>(r7)     // Catch: java.io.FileNotFoundException -> L82
            r4.append(r2)     // Catch: java.io.FileNotFoundException -> L82
            java.lang.String r4 = r4.toString()     // Catch: java.io.FileNotFoundException -> L82
            r1.<init>(r4)     // Catch: java.io.FileNotFoundException -> L82
            throw r1     // Catch: java.io.FileNotFoundException -> L82
        L96:
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.io.FileNotFoundException -> L82
            java.io.InputStream r1 = r1.openInputStream(r2)     // Catch: java.io.FileNotFoundException -> L82
            if (r1 == 0) goto Ld0
            android.graphics.drawable.Drawable r6 = android.graphics.drawable.Drawable.createFromStream(r1, r3)     // Catch: java.lang.Throwable -> Lba
            r1.close()     // Catch: java.io.IOException -> La9
        La7:
            r3 = r6
            goto Le8
        La9:
            r1 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L82
            r7.<init>(r5)     // Catch: java.io.FileNotFoundException -> L82
            r7.append(r2)     // Catch: java.io.FileNotFoundException -> L82
            java.lang.String r5 = r7.toString()     // Catch: java.io.FileNotFoundException -> L82
            android.util.Log.e(r4, r5, r1)     // Catch: java.io.FileNotFoundException -> L82
            goto La7
        Lba:
            r6 = move-exception
            r1.close()     // Catch: java.io.IOException -> Lbf
            goto Lcf
        Lbf:
            r1 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L82
            r7.<init>(r5)     // Catch: java.io.FileNotFoundException -> L82
            r7.append(r2)     // Catch: java.io.FileNotFoundException -> L82
            java.lang.String r5 = r7.toString()     // Catch: java.io.FileNotFoundException -> L82
            android.util.Log.e(r4, r5, r1)     // Catch: java.io.FileNotFoundException -> L82
        Lcf:
            throw r6     // Catch: java.io.FileNotFoundException -> L82
        Ld0:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> L82
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L82
            r4.<init>(r6)     // Catch: java.io.FileNotFoundException -> L82
            r4.append(r2)     // Catch: java.io.FileNotFoundException -> L82
            java.lang.String r4 = r4.toString()     // Catch: java.io.FileNotFoundException -> L82
            r1.<init>(r4)     // Catch: java.io.FileNotFoundException -> L82
            throw r1     // Catch: java.io.FileNotFoundException -> L82
        Le2:
            java.util.Objects.toString(r2)
            r1.getMessage()
        Le8:
            if (r3 == 0) goto Lf1
            android.graphics.drawable.Drawable$ConstantState r1 = r3.getConstantState()
            r0.put(r11, r1)
        Lf1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy0.h(java.lang.String):android.graphics.drawable.Drawable");
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
        return this.r.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.h;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.h;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.p.p((CharSequence) tag);
        }
    }
}
