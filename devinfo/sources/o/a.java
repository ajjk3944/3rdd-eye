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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements y3.a {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f30159a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f30160b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f30161c;

    /* renamed from: d, reason: collision with root package name */
    public char f30162d;

    /* renamed from: e, reason: collision with root package name */
    public int f30163e;

    /* renamed from: f, reason: collision with root package name */
    public char f30164f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f30165h;

    /* renamed from: i, reason: collision with root package name */
    public Context f30166i;
    public CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f30167k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f30168l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f30169m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f30170n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f30171o;

    /* renamed from: p, reason: collision with root package name */
    public int f30172p;

    @Override // y3.a
    public final p a() {
        return null;
    }

    @Override // y3.a
    public final y3.a b(p pVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f30165h;
        if (drawable != null) {
            if (this.f30170n || this.f30171o) {
                this.f30165h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f30165h = drawableMutate;
                if (this.f30170n) {
                    drawableMutate.setTintList(this.f30168l);
                }
                if (this.f30171o) {
                    this.f30165h.setTintMode(this.f30169m);
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

    @Override // y3.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f30164f;
    }

    @Override // y3.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f30165h;
    }

    @Override // y3.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f30168l;
    }

    @Override // y3.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f30169m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f30161c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // y3.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f30163e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f30162d;
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
        return this.f30159a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f30160b;
        return charSequence != null ? charSequence : this.f30159a;
    }

    @Override // y3.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f30167k;
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
        return (this.f30172p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f30172p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f30172p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f30172p & 8) == 0;
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
    public final MenuItem setAlphabeticShortcut(char c9) {
        this.f30164f = Character.toLowerCase(c9);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z3) {
        this.f30172p = (z3 ? 1 : 0) | (this.f30172p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z3) {
        this.f30172p = (z3 ? 2 : 0) | (this.f30172p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z3) {
        this.f30172p = (z3 ? 16 : 0) | (this.f30172p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f30165h = drawable;
        c();
        return this;
    }

    @Override // y3.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f30168l = colorStateList;
        this.f30170n = true;
        c();
        return this;
    }

    @Override // y3.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f30169m = mode;
        this.f30171o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f30161c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c9) {
        this.f30162d = c9;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c9, char c10) {
        this.f30162d = c9;
        this.f30164f = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f30159a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f30160b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f30167k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z3) {
        this.f30172p = (this.f30172p & 8) | (z3 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // y3.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c9, int i4) {
        this.f30164f = Character.toLowerCase(c9);
        this.g = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    @Override // y3.a, android.view.MenuItem
    public final y3.a setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // y3.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c9, int i4) {
        this.f30162d = c9;
        this.f30163e = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i4) {
        this.f30159a = this.f30166i.getResources().getString(i4);
        return this;
    }

    @Override // y3.a, android.view.MenuItem
    public final y3.a setTooltipText(CharSequence charSequence) {
        this.f30167k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i4) {
        this.f30165h = this.f30166i.getDrawable(i4);
        c();
        return this;
    }

    @Override // y3.a, android.view.MenuItem
    public final MenuItem setShortcut(char c9, char c10, int i4, int i10) {
        this.f30162d = c9;
        this.f30163e = KeyEvent.normalizeMetaState(i4);
        this.f30164f = Character.toLowerCase(c10);
        this.g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i4) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i4) {
        return this;
    }
}
