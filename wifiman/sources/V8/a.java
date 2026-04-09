package V8;

import G6.N;
import a9.AbstractC3775c;
import android.bluetooth.BluetoothGattCharacteristic;
import com.polidea.rxandroidble3.exceptions.BleException;
import com.ui.btle.rxandroidble.BTLEv2RxAndroidBle;
import gg.AbstractC5912b;
import gg.s;
import gg.v;
import kg.InterfaceC6469f;
import kg.n;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* loaded from: classes3.dex */
public final class a extends AbstractC3775c {

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5912b f23117b;

    /* renamed from: V8.a$a, reason: collision with other inner class name */
    static final class C0851a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0851a f23118a = new C0851a();

        C0851a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v apply(s packetFrameStream) {
            AbstractC6492s.i(packetFrameStream, "packetFrameStream");
            return packetFrameStream;
        }
    }

    static final class b implements InterfaceC6469f {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BluetoothGattCharacteristic f23120b;

        /* renamed from: V8.a$b$a, reason: collision with other inner class name */
        static final class C0852a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ BluetoothGattCharacteristic f23121a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ byte[] f23122b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0852a(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
                super(0);
                this.f23121a = bluetoothGattCharacteristic;
                this.f23122b = bArr;
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "FRAME READ [" + this.f23121a.getService().getUuid() + "] -> [" + this.f23121a.getUuid() + "] Read: " + this.f23122b.length + " bytes";
            }
        }

        b(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            this.f23120b = bluetoothGattCharacteristic;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(byte[] packetFrame) {
            AbstractC6492s.i(packetFrame, "packetFrame");
            a.this.g(new C0852a(this.f23120b, packetFrame));
            a.this.b(packetFrame);
        }
    }

    static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f23123a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            return error instanceof BleException ? AbstractC5912b.D(new BTLEv2RxAndroidBle.Error("BTLE frame reader ended with an error", error)) : AbstractC5912b.D(error);
        }
    }

    public a(N connection, BluetoothGattCharacteristic characteristic, AbstractC5912b connectionErrorStream) {
        AbstractC6492s.i(connection, "connection");
        AbstractC6492s.i(characteristic, "characteristic");
        AbstractC6492s.i(connectionErrorStream, "connectionErrorStream");
        AbstractC5912b abstractC5912bK = connection.h(characteristic).O0(C0851a.f23118a).F(new b(characteristic)).f0().O(c.f23123a).K(connectionErrorStream);
        AbstractC6492s.h(abstractC5912bK, "connection.setupNotifica…th(connectionErrorStream)");
        this.f23117b = abstractC5912bK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(InterfaceC6824a interfaceC6824a) {
        if (com.ui.btle.rxandroidble.a.f41105a.b()) {
            X8.a.c(interfaceC6824a);
        }
    }

    public final AbstractC5912b e() {
        return this.f23117b;
    }
}
