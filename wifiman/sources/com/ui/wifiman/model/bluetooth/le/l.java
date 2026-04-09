package com.ui.wifiman.model.bluetooth.le;

import Zg.AbstractC3689v;
import Zg.U;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.util.SparseArray;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f42578a = new l();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f42579b;

    public static final class a implements j {

        /* renamed from: a, reason: collision with root package name */
        private final c f42580a;

        public a(c cVar) {
            this.f42580a = cVar;
        }

        public final c a() {
            return this.f42580a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f42580a == ((a) obj).f42580a;
        }

        public int hashCode() {
            c cVar = this.f42580a;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public String toString() {
            return "Beacon(deviceType=" + this.f42580a + ")";
        }
    }

    public static final class b {
        public a a(ScanResult scanResult) {
            SparseArray<byte[]> manufacturerSpecificData;
            byte[] bArr;
            c cVar;
            AbstractC6492s.i(scanResult, "scanResult");
            ScanRecord scanRecord = scanResult.getScanRecord();
            if (scanRecord == null || (manufacturerSpecificData = scanRecord.getManufacturerSpecificData()) == null || (bArr = manufacturerSpecificData.get(6)) == null || bArr.length < 2 || bArr[0] != 1 || (cVar = (c) l.f42579b.get(Byte.valueOf(bArr[1]))) == null) {
                return null;
            }
            return new a(cVar);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;

        /* renamed from: id, reason: collision with root package name */
        private final byte f42581id;
        public static final c XBOX_ONE = new c("XBOX_ONE", 0, (byte) 1);
        public static final c APPLE_IPHONE = new c("APPLE_IPHONE", 1, (byte) 6);
        public static final c APPLE_IPAD = new c("APPLE_IPAD", 2, (byte) 7);
        public static final c ANDROID = new c("ANDROID", 3, (byte) 8);
        public static final c WINDOWS_10_DESKTOP = new c("WINDOWS_10_DESKTOP", 4, (byte) 9);
        public static final c WINDOWS_10_PHONE = new c("WINDOWS_10_PHONE", 5, (byte) 11);
        public static final c LINUS_DEVICE = new c("LINUS_DEVICE", 6, (byte) 12);
        public static final c WINDOWS_IOT = new c("WINDOWS_IOT", 7, (byte) 13);
        public static final c SURFACE_HUB = new c("SURFACE_HUB", 8, (byte) 14);

        private static final /* synthetic */ c[] $values() {
            return new c[]{XBOX_ONE, APPLE_IPHONE, APPLE_IPAD, ANDROID, WINDOWS_10_DESKTOP, WINDOWS_10_PHONE, LINUS_DEVICE, WINDOWS_IOT, SURFACE_HUB};
        }

        static {
            c[] cVarArr$values = $values();
            $VALUES = cVarArr$values;
            $ENTRIES = AbstractC5827b.a(cVarArr$values);
        }

        private c(String str, int i10, byte b10) {
            this.f42581id = b10;
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        public final byte getId() {
            return this.f42581id;
        }
    }

    static {
        InterfaceC5826a entries = c.getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(entries, 10)), 16));
        for (Object obj : entries) {
            linkedHashMap.put(Byte.valueOf(((c) obj).getId()), obj);
        }
        f42579b = linkedHashMap;
    }

    private l() {
    }
}
