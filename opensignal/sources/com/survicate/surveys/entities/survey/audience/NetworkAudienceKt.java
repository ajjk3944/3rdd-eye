package com.survicate.surveys.entities.survey.audience;

import br.l;
import cq.o;
import eq.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import mq.p;
import mq.t;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/survicate/surveys/entities/survey/audience/NetworkAudience;", "Lcq/o;", "targetingFiltersFactory", "Leq/b;", "toDomainModel", "(Lcom/survicate/surveys/entities/survey/audience/NetworkAudience;Lcq/o;)Leq/b;", "survicate-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NetworkAudienceKt {
    public static final b toDomainModel(NetworkAudience networkAudience, o oVar) {
        l.e(networkAudience, "<this>");
        l.e(oVar, "targetingFiltersFactory");
        long id2 = networkAudience.getId();
        AudienceRelation relation = networkAudience.getRelation();
        ArrayList arrayList = new ArrayList();
        List<NetworkAudienceFilter> filters = networkAudience.getFilters();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : filters) {
            if (obj instanceof NetworkAudienceLocaleFilter) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(p.a0(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(NetworkAudienceFiltersKt.toDomainModel((NetworkAudienceLocaleFilter) it.next(), oVar.f6655h));
        }
        t.d0(arrayList, arrayList3);
        List<NetworkAudienceFilter> filters2 = networkAudience.getFilters();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : filters2) {
            if (obj2 instanceof NetworkAudienceKnownUserFilter) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList(p.a0(arrayList4, 10));
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            arrayList5.add(NetworkAudienceFiltersKt.toDomainModel((NetworkAudienceKnownUserFilter) it2.next(), oVar.f6651d));
        }
        t.d0(arrayList, arrayList5);
        List<NetworkAudienceFilter> filters3 = networkAudience.getFilters();
        ArrayList arrayList6 = new ArrayList();
        for (Object obj3 : filters3) {
            if (obj3 instanceof NetworkAudiencePlatformFilter) {
                arrayList6.add(obj3);
            }
        }
        ArrayList arrayList7 = new ArrayList(p.a0(arrayList6, 10));
        Iterator it3 = arrayList6.iterator();
        while (it3.hasNext()) {
            arrayList7.add(NetworkAudienceFiltersKt.toDomainModel((NetworkAudiencePlatformFilter) it3.next()));
        }
        t.d0(arrayList, arrayList7);
        List<NetworkAudienceFilter> filters4 = networkAudience.getFilters();
        ArrayList arrayList8 = new ArrayList();
        for (Object obj4 : filters4) {
            if (obj4 instanceof NetworkAudienceUserFilter) {
                arrayList8.add(obj4);
            }
        }
        ArrayList arrayList9 = new ArrayList(p.a0(arrayList8, 10));
        Iterator it4 = arrayList8.iterator();
        while (it4.hasNext()) {
            arrayList9.add(NetworkAudienceFiltersKt.toDomainModel((NetworkAudienceUserFilter) it4.next(), oVar.f6650c, oVar.f6658m));
        }
        t.d0(arrayList, arrayList9);
        List<NetworkAudienceFilter> filters5 = networkAudience.getFilters();
        ArrayList arrayList10 = new ArrayList();
        for (Object obj5 : filters5) {
            if (obj5 instanceof NetworkAudienceScreenOrientationFilter) {
                arrayList10.add(obj5);
            }
        }
        ArrayList arrayList11 = new ArrayList(p.a0(arrayList10, 10));
        Iterator it5 = arrayList10.iterator();
        while (it5.hasNext()) {
            arrayList11.add(NetworkAudienceFiltersKt.toDomainModel((NetworkAudienceScreenOrientationFilter) it5.next(), oVar.f6656i));
        }
        t.d0(arrayList, arrayList11);
        if (networkAudience.getVisitorType() == AudienceVisitorType.IDENTIFIED) {
            l.a(networkAudience.getHasBackendFilters(), Boolean.TRUE);
        }
        return new b(id2, relation, arrayList, networkAudience.getVisitorType());
    }
}
