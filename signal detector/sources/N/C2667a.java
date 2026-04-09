package n;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2667a implements L.a {

    /* renamed from: C, reason: collision with root package name */
    public boolean f22009C;

    /* renamed from: D, reason: collision with root package name */
    public int f22010D;

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f22011a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f22012b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f22013c;

    /* renamed from: d, reason: collision with root package name */
    public char f22014d;

    /* renamed from: e, reason: collision with root package name */
    public int f22015e;

    /* renamed from: f, reason: collision with root package name */
    public char f22016f;

    /* renamed from: g, reason: collision with root package name */
    public int f22017g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f22018h;
    public Context i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f22019j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f22020k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f22021l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f22022m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f22023n;

    @Override // L.a
    public final n a() {
        return null;
    }

    @Override // L.a
    public final L.a b(n nVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f22018h;
        if (drawable != null) {
            if (this.f22023n || this.f22009C) {
                this.f22018h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f22018h = drawableMutate;
                if (this.f22023n) {
                    drawableMutate.setTintList(this.f22021l);
                }
                if (this.f22009C) {
                    this.f22018h.setTintMode(this.f22022m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // L.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f22017g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f22016f;
    }

    @Override // L.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f22019j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f22018h;
    }

    @Override // L.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f22021l;
    }

    @Override // L.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f22022m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f22013c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // L.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f22015e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f22014d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f22011a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f22012b;
        return charSequence != null ? charSequence : this.f22011a;
    }

    @Override // L.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f22020k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f22010D & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f22010D & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f22010D & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f22010D & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6) {
        this.f22016f = Character.toLowerCase(c6);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z6) {
        this.f22010D = (z6 ? 1 : 0) | (this.f22010D & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z6) {
        this.f22010D = (z6 ? 2 : 0) | (this.f22010D & (-3));
        return this;
    }

    @Override // L.a, android.view.MenuItem
    public final L.a setContentDescription(CharSequence charSequence) {
        this.f22019j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z6) {
        this.f22010D = (z6 ? 16 : 0) | (this.f22010D & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f22018h = drawable;
        c();
        return this;
    }

    @Override // L.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f22021l = colorStateList;
        this.f22023n = true;
        c();
        return this;
    }

    @Override // L.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f22022m = mode;
        this.f22009C = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f22013c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6) {
        this.f22014d = c6;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c7) {
        this.f22014d = c6;
        this.f22016f = Character.toLowerCase(c7);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f22011a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f22012b = charSequence;
        return this;
    }

    @Override // L.a, android.view.MenuItem
    public final L.a setTooltipText(CharSequence charSequence) {
        this.f22020k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z6) {
        this.f22010D = (this.f22010D & 8) | (z6 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // L.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6, int i) {
        this.f22016f = Character.toLowerCase(c6);
        this.f22017g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f22019j = charSequence;
        return this;
    }

    @Override // L.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6, int i) {
        this.f22014d = c6;
        this.f22015e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f22011a = this.i.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f22020k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f22018h = this.i.getDrawable(i);
        c();
        return this;
    }

    @Override // L.a, android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c7, int i, int i3) {
        this.f22014d = c6;
        this.f22015e = KeyEvent.normalizeMetaState(i);
        this.f22016f = Character.toLowerCase(c7);
        this.f22017g = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }
}
