package com.ui.uidb.api;

import Y6.h;
import Y6.k;
import Y6.o;
import Y6.r;
import Y6.v;
import Zg.d0;
import com.ui.uidb.api.ApiProduct;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\"\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\"\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0019R\u001c\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0019R\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0019R\u001c\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001060\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019¨\u00068"}, d2 = {"Lcom/ui/uidb/api/ApiProductJsonAdapter;", "LY6/h;", "Lcom/ui/uidb/api/ApiProduct;", "LY6/r;", "moshi", "<init>", "(LY6/r;)V", "", "toString", "()Ljava/lang/String;", "LY6/k;", "reader", "l", "(LY6/k;)Lcom/ui/uidb/api/ApiProduct;", "LY6/o;", "writer", "value_", "LYg/J;", "m", "(LY6/o;Lcom/ui/uidb/api/ApiProduct;)V", "LY6/k$b;", SnmpConfigurator.O_AUTH_PROTOCOL, "LY6/k$b;", "options", SnmpConfigurator.O_BIND_ADDRESS, "LY6/h;", "nullableStringAdapter", "Lcom/ui/uidb/api/ApiProduct$Names;", SnmpConfigurator.O_COMMUNITY, "nullableNamesAdapter", "Lcom/ui/uidb/api/ApiProduct$Line;", "d", "nullableLineAdapter", "", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "nullableMapOfStringStringAdapter", "", "f", "nullableListOfStringAdapter", "Lcom/ui/uidb/api/ApiProduct$Triplet;", "g", "nullableListOfTripletAdapter", "Lcom/ui/uidb/api/ApiProductUnifi;", "h", "nullableApiProductUnifiAdapter", "Lcom/ui/uidb/api/ApiProductUisp;", "i", "nullableApiProductUispAdapter", "Lcom/ui/uidb/api/ApiProduct$Btle;", "j", "nullableBtleAdapter", "Lcom/ui/uidb/api/ApiProductCompliance;", "k", "nullableApiProductComplianceAdapter", "", "nullableBooleanAdapter", "uidb"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.ui.uidb.api.ApiProductJsonAdapter, reason: from toString */
/* loaded from: classes3.dex */
public final class GeneratedJsonAdapter extends h<ApiProduct> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k.b options;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h nullableStringAdapter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h nullableNamesAdapter;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h nullableLineAdapter;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h nullableMapOfStringStringAdapter;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final h nullableListOfStringAdapter;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final h nullableListOfTripletAdapter;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final h nullableApiProductUnifiAdapter;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final h nullableApiProductUispAdapter;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final h nullableBtleAdapter;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final h nullableApiProductComplianceAdapter;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final h nullableBooleanAdapter;

    public GeneratedJsonAdapter(r moshi) {
        AbstractC6492s.i(moshi, "moshi");
        k.b bVarA = k.b.a("id", "product", "line", "deviceType", "images", "videos", "sysids", "triplets", "unifi", "uisp", "btle", "shortnames", "guids", "compliance", "minAdoptVersion", "isARSupported");
        AbstractC6492s.h(bVarA, "of(...)");
        this.options = bVarA;
        h hVarF = moshi.f(String.class, d0.e(), "id");
        AbstractC6492s.h(hVarF, "adapter(...)");
        this.nullableStringAdapter = hVarF;
        h hVarF2 = moshi.f(ApiProduct.Names.class, d0.e(), "names");
        AbstractC6492s.h(hVarF2, "adapter(...)");
        this.nullableNamesAdapter = hVarF2;
        h hVarF3 = moshi.f(ApiProduct.Line.class, d0.e(), "line");
        AbstractC6492s.h(hVarF3, "adapter(...)");
        this.nullableLineAdapter = hVarF3;
        h hVarF4 = moshi.f(v.j(Map.class, String.class, String.class), d0.e(), "image");
        AbstractC6492s.h(hVarF4, "adapter(...)");
        this.nullableMapOfStringStringAdapter = hVarF4;
        h hVarF5 = moshi.f(v.j(List.class, String.class), d0.e(), "systemIds");
        AbstractC6492s.h(hVarF5, "adapter(...)");
        this.nullableListOfStringAdapter = hVarF5;
        h hVarF6 = moshi.f(v.j(List.class, ApiProduct.Triplet.class), d0.e(), "lookupTriplets");
        AbstractC6492s.h(hVarF6, "adapter(...)");
        this.nullableListOfTripletAdapter = hVarF6;
        h hVarF7 = moshi.f(ApiProductUnifi.class, d0.e(), "unifi");
        AbstractC6492s.h(hVarF7, "adapter(...)");
        this.nullableApiProductUnifiAdapter = hVarF7;
        h hVarF8 = moshi.f(ApiProductUisp.class, d0.e(), "uisp");
        AbstractC6492s.h(hVarF8, "adapter(...)");
        this.nullableApiProductUispAdapter = hVarF8;
        h hVarF9 = moshi.f(ApiProduct.Btle.class, d0.e(), "btle");
        AbstractC6492s.h(hVarF9, "adapter(...)");
        this.nullableBtleAdapter = hVarF9;
        h hVarF10 = moshi.f(ApiProductCompliance.class, d0.e(), "compliance");
        AbstractC6492s.h(hVarF10, "adapter(...)");
        this.nullableApiProductComplianceAdapter = hVarF10;
        h hVarF11 = moshi.f(Boolean.class, d0.e(), "isArSupported");
        AbstractC6492s.h(hVarF11, "adapter(...)");
        this.nullableBooleanAdapter = hVarF11;
    }

    @Override // Y6.h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public ApiProduct b(k reader) {
        AbstractC6492s.i(reader, "reader");
        reader.g();
        String str = null;
        ApiProduct.Names names = null;
        ApiProduct.Line line = null;
        String str2 = null;
        Map map = null;
        Map map2 = null;
        List list = null;
        List list2 = null;
        ApiProductUnifi apiProductUnifi = null;
        ApiProductUisp apiProductUisp = null;
        ApiProduct.Btle btle = null;
        List list3 = null;
        List list4 = null;
        ApiProductCompliance apiProductCompliance = null;
        Map map3 = null;
        Boolean bool = null;
        while (reader.s()) {
            switch (reader.p0(this.options)) {
                case -1:
                    reader.t0();
                    reader.u0();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.b(reader);
                    break;
                case 1:
                    names = (ApiProduct.Names) this.nullableNamesAdapter.b(reader);
                    break;
                case 2:
                    line = (ApiProduct.Line) this.nullableLineAdapter.b(reader);
                    break;
                case 3:
                    str2 = (String) this.nullableStringAdapter.b(reader);
                    break;
                case 4:
                    map = (Map) this.nullableMapOfStringStringAdapter.b(reader);
                    break;
                case 5:
                    map2 = (Map) this.nullableMapOfStringStringAdapter.b(reader);
                    break;
                case 6:
                    list = (List) this.nullableListOfStringAdapter.b(reader);
                    break;
                case 7:
                    list2 = (List) this.nullableListOfTripletAdapter.b(reader);
                    break;
                case 8:
                    apiProductUnifi = (ApiProductUnifi) this.nullableApiProductUnifiAdapter.b(reader);
                    break;
                case 9:
                    apiProductUisp = (ApiProductUisp) this.nullableApiProductUispAdapter.b(reader);
                    break;
                case 10:
                    btle = (ApiProduct.Btle) this.nullableBtleAdapter.b(reader);
                    break;
                case 11:
                    list3 = (List) this.nullableListOfStringAdapter.b(reader);
                    break;
                case 12:
                    list4 = (List) this.nullableListOfStringAdapter.b(reader);
                    break;
                case 13:
                    apiProductCompliance = (ApiProductCompliance) this.nullableApiProductComplianceAdapter.b(reader);
                    break;
                case 14:
                    map3 = (Map) this.nullableMapOfStringStringAdapter.b(reader);
                    break;
                case 15:
                    bool = (Boolean) this.nullableBooleanAdapter.b(reader);
                    break;
            }
        }
        reader.j();
        return new ApiProduct(str, names, line, str2, map, map2, list, list2, apiProductUnifi, apiProductUisp, btle, list3, list4, apiProductCompliance, map3, bool);
    }

    @Override // Y6.h
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(o writer, ApiProduct value_) {
        AbstractC6492s.i(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.h();
        writer.J("id");
        this.nullableStringAdapter.j(writer, value_.getId());
        writer.J("product");
        this.nullableNamesAdapter.j(writer, value_.getNames());
        writer.J("line");
        this.nullableLineAdapter.j(writer, value_.getLine());
        writer.J("deviceType");
        this.nullableStringAdapter.j(writer, value_.getType());
        writer.J("images");
        this.nullableMapOfStringStringAdapter.j(writer, value_.getImage());
        writer.J("videos");
        this.nullableMapOfStringStringAdapter.j(writer, value_.getVideo());
        writer.J("sysids");
        this.nullableListOfStringAdapter.j(writer, value_.getSystemIds());
        writer.J("triplets");
        this.nullableListOfTripletAdapter.j(writer, value_.getLookupTriplets());
        writer.J("unifi");
        this.nullableApiProductUnifiAdapter.j(writer, value_.getUnifi());
        writer.J("uisp");
        this.nullableApiProductUispAdapter.j(writer, value_.getUisp());
        writer.J("btle");
        this.nullableBtleAdapter.j(writer, value_.getBtle());
        writer.J("shortnames");
        this.nullableListOfStringAdapter.j(writer, value_.getShortnames());
        writer.J("guids");
        this.nullableListOfStringAdapter.j(writer, value_.getGuids());
        writer.J("compliance");
        this.nullableApiProductComplianceAdapter.j(writer, value_.getCompliance());
        writer.J("minAdoptVersion");
        this.nullableMapOfStringStringAdapter.j(writer, value_.getMinAdoptVersion());
        writer.J("isARSupported");
        this.nullableBooleanAdapter.j(writer, value_.getIsArSupported());
        writer.v();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ApiProduct");
        sb2.append(')');
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }
}
