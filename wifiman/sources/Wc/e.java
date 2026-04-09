package wc;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import gg.C;
import gg.InterfaceC5910A;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.mp.PduHandle;
import tc.InterfaceC8077a;
import wc.InterfaceC8324d;

/* loaded from: classes4.dex */
public final class e implements InterfaceC8324d {

    /* renamed from: a, reason: collision with root package name */
    private final gg.i f64824a;

    /* renamed from: b, reason: collision with root package name */
    private final gg.i f64825b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f64826c;

    static final class a implements kg.n {
        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(Intent intent) {
            AbstractC6492s.i(intent, "intent");
            return AbstractC6492s.d("android.bluetooth.adapter.action.STATE_CHANGED", intent.getAction()) ? gg.n.o(e.this.e(intent.getIntExtra("android.bluetooth.adapter.extra.STATE", PduHandle.NONE))) : gg.n.h();
        }
    }

    public static final class b implements C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BluetoothManager f64828a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f64829b;

        public b(BluetoothManager bluetoothManager, e eVar) {
            this.f64828a = bluetoothManager;
            this.f64829b = eVar;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            InterfaceC8324d.a aVarE;
            try {
                BluetoothAdapter adapter = this.f64828a.getAdapter();
                if (adapter == null || (aVarE = this.f64829b.e(adapter.getState())) == null) {
                    aVarE = InterfaceC8324d.a.ERROR;
                }
                interfaceC5910A.onSuccess(aVarE);
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    public static final class c implements C {
        public c() {
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(Boolean.valueOf(e.this.f64826c));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class d implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f64832a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC8324d.b.a apply(InterfaceC8324d.a receiverState) {
                AbstractC6492s.i(receiverState, "receiverState");
                return new InterfaceC8324d.b.a(receiverState);
            }
        }

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Boolean bluetoothSupported) {
            AbstractC6492s.i(bluetoothSupported, "bluetoothSupported");
            if (bluetoothSupported.booleanValue()) {
                gg.i iVarN0 = e.this.f64824a.N0(a.f64832a);
                AbstractC6492s.f(iVarN0);
                return iVarN0;
            }
            gg.i iVarK0 = gg.i.K0(InterfaceC8324d.b.C2294b.f64823a);
            AbstractC6492s.f(iVarK0);
            return iVarK0;
        }
    }

    /* renamed from: wc.e$e, reason: collision with other inner class name */
    static final class C2295e implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final C2295e f64833a = new C2295e();

        C2295e() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC8324d.b it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("Bluetooth receiver state " + it, null, 2, null);
        }
    }

    public e(BluetoothManager bluetoothManager, PackageManager packageManager, InterfaceC8077a androidSystemReceiverFactory) {
        AbstractC6492s.i(bluetoothManager, "bluetoothManager");
        AbstractC6492s.i(packageManager, "packageManager");
        AbstractC6492s.i(androidSystemReceiverFactory, "androidSystemReceiverFactory");
        gg.i iVarV0 = androidSystemReceiverFactory.a(new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED")).v0(new a());
        gg.z zVarI = gg.z.i(new b(bluetoothManager, this));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        gg.i iVarY1 = iVarV0.y1(zVarI);
        AbstractC6492s.h(iVarY1, "startWith(...)");
        this.f64824a = iVarY1;
        gg.z zVarI2 = gg.z.i(new c());
        AbstractC6492s.h(zVarI2, "crossinline action: () -…or(error)\n        }\n    }");
        gg.i iVarI2 = zVarI2.w(new d()).X0(Gg.a.a()).F1(Gg.a.a()).W().f0(C2295e.f64833a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f64825b = iVarI2;
        this.f64826c = packageManager.hasSystemFeature("android.hardware.bluetooth") && bluetoothManager.getAdapter() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC8324d.a e(int i10) {
        if (i10 == Integer.MIN_VALUE) {
            return InterfaceC8324d.a.ERROR;
        }
        switch (i10) {
            case 10:
                return InterfaceC8324d.a.STATE_OFF;
            case 11:
                return InterfaceC8324d.a.STATE_TURNING_ON;
            case 12:
                return InterfaceC8324d.a.STATE_ON;
            case 13:
                return InterfaceC8324d.a.STATE_TURNING_OFF;
            default:
                throw new IllegalStateException("unknown bluetooth state " + i10);
        }
    }

    @Override // wc.InterfaceC8324d
    public gg.i a() {
        return this.f64825b;
    }
}
