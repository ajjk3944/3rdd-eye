package dq;

import bf.n;
import br.l;
import com.survicate.surveys.entities.survey.audience.attributes.AudienceUserFilterBooleanAttributeOperator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final String f7436a;

    /* renamed from: b, reason: collision with root package name */
    public final AudienceUserFilterBooleanAttributeOperator f7437b;

    public c(String str, AudienceUserFilterBooleanAttributeOperator audienceUserFilterBooleanAttributeOperator) {
        l.e(str, "name");
        l.e(audienceUserFilterBooleanAttributeOperator, "operator");
        this.f7436a = str;
        this.f7437b = audienceUserFilterBooleanAttributeOperator;
    }

    @Override // dq.a
    public final boolean a(List list) {
        Boolean bool;
        Object next;
        l.e(list, "userTraits");
        Iterator it = list.iterator();
        while (true) {
            bool = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (l.a(((hq.c) next).key, this.f7436a)) {
                break;
            }
        }
        hq.c cVar = (hq.c) next;
        if (cVar == null) {
            return false;
        }
        String str = cVar.value;
        l.e(str, "<this>");
        if (str.equals("true")) {
            bool = Boolean.TRUE;
        } else if (str.equals("false")) {
            bool = Boolean.FALSE;
        }
        int i10 = b.f7435a[this.f7437b.ordinal()];
        if (i10 == 1) {
            return l.a(bool, Boolean.TRUE);
        }
        if (i10 == 2) {
            return l.a(bool, Boolean.FALSE);
        }
        if (i10 == 3) {
            return true;
        }
        throw new n();
    }
}
