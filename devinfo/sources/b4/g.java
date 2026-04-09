package b4;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.rw;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1681a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1682b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1683c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1685e;

    public /* synthetic */ g(fb.h hVar, rw rwVar, int i4, Bundle bundle) {
        this.f1681a = 2;
        this.f1682b = hVar;
        this.f1683c = rwVar;
        this.f1684d = i4;
        this.f1685e = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i4 = this.f1681a;
        int i10 = this.f1684d;
        Object obj = this.f1685e;
        Object obj2 = this.f1683c;
        Object obj3 = this.f1682b;
        switch (i4) {
            case 0:
                Object[] objArr = {(f) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj4 = objArr[0];
                Objects.requireNonNull(obj4);
                arrayList.add(obj4);
                return j.b((String) obj3, (Context) obj2, DesugarCollections.unmodifiableList(arrayList), i10);
            case 1:
                try {
                    return j.b((String) obj3, (Context) obj2, (ArrayList) obj, i10);
                } catch (Throwable unused) {
                    return new i(-3);
                }
            default:
                fb.h hVar = (fb.h) obj3;
                rw rwVar = (rw) obj2;
                return hVar.m4(hVar.f23913c, rwVar.f15772a, rwVar.f15773b, rwVar.f15774c, rwVar.f15775d, this.f1684d, rwVar.f15777f, (Bundle) obj, rwVar);
        }
    }

    public /* synthetic */ g(String str, Context context, Object obj, int i4, int i10) {
        this.f1681a = i10;
        this.f1682b = str;
        this.f1683c = context;
        this.f1685e = obj;
        this.f1684d = i4;
    }
}
