package com.staircase3.opensignal.library.cells;

import android.content.Context;
import android.location.Location;
import bc.e0;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.maps.model.LatLng;
import com.staircase3.opensignal.models.NetworkUiState;
import com.staircase3.opensignal.utils.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import rm.a;
import rm.b;
import vc.e;

/* loaded from: classes.dex */
public class NewCell extends CellObject {
    public NetworkUiState D;
    public final a E;
    public j F;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v16, types: [com.staircase3.opensignal.utils.j] */
    /* JADX WARN: Type inference failed for: r10v5, types: [int] */
    public NewCell(NetworkUiState networkUiState) throws Throwable {
        j jVar;
        Context context;
        this.D = networkUiState;
        a aVar = new a(networkUiState);
        this.E = aVar;
        NetworkUiState networkUiState2 = this.D;
        String str = networkUiState2.f6131x;
        String str2 = networkUiState2.f6130r;
        Iterator it = b.f21661a.iterator();
        while (true) {
            if (it.hasNext()) {
                CellObject cellObject = (CellObject) it.next();
                if (cellObject.d() == aVar.f21658a && cellObject.e() == aVar.f21659b && cellObject.h() == aVar.f21660c) {
                    j jVar2 = new j((float) cellObject.f(), (float) cellObject.g());
                    b.f21662b.put(aVar, jVar2);
                    jVar = jVar2;
                    break;
                }
            } else {
                HashMap map = b.f21662b;
                if (map.containsKey(aVar)) {
                    jVar = (j) map.get(aVar);
                } else {
                    j jVarB = aVar.f21658a;
                    int i10 = aVar.f21659b;
                    int i11 = aVar.f21660c;
                    try {
                        context = (Context) y3.s(Context.class);
                        try {
                        } catch (Throwable th2) {
                            th = th2;
                            jVarB = jVarB;
                        }
                    } catch (Exception unused) {
                        jVarB = 0;
                    }
                    synchronized (qm.a.c(context)) {
                        try {
                            qm.a.c(context).e();
                            jVarB = qm.a.c(context).b(jVarB, i10, i11);
                            qm.a.c(context).a();
                            if (jVarB == 0 || jVarB.f6185a / 1000000.0f == 0.0d) {
                                ArrayList arrayList = b.f21663c;
                                if (!arrayList.contains(aVar)) {
                                    arrayList.add(aVar);
                                    if (aVar.f21658a != -1 && aVar.f21659b != -1) {
                                        new Thread(new e0(aVar, str, str2, 6, false)).start();
                                    }
                                }
                                jVar = null;
                            } else {
                                b.f21662b.put(aVar, jVarB);
                                jVar = jVarB;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            jVarB = 0;
                            try {
                                throw th;
                            } catch (Exception unused2) {
                            }
                        }
                    }
                }
            }
        }
        this.F = jVar;
    }

    @Override // com.staircase3.opensignal.library.cells.CellObject
    public final int d() {
        a aVar = this.E;
        return aVar == null ? this.f6121a : aVar.f21658a;
    }

    @Override // com.staircase3.opensignal.library.cells.CellObject
    public final int e() {
        a aVar = this.E;
        return aVar == null ? this.f6122d : aVar.f21659b;
    }

    @Override // com.staircase3.opensignal.library.cells.CellObject
    public final double f() {
        if (this.F == null || r0.f6185a / 1000000.0f == 0.0d) {
            i();
        }
        if (this.F == null) {
            return 0.0d;
        }
        return r0.f6185a / 1000000.0f;
    }

    @Override // com.staircase3.opensignal.library.cells.CellObject
    public final double g() {
        if (this.F == null || r0.f6186b / 1000000.0f == 0.0d) {
            i();
        }
        if (this.F == null) {
            return 0.0d;
        }
        return r0.f6186b / 1000000.0f;
    }

    @Override // com.staircase3.opensignal.library.cells.CellObject
    public final int h() {
        a aVar = this.E;
        return aVar == null ? this.f6123g : aVar.f21660c;
    }

    public final void i() {
        j jVar;
        CopyOnWriteArrayList copyOnWriteArrayList = b.f21661a;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty() || e.f23907a == null) {
            jVar = new j();
        } else {
            CellObject cellObject = (CellObject) copyOnWriteArrayList.get(0);
            float[] fArr = new float[1];
            Iterator it = copyOnWriteArrayList.iterator();
            float f10 = Float.MAX_VALUE;
            while (it.hasNext()) {
                CellObject cellObject2 = (CellObject) it.next();
                LatLng latLng = e.f23907a;
                Location.distanceBetween(latLng.f5347a, latLng.f5348d, cellObject2.f(), cellObject2.g(), fArr);
                float f11 = fArr[0];
                if (f11 < f10) {
                    f10 = f11;
                    cellObject = cellObject2;
                }
            }
            jVar = new j((float) cellObject.f(), (float) cellObject.g());
        }
        this.F = jVar;
    }
}
