package androidx.appcompat.view.menu;

import F1.AbstractC2738b;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import com.google.ar.core.ImageMetadata;
import h.AbstractC5934h;
import i.AbstractC6050a;
import x1.AbstractC8416a;

/* loaded from: classes.dex */
public final class g implements y1.b {

    /* renamed from: A, reason: collision with root package name */
    private View f26872A;

    /* renamed from: B, reason: collision with root package name */
    private AbstractC2738b f26873B;

    /* renamed from: C, reason: collision with root package name */
    private MenuItem.OnActionExpandListener f26874C;

    /* renamed from: E, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f26876E;

    /* renamed from: a, reason: collision with root package name */
    private final int f26877a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26878b;

    /* renamed from: c, reason: collision with root package name */
    private final int f26879c;

    /* renamed from: d, reason: collision with root package name */
    private final int f26880d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f26881e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f26882f;

    /* renamed from: g, reason: collision with root package name */
    private Intent f26883g;

    /* renamed from: h, reason: collision with root package name */
    private char f26884h;

    /* renamed from: j, reason: collision with root package name */
    private char f26886j;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f26888l;

    /* renamed from: n, reason: collision with root package name */
    e f26890n;

    /* renamed from: o, reason: collision with root package name */
    private m f26891o;

    /* renamed from: p, reason: collision with root package name */
    private Runnable f26892p;

    /* renamed from: q, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f26893q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f26894r;

    /* renamed from: s, reason: collision with root package name */
    private CharSequence f26895s;

    /* renamed from: z, reason: collision with root package name */
    private int f26902z;

    /* renamed from: i, reason: collision with root package name */
    private int f26885i = 4096;

    /* renamed from: k, reason: collision with root package name */
    private int f26887k = 4096;

    /* renamed from: m, reason: collision with root package name */
    private int f26889m = 0;

    /* renamed from: t, reason: collision with root package name */
    private ColorStateList f26896t = null;

    /* renamed from: u, reason: collision with root package name */
    private PorterDuff.Mode f26897u = null;

    /* renamed from: v, reason: collision with root package name */
    private boolean f26898v = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f26899w = false;

    /* renamed from: x, reason: collision with root package name */
    private boolean f26900x = false;

    /* renamed from: y, reason: collision with root package name */
    private int f26901y = 16;

    /* renamed from: D, reason: collision with root package name */
    private boolean f26875D = false;

    class a implements AbstractC2738b.InterfaceC0235b {
        a() {
        }

        @Override // F1.AbstractC2738b.InterfaceC0235b
        public void onActionProviderVisibilityChanged(boolean z10) {
            g gVar = g.this;
            gVar.f26890n.K(gVar);
        }
    }

    g(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f26890n = eVar;
        this.f26877a = i11;
        this.f26878b = i10;
        this.f26879c = i12;
        this.f26880d = i13;
        this.f26881e = charSequence;
        this.f26902z = i14;
    }

    private static void d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f26900x && (this.f26898v || this.f26899w)) {
            drawable = AbstractC8416a.r(drawable).mutate();
            if (this.f26898v) {
                AbstractC8416a.o(drawable, this.f26896t);
            }
            if (this.f26899w) {
                AbstractC8416a.p(drawable, this.f26897u);
            }
            this.f26900x = false;
        }
        return drawable;
    }

    boolean A() {
        return this.f26890n.I() && g() != 0;
    }

    public boolean B() {
        return (this.f26902z & 4) == 4;
    }

    @Override // y1.b
    public y1.b a(AbstractC2738b abstractC2738b) {
        AbstractC2738b abstractC2738b2 = this.f26873B;
        if (abstractC2738b2 != null) {
            abstractC2738b2.g();
        }
        this.f26872A = null;
        this.f26873B = abstractC2738b;
        this.f26890n.L(true);
        AbstractC2738b abstractC2738b3 = this.f26873B;
        if (abstractC2738b3 != null) {
            abstractC2738b3.i(new a());
        }
        return this;
    }

    @Override // y1.b
    public AbstractC2738b b() {
        return this.f26873B;
    }

    public void c() {
        this.f26890n.J(this);
    }

    @Override // y1.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f26902z & 8) == 0) {
            return false;
        }
        if (this.f26872A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f26874C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f26890n.f(this);
        }
        return false;
    }

    @Override // y1.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f26874C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f26890n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f26880d;
    }

    char g() {
        return this.f26890n.H() ? this.f26886j : this.f26884h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // y1.b, android.view.MenuItem
    public View getActionView() {
        View view = this.f26872A;
        if (view != null) {
            return view;
        }
        AbstractC2738b abstractC2738b = this.f26873B;
        if (abstractC2738b == null) {
            return null;
        }
        View viewC = abstractC2738b.c(this);
        this.f26872A = viewC;
        return viewC;
    }

    @Override // y1.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f26887k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f26886j;
    }

    @Override // y1.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f26894r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f26878b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f26888l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f26889m == 0) {
            return null;
        }
        Drawable drawableB = AbstractC6050a.b(this.f26890n.u(), this.f26889m);
        this.f26889m = 0;
        this.f26888l = drawableB;
        return e(drawableB);
    }

    @Override // y1.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f26896t;
    }

    @Override // y1.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f26897u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f26883g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f26877a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f26876E;
    }

    @Override // y1.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f26885i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f26884h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f26879c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f26891o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f26881e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f26882f;
        return charSequence != null ? charSequence : this.f26881e;
    }

    @Override // y1.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f26895s;
    }

    String h() {
        char cG = g();
        if (cG == 0) {
            return "";
        }
        Resources resources = this.f26890n.u().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f26890n.u()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(AbstractC5934h.f48081k));
        }
        int i10 = this.f26890n.H() ? this.f26887k : this.f26885i;
        d(sb2, i10, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE, resources.getString(AbstractC5934h.f48077g));
        d(sb2, i10, 4096, resources.getString(AbstractC5934h.f48073c));
        d(sb2, i10, 2, resources.getString(AbstractC5934h.f48072b));
        d(sb2, i10, 1, resources.getString(AbstractC5934h.f48078h));
        d(sb2, i10, 4, resources.getString(AbstractC5934h.f48080j));
        d(sb2, i10, 8, resources.getString(AbstractC5934h.f48076f));
        if (cG == '\b') {
            sb2.append(resources.getString(AbstractC5934h.f48074d));
        } else if (cG == '\n') {
            sb2.append(resources.getString(AbstractC5934h.f48075e));
        } else if (cG != ' ') {
            sb2.append(cG);
        } else {
            sb2.append(resources.getString(AbstractC5934h.f48079i));
        }
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f26891o != null;
    }

    CharSequence i(k.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    @Override // y1.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f26875D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f26901y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f26901y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f26901y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC2738b abstractC2738b = this.f26873B;
        return (abstractC2738b == null || !abstractC2738b.f()) ? (this.f26901y & 8) == 0 : (this.f26901y & 8) == 0 && this.f26873B.b();
    }

    public boolean j() {
        AbstractC2738b abstractC2738b;
        if ((this.f26902z & 8) == 0) {
            return false;
        }
        if (this.f26872A == null && (abstractC2738b = this.f26873B) != null) {
            this.f26872A = abstractC2738b.c(this);
        }
        return this.f26872A != null;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f26893q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f26890n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f26892p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f26883g != null) {
            try {
                this.f26890n.u().startActivity(this.f26883g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        AbstractC2738b abstractC2738b = this.f26873B;
        return abstractC2738b != null && abstractC2738b.d();
    }

    public boolean l() {
        return (this.f26901y & 32) == 32;
    }

    public boolean m() {
        return (this.f26901y & 4) != 0;
    }

    public boolean n() {
        return (this.f26902z & 1) == 1;
    }

    public boolean o() {
        return (this.f26902z & 2) == 2;
    }

    @Override // y1.b, android.view.MenuItem
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public y1.b setActionView(int i10) {
        Context contextU = this.f26890n.u();
        setActionView(LayoutInflater.from(contextU).inflate(i10, (ViewGroup) new LinearLayout(contextU), false));
        return this;
    }

    @Override // y1.b, android.view.MenuItem
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public y1.b setActionView(View view) {
        int i10;
        this.f26872A = view;
        this.f26873B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f26877a) > 0) {
            view.setId(i10);
        }
        this.f26890n.J(this);
        return this;
    }

    public void r(boolean z10) {
        this.f26875D = z10;
        this.f26890n.L(false);
    }

    void s(boolean z10) {
        int i10 = this.f26901y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f26901y = i11;
        if (i10 != i11) {
            this.f26890n.L(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f26886j == c10) {
            return this;
        }
        this.f26886j = Character.toLowerCase(c10);
        this.f26890n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f26901y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f26901y = i11;
        if (i10 != i11) {
            this.f26890n.L(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f26901y & 4) != 0) {
            this.f26890n.U(this);
        } else {
            s(z10);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f26901y |= 16;
        } else {
            this.f26901y &= -17;
        }
        this.f26890n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f26889m = 0;
        this.f26888l = drawable;
        this.f26900x = true;
        this.f26890n.L(false);
        return this;
    }

    @Override // y1.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f26896t = colorStateList;
        this.f26898v = true;
        this.f26900x = true;
        this.f26890n.L(false);
        return this;
    }

    @Override // y1.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f26897u = mode;
        this.f26899w = true;
        this.f26900x = true;
        this.f26890n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f26883g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f26884h == c10) {
            return this;
        }
        this.f26884h = c10;
        this.f26890n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f26874C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f26893q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f26884h = c10;
        this.f26886j = Character.toLowerCase(c11);
        this.f26890n.L(false);
        return this;
    }

    @Override // y1.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f26902z = i10;
        this.f26890n.J(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f26881e = charSequence;
        this.f26890n.L(false);
        m mVar = this.f26891o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f26882f = charSequence;
        this.f26890n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f26890n.K(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.f26901y = (z10 ? 4 : 0) | (this.f26901y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f26881e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        if (z10) {
            this.f26901y |= 32;
        } else {
            this.f26901y &= -33;
        }
    }

    void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f26876E = contextMenuInfo;
    }

    @Override // y1.b, android.view.MenuItem
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public y1.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(m mVar) {
        this.f26891o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    boolean y(boolean z10) {
        int i10 = this.f26901y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f26901y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f26890n.A();
    }

    @Override // android.view.MenuItem
    public y1.b setContentDescription(CharSequence charSequence) {
        this.f26894r = charSequence;
        this.f26890n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public y1.b setTooltipText(CharSequence charSequence) {
        this.f26895s = charSequence;
        this.f26890n.L(false);
        return this;
    }

    @Override // y1.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f26886j == c10 && this.f26887k == i10) {
            return this;
        }
        this.f26886j = Character.toLowerCase(c10);
        this.f26887k = KeyEvent.normalizeMetaState(i10);
        this.f26890n.L(false);
        return this;
    }

    @Override // y1.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f26884h == c10 && this.f26885i == i10) {
            return this;
        }
        this.f26884h = c10;
        this.f26885i = KeyEvent.normalizeMetaState(i10);
        this.f26890n.L(false);
        return this;
    }

    @Override // y1.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f26884h = c10;
        this.f26885i = KeyEvent.normalizeMetaState(i10);
        this.f26886j = Character.toLowerCase(c11);
        this.f26887k = KeyEvent.normalizeMetaState(i11);
        this.f26890n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f26888l = null;
        this.f26889m = i10;
        this.f26900x = true;
        this.f26890n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f26890n.u().getString(i10));
    }
}
