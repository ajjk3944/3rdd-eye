package La;

import com.ui.speedtest.UiSpeedtestLib;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f11512a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11513b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f11514c;

    /* renamed from: d, reason: collision with root package name */
    private final Long f11515d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f11516e;

    /* renamed from: f, reason: collision with root package name */
    private final UiSpeedtestLib.Error f11517f;

    public e(String url, String str, Long l10, Long l11, boolean z10, UiSpeedtestLib.Error error) {
        AbstractC6492s.i(url, "url");
        this.f11512a = url;
        this.f11513b = str;
        this.f11514c = l10;
        this.f11515d = l11;
        this.f11516e = z10;
        this.f11517f = error;
    }

    public final Long a() {
        return this.f11515d;
    }

    public final Long b() {
        return this.f11514c;
    }

    public final String c() {
        return this.f11512a;
    }

    public final String d() {
        return this.f11513b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return AbstractC6492s.d(this.f11512a, eVar.f11512a) && AbstractC6492s.d(this.f11513b, eVar.f11513b) && AbstractC6492s.d(this.f11514c, eVar.f11514c) && AbstractC6492s.d(this.f11515d, eVar.f11515d) && this.f11516e == eVar.f11516e && AbstractC6492s.d(this.f11517f, eVar.f11517f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.f11512a.hashCode() * 31;
        String str = this.f11513b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l10 = this.f11514c;
        int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f11515d;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        boolean z10 = this.f11516e;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode4 + i10) * 31;
        UiSpeedtestLib.Error error = this.f11517f;
        return i11 + (error != null ? error.hashCode() : 0);
    }

    public String toString() {
        return "UiSpeedServerEvaluation(url=" + this.f11512a + ", version=" + this.f11513b + ", latencyMs=" + this.f11514c + ", jitterMs=" + this.f11515d + ", packetLoss=" + this.f11516e + ", error=" + this.f11517f + ")";
    }
}
