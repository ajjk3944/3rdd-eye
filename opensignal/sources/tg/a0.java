package tg;

import android.content.Context;
import android.os.Process;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22719a;

    /* renamed from: b, reason: collision with root package name */
    public final lq.q f22720b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22721c;

    /* renamed from: d, reason: collision with root package name */
    public final lq.q f22722d;

    /* renamed from: e, reason: collision with root package name */
    public final lq.q f22723e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22724f;

    public a0(Context context, f1 f1Var) {
        br.l.e(context, "appContext");
        br.l.e(f1Var, "uuidGenerator");
        this.f22719a = context;
        final int i10 = 0;
        this.f22720b = kc.f.F(new ar.a(this) { // from class: tg.z

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a0 f22868d;

            {
                this.f22868d = this;
            }

            @Override // ar.a
            public final Object c() {
                switch (i10) {
                    case 0:
                        return ((c0) this.f22868d.f22723e.getValue()).f22748a;
                    default:
                        return r.b(this.f22868d.f22719a);
                }
            }
        });
        this.f22721c = Process.myPid();
        this.f22722d = kc.f.F(new androidx.lifecycle.p0(18, f1Var));
        final int i11 = 1;
        this.f22723e = kc.f.F(new ar.a(this) { // from class: tg.z

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a0 f22868d;

            {
                this.f22868d = this;
            }

            @Override // ar.a
            public final Object c() {
                switch (i11) {
                    case 0:
                        return ((c0) this.f22868d.f22723e.getValue()).f22748a;
                    default:
                        return r.b(this.f22868d.f22719a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.f22720b.getValue();
    }

    public final Map b(Map map) {
        lq.q qVar = this.f22722d;
        if (map == null) {
            return mq.b0.Q(new lq.l(a(), new y(Process.myPid(), (String) qVar.getValue())));
        }
        LinkedHashMap linkedHashMapY = mq.b0.Y(map);
        linkedHashMapY.put(a(), new y(Process.myPid(), (String) qVar.getValue()));
        return mq.b0.W(linkedHashMapY);
    }
}
