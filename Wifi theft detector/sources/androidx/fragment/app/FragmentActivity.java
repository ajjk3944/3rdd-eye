package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.savedstate.a;
import f0.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements b.d {

    /* renamed from: c, reason: collision with root package name */
    public boolean f3130c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3131d;

    /* renamed from: a, reason: collision with root package name */
    public final j f3128a = j.b(new a());

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.p f3129b = new androidx.lifecycle.p(this);

    /* renamed from: e, reason: collision with root package name */
    public boolean f3132e = true;

    public class a extends l implements h0.b, h0.c, f0.q, f0.r, j0, androidx.activity.q, androidx.activity.result.c, t1.d, v, androidx.core.view.u {
        public a() {
            super(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.v
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            FragmentActivity.this.D(fragment);
        }

        @Override // androidx.core.view.u
        public void addMenuProvider(androidx.core.view.z zVar) {
            FragmentActivity.this.addMenuProvider(zVar);
        }

        @Override // h0.b
        public void addOnConfigurationChangedListener(r0.b bVar) {
            FragmentActivity.this.addOnConfigurationChangedListener(bVar);
        }

        @Override // f0.q
        public void addOnMultiWindowModeChangedListener(r0.b bVar) {
            FragmentActivity.this.addOnMultiWindowModeChangedListener(bVar);
        }

        @Override // f0.r
        public void addOnPictureInPictureModeChangedListener(r0.b bVar) {
            FragmentActivity.this.addOnPictureInPictureModeChangedListener(bVar);
        }

        @Override // h0.c
        public void addOnTrimMemoryListener(r0.b bVar) {
            FragmentActivity.this.addOnTrimMemoryListener(bVar);
        }

        @Override // androidx.fragment.app.i
        public View c(int i10) {
            return FragmentActivity.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.i
        public boolean d() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.activity.result.c
        public ActivityResultRegistry getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.n
        public Lifecycle getLifecycle() {
            return FragmentActivity.this.f3129b;
        }

        @Override // androidx.activity.q
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override // t1.d
        public androidx.savedstate.a getSavedStateRegistry() {
            return FragmentActivity.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.j0
        public i0 getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.l
        public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.l
        public LayoutInflater j() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.l
        public boolean l(String str) {
            return f0.b.e(FragmentActivity.this, str);
        }

        @Override // androidx.fragment.app.l
        public void o() {
            p();
        }

        public void p() {
            FragmentActivity.this.invalidateOptionsMenu();
        }

        @Override // androidx.fragment.app.l
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public FragmentActivity i() {
            return FragmentActivity.this;
        }

        @Override // androidx.core.view.u
        public void removeMenuProvider(androidx.core.view.z zVar) {
            FragmentActivity.this.removeMenuProvider(zVar);
        }

        @Override // h0.b
        public void removeOnConfigurationChangedListener(r0.b bVar) {
            FragmentActivity.this.removeOnConfigurationChangedListener(bVar);
        }

        @Override // f0.q
        public void removeOnMultiWindowModeChangedListener(r0.b bVar) {
            FragmentActivity.this.removeOnMultiWindowModeChangedListener(bVar);
        }

        @Override // f0.r
        public void removeOnPictureInPictureModeChangedListener(r0.b bVar) {
            FragmentActivity.this.removeOnPictureInPictureModeChangedListener(bVar);
        }

        @Override // h0.c
        public void removeOnTrimMemoryListener(r0.b bVar) {
            FragmentActivity.this.removeOnTrimMemoryListener(bVar);
        }
    }

    public FragmentActivity() {
        A();
    }

    public static boolean C(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean zC = false;
        for (Fragment fragment : fragmentManager.u0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zC |= C(fragment.getChildFragmentManager(), state);
                }
                d0 d0Var = fragment.mViewLifecycleOwner;
                if (d0Var != null && d0Var.getLifecycle().b().f(Lifecycle.State.STARTED)) {
                    fragment.mViewLifecycleOwner.f(state);
                    zC = true;
                }
                if (fragment.mLifecycleRegistry.b().f(Lifecycle.State.STARTED)) {
                    fragment.mLifecycleRegistry.n(state);
                    zC = true;
                }
            }
        }
        return zC;
    }

    public static /* synthetic */ Bundle w(FragmentActivity fragmentActivity) {
        fragmentActivity.B();
        fragmentActivity.f3129b.i(Lifecycle.Event.ON_STOP);
        return new Bundle();
    }

    public final void A() {
        getSavedStateRegistry().h("android:support:lifecycle", new a.c() { // from class: androidx.fragment.app.d
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                return FragmentActivity.w(this.f3315a);
            }
        });
        addOnConfigurationChangedListener(new r0.b() { // from class: androidx.fragment.app.e
            @Override // r0.b
            public final void accept(Object obj) {
                this.f3320a.f3128a.m();
            }
        });
        addOnNewIntentListener(new r0.b() { // from class: androidx.fragment.app.f
            @Override // r0.b
            public final void accept(Object obj) {
                this.f3323a.f3128a.m();
            }
        });
        addOnContextAvailableListener(new androidx.activity.contextaware.d() { // from class: androidx.fragment.app.g
            @Override // androidx.activity.contextaware.d
            public final void a(Context context) {
                this.f3324a.f3128a.a(null);
            }
        });
    }

    public void B() {
        while (C(z(), Lifecycle.State.CREATED)) {
        }
    }

    public void D(Fragment fragment) {
    }

    public void E() {
        this.f3129b.i(Lifecycle.Event.ON_RESUME);
        this.f3128a.h();
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f3130c);
            printWriter.print(" mResumed=");
            printWriter.print(this.f3131d);
            printWriter.print(" mStopped=");
            printWriter.print(this.f3132e);
            if (getApplication() != null) {
                l1.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.f3128a.l().X(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // f0.b.d
    public final void g(int i10) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.f3128a.m();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3129b.i(Lifecycle.Event.ON_CREATE);
        this.f3128a.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewY = y(view, str, context, attributeSet);
        return viewY == null ? super.onCreateView(view, str, context, attributeSet) : viewY;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f3128a.f();
        this.f3129b.i(Lifecycle.Event.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.f3128a.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f3131d = false;
        this.f3128a.g();
        this.f3129b.i(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        E();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f3128a.m();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.f3128a.m();
        super.onResume();
        this.f3131d = true;
        this.f3128a.k();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.f3128a.m();
        super.onStart();
        this.f3132e = false;
        if (!this.f3130c) {
            this.f3130c = true;
            this.f3128a.c();
        }
        this.f3128a.k();
        this.f3129b.i(Lifecycle.Event.ON_START);
        this.f3128a.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f3128a.m();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f3132e = true;
        B();
        this.f3128a.j();
        this.f3129b.i(Lifecycle.Event.ON_STOP);
    }

    public final View y(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f3128a.n(view, str, context, attributeSet);
    }

    public FragmentManager z() {
        return this.f3128a.l();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewY = y(null, str, context, attributeSet);
        return viewY == null ? super.onCreateView(str, context, attributeSet) : viewY;
    }
}
