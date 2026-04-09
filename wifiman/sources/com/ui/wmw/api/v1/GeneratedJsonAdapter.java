package com.ui.wmw.api.v1;

import Y6.k;
import Y6.r;
import Zg.d0;
import a7.AbstractC3770c;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/ui/wmw/api/v1/ApiV1BluetoothSettingsJsonAdapter;", "LY6/h;", "Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;", "LY6/r;", "moshi", "<init>", "(LY6/r;)V", "", "toString", "()Ljava/lang/String;", "LY6/k;", "reader", "l", "(LY6/k;)Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;", "LY6/o;", "writer", "value_", "LYg/J;", "m", "(LY6/o;Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;)V", "LY6/k$b;", SnmpConfigurator.O_AUTH_PROTOCOL, "LY6/k$b;", "options", SnmpConfigurator.O_BIND_ADDRESS, "LY6/h;", "stringAdapter", "", SnmpConfigurator.O_COMMUNITY, "nullableIntAdapter", "", "d", "nullableBooleanAdapter", "Ljava/lang/reflect/Constructor;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Ljava/lang/reflect/Constructor;", "constructorRef", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.ui.wmw.api.v1.ApiV1BluetoothSettingsJsonAdapter, reason: from toString */
/* loaded from: classes4.dex */
public final class GeneratedJsonAdapter extends Y6.h<ApiV1BluetoothSettings> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k.b options;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Y6.h stringAdapter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Y6.h nullableIntAdapter;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Y6.h nullableBooleanAdapter;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private volatile Constructor constructorRef;

    public GeneratedJsonAdapter(r moshi) {
        AbstractC6492s.i(moshi, "moshi");
        k.b bVarA = k.b.a("btMode", "intervalMin", "intervalMax", "timeout", "latency", "enableLatency");
        AbstractC6492s.h(bVarA, "of(...)");
        this.options = bVarA;
        Y6.h hVarF = moshi.f(String.class, d0.e(), "modeId");
        AbstractC6492s.h(hVarF, "adapter(...)");
        this.stringAdapter = hVarF;
        Y6.h hVarF2 = moshi.f(Integer.class, d0.e(), "intervalMin");
        AbstractC6492s.h(hVarF2, "adapter(...)");
        this.nullableIntAdapter = hVarF2;
        Y6.h hVarF3 = moshi.f(Boolean.class, d0.e(), "enableLatency");
        AbstractC6492s.h(hVarF3, "adapter(...)");
        this.nullableBooleanAdapter = hVarF3;
    }

    @Override // Y6.h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public ApiV1BluetoothSettings b(Y6.k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AbstractC6492s.i(reader, "reader");
        reader.g();
        String str = null;
        int i10 = -1;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Boolean bool = null;
        while (reader.s()) {
            switch (reader.p0(this.options)) {
                case -1:
                    reader.t0();
                    reader.u0();
                    break;
                case 0:
                    str = (String) this.stringAdapter.b(reader);
                    if (str == null) {
                        throw AbstractC3770c.w("modeId", "btMode", reader);
                    }
                    break;
                case 1:
                    num = (Integer) this.nullableIntAdapter.b(reader);
                    i10 &= -3;
                    break;
                case 2:
                    num2 = (Integer) this.nullableIntAdapter.b(reader);
                    i10 &= -5;
                    break;
                case 3:
                    num3 = (Integer) this.nullableIntAdapter.b(reader);
                    i10 &= -9;
                    break;
                case 4:
                    num4 = (Integer) this.nullableIntAdapter.b(reader);
                    i10 &= -17;
                    break;
                case 5:
                    bool = (Boolean) this.nullableBooleanAdapter.b(reader);
                    i10 &= -33;
                    break;
            }
        }
        reader.j();
        if (i10 == -63) {
            if (str != null) {
                return new ApiV1BluetoothSettings(str, num, num2, num3, num4, bool);
            }
            throw AbstractC3770c.o("modeId", "btMode", reader);
        }
        Constructor declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = ApiV1BluetoothSettings.class.getDeclaredConstructor(String.class, Integer.class, Integer.class, Integer.class, Integer.class, Boolean.class, Integer.TYPE, AbstractC3770c.f25737c);
            this.constructorRef = declaredConstructor;
            AbstractC6492s.h(declaredConstructor, "also(...)");
        }
        Constructor constructor = declaredConstructor;
        if (str == null) {
            throw AbstractC3770c.o("modeId", "btMode", reader);
        }
        Object objNewInstance = constructor.newInstance(str, num, num2, num3, num4, bool, Integer.valueOf(i10), null);
        AbstractC6492s.h(objNewInstance, "newInstance(...)");
        return (ApiV1BluetoothSettings) objNewInstance;
    }

    @Override // Y6.h
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(Y6.o writer, ApiV1BluetoothSettings value_) {
        AbstractC6492s.i(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.h();
        writer.J("btMode");
        this.stringAdapter.j(writer, value_.getModeId());
        writer.J("intervalMin");
        this.nullableIntAdapter.j(writer, value_.getIntervalMin());
        writer.J("intervalMax");
        this.nullableIntAdapter.j(writer, value_.getIntervalMax());
        writer.J("timeout");
        this.nullableIntAdapter.j(writer, value_.getTimeout());
        writer.J("latency");
        this.nullableIntAdapter.j(writer, value_.getLatency());
        writer.J("enableLatency");
        this.nullableBooleanAdapter.j(writer, value_.getEnableLatency());
        writer.v();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ApiV1BluetoothSettings");
        sb2.append(')');
        String string = sb2.toString();
        AbstractC6492s.h(string, "toString(...)");
        return string;
    }
}
