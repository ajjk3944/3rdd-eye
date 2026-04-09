package com.staircase3.opensignal.activities;

import android.R;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.SQLException;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.percentlayout.widget.PercentRelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b9.e;
import bf.n;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.staircase3.opensignal.library.cells.NewCell;
import com.staircase3.opensignal.models.PlaceType;
import com.staircase3.opensignal.refactor.SpeedTestItem;
import com.staircase3.opensignal.utils.q;
import com.staircase3.opensignal.utils.r;
import com.staircase3.opensignal.utils.u;
import i.g;
import i.j;
import io.sentry.hints.i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import lf.t1;
import oh.p;
import p.l2;
import pb.l0;
import qk.h;
import qk.l;
import qk.m;
import qm.f;
import rk.o;
import sm.k;
import u.j0;
import uc.d;

/* loaded from: classes.dex */
public class TowersActivity extends j implements d, qm.b {
    public static int Y0;
    public static int Z0;
    public RecyclerView G0;
    public g H0;
    public Toolbar I0;
    public wc.c K0;
    public wc.b N0;
    public wc.b O0;
    public wc.b P0;
    public wc.b Q0;
    public wc.b R0;
    public wc.b S0;
    public wc.b T0;
    public TowersActivity U;
    public wc.b U0;
    public q3.a V;
    public wc.b V0;
    public LatLng W;
    public LatLng X;
    public LatLng Y;

    /* renamed from: d0, reason: collision with root package name */
    public int f6040d0;

    /* renamed from: e0, reason: collision with root package name */
    public String f6041e0;

    /* renamed from: f0, reason: collision with root package name */
    public wc.d f6042f0;

    /* renamed from: h0, reason: collision with root package name */
    public Drawable f6044h0;

    /* renamed from: i0, reason: collision with root package name */
    public al.b f6045i0;

    /* renamed from: j0, reason: collision with root package name */
    public al.d f6046j0;

    /* renamed from: k0, reason: collision with root package name */
    public al.d f6047k0;

    /* renamed from: p0, reason: collision with root package name */
    public double f6052p0;

    /* renamed from: q0, reason: collision with root package name */
    public double f6053q0;

    /* renamed from: r0, reason: collision with root package name */
    public double f6054r0;

    /* renamed from: s0, reason: collision with root package name */
    public double f6055s0;

    /* renamed from: t0, reason: collision with root package name */
    public k f6056t0;

    /* renamed from: w0, reason: collision with root package name */
    public String f6059w0;

    /* renamed from: x0, reason: collision with root package name */
    public e f6060x0;

    /* renamed from: y0, reason: collision with root package name */
    public qm.c f6061y0;

    /* renamed from: z0, reason: collision with root package name */
    public LocationRequest f6062z0;
    public int T = 12;
    public final ArrayList Z = new ArrayList();

    /* renamed from: a0, reason: collision with root package name */
    public List f6037a0 = new ArrayList();

    /* renamed from: b0, reason: collision with root package name */
    public final ArrayList f6038b0 = new ArrayList();

    /* renamed from: c0, reason: collision with root package name */
    public final j0 f6039c0 = new j0(0);

    /* renamed from: g0, reason: collision with root package name */
    public final ExecutorService f6043g0 = Executors.newCachedThreadPool();

    /* renamed from: l0, reason: collision with root package name */
    public boolean f6048l0 = false;

    /* renamed from: m0, reason: collision with root package name */
    public b f6049m0 = b.CELL;

    /* renamed from: n0, reason: collision with root package name */
    public final HashMap f6050n0 = new HashMap();

    /* renamed from: o0, reason: collision with root package name */
    public boolean f6051o0 = false;

    /* renamed from: u0, reason: collision with root package name */
    public final float[] f6057u0 = new float[3];

    /* renamed from: v0, reason: collision with root package name */
    public final ArrayList f6058v0 = new ArrayList();
    public final Object A0 = y3.A(f.class);
    public final Object B0 = y3.A(r.class);
    public final Object C0 = y3.A(com.staircase3.opensignal.utils.k.class);
    public final Object D0 = y3.A(com.staircase3.opensignal.utils.a.class);
    public final Object E0 = y3.A(el.b.class);
    public int F0 = 0;
    public final ArrayList J0 = new ArrayList();
    public int L0 = -1;
    public int M0 = -1;
    public final HashMap W0 = new HashMap();
    public final HashMap X0 = new HashMap();

    public enum a {
        DID_NOT_DRAW,
        DREW_NORMAL_TOWER,
        DREW_CONNECTED_TOWER
    }

    public enum b {
        CELL,
        SPEEDTEST
    }

    public enum c {
        NORMAL_CELL,
        SELECTED_CELL,
        GRAY_CELL,
        NORMAL_SPEEDTEST_WIFI,
        SELECTED_SPEEDTEST_WIFI,
        GRAY_SPEEDTEST_WIFI,
        NORMAL_SPEEDTEST_MOBILE,
        SELECTED_SPEEDTEST_MOBILE,
        GRAY_SPEEDTEST_MOBILE
    }

    public static void x(TowersActivity towersActivity) {
        towersActivity.F(null);
        towersActivity.K0 = null;
        b bVar = towersActivity.f6049m0;
        if (bVar == b.CELL) {
            towersActivity.K(towersActivity.f6037a0, null);
        } else if (bVar == b.SPEEDTEST) {
            towersActivity.J(towersActivity.f6058v0, null);
        }
        towersActivity.f6051o0 = false;
    }

    public static boolean y(TowersActivity towersActivity, LatLng latLng) {
        ArrayList arrayList = towersActivity.f6038b0;
        if (latLng == null || arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LatLng latLngA = ((wc.c) it.next()).a();
            if (latLngA != null && latLngA.f5347a == latLng.f5347a && latLngA.f5348d == latLng.f5348d) {
                return true;
            }
        }
        return false;
    }

    public final wc.b A(View view, c cVar) {
        HashMap map = this.X0;
        if (map.containsKey(cVar)) {
            return (wc.b) map.get(cVar);
        }
        try {
            view.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            view.measure(Y0, Z0);
            view.layout(0, 0, Y0, Z0);
            view.buildDrawingCache();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(bitmapCreateBitmap));
            wc.b bVarN = i4.n(bitmapCreateBitmap);
            bitmapCreateBitmap.recycle();
            map.put(cVar, bVarN);
            view.destroyDrawingCache();
            return bVarN;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void B() {
        if (this.F0 < 5) {
            new uk.b(this.U, new tm.f(this.f6040d0), new o(this)).execute(new Void[0]);
        }
    }

    public final a C(k kVar, k kVar2) {
        double d6;
        k kVar3;
        k kVar4;
        boolean z10 = (kVar.f22139d == 0.0d && kVar.f22140e == 0.0d) ? false : true;
        int i10 = kVar.f22137b;
        if (!z10) {
            return a.DID_NOT_DRAW;
        }
        if (kVar.f22141f && ((kVar4 = this.f6056t0) == null || kVar4 != kVar)) {
            this.f6056t0 = kVar;
            I();
        }
        j0 j0Var = this.f6039c0;
        if (v.a.a(j0Var.f23085g, i10, j0Var.f23083a) >= 0) {
            wc.c cVar = (wc.c) j0Var.c(i10);
            if (cVar != null) {
                try {
                    if (kVar2 == null) {
                        cVar.c(D(c.NORMAL_CELL));
                    } else {
                        c cVar2 = c.GRAY_CELL;
                        if (i10 == kVar2.f22137b) {
                            cVar2 = c.SELECTED_CELL;
                        }
                        cVar.c(D(cVar2));
                    }
                } catch (Exception unused) {
                }
            }
            d6 = 0.0d;
        } else {
            if (kVar.f22141f) {
                LatLng latLng = this.W;
                if (latLng == null) {
                    d6 = 0.0d;
                } else {
                    float[] fArr = new float[1];
                    d6 = 0.0d;
                    Location.distanceBetween(latLng.f5347a, latLng.f5348d, kVar.f22139d, kVar.f22140e, fArr);
                    if (fArr[0] > 10000.0f) {
                    }
                }
                try {
                    kc.f.f14287c.i();
                    kVar.f22139d = kc.f.f14287c.f();
                    kVar.f22140e = kc.f.f14287c.g();
                } catch (Exception unused2) {
                }
            } else {
                d6 = 0.0d;
            }
            MarkerOptions markerOptions = new MarkerOptions();
            if (kVar2 == null) {
                markerOptions.f5352a = new LatLng(kVar.f22139d, kVar.f22140e);
                markerOptions.f5353d = this.f6041e0 + " " + getString(l.cell_tower);
                markerOptions.f5355r = D(c.NORMAL_CELL);
            } else {
                c cVar3 = c.GRAY_CELL;
                if (i10 == kVar2.f22137b) {
                    cVar3 = c.SELECTED_CELL;
                }
                markerOptions.f5352a = new LatLng(kVar.f22139d, kVar.f22140e);
                markerOptions.f5353d = this.f6041e0 + " " + getString(l.cell_tower);
                markerOptions.f5355r = D(cVar3);
            }
            q3.a aVar = this.V;
            if (aVar != null) {
                wc.c cVarR0 = aVar.r0(markerOptions);
                cVarR0.d(kVar);
                this.f6038b0.add(cVarR0);
                j0Var.d(i10, cVarR0);
            }
        }
        if (kVar.f22141f && ((kVar.f22139d != d6 || kVar.f22140e != d6) && ((kVar3 = this.f6056t0) == null || kVar3 != kVar))) {
            this.f6056t0 = kVar;
            I();
        }
        return kVar.f22141f ? a.DREW_CONNECTED_TOWER : a.DREW_NORMAL_TOWER;
    }

    public final wc.b D(c cVar) {
        switch (com.staircase3.opensignal.activities.a.f6063a[cVar.ordinal()]) {
            case 1:
                return this.T0;
            case 2:
                return this.S0;
            case 3:
                return this.N0;
            case 4:
                return this.O0;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return this.U0;
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return this.V0;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return this.P0;
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return this.Q0;
            case 9:
                return this.R0;
            default:
                return this.P0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0092 A[Catch: Exception -> 0x00a7, TryCatch #2 {Exception -> 0x00a7, blocks: (B:7:0x001e, B:19:0x0059, B:21:0x0068, B:28:0x007a, B:30:0x007e, B:31:0x0087, B:32:0x0092, B:33:0x009d, B:16:0x003b, B:17:0x0047, B:18:0x0053, B:20:0x005d), top: B:53:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d A[Catch: Exception -> 0x00a7, TRY_LEAVE, TryCatch #2 {Exception -> 0x00a7, blocks: (B:7:0x001e, B:19:0x0059, B:21:0x0068, B:28:0x007a, B:30:0x007e, B:31:0x0087, B:32:0x0092, B:33:0x009d, B:16:0x003b, B:17:0x0047, B:18:0x0053, B:20:0x005d), top: B:53:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final wc.b E(android.widget.ImageView r11, android.widget.ImageView r12, android.widget.ImageView r13, com.staircase3.opensignal.activities.TowersActivity.c r14, int r15) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.staircase3.opensignal.activities.TowersActivity.E(android.widget.ImageView, android.widget.ImageView, android.widget.ImageView, com.staircase3.opensignal.activities.TowersActivity$c, int):wc.b");
    }

    public final void F(om.f fVar) {
        if (this.f6051o0) {
            if (this.f6049m0 == b.CELL) {
                ic.a.N((CardView) ((cj.a) this.f6045i0.f811c).f3974d, com.staircase3.opensignal.utils.f.BOTTOM, com.staircase3.opensignal.utils.e.DOWN, fVar);
            }
            if (this.f6049m0 == b.SPEEDTEST) {
                ic.a.N((CardView) ((a8.f) this.f6045i0.f812d).f195a, com.staircase3.opensignal.utils.f.BOTTOM, com.staircase3.opensignal.utils.e.DOWN, fVar);
            }
            this.f6051o0 = false;
        }
    }

    public final void G(int i10) {
        DisplayMetrics displayMetrics;
        TowersActivity towersActivity;
        try {
            WindowManager windowManager = (WindowManager) getSystemService("window");
            DisplayMetrics displayMetrics2 = null;
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
            } else {
                displayMetrics = null;
            }
            Y0 = displayMetrics != null ? displayMetrics.widthPixels : 0;
            WindowManager windowManager2 = (WindowManager) getSystemService("window");
            if (windowManager2 != null) {
                Display defaultDisplay2 = windowManager2.getDefaultDisplay();
                displayMetrics2 = new DisplayMetrics();
                defaultDisplay2.getMetrics(displayMetrics2);
            }
            Z0 = displayMetrics2 != null ? displayMetrics2.heightPixels : 0;
            if (this.f6049m0 == b.CELL) {
                al.d dVar = this.f6046j0;
                try {
                    wc.b bVarE = E(dVar.f829b, dVar.f830c, this.f6047k0.f830c, c.NORMAL_CELL, i10);
                    towersActivity = this;
                    try {
                        towersActivity.P0 = bVarE;
                        al.d dVar2 = towersActivity.f6046j0;
                        towersActivity.O0 = towersActivity.E(dVar2.f829b, dVar2.f830c, towersActivity.f6047k0.f830c, c.GRAY_CELL, i10);
                        al.d dVar3 = towersActivity.f6047k0;
                        towersActivity.N0 = towersActivity.E(dVar3.f829b, towersActivity.f6046j0.f830c, dVar3.f830c, c.SELECTED_CELL, i10);
                    } catch (Exception unused) {
                        return;
                    }
                } catch (Exception unused2) {
                    return;
                }
            } else {
                towersActivity = this;
            }
            if (towersActivity.f6049m0 == b.SPEEDTEST) {
                al.d dVar4 = towersActivity.f6046j0;
                towersActivity.Q0 = towersActivity.E(dVar4.f829b, dVar4.f830c, towersActivity.f6047k0.f830c, c.NORMAL_SPEEDTEST_WIFI, -1);
                al.d dVar5 = towersActivity.f6046j0;
                towersActivity.U0 = towersActivity.E(dVar5.f829b, dVar5.f830c, towersActivity.f6047k0.f830c, c.GRAY_SPEEDTEST_WIFI, -1);
                al.d dVar6 = towersActivity.f6047k0;
                towersActivity.S0 = towersActivity.E(dVar6.f829b, towersActivity.f6046j0.f830c, dVar6.f830c, c.SELECTED_SPEEDTEST_WIFI, -1);
                al.d dVar7 = towersActivity.f6046j0;
                towersActivity.R0 = towersActivity.E(dVar7.f829b, dVar7.f830c, towersActivity.f6047k0.f830c, c.NORMAL_SPEEDTEST_MOBILE, -1);
                al.d dVar8 = towersActivity.f6046j0;
                towersActivity.V0 = towersActivity.E(dVar8.f829b, dVar8.f830c, towersActivity.f6047k0.f830c, c.GRAY_SPEEDTEST_MOBILE, -1);
                al.d dVar9 = towersActivity.f6047k0;
                towersActivity.T0 = towersActivity.E(dVar9.f829b, towersActivity.f6046j0.f830c, dVar9.f830c, c.SELECTED_SPEEDTEST_MOBILE, -1);
            }
        } catch (Exception unused3) {
        }
    }

    public final boolean H() {
        q3.a aVar = this.V;
        if (aVar == null) {
            return false;
        }
        try {
            this.X = aVar.E0().B().f5384g;
            this.Y = this.V.E0().B().f5383d;
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void I() {
        k kVar;
        LatLng latLng;
        qc.f dVar;
        if (this.V == null || (kVar = this.f6056t0) == null || (latLng = this.W) == null) {
            return;
        }
        Location.distanceBetween(latLng.f5347a, latLng.f5348d, kVar.f22139d, kVar.f22140e, this.f6057u0);
        if (this.f6057u0[0] < 10000.0f) {
            wc.d dVar2 = this.f6042f0;
            if (dVar2 != null) {
                try {
                    qc.d dVar3 = (qc.d) dVar2.f24410a;
                    dVar3.S(dVar3.R(), 1);
                } catch (RemoteException e4) {
                    throw new n(e4);
                }
            }
            q3.a aVar = this.V;
            PolylineOptions polylineOptions = new PolylineOptions();
            LatLng latLng2 = this.W;
            k kVar2 = this.f6056t0;
            Collections.addAll(polylineOptions.f5360a, latLng2, new LatLng(kVar2.f22139d, kVar2.f22140e));
            polylineOptions.f5361d = 10.0f;
            polylineOptions.f5362g = u.b(this.U, qk.d.os4_blue_main);
            aVar.getClass();
            try {
                vc.g gVar = (vc.g) aVar.f20679d;
                Parcel parcelR = gVar.R();
                qc.l.c(parcelR, polylineOptions);
                Parcel parcelE = gVar.e(parcelR, 9);
                IBinder strongBinder = parcelE.readStrongBinder();
                int i10 = qc.e.f20840e;
                if (strongBinder == null) {
                    dVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
                    dVar = iInterfaceQueryLocalInterface instanceof qc.f ? (qc.f) iInterfaceQueryLocalInterface : new qc.d(strongBinder, "com.google.android.gms.maps.model.internal.IPolylineDelegate", 4);
                }
                parcelE.recycle();
                this.f6042f0 = new wc.d(dVar);
            } catch (RemoteException e10) {
                throw new n(e10);
            }
        }
    }

    public final void J(ArrayList arrayList, SpeedTestItem speedTestItem) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            SpeedTestItem speedTestItem2 = (SpeedTestItem) it.next();
            LatLng latLng = speedTestItem2.f6142x;
            boolean z10 = speedTestItem2.B;
            long j = speedTestItem2.f6141r;
            if (latLng != null) {
                double d6 = latLng.f5348d;
                double d10 = latLng.f5347a;
                if (d10 != 0.0d || d6 != 0.0d) {
                    String str = "" + j;
                    HashMap map = this.f6050n0;
                    if (map.containsKey(str)) {
                        wc.c cVar = (wc.c) map.get("" + j);
                        if (cVar != null) {
                            if (speedTestItem != null) {
                                cVar.c(D(j == speedTestItem.f6141r ? speedTestItem.B ? c.SELECTED_SPEEDTEST_WIFI : c.SELECTED_SPEEDTEST_MOBILE : z10 ? c.GRAY_SPEEDTEST_WIFI : c.GRAY_SPEEDTEST_MOBILE));
                            } else if (z10) {
                                try {
                                    cVar.c(D(c.NORMAL_SPEEDTEST_WIFI));
                                } catch (Exception unused) {
                                }
                            } else {
                                cVar.c(D(c.NORMAL_SPEEDTEST_MOBILE));
                            }
                        }
                    } else {
                        MarkerOptions markerOptions = new MarkerOptions();
                        Random random = u.f6197c;
                        double dNextDouble = (random.nextDouble() * 1.4E-4d) - 7.0E-5d;
                        double dNextDouble2 = (random.nextDouble() * 1.4E-4d) - 7.0E-5d;
                        if (speedTestItem == null) {
                            c cVar2 = z10 ? c.NORMAL_SPEEDTEST_WIFI : c.NORMAL_SPEEDTEST_MOBILE;
                            markerOptions.f5352a = new LatLng(d10 + dNextDouble, d6 + dNextDouble2);
                            markerOptions.f5353d = getString(l.speed);
                            markerOptions.f5355r = D(cVar2);
                        } else {
                            c cVar3 = j == speedTestItem.f6141r ? z10 ? c.SELECTED_SPEEDTEST_WIFI : c.SELECTED_SPEEDTEST_MOBILE : z10 ? c.GRAY_SPEEDTEST_WIFI : c.GRAY_SPEEDTEST_MOBILE;
                            markerOptions.f5352a = new LatLng(d10 + dNextDouble, d6 + dNextDouble2);
                            markerOptions.f5353d = getString(l.speed);
                            markerOptions.f5355r = D(cVar3);
                        }
                        wc.c cVarR0 = this.V.r0(markerOptions);
                        cVarR0.d(speedTestItem2);
                        this.f6038b0.add(cVarR0);
                        map.put("" + j, cVarR0);
                    }
                }
            }
        }
    }

    public final void K(List list, k kVar) {
        NewCell newCell;
        wc.c cVar;
        if (list == null) {
            return;
        }
        if (kVar == null && (cVar = this.K0) != null && (kVar = (k) cVar.b()) != null) {
            this.f6037a0.add(kVar);
            list.add(kVar);
        }
        Iterator it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (C((k) it.next(), kVar) == a.DREW_CONNECTED_TOWER) {
                z10 = true;
            }
        }
        if (z10 || (newCell = kc.f.f14287c) == null) {
            return;
        }
        k kVar2 = new k();
        kVar2.f22142g = -1.0f;
        if (newCell != null) {
            kVar2.f22136a = 0;
            kVar2.f22137b = newCell.d();
            kVar2.f22138c = newCell.e();
            newCell.h();
            kVar2.f22139d = newCell.f();
            kVar2.f22140e = newCell.g();
        }
        kVar2.f22141f = true;
        C(kVar2, kVar);
    }

    public final void L(k kVar) {
        List list = this.f6037a0;
        if (list == null || list.size() == 0) {
            return;
        }
        if (t1.r((k) this.f6037a0.get(0), this.W) < t1.r(kVar, this.W)) {
            this.f6056t0 = (k) this.f6037a0.get(0);
        } else if (kVar.f22137b > -1) {
            this.f6037a0.remove(kVar);
            this.f6037a0.add(0, kVar);
            this.f6056t0 = kVar;
        }
    }

    public final void M() throws Resources.NotFoundException {
        this.f6041e0 = q.c(this.U).getString("network_name", "");
        try {
            try {
                this.f6040d0 = Integer.parseInt(q.c(this.U).getString("network_opensignal_id", "-1"));
            } catch (NumberFormatException unused) {
            }
            cj.a aVarG = sm.f.G(this.f6040d0);
            this.f6044h0 = getDrawable(qk.f.ic_blue_background_circle_transparent);
            ((ImageView) ((cj.a) ((cj.a) this.f6045i0.f811c).f3975g).f3974d).setImageResource(qk.f.ic_pin_mobile);
            if (aVarG != null) {
                try {
                    String str = (String) aVarG.f3977x;
                    if (str != null && !str.isEmpty()) {
                        int color = Color.parseColor("#" + ((String) aVarG.f3977x).toUpperCase());
                        this.f6044h0.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_ATOP));
                        G(color);
                        List list = this.f6037a0;
                        if (list != null) {
                            K(list, null);
                        }
                    }
                } catch (Exception unused2) {
                    int color2 = getResources().getColor(qk.d.os4_blue_main);
                    this.f6044h0.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.SRC_ATOP));
                    G(color2);
                }
                ((ImageView) ((cj.a) ((cj.a) this.f6045i0.f811c).f3975g).f3974d).setImageBitmap(uk.b.f23575e);
                ((TextView) ((cj.a) ((cj.a) this.f6045i0.f811c).f3975g).f3977x).setText((String) aVarG.f3974d);
            } else {
                G(Color.parseColor("#FF1AA8DB"));
                B();
            }
        } catch (NumberFormatException unused3) {
        }
        this.F0 = 0;
    }

    public final void N(wc.c cVar) {
        this.f6051o0 = true;
        if (this.f6049m0 == b.CELL) {
            ((RelativeLayout) ((cj.a) ((cj.a) this.f6045i0.f811c).f3975g).f3975g).setBackground(this.f6044h0);
            ((TextView) ((cj.a) ((cj.a) this.f6045i0.f811c).f3975g).f3977x).setText(this.f6041e0 + " " + getString(l.cell_tower));
            k kVar = (k) cVar.b();
            if (kVar != null) {
                ((TextView) ((cj.a) this.f6045i0.f811c).f3978y).setText(String.valueOf(kVar.f22138c));
                ((TextView) ((cj.a) this.f6045i0.f811c).f3977x).setText(String.valueOf(kVar.f22137b));
                if (kVar.f22141f) {
                    k kVar2 = this.f6056t0;
                    if (kVar2 == null || kVar2 != kVar) {
                        this.f6056t0 = kVar;
                        I();
                    }
                    ((TextView) ((cj.a) ((cj.a) this.f6045i0.f811c).f3975g).f3976r).setText(l.connected_tower);
                    ((TextView) ((cj.a) ((cj.a) this.f6045i0.f811c).f3975g).f3976r).setVisibility(0);
                } else {
                    ((TextView) ((cj.a) ((cj.a) this.f6045i0.f811c).f3975g).f3976r).setVisibility(8);
                }
            }
            K(this.f6037a0, kVar);
            ic.a.N((CardView) ((cj.a) this.f6045i0.f811c).f3974d, com.staircase3.opensignal.utils.f.BOTTOM, com.staircase3.opensignal.utils.e.UP, new i(24));
        }
        if (this.f6049m0 == b.SPEEDTEST) {
            SpeedTestItem speedTestItem = (SpeedTestItem) cVar.b();
            if (speedTestItem != null) {
                ((TextView) ((cj.a) ((a8.f) this.f6045i0.f812d).f196b).f3977x).setText(speedTestItem.f6143y);
                String strB = com.staircase3.opensignal.utils.i.b(Long.parseLong(speedTestItem.f6138a), getResources());
                String strB2 = com.staircase3.opensignal.utils.i.b(Long.parseLong(speedTestItem.f6139d), getResources());
                String string = getResources().getString(l.latency_format, Long.valueOf(speedTestItem.f6140g));
                ((TextView) ((a8.f) this.f6045i0.f812d).f198d).setText(strB);
                ((TextView) ((a8.f) this.f6045i0.f812d).f202h).setText(strB2);
                ((TextView) ((a8.f) this.f6045i0.f812d).f199e).setText(string);
                PlaceType placeType = speedTestItem.G;
                ((TextView) ((a8.f) this.f6045i0.f812d).f200f).setText(placeType == PlaceType.INDOOR ? getString(l.indoor) : placeType == PlaceType.OUTDOOR ? getString(l.outdoor) : "");
                ((ImageView) ((cj.a) ((a8.f) this.f6045i0.f812d).f196b).f3974d).setVisibility(8);
                ((TextView) ((cj.a) ((a8.f) this.f6045i0.f812d).f196b).f3976r).setVisibility(0);
                if (speedTestItem.B) {
                    ((RelativeLayout) ((cj.a) ((a8.f) this.f6045i0.f812d).f196b).f3975g).setBackground(getDrawable(qk.f.ic_wifi_a));
                    ((TextView) ((cj.a) ((a8.f) this.f6045i0.f812d).f196b).f3976r).setText(getString(l.wifi));
                } else {
                    ((RelativeLayout) ((cj.a) ((a8.f) this.f6045i0.f812d).f196b).f3975g).setBackground(getDrawable(qk.f.ic_cellular_a));
                    ((TextView) ((cj.a) ((a8.f) this.f6045i0.f812d).f196b).f3976r).setText(getString(l.mobile));
                }
                TextView textView = (TextView) ((a8.f) this.f6045i0.f812d).f201g;
                String str = ((DateFormat) this.f6060x0.f2481d).format(new Date(speedTestItem.f6141r));
                br.l.d(str, "format(...)");
                textView.setText(str);
            }
            J(this.f6058v0, speedTestItem);
            ic.a.N((CardView) ((a8.f) this.f6045i0.f812d).f195a, com.staircase3.opensignal.utils.f.BOTTOM, com.staircase3.opensignal.utils.e.UP, new sm.f(24));
        }
    }

    public final void O() {
        LatLng latLng = this.X;
        double d6 = latLng.f5347a;
        LatLng latLng2 = this.Y;
        double d10 = latLng2.f5347a;
        double d11 = latLng2.f5348d;
        double d12 = latLng.f5348d;
        double d13 = (d6 - d10) / 1.0d;
        this.f6052p0 = d6 + d13;
        double d14 = (d11 - d12) / 1.0d;
        this.f6053q0 = d12 - d14;
        this.f6054r0 = d10 - d13;
        this.f6055s0 = d11 + d14;
    }

    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object, lq.h] */
    @Override // uc.d
    public final void c(q3.a aVar) throws Resources.NotFoundException {
        this.V = aVar;
        aVar.G0().g0(true);
        vc.g gVar = (vc.g) this.V.f20679d;
        try {
            uc.f fVar = new uc.f(this);
            Parcel parcelR = gVar.R();
            qc.l.d(parcelR, fVar);
            gVar.S(parcelR, 30);
            q3.a aVar2 = this.V;
            int i10 = qk.k.map_style_json;
            InputStream inputStreamOpenRawResource = getResources().openRawResource(i10);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    try {
                        int i11 = inputStreamOpenRawResource.read(bArr, 0, 1024);
                        if (i11 == -1) {
                            break;
                        } else {
                            byteArrayOutputStream.write(bArr, 0, i11);
                        }
                    } catch (Throwable th2) {
                        gc.b.b(inputStreamOpenRawResource);
                        gc.b.b(byteArrayOutputStream);
                        throw th2;
                    }
                }
                gc.b.b(inputStreamOpenRawResource);
                gc.b.b(byteArrayOutputStream);
                MapStyleOptions mapStyleOptions = new MapStyleOptions(new String(byteArrayOutputStream.toByteArray(), "UTF-8"));
                aVar2.getClass();
                try {
                    vc.g gVar2 = (vc.g) aVar2.f20679d;
                    Parcel parcelR2 = gVar2.R();
                    qc.l.c(parcelR2, mapStyleOptions);
                    Parcel parcelE = gVar2.e(parcelR2, 91);
                    parcelE.readInt();
                    parcelE.recycle();
                    q3.a aVar3 = this.V;
                    aVar3.getClass();
                    try {
                        vc.g gVar3 = (vc.g) aVar3.f20679d;
                        gVar3.S(gVar3.R(), 14);
                        ((f) this.A0.getValue()).getClass();
                        if (f.a(this)) {
                            this.V.O0();
                        }
                        this.V.P0(new o(this));
                        q3.a aVar4 = this.V;
                        p pVar = new p(12, this);
                        vc.g gVar4 = (vc.g) aVar4.f20679d;
                        try {
                            uc.f fVar2 = new uc.f(pVar);
                            Parcel parcelR3 = gVar4.R();
                            qc.l.d(parcelR3, fVar2);
                            gVar4.S(parcelR3, 29);
                            q3.a aVar5 = this.V;
                            o2.g gVar5 = new o2.g(14, this);
                            vc.g gVar6 = (vc.g) aVar5.f20679d;
                            try {
                                uc.f fVar3 = new uc.f(gVar5);
                                Parcel parcelR4 = gVar6.R();
                                qc.l.d(parcelR4, fVar3);
                                gVar6.S(parcelR4, 28);
                                z(14);
                                I();
                                if (this.f6049m0 == b.SPEEDTEST) {
                                    J(this.f6058v0, null);
                                }
                            } catch (RemoteException e4) {
                                throw new n(e4);
                            }
                        } catch (RemoteException e10) {
                            throw new n(e10);
                        }
                    } catch (RemoteException e11) {
                        throw new n(e11);
                    }
                } catch (RemoteException e12) {
                    throw new n(e12);
                }
            } catch (IOException e13) {
                throw new Resources.NotFoundException("Failed to read resource " + i10 + ": " + e13.toString());
            }
        } catch (RemoteException e14) {
            throw new n(e14);
        }
    }

    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r2v67, types: [java.lang.Object, lq.h] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, lq.h] */
    @Override // i.j, c.l, g3.g, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View viewA;
        super.onCreate(bundle);
        boolean z10 = false;
        byte b2 = 0;
        View viewInflate = getLayoutInflater().inflate(qk.i.activity_towers, (ViewGroup) null, false);
        int i10 = h.cardInfoCell;
        View viewA2 = b4.A(viewInflate, i10);
        if (viewA2 != null) {
            int i11 = h.cardInfoHeader;
            View viewA3 = b4.A(viewA2, i11);
            if (viewA3 != null) {
                cj.a aVarO = cj.a.o(viewA3);
                i11 = h.cellInfoContainer;
                if (((PercentRelativeLayout) b4.A(viewA2, i11)) != null && (viewA = b4.A(viewA2, (i11 = h.divider))) != null) {
                    i11 = h.layoutCellId;
                    if (((LinearLayout) b4.A(viewA2, i11)) != null) {
                        i11 = h.layoutLac;
                        if (((LinearLayout) b4.A(viewA2, i11)) != null) {
                            i11 = h.tvCID;
                            TextView textView = (TextView) b4.A(viewA2, i11);
                            if (textView != null) {
                                i11 = h.tvLAC;
                                TextView textView2 = (TextView) b4.A(viewA2, i11);
                                if (textView2 != null) {
                                    cj.a aVar = new cj.a((CardView) viewA2, aVarO, viewA, textView, textView2, 2);
                                    i10 = h.cardInfoSpeedtest;
                                    View viewA4 = b4.A(viewInflate, i10);
                                    if (viewA4 != null) {
                                        int i12 = h.cardInfoHeader;
                                        View viewA5 = b4.A(viewA4, i12);
                                        if (viewA5 != null) {
                                            cj.a aVarO2 = cj.a.o(viewA5);
                                            i12 = h.divider;
                                            View viewA6 = b4.A(viewA4, i12);
                                            if (viewA6 != null) {
                                                i12 = h.layoutDownload;
                                                if (((LinearLayout) b4.A(viewA4, i12)) != null) {
                                                    i12 = h.layoutUpload;
                                                    if (((LinearLayout) b4.A(viewA4, i12)) != null) {
                                                        i12 = h.speedResultContainer;
                                                        if (((PercentRelativeLayout) b4.A(viewA4, i12)) != null) {
                                                            i12 = h.tvSpeedtestDownload;
                                                            TextView textView3 = (TextView) b4.A(viewA4, i12);
                                                            if (textView3 != null) {
                                                                i12 = h.tvSpeedtestLatency;
                                                                TextView textView4 = (TextView) b4.A(viewA4, i12);
                                                                if (textView4 != null) {
                                                                    i12 = h.tvSpeedtestLocation;
                                                                    TextView textView5 = (TextView) b4.A(viewA4, i12);
                                                                    if (textView5 != null) {
                                                                        i12 = h.tvSpeedtestTime;
                                                                        TextView textView6 = (TextView) b4.A(viewA4, i12);
                                                                        if (textView6 != null) {
                                                                            i12 = h.tvSpeedtestUpload;
                                                                            TextView textView7 = (TextView) b4.A(viewA4, i12);
                                                                            if (textView7 != null) {
                                                                                a8.f fVar = new a8.f((CardView) viewA4, aVarO2, viewA6, textView3, textView4, textView5, textView6, textView7);
                                                                                i10 = h.divider;
                                                                                View viewA7 = b4.A(viewInflate, i10);
                                                                                if (viewA7 != null) {
                                                                                    i10 = h.fabLocation;
                                                                                    FloatingActionButton floatingActionButton = (FloatingActionButton) b4.A(viewInflate, i10);
                                                                                    if (floatingActionButton != null) {
                                                                                        i10 = h.ivBetaLabel;
                                                                                        ImageView imageView = (ImageView) b4.A(viewInflate, i10);
                                                                                        if (imageView != null) {
                                                                                            i10 = h.pbProgress;
                                                                                            ProgressBar progressBar = (ProgressBar) b4.A(viewInflate, i10);
                                                                                            if (progressBar != null) {
                                                                                                RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
                                                                                                i10 = h.toolbarTitle;
                                                                                                TextView textView8 = (TextView) b4.A(viewInflate, i10);
                                                                                                if (textView8 != null) {
                                                                                                    i10 = h.toolbarTowers;
                                                                                                    Toolbar toolbar = (Toolbar) b4.A(viewInflate, i10);
                                                                                                    if (toolbar != null) {
                                                                                                        this.f6045i0 = new al.b(relativeLayout, aVar, fVar, viewA7, floatingActionButton, imageView, progressBar, textView8, toolbar);
                                                                                                        setContentView(relativeLayout);
                                                                                                        View viewInflate2 = getLayoutInflater().inflate(qk.i.custom_marker, (ViewGroup) null, false);
                                                                                                        int i13 = h.pinBackground;
                                                                                                        AppCompatImageView appCompatImageView = (AppCompatImageView) b4.A(viewInflate2, i13);
                                                                                                        if (appCompatImageView != null) {
                                                                                                            i13 = h.pinIcon;
                                                                                                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) b4.A(viewInflate2, i13);
                                                                                                            if (appCompatImageView2 != null) {
                                                                                                                this.f6046j0 = new al.d((RelativeLayout) viewInflate2, appCompatImageView, appCompatImageView2);
                                                                                                                View viewInflate3 = getLayoutInflater().inflate(qk.i.custom_marker_big, (ViewGroup) null, false);
                                                                                                                int i14 = h.pinBackground;
                                                                                                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) b4.A(viewInflate3, i14);
                                                                                                                if (appCompatImageView3 != null) {
                                                                                                                    i14 = h.pinIcon;
                                                                                                                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) b4.A(viewInflate3, i14);
                                                                                                                    if (appCompatImageView4 != null) {
                                                                                                                        this.f6047k0 = new al.d((RelativeLayout) viewInflate3, appCompatImageView3, appCompatImageView4);
                                                                                                                        e eVar = new e(11, z10);
                                                                                                                        int i15 = 3;
                                                                                                                        int i16 = 2;
                                                                                                                        eVar.f2481d = DateFormat.getDateTimeInstance(3, 2);
                                                                                                                        Calendar calendar = Calendar.getInstance();
                                                                                                                        calendar.get(15);
                                                                                                                        calendar.get(16);
                                                                                                                        this.f6060x0 = eVar;
                                                                                                                        this.U = this;
                                                                                                                        HashMap map = this.X0;
                                                                                                                        if (map != null) {
                                                                                                                            map.clear();
                                                                                                                        }
                                                                                                                        HashMap map2 = this.W0;
                                                                                                                        if (map2 != null) {
                                                                                                                            map2.clear();
                                                                                                                        }
                                                                                                                        se.b.W(this, qk.d.status_bar_background);
                                                                                                                        ((ProgressBar) this.f6045i0.f816h).getIndeterminateDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
                                                                                                                        try {
                                                                                                                            Bundle extras = getIntent().getExtras();
                                                                                                                            if (extras != null) {
                                                                                                                                this.f6049m0 = (b) extras.getSerializable("map_type");
                                                                                                                            }
                                                                                                                        } catch (Exception unused) {
                                                                                                                        }
                                                                                                                        kc.f.j((RelativeLayout) this.f6045i0.f810b);
                                                                                                                        ((Toolbar) this.f6045i0.f817i).setTitle("");
                                                                                                                        ((Toolbar) this.f6045i0.f817i).setSubtitle("");
                                                                                                                        ((TextView) this.f6045i0.f809a).setText(l.cell_towers);
                                                                                                                        w((Toolbar) this.f6045i0.f817i);
                                                                                                                        b bVar = this.f6049m0;
                                                                                                                        b bVar2 = b.SPEEDTEST;
                                                                                                                        if (bVar == bVar2) {
                                                                                                                            ((TextView) this.f6045i0.f809a).setText(l.speed_test_history);
                                                                                                                        }
                                                                                                                        w((Toolbar) this.f6045i0.f817i);
                                                                                                                        n().T();
                                                                                                                        ((Toolbar) this.f6045i0.f817i).setNavigationIcon(qk.f.ic_arrow_back_white_36dp);
                                                                                                                        ((Toolbar) this.f6045i0.f817i).setNavigationOnClickListener(new rk.n(this, b2 == true ? 1 : 0));
                                                                                                                        rk.n nVar = new rk.n(this, 1);
                                                                                                                        ((RelativeLayout) ((cj.a) ((cj.a) this.f6045i0.f811c).f3975g).f3978y).setOnClickListener(nVar);
                                                                                                                        ((RelativeLayout) ((cj.a) ((a8.f) this.f6045i0.f812d).f196b).f3978y).setOnClickListener(nVar);
                                                                                                                        ((FloatingActionButton) this.f6045i0.f814f).setOnClickListener(new rk.n(this, i16));
                                                                                                                        View viewInflate4 = LayoutInflater.from(this.U).inflate(qk.i.layout_towers_list, (ViewGroup) null, false);
                                                                                                                        g gVarCreate = new i.f(this.U, m.DialogTheme_Fullscreen).setView(viewInflate4).create();
                                                                                                                        this.H0 = gVarCreate;
                                                                                                                        gVarCreate.setContentView(viewInflate4);
                                                                                                                        Toolbar toolbar2 = (Toolbar) viewInflate4.findViewById(h.toolbarSpeedtestList);
                                                                                                                        this.I0 = toolbar2;
                                                                                                                        if (toolbar2 != null) {
                                                                                                                            toolbar2.setNavigationIcon(qk.f.ic_arrow_back_white_36dp);
                                                                                                                            this.I0.setNavigationOnClickListener(new rk.n(this, 5));
                                                                                                                        }
                                                                                                                        ImageView imageView2 = (ImageView) viewInflate4.findViewById(h.ivSpeedtestListMap);
                                                                                                                        imageView2.setOnClickListener(new rk.n(this, 6));
                                                                                                                        RecyclerView recyclerView = (RecyclerView) viewInflate4.findViewById(h.listTowers);
                                                                                                                        this.G0 = recyclerView;
                                                                                                                        recyclerView.setHasFixedSize(true);
                                                                                                                        this.G0.setLayoutManager(new LinearLayoutManager());
                                                                                                                        if (this.f6049m0 == bVar2) {
                                                                                                                            imageView2.setVisibility(8);
                                                                                                                        }
                                                                                                                        qm.c cVarY = qm.c.y();
                                                                                                                        this.f6061y0 = cVarY;
                                                                                                                        Context applicationContext = getApplicationContext();
                                                                                                                        pc.a aVar2 = (pc.a) cVarY.f20919g;
                                                                                                                        ac.a aVar3 = ac.b.f322a;
                                                                                                                        if (aVar2 == null) {
                                                                                                                            int i17 = tc.a.f22695a;
                                                                                                                            cVarY.f20919g = new pc.a(applicationContext, null, pc.a.j, aVar3, ac.e.f324b);
                                                                                                                        }
                                                                                                                        this.f6061y0.u(this);
                                                                                                                        this.f6061y0.Q(getApplicationContext(), (f) this.A0.getValue());
                                                                                                                        int i18 = tc.a.f22695a;
                                                                                                                        new pc.a(this, this, pc.a.j, aVar3, ac.e.f324b);
                                                                                                                        this.f6061y0.getClass();
                                                                                                                        LocationRequest locationRequest = new LocationRequest();
                                                                                                                        locationRequest.g(10000L);
                                                                                                                        locationRequest.e(5000L);
                                                                                                                        tc.e.a(100);
                                                                                                                        locationRequest.f5307a = 100;
                                                                                                                        this.f6062z0 = locationRequest;
                                                                                                                        ArrayList arrayList = new ArrayList();
                                                                                                                        LocationRequest locationRequest2 = this.f6062z0;
                                                                                                                        if (locationRequest2 != null) {
                                                                                                                            arrayList.add(locationRequest2);
                                                                                                                        }
                                                                                                                        b bVar3 = this.f6049m0;
                                                                                                                        if (bVar3 == b.CELL) {
                                                                                                                            this.f6059w0 = "towers_cell";
                                                                                                                            M();
                                                                                                                        } else if (bVar3 == bVar2) {
                                                                                                                            this.f6059w0 = "history";
                                                                                                                            ((ProgressBar) this.f6045i0.f816h).setVisibility(4);
                                                                                                                            G(0);
                                                                                                                            this.f6043g0.execute(new l0(i15, this));
                                                                                                                        }
                                                                                                                        SupportMapFragment supportMapFragment = (SupportMapFragment) o().D(h.map);
                                                                                                                        if (supportMapFragment != null) {
                                                                                                                            if (Looper.getMainLooper() != Looper.myLooper()) {
                                                                                                                                throw new IllegalStateException("getMapAsync must be called on the main thread.");
                                                                                                                            }
                                                                                                                            uc.k kVar = supportMapFragment.f5337w0;
                                                                                                                            jc.c cVar = kVar.f13586a;
                                                                                                                            if (cVar != null) {
                                                                                                                                ((uc.j) cVar).k(this);
                                                                                                                            } else {
                                                                                                                                kVar.f23538h.add(this);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        com.staircase3.opensignal.utils.k kVar2 = (com.staircase3.opensignal.utils.k) this.C0.getValue();
                                                                                                                        r rVar = (r) this.B0.getValue();
                                                                                                                        kVar2.getClass();
                                                                                                                        this.L0 = com.staircase3.opensignal.utils.k.a(this, rVar);
                                                                                                                        try {
                                                                                                                            this.M0 = Integer.parseInt(q.c(this.U).getString("network_opensignal_id", "-1"));
                                                                                                                        } catch (NumberFormatException unused2) {
                                                                                                                        }
                                                                                                                        PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
                                                                                                                        if (packageInfo.firstInstallTime != packageInfo.lastUpdateTime || this.f6049m0 == b.SPEEDTEST) {
                                                                                                                            ((ImageView) this.f6045i0.f815g).setVisibility(4);
                                                                                                                            return;
                                                                                                                        } else {
                                                                                                                            ((ImageView) this.f6045i0.f815g).setVisibility(0);
                                                                                                                            return;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i14)));
                                                                                                            }
                                                                                                        }
                                                                                                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i13)));
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        throw new NullPointerException("Missing required view with ID: ".concat(viewA4.getResources().getResourceName(i12)));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewA2.getResources().getResourceName(i11)));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(qk.j.menu_towers, menu);
        return true;
    }

    @Override // i.j, android.app.Activity
    public final void onDestroy() throws SQLException {
        long jSimpleQueryForLong;
        super.onDestroy();
        sm.m.t();
        try {
            jSimpleQueryForLong = sm.m.f22145g.compileStatement("select count(*) from tower_cache").simpleQueryForLong();
        } catch (Exception unused) {
            jSimpleQueryForLong = 0;
        }
        if (jSimpleQueryForLong >= 1500) {
            sm.m.f22145g.execSQL("delete from tower_cache where rowid < (select rowid from tower_cache order by rowid asc limit " + (jSimpleQueryForLong - 1000) + ", 1)");
        }
        this.P0 = null;
        this.N0 = null;
        this.O0 = null;
        this.Q0 = null;
        this.R0 = null;
        this.S0 = null;
        this.T0 = null;
        this.U0 = null;
        this.V0 = null;
        HashMap map = this.W0;
        if (map != null) {
            map.clear();
        }
        HashMap map2 = this.X0;
        if (map2 != null) {
            map2.clear();
        }
    }

    @Override // qm.b
    public final void onLocationChanged(Location location) {
        if (location != null) {
            LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
            this.W = latLng;
            vc.e.f23907a = latLng;
            if (!this.f6048l0) {
                z(14);
                this.f6048l0 = true;
            }
            I();
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, lq.h] */
    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == h.itemList && !this.H0.isShowing()) {
            b bVar = this.f6049m0;
            if (bVar == b.CELL) {
                ((Toolbar) this.f6045i0.f817i).setTitle("");
                ((Toolbar) this.f6045i0.f817i).setSubtitle("");
                ((TextView) this.I0.findViewById(h.toolbarTitle)).setText(l.cell_towers_list);
                if (this.f6037a0.isEmpty()) {
                    TowersActivity towersActivity = this.U;
                    se.b.a0(towersActivity, towersActivity.getResources().getString(l.still_looking_for_towers));
                    return true;
                }
                List list = this.f6037a0;
                String str = this.f6041e0;
                am.k kVar = new am.k();
                ArrayList arrayList = new ArrayList();
                kVar.f879f = arrayList;
                if (list != null) {
                    arrayList.clear();
                    arrayList.addAll(list);
                    arrayList.add(0, new k());
                    arrayList.add(2, new k());
                    kVar.f878e = str;
                }
                this.G0.setAdapter(kVar);
                se.b.X(this.H0, qk.d.status_bar_background);
                this.H0.show();
            } else if (bVar == b.SPEEDTEST) {
                ((Toolbar) this.f6045i0.f817i).setTitle("");
                ((Toolbar) this.f6045i0.f817i).setSubtitle("");
                ((TextView) this.I0.findViewById(h.toolbarTitle)).setText(l.speedtest_history);
            }
            ((com.staircase3.opensignal.utils.a) this.D0.getValue()).c(this.f6059w0, "click_icon", "icon_list");
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // i.j, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.f6049m0 == b.CELL) {
            ArrayList arrayList = this.Z;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((uk.e) it.next()).cancel(true);
                }
            }
            arrayList.clear();
        }
        qm.c cVar = this.f6061y0;
        ((pc.a) cVar.f20919g).d((ji.a) cVar.f20920r);
        ((CopyOnWriteArrayList) this.f6061y0.f20918d).remove(this);
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem visible;
        if (this.f6049m0 == b.SPEEDTEST && menu != null && (visible = menu.findItem(h.itemList).setVisible(true)) != null) {
            visible.setVisible(false);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, lq.h] */
    @Override // i.j, c.l, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == 11) {
            ((f) this.A0.getValue()).getClass();
            if (f.a(this)) {
                return;
            }
            int i11 = l.please_grant_location_permission;
            int i12 = l.settings;
            rk.n nVar = new rk.n(this, 4);
            ge.j jVarF = ge.j.f(findViewById(R.id.content), getString(i11));
            jVarF.g(getString(i12), nVar);
            jVarF.h();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, lq.h] */
    @Override // i.j, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.V != null) {
            ((f) this.A0.getValue()).getClass();
            if (f.a(this)) {
                this.V.O0();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    @Override // i.j, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        super.onStart();
        ?? r02 = this.A0;
        ((f) r02.getValue()).getClass();
        if (f.a(this)) {
            return;
        }
        ((f) r02.getValue()).getClass();
        if (!shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
            ((f) r02.getValue()).getClass();
            f.d(this, 11);
            return;
        }
        int i10 = l.location_permission_needed;
        rk.n nVar = new rk.n(this, 3);
        ge.j jVarF = ge.j.f(findViewById(R.id.content), getString(i10));
        jVarF.g(getString(R.string.ok), nVar);
        jVarF.h();
    }

    public final void z(int i10) {
        LatLng latLng = vc.e.f23907a;
        this.W = latLng;
        q3.a aVar = this.V;
        if (aVar == null || latLng == null) {
            return;
        }
        l2 l2VarV = xu.d.V(latLng, i10);
        aVar.getClass();
        try {
            vc.g gVar = (vc.g) aVar.f20679d;
            jc.b bVar = (jc.b) l2VarV.f20100d;
            Parcel parcelR = gVar.R();
            qc.l.d(parcelR, bVar);
            gVar.S(parcelR, 4);
        } catch (RemoteException e4) {
            throw new n(e4);
        }
    }
}
