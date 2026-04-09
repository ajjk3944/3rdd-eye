package F4;

import A2.C0117e;
import A3.v;
import B4.s;
import N4.f;
import N4.k;
import N4.m;
import N4.q;
import Q4.t;
import Q4.u;
import Q4.x;
import R.C0177d;
import R.InterfaceC0176c;
import R.InterfaceC0188o;
import R.O;
import R.r0;
import T.g;
import U0.j;
import V4.l;
import V4.n;
import V4.o;
import a2.AbstractC0271g;
import android.bluetooth.BluetoothDevice;
import android.content.ClipData;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.internal.ads.W9;
import com.lefan.base.view.AdFreeCountDownTextClock;
import com.lefan.signal.MainActivity;
import com.lefan.signal.MyApplication;
import com.lefan.signal.activity.SplashActivity;
import com.lefan.signal.ad.FreeAdActivity;
import com.lefan.signal.ui.other.DewPointActivity;
import com.lefan.signal.ui.sensor.SensorActivity;
import com.lefan.signal.ui.sensor.SensorDetailActivity;
import com.lefan.signal.ui.speed.SpeedActivity;
import d5.AbstractC2282j;
import e.InterfaceC2285b;
import e2.InterfaceC2302a;
import e4.InterfaceC2304a;
import i4.p;
import j2.InterfaceC2559o;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import k0.U;
import l4.AbstractC2649c;
import o.C2738t;
import p4.C2778e;
import q2.C2834o;
import t4.C2931b;
import w.h;
import w.i;
import x3.w;
import z5.C3049z;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC0188o, w, InterfaceC2302a, InterfaceC2285b, p, N.c, c3.d, InterfaceC2304a, z2.b, v, InterfaceC2559o, i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1455b;

    public /* synthetic */ c(int i, Object obj) {
        this.f1454a = i;
        this.f1455b = obj;
    }

    @Override // e2.InterfaceC2302a
    public void a(AbstractC0271g abstractC0271g, View view, int i) {
        int i3 = this.f1454a;
        Object obj = this.f1455b;
        switch (i3) {
            case 2:
                f fVar = (f) obj;
                ArrayList arrayList = fVar.f3000D0;
                N4.e eVar = (N4.e) AbstractC2282j.V(i, arrayList);
                if (eVar != null && !eVar.f2996c) {
                    int size = arrayList.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj2 = arrayList.get(i6);
                        i6++;
                        ((N4.e) obj2).f2996c = false;
                    }
                    eVar.f2996c = true;
                    fVar.f2998B0 = i;
                    fVar.f2997A0.notifyDataSetChanged();
                    break;
                }
                break;
            case 3:
                m mVar = (m) obj;
                k kVar = (k) AbstractC2282j.V(i, mVar.f3015C0);
                if (kVar != null) {
                    String str = kVar.f3008b;
                    String str2 = kVar.f3007a;
                    if (kVar.f3011e != 1) {
                        Integer num = kVar.f3010d;
                        if (num == null) {
                            s.a(mVar.m(), view, str2 + ":" + str);
                            break;
                        } else {
                            s.a(mVar.m(), view, str2 + ":" + str + "\n\n" + mVar.r(num.intValue()));
                            break;
                        }
                    }
                }
                break;
            case 4:
                q qVar = (q) obj;
                N4.p pVar = (N4.p) AbstractC2282j.V(i, qVar.f3033C0);
                if (pVar != null) {
                    String str3 = pVar.f3029b;
                    String str4 = pVar.f3028a;
                    Integer num2 = pVar.f3030c;
                    if (num2 == null) {
                        s.a(qVar.m(), view, str4 + ":" + str3);
                        break;
                    } else {
                        s.a(qVar.m(), view, str4 + ":" + str3 + "\n\n" + qVar.r(num2.intValue()));
                        break;
                    }
                }
                break;
            case 5:
                Q4.c cVar = (Q4.c) obj;
                Q4.m mVar2 = (Q4.m) AbstractC2282j.V(i, cVar.f3196D0.f4668b);
                if (mVar2 != null) {
                    t tVar = new t();
                    tVar.f3238H0 = mVar2;
                    tVar.f3236F0 = mVar2.f3214a;
                    tVar.f3237G0 = q5.i.a(mVar2.f3217d, cVar.f3197E0);
                    tVar.f0(cVar.p(), "bluetooth_device");
                    break;
                }
                break;
            case 6:
                t tVar2 = (t) obj;
                J4.b bVar = (J4.b) AbstractC2282j.V(i, tVar2.f3233C0);
                if (bVar != null) {
                    String str5 = bVar.f2141b;
                    String str6 = bVar.f2140a;
                    s.a(tVar2.m(), view, str6 + ":" + str5);
                    break;
                }
                break;
            case 7:
                u uVar = (u) obj;
                J4.b bVar2 = (J4.b) AbstractC2282j.V(i, uVar.f3241C0);
                if (bVar2 != null) {
                    s.a(uVar.m(), view, bVar2.f2140a + ":" + bVar2.f2141b + "");
                    break;
                }
                break;
            case 8:
                x xVar = (x) obj;
                BluetoothDevice bluetoothDevice = (BluetoothDevice) AbstractC2282j.V(i, xVar.f3255C0.f4668b);
                if (bluetoothDevice != null) {
                    t tVar3 = new t();
                    tVar3.f3236F0 = bluetoothDevice;
                    tVar3.f3237G0 = q5.i.a(bluetoothDevice.getAddress(), xVar.f3256D0);
                    tVar3.f0(xVar.p(), "bluetooth_device");
                    break;
                }
                break;
            case 9:
            case 11:
            default:
                SensorActivity sensorActivity = (SensorActivity) obj;
                int i7 = SensorActivity.f19247R;
                W4.e eVar2 = (W4.e) AbstractC2282j.V(i, sensorActivity.f19249P.f4668b);
                if (eVar2 != null && !eVar2.f4100a) {
                    Intent intent = new Intent(sensorActivity, (Class<?>) SensorDetailActivity.class);
                    intent.putExtra("sensor_type", eVar2.f4104e);
                    intent.putExtra("sensor_name", eVar2.f4101b);
                    sensorActivity.startActivity(intent);
                    break;
                }
                break;
            case 10:
                DewPointActivity dewPointActivity = (DewPointActivity) obj;
                int i8 = DewPointActivity.f19048u0;
                J4.d dVar = (J4.d) AbstractC2282j.V(i, dewPointActivity.f19074o0);
                if (dVar != null) {
                    s.a(dewPointActivity, view, String.format("%s:%s", Arrays.copyOf(new Object[]{dVar.f2144b, dVar.f2145c}, 2)));
                    break;
                }
                break;
            case 12:
                U4.u uVar2 = (U4.u) obj;
                U4.t tVar4 = (U4.t) AbstractC2282j.V(i, uVar2.f3771D0);
                if (tVar4 != null) {
                    String str7 = tVar4.f3766b;
                    String str8 = tVar4.f3765a;
                    Integer num3 = tVar4.f3767c;
                    if (num3 != null) {
                        s.a(uVar2.m(), view, str8 + ":" + str7 + "\n\n" + uVar2.r(num3.intValue()));
                        break;
                    } else {
                        s.a(uVar2.m(), view, str8 + ":" + str7);
                        break;
                    }
                }
                break;
            case 13:
                o oVar = (o) obj;
                n nVar = (n) AbstractC2282j.V(i, oVar.f3922D0);
                if (nVar != null) {
                    String str9 = nVar.f3917b;
                    String str10 = nVar.f3916a;
                    Integer num4 = nVar.f3918c;
                    s.a(oVar.m(), view, str10 + ":" + str9 + "\n\n" + oVar.r(num4.intValue()));
                    break;
                }
                break;
            case 14:
                V4.q qVar2 = (V4.q) obj;
                l lVar = (l) AbstractC2282j.V(i, qVar2.f3926B0.f4668b);
                if (lVar != null) {
                    o oVar2 = new o();
                    oVar2.f3920B0 = lVar;
                    oVar2.f0(qVar2.p(), "satellite_info");
                    break;
                }
                break;
        }
    }

    @Override // e.InterfaceC2285b
    public void b(Object obj) {
        int i = this.f1454a;
        Object obj2 = this.f1455b;
        switch (i) {
            case 11:
                U4.l lVar = (U4.l) obj2;
                Boolean bool = (Boolean) obj;
                q5.i.e(bool, "it");
                if (!bool.booleanValue() && !lVar.V(lVar.f3735l0) && System.currentTimeMillis() - lVar.f3731L0 < 500) {
                    MyApplication.f18812d = true;
                    lVar.f3733N0.a(com.bumptech.glide.d.x(lVar.m(), "android.settings.APPLICATION_DETAILS_SETTINGS"));
                    break;
                }
                break;
            default:
                SpeedActivity speedActivity = (SpeedActivity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    if (!speedActivity.shouldShowRequestPermissionRationale(speedActivity.f19297P) && System.currentTimeMillis() - speedActivity.f19309c0 < 500) {
                        boolean z6 = MyApplication.f18812d;
                        MyApplication.f18812d = com.bumptech.glide.d.F(speedActivity, speedActivity.f19311e0);
                        break;
                    }
                } else {
                    speedActivity.f19298Q.b(speedActivity);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    @Override // z2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(com.google.android.gms.internal.ads.C0536Hd r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f1455b
            s4.a r0 = (s4.C2898a) r0
            java.util.ArrayList r1 = r0.f23499a
            r1.add(r4)
            j2.e r4 = r0.f23500b
            r1 = 0
            if (r4 == 0) goto L20
            q2.E r4 = r4.f21336b     // Catch: android.os.RemoteException -> L15
            boolean r4 = r4.e()     // Catch: android.os.RemoteException -> L15
            goto L1c
        L15:
            r4 = move-exception
            java.lang.String r2 = "Failed to check if ad is loading."
            u2.k.i(r2, r4)
            r4 = r1
        L1c:
            if (r4 != 0) goto L20
            r4 = 1
            goto L21
        L20:
            r4 = r1
        L21:
            if (r4 == 0) goto L2b
            r0.f23501c = r1
            long r1 = java.lang.System.currentTimeMillis()
            r0.f23502d = r1
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F4.c.c(com.google.android.gms.internal.ads.Hd):void");
    }

    @Override // i4.p
    public Object d() {
        int i = this.f1454a;
        Object obj = this.f1455b;
        switch (i) {
            case 17:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e6) {
                    R3.b bVar = AbstractC2649c.f21863a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e6);
                } catch (InstantiationException e7) {
                    throw new RuntimeException("Failed to invoke constructor '" + AbstractC2649c.b(constructor) + "' with no args", e7);
                } catch (InvocationTargetException e8) {
                    throw new RuntimeException("Failed to invoke constructor '" + AbstractC2649c.b(constructor) + "' with no args", e8.getCause());
                }
            default:
                Class cls = (Class) obj;
                try {
                    return i4.v.f20634a.a(cls);
                } catch (Exception e9) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e9);
                }
        }
    }

    @Override // j2.InterfaceC2559o
    public void e(W9 w9) {
        C2834o c2834o = ((C2931b) this.f1455b).f23676e;
        if (c2834o != null) {
            FreeAdActivity freeAdActivity = (FreeAdActivity) c2834o.f23253c;
            AppCompatTextView appCompatTextView = (AppCompatTextView) c2834o.f23255e;
            q5.m mVar = (q5.m) c2834o.f23256f;
            int i = mVar.f23297a;
            int i3 = FreeAdActivity.f18830R;
            freeAdActivity.C(appCompatTextView, i, 10);
            int i6 = mVar.f23297a + 10;
            mVar.f23297a = i6;
            SharedPreferences sharedPreferences = freeAdActivity.getSharedPreferences("sp", 0);
            q5.i.b(sharedPreferences);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putInt("my_reword_points", i6);
            editorEdit.apply();
            ((AdFreeCountDownTextClock) c2834o.f23257g).j();
        }
    }

    public void f(String str) {
        SplashActivity splashActivity = (SplashActivity) this.f1455b;
        int i = SplashActivity.f18821W;
        if (str.equals("show")) {
            splashActivity.f18826S = true;
        } else {
            splashActivity.C();
        }
    }

    public boolean g(j jVar, int i, Bundle bundle) {
        InterfaceC0176c c0117e;
        C2738t c2738t = (C2738t) this.f1455b;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 25 && (i & 1) != 0) {
            try {
                ((g) jVar.f3677b).f();
                Parcelable parcelable = (Parcelable) ((g) jVar.f3677b).j();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e6) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e6);
                return false;
            }
        }
        g gVar = (g) jVar.f3677b;
        ClipData clipData = new ClipData(gVar.getDescription(), new ClipData.Item(gVar.e()));
        if (i3 >= 31) {
            c0117e = new C0117e(clipData, 2);
        } else {
            C0177d c0177d = new C0177d();
            c0177d.f3312b = clipData;
            c0177d.f3313c = 2;
            c0117e = c0177d;
        }
        c0117e.c(gVar.g());
        c0117e.setExtras(bundle);
        return O.i(c2738t, c0117e.build()) == null;
    }

    @Override // e4.InterfaceC2304a
    public void i() {
        ((c) this.f1455b).f("error");
    }

    @Override // w.i
    public Object o(h hVar) {
        C3049z c3049z = (C3049z) this.f1455b;
        c3049z.C(false, true, new A5.c(hVar, 4, c3049z));
        return "Deferred.asListenableFuture";
    }

    @Override // N.c
    public void onCancel() {
        ((U) this.f1455b).a();
    }

    @Override // c3.d
    public void onSuccess(Object obj) {
        int i = this.f1454a;
        C2778e c2778e = (C2778e) this.f1455b;
        switch (i) {
            case 21:
                int i3 = MainActivity.f18804V;
                c2778e.f(obj);
                break;
            default:
                int i6 = MainActivity.f18804V;
                c2778e.f(obj);
                break;
        }
    }

    @Override // R.InterfaceC0188o
    public r0 p(View view, r0 r0Var) {
        View view2 = (View) this.f1455b;
        q5.i.e(view, "v");
        J.c cVarF = r0Var.f3359a.f(647);
        q5.i.d(cVarF, "getInsets(...)");
        int i = cVarF.f2007a;
        int i3 = cVarF.f2008b;
        int i6 = cVarF.f2009c;
        view.setPadding(i, i3, i6, view.getPaddingBottom());
        view2.setPadding(i, view2.getPaddingTop(), i6, cVarF.f2010d);
        return r0Var;
    }
}
