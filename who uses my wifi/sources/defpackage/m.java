package defpackage;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.phuongpn.whousemywifi.networkscanner.MainActivity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements dy {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ m(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.dy
    public final Object g(Object obj) {
        yn ynVar;
        int i = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                return obj == ((c0) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                MainActivity mainActivity = (MainActivity) obj2;
                int[] iArr = MainActivity.d0;
                i30.m((z31) obj, "it");
                int i2 = 0;
                mainActivity.a0 = false;
                mainActivity.runOnUiThread(new na0(0 == true ? 1 : 0, mainActivity, 0 == true ? 1 : 0));
                try {
                    ynVar = mainActivity.Z;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (ynVar == null) {
                    i30.S("job");
                    throw null;
                }
                ynVar.o(new x30(ynVar.q(), null, ynVar));
                if (!mainActivity.isFinishing()) {
                    ArrayList arrayList = mainActivity.N;
                    if (arrayList == null) {
                        i30.S("hosts");
                        throw null;
                    }
                    if (!arrayList.isEmpty()) {
                        zs zsVar = ro.s;
                        int iI0 = gb0.i0(ag.k0(zsVar));
                        if (iI0 < 16) {
                            iI0 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iI0);
                        z zVar = new z(zsVar);
                        while (zVar.hasNext()) {
                            linkedHashMap.put((ro) zVar.next(), new AtomicInteger(0));
                        }
                        mainActivity.S = new LinkedHashMap(linkedHashMap);
                        ArrayList arrayList2 = mainActivity.N;
                        if (arrayList2 == null) {
                            i30.S("hosts");
                            throw null;
                        }
                        int size = arrayList2.size();
                        while (i2 < size) {
                            Object obj3 = arrayList2.get(i2);
                            i2++;
                            d10 d10Var = (d10) obj3;
                            LinkedHashMap linkedHashMap2 = mainActivity.S;
                            if (linkedHashMap2 == null) {
                                i30.S("hashHostType");
                                throw null;
                            }
                            AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap2.get(d10Var.a);
                            if (atomicInteger != null) {
                                atomicInteger.incrementAndGet();
                            }
                        }
                        LinkedHashMap linkedHashMap3 = mainActivity.S;
                        if (linkedHashMap3 == null) {
                            i30.S("hashHostType");
                            throw null;
                        }
                        for (Map.Entry entry : linkedHashMap3.entrySet()) {
                            if (((AtomicInteger) entry.getValue()).get() != 0) {
                                g10 g10Var = new g10();
                                g10Var.a = ro.j;
                                ro roVar = (ro) entry.getKey();
                                i30.m(roVar, "<set-?>");
                                g10Var.a = roVar;
                                g10Var.b = ((AtomicInteger) entry.getValue()).get();
                                ArrayList arrayList3 = mainActivity.T;
                                if (arrayList3 == null) {
                                    i30.S("hostTypes");
                                    throw null;
                                }
                                arrayList3.add(g10Var);
                            }
                        }
                        ArrayList arrayList4 = mainActivity.T;
                        if (arrayList4 == null) {
                            i30.S("hostTypes");
                            throw null;
                        }
                        if (arrayList4.size() > 1) {
                            dg.l0(arrayList4, new bk(5));
                        }
                        mainActivity.runOnUiThread(new la0(mainActivity, 2));
                    }
                }
                if (mainActivity.C().getBoolean("key_vibrate_finish", true)) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        Object systemService = mainActivity.getSystemService("vibrator_manager");
                        i30.k(systemService, "null cannot be cast to non-null type android.os.VibratorManager");
                        Vibrator defaultVibrator = lb.l(systemService).getDefaultVibrator();
                        i30.l(defaultVibrator, "getDefaultVibrator(...)");
                        defaultVibrator.vibrate(VibrationEffect.createOneShot(50L, -1));
                    } else {
                        Object systemService2 = mainActivity.getSystemService("vibrator");
                        i30.k(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
                        ((Vibrator) systemService2).vibrate(50L);
                    }
                }
                return z31.a;
            case 2:
                i30.m(obj, "it");
                return ((o2) obj2).a();
            default:
                d30 d30Var = (d30) obj;
                i30.m(d30Var, "it");
                return ((String) obj2).subSequence(d30Var.f, d30Var.g + 1).toString();
        }
    }
}
