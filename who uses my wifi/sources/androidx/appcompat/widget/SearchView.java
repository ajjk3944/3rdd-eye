package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.phuongpn.whousemywifi.networkscanner.R;
import com.phuongpn.whousemywifi.networkscanner.RouterPasswordActivity;
import defpackage.bl;
import defpackage.c7;
import defpackage.cl;
import defpackage.e61;
import defpackage.hn0;
import defpackage.i21;
import defpackage.i30;
import defpackage.j5;
import defpackage.jr0;
import defpackage.jt0;
import defpackage.kt0;
import defpackage.lq;
import defpackage.lt0;
import defpackage.mt0;
import defpackage.nt0;
import defpackage.ot0;
import defpackage.pt0;
import defpackage.qt0;
import defpackage.rt0;
import defpackage.st0;
import defpackage.ve0;
import defpackage.wf;
import defpackage.xb4;
import defpackage.zy0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements wf {
    public static final ve0 n0;
    public final ImageView A;
    public final ImageView B;
    public final View C;
    public st0 D;
    public final Rect E;
    public final Rect F;
    public final int[] G;
    public final int[] H;
    public final ImageView I;
    public final Drawable J;
    public final int K;
    public final int L;
    public final Intent M;
    public final Intent N;
    public final CharSequence O;
    public pt0 P;
    public View.OnFocusChangeListener Q;
    public View.OnClickListener R;
    public boolean S;
    public boolean T;
    public bl U;
    public boolean V;
    public CharSequence W;
    public boolean a0;
    public boolean b0;
    public int c0;
    public boolean d0;
    public String e0;
    public CharSequence f0;
    public boolean g0;
    public int h0;
    public SearchableInfo i0;
    public Bundle j0;
    public final kt0 k0;
    public final kt0 l0;
    public final WeakHashMap m0;
    public final SearchAutoComplete u;
    public final View v;
    public final View w;
    public final View x;
    public final ImageView y;
    public final ImageView z;

    static {
        ve0 ve0Var = null;
        if (Build.VERSION.SDK_INT < 29) {
            ve0 ve0Var2 = new ve0();
            ve0Var2.a = null;
            ve0Var2.b = null;
            ve0Var2.c = null;
            ve0.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                ve0Var2.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                ve0Var2.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                ve0Var2.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            ve0Var = ve0Var2;
        }
        n0 = ve0Var;
    }

    public SearchView(Context context) {
        super(context, null, R.attr.searchViewStyle);
        this.E = new Rect();
        this.F = new Rect();
        this.G = new int[2];
        this.H = new int[2];
        this.k0 = new kt0(this, 0);
        this.l0 = new kt0(this, 1);
        this.m0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        nt0 nt0Var = new nt0(this);
        int i = 2;
        c7 c7Var = new c7(i, this);
        lq lqVar = new lq(i, this);
        jt0 jt0Var = new jt0(this);
        int[] iArr = hn0.u;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.searchViewStyle, 0);
        xb4 xb4Var = new xb4(context, typedArrayObtainStyledAttributes, 10);
        e61.k(this, context, iArr, null, typedArrayObtainStyledAttributes, R.attr.searchViewStyle);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.u = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.v = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.w = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.x = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.y = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.z = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.A = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.B = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.I = imageView5;
        viewFindViewById.setBackground(xb4Var.m(20));
        viewFindViewById2.setBackground(xb4Var.m(25));
        imageView.setImageDrawable(xb4Var.m(23));
        imageView2.setImageDrawable(xb4Var.m(15));
        imageView3.setImageDrawable(xb4Var.m(12));
        imageView4.setImageDrawable(xb4Var.m(28));
        imageView5.setImageDrawable(xb4Var.m(23));
        this.J = xb4Var.m(22);
        i21.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.K = typedArrayObtainStyledAttributes.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.L = typedArrayObtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(jt0Var);
        searchAutoComplete.setOnEditorActionListener(nt0Var);
        searchAutoComplete.setOnItemClickListener(c7Var);
        searchAutoComplete.setOnItemSelectedListener(lqVar);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new lt0(this));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.O = typedArrayObtainStyledAttributes.getText(14);
        this.W = typedArrayObtainStyledAttributes.getText(21);
        int i2 = typedArrayObtainStyledAttributes.getInt(6, -1);
        if (i2 != -1) {
            setImeOptions(i2);
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(5, -1);
        if (i3 != -1) {
            setInputType(i3);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(1, true));
        xb4Var.z();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.M = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.N = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.C = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new mt0(this));
        }
        w(this.S);
        t();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.u;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.b0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.u;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.b0 = false;
    }

    public int getImeOptions() {
        return this.u.getImeOptions();
    }

    public int getInputType() {
        return this.u.getInputType();
    }

    public int getMaxWidth() {
        return this.c0;
    }

    public CharSequence getQuery() {
        return this.u.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.W;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.i0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.O : getContext().getText(this.i0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.L;
    }

    public int getSuggestionRowLayout() {
        return this.K;
    }

    public bl getSuggestionsAdapter() {
        return this.U;
    }

    public final Intent j(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.j0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.i0.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.j0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void l() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.u;
        if (i >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        ve0 ve0Var = n0;
        ve0Var.getClass();
        ve0.a();
        Method method = ve0Var.a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        ve0Var.getClass();
        ve0.a();
        Method method2 = ve0Var.b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        SearchAutoComplete searchAutoComplete = this.u;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.S) {
            clearFocus();
            w(true);
        }
    }

    public final void n(int i) {
        String strL;
        Cursor cursor = this.U.h;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentJ = null;
            try {
                try {
                    int i2 = zy0.C;
                    String strL2 = zy0.l(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (strL2 == null) {
                        strL2 = this.i0.getSuggestIntentAction();
                    }
                    if (strL2 == null) {
                        strL2 = "android.intent.action.SEARCH";
                    }
                    String strL3 = zy0.l(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (strL3 == null) {
                        strL3 = this.i0.getSuggestIntentData();
                    }
                    if (strL3 != null && (strL = zy0.l(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        strL3 = strL3 + "/" + Uri.encode(strL);
                    }
                    intentJ = j(strL2, strL3 == null ? null : Uri.parse(strL3), zy0.l(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), zy0.l(cursor, cursor.getColumnIndex("suggest_intent_query")));
                } catch (RuntimeException unused) {
                    cursor.getPosition();
                }
            } catch (RuntimeException unused2) {
            }
            if (intentJ != null) {
                try {
                    getContext().startActivity(intentJ);
                } catch (RuntimeException e) {
                    Log.e("SearchView", "Failed launch activity: " + intentJ, e);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.u;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void o(int i) {
        Editable text = this.u.getText();
        Cursor cursor = this.U.h;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return;
        }
        String strC = this.U.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    @Override // defpackage.wf
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.u;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f0 = "";
        clearFocus();
        w(true);
        searchAutoComplete.setImeOptions(this.h0);
        this.g0 = false;
    }

    @Override // defpackage.wf
    public final void onActionViewExpanded() {
        if (this.g0) {
            return;
        }
        this.g0 = true;
        SearchAutoComplete searchAutoComplete = this.u;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.h0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.k0);
        post(this.l0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.u;
            int[] iArr = this.G;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.H;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i6;
            int height = searchAutoComplete.getHeight() + i5;
            Rect rect = this.E;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.F;
            rect2.set(i7, 0, i8, i9);
            st0 st0Var = this.D;
            if (st0Var == null) {
                st0 st0Var2 = new st0(searchAutoComplete, rect2, rect);
                this.D = st0Var2;
                setTouchDelegate(st0Var2);
            } else {
                st0Var.b.set(rect2);
                Rect rect3 = st0Var.d;
                rect3.set(rect2);
                int i10 = -st0Var.e;
                rect3.inset(i10, i10);
                st0Var.c.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.T) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.c0;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.c0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.c0) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof rt0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        rt0 rt0Var = (rt0) parcelable;
        super.onRestoreInstanceState(rt0Var.f);
        w(rt0Var.h);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        rt0 rt0Var = new rt0(super.onSaveInstanceState());
        rt0Var.h = this.T;
        return rt0Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.k0);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        SearchAutoComplete searchAutoComplete = this.u;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        pt0 pt0Var = this.P;
        if (pt0Var != null) {
            String string = text.toString();
            jr0 jr0Var = ((RouterPasswordActivity) pt0Var).D;
            if (jr0Var == null) {
                i30.S("routerAdapter");
                throw null;
            }
            new cl(jr0Var).filter(string);
        }
        if (this.i0 != null) {
            getContext().startActivity(j("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void r() {
        boolean zIsEmpty = TextUtils.isEmpty(this.u.getText());
        int i = (!zIsEmpty || (this.S && !this.g0)) ? 0 : 8;
        ImageView imageView = this.A;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.b0 || !isFocusable()) {
            return false;
        }
        if (this.T) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.u.requestFocus(i, rect);
        if (zRequestFocus) {
            w(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        int[] iArr = this.u.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.w.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.x.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.j0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m();
            return;
        }
        w(false);
        SearchAutoComplete searchAutoComplete = this.u;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.R;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.S == z) {
            return;
        }
        this.S = z;
        w(z);
        t();
    }

    public void setImeOptions(int i) {
        this.u.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.u.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.c0 = i;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.Q = onFocusChangeListener;
    }

    public void setOnQueryTextListener(pt0 pt0Var) {
        this.P = pt0Var;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.R = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.W = charSequence;
        t();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.a0 = z;
        bl blVar = this.U;
        if (blVar instanceof zy0) {
            ((zy0) blVar).u = z ? 2 : 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.i0 = r7
            r0 = 0
            r1 = 1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r6.u
            if (r7 == 0) goto L65
            int r7 = r7.getSuggestThreshold()
            r2.setThreshold(r7)
            android.app.SearchableInfo r7 = r6.i0
            int r7 = r7.getImeOptions()
            r2.setImeOptions(r7)
            android.app.SearchableInfo r7 = r6.i0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r1) goto L31
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.i0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L31
            r3 = 589824(0x90000, float:8.2652E-40)
            r7 = r7 | r3
        L31:
            r2.setInputType(r7)
            bl r7 = r6.U
            if (r7 == 0) goto L3b
            r7.b(r0)
        L3b:
            android.app.SearchableInfo r7 = r6.i0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L62
            zy0 r7 = new zy0
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.i0
            java.util.WeakHashMap r5 = r6.m0
            r7.<init>(r3, r6, r4, r5)
            r6.U = r7
            r2.setAdapter(r7)
            bl r7 = r6.U
            zy0 r7 = (defpackage.zy0) r7
            boolean r3 = r6.a0
            if (r3 == 0) goto L5f
            r3 = 2
            goto L60
        L5f:
            r3 = r1
        L60:
            r7.u = r3
        L62:
            r6.t()
        L65:
            android.app.SearchableInfo r7 = r6.i0
            r3 = 0
            if (r7 == 0) goto L98
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L98
            android.app.SearchableInfo r7 = r6.i0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L7b
            android.content.Intent r0 = r6.M
            goto L85
        L7b:
            android.app.SearchableInfo r7 = r6.i0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L85
            android.content.Intent r0 = r6.N
        L85:
            if (r0 == 0) goto L98
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            r4 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r0, r4)
            if (r7 == 0) goto L98
            goto L99
        L98:
            r1 = r3
        L99:
            r6.d0 = r1
            if (r1 == 0) goto La2
            java.lang.String r7 = "nm"
            r2.setPrivateImeOptions(r7)
        La2:
            boolean r7 = r6.T
            r6.w(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.V = z;
        w(this.T);
    }

    public void setSuggestionsAdapter(bl blVar) {
        this.U = blVar;
        this.u.setAdapter(blVar);
    }

    public final void t() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z = this.S;
        SearchAutoComplete searchAutoComplete = this.u;
        if (z && (drawable = this.J) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void u() {
        this.x.setVisibility(((this.V || this.d0) && !this.T && (this.z.getVisibility() == 0 || this.B.getVisibility() == 0)) ? 0 : 8);
    }

    public final void v(boolean z) {
        boolean z2 = this.V;
        this.z.setVisibility((!z2 || !(z2 || this.d0) || this.T || !hasFocus() || (!z && this.d0)) ? 8 : 0);
    }

    public final void w(boolean z) {
        this.T = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.u.getText());
        this.y.setVisibility(i2);
        v(!zIsEmpty);
        this.v.setVisibility(z ? 8 : 0);
        ImageView imageView = this.I;
        imageView.setVisibility((imageView.getDrawable() == null || this.S) ? 8 : 0);
        r();
        if (this.d0 && !this.T && zIsEmpty) {
            this.z.setVisibility(8);
            i = 0;
        }
        this.B.setVisibility(i);
        u();
    }

    /* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
    public static class SearchAutoComplete extends j5 {
        public int j;
        public SearchView k;
        public boolean l;
        public final d m;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.m = new d(this);
            this.j = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            ve0 ve0Var = SearchView.n0;
            ve0Var.getClass();
            ve0.a();
            Method method = ve0Var.c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.j <= 0 || super.enoughToFilter();
        }

        @Override // defpackage.j5, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.l) {
                d dVar = this.m;
                removeCallbacks(dVar);
                post(dVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.k;
            searchView.w(searchView.T);
            searchView.post(searchView.k0);
            if (searchView.u.hasFocus()) {
                searchView.l();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.k.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onWindowFocusChanged(z);
            if (z && this.k.hasFocus() && getVisibility() == 0) {
                this.l = true;
                Context context = getContext();
                ve0 ve0Var = SearchView.n0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.m;
            if (!z) {
                this.l = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.l = true;
                    return;
                }
                this.l = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.k = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.j = i;
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }
    }

    public void setOnCloseListener(ot0 ot0Var) {
    }

    public void setOnSuggestionListener(qt0 qt0Var) {
    }
}
