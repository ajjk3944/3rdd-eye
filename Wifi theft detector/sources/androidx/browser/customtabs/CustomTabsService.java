package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import androidx.annotation.RestrictTo;
import androidx.browser.customtabs.CustomTabsService;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.NoSuchElementException;
import n.f;
import n.g;
import n.h;
import r.k;

/* loaded from: classes.dex */
public abstract class CustomTabsService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public final k f1439a = new k();

    /* renamed from: b, reason: collision with root package name */
    public ICustomTabsService.Stub f1440b = new a();

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface FilePurpose {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Relation {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Result {
    }

    public class a extends ICustomTabsService.Stub {
        public a() {
        }

        @Override // android.support.customtabs.ICustomTabsService
        public Bundle extraCommand(String str, Bundle bundle) {
            return CustomTabsService.this.b(str, bundle);
        }

        public final PendingIntent g(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
            bundle.remove("android.support.customtabs.extra.SESSION_ID");
            return pendingIntent;
        }

        public final Uri h(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            return Build.VERSION.SDK_INT >= 33 ? (Uri) n.a.a(bundle, "target_origin", Uri.class) : (Uri) bundle.getParcelable("target_origin");
        }

        public final boolean i(ICustomTabsCallback iCustomTabsCallback, PendingIntent pendingIntent) {
            final f fVar = new f(iCustomTabsCallback, pendingIntent);
            try {
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: n.c
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        CustomTabsService.this.a(fVar);
                    }
                };
                synchronized (CustomTabsService.this.f1439a) {
                    iCustomTabsCallback.asBinder().linkToDeath(deathRecipient, 0);
                    CustomTabsService.this.f1439a.put(iCustomTabsCallback.asBinder(), deathRecipient);
                }
                return CustomTabsService.this.e(fVar);
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean isEngagementSignalsApiAvailable(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return CustomTabsService.this.c(new f(iCustomTabsCallback, g(bundle)), bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List list) {
            return CustomTabsService.this.d(new f(iCustomTabsCallback, g(bundle)), uri, bundle, list);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSession(ICustomTabsCallback iCustomTabsCallback) {
            return i(iCustomTabsCallback, null);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSessionWithExtras(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return i(iCustomTabsCallback, g(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsService
        public int postMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
            return CustomTabsService.this.f(new f(iCustomTabsCallback, g(bundle)), str, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean receiveFile(ICustomTabsCallback iCustomTabsCallback, Uri uri, int i10, Bundle bundle) {
            return CustomTabsService.this.g(new f(iCustomTabsCallback, g(bundle)), uri, i10, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri) {
            return CustomTabsService.this.i(new f(iCustomTabsCallback, null), uri, null, new Bundle());
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannelWithExtras(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) {
            return CustomTabsService.this.i(new f(iCustomTabsCallback, g(bundle)), uri, h(bundle), bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean setEngagementSignalsCallback(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle) {
            return CustomTabsService.this.j(new f(iCustomTabsCallback, g(bundle)), h.a(iBinder), bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return CustomTabsService.this.k(new f(iCustomTabsCallback, g(bundle)), bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int i10, Uri uri, Bundle bundle) {
            return CustomTabsService.this.l(new f(iCustomTabsCallback, g(bundle)), i10, uri, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean warmup(long j10) {
            return CustomTabsService.this.m(j10);
        }
    }

    public boolean a(f fVar) {
        try {
            synchronized (this.f1439a) {
                try {
                    IBinder iBinderA = fVar.a();
                    if (iBinderA == null) {
                        return false;
                    }
                    iBinderA.unlinkToDeath((IBinder.DeathRecipient) this.f1439a.get(iBinderA), 0);
                    this.f1439a.remove(iBinderA);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    public abstract Bundle b(String str, Bundle bundle);

    public boolean c(f fVar, Bundle bundle) {
        return false;
    }

    public abstract boolean d(f fVar, Uri uri, Bundle bundle, List list);

    public abstract boolean e(f fVar);

    public abstract int f(f fVar, String str, Bundle bundle);

    public abstract boolean g(f fVar, Uri uri, int i10, Bundle bundle);

    public abstract boolean h(f fVar, Uri uri);

    public boolean i(f fVar, Uri uri, Uri uri2, Bundle bundle) {
        return h(fVar, uri);
    }

    public boolean j(f fVar, g gVar, Bundle bundle) {
        return false;
    }

    public abstract boolean k(f fVar, Bundle bundle);

    public abstract boolean l(f fVar, int i10, Uri uri, Bundle bundle);

    public abstract boolean m(long j10);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f1440b;
    }
}
