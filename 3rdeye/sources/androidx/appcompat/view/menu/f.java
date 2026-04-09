package androidx.appcompat.view.menu;

import L0.K;
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
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import z0.C5848a;

/* compiled from: MenuBuilder.java */
/* loaded from: classes.dex */
public class f implements E0.a {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f14430y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f14431a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f14432b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14433c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14434d;

    /* renamed from: e, reason: collision with root package name */
    public a f14435e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList<h> f14436f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList<h> f14437g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14438h;
    public final ArrayList<h> i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList<h> f14439j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14440k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f14442m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f14443n;

    /* renamed from: o, reason: collision with root package name */
    public View f14444o;

    /* renamed from: v, reason: collision with root package name */
    public h f14451v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f14453x;

    /* renamed from: l, reason: collision with root package name */
    public int f14441l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f14445p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f14446q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f14447r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f14448s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList<h> f14449t = new ArrayList<>();

    /* renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList<WeakReference<j>> f14450u = new CopyOnWriteArrayList<>();

    /* renamed from: w, reason: collision with root package name */
    public boolean f14452w = false;

    /* compiled from: MenuBuilder.java */
    public interface a {
        boolean a(f fVar, MenuItem menuItem);

        void b(f fVar);
    }

    /* compiled from: MenuBuilder.java */
    public interface b {
        boolean a(h hVar);
    }

    public f(Context context) {
        boolean zB;
        boolean z10 = false;
        this.f14431a = context;
        Resources resources = context.getResources();
        this.f14432b = resources;
        this.f14436f = new ArrayList<>();
        this.f14437g = new ArrayList<>();
        this.f14438h = true;
        this.i = new ArrayList<>();
        this.f14439j = new ArrayList<>();
        this.f14440k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = K.f3812a;
            if (Build.VERSION.SDK_INT >= 28) {
                zB = K.b.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", ConstantDeviceInfo.APP_PLATFORM);
                zB = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zB) {
                z10 = true;
            }
        }
        this.f14434d = z10;
    }

    public final h a(int i, int i10, int i11, CharSequence charSequence) {
        int i12;
        int i13 = ((-65536) & i11) >> 16;
        if (i13 < 0 || i13 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i14 = (f14430y[i13] << 16) | (65535 & i11);
        h hVar = new h(this, i, i10, i11, i14, charSequence, this.f14441l);
        ArrayList<h> arrayList = this.f14436f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i12 = 0;
                break;
            }
            if (arrayList.get(size).f14463d <= i14) {
                i12 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i12, hVar);
        p(true);
        return hVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        int i13;
        PackageManager packageManager = this.f14431a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i12 & 1) == 0) {
            removeGroup(i);
        }
        for (int i14 = 0; i14 < size; i14++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i14);
            int i15 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i15 < 0 ? intent : intentArr[i15]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            h hVarA = a(i, i10, i11, resolveInfo.loadLabel(packageManager));
            hVarA.setIcon(resolveInfo.loadIcon(packageManager));
            hVarA.f14466g = intent2;
            if (menuItemArr != null && (i13 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i13] = hVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(j jVar, Context context) {
        this.f14450u.add(new WeakReference<>(jVar));
        jVar.f(context, this);
        this.f14440k = true;
    }

    public final void c(boolean z10) {
        if (this.f14448s) {
            return;
        }
        this.f14448s = true;
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f14450u;
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                jVar.b(this, z10);
            }
        }
        this.f14448s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        h hVar = this.f14451v;
        if (hVar != null) {
            d(hVar);
        }
        this.f14436f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f14443n = null;
        this.f14442m = null;
        this.f14444o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(h hVar) {
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f14450u;
        boolean zE = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f14451v == hVar) {
            w();
            Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    zE = jVar.e(hVar);
                    if (zE) {
                        break;
                    }
                }
            }
            v();
            if (zE) {
                this.f14451v = null;
            }
        }
        return zE;
    }

    public boolean e(f fVar, MenuItem menuItem) {
        a aVar = this.f14435e;
        return aVar != null && aVar.a(fVar, menuItem);
    }

    public boolean f(h hVar) {
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f14450u;
        boolean zJ = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                zJ = jVar.j(hVar);
                if (zJ) {
                    break;
                }
            }
        }
        v();
        if (zJ) {
            this.f14451v = hVar;
        }
        return zJ;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList<h> arrayList = this.f14436f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = arrayList.get(i10);
            if (hVar.f14460a == i) {
                return hVar;
            }
            if (hVar.hasSubMenu() && (menuItemFindItem = hVar.f14473o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final h g(int i, KeyEvent keyEvent) {
        ArrayList<h> arrayList = this.f14449t;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zN = n();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = arrayList.get(i10);
            char c10 = zN ? hVar.f14468j : hVar.f14467h;
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (zN && c10 == '\b' && i == 67))) {
                return hVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return this.f14436f.get(i);
    }

    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList<h> arrayList2 = this.f14436f;
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                h hVar = arrayList2.get(i10);
                if (hVar.hasSubMenu()) {
                    hVar.f14473o.h(arrayList, i, keyEvent);
                }
                char c10 = zN ? hVar.f14468j : hVar.f14467h;
                if ((modifiers & 69647) == ((zN ? hVar.f14469k : hVar.i) & 69647) && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c10 == cArr[0] || c10 == cArr[2] || (zN && c10 == '\b' && i == 67)) && hVar.isEnabled()) {
                        arrayList.add(hVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f14453x) {
            return true;
        }
        ArrayList<h> arrayList = this.f14436f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList<h> arrayListL = l();
        if (this.f14440k) {
            CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f14450u;
            Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
            boolean zC = false;
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    copyOnWriteArrayList.remove(next);
                } else {
                    zC |= jVar.c();
                }
            }
            ArrayList<h> arrayList = this.i;
            ArrayList<h> arrayList2 = this.f14439j;
            if (zC) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i = 0; i < size; i++) {
                    h hVar = arrayListL.get(i);
                    if ((hVar.f14482x & 32) == 32) {
                        arrayList.add(hVar);
                    } else {
                        arrayList2.add(hVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f14440k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList<h> l() {
        boolean z10 = this.f14438h;
        ArrayList<h> arrayList = this.f14437g;
        if (!z10) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList<h> arrayList2 = this.f14436f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            h hVar = arrayList2.get(i);
            if (hVar.isVisible()) {
                arrayList.add(hVar);
            }
        }
        this.f14438h = false;
        this.f14440k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f14452w;
    }

    public boolean n() {
        return this.f14433c;
    }

    public boolean o() {
        return this.f14434d;
    }

    public final void p(boolean z10) {
        if (this.f14445p) {
            this.f14446q = true;
            if (z10) {
                this.f14447r = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f14438h = true;
            this.f14440k = true;
        }
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f14450u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(next);
            } else {
                jVar.g();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i10) {
        return q(findItem(i), null, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i10) {
        h hVarG = g(i, keyEvent);
        boolean zQ = hVarG != null ? q(hVarG, null, i10) : false;
        if ((i10 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.MenuItem r7, androidx.appcompat.view.menu.j r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.h r7 = (androidx.appcompat.view.menu.h) r7
            r0 = 0
            if (r7 == 0) goto Lcc
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Lcc
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f14474p
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L1a
        L18:
            r1 = r2
            goto L41
        L1a:
            androidx.appcompat.view.menu.f r1 = r7.f14472n
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r7.f14466g
            if (r3 == 0) goto L35
            android.content.Context r1 = r1.f14431a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L35:
            L0.b r1 = r7.f14457A
            if (r1 == 0) goto L40
            boolean r1 = r1.e()
            if (r1 == 0) goto L40
            goto L18
        L40:
            r1 = r0
        L41:
            L0.b r3 = r7.f14457A
            if (r3 == 0) goto L4d
            boolean r4 = r3.a()
            if (r4 == 0) goto L4d
            r4 = r2
            goto L4e
        L4d:
            r4 = r0
        L4e:
            boolean r5 = r7.e()
            if (r5 == 0) goto L60
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Lcb
            r6.c(r2)
            goto Lcb
        L60:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L71
            if (r4 == 0) goto L69
            goto L71
        L69:
            r7 = r9 & 1
            if (r7 != 0) goto Lcb
            r6.c(r2)
            goto Lcb
        L71:
            r9 = r9 & 4
            if (r9 != 0) goto L78
            r6.c(r0)
        L78:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L8c
            androidx.appcompat.view.menu.m r9 = new androidx.appcompat.view.menu.m
            android.content.Context r5 = r6.f14431a
            r9.<init>(r5, r6, r7)
            r7.f14473o = r9
            java.lang.CharSequence r5 = r7.f14464e
            r9.setHeaderTitle(r5)
        L8c:
            androidx.appcompat.view.menu.m r7 = r7.f14473o
            if (r4 == 0) goto L93
            r3.f(r7)
        L93:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.j>> r9 = r6.f14450u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L9c
            goto Lc5
        L9c:
            if (r8 == 0) goto La2
            boolean r0 = r8.i(r7)
        La2:
            java.util.Iterator r8 = r9.iterator()
        La6:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Lc5
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            androidx.appcompat.view.menu.j r4 = (androidx.appcompat.view.menu.j) r4
            if (r4 != 0) goto Lbe
            r9.remove(r3)
            goto La6
        Lbe:
            if (r0 != 0) goto La6
            boolean r0 = r4.i(r7)
            goto La6
        Lc5:
            r1 = r1 | r0
            if (r1 != 0) goto Lcb
            r6.c(r2)
        Lcb:
            return r1
        Lcc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.f.q(android.view.MenuItem, androidx.appcompat.view.menu.j, int):boolean");
    }

    public final void r(j jVar) {
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f14450u;
        Iterator<WeakReference<j>> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null || jVar2 == jVar) {
                copyOnWriteArrayList.remove(next);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList<h> arrayList = this.f14436f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (arrayList.get(i11).f14461b == i) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            int size2 = arrayList.size() - i11;
            while (true) {
                int i12 = i10 + 1;
                if (i10 >= size2 || arrayList.get(i11).f14461b != i) {
                    break;
                }
                if (i11 >= 0) {
                    ArrayList<h> arrayList2 = this.f14436f;
                    if (i11 < arrayList2.size()) {
                        arrayList2.remove(i11);
                    }
                }
                i10 = i12;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList<h> arrayList = this.f14436f;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (arrayList.get(i10).f14460a == i) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0) {
            ArrayList<h> arrayList2 = this.f14436f;
            if (i10 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i10);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f14436f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).s(bundle);
            }
        }
        int i10 = bundle.getInt("android:menu:expandedactionview");
        if (i10 <= 0 || (menuItemFindItem = findItem(i10)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z10, boolean z11) {
        ArrayList<h> arrayList = this.f14436f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = arrayList.get(i10);
            if (hVar.f14461b == i) {
                hVar.f14482x = (hVar.f14482x & (-5)) | (z11 ? 4 : 0);
                hVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f14452w = z10;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z10) {
        ArrayList<h> arrayList = this.f14436f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = arrayList.get(i10);
            if (hVar.f14461b == i) {
                hVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z10) {
        ArrayList<h> arrayList = this.f14436f;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = arrayList.get(i10);
            if (hVar.f14461b == i) {
                int i11 = hVar.f14482x;
                int i12 = (i11 & (-9)) | (z10 ? 0 : 8);
                hVar.f14482x = i12;
                if (i11 != i12) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f14433c = z10;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f14436f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f14436f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
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
                ((m) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i10, Drawable drawable, View view) {
        if (view != null) {
            this.f14444o = view;
            this.f14442m = null;
            this.f14443n = null;
        } else {
            if (i > 0) {
                this.f14442m = this.f14432b.getText(i);
            } else if (charSequence != null) {
                this.f14442m = charSequence;
            }
            if (i10 > 0) {
                this.f14443n = C5848a.getDrawable(this.f14431a, i10);
            } else if (drawable != null) {
                this.f14443n = drawable;
            }
            this.f14444o = null;
        }
        p(false);
    }

    public final void v() {
        this.f14445p = false;
        if (this.f14446q) {
            this.f14446q = false;
            p(this.f14447r);
        }
    }

    public final void w() {
        if (this.f14445p) {
            return;
        }
        this.f14445p = true;
        this.f14446q = false;
        this.f14447r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f14432b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f14432b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i10, int i11, CharSequence charSequence) {
        return a(i, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i10, int i11, CharSequence charSequence) {
        h hVarA = a(i, i10, i11, charSequence);
        m mVar = new m(this.f14431a, this, hVarA);
        hVarA.f14473o = mVar;
        mVar.setHeaderTitle(hVarA.f14464e);
        return mVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i10, int i11, int i12) {
        return a(i, i10, i11, this.f14432b.getString(i12));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i10, int i11, int i12) {
        return addSubMenu(i, i10, i11, this.f14432b.getString(i12));
    }

    public f k() {
        return this;
    }
}
