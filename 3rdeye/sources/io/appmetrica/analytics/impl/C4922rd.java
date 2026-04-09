package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.rd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4922rd implements JsonParser, Converter {

    /* renamed from: a, reason: collision with root package name */
    public final RemoteConfigExtensionConfiguration f41571a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JsonParser f41572b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Converter f41573c;

    public C4922rd(RemoteConfigExtensionConfiguration<Object> remoteConfigExtensionConfiguration) {
        this.f41571a = remoteConfigExtensionConfiguration;
        this.f41572b = remoteConfigExtensionConfiguration.getJsonParser();
        this.f41573c = remoteConfigExtensionConfiguration.getProtobufConverter();
    }

    public final byte[] a(Object obj) {
        return (byte[]) this.f41573c.fromModel(obj);
    }

    public final Object b(JSONObject jSONObject) {
        return this.f41572b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return (byte[]) this.f41573c.fromModel(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parse(JSONObject jSONObject) {
        return this.f41572b.parse(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return this.f41572b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return this.f41573c.toModel((byte[]) obj);
    }

    public final Object a(JSONObject jSONObject) {
        return this.f41572b.parse(jSONObject);
    }

    public final Object a(byte[] bArr) {
        return this.f41573c.toModel(bArr);
    }

    public final RemoteConfigExtensionConfiguration<Object> a() {
        return this.f41571a;
    }
}
