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
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends i0 implements f.c {
    static final k r0 = new k();
    private Rect A;
    private Rect B;
    private int[] C;
    private int[] D;
    private final ImageView E;
    private final Drawable F;
    private final int G;
    private final int H;
    private final Intent I;
    private final Intent J;
    private final CharSequence K;
    private m L;
    private l M;
    View.OnFocusChangeListener N;
    private n O;
    private View.OnClickListener P;
    private boolean Q;
    private boolean R;
    c0.a S;
    private boolean T;
    private CharSequence U;
    private boolean V;
    private boolean W;

    /* renamed from: a0, reason: collision with root package name */
    private int f769a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f770b0;

    /* renamed from: c0, reason: collision with root package name */
    private CharSequence f771c0;

    /* renamed from: d0, reason: collision with root package name */
    private CharSequence f772d0;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f773e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f774f0;

    /* renamed from: g0, reason: collision with root package name */
    SearchableInfo f775g0;

    /* renamed from: h0, reason: collision with root package name */
    private Bundle f776h0;

    /* renamed from: i0, reason: collision with root package name */
    private final Runnable f777i0;

    /* renamed from: j0, reason: collision with root package name */
    private Runnable f778j0;

    /* renamed from: k0, reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f779k0;

    /* renamed from: l0, reason: collision with root package name */
    private final View.OnClickListener f780l0;

    /* renamed from: m0, reason: collision with root package name */
    View.OnKeyListener f781m0;

    /* renamed from: n0, reason: collision with root package name */
    private final TextView.OnEditorActionListener f782n0;

    /* renamed from: o0, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f783o0;

    /* renamed from: p0, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f784p0;

    /* renamed from: q, reason: collision with root package name */
    final SearchAutoComplete f785q;

    /* renamed from: q0, reason: collision with root package name */
    private TextWatcher f786q0;

    /* renamed from: r, reason: collision with root package name */
    private final View f787r;

    /* renamed from: s, reason: collision with root package name */
    private final View f788s;

    /* renamed from: t, reason: collision with root package name */
    private final View f789t;

    /* renamed from: u, reason: collision with root package name */
    final ImageView f790u;

    /* renamed from: v, reason: collision with root package name */
    final ImageView f791v;

    /* renamed from: w, reason: collision with root package name */
    final ImageView f792w;

    /* renamed from: x, reason: collision with root package name */
    final ImageView f793x;

    /* renamed from: y, reason: collision with root package name */
    private final View f794y;

    /* renamed from: z, reason: collision with root package name */
    private p f795z;

    public static class SearchAutoComplete extends androidx.appcompat.widget.d {

        /* renamed from: e, reason: collision with root package name */
        private int f796e;

        /* renamed from: f, reason: collision with root package name */
        private SearchView f797f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f798g;

        /* renamed from: h, reason: collision with root package name */
        final Runnable f799h;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.b();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, a.a.f15p);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.f799h = new a();
            this.f796e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 < 600) {
                return (i2 < 640 || i3 < 480) ? 160 : 192;
            }
            return 192;
        }

        boolean a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void b() {
            if (this.f798g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f798g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f796e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f798g) {
                removeCallbacks(this.f799h);
                post(this.f799h);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z2, int i2, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onFocusChanged(z2, i2, rect);
            this.f797f.X();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
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
                        this.f797f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onWindowFocusChanged(z2);
            if (z2 && this.f797f.hasFocus() && getVisibility() == 0) {
                this.f798g = true;
                if (SearchView.K(getContext())) {
                    SearchView.r0.c(this, true);
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z2) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z2) {
                this.f798g = false;
                removeCallbacks(this.f799h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f798g = true;
                    return;
                }
                this.f798g = false;
                removeCallbacks(this.f799h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f797f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f796e = i2;
        }
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            SearchView.this.W(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.d0();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c0.a aVar = SearchView.this.S;
            if (aVar instanceof q0) {
                aVar.c(null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z2) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.N;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z2);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            SearchView.this.z();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            SearchView searchView = SearchView.this;
            if (view == searchView.f790u) {
                searchView.T();
                return;
            }
            if (view == searchView.f792w) {
                searchView.P();
                return;
            }
            if (view == searchView.f791v) {
                searchView.U();
            } else if (view == searchView.f793x) {
                searchView.Y();
            } else if (view == searchView.f785q) {
                searchView.F();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f775g0 == null) {
                return false;
            }
            if (searchView.f785q.isPopupShowing() && SearchView.this.f785q.getListSelection() != -1) {
                return SearchView.this.V(view, i2, keyEvent);
            }
            if (SearchView.this.f785q.a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i2 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.N(0, null, searchView2.f785q.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            SearchView.this.U();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.Q(i2, 0, null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.R(i2);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    private static class k {

        /* renamed from: a, reason: collision with root package name */
        private Method f811a;

        /* renamed from: b, reason: collision with root package name */
        private Method f812b;

        /* renamed from: c, reason: collision with root package name */
        private Method f813c;

        k() throws NoSuchMethodException, SecurityException {
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f811a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f812b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f813c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Method method = this.f812b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Method method = this.f811a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView, boolean z2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            Method method = this.f813c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.valueOf(z2));
                } catch (Exception unused) {
                }
            }
        }
    }

    public interface l {
        boolean a();
    }

    public interface m {
        boolean a(String str);

        boolean b(String str);
    }

    public interface n {
        boolean a(int i2);

        boolean b(int i2);
    }

    static class o extends d0.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        boolean f814d;

        static class a implements Parcelable.ClassLoaderCreator<o> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public o createFromParcel(Parcel parcel) {
                return new o(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public o[] newArray(int i2) {
                return new o[i2];
            }
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f814d = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f814d + "}";
        }

        @Override // d0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeValue(Boolean.valueOf(this.f814d));
        }
    }

    private static class p extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        private final View f815a;

        /* renamed from: b, reason: collision with root package name */
        private final Rect f816b;

        /* renamed from: c, reason: collision with root package name */
        private final Rect f817c;

        /* renamed from: d, reason: collision with root package name */
        private final Rect f818d;

        /* renamed from: e, reason: collision with root package name */
        private final int f819e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f820f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f819e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f816b = new Rect();
            this.f818d = new Rect();
            this.f817c = new Rect();
            a(rect, rect2);
            this.f815a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f816b.set(rect);
            this.f818d.set(rect);
            Rect rect3 = this.f818d;
            int i2 = this.f819e;
            rect3.inset(-i2, -i2);
            this.f817c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z2;
            float width;
            int height;
            boolean z3;
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z4 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z3 = this.f820f;
                    if (z3 && !this.f818d.contains(x2, y2)) {
                        z4 = z3;
                        z2 = false;
                    }
                } else {
                    if (action == 3) {
                        z3 = this.f820f;
                        this.f820f = false;
                    }
                    z2 = true;
                    z4 = false;
                }
                z4 = z3;
                z2 = true;
            } else {
                if (this.f816b.contains(x2, y2)) {
                    this.f820f = true;
                    z2 = true;
                }
                z2 = true;
                z4 = false;
            }
            if (!z4) {
                return false;
            }
            if (!z2 || this.f817c.contains(x2, y2)) {
                Rect rect = this.f817c;
                width = x2 - rect.left;
                height = y2 - rect.top;
            } else {
                width = this.f815a.getWidth() / 2;
                height = this.f815a.getHeight() / 2;
            }
            motionEvent.setLocation(width, height);
            return this.f815a.dispatchTouchEvent(motionEvent);
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.G);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A = new Rect();
        this.B = new Rect();
        this.C = new int[2];
        this.D = new int[2];
        this.f777i0 = new b();
        this.f778j0 = new c();
        this.f779k0 = new WeakHashMap<>();
        f fVar = new f();
        this.f780l0 = fVar;
        this.f781m0 = new g();
        h hVar = new h();
        this.f782n0 = hVar;
        i iVar = new i();
        this.f783o0 = iVar;
        j jVar = new j();
        this.f784p0 = jVar;
        this.f786q0 = new a();
        w0 w0VarT = w0.t(context, attributeSet, a.j.i2, i2, 0);
        LayoutInflater.from(context).inflate(w0VarT.m(a.j.s2, a.g.f115r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(a.f.D);
        this.f785q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f787r = findViewById(a.f.f97z);
        View viewFindViewById = findViewById(a.f.C);
        this.f788s = viewFindViewById;
        View viewFindViewById2 = findViewById(a.f.J);
        this.f789t = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(a.f.f95x);
        this.f790u = imageView;
        ImageView imageView2 = (ImageView) findViewById(a.f.A);
        this.f791v = imageView2;
        ImageView imageView3 = (ImageView) findViewById(a.f.f96y);
        this.f792w = imageView3;
        ImageView imageView4 = (ImageView) findViewById(a.f.E);
        this.f793x = imageView4;
        ImageView imageView5 = (ImageView) findViewById(a.f.B);
        this.E = imageView5;
        a0.s.R(viewFindViewById, w0VarT.f(a.j.t2));
        a0.s.R(viewFindViewById2, w0VarT.f(a.j.x2));
        int i3 = a.j.w2;
        imageView.setImageDrawable(w0VarT.f(i3));
        imageView2.setImageDrawable(w0VarT.f(a.j.q2));
        imageView3.setImageDrawable(w0VarT.f(a.j.n2));
        imageView4.setImageDrawable(w0VarT.f(a.j.z2));
        imageView5.setImageDrawable(w0VarT.f(i3));
        this.F = w0VarT.f(a.j.v2);
        y0.a(imageView, getResources().getString(a.h.f129l));
        this.G = w0VarT.m(a.j.y2, a.g.f114q);
        this.H = w0VarT.m(a.j.o2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f786q0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f781m0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(w0VarT.a(a.j.r2, true));
        int iE = w0VarT.e(a.j.k2, -1);
        if (iE != -1) {
            setMaxWidth(iE);
        }
        this.K = w0VarT.o(a.j.p2);
        this.U = w0VarT.o(a.j.u2);
        int iJ = w0VarT.j(a.j.m2, -1);
        if (iJ != -1) {
            setImeOptions(iJ);
        }
        int iJ2 = w0VarT.j(a.j.l2, -1);
        if (iJ2 != -1) {
            setInputType(iJ2);
        }
        setFocusable(w0VarT.a(a.j.j2, true));
        w0VarT.u();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.I = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.J = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f794y = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        i0(this.Q);
        e0();
    }

    private Intent A(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f772d0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f776h0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f775g0.getSearchActivity());
        return intent;
    }

    private Intent B(Cursor cursor, int i2, String str) {
        int position;
        String strO;
        try {
            String strO2 = q0.o(cursor, "suggest_intent_action");
            if (strO2 == null) {
                strO2 = this.f775g0.getSuggestIntentAction();
            }
            if (strO2 == null) {
                strO2 = "android.intent.action.SEARCH";
            }
            String str2 = strO2;
            String strO3 = q0.o(cursor, "suggest_intent_data");
            if (strO3 == null) {
                strO3 = this.f775g0.getSuggestIntentData();
            }
            if (strO3 != null && (strO = q0.o(cursor, "suggest_intent_data_id")) != null) {
                strO3 = strO3 + "/" + Uri.encode(strO);
            }
            return A(str2, strO3 == null ? null : Uri.parse(strO3), q0.o(cursor, "suggest_intent_extra_data"), q0.o(cursor, "suggest_intent_query"), i2, str);
        } catch (RuntimeException e2) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e2);
            return null;
        }
    }

    private Intent C(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f776h0;
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

    private Intent D(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void E() {
        this.f785q.dismissDropDown();
    }

    private void G(View view, Rect rect) {
        view.getLocationInWindow(this.C);
        getLocationInWindow(this.D);
        int[] iArr = this.C;
        int i2 = iArr[1];
        int[] iArr2 = this.D;
        int i3 = i2 - iArr2[1];
        int i4 = iArr[0] - iArr2[0];
        rect.set(i4, i3, view.getWidth() + i4, view.getHeight() + i3);
    }

    private CharSequence H(CharSequence charSequence) {
        if (!this.Q || this.F == null) {
            return charSequence;
        }
        double textSize = this.f785q.getTextSize();
        Double.isNaN(textSize);
        int i2 = (int) (textSize * 1.25d);
        this.F.setBounds(0, 0, i2, i2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.F), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean I() {
        SearchableInfo searchableInfo = this.f775g0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f775g0.getVoiceSearchLaunchWebSearch()) {
            intent = this.I;
        } else if (this.f775g0.getVoiceSearchLaunchRecognizer()) {
            intent = this.J;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean K(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean L() {
        return (this.T || this.f770b0) && !J();
    }

    private void M(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e2) {
            Log.e("SearchView", "Failed launch activity: " + intent, e2);
        }
    }

    private boolean O(int i2, int i3, String str) {
        Cursor cursorB = this.S.b();
        if (cursorB == null || !cursorB.moveToPosition(i2)) {
            return false;
        }
        M(B(cursorB, i3, str));
        return true;
    }

    private void Z() {
        post(this.f777i0);
    }

    private void a0(int i2) {
        CharSequence charSequenceA;
        Editable text = this.f785q.getText();
        Cursor cursorB = this.S.b();
        if (cursorB == null) {
            return;
        }
        if (!cursorB.moveToPosition(i2) || (charSequenceA = this.S.a(cursorB)) == null) {
            setQuery(text);
        } else {
            setQuery(charSequenceA);
        }
    }

    private void c0() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f785q.getText());
        if (!z3 && (!this.Q || this.f773e0)) {
            z2 = false;
        }
        this.f792w.setVisibility(z2 ? 0 : 8);
        Drawable drawable = this.f792w.getDrawable();
        if (drawable != null) {
            drawable.setState(z3 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void e0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f785q;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(H(queryHint));
    }

    private void f0() {
        this.f785q.setThreshold(this.f775g0.getSuggestThreshold());
        this.f785q.setImeOptions(this.f775g0.getImeOptions());
        int inputType = this.f775g0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f775g0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f785q.setInputType(inputType);
        c0.a aVar = this.S;
        if (aVar != null) {
            aVar.c(null);
        }
        if (this.f775g0.getSuggestAuthority() != null) {
            q0 q0Var = new q0(getContext(), this, this.f775g0, this.f779k0);
            this.S = q0Var;
            this.f785q.setAdapter(q0Var);
            ((q0) this.S).x(this.V ? 2 : 1);
        }
    }

    private void g0() {
        this.f789t.setVisibility((L() && (this.f791v.getVisibility() == 0 || this.f793x.getVisibility() == 0)) ? 0 : 8);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(a.d.f40g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(a.d.f41h);
    }

    private void h0(boolean z2) {
        this.f791v.setVisibility((this.T && L() && hasFocus() && (z2 || !this.f770b0)) ? 0 : 8);
    }

    private void i0(boolean z2) {
        this.R = z2;
        int i2 = z2 ? 0 : 8;
        boolean z3 = !TextUtils.isEmpty(this.f785q.getText());
        this.f790u.setVisibility(i2);
        h0(z3);
        this.f787r.setVisibility(z2 ? 8 : 0);
        this.E.setVisibility((this.E.getDrawable() == null || this.Q) ? 8 : 0);
        c0();
        j0(!z3);
        g0();
    }

    private void j0(boolean z2) {
        int i2 = 8;
        if (this.f770b0 && !J() && z2) {
            this.f791v.setVisibility(8);
            i2 = 0;
        }
        this.f793x.setVisibility(i2);
    }

    private void setQuery(CharSequence charSequence) {
        this.f785q.setText(charSequence);
        this.f785q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void F() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f785q.refreshAutoCompleteResults();
            return;
        }
        k kVar = r0;
        kVar.b(this.f785q);
        kVar.a(this.f785q);
    }

    public boolean J() {
        return this.R;
    }

    void N(int i2, String str, String str2) {
        getContext().startActivity(A("android.intent.action.SEARCH", null, null, str2, i2, str));
    }

    void P() {
        if (!TextUtils.isEmpty(this.f785q.getText())) {
            this.f785q.setText("");
            this.f785q.requestFocus();
            this.f785q.setImeVisibility(true);
        } else if (this.Q) {
            l lVar = this.M;
            if (lVar == null || !lVar.a()) {
                clearFocus();
                i0(true);
            }
        }
    }

    boolean Q(int i2, int i3, String str) {
        n nVar = this.O;
        if (nVar != null && nVar.b(i2)) {
            return false;
        }
        O(i2, 0, null);
        this.f785q.setImeVisibility(false);
        E();
        return true;
    }

    boolean R(int i2) {
        n nVar = this.O;
        if (nVar != null && nVar.a(i2)) {
            return false;
        }
        a0(i2);
        return true;
    }

    void S(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void T() {
        i0(false);
        this.f785q.requestFocus();
        this.f785q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void U() {
        Editable text = this.f785q.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        m mVar = this.L;
        if (mVar == null || !mVar.a(text.toString())) {
            if (this.f775g0 != null) {
                N(0, null, text.toString());
            }
            this.f785q.setImeVisibility(false);
            E();
        }
    }

    boolean V(View view, int i2, KeyEvent keyEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f775g0 != null && this.S != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return Q(this.f785q.getListSelection(), 0, null);
            }
            if (i2 == 21 || i2 == 22) {
                this.f785q.setSelection(i2 == 21 ? 0 : this.f785q.length());
                this.f785q.setListSelection(0);
                this.f785q.clearListSelection();
                r0.c(this.f785q, true);
                return true;
            }
            if (i2 == 19) {
                this.f785q.getListSelection();
                return false;
            }
        }
        return false;
    }

    void W(CharSequence charSequence) {
        Editable text = this.f785q.getText();
        this.f772d0 = text;
        boolean z2 = !TextUtils.isEmpty(text);
        h0(z2);
        j0(!z2);
        c0();
        g0();
        if (this.L != null && !TextUtils.equals(charSequence, this.f771c0)) {
            this.L.b(charSequence.toString());
        }
        this.f771c0 = charSequence.toString();
    }

    void X() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        i0(J());
        Z();
        if (this.f785q.hasFocus()) {
            F();
        }
    }

    void Y() {
        Intent intentC;
        SearchableInfo searchableInfo = this.f775g0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                intentC = D(this.I, searchableInfo);
            } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                return;
            } else {
                intentC = C(this.J, searchableInfo);
            }
            getContext().startActivity(intentC);
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    @Override // f.c
    public void a() {
        if (this.f773e0) {
            return;
        }
        this.f773e0 = true;
        int imeOptions = this.f785q.getImeOptions();
        this.f774f0 = imeOptions;
        this.f785q.setImeOptions(imeOptions | 33554432);
        this.f785q.setText("");
        setIconified(false);
    }

    public void b0(CharSequence charSequence, boolean z2) {
        this.f785q.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f785q;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f772d0 = charSequence;
        }
        if (!z2 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        U();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.W = true;
        super.clearFocus();
        this.f785q.clearFocus();
        this.f785q.setImeVisibility(false);
        this.W = false;
    }

    @Override // f.c
    public void d() {
        b0("", false);
        clearFocus();
        i0(true);
        this.f785q.setImeOptions(this.f774f0);
        this.f773e0 = false;
    }

    void d0() {
        int[] iArr = this.f785q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f788s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f789t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f785q.getImeOptions();
    }

    public int getInputType() {
        return this.f785q.getInputType();
    }

    public int getMaxWidth() {
        return this.f769a0;
    }

    public CharSequence getQuery() {
        return this.f785q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.U;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f775g0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.K : getContext().getText(this.f775g0.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.H;
    }

    int getSuggestionRowLayout() {
        return this.G;
    }

    public c0.a getSuggestionsAdapter() {
        return this.S;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f777i0);
        post(this.f778j0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.i0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            G(this.f785q, this.A);
            Rect rect = this.B;
            Rect rect2 = this.A;
            rect.set(rect2.left, 0, rect2.right, i5 - i3);
            p pVar = this.f795z;
            if (pVar != null) {
                pVar.a(this.B, this.A);
                return;
            }
            p pVar2 = new p(this.B, this.A, this.f785q);
            this.f795z = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    @Override // androidx.appcompat.widget.i0, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.J()
            if (r0 == 0) goto La
            super.onMeasure(r4, r5)
            return
        La:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2c
            if (r0 == 0) goto L22
            if (r0 == r2) goto L1d
            goto L39
        L1d:
            int r0 = r3.f769a0
            if (r0 <= 0) goto L39
            goto L30
        L22:
            int r4 = r3.f769a0
            if (r4 <= 0) goto L27
            goto L39
        L27:
            int r4 = r3.getPreferredWidth()
            goto L39
        L2c:
            int r0 = r3.f769a0
            if (r0 <= 0) goto L31
        L30:
            goto L35
        L31:
            int r0 = r3.getPreferredWidth()
        L35:
            int r4 = java.lang.Math.min(r0, r4)
        L39:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L4b
            if (r0 == 0) goto L46
            goto L53
        L46:
            int r5 = r3.getPreferredHeight()
            goto L53
        L4b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L53:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.a());
        i0(oVar.f814d);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f814d = J();
        return oVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        Z();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i2, Rect rect) {
        if (this.W || !isFocusable()) {
            return false;
        }
        if (J()) {
            return super.requestFocus(i2, rect);
        }
        boolean zRequestFocus = this.f785q.requestFocus(i2, rect);
        if (zRequestFocus) {
            i0(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f776h0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            P();
        } else {
            T();
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.Q == z2) {
            return;
        }
        this.Q = z2;
        i0(z2);
        e0();
    }

    public void setImeOptions(int i2) {
        this.f785q.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.f785q.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.f769a0 = i2;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.M = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.N = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.L = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.P = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
        this.O = nVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.U = charSequence;
        e0();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.V = z2;
        c0.a aVar = this.S;
        if (aVar instanceof q0) {
            ((q0) aVar).x(z2 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f775g0 = searchableInfo;
        if (searchableInfo != null) {
            f0();
            e0();
        }
        boolean zI = I();
        this.f770b0 = zI;
        if (zI) {
            this.f785q.setPrivateImeOptions("nm");
        }
        i0(J());
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.T = z2;
        i0(J());
    }

    public void setSuggestionsAdapter(c0.a aVar) {
        this.S = aVar;
        this.f785q.setAdapter(aVar);
    }

    void z() {
        if (this.f794y.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f788s.getPaddingLeft();
            Rect rect = new Rect();
            boolean zB = c1.b(this);
            int dimensionPixelSize = this.Q ? resources.getDimensionPixelSize(a.d.f38e) + resources.getDimensionPixelSize(a.d.f39f) : 0;
            this.f785q.getDropDownBackground().getPadding(rect);
            int i2 = rect.left;
            this.f785q.setDropDownHorizontalOffset(zB ? -i2 : paddingLeft - (i2 + dimensionPixelSize));
            this.f785q.setDropDownWidth((((this.f794y.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
