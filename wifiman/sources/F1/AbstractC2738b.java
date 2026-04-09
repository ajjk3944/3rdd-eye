package F1;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: F1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2738b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5702a;

    /* renamed from: b, reason: collision with root package name */
    private a f5703b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0235b f5704c;

    /* renamed from: F1.b$a */
    public interface a {
    }

    /* renamed from: F1.b$b, reason: collision with other inner class name */
    public interface InterfaceC0235b {
        void onActionProviderVisibilityChanged(boolean z10);
    }

    public AbstractC2738b(Context context) {
        this.f5702a = context;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract View c(MenuItem menuItem);

    public abstract boolean d();

    public abstract void e(SubMenu subMenu);

    public abstract boolean f();

    public void g() {
        this.f5704c = null;
        this.f5703b = null;
    }

    public void h(a aVar) {
        this.f5703b = aVar;
    }

    public abstract void i(InterfaceC0235b interfaceC0235b);
}
