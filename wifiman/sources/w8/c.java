package W8;

import G6.G;
import G6.O;
import Q6.f;
import Q6.g;
import T8.a;
import android.os.ParcelUuid;
import com.polidea.rxandroidble3.exceptions.BleException;
import com.ui.btle.rxandroidble.BTLEv2RxAndroidBle;
import com.ui.btle.rxandroidble.a;
import gg.EnumC5911a;
import gg.i;
import gg.o;
import gg.q;
import gg.r;
import gg.s;
import h9.C5969a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kg.InterfaceC6464a;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* loaded from: classes3.dex */
public final class c implements T8.c {

    /* renamed from: a, reason: collision with root package name */
    private final i f23698a;

    static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f23699a = new a();

        /* renamed from: W8.c$a$a, reason: collision with other inner class name */
        static final class C0879a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f23700a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0879a(f fVar) {
                super(0);
                this.f23700a = fVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                O oA = this.f23700a.a();
                return "Discovered BLE device with invalid MAC " + (oA != null ? oA.b() : null);
            }
        }

        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f23701a;

            static {
                int[] iArr = new int[Q6.b.values().length];
                try {
                    iArr[Q6.b.CONNECTABLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Q6.b.NOT_CONNECTABLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Q6.b.LEGACY_UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f23701a = iArr;
            }
        }

        /* renamed from: W8.c$a$c, reason: collision with other inner class name */
        public static final class C0880c implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ f f23702a;

            public C0880c(f fVar) {
                this.f23702a = fVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // gg.q
            public final void a(o oVar) {
                C5969a c5969aE;
                String macAddress;
                try {
                    O oA = this.f23702a.a();
                    Object aVar = null;
                    if (oA == null || (macAddress = oA.b()) == null) {
                        c5969aE = null;
                    } else {
                        AbstractC6492s.h(macAddress, "macAddress");
                        c5969aE = C5969a.f48518b.e(macAddress);
                    }
                    if (c5969aE != null) {
                        String strA = this.f23702a.c().a();
                        int iB = this.f23702a.b();
                        HashMap map = new HashMap();
                        List serviceUuids = this.f23702a.c().f();
                        if (serviceUuids != null) {
                            AbstractC6492s.h(serviceUuids, "serviceUuids");
                            Iterator it = serviceUuids.iterator();
                            while (it.hasNext()) {
                                UUID uuid = ((ParcelUuid) it.next()).getUuid();
                                AbstractC6492s.h(uuid, "service.uuid");
                                map.put(a.c.a(a.c.b(uuid)), null);
                            }
                        }
                        Map serviceData = this.f23702a.c().g();
                        if (serviceData != null) {
                            AbstractC6492s.h(serviceData, "serviceData");
                            ArrayList arrayList = new ArrayList(serviceData.size());
                            for (Map.Entry entry : serviceData.entrySet()) {
                                ParcelUuid parcelUuid = (ParcelUuid) entry.getKey();
                                byte[] bArr = (byte[]) entry.getValue();
                                UUID uuid2 = parcelUuid.getUuid();
                                AbstractC6492s.h(uuid2, "service.uuid");
                                arrayList.add((byte[]) map.put(a.c.a(a.c.b(uuid2)), bArr));
                            }
                        }
                        int iC = this.f23702a.c().c();
                        Integer numValueOf = iC == -1 ? null : Integer.valueOf(iC);
                        Q6.b bVarD = this.f23702a.d();
                        int i10 = bVarD == null ? -1 : b.f23701a[bVarD.ordinal()];
                        if (i10 != -1) {
                            if (i10 == 1) {
                                aVar = Boolean.TRUE;
                            } else if (i10 == 2) {
                                aVar = Boolean.FALSE;
                            } else if (i10 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        aVar = new W8.a(c5969aE, strA, Integer.valueOf(iB), numValueOf, aVar, map);
                    } else {
                        X8.a.e(new C0879a(this.f23702a), null, 2, null);
                    }
                    if (aVar != null) {
                        oVar.onSuccess(aVar);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r apply(f scanResult) {
            AbstractC6492s.i(scanResult, "scanResult");
            gg.n nVarC = gg.n.c(new C0880c(scanResult));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    static final class b implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final b f23703a = new b();

        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ W8.a f23704a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(W8.a aVar) {
                super(0);
                this.f23704a = aVar;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "BTLE Device Scanner found device: " + this.f23704a.d() + "[" + this.f23704a.c() + "]";
            }
        }

        b() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(W8.a it) {
            AbstractC6492s.i(it, "it");
            if (com.ui.btle.rxandroidble.a.f41105a.c()) {
                X8.a.c(new a(it));
            }
        }
    }

    /* renamed from: W8.c$c, reason: collision with other inner class name */
    static final class C0881c implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final C0881c f23705a = new C0881c();

        /* renamed from: W8.c$c$a */
        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f23706a = new a();

            a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "BTLE Device Scanner SUBSCRIBED";
            }
        }

        C0881c() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Dj.c it) {
            AbstractC6492s.i(it, "it");
            X8.a.c(a.f23706a);
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f23707a = new d();

        d() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "BTLE Device Scanner FINISHED";
        }
    }

    static final class e implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f23708a = new e();

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            return error instanceof BleException ? i.k0(new BTLEv2RxAndroidBle.Error("BTLE Device scanner error", error)) : i.k0(error);
        }
    }

    public c(G rxBleClient) {
        AbstractC6492s.i(rxBleClient, "rxBleClient");
        s sVarE = rxBleClient.e(new g.b().b(2).a(), new Q6.d[0]);
        a.C1281a c1281a = a.C1281a.f41109a;
        i iVarI2 = sVarE.o0(c1281a.a()).W(a.f23699a).F(b.f23703a).d1(EnumC5911a.LATEST).g0(C0881c.f23705a).Z(new InterfaceC6464a() { // from class: W8.b
            @Override // kg.InterfaceC6464a
            public final void run() {
                c.b();
            }
        }).F1(c1281a.a()).f1(e.f23708a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "rxBleClient.scanBleDevic…)\n            .refCount()");
        this.f23698a = iVarI2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b() {
        X8.a.c(d.f23707a);
    }
}
