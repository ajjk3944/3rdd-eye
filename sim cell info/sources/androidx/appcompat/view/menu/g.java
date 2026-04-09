package androidx.appcompat.view.menu;

import a0.b;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;

/* loaded from: classes.dex */
public final class g implements v.b {
    private View A;
    private a0.b B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;

    /* renamed from: a, reason: collision with root package name */
    private final int f623a;

    /* renamed from: b, reason: collision with root package name */
    private final int f624b;

    /* renamed from: c, reason: collision with root package name */
    private final int f625c;

    /* renamed from: d, reason: collision with root package name */
    private final int f626d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f627e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f628f;

    /* renamed from: g, reason: collision with root package name */
    private Intent f629g;

    /* renamed from: h, reason: collision with root package name */
    private char f630h;

    /* renamed from: j, reason: collision with root package name */
    private char f632j;

    /* renamed from: l, reason: collision with root package name */
    private Drawable f634l;

    /* renamed from: n, reason: collision with root package name */
    e f636n;

    /* renamed from: o, reason: collision with root package name */
    private m f637o;

    /* renamed from: p, reason: collision with root package name */
    private Runnable f638p;

    /* renamed from: q, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f639q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f640r;

    /* renamed from: s, reason: collision with root package name */
    private CharSequence f641s;

    /* renamed from: z, reason: collision with root package name */
    private int f648z;

    /* renamed from: i, reason: collision with root package name */
    private int f631i = 4096;

    /* renamed from: k, reason: collision with root package name */
    private int f633k = 4096;

    /* renamed from: m, reason: collision with root package name */
    private int f635m = 0;

    /* renamed from: t, reason: collision with root package name */
    private ColorStateList f642t = null;

    /* renamed from: u, reason: collision with root package name */
    private PorterDuff.Mode f643u = null;

    /* renamed from: v, reason: collision with root package name */
    private boolean f644v = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f645w = false;

    /* renamed from: x, reason: collision with root package name */
    private boolean f646x = false;

    /* renamed from: y, reason: collision with root package name */
    private int f647y = 16;
    private boolean D = false;

    class a implements b.InterfaceC0001b {
        a() {
        }

        @Override // a0.b.InterfaceC0001b
        public void onActionProviderVisibilityChanged(boolean z2) {
            g gVar = g.this;
            gVar.f636n.J(gVar);
        }
    }

    g(e eVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.f648z = 0;
        this.f636n = eVar;
        this.f623a = i3;
        this.f624b = i2;
        this.f625c = i4;
        this.f626d = i5;
        this.f627e = charSequence;
        this.f648z = i6;
    }

    private static void d(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f646x && (this.f644v || this.f645w)) {
            drawable = u.a.p(drawable).mutate();
            if (this.f644v) {
                u.a.n(drawable, this.f642t);
            }
            if (this.f645w) {
                u.a.o(drawable, this.f643u);
            }
            this.f646x = false;
        }
        return drawable;
    }

    boolean A() {
        return this.f636n.H() && g() != 0;
    }

    public boolean B() {
        return (this.f648z & 4) == 4;
    }

    @Override // v.b
    public a0.b a() {
        return this.B;
    }

    @Override // v.b
    public v.b b(a0.b bVar) {
        a0.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.h();
        }
        this.A = null;
        this.B = bVar;
        this.f636n.K(true);
        a0.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.j(new a());
        }
        return this;
    }

    public void c() {
        this.f636n.I(this);
    }

    @Override // v.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f648z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f636n.f(this);
        }
        return false;
    }

    @Override // v.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f636n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f626d;
    }

    char g() {
        return this.f636n.G() ? this.f632j : this.f630h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // v.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        a0.b bVar = this.B;
        if (bVar == null) {
            return null;
        }
        View viewD = bVar.d(this);
        this.A = viewD;
        return viewD;
    }

    @Override // v.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f633k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f632j;
    }

    @Override // v.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f640r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f624b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f634l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f635m == 0) {
            return null;
        }
        Drawable drawableD = c.a.d(this.f636n.u(), this.f635m);
        this.f635m = 0;
        this.f634l = drawableD;
        return e(drawableD);
    }

    @Override // v.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f642t;
    }

    @Override // v.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f643u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f629g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f623a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // v.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f631i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f630h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f625c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f637o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f627e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f628f;
        if (charSequence == null) {
            charSequence = this.f627e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // v.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f641s;
    }

    String h() {
        int i2;
        char cG = g();
        if (cG == 0) {
            return "";
        }
        Resources resources = this.f636n.u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f636n.u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(a.h.f128k));
        }
        int i3 = this.f636n.G() ? this.f633k : this.f631i;
        d(sb, i3, 65536, resources.getString(a.h.f124g));
        d(sb, i3, 4096, resources.getString(a.h.f120c));
        d(sb, i3, 2, resources.getString(a.h.f119b));
        d(sb, i3, 1, resources.getString(a.h.f125h));
        d(sb, i3, 4, resources.getString(a.h.f127j));
        d(sb, i3, 8, resources.getString(a.h.f123f));
        if (cG == '\b') {
            i2 = a.h.f121d;
        } else if (cG == '\n') {
            i2 = a.h.f122e;
        } else {
            if (cG != ' ') {
                sb.append(cG);
                return sb.toString();
            }
            i2 = a.h.f126i;
        }
        sb.append(resources.getString(i2));
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f637o != null;
    }

    CharSequence i(k.a aVar) {
        return (aVar == null || !aVar.c()) ? getTitle() : getTitleCondensed();
    }

    @Override // v.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f647y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f647y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f647y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        a0.b bVar = this.B;
        return (bVar == null || !bVar.g()) ? (this.f647y & 8) == 0 : (this.f647y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        a0.b bVar;
        if ((this.f648z & 8) == 0) {
            return false;
        }
        if (this.A == null && (bVar = this.B) != null) {
            this.A = bVar.d(this);
        }
        return this.A != null;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f639q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f636n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f638p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f629g != null) {
            try {
                this.f636n.u().startActivity(this.f629g);
                return true;
            } catch (ActivityNotFoundException e2) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
            }
        }
        a0.b bVar = this.B;
        return bVar != null && bVar.e();
    }

    public boolean l() {
        return (this.f647y & 32) == 32;
    }

    public boolean m() {
        return (this.f647y & 4) != 0;
    }

    public boolean n() {
        return (this.f648z & 1) == 1;
    }

    public boolean o() {
        return (this.f648z & 2) == 2;
    }

    @Override // v.b, android.view.MenuItem
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public v.b setActionView(int i2) {
        Context contextU = this.f636n.u();
        setActionView(LayoutInflater.from(contextU).inflate(i2, (ViewGroup) new LinearLayout(contextU), false));
        return this;
    }

    @Override // v.b, android.view.MenuItem
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public v.b setActionView(View view) {
        int i2;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i2 = this.f623a) > 0) {
            view.setId(i2);
        }
        this.f636n.I(this);
        return this;
    }

    public void r(boolean z2) {
        this.D = z2;
        this.f636n.K(false);
    }

    void s(boolean z2) {
        int i2 = this.f647y;
        int i3 = (z2 ? 2 : 0) | (i2 & (-3));
        this.f647y = i3;
        if (i2 != i3) {
            this.f636n.K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.f632j == c2) {
            return this;
        }
        this.f632j = Character.toLowerCase(c2);
        this.f636n.K(false);
        return this;
    }

    @Override // v.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f632j == c2 && this.f633k == i2) {
            return this;
        }
        this.f632j = Character.toLowerCase(c2);
        this.f633k = KeyEvent.normalizeMetaState(i2);
        this.f636n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z2) {
        int i2 = this.f647y;
        int i3 = (z2 ? 1 : 0) | (i2 & (-2));
        this.f647y = i3;
        if (i2 != i3) {
            this.f636n.K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z2) {
        if ((this.f647y & 4) != 0) {
            this.f636n.T(this);
        } else {
            s(z2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public v.b setContentDescription(CharSequence charSequence) {
        this.f640r = charSequence;
        this.f636n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z2) {
        this.f647y = z2 ? this.f647y | 16 : this.f647y & (-17);
        this.f636n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f634l = null;
        this.f635m = i2;
        this.f646x = true;
        this.f636n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f635m = 0;
        this.f634l = drawable;
        this.f646x = true;
        this.f636n.K(false);
        return this;
    }

    @Override // v.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f642t = colorStateList;
        this.f644v = true;
        this.f646x = true;
        this.f636n.K(false);
        return this;
    }

    @Override // v.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f643u = mode;
        this.f645w = true;
        this.f646x = true;
        this.f636n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f629g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        if (this.f630h == c2) {
            return this;
        }
        this.f630h = c2;
        this.f636n.K(false);
        return this;
    }

    @Override // v.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f630h == c2 && this.f631i == i2) {
            return this;
        }
        this.f630h = c2;
        this.f631i = KeyEvent.normalizeMetaState(i2);
        this.f636n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f639q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f630h = c2;
        this.f632j = Character.toLowerCase(c3);
        this.f636n.K(false);
        return this;
    }

    @Override // v.b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f630h = c2;
        this.f631i = KeyEvent.normalizeMetaState(i2);
        this.f632j = Character.toLowerCase(c3);
        this.f633k = KeyEvent.normalizeMetaState(i3);
        this.f636n.K(false);
        return this;
    }

    @Override // v.b, android.view.MenuItem
    public void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f648z = i2;
        this.f636n.I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        return setTitle(this.f636n.u().getString(i2));
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f627e = charSequence;
        this.f636n.K(false);
        m mVar = this.f637o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f628f = charSequence;
        this.f636n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public v.b setTooltipText(CharSequence charSequence) {
        this.f641s = charSequence;
        this.f636n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z2) {
        if (y(z2)) {
            this.f636n.J(this);
        }
        return this;
    }

    public void t(boolean z2) {
        this.f647y = (z2 ? 4 : 0) | (this.f647y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f627e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z2) {
        this.f647y = z2 ? this.f647y | 32 : this.f647y & (-33);
    }

    void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // v.b, android.view.MenuItem
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public v.b setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public void x(m mVar) {
        this.f637o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    boolean y(boolean z2) {
        int i2 = this.f647y;
        int i3 = (z2 ? 0 : 8) | (i2 & (-9));
        this.f647y = i3;
        return i2 != i3;
    }

    public boolean z() {
        return this.f636n.A();
    }
}
