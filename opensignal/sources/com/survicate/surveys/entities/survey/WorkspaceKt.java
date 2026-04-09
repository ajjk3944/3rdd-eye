package com.survicate.surveys.entities.survey;

import br.l;
import cq.f;
import cq.i;
import fq.b;
import fq.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import mq.o;
import mq.p;
import mq.t;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/survicate/surveys/entities/survey/Workspace;", "", "Lcq/i;", "getScreenDelayTriggers", "(Lcom/survicate/surveys/entities/survey/Workspace;)Ljava/util/Set;", "", "Lcq/f;", "getEventDelayTriggers", "(Lcom/survicate/surveys/entities/survey/Workspace;)Ljava/util/List;", "survicate-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WorkspaceKt {
    public static final List<f> getEventDelayTriggers(Workspace workspace) {
        l.e(workspace, "<this>");
        List<Survey> surveys = workspace.getSurveys();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = surveys.iterator();
        while (it.hasNext()) {
            t.d0(arrayList, ((Survey) it.next()).getDisplayFilters());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof b) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            b bVar = (b) it3.next();
            l.e(bVar, "<this>");
            List list = bVar.f9026b;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : list) {
                if (((EventTrigger) obj).getSettings().getDelay() != null) {
                    arrayList4.add(obj);
                }
            }
            ArrayList arrayList5 = new ArrayList(p.a0(arrayList4, 10));
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                EventTrigger eventTrigger = (EventTrigger) it4.next();
                String name = eventTrigger.getName();
                String str = bVar.f9025a;
                Long delay = eventTrigger.getSettings().getDelay();
                l.b(delay);
                arrayList5.add(new f(delay.longValue(), name, str));
            }
            t.d0(arrayList3, arrayList5);
        }
        return arrayList3;
    }

    public static final Set<i> getScreenDelayTriggers(Workspace workspace) {
        l.e(workspace, "<this>");
        List<Survey> surveys = workspace.getSurveys();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = surveys.iterator();
        while (it.hasNext()) {
            t.d0(arrayList, ((Survey) it.next()).getDisplayFilters());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof h) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            h hVar = (h) it3.next();
            l.e(hVar, "<this>");
            List list = hVar.f9041a;
            ArrayList arrayList4 = new ArrayList(p.a0(list, 10));
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList4.add(new i((String) it4.next(), hVar.f9042b));
            }
            t.d0(arrayList3, arrayList4);
        }
        return o.U0(arrayList3);
    }
}
