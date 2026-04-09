package on;

import android.content.SharedPreferences;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.entities.models.ActiveEventHistory;
import com.survicate.surveys.entities.models.ActiveEventHistoryKt;
import com.survicate.surveys.entities.models.RespondentEvent;
import com.survicate.surveys.infrastructure.serialization.SurvicateSerializer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class k implements b0, gq.c, bo.a, gq.b, gq.a, uo.a {

    /* renamed from: a, reason: collision with root package name */
    public final qm.c f19637a;

    /* renamed from: b, reason: collision with root package name */
    public final so.h f19638b;

    /* renamed from: c, reason: collision with root package name */
    public final g1.f f19639c;

    /* renamed from: d, reason: collision with root package name */
    public final no.a f19640d;

    /* renamed from: e, reason: collision with root package name */
    public final no.a f19641e;

    /* renamed from: f, reason: collision with root package name */
    public final no.a f19642f;

    /* renamed from: g, reason: collision with root package name */
    public final no.a f19643g;

    /* renamed from: h, reason: collision with root package name */
    public final bu.c f19644h;

    public k(qm.c cVar, so.e eVar, g1.f fVar, io.sentry.hints.i iVar) {
        so.f fVar2;
        br.l.e(cVar, "store");
        br.l.e(eVar, "synchronizationStore");
        br.l.e(fVar, "sessionStore");
        br.l.e(iVar, "versionProvider");
        du.f fVar3 = wt.d0.f24610a;
        du.e eVar2 = du.e.f7570g;
        br.l.e(eVar2, "ioDispatcher");
        this.f19637a = cVar;
        this.f19638b = eVar;
        this.f19639c = fVar;
        final int i10 = 2;
        final int i11 = 0;
        this.f19640d = new no.a(2, false);
        this.f19641e = new no.a(2, false);
        this.f19642f = new no.a(2, false);
        this.f19643g = new no.a(2, false);
        this.f19644h = wt.w.b(eVar2);
        final int i12 = 1;
        List listI = e5.I(so.d.f22178a, so.d.f22179b, so.d.f22180c);
        SharedPreferences sharedPreferences = (SharedPreferences) cVar.f20918d;
        int i13 = sharedPreferences.getInt("persistenceSchemaVersion", -1);
        Integer numValueOf = i13 != -1 ? Integer.valueOf(i13) : null;
        if (numValueOf == null) {
            sharedPreferences.edit().putInt("persistenceSchemaVersion", 4).apply();
        } else {
            if (numValueOf.intValue() > 4) {
                int i14 = sharedPreferences.getInt("persistenceSchemaVersion", -1);
                String string = sharedPreferences.getString("sdkVersionKey", null);
                sharedPreferences.edit().clear().apply();
                if (i14 != -1) {
                    sharedPreferences.edit().putInt("persistenceSchemaVersion", i14).apply();
                }
                if (string != null) {
                    sharedPreferences.edit().putString("sdkVersionKey", string).apply();
                }
            }
            if (numValueOf.intValue() < 4) {
                for (int iIntValue = numValueOf.intValue() + 1; iIntValue < 5; iIntValue++) {
                    Iterator it = listI.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            fVar2 = (so.f) it.next();
                            if (fVar2.f22184a == iIntValue) {
                                break;
                            }
                        } else {
                            fVar2 = null;
                            break;
                        }
                    }
                    if (fVar2 == null) {
                        throw new IllegalArgumentException(h0.b.h(iIntValue, "Missing migration for schema version: ").toString());
                    }
                    fVar2.a(sharedPreferences);
                }
            }
            if (numValueOf.intValue() != 4) {
                sharedPreferences.edit().putInt("persistenceSchemaVersion", 4).apply();
            }
        }
        qm.c cVar2 = this.f19637a;
        cVar2.getClass();
        String str = "";
        try {
            String string2 = ((SharedPreferences) cVar2.f20918d).getString("sdkVersionKey", "");
            br.l.b(string2);
            str = string2;
        } catch (Exception unused) {
            ((sm.f) ((no.b) cVar2.f20920r)).getClass();
        }
        if (!"6.4.3".equals(str)) {
            ((so.e) this.f19638b).f22181a.edit().remove("surveySeenEventsToSend").remove("answersToSend").apply();
            qm.c cVar3 = this.f19637a;
            cVar3.getClass();
            ((SharedPreferences) cVar3.f20918d).edit().putString("sdkVersionKey", "6.4.3").apply();
        }
        wt.w.s(this.f19644h, null, null, new j(new Callable(this) { // from class: on.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f19627b;

            {
                this.f19627b = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                switch (i11) {
                    case 0:
                        k kVar = this.f19627b;
                        br.l.e(kVar, "this$0");
                        return kVar.f19637a.G();
                    case 1:
                        k kVar2 = this.f19627b;
                        br.l.e(kVar2, "this$0");
                        return ((so.e) kVar2.f19638b).b();
                    default:
                        k kVar3 = this.f19627b;
                        br.l.e(kVar3, "this$0");
                        return ((so.e) kVar3.f19638b).a();
                }
            }
        }, this, this.f19641e, (pq.c) null), 3);
        wt.w.s(this.f19644h, null, null, new j(new Callable(this) { // from class: on.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f19627b;

            {
                this.f19627b = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                switch (i12) {
                    case 0:
                        k kVar = this.f19627b;
                        br.l.e(kVar, "this$0");
                        return kVar.f19637a.G();
                    case 1:
                        k kVar2 = this.f19627b;
                        br.l.e(kVar2, "this$0");
                        return ((so.e) kVar2.f19638b).b();
                    default:
                        k kVar3 = this.f19627b;
                        br.l.e(kVar3, "this$0");
                        return ((so.e) kVar3.f19638b).a();
                }
            }
        }, this, this.f19642f, (pq.c) null), 3);
        wt.w.s(this.f19644h, null, null, new j(new Callable(this) { // from class: on.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f19627b;

            {
                this.f19627b = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                switch (i10) {
                    case 0:
                        k kVar = this.f19627b;
                        br.l.e(kVar, "this$0");
                        return kVar.f19637a.G();
                    case 1:
                        k kVar2 = this.f19627b;
                        br.l.e(kVar2, "this$0");
                        return ((so.e) kVar2.f19638b).b();
                    default:
                        k kVar3 = this.f19627b;
                        br.l.e(kVar3, "this$0");
                        return ((so.e) kVar3.f19638b).a();
                }
            }
        }, this, this.f19643g, (pq.c) null), 3);
    }

    public final List a() {
        return this.f19637a.G();
    }

    public final void b(RespondentEvent.SurveySeen surveySeen) {
        br.l.e(surveySeen, "seenEvent");
        so.e eVar = (so.e) this.f19638b;
        eVar.f22181a.edit().putString("surveySeenEventsToSend", eVar.f22182b.serializeSurveySeenEvents(mq.o.B0(eVar.b(), surveySeen))).apply();
        this.f19642f.g(eVar.b());
    }

    public final void c(cq.a aVar) {
        qm.c cVar = this.f19637a;
        ArrayList arrayListR0 = mq.o.R0(cVar.D());
        Iterator it = arrayListR0.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (br.l.a(((ActiveEventHistory) it.next()).getEventName(), aVar.f6606a)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 != -1) {
            arrayListR0.set(i10, ActiveEventHistoryKt.updatedWithNewOccurrence((ActiveEventHistory) arrayListR0.get(i10), aVar.f6608c));
        } else {
            arrayListR0.add(ActiveEventHistory.INSTANCE.fromActiveEvent(aVar));
        }
        cVar.getClass();
        ((SharedPreferences) cVar.f20918d).edit().putString("eventsHistoryKey", ((SurvicateSerializer) cVar.f20919g).serializeEventsHistory(arrayListR0)).apply();
    }

    public final void d(long j, String str) {
        br.l.e(str, "surveyId");
        qm.c cVar = this.f19637a;
        HashSet hashSet = new HashSet(cVar.F());
        if (!hashSet.contains(str)) {
            hashSet.add(str);
            cVar.getClass();
            ((SharedPreferences) cVar.f20918d).edit().putStringSet("seenSurveyIds", hashSet).apply();
        }
        HashMap map = new HashMap(cVar.E("firstPresentationTimesKey"));
        if (!map.containsKey(str)) {
            map.put(str, Long.valueOf(j));
            cVar.getClass();
            ((SharedPreferences) cVar.f20918d).edit().putString("firstPresentationTimesKey", ((SurvicateSerializer) cVar.f20919g).serializePresentationTimesMap(map)).apply();
        }
        HashMap map2 = new HashMap(cVar.E("lastPresentationTimesKey"));
        map2.put(str, Long.valueOf(j));
        cVar.getClass();
        ((SharedPreferences) cVar.f20918d).edit().putString("lastPresentationTimesKey", ((SurvicateSerializer) cVar.f20919g).serializePresentationTimesMap(map2)).apply();
    }

    public final void e(ArrayList arrayList) {
        qm.c cVar = this.f19637a;
        List listG = cVar.G();
        br.l.e(listG, "<this>");
        int iP = mq.b0.P(mq.p.a0(listG, 10));
        if (iP < 16) {
            iP = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
        for (Object obj : listG) {
            linkedHashMap.put(((hq.c) obj).key, obj);
        }
        int iP2 = mq.b0.P(mq.p.a0(arrayList, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iP2 >= 16 ? iP2 : 16);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap2.put(((hq.c) next).key, next);
        }
        List<? extends hq.c> listQ0 = mq.o.Q0(mq.b0.S(linkedHashMap, linkedHashMap2).values());
        cVar.getClass();
        ((SharedPreferences) cVar.f20918d).edit().putString("userTraits", ((SurvicateSerializer) cVar.f20919g).serializeTraits(listQ0)).apply();
        this.f19641e.g(listQ0);
    }
}
