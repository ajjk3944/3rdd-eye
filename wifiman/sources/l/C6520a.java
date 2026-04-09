package l;

import F1.AbstractC2738b;
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
import t1.AbstractC8021a;
import x1.AbstractC8416a;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6520a implements y1.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f52295a;

    /* renamed from: b, reason: collision with root package name */
    private final int f52296b;

    /* renamed from: c, reason: collision with root package name */
    private final int f52297c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f52298d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f52299e;

    /* renamed from: f, reason: collision with root package name */
    private Intent f52300f;

    /* renamed from: g, reason: collision with root package name */
    private char f52301g;

    /* renamed from: i, reason: collision with root package name */
    private char f52303i;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f52305k;

    /* renamed from: l, reason: collision with root package name */
    private Context f52306l;

    /* renamed from: m, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f52307m;

    /* renamed from: n, reason: collision with root package name */
    private CharSequence f52308n;

    /* renamed from: o, reason: collision with root package name */
    private CharSequence f52309o;

    /* renamed from: h, reason: collision with root package name */
    private int f52302h = 4096;

    /* renamed from: j, reason: collision with root package name */
    private int f52304j = 4096;

    /* renamed from: p, reason: collision with root package name */
    private ColorStateList f52310p = null;

    /* renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f52311q = null;

    /* renamed from: r, reason: collision with root package name */
    private boolean f52312r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f52313s = false;

    /* renamed from: t, reason: collision with root package name */
    private int f52314t = 16;

    public C6520a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f52306l = context;
        this.f52295a = i11;
        this.f52296b = i10;
        this.f52297c = i13;
        this.f52298d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f52305k;
        if (drawable != null) {
            if (this.f52312r || this.f52313s) {
                Drawable drawableR = AbstractC8416a.r(drawable);
                this.f52305k = drawableR;
                Drawable drawableMutate = drawableR.mutate();
                this.f52305k = drawableMutate;
                if (this.f52312r) {
                    AbstractC8416a.o(drawableMutate, this.f52310p);
                }
                if (this.f52313s) {
                    AbstractC8416a.p(this.f52305k, this.f52311q);
                }
            }
        }
    }

    @Override // y1.b
    public y1.b a(AbstractC2738b abstractC2738b) {
        throw new UnsupportedOperationException();
    }

    @Override // y1.b
    public AbstractC2738b b() {
        return null;
    }

    @Override // y1.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // y1.b, android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public y1.b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // y1.b, android.view.MenuItem
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public y1.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // y1.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // y1.b, android.view.MenuItem
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public y1.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // y1.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // y1.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f52304j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f52303i;
    }

    @Override // y1.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f52308n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f52296b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f52305k;
    }

    @Override // y1.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f52310p;
    }

    @Override // y1.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f52311q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f52300f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f52295a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // y1.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f52302h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f52301g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f52297c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f52298d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f52299e;
        return charSequence != null ? charSequence : this.f52298d;
    }

    @Override // y1.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f52309o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // y1.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f52314t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f52314t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f52314t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f52314t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f52303i = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f52314t = (z10 ? 1 : 0) | (this.f52314t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f52314t = (z10 ? 2 : 0) | (this.f52314t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f52314t = (z10 ? 16 : 0) | (this.f52314t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f52305k = drawable;
        c();
        return this;
    }

    @Override // y1.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f52310p = colorStateList;
        this.f52312r = true;
        c();
        return this;
    }

    @Override // y1.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f52311q = mode;
        this.f52313s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f52300f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f52301g = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f52307m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f52301g = c10;
        this.f52303i = Character.toLowerCase(c11);
        return this;
    }

    @Override // y1.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f52298d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f52299e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f52314t = (this.f52314t & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // y1.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f52303i = Character.toLowerCase(c10);
        this.f52304j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public y1.b setContentDescription(CharSequence charSequence) {
        this.f52308n = charSequence;
        return this;
    }

    @Override // y1.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f52301g = c10;
        this.f52302h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f52298d = this.f52306l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public y1.b setTooltipText(CharSequence charSequence) {
        this.f52309o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f52305k = AbstractC8021a.e(this.f52306l, i10);
        c();
        return this;
    }

    @Override // y1.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f52301g = c10;
        this.f52302h = KeyEvent.normalizeMetaState(i10);
        this.f52303i = Character.toLowerCase(c11);
        this.f52304j = KeyEvent.normalizeMetaState(i11);
        return this;
    }
}
