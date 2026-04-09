package com.ui.wifiman.model.ubiquiti.console.network.api;

import Y6.h;
import Y6.k;
import Y6.o;
import Y6.r;
import Y6.v;
import Zg.d0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleDevicesJsonAdapter;", "LY6/h;", "Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleDevices;", "LY6/r;", "moshi", "<init>", "(LY6/r;)V", "", "toString", "()Ljava/lang/String;", "LY6/k;", "reader", "l", "(LY6/k;)Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleDevices;", "LY6/o;", "writer", "value_", "LYg/J;", "m", "(LY6/o;Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleDevices;)V", "LY6/k$b;", SnmpConfigurator.O_AUTH_PROTOCOL, "LY6/k$b;", "options", "", "Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleDevice;", SnmpConfigurator.O_BIND_ADDRESS, "LY6/h;", "nullableListOfApiUnifiConsoleDeviceAdapter", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.ui.wifiman.model.ubiquiti.console.network.api.ApiUnifiConsoleDevicesJsonAdapter, reason: from toString */
/* loaded from: classes4.dex */
public final class GeneratedJsonAdapter extends h<ApiUnifiConsoleDevices> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k.b options;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h nullableListOfApiUnifiConsoleDeviceAdapter;

    public GeneratedJsonAdapter(r moshi) {
        AbstractC6492s.i(moshi, "moshi");
        k.b bVarA = k.b.a("network_devices");
        AbstractC6492s.h(bVarA, "of(...)");
        this.options = bVarA;
        h hVarF = moshi.f(v.j(List.class, ApiUnifiConsoleDevice.class), d0.e(), "network");
        AbstractC6492s.h(hVarF, "adapter(...)");
        this.nullableListOfApiUnifiConsoleDeviceAdapter = hVarF;
    }

    @Override // Y6.h
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public ApiUnifiConsoleDevices b(k reader) {
        AbstractC6492s.i(reader, "reader");
        reader.g();
        List list = null;
        while (reader.s()) {
            int iP0 = reader.p0(this.options);
            if (iP0 == -1) {
                reader.t0();
                reader.u0();
            } else if (iP0 == 0) {
                list = (List) this.nullableListOfApiUnifiConsoleDeviceAdapter.b(reader);
            }
        }
        reader.j();
        return new ApiUnifiConsoleDevices(list);
    }

    @Override // Y6.h
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(o writer, ApiUnifiConsoleDevices value_) {
        AbstractC6492s.i(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.h();
        writer.J("network_devices");
        this.nullableListOfApiUnifiConsoleDeviceAdapter.j(writer, value_.getNetwork());
        writer.v();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("ApiUnifiConsoleDevices");
        sb2.append(')');
        return sb2.toString();
    }
}
