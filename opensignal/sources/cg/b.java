package cg;

import android.content.Context;
import bf.u;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import h9.r2;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements bf.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3743a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u f3744d;

    public /* synthetic */ b(u uVar, int i10) {
        this.f3743a = i10;
        this.f3744d = uVar;
    }

    @Override // bf.f
    public final Object f(r2 r2Var) {
        switch (this.f3743a) {
            case 0:
                return new d((Context) r2Var.a(Context.class), ((se.f) r2Var.a(se.f.class)).d(), r2Var.m(u.a(e.class)), r2Var.g(ng.b.class), (Executor) r2Var.i(this.f3744d));
            case 1:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(this.f3744d, r2Var);
            default:
                return RemoteConfigRegistrar.lambda$getComponents$0(this.f3744d, r2Var);
        }
    }
}
