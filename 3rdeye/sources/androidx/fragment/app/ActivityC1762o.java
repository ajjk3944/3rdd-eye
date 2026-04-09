package androidx.fragment.app;

import D1.c;
import L0.InterfaceC0778i;
import L0.InterfaceC0783n;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.AbstractC1781n;
import androidx.lifecycle.C1791y;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import c.ActivityC2008f;
import c.C2023u;
import c.InterfaceC2025w;
import e.AbstractC4294e;
import e.InterfaceC4298i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import l1.AbstractC5266a;
import y0.C5788a;
import z0.InterfaceC5850c;
import z0.InterfaceC5851d;

/* compiled from: FragmentActivity.java */
/* renamed from: androidx.fragment.app.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ActivityC1762o extends ActivityC2008f implements C5788a.e {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final C1791y mFragmentLifecycleRegistry;
    final r mFragments;
    boolean mResumed;
    boolean mStopped;

    /* compiled from: FragmentActivity.java */
    /* renamed from: androidx.fragment.app.o$a */
    public class a extends AbstractC1766t<ActivityC1762o> implements InterfaceC5850c, InterfaceC5851d, y0.t, y0.u, j0, InterfaceC2025w, InterfaceC4298i, D1.e, C, InterfaceC0778i {
        public a() {
            super(ActivityC1762o.this);
        }

        @Override // androidx.fragment.app.C
        public final void a(ComponentCallbacksC1759l componentCallbacksC1759l) {
            ActivityC1762o.this.onAttachFragment(componentCallbacksC1759l);
        }

        @Override // L0.InterfaceC0778i
        public final void addMenuProvider(InterfaceC0783n interfaceC0783n) {
            ActivityC1762o.this.addMenuProvider(interfaceC0783n);
        }

        @Override // z0.InterfaceC5850c
        public final void addOnConfigurationChangedListener(K0.b<Configuration> bVar) {
            ActivityC1762o.this.addOnConfigurationChangedListener(bVar);
        }

        @Override // y0.t
        public final void addOnMultiWindowModeChangedListener(K0.b<y0.j> bVar) {
            ActivityC1762o.this.addOnMultiWindowModeChangedListener(bVar);
        }

        @Override // y0.u
        public final void addOnPictureInPictureModeChangedListener(K0.b<y0.w> bVar) {
            ActivityC1762o.this.addOnPictureInPictureModeChangedListener(bVar);
        }

        @Override // z0.InterfaceC5851d
        public final void addOnTrimMemoryListener(K0.b<Integer> bVar) {
            ActivityC1762o.this.addOnTrimMemoryListener(bVar);
        }

        @Override // androidx.fragment.app.AbstractC1764q
        public final View b(int i) {
            return ActivityC1762o.this.findViewById(i);
        }

        @Override // androidx.fragment.app.AbstractC1764q
        public final boolean c() {
            Window window = ActivityC1762o.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.AbstractC1766t
        public final void d(PrintWriter printWriter, String[] strArr) {
            ActivityC1762o.this.dump("  ", null, printWriter, strArr);
        }

        @Override // androidx.fragment.app.AbstractC1766t
        public final ActivityC1762o e() {
            return ActivityC1762o.this;
        }

        @Override // androidx.fragment.app.AbstractC1766t
        public final LayoutInflater f() {
            ActivityC1762o activityC1762o = ActivityC1762o.this;
            return activityC1762o.getLayoutInflater().cloneInContext(activityC1762o);
        }

        @Override // androidx.fragment.app.AbstractC1766t
        public final boolean g(String str) {
            return C5788a.b(ActivityC1762o.this, str);
        }

        @Override // e.InterfaceC4298i
        public final AbstractC4294e getActivityResultRegistry() {
            return ActivityC1762o.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.InterfaceC1790x
        public final AbstractC1781n getLifecycle() {
            return ActivityC1762o.this.mFragmentLifecycleRegistry;
        }

        @Override // c.InterfaceC2025w
        public final C2023u getOnBackPressedDispatcher() {
            return ActivityC1762o.this.getOnBackPressedDispatcher();
        }

        @Override // D1.e
        public final D1.c getSavedStateRegistry() {
            return ActivityC1762o.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.j0
        public final i0 getViewModelStore() {
            return ActivityC1762o.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.AbstractC1766t
        public final void h() {
            ActivityC1762o.this.invalidateMenu();
        }

        @Override // L0.InterfaceC0778i
        public final void removeMenuProvider(InterfaceC0783n interfaceC0783n) {
            ActivityC1762o.this.removeMenuProvider(interfaceC0783n);
        }

        @Override // z0.InterfaceC5850c
        public final void removeOnConfigurationChangedListener(K0.b<Configuration> bVar) {
            ActivityC1762o.this.removeOnConfigurationChangedListener(bVar);
        }

        @Override // y0.t
        public final void removeOnMultiWindowModeChangedListener(K0.b<y0.j> bVar) {
            ActivityC1762o.this.removeOnMultiWindowModeChangedListener(bVar);
        }

        @Override // y0.u
        public final void removeOnPictureInPictureModeChangedListener(K0.b<y0.w> bVar) {
            ActivityC1762o.this.removeOnPictureInPictureModeChangedListener(bVar);
        }

        @Override // z0.InterfaceC5851d
        public final void removeOnTrimMemoryListener(K0.b<Integer> bVar) {
            ActivityC1762o.this.removeOnTrimMemoryListener(bVar);
        }
    }

    public ActivityC1762o() {
        this.mFragments = new r(new a());
        this.mFragmentLifecycleRegistry = new C1791y(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new c.b() { // from class: androidx.fragment.app.m
            @Override // D1.c.b
            public final Bundle a() {
                return this.f15938a.lambda$init$0();
            }
        });
        int i = 1;
        addOnConfigurationChangedListener(new E.x(this, i));
        addOnNewIntentListener(new E.y(this, i));
        addOnContextAvailableListener(new C1761n(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.d(AbstractC1781n.a.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$init$3(Context context) {
        a aVar = this.mFragments.f15949a;
        aVar.f15954e.b(aVar, aVar, null);
    }

    private static boolean markState(x xVar, AbstractC1781n.b bVar) {
        boolean zMarkState = false;
        for (ComponentCallbacksC1759l componentCallbacksC1759l : xVar.f15978c.f()) {
            if (componentCallbacksC1759l != null) {
                if (componentCallbacksC1759l.getHost() != null) {
                    zMarkState |= markState(componentCallbacksC1759l.getChildFragmentManager(), bVar);
                }
                O o10 = componentCallbacksC1759l.mViewLifecycleOwner;
                if (o10 != null) {
                    o10.b();
                    if (o10.f15827e.f16185d.isAtLeast(AbstractC1781n.b.STARTED)) {
                        componentCallbacksC1759l.mViewLifecycleOwner.f15827e.f(bVar);
                        zMarkState = true;
                    }
                }
                if (componentCallbacksC1759l.mLifecycleRegistry.f16185d.isAtLeast(AbstractC1781n.b.STARTED)) {
                    componentCallbacksC1759l.mLifecycleRegistry.f(bVar);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f15949a.f15954e.f15981f.onCreateView(view, str, context, attributeSet);
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
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                AbstractC5266a.a(this).b(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.f15949a.f15954e.u(str, fileDescriptor, printWriter, strArr);
        }
    }

    public x getSupportFragmentManager() {
        return this.mFragments.f15949a.f15954e;
    }

    @Deprecated
    public AbstractC5266a getSupportLoaderManager() {
        return AbstractC5266a.a(this);
    }

    public void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), AbstractC1781n.b.CREATED)) {
        }
    }

    @Override // c.ActivityC2008f, android.app.Activity
    public void onActivityResult(int i, int i10, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i, i10, intent);
    }

    @Override // c.ActivityC2008f, y0.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.d(AbstractC1781n.a.ON_CREATE);
        z zVar = this.mFragments.f15949a.f15954e;
        zVar.f15967F = false;
        zVar.f15968G = false;
        zVar.f15974M.f15755g = false;
        zVar.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f15949a.f15954e.k();
        this.mFragmentLifecycleRegistry.d(AbstractC1781n.a.ON_DESTROY);
    }

    @Override // c.ActivityC2008f, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.f15949a.f15954e.i(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f15949a.f15954e.t(5);
        this.mFragmentLifecycleRegistry.d(AbstractC1781n.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // c.ActivityC2008f, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f15949a.f15954e.x(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.d(AbstractC1781n.a.ON_RESUME);
        z zVar = this.mFragments.f15949a.f15954e;
        zVar.f15967F = false;
        zVar.f15968G = false;
        zVar.f15974M.f15755g = false;
        zVar.t(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            z zVar = this.mFragments.f15949a.f15954e;
            zVar.f15967F = false;
            zVar.f15968G = false;
            zVar.f15974M.f15755g = false;
            zVar.t(4);
        }
        this.mFragments.f15949a.f15954e.x(true);
        this.mFragmentLifecycleRegistry.d(AbstractC1781n.a.ON_START);
        z zVar2 = this.mFragments.f15949a.f15954e;
        zVar2.f15967F = false;
        zVar2.f15968G = false;
        zVar2.f15974M.f15755g = false;
        zVar2.t(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        z zVar = this.mFragments.f15949a.f15954e;
        zVar.f15968G = true;
        zVar.f15974M.f15755g = true;
        zVar.t(4);
        this.mFragmentLifecycleRegistry.d(AbstractC1781n.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(y0.y yVar) {
        C5788a.C0553a.c(this, yVar != null ? new C5788a.f(yVar) : null);
    }

    public void setExitSharedElementCallback(y0.y yVar) {
        C5788a.C0553a.d(this, yVar != null ? new C5788a.f(yVar) : null);
    }

    public void startActivityFromFragment(ComponentCallbacksC1759l componentCallbacksC1759l, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            componentCallbacksC1759l.startActivityForResult(intent, i, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(ComponentCallbacksC1759l componentCallbacksC1759l, IntentSender intentSender, int i, Intent intent, int i10, int i11, int i12, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            startIntentSenderForResult(intentSender, i, intent, i10, i11, i12, bundle);
        } else {
            componentCallbacksC1759l.startIntentSenderForResult(intentSender, i, intent, i10, i11, i12, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        C5788a.C0553a.a(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        C5788a.C0553a.b(this);
    }

    public void supportStartPostponedEnterTransition() {
        C5788a.C0553a.e(this);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(ComponentCallbacksC1759l componentCallbacksC1759l, Intent intent, int i) {
        startActivityFromFragment(componentCallbacksC1759l, intent, i, (Bundle) null);
    }

    public ActivityC1762o(int i) {
        super(i);
        this.mFragments = new r(new a());
        this.mFragmentLifecycleRegistry = new C1791y(this);
        this.mStopped = true;
        init();
    }

    @Deprecated
    public void onAttachFragment(ComponentCallbacksC1759l componentCallbacksC1759l) {
    }

    @Override // y0.C5788a.e
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }
}
