package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC1759l;
import androidx.preference.DialogPreference;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import n1.g;
import n1.h;
import n1.i;

/* compiled from: PreferenceFragmentCompat.java */
/* loaded from: classes.dex */
public abstract class b extends ComponentCallbacksC1759l implements DialogPreference.a {

    /* renamed from: c, reason: collision with root package name */
    public n1.f f16321c;

    /* renamed from: d, reason: collision with root package name */
    public RecyclerView f16322d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16323e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16324f;

    /* renamed from: b, reason: collision with root package name */
    public final c f16320b = new c();

    /* renamed from: g, reason: collision with root package name */
    public int f16325g = R.layout.preference_list_fragment;

    /* renamed from: h, reason: collision with root package name */
    public final a f16326h = new a(Looper.getMainLooper());
    public final RunnableC0257b i = new RunnableC0257b();

    /* compiled from: PreferenceFragmentCompat.java */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            b bVar = b.this;
            PreferenceScreen preferenceScreen = bVar.f16321c.f44221g;
            if (preferenceScreen != null) {
                bVar.f16322d.setAdapter(new androidx.preference.c(preferenceScreen));
                preferenceScreen.j();
            }
        }
    }

    /* compiled from: PreferenceFragmentCompat.java */
    /* renamed from: androidx.preference.b$b, reason: collision with other inner class name */
    public class RunnableC0257b implements Runnable {
        public RunnableC0257b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = b.this.f16322d;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    /* compiled from: PreferenceFragmentCompat.java */
    public class c extends RecyclerView.o {

        /* renamed from: a, reason: collision with root package name */
        public Drawable f16329a;

        /* renamed from: b, reason: collision with root package name */
        public int f16330b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f16331c = true;

        public c() {
        }

        public final boolean b(RecyclerView recyclerView, View view) {
            RecyclerView.F childViewHolder = recyclerView.getChildViewHolder(view);
            if (!(childViewHolder instanceof h) || !((h) childViewHolder).f44232p) {
                return false;
            }
            boolean z10 = this.f16331c;
            int iIndexOfChild = recyclerView.indexOfChild(view);
            if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
                return z10;
            }
            RecyclerView.F childViewHolder2 = recyclerView.getChildViewHolder(recyclerView.getChildAt(iIndexOfChild + 1));
            return (childViewHolder2 instanceof h) && ((h) childViewHolder2).f44231o;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.B b10) {
            if (b(recyclerView, view)) {
                rect.bottom = this.f16330b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b10) {
            if (this.f16329a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (b(recyclerView, childAt)) {
                    int height = childAt.getHeight() + ((int) childAt.getY());
                    this.f16329a.setBounds(0, height, width, this.f16330b + height);
                    this.f16329a.draw(canvas);
                }
            }
        }
    }

    /* compiled from: PreferenceFragmentCompat.java */
    public interface d {
        boolean a();
    }

    /* compiled from: PreferenceFragmentCompat.java */
    public interface e {
        boolean a();
    }

    /* compiled from: PreferenceFragmentCompat.java */
    public interface f {
        boolean a();
    }

    @Override // androidx.preference.DialogPreference.a
    public final Preference a(String str) {
        PreferenceScreen preferenceScreen;
        n1.f fVar = this.f16321c;
        if (fVar == null || (preferenceScreen = fVar.f44221g) == null) {
            return null;
        }
        return preferenceScreen.A(str);
    }

    public abstract void c(String str);

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        requireContext().getTheme().applyStyle(i, false);
        n1.f fVar = new n1.f(requireContext());
        this.f16321c = fVar;
        fVar.f44223j = this;
        c(getArguments() != null ? getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(null, i.f44240h, R.attr.preferenceFragmentCompatStyle, 0);
        this.f16325g = typedArrayObtainStyledAttributes.getResourceId(0, this.f16325g);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(requireContext());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f16325g, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        if (!requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) layoutInflaterCloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
            requireContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            recyclerView.setAccessibilityDelegateCompat(new g(recyclerView));
        }
        this.f16322d = recyclerView;
        c cVar = this.f16320b;
        recyclerView.addItemDecoration(cVar);
        if (drawable != null) {
            cVar.getClass();
            cVar.f16330b = drawable.getIntrinsicHeight();
        } else {
            cVar.f16330b = 0;
        }
        cVar.f16329a = drawable;
        b bVar = b.this;
        bVar.f16322d.invalidateItemDecorations();
        if (dimensionPixelSize != -1) {
            cVar.f16330b = dimensionPixelSize;
            bVar.f16322d.invalidateItemDecorations();
        }
        cVar.f16331c = z10;
        if (this.f16322d.getParent() == null) {
            viewGroup2.addView(this.f16322d);
        }
        this.f16326h.post(this.i);
        return viewInflate;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final void onDestroyView() {
        RunnableC0257b runnableC0257b = this.i;
        a aVar = this.f16326h;
        aVar.removeCallbacks(runnableC0257b);
        aVar.removeMessages(1);
        if (this.f16323e) {
            this.f16322d.setAdapter(null);
            PreferenceScreen preferenceScreen = this.f16321c.f44221g;
            if (preferenceScreen != null) {
                preferenceScreen.n();
            }
        }
        this.f16322d = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = this.f16321c.f44221g;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.c(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final void onStart() {
        super.onStart();
        n1.f fVar = this.f16321c;
        fVar.f44222h = this;
        fVar.i = this;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final void onStop() {
        super.onStop();
        n1.f fVar = this.f16321c;
        fVar.f44222h = null;
        fVar.i = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC1759l
    public final void onViewCreated(View view, Bundle bundle) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen2 = this.f16321c.f44221g) != null) {
            preferenceScreen2.b(bundle2);
        }
        if (this.f16323e && (preferenceScreen = this.f16321c.f44221g) != null) {
            this.f16322d.setAdapter(new androidx.preference.c(preferenceScreen));
            preferenceScreen.j();
        }
        this.f16324f = true;
    }
}
