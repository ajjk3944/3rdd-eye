package dq;

import bf.n;
import br.l;
import com.survicate.surveys.entities.survey.audience.attributes.AudienceUserFilterDateTimeAttributeOperator;
import com.survicate.surveys.entities.survey.audience.attributes.AudienceUserFilterNumberAttributeOperator;
import com.survicate.surveys.entities.survey.audience.attributes.AudienceUserFilterStringAttributeOperator;
import com.survicate.surveys.entities.survey.audience.attributes.AudienceUserFilterTimeIntervalAttributeOperator;
import g4.j;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;
import mq.o;
import tt.r;

/* loaded from: classes.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7439a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final String f7440b;

    /* renamed from: c, reason: collision with root package name */
    public final List f7441c;

    /* renamed from: d, reason: collision with root package name */
    public final Enum f7442d;

    public e(String str, AudienceUserFilterTimeIntervalAttributeOperator audienceUserFilterTimeIntervalAttributeOperator, List list, iq.f fVar) {
        l.e(str, "name");
        l.e(audienceUserFilterTimeIntervalAttributeOperator, "operator");
        l.e(list, "values");
        this.f7440b = str;
        this.f7442d = audienceUserFilterTimeIntervalAttributeOperator;
        this.f7441c = list;
    }

    @Override // dq.a
    public final boolean a(List list) throws ParseException {
        Object next;
        String strN;
        int i10 = this.f7439a;
        List list2 = this.f7441c;
        String str = this.f7440b;
        Enum r72 = this.f7442d;
        switch (i10) {
            case 0:
                AudienceUserFilterDateTimeAttributeOperator audienceUserFilterDateTimeAttributeOperator = (AudienceUserFilterDateTimeAttributeOperator) r72;
                l.e(list, "userTraits");
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (l.a(((hq.c) next).key, str)) {
                        }
                    } else {
                        next = null;
                    }
                }
                hq.c cVar = (hq.c) next;
                if (cVar != null) {
                    String strN2 = a.a.n(cVar.value);
                    if (strN2 != null) {
                        String str2 = (String) o.u0(0, list2);
                        if (str2 != null && (strN = a.a.n(str2)) != null) {
                            String str3 = (String) o.u0(1, list2);
                            objN = str3 != null ? a.a.n(str3) : null;
                            switch (d.f7438a[audienceUserFilterDateTimeAttributeOperator.ordinal()]) {
                                case 1:
                                    if (strN2.compareTo(strN) < 0) {
                                        return true;
                                    }
                                    break;
                                case 2:
                                    if (strN2.compareTo(strN) > 0) {
                                        return true;
                                    }
                                    break;
                                case 3:
                                    return strN2.equals(strN);
                                case 4:
                                    if (objN != null && strN2.compareTo(strN) >= 0 && strN2.compareTo((String) objN) <= 0) {
                                        return true;
                                    }
                                    break;
                                case j.STRING_FIELD_NUMBER /* 5 */:
                                    if (objN != null && (strN2.compareTo(strN) < 0 || strN2.compareTo((String) objN) > 0)) {
                                        return true;
                                    }
                                    break;
                                case j.STRING_SET_FIELD_NUMBER /* 6 */:
                                    return true;
                                default:
                                    throw new n();
                            }
                        } else if (audienceUserFilterDateTimeAttributeOperator == AudienceUserFilterDateTimeAttributeOperator.ANY) {
                            return true;
                        }
                    } else if (audienceUserFilterDateTimeAttributeOperator == AudienceUserFilterDateTimeAttributeOperator.ANY) {
                        return true;
                    }
                }
                return false;
            case 1:
                AudienceUserFilterNumberAttributeOperator audienceUserFilterNumberAttributeOperator = (AudienceUserFilterNumberAttributeOperator) r72;
                l.e(list, "userTraits");
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (l.a(((hq.c) next2).key, str)) {
                            objN = next2;
                        }
                    }
                }
                hq.c cVar2 = (hq.c) objN;
                if (cVar2 != null) {
                    Double dD0 = r.d0(cVar2.value);
                    if (dD0 != null) {
                        double dDoubleValue = dD0.doubleValue();
                        Double d6 = (Double) o.u0(0, list2);
                        if (d6 != null) {
                            double dDoubleValue2 = d6.doubleValue();
                            Double d10 = (Double) o.u0(1, list2);
                            switch (f.f7443a[audienceUserFilterNumberAttributeOperator.ordinal()]) {
                                case 1:
                                    if (list2 == null || !list2.isEmpty()) {
                                        Iterator it3 = list2.iterator();
                                        while (it3.hasNext()) {
                                            if (dDoubleValue == ((Number) it3.next()).doubleValue()) {
                                                return true;
                                            }
                                        }
                                        break;
                                    }
                                    break;
                                case 2:
                                    if (list2 != null && list2.isEmpty()) {
                                        return true;
                                    }
                                    Iterator it4 = list2.iterator();
                                    while (it4.hasNext()) {
                                        if (dDoubleValue == ((Number) it4.next()).doubleValue()) {
                                            break;
                                        }
                                    }
                                    return true;
                                case 3:
                                    if (dDoubleValue > dDoubleValue2) {
                                        return true;
                                    }
                                    break;
                                case 4:
                                    if (dDoubleValue >= dDoubleValue2) {
                                        return true;
                                    }
                                    break;
                                case j.STRING_FIELD_NUMBER /* 5 */:
                                    if (dDoubleValue < dDoubleValue2) {
                                        return true;
                                    }
                                    break;
                                case j.STRING_SET_FIELD_NUMBER /* 6 */:
                                    if (dDoubleValue <= dDoubleValue2) {
                                        return true;
                                    }
                                    break;
                                case j.DOUBLE_FIELD_NUMBER /* 7 */:
                                    if (d10 != null && dDoubleValue2 <= dDoubleValue && dDoubleValue <= d10.doubleValue()) {
                                        return true;
                                    }
                                    break;
                                case j.BYTES_FIELD_NUMBER /* 8 */:
                                    if (d10 != null && (dDoubleValue2 > dDoubleValue || dDoubleValue > d10.doubleValue())) {
                                        return true;
                                    }
                                    break;
                                case 9:
                                    return true;
                                default:
                                    throw new n();
                            }
                        } else if (audienceUserFilterNumberAttributeOperator == AudienceUserFilterNumberAttributeOperator.ANY) {
                            return true;
                        }
                    } else if (audienceUserFilterNumberAttributeOperator == AudienceUserFilterNumberAttributeOperator.ANY) {
                        return true;
                    }
                }
                return false;
            case 2:
                l.e(list, "userTraits");
                Iterator it5 = list.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        Object next3 = it5.next();
                        if (l.a(((hq.c) next3).key, str)) {
                            objN = next3;
                        }
                    }
                }
                hq.c cVar3 = (hq.c) objN;
                if (cVar3 == null) {
                    AudienceUserFilterStringAttributeOperator audienceUserFilterStringAttributeOperator = AudienceUserFilterStringAttributeOperator.IS_EQUAL;
                } else {
                    String str4 = cVar3.value;
                    switch (g.f7444a[((AudienceUserFilterStringAttributeOperator) r72).ordinal()]) {
                        case 1:
                            if (list2 == null || !list2.isEmpty()) {
                                Iterator it6 = list2.iterator();
                                while (it6.hasNext()) {
                                    if (l.a(str4, (String) it6.next())) {
                                        return true;
                                    }
                                }
                                break;
                            }
                            break;
                        case 2:
                            if (list2 != null && list2.isEmpty()) {
                                return true;
                            }
                            Iterator it7 = list2.iterator();
                            while (it7.hasNext()) {
                                if (l.a(str4, (String) it7.next())) {
                                    break;
                                }
                            }
                            return true;
                        case 3:
                            if (list2 == null || !list2.isEmpty()) {
                                Iterator it8 = list2.iterator();
                                while (it8.hasNext()) {
                                    if (tt.l.q0(str4, (String) it8.next(), false)) {
                                        return true;
                                    }
                                }
                                break;
                            }
                            break;
                        case 4:
                            if (list2 != null && list2.isEmpty()) {
                                return true;
                            }
                            Iterator it9 = list2.iterator();
                            while (it9.hasNext()) {
                                if (tt.l.q0(str4, (String) it9.next(), false)) {
                                    break;
                                }
                            }
                            return true;
                        case j.STRING_FIELD_NUMBER /* 5 */:
                        case j.STRING_SET_FIELD_NUMBER /* 6 */:
                            break;
                        case j.DOUBLE_FIELD_NUMBER /* 7 */:
                            return true;
                        default:
                            throw new n();
                    }
                }
                return false;
            default:
                AudienceUserFilterTimeIntervalAttributeOperator audienceUserFilterTimeIntervalAttributeOperator = (AudienceUserFilterTimeIntervalAttributeOperator) r72;
                l.e(list, "userTraits");
                Iterator it10 = list.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        Object next4 = it10.next();
                        if (l.a(((hq.c) next4).key, str)) {
                            objN = next4;
                        }
                    }
                }
                hq.c cVar4 = (hq.c) objN;
                if (cVar4 != null) {
                    Long lP = xu.l.p(cVar4.value);
                    if (lP != null) {
                        long jLongValue = lP.longValue();
                        Long l10 = (Long) o.t0(list2);
                        if (l10 != null) {
                            long jLongValue2 = l10.longValue();
                            int i11 = h.f7445a[audienceUserFilterTimeIntervalAttributeOperator.ordinal()];
                            if (i11 != 1) {
                                if (i11 != 2) {
                                    if (i11 == 3) {
                                        return true;
                                    }
                                    throw new n();
                                }
                                if (System.currentTimeMillis() < jLongValue + jLongValue2) {
                                    return true;
                                }
                            } else if (System.currentTimeMillis() > jLongValue + jLongValue2) {
                                return true;
                            }
                        } else if (audienceUserFilterTimeIntervalAttributeOperator == AudienceUserFilterTimeIntervalAttributeOperator.ANY) {
                            return true;
                        }
                    } else if (audienceUserFilterTimeIntervalAttributeOperator == AudienceUserFilterTimeIntervalAttributeOperator.ANY) {
                        return true;
                    }
                }
                return false;
        }
    }

    public e(String str, AudienceUserFilterDateTimeAttributeOperator audienceUserFilterDateTimeAttributeOperator, List list) {
        l.e(str, "name");
        l.e(audienceUserFilterDateTimeAttributeOperator, "operator");
        l.e(list, "values");
        this.f7440b = str;
        this.f7442d = audienceUserFilterDateTimeAttributeOperator;
        this.f7441c = list;
    }

    public e(String str, AudienceUserFilterStringAttributeOperator audienceUserFilterStringAttributeOperator, List list) {
        l.e(str, "name");
        l.e(audienceUserFilterStringAttributeOperator, "operator");
        l.e(list, "values");
        this.f7440b = str;
        this.f7442d = audienceUserFilterStringAttributeOperator;
        this.f7441c = list;
    }

    public e(String str, AudienceUserFilterNumberAttributeOperator audienceUserFilterNumberAttributeOperator, List list) {
        l.e(str, "name");
        l.e(audienceUserFilterNumberAttributeOperator, "operator");
        l.e(list, "values");
        this.f7440b = str;
        this.f7442d = audienceUserFilterNumberAttributeOperator;
        this.f7441c = list;
    }
}
