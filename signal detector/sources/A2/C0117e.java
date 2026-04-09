package A2;

import R.C0179f;
import R.InterfaceC0176c;
import R.InterfaceC0188o;
import R.r0;
import Y2.C0202d;
import a.AbstractC0241a;
import android.app.Application;
import android.content.ClipData;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewpager2.widget.ViewPager2;
import b4.C0350o;
import b4.InterfaceC0353r;
import com.apm.insight.R;
import com.bytedance.sdk.component.ypw.emc.cf;
import com.bytedance.sdk.component.ypw.emc.qh;
import com.bytedance.sdk.component.ypw.emc.xq;
import com.bytedance.sdk.component.ypw.emc.ypw;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import com.google.android.gms.internal.ads.AbstractC1266ha;
import com.google.android.gms.internal.ads.BD;
import com.google.android.gms.internal.ads.C0889ae;
import com.google.android.gms.internal.ads.E9;
import com.google.android.gms.internal.ads.H9;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.lefan.signal.network.webSpeed.WebSpeedActivity;
import com.lefan.signal.network.webSpeed.WebSpeedBean;
import com.lefan.signal.ui.noise.NoiseActivity;
import d4.C2267a;
import e4.InterfaceC2304a;
import j2.C2551g;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import n.InterfaceC2675i;
import n.MenuC2677k;
import p4.C2781h;
import q0.C2788a;
import q2.C2841s;
import u2.AbstractC2953c;

/* renamed from: A2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0117e implements BD, InterfaceC2675i, G0.d, InterfaceC0188o, O.b, O4.h, InterfaceC0176c, S3.c, S.n, B4.l, xq, Y2.N, e4.c, InterfaceC2304a, Z3.e, InterfaceC0353r, d4.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244a;

    /* renamed from: b, reason: collision with root package name */
    public Object f245b;

    public /* synthetic */ C0117e(int i, Object obj) {
        this.f244a = i;
        this.f245b = obj;
    }

    public static void t(Context context, C2551g c2551g, D2.a aVar) {
        H9.a(context);
        if (((Boolean) AbstractC1266ha.f14507j.v()).booleanValue()) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.tc)).booleanValue()) {
                AbstractC2953c.f23792b.execute(new C(context, c2551g, aVar, 3));
                return;
            }
        }
        new C0889ae(context, 0, c2551g.f21337a).p(aVar);
    }

    public static C0117e w(boolean z6, boolean z7, int i, int i3, int i6, int i7) {
        return new C0117e(14, AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i3, i6, i7, z6, z7));
    }

    @Override // S3.c, Y2.O
    public Object a() {
        switch (this.f244a) {
            case 13:
                return new R3.l(((R3.e) ((U0.j) this.f245b).f3677b).f3409b);
            case 20:
                return new C0202d((Application) ((A0.e) this.f245b).f73b);
            case 22:
                Y2.M m6 = (Y2.M) this.f245b;
                if (m6 != null) {
                    return m6.a();
                }
                throw new IllegalStateException();
            default:
                return new a4.s(((a4.f) this.f245b).f4693b.f2065b);
        }
    }

    @Override // O4.h
    public void b(WebSpeedBean webSpeedBean) {
        q5.i.e(webSpeedBean, "webSpeedBean");
        ((WebSpeedActivity) this.f245b).f18850Q.add(webSpeedBean);
    }

    @Override // R.InterfaceC0176c
    public C0179f build() {
        return new C0179f(new A0.e(((ContentInfo.Builder) this.f245b).build()));
    }

    @Override // R.InterfaceC0176c
    public void c(Uri uri) {
        ((ContentInfo.Builder) this.f245b).setLinkUri(uri);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O.b
    public void close() throws Exception {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f245b;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                A0.a.t((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.BD
    /* renamed from: d */
    public void mo11d(Object obj) {
        u2.k.c("Initialized webview successfully for SDKCore.");
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.Va)).booleanValue()) {
            BinderC0126n binderC0126n = (BinderC0126n) this.f245b;
            I5.b.D(binderC0126n.f298l, "sgs", new Pair("se", "query_g"), new Pair("ad_format", "BANNER"), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(binderC0126n.f285R.get())));
            binderC0126n.f284Q.set(true);
        }
    }

    @Override // S.n
    public boolean e(View view) {
        c1.g gVar = (c1.g) this.f245b;
        int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
        ViewPager2 viewPager2 = (ViewPager2) gVar.f5899e;
        if (viewPager2.f5642F) {
            viewPager2.b(currentItem);
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.ypw.emc.xq
    public void emc(ypw ypwVar, IOException iOException) {
        T1.a.b((T1.a) this.f245b, 30000, iOException.getMessage());
    }

    @Override // n.InterfaceC2675i
    public boolean f(MenuC2677k menuC2677k, MenuItem menuItem) {
        int i;
        int i3;
        int i6;
        int i7;
        int i8;
        boolean z6;
        A3.v vVar = ((BottomNavigationView) this.f245b).f508e;
        if (vVar == null) {
            return false;
        }
        q0.z zVar = (q0.z) ((F4.c) vVar).f1455b;
        q5.i.e(menuItem, "item");
        q0.v vVarG = zVar.g();
        q5.i.b(vVarG);
        q0.x xVar = vVarG.f23037b;
        q5.i.b(xVar);
        if (xVar.h(menuItem.getItemId(), true) instanceof C2788a) {
            i = R.anim.nav_default_enter_anim;
            i3 = R.anim.nav_default_exit_anim;
            i6 = R.anim.nav_default_pop_enter_anim;
            i7 = R.anim.nav_default_pop_exit_anim;
        } else {
            i = R.animator.nav_default_enter_anim;
            i3 = R.animator.nav_default_exit_anim;
            i6 = R.animator.nav_default_pop_enter_anim;
            i7 = R.animator.nav_default_pop_exit_anim;
        }
        int i9 = i;
        int i10 = i3;
        int i11 = i6;
        int i12 = i7;
        if ((menuItem.getOrder() & 196608) == 0) {
            int i13 = q0.x.f23047n;
            i8 = AbstractC0241a.b(zVar.i()).f23043h;
            z6 = true;
        } else {
            i8 = -1;
            z6 = false;
        }
        try {
            zVar.l(menuItem.getItemId(), new q0.B(true, true, i8, false, z6, i9, i10, i11, i12));
            q0.v vVarG2 = zVar.g();
            if (vVarG2 != null) {
                if (T2.g.u(vVarG2, menuItem.getItemId())) {
                    return false;
                }
            }
            return true;
        } catch (IllegalArgumentException e6) {
            int i14 = q0.v.f23035j;
            StringBuilder sbQ = AbstractC1135f5.q("Ignoring onNavDestinationSelected for MenuItem ", T2.g.o(zVar.f23055a, menuItem.getItemId()), " as it cannot be found from the current destination ");
            sbQ.append(zVar.g());
            Log.i("NavigationUI", sbQ.toString(), e6);
            return true;
        }
    }

    @Override // R.InterfaceC0176c
    public void g(int i) {
        ((ContentInfo.Builder) this.f245b).setFlags(i);
    }

    @Override // B4.l
    public void h(B4.m mVar) {
        mVar.dismiss();
    }

    @Override // e4.InterfaceC2304a
    public void i() {
        Y2.S s5 = (Y2.S) this.f245b;
        synchronized (s5.f4283e) {
            s5.f4285g = false;
        }
    }

    @Override // B4.l
    public void j(B4.m mVar, String str) {
        mVar.dismiss();
        if (str == null || str.length() == 0) {
            return;
        }
        NoiseActivity noiseActivity = (NoiseActivity) this.f245b;
        noiseActivity.f18974V = str;
        AppCompatTextView appCompatTextView = noiseActivity.f18986i0;
        if (appCompatTextView != null) {
            appCompatTextView.setText(str);
        } else {
            q5.i.g("addressTextView");
            throw null;
        }
    }

    @Override // e4.c
    public void k(B2.a aVar) {
        ((C2781h) this.f245b).a(aVar);
    }

    @Override // O.b
    public Cursor l(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f245b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e6) {
            Log.w("FontsProvider", "Unable to query the content provider", e6);
            return null;
        }
    }

    @Override // d4.g
    public a4.d m(a4.d dVar) throws a4.a {
        int i;
        V2.h hVar = (V2.h) this.f245b;
        int i3 = C0350o.f5759a;
        try {
            int i6 = C2267a.f19773p;
            if (dVar != null && (i = dVar.f4680b) != 0 && i != 5 && i != 6 && i != 7) {
                throw new a4.a(-1);
            }
            return a4.d.a(dVar != null ? 1 + dVar.f4679a : 1, 1, 0, 0L, 0L, (ArrayList) hVar.f3875b, new ArrayList());
        } catch (RuntimeException e6) {
            throw e6;
        } catch (Exception e7) {
            throw new C0350o("TunnelExceptions should always be unwrapped to deal with the checked exception underneath, this message should never be seen if TunnelException is used properly.", e7);
        }
    }

    @Override // G0.d
    public String n() {
        return (String) this.f245b;
    }

    @Override // R.InterfaceC0188o
    public r0 p(View view, r0 r0Var) {
        J3.i iVar = (J3.i) this.f245b;
        iVar.f2121m = r0Var.a();
        iVar.f2122n = r0Var.b();
        iVar.f2123o = r0Var.c();
        iVar.e();
        return r0Var;
    }

    @Override // Z3.e
    public void r(Z3.f fVar, File file, boolean z6) {
        c1.g gVar = (c1.g) this.f245b;
        ((HashSet) gVar.f5897c).add(file);
        if (z6) {
            return;
        }
        ((AtomicBoolean) gVar.f5898d).set(false);
    }

    public void s(D0.a... aVarArr) {
        q5.i.e(aVarArr, "migrations");
        for (D0.a aVar : aVarArr) {
            int i = aVar.f1201a;
            int i3 = aVar.f1202b;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f245b;
            Integer numValueOf = Integer.valueOf(i);
            Object treeMap = linkedHashMap.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                linkedHashMap.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i3))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i3)) + " with " + aVar);
            }
            treeMap2.put(Integer.valueOf(i3), aVar);
        }
    }

    @Override // R.InterfaceC0176c
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f245b).setExtras(bundle);
    }

    @Override // com.google.android.gms.internal.ads.BD
    public void u(Throwable th) {
        p2.j.f22785C.f22795h.f("SignalGeneratorImpl.initializeWebViewForSignalCollection", th);
        Pair pair = new Pair("sgf_reason", th.getMessage());
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        BinderC0126n binderC0126n = (BinderC0126n) this.f245b;
        I5.b.D(binderC0126n.f298l, "sgf", pair, pair2, pair3, pair4, pair5, new Pair("sgi_rn", Integer.toString(binderC0126n.f285R.get())));
        u2.k.f("Failed to initialize webview for loading SDKCore. ", th);
        E9 e9 = H9.Va;
        C2841s c2841s = C2841s.f23267e;
        if (!((Boolean) c2841s.f23270c.a(e9)).booleanValue() || binderC0126n.f284Q.get() || binderC0126n.f285R.getAndIncrement() >= ((Integer) c2841s.f23270c.a(H9.Wa)).intValue()) {
            return;
        }
        binderC0126n.N3();
    }

    public synchronized l1.k v(Class cls) {
        int size = ((ArrayList) this.f245b).size();
        for (int i = 0; i < size; i++) {
            C1.e eVar = (C1.e) ((ArrayList) this.f245b).get(i);
            if (eVar.f1145a.isAssignableFrom(cls)) {
                return eVar.f1146b;
            }
        }
        return null;
    }

    public void x(HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            HashMap map2 = (HashMap) this.f245b;
            if (value == null) {
                map2.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    map2.put(str, value);
                } else {
                    int i = 0;
                    if (cls == boolean[].class) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = V0.f.f3819b;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i < zArr.length) {
                            boolArr[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                        map2.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        byte[] bArr = (byte[]) value;
                        String str3 = V0.f.f3819b;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i < bArr.length) {
                            bArr2[i] = Byte.valueOf(bArr[i]);
                            i++;
                        }
                        map2.put(str, bArr2);
                    } else if (cls == int[].class) {
                        int[] iArr = (int[]) value;
                        String str4 = V0.f.f3819b;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i < iArr.length) {
                            numArr[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                        map2.put(str, numArr);
                    } else if (cls == long[].class) {
                        long[] jArr = (long[]) value;
                        String str5 = V0.f.f3819b;
                        Long[] lArr = new Long[jArr.length];
                        while (i < jArr.length) {
                            lArr[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                        map2.put(str, lArr);
                    } else if (cls == float[].class) {
                        float[] fArr = (float[]) value;
                        String str6 = V0.f.f3819b;
                        Float[] fArr2 = new Float[fArr.length];
                        while (i < fArr.length) {
                            fArr2[i] = Float.valueOf(fArr[i]);
                            i++;
                        }
                        map2.put(str, fArr2);
                    } else {
                        if (cls != double[].class) {
                            throw new IllegalArgumentException("Key " + str + " has invalid type " + cls);
                        }
                        double[] dArr = (double[]) value;
                        String str7 = V0.f.f3819b;
                        Double[] dArr2 = new Double[dArr.length];
                        while (i < dArr.length) {
                            dArr2[i] = Double.valueOf(dArr[i]);
                            i++;
                        }
                        map2.put(str, dArr2);
                    }
                }
            }
        }
    }

    public synchronized void y(Object obj) {
        Iterator it = ((HashSet) this.f245b).iterator();
        while (it.hasNext()) {
            ((V3.a) it.next()).a(obj);
        }
    }

    public /* synthetic */ C0117e(int i, boolean z6) {
        this.f244a = i;
    }

    @Override // com.bytedance.sdk.component.ypw.emc.xq
    public void emc(ypw ypwVar, qh qhVar) {
        cf cfVarYcc;
        Object obj;
        int i;
        if (qhVar == null) {
            T1.a.b((T1.a) this.f245b, 30002, "response is empty");
            return;
        }
        InputStream inputStreamXq = null;
        try {
            try {
                ((T1.a) this.f245b).i = qhVar.dg();
                if (((T1.a) this.f245b).i) {
                    cfVarYcc = qhVar.ycc();
                    try {
                        if (((T1.a) this.f245b).i && cfVarYcc != null) {
                            ((T1.a) this.f245b).f3559b = cfVarYcc.emc() + ((T1.a) this.f245b).f3563f;
                            inputStreamXq = cfVarYcc.xq();
                        }
                        if (inputStreamXq != null) {
                            int i3 = d5.y.f19837h;
                            byte[] bArr = new byte[i3];
                            long j6 = ((T1.a) this.f245b).f3563f;
                            ((T1.a) this.f245b).f3567k.vk();
                            long j7 = 0;
                            int i6 = 0;
                            long j8 = 0;
                            int i7 = 0;
                            while (true) {
                                int i8 = inputStreamXq.read(bArr, i7, i3 - i7);
                                if (i8 == -1) {
                                    break;
                                }
                                i7 += i8;
                                j8 += i8;
                                if (((j8 % ((long) i3) == j7 || j8 == ((T1.a) this.f245b).f3559b - ((T1.a) this.f245b).f3563f) ? 1 : i6) != 0) {
                                    synchronized (((T1.a) this.f245b).f3560c) {
                                        try {
                                            RandomAccessFile randomAccessFile = ((T1.a) this.f245b).f3566j;
                                            int iIntValue = Long.valueOf(j6).intValue();
                                            ((T1.a) this.f245b).f3567k.aa();
                                            try {
                                                randomAccessFile.seek(iIntValue);
                                                randomAccessFile.write(bArr, i6, i7);
                                            } catch (Throwable unused) {
                                            }
                                            T1.a aVar = (T1.a) this.f245b;
                                            if (!aVar.f3558a || aVar.f3568l <= -1) {
                                                i = i7;
                                            } else {
                                                T1.a aVar2 = (T1.a) this.f245b;
                                                i = i7;
                                                if (aVar2.f3563f + j8 >= aVar2.f3568l) {
                                                    ((T1.a) this.f245b).f3560c.notify();
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                    j6 += i;
                                    i7 = 0;
                                }
                                j7 = 0;
                                i6 = 0;
                            }
                        } else {
                            T1.a.b((T1.a) this.f245b, 30003, "input_stream is empty");
                            if (inputStreamXq != null) {
                                inputStreamXq.close();
                            }
                            if (cfVarYcc != null) {
                                cfVarYcc.close();
                            }
                            qhVar.close();
                            if (((T1.a) this.f245b).i && ((T1.a) this.f245b).f3561d.length() == ((T1.a) this.f245b).f3559b) {
                                obj = this.f245b;
                                T1.a.c((T1.a) obj);
                            }
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            T1.a.b((T1.a) this.f245b, 30001, th.getMessage());
                            if (inputStreamXq != null) {
                                inputStreamXq.close();
                            }
                            if (cfVarYcc != null) {
                                cfVarYcc.close();
                            }
                            qhVar.close();
                            if (((T1.a) this.f245b).i && ((T1.a) this.f245b).f3561d.length() == ((T1.a) this.f245b).f3559b) {
                                T1.a.c((T1.a) this.f245b);
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            if (inputStreamXq != null) {
                                try {
                                    inputStreamXq.close();
                                } catch (Throwable unused2) {
                                    throw th2;
                                }
                            }
                            if (cfVarYcc != null) {
                                cfVarYcc.close();
                            }
                            qhVar.close();
                            if (((T1.a) this.f245b).i && ((T1.a) this.f245b).f3561d.length() == ((T1.a) this.f245b).f3559b) {
                                T1.a.c((T1.a) this.f245b);
                            }
                            throw th2;
                        }
                    }
                } else {
                    T1.a.b((T1.a) this.f245b, qhVar.xq(), qhVar.bw());
                    cfVarYcc = null;
                }
                if (inputStreamXq != null) {
                    inputStreamXq.close();
                }
                if (cfVarYcc != null) {
                    cfVarYcc.close();
                }
                qhVar.close();
                if (((T1.a) this.f245b).i && ((T1.a) this.f245b).f3561d.length() == ((T1.a) this.f245b).f3559b) {
                    obj = this.f245b;
                    T1.a.c((T1.a) obj);
                }
            } catch (Throwable th3) {
                th = th3;
                cfVarYcc = null;
            }
        } catch (Throwable unused3) {
        }
    }

    public C0117e(com.bumptech.glide.g gVar) {
        this.f244a = 28;
        this.f245b = Collections.unmodifiableMap(new HashMap(gVar.f6507a));
    }

    public C0117e(String str) {
        this.f244a = 5;
        q5.i.e(str, "query");
        this.f245b = str;
    }

    public C0117e(Context context, Uri uri) {
        this.f244a = 9;
        this.f245b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public C0117e(ClipData clipData, int i) {
        this.f244a = 11;
        this.f245b = D3.f.i(clipData, i);
    }

    public C0117e(int i) {
        this.f244a = i;
        switch (i) {
            case 3:
                this.f245b = new ArrayList();
                break;
            case 19:
                this.f245b = new HashMap();
                break;
            case 27:
                this.f245b = new HashSet();
                break;
            default:
                this.f245b = new LinkedHashMap();
                break;
        }
    }

    @Override // n.InterfaceC2675i
    public void o(MenuC2677k menuC2677k) {
    }

    @Override // G0.d
    public void q(G0.c cVar) {
    }
}
