package y2;

import android.os.LocaleList;
import android.util.Log;
import java.util.ArrayList;
import java.util.Locale;
import z2.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public LocaleList f37315a;

    /* renamed from: b, reason: collision with root package name */
    public c f37316b;

    /* renamed from: c, reason: collision with root package name */
    public final k f37317c = new k();

    @Override // y2.d
    public final c b() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.f37317c) {
            c cVar = this.f37316b;
            if (cVar != null && localeList == this.f37315a) {
                return cVar;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.add(new b(localeList.get(i4)));
            }
            c cVar2 = new c(arrayList);
            this.f37315a = localeList;
            this.f37316b = cVar2;
            return cVar2;
        }
    }

    @Override // y2.d
    public final Locale h(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (nk.k.a(localeForLanguageTag.toLanguageTag(), "und")) {
            Log.e("Locale", "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }
}
