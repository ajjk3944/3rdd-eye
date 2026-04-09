package com.google.android.gms.internal.ads;

import A2.BinderC0126n;
import A2.C0113a;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import q2.C2841s;
import r.AbstractC2858a;
import r.C2867j;

/* renamed from: com.google.android.gms.internal.ads.wf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2078wf extends B7 implements InterfaceC2132xf {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f17457a = 0;

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) throws JSONException {
        S2.b bVar;
        int i3 = 1;
        InterfaceC1970uf c1862sf = null;
        switch (i) {
            case 1:
                S2.a aVarD1 = S2.b.d1(parcel.readStrongBinder());
                C0436Bf c0436Bf = (C0436Bf) C7.b(parcel, C0436Bf.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    c1862sf = iInterfaceQueryLocalInterface instanceof InterfaceC1970uf ? (InterfaceC1970uf) iInterfaceQueryLocalInterface : new C1862sf(strongBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback", 2);
                }
                C7.f(parcel);
                ((BinderC0126n) this).T2(aVarD1, c0436Bf, c1862sf);
                parcel2.writeNoException();
                return true;
            case 2:
                S2.a aVarD12 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                BinderC0126n binderC0126n = (BinderC0126n) this;
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.w8)).booleanValue()) {
                    MotionEvent motionEvent = (MotionEvent) S2.b.n1(aVarD12);
                    C0944be c0944be = binderC0126n.i;
                    View view = c0944be != null ? c0944be.f13395a : null;
                    int[] iArr = new int[2];
                    if (view != null) {
                        view.getLocationOnScreen(iArr);
                    }
                    binderC0126n.f296j = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
                    if (motionEvent.getAction() == 0) {
                        binderC0126n.f297k = binderC0126n.f296j;
                    }
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    Point point = binderC0126n.f296j;
                    motionEventObtain.setLocation(point.x, point.y);
                    binderC0126n.f291d.f8555b.b(motionEventObtain);
                    motionEventObtain.recycle();
                }
                parcel2.writeNoException();
                return true;
            case 3:
                S2.b.d1(parcel.readStrongBinder());
                S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 4:
                S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                S2.a aVarD13 = S2.b.d1(parcel.readStrongBinder());
                InterfaceC0825Yd interfaceC0825YdK3 = AbstractBinderC0808Xd.K3(parcel.readStrongBinder());
                C7.f(parcel);
                ((BinderC0126n) this).K3(arrayListCreateTypedArrayList, aVarD13, interfaceC0825YdK3, false);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                S2.a aVarD14 = S2.b.d1(parcel.readStrongBinder());
                InterfaceC0825Yd interfaceC0825YdK32 = AbstractBinderC0808Xd.K3(parcel.readStrongBinder());
                C7.f(parcel);
                ((BinderC0126n) this).L3(arrayListCreateTypedArrayList2, aVarD14, interfaceC0825YdK32, false);
                parcel2.writeNoException();
                return true;
            case 7:
                C0944be c0944be2 = (C0944be) C7.b(parcel, C0944be.CREATOR);
                C7.f(parcel);
                BinderC0126n binderC0126n2 = (BinderC0126n) this;
                binderC0126n2.i = c0944be2;
                binderC0126n2.f293f.a(1);
                parcel2.writeNoException();
                return true;
            case 8:
                S2.a aVarD15 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                BinderC0126n binderC0126n3 = (BinderC0126n) this;
                E9 e9 = H9.Na;
                G9 g9 = C2841s.f23267e.f23270c;
                if (((Boolean) g9.a(e9)).booleanValue()) {
                    E9 e92 = H9.n8;
                    if (!((Boolean) g9.a(e92)).booleanValue()) {
                        binderC0126n3.M3();
                    }
                    WebView webView = (WebView) S2.b.n1(aVarD15);
                    if (webView == null) {
                        u2.k.e("The webView cannot be null.");
                    } else {
                        A2.G g2 = binderC0126n3.f288U;
                        A2.J j6 = new A2.J(webView, g2, AbstractC0640Nf.f10010f);
                        webView.addJavascriptInterface(new C0113a(webView, binderC0126n3.f291d, binderC0126n3.f298l, binderC0126n3.f299m, binderC0126n3.f292e, binderC0126n3.f287T, g2, j6), "gmaSdk");
                        if (((Boolean) g9.a(H9.Xa)).booleanValue()) {
                            p2.j.f22785C.f22795h.f8978l.incrementAndGet();
                        }
                        if (((Boolean) AbstractC1642oa.f15957c.v()).booleanValue()) {
                            g2.a(webView);
                            if (((Boolean) AbstractC1642oa.f15958d.v()).booleanValue()) {
                                AbstractC0640Nf.f10008d.scheduleWithFixedDelay(new A2.I(j6, i3), 0L, ((Integer) g9.a(H9.Ya)).intValue(), TimeUnit.MILLISECONDS);
                            }
                        }
                        if (((Boolean) g9.a(e92)).booleanValue()) {
                            binderC0126n3.M3();
                        }
                    }
                }
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                S2.a aVarD16 = S2.b.d1(parcel.readStrongBinder());
                InterfaceC0825Yd interfaceC0825YdK33 = AbstractBinderC0808Xd.K3(parcel.readStrongBinder());
                C7.f(parcel);
                ((BinderC0126n) this).K3(arrayListCreateTypedArrayList3, aVarD16, interfaceC0825YdK33, true);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                S2.a aVarD17 = S2.b.d1(parcel.readStrongBinder());
                InterfaceC0825Yd interfaceC0825YdK34 = AbstractBinderC0808Xd.K3(parcel.readStrongBinder());
                C7.f(parcel);
                ((BinderC0126n) this).L3(arrayListCreateTypedArrayList4, aVarD17, interfaceC0825YdK34, true);
                parcel2.writeNoException();
                return true;
            case 11:
                S2.a aVarD18 = S2.b.d1(parcel.readStrongBinder());
                S2.a aVarD19 = S2.b.d1(parcel.readStrongBinder());
                String string = parcel.readString();
                S2.a aVarD110 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                BinderC0126n binderC0126n4 = (BinderC0126n) this;
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.bb)).booleanValue()) {
                    Context context = (Context) S2.b.n1(aVarD18);
                    C2867j c2867j = (C2867j) S2.b.n1(aVarD19);
                    AbstractC2858a abstractC2858a = (AbstractC2858a) S2.b.n1(aVarD110);
                    S9 s9 = binderC0126n4.f286S;
                    s9.getClass();
                    if (context == null) {
                        throw new IllegalArgumentException("App Context parameter is null");
                    }
                    if (TextUtils.isEmpty(string)) {
                        throw new IllegalArgumentException("Origin parameter is empty or null");
                    }
                    if (c2867j == null) {
                        throw new IllegalArgumentException("CustomTabsClient parameter is null");
                    }
                    s9.f11149l = context;
                    s9.f11146h = string;
                    C0852Zn c0852Zn = s9.f11142d;
                    R9 r9 = new R9(s9, abstractC2858a, c0852Zn);
                    s9.f11144f = r9;
                    c1.g gVarB = c2867j.b(r9);
                    s9.f11145g = gVarB;
                    if (gVarB == null) {
                        u2.k.e("CustomTabsClient failed to create new session.");
                    }
                    I5.b.D(c0852Zn, "pact_action", new Pair("pe", "pact_init"));
                    if (((Boolean) AbstractC1642oa.f15959e.v()).booleanValue()) {
                        A2.L l2 = binderC0126n4.f287T;
                        synchronized (l2) {
                            l2.c(true);
                            l2.c(false);
                        }
                    }
                    if (((Boolean) AbstractC1642oa.f15957c.v()).booleanValue()) {
                        binderC0126n4.f288U.a(null);
                    }
                    bVar = new S2.b(s9.f11145g);
                } else {
                    bVar = new S2.b(null);
                }
                parcel2.writeNoException();
                C7.e(parcel2, bVar);
                return true;
            default:
                return false;
        }
    }
}
