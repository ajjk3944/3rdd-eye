package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import j$.util.DesugarCollections;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ce implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ce f10088b = new ce(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10089a;

    public /* synthetic */ ce(int i4) {
        this.f10089a = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        CountDownLatch countDownLatch;
        Throwable th2;
        KeyguardManager keyguardManager;
        switch (this.f10089a) {
            case 0:
                try {
                    de.f10438b = MessageDigest.getInstance("MD5");
                    countDownLatch = de.f10441e;
                } catch (NoSuchAlgorithmException unused) {
                    countDownLatch = de.f10441e;
                } catch (Throwable th3) {
                    de.f10441e.countDown();
                    throw th3;
                }
                countDownLatch.countDown();
                return;
            case 1:
                return;
            case 2:
                List list = sv.f16551l;
                jz.j("Pinged SB successfully.");
                return;
            case 3:
                Looper.myLooper().quit();
                return;
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                yu0 yu0Var = yu0.g;
                xu0 xu0Var = yu0Var.f18872d;
                l90 l90Var = yu0Var.f18873e;
                yu0Var.f18870b.clear();
                for (vt0 vt0Var : DesugarCollections.unmodifiableCollection(hu0.f11974c.f11976b)) {
                }
                yu0Var.f18874f = System.nanoTime();
                xu0Var.a();
                HashMap map = xu0Var.g;
                HashMap map2 = xu0Var.f18502c;
                HashSet hashSet = xu0Var.f18505f;
                rt rtVar = yu0Var.f18871c;
                long jNanoTime = System.nanoTime();
                kh0 kh0Var = (kh0) rtVar.f15754c;
                View view = null;
                if (hashSet.size() > 0) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        JSONObject jSONObjectO = kh0Var.o(view);
                        View view2 = (View) map2.get(str);
                        rg0 rg0Var = (rg0) rtVar.f15753b;
                        String str2 = (String) map.get(str);
                        if (str2 != null) {
                            JSONObject jSONObjectL = rg0Var.l(view2);
                            try {
                                jSONObjectL.put("adSessionId", str);
                            } catch (JSONException e2) {
                                yo0.k("Error with setting ad session id", e2);
                            }
                            try {
                                jSONObjectL.put("notVisibleReason", str2);
                            } catch (JSONException e10) {
                                yo0.k("Error with setting not visible reason", e10);
                            }
                            uu0.c(jSONObjectO, jSONObjectL);
                        }
                        uu0.d(jSONObjectO);
                        HashSet hashSet2 = new HashSet();
                        hashSet2.add(str);
                        l90Var.getClass();
                        cv0 cv0Var = new cv0(l90Var, hashSet2, jSONObjectO, jNanoTime, 0);
                        av0 av0Var = (av0) l90Var.f13427c;
                        cv0Var.f19182a = av0Var;
                        ArrayDeque arrayDeque = (ArrayDeque) av0Var.f9423c;
                        arrayDeque.add(cv0Var);
                        if (((zu0) av0Var.f9424d) == null) {
                            zu0 zu0Var = (zu0) arrayDeque.poll();
                            av0Var.f9424d = zu0Var;
                            if (zu0Var != null) {
                                zu0Var.executeOnExecutor((ThreadPoolExecutor) av0Var.f9422b, new Object[0]);
                            }
                        }
                        view = null;
                    }
                }
                HashSet hashSet3 = xu0Var.f18504e;
                if (hashSet3.size() > 0) {
                    JSONObject jSONObjectO2 = kh0Var.o(null);
                    kh0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    hu0 hu0Var = hu0.f11974c;
                    if (hu0Var != null) {
                        Collection collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(hu0Var.f11976b);
                        int size = collectionUnmodifiableCollection.size();
                        th2 = null;
                        IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
                        Iterator it2 = collectionUnmodifiableCollection.iterator();
                        while (it2.hasNext()) {
                            View view3 = (View) ((vt0) it2.next()).f17701c.get();
                            if (view3 != null && view3.isAttachedToWindow() && view3.isShown()) {
                                View view4 = view3;
                                while (true) {
                                    if (view4 == null) {
                                        Iterator it3 = it2;
                                        View rootView = view3.getRootView();
                                        if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                            identityHashMap.put(rootView, rootView);
                                            float z3 = rootView.getZ();
                                            int size2 = arrayList.size();
                                            while (size2 > 0) {
                                                float f10 = z3;
                                                int i4 = size2 - 1;
                                                if (((View) arrayList.get(i4)).getZ() > f10) {
                                                    size2 = i4;
                                                    z3 = f10;
                                                } else {
                                                    arrayList.add(size2, rootView);
                                                }
                                            }
                                            arrayList.add(size2, rootView);
                                        }
                                        it2 = it3;
                                    } else if (view4.getAlpha() != 0.0f) {
                                        Object parent = view4.getParent();
                                        Iterator it4 = it2;
                                        if (parent instanceof View) {
                                            it2 = it4;
                                            view4 = (View) parent;
                                        } else {
                                            it2 = it4;
                                            view4 = null;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        th2 = null;
                    }
                    int i10 = 0;
                    for (int size3 = arrayList.size(); i10 < size3; size3 = size3) {
                        yu0Var.a((View) arrayList.get(i10), (rg0) kh0Var.f13160b, jSONObjectO2, false);
                        i10++;
                    }
                    uu0.d(jSONObjectO2);
                    l90Var.getClass();
                    cv0 cv0Var2 = new cv0(l90Var, hashSet3, jSONObjectO2, jNanoTime, 1);
                    av0 av0Var2 = (av0) l90Var.f13427c;
                    cv0Var2.f19182a = av0Var2;
                    ArrayDeque arrayDeque2 = (ArrayDeque) av0Var2.f9423c;
                    arrayDeque2.add(cv0Var2);
                    if (((zu0) av0Var2.f9424d) == null) {
                        zu0 zu0Var2 = (zu0) arrayDeque2.poll();
                        av0Var2.f9424d = zu0Var2;
                        if (zu0Var2 != null) {
                            zu0Var2.executeOnExecutor((ThreadPoolExecutor) av0Var2.f9422b, new Object[0]);
                        }
                    }
                } else {
                    th2 = null;
                    l90Var.getClass();
                    bv0 bv0Var = new bv0(l90Var);
                    av0 av0Var3 = (av0) l90Var.f13427c;
                    bv0Var.f19182a = av0Var3;
                    ArrayDeque arrayDeque3 = (ArrayDeque) av0Var3.f9423c;
                    arrayDeque3.add(bv0Var);
                    if (((zu0) av0Var3.f9424d) == null) {
                        zu0 zu0Var3 = (zu0) arrayDeque3.poll();
                        av0Var3.f9424d = zu0Var3;
                        if (zu0Var3 != null) {
                            zu0Var3.executeOnExecutor((ThreadPoolExecutor) av0Var3.f9422b, new Object[0]);
                        }
                    }
                }
                xu0Var.f18500a.clear();
                xu0Var.f18501b.clear();
                map2.clear();
                xu0Var.f18503d.clear();
                hashSet3.clear();
                hashSet.clear();
                map.clear();
                xu0Var.j = false;
                xu0Var.f18506h.clear();
                long jNanoTime2 = System.nanoTime() - yu0Var.f18874f;
                ArrayList arrayList2 = yu0Var.f18869a;
                if (arrayList2.size() > 0) {
                    Iterator it5 = arrayList2.iterator();
                    if (it5.hasNext()) {
                        if (it5.next() != null) {
                            throw new ClassCastException();
                        }
                        TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                        throw th2;
                    }
                }
                ou0 ou0Var = ou0.f14802d;
                Context context = (Context) ou0Var.f14803a.get();
                if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
                    return;
                }
                boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
                ou0Var.a(ou0Var.f14804b, zIsDeviceLocked);
                ou0Var.f14805c = zIsDeviceLocked;
                return;
            case 8:
                Handler handler = yu0.f18867i;
                if (handler != null) {
                    handler.post(yu0.j);
                    yu0.f18867i.postDelayed(yu0.f18868k, 200L);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final /* synthetic */ void a() {
    }

    private final /* synthetic */ void b() {
    }

    private final /* synthetic */ void c() {
    }

    private final /* synthetic */ void d() {
    }

    private final void e() {
    }
}
