package D6;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: InputFiltersHolder.kt */
/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1066a;

    /* renamed from: b, reason: collision with root package name */
    public String f1067b = "";

    /* renamed from: c, reason: collision with root package name */
    public int f1068c;

    public c(ArrayList arrayList) {
        this.f1066a = arrayList;
    }

    @Override // D6.a
    public final boolean a(String str) {
        ArrayList arrayList = this.f1066a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((a) it.next()).a(str)) {
                return false;
            }
        }
        return true;
    }
}
