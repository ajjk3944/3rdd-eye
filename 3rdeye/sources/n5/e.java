package N5;

import G5.l;
import I5.i;
import K5.a;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class e extends a {
    @Override // N5.b, android.os.AsyncTask
    /* renamed from: a */
    public final void onPostExecute(String str) {
        I5.c cVar = I5.c.f2496c;
        if (cVar != null) {
            for (l lVar : Collections.unmodifiableCollection(cVar.f2497a)) {
                if (this.f4669c.contains(lVar.f1930h)) {
                    K5.a aVar = lVar.f1927e;
                    if (this.f4671e >= aVar.f3153e) {
                        a.EnumC0055a enumC0055a = aVar.f3152d;
                        a.EnumC0055a enumC0055a2 = a.EnumC0055a.AD_STATE_NOTVISIBLE;
                        if (enumC0055a != enumC0055a2) {
                            aVar.f3152d = enumC0055a2;
                            i.f2509a.a(aVar.f(), "setNativeViewHierarchy", str, aVar.f3149a);
                        }
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    public final String doInBackground(Object[] objArr) {
        return this.f4670d.toString();
    }
}
