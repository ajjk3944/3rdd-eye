package e5;

import G0.t;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.vungle.ads.internal.k;
import e5.g;
import g5.InterfaceC4392b;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: DefaultHeartBeatController.java */
/* renamed from: e5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4318d implements f, g {

    /* renamed from: a, reason: collision with root package name */
    public final I4.f f37722a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f37723b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4392b<q5.f> f37724c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<e> f37725d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f37726e;

    public C4318d() {
        throw null;
    }

    public C4318d(Context context, String str, Set<e> set, InterfaceC4392b<q5.f> interfaceC4392b, Executor executor) {
        this.f37722a = new I4.f(1, context, str);
        this.f37725d = set;
        this.f37726e = executor;
        this.f37724c = interfaceC4392b;
        this.f37723b = context;
    }

    @Override // e5.f
    public final Task<String> a() {
        if (!t.a(this.f37723b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f37726e, new CallableC4316b(this, 0));
    }

    @Override // e5.g
    public final synchronized g.a b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        h hVar = (h) this.f37722a.get();
        if (!hVar.i(jCurrentTimeMillis)) {
            return g.a.NONE;
        }
        hVar.g();
        return g.a.GLOBAL;
    }

    public final void c() {
        if (this.f37725d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!t.a(this.f37723b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.f37726e, new k(this, 1));
        }
    }
}
