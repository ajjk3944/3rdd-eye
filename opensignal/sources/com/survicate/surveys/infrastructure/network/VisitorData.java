package com.survicate.surveys.infrastructure.network;

import br.g;
import br.l;
import gu.a;
import iu.e;
import java.util.Map;
import ju.b;
import kotlin.Metadata;
import ku.c1;
import ku.g0;
import ku.p0;
import ku.y0;
import lq.c;
import mu.y;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B?\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J0\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u0016R,\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u0018¨\u0006+"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/VisitorData;", "", "", "visitorUuid", "", "userAttributes", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "", "seen1", "Lku/y0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;Lku/y0;)V", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/infrastructure/network/VisitorData;Lju/b;Liu/e;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/survicate/surveys/infrastructure/network/VisitorData;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVisitorUuid", "getVisitorUuid$annotations", "()V", "Ljava/util/Map;", "getUserAttributes", "getUserAttributes$annotations", "Companion", "$serializer", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class VisitorData {
    private final Map<String, String> userAttributes;
    private final String visitorUuid;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final a[] $childSerializers = {null, new g0(c1.f14534a)};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/VisitorData$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/infrastructure/network/VisitorData;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final a serializer() {
            return VisitorData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @c
    public /* synthetic */ VisitorData(int i10, String str, Map map, y0 y0Var) {
        if (3 != (i10 & 3)) {
            p0.f(i10, 3, VisitorData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.visitorUuid = str;
        this.userAttributes = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VisitorData copy$default(VisitorData visitorData, String str, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = visitorData.visitorUuid;
        }
        if ((i10 & 2) != 0) {
            map = visitorData.userAttributes;
        }
        return visitorData.copy(str, map);
    }

    public static /* synthetic */ void getUserAttributes$annotations() {
    }

    public static /* synthetic */ void getVisitorUuid$annotations() {
    }

    public static final /* synthetic */ void write$Self(VisitorData self, b output, e serialDesc) {
        a[] aVarArr = $childSerializers;
        y yVar = (y) output;
        yVar.x(serialDesc, 0, self.visitorUuid);
        yVar.w(serialDesc, 1, aVarArr[1], self.userAttributes);
    }

    /* renamed from: component1, reason: from getter */
    public final String getVisitorUuid() {
        return this.visitorUuid;
    }

    public final Map<String, String> component2() {
        return this.userAttributes;
    }

    public final VisitorData copy(String visitorUuid, Map<String, String> userAttributes) {
        l.e(visitorUuid, "visitorUuid");
        l.e(userAttributes, "userAttributes");
        return new VisitorData(visitorUuid, userAttributes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VisitorData)) {
            return false;
        }
        VisitorData visitorData = (VisitorData) other;
        return l.a(this.visitorUuid, visitorData.visitorUuid) && l.a(this.userAttributes, visitorData.userAttributes);
    }

    public final Map<String, String> getUserAttributes() {
        return this.userAttributes;
    }

    public final String getVisitorUuid() {
        return this.visitorUuid;
    }

    public int hashCode() {
        return this.userAttributes.hashCode() + (this.visitorUuid.hashCode() * 31);
    }

    public String toString() {
        return "VisitorData(visitorUuid=" + this.visitorUuid + ", userAttributes=" + this.userAttributes + ')';
    }

    public VisitorData(String str, Map<String, String> map) {
        l.e(str, "visitorUuid");
        l.e(map, "userAttributes");
        this.visitorUuid = str;
        this.userAttributes = map;
    }
}
