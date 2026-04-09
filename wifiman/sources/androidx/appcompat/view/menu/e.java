package androidx.appcompat.view.menu;

import F1.AbstractC2738b;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import t1.AbstractC8021a;
import y1.InterfaceMenuC8606a;

/* loaded from: classes.dex */
public class e implements InterfaceMenuC8606a {

    /* renamed from: A, reason: collision with root package name */
    private static final int[] f26841A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    private final Context f26842a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f26843b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f26844c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f26845d;

    /* renamed from: e, reason: collision with root package name */
    private a f26846e;

    /* renamed from: m, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f26854m;

    /* renamed from: n, reason: collision with root package name */
    CharSequence f26855n;

    /* renamed from: o, reason: collision with root package name */
    Drawable f26856o;

    /* renamed from: p, reason: collision with root package name */
    View f26857p;

    /* renamed from: x, reason: collision with root package name */
    private g f26865x;

    /* renamed from: z, reason: collision with root package name */
    private boolean f26867z;

    /* renamed from: l, reason: collision with root package name */
    private int f26853l = 0;

    /* renamed from: q, reason: collision with root package name */
    private boolean f26858q = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f26859r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f26860s = false;

    /* renamed from: t, reason: collision with root package name */
    private boolean f26861t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f26862u = false;

    /* renamed from: v, reason: collision with root package name */
    private ArrayList f26863v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    private CopyOnWriteArrayList f26864w = new CopyOnWriteArrayList();

    /* renamed from: y, reason: collision with root package name */
    private boolean f26866y = false;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f26847f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f26848g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private boolean f26849h = true;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f26850i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private ArrayList f26851j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private boolean f26852k = true;

    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    public interface b {
        boolean a(g gVar);
    }

    public e(Context context) {
        this.f26842a = context;
        this.f26843b = context.getResources();
        c0(true);
    }

    private static int B(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = f26841A;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void O(int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.f26847f.size()) {
            return;
        }
        this.f26847f.remove(i10);
        if (z10) {
            L(true);
        }
    }

    private void X(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources resourcesC = C();
        if (view != null) {
            this.f26857p = view;
            this.f26855n = null;
            this.f26856o = null;
        } else {
            if (i10 > 0) {
                this.f26855n = resourcesC.getText(i10);
            } else if (charSequence != null) {
                this.f26855n = charSequence;
            }
            if (i11 > 0) {
                this.f26856o = AbstractC8021a.e(u(), i11);
            } else if (drawable != null) {
                this.f26856o = drawable;
            }
            this.f26857p = null;
        }
        L(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.f26843b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f26842a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f26842a
            boolean r3 = F1.Z.j(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f26845d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.c0(boolean):void");
    }

    private g g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new g(this, i10, i11, i12, i13, charSequence, i14);
    }

    private void i(boolean z10) {
        if (this.f26864w.isEmpty()) {
            return;
        }
        e0();
        Iterator it = this.f26864w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            j jVar = (j) weakReference.get();
            if (jVar == null) {
                this.f26864w.remove(weakReference);
            } else {
                jVar.d(z10);
            }
        }
        d0();
    }

    private boolean j(m mVar, j jVar) {
        if (this.f26864w.isEmpty()) {
            return false;
        }
        boolean zK = jVar != null ? jVar.k(mVar) : false;
        Iterator it = this.f26864w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            j jVar2 = (j) weakReference.get();
            if (jVar2 == null) {
                this.f26864w.remove(weakReference);
            } else if (!zK) {
                zK = jVar2.k(mVar);
            }
        }
        return zK;
    }

    private static int n(ArrayList arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((g) arrayList.get(size)).f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    boolean A() {
        return this.f26861t;
    }

    Resources C() {
        return this.f26843b;
    }

    public e D() {
        return this;
    }

    public ArrayList E() {
        if (!this.f26849h) {
            return this.f26848g;
        }
        this.f26848g.clear();
        int size = this.f26847f.size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.f26847f.get(i10);
            if (gVar.isVisible()) {
                this.f26848g.add(gVar);
            }
        }
        this.f26849h = false;
        this.f26852k = true;
        return this.f26848g;
    }

    public boolean F() {
        return !this.f26858q;
    }

    public boolean G() {
        return this.f26866y;
    }

    boolean H() {
        return this.f26844c;
    }

    public boolean I() {
        return this.f26845d;
    }

    void J(g gVar) {
        this.f26852k = true;
        L(true);
    }

    void K(g gVar) {
        this.f26849h = true;
        L(true);
    }

    public void L(boolean z10) {
        if (this.f26858q) {
            this.f26859r = true;
            if (z10) {
                this.f26860s = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f26849h = true;
            this.f26852k = true;
        }
        i(z10);
    }

    public boolean M(MenuItem menuItem, int i10) {
        return N(menuItem, null, i10);
    }

    public boolean N(MenuItem menuItem, j jVar, int i10) {
        g gVar = (g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean zK = gVar.k();
        AbstractC2738b abstractC2738bB = gVar.b();
        boolean z10 = abstractC2738bB != null && abstractC2738bB.a();
        if (gVar.j()) {
            zK |= gVar.expandActionView();
            if (zK) {
                e(true);
            }
        } else if (gVar.hasSubMenu() || z10) {
            if ((i10 & 4) == 0) {
                e(false);
            }
            if (!gVar.hasSubMenu()) {
                gVar.x(new m(u(), this, gVar));
            }
            m mVar = (m) gVar.getSubMenu();
            if (z10) {
                abstractC2738bB.e(mVar);
            }
            zK |= j(mVar, jVar);
            if (!zK) {
                e(true);
            }
        } else if ((i10 & 1) == 0) {
            e(true);
        }
        return zK;
    }

    public void P(j jVar) {
        Iterator it = this.f26864w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            j jVar2 = (j) weakReference.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f26864w.remove(weakReference);
            }
        }
    }

    public void Q(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).Q(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void R(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).R(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void S(a aVar) {
        this.f26846e = aVar;
    }

    public e T(int i10) {
        this.f26853l = i10;
        return this;
    }

    void U(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f26847f.size();
        e0();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.f26847f.get(i10);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        d0();
    }

    protected e V(int i10) {
        X(0, null, i10, null, null);
        return this;
    }

    protected e W(Drawable drawable) {
        X(0, null, 0, drawable, null);
        return this;
    }

    protected e Y(int i10) {
        X(i10, null, 0, null, null);
        return this;
    }

    protected e Z(CharSequence charSequence) {
        X(0, charSequence, 0, null, null);
        return this;
    }

    protected MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int iB = B(i12);
        g gVarG = g(i10, i11, i12, iB, charSequence, this.f26853l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f26854m;
        if (contextMenuInfo != null) {
            gVarG.v(contextMenuInfo);
        }
        ArrayList arrayList = this.f26847f;
        arrayList.add(n(arrayList, iB), gVarG);
        L(true);
        return gVarG;
    }

    protected e a0(View view) {
        X(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f26842a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(j jVar) {
        c(jVar, this.f26842a);
    }

    public void b0(boolean z10) {
        this.f26867z = z10;
    }

    public void c(j jVar, Context context) {
        this.f26864w.add(new WeakReference(jVar));
        jVar.i(context, this);
        this.f26852k = true;
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.f26865x;
        if (gVar != null) {
            f(gVar);
        }
        this.f26847f.clear();
        L(true);
    }

    public void clearHeader() {
        this.f26856o = null;
        this.f26855n = null;
        this.f26857p = null;
        L(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f26846e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        this.f26858q = false;
        if (this.f26859r) {
            this.f26859r = false;
            L(this.f26860s);
        }
    }

    public final void e(boolean z10) {
        if (this.f26862u) {
            return;
        }
        this.f26862u = true;
        Iterator it = this.f26864w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            j jVar = (j) weakReference.get();
            if (jVar == null) {
                this.f26864w.remove(weakReference);
            } else {
                jVar.c(this, z10);
            }
        }
        this.f26862u = false;
    }

    public void e0() {
        if (this.f26858q) {
            return;
        }
        this.f26858q = true;
        this.f26859r = false;
        this.f26860s = false;
    }

    public boolean f(g gVar) {
        boolean zF = false;
        if (!this.f26864w.isEmpty() && this.f26865x == gVar) {
            e0();
            Iterator it = this.f26864w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                j jVar = (j) weakReference.get();
                if (jVar == null) {
                    this.f26864w.remove(weakReference);
                } else {
                    zF = jVar.f(this, gVar);
                    if (zF) {
                        break;
                    }
                }
            }
            d0();
            if (zF) {
                this.f26865x = null;
            }
        }
        return zF;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f26847f.get(i11);
            if (gVar.getItemId() == i10) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (menuItemFindItem = gVar.getSubMenu().findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return (MenuItem) this.f26847f.get(i10);
    }

    boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.f26846e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f26867z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((g) this.f26847f.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return p(i10, keyEvent) != null;
    }

    public boolean k(g gVar) {
        boolean zG = false;
        if (this.f26864w.isEmpty()) {
            return false;
        }
        e0();
        Iterator it = this.f26864w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            j jVar = (j) weakReference.get();
            if (jVar == null) {
                this.f26864w.remove(weakReference);
            } else {
                zG = jVar.g(this, gVar);
                if (zG) {
                    break;
                }
            }
        }
        d0();
        if (zG) {
            this.f26865x = gVar;
        }
        return zG;
    }

    public int l(int i10) {
        return m(i10, 0);
    }

    public int m(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (((g) this.f26847f.get(i11)).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public int o(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((g) this.f26847f.get(i11)).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    g p(int i10, KeyEvent keyEvent) {
        ArrayList arrayList = this.f26863v;
        arrayList.clear();
        q(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (g) arrayList.get(0);
        }
        boolean zH = H();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) arrayList.get(i11);
            char alphabeticShortcut = zH ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zH && alphabeticShortcut == '\b' && i10 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return M(findItem(i10), i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        g gVarP = p(i10, keyEvent);
        boolean zM = gVarP != null ? M(gVarP, i11) : false;
        if ((i11 & 2) != 0) {
            e(true);
        }
        return zM;
    }

    void q(List list, int i10, KeyEvent keyEvent) {
        boolean zH = H();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f26847f.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = (g) this.f26847f.get(i11);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).q(list, i10, keyEvent);
                }
                char alphabeticShortcut = zH ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if ((modifiers & 69647) == ((zH ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zH && alphabeticShortcut == '\b' && i10 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList arrayListE = E();
        if (this.f26852k) {
            Iterator it = this.f26864w.iterator();
            boolean zE = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                j jVar = (j) weakReference.get();
                if (jVar == null) {
                    this.f26864w.remove(weakReference);
                } else {
                    zE |= jVar.e();
                }
            }
            if (zE) {
                this.f26850i.clear();
                this.f26851j.clear();
                int size = arrayListE.size();
                for (int i10 = 0; i10 < size; i10++) {
                    g gVar = (g) arrayListE.get(i10);
                    if (gVar.l()) {
                        this.f26850i.add(gVar);
                    } else {
                        this.f26851j.add(gVar);
                    }
                }
            } else {
                this.f26850i.clear();
                this.f26851j.clear();
                this.f26851j.addAll(E());
            }
            this.f26852k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int iL = l(i10);
        if (iL >= 0) {
            int size = this.f26847f.size() - iL;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || ((g) this.f26847f.get(iL)).getGroupId() != i10) {
                    break;
                }
                O(iL, false);
                i11 = i12;
            }
            L(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        O(o(i10), true);
    }

    public ArrayList s() {
        r();
        return this.f26850i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f26847f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f26847f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.t(z11);
                gVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f26866y = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f26847f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f26847f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f26847f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = (g) this.f26847f.get(i11);
            if (gVar.getGroupId() == i10 && gVar.y(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            L(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f26844c = z10;
        L(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f26847f.size();
    }

    protected String t() {
        return "android:menu:actionviewstates";
    }

    public Context u() {
        return this.f26842a;
    }

    public g v() {
        return this.f26865x;
    }

    public Drawable w() {
        return this.f26856o;
    }

    public CharSequence x() {
        return this.f26855n;
    }

    public View y() {
        return this.f26857p;
    }

    public ArrayList z() {
        r();
        return this.f26851j;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f26843b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f26843b.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        g gVar = (g) a(i10, i11, i12, charSequence);
        m mVar = new m(this.f26842a, this, gVar);
        gVar.x(mVar);
        return mVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f26843b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f26843b.getString(i13));
    }
}
