package pb;

import android.net.Uri;
import com.applovin.sdk.AppLovinEventTypes;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f31560a = new Uri.Builder().scheme(AppLovinEventTypes.USER_VIEWED_CONTENT).authority("com.google.android.gms.chimera").build();

    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.Intent a(android.content.Context r5, pb.h0 r6) {
        /*
            java.lang.String r0 = "ServiceBindIntentUtils"
            java.lang.String r1 = r6.f31614a
            r2 = 0
            if (r1 != 0) goto L11
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            android.content.Intent r5 = r5.setComponent(r2)
            return r5
        L11:
            boolean r3 = r6.f31616c
            if (r3 == 0) goto La1
            java.lang.String r3 = "serviceActionBundleKey"
            android.os.Bundle r3 = r5.c.g(r3, r1)
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L31 android.os.RemoteException -> L33
            android.net.Uri r4 = pb.a0.f31560a     // Catch: java.lang.IllegalArgumentException -> L31 android.os.RemoteException -> L33
            android.content.ContentProviderClient r5 = r5.acquireUnstableContentProviderClient(r4)     // Catch: java.lang.IllegalArgumentException -> L31 android.os.RemoteException -> L33
            if (r5 == 0) goto L3a
            java.lang.String r4 = "serviceIntentCall"
            android.os.Bundle r3 = r5.call(r4, r2, r3)     // Catch: java.lang.Throwable -> L35
            r5.release()     // Catch: java.lang.IllegalArgumentException -> L31 android.os.RemoteException -> L33
            goto L50
        L31:
            r5 = move-exception
            goto L42
        L33:
            r5 = move-exception
            goto L42
        L35:
            r3 = move-exception
            r5.release()     // Catch: java.lang.IllegalArgumentException -> L31 android.os.RemoteException -> L33
            throw r3     // Catch: java.lang.IllegalArgumentException -> L31 android.os.RemoteException -> L33
        L3a:
            android.os.RemoteException r5 = new android.os.RemoteException     // Catch: java.lang.IllegalArgumentException -> L31 android.os.RemoteException -> L33
            java.lang.String r3 = "Failed to acquire ContentProviderClient"
            r5.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L31 android.os.RemoteException -> L33
            throw r5     // Catch: java.lang.IllegalArgumentException -> L31 android.os.RemoteException -> L33
        L42:
            java.lang.String r3 = "Dynamic intent resolution failed: "
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r3.concat(r5)
            android.util.Log.w(r0, r5)
            r3 = r2
        L50:
            if (r3 != 0) goto L53
            goto L69
        L53:
            java.lang.String r5 = "serviceResponseIntentKey"
            android.os.Parcelable r5 = r3.getParcelable(r5)
            android.content.Intent r5 = (android.content.Intent) r5
            if (r5 == 0) goto L5f
            r2 = r5
            goto L69
        L5f:
            java.lang.String r5 = "serviceMissingResolutionIntentKey"
            android.os.Parcelable r5 = r3.getParcelable(r5)
            android.app.PendingIntent r5 = (android.app.PendingIntent) r5
            if (r5 != 0) goto L75
        L69:
            if (r2 != 0) goto La1
            java.lang.String r5 = "Dynamic lookup for intent failed for action: "
            java.lang.String r5 = r5.concat(r1)
            android.util.Log.w(r0, r5)
            goto La1
        L75:
            int r6 = r1.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r6 = r6 + 72
            r3.<init>(r6)
            java.lang.String r6 = "Dynamic lookup for intent failed for action "
            r3.append(r6)
            r3.append(r1)
            java.lang.String r6 = " but has possible resolution"
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            android.util.Log.w(r0, r6)
            pb.z r6 = new pb.z
            nb.b r0 = new nb.b
            r1 = 25
            r0.<init>(r1, r5, r2)
            r6.<init>(r0)
            throw r6
        La1:
            if (r2 != 0) goto Laf
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r1)
            java.lang.String r6 = r6.f31615b
            android.content.Intent r5 = r5.setPackage(r6)
            return r5
        Laf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pb.a0.a(android.content.Context, pb.h0):android.content.Intent");
    }
}
