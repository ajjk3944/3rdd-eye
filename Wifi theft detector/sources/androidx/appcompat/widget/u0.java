package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.mbridge.msdk.MBridgeConstans;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class u0 extends w0.c implements View.OnClickListener {

    /* renamed from: l, reason: collision with root package name */
    public final SearchView f1340l;

    /* renamed from: m, reason: collision with root package name */
    public final SearchableInfo f1341m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f1342n;

    /* renamed from: o, reason: collision with root package name */
    public final WeakHashMap f1343o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1344p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1345q;

    /* renamed from: r, reason: collision with root package name */
    public int f1346r;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f1347s;

    /* renamed from: t, reason: collision with root package name */
    public int f1348t;

    /* renamed from: u, reason: collision with root package name */
    public int f1349u;

    /* renamed from: v, reason: collision with root package name */
    public int f1350v;

    /* renamed from: w, reason: collision with root package name */
    public int f1351w;

    /* renamed from: x, reason: collision with root package name */
    public int f1352x;

    /* renamed from: y, reason: collision with root package name */
    public int f1353y;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f1354a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f1355b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f1356c;

        /* renamed from: d, reason: collision with root package name */
        public final ImageView f1357d;

        /* renamed from: e, reason: collision with root package name */
        public final ImageView f1358e;

        public a(View view) {
            this.f1354a = (TextView) view.findViewById(R.id.text1);
            this.f1355b = (TextView) view.findViewById(R.id.text2);
            this.f1356c = (ImageView) view.findViewById(R.id.icon1);
            this.f1357d = (ImageView) view.findViewById(R.id.icon2);
            this.f1358e = (ImageView) view.findViewById(c.f.edit_query);
        }
    }

    public u0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f1345q = false;
        this.f1346r = 1;
        this.f1348t = -1;
        this.f1349u = -1;
        this.f1350v = -1;
        this.f1351w = -1;
        this.f1352x = -1;
        this.f1353y = -1;
        this.f1340l = searchView;
        this.f1341m = searchableInfo;
        this.f1344p = searchView.getSuggestionCommitIconResId();
        this.f1342n = context;
        this.f1343o = weakHashMap;
    }

    public static String n(Cursor cursor, String str) {
        return v(cursor, cursor.getColumnIndex(str));
    }

    public static String v(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    public final void A(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // w0.a, w0.b.a
    public void a(Cursor cursor) {
        if (this.f1345q) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f1348t = cursor.getColumnIndex("suggest_text_1");
                this.f1349u = cursor.getColumnIndex("suggest_text_2");
                this.f1350v = cursor.getColumnIndex("suggest_text_2_url");
                this.f1351w = cursor.getColumnIndex("suggest_icon_1");
                this.f1352x = cursor.getColumnIndex("suggest_icon_2");
                this.f1353y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // w0.b.a
    public Cursor b(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f1340l.getVisibility() == 0 && this.f1340l.getWindowVisibility() == 0) {
            try {
                Cursor cursorU = u(this.f1341m, string, 50);
                if (cursorU != null) {
                    cursorU.getCount();
                    return cursorU;
                }
            } catch (RuntimeException e10) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e10);
            }
        }
        return null;
    }

    @Override // w0.a, w0.b.a
    public CharSequence convertToString(Cursor cursor) {
        String strN;
        String strN2;
        if (cursor == null) {
            return null;
        }
        String strN3 = n(cursor, "suggest_intent_query");
        if (strN3 != null) {
            return strN3;
        }
        if (this.f1341m.shouldRewriteQueryFromData() && (strN2 = n(cursor, "suggest_intent_data")) != null) {
            return strN2;
        }
        if (!this.f1341m.shouldRewriteQueryFromText() || (strN = n(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strN;
    }

    @Override // w0.a
    public void d(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i10 = this.f1353y;
        int i11 = i10 != -1 ? cursor.getInt(i10) : 0;
        if (aVar.f1354a != null) {
            y(aVar.f1354a, v(cursor, this.f1348t));
        }
        if (aVar.f1355b != null) {
            String strV = v(cursor, this.f1350v);
            CharSequence charSequenceK = strV != null ? k(strV) : v(cursor, this.f1349u);
            if (TextUtils.isEmpty(charSequenceK)) {
                TextView textView = aVar.f1354a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1354a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1354a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1354a.setMaxLines(1);
                }
            }
            y(aVar.f1355b, charSequenceK);
        }
        ImageView imageView = aVar.f1356c;
        if (imageView != null) {
            x(imageView, s(cursor), 4);
        }
        ImageView imageView2 = aVar.f1357d;
        if (imageView2 != null) {
            x(imageView2, t(cursor), 8);
        }
        int i12 = this.f1346r;
        if (i12 != 2 && (i12 != 1 || (i11 & 1) == 0)) {
            aVar.f1358e.setVisibility(8);
            return;
        }
        aVar.f1358e.setVisibility(0);
        aVar.f1358e.setTag(aVar.f1354a.getText());
        aVar.f1358e.setOnClickListener(this);
    }

    @Override // w0.c, w0.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewG = super.g(context, cursor, viewGroup);
        viewG.setTag(new a(viewG));
        ((ImageView) viewG.findViewById(c.f.edit_query)).setImageResource(this.f1344p);
        return viewG;
    }

    @Override // w0.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View viewF = f(this.f1342n, c(), viewGroup);
            if (viewF != null) {
                ((a) viewF.getTag()).f1354a.setText(e10.toString());
            }
            return viewF;
        }
    }

    @Override // w0.a, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View viewG = g(this.f1342n, c(), viewGroup);
            if (viewG != null) {
                ((a) viewG.getTag()).f1354a.setText(e10.toString());
            }
            return viewG;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    public final Drawable j(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f1343o.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    public final CharSequence k(CharSequence charSequence) {
        if (this.f1347s == null) {
            TypedValue typedValue = new TypedValue();
            this.f1342n.getTheme().resolveAttribute(c.a.textColorSearchUrl, typedValue, true);
            this.f1347s = this.f1342n.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1347s, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    public final Drawable l(ComponentName componentName) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = this.f1342n.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("SuggestionsAdapter", e10.toString());
            return null;
        }
    }

    public final Drawable m(ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f1343o.containsKey(strFlattenToShortString)) {
            Drawable drawableL = l(componentName);
            this.f1343o.put(strFlattenToShortString, drawableL != null ? drawableL.getConstantState() : null);
            return drawableL;
        }
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f1343o.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f1342n.getResources());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        A(c());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        A(c());
    }

    public final Drawable o() throws PackageManager.NameNotFoundException {
        Drawable drawableM = m(this.f1341m.getSearchActivity());
        return drawableM != null ? drawableM : this.f1342n.getPackageManager().getDefaultActivityIcon();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1340l.S((CharSequence) tag);
        }
    }

    public final Drawable p(Uri uri) throws IOException {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return q(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f1342n.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                try {
                    return drawableCreateFromStream;
                } catch (IOException e10) {
                    return drawableCreateFromStream;
                }
            } finally {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e102) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e102);
                }
            }
        } catch (FileNotFoundException e11) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e11.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e11.getMessage());
        return null;
    }

    public Drawable q(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f1342n.getPackageManager().getResourcesForApplication(authority);
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

    public final Drawable r(String str) throws NumberFormatException, IOException {
        if (str == null || str.isEmpty() || MBridgeConstans.ENDCARD_URL_TYPE_PL.equals(str)) {
            return null;
        }
        try {
            int i10 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1342n.getPackageName() + "/" + i10;
            Drawable drawableJ = j(str2);
            if (drawableJ != null) {
                return drawableJ;
            }
            Drawable drawable = ContextCompat.getDrawable(this.f1342n, i10);
            z(str2, drawable);
            return drawable;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableJ2 = j(str);
            if (drawableJ2 != null) {
                return drawableJ2;
            }
            Drawable drawableP = p(Uri.parse(str));
            z(str, drawableP);
            return drawableP;
        }
    }

    public final Drawable s(Cursor cursor) throws NumberFormatException, IOException {
        int i10 = this.f1351w;
        if (i10 == -1) {
            return null;
        }
        Drawable drawableR = r(cursor.getString(i10));
        return drawableR != null ? drawableR : o();
    }

    public final Drawable t(Cursor cursor) {
        int i10 = this.f1352x;
        if (i10 == -1) {
            return null;
        }
        return r(cursor.getString(i10));
    }

    public Cursor u(SearchableInfo searchableInfo, String str, int i10) {
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
        if (i10 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f1342n.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    public void w(int i10) {
        this.f1346r = i10;
    }

    public final void x(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    public final void y(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    public final void z(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1343o.put(str, drawable.getConstantState());
        }
    }
}
