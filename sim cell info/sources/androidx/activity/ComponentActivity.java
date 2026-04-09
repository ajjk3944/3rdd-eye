package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import androidx.savedstate.SavedStateRegistry;
import q.d;

/* loaded from: classes.dex */
public class ComponentActivity extends d implements s, androidx.savedstate.b, c {

    /* renamed from: f, reason: collision with root package name */
    private r f253f;

    /* renamed from: h, reason: collision with root package name */
    private int f255h;

    /* renamed from: d, reason: collision with root package name */
    private final h f251d = new h(this);

    /* renamed from: e, reason: collision with root package name */
    private final androidx.savedstate.a f252e = androidx.savedstate.a.a(this);

    /* renamed from: g, reason: collision with root package name */
    private final OnBackPressedDispatcher f254g = new OnBackPressedDispatcher(new a());

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        Object f259a;

        /* renamed from: b, reason: collision with root package name */
        r f260b;

        b() {
        }
    }

    public ComponentActivity() {
        if (a() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            a().a(new e() { // from class: androidx.activity.ComponentActivity.2
                @Override // androidx.lifecycle.e
                public void g(g gVar, d.a aVar) {
                    if (aVar == d.a.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                        if (viewPeekDecorView != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
        }
        a().a(new e() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.e
            public void g(g gVar, d.a aVar) {
                if (aVar != d.a.ON_DESTROY || ComponentActivity.this.isChangingConfigurations()) {
                    return;
                }
                ComponentActivity.this.e().a();
            }
        });
        if (19 > i2 || i2 > 23) {
            return;
        }
        a().a(new ImmLeaksCleaner(this));
    }

    @Override // q.d, androidx.lifecycle.g
    public androidx.lifecycle.d a() {
        return this.f251d;
    }

    @Override // androidx.activity.c
    public final OnBackPressedDispatcher c() {
        return this.f254g;
    }

    @Override // androidx.savedstate.b
    public final SavedStateRegistry d() {
        return this.f252e.b();
    }

    @Override // androidx.lifecycle.s
    public r e() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f253f == null) {
            b bVar = (b) getLastNonConfigurationInstance();
            if (bVar != null) {
                this.f253f = bVar.f260b;
            }
            if (this.f253f == null) {
                this.f253f = new r();
            }
        }
        return this.f253f;
    }

    @Deprecated
    public Object m() {
        return null;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f254g.c();
    }

    @Override // q.d, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f252e.c(bundle);
        o.e(this);
        int i2 = this.f255h;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        b bVar;
        Object objM = m();
        r rVar = this.f253f;
        if (rVar == null && (bVar = (b) getLastNonConfigurationInstance()) != null) {
            rVar = bVar.f260b;
        }
        if (rVar == null && objM == null) {
            return null;
        }
        b bVar2 = new b();
        bVar2.f259a = objM;
        bVar2.f260b = rVar;
        return bVar2;
    }

    @Override // q.d, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.d dVarA = a();
        if (dVarA instanceof h) {
            ((h) dVarA).p(d.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f252e.d(bundle);
    }
}
