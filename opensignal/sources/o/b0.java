package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import u.i0;

/* loaded from: classes.dex */
public class b0 extends i.x implements Menu {

    /* renamed from: c, reason: collision with root package name */
    public final m f18576c;

    public b0(Context context, m mVar) {
        super(context);
        if (mVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f18576c = mVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return g(this.f18576c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f18576c.addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = g(menuItemArr2[i14]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f18576c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        i0 i0Var = (i0) this.f11120b;
        if (i0Var != null) {
            i0Var.clear();
        }
        this.f18576c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f18576c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        return g(this.f18576c.findItem(i10));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return g(this.f18576c.getItem(i10));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f18576c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return this.f18576c.isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return this.f18576c.performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return this.f18576c.performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        if (((i0) this.f11120b) != null) {
            int i11 = 0;
            while (true) {
                i0 i0Var = (i0) this.f11120b;
                if (i11 >= i0Var.f23077g) {
                    break;
                }
                if (((m3.a) i0Var.f(i11)).getGroupId() == i10) {
                    ((i0) this.f11120b).g(i11);
                    i11--;
                }
                i11++;
            }
        }
        this.f18576c.removeGroup(i10);
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        if (((i0) this.f11120b) != null) {
            int i11 = 0;
            while (true) {
                i0 i0Var = (i0) this.f11120b;
                if (i11 >= i0Var.f23077g) {
                    break;
                }
                if (((m3.a) i0Var.f(i11)).getItemId() == i10) {
                    ((i0) this.f11120b).g(i11);
                    break;
                }
                i11++;
            }
        }
        this.f18576c.removeItem(i10);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        this.f18576c.setGroupCheckable(i10, z10, z11);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        this.f18576c.setGroupEnabled(i10, z10);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        this.f18576c.setGroupVisible(i10, z10);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f18576c.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f18576c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return this.f18576c.addSubMenu(i10);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return g(this.f18576c.add(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return this.f18576c.addSubMenu(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return g(this.f18576c.a(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return this.f18576c.addSubMenu(i10, i11, i12, i13);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return g(this.f18576c.add(i10, i11, i12, i13));
    }
}
