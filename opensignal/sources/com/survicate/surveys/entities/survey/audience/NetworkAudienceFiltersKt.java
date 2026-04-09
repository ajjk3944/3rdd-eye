package com.survicate.surveys.entities.survey.audience;

import br.l;
import com.survicate.surveys.entities.survey.audience.attributes.NetworkAudienceUserFilterAttribute;
import iq.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import mq.p;
import wn.a;
import zn.b;
import zn.c;
import zn.d;
import zn.e;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0004\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0004\u0010\n\u001a\u0013\u0010\u0004\u001a\u00020\f*\u00020\u000bH\u0000¢\u0006\u0004\b\u0004\u0010\r\u001a#\u0010\u0004\u001a\u00020\u0012*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0004\u0010\u0013\u001a\u001b\u0010\u0004\u001a\u00020\u0017*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0004\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/survicate/surveys/entities/survey/audience/NetworkAudienceLocaleFilter;", "Lwn/a;", "localeProvider", "Lzn/c;", "toDomainModel", "(Lcom/survicate/surveys/entities/survey/audience/NetworkAudienceLocaleFilter;Lwn/a;)Lzn/c;", "Lcom/survicate/surveys/entities/survey/audience/NetworkAudienceKnownUserFilter;", "Lbo/a;", "userTraitsProvider", "Lzn/b;", "(Lcom/survicate/surveys/entities/survey/audience/NetworkAudienceKnownUserFilter;Lbo/a;)Lzn/b;", "Lcom/survicate/surveys/entities/survey/audience/NetworkAudiencePlatformFilter;", "Lzn/d;", "(Lcom/survicate/surveys/entities/survey/audience/NetworkAudiencePlatformFilter;)Lzn/d;", "Lcom/survicate/surveys/entities/survey/audience/NetworkAudienceUserFilter;", "Lgq/c;", "Liq/f;", "timestampProvider", "Leq/d;", "(Lcom/survicate/surveys/entities/survey/audience/NetworkAudienceUserFilter;Lgq/c;Liq/f;)Leq/d;", "Lcom/survicate/surveys/entities/survey/audience/NetworkAudienceScreenOrientationFilter;", "Liq/b;", "screenOrientationProvider", "Lzn/e;", "(Lcom/survicate/surveys/entities/survey/audience/NetworkAudienceScreenOrientationFilter;Liq/b;)Lzn/e;", "survicate-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkAudienceFiltersKt {
    public static final c toDomainModel(NetworkAudienceLocaleFilter networkAudienceLocaleFilter, a aVar) {
        l.e(networkAudienceLocaleFilter, "<this>");
        l.e(aVar, "localeProvider");
        return new c(networkAudienceLocaleFilter.getValues(), networkAudienceLocaleFilter.getExclude(), aVar);
    }

    public static final b toDomainModel(NetworkAudienceKnownUserFilter networkAudienceKnownUserFilter, bo.a aVar) {
        l.e(networkAudienceKnownUserFilter, "<this>");
        l.e(aVar, "userTraitsProvider");
        return new b(networkAudienceKnownUserFilter.getValues(), networkAudienceKnownUserFilter.getExclude(), aVar);
    }

    public static final d toDomainModel(NetworkAudiencePlatformFilter networkAudiencePlatformFilter) {
        l.e(networkAudiencePlatformFilter, "<this>");
        return new d(networkAudiencePlatformFilter.getValues(), networkAudiencePlatformFilter.getExclude());
    }

    public static final eq.d toDomainModel(NetworkAudienceUserFilter networkAudienceUserFilter, gq.c cVar, f fVar) {
        l.e(networkAudienceUserFilter, "<this>");
        l.e(cVar, "userTraitsProvider");
        l.e(fVar, "timestampProvider");
        List<NetworkAudienceUserFilterAttribute> values = networkAudienceUserFilter.getValues();
        ArrayList arrayList = new ArrayList(p.a0(values, 10));
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(((NetworkAudienceUserFilterAttribute) it.next()).toDomainModel(fVar));
        }
        return new eq.d(arrayList, networkAudienceUserFilter.getRelation(), networkAudienceUserFilter.getExclude(), cVar);
    }

    public static final e toDomainModel(NetworkAudienceScreenOrientationFilter networkAudienceScreenOrientationFilter, iq.b bVar) {
        l.e(networkAudienceScreenOrientationFilter, "<this>");
        l.e(bVar, "screenOrientationProvider");
        return new e(networkAudienceScreenOrientationFilter.getValues(), networkAudienceScreenOrientationFilter.getExclude(), bVar);
    }
}
