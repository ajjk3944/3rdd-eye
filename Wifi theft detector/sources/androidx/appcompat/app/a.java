package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

/* loaded from: classes.dex */
public class a implements DrawerLayout.e {

    /* renamed from: a, reason: collision with root package name */
    public final b f499a;

    /* renamed from: b, reason: collision with root package name */
    public final DrawerLayout f500b;

    /* renamed from: c, reason: collision with root package name */
    public DrawerArrowDrawable f501c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f502d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f503e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f504f;

    /* renamed from: g, reason: collision with root package name */
    public final int f505g;

    /* renamed from: h, reason: collision with root package name */
    public final int f506h;

    /* renamed from: i, reason: collision with root package name */
    public View.OnClickListener f507i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f508j;

    /* renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public class ViewOnClickListenerC0006a implements View.OnClickListener {
        public ViewOnClickListenerC0006a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.f504f) {
                aVar.j();
                return;
            }
            View.OnClickListener onClickListener = aVar.f507i;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public interface b {
        Context a();

        boolean b();

        void c(Drawable drawable, int i10);

        Drawable d();

        void e(int i10);
    }

    public interface c {
        b h();
    }

    public static class d implements b {

        /* renamed from: a, reason: collision with root package name */
        public final Activity f510a;

        public d(Activity activity) {
            this.f510a = activity;
        }

        @Override // androidx.appcompat.app.a.b
        public Context a() {
            android.app.ActionBar actionBar = this.f510a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f510a;
        }

        @Override // androidx.appcompat.app.a.b
        public boolean b() {
            android.app.ActionBar actionBar = this.f510a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.a.b
        public void c(Drawable drawable, int i10) {
            android.app.ActionBar actionBar = this.f510a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i10);
            }
        }

        @Override // androidx.appcompat.app.a.b
        public Drawable d() {
            TypedArray typedArrayObtainStyledAttributes = a().obtainStyledAttributes(null, new int[]{R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            typedArrayObtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.a.b
        public void e(int i10) {
            android.app.ActionBar actionBar = this.f510a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i10);
            }
        }
    }

    public static class e implements b {

        /* renamed from: a, reason: collision with root package name */
        public final Toolbar f511a;

        /* renamed from: b, reason: collision with root package name */
        public final Drawable f512b;

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f513c;

        public e(Toolbar toolbar) {
            this.f511a = toolbar;
            this.f512b = toolbar.getNavigationIcon();
            this.f513c = toolbar.getNavigationContentDescription();
        }

        @Override // androidx.appcompat.app.a.b
        public Context a() {
            return this.f511a.getContext();
        }

        @Override // androidx.appcompat.app.a.b
        public boolean b() {
            return true;
        }

        @Override // androidx.appcompat.app.a.b
        public void c(Drawable drawable, int i10) {
            this.f511a.setNavigationIcon(drawable);
            e(i10);
        }

        @Override // androidx.appcompat.app.a.b
        public Drawable d() {
            return this.f512b;
        }

        @Override // androidx.appcompat.app.a.b
        public void e(int i10) {
            if (i10 == 0) {
                this.f511a.setNavigationContentDescription(this.f513c);
            } else {
                this.f511a.setNavigationContentDescription(i10);
            }
        }
    }

    public a(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i10, int i11) {
        this(activity, toolbar, drawerLayout, null, i10, i11);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void a(View view) {
        h(1.0f);
        if (this.f504f) {
            f(this.f506h);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void b(View view) {
        h(0.0f);
        if (this.f504f) {
            f(this.f505g);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void c(int i10) {
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.e
    public void d(View view, float f10) {
        if (this.f502d) {
            h(Math.min(1.0f, Math.max(0.0f, f10)));
        } else {
            h(0.0f);
        }
    }

    public Drawable e() {
        return this.f499a.d();
    }

    public void f(int i10) {
        this.f499a.e(i10);
    }

    public void g(Drawable drawable, int i10) {
        if (!this.f508j && !this.f499a.b()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f508j = true;
        }
        this.f499a.c(drawable, i10);
    }

    public final void h(float f10) {
        if (f10 == 1.0f) {
            this.f501c.g(true);
        } else if (f10 == 0.0f) {
            this.f501c.g(false);
        }
        this.f501c.e(f10);
    }

    public void i() {
        if (this.f500b.C(8388611)) {
            h(1.0f);
        } else {
            h(0.0f);
        }
        if (this.f504f) {
            g(this.f501c, this.f500b.C(8388611) ? this.f506h : this.f505g);
        }
    }

    public void j() {
        int iQ = this.f500b.q(8388611);
        if (this.f500b.F(8388611) && iQ != 2) {
            this.f500b.d(8388611);
        } else if (iQ != 1) {
            this.f500b.K(8388611);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, DrawerArrowDrawable drawerArrowDrawable, int i10, int i11) {
        this.f502d = true;
        this.f504f = true;
        this.f508j = false;
        if (toolbar != null) {
            this.f499a = new e(toolbar);
            toolbar.setNavigationOnClickListener(new ViewOnClickListenerC0006a());
        } else if (activity instanceof c) {
            this.f499a = ((c) activity).h();
        } else {
            this.f499a = new d(activity);
        }
        this.f500b = drawerLayout;
        this.f505g = i10;
        this.f506h = i11;
        if (drawerArrowDrawable == null) {
            this.f501c = new DrawerArrowDrawable(this.f499a.a());
        } else {
            this.f501c = drawerArrowDrawable;
        }
        this.f503e = e();
    }
}
