package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.app.SearchManager;
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
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
class q0 extends c0.c implements View.OnClickListener {
    private int A;

    /* renamed from: m, reason: collision with root package name */
    private final SearchManager f1091m;

    /* renamed from: n, reason: collision with root package name */
    private final SearchView f1092n;

    /* renamed from: o, reason: collision with root package name */
    private final SearchableInfo f1093o;

    /* renamed from: p, reason: collision with root package name */
    private final Context f1094p;

    /* renamed from: q, reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f1095q;

    /* renamed from: r, reason: collision with root package name */
    private final int f1096r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f1097s;

    /* renamed from: t, reason: collision with root package name */
    private int f1098t;

    /* renamed from: u, reason: collision with root package name */
    private ColorStateList f1099u;

    /* renamed from: v, reason: collision with root package name */
    private int f1100v;

    /* renamed from: w, reason: collision with root package name */
    private int f1101w;

    /* renamed from: x, reason: collision with root package name */
    private int f1102x;

    /* renamed from: y, reason: collision with root package name */
    private int f1103y;

    /* renamed from: z, reason: collision with root package name */
    private int f1104z;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f1105a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f1106b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f1107c;

        /* renamed from: d, reason: collision with root package name */
        public final ImageView f1108d;

        /* renamed from: e, reason: collision with root package name */
        public final ImageView f1109e;

        public a(View view) {
            this.f1105a = (TextView) view.findViewById(R.id.text1);
            this.f1106b = (TextView) view.findViewById(R.id.text2);
            this.f1107c = (ImageView) view.findViewById(R.id.icon1);
            this.f1108d = (ImageView) view.findViewById(R.id.icon2);
            this.f1109e = (ImageView) view.findViewById(a.f.f88q);
        }
    }

    public q0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f1097s = false;
        this.f1098t = 1;
        this.f1100v = -1;
        this.f1101w = -1;
        this.f1102x = -1;
        this.f1103y = -1;
        this.f1104z = -1;
        this.A = -1;
        this.f1091m = (SearchManager) this.f2452e.getSystemService("search");
        this.f1092n = searchView;
        this.f1093o = searchableInfo;
        this.f1096r = searchView.getSuggestionCommitIconResId();
        this.f1094p = context;
        this.f1095q = weakHashMap;
    }

    private void A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1095q.put(str, drawable.getConstantState());
        }
    }

    private void B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable k(String str) {
        Drawable.ConstantState constantState = this.f1095q.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence l(CharSequence charSequence) {
        if (this.f1099u == null) {
            TypedValue typedValue = new TypedValue();
            this.f2452e.getTheme().resolveAttribute(a.a.J, typedValue, true);
            this.f1099u = this.f2452e.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1099u, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable m(ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo;
        int iconResource;
        PackageManager packageManager = this.f2452e.getPackageManager();
        try {
            activityInfo = packageManager.getActivityInfo(componentName, 128);
            iconResource = activityInfo.getIconResource();
        } catch (PackageManager.NameNotFoundException e2) {
            string = e2.toString();
        }
        if (iconResource == 0) {
            return null;
        }
        Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
        if (drawable != null) {
            return drawable;
        }
        string = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
        Log.w("SuggestionsAdapter", string);
        return null;
    }

    private Drawable n(ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f1095q.containsKey(strFlattenToShortString)) {
            Drawable drawableM = m(componentName);
            this.f1095q.put(strFlattenToShortString, drawableM != null ? drawableM.getConstantState() : null);
            return drawableM;
        }
        Drawable.ConstantState constantState = this.f1095q.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f1094p.getResources());
    }

    public static String o(Cursor cursor, String str) {
        return w(cursor, cursor.getColumnIndex(str));
    }

    private Drawable p(Cursor cursor) throws PackageManager.NameNotFoundException {
        Drawable drawableN = n(this.f1093o.getSearchActivity());
        return drawableN != null ? drawableN : this.f2452e.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable q(Uri uri) throws IOException {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f1094p.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(inputStreamOpenInputStream, null);
            } finally {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e2) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e2);
                }
            }
        } catch (FileNotFoundException e3) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e3.getMessage());
        return null;
    }

    private Drawable s(String str) throws NumberFormatException, IOException {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i2 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1094p.getPackageName() + "/" + i2;
            Drawable drawableK = k(str2);
            if (drawableK != null) {
                return drawableK;
            }
            Drawable drawableC = r.a.c(this.f1094p, i2);
            A(str2, drawableC);
            return drawableC;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableK2 = k(str);
            if (drawableK2 != null) {
                return drawableK2;
            }
            Drawable drawableQ = q(Uri.parse(str));
            A(str, drawableQ);
            return drawableQ;
        }
    }

    private Drawable t(Cursor cursor) throws NumberFormatException, IOException {
        int i2 = this.f1103y;
        if (i2 == -1) {
            return null;
        }
        Drawable drawableS = s(cursor.getString(i2));
        return drawableS != null ? drawableS : p(cursor);
    }

    private Drawable u(Cursor cursor) {
        int i2 = this.f1104z;
        if (i2 == -1) {
            return null;
        }
        return s(cursor.getString(i2));
    }

    private static String w(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    private void y(ImageView imageView, Drawable drawable, int i2) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i2);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @Override // c0.a, c0.b.a
    public CharSequence a(Cursor cursor) {
        String strO;
        String strO2;
        if (cursor == null) {
            return null;
        }
        String strO3 = o(cursor, "suggest_intent_query");
        if (strO3 != null) {
            return strO3;
        }
        if (this.f1093o.shouldRewriteQueryFromData() && (strO2 = o(cursor, "suggest_intent_data")) != null) {
            return strO2;
        }
        if (!this.f1093o.shouldRewriteQueryFromText() || (strO = o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strO;
    }

    @Override // c0.a, c0.b.a
    public void c(Cursor cursor) {
        if (this.f1097s) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.c(cursor);
            if (cursor != null) {
                this.f1100v = cursor.getColumnIndex("suggest_text_1");
                this.f1101w = cursor.getColumnIndex("suggest_text_2");
                this.f1102x = cursor.getColumnIndex("suggest_text_2_url");
                this.f1103y = cursor.getColumnIndex("suggest_icon_1");
                this.f1104z = cursor.getColumnIndex("suggest_icon_2");
                this.A = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    @Override // c0.b.a
    public Cursor d(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f1092n.getVisibility() == 0 && this.f1092n.getWindowVisibility() == 0) {
            try {
                Cursor cursorV = v(this.f1093o, string, 50);
                if (cursorV != null) {
                    cursorV.getCount();
                    return cursorV;
                }
            } catch (RuntimeException e2) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e2);
            }
        }
        return null;
    }

    @Override // c0.a
    public void e(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i2 = this.A;
        int i3 = i2 != -1 ? cursor.getInt(i2) : 0;
        if (aVar.f1105a != null) {
            z(aVar.f1105a, w(cursor, this.f1100v));
        }
        if (aVar.f1106b != null) {
            String strW = w(cursor, this.f1102x);
            CharSequence charSequenceL = strW != null ? l(strW) : w(cursor, this.f1101w);
            if (TextUtils.isEmpty(charSequenceL)) {
                TextView textView = aVar.f1105a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1105a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1105a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1105a.setMaxLines(1);
                }
            }
            z(aVar.f1106b, charSequenceL);
        }
        ImageView imageView = aVar.f1107c;
        if (imageView != null) {
            y(imageView, t(cursor), 4);
        }
        ImageView imageView2 = aVar.f1108d;
        if (imageView2 != null) {
            y(imageView2, u(cursor), 8);
        }
        int i4 = this.f1098t;
        if (i4 != 2 && (i4 != 1 || (i3 & 1) == 0)) {
            aVar.f1109e.setVisibility(8);
            return;
        }
        aVar.f1109e.setVisibility(0);
        aVar.f1109e.setTag(aVar.f1105a.getText());
        aVar.f1109e.setOnClickListener(this);
    }

    @Override // c0.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View viewG = g(this.f2452e, this.f2451d, viewGroup);
            if (viewG != null) {
                ((a) viewG.getTag()).f1105a.setText(e2.toString());
            }
            return viewG;
        }
    }

    @Override // c0.a, android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View viewH = h(this.f2452e, this.f2451d, viewGroup);
            if (viewH != null) {
                ((a) viewH.getTag()).f1105a.setText(e2.toString());
            }
            return viewH;
        }
    }

    @Override // c0.c, c0.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewH = super.h(context, cursor, viewGroup);
        viewH.setTag(new a(viewH));
        ((ImageView) viewH.findViewById(a.f.f88q)).setImageResource(this.f1096r);
        return viewH;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        B(b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        B(b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1092n.S((CharSequence) tag);
        }
    }

    Drawable r(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f2452e.getPackageManager().getResourcesForApplication(authority);
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

    Cursor v(SearchableInfo searchableInfo, String str, int i2) {
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
        if (i2 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i2));
        }
        return this.f2452e.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    public void x(int i2) {
        this.f1098t = i2;
    }
}
