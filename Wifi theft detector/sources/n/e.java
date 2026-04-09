package n;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f23497a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ICustomTabsService f23498b;

    /* renamed from: c, reason: collision with root package name */
    public final ICustomTabsCallback f23499c;

    /* renamed from: d, reason: collision with root package name */
    public final ComponentName f23500d;

    /* renamed from: e, reason: collision with root package name */
    public final PendingIntent f23501e;

    public e(ICustomTabsService iCustomTabsService, ICustomTabsCallback iCustomTabsCallback, ComponentName componentName, PendingIntent pendingIntent) {
        this.f23498b = iCustomTabsService;
        this.f23499c = iCustomTabsCallback;
        this.f23500d = componentName;
        this.f23501e = pendingIntent;
    }

    public final void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f23501e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    public final Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    public final Bundle c(Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable("target_origin", uri);
        }
        if (this.f23501e != null) {
            a(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    public IBinder d() {
        return this.f23499c.asBinder();
    }

    public ComponentName e() {
        return this.f23500d;
    }

    public PendingIntent f() {
        return this.f23501e;
    }

    public boolean g(Uri uri, Bundle bundle, List list) {
        try {
            return this.f23498b.mayLaunchUrl(this.f23499c, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int h(String str, Bundle bundle) {
        int iPostMessage;
        Bundle bundleB = b(bundle);
        synchronized (this.f23497a) {
            try {
                try {
                    iPostMessage = this.f23498b.postMessage(this.f23499c, str, bundleB);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iPostMessage;
    }

    public boolean i(Uri uri) {
        return j(uri, null, new Bundle());
    }

    public boolean j(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle bundleC = c(uri2);
            if (bundleC == null) {
                return this.f23498b.requestPostMessageChannel(this.f23499c, uri);
            }
            bundle.putAll(bundleC);
            return this.f23498b.requestPostMessageChannelWithExtras(this.f23499c, uri, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public boolean k(int i10, Uri uri, Bundle bundle) {
        if (i10 >= 1 && i10 <= 2) {
            try {
                return this.f23498b.validateRelationship(this.f23499c, i10, uri, b(bundle));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }
}
