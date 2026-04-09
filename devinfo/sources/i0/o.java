package i0;

import android.os.Build;
import android.os.Trace;
import com.google.android.gms.internal.measurement.z3;
import g2.r0;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import t6.x;
import u0.u0;
import u6.c0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements mk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25459a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f25460b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25461c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f25462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f25463e;

    public /* synthetic */ o(t6.u uVar, boolean z3, String str, c0 c0Var) {
        this.f25461c = uVar;
        this.f25460b = z3;
        this.f25462d = str;
        this.f25463e = c0Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // mk.c
    public final Object invoke(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i4 = this.f25459a;
        yj.u uVar = yj.u.f37649a;
        ?? r22 = this.f25463e;
        Serializable serializable = this.f25462d;
        boolean z3 = this.f25460b;
        Object obj2 = this.f25461c;
        switch (i4) {
            case 0:
                u0 u0Var = (u0) obj2;
                ArrayList arrayList = (ArrayList) serializable;
                r0 r0Var = (r0) obj;
                r0Var.f24404a = true;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((q) arrayList.get(i10)).b(r0Var, z3);
                }
                int size2 = r22.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((q) r22.get(i11)).b(r0Var, z3);
                }
                r0Var.f24404a = false;
                u0Var.getValue();
                break;
            default:
                t6.u uVar2 = (t6.u) obj2;
                String str = (String) serializable;
                c0 c0Var = (c0) r22;
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof u6.u) {
                    uVar2.stop(((u6.u) th2).f35192a);
                }
                if (z3 && str != null) {
                    x xVar = c0Var.f35137f.f34322m;
                    int iHashCode = c0Var.f35132a.hashCode();
                    xVar.getClass();
                    if (Build.VERSION.SDK_INT >= 29) {
                        i6.a.b(iHashCode, z3.w(str));
                        break;
                    } else {
                        String strW = z3.w(str);
                        try {
                            if (z3.f20063e == null) {
                                z3.f20063e = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                            }
                            z3.f20063e.invoke(null, Long.valueOf(z3.f20060b), strW, Integer.valueOf(iHashCode));
                            break;
                        } catch (Exception e2) {
                            z3.m("asyncTraceEnd", e2);
                            break;
                        }
                    }
                }
                break;
        }
        return uVar;
    }

    public /* synthetic */ o(u0 u0Var, ArrayList arrayList, List list, boolean z3) {
        this.f25461c = u0Var;
        this.f25462d = arrayList;
        this.f25463e = list;
        this.f25460b = z3;
    }
}
