package Q9;

import android.content.Context;
import android.view.View;
import c9.C2092m;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzga;
import com.google.android.gms.internal.play_billing.zzge;
import com.google.android.gms.internal.play_billing.zzgt;
import com.google.android.gms.internal.play_billing.zzgu;
import com.google.android.gms.internal.play_billing.zzhd;
import com.google.android.gms.internal.play_billing.zzhe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p9.InterfaceC5480a;
import v3.C5677c;
import w3.C5719a;
import w9.InterfaceC5748c;

/* compiled from: Caching.kt */
/* renamed from: Q9.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1553s implements y0, InterfaceC1543m0, W4.a, com.android.billingclient.api.q {

    /* renamed from: b, reason: collision with root package name */
    public Object f11527b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11528c;

    /* compiled from: Caching.kt */
    /* renamed from: Q9.s$a */
    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<Object> {

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ InterfaceC5748c f11530h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC5748c interfaceC5748c) {
            super(0);
            this.f11530h = interfaceC5748c;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.internal.m, p9.l] */
        @Override // p9.InterfaceC5480a
        public final Object invoke() {
            return new C1540l((M9.b) ((kotlin.jvm.internal.m) C1553s.this.f11527b).invoke(this.f11530h));
        }
    }

    public C1553s(Context context, zzgu zzguVar) {
        com.android.billingclient.api.s sVar = new com.android.billingclient.api.s();
        try {
            y3.u.b(context);
            sVar.f18709b = y3.u.a().c(C5719a.f47325e).a("PLAY_BILLING_LIBRARY", new C5677c("proto"), new v3.g() { // from class: com.android.billingclient.api.zzci
                @Override // v3.g
                public final Object apply(Object obj) {
                    return ((zzhe) obj).zzc();
                }
            });
        } catch (Throwable unused) {
            sVar.f18708a = true;
        }
        this.f11528c = sVar;
        this.f11527b = zzguVar;
    }

    public Object a(Object obj, w9.i property) {
        View thisRef = (View) obj;
        kotlin.jvm.internal.l.f(thisRef, "thisRef");
        kotlin.jvm.internal.l.f(property, "property");
        return this.f11527b;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [kotlin.jvm.internal.m, p9.p] */
    @Override // Q9.InterfaceC1543m0
    public Object b(InterfaceC5748c interfaceC5748c, ArrayList arrayList) {
        Object objA;
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f11528c;
        Class clsC = E.u.C(interfaceC5748c);
        Object c1541l0 = concurrentHashMap.get(clsC);
        if (c1541l0 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsC, (c1541l0 = new C1541l0()))) != null) {
            c1541l0 = objPutIfAbsent;
        }
        C1541l0 c1541l02 = (C1541l0) c1541l0;
        ArrayList arrayList2 = new ArrayList(C2092m.T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new S((w9.j) it.next()));
        }
        ConcurrentHashMap<List<S>, b9.m<M9.b<T>>> concurrentHashMap2 = c1541l02.f11503a;
        Object obj = concurrentHashMap2.get(arrayList2);
        if (obj == null) {
            try {
                objA = (M9.b) ((kotlin.jvm.internal.m) this.f11527b).invoke(interfaceC5748c, arrayList);
            } catch (Throwable th) {
                objA = b9.n.a(th);
            }
            b9.m mVar = new b9.m(objA);
            Object objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList2, mVar);
            obj = objPutIfAbsent2 == null ? mVar : objPutIfAbsent2;
        }
        return ((b9.m) obj).f18085b;
    }

    @Override // W4.a
    public StackTraceElement[] c(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        W4.a[] aVarArr = (W4.a[]) this.f11527b;
        StackTraceElement[] stackTraceElementArrC = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            W4.a aVar = aVarArr[i];
            if (stackTraceElementArrC.length <= 1024) {
                break;
            }
            stackTraceElementArrC = aVar.c(stackTraceElementArr);
        }
        return stackTraceElementArrC.length > 1024 ? ((A2.l) this.f11528c).c(stackTraceElementArrC) : stackTraceElementArrC;
    }

    @Override // Q9.y0
    public M9.b d(InterfaceC5748c interfaceC5748c) {
        Object obj = ((C1557u) this.f11528c).get(E.u.C(interfaceC5748c));
        kotlin.jvm.internal.l.e(obj, "get(key)");
        C1523c0 c1523c0 = (C1523c0) obj;
        Object objA = c1523c0.f11477a.get();
        if (objA == null) {
            objA = c1523c0.a(new a(interfaceC5748c));
        }
        return ((C1540l) objA).f11502a;
    }

    public void e(Object obj, w9.i property, Object obj2) {
        View thisRef = (View) obj;
        kotlin.jvm.internal.l.f(thisRef, "thisRef");
        kotlin.jvm.internal.l.f(property, "property");
        X6.d dVar = (X6.d) this.f11528c;
        if (dVar != null) {
            obj2 = dVar.invoke(obj2);
        }
        if (kotlin.jvm.internal.l.b(this.f11527b, obj2)) {
            return;
        }
        this.f11527b = obj2;
        thisRef.requestLayout();
    }

    public void f(zzga zzgaVar) {
        if (zzgaVar == null) {
            return;
        }
        try {
            zzhd zzhdVarZzy = zzhe.zzy();
            zzhdVarZzy.zzn((zzgu) this.f11527b);
            zzhdVarZzy.zzl(zzgaVar);
            ((com.android.billingclient.api.s) this.f11528c).a((zzhe) zzhdVarZzy.zzf());
        } catch (Throwable th) {
            zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    public void g(zzga zzgaVar, int i) {
        try {
            zzgt zzgtVar = (zzgt) ((zzgu) this.f11527b).zzi();
            zzgtVar.zzl(i);
            this.f11527b = (zzgu) zzgtVar.zzf();
            f(zzgaVar);
        } catch (Throwable th) {
            zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    public void h(zzge zzgeVar) {
        if (zzgeVar == null) {
            return;
        }
        try {
            zzhd zzhdVarZzy = zzhe.zzy();
            zzhdVarZzy.zzn((zzgu) this.f11527b);
            zzhdVarZzy.zzm(zzgeVar);
            ((com.android.billingclient.api.s) this.f11528c).a((zzhe) zzhdVarZzy.zzf());
        } catch (Throwable th) {
            zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    public C1553s(Object obj, X6.d dVar) {
        this.f11527b = obj;
        this.f11528c = dVar;
    }

    public C1553s(W4.a... aVarArr) {
        this.f11527b = aVarArr;
        this.f11528c = new A2.l(23);
    }

    public C1553s(H.g gVar) {
        this.f11527b = gVar;
        this.f11528c = new AtomicInteger(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1553s(p9.l compute) {
        kotlin.jvm.internal.l.f(compute, "compute");
        this.f11527b = (kotlin.jvm.internal.m) compute;
        this.f11528c = new C1557u();
    }

    public C1553s(int i) {
        this.f11527b = 1;
        this.f11528c = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1553s(p9.p compute) {
        kotlin.jvm.internal.l.f(compute, "compute");
        this.f11527b = (kotlin.jvm.internal.m) compute;
        this.f11528c = new ConcurrentHashMap();
    }
}
