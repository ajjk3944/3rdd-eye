package n;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import u.C2940i;

/* loaded from: classes.dex */
public class z extends B3.u implements Menu {

    /* renamed from: c, reason: collision with root package name */
    public final MenuC2677k f22141c;

    public z(Context context, MenuC2677k menuC2677k) {
        super(context);
        if (menuC2677k == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f22141c = menuC2677k;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return j(this.f22141c.a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i3, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f22141c.addIntentOptions(i, i3, i6, componentName, intentArr, intent, i7, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i8 = 0; i8 < length; i8++) {
                menuItemArr[i8] = j(menuItemArr2[i8]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f22141c.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        C2940i c2940i = (C2940i) this.f663b;
        if (c2940i != null) {
            c2940i.clear();
        }
        this.f22141c.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f22141c.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return j(this.f22141c.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return j(this.f22141c.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f22141c.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f22141c.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i3) {
        return this.f22141c.performIdentifierAction(i, i3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i3) {
        return this.f22141c.performShortcut(i, keyEvent, i3);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((C2940i) this.f663b) != null) {
            int i3 = 0;
            while (true) {
                C2940i c2940i = (C2940i) this.f663b;
                if (i3 >= c2940i.f23705c) {
                    break;
                }
                if (((L.a) c2940i.f(i3)).getGroupId() == i) {
                    ((C2940i) this.f663b).h(i3);
                    i3--;
                }
                i3++;
            }
        }
        this.f22141c.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((C2940i) this.f663b) != null) {
            int i3 = 0;
            while (true) {
                C2940i c2940i = (C2940i) this.f663b;
                if (i3 >= c2940i.f23705c) {
                    break;
                }
                if (((L.a) c2940i.f(i3)).getItemId() == i) {
                    ((C2940i) this.f663b).h(i3);
                    break;
                }
                i3++;
            }
        }
        this.f22141c.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z6, boolean z7) {
        this.f22141c.setGroupCheckable(i, z6, z7);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z6) {
        this.f22141c.setGroupEnabled(i, z6);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z6) {
        this.f22141c.setGroupVisible(i, z6);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z6) {
        this.f22141c.setQwertyMode(z6);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f22141c.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.f22141c.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return j(this.f22141c.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i3, int i6, CharSequence charSequence) {
        return this.f22141c.addSubMenu(i, i3, i6, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i3, int i6, CharSequence charSequence) {
        return j(this.f22141c.a(i, i3, i6, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i3, int i6, int i7) {
        return this.f22141c.addSubMenu(i, i3, i6, i7);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i3, int i6, int i7) {
        return j(this.f22141c.add(i, i3, i6, i7));
    }
}
