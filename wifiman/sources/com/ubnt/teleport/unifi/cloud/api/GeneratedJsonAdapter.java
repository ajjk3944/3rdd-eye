package com.ubnt.teleport.unifi.cloud.api;

import Y6.h;
import Y6.k;
import Y6.o;
import Y6.r;
import Zg.d0;
import a7.AbstractC3770c;
import com.squareup.moshi.JsonDataException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnectionJsonAdapter;", "LY6/h;", "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;", "LY6/r;", "moshi", "<init>", "(LY6/r;)V", "", "toString", "()Ljava/lang/String;", "LY6/k;", "reader", "l", "(LY6/k;)Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;", "LY6/o;", "writer", "value_", "LYg/J;", "m", "(LY6/o;Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudRequestPayloadConnection;)V", "LY6/k$b;", SnmpConfigurator.O_AUTH_PROTOCOL, "LY6/k$b;", "options", SnmpConfigurator.O_BIND_ADDRESS, "LY6/h;", "stringAdapter", "Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportCloudClientInfo;", SnmpConfigurator.O_COMMUNITY, "apiTeleportCloudClientInfoAdapter", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: com.ubnt.teleport.unifi.cloud.api.ApiTeleportCloudRequestPayloadConnectionJsonAdapter, reason: from toString */
/* loaded from: classes3.dex */
public final class GeneratedJsonAdapter extends h<ApiTeleportCloudRequestPayloadConnection> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k.b options;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h stringAdapter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h apiTeleportCloudClientInfoAdapter;

    public GeneratedJsonAdapter(r moshi) {
        AbstractC6492s.i(moshi, "moshi");
        k.b bVarA = k.b.a("client_name", "client_info", "secret");
        AbstractC6492s.h(bVarA, "of(\"client_name\", \"client_info\",\n      \"secret\")");
        this.options = bVarA;
        h hVarF = moshi.f(String.class, d0.e(), "clientName");
        AbstractC6492s.h(hVarF, "moshi.adapter(String::cl…et(),\n      \"clientName\")");
        this.stringAdapter = hVarF;
        h hVarF2 = moshi.f(ApiTeleportCloudClientInfo.class, d0.e(), "clientInfo");
        AbstractC6492s.h(hVarF2, "moshi.adapter(ApiTelepor…emptySet(), \"clientInfo\")");
        this.apiTeleportCloudClientInfoAdapter = hVarF2;
    }

    @Override // Y6.h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public ApiTeleportCloudRequestPayloadConnection b(k reader) {
        AbstractC6492s.i(reader, "reader");
        reader.g();
        String str = null;
        ApiTeleportCloudClientInfo apiTeleportCloudClientInfo = null;
        String str2 = null;
        while (reader.s()) {
            int iP0 = reader.p0(this.options);
            if (iP0 == -1) {
                reader.t0();
                reader.u0();
            } else if (iP0 == 0) {
                str = (String) this.stringAdapter.b(reader);
                if (str == null) {
                    JsonDataException jsonDataExceptionW = AbstractC3770c.w("clientName", "client_name", reader);
                    AbstractC6492s.h(jsonDataExceptionW, "unexpectedNull(\"clientNa…   \"client_name\", reader)");
                    throw jsonDataExceptionW;
                }
            } else if (iP0 == 1) {
                apiTeleportCloudClientInfo = (ApiTeleportCloudClientInfo) this.apiTeleportCloudClientInfoAdapter.b(reader);
                if (apiTeleportCloudClientInfo == null) {
                    JsonDataException jsonDataExceptionW2 = AbstractC3770c.w("clientInfo", "client_info", reader);
                    AbstractC6492s.h(jsonDataExceptionW2, "unexpectedNull(\"clientIn…\", \"client_info\", reader)");
                    throw jsonDataExceptionW2;
                }
            } else if (iP0 == 2 && (str2 = (String) this.stringAdapter.b(reader)) == null) {
                JsonDataException jsonDataExceptionW3 = AbstractC3770c.w("secret", "secret", reader);
                AbstractC6492s.h(jsonDataExceptionW3, "unexpectedNull(\"secret\",…        \"secret\", reader)");
                throw jsonDataExceptionW3;
            }
        }
        reader.j();
        if (str == null) {
            JsonDataException jsonDataExceptionO = AbstractC3770c.o("clientName", "client_name", reader);
            AbstractC6492s.h(jsonDataExceptionO, "missingProperty(\"clientN…\", \"client_name\", reader)");
            throw jsonDataExceptionO;
        }
        if (apiTeleportCloudClientInfo == null) {
            JsonDataException jsonDataExceptionO2 = AbstractC3770c.o("clientInfo", "client_info", reader);
            AbstractC6492s.h(jsonDataExceptionO2, "missingProperty(\"clientI…\", \"client_info\", reader)");
            throw jsonDataExceptionO2;
        }
        if (str2 != null) {
            return new ApiTeleportCloudRequestPayloadConnection(str, apiTeleportCloudClientInfo, str2);
        }
        JsonDataException jsonDataExceptionO3 = AbstractC3770c.o("secret", "secret", reader);
        AbstractC6492s.h(jsonDataExceptionO3, "missingProperty(\"secret\", \"secret\", reader)");
        throw jsonDataExceptionO3;
    }

    @Override // Y6.h
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(o writer, ApiTeleportCloudRequestPayloadConnection value_) {
        AbstractC6492s.i(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.h();
        writer.J("client_name");
        this.stringAdapter.j(writer, value_.getClientName());
        writer.J("client_info");
        this.apiTeleportCloudClientInfoAdapter.j(writer, value_.getClientInfo());
        writer.J("secret");
        this.stringAdapter.j(writer, value_.getSecret());
        writer.v();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(62);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ApiTeleportCloudRequestPayloadConnection");
        sb2.append(')');
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
