package defpackage;

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

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class vc2 extends hv1 implements wc2 {
    public static final /* synthetic */ int f = 0;

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) throws JSONException {
        oi0 oi0Var;
        tc2 sc2Var = null;
        switch (i) {
            case 1:
                u10 u10VarX0 = oi0.X0(parcel.readStrongBinder());
                ad2 ad2Var = (ad2) iv1.b(parcel, ad2.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    sc2Var = iInterfaceQueryLocalInterface instanceof tc2 ? (tc2) iInterfaceQueryLocalInterface : new sc2(strongBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback", 2);
                }
                iv1.f(parcel);
                ((cr1) this).e2(u10VarX0, ad2Var, sc2Var);
                parcel2.writeNoException();
                return true;
            case 2:
                u10 u10VarX02 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                cr1 cr1Var = (cr1) this;
                if (((Boolean) tw1.e.c.a(mz1.b8)).booleanValue()) {
                    MotionEvent motionEvent = (MotionEvent) oi0.l1(u10VarX02);
                    o92 o92Var = cr1Var.n;
                    View view = o92Var != null ? o92Var.f : null;
                    int[] iArr = new int[2];
                    if (view != null) {
                        view.getLocationOnScreen(iArr);
                    }
                    cr1Var.o = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
                    if (motionEvent.getAction() == 0) {
                        cr1Var.p = cr1Var.o;
                    }
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    Point point = cr1Var.o;
                    motionEventObtain.setLocation(point.x, point.y);
                    cr1Var.i.b.f(motionEventObtain);
                    motionEventObtain.recycle();
                }
                parcel2.writeNoException();
                return true;
            case 3:
                oi0.X0(parcel.readStrongBinder());
                oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 4:
                oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                u10 u10VarX03 = oi0.X0(parcel.readStrongBinder());
                j92 j92VarB3 = i92.B3(parcel.readStrongBinder());
                iv1.f(parcel);
                ((cr1) this).B3(arrayListCreateTypedArrayList, u10VarX03, j92VarB3, false);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                u10 u10VarX04 = oi0.X0(parcel.readStrongBinder());
                j92 j92VarB32 = i92.B3(parcel.readStrongBinder());
                iv1.f(parcel);
                ((cr1) this).C3(arrayListCreateTypedArrayList2, u10VarX04, j92VarB32, false);
                parcel2.writeNoException();
                return true;
            case 7:
                o92 o92Var2 = (o92) iv1.b(parcel, o92.CREATOR);
                iv1.f(parcel);
                cr1 cr1Var2 = (cr1) this;
                cr1Var2.n = o92Var2;
                cr1Var2.k.a(1);
                parcel2.writeNoException();
                return true;
            case 8:
                u10 u10VarX05 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                cr1 cr1Var3 = (cr1) this;
                iz1 iz1Var = mz1.qa;
                kz1 kz1Var = tw1.e.c;
                if (((Boolean) kz1Var.a(iz1Var)).booleanValue()) {
                    iz1 iz1Var2 = mz1.S7;
                    if (!((Boolean) kz1Var.a(iz1Var2)).booleanValue()) {
                        cr1Var3.D3();
                    }
                    WebView webView = (WebView) oi0.l1(u10VarX05);
                    if (webView == null) {
                        gi2.Z("The webView cannot be null.");
                    } else {
                        k63 k63Var = cr1Var3.L;
                        sa4 sa4Var = new sa4(webView, k63Var, md2.f);
                        webView.addJavascriptInterface(new i01(webView, cr1Var3.i, cr1Var3.q, cr1Var3.r, cr1Var3.j, cr1Var3.K, k63Var, sa4Var), "gmaSdk");
                        if (((Boolean) kz1Var.a(mz1.Aa)).booleanValue()) {
                            hg4.C.h.l.incrementAndGet();
                        }
                        if (((Boolean) x02.c.w()).booleanValue()) {
                            k63Var.a(webView);
                            if (((Boolean) x02.d.w()).booleanValue()) {
                                md2.d.scheduleWithFixedDelay(new jt3(sa4Var, 1), 0L, ((Integer) kz1Var.a(mz1.Ba)).intValue(), TimeUnit.MILLISECONDS);
                            }
                        }
                        if (((Boolean) kz1Var.a(iz1Var2)).booleanValue()) {
                            cr1Var3.D3();
                        }
                    }
                }
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                u10 u10VarX06 = oi0.X0(parcel.readStrongBinder());
                j92 j92VarB33 = i92.B3(parcel.readStrongBinder());
                iv1.f(parcel);
                ((cr1) this).B3(arrayListCreateTypedArrayList3, u10VarX06, j92VarB33, true);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                u10 u10VarX07 = oi0.X0(parcel.readStrongBinder());
                j92 j92VarB34 = i92.B3(parcel.readStrongBinder());
                iv1.f(parcel);
                ((cr1) this).C3(arrayListCreateTypedArrayList4, u10VarX07, j92VarB34, true);
                parcel2.writeNoException();
                return true;
            case 11:
                u10 u10VarX08 = oi0.X0(parcel.readStrongBinder());
                u10 u10VarX09 = oi0.X0(parcel.readStrongBinder());
                String string = parcel.readString();
                u10 u10VarX010 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                cr1 cr1Var4 = (cr1) this;
                if (((Boolean) tw1.e.c.a(mz1.Ea)).booleanValue()) {
                    Context context = (Context) oi0.l1(u10VarX08);
                    sl slVar = (sl) oi0.l1(u10VarX09);
                    il ilVar = (il) oi0.l1(u10VarX010);
                    b02 b02Var = cr1Var4.J;
                    b02Var.getClass();
                    if (context == null) {
                        throw new IllegalArgumentException("App Context parameter is null");
                    }
                    if (TextUtils.isEmpty(string)) {
                        throw new IllegalArgumentException("Origin parameter is empty or null");
                    }
                    if (slVar == null) {
                        throw new IllegalArgumentException("CustomTabsClient parameter is null");
                    }
                    b02Var.l = context;
                    b02Var.h = string;
                    pv2 pv2Var = b02Var.d;
                    zz1 zz1Var = new zz1(b02Var, ilVar, pv2Var);
                    b02Var.f = zz1Var;
                    mc2 mc2VarB = slVar.b(zz1Var);
                    b02Var.g = mc2VarB;
                    if (mc2VarB == null) {
                        gi2.Z("CustomTabsClient failed to create new session.");
                    }
                    a30.B(pv2Var, "pact_action", new Pair("pe", "pact_init"));
                    if (((Boolean) x02.e.w()).booleanValue()) {
                        jd4 jd4Var = cr1Var4.K;
                        synchronized (jd4Var) {
                            jd4Var.c(true);
                            jd4Var.c(false);
                        }
                    }
                    if (((Boolean) x02.c.w()).booleanValue()) {
                        cr1Var4.L.a(null);
                    }
                    oi0Var = new oi0(b02Var.g);
                } else {
                    oi0Var = new oi0(null);
                }
                parcel2.writeNoException();
                iv1.e(parcel2, oi0Var);
                return true;
            default:
                return false;
        }
    }
}
