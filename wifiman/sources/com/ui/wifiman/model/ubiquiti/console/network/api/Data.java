package com.ui.wifiman.model.ubiquiti.console.network.api;

import Y6.g;
import Y6.i;
import com.ui.wifiman.model.ubiquiti.console.network.api.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0019\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleEvent$Companion$Data", "Lcom/ui/wifiman/model/ubiquiti/console/network/api/a;", "T", "", "", "data", "<init>", "(Ljava/util/List;)V", "Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleEvent$Companion$Data;", "copy", "(Ljava/util/List;)Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleEvent$Companion$Data;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/util/List;", "()Ljava/util/List;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@i(generateAdapter = true)
/* renamed from: com.ui.wifiman.model.ubiquiti.console.network.api.ApiUnifiConsoleEvent$Companion$Data, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class Data<T extends a> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List data;

    public Data(@g(name = "data") List<? extends T> list) {
        this.data = list;
    }

    /* renamed from: a, reason: from getter */
    public final List getData() {
        return this.data;
    }

    public final Data<T> copy(@g(name = "data") List<? extends T> data) {
        return new Data<>(data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Data) && AbstractC6492s.d(this.data, ((Data) other).data);
    }

    public int hashCode() {
        List list = this.data;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "Data(data=" + this.data + ")";
    }
}
