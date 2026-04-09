package n;

import D0.a;
import L0.AbstractC0771b;
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
import z0.C5848a;

/* compiled from: ActionMenuItem.java */
/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5339a implements E0.b {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f44159a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f44160b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f44161c;

    /* renamed from: d, reason: collision with root package name */
    public char f44162d;

    /* renamed from: e, reason: collision with root package name */
    public int f44163e;

    /* renamed from: f, reason: collision with root package name */
    public char f44164f;

    /* renamed from: g, reason: collision with root package name */
    public int f44165g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f44166h;
    public Context i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f44167j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f44168k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f44169l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f44170m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f44171n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f44172o;

    /* renamed from: p, reason: collision with root package name */
    public int f44173p;

    @Override // E0.b
    public final E0.b a(AbstractC0771b abstractC0771b) {
        throw new UnsupportedOperationException();
    }

    @Override // E0.b
    public final AbstractC0771b b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f44166h;
        if (drawable != null) {
            if (this.f44171n || this.f44172o) {
                this.f44166h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f44166h = drawableMutate;
                if (this.f44171n) {
                    a.C0009a.h(drawableMutate, this.f44169l);
                }
                if (this.f44172o) {
                    a.C0009a.i(this.f44166h, this.f44170m);
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

    @Override // E0.b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f44165g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f44164f;
    }

    @Override // E0.b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f44167j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f44166h;
    }

    @Override // E0.b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f44169l;
    }

    @Override // E0.b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f44170m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f44161c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // E0.b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f44163e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f44162d;
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
        return this.f44159a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f44160b;
        return charSequence != null ? charSequence : this.f44159a;
    }

    @Override // E0.b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f44168k;
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
        return (this.f44173p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f44173p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f44173p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f44173p & 8) == 0;
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
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f44164f = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        this.f44173p = (z10 ? 1 : 0) | (this.f44173p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        this.f44173p = (z10 ? 2 : 0) | (this.f44173p & (-3));
        return this;
    }

    @Override // E0.b, android.view.MenuItem
    public final E0.b setContentDescription(CharSequence charSequence) {
        this.f44167j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        this.f44173p = (z10 ? 16 : 0) | (this.f44173p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f44166h = drawable;
        c();
        return this;
    }

    @Override // E0.b, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f44169l = colorStateList;
        this.f44171n = true;
        c();
        return this;
    }

    @Override // E0.b, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f44170m = mode;
        this.f44172o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f44161c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.f44162d = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f44162d = c10;
        this.f44164f = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f44159a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f44160b = charSequence;
        return this;
    }

    @Override // E0.b, android.view.MenuItem
    public final E0.b setTooltipText(CharSequence charSequence) {
        this.f44168k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        this.f44173p = (this.f44173p & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // E0.b, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i) {
        this.f44164f = Character.toLowerCase(c10);
        this.f44165g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f44167j = charSequence;
        return this;
    }

    @Override // E0.b, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i) {
        this.f44162d = c10;
        this.f44163e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f44159a = this.i.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f44168k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f44166h = C5848a.getDrawable(this.i, i);
        c();
        return this;
    }

    @Override // E0.b, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i, int i10) {
        this.f44162d = c10;
        this.f44163e = KeyEvent.normalizeMetaState(i);
        this.f44164f = Character.toLowerCase(c11);
        this.f44165g = KeyEvent.normalizeMetaState(i10);
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
