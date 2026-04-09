package com.ui.wifiman.model.bluetooth.le;

import Cc.AbstractC2558b;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import h9.C5969a;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xa.InterfaceC8439a;

/* loaded from: classes4.dex */
public interface BleScanner {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0006\b\t\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "LWc/d;", "", "message", "<init>", "(Ljava/lang/String;)V", "InternalError", "ApplicationRegistrationFailed", "FeatureUnsupported", "MultipleScanningAtOnceNotSupported", "BluetoothNotAvailableOnDevice", "Unknown", "Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$ApplicationRegistrationFailed;", "Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$BluetoothNotAvailableOnDevice;", "Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$FeatureUnsupported;", "Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$InternalError;", "Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$MultipleScanningAtOnceNotSupported;", "Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$Unknown;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Error extends Exception implements Wc.d {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$ApplicationRegistrationFailed;", "Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error;", "<init>", "()V", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ApplicationRegistrationFailed extends Error {
            public ApplicationRegistrationFailed() {
                super("Fails to start scan as app cannot be registered.", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$BluetoothNotAvailableOnDevice;", "Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error;", "<init>", "()V", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class BluetoothNotAvailableOnDevice extends Error {
            public BluetoothNotAvailableOnDevice() {
                super("BLE discovery is not available on device", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$FeatureUnsupported;", "Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error;", "<init>", "()V", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class FeatureUnsupported extends Error {
            public FeatureUnsupported() {
                super("Fails to start power optimized scan as this feature is not supported.", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$InternalError;", "Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error;", "<init>", "()V", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class InternalError extends Error {
            public InternalError() {
                super("Fails to start scan due an internal error", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$MultipleScanningAtOnceNotSupported;", "Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error;", "<init>", "()V", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class MultipleScanningAtOnceNotSupported extends Error {
            public MultipleScanningAtOnceNotSupported() {
                super("Fails to start scan as BLE scan with the same settings is already started by the app.", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error$Unknown;", "Lcom/ui/wifiman/model/bluetooth/le/BleScanner$Error;", "<init>", "()V", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Unknown extends Error {
            public Unknown() {
                super("Unknown BLE Scanner error", null);
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
        private final C5969a f42487a;

        /* renamed from: b, reason: collision with root package name */
        private final C5969a f42488b;

        /* renamed from: c, reason: collision with root package name */
        private final EnumC1387a f42489c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f42490d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f42491e;

        /* renamed from: f, reason: collision with root package name */
        private final U7.a f42492f;

        /* renamed from: g, reason: collision with root package name */
        private final String f42493g;

        /* renamed from: h, reason: collision with root package name */
        private final AbstractC2558b f42494h;

        /* renamed from: i, reason: collision with root package name */
        private final com.ui.wifiman.model.vendor.d f42495i;

        /* renamed from: j, reason: collision with root package name */
        private final InterfaceC8439a.d f42496j;

        /* renamed from: k, reason: collision with root package name */
        private final Long f42497k;

        /* renamed from: l, reason: collision with root package name */
        private final Set f42498l;

        /* renamed from: m, reason: collision with root package name */
        private final Integer f42499m;

        /* renamed from: n, reason: collision with root package name */
        private final List f42500n;

        /* renamed from: o, reason: collision with root package name */
        private final Set f42501o;

        /* renamed from: p, reason: collision with root package name */
        private final long f42502p;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: com.ui.wifiman.model.bluetooth.le.BleScanner$a$a, reason: collision with other inner class name */
        public static final class EnumC1387a {
            private static final /* synthetic */ InterfaceC5826a $ENTRIES;
            private static final /* synthetic */ EnumC1387a[] $VALUES;
            public static final EnumC1387a BOOTING = new EnumC1387a("BOOTING", 0);
            public static final EnumC1387a FACTORY = new EnumC1387a("FACTORY", 1);
            public static final EnumC1387a NORMAL = new EnumC1387a("NORMAL", 2);

            private static final /* synthetic */ EnumC1387a[] $values() {
                return new EnumC1387a[]{BOOTING, FACTORY, NORMAL};
            }

            static {
                EnumC1387a[] enumC1387aArr$values = $values();
                $VALUES = enumC1387aArr$values;
                $ENTRIES = AbstractC5827b.a(enumC1387aArr$values);
            }

            private EnumC1387a(String str, int i10) {
            }

            public static InterfaceC5826a getEntries() {
                return $ENTRIES;
            }

            public static EnumC1387a valueOf(String str) {
                return (EnumC1387a) Enum.valueOf(EnumC1387a.class, str);
            }

            public static EnumC1387a[] values() {
                return (EnumC1387a[]) $VALUES.clone();
            }
        }

        public a(C5969a mac, C5969a bluetoothMac, EnumC1387a status, boolean z10, boolean z11, U7.a aVar, String str, AbstractC2558b abstractC2558b, com.ui.wifiman.model.vendor.d dVar, InterfaceC8439a.d dVar2, Long l10, Set supportedTypes, Integer num, List beacons, Set services, long j10) {
            AbstractC6492s.i(mac, "mac");
            AbstractC6492s.i(bluetoothMac, "bluetoothMac");
            AbstractC6492s.i(status, "status");
            AbstractC6492s.i(supportedTypes, "supportedTypes");
            AbstractC6492s.i(beacons, "beacons");
            AbstractC6492s.i(services, "services");
            this.f42487a = mac;
            this.f42488b = bluetoothMac;
            this.f42489c = status;
            this.f42490d = z10;
            this.f42491e = z11;
            this.f42492f = aVar;
            this.f42493g = str;
            this.f42494h = abstractC2558b;
            this.f42495i = dVar;
            this.f42496j = dVar2;
            this.f42497k = l10;
            this.f42498l = supportedTypes;
            this.f42499m = num;
            this.f42500n = beacons;
            this.f42501o = services;
            this.f42502p = j10;
        }

        public final Long a() {
            return this.f42497k;
        }

        public final List b() {
            return this.f42500n;
        }

        public final C5969a c() {
            return this.f42488b;
        }

        public final boolean d() {
            return this.f42491e;
        }

        public final boolean e() {
            return this.f42490d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f42487a, aVar.f42487a) && AbstractC6492s.d(this.f42488b, aVar.f42488b) && this.f42489c == aVar.f42489c && this.f42490d == aVar.f42490d && this.f42491e == aVar.f42491e && AbstractC6492s.d(this.f42492f, aVar.f42492f) && AbstractC6492s.d(this.f42493g, aVar.f42493g) && AbstractC6492s.d(this.f42494h, aVar.f42494h) && AbstractC6492s.d(this.f42495i, aVar.f42495i) && AbstractC6492s.d(this.f42496j, aVar.f42496j) && AbstractC6492s.d(this.f42497k, aVar.f42497k) && AbstractC6492s.d(this.f42498l, aVar.f42498l) && AbstractC6492s.d(this.f42499m, aVar.f42499m) && AbstractC6492s.d(this.f42500n, aVar.f42500n) && AbstractC6492s.d(this.f42501o, aVar.f42501o) && this.f42502p == aVar.f42502p;
        }

        public final long f() {
            return this.f42502p;
        }

        public final C5969a g() {
            return this.f42487a;
        }

        public final String h() {
            return this.f42493g;
        }

        public int hashCode() {
            return this.f42487a.hashCode();
        }

        public final InterfaceC8439a.d i() {
            return this.f42496j;
        }

        public final U7.a j() {
            return this.f42492f;
        }

        public final EnumC1387a k() {
            return this.f42489c;
        }

        public final Set l() {
            return this.f42498l;
        }

        public final Integer m() {
            return this.f42499m;
        }

        public final AbstractC2558b n() {
            return this.f42494h;
        }

        public final com.ui.wifiman.model.vendor.d o() {
            return this.f42495i;
        }

        public String toString() {
            return "Result(mac=" + this.f42487a + ", bluetoothMac=" + this.f42488b + ", status=" + this.f42489c + ", connected=" + this.f42490d + ", connectable=" + this.f42491e + ", signal=" + this.f42492f + ", name=" + this.f42493g + ", type=" + this.f42494h + ", vendor=" + this.f42495i + ", product=" + this.f42496j + ", advertisingIntervalMs=" + this.f42497k + ", supportedTypes=" + this.f42498l + ", txPower=" + this.f42499m + ", beacons=" + this.f42500n + ", services=" + this.f42501o + ", lastSeenAt=" + this.f42502p + ")";
        }
    }

    gg.i a();
}
