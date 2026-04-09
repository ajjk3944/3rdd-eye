package com.survicate.surveys.infrastructure.serialization;

import br.l;
import com.survicate.surveys.entities.survey.audience.attributes.AudienceUserFilterAttributeType;
import com.survicate.surveys.entities.survey.audience.attributes.NetworkAudienceUserFilterAttribute;
import java.util.Map;
import kotlin.Metadata;
import nk.c0;
import nk.n;
import nk.q0;
import nk.r;
import nk.w;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0001\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/survicate/surveys/infrastructure/serialization/NetworkAudienceUserFilterAttributeJsonAdapter;", "Lnk/r;", "Lcom/survicate/surveys/entities/survey/audience/attributes/NetworkAudienceUserFilterAttribute;", "Lcom/survicate/surveys/entities/survey/audience/attributes/NetworkAudienceUserFilterStringAttribute;", "stringAdapter", "Lcom/survicate/surveys/entities/survey/audience/attributes/NetworkAudienceUserFilterNumberAttribute;", "numberAdapter", "Lcom/survicate/surveys/entities/survey/audience/attributes/NetworkAudienceUserFilterBooleanAttribute;", "booleanAdapter", "Lcom/survicate/surveys/entities/survey/audience/attributes/NetworkAudienceUserFilterDateTimeAttribute;", "datetimeAdapter", "Lcom/survicate/surveys/entities/survey/audience/attributes/NetworkAudienceUserFilterTimeIntervalAttribute;", "timeIntervalAdapter", "<init>", "(Lnk/r;Lnk/r;Lnk/r;Lnk/r;Lnk/r;)V", "Lnk/w;", "reader", "fromJson", "(Lnk/w;)Lcom/survicate/surveys/entities/survey/audience/attributes/NetworkAudienceUserFilterAttribute;", "Lnk/c0;", "writer", "value", "Llq/b0;", "toJson", "(Lnk/c0;Lcom/survicate/surveys/entities/survey/audience/attributes/NetworkAudienceUserFilterAttribute;)V", "Lnk/r;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkAudienceUserFilterAttributeJsonAdapter extends r {
    private final r booleanAdapter;
    private final r datetimeAdapter;
    private final r numberAdapter;
    private final r stringAdapter;
    private final r timeIntervalAdapter;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudienceUserFilterAttributeType.values().length];
            try {
                iArr[AudienceUserFilterAttributeType.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudienceUserFilterAttributeType.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudienceUserFilterAttributeType.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AudienceUserFilterAttributeType.DATETIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AudienceUserFilterAttributeType.TIME_INTERVAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NetworkAudienceUserFilterAttributeJsonAdapter(r rVar, r rVar2, r rVar3, r rVar4, r rVar5) {
        l.e(rVar, "stringAdapter");
        l.e(rVar2, "numberAdapter");
        l.e(rVar3, "booleanAdapter");
        l.e(rVar4, "datetimeAdapter");
        l.e(rVar5, "timeIntervalAdapter");
        this.stringAdapter = rVar;
        this.numberAdapter = rVar2;
        this.booleanAdapter = rVar3;
        this.datetimeAdapter = rVar4;
        this.timeIntervalAdapter = rVar5;
    }

    @Override // nk.r
    @n
    public NetworkAudienceUserFilterAttribute fromJson(w reader) {
        l.e(reader, "reader");
        Object objO0 = reader.o0();
        l.c(objO0, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        Map map = (Map) objO0;
        Object obj = map.get("attribute_type");
        l.c(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        AudienceUserFilterAttributeType audienceUserFilterAttributeTypeFromString = AudienceUserFilterAttributeType.INSTANCE.fromString(str);
        int i10 = audienceUserFilterAttributeTypeFromString == null ? -1 : WhenMappings.$EnumSwitchMapping$0[audienceUserFilterAttributeTypeFromString.ordinal()];
        if (i10 == -1) {
            throw new bf.n("Unknown filter attribute type: ".concat(str));
        }
        if (i10 == 1) {
            return (NetworkAudienceUserFilterAttribute) this.stringAdapter.fromJsonValue(map);
        }
        if (i10 == 2) {
            return (NetworkAudienceUserFilterAttribute) this.numberAdapter.fromJsonValue(map);
        }
        if (i10 == 3) {
            return (NetworkAudienceUserFilterAttribute) this.booleanAdapter.fromJsonValue(map);
        }
        if (i10 == 4) {
            return (NetworkAudienceUserFilterAttribute) this.datetimeAdapter.fromJsonValue(map);
        }
        if (i10 == 5) {
            return (NetworkAudienceUserFilterAttribute) this.timeIntervalAdapter.fromJsonValue(map);
        }
        throw new bf.n();
    }

    @Override // nk.r
    @q0
    public void toJson(c0 writer, NetworkAudienceUserFilterAttribute value) {
        l.e(writer, "writer");
        throw new UnsupportedOperationException();
    }
}
