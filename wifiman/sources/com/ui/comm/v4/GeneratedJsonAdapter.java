package com.ui.comm.v4;

import Y6.h;
import Y6.k;
import Y6.o;
import Y6.r;
import Y6.v;
import Zg.d0;
import a7.AbstractC3770c;
import com.squareup.moshi.JsonDataException;
import com.ui.comm.v4.UiCommV4Specs$Header;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R(\u0010 \u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019¨\u0006!"}, d2 = {"Lcom/ui/comm/v4/UiCommV4Specs_Header_HttpRequestJsonAdapter;", "LY6/h;", "Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpRequest;", "LY6/r;", "moshi", "<init>", "(LY6/r;)V", "", "toString", "()Ljava/lang/String;", "LY6/k;", "reader", "l", "(LY6/k;)Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpRequest;", "LY6/o;", "writer", "value_", "LYg/J;", "m", "(LY6/o;Lcom/ui/comm/v4/UiCommV4Specs$Header$HttpRequest;)V", "LY6/k$b;", SnmpConfigurator.O_AUTH_PROTOCOL, "LY6/k$b;", "options", SnmpConfigurator.O_BIND_ADDRESS, "LY6/h;", "stringAdapter", "", SnmpConfigurator.O_COMMUNITY, "longAdapter", "", "d", "nullableMapOfStringStringAdapter", "ui-communication-v4_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: com.ui.comm.v4.UiCommV4Specs_Header_HttpRequestJsonAdapter, reason: from toString */
/* loaded from: classes3.dex */
public final class GeneratedJsonAdapter extends h<UiCommV4Specs$Header.HttpRequest> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k.b options;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h stringAdapter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h longAdapter;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h nullableMapOfStringStringAdapter;

    public GeneratedJsonAdapter(r moshi) {
        AbstractC6492s.i(moshi, "moshi");
        k.b bVarA = k.b.a("id", "timestamp", "method", "path", "headers");
        AbstractC6492s.h(bVarA, "of(\"id\", \"timestamp\", \"m…\n      \"path\", \"headers\")");
        this.options = bVarA;
        h hVarF = moshi.f(String.class, d0.e(), "guid");
        AbstractC6492s.h(hVarF, "moshi.adapter(String::cl…emptySet(),\n      \"guid\")");
        this.stringAdapter = hVarF;
        h hVarF2 = moshi.f(Long.TYPE, d0.e(), "timestamp");
        AbstractC6492s.h(hVarF2, "moshi.adapter(Long::clas…Set(),\n      \"timestamp\")");
        this.longAdapter = hVarF2;
        h hVarF3 = moshi.f(v.j(Map.class, String.class, String.class), d0.e(), "headers");
        AbstractC6492s.h(hVarF3, "moshi.adapter(Types.newP…), emptySet(), \"headers\")");
        this.nullableMapOfStringStringAdapter = hVarF3;
    }

    @Override // Y6.h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public UiCommV4Specs$Header.HttpRequest b(k reader) {
        AbstractC6492s.i(reader, "reader");
        reader.g();
        Long l10 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Map map = null;
        while (reader.s()) {
            int iP0 = reader.p0(this.options);
            if (iP0 == -1) {
                reader.t0();
                reader.u0();
            } else if (iP0 == 0) {
                str = (String) this.stringAdapter.b(reader);
                if (str == null) {
                    JsonDataException jsonDataExceptionW = AbstractC3770c.w("guid", "id", reader);
                    AbstractC6492s.h(jsonDataExceptionW, "unexpectedNull(\"guid\", \"id\",\n            reader)");
                    throw jsonDataExceptionW;
                }
            } else if (iP0 == 1) {
                l10 = (Long) this.longAdapter.b(reader);
                if (l10 == null) {
                    JsonDataException jsonDataExceptionW2 = AbstractC3770c.w("timestamp", "timestamp", reader);
                    AbstractC6492s.h(jsonDataExceptionW2, "unexpectedNull(\"timestam…     \"timestamp\", reader)");
                    throw jsonDataExceptionW2;
                }
            } else if (iP0 == 2) {
                str2 = (String) this.stringAdapter.b(reader);
                if (str2 == null) {
                    JsonDataException jsonDataExceptionW3 = AbstractC3770c.w("method", "method", reader);
                    AbstractC6492s.h(jsonDataExceptionW3, "unexpectedNull(\"method\",…        \"method\", reader)");
                    throw jsonDataExceptionW3;
                }
            } else if (iP0 == 3) {
                str3 = (String) this.stringAdapter.b(reader);
                if (str3 == null) {
                    JsonDataException jsonDataExceptionW4 = AbstractC3770c.w("path", "path", reader);
                    AbstractC6492s.h(jsonDataExceptionW4, "unexpectedNull(\"path\", \"path\",\n            reader)");
                    throw jsonDataExceptionW4;
                }
            } else if (iP0 == 4) {
                map = (Map) this.nullableMapOfStringStringAdapter.b(reader);
            }
        }
        reader.j();
        if (str == null) {
            JsonDataException jsonDataExceptionO = AbstractC3770c.o("guid", "id", reader);
            AbstractC6492s.h(jsonDataExceptionO, "missingProperty(\"guid\", \"id\", reader)");
            throw jsonDataExceptionO;
        }
        if (l10 == null) {
            JsonDataException jsonDataExceptionO2 = AbstractC3770c.o("timestamp", "timestamp", reader);
            AbstractC6492s.h(jsonDataExceptionO2, "missingProperty(\"timestamp\", \"timestamp\", reader)");
            throw jsonDataExceptionO2;
        }
        long jLongValue = l10.longValue();
        if (str2 == null) {
            JsonDataException jsonDataExceptionO3 = AbstractC3770c.o("method", "method", reader);
            AbstractC6492s.h(jsonDataExceptionO3, "missingProperty(\"method\", \"method\", reader)");
            throw jsonDataExceptionO3;
        }
        if (str3 != null) {
            return new UiCommV4Specs$Header.HttpRequest(str, jLongValue, str2, str3, map);
        }
        JsonDataException jsonDataExceptionO4 = AbstractC3770c.o("path", "path", reader);
        AbstractC6492s.h(jsonDataExceptionO4, "missingProperty(\"path\", \"path\", reader)");
        throw jsonDataExceptionO4;
    }

    @Override // Y6.h
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(o writer, UiCommV4Specs$Header.HttpRequest value_) {
        AbstractC6492s.i(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.h();
        writer.J("id");
        this.stringAdapter.j(writer, value_.getGuid());
        writer.J("timestamp");
        this.longAdapter.j(writer, Long.valueOf(value_.getTimestamp()));
        writer.J("method");
        this.stringAdapter.j(writer, value_.getMethod());
        writer.J("path");
        this.stringAdapter.j(writer, value_.getPath());
        writer.J("headers");
        this.nullableMapOfStringStringAdapter.j(writer, value_.getHeaders());
        writer.v();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("UiCommV4Specs.Header.HttpRequest");
        sb2.append(')');
        String string = sb2.toString();
        AbstractC6492s.h(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
