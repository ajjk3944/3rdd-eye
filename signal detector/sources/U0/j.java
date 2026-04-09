package U0;

import A2.w;
import B4.InterfaceC0140b;
import R.InterfaceC0188o;
import R.r0;
import Y2.C0200b;
import Y2.C0201c;
import Y2.C0207i;
import Y2.C0214p;
import Y2.N;
import Y2.O;
import Y2.S;
import android.app.Application;
import android.app.Dialog;
import android.content.ClipDescription;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebView;
import androidx.drawerlayout.widget.DrawerLayout;
import b4.InterfaceC0353r;
import c4.AbstractC0403a;
import com.google.android.gms.internal.ads.BD;
import com.google.android.gms.internal.ads.C0442Bl;
import com.google.android.gms.internal.ads.YD;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.lefan.signal.network.webSpeed.WebSpeedActivity;
import com.lefan.signal.network.webSpeed.WebSpeedBean;
import com.lefan.signal.ui.bluetooth.BluetoothActivity;
import d4.C2268b;
import h.C;
import j$.util.Objects;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import n.InterfaceC2675i;
import n.MenuC2677k;
import n.v;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class j implements WebMessageListenerBoundaryInterface, BD, C5.b, O.b, O4.h, InterfaceC0140b, S3.c, T0.b, o, O, e4.d, N, e4.b, InterfaceC0353r, S.n, d4.i, InterfaceC0188o, v, InterfaceC2675i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3676a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3677b;

    public /* synthetic */ j(int i) {
        this.f3676a = i;
    }

    public static j q(int i, int i3, int i6, boolean z6) {
        return new j(12, AccessibilityNodeInfo.CollectionInfo.obtain(i, i3, z6, i6));
    }

    public static final int t(AssetManager assetManager, File file) {
        int iIntValue = ((Integer) R3.b.C(assetManager, "addAssetPath", Integer.class, String.class, file.getPath())).intValue();
        Log.d("SplitCompat", "addAssetPath completed with " + iIntValue);
        return iIntValue;
    }

    @Override // S3.c, Y2.O
    public Object a() {
        switch (this.f3676a) {
            case 10:
                return new R3.c(((R3.e) ((j) this.f3677b).f3677b).f3409b);
            case 11:
                return ((R3.e) this.f3677b).f3409b;
            case 18:
                return new C0201c((C0200b) ((C0200b) this.f3677b).f4303b);
            case 20:
                return new C0214p((Application) ((O) this.f3677b).a());
            default:
                return new a4.l(((a4.f) this.f3677b).f4693b.f2065b);
        }
    }

    @Override // O4.h
    public void b(WebSpeedBean webSpeedBean) {
        q5.i.e(webSpeedBean, "webSpeedBean");
        ((WebSpeedActivity) this.f3677b).f18849P.a(webSpeedBean);
    }

    @Override // n.v
    public void c(MenuC2677k menuC2677k, boolean z6) {
        ((h.v) this.f3677b).w(menuC2677k);
    }

    @Override // O.b
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f3677b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // U0.o
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) I5.b.e(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f3677b).createWebView(webView));
    }

    @Override // com.google.android.gms.internal.ads.BD
    /* renamed from: d */
    public /* synthetic */ void mo11d(Object obj) {
        ((C0442Bl) this.f3677b).H1((w) obj);
    }

    @Override // S.n
    public boolean e(View view) {
        DrawerLayout drawerLayout = (DrawerLayout) this.f3677b;
        if (!DrawerLayout.k(view) || drawerLayout.f(view) == 2) {
            return false;
        }
        drawerLayout.b(view, true);
        return true;
    }

    @Override // n.InterfaceC2675i
    public boolean f(MenuC2677k menuC2677k, MenuItem menuItem) {
        return false;
    }

    @Override // n.v
    public boolean g(MenuC2677k menuC2677k) {
        Window.Callback callback = ((h.v) this.f3677b).f20420l.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, menuC2677k);
        return true;
    }

    @Override // U0.o
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) I5.b.e(ProfileStoreBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f3677b).getProfileStore());
    }

    @Override // U0.o
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) I5.b.e(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f3677b).getStatics());
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // e4.b
    public void h() {
        S s5 = (S) this.f3677b;
        synchronized (s5.f4283e) {
            s5.f4285g = false;
        }
    }

    @Override // B4.InterfaceC0140b
    public void i(Dialog dialog) {
        BluetoothActivity bluetoothActivity = (BluetoothActivity) this.f3677b;
        if (dialog != null) {
            dialog.dismiss();
        }
        bluetoothActivity.f18907n0 = System.currentTimeMillis();
        bluetoothActivity.v0.a(bluetoothActivity.f18886R);
    }

    @Override // U0.o
    public String[] j() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f3677b).getSupportedFeatures();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // C5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object k(C5.c r6, h5.InterfaceC2370d r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof C5.a
            if (r0 == 0) goto L13
            r0 = r7
            C5.a r0 = (C5.a) r0
            int r1 = r0.f1153g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1153g = r1
            goto L1a
        L13:
            C5.a r0 = new C5.a
            j5.b r7 = (j5.b) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.f1151e
            int r1 = r0.f1153g
            c5.i r2 = c5.C0412i.f5929a
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2d
            D5.h r6 = r0.f1150d
            R2.a.H(r7)     // Catch: java.lang.Throwable -> L2b
            goto L58
        L2b:
            r7 = move-exception
            goto L62
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            R2.a.H(r7)
            D5.h r7 = new D5.h
            h5.i r1 = r0.f21463b
            q5.i.b(r1)
            r7.<init>(r6, r1)
            r0.f1150d = r7     // Catch: java.lang.Throwable -> L60
            r0.f1153g = r3     // Catch: java.lang.Throwable -> L60
            java.lang.Object r6 = r5.f3677b     // Catch: java.lang.Throwable -> L60
            a0.q r6 = (a0.q) r6     // Catch: java.lang.Throwable -> L60
            java.lang.Object r6 = r6.h(r7, r0)     // Catch: java.lang.Throwable -> L60
            i5.a r0 = i5.EnumC2380a.f20635a
            if (r6 != r0) goto L53
            goto L54
        L53:
            r6 = r2
        L54:
            if (r6 != r0) goto L57
            return r0
        L57:
            r6 = r7
        L58:
            r6.m()
            return r2
        L5c:
            r4 = r7
            r7 = r6
            r6 = r4
            goto L62
        L60:
            r6 = move-exception
            goto L5c
        L62:
            r6.m()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.j.k(C5.c, h5.d):java.lang.Object");
    }

    @Override // O.b
    public Cursor l(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f3677b;
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

    @Override // B4.InterfaceC0140b
    public void m(Dialog dialog) {
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // e4.d
    public void n(C0207i c0207i) {
        ((AtomicReference) this.f3677b).set(c0207i);
    }

    @Override // n.InterfaceC2675i
    public void o(MenuC2677k menuC2677k) {
        C c6 = (C) this.f3677b;
        Window.Callback callback = c6.f20260b;
        if (c6.f20259a.f22522a.o()) {
            callback.onPanelClosed(108, menuC2677k);
        } else if (callback.onPreparePanel(0, null, menuC2677k)) {
            callback.onMenuOpened(108, menuC2677k);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPostMessage(android.webkit.WebView r8, java.lang.reflect.InvocationHandler r9, android.net.Uri r10, boolean r11, java.lang.reflect.InvocationHandler r12) {
        /*
            r7 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebMessageBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessageBoundaryInterface.class
            java.lang.Object r9 = I5.b.e(r0, r9)
            org.chromium.support_lib_boundary.WebMessageBoundaryInterface r9 = (org.chromium.support_lib_boundary.WebMessageBoundaryInterface) r9
            java.lang.reflect.InvocationHandler[] r0 = r9.getPorts()
            int r1 = r0.length
            A2.e[] r1 = new A2.C0117e[r1]
            r2 = 0
        L10:
            int r3 = r0.length
            if (r2 >= r3) goto L2c
            A2.e r3 = new A2.e
            r4 = r0[r2]
            r5 = 18
            r6 = 0
            r3.<init>(r5, r6)
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface> r5 = org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface.class
            java.lang.Object r4 = I5.b.e(r5, r4)
            org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface r4 = (org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface) r4
            r3.f245b = r4
            r1[r2] = r3
            int r2 = r2 + 1
            goto L10
        L2c:
            U0.b r0 = U0.m.f3679a
            boolean r0 = r0.b()
            if (r0 == 0) goto L61
            java.lang.Class<org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface.class
            java.lang.reflect.InvocationHandler r9 = r9.getMessagePayload()
            java.lang.Object r9 = I5.b.e(r0, r9)
            org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface r9 = (org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface) r9
            int r0 = r9.getType()
            if (r0 == 0) goto L57
            r1 = 1
            if (r0 == r1) goto L4c
            r9 = 0
            r3 = r9
            goto L6b
        L4c:
            T0.d r0 = new T0.d
            byte[] r9 = r9.getAsArrayBuffer()
            r0.<init>(r9)
        L55:
            r3 = r0
            goto L6b
        L57:
            T0.d r0 = new T0.d
            java.lang.String r9 = r9.getAsString()
            r0.<init>(r9)
            goto L55
        L61:
            T0.d r0 = new T0.d
            java.lang.String r9 = r9.getData()
            r0.<init>(r9)
            goto L55
        L6b:
            if (r3 == 0) goto L8c
            java.lang.Class<org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface> r9 = org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface.class
            java.lang.Object r9 = I5.b.e(r9, r12)
            org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface r9 = (org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface) r9
            U0.f r12 = new U0.f
            r12.<init>()
            java.lang.Object r9 = r9.getOrCreatePeer(r12)
            r6 = r9
            U0.g r6 = (U0.g) r6
            java.lang.Object r9 = r7.f3677b
            r1 = r9
            T0.e r1 = (T0.e) r1
            r2 = r8
            r4 = r10
            r5 = r11
            r1.onPostMessage(r2, r3, r4, r5, r6)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.j.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    @Override // R.InterfaceC0188o
    public r0 p(View view, r0 r0Var) {
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.f3677b;
        r0 r0Var2 = collapsingToolbarLayout.getFitsSystemWindows() ? r0Var : null;
        if (!Objects.equals(collapsingToolbarLayout.f18050S, r0Var2)) {
            collapsingToolbarLayout.f18050S = r0Var2;
            collapsingToolbarLayout.requestLayout();
        }
        return r0Var.f3359a.c();
    }

    public HashMap r(Collection collection) {
        Set setUnmodifiableSet;
        HashMap map = new HashMap();
        Map map2 = (Map) this.f3677b;
        for (String str : map2.keySet()) {
            if (map2.containsKey(str)) {
                HashSet hashSet = new HashSet();
                for (Map.Entry entry : ((Map) map2.get(str)).entrySet()) {
                    if (collection.contains(entry.getKey())) {
                        hashSet.add((String) entry.getValue());
                    }
                }
                setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
            } else {
                setUnmodifiableSet = Collections.EMPTY_SET;
            }
            map.put(str, setUnmodifiableSet);
        }
        return map;
    }

    public synchronized void s(Context context, HashSet hashSet) {
        AssetManager assets = context.getAssets();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            t(assets, (File) it.next());
        }
    }

    @Override // com.google.android.gms.internal.ads.BD
    public void u(Throwable th) {
        C0442Bl c0442Bl = (C0442Bl) this.f3677b;
        String message = th.getMessage();
        synchronized (c0442Bl) {
            c0442Bl.C1(new YD(message, 6));
        }
    }

    public /* synthetic */ j(int i, Object obj) {
        this.f3676a = i;
        this.f3677b = obj;
    }

    public j() {
        Handler handler;
        Handler handlerA;
        this.f3676a = 17;
        Looper mainLooper = Looper.getMainLooper();
        if (Build.VERSION.SDK_INT >= 28) {
            handlerA = K.a.a(mainLooper);
        } else {
            try {
                handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
            } catch (IllegalAccessException e6) {
                e = e6;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
                handlerA = handler;
                this.f3677b = handlerA;
            } catch (InstantiationException e7) {
                e = e7;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
                handlerA = handler;
                this.f3677b = handlerA;
            } catch (NoSuchMethodException e8) {
                e = e8;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
                handlerA = handler;
                this.f3677b = handlerA;
            } catch (InvocationTargetException e9) {
                Throwable cause = e9.getCause();
                if (!(cause instanceof RuntimeException)) {
                    if (cause instanceof Error) {
                        throw ((Error) cause);
                    }
                    throw new RuntimeException(cause);
                }
                throw ((RuntimeException) cause);
            }
            handlerA = handler;
        }
        this.f3677b = handlerA;
    }

    @Override // d4.i
    /* renamed from: a */
    public void mo0a() {
        C2268b c2268b = (C2268b) this.f3677b;
        int i = 0;
        while (true) {
            XmlPullParser xmlPullParser = c2268b.f19788a;
            if (i < xmlPullParser.getAttributeCount()) {
                if ("defaultErrorCode".equals(xmlPullParser.getAttributeName(i))) {
                    V2.h hVar = c2268b.f19789b;
                    String attributeValue = xmlPullParser.getAttributeValue(i);
                    Integer num = (Integer) AbstractC0403a.f5919c.get(attributeValue);
                    if (num != null) {
                        hVar.f3875b = num;
                    } else {
                        throw new IllegalArgumentException(String.valueOf(attributeValue).concat(" is unknown error."));
                    }
                }
                i++;
            } else {
                c2268b.a("split-install-error", new A0.e(24, c2268b));
                return;
            }
        }
    }

    public j(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f3676a = 14;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f3677b = new T.f(uri, clipDescription, uri2);
        } else {
            this.f3677b = new V2.e(uri, clipDescription, uri2, 10);
        }
    }

    public j(Context context, Uri uri) {
        this.f3676a = 6;
        this.f3677b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }
}
