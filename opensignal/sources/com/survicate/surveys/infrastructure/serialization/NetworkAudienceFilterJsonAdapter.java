package com.survicate.surveys.infrastructure.serialization;

import br.l;
import com.survicate.surveys.entities.survey.audience.AudienceFilterType;
import com.survicate.surveys.entities.survey.audience.NetworkAudienceFilter;
import java.util.Map;
import kotlin.Metadata;
import nk.c0;
import nk.n;
import nk.q0;
import nk.r;
import nk.w;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0001\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/survicate/surveys/infrastructure/serialization/NetworkAudienceFilterJsonAdapter;", "Lnk/r;", "Lcom/survicate/surveys/entities/survey/audience/NetworkAudienceFilter;", "Lcom/survicate/surveys/entities/survey/audience/NetworkAudienceLocaleFilter;", "localeAdapter", "Lcom/survicate/surveys/entities/survey/audience/NetworkAudiencePlatformFilter;", "platformAdapter", "Lcom/survicate/surveys/entities/survey/audience/NetworkAudienceKnownUserFilter;", "knownUserAdapter", "Lcom/survicate/surveys/entities/survey/audience/NetworkAudienceUserFilter;", "userAdapter", "Lcom/survicate/surveys/entities/survey/audience/NetworkAudienceScreenOrientationFilter;", "screenOrientationAdapter", "<init>", "(Lnk/r;Lnk/r;Lnk/r;Lnk/r;Lnk/r;)V", "Lnk/w;", "reader", "fromJson", "(Lnk/w;)Lcom/survicate/surveys/entities/survey/audience/NetworkAudienceFilter;", "Lnk/c0;", "writer", "value", "Llq/b0;", "toJson", "(Lnk/c0;Lcom/survicate/surveys/entities/survey/audience/NetworkAudienceFilter;)V", "Lnk/r;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkAudienceFilterJsonAdapter extends r {
    private final r knownUserAdapter;
    private final r localeAdapter;
    private final r platformAdapter;
    private final r screenOrientationAdapter;
    private final r userAdapter;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudienceFilterType.values().length];
            try {
                iArr[AudienceFilterType.LOCALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudienceFilterType.PLATFORM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudienceFilterType.KNOWN_USER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AudienceFilterType.USER_ATTRIBUTES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AudienceFilterType.SCREEN_ORIENTATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NetworkAudienceFilterJsonAdapter(r rVar, r rVar2, r rVar3, r rVar4, r rVar5) {
        l.e(rVar, "localeAdapter");
        l.e(rVar2, "platformAdapter");
        l.e(rVar3, "knownUserAdapter");
        l.e(rVar4, "userAdapter");
        l.e(rVar5, "screenOrientationAdapter");
        this.localeAdapter = rVar;
        this.platformAdapter = rVar2;
        this.knownUserAdapter = rVar3;
        this.userAdapter = rVar4;
        this.screenOrientationAdapter = rVar5;
    }

    @Override // nk.r
    @n
    public NetworkAudienceFilter fromJson(w reader) {
        l.e(reader, "reader");
        Object objO0 = reader.o0();
        l.c(objO0, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        Map map = (Map) objO0;
        Object obj = map.get("type");
        l.c(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        AudienceFilterType audienceFilterTypeFromString = AudienceFilterType.INSTANCE.fromString(str);
        int i10 = audienceFilterTypeFromString == null ? -1 : WhenMappings.$EnumSwitchMapping$0[audienceFilterTypeFromString.ordinal()];
        if (i10 == -1) {
            throw new bf.n("Unknown audience filter type: ".concat(str));
        }
        if (i10 == 1) {
            return (NetworkAudienceFilter) this.localeAdapter.fromJsonValue(map);
        }
        if (i10 == 2) {
            return (NetworkAudienceFilter) this.platformAdapter.fromJsonValue(map);
        }
        if (i10 == 3) {
            return (NetworkAudienceFilter) this.knownUserAdapter.fromJsonValue(map);
        }
        if (i10 == 4) {
            return (NetworkAudienceFilter) this.userAdapter.fromJsonValue(map);
        }
        if (i10 == 5) {
            return (NetworkAudienceFilter) this.screenOrientationAdapter.fromJsonValue(map);
        }
        throw new bf.n();
    }

    @Override // nk.r
    @q0
    public void toJson(c0 writer, NetworkAudienceFilter value) {
        l.e(writer, "writer");
        throw new UnsupportedOperationException();
    }
}
