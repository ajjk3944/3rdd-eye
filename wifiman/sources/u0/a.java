package U0;

import T0.g;
import Zg.AbstractC3689v;
import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f22115a = new a();

    private a() {
    }

    public final Object a(S0.e eVar) {
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(eVar, 10));
        Iterator<E> it = eVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((S0.d) it.next()).a());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(g gVar, S0.e eVar) {
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(eVar, 10));
        Iterator<E> it = eVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((S0.d) it.next()).a());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        gVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
