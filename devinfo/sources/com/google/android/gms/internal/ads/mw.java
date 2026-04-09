package com.google.android.gms.internal.ads;

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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class mw extends mg implements nw {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14034a = 0;

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) throws JSONException {
        vb.b bVar;
        kw iwVar = null;
        switch (i4) {
            case 1:
                vb.a aVarR0 = vb.b.r0(parcel.readStrongBinder());
                rw rwVar = (rw) ng.b(parcel, rw.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    iwVar = iInterfaceQueryLocalInterface instanceof kw ? (kw) iInterfaceQueryLocalInterface : new iw(strongBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback", 1);
                }
                ng.f(parcel);
                ((fb.h) this).v3(aVarR0, rwVar, iwVar);
                parcel2.writeNoException();
                return true;
            case 2:
                vb.a aVarR02 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                fb.h hVar = (fb.h) this;
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16385w8)).booleanValue()) {
                    MotionEvent motionEvent = (MotionEvent) vb.b.U0(aVarR02);
                    st stVar = hVar.f23918i;
                    View view = stVar != null ? stVar.f16544a : null;
                    int[] iArr = new int[2];
                    if (view != null) {
                        view.getLocationOnScreen(iArr);
                    }
                    hVar.j = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
                    if (motionEvent.getAction() == 0) {
                        hVar.f23919k = hVar.j;
                    }
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    Point point = hVar.j;
                    motionEventObtain.setLocation(point.x, point.y);
                    hVar.f23914d.f14684b.b(motionEventObtain);
                    motionEventObtain.recycle();
                }
                parcel2.writeNoException();
                return true;
            case 3:
                vb.b.r0(parcel.readStrongBinder());
                vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 4:
                vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                vb.a aVarR03 = vb.b.r0(parcel.readStrongBinder());
                pt ptVarH4 = ot.h4(parcel.readStrongBinder());
                ng.f(parcel);
                ((fb.h) this).h4(arrayListCreateTypedArrayList, aVarR03, ptVarH4, false);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                vb.a aVarR04 = vb.b.r0(parcel.readStrongBinder());
                pt ptVarH42 = ot.h4(parcel.readStrongBinder());
                ng.f(parcel);
                ((fb.h) this).i4(arrayListCreateTypedArrayList2, aVarR04, ptVarH42, false);
                parcel2.writeNoException();
                return true;
            case 7:
                st stVar2 = (st) ng.b(parcel, st.CREATOR);
                ng.f(parcel);
                fb.h hVar2 = (fb.h) this;
                hVar2.f23918i = stVar2;
                hVar2.f23916f.a(1);
                parcel2.writeNoException();
                return true;
            case 8:
                vb.a aVarR05 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                fb.h hVar3 = (fb.h) this;
                pk pkVar = sk.Pa;
                rk rkVar = va.s.f36163e.f36166c;
                if (((Boolean) rkVar.a(pkVar)).booleanValue()) {
                    pk pkVar2 = sk.n8;
                    if (!((Boolean) rkVar.a(pkVar2)).booleanValue()) {
                        hVar3.j4();
                    }
                    WebView webView = (WebView) vb.b.U0(aVarR05);
                    if (webView == null) {
                        za.i.e("The webView cannot be null.");
                    } else {
                        fb.v vVar = hVar3.G;
                        fb.y yVar = new fb.y(webView, vVar, fx.f11279f);
                        webView.addJavascriptInterface(new fb.a(webView, hVar3.f23914d, hVar3.f23920l, hVar3.f23921m, hVar3.f23915e, hVar3.F, vVar, yVar), "gmaSdk");
                        if (((Boolean) rkVar.a(sk.Za)).booleanValue()) {
                            ua.j.C.f35265h.f19202l.incrementAndGet();
                        }
                        if (((Boolean) zl.f19112c.u()).booleanValue()) {
                            vVar.a(webView);
                            if (((Boolean) zl.f19113d.u()).booleanValue()) {
                                fx.f11277d.scheduleWithFixedDelay(new fb.x(yVar, 1), 0L, ((Integer) rkVar.a(sk.f16045ab)).intValue(), TimeUnit.MILLISECONDS);
                            }
                        }
                        if (((Boolean) rkVar.a(pkVar2)).booleanValue()) {
                            hVar3.j4();
                        }
                    }
                }
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                vb.a aVarR06 = vb.b.r0(parcel.readStrongBinder());
                pt ptVarH43 = ot.h4(parcel.readStrongBinder());
                ng.f(parcel);
                ((fb.h) this).h4(arrayListCreateTypedArrayList3, aVarR06, ptVarH43, true);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                vb.a aVarR07 = vb.b.r0(parcel.readStrongBinder());
                pt ptVarH44 = ot.h4(parcel.readStrongBinder());
                ng.f(parcel);
                ((fb.h) this).i4(arrayListCreateTypedArrayList4, aVarR07, ptVarH44, true);
                parcel2.writeNoException();
                return true;
            case 11:
                vb.a aVarR08 = vb.b.r0(parcel.readStrongBinder());
                vb.a aVarR09 = vb.b.r0(parcel.readStrongBinder());
                String string = parcel.readString();
                vb.a aVarR010 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                fb.h hVar4 = (fb.h) this;
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16095db)).booleanValue()) {
                    Context context = (Context) vb.b.U0(aVarR08);
                    u.h hVar5 = (u.h) vb.b.U0(aVarR09);
                    u.a aVar = (u.a) vb.b.U0(aVarR010);
                    dl dlVar = hVar4.E;
                    dlVar.getClass();
                    if (context == null) {
                        throw new IllegalArgumentException("App Context parameter is null");
                    }
                    if (TextUtils.isEmpty(string)) {
                        throw new IllegalArgumentException("Origin parameter is empty or null");
                    }
                    if (hVar5 == null) {
                        throw new IllegalArgumentException("CustomTabsClient parameter is null");
                    }
                    dlVar.f10506l = context;
                    dlVar.j = string;
                    ud0 ud0Var = (ud0) dlVar.f10502f;
                    bl blVar = new bl(dlVar, aVar, ud0Var);
                    dlVar.f10503h = blVar;
                    u.p pVarC = hVar5.c(blVar);
                    dlVar.f10504i = pVarC;
                    if (pVarC == null) {
                        za.i.e("CustomTabsClient failed to create new session.");
                    }
                    u6.t.B(ud0Var, "pact_action", new Pair("pe", "pact_init"));
                    if (((Boolean) zl.f19114e.u()).booleanValue()) {
                        fb.z zVar = hVar4.F;
                        synchronized (zVar) {
                            zVar.c(true);
                            zVar.c(false);
                        }
                    }
                    if (((Boolean) zl.f19112c.u()).booleanValue()) {
                        hVar4.G.a(null);
                    }
                    bVar = new vb.b((u.p) dlVar.f10504i);
                } else {
                    bVar = new vb.b(null);
                }
                parcel2.writeNoException();
                ng.e(parcel2, bVar);
                return true;
            default:
                return false;
        }
    }
}
