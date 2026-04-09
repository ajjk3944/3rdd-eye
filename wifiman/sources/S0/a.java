package S0;

import T0.q;
import T0.r;
import android.os.LocaleList;
import android.util.Log;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    private LocaleList f20210a;

    /* renamed from: b, reason: collision with root package name */
    private e f20211b;

    /* renamed from: c, reason: collision with root package name */
    private final r f20212c = q.a();

    @Override // S0.f
    public e b() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.f20212c) {
            e eVar = this.f20211b;
            if (eVar != null && localeList == this.f20210a) {
                return eVar;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(new d(localeList.get(i10)));
            }
            e eVar2 = new e(arrayList);
            this.f20210a = localeList;
            this.f20211b = eVar2;
            return eVar2;
        }
    }

    @Override // S0.f
    public Locale c(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (AbstractC6492s.d(localeForLanguageTag.toLanguageTag(), "und")) {
            Log.e(b.f20213a, "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }
}
