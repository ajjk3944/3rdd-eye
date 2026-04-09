package u6;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f35156b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f35157c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, ck.c cVar) {
        super(2, cVar);
        this.f35157c = context;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        j jVar = new j(this.f35157c, cVar);
        jVar.f35156b = ((Boolean) obj).booleanValue();
        return jVar;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        j jVar = (j) create(bool, (ck.c) obj2);
        yj.u uVar = yj.u.f37649a;
        jVar.invokeSuspend(uVar);
        return uVar;
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        ci.b.D(obj);
        c7.j.a(this.f35157c, RescheduleReceiver.class, this.f35156b);
        return yj.u.f37649a;
    }
}
