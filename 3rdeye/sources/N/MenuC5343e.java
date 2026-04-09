package n;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import m0.C5316i;

/* compiled from: MenuWrapperICS.java */
/* renamed from: n.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC5343e extends AbstractC5340b implements Menu {

    /* renamed from: d, reason: collision with root package name */
    public final E0.a f44188d;

    public MenuC5343e(Context context, E0.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f44188d = aVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return f(this.f44188d.add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f44188d.addIntentOptions(i, i10, i11, componentName, intentArr, intent, i12, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i13 = 0; i13 < length; i13++) {
                menuItemArr[i13] = f(menuItemArr2[i13]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return g(this.f44188d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public final void clear() {
        C5316i c5316i = (C5316i) this.f44175b;
        if (c5316i != null) {
            c5316i.clear();
        }
        C5316i c5316i2 = (C5316i) this.f44176c;
        if (c5316i2 != null) {
            c5316i2.clear();
        }
        this.f44188d.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f44188d.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return f(this.f44188d.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return f(this.f44188d.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f44188d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f44188d.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i10) {
        return this.f44188d.performIdentifierAction(i, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i10) {
        return this.f44188d.performShortcut(i, keyEvent, i10);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((C5316i) this.f44175b) != null) {
            int i10 = 0;
            while (true) {
                C5316i c5316i = (C5316i) this.f44175b;
                if (i10 >= c5316i.f44030d) {
                    break;
                }
                if (((E0.b) c5316i.g(i10)).getGroupId() == i) {
                    ((C5316i) this.f44175b).j(i10);
                    i10--;
                }
                i10++;
            }
        }
        this.f44188d.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((C5316i) this.f44175b) != null) {
            int i10 = 0;
            while (true) {
                C5316i c5316i = (C5316i) this.f44175b;
                if (i10 >= c5316i.f44030d) {
                    break;
                }
                if (((E0.b) c5316i.g(i10)).getItemId() == i) {
                    ((C5316i) this.f44175b).j(i10);
                    break;
                }
                i10++;
            }
        }
        this.f44188d.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z10, boolean z11) {
        this.f44188d.setGroupCheckable(i, z10, z11);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z10) {
        this.f44188d.setGroupEnabled(i, z10);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z10) {
        this.f44188d.setGroupVisible(i, z10);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f44188d.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f44188d.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return f(this.f44188d.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return g(this.f44188d.addSubMenu(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i10, int i11, CharSequence charSequence) {
        return f(this.f44188d.add(i, i10, i11, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i10, int i11, CharSequence charSequence) {
        return g(this.f44188d.addSubMenu(i, i10, i11, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i10, int i11, int i12) {
        return f(this.f44188d.add(i, i10, i11, i12));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i10, int i11, int i12) {
        return g(this.f44188d.addSubMenu(i, i10, i11, i12));
    }
}
