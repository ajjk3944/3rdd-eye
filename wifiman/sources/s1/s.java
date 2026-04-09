package s1;

import android.app.RemoteInput;

/* loaded from: classes.dex */
public abstract class s {

    static class a {
        public static RemoteInput a(s sVar) {
            throw null;
        }
    }

    static RemoteInput a(s sVar) {
        return a.a(sVar);
    }

    static RemoteInput[] b(s[] sVarArr) {
        if (sVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[sVarArr.length];
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            s sVar = sVarArr[i10];
            remoteInputArr[i10] = a(null);
        }
        return remoteInputArr;
    }
}
