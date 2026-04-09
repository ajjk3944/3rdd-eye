package com.ui.wifiman.model.ubiquiti.firmware;

import com.ui.common.semver.SemVer;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final String f43847a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC1501a f43848b;

    /* renamed from: c, reason: collision with root package name */
    private final SemVer f43849c;

    /* renamed from: d, reason: collision with root package name */
    private final String f43850d;

    /* renamed from: e, reason: collision with root package name */
    private final long f43851e;

    /* renamed from: f, reason: collision with root package name */
    private final String f43852f;

    /* renamed from: g, reason: collision with root package name */
    private final String f43853g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.ui.wifiman.model.ubiquiti.firmware.a$a, reason: collision with other inner class name */
    public static final class EnumC1501a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ EnumC1501a[] $VALUES;
        public static final EnumC1501a PROD = new EnumC1501a("PROD", 0);
        public static final EnumC1501a BETA = new EnumC1501a("BETA", 1);
        public static final EnumC1501a INTERNAL = new EnumC1501a("INTERNAL", 2);

        private static final /* synthetic */ EnumC1501a[] $values() {
            return new EnumC1501a[]{PROD, BETA, INTERNAL};
        }

        static {
            EnumC1501a[] enumC1501aArr$values = $values();
            $VALUES = enumC1501aArr$values;
            $ENTRIES = AbstractC5827b.a(enumC1501aArr$values);
        }

        private EnumC1501a(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static EnumC1501a valueOf(String str) {
            return (EnumC1501a) Enum.valueOf(EnumC1501a.class, str);
        }

        public static EnumC1501a[] values() {
            return (EnumC1501a[]) $VALUES.clone();
        }
    }

    public a(String id2, EnumC1501a channel, SemVer semVer, String product, long j10, String url, String checksum) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(channel, "channel");
        AbstractC6492s.i(semVer, "semVer");
        AbstractC6492s.i(product, "product");
        AbstractC6492s.i(url, "url");
        AbstractC6492s.i(checksum, "checksum");
        this.f43847a = id2;
        this.f43848b = channel;
        this.f43849c = semVer;
        this.f43850d = product;
        this.f43851e = j10;
        this.f43852f = url;
        this.f43853g = checksum;
    }

    public final SemVer a() {
        return this.f43849c;
    }

    public final long c() {
        return this.f43851e;
    }

    public final String d() {
        return this.f43852f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC6492s.d(this.f43847a, aVar.f43847a) && this.f43848b == aVar.f43848b && AbstractC6492s.d(this.f43849c, aVar.f43849c) && AbstractC6492s.d(this.f43850d, aVar.f43850d) && this.f43851e == aVar.f43851e && AbstractC6492s.d(this.f43852f, aVar.f43852f) && AbstractC6492s.d(this.f43853g, aVar.f43853g);
    }

    public int hashCode() {
        return (((((((((((this.f43847a.hashCode() * 31) + this.f43848b.hashCode()) * 31) + this.f43849c.hashCode()) * 31) + this.f43850d.hashCode()) * 31) + Long.hashCode(this.f43851e)) * 31) + this.f43852f.hashCode()) * 31) + this.f43853g.hashCode();
    }

    public String toString() {
        return "UbiquitiFirmware(id=" + this.f43847a + ", channel=" + this.f43848b + ", semVer=" + this.f43849c + ", product=" + this.f43850d + ", sizeBytes=" + this.f43851e + ", url=" + this.f43852f + ", checksum=" + this.f43853g + ")";
    }
}
