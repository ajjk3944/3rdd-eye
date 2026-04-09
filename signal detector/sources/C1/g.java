package c1;

import A2.C0117e;
import G.n;
import G.o;
import G.p;
import G.q;
import J3.i;
import R.O;
import Y2.B;
import a0.C0260n;
import a4.k;
import a4.m;
import a4.s;
import a4.u;
import android.R;
import android.app.Activity;
import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonWriter;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import androidx.work.impl.WorkDatabase_Impl;
import b4.C0351p;
import b4.InterfaceC0353r;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.google.android.gms.internal.ads.Q9;
import com.google.android.material.button.MaterialButton;
import com.lefan.signal.ui.satellite.SatelliteCloudChart;
import d4.C2267a;
import d5.AbstractC2282j;
import d5.C2280h;
import e1.C2301d;
import g0.C2328a;
import g0.C2329b;
import h1.InterfaceC2361a;
import java.io.File;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipFile;
import k0.AbstractComponentCallbacksC2617v;
import k0.K;
import k0.M;
import k0.P;
import l1.InterfaceC2639e;
import n.MenuC2677k;
import n.r;
import n.z;
import n1.C2684b;
import n1.RunnableC2683a;
import n1.l;
import q0.t;
import q0.v;
import q0.w;
import q0.x;
import r.BinderC2862e;
import t2.C2911G;
import u.C2936e;
import u.C2937f;
import u.C2938g;
import u.C2940i;
import u2.h;
import z5.C3043t;
import z5.InterfaceC3044u;
import z5.T;
import z5.c0;

/* loaded from: classes.dex */
public final class g implements O0.a, B, Z3.d, InterfaceC0353r, m, u2.g {

    /* renamed from: f, reason: collision with root package name */
    public static g f5893f;

    /* renamed from: g, reason: collision with root package name */
    public static g f5894g;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5895a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5896b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5897c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5898d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5899e;

    public /* synthetic */ g(int i, boolean z6) {
        this.f5895a = i;
    }

    public static g t() {
        if (f5894g == null) {
            f5894g = new g(3);
        }
        return f5894g;
    }

    public static synchronized g u(Context context, InterfaceC2361a interfaceC2361a) {
        try {
            if (f5893f == null) {
                g gVar = new g(0, false);
                Context applicationContext = context.getApplicationContext();
                gVar.f5896b = new C0397a(applicationContext, interfaceC2361a);
                gVar.f5897c = new C0398b(applicationContext, interfaceC2361a);
                gVar.f5898d = new C0401e(applicationContext, interfaceC2361a);
                gVar.f5899e = new f(applicationContext, interfaceC2361a);
                f5893f = gVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5893f;
    }

    public boolean A(m.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f5896b;
        m.e eVarP = p(aVar);
        C2940i c2940i = (C2940i) this.f5899e;
        Menu zVar = (Menu) c2940i.get(menu);
        if (zVar == null) {
            zVar = new z((Context) this.f5897c, (MenuC2677k) menu);
            c2940i.put(menu, zVar);
        }
        return callback.onCreateActionMode(eVarP, zVar);
    }

    public void B(J3.f fVar) {
        synchronized (this.f5896b) {
            try {
                if (v(fVar)) {
                    J3.m mVar = (J3.m) this.f5898d;
                    if (!mVar.f2136c) {
                        mVar.f2136c = true;
                        ((Handler) this.f5897c).removeCallbacksAndMessages(mVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void C(String str) {
        Bundle bundle = new Bundle();
        synchronized (this.f5896b) {
            try {
                try {
                    ((b.b) ((b.d) this.f5897c)).h0((BinderC2862e) this.f5898d, str, bundle);
                } catch (RemoteException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void D(J3.f fVar) {
        synchronized (this.f5896b) {
            try {
                if (v(fVar)) {
                    J3.m mVar = (J3.m) this.f5898d;
                    if (mVar.f2136c) {
                        mVar.f2136c = false;
                        E(mVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void E(J3.m mVar) {
        Handler handler = (Handler) this.f5897c;
        int i = mVar.f2135b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? TTAdConstant.STYLE_SIZE_RADIO_3_2 : 2750;
        }
        handler.removeCallbacksAndMessages(mVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, mVar), i);
    }

    public Bundle F(String str, Bundle bundle) {
        HashMap map = (HashMap) this.f5898d;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    public void G() {
        J3.m mVar = (J3.m) this.f5899e;
        if (mVar != null) {
            this.f5898d = mVar;
            this.f5899e = null;
            J3.f fVar = (J3.f) mVar.f2134a.get();
            if (fVar == null) {
                this.f5898d = null;
            } else {
                Handler handler = i.f2107x;
                handler.sendMessage(handler.obtainMessage(0, fVar.f2091a));
            }
        }
    }

    public void H() {
        int itemCount;
        A0.e eVar = (A0.e) this.f5897c;
        C0117e c0117e = (C0117e) this.f5896b;
        ViewPager2 viewPager2 = (ViewPager2) this.f5899e;
        int i = R.id.accessibilityActionPageLeft;
        O.j(R.id.accessibilityActionPageLeft, viewPager2);
        O.h(0, viewPager2);
        O.j(R.id.accessibilityActionPageRight, viewPager2);
        O.h(0, viewPager2);
        O.j(R.id.accessibilityActionPageUp, viewPager2);
        O.h(0, viewPager2);
        O.j(R.id.accessibilityActionPageDown, viewPager2);
        O.h(0, viewPager2);
        if (viewPager2.getAdapter() == null || (itemCount = viewPager2.getAdapter().getItemCount()) == 0 || !viewPager2.f5642F) {
            return;
        }
        if (viewPager2.getOrientation() != 0) {
            if (viewPager2.f5648d < itemCount - 1) {
                O.k(viewPager2, new S.c(R.id.accessibilityActionPageDown, (String) null), c0117e);
            }
            if (viewPager2.f5648d > 0) {
                O.k(viewPager2, new S.c(R.id.accessibilityActionPageUp, (String) null), eVar);
                return;
            }
            return;
        }
        boolean z6 = viewPager2.f5651g.getLayoutDirection() == 1;
        int i3 = z6 ? 16908360 : 16908361;
        if (z6) {
            i = 16908361;
        }
        if (viewPager2.f5648d < itemCount - 1) {
            O.k(viewPager2, new S.c(i3, (String) null), c0117e);
        }
        if (viewPager2.f5648d > 0) {
            O.k(viewPager2, new S.c(i, (String) null), eVar);
        }
    }

    public void I() {
        ArrayList arrayList = (ArrayList) this.f5899e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            int i3 = ((t) obj).f23027a;
            if (n(i3) == null) {
                int i6 = v.f23035j;
                StringBuilder sbQ = AbstractC1135f5.q("Navigation destination ", T2.g.o((Context) this.f5896b, i3), " cannot be found in the navigation graph ");
                sbQ.append((x) this.f5898d);
                throw new IllegalArgumentException(sbQ.toString());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        if (((android.content.res.XmlResourceParser) r0.f245b).getName().equals("manifest") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        r5 = ((android.content.res.XmlResourceParser) r0.f245b).getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
        r6 = ((android.content.res.XmlResourceParser) r0.f245b).getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
    
        if (r5 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
    
        r5 = java.lang.Integer.parseInt(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
    
        if (r6 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        r5 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a5, code lost:
    
        r5 = (r5 & 4294967295L) | (java.lang.Integer.parseInt(r6) << 32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b7, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c7, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(A.f.l("Couldn't parse versionCodeMajor to int: ", r13.getMessage()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c8, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d8, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(A.f.l("Couldn't parse versionCode to int: ", r13.getMessage()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e0, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean J(java.io.File[] r13) throws org.xmlpull.v1.XmlPullParserException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.g.J(java.io.File[]):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bb, code lost:
    
        android.util.Log.e("SplitCompat", "Downloaded split " + r6 + " is not signed.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean K(java.io.File[] r14) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.g.K(java.io.File[]):boolean");
    }

    @Override // Y2.B
    /* renamed from: a */
    public Executor mo1a() {
        return (Executor) this.f5899e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:125:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0390  */
    @Override // Y2.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(java.lang.String r22, org.json.JSONObject r23) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.g.b(java.lang.String, org.json.JSONObject):boolean");
    }

    @Override // Z3.d
    public void c(ZipFile zipFile, HashSet hashSet) {
        ((Z3.g) this.f5899e).c((Z3.b) this.f5896b, hashSet, new C0117e(24, this));
    }

    public synchronized void d(InterfaceC2639e interfaceC2639e, n1.t tVar) {
        C2684b c2684b = (C2684b) ((HashMap) this.f5897c).put(interfaceC2639e, new C2684b(interfaceC2639e, tVar, (ReferenceQueue) this.f5898d));
        if (c2684b != null) {
            c2684b.f22174c = null;
            c2684b.clear();
        }
    }

    public void e(AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v) {
        if (((ArrayList) this.f5896b).contains(abstractComponentCallbacksC2617v)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC2617v);
        }
        synchronized (((ArrayList) this.f5896b)) {
            ((ArrayList) this.f5896b).add(abstractComponentCallbacksC2617v);
        }
        abstractComponentCallbacksC2617v.f21720k = true;
    }

    @Override // a4.m
    public void f() {
        Intent intent = (Intent) this.f5897c;
        if (intent.getBooleanExtra("triggered_from_app_after_verification", false)) {
            ((a4.v) this.f5899e).f4732a.b("Splits copied and verified more than once.", new Object[0]);
        } else {
            intent.putExtra("triggered_from_app_after_verification", true);
            ((Context) this.f5898d).sendBroadcast(intent);
        }
    }

    public boolean g(J3.m mVar, int i) {
        J3.f fVar = (J3.f) mVar.f2134a.get();
        if (fVar == null) {
            return false;
        }
        ((Handler) this.f5897c).removeCallbacksAndMessages(mVar);
        Handler handler = i.f2107x;
        handler.sendMessage(handler.obtainMessage(1, i, 0, fVar.f2091a));
        return true;
    }

    @Override // O0.a
    public View getRoot() {
        switch (this.f5895a) {
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 28:
                break;
        }
        return (LinearLayoutCompat) this.f5896b;
    }

    @Override // a4.m
    public void h(int i) {
        a4.v vVar = (a4.v) this.f5899e;
        vVar.f4738g.post(new u(vVar, (a4.d) this.f5896b, 6, i));
    }

    public void i(C2684b c2684b) {
        n1.z zVar;
        synchronized (this) {
            ((HashMap) this.f5897c).remove(c2684b.f22172a);
            if (c2684b.f22173b && (zVar = c2684b.f22174c) != null) {
                ((l) this.f5899e).f(c2684b.f22172a, new n1.t(zVar, true, false, c2684b.f22172a, (l) this.f5899e));
            }
        }
    }

    @Override // u2.g
    public void j(JsonWriter jsonWriter) throws IOException {
        String str = (String) this.f5896b;
        String str2 = (String) this.f5897c;
        Map map = (Map) this.f5898d;
        byte[] bArr = (byte[]) this.f5899e;
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        h.d(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name("body").value(Base64.encodeToString(bArr, 0));
        }
        jsonWriter.endObject();
    }

    public G.t k() throws Resources.NotFoundException {
        Context context = (Context) this.f5896b;
        ArrayList arrayList = (ArrayList) this.f5899e;
        Intent intent = (Intent) this.f5897c;
        x xVar = (x) this.f5898d;
        if (xVar == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
        int size = arrayList.size();
        v vVar = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            t tVar = (t) obj;
            int i3 = tVar.f23027a;
            Bundle bundle = tVar.f23028b;
            v vVarN = n(i3);
            if (vVarN == null) {
                int i6 = v.f23035j;
                throw new IllegalArgumentException("Navigation destination " + T2.g.o(context, i3) + " cannot be found in the navigation graph " + xVar);
            }
            for (int i7 : vVarN.c(vVar)) {
                arrayList2.add(Integer.valueOf(i7));
                arrayList3.add(bundle);
            }
            vVar = vVarN;
        }
        intent.putExtra("android-support-nav:controller:deepLinkIds", AbstractC2282j.i0(arrayList2));
        intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
        G.t tVar2 = new G.t(context);
        Intent intent2 = new Intent(intent);
        ComponentName component = intent2.getComponent();
        if (component == null) {
            component = intent2.resolveActivity(tVar2.f1510b.getPackageManager());
        }
        if (component != null) {
            tVar2.a(component);
        }
        ArrayList arrayList4 = tVar2.f1509a;
        arrayList4.add(intent2);
        int size2 = arrayList4.size();
        for (int i8 = 0; i8 < size2; i8++) {
            Intent intent3 = (Intent) arrayList4.get(i8);
            if (intent3 != null) {
                intent3.putExtra("android-support-nav:controller:deepLinkIntent", intent);
            }
        }
        return tVar2;
    }

    public void l(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C2940i) this.f5897c).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                l(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public AbstractComponentCallbacksC2617v m(String str) {
        P p6 = (P) ((HashMap) this.f5897c).get(str);
        if (p6 != null) {
            return p6.f21558c;
        }
        return null;
    }

    public v n(int i) {
        C2280h c2280h = new C2280h();
        x xVar = (x) this.f5898d;
        q5.i.b(xVar);
        c2280h.addLast(xVar);
        while (!c2280h.isEmpty()) {
            v vVar = (v) c2280h.removeFirst();
            if (vVar.f23043h == i) {
                return vVar;
            }
            if (vVar instanceof x) {
                w wVar = new w((x) vVar);
                while (wVar.hasNext()) {
                    c2280h.addLast((v) wVar.next());
                }
            }
        }
        return null;
    }

    public AbstractComponentCallbacksC2617v o(String str) {
        for (P p6 : ((HashMap) this.f5897c).values()) {
            if (p6 != null) {
                AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617vO = p6.f21558c;
                if (!str.equals(abstractComponentCallbacksC2617vO.f21710e)) {
                    abstractComponentCallbacksC2617vO = abstractComponentCallbacksC2617vO.f21686I.f21505c.o(str);
                }
                if (abstractComponentCallbacksC2617vO != null) {
                    return abstractComponentCallbacksC2617vO;
                }
            }
        }
        return null;
    }

    public m.e p(m.a aVar) {
        ArrayList arrayList = (ArrayList) this.f5898d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m.e eVar = (m.e) arrayList.get(i);
            if (eVar != null && eVar.f21880b == aVar) {
                return eVar;
            }
        }
        m.e eVar2 = new m.e((Context) this.f5897c, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList q() {
        ArrayList arrayList = new ArrayList();
        for (P p6 : ((HashMap) this.f5897c).values()) {
            if (p6 != null) {
                arrayList.add(p6);
            }
        }
        return arrayList;
    }

    public ArrayList r() {
        ArrayList arrayList = new ArrayList();
        for (P p6 : ((HashMap) this.f5897c).values()) {
            if (p6 != null) {
                arrayList.add(p6.f21558c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List s() {
        ArrayList arrayList;
        if (((ArrayList) this.f5896b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f5896b)) {
            arrayList = new ArrayList((ArrayList) this.f5896b);
        }
        return arrayList;
    }

    public boolean v(J3.f fVar) {
        J3.m mVar = (J3.m) this.f5898d;
        return (mVar == null || fVar == null || mVar.f2134a.get() != fVar) ? false : true;
    }

    public void w(P p6) {
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = p6.f21558c;
        String str = abstractComponentCallbacksC2617v.f21710e;
        HashMap map = (HashMap) this.f5897c;
        if (map.get(str) != null) {
            return;
        }
        map.put(abstractComponentCallbacksC2617v.f21710e, p6);
        if (K.H(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC2617v);
        }
    }

    public void x(P p6) {
        HashMap map = (HashMap) this.f5897c;
        AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = p6.f21558c;
        if (abstractComponentCallbacksC2617v.f21692P) {
            ((M) this.f5899e).g(abstractComponentCallbacksC2617v);
        }
        if (map.get(abstractComponentCallbacksC2617v.f21710e) == p6 && ((P) map.put(abstractComponentCallbacksC2617v.f21710e, null)) != null && K.H(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC2617v);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0268, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x026a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020d  */
    /* JADX WARN: Type inference failed for: r2v19, types: [B5.h, E5.d, E5.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void y(a0.AbstractC0258l r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.g.y(a0.l):void");
    }

    public boolean z(m.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f5896b).onActionItemClicked(p(aVar), new r((Context) this.f5897c, (L.a) menuItem));
    }

    public /* synthetic */ g(Object obj, Object obj2, Cloneable cloneable, Object obj3, int i) {
        this.f5895a = i;
        this.f5899e = obj;
        this.f5896b = obj2;
        this.f5897c = cloneable;
        this.f5898d = obj3;
    }

    @Override // b4.InterfaceC0353r
    public Object a() {
        switch (this.f5895a) {
            case 14:
                return new a4.e((k) ((InterfaceC0353r) this.f5896b).a(), (a4.v) ((InterfaceC0353r) this.f5897c).a(), (s) ((InterfaceC0353r) this.f5898d).a(), (a4.l) ((InterfaceC0353r) this.f5899e).a());
            default:
                return new C2267a(((a4.f) this.f5896b).f4693b.f2065b, (File) ((InterfaceC0353r) this.f5897c).a(), (s) ((InterfaceC0353r) this.f5898d).a(), C0351p.b((a4.g) this.f5899e));
        }
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f5895a = i;
        this.f5896b = obj;
        this.f5897c = obj2;
        this.f5898d = obj3;
        this.f5899e = obj4;
    }

    public g(Context context, Z3.c cVar) {
        this.f5895a = 16;
        C0117e c0117e = new C0117e(26, false);
        this.f5896b = cVar;
        this.f5897c = context;
        this.f5898d = c0117e;
    }

    public g(C2911G c2911g, Q9 q9, Bundle bundle, Context context, Uri uri) {
        this.f5895a = 25;
        this.f5896b = q9;
        this.f5897c = bundle;
        this.f5898d = context;
        this.f5899e = uri;
    }

    public g(WorkDatabase_Impl workDatabase_Impl) {
        this.f5895a = 18;
        this.f5896b = workDatabase_Impl;
        this.f5897c = new L4.b(workDatabase_Impl, 11);
        this.f5898d = new C2301d(workDatabase_Impl, 1);
        this.f5899e = new C2301d(workDatabase_Impl, 2);
    }

    @Override // a4.m
    /* renamed from: a, reason: collision with other method in class */
    public void mo2a() {
        a4.v vVar = (a4.v) this.f5899e;
        vVar.f4738g.post(new u(vVar, (a4.d) this.f5896b, 5, 0));
    }

    public g(InterfaceC3044u interfaceC3044u, H5.g gVar, C0260n c0260n) {
        this.f5895a = 13;
        this.f5896b = interfaceC3044u;
        this.f5897c = c0260n;
        this.f5898d = new B5.b(Integer.MAX_VALUE);
        this.f5899e = new AtomicInteger(0);
        T t6 = (T) interfaceC3044u.k().h(C3043t.f24555b);
        if (t6 == null) {
            return;
        }
        ((c0) t6).C(false, true, new A5.c(gVar, 1, this));
    }

    public g(int i) {
        this.f5895a = i;
        switch (i) {
            case 3:
                this.f5896b = new Object();
                this.f5897c = new Handler(Looper.getMainLooper(), new J3.l(0, this));
                break;
            case 8:
                this.f5896b = new C2936e(0);
                this.f5897c = new SparseArray();
                this.f5898d = new C2938g();
                this.f5899e = new C2936e(0);
                break;
            case 20:
                this.f5896b = new ArrayList();
                this.f5897c = new HashMap();
                this.f5898d = new HashMap();
                break;
            case 22:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new O.k(2));
                this.f5897c = new HashMap();
                this.f5898d = new ReferenceQueue();
                this.f5896b = executorServiceNewSingleThreadExecutor;
                executorServiceNewSingleThreadExecutor.execute(new RunnableC2683a(0, this));
                break;
            default:
                this.f5896b = new Q.c(10);
                this.f5897c = new C2940i(0);
                this.f5898d = new ArrayList();
                this.f5899e = new HashSet();
                break;
        }
    }

    public g(LinearLayout linearLayout, SwitchCompat switchCompat, SatelliteCloudChart satelliteCloudChart, MaterialButton materialButton, RecyclerView recyclerView) {
        this.f5895a = 6;
        this.f5896b = linearLayout;
        this.f5897c = switchCompat;
        this.f5898d = satelliteCloudChart;
        this.f5899e = recyclerView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(G.l lVar) {
        Bundle bundle;
        int i;
        ArrayList arrayList;
        Bundle bundle2;
        int i3;
        this.f5895a = 2;
        new ArrayList();
        this.f5899e = new Bundle();
        this.f5898d = lVar;
        Context context = lVar.f1489a;
        ArrayList arrayList2 = lVar.f1504q;
        ArrayList arrayList3 = lVar.f1491c;
        ArrayList arrayList4 = lVar.f1492d;
        this.f5896b = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f5897c = o.a(context, lVar.f1501n);
        } else {
            this.f5897c = new Notification.Builder(lVar.f1489a);
        }
        Notification notification = lVar.f1503p;
        Context context2 = null;
        ((Notification.Builder) this.f5897c).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(lVar.f1493e).setContentText(lVar.f1494f).setContentInfo(null).setContentIntent(lVar.f1495g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) this.f5897c;
        IconCompat iconCompat = lVar.f1496h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.f(context));
        ((Notification.Builder) this.f5897c).setSubText(null).setUsesChronometer(false).setPriority(lVar.i);
        ArrayList arrayList5 = lVar.f1490b;
        int size = arrayList5.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList5.get(i6);
            i6++;
            G.g gVar = (G.g) obj;
            int i7 = Build.VERSION.SDK_INT;
            if (gVar.f1479b == null && (i3 = gVar.f1482e) != 0) {
                gVar.f1479b = IconCompat.b(i3);
            }
            IconCompat iconCompat2 = gVar.f1479b;
            boolean z6 = gVar.f1480c;
            Bundle bundle3 = gVar.f1478a;
            ArrayList arrayList6 = arrayList5;
            ArrayList arrayList7 = arrayList3;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.f(context2) : context2, gVar.f1483f, gVar.f1484g);
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android.support.allowGeneratedReplies", z6);
            if (i7 >= 24) {
                n.b(builder2, z6);
            }
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i7 >= 28) {
                p.a(builder2);
            }
            if (i7 >= 29) {
                G.d.d(builder2);
            }
            if (i7 >= 31) {
                q.a(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", gVar.f1481d);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.f5897c).addAction(builder2.build());
            arrayList5 = arrayList6;
            arrayList3 = arrayList7;
            context2 = null;
        }
        ArrayList arrayList8 = arrayList3;
        Bundle bundle4 = lVar.f1500m;
        if (bundle4 != null) {
            ((Bundle) this.f5899e).putAll(bundle4);
        }
        int i8 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f5897c).setShowWhen(lVar.f1497j);
        ((Notification.Builder) this.f5897c).setLocalOnly(lVar.f1499l);
        ((Notification.Builder) this.f5897c).setGroup(null);
        ((Notification.Builder) this.f5897c).setSortKey(null);
        ((Notification.Builder) this.f5897c).setGroupSummary(false);
        ((Notification.Builder) this.f5897c).setCategory(null);
        ((Notification.Builder) this.f5897c).setColor(0);
        ((Notification.Builder) this.f5897c).setVisibility(0);
        ((Notification.Builder) this.f5897c).setPublicVersion(null);
        ((Notification.Builder) this.f5897c).setSound(notification.sound, notification.audioAttributes);
        if (i8 < 28) {
            if (arrayList8 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList8.size());
                Iterator it = arrayList8.iterator();
                if (it.hasNext()) {
                    throw A.f.f(it);
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    C2937f c2937f = new C2937f(arrayList2.size() + arrayList.size());
                    c2937f.addAll(arrayList);
                    c2937f.addAll(arrayList2);
                    arrayList2 = new ArrayList(c2937f);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size2 = arrayList2.size();
            int i9 = 0;
            while (i9 < size2) {
                Object obj2 = arrayList2.get(i9);
                i9++;
                ((Notification.Builder) this.f5897c).addPerson((String) obj2);
            }
        }
        if (arrayList4.size() > 0) {
            if (lVar.f1500m == null) {
                lVar.f1500m = new Bundle();
            }
            Bundle bundle5 = lVar.f1500m.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                String string = Integer.toString(i10);
                G.g gVar2 = (G.g) arrayList4.get(i10);
                Bundle bundle8 = new Bundle();
                if (gVar2.f1479b == null && (i = gVar2.f1482e) != 0) {
                    gVar2.f1479b = IconCompat.b(i);
                }
                IconCompat iconCompat3 = gVar2.f1479b;
                Bundle bundle9 = gVar2.f1478a;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.c() : 0);
                bundle8.putCharSequence("title", gVar2.f1483f);
                bundle8.putParcelable("actionIntent", gVar2.f1484g);
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", gVar2.f1480c);
                bundle8.putBundle("extras", bundle);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", gVar2.f1481d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (lVar.f1500m == null) {
                lVar.f1500m = new Bundle();
            }
            lVar.f1500m.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.f5899e).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 24) {
            ((Notification.Builder) this.f5897c).setExtras(lVar.f1500m);
            n.c((Notification.Builder) this.f5897c);
        }
        if (i11 >= 26) {
            o.b((Notification.Builder) this.f5897c);
            o.d((Notification.Builder) this.f5897c);
            o.e((Notification.Builder) this.f5897c);
            o.f((Notification.Builder) this.f5897c);
            o.c((Notification.Builder) this.f5897c);
            if (!TextUtils.isEmpty(lVar.f1501n)) {
                ((Notification.Builder) this.f5897c).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i11 >= 28) {
            Iterator it2 = arrayList8.iterator();
            if (it2.hasNext()) {
                throw A.f.f(it2);
            }
        }
        if (i11 >= 29) {
            G.d.b((Notification.Builder) this.f5897c, lVar.f1502o);
            G.d.c((Notification.Builder) this.f5897c);
        }
    }

    public g(q0.z zVar) {
        Intent launchIntentForPackage;
        this.f5895a = 23;
        Context context = zVar.f23055a;
        this.f5896b = context;
        if (context instanceof Activity) {
            launchIntentForPackage = new Intent(context, context.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f5897c = launchIntentForPackage;
        this.f5899e = new ArrayList();
        this.f5898d = zVar.i();
    }

    public g(Typeface typeface, C2329b c2329b) {
        int i;
        int i3;
        int i6;
        int i7;
        this.f5895a = 19;
        this.f5899e = typeface;
        this.f5896b = c2329b;
        this.f5898d = new f0.s(1024);
        int iA = c2329b.a(6);
        if (iA != 0) {
            int i8 = iA + c2329b.f3259a;
            i = ((ByteBuffer) c2329b.f3262d).getInt(((ByteBuffer) c2329b.f3262d).getInt(i8) + i8);
        } else {
            i = 0;
        }
        this.f5897c = new char[i * 2];
        int iA2 = c2329b.a(6);
        if (iA2 != 0) {
            int i9 = iA2 + c2329b.f3259a;
            i3 = ((ByteBuffer) c2329b.f3262d).getInt(((ByteBuffer) c2329b.f3262d).getInt(i9) + i9);
        } else {
            i3 = 0;
        }
        for (int i10 = 0; i10 < i3; i10++) {
            f0.v vVar = new f0.v(this, i10);
            C2328a c2328aB = vVar.b();
            int iA3 = c2328aB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) c2328aB.f3262d).getInt(iA3 + c2328aB.f3259a) : 0, (char[]) this.f5897c, i10 * 2);
            C2328a c2328aB2 = vVar.b();
            int iA4 = c2328aB2.a(16);
            if (iA4 != 0) {
                int i11 = iA4 + c2328aB2.f3259a;
                i6 = ((ByteBuffer) c2328aB2.f3262d).getInt(((ByteBuffer) c2328aB2.f3262d).getInt(i11) + i11);
            } else {
                i6 = 0;
            }
            a4.t.c("invalid metadata codepoint length", i6 > 0);
            f0.s sVar = (f0.s) this.f5898d;
            C2328a c2328aB3 = vVar.b();
            int iA5 = c2328aB3.a(16);
            if (iA5 != 0) {
                int i12 = iA5 + c2328aB3.f3259a;
                i7 = ((ByteBuffer) c2328aB3.f3262d).getInt(((ByteBuffer) c2328aB3.f3262d).getInt(i12) + i12);
            } else {
                i7 = 0;
            }
            sVar.a(vVar, 0, i7 - 1);
        }
    }

    public g(b.d dVar, BinderC2862e binderC2862e, ComponentName componentName) {
        this.f5895a = 24;
        this.f5896b = new Object();
        this.f5897c = dVar;
        this.f5898d = binderC2862e;
        this.f5899e = componentName;
    }

    public g(Context context, ActionMode.Callback callback) {
        this.f5895a = 21;
        this.f5897c = context;
        this.f5896b = callback;
        this.f5898d = new ArrayList();
        this.f5899e = new C2940i(0);
    }

    public g(ViewPager2 viewPager2) {
        this.f5895a = 9;
        this.f5899e = viewPager2;
        this.f5896b = new C0117e(15, this);
        this.f5897c = new A0.e(13, this);
    }
}
