package androidx.appcompat.view.menu;

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
import androidx.appcompat.view.menu.i;
import androidx.core.view.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
public final class f implements l0.b {
    public View A;
    public androidx.core.view.b B;
    public MenuItem.OnActionExpandListener C;
    public ContextMenu.ContextMenuInfo E;

    /* renamed from: a, reason: collision with root package name */
    public final int f742a;

    /* renamed from: b, reason: collision with root package name */
    public final int f743b;

    /* renamed from: c, reason: collision with root package name */
    public final int f744c;

    /* renamed from: d, reason: collision with root package name */
    public final int f745d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f746e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f747f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f748g;

    /* renamed from: h, reason: collision with root package name */
    public char f749h;

    /* renamed from: j, reason: collision with root package name */
    public char f751j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f753l;

    /* renamed from: n, reason: collision with root package name */
    public d f755n;

    /* renamed from: o, reason: collision with root package name */
    public k f756o;

    /* renamed from: p, reason: collision with root package name */
    public Runnable f757p;

    /* renamed from: q, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f758q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f759r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f760s;

    /* renamed from: z, reason: collision with root package name */
    public int f767z;

    /* renamed from: i, reason: collision with root package name */
    public int f750i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f752k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f754m = 0;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f761t = null;

    /* renamed from: u, reason: collision with root package name */
    public PorterDuff.Mode f762u = null;

    /* renamed from: v, reason: collision with root package name */
    public boolean f763v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f764w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f765x = false;

    /* renamed from: y, reason: collision with root package name */
    public int f766y = 16;
    public boolean D = false;

    public class a implements b.InterfaceC0024b {
        public a() {
        }

        @Override // androidx.core.view.b.InterfaceC0024b
        public void onActionProviderVisibilityChanged(boolean z10) {
            f fVar = f.this;
            fVar.f755n.M(fVar);
        }
    }

    public f(d dVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f755n = dVar;
        this.f742a = i11;
        this.f743b = i10;
        this.f744c = i12;
        this.f745d = i13;
        this.f746e = charSequence;
        this.f767z = i14;
    }

    public static void d(StringBuilder sb, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb.append(str);
        }
    }

    public boolean A() {
        return this.f755n.K() && g() != 0;
    }

    public boolean B() {
        return (this.f767z & 4) == 4;
    }

    @Override // l0.b
    public androidx.core.view.b a() {
        return this.B;
    }

    @Override // l0.b
    public l0.b b(androidx.core.view.b bVar) {
        androidx.core.view.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.h();
        }
        this.A = null;
        this.B = bVar;
        this.f755n.N(true);
        androidx.core.view.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.j(new a());
        }
        return this;
    }

    public void c() {
        this.f755n.L(this);
    }

    @Override // l0.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f767z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f755n.f(this);
        }
        return false;
    }

    public final Drawable e(Drawable drawable) {
        if (drawable != null && this.f765x && (this.f763v || this.f764w)) {
            drawable = k0.a.r(drawable).mutate();
            if (this.f763v) {
                k0.a.o(drawable, this.f761t);
            }
            if (this.f764w) {
                k0.a.p(drawable, this.f762u);
            }
            this.f765x = false;
        }
        return drawable;
    }

    @Override // l0.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f755n.m(this);
        }
        return false;
    }

    public int f() {
        return this.f745d;
    }

    public char g() {
        return this.f755n.J() ? this.f751j : this.f749h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // l0.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        androidx.core.view.b bVar = this.B;
        if (bVar == null) {
            return null;
        }
        View viewD = bVar.d(this);
        this.A = viewD;
        return viewD;
    }

    @Override // l0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f752k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f751j;
    }

    @Override // l0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f759r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f743b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f753l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f754m == 0) {
            return null;
        }
        Drawable drawableB = d.a.b(this.f755n.w(), this.f754m);
        this.f754m = 0;
        this.f753l = drawableB;
        return e(drawableB);
    }

    @Override // l0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f761t;
    }

    @Override // l0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f762u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f748g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f742a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // l0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f750i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f749h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f744c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f756o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f746e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f747f;
        return charSequence != null ? charSequence : this.f746e;
    }

    @Override // l0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f760s;
    }

    public String h() {
        char cG = g();
        if (cG == 0) {
            return "";
        }
        Resources resources = this.f755n.w().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f755n.w()).hasPermanentMenuKey()) {
            sb.append(resources.getString(c.h.abc_prepend_shortcut_label));
        }
        int i10 = this.f755n.J() ? this.f752k : this.f750i;
        d(sb, i10, C.DEFAULT_BUFFER_SEGMENT_SIZE, resources.getString(c.h.abc_menu_meta_shortcut_label));
        d(sb, i10, 4096, resources.getString(c.h.abc_menu_ctrl_shortcut_label));
        d(sb, i10, 2, resources.getString(c.h.abc_menu_alt_shortcut_label));
        d(sb, i10, 1, resources.getString(c.h.abc_menu_shift_shortcut_label));
        d(sb, i10, 4, resources.getString(c.h.abc_menu_sym_shortcut_label));
        d(sb, i10, 8, resources.getString(c.h.abc_menu_function_shortcut_label));
        if (cG == '\b') {
            sb.append(resources.getString(c.h.abc_menu_delete_shortcut_label));
        } else if (cG == '\n') {
            sb.append(resources.getString(c.h.abc_menu_enter_shortcut_label));
        } else if (cG != ' ') {
            sb.append(cG);
        } else {
            sb.append(resources.getString(c.h.abc_menu_space_shortcut_label));
        }
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f756o != null;
    }

    public CharSequence i(i.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    @Override // l0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f766y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f766y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f766y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        androidx.core.view.b bVar = this.B;
        return (bVar == null || !bVar.g()) ? (this.f766y & 8) == 0 : (this.f766y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        androidx.core.view.b bVar;
        if ((this.f767z & 8) != 0) {
            if (this.A == null && (bVar = this.B) != null) {
                this.A = bVar.d(this);
            }
            if (this.A != null) {
                return true;
            }
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f758q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        d dVar = this.f755n;
        if (dVar.h(dVar, this)) {
            return true;
        }
        Runnable runnable = this.f757p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f748g != null) {
            try {
                this.f755n.w().startActivity(this.f748g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        androidx.core.view.b bVar = this.B;
        return bVar != null && bVar.e();
    }

    public boolean l() {
        return (this.f766y & 32) == 32;
    }

    public boolean m() {
        return (this.f766y & 4) != 0;
    }

    public boolean n() {
        return (this.f767z & 1) == 1;
    }

    public boolean o() {
        return (this.f767z & 2) == 2;
    }

    @Override // l0.b, android.view.MenuItem
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public l0.b setActionView(int i10) {
        Context contextW = this.f755n.w();
        setActionView(LayoutInflater.from(contextW).inflate(i10, (ViewGroup) new LinearLayout(contextW), false));
        return this;
    }

    @Override // l0.b, android.view.MenuItem
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public l0.b setActionView(View view) {
        int i10;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f742a) > 0) {
            view.setId(i10);
        }
        this.f755n.L(this);
        return this;
    }

    public void r(boolean z10) {
        this.D = z10;
        this.f755n.N(false);
    }

    public void s(boolean z10) {
        int i10 = this.f766y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f766y = i11;
        if (i10 != i11) {
            this.f755n.N(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f751j == c10) {
            return this;
        }
        this.f751j = Character.toLowerCase(c10);
        this.f755n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f766y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f766y = i11;
        if (i10 != i11) {
            this.f755n.N(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f766y & 4) != 0) {
            this.f755n.Y(this);
            return this;
        }
        s(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f766y |= 16;
        } else {
            this.f766y &= -17;
        }
        this.f755n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f754m = 0;
        this.f753l = drawable;
        this.f765x = true;
        this.f755n.N(false);
        return this;
    }

    @Override // l0.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f761t = colorStateList;
        this.f763v = true;
        this.f765x = true;
        this.f755n.N(false);
        return this;
    }

    @Override // l0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f762u = mode;
        this.f764w = true;
        this.f765x = true;
        this.f755n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f748g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f749h == c10) {
            return this;
        }
        this.f749h = c10;
        this.f755n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f758q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f749h = c10;
        this.f751j = Character.toLowerCase(c11);
        this.f755n.N(false);
        return this;
    }

    @Override // l0.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f767z = i10;
        this.f755n.L(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f746e = charSequence;
        this.f755n.N(false);
        k kVar = this.f756o;
        if (kVar != null) {
            kVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f747f = charSequence;
        this.f755n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f755n.M(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.f766y = (z10 ? 4 : 0) | (this.f766y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f746e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        if (z10) {
            this.f766y |= 32;
        } else {
            this.f766y &= -33;
        }
    }

    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // l0.b, android.view.MenuItem
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public l0.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(k kVar) {
        this.f756o = kVar;
        kVar.setHeaderTitle(getTitle());
    }

    public boolean y(boolean z10) {
        int i10 = this.f766y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f766y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f755n.C();
    }

    @Override // android.view.MenuItem
    public l0.b setContentDescription(CharSequence charSequence) {
        this.f759r = charSequence;
        this.f755n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public l0.b setTooltipText(CharSequence charSequence) {
        this.f760s = charSequence;
        this.f755n.N(false);
        return this;
    }

    @Override // l0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f751j == c10 && this.f752k == i10) {
            return this;
        }
        this.f751j = Character.toLowerCase(c10);
        this.f752k = KeyEvent.normalizeMetaState(i10);
        this.f755n.N(false);
        return this;
    }

    @Override // l0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f749h == c10 && this.f750i == i10) {
            return this;
        }
        this.f749h = c10;
        this.f750i = KeyEvent.normalizeMetaState(i10);
        this.f755n.N(false);
        return this;
    }

    @Override // l0.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f749h = c10;
        this.f750i = KeyEvent.normalizeMetaState(i10);
        this.f751j = Character.toLowerCase(c11);
        this.f752k = KeyEvent.normalizeMetaState(i11);
        this.f755n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f753l = null;
        this.f754m = i10;
        this.f765x = true;
        this.f755n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f755n.w().getString(i10));
    }
}
