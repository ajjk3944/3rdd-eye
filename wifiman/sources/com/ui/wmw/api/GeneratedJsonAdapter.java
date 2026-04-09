package com.ui.wmw.api;

import Y6.h;
import Y6.k;
import Y6.o;
import Y6.r;
import Zg.d0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/ui/wmw/api/ApiVersionJsonAdapter;", "LY6/h;", "Lcom/ui/wmw/api/ApiVersion;", "LY6/r;", "moshi", "<init>", "(LY6/r;)V", "", "toString", "()Ljava/lang/String;", "LY6/k;", "reader", "l", "(LY6/k;)Lcom/ui/wmw/api/ApiVersion;", "LY6/o;", "writer", "value_", "LYg/J;", "m", "(LY6/o;Lcom/ui/wmw/api/ApiVersion;)V", "LY6/k$b;", SnmpConfigurator.O_AUTH_PROTOCOL, "LY6/k$b;", "options", SnmpConfigurator.O_BIND_ADDRESS, "LY6/h;", "nullableStringAdapter", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.ui.wmw.api.ApiVersionJsonAdapter, reason: from toString */
/* loaded from: classes4.dex */
public final class GeneratedJsonAdapter extends h<ApiVersion> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k.b options;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h nullableStringAdapter;

    public GeneratedJsonAdapter(r moshi) {
        AbstractC6492s.i(moshi, "moshi");
        k.b bVarA = k.b.a("apiVersion", "fwv");
        AbstractC6492s.h(bVarA, "of(...)");
        this.options = bVarA;
        h hVarF = moshi.f(String.class, d0.e(), "apiVersion");
        AbstractC6492s.h(hVarF, "adapter(...)");
        this.nullableStringAdapter = hVarF;
    }

    @Override // Y6.h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public ApiVersion b(k reader) {
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
                str = (String) this.nullableStringAdapter.b(reader);
            } else if (iP0 == 1) {
                str2 = (String) this.nullableStringAdapter.b(reader);
            }
        }
        reader.j();
        return new ApiVersion(str, str2);
    }

    @Override // Y6.h
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(o writer, ApiVersion value_) {
        AbstractC6492s.i(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.h();
        writer.J("apiVersion");
        this.nullableStringAdapter.j(writer, value_.getApiVersion());
        writer.J("fwv");
        this.nullableStringAdapter.j(writer, value_.getFirmwareVersion());
        writer.v();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ApiVersion");
        sb2.append(')');
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }
}
