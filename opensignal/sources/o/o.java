package o;

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
import h7.r1;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o implements m3.a {
    public p A;
    public MenuItem.OnActionExpandListener B;

    /* renamed from: a, reason: collision with root package name */
    public final int f18638a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18639b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18640c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18641d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f18642e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f18643f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f18644g;

    /* renamed from: h, reason: collision with root package name */
    public char f18645h;
    public char j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f18647l;

    /* renamed from: n, reason: collision with root package name */
    public final m f18649n;

    /* renamed from: o, reason: collision with root package name */
    public e0 f18650o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f18651p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f18652q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f18653r;

    /* renamed from: y, reason: collision with root package name */
    public int f18660y;

    /* renamed from: z, reason: collision with root package name */
    public View f18661z;

    /* renamed from: i, reason: collision with root package name */
    public int f18646i = 4096;
    public int k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f18648m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f18654s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f18655t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f18656u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f18657v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f18658w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f18659x = 16;
    public boolean C = false;

    public o(m mVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f18649n = mVar;
        this.f18638a = i11;
        this.f18639b = i10;
        this.f18640c = i12;
        this.f18641d = i13;
        this.f18642e = charSequence;
        this.f18660y = i14;
    }

    public static void c(int i10, int i11, String str, StringBuilder sb2) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override // m3.a
    public final p a() {
        return this.A;
    }

    @Override // m3.a
    public final m3.a b(p pVar) {
        this.f18661z = null;
        this.A = pVar;
        this.f18649n.p(true);
        p pVar2 = this.A;
        if (pVar2 != null) {
            pVar2.f18662a = new r1(28, this);
            pVar2.f18663b.setVisibilityListener(pVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f18660y & 8) == 0) {
            return false;
        }
        if (this.f18661z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f18649n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f18658w && (this.f18656u || this.f18657v)) {
            drawable = drawable.mutate();
            if (this.f18656u) {
                drawable.setTintList(this.f18654s);
            }
            if (this.f18657v) {
                drawable.setTintMode(this.f18655t);
            }
            this.f18658w = false;
        }
        return drawable;
    }

    public final boolean e() {
        p pVar;
        if ((this.f18660y & 8) != 0) {
            if (this.f18661z == null && (pVar = this.A) != null) {
                this.f18661z = pVar.f18663b.onCreateActionView(this);
            }
            if (this.f18661z != null) {
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
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f18649n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        if (z10) {
            this.f18659x |= 32;
        } else {
            this.f18659x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f18661z;
        if (view != null) {
            return view;
        }
        p pVar = this.A;
        if (pVar == null) {
            return null;
        }
        View viewOnCreateActionView = pVar.f18663b.onCreateActionView(this);
        this.f18661z = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // m3.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // m3.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f18652q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f18639b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f18647l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f18648m;
        if (i10 == 0) {
            return null;
        }
        Drawable drawableR = ic.a.r(this.f18649n.f18613a, i10);
        this.f18648m = 0;
        this.f18647l = drawableR;
        return d(drawableR);
    }

    @Override // m3.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f18654s;
    }

    @Override // m3.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f18655t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f18644g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f18638a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // m3.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f18646i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f18645h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f18640c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f18650o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f18642e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f18643f;
        return charSequence != null ? charSequence : this.f18642e;
    }

    @Override // m3.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f18653r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f18650o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f18659x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f18659x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f18659x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        p pVar = this.A;
        return (pVar == null || !pVar.f18663b.overridesItemVisibility()) ? (this.f18659x & 8) == 0 : (this.f18659x & 8) == 0 && this.A.f18663b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i10;
        this.f18661z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f18638a) > 0) {
            view.setId(i10);
        }
        m mVar = this.f18649n;
        mVar.k = true;
        mVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4) {
        if (this.j == c4) {
            return this;
        }
        this.j = Character.toLowerCase(c4);
        this.f18649n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f18659x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f18659x = i11;
        if (i10 != i11) {
            this.f18649n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        int i10 = this.f18659x;
        int i11 = i10 & 4;
        m mVar = this.f18649n;
        if (i11 == 0) {
            int i12 = (i10 & (-3)) | (z10 ? 2 : 0);
            this.f18659x = i12;
            if (i10 != i12) {
                mVar.p(false);
            }
            return this;
        }
        ArrayList arrayList = mVar.f18618f;
        int size = arrayList.size();
        mVar.w();
        for (int i13 = 0; i13 < size; i13++) {
            o oVar = (o) arrayList.get(i13);
            if (oVar.f18639b == this.f18639b && (oVar.f18659x & 4) != 0 && oVar.isCheckable()) {
                boolean z11 = oVar == this;
                int i14 = oVar.f18659x;
                int i15 = (z11 ? 2 : 0) | (i14 & (-3));
                oVar.f18659x = i15;
                if (i14 != i15) {
                    oVar.f18649n.p(false);
                }
            }
        }
        mVar.v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f18659x |= 16;
        } else {
            this.f18659x &= -17;
        }
        this.f18649n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f18648m = 0;
        this.f18647l = drawable;
        this.f18658w = true;
        this.f18649n.p(false);
        return this;
    }

    @Override // m3.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f18654s = colorStateList;
        this.f18656u = true;
        this.f18658w = true;
        this.f18649n.p(false);
        return this;
    }

    @Override // m3.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f18655t = mode;
        this.f18657v = true;
        this.f18658w = true;
        this.f18649n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f18644g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4) {
        if (this.f18645h == c4) {
            return this;
        }
        this.f18645h = c4;
        this.f18649n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f18651p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c10) {
        this.f18645h = c4;
        this.j = Character.toLowerCase(c10);
        this.f18649n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f18660y = i10;
        m mVar = this.f18649n;
        mVar.k = true;
        mVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f18642e = charSequence;
        this.f18649n.p(false);
        e0 e0Var = this.f18650o;
        if (e0Var != null) {
            e0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f18643f = charSequence;
        this.f18649n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i10 = this.f18659x;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f18659x = i11;
        if (i10 != i11) {
            m mVar = this.f18649n;
            mVar.f18620h = true;
            mVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f18642e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // m3.a, android.view.MenuItem
    public final m3.a setContentDescription(CharSequence charSequence) {
        this.f18652q = charSequence;
        this.f18649n.p(false);
        return this;
    }

    @Override // m3.a, android.view.MenuItem
    public final m3.a setTooltipText(CharSequence charSequence) {
        this.f18653r = charSequence;
        this.f18649n.p(false);
        return this;
    }

    @Override // m3.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4, int i10) {
        if (this.j == c4 && this.k == i10) {
            return this;
        }
        this.j = Character.toLowerCase(c4);
        this.k = KeyEvent.normalizeMetaState(i10);
        this.f18649n.p(false);
        return this;
    }

    @Override // m3.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4, int i10) {
        if (this.f18645h == c4 && this.f18646i == i10) {
            return this;
        }
        this.f18645h = c4;
        this.f18646i = KeyEvent.normalizeMetaState(i10);
        this.f18649n.p(false);
        return this;
    }

    @Override // m3.a, android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c10, int i10, int i11) {
        this.f18645h = c4;
        this.f18646i = KeyEvent.normalizeMetaState(i10);
        this.j = Character.toLowerCase(c10);
        this.k = KeyEvent.normalizeMetaState(i11);
        this.f18649n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f18647l = null;
        this.f18648m = i10;
        this.f18658w = true;
        this.f18649n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        setTitle(this.f18649n.f18613a.getString(i10));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        int i11;
        m mVar = this.f18649n;
        Context context = mVar.f18613a;
        View viewInflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f18661z = viewInflate;
        this.A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i11 = this.f18638a) > 0) {
            viewInflate.setId(i11);
        }
        mVar.k = true;
        mVar.p(true);
        return this;
    }
}
