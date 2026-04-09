package s1;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import s1.k;

/* loaded from: classes.dex */
abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f61111a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f61112b = new Object();

    static Bundle a(k.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatD = aVar.d();
        bundle.putInt("icon", iconCompatD != null ? iconCompatD.b() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    private static Bundle b(s sVar) {
        new Bundle();
        throw null;
    }

    private static Bundle[] c(s[] sVarArr) {
        if (sVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[sVarArr.length];
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            s sVar = sVarArr[i10];
            bundleArr[i10] = b(null);
        }
        return bundleArr;
    }
}
