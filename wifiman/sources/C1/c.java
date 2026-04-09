package C1;

import C1.c;
import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.mp.MPv3;
import org.snmp4j.mp.PduHandle;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final a f2174b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final b f2175a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(Activity activity) {
            AbstractC6492s.i(activity, "<this>");
            c cVar = new c(activity, null);
            cVar.b();
            return cVar;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Activity f2176a;

        /* renamed from: b, reason: collision with root package name */
        private int f2177b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f2178c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f2179d;

        /* renamed from: e, reason: collision with root package name */
        private Drawable f2180e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f2181f;

        /* renamed from: g, reason: collision with root package name */
        private d f2182g;

        public static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f2184b;

            a(View view) {
                this.f2184b = view;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (b.this.d().a()) {
                    return false;
                }
                this.f2184b.getViewTreeObserver().removeOnPreDrawListener(this);
                b.b(b.this);
                return true;
            }
        }

        public b(Activity activity) {
            AbstractC6492s.i(activity, "activity");
            this.f2176a = activity;
            this.f2182g = new d() { // from class: C1.d
                @Override // C1.c.d
                public final boolean a() {
                    return c.b.i();
                }
            };
        }

        public static final /* synthetic */ j b(b bVar) {
            bVar.getClass();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean i() {
            return false;
        }

        public final Activity c() {
            return this.f2176a;
        }

        public final d d() {
            return this.f2182g;
        }

        public void e() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme currentTheme = this.f2176a.getTheme();
            if (currentTheme.resolveAttribute(C1.a.f2172d, typedValue, true)) {
                this.f2178c = Integer.valueOf(typedValue.resourceId);
                this.f2179d = Integer.valueOf(typedValue.data);
            }
            if (currentTheme.resolveAttribute(C1.a.f2171c, typedValue, true)) {
                this.f2180e = currentTheme.getDrawable(typedValue.resourceId);
            }
            if (currentTheme.resolveAttribute(C1.a.f2170b, typedValue, true)) {
                this.f2181f = typedValue.resourceId == C1.b.f2173a;
            }
            AbstractC6492s.h(currentTheme, "currentTheme");
            g(currentTheme, typedValue);
        }

        public void f(d keepOnScreenCondition) {
            AbstractC6492s.i(keepOnScreenCondition, "keepOnScreenCondition");
            this.f2182g = keepOnScreenCondition;
            View viewFindViewById = this.f2176a.findViewById(R.id.content);
            viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new a(viewFindViewById));
        }

        protected final void g(Resources.Theme currentTheme, TypedValue typedValue) {
            AbstractC6492s.i(currentTheme, "currentTheme");
            AbstractC6492s.i(typedValue, "typedValue");
            if (currentTheme.resolveAttribute(C1.a.f2169a, typedValue, true)) {
                int i10 = typedValue.resourceId;
                this.f2177b = i10;
                if (i10 != 0) {
                    this.f2176a.setTheme(i10);
                }
            }
        }

        public final void h(d dVar) {
            AbstractC6492s.i(dVar, "<set-?>");
            this.f2182g = dVar;
        }
    }

    /* renamed from: C1.c$c, reason: collision with other inner class name */
    private static final class C0080c extends b {

        /* renamed from: h, reason: collision with root package name */
        private ViewTreeObserver.OnPreDrawListener f2185h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f2186i;

        /* renamed from: j, reason: collision with root package name */
        private final ViewGroup.OnHierarchyChangeListener f2187j;

        /* renamed from: C1.c$c$a */
        public static final class a implements ViewGroup.OnHierarchyChangeListener {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f2189b;

            a(Activity activity) {
                this.f2189b = activity;
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View view, View view2) {
                if (h.a(view2)) {
                    C0080c c0080c = C0080c.this;
                    c0080c.k(c0080c.j(i.a(view2)));
                    ((ViewGroup) this.f2189b.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View view, View view2) {
            }
        }

        /* renamed from: C1.c$c$b */
        public static final class b implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f2191b;

            b(View view) {
                this.f2191b = view;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (C0080c.this.d().a()) {
                    return false;
                }
                this.f2191b.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0080c(Activity activity) {
            super(activity);
            AbstractC6492s.i(activity, "activity");
            this.f2186i = true;
            this.f2187j = new a(activity);
        }

        @Override // C1.c.b
        public void e() {
            Resources.Theme theme = c().getTheme();
            AbstractC6492s.h(theme, "activity.theme");
            g(theme, new TypedValue());
            ((ViewGroup) c().getWindow().getDecorView()).setOnHierarchyChangeListener(this.f2187j);
        }

        @Override // C1.c.b
        public void f(d keepOnScreenCondition) {
            AbstractC6492s.i(keepOnScreenCondition, "keepOnScreenCondition");
            h(keepOnScreenCondition);
            View viewFindViewById = c().findViewById(R.id.content);
            ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
            if (this.f2185h != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f2185h);
            }
            b bVar = new b(viewFindViewById);
            this.f2185h = bVar;
            viewTreeObserver.addOnPreDrawListener(bVar);
        }

        public final boolean j(SplashScreenView child) {
            AbstractC6492s.i(child, "child");
            WindowInsets windowInsetsBuild = e.a().build();
            AbstractC6492s.h(windowInsetsBuild, "Builder().build()");
            Rect rect = new Rect(PduHandle.NONE, PduHandle.NONE, MPv3.MAX_MESSAGE_ID, MPv3.MAX_MESSAGE_ID);
            return (windowInsetsBuild == child.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect) && rect.isEmpty()) ? false : true;
        }

        public final void k(boolean z10) {
            this.f2186i = z10;
        }
    }

    public interface d {
        boolean a();
    }

    public /* synthetic */ c(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        this.f2175a.e();
    }

    public final void c(d condition) {
        AbstractC6492s.i(condition, "condition");
        this.f2175a.f(condition);
    }

    private c(Activity activity) {
        this.f2175a = Build.VERSION.SDK_INT >= 31 ? new C0080c(activity) : new b(activity);
    }
}
