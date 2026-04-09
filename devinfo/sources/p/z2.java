package p;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
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
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import com.applovin.sdk.AppLovinEventParameters;
import com.liuzh.deviceinfo.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class z2 extends u1 implements n.b {

    /* renamed from: j0, reason: collision with root package name */
    public static final ek.f f30921j0;
    public final Rect A;
    public final int[] B;
    public final int[] C;
    public final ImageView D;
    public final Drawable E;
    public final int F;
    public final int G;
    public final Intent H;
    public final Intent I;
    public final CharSequence J;
    public v2 K;
    public u2 L;
    public View.OnFocusChangeListener M;
    public View.OnClickListener N;
    public boolean O;
    public boolean P;
    public k4.a Q;
    public boolean R;
    public CharSequence S;
    public boolean T;
    public boolean U;
    public int V;
    public boolean W;

    /* renamed from: a0, reason: collision with root package name */
    public String f30922a0;

    /* renamed from: b0, reason: collision with root package name */
    public CharSequence f30923b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f30924c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f30925d0;

    /* renamed from: e0, reason: collision with root package name */
    public SearchableInfo f30926e0;

    /* renamed from: f0, reason: collision with root package name */
    public Bundle f30927f0;

    /* renamed from: g0, reason: collision with root package name */
    public final p2 f30928g0;

    /* renamed from: h0, reason: collision with root package name */
    public final p2 f30929h0;

    /* renamed from: i0, reason: collision with root package name */
    public final WeakHashMap f30930i0;

    /* renamed from: p, reason: collision with root package name */
    public final SearchView$SearchAutoComplete f30931p;

    /* renamed from: q, reason: collision with root package name */
    public final View f30932q;

    /* renamed from: r, reason: collision with root package name */
    public final View f30933r;

    /* renamed from: s, reason: collision with root package name */
    public final View f30934s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f30935t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f30936u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f30937v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f30938w;

    /* renamed from: x, reason: collision with root package name */
    public final View f30939x;

    /* renamed from: y, reason: collision with root package name */
    public y2 f30940y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f30941z;

    static {
        ek.f fVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            ek.f fVar2 = new ek.f();
            fVar2.f23532a = null;
            fVar2.f23533b = null;
            fVar2.f23534c = null;
            ek.f.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                fVar2.f23532a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                fVar2.f23533b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                fVar2.f23534c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            fVar = fVar2;
        }
        f30921j0 = fVar;
    }

    public z2(Context context) {
        super(context, null, R.attr.searchViewStyle);
        this.f30941z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        this.f30928g0 = new p2(this, 0);
        this.f30929h0 = new p2(this, 1);
        this.f30930i0 = new WeakHashMap();
        aa.j jVar = new aa.j(7, this);
        r2 r2Var = new r2(this);
        s2 s2Var = new s2(this);
        kd.t tVar = new kd.t(2, this);
        v1 v1Var = new v1(1, this);
        o2 o2Var = new o2(0, this);
        int[] iArr = h.a.f24794u;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.searchViewStyle, 0);
        i0.f fVar = new i0.f(context, typedArrayObtainStyledAttributes);
        e4.v0.n(this, context, iArr, null, typedArrayObtainStyledAttributes, R.attr.searchViewStyle);
        LayoutInflater.from(context).inflate(typedArrayObtainStyledAttributes.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f30931p = searchView$SearchAutoComplete;
        searchView$SearchAutoComplete.setSearchView(this);
        this.f30932q = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.f30933r = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.f30934s = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f30935t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f30936u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f30937v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f30938w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.D = imageView5;
        viewFindViewById.setBackground(fVar.A(20));
        viewFindViewById2.setBackground(fVar.A(25));
        imageView.setImageDrawable(fVar.A(23));
        imageView2.setImageDrawable(fVar.A(15));
        imageView3.setImageDrawable(fVar.A(12));
        imageView4.setImageDrawable(fVar.A(28));
        imageView5.setImageDrawable(fVar.A(23));
        this.E = fVar.A(22);
        pd.b.s(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.F = typedArrayObtainStyledAttributes.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.G = typedArrayObtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(jVar);
        imageView3.setOnClickListener(jVar);
        imageView2.setOnClickListener(jVar);
        imageView4.setOnClickListener(jVar);
        searchView$SearchAutoComplete.setOnClickListener(jVar);
        searchView$SearchAutoComplete.addTextChangedListener(o2Var);
        searchView$SearchAutoComplete.setOnEditorActionListener(s2Var);
        searchView$SearchAutoComplete.setOnItemClickListener(tVar);
        searchView$SearchAutoComplete.setOnItemSelectedListener(v1Var);
        searchView$SearchAutoComplete.setOnKeyListener(r2Var);
        searchView$SearchAutoComplete.setOnFocusChangeListener(new q2(this));
        setIconifiedByDefault(typedArrayObtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.J = typedArrayObtainStyledAttributes.getText(14);
        this.S = typedArrayObtainStyledAttributes.getText(21);
        int i4 = typedArrayObtainStyledAttributes.getInt(6, -1);
        if (i4 != -1) {
            setImeOptions(i4);
        }
        int i10 = typedArrayObtainStyledAttributes.getInt(5, -1);
        if (i10 != -1) {
            setInputType(i10);
        }
        setFocusable(typedArrayObtainStyledAttributes.getBoolean(1, true));
        fVar.M();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.I = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchView$SearchAutoComplete.getDropDownAnchor());
        this.f30939x = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new nc.a(2, this));
        }
        w(this.O);
        t();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f30931p;
        searchView$SearchAutoComplete.setText(charSequence);
        searchView$SearchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.U = true;
        super.clearFocus();
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f30931p;
        searchView$SearchAutoComplete.clearFocus();
        searchView$SearchAutoComplete.setImeVisibility(false);
        this.U = false;
    }

    public int getImeOptions() {
        return this.f30931p.getImeOptions();
    }

    public int getInputType() {
        return this.f30931p.getInputType();
    }

    public int getMaxWidth() {
        return this.V;
    }

    public CharSequence getQuery() {
        return this.f30931p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.S;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f30926e0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.J : getContext().getText(this.f30926e0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.G;
    }

    public int getSuggestionRowLayout() {
        return this.F;
    }

    public k4.a getSuggestionsAdapter() {
        return this.Q;
    }

    public final Intent j(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f30923b0);
        if (str3 != null) {
            intent.putExtra(AppLovinEventParameters.SEARCH_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f30927f0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f30926e0.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f30927f0;
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
        int i4 = Build.VERSION.SDK_INT;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f30931p;
        if (i4 >= 29) {
            t2.a(searchView$SearchAutoComplete);
            return;
        }
        ek.f fVar = f30921j0;
        fVar.getClass();
        ek.f.a();
        Method method = fVar.f23532a;
        if (method != null) {
            try {
                method.invoke(searchView$SearchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        fVar.getClass();
        ek.f.a();
        Method method2 = fVar.f23533b;
        if (method2 != null) {
            try {
                method2.invoke(searchView$SearchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f30931p;
        if (!TextUtils.isEmpty(searchView$SearchAutoComplete.getText())) {
            searchView$SearchAutoComplete.setText("");
            searchView$SearchAutoComplete.requestFocus();
            searchView$SearchAutoComplete.setImeVisibility(true);
        } else if (this.O) {
            u2 u2Var = this.L;
            if (u2Var != null) {
                u2Var.a();
            }
            clearFocus();
            w(true);
        }
    }

    public final void n(int i4) {
        int position;
        String strH;
        Cursor cursor = this.Q.f27926c;
        if (cursor != null && cursor.moveToPosition(i4)) {
            Intent intentJ = null;
            try {
                int i10 = b3.f30655y;
                String strH2 = b3.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strH2 == null) {
                    strH2 = this.f30926e0.getSuggestIntentAction();
                }
                if (strH2 == null) {
                    strH2 = "android.intent.action.SEARCH";
                }
                String strH3 = b3.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strH3 == null) {
                    strH3 = this.f30926e0.getSuggestIntentData();
                }
                if (strH3 != null && (strH = b3.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strH3 = strH3 + "/" + Uri.encode(strH);
                }
                intentJ = j(strH2, strH3 == null ? null : Uri.parse(strH3), b3.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), b3.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e2) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e2);
            }
            if (intentJ != null) {
                try {
                    getContext().startActivity(intentJ);
                } catch (RuntimeException e10) {
                    Log.e("SearchView", "Failed launch activity: " + intentJ, e10);
                }
            }
        }
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f30931p;
        searchView$SearchAutoComplete.setImeVisibility(false);
        searchView$SearchAutoComplete.dismissDropDown();
    }

    public final void o(int i4) {
        Editable text = this.f30931p.getText();
        Cursor cursor = this.Q.f27926c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i4)) {
            setQuery(text);
            return;
        }
        String strC = this.Q.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    @Override // n.b
    public final void onActionViewCollapsed() {
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f30931p;
        searchView$SearchAutoComplete.setText("");
        searchView$SearchAutoComplete.setSelection(searchView$SearchAutoComplete.length());
        this.f30923b0 = "";
        clearFocus();
        w(true);
        searchView$SearchAutoComplete.setImeOptions(this.f30925d0);
        this.f30924c0 = false;
    }

    @Override // n.b
    public final void onActionViewExpanded() {
        if (this.f30924c0) {
            return;
        }
        this.f30924c0 = true;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f30931p;
        int imeOptions = searchView$SearchAutoComplete.getImeOptions();
        this.f30925d0 = imeOptions;
        searchView$SearchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchView$SearchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f30928g0);
        post(this.f30929h0);
        super.onDetachedFromWindow();
    }

    @Override // p.u1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        super.onLayout(z3, i4, i10, i11, i12);
        if (z3) {
            SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f30931p;
            int[] iArr = this.B;
            searchView$SearchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.C;
            getLocationInWindow(iArr2);
            int i13 = iArr[1] - iArr2[1];
            int i14 = iArr[0] - iArr2[0];
            int width = searchView$SearchAutoComplete.getWidth() + i14;
            int height = searchView$SearchAutoComplete.getHeight() + i13;
            Rect rect = this.f30941z;
            rect.set(i14, i13, width, height);
            int i15 = rect.left;
            int i16 = rect.right;
            int i17 = i12 - i10;
            Rect rect2 = this.A;
            rect2.set(i15, 0, i16, i17);
            y2 y2Var = this.f30940y;
            if (y2Var == null) {
                y2 y2Var2 = new y2(searchView$SearchAutoComplete, rect2, rect);
                this.f30940y = y2Var2;
                setTouchDelegate(y2Var2);
            } else {
                y2Var.f30911b.set(rect2);
                Rect rect3 = y2Var.f30913d;
                rect3.set(rect2);
                int i18 = -y2Var.f30914e;
                rect3.inset(i18, i18);
                y2Var.f30912c.set(rect);
            }
        }
    }

    @Override // p.u1, android.view.View
    public final void onMeasure(int i4, int i10) {
        int i11;
        if (this.P) {
            super.onMeasure(i4, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode == Integer.MIN_VALUE) {
            int i12 = this.V;
            size = i12 > 0 ? Math.min(i12, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.V;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i11 = this.V) > 0) {
            size = Math.min(i11, size);
        }
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof x2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x2 x2Var = (x2) parcelable;
        super.onRestoreInstanceState(x2Var.f28876a);
        w(x2Var.f30907c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        x2 x2Var = new x2(super.onSaveInstanceState());
        x2Var.f30907c = this.P;
        return x2Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        post(this.f30928g0);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f30931p;
        Editable text = searchView$SearchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        v2 v2Var = this.K;
        if (v2Var != null) {
            v2Var.n(text.toString());
            return;
        }
        if (this.f30926e0 != null) {
            getContext().startActivity(j("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchView$SearchAutoComplete.setImeVisibility(false);
        searchView$SearchAutoComplete.dismissDropDown();
    }

    public final void r() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f30931p.getText());
        int i4 = (!zIsEmpty || (this.O && !this.f30924c0)) ? 0 : 8;
        ImageView imageView = this.f30937v;
        imageView.setVisibility(i4);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i4, Rect rect) {
        if (this.U || !isFocusable()) {
            return false;
        }
        if (this.P) {
            return super.requestFocus(i4, rect);
        }
        boolean zRequestFocus = this.f30931p.requestFocus(i4, rect);
        if (zRequestFocus) {
            w(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        int[] iArr = this.f30931p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f30933r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f30934s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.f30927f0 = bundle;
    }

    public void setIconified(boolean z3) {
        if (z3) {
            m();
            return;
        }
        w(false);
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f30931p;
        searchView$SearchAutoComplete.requestFocus();
        searchView$SearchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.N;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z3) {
        if (this.O == z3) {
            return;
        }
        this.O = z3;
        w(z3);
        t();
    }

    public void setImeOptions(int i4) {
        this.f30931p.setImeOptions(i4);
    }

    public void setInputType(int i4) {
        this.f30931p.setInputType(i4);
    }

    public void setMaxWidth(int i4) {
        this.V = i4;
        requestLayout();
    }

    public void setOnCloseListener(u2 u2Var) {
        this.L = u2Var;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.M = onFocusChangeListener;
    }

    public void setOnQueryTextListener(v2 v2Var) {
        this.K = v2Var;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.N = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.S = charSequence;
        t();
    }

    public void setQueryRefinementEnabled(boolean z3) {
        this.T = z3;
        k4.a aVar = this.Q;
        if (aVar instanceof b3) {
            ((b3) aVar).f30663q = z3 ? 2 : 1;
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
            r6.f30926e0 = r7
            r0 = 0
            r1 = 1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r6.f30931p
            if (r7 == 0) goto L65
            int r7 = r7.getSuggestThreshold()
            r2.setThreshold(r7)
            android.app.SearchableInfo r7 = r6.f30926e0
            int r7 = r7.getImeOptions()
            r2.setImeOptions(r7)
            android.app.SearchableInfo r7 = r6.f30926e0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r1) goto L31
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f30926e0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L31
            r3 = 589824(0x90000, float:8.2652E-40)
            r7 = r7 | r3
        L31:
            r2.setInputType(r7)
            k4.a r7 = r6.Q
            if (r7 == 0) goto L3b
            r7.b(r0)
        L3b:
            android.app.SearchableInfo r7 = r6.f30926e0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L62
            p.b3 r7 = new p.b3
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f30926e0
            java.util.WeakHashMap r5 = r6.f30930i0
            r7.<init>(r3, r6, r4, r5)
            r6.Q = r7
            r2.setAdapter(r7)
            k4.a r7 = r6.Q
            p.b3 r7 = (p.b3) r7
            boolean r3 = r6.T
            if (r3 == 0) goto L5f
            r3 = 2
            goto L60
        L5f:
            r3 = r1
        L60:
            r7.f30663q = r3
        L62:
            r6.t()
        L65:
            android.app.SearchableInfo r7 = r6.f30926e0
            r3 = 0
            if (r7 == 0) goto L98
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L98
            android.app.SearchableInfo r7 = r6.f30926e0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L7b
            android.content.Intent r0 = r6.H
            goto L85
        L7b:
            android.app.SearchableInfo r7 = r6.f30926e0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L85
            android.content.Intent r0 = r6.I
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
            r6.W = r1
            if (r1 == 0) goto La2
            java.lang.String r7 = "nm"
            r2.setPrivateImeOptions(r7)
        La2:
            boolean r7 = r6.P
            r6.w(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.z2.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z3) {
        this.R = z3;
        w(this.P);
    }

    public void setSuggestionsAdapter(k4.a aVar) {
        this.Q = aVar;
        this.f30931p.setAdapter(aVar);
    }

    public final void t() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z3 = this.O;
        SearchView$SearchAutoComplete searchView$SearchAutoComplete = this.f30931p;
        if (z3 && (drawable = this.E) != null) {
            int textSize = (int) (searchView$SearchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchView$SearchAutoComplete.setHint(queryHint);
    }

    public final void u() {
        this.f30934s.setVisibility(((this.R || this.W) && !this.P && (this.f30936u.getVisibility() == 0 || this.f30938w.getVisibility() == 0)) ? 0 : 8);
    }

    public final void v(boolean z3) {
        boolean z10 = this.R;
        this.f30936u.setVisibility((!z10 || !(z10 || this.W) || this.P || !hasFocus() || (!z3 && this.W)) ? 8 : 0);
    }

    public final void w(boolean z3) {
        this.P = z3;
        int i4 = 8;
        int i10 = z3 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f30931p.getText());
        this.f30935t.setVisibility(i10);
        v(!zIsEmpty);
        this.f30932q.setVisibility(z3 ? 8 : 0);
        ImageView imageView = this.D;
        imageView.setVisibility((imageView.getDrawable() == null || this.O) ? 8 : 0);
        r();
        if (this.W && !this.P && zIsEmpty) {
            this.f30936u.setVisibility(8);
            i4 = 0;
        }
        this.f30938w.setVisibility(i4);
        u();
    }

    public void setOnSuggestionListener(w2 w2Var) {
    }
}
