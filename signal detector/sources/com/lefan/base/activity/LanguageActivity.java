package com.lefan.base.activity;

import F4.e;
import N.h;
import a4.b;
import a4.c;
import a4.d;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.apm.insight.R;
import d5.AbstractC2282j;
import h.AbstractActivityC2349g;
import h.k;
import java.util.ArrayList;
import java.util.Locale;
import q5.i;
import w4.C2975a;
import w4.C2976b;
import w4.C2978d;
import y5.l;

/* loaded from: classes.dex */
public final class LanguageActivity extends AbstractActivityC2349g implements c {

    /* renamed from: V, reason: collision with root package name */
    public static final /* synthetic */ int f18756V = 0;

    /* renamed from: O, reason: collision with root package name */
    public final C2975a f18757O;

    /* renamed from: P, reason: collision with root package name */
    public final ArrayList f18758P;

    /* renamed from: Q, reason: collision with root package name */
    public final ArrayList f18759Q;

    /* renamed from: R, reason: collision with root package name */
    public b f18760R;

    /* renamed from: S, reason: collision with root package name */
    public Locale f18761S;

    /* renamed from: T, reason: collision with root package name */
    public int f18762T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f18763U;

    public LanguageActivity() {
        C2975a c2975a = new C2975a();
        c2975a.q(0, R.layout.item_language);
        c2975a.q(1, R.layout.item_language_text);
        c2975a.f23970m = e.c(null);
        this.f18757O = c2975a;
        this.f18758P = new ArrayList();
        this.f18759Q = new ArrayList();
        this.f18762T = -1;
    }

    public final void C(String str) {
        ArrayList arrayList = this.f18759Q;
        arrayList.clear();
        C2975a c2975a = this.f18757O;
        ArrayList arrayList2 = this.f18758P;
        if (str == null || str.length() == 0) {
            arrayList.addAll(arrayList2);
            c2975a.notifyDataSetChanged();
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            Locale locale = ((C2976b) obj).f23971a;
            String language = locale.getLanguage();
            i.d(language, "getLanguage(...)");
            if (!l.V(language, str, true)) {
                String displayName = locale.getDisplayName(locale);
                i.d(displayName, "getDisplayName(...)");
                if (!l.V(displayName, str, true)) {
                    String displayName2 = locale.getDisplayName(e.c(null));
                    i.d(displayName2, "getDisplayName(...)");
                    if (l.V(displayName2, str, true)) {
                    }
                }
            }
            arrayList3.add(obj);
        }
        arrayList.addAll(arrayList3);
        this.f18762T = -1;
        c2975a.notifyDataSetChanged();
    }

    @Override // V3.a
    public final void a(Object obj) {
        int i = ((d) obj).f4680b;
        if (i == 5) {
            Locale locale = this.f18761S;
            if (locale == null) {
                return;
            }
            h hVarB = h.b(locale.toLanguageTag());
            i.b(hVarB);
            k.k(hVarB);
            return;
        }
        if (i != 6) {
            return;
        }
        C2976b c2976b = (C2976b) AbstractC2282j.V(this.f18762T, this.f18758P);
        if (c2976b != null) {
            c2976b.f23972b = 3;
        }
        this.f18757O.notifyItemChanged(this.f18762T);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004d A[Catch: all -> 0x0077, Exception -> 0x0079, LOOP:0: B:22:0x0047->B:24:0x004d, LOOP_END, TryCatch #2 {all -> 0x0077, blocks: (B:21:0x003e, B:22:0x0047, B:24:0x004d, B:29:0x007b, B:34:0x0085), top: B:45:0x003e, outer: #0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080 A[Catch: all -> 0x0031, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:11:0x0026, B:12:0x002a, B:31:0x0080, B:40:0x0093, B:41:0x0096, B:20:0x0037, B:21:0x003e, B:22:0x0047, B:24:0x004d, B:29:0x007b, B:34:0x0085), top: B:44:0x0026, inners: #2 }] */
    @Override // h.AbstractActivityC2349g, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r8) {
        /*
            r7 = this;
            super.attachBaseContext(r8)
            java.util.concurrent.atomic.AtomicReference r8 = Z3.a.f4523e
            java.lang.Object r8 = r8.get()
            Z3.a r8 = (Z3.a) r8
            if (r8 != 0) goto L1f
            android.content.Context r8 = r7.getApplicationContext()
            r0 = 0
            if (r8 == 0) goto L1b
            android.content.Context r8 = r7.getApplicationContext()
            Z3.a.d(r8, r0)
        L1b:
            Z3.a.d(r7, r0)
            return
        L1f:
            U0.j r0 = r8.f4527d
            java.util.HashSet r8 = r8.a()
            monitor-enter(r0)
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.getThreadPolicy()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L35
            android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            android.os.StrictMode.allowThreadDiskWrites()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            goto L3e
        L31:
            r8 = move-exception
            goto L97
        L33:
            r2 = move-exception
            goto L37
        L35:
            r2 = move-exception
            r1 = 0
        L37:
            java.lang.String r3 = "SplitCompat"
            java.lang.String r4 = "Unable to set up strict mode."
            android.util.Log.i(r3, r4, r2)     // Catch: java.lang.Throwable -> L31
        L3e:
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r2.<init>()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
        L47:
            boolean r3 = r8.hasNext()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            if (r3 == 0) goto L7b
            java.lang.Object r3 = r8.next()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.lang.Object r4 = r0.f3677b     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            Z3.c r4 = (Z3.c) r4     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.io.File r4 = r4.i()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.lang.String r6 = "verified-splits"
            r5.<init>(r4, r6)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            Z3.c.g(r5)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.lang.String r4 = ".apk"
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.io.File r3 = Z3.c.f(r5, r3)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r2.add(r3)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            goto L47
        L77:
            r8 = move-exception
            goto L90
        L79:
            r8 = move-exception
            goto L85
        L7b:
            r0.s(r7, r2)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            if (r1 == 0) goto L83
        L80:
            android.os.StrictMode.setThreadPolicy(r1)     // Catch: java.lang.Throwable -> L31
        L83:
            monitor-exit(r0)
            goto L8f
        L85:
            java.lang.String r2 = "SplitCompat"
            java.lang.String r3 = "Error installing additional splits"
            android.util.Log.e(r2, r3, r8)     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L83
            goto L80
        L8f:
            return
        L90:
            if (r1 != 0) goto L93
            goto L96
        L93:
            android.os.StrictMode.setThreadPolicy(r1)     // Catch: java.lang.Throwable -> L31
        L96:
            throw r8     // Catch: java.lang.Throwable -> L31
        L97:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.base.activity.LanguageActivity.attachBaseContext(android.content.Context):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018b  */
    @Override // h.AbstractActivityC2349g, c.AbstractActivityC0389n, G.e, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.base.activity.LanguageActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        i.e(menu, "menu");
        getMenuInflater().inflate(R.menu.menu_language, menu);
        View actionView = menu.findItem(R.id.action_search).getActionView();
        i.c(actionView, "null cannot be cast to non-null type androidx.appcompat.widget.SearchView");
        SearchView searchView = (SearchView) actionView;
        searchView.setOnQueryTextListener(new h2.d(this));
        searchView.setOnCloseListener(new C2978d(this));
        return true;
    }

    @Override // h.AbstractActivityC2349g, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        b bVar = this.f18760R;
        if (bVar != null) {
            bVar.c(this);
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        i.e(menuItem, "item");
        if (menuItem.getItemId() == R.id.action_reset) {
            k.k(h.f2965b);
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
