package G6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kg.InterfaceC6468e;

/* loaded from: classes3.dex */
public class E extends gg.s {

    /* renamed from: a, reason: collision with root package name */
    private final gg.s f6986a;

    class a implements gg.u {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f6987a;

        /* renamed from: G6.E$a$a, reason: collision with other inner class name */
        class C0275a extends BroadcastReceiver {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ gg.t f6989a;

            C0275a(gg.t tVar) {
                this.f6989a = tVar;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                b bVarI1 = E.i1(intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1));
                I6.q.k("Adapter state changed: %s", bVarI1);
                this.f6989a.h(bVarI1);
            }
        }

        class b implements InterfaceC6468e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ BroadcastReceiver f6991a;

            b(BroadcastReceiver broadcastReceiver) {
                this.f6991a = broadcastReceiver;
            }

            @Override // kg.InterfaceC6468e
            public void cancel() {
                a.this.f6987a.unregisterReceiver(this.f6991a);
            }
        }

        a(Context context) {
            this.f6987a = context;
        }

        @Override // gg.u
        public void a(gg.t tVar) {
            C0275a c0275a = new C0275a(tVar);
            this.f6987a.registerReceiver(c0275a, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
            tVar.d(new b(c0275a));
        }
    }

    public static class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f6993c = new b(true, "STATE_ON");

        /* renamed from: d, reason: collision with root package name */
        public static final b f6994d = new b(false, "STATE_OFF");

        /* renamed from: e, reason: collision with root package name */
        public static final b f6995e = new b(false, "STATE_TURNING_ON");

        /* renamed from: f, reason: collision with root package name */
        public static final b f6996f = new b(false, "STATE_TURNING_OFF");

        /* renamed from: a, reason: collision with root package name */
        private final boolean f6997a;

        /* renamed from: b, reason: collision with root package name */
        private final String f6998b;

        private b(boolean z10, String str) {
            this.f6997a = z10;
            this.f6998b = str;
        }

        public boolean a() {
            return this.f6997a;
        }

        public String toString() {
            return this.f6998b;
        }
    }

    public E(Context context) {
        this.f6986a = gg.s.o(new a(context)).M0(Gg.a.f()).e1(Gg.a.f()).D0();
    }

    static b i1(int i10) {
        switch (i10) {
            case 11:
                return b.f6995e;
            case 12:
                return b.f6993c;
            case 13:
                return b.f6996f;
            default:
                return b.f6994d;
        }
    }

    @Override // gg.s
    protected void L0(gg.x xVar) {
        this.f6986a.d(xVar);
    }
}
