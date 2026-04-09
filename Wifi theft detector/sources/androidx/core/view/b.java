package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2707a;

    /* renamed from: b, reason: collision with root package name */
    public a f2708b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0024b f2709c;

    public interface a {
    }

    /* renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    public interface InterfaceC0024b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public b(@NonNull Context context) {
        this.f2707a = context;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.f2709c = null;
        this.f2708b = null;
    }

    public void i(a aVar) {
        this.f2708b = aVar;
    }

    public void j(InterfaceC0024b interfaceC0024b) {
        if (this.f2709c != null && interfaceC0024b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f2709c = interfaceC0024b;
    }
}
