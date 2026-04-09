package L0;

import android.util.Log;
import android.view.View;
import androidx.appcompat.view.menu.h;

/* compiled from: ActionProvider.java */
/* renamed from: L0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0771b {

    /* renamed from: a, reason: collision with root package name */
    public h.a f3886a;

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(androidx.appcompat.view.menu.h hVar) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public void h(h.a aVar) {
        if (this.f3886a != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f3886a = aVar;
    }

    public void f(androidx.appcompat.view.menu.m mVar) {
    }
}
