package com.ui.wifiman.model.ubiquiti.firmware.api;

import Y6.h;
import Y6.k;
import Y6.o;
import Y6.r;
import Zg.d0;
import a7.AbstractC3770c;
import com.ui.wifiman.model.ubiquiti.firmware.api.UbiquitiFirmwareApi;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi_TokenRequestJsonAdapter;", "LY6/h;", "Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$TokenRequest;", "LY6/r;", "moshi", "<init>", "(LY6/r;)V", "", "toString", "()Ljava/lang/String;", "LY6/k;", "reader", "l", "(LY6/k;)Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$TokenRequest;", "LY6/o;", "writer", "value_", "LYg/J;", "m", "(LY6/o;Lcom/ui/wifiman/model/ubiquiti/firmware/api/UbiquitiFirmwareApi$TokenRequest;)V", "LY6/k$b;", SnmpConfigurator.O_AUTH_PROTOCOL, "LY6/k$b;", "options", SnmpConfigurator.O_BIND_ADDRESS, "LY6/h;", "stringAdapter", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.ui.wifiman.model.ubiquiti.firmware.api.UbiquitiFirmwareApi_TokenRequestJsonAdapter, reason: from toString */
/* loaded from: classes4.dex */
public final class GeneratedJsonAdapter extends h<UbiquitiFirmwareApi.TokenRequest> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k.b options;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h stringAdapter;

    public GeneratedJsonAdapter(r moshi) {
        AbstractC6492s.i(moshi, "moshi");
        k.b bVarA = k.b.a("user_uuid", "ubic_auth");
        AbstractC6492s.h(bVarA, "of(...)");
        this.options = bVarA;
        h hVarF = moshi.f(String.class, d0.e(), "userId");
        AbstractC6492s.h(hVarF, "adapter(...)");
        this.stringAdapter = hVarF;
    }

    @Override // Y6.h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public UbiquitiFirmwareApi.TokenRequest b(k reader) {
        AbstractC6492s.i(reader, "reader");
        reader.g();
        String str = null;
        String str2 = null;
        while (reader.s()) {
            int iP0 = reader.p0(this.options);
            if (iP0 == -1) {
                reader.t0();
                reader.u0();
            } else if (iP0 == 0) {
                str = (String) this.stringAdapter.b(reader);
                if (str == null) {
                    throw AbstractC3770c.w("userId", "user_uuid", reader);
                }
            } else if (iP0 == 1 && (str2 = (String) this.stringAdapter.b(reader)) == null) {
                throw AbstractC3770c.w("ubicAuth", "ubic_auth", reader);
            }
        }
        reader.j();
        if (str == null) {
            throw AbstractC3770c.o("userId", "user_uuid", reader);
        }
        if (str2 != null) {
            return new UbiquitiFirmwareApi.TokenRequest(str, str2);
        }
        throw AbstractC3770c.o("ubicAuth", "ubic_auth", reader);
    }

    @Override // Y6.h
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(o writer, UbiquitiFirmwareApi.TokenRequest value_) {
        AbstractC6492s.i(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.h();
        writer.J("user_uuid");
        this.stringAdapter.j(writer, value_.getUserId());
        writer.J("ubic_auth");
        this.stringAdapter.j(writer, value_.getUbicAuth());
        writer.v();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("UbiquitiFirmwareApi.TokenRequest");
        sb2.append(')');
        return sb2.toString();
    }
}
