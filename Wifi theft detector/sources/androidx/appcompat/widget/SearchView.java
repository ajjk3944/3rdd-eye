package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements h.c {

    /* renamed from: n0, reason: collision with root package name */
    public static final o f968n0;
    public Rect A;
    public int[] B;
    public int[] C;
    public final ImageView D;
    public final Drawable E;
    public final int F;
    public final int G;
    public final Intent H;
    public final Intent I;
    public final CharSequence J;
    public View.OnFocusChangeListener K;
    public View.OnClickListener L;
    public boolean M;
    public boolean N;
    public w0.a O;
    public boolean P;
    public CharSequence Q;
    public boolean R;
    public boolean S;
    public int T;
    public boolean U;
    public CharSequence V;
    public CharSequence W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f969a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f970b0;

    /* renamed from: c0, reason: collision with root package name */
    public SearchableInfo f971c0;

    /* renamed from: d0, reason: collision with root package name */
    public Bundle f972d0;

    /* renamed from: e0, reason: collision with root package name */
    public final Runnable f973e0;

    /* renamed from: f0, reason: collision with root package name */
    public Runnable f974f0;

    /* renamed from: g0, reason: collision with root package name */
    public final WeakHashMap f975g0;

    /* renamed from: h0, reason: collision with root package name */
    public final View.OnClickListener f976h0;

    /* renamed from: i0, reason: collision with root package name */
    public View.OnKeyListener f977i0;

    /* renamed from: j0, reason: collision with root package name */
    public final TextView.OnEditorActionListener f978j0;

    /* renamed from: k0, reason: collision with root package name */
    public final AdapterView.OnItemClickListener f979k0;

    /* renamed from: l0, reason: collision with root package name */
    public final AdapterView.OnItemSelectedListener f980l0;

    /* renamed from: m0, reason: collision with root package name */
    public TextWatcher f981m0;

    /* renamed from: p, reason: collision with root package name */
    public final SearchAutoComplete f982p;

    /* renamed from: q, reason: collision with root package name */
    public final View f983q;

    /* renamed from: r, reason: collision with root package name */
    public final View f984r;

    /* renamed from: s, reason: collision with root package name */
    public final View f985s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f986t;

    /* renamed from: u, reason: collision with root package name */
    public final ImageView f987u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f988v;

    /* renamed from: w, reason: collision with root package name */
    public final ImageView f989w;

    /* renamed from: x, reason: collision with root package name */
    public final View f990x;

    /* renamed from: y, reason: collision with root package name */
    public p f991y;

    /* renamed from: z, reason: collision with root package name */
    public Rect f992z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public boolean f993c;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f993c + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f993c));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f993c = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static class SearchAutoComplete extends androidx.appcompat.widget.c {

        /* renamed from: e, reason: collision with root package name */
        public int f994e;

        /* renamed from: f, reason: collision with root package name */
        public SearchView f995f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f996g;

        /* renamed from: h, reason: collision with root package name */
        public final Runnable f997h;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 >= 600) {
                return PsExtractor.AUDIO_STREAM;
            }
            if (i10 < 640 || i11 < 480) {
                return 160;
            }
            return PsExtractor.AUDIO_STREAM;
        }

        public void b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f968n0.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        public boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void d() {
            if (this.f996g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f996g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f994e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.c, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f996g) {
                removeCallbacks(this.f997h);
                post(this.f997h);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z10, int i10, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onFocusChanged(z10, i10, rect);
            this.f995f.X();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
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
                        this.f995f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f995f.hasFocus() && getVisibility() == 0) {
                this.f996g = true;
                if (SearchView.K(getContext())) {
                    b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f996g = false;
                removeCallbacks(this.f997h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f996g = true;
                    return;
                }
                this.f996g = false;
                removeCallbacks(this.f997h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f995f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f994e = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, c.a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f997h = new a();
            this.f994e = getThreshold();
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.W(charSequence);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.d0();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w0.a aVar = SearchView.this.O;
            if (aVar instanceof u0) {
                aVar.a(null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.K;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.z();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            SearchView searchView = SearchView.this;
            if (view == searchView.f986t) {
                searchView.T();
                return;
            }
            if (view == searchView.f988v) {
                searchView.P();
                return;
            }
            if (view == searchView.f987u) {
                searchView.U();
            } else if (view == searchView.f989w) {
                searchView.Y();
            } else if (view == searchView.f982p) {
                searchView.F();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f971c0 == null) {
                return false;
            }
            if (searchView.f982p.isPopupShowing() && SearchView.this.f982p.getListSelection() != -1) {
                return SearchView.this.V(view, i10, keyEvent);
            }
            if (SearchView.this.f982p.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.N(0, null, searchView2.f982p.getText().toString());
            return true;
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.U();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            SearchView.this.Q(i10, 0, null);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            SearchView.this.R(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static class k {
        @DoNotInline
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        @DoNotInline
        public static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    public interface l {
    }

    public interface m {
    }

    public interface n {
    }

    public static class o {

        /* renamed from: a, reason: collision with root package name */
        public Method f1009a;

        /* renamed from: b, reason: collision with root package name */
        public Method f1010b;

        /* renamed from: c, reason: collision with root package name */
        public Method f1011c;

        public o() throws NoSuchMethodException, SecurityException {
            this.f1009a = null;
            this.f1010b = null;
            this.f1011c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f1009a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f1010b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1011c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        public void a(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            d();
            Method method = this.f1010b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        public void b(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            d();
            Method method = this.f1009a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        public void c(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            d();
            Method method = this.f1011c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static class p extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        public final View f1012a;

        /* renamed from: b, reason: collision with root package name */
        public final Rect f1013b;

        /* renamed from: c, reason: collision with root package name */
        public final Rect f1014c;

        /* renamed from: d, reason: collision with root package name */
        public final Rect f1015d;

        /* renamed from: e, reason: collision with root package name */
        public final int f1016e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f1017f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1016e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1013b = new Rect();
            this.f1015d = new Rect();
            this.f1014c = new Rect();
            a(rect, rect2);
            this.f1012a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f1013b.set(rect);
            this.f1015d.set(rect);
            Rect rect3 = this.f1015d;
            int i10 = this.f1016e;
            rect3.inset(-i10, -i10);
            this.f1014c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f1017f;
                    if (z11 && !this.f1015d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else {
                    if (action == 3) {
                        z11 = this.f1017f;
                        this.f1017f = false;
                    }
                    z10 = true;
                    z12 = false;
                }
                z12 = z11;
                z10 = true;
            } else if (this.f1013b.contains(x10, y10)) {
                this.f1017f = true;
                z10 = true;
            } else {
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            if (!z10 || this.f1014c.contains(x10, y10)) {
                Rect rect = this.f1014c;
                motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
            } else {
                motionEvent.setLocation(this.f1012a.getWidth() / 2, this.f1012a.getHeight() / 2);
            }
            return this.f1012a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f968n0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    public static boolean K(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(c.d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(c.d.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.f982p.setText(charSequence);
        this.f982p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final Intent A(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.W);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f972d0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f971c0.getSearchActivity());
        return intent;
    }

    public final Intent B(Cursor cursor, int i10, String str) {
        int position;
        String strN;
        try {
            String strN2 = u0.n(cursor, "suggest_intent_action");
            if (strN2 == null) {
                strN2 = this.f971c0.getSuggestIntentAction();
            }
            if (strN2 == null) {
                strN2 = "android.intent.action.SEARCH";
            }
            String str2 = strN2;
            String strN3 = u0.n(cursor, "suggest_intent_data");
            if (strN3 == null) {
                strN3 = this.f971c0.getSuggestIntentData();
            }
            if (strN3 != null && (strN = u0.n(cursor, "suggest_intent_data_id")) != null) {
                strN3 = strN3 + "/" + Uri.encode(strN);
            }
            return A(str2, strN3 == null ? null : Uri.parse(strN3), u0.n(cursor, "suggest_intent_extra_data"), u0.n(cursor, "suggest_intent_query"), i10, str);
        } catch (RuntimeException e10) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e10);
            return null;
        }
    }

    public final Intent C(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f972d0;
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

    public final Intent D(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    public final void E() {
        this.f982p.dismissDropDown();
    }

    public void F() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f982p);
            return;
        }
        o oVar = f968n0;
        oVar.b(this.f982p);
        oVar.a(this.f982p);
    }

    public final void G(View view, Rect rect) {
        view.getLocationInWindow(this.B);
        getLocationInWindow(this.C);
        int[] iArr = this.B;
        int i10 = iArr[1];
        int[] iArr2 = this.C;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    public final CharSequence H(CharSequence charSequence) {
        if (!this.M || this.E == null) {
            return charSequence;
        }
        int textSize = (int) (this.f982p.getTextSize() * 1.25d);
        this.E.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.E), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final boolean I() {
        SearchableInfo searchableInfo = this.f971c0;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            Intent intent = this.f971c0.getVoiceSearchLaunchWebSearch() ? this.H : this.f971c0.getVoiceSearchLaunchRecognizer() ? this.I : null;
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean J() {
        return this.N;
    }

    public final boolean L() {
        return (this.P || this.U) && !J();
    }

    public final void M(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e10) {
            Log.e("SearchView", "Failed launch activity: " + intent, e10);
        }
    }

    public void N(int i10, String str, String str2) {
        getContext().startActivity(A("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    public final boolean O(int i10, int i11, String str) {
        Cursor cursorC = this.O.c();
        if (cursorC == null || !cursorC.moveToPosition(i10)) {
            return false;
        }
        M(B(cursorC, i11, str));
        return true;
    }

    public void P() {
        if (!TextUtils.isEmpty(this.f982p.getText())) {
            this.f982p.setText("");
            this.f982p.requestFocus();
            this.f982p.setImeVisibility(true);
        } else if (this.M) {
            clearFocus();
            i0(true);
        }
    }

    public boolean Q(int i10, int i11, String str) {
        O(i10, 0, null);
        this.f982p.setImeVisibility(false);
        E();
        return true;
    }

    public boolean R(int i10) {
        a0(i10);
        return true;
    }

    public void S(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void T() {
        i0(false);
        this.f982p.requestFocus();
        this.f982p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void U() {
        Editable text = this.f982p.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f971c0 != null) {
            N(0, null, text.toString());
        }
        this.f982p.setImeVisibility(false);
        E();
    }

    public boolean V(View view, int i10, KeyEvent keyEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f971c0 != null && this.O != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return Q(this.f982p.getListSelection(), 0, null);
            }
            if (i10 == 21 || i10 == 22) {
                this.f982p.setSelection(i10 == 21 ? 0 : this.f982p.length());
                this.f982p.setListSelection(0);
                this.f982p.clearListSelection();
                this.f982p.b();
                return true;
            }
            if (i10 == 19) {
                this.f982p.getListSelection();
                return false;
            }
        }
        return false;
    }

    public void W(CharSequence charSequence) {
        Editable text = this.f982p.getText();
        this.W = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        h0(!zIsEmpty);
        j0(zIsEmpty);
        c0();
        g0();
        this.V = charSequence.toString();
    }

    public void X() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        i0(J());
        Z();
        if (this.f982p.hasFocus()) {
            F();
        }
    }

    public void Y() {
        SearchableInfo searchableInfo = this.f971c0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(D(this.H, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(C(this.I, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    public final void Z() {
        post(this.f973e0);
    }

    public final void a0(int i10) {
        Editable text = this.f982p.getText();
        Cursor cursorC = this.O.c();
        if (cursorC == null) {
            return;
        }
        if (!cursorC.moveToPosition(i10)) {
            setQuery(text);
            return;
        }
        CharSequence charSequenceConvertToString = this.O.convertToString(cursorC);
        if (charSequenceConvertToString != null) {
            setQuery(charSequenceConvertToString);
        } else {
            setQuery(text);
        }
    }

    public void b0(CharSequence charSequence, boolean z10) {
        this.f982p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f982p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.W = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        U();
    }

    public final void c0() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f982p.getText());
        this.f988v.setVisibility(!zIsEmpty || (this.M && !this.f969a0) ? 0 : 8);
        Drawable drawable = this.f988v.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.S = true;
        super.clearFocus();
        this.f982p.clearFocus();
        this.f982p.setImeVisibility(false);
        this.S = false;
    }

    public void d0() {
        int[] iArr = this.f982p.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f984r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f985s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void e0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f982p;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(H(queryHint));
    }

    public final void f0() {
        this.f982p.setThreshold(this.f971c0.getSuggestThreshold());
        this.f982p.setImeOptions(this.f971c0.getImeOptions());
        int inputType = this.f971c0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f971c0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f982p.setInputType(inputType);
        w0.a aVar = this.O;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f971c0.getSuggestAuthority() != null) {
            u0 u0Var = new u0(getContext(), this, this.f971c0, this.f975g0);
            this.O = u0Var;
            this.f982p.setAdapter(u0Var);
            ((u0) this.O).w(this.R ? 2 : 1);
        }
    }

    public final void g0() {
        this.f985s.setVisibility((L() && (this.f987u.getVisibility() == 0 || this.f989w.getVisibility() == 0)) ? 0 : 8);
    }

    public int getImeOptions() {
        return this.f982p.getImeOptions();
    }

    public int getInputType() {
        return this.f982p.getInputType();
    }

    public int getMaxWidth() {
        return this.T;
    }

    public CharSequence getQuery() {
        return this.f982p.getText();
    }

    @Nullable
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.Q;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f971c0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.J : getContext().getText(this.f971c0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.G;
    }

    public int getSuggestionRowLayout() {
        return this.F;
    }

    public w0.a getSuggestionsAdapter() {
        return this.O;
    }

    public final void h0(boolean z10) {
        this.f987u.setVisibility((this.P && L() && hasFocus() && (z10 || !this.U)) ? 0 : 8);
    }

    public final void i0(boolean z10) {
        this.N = z10;
        int i10 = 8;
        int i11 = z10 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f982p.getText());
        this.f986t.setVisibility(i11);
        h0(!zIsEmpty);
        this.f983q.setVisibility(z10 ? 8 : 0);
        if (this.D.getDrawable() != null && !this.M) {
            i10 = 0;
        }
        this.D.setVisibility(i10);
        c0();
        j0(zIsEmpty);
        g0();
    }

    public final void j0(boolean z10) {
        int i10 = 8;
        if (this.U && !J() && z10) {
            this.f987u.setVisibility(8);
            i10 = 0;
        }
        this.f989w.setVisibility(i10);
    }

    @Override // h.c
    public void onActionViewCollapsed() {
        b0("", false);
        clearFocus();
        i0(true);
        this.f982p.setImeOptions(this.f970b0);
        this.f969a0 = false;
    }

    @Override // h.c
    public void onActionViewExpanded() {
        if (this.f969a0) {
            return;
        }
        this.f969a0 = true;
        int imeOptions = this.f982p.getImeOptions();
        this.f970b0 = imeOptions;
        this.f982p.setImeOptions(imeOptions | 33554432);
        this.f982p.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f973e0);
        post(this.f974f0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            G(this.f982p, this.f992z);
            Rect rect = this.A;
            Rect rect2 = this.f992z;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            p pVar = this.f991y;
            if (pVar != null) {
                pVar.a(this.A, this.f992z);
                return;
            }
            p pVar2 = new p(this.A, this.f992z, this.f982p);
            this.f991y = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        if (J()) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.T;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.T;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.T) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.c());
        i0(savedState.f993c);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f993c = J();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        Z();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.S || !isFocusable()) {
            return false;
        }
        if (J()) {
            return super.requestFocus(i10, rect);
        }
        boolean zRequestFocus = this.f982p.requestFocus(i10, rect);
        if (zRequestFocus) {
            i0(false);
        }
        return zRequestFocus;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAppSearchData(Bundle bundle) {
        this.f972d0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            P();
        } else {
            T();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.M == z10) {
            return;
        }
        this.M = z10;
        i0(z10);
        e0();
    }

    public void setImeOptions(int i10) {
        this.f982p.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f982p.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.T = i10;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.K = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.L = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(@Nullable CharSequence charSequence) {
        this.Q = charSequence;
        e0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.R = z10;
        w0.a aVar = this.O;
        if (aVar instanceof u0) {
            ((u0) aVar).w(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f971c0 = searchableInfo;
        if (searchableInfo != null) {
            f0();
            e0();
        }
        boolean zI = I();
        this.U = zI;
        if (zI) {
            this.f982p.setPrivateImeOptions("nm");
        }
        i0(J());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.P = z10;
        i0(J());
    }

    public void setSuggestionsAdapter(w0.a aVar) {
        this.O = aVar;
        this.f982p.setAdapter(aVar);
    }

    public void z() {
        if (this.f990x.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f984r.getPaddingLeft();
            Rect rect = new Rect();
            boolean zB = k1.b(this);
            int dimensionPixelSize = this.M ? resources.getDimensionPixelSize(c.d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(c.d.abc_dropdownitem_text_padding_left) : 0;
            this.f982p.getDropDownBackground().getPadding(rect);
            this.f982p.setDropDownHorizontalOffset(zB ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f982p.setDropDownWidth((((this.f990x.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, c.a.searchViewStyle);
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f992z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        this.f973e0 = new b();
        this.f974f0 = new c();
        this.f975g0 = new WeakHashMap();
        f fVar = new f();
        this.f976h0 = fVar;
        this.f977i0 = new g();
        h hVar = new h();
        this.f978j0 = hVar;
        i iVar = new i();
        this.f979k0 = iVar;
        j jVar = new j();
        this.f980l0 = jVar;
        this.f981m0 = new a();
        int[] iArr = c.j.SearchView;
        z0 z0VarV = z0.v(context, attributeSet, iArr, i10, 0);
        ViewCompat.h0(this, context, iArr, attributeSet, z0VarV.r(), i10, 0);
        LayoutInflater.from(context).inflate(z0VarV.n(c.j.SearchView_layout, c.g.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(c.f.search_src_text);
        this.f982p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f983q = findViewById(c.f.search_edit_frame);
        View viewFindViewById = findViewById(c.f.search_plate);
        this.f984r = viewFindViewById;
        View viewFindViewById2 = findViewById(c.f.submit_area);
        this.f985s = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(c.f.search_button);
        this.f986t = imageView;
        ImageView imageView2 = (ImageView) findViewById(c.f.search_go_btn);
        this.f987u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(c.f.search_close_btn);
        this.f988v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(c.f.search_voice_btn);
        this.f989w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(c.f.search_mag_icon);
        this.D = imageView5;
        ViewCompat.m0(viewFindViewById, z0VarV.g(c.j.SearchView_queryBackground));
        ViewCompat.m0(viewFindViewById2, z0VarV.g(c.j.SearchView_submitBackground));
        int i11 = c.j.SearchView_searchIcon;
        imageView.setImageDrawable(z0VarV.g(i11));
        imageView2.setImageDrawable(z0VarV.g(c.j.SearchView_goIcon));
        imageView3.setImageDrawable(z0VarV.g(c.j.SearchView_closeIcon));
        imageView4.setImageDrawable(z0VarV.g(c.j.SearchView_voiceIcon));
        imageView5.setImageDrawable(z0VarV.g(i11));
        this.E = z0VarV.g(c.j.SearchView_searchHintIcon);
        e1.a(imageView, getResources().getString(c.h.abc_searchview_description_search));
        this.F = z0VarV.n(c.j.SearchView_suggestionRowLayout, c.g.abc_search_dropdown_item_icons_2line);
        this.G = z0VarV.n(c.j.SearchView_commitIcon, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f981m0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f977i0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(z0VarV.a(c.j.SearchView_iconifiedByDefault, true));
        int iF = z0VarV.f(c.j.SearchView_android_maxWidth, -1);
        if (iF != -1) {
            setMaxWidth(iF);
        }
        this.J = z0VarV.p(c.j.SearchView_defaultQueryHint);
        this.Q = z0VarV.p(c.j.SearchView_queryHint);
        int iK = z0VarV.k(c.j.SearchView_android_imeOptions, -1);
        if (iK != -1) {
            setImeOptions(iK);
        }
        int iK2 = z0VarV.k(c.j.SearchView_android_inputType, -1);
        if (iK2 != -1) {
            setInputType(iK2);
        }
        setFocusable(z0VarV.a(c.j.SearchView_android_focusable, true));
        z0VarV.x();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.I = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f990x = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        i0(this.M);
        e0();
    }
}
