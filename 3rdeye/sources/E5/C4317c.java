package e5;

import I4.s;
import I4.t;
import android.content.Context;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
/* renamed from: e5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4317c implements I4.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37720b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f37721c;

    public /* synthetic */ C4317c(s sVar, int i) {
        this.f37720b = i;
        this.f37721c = sVar;
    }

    @Override // I4.d
    public final Object g(t tVar) {
        switch (this.f37720b) {
            case 0:
                return new C4318d((Context) tVar.a(Context.class), ((B4.e) tVar.a(B4.e.class)).d(), tVar.h(e.class), tVar.c(q5.f.class), (Executor) tVar.b(this.f37721c));
            default:
                return RemoteConfigRegistrar.lambda$getComponents$0(this.f37721c, tVar);
        }
    }
}
