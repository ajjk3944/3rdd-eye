package io.appmetrica.analytics.modulesapi.internal.client.adrevenue;

import com.google.android.gms.ads.AdRequest;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import kotlin.jvm.internal.g;

/* loaded from: classes3.dex */
public final class ModuleAdRevenue {

    /* renamed from: a, reason: collision with root package name */
    private final BigDecimal f42302a;

    /* renamed from: b, reason: collision with root package name */
    private final Currency f42303b;

    /* renamed from: c, reason: collision with root package name */
    private final ModuleAdType f42304c;

    /* renamed from: d, reason: collision with root package name */
    private final String f42305d;

    /* renamed from: e, reason: collision with root package name */
    private final String f42306e;

    /* renamed from: f, reason: collision with root package name */
    private final String f42307f;

    /* renamed from: g, reason: collision with root package name */
    private final String f42308g;

    /* renamed from: h, reason: collision with root package name */
    private final String f42309h;
    private final String i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f42310j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f42311k;

    public ModuleAdRevenue(BigDecimal bigDecimal, Currency currency, ModuleAdType moduleAdType, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, boolean z10) {
        this.f42302a = bigDecimal;
        this.f42303b = currency;
        this.f42304c = moduleAdType;
        this.f42305d = str;
        this.f42306e = str2;
        this.f42307f = str3;
        this.f42308g = str4;
        this.f42309h = str5;
        this.i = str6;
        this.f42310j = map;
        this.f42311k = z10;
    }

    public final String getAdNetwork() {
        return this.f42305d;
    }

    public final String getAdPlacementId() {
        return this.f42308g;
    }

    public final String getAdPlacementName() {
        return this.f42309h;
    }

    public final BigDecimal getAdRevenue() {
        return this.f42302a;
    }

    public final ModuleAdType getAdType() {
        return this.f42304c;
    }

    public final String getAdUnitId() {
        return this.f42306e;
    }

    public final String getAdUnitName() {
        return this.f42307f;
    }

    public final boolean getAutoCollected() {
        return this.f42311k;
    }

    public final Currency getCurrency() {
        return this.f42303b;
    }

    public final Map<String, String> getPayload() {
        return this.f42310j;
    }

    public final String getPrecision() {
        return this.i;
    }

    public /* synthetic */ ModuleAdRevenue(BigDecimal bigDecimal, Currency currency, ModuleAdType moduleAdType, String str, String str2, String str3, String str4, String str5, String str6, Map map, boolean z10, int i, g gVar) {
        this(bigDecimal, currency, (i & 4) != 0 ? null : moduleAdType, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : map, (i & 1024) != 0 ? true : z10);
    }
}
