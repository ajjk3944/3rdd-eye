package H0;

import H0.k;
import java.util.ArrayList;
import m0.C5316i;

/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
public final class j implements K0.b<k.a> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1997a;

    public j(String str) {
        this.f1997a = str;
    }

    @Override // K0.b
    public final void accept(k.a aVar) {
        k.a aVar2 = aVar;
        synchronized (k.f2000c) {
            try {
                C5316i<String, ArrayList<K0.b<k.a>>> c5316i = k.f2001d;
                ArrayList<K0.b<k.a>> arrayList = c5316i.get(this.f1997a);
                if (arrayList == null) {
                    return;
                }
                c5316i.remove(this.f1997a);
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).accept(aVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
