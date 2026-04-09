package com.ui.wifiman.model.bluetooth.classic;

import Cc.AbstractC2558b;
import com.ui.wifiman.model.vendor.d;
import gg.i;
import h9.C5969a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public interface BluetoothScanner {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\b¨\u0006\t"}, d2 = {"Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$Error;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "<init>", "(Ljava/lang/String;)V", "BluetoothNotAvailableOnDevice", "Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$Error$BluetoothNotAvailableOnDevice;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends Exception {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$Error$BluetoothNotAvailableOnDevice;", "Lcom/ui/wifiman/model/bluetooth/classic/BluetoothScanner$Error;", "<init>", "()V", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class BluetoothNotAvailableOnDevice extends Error {
            public BluetoothNotAvailableOnDevice() {
                super("Bluetooth classic discovery is not available on device", null);
            }
        }

        public /* synthetic */ Error(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private Error(String str) {
            super(str);
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C5969a f42432a;

        /* renamed from: b, reason: collision with root package name */
        private final String f42433b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f42434c;

        /* renamed from: d, reason: collision with root package name */
        private final U7.a f42435d;

        /* renamed from: e, reason: collision with root package name */
        private final AbstractC2558b f42436e;

        /* renamed from: f, reason: collision with root package name */
        private final d f42437f;

        /* renamed from: g, reason: collision with root package name */
        private final Set f42438g;

        /* renamed from: h, reason: collision with root package name */
        private final long f42439h;

        public a(C5969a mac, String str, boolean z10, U7.a aVar, AbstractC2558b abstractC2558b, d dVar, Set supportedTypes, long j10) {
            AbstractC6492s.i(mac, "mac");
            AbstractC6492s.i(supportedTypes, "supportedTypes");
            this.f42432a = mac;
            this.f42433b = str;
            this.f42434c = z10;
            this.f42435d = aVar;
            this.f42436e = abstractC2558b;
            this.f42437f = dVar;
            this.f42438g = supportedTypes;
            this.f42439h = j10;
        }

        public final boolean a() {
            return this.f42434c;
        }

        public final long b() {
            return this.f42439h;
        }

        public final C5969a c() {
            return this.f42432a;
        }

        public final String d() {
            return this.f42433b;
        }

        public final U7.a e() {
            return this.f42435d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f42432a, aVar.f42432a) && AbstractC6492s.d(this.f42433b, aVar.f42433b) && this.f42434c == aVar.f42434c && AbstractC6492s.d(this.f42435d, aVar.f42435d) && AbstractC6492s.d(this.f42436e, aVar.f42436e) && AbstractC6492s.d(this.f42437f, aVar.f42437f) && AbstractC6492s.d(this.f42438g, aVar.f42438g) && this.f42439h == aVar.f42439h;
        }

        public final Set f() {
            return this.f42438g;
        }

        public final AbstractC2558b g() {
            return this.f42436e;
        }

        public final d h() {
            return this.f42437f;
        }

        public int hashCode() {
            return this.f42432a.hashCode();
        }

        public String toString() {
            return "Result(mac=" + this.f42432a + ", name=" + this.f42433b + ", connected=" + this.f42434c + ", signalStrength=" + this.f42435d + ", type=" + this.f42436e + ", vendor=" + this.f42437f + ", supportedTypes=" + this.f42438g + ", lastSeenAt=" + this.f42439h + ")";
        }
    }

    i a();
}
