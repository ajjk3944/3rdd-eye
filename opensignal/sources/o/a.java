package o;

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

/* loaded from: classes.dex */
public final class a implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f18562a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f18563b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f18564c;

    /* renamed from: d, reason: collision with root package name */
    public char f18565d;

    /* renamed from: e, reason: collision with root package name */
    public int f18566e;

    /* renamed from: f, reason: collision with root package name */
    public char f18567f;

    /* renamed from: g, reason: collision with root package name */
    public int f18568g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f18569h;

    /* renamed from: i, reason: collision with root package name */
    public Context f18570i;
    public CharSequence j;
    public CharSequence k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f18571l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f18572m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18573n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f18574o;

    /* renamed from: p, reason: collision with root package name */
    public int f18575p;

    @Override // m3.a
    public final p a() {
        return null;
    }

    @Override // m3.a
    public final m3.a b(p pVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f18569h;
        if (drawable != null) {
            if (this.f18573n || this.f18574o) {
                this.f18569h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f18569h = drawableMutate;
                if (this.f18573n) {
                    drawableMutate.setTintList(this.f18571l);
                }
                if (this.f18574o) {
                    this.f18569h.setTintMode(this.f18572m);
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

    @Override // m3.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f18568g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f18567f;
    }

    @Override // m3.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f18569h;
    }

    @Override // m3.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f18571l;
    }

    @Override // m3.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f18572m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f18564c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // m3.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f18566e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f18565d;
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
        return this.f18562a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f18563b;
        return charSequence != null ? charSequence : this.f18562a;
    }

    @Override // m3.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.k;
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
        return (this.f18575p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f18575p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f18575p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f18575p & 8) == 0;
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
    public final MenuItem setAlphabeticShortcut(char c4) {
        this.f18567f = Character.toLowerCase(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        this.f18575p = (z10 ? 1 : 0) | (this.f18575p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        this.f18575p = (z10 ? 2 : 0) | (this.f18575p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        this.f18575p = (z10 ? 16 : 0) | (this.f18575p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f18569h = drawable;
        c();
        return this;
    }

    @Override // m3.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f18571l = colorStateList;
        this.f18573n = true;
        c();
        return this;
    }

    @Override // m3.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f18572m = mode;
        this.f18574o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f18564c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4) {
        this.f18565d = c4;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c10) {
        this.f18565d = c4;
        this.f18567f = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f18562a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f18563b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        this.f18575p = (this.f18575p & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // m3.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4, int i10) {
        this.f18567f = Character.toLowerCase(c4);
        this.f18568g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // m3.a, android.view.MenuItem
    public final m3.a setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // m3.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4, int i10) {
        this.f18565d = c4;
        this.f18566e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        this.f18562a = this.f18570i.getResources().getString(i10);
        return this;
    }

    @Override // m3.a, android.view.MenuItem
    public final m3.a setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f18569h = this.f18570i.getDrawable(i10);
        c();
        return this;
    }

    @Override // m3.a, android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c10, int i10, int i11) {
        this.f18565d = c4;
        this.f18566e = KeyEvent.normalizeMetaState(i10);
        this.f18567f = Character.toLowerCase(c10);
        this.f18568g = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        return this;
    }
}
