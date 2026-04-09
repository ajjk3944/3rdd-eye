package androidx.appcompat.widget;

import M3.u;
import R.O;
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
import com.apm.insight.R;
import com.lefan.base.activity.LanguageActivity;
import d5.y;
import g.AbstractC2327a;
import j5.e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import o.C2741u0;
import o.M0;
import o.N0;
import o.O0;
import o.P0;
import o.Q0;
import o.R0;
import o.S0;
import o.T0;
import o.V0;
import o.a1;
import w4.C2978d;

/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements m.b {

    /* renamed from: x0, reason: collision with root package name */
    public static final e f4898x0;

    /* renamed from: D, reason: collision with root package name */
    public final SearchAutoComplete f4899D;

    /* renamed from: E, reason: collision with root package name */
    public final View f4900E;

    /* renamed from: F, reason: collision with root package name */
    public final View f4901F;

    /* renamed from: G, reason: collision with root package name */
    public final View f4902G;

    /* renamed from: H, reason: collision with root package name */
    public final ImageView f4903H;

    /* renamed from: I, reason: collision with root package name */
    public final ImageView f4904I;

    /* renamed from: J, reason: collision with root package name */
    public final ImageView f4905J;

    /* renamed from: K, reason: collision with root package name */
    public final ImageView f4906K;

    /* renamed from: L, reason: collision with root package name */
    public final View f4907L;
    public T0 M;

    /* renamed from: N, reason: collision with root package name */
    public final Rect f4908N;

    /* renamed from: O, reason: collision with root package name */
    public final Rect f4909O;

    /* renamed from: P, reason: collision with root package name */
    public final int[] f4910P;

    /* renamed from: Q, reason: collision with root package name */
    public final int[] f4911Q;

    /* renamed from: R, reason: collision with root package name */
    public final ImageView f4912R;

    /* renamed from: S, reason: collision with root package name */
    public final Drawable f4913S;

    /* renamed from: T, reason: collision with root package name */
    public final int f4914T;

    /* renamed from: U, reason: collision with root package name */
    public final int f4915U;

    /* renamed from: V, reason: collision with root package name */
    public final Intent f4916V;

    /* renamed from: W, reason: collision with root package name */
    public final Intent f4917W;

    /* renamed from: a0, reason: collision with root package name */
    public final CharSequence f4918a0;
    public Q0 b0;

    /* renamed from: c0, reason: collision with root package name */
    public P0 f4919c0;

    /* renamed from: d0, reason: collision with root package name */
    public View.OnFocusChangeListener f4920d0;

    /* renamed from: e0, reason: collision with root package name */
    public View.OnClickListener f4921e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f4922f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f4923g0;

    /* renamed from: h0, reason: collision with root package name */
    public V.c f4924h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f4925i0;

    /* renamed from: j0, reason: collision with root package name */
    public CharSequence f4926j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f4927k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f4928l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f4929m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f4930n0;

    /* renamed from: o0, reason: collision with root package name */
    public String f4931o0;

    /* renamed from: p0, reason: collision with root package name */
    public CharSequence f4932p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f4933q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f4934r0;

    /* renamed from: s0, reason: collision with root package name */
    public SearchableInfo f4935s0;

    /* renamed from: t0, reason: collision with root package name */
    public Bundle f4936t0;

    /* renamed from: u0, reason: collision with root package name */
    public final M0 f4937u0;
    public final M0 v0;

    /* renamed from: w0, reason: collision with root package name */
    public final WeakHashMap f4938w0;

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: e, reason: collision with root package name */
        public int f4939e;

        /* renamed from: f, reason: collision with root package name */
        public SearchView f4940f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f4941g;

        /* renamed from: h, reason: collision with root package name */
        public final d f4942h;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, 0);
            this.f4942h = new d(this);
            this.f4939e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i3 < 480) ? 160 : 192;
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
            e eVar = SearchView.f4898x0;
            eVar.getClass();
            e.a();
            Method method = eVar.f21467c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f4939e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f4941g) {
                d dVar = this.f4942h;
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
        public final void onFocusChanged(boolean z6, int i, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onFocusChanged(z6, i, rect);
            SearchView searchView = this.f4940f;
            searchView.w(searchView.f4923g0);
            searchView.post(searchView.f4937u0);
            if (searchView.f4899D.hasFocus()) {
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
                        this.f4940f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z6) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onWindowFocusChanged(z6);
            if (z6 && this.f4940f.hasFocus() && getVisibility() == 0) {
                this.f4941g = true;
                Context context = getContext();
                e eVar = SearchView.f4898x0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z6) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.f4942h;
            if (!z6) {
                this.f4941g = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f4941g = true;
                    return;
                }
                this.f4941g = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f4940f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f4939e = i;
        }
    }

    static {
        e eVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            e eVar2 = new e();
            eVar2.f21465a = null;
            eVar2.f21466b = null;
            eVar2.f21467c = null;
            e.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                eVar2.f21465a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                eVar2.f21466b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                eVar2.f21467c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            eVar = eVar2;
        }
        f4898x0 = eVar;
    }

    public SearchView(Context context) {
        super(context, null, R.attr.searchViewStyle);
        this.f4908N = new Rect();
        this.f4909O = new Rect();
        this.f4910P = new int[2];
        this.f4911Q = new int[2];
        this.f4937u0 = new M0(this, 0);
        this.v0 = new M0(this, 1);
        this.f4938w0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        O0 o02 = new O0(this);
        u uVar = new u(2, this);
        C2741u0 c2741u0 = new C2741u0(1, this);
        T4.c cVar = new T4.c(this, 3);
        int[] iArr = AbstractC2327a.f20134v;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.searchViewStyle, 0);
        a1 a1Var = new a1(context, typedArrayObtainStyledAttributes);
        O.l(this, context, iArr, null, typedArrayObtainStyledAttributes, R.attr.searchViewStyle);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f4899D = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f4900E = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f4901F = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f4902G = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f4903H = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f4904I = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f4905J = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f4906K = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f4912R = imageView5;
        viewFindViewById.setBackground(a1Var.d(20));
        viewFindViewById2.setBackground(a1Var.d(25));
        imageView.setImageDrawable(a1Var.d(23));
        imageView2.setImageDrawable(a1Var.d(15));
        imageView3.setImageDrawable(a1Var.d(12));
        imageView4.setImageDrawable(a1Var.d(28));
        imageView5.setImageDrawable(a1Var.d(23));
        this.f4913S = a1Var.d(22);
        y.r(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f4914T = typedArrayObtainStyledAttributes.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.f4915U = typedArrayObtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(cVar);
        searchAutoComplete.setOnEditorActionListener(o02);
        searchAutoComplete.setOnItemClickListener(uVar);
        searchAutoComplete.setOnItemSelectedListener(c2741u0);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new N0(this));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f4918a0 = typedArrayObtainStyledAttributes.getText(14);
        this.f4926j0 = typedArrayObtainStyledAttributes.getText(21);
        int i = typedArrayObtainStyledAttributes.getInt(6, -1);
        if (i != -1) {
            setImeOptions(i);
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(5, -1);
        if (i3 != -1) {
            setInputType(i3);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(1, true));
        a1Var.j();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f4916V = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f4917W = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f4907L = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new P3.a(2, this));
        }
        w(this.f4922f0);
        t();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.f4899D;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f4928l0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f4899D;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f4928l0 = false;
    }

    public int getImeOptions() {
        return this.f4899D.getImeOptions();
    }

    public int getInputType() {
        return this.f4899D.getInputType();
    }

    public int getMaxWidth() {
        return this.f4929m0;
    }

    public CharSequence getQuery() {
        return this.f4899D.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f4926j0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f4935s0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f4918a0 : getContext().getText(this.f4935s0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f4915U;
    }

    public int getSuggestionRowLayout() {
        return this.f4914T;
    }

    public V.c getSuggestionsAdapter() {
        return this.f4924h0;
    }

    public final Intent j(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f4932p0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f4936t0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f4935s0.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4936t0;
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
        SearchAutoComplete searchAutoComplete = this.f4899D;
        if (i >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        e eVar = f4898x0;
        eVar.getClass();
        e.a();
        Method method = eVar.f21465a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        eVar.getClass();
        e.a();
        Method method2 = eVar.f21466b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        SearchAutoComplete searchAutoComplete = this.f4899D;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f4922f0) {
            P0 p02 = this.f4919c0;
            if (p02 != null) {
                LanguageActivity languageActivity = (LanguageActivity) ((C2978d) p02).f23975a;
                int i = LanguageActivity.f18756V;
                languageActivity.C(null);
            }
            clearFocus();
            w(true);
        }
    }

    public final void n(int i) {
        int position;
        String strM;
        Cursor cursor = this.f4924h0.f3791c;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentJ = null;
            try {
                int i3 = V0.M;
                String strM2 = V0.m(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strM2 == null) {
                    strM2 = this.f4935s0.getSuggestIntentAction();
                }
                if (strM2 == null) {
                    strM2 = "android.intent.action.SEARCH";
                }
                String strM3 = V0.m(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strM3 == null) {
                    strM3 = this.f4935s0.getSuggestIntentData();
                }
                if (strM3 != null && (strM = V0.m(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strM3 = strM3 + "/" + Uri.encode(strM);
                }
                intentJ = j(strM2, strM3 == null ? null : Uri.parse(strM3), V0.m(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), V0.m(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e6) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e6);
            }
            if (intentJ != null) {
                try {
                    getContext().startActivity(intentJ);
                } catch (RuntimeException e7) {
                    Log.e("SearchView", "Failed launch activity: " + intentJ, e7);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f4899D;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void o(int i) {
        Editable text = this.f4899D.getText();
        Cursor cursor = this.f4924h0.f3791c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return;
        }
        String strC = this.f4924h0.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    @Override // m.b
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.f4899D;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f4932p0 = "";
        clearFocus();
        w(true);
        searchAutoComplete.setImeOptions(this.f4934r0);
        this.f4933q0 = false;
    }

    @Override // m.b
    public final void onActionViewExpanded() {
        if (this.f4933q0) {
            return;
        }
        this.f4933q0 = true;
        SearchAutoComplete searchAutoComplete = this.f4899D;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f4934r0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f4937u0);
        post(this.v0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        super.onLayout(z6, i, i3, i6, i7);
        if (z6) {
            SearchAutoComplete searchAutoComplete = this.f4899D;
            int[] iArr = this.f4910P;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f4911Q;
            getLocationInWindow(iArr2);
            int i8 = iArr[1] - iArr2[1];
            int i9 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i9;
            int height = searchAutoComplete.getHeight() + i8;
            Rect rect = this.f4908N;
            rect.set(i9, i8, width, height);
            int i10 = rect.left;
            int i11 = rect.right;
            int i12 = i7 - i3;
            Rect rect2 = this.f4909O;
            rect2.set(i10, 0, i11, i12);
            T0 t02 = this.M;
            if (t02 == null) {
                T0 t03 = new T0(searchAutoComplete, rect2, rect);
                this.M = t03;
                setTouchDelegate(t03);
            } else {
                t02.f22424b.set(rect2);
                Rect rect3 = t02.f22426d;
                rect3.set(rect2);
                int i13 = -t02.f22427e;
                rect3.inset(i13, i13);
                t02.f22425c.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i3) {
        int i6;
        if (this.f4923g0) {
            super.onMeasure(i, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i7 = this.f4929m0;
            size = i7 > 0 ? Math.min(i7, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f4929m0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i6 = this.f4929m0) > 0) {
            size = Math.min(i6, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof S0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        S0 s02 = (S0) parcelable;
        super.onRestoreInstanceState(s02.f3954a);
        w(s02.f22422c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        S0 s02 = new S0(super.onSaveInstanceState());
        s02.f22422c = this.f4923g0;
        return s02;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        post(this.f4937u0);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        SearchAutoComplete searchAutoComplete = this.f4899D;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        Q0 q02 = this.b0;
        if (q02 != null) {
            String string = text.toString();
            LanguageActivity languageActivity = (LanguageActivity) ((h2.d) q02).f20472a;
            int i = LanguageActivity.f18756V;
            languageActivity.C(string);
        }
        if (this.f4935s0 != null) {
            getContext().startActivity(j("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void r() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f4899D.getText());
        int i = (!zIsEmpty || (this.f4922f0 && !this.f4933q0)) ? 0 : 8;
        ImageView imageView = this.f4905J;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.f4928l0 || !isFocusable()) {
            return false;
        }
        if (this.f4923g0) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.f4899D.requestFocus(i, rect);
        if (zRequestFocus) {
            w(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        int[] iArr = this.f4899D.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f4901F.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f4902G.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.f4936t0 = bundle;
    }

    public void setIconified(boolean z6) {
        if (z6) {
            m();
            return;
        }
        w(false);
        SearchAutoComplete searchAutoComplete = this.f4899D;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f4921e0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z6) {
        if (this.f4922f0 == z6) {
            return;
        }
        this.f4922f0 = z6;
        w(z6);
        t();
    }

    public void setImeOptions(int i) {
        this.f4899D.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f4899D.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f4929m0 = i;
        requestLayout();
    }

    public void setOnCloseListener(P0 p02) {
        this.f4919c0 = p02;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f4920d0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(Q0 q02) {
        this.b0 = q02;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f4921e0 = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f4926j0 = charSequence;
        t();
    }

    public void setQueryRefinementEnabled(boolean z6) {
        this.f4927k0 = z6;
        V.c cVar = this.f4924h0;
        if (cVar instanceof V0) {
            ((V0) cVar).f22448E = z6 ? 2 : 1;
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
            r6.f4935s0 = r7
            r0 = 0
            r1 = 1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r6.f4899D
            if (r7 == 0) goto L65
            int r7 = r7.getSuggestThreshold()
            r2.setThreshold(r7)
            android.app.SearchableInfo r7 = r6.f4935s0
            int r7 = r7.getImeOptions()
            r2.setImeOptions(r7)
            android.app.SearchableInfo r7 = r6.f4935s0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r1) goto L31
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f4935s0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L31
            r3 = 589824(0x90000, float:8.2652E-40)
            r7 = r7 | r3
        L31:
            r2.setInputType(r7)
            V.c r7 = r6.f4924h0
            if (r7 == 0) goto L3b
            r7.b(r0)
        L3b:
            android.app.SearchableInfo r7 = r6.f4935s0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L62
            o.V0 r7 = new o.V0
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f4935s0
            java.util.WeakHashMap r5 = r6.f4938w0
            r7.<init>(r3, r6, r4, r5)
            r6.f4924h0 = r7
            r2.setAdapter(r7)
            V.c r7 = r6.f4924h0
            o.V0 r7 = (o.V0) r7
            boolean r3 = r6.f4927k0
            if (r3 == 0) goto L5f
            r3 = 2
            goto L60
        L5f:
            r3 = r1
        L60:
            r7.f22448E = r3
        L62:
            r6.t()
        L65:
            android.app.SearchableInfo r7 = r6.f4935s0
            r3 = 0
            if (r7 == 0) goto L98
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L98
            android.app.SearchableInfo r7 = r6.f4935s0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L7b
            android.content.Intent r0 = r6.f4916V
            goto L85
        L7b:
            android.app.SearchableInfo r7 = r6.f4935s0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L85
            android.content.Intent r0 = r6.f4917W
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
            r6.f4930n0 = r1
            if (r1 == 0) goto La2
            java.lang.String r7 = "nm"
            r2.setPrivateImeOptions(r7)
        La2:
            boolean r7 = r6.f4923g0
            r6.w(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z6) {
        this.f4925i0 = z6;
        w(this.f4923g0);
    }

    public void setSuggestionsAdapter(V.c cVar) {
        this.f4924h0 = cVar;
        this.f4899D.setAdapter(cVar);
    }

    public final void t() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z6 = this.f4922f0;
        SearchAutoComplete searchAutoComplete = this.f4899D;
        if (z6 && (drawable = this.f4913S) != null) {
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
        this.f4902G.setVisibility(((this.f4925i0 || this.f4930n0) && !this.f4923g0 && (this.f4904I.getVisibility() == 0 || this.f4906K.getVisibility() == 0)) ? 0 : 8);
    }

    public final void v(boolean z6) {
        boolean z7 = this.f4925i0;
        this.f4904I.setVisibility((!z7 || !(z7 || this.f4930n0) || this.f4923g0 || !hasFocus() || (!z6 && this.f4930n0)) ? 8 : 0);
    }

    public final void w(boolean z6) {
        this.f4923g0 = z6;
        int i = 8;
        int i3 = z6 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f4899D.getText());
        this.f4903H.setVisibility(i3);
        v(!zIsEmpty);
        this.f4900E.setVisibility(z6 ? 8 : 0);
        ImageView imageView = this.f4912R;
        imageView.setVisibility((imageView.getDrawable() == null || this.f4922f0) ? 8 : 0);
        r();
        if (this.f4930n0 && !this.f4923g0 && zIsEmpty) {
            this.f4904I.setVisibility(8);
            i = 0;
        }
        this.f4906K.setVisibility(i);
        u();
    }

    public void setOnSuggestionListener(R0 r02) {
    }
}
