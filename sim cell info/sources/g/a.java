package g;

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
public class a implements v.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f2616a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2617b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2618c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2619d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f2620e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f2621f;

    /* renamed from: g, reason: collision with root package name */
    private Intent f2622g;

    /* renamed from: h, reason: collision with root package name */
    private char f2623h;

    /* renamed from: j, reason: collision with root package name */
    private char f2625j;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f2627l;

    /* renamed from: n, reason: collision with root package name */
    private Context f2629n;

    /* renamed from: o, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f2630o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f2631p;

    /* renamed from: q, reason: collision with root package name */
    private CharSequence f2632q;

    /* renamed from: i, reason: collision with root package name */
    private int f2624i = 4096;

    /* renamed from: k, reason: collision with root package name */
    private int f2626k = 4096;

    /* renamed from: m, reason: collision with root package name */
    private int f2628m = 0;

    /* renamed from: r, reason: collision with root package name */
    private ColorStateList f2633r = null;

    /* renamed from: s, reason: collision with root package name */
    private PorterDuff.Mode f2634s = null;

    /* renamed from: t, reason: collision with root package name */
    private boolean f2635t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f2636u = false;

    /* renamed from: v, reason: collision with root package name */
    private int f2637v = 16;

    public a(Context context, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.f2629n = context;
        this.f2616a = i3;
        this.f2617b = i2;
        this.f2618c = i4;
        this.f2619d = i5;
        this.f2620e = charSequence;
    }

    private void c() {
        Drawable drawable = this.f2627l;
        if (drawable != null) {
            if (this.f2635t || this.f2636u) {
                Drawable drawableP = u.a.p(drawable);
                this.f2627l = drawableP;
                Drawable drawableMutate = drawableP.mutate();
                this.f2627l = drawableMutate;
                if (this.f2635t) {
                    u.a.n(drawableMutate, this.f2633r);
                }
                if (this.f2636u) {
                    u.a.o(this.f2627l, this.f2634s);
                }
            }
        }
    }

    @Override // v.b
    public a0.b a() {
        return null;
    }

    @Override // v.b
    public v.b b(a0.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // v.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // v.b, android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public v.b setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // v.b, android.view.MenuItem
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public v.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // v.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // v.b, android.view.MenuItem
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public v.b setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // v.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // v.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f2626k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f2625j;
    }

    @Override // v.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f2631p;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f2617b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f2627l;
    }

    @Override // v.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f2633r;
    }

    @Override // v.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f2634s;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f2622g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f2616a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // v.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f2624i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f2623h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f2619d;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f2620e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2621f;
        return charSequence != null ? charSequence : this.f2620e;
    }

    @Override // v.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f2632q;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // v.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f2637v & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f2637v & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f2637v & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f2637v & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f2625j = Character.toLowerCase(c2);
        return this;
    }

    @Override // v.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f2625j = Character.toLowerCase(c2);
        this.f2626k = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z2) {
        this.f2637v = (z2 ? 1 : 0) | (this.f2637v & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z2) {
        this.f2637v = (z2 ? 2 : 0) | (this.f2637v & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public v.b setContentDescription(CharSequence charSequence) {
        this.f2631p = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z2) {
        this.f2637v = (z2 ? 16 : 0) | (this.f2637v & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f2628m = i2;
        this.f2627l = r.a.c(this.f2629n, i2);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f2627l = drawable;
        this.f2628m = 0;
        c();
        return this;
    }

    @Override // v.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2633r = colorStateList;
        this.f2635t = true;
        c();
        return this;
    }

    @Override // v.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2634s = mode;
        this.f2636u = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f2622g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.f2623h = c2;
        return this;
    }

    @Override // v.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f2623h = c2;
        this.f2624i = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2630o = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f2623h = c2;
        this.f2625j = Character.toLowerCase(c3);
        return this;
    }

    @Override // v.b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f2623h = c2;
        this.f2624i = KeyEvent.normalizeMetaState(i2);
        this.f2625j = Character.toLowerCase(c3);
        this.f2626k = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // v.b, android.view.MenuItem
    public void setShowAsAction(int i2) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.f2620e = this.f2629n.getResources().getString(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f2620e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2621f = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public v.b setTooltipText(CharSequence charSequence) {
        this.f2632q = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z2) {
        this.f2637v = (this.f2637v & 8) | (z2 ? 0 : 8);
        return this;
    }
}
