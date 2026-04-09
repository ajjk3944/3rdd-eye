package n;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsCallback;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final ICustomTabsCallback f23502a;

    /* renamed from: b, reason: collision with root package name */
    public final PendingIntent f23503b;

    /* renamed from: c, reason: collision with root package name */
    public final CustomTabsCallback f23504c;

    public class a extends CustomTabsCallback {
        public a() {
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void extraCallback(String str, Bundle bundle) {
            try {
                f.this.f23502a.extraCallback(str, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public Bundle extraCallbackWithResult(String str, Bundle bundle) {
            try {
                return f.this.f23502a.extraCallbackWithResult(str, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
                return null;
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onActivityLayout(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
            try {
                f.this.f23502a.onActivityLayout(i10, i11, i12, i13, i14, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onActivityResized(int i10, int i11, Bundle bundle) {
            try {
                f.this.f23502a.onActivityResized(i10, i11, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onMessageChannelReady(Bundle bundle) {
            try {
                f.this.f23502a.onMessageChannelReady(bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onMinimized(Bundle bundle) {
            try {
                f.this.f23502a.onMinimized(bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onNavigationEvent(int i10, Bundle bundle) {
            try {
                f.this.f23502a.onNavigationEvent(i10, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onPostMessage(String str, Bundle bundle) {
            try {
                f.this.f23502a.onPostMessage(str, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
            try {
                f.this.f23502a.onRelationshipValidationResult(i10, uri, z10, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onUnminimized(Bundle bundle) {
            try {
                f.this.f23502a.onUnminimized(bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // androidx.browser.customtabs.CustomTabsCallback
        public void onWarmupCompleted(Bundle bundle) {
            try {
                f.this.f23502a.onWarmupCompleted(bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }
    }

    public f(ICustomTabsCallback iCustomTabsCallback, PendingIntent pendingIntent) {
        if (iCustomTabsCallback == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f23502a = iCustomTabsCallback;
        this.f23503b = pendingIntent;
        this.f23504c = iCustomTabsCallback == null ? null : new a();
    }

    public IBinder a() {
        ICustomTabsCallback iCustomTabsCallback = this.f23502a;
        if (iCustomTabsCallback == null) {
            return null;
        }
        return iCustomTabsCallback.asBinder();
    }

    public final IBinder b() {
        ICustomTabsCallback iCustomTabsCallback = this.f23502a;
        if (iCustomTabsCallback != null) {
            return iCustomTabsCallback.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    public PendingIntent c() {
        return this.f23503b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        PendingIntent pendingIntentC = fVar.c();
        PendingIntent pendingIntent = this.f23503b;
        if ((pendingIntent == null) != (pendingIntentC == null)) {
            return false;
        }
        return pendingIntent != null ? pendingIntent.equals(pendingIntentC) : b().equals(fVar.b());
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.f23503b;
        return pendingIntent != null ? pendingIntent.hashCode() : b().hashCode();
    }
}
