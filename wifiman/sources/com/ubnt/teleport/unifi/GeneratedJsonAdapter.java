package com.ubnt.teleport.unifi;

import Y6.k;
import Y6.o;
import Y6.r;
import Zg.d0;
import a7.AbstractC3770c;
import com.squareup.moshi.JsonDataException;
import com.ubnt.teleport.unifi.UnifiTeleportTunnelConnectionManager;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager_EchoRequestJsonAdapter;", "LY6/h;", "Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$EchoRequest;", "LY6/r;", "moshi", "<init>", "(LY6/r;)V", "", "toString", "()Ljava/lang/String;", "LY6/k;", "reader", "l", "(LY6/k;)Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$EchoRequest;", "LY6/o;", "writer", "value_", "LYg/J;", "m", "(LY6/o;Lcom/ubnt/teleport/unifi/UnifiTeleportTunnelConnectionManager$EchoRequest;)V", "LY6/k$b;", SnmpConfigurator.O_AUTH_PROTOCOL, "LY6/k$b;", "options", SnmpConfigurator.O_BIND_ADDRESS, "LY6/h;", "stringAdapter", "", SnmpConfigurator.O_COMMUNITY, "intAdapter", "teleport-unifi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* renamed from: com.ubnt.teleport.unifi.UnifiTeleportTunnelConnectionManager_EchoRequestJsonAdapter, reason: from toString */
/* loaded from: classes3.dex */
public final class GeneratedJsonAdapter extends Y6.h<UnifiTeleportTunnelConnectionManager.EchoRequest> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k.b options;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Y6.h stringAdapter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Y6.h intAdapter;

    public GeneratedJsonAdapter(r moshi) {
        AbstractC6492s.i(moshi, "moshi");
        k.b bVarA = k.b.a("session_secret_hash", "req_id", "timeout");
        AbstractC6492s.h(bVarA, "of(\"session_secret_hash\"…req_id\",\n      \"timeout\")");
        this.options = bVarA;
        Y6.h hVarF = moshi.f(String.class, d0.e(), "sessionSecretHash");
        AbstractC6492s.h(hVarF, "moshi.adapter(String::cl…     \"sessionSecretHash\")");
        this.stringAdapter = hVarF;
        Y6.h hVarF2 = moshi.f(Integer.TYPE, d0.e(), "timeout");
        AbstractC6492s.h(hVarF2, "moshi.adapter(Int::class…a, emptySet(), \"timeout\")");
        this.intAdapter = hVarF2;
    }

    @Override // Y6.h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public UnifiTeleportTunnelConnectionManager.EchoRequest b(Y6.k reader) {
        AbstractC6492s.i(reader, "reader");
        reader.g();
        String str = null;
        String str2 = null;
        Integer num = null;
        while (reader.s()) {
            int iP0 = reader.p0(this.options);
            if (iP0 == -1) {
                reader.t0();
                reader.u0();
            } else if (iP0 == 0) {
                str = (String) this.stringAdapter.b(reader);
                if (str == null) {
                    JsonDataException jsonDataExceptionW = AbstractC3770c.w("sessionSecretHash", "session_secret_hash", reader);
                    AbstractC6492s.h(jsonDataExceptionW, "unexpectedNull(\"sessionS…ion_secret_hash\", reader)");
                    throw jsonDataExceptionW;
                }
            } else if (iP0 == 1) {
                str2 = (String) this.stringAdapter.b(reader);
                if (str2 == null) {
                    JsonDataException jsonDataExceptionW2 = AbstractC3770c.w("requestId", "req_id", reader);
                    AbstractC6492s.h(jsonDataExceptionW2, "unexpectedNull(\"requestI…        \"req_id\", reader)");
                    throw jsonDataExceptionW2;
                }
            } else if (iP0 == 2 && (num = (Integer) this.intAdapter.b(reader)) == null) {
                JsonDataException jsonDataExceptionW3 = AbstractC3770c.w("timeout", "timeout", reader);
                AbstractC6492s.h(jsonDataExceptionW3, "unexpectedNull(\"timeout\"…       \"timeout\", reader)");
                throw jsonDataExceptionW3;
            }
        }
        reader.j();
        if (str == null) {
            JsonDataException jsonDataExceptionO = AbstractC3770c.o("sessionSecretHash", "session_secret_hash", reader);
            AbstractC6492s.h(jsonDataExceptionO, "missingProperty(\"session…ion_secret_hash\", reader)");
            throw jsonDataExceptionO;
        }
        if (str2 == null) {
            JsonDataException jsonDataExceptionO2 = AbstractC3770c.o("requestId", "req_id", reader);
            AbstractC6492s.h(jsonDataExceptionO2, "missingProperty(\"requestId\", \"req_id\", reader)");
            throw jsonDataExceptionO2;
        }
        if (num != null) {
            return new UnifiTeleportTunnelConnectionManager.EchoRequest(str, str2, num.intValue());
        }
        JsonDataException jsonDataExceptionO3 = AbstractC3770c.o("timeout", "timeout", reader);
        AbstractC6492s.h(jsonDataExceptionO3, "missingProperty(\"timeout\", \"timeout\", reader)");
        throw jsonDataExceptionO3;
    }

    @Override // Y6.h
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(o writer, UnifiTeleportTunnelConnectionManager.EchoRequest value_) {
        AbstractC6492s.i(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.h();
        writer.J("session_secret_hash");
        this.stringAdapter.j(writer, value_.getSessionSecretHash());
        writer.J("req_id");
        this.stringAdapter.j(writer, value_.getRequestId());
        writer.J("timeout");
        this.intAdapter.j(writer, Integer.valueOf(value_.getTimeout()));
        writer.v();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(70);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("UnifiTeleportTunnelConnectionManager.EchoRequest");
        sb2.append(')');
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
