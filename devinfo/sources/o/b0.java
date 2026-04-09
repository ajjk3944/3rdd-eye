package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import x.n0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class b0 extends androidx.recyclerview.widget.d0 implements Menu {

    /* renamed from: c, reason: collision with root package name */
    public final m f30174c;

    public b0(Context context, m mVar) {
        super(context);
        if (mVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f30174c = mVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return g(this.f30174c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i4, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f30174c.addIntentOptions(i4, i10, i11, componentName, intentArr, intent, i12, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i13 = 0; i13 < length; i13++) {
                menuItemArr[i13] = g(menuItemArr2[i13]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f30174c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        n0 n0Var = (n0) this.f1326b;
        if (n0Var != null) {
            n0Var.clear();
        }
        this.f30174c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f30174c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i4) {
        return g(this.f30174c.findItem(i4));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i4) {
        return g(this.f30174c.getItem(i4));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f30174c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        return this.f30174c.isShortcutKey(i4, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i4, int i10) {
        return this.f30174c.performIdentifierAction(i4, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i4, KeyEvent keyEvent, int i10) {
        return this.f30174c.performShortcut(i4, keyEvent, i10);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i4) {
        if (((n0) this.f1326b) != null) {
            int i10 = 0;
            while (true) {
                n0 n0Var = (n0) this.f1326b;
                if (i10 >= n0Var.f36920c) {
                    break;
                }
                if (((y3.a) n0Var.f(i10)).getGroupId() == i4) {
                    ((n0) this.f1326b).h(i10);
                    i10--;
                }
                i10++;
            }
        }
        this.f30174c.removeGroup(i4);
    }

    @Override // android.view.Menu
    public final void removeItem(int i4) {
        if (((n0) this.f1326b) != null) {
            int i10 = 0;
            while (true) {
                n0 n0Var = (n0) this.f1326b;
                if (i10 >= n0Var.f36920c) {
                    break;
                }
                if (((y3.a) n0Var.f(i10)).getItemId() == i4) {
                    ((n0) this.f1326b).h(i10);
                    break;
                }
                i10++;
            }
        }
        this.f30174c.removeItem(i4);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i4, boolean z3, boolean z10) {
        this.f30174c.setGroupCheckable(i4, z3, z10);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i4, boolean z3) {
        this.f30174c.setGroupEnabled(i4, z3);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i4, boolean z3) {
        this.f30174c.setGroupVisible(i4, z3);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z3) {
        this.f30174c.setQwertyMode(z3);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f30174c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4) {
        return this.f30174c.addSubMenu(i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4) {
        return g(this.f30174c.add(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4, int i10, int i11, CharSequence charSequence) {
        return this.f30174c.addSubMenu(i4, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i10, int i11, CharSequence charSequence) {
        return g(this.f30174c.a(i4, i10, i11, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4, int i10, int i11, int i12) {
        return this.f30174c.addSubMenu(i4, i10, i11, i12);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i10, int i11, int i12) {
        return g(this.f30174c.add(i4, i10, i11, i12));
    }
}
