package com.survicate.surveys.infrastructure.network;

import br.g;
import br.l;
import com.survicate.surveys.entities.survey.NetworkTargetingEvent;
import gu.a;
import iu.e;
import java.util.List;
import ju.b;
import kotlin.Metadata;
import ku.c;
import ku.c1;
import ku.p0;
import ku.y0;
import mu.y;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002#\"B'\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\tBE\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0017\u0012\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001c\u0010\u0019R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001e\u0012\u0004\b!\u0010\u001b\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/EventSuggestionRequestBody;", "", "", "type", "name", "", "properties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lku/y0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lku/y0;)V", "self", "Lju/b;", "output", "Liu/e;", "serialDesc", "Llq/b0;", "write$Self", "(Lcom/survicate/surveys/infrastructure/network/EventSuggestionRequestBody;Lju/b;Liu/e;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getType$annotations", "()V", "getName", "getName$annotations", "Ljava/util/List;", "getProperties", "()Ljava/util/List;", "getProperties$annotations", "Companion", "$serializer", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EventSuggestionRequestBody {
    private final String name;
    private final List<String> properties;
    private final String type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final a[] $childSerializers = {null, null, new c(c1.f14534a)};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/survicate/surveys/infrastructure/network/EventSuggestionRequestBody$Companion;", "", "<init>", "()V", "Lgu/a;", "Lcom/survicate/surveys/infrastructure/network/EventSuggestionRequestBody;", "serializer", "()Lgu/a;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final a serializer() {
            return EventSuggestionRequestBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @lq.c
    public /* synthetic */ EventSuggestionRequestBody(int i10, String str, String str2, List list, y0 y0Var) {
        if (7 != (i10 & 7)) {
            p0.f(i10, 7, EventSuggestionRequestBody$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = str;
        this.name = str2;
        this.properties = list;
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getProperties$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static final /* synthetic */ void write$Self(EventSuggestionRequestBody self, b output, e serialDesc) {
        a[] aVarArr = $childSerializers;
        y yVar = (y) output;
        yVar.x(serialDesc, 0, self.type);
        yVar.x(serialDesc, 1, self.name);
        yVar.w(serialDesc, 2, aVarArr[2], self.properties);
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

    private EventSuggestionRequestBody(String str, String str2, List<String> list) {
        this.type = str;
        this.name = str2;
        this.properties = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventSuggestionRequestBody(String str, List<String> list) {
        this(NetworkTargetingEvent.TYPE_MOBILE, str, list);
        l.e(str, "name");
        l.e(list, "properties");
    }
}
