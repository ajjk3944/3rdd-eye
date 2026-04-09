package P6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kg.InterfaceC6468e;

/* loaded from: classes3.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    final Context f18115a;

    /* renamed from: b, reason: collision with root package name */
    final x f18116b;

    class a implements gg.u {

        /* renamed from: P6.v$a$a, reason: collision with other inner class name */
        class C0632a extends BroadcastReceiver {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ gg.t f18118a;

            C0632a(gg.t tVar) {
                this.f18118a = tVar;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                this.f18118a.h(Boolean.valueOf(v.this.f18116b.a()));
            }
        }

        class b implements InterfaceC6468e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ BroadcastReceiver f18120a;

            b(BroadcastReceiver broadcastReceiver) {
                this.f18120a = broadcastReceiver;
            }

            @Override // kg.InterfaceC6468e
            public void cancel() {
                v.this.f18115a.unregisterReceiver(this.f18120a);
            }
        }

        a() {
        }

        @Override // gg.u
        public void a(gg.t tVar) {
            boolean zA = v.this.f18116b.a();
            C0632a c0632a = new C0632a(tVar);
            tVar.h(Boolean.valueOf(zA));
            v.this.f18115a.registerReceiver(c0632a, new IntentFilter("android.location.MODE_CHANGED"));
            tVar.d(new b(c0632a));
        }
    }

    v(Context context, x xVar) {
        this.f18115a = context;
        this.f18116b = xVar;
    }

    public gg.s a() {
        return gg.s.o(new a()).v().M0(Gg.a.f()).e1(Gg.a.f());
    }
}
