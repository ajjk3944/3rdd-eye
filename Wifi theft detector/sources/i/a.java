package i;

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
import androidx.core.content.ContextCompat;

/* loaded from: classes.dex */
public class a implements l0.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f21488a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21489b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21490c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f21491d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f21492e;

    /* renamed from: f, reason: collision with root package name */
    public Intent f21493f;

    /* renamed from: g, reason: collision with root package name */
    public char f21494g;

    /* renamed from: i, reason: collision with root package name */
    public char f21496i;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f21498k;

    /* renamed from: l, reason: collision with root package name */
    public Context f21499l;

    /* renamed from: m, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f21500m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f21501n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f21502o;

    /* renamed from: h, reason: collision with root package name */
    public int f21495h = 4096;

    /* renamed from: j, reason: collision with root package name */
    public int f21497j = 4096;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f21503p = null;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f21504q = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f21505r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f21506s = false;

    /* renamed from: t, reason: collision with root package name */
    public int f21507t = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f21499l = context;
        this.f21488a = i11;
        this.f21489b = i10;
        this.f21490c = i13;
        this.f21491d = charSequence;
    }

    @Override // l0.b
    public androidx.core.view.b a() {
        return null;
    }

    @Override // l0.b
    public l0.b b(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f21498k;
        if (drawable != null) {
            if (this.f21505r || this.f21506s) {
                Drawable drawableR = k0.a.r(drawable);
                this.f21498k = drawableR;
                Drawable drawableMutate = drawableR.mutate();
                this.f21498k = drawableMutate;
                if (this.f21505r) {
                    k0.a.o(drawableMutate, this.f21503p);
                }
                if (this.f21506s) {
                    k0.a.p(this.f21498k, this.f21504q);
                }
            }
        }
    }

    @Override // l0.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // l0.b, android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public l0.b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // l0.b, android.view.MenuItem
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public l0.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // l0.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // l0.b, android.view.MenuItem
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public l0.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // l0.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // l0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f21497j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f21496i;
    }

    @Override // l0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f21501n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f21489b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f21498k;
    }

    @Override // l0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f21503p;
    }

    @Override // l0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f21504q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f21493f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f21488a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // l0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f21495h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f21494g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f21490c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f21491d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f21492e;
        return charSequence != null ? charSequence : this.f21491d;
    }

    @Override // l0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f21502o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // l0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f21507t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f21507t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f21507t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f21507t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f21496i = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f21507t = (z10 ? 1 : 0) | (this.f21507t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f21507t = (z10 ? 2 : 0) | (this.f21507t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f21507t = (z10 ? 16 : 0) | (this.f21507t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f21498k = drawable;
        c();
        return this;
    }

    @Override // l0.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f21503p = colorStateList;
        this.f21505r = true;
        c();
        return this;
    }

    @Override // l0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f21504q = mode;
        this.f21506s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f21493f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f21494g = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f21500m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f21494g = c10;
        this.f21496i = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f21491d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f21492e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f21507t = (this.f21507t & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // l0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f21496i = Character.toLowerCase(c10);
        this.f21497j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public l0.b setContentDescription(CharSequence charSequence) {
        this.f21501n = charSequence;
        return this;
    }

    @Override // l0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f21494g = c10;
        this.f21495h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f21491d = this.f21499l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public l0.b setTooltipText(CharSequence charSequence) {
        this.f21502o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f21498k = ContextCompat.getDrawable(this.f21499l, i10);
        c();
        return this;
    }

    @Override // l0.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f21494g = c10;
        this.f21495h = KeyEvent.normalizeMetaState(i10);
        this.f21496i = Character.toLowerCase(c11);
        this.f21497j = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // l0.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }
}
