package a4;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import b4.AbstractRunnableC0359x;
import b4.C0358w;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public final class i extends AbstractRunnableC0359x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Collection f4698b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4699c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1.b f4700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c3.f f4701e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f4702f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, c3.f fVar, ArrayList arrayList, ArrayList arrayList2, C1.b bVar, c3.f fVar2) {
        super(fVar);
        this.f4702f = kVar;
        this.f4698b = arrayList;
        this.f4699c = arrayList2;
        this.f4700d = bVar;
        this.f4701e = fVar2;
    }

    @Override // b4.AbstractRunnableC0359x
    public final void a() {
        c3.f fVar = this.f4701e;
        k kVar = this.f4702f;
        C1.b bVar = this.f4700d;
        Collection<String> collection = this.f4698b;
        ArrayList arrayList = new ArrayList(collection.size());
        for (String str : collection) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        ArrayList arrayList2 = this.f4699c;
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            Bundle bundle2 = new Bundle();
            bundle2.putString("language", (String) obj);
            arrayList3.add(bundle2);
        }
        arrayList.addAll(arrayList3);
        try {
            bVar.f1138a.add(new C0358w(2, System.currentTimeMillis()));
            kVar.f4708b.f5748m.p3(kVar.f4707a, arrayList, k.a(bVar), new j(kVar, fVar));
        } catch (RemoteException e6) {
            X3.e eVar = k.f4705c;
            Object[] objArr = {collection, arrayList2};
            eVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", X3.e.f(eVar.f4174b, "startInstall(%s,%s)", objArr), e6);
            }
            fVar.a(new RuntimeException(e6));
        }
    }
}
