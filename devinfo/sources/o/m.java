package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import e4.w0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class m implements Menu {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f30237y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f30238a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f30239b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30240c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f30241d;

    /* renamed from: e, reason: collision with root package name */
    public k f30242e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f30243f;
    public final ArrayList g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f30244h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f30245i;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f30246k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f30248m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f30249n;

    /* renamed from: o, reason: collision with root package name */
    public View f30250o;

    /* renamed from: v, reason: collision with root package name */
    public o f30257v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f30259x;

    /* renamed from: l, reason: collision with root package name */
    public int f30247l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f30251p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f30252q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f30253r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f30254s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f30255t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList f30256u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f30258w = false;

    public m(Context context) {
        boolean zF;
        boolean z3 = false;
        this.f30238a = context;
        Resources resources = context.getResources();
        this.f30239b = resources;
        this.f30243f = new ArrayList();
        this.g = new ArrayList();
        this.f30244h = true;
        this.f30245i = new ArrayList();
        this.j = new ArrayList();
        this.f30246k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = w0.f22414a;
            if (Build.VERSION.SDK_INT >= 28) {
                zF = a4.f.F(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zF = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zF) {
                z3 = true;
            }
        }
        this.f30241d = z3;
    }

    public final o a(int i4, int i10, int i11, CharSequence charSequence) {
        int i12;
        int i13 = ((-65536) & i11) >> 16;
        if (i13 < 0 || i13 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i14 = (f30237y[i13] << 16) | (65535 & i11);
        o oVar = new o(this, i4, i10, i11, i14, charSequence, this.f30247l);
        ArrayList arrayList = this.f30243f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i12 = 0;
                break;
            }
            if (((o) arrayList.get(size)).f30266d <= i14) {
                i12 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i12, oVar);
        p(true);
        return oVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i4, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        int i13;
        PackageManager packageManager = this.f30238a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i12 & 1) == 0) {
            removeGroup(i4);
        }
        for (int i14 = 0; i14 < size; i14++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i14);
            int i15 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i15 < 0 ? intent : intentArr[i15]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            o oVarA = a(i4, i10, i11, resolveInfo.loadLabel(packageManager));
            oVarA.setIcon(resolveInfo.loadIcon(packageManager));
            oVarA.g = intent2;
            if (menuItemArr != null && (i13 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i13] = oVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(y yVar, Context context) {
        this.f30256u.add(new WeakReference(yVar));
        yVar.b(context, this);
        this.f30246k = true;
    }

    public final void c(boolean z3) {
        if (this.f30254s) {
            return;
        }
        this.f30254s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f30256u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.e(this, z3);
            }
        }
        this.f30254s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        o oVar = this.f30257v;
        if (oVar != null) {
            d(oVar);
        }
        this.f30243f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f30249n = null;
        this.f30248m = null;
        this.f30250o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f30256u;
        boolean zJ = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f30257v == oVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zJ = yVar.j(oVar);
                    if (zJ) {
                        break;
                    }
                }
            }
            v();
            if (zJ) {
                this.f30257v = null;
            }
        }
        return zJ;
    }

    public boolean e(m mVar, MenuItem menuItem) {
        k kVar = this.f30242e;
        return kVar != null && kVar.f(mVar, menuItem);
    }

    public boolean f(o oVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f30256u;
        boolean zG = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zG = yVar.g(oVar);
                if (zG) {
                    break;
                }
            }
        }
        v();
        if (zG) {
            this.f30257v = oVar;
        }
        return zG;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i4) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f30243f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            o oVar = (o) arrayList.get(i10);
            if (oVar.f30263a == i4) {
                return oVar;
            }
            if (oVar.hasSubMenu() && (menuItemFindItem = oVar.f30275o.findItem(i4)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final o g(int i4, KeyEvent keyEvent) {
        ArrayList arrayList = this.f30255t;
        arrayList.clear();
        h(arrayList, i4, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (o) arrayList.get(0);
        }
        boolean zN = n();
        for (int i10 = 0; i10 < size; i10++) {
            o oVar = (o) arrayList.get(i10);
            char c9 = zN ? oVar.j : oVar.f30269h;
            char[] cArr = keyData.meta;
            if ((c9 == cArr[0] && (metaState & 2) == 0) || ((c9 == cArr[2] && (metaState & 2) != 0) || (zN && c9 == '\b' && i4 == 67))) {
                return oVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i4) {
        return (MenuItem) this.f30243f.get(i4);
    }

    public final void h(List list, int i4, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i4 == 67) {
            ArrayList arrayList = this.f30243f;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                o oVar = (o) arrayList.get(i10);
                if (oVar.hasSubMenu()) {
                    oVar.f30275o.h(list, i4, keyEvent);
                }
                char c9 = zN ? oVar.j : oVar.f30269h;
                if ((modifiers & 69647) == ((zN ? oVar.f30271k : oVar.f30270i) & 69647) && c9 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c9 == cArr[0] || c9 == cArr[2] || (zN && c9 == '\b' && i4 == 67)) && oVar.isEnabled()) {
                        list.add(oVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f30259x) {
            return true;
        }
        ArrayList arrayList = this.f30243f;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (((o) arrayList.get(i4)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.f30246k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f30256u;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean zC = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                y yVar = (y) weakReference.get();
                if (yVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zC |= yVar.c();
                }
            }
            ArrayList arrayList = this.f30245i;
            ArrayList arrayList2 = this.j;
            if (zC) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i4 = 0; i4 < size; i4++) {
                    o oVar = (o) arrayListL.get(i4);
                    if ((oVar.f30284x & 32) == 32) {
                        arrayList.add(oVar);
                    } else {
                        arrayList2.add(oVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f30246k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        return g(i4, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z3 = this.f30244h;
        ArrayList arrayList = this.g;
        if (!z3) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f30243f;
        int size = arrayList2.size();
        for (int i4 = 0; i4 < size; i4++) {
            o oVar = (o) arrayList2.get(i4);
            if (oVar.isVisible()) {
                arrayList.add(oVar);
            }
        }
        this.f30244h = false;
        this.f30246k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f30258w;
    }

    public boolean n() {
        return this.f30240c;
    }

    public boolean o() {
        return this.f30241d;
    }

    public final void p(boolean z3) {
        if (this.f30251p) {
            this.f30252q = true;
            if (z3) {
                this.f30253r = true;
                return;
            }
            return;
        }
        if (z3) {
            this.f30244h = true;
            this.f30246k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f30256u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                yVar.f();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i4, int i10) {
        return q(findItem(i4), null, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i4, KeyEvent keyEvent, int i10) {
        o oVarG = g(i4, keyEvent);
        boolean zQ = oVarG != null ? q(oVarG, null, i10) : false;
        if ((i10 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.MenuItem r7, o.y r8, int r9) {
        /*
            r6 = this;
            o.o r7 = (o.o) r7
            r0 = 0
            if (r7 == 0) goto Ld2
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld2
        Ld:
            o.m r1 = r7.f30274n
            android.view.MenuItem$OnMenuItemClickListener r2 = r7.f30276p
            r3 = 1
            if (r2 == 0) goto L1c
            boolean r2 = r2.onMenuItemClick(r7)
            if (r2 == 0) goto L1c
        L1a:
            r1 = r3
            goto L43
        L1c:
            boolean r2 = r1.e(r1, r7)
            if (r2 == 0) goto L23
            goto L1a
        L23:
            android.content.Intent r2 = r7.g
            if (r2 == 0) goto L35
            android.content.Context r1 = r1.f30238a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r2)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L1a
        L2d:
            r1 = move-exception
            java.lang.String r2 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r2, r4, r1)
        L35:
            o.p r1 = r7.A
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.f30289c
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
            goto L1a
        L42:
            r1 = r0
        L43:
            o.p r2 = r7.A
            if (r2 == 0) goto L51
            android.view.ActionProvider r4 = r2.f30289c
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L51
            r4 = r3
            goto L52
        L51:
            r4 = r0
        L52:
            boolean r5 = r7.e()
            if (r5 == 0) goto L64
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld1
            r6.c(r3)
            goto Ld1
        L64:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L75
            if (r4 == 0) goto L6d
            goto L75
        L6d:
            r7 = r9 & 1
            if (r7 != 0) goto Ld1
            r6.c(r3)
            goto Ld1
        L75:
            r9 = r9 & 4
            if (r9 != 0) goto L7c
            r6.c(r0)
        L7c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L90
            o.e0 r9 = new o.e0
            android.content.Context r5 = r6.f30238a
            r9.<init>(r5, r6, r7)
            r7.f30275o = r9
            java.lang.CharSequence r5 = r7.f30267e
            r9.setHeaderTitle(r5)
        L90:
            o.e0 r7 = r7.f30275o
            if (r4 == 0) goto L99
            android.view.ActionProvider r9 = r2.f30289c
            r9.onPrepareSubMenu(r7)
        L99:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f30256u
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto La2
            goto Lcb
        La2:
            if (r8 == 0) goto La8
            boolean r0 = r8.d(r7)
        La8:
            java.util.Iterator r8 = r9.iterator()
        Lac:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lcb
            java.lang.Object r2 = r8.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r4 = r2.get()
            o.y r4 = (o.y) r4
            if (r4 != 0) goto Lc4
            r9.remove(r2)
            goto Lac
        Lc4:
            if (r0 != 0) goto Lac
            boolean r0 = r4.d(r7)
            goto Lac
        Lcb:
            r1 = r1 | r0
            if (r1 != 0) goto Ld1
            r6.c(r3)
        Ld1:
            return r1
        Ld2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.m.q(android.view.MenuItem, o.y, int):boolean");
    }

    public final void r(y yVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f30256u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar2 = (y) weakReference.get();
            if (yVar2 == null || yVar2 == yVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i4) {
        ArrayList arrayList = this.f30243f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((o) arrayList.get(i11)).f30264b == i4) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            int size2 = arrayList.size() - i11;
            while (true) {
                int i12 = i10 + 1;
                if (i10 >= size2 || ((o) arrayList.get(i11)).f30264b != i4) {
                    break;
                }
                if (i11 >= 0 && i11 < arrayList.size()) {
                    arrayList.remove(i11);
                }
                i10 = i12;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i4) {
        ArrayList arrayList = this.f30243f;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (((o) arrayList.get(i10)).f30263a == i4) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i10);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f30243f.size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = getItem(i4);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((e0) item.getSubMenu()).s(bundle);
            }
        }
        int i10 = bundle.getInt("android:menu:expandedactionview");
        if (i10 <= 0 || (menuItemFindItem = findItem(i10)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i4, boolean z3, boolean z10) {
        ArrayList arrayList = this.f30243f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            o oVar = (o) arrayList.get(i10);
            if (oVar.f30264b == i4) {
                oVar.f30284x = (oVar.f30284x & (-5)) | (z10 ? 4 : 0);
                oVar.setCheckable(z3);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z3) {
        this.f30258w = z3;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i4, boolean z3) {
        ArrayList arrayList = this.f30243f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            o oVar = (o) arrayList.get(i10);
            if (oVar.f30264b == i4) {
                oVar.setEnabled(z3);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i4, boolean z3) {
        ArrayList arrayList = this.f30243f;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            o oVar = (o) arrayList.get(i10);
            if (oVar.f30264b == i4) {
                int i11 = oVar.f30284x;
                int i12 = (i11 & (-9)) | (z3 ? 0 : 8);
                oVar.f30284x = i12;
                if (i11 != i12) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z3) {
        this.f30240c = z3;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f30243f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f30243f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = getItem(i4);
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
                ((e0) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i4, CharSequence charSequence, int i10, Drawable drawable, View view) {
        if (view != null) {
            this.f30250o = view;
            this.f30248m = null;
            this.f30249n = null;
        } else {
            if (i4 > 0) {
                this.f30248m = this.f30239b.getText(i4);
            } else if (charSequence != null) {
                this.f30248m = charSequence;
            }
            if (i10 > 0) {
                this.f30249n = this.f30238a.getDrawable(i10);
            } else if (drawable != null) {
                this.f30249n = drawable;
            }
            this.f30250o = null;
        }
        p(false);
    }

    public final void v() {
        this.f30251p = false;
        if (this.f30252q) {
            this.f30252q = false;
            p(this.f30253r);
        }
    }

    public final void w() {
        if (this.f30251p) {
            return;
        }
        this.f30251p = true;
        this.f30252q = false;
        this.f30253r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4) {
        return a(0, 0, 0, this.f30239b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4) {
        return addSubMenu(0, 0, 0, this.f30239b.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i10, int i11, CharSequence charSequence) {
        return a(i4, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4, int i10, int i11, CharSequence charSequence) {
        o oVarA = a(i4, i10, i11, charSequence);
        e0 e0Var = new e0(this.f30238a, this, oVarA);
        oVarA.f30275o = e0Var;
        e0Var.setHeaderTitle(oVarA.f30267e);
        return e0Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i4, int i10, int i11, int i12) {
        return a(i4, i10, i11, this.f30239b.getString(i12));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i4, int i10, int i11, int i12) {
        return addSubMenu(i4, i10, i11, this.f30239b.getString(i12));
    }

    public m k() {
        return this;
    }
}
