package com.survicate.surveys.entities.survey;

import br.l;
import c7.a;
import h0.b;
import java.util.List;
import kotlin.Metadata;
import nk.o;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J/\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/survicate/surveys/entities/survey/NetworkTargetingEvent;", "", "name", "", "type", "properties", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getProperties", "()Ljava/util/List;", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class NetworkTargetingEvent {
    public static final String TYPE_MOBILE = "mobile";
    private final String name;
    private final List<String> properties;
    private final String type;

    public NetworkTargetingEvent(@o(name = "name") String str, @o(name = "type") String str2, @o(name = "properties") List<String> list) {
        l.e(str, "name");
        l.e(str2, "type");
        this.name = str;
        this.type = str2;
        this.properties = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkTargetingEvent copy$default(NetworkTargetingEvent networkTargetingEvent, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = networkTargetingEvent.name;
        }
        if ((i10 & 2) != 0) {
            str2 = networkTargetingEvent.type;
        }
        if ((i10 & 4) != 0) {
            list = networkTargetingEvent.properties;
        }
        return networkTargetingEvent.copy(str, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final List<String> component3() {
        return this.properties;
    }

    public final NetworkTargetingEvent copy(@o(name = "name") String name, @o(name = "type") String type, @o(name = "properties") List<String> properties) {
        l.e(name, "name");
        l.e(type, "type");
        return new NetworkTargetingEvent(name, type, properties);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkTargetingEvent)) {
            return false;
        }
        NetworkTargetingEvent networkTargetingEvent = (NetworkTargetingEvent) other;
        return l.a(this.name, networkTargetingEvent.name) && l.a(this.type, networkTargetingEvent.type) && l.a(this.properties, networkTargetingEvent.properties);
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getProperties() {
        return this.properties;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iG = a.g(this.type, this.name.hashCode() * 31, 31);
        List<String> list = this.properties;
        return iG + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkTargetingEvent(name=");
        sb2.append(this.name);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", properties=");
        return b.t(sb2, this.properties, ')');
    }
}
