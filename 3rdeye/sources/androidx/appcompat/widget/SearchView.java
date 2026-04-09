package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import androidx.work.s;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import m.InterfaceC5305b;
import o.C5385c;
import o.Q;

/* loaded from: classes.dex */
public final class SearchView extends LinearLayoutCompat implements InterfaceC5305b {

    /* renamed from: x, reason: collision with root package name */
    public static final e f14642x;

    /* renamed from: q, reason: collision with root package name */
    public View.OnClickListener f14643q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f14644r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f14645s;

    /* renamed from: t, reason: collision with root package name */
    public S0.a f14646t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f14647u;

    /* renamed from: v, reason: collision with root package name */
    public int f14648v;

    /* renamed from: w, reason: collision with root package name */
    public SearchableInfo f14649w;

    public static class a {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    public interface b {
    }

    public interface c {
    }

    public interface d {
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public Method f14654a;

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    public static class f extends U0.a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public boolean f14655d;

        public class a implements Parcelable.ClassLoaderCreator<f> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new f[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f14655d = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" isIconified=");
            return s.h(sb, this.f14655d, "}");
        }

        @Override // U0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f14655d));
        }
    }

    static {
        e eVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            e eVar2 = new e();
            eVar2.f14654a = null;
            e.a();
            try {
                AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]).setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]).setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                eVar2.f14654a = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            eVar = eVar2;
        }
        f14642x = eVar;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        throw null;
    }

    @Override // m.InterfaceC5305b
    public final void c() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        super.clearFocus();
        throw null;
    }

    public int getImeOptions() {
        throw null;
    }

    public int getInputType() {
        throw null;
    }

    public int getMaxWidth() {
        return this.f14648v;
    }

    public CharSequence getQuery() {
        throw null;
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f14647u;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f14649w;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return null;
        }
        return getContext().getText(this.f14649w.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return 0;
    }

    public int getSuggestionRowLayout() {
        return 0;
    }

    public S0.a getSuggestionsAdapter() {
        return this.f14646t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(null);
        post(null);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        super.onLayout(z10, i, i10, i11, i12);
        if (z10) {
            throw null;
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i10) {
        int i11;
        if (this.f14645s) {
            super.onMeasure(i, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i12 = this.f14648v;
            size = i12 > 0 ? Math.min(i12, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f14648v;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i11 = this.f14648v) > 0) {
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
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f12348b);
        this.f14645s = fVar.f14655d;
        throw null;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.f14655d = this.f14645s;
        return fVar;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        post(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        return false;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            throw null;
        }
        this.f14645s = false;
        throw null;
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f14644r == z10) {
            return;
        }
        this.f14644r = z10;
        this.f14645s = z10;
        throw null;
    }

    public void setImeOptions(int i) {
        throw null;
    }

    public void setInputType(int i) {
        throw null;
    }

    public void setMaxWidth(int i) {
        this.f14648v = i;
        requestLayout();
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f14643q = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f14647u = charSequence;
        getQueryHint();
        throw null;
    }

    public void setQueryRefinementEnabled(boolean z10) {
        S0.a aVar = this.f14646t;
        if (aVar instanceof Q) {
            ((Q) aVar).f44589f = z10 ? 2 : 1;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f14649w = searchableInfo;
        if (searchableInfo != null) {
            searchableInfo.getSuggestThreshold();
            throw null;
        }
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled() && !this.f14649w.getVoiceSearchLaunchWebSearch()) {
            this.f14649w.getVoiceSearchLaunchRecognizer();
        }
        this.f14645s = this.f14645s;
        throw null;
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f14645s = this.f14645s;
        throw null;
    }

    public void setSuggestionsAdapter(S0.a aVar) {
        this.f14646t = aVar;
        throw null;
    }

    public static class SearchAutoComplete extends C5385c {

        /* renamed from: f, reason: collision with root package name */
        public int f14650f;

        /* renamed from: g, reason: collision with root package name */
        public SearchView f14651g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f14652h;
        public final a i;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f14652h) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f14652h = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, 0);
            this.i = new a();
            this.f14650f = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i10 = configuration.screenHeightDp;
            if (i >= 960 && i10 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i10 < 480) ? 160 : 192;
            }
            return 192;
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f14650f <= 0 || super.enoughToFilter();
        }

        @Override // o.C5385c, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f14652h) {
                a aVar = this.i;
                removeCallbacks(aVar);
                post(aVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z10, int i, Rect rect) {
            super.onFocusChanged(z10, i, rect);
            SearchView searchView = this.f14651g;
            searchView.f14645s = searchView.f14645s;
            throw null;
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
                        this.f14651g.clearFocus();
                        throw null;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f14651g.hasFocus() && getVisibility() == 0) {
                this.f14652h = true;
                if (getContext().getResources().getConfiguration().orientation == 2) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        a.b(this, 1);
                        if (enoughToFilter()) {
                            showDropDown();
                            return;
                        }
                        return;
                    }
                    e eVar = SearchView.f14642x;
                    eVar.getClass();
                    e.a();
                    Method method = eVar.f14654a;
                    if (method != null) {
                        try {
                            method.invoke(this, Boolean.TRUE);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            a aVar = this.i;
            if (!z10) {
                this.f14652h = false;
                removeCallbacks(aVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f14652h = true;
                    return;
                }
                this.f14652h = false;
                removeCallbacks(aVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f14651g = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f14650f = i;
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }
    }

    @Override // m.InterfaceC5305b
    public final void b() {
    }

    public void setAppSearchData(Bundle bundle) {
    }

    public void setOnCloseListener(b bVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
    }

    public void setOnQueryTextListener(c cVar) {
    }

    public void setOnSuggestionListener(d dVar) {
    }
}
