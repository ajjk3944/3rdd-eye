package zc;

import android.app.Service;
import android.content.Intent;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class g2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26940a = 1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26941d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f26942g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f26943r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Cloneable f26944x;

    public /* synthetic */ g2(z7.b bVar, int i10, j0 j0Var, Intent intent) {
        this.f26942g = bVar;
        this.f26941d = i10;
        this.f26943r = j0Var;
        this.f26944x = intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f26940a) {
            case 0:
                l0 l0Var = (l0) this.f26942g;
                ((f2) l0Var.f26992y).l(this.f26941d, (Exception) this.f26943r, (byte[]) this.f26944x);
                break;
            default:
                z7.b bVar = (z7.b) this.f26942g;
                j0 j0Var = (j0) this.f26943r;
                Intent intent = (Intent) this.f26944x;
                Service service = (Service) bVar.f26690a;
                a3 a3Var = (a3) service;
                int i10 = this.f26941d;
                if (a3Var.a(i10)) {
                    j0Var.K.c(Integer.valueOf(i10), "Local AppMeasurementService processed last upload request. StartId");
                    j0 j0Var2 = c1.m(service, null, null).f26889y;
                    c1.g(j0Var2);
                    j0Var2.K.b("Completed wakeful intent.");
                    a3Var.b(intent);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g2(l0 l0Var, int i10, Exception exc, byte[] bArr, Map map) {
        this.f26942g = l0Var;
        this.f26941d = i10;
        this.f26943r = exc;
        this.f26944x = bArr;
    }
}
