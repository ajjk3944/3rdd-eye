package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import q.a;

/* loaded from: classes.dex */
public class c extends ComponentActivity implements a.b, a.d {

    /* renamed from: k, reason: collision with root package name */
    boolean f1598k;

    /* renamed from: l, reason: collision with root package name */
    boolean f1599l;

    /* renamed from: n, reason: collision with root package name */
    boolean f1601n;

    /* renamed from: o, reason: collision with root package name */
    boolean f1602o;

    /* renamed from: p, reason: collision with root package name */
    boolean f1603p;

    /* renamed from: q, reason: collision with root package name */
    int f1604q;

    /* renamed from: r, reason: collision with root package name */
    k.h<String> f1605r;

    /* renamed from: i, reason: collision with root package name */
    final e f1596i = e.b(new a());

    /* renamed from: j, reason: collision with root package name */
    final androidx.lifecycle.h f1597j = new androidx.lifecycle.h(this);

    /* renamed from: m, reason: collision with root package name */
    boolean f1600m = true;

    class a extends g<c> implements androidx.lifecycle.s, androidx.activity.c {
        public a() {
            super(c.this);
        }

        @Override // androidx.lifecycle.g
        public androidx.lifecycle.d a() {
            return c.this.f1597j;
        }

        @Override // androidx.activity.c
        public OnBackPressedDispatcher c() {
            return c.this.c();
        }

        @Override // androidx.lifecycle.s
        public androidx.lifecycle.r e() {
            return c.this.e();
        }

        @Override // androidx.fragment.app.g, androidx.fragment.app.d
        public View f(int i2) {
            return c.this.findViewById(i2);
        }

        @Override // androidx.fragment.app.g, androidx.fragment.app.d
        public boolean g() {
            Window window = c.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.g
        public void k(Fragment fragment) {
            c.this.s(fragment);
        }

        @Override // androidx.fragment.app.g
        public void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            c.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.g
        public LayoutInflater n() {
            return c.this.getLayoutInflater().cloneInContext(c.this);
        }

        @Override // androidx.fragment.app.g
        public int o() {
            Window window = c.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.g
        public boolean p() {
            return c.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.g
        public boolean q(Fragment fragment) {
            return !c.this.isFinishing();
        }

        @Override // androidx.fragment.app.g
        public void r() {
            c.this.v();
        }

        @Override // androidx.fragment.app.g
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public c m() {
            return c.this;
        }
    }

    static void n(int i2) {
        if ((i2 & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    private void q() {
        while (r(p(), d.b.CREATED)) {
        }
    }

    private static boolean r(h hVar, d.b bVar) {
        boolean zR = false;
        for (Fragment fragment : hVar.e()) {
            if (fragment != null) {
                if (fragment.a().b().a(d.b.STARTED)) {
                    fragment.T.p(bVar);
                    zR = true;
                }
                if (fragment.v() != null) {
                    zR |= r(fragment.o(), bVar);
                }
            }
        }
        return zR;
    }

    @Override // q.a.d
    public final void b(int i2) {
        if (this.f1601n || i2 == -1) {
            return;
        }
        n(i2);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f1598k);
        printWriter.print(" mResumed=");
        printWriter.print(this.f1599l);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1600m);
        if (getApplication() != null) {
            androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f1596i.u().b(str, fileDescriptor, printWriter, strArr);
    }

    final View o(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1596i.w(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        this.f1596i.v();
        int i4 = i2 >> 16;
        if (i4 == 0) {
            a.c cVarF = q.a.f();
            if (cVarF == null || !cVarF.b(this, i2, i3, intent)) {
                super.onActivityResult(i2, i3, intent);
                return;
            }
            return;
        }
        int i5 = i4 - 1;
        String strE = this.f1605r.e(i5);
        this.f1605r.i(i5);
        if (strE == null) {
            Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            return;
        }
        Fragment fragmentT = this.f1596i.t(strE);
        if (fragmentT != null) {
            fragmentT.V(i2 & 65535, i3, intent);
            return;
        }
        Log.w("FragmentActivity", "Activity result no fragment exists for who: " + strE);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1596i.v();
        this.f1596i.d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, q.d, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f1596i.a(null);
        if (bundle != null) {
            this.f1596i.x(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f1604q = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f1605r = new k.h<>(intArray.length);
                    for (int i2 = 0; i2 < intArray.length; i2++) {
                        this.f1605r.h(intArray[i2], stringArray[i2]);
                    }
                }
            }
        }
        if (this.f1605r == null) {
            this.f1605r = new k.h<>();
            this.f1604q = 0;
        }
        super.onCreate(bundle);
        this.f1597j.i(d.a.ON_CREATE);
        this.f1596i.f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i2, Menu menu) {
        return i2 == 0 ? super.onCreatePanelMenu(i2, menu) | this.f1596i.g(menu, getMenuInflater()) : super.onCreatePanelMenu(i2, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewO = o(view, str, context, attributeSet);
        return viewO == null ? super.onCreateView(view, str, context, attributeSet) : viewO;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewO = o(null, str, context, attributeSet);
        return viewO == null ? super.onCreateView(str, context, attributeSet) : viewO;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f1596i.h();
        this.f1597j.i(d.a.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f1596i.i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.f1596i.k(menuItem);
        }
        if (i2 != 6) {
            return false;
        }
        return this.f1596i.e(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z2) {
        this.f1596i.j(z2);
    }

    @Override // android.app.Activity
    protected void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f1596i.v();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.f1596i.l(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f1599l = false;
        this.f1596i.m();
        this.f1597j.i(d.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z2) {
        this.f1596i.n(z2);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        u();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i2, View view, Menu menu) {
        return i2 == 0 ? t(view, menu) | this.f1596i.o(menu) : super.onPreparePanel(i2, view, menu);
    }

    @Override // android.app.Activity, q.a.b
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.f1596i.v();
        int i3 = (i2 >> 16) & 65535;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String strE = this.f1605r.e(i4);
            this.f1605r.i(i4);
            if (strE == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment fragmentT = this.f1596i.t(strE);
            if (fragmentT != null) {
                fragmentT.u0(i2 & 65535, strArr, iArr);
                return;
            }
            Log.w("FragmentActivity", "Activity result no fragment exists for who: " + strE);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f1599l = true;
        this.f1596i.v();
        this.f1596i.s();
    }

    @Override // androidx.activity.ComponentActivity, q.d, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        q();
        this.f1597j.i(d.a.ON_STOP);
        Parcelable parcelableY = this.f1596i.y();
        if (parcelableY != null) {
            bundle.putParcelable("android:support:fragments", parcelableY);
        }
        if (this.f1605r.j() > 0) {
            bundle.putInt("android:support:next_request_index", this.f1604q);
            int[] iArr = new int[this.f1605r.j()];
            String[] strArr = new String[this.f1605r.j()];
            for (int i2 = 0; i2 < this.f1605r.j(); i2++) {
                iArr[i2] = this.f1605r.g(i2);
                strArr[i2] = this.f1605r.k(i2);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f1600m = false;
        if (!this.f1598k) {
            this.f1598k = true;
            this.f1596i.c();
        }
        this.f1596i.v();
        this.f1596i.s();
        this.f1597j.i(d.a.ON_START);
        this.f1596i.q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f1596i.v();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f1600m = true;
        q();
        this.f1596i.r();
        this.f1597j.i(d.a.ON_STOP);
    }

    public h p() {
        return this.f1596i.u();
    }

    public void s(Fragment fragment) {
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        if (!this.f1603p && i2 != -1) {
            n(i2);
        }
        super.startActivityForResult(intent, i2);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (!this.f1603p && i2 != -1) {
            n(i2);
        }
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) throws IntentSender.SendIntentException {
        if (!this.f1602o && i2 != -1) {
            n(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        if (!this.f1602o && i2 != -1) {
            n(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    @Deprecated
    protected boolean t(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    protected void u() {
        this.f1597j.i(d.a.ON_RESUME);
        this.f1596i.p();
    }

    @Deprecated
    public void v() {
        invalidateOptionsMenu();
    }
}
