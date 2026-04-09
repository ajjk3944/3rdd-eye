package n;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m implements L.a {

    /* renamed from: C, reason: collision with root package name */
    public SubMenuC2666C f22092C;

    /* renamed from: D, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f22093D;

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f22094E;

    /* renamed from: F, reason: collision with root package name */
    public CharSequence f22095F;
    public int M;

    /* renamed from: N, reason: collision with root package name */
    public View f22102N;

    /* renamed from: O, reason: collision with root package name */
    public n f22103O;

    /* renamed from: P, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f22104P;

    /* renamed from: a, reason: collision with root package name */
    public final int f22106a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22107b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22108c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22109d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f22110e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f22111f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f22112g;

    /* renamed from: h, reason: collision with root package name */
    public char f22113h;

    /* renamed from: j, reason: collision with root package name */
    public char f22114j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f22116l;

    /* renamed from: n, reason: collision with root package name */
    public final MenuC2677k f22118n;
    public int i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f22115k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f22117m = 0;

    /* renamed from: G, reason: collision with root package name */
    public ColorStateList f22096G = null;

    /* renamed from: H, reason: collision with root package name */
    public PorterDuff.Mode f22097H = null;

    /* renamed from: I, reason: collision with root package name */
    public boolean f22098I = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f22099J = false;

    /* renamed from: K, reason: collision with root package name */
    public boolean f22100K = false;

    /* renamed from: L, reason: collision with root package name */
    public int f22101L = 16;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f22105Q = false;

    public m(MenuC2677k menuC2677k, int i, int i3, int i6, int i7, CharSequence charSequence, int i8) {
        this.f22118n = menuC2677k;
        this.f22106a = i3;
        this.f22107b = i;
        this.f22108c = i6;
        this.f22109d = i7;
        this.f22110e = charSequence;
        this.M = i8;
    }

    public static void c(int i, int i3, String str, StringBuilder sb) {
        if ((i & i3) == i3) {
            sb.append(str);
        }
    }

    @Override // L.a
    public final n a() {
        return this.f22103O;
    }

    @Override // L.a
    public final L.a b(n nVar) {
        this.f22102N = null;
        this.f22103O = nVar;
        this.f22118n.p(true);
        n nVar2 = this.f22103O;
        if (nVar2 != null) {
            nVar2.f22120b = new h2.d(this);
            nVar2.f22121c.setVisibilityListener(nVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.M & 8) == 0) {
            return false;
        }
        if (this.f22102N == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f22104P;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f22118n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f22100K && (this.f22098I || this.f22099J)) {
            drawable = drawable.mutate();
            if (this.f22098I) {
                drawable.setTintList(this.f22096G);
            }
            if (this.f22099J) {
                drawable.setTintMode(this.f22097H);
            }
            this.f22100K = false;
        }
        return drawable;
    }

    public final boolean e() {
        n nVar;
        if ((this.M & 8) != 0) {
            if (this.f22102N == null && (nVar = this.f22103O) != null) {
                this.f22102N = nVar.f22121c.onCreateActionView(this);
            }
            if (this.f22102N != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f22104P;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f22118n.f(this);
        }
        return false;
    }

    public final void f(boolean z6) {
        this.f22101L = (z6 ? 4 : 0) | (this.f22101L & (-5));
    }

    public final void g(boolean z6) {
        if (z6) {
            this.f22101L |= 32;
        } else {
            this.f22101L &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f22102N;
        if (view != null) {
            return view;
        }
        n nVar = this.f22103O;
        if (nVar == null) {
            return null;
        }
        View viewOnCreateActionView = nVar.f22121c.onCreateActionView(this);
        this.f22102N = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // L.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f22115k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f22114j;
    }

    @Override // L.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f22094E;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f22107b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f22116l;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f22117m;
        if (i == 0) {
            return null;
        }
        Drawable drawableI = a4.t.i(this.f22118n.f22076a, i);
        this.f22117m = 0;
        this.f22116l = drawableI;
        return d(drawableI);
    }

    @Override // L.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f22096G;
    }

    @Override // L.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f22097H;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f22112g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f22106a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // L.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f22113h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f22108c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f22092C;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f22110e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f22111f;
        return charSequence != null ? charSequence : this.f22110e;
    }

    @Override // L.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f22095F;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f22092C != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f22105Q;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f22101L & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f22101L & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f22101L & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        n nVar = this.f22103O;
        return (nVar == null || !nVar.f22121c.overridesItemVisibility()) ? (this.f22101L & 8) == 0 : (this.f22101L & 8) == 0 && this.f22103O.f22121c.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f22102N = view;
        this.f22103O = null;
        if (view != null && view.getId() == -1 && (i = this.f22106a) > 0) {
            view.setId(i);
        }
        MenuC2677k menuC2677k = this.f22118n;
        menuC2677k.f22085k = true;
        menuC2677k.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6) {
        if (this.f22114j == c6) {
            return this;
        }
        this.f22114j = Character.toLowerCase(c6);
        this.f22118n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z6) {
        int i = this.f22101L;
        int i3 = (z6 ? 1 : 0) | (i & (-2));
        this.f22101L = i3;
        if (i != i3) {
            this.f22118n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z6) {
        int i = this.f22101L;
        if ((i & 4) == 0) {
            int i3 = (i & (-3)) | (z6 ? 2 : 0);
            this.f22101L = i3;
            if (i != i3) {
                this.f22118n.p(false);
            }
            return this;
        }
        MenuC2677k menuC2677k = this.f22118n;
        ArrayList arrayList = menuC2677k.f22081f;
        int size = arrayList.size();
        menuC2677k.y();
        for (int i6 = 0; i6 < size; i6++) {
            m mVar = (m) arrayList.get(i6);
            if (mVar.f22107b == this.f22107b && (mVar.f22101L & 4) != 0 && mVar.isCheckable()) {
                boolean z7 = mVar == this;
                int i7 = mVar.f22101L;
                int i8 = (z7 ? 2 : 0) | (i7 & (-3));
                mVar.f22101L = i8;
                if (i7 != i8) {
                    mVar.f22118n.p(false);
                }
            }
        }
        menuC2677k.x();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z6) {
        if (z6) {
            this.f22101L |= 16;
        } else {
            this.f22101L &= -17;
        }
        this.f22118n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f22117m = 0;
        this.f22116l = drawable;
        this.f22100K = true;
        this.f22118n.p(false);
        return this;
    }

    @Override // L.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f22096G = colorStateList;
        this.f22098I = true;
        this.f22100K = true;
        this.f22118n.p(false);
        return this;
    }

    @Override // L.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f22097H = mode;
        this.f22099J = true;
        this.f22100K = true;
        this.f22118n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f22112g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6) {
        if (this.f22113h == c6) {
            return this;
        }
        this.f22113h = c6;
        this.f22118n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f22104P = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f22093D = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c7) {
        this.f22113h = c6;
        this.f22114j = Character.toLowerCase(c7);
        this.f22118n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i3 = i & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.M = i;
        MenuC2677k menuC2677k = this.f22118n;
        menuC2677k.f22085k = true;
        menuC2677k.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f22110e = charSequence;
        this.f22118n.p(false);
        SubMenuC2666C subMenuC2666C = this.f22092C;
        if (subMenuC2666C != null) {
            subMenuC2666C.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f22111f = charSequence;
        this.f22118n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z6) {
        int i = this.f22101L;
        int i3 = (z6 ? 0 : 8) | (i & (-9));
        this.f22101L = i3;
        if (i != i3) {
            MenuC2677k menuC2677k = this.f22118n;
            menuC2677k.f22083h = true;
            menuC2677k.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f22110e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // L.a, android.view.MenuItem
    public final L.a setContentDescription(CharSequence charSequence) {
        this.f22094E = charSequence;
        this.f22118n.p(false);
        return this;
    }

    @Override // L.a, android.view.MenuItem
    public final L.a setTooltipText(CharSequence charSequence) {
        this.f22095F = charSequence;
        this.f22118n.p(false);
        return this;
    }

    @Override // L.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6, int i) {
        if (this.f22114j == c6 && this.f22115k == i) {
            return this;
        }
        this.f22114j = Character.toLowerCase(c6);
        this.f22115k = KeyEvent.normalizeMetaState(i);
        this.f22118n.p(false);
        return this;
    }

    @Override // L.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6, int i) {
        if (this.f22113h == c6 && this.i == i) {
            return this;
        }
        this.f22113h = c6;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f22118n.p(false);
        return this;
    }

    @Override // L.a, android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c7, int i, int i3) {
        this.f22113h = c6;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f22114j = Character.toLowerCase(c7);
        this.f22115k = KeyEvent.normalizeMetaState(i3);
        this.f22118n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f22116l = null;
        this.f22117m = i;
        this.f22100K = true;
        this.f22118n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f22118n.f22076a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i3;
        Context context = this.f22118n.f22076a;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f22102N = viewInflate;
        this.f22103O = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i3 = this.f22106a) > 0) {
            viewInflate.setId(i3);
        }
        MenuC2677k menuC2677k = this.f22118n;
        menuC2677k.f22085k = true;
        menuC2677k.p(true);
        return this;
    }
}
