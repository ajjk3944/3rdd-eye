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
import com.applovin.shadow.okio.internal.Buffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class o implements y3.a {
    public p A;
    public MenuItem.OnActionExpandListener B;

    /* renamed from: a, reason: collision with root package name */
    public final int f30263a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30264b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30265c;

    /* renamed from: d, reason: collision with root package name */
    public final int f30266d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f30267e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f30268f;
    public Intent g;

    /* renamed from: h, reason: collision with root package name */
    public char f30269h;
    public char j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f30272l;

    /* renamed from: n, reason: collision with root package name */
    public final m f30274n;

    /* renamed from: o, reason: collision with root package name */
    public e0 f30275o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f30276p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f30277q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f30278r;

    /* renamed from: y, reason: collision with root package name */
    public int f30285y;

    /* renamed from: z, reason: collision with root package name */
    public View f30286z;

    /* renamed from: i, reason: collision with root package name */
    public int f30270i = Buffer.SEGMENTING_THRESHOLD;

    /* renamed from: k, reason: collision with root package name */
    public int f30271k = Buffer.SEGMENTING_THRESHOLD;

    /* renamed from: m, reason: collision with root package name */
    public int f30273m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f30279s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f30280t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f30281u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f30282v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f30283w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f30284x = 16;
    public boolean C = false;

    public o(m mVar, int i4, int i10, int i11, int i12, CharSequence charSequence, int i13) {
        this.f30274n = mVar;
        this.f30263a = i10;
        this.f30264b = i4;
        this.f30265c = i11;
        this.f30266d = i12;
        this.f30267e = charSequence;
        this.f30285y = i13;
    }

    public static void c(int i4, int i10, String str, StringBuilder sb2) {
        if ((i4 & i10) == i10) {
            sb2.append(str);
        }
    }

    @Override // y3.a
    public final p a() {
        return this.A;
    }

    @Override // y3.a
    public final y3.a b(p pVar) {
        this.f30286z = null;
        this.A = pVar;
        this.f30274n.p(true);
        p pVar2 = this.A;
        if (pVar2 != null) {
            pVar2.f30288b = new km.y(4, this);
            pVar2.f30289c.setVisibilityListener(pVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f30285y & 8) == 0) {
            return false;
        }
        if (this.f30286z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f30274n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f30283w && (this.f30281u || this.f30282v)) {
            drawable = drawable.mutate();
            if (this.f30281u) {
                drawable.setTintList(this.f30279s);
            }
            if (this.f30282v) {
                drawable.setTintMode(this.f30280t);
            }
            this.f30283w = false;
        }
        return drawable;
    }

    public final boolean e() {
        p pVar;
        if ((this.f30285y & 8) != 0) {
            if (this.f30286z == null && (pVar = this.A) != null) {
                this.f30286z = pVar.f30289c.onCreateActionView(this);
            }
            if (this.f30286z != null) {
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
            return this.f30274n.f(this);
        }
        return false;
    }

    public final void f(boolean z3) {
        if (z3) {
            this.f30284x |= 32;
        } else {
            this.f30284x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f30286z;
        if (view != null) {
            return view;
        }
        p pVar = this.A;
        if (pVar == null) {
            return null;
        }
        View viewOnCreateActionView = pVar.f30289c.onCreateActionView(this);
        this.f30286z = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // y3.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f30271k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // y3.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f30277q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f30264b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f30272l;
        if (drawable != null) {
            return d(drawable);
        }
        int i4 = this.f30273m;
        if (i4 == 0) {
            return null;
        }
        Drawable drawableL = jm.a.l(i4, this.f30274n.f30238a);
        this.f30273m = 0;
        this.f30272l = drawableL;
        return d(drawableL);
    }

    @Override // y3.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f30279s;
    }

    @Override // y3.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f30280t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f30263a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // y3.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f30270i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f30269h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f30265c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f30275o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f30267e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f30268f;
        return charSequence != null ? charSequence : this.f30267e;
    }

    @Override // y3.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f30278r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f30275o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f30284x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f30284x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f30284x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        p pVar = this.A;
        return (pVar == null || !pVar.f30289c.overridesItemVisibility()) ? (this.f30284x & 8) == 0 : (this.f30284x & 8) == 0 && this.A.f30289c.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i4;
        this.f30286z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i4 = this.f30263a) > 0) {
            view.setId(i4);
        }
        m mVar = this.f30274n;
        mVar.f30246k = true;
        mVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c9) {
        if (this.j == c9) {
            return this;
        }
        this.j = Character.toLowerCase(c9);
        this.f30274n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z3) {
        int i4 = this.f30284x;
        int i10 = (z3 ? 1 : 0) | (i4 & (-2));
        this.f30284x = i10;
        if (i4 != i10) {
            this.f30274n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z3) {
        int i4 = this.f30284x;
        int i10 = i4 & 4;
        m mVar = this.f30274n;
        if (i10 == 0) {
            int i11 = (i4 & (-3)) | (z3 ? 2 : 0);
            this.f30284x = i11;
            if (i4 != i11) {
                mVar.p(false);
            }
            return this;
        }
        ArrayList arrayList = mVar.f30243f;
        int size = arrayList.size();
        mVar.w();
        for (int i12 = 0; i12 < size; i12++) {
            o oVar = (o) arrayList.get(i12);
            if (oVar.f30264b == this.f30264b && (oVar.f30284x & 4) != 0 && oVar.isCheckable()) {
                boolean z10 = oVar == this;
                int i13 = oVar.f30284x;
                int i14 = (z10 ? 2 : 0) | (i13 & (-3));
                oVar.f30284x = i14;
                if (i13 != i14) {
                    oVar.f30274n.p(false);
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
    public final MenuItem setEnabled(boolean z3) {
        if (z3) {
            this.f30284x |= 16;
        } else {
            this.f30284x &= -17;
        }
        this.f30274n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f30273m = 0;
        this.f30272l = drawable;
        this.f30283w = true;
        this.f30274n.p(false);
        return this;
    }

    @Override // y3.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f30279s = colorStateList;
        this.f30281u = true;
        this.f30283w = true;
        this.f30274n.p(false);
        return this;
    }

    @Override // y3.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f30280t = mode;
        this.f30282v = true;
        this.f30283w = true;
        this.f30274n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c9) {
        if (this.f30269h == c9) {
            return this;
        }
        this.f30269h = c9;
        this.f30274n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f30276p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c9, char c10) {
        this.f30269h = c9;
        this.j = Character.toLowerCase(c10);
        this.f30274n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i4) {
        int i10 = i4 & 3;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f30285y = i4;
        m mVar = this.f30274n;
        mVar.f30246k = true;
        mVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i4) {
        setShowAsAction(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f30267e = charSequence;
        this.f30274n.p(false);
        e0 e0Var = this.f30275o;
        if (e0Var != null) {
            e0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f30268f = charSequence;
        this.f30274n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z3) {
        int i4 = this.f30284x;
        int i10 = (z3 ? 0 : 8) | (i4 & (-9));
        this.f30284x = i10;
        if (i4 != i10) {
            m mVar = this.f30274n;
            mVar.f30244h = true;
            mVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f30267e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // y3.a, android.view.MenuItem
    public final y3.a setContentDescription(CharSequence charSequence) {
        this.f30277q = charSequence;
        this.f30274n.p(false);
        return this;
    }

    @Override // y3.a, android.view.MenuItem
    public final y3.a setTooltipText(CharSequence charSequence) {
        this.f30278r = charSequence;
        this.f30274n.p(false);
        return this;
    }

    @Override // y3.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c9, int i4) {
        if (this.j == c9 && this.f30271k == i4) {
            return this;
        }
        this.j = Character.toLowerCase(c9);
        this.f30271k = KeyEvent.normalizeMetaState(i4);
        this.f30274n.p(false);
        return this;
    }

    @Override // y3.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c9, int i4) {
        if (this.f30269h == c9 && this.f30270i == i4) {
            return this;
        }
        this.f30269h = c9;
        this.f30270i = KeyEvent.normalizeMetaState(i4);
        this.f30274n.p(false);
        return this;
    }

    @Override // y3.a, android.view.MenuItem
    public final MenuItem setShortcut(char c9, char c10, int i4, int i10) {
        this.f30269h = c9;
        this.f30270i = KeyEvent.normalizeMetaState(i4);
        this.j = Character.toLowerCase(c10);
        this.f30271k = KeyEvent.normalizeMetaState(i10);
        this.f30274n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i4) {
        this.f30272l = null;
        this.f30273m = i4;
        this.f30283w = true;
        this.f30274n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i4) {
        setTitle(this.f30274n.f30238a.getString(i4));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i4) {
        int i10;
        m mVar = this.f30274n;
        Context context = mVar.f30238a;
        View viewInflate = LayoutInflater.from(context).inflate(i4, (ViewGroup) new LinearLayout(context), false);
        this.f30286z = viewInflate;
        this.A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i10 = this.f30263a) > 0) {
            viewInflate.setId(i10);
        }
        mVar.f30246k = true;
        mVar.p(true);
        return this;
    }
}
