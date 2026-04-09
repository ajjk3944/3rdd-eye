package n;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsCallback;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final ICustomTabsService f23455a;

    /* renamed from: b, reason: collision with root package name */
    public final ComponentName f23456b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f23457c;

    public class a extends ICustomTabsCallback.Stub {

        /* renamed from: a, reason: collision with root package name */
        public Handler f23458a = new Handler(Looper.getMainLooper());

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CustomTabsCallback f23459b;

        /* renamed from: n.b$a$a, reason: collision with other inner class name */
        public class RunnableC0438a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f23461a;

            public RunnableC0438a(Bundle bundle) {
                this.f23461a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f23459b.onUnminimized(this.f23461a);
            }
        }

        /* renamed from: n.b$a$b, reason: collision with other inner class name */
        public class RunnableC0439b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f23463a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Bundle f23464b;

            public RunnableC0439b(int i10, Bundle bundle) {
                this.f23463a = i10;
                this.f23464b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f23459b.onNavigationEvent(this.f23463a, this.f23464b);
            }
        }

        public class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f23466a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Bundle f23467b;

            public c(String str, Bundle bundle) {
                this.f23466a = str;
                this.f23467b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f23459b.extraCallback(this.f23466a, this.f23467b);
            }
        }

        public class d implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f23469a;

            public d(Bundle bundle) {
                this.f23469a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f23459b.onMessageChannelReady(this.f23469a);
            }
        }

        public class e implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f23471a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Bundle f23472b;

            public e(String str, Bundle bundle) {
                this.f23471a = str;
                this.f23472b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f23459b.onPostMessage(this.f23471a, this.f23472b);
            }
        }

        public class f implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f23474a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Uri f23475b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f23476c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Bundle f23477d;

            public f(int i10, Uri uri, boolean z10, Bundle bundle) {
                this.f23474a = i10;
                this.f23475b = uri;
                this.f23476c = z10;
                this.f23477d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f23459b.onRelationshipValidationResult(this.f23474a, this.f23475b, this.f23476c, this.f23477d);
            }
        }

        public class g implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f23479a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f23480b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Bundle f23481c;

            public g(int i10, int i11, Bundle bundle) {
                this.f23479a = i10;
                this.f23480b = i11;
                this.f23481c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f23459b.onActivityResized(this.f23479a, this.f23480b, this.f23481c);
            }
        }

        public class h implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f23483a;

            public h(Bundle bundle) {
                this.f23483a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f23459b.onWarmupCompleted(this.f23483a);
            }
        }

        public class i implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f23485a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f23486b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f23487c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int f23488d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ int f23489e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Bundle f23490f;

            public i(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
                this.f23485a = i10;
                this.f23486b = i11;
                this.f23487c = i12;
                this.f23488d = i13;
                this.f23489e = i14;
                this.f23490f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f23459b.onActivityLayout(this.f23485a, this.f23486b, this.f23487c, this.f23488d, this.f23489e, this.f23490f);
            }
        }

        public class j implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Bundle f23492a;

            public j(Bundle bundle) {
                this.f23492a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f23459b.onMinimized(this.f23492a);
            }
        }

        public a(CustomTabsCallback customTabsCallback) {
            this.f23459b = customTabsCallback;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void extraCallback(String str, Bundle bundle) {
            if (this.f23459b == null) {
                return;
            }
            this.f23458a.post(new c(str, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public Bundle extraCallbackWithResult(String str, Bundle bundle) {
            CustomTabsCallback customTabsCallback = this.f23459b;
            if (customTabsCallback == null) {
                return null;
            }
            return customTabsCallback.extraCallbackWithResult(str, bundle);
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onActivityLayout(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
            if (this.f23459b == null) {
                return;
            }
            this.f23458a.post(new i(i10, i11, i12, i13, i14, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onActivityResized(int i10, int i11, Bundle bundle) {
            if (this.f23459b == null) {
                return;
            }
            this.f23458a.post(new g(i10, i11, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMessageChannelReady(Bundle bundle) {
            if (this.f23459b == null) {
                return;
            }
            this.f23458a.post(new d(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMinimized(Bundle bundle) {
            if (this.f23459b == null) {
                return;
            }
            this.f23458a.post(new j(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onNavigationEvent(int i10, Bundle bundle) {
            if (this.f23459b == null) {
                return;
            }
            this.f23458a.post(new RunnableC0439b(i10, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onPostMessage(String str, Bundle bundle) {
            if (this.f23459b == null) {
                return;
            }
            this.f23458a.post(new e(str, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
            if (this.f23459b == null) {
                return;
            }
            this.f23458a.post(new f(i10, uri, z10, bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onUnminimized(Bundle bundle) {
            if (this.f23459b == null) {
                return;
            }
            this.f23458a.post(new RunnableC0438a(bundle));
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onWarmupCompleted(Bundle bundle) {
            if (this.f23459b == null) {
                return;
            }
            this.f23458a.post(new h(bundle));
        }
    }

    public b(ICustomTabsService iCustomTabsService, ComponentName componentName, Context context) {
        this.f23455a = iCustomTabsService;
        this.f23456b = componentName;
        this.f23457c = context;
    }

    public static boolean a(Context context, String str, d dVar) {
        dVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, dVar, 33);
    }

    public static String c(Context context, List list) {
        return d(context, list, false);
    }

    public static String d(Context context, List list, boolean z10) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z10 && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    public final ICustomTabsCallback.Stub b(CustomTabsCallback customTabsCallback) {
        return new a(customTabsCallback);
    }

    public e e(CustomTabsCallback customTabsCallback) {
        return f(customTabsCallback, null);
    }

    public final e f(CustomTabsCallback customTabsCallback, PendingIntent pendingIntent) {
        boolean zNewSession;
        ICustomTabsCallback.Stub stubB = b(customTabsCallback);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zNewSession = this.f23455a.newSessionWithExtras(stubB, bundle);
            } else {
                zNewSession = this.f23455a.newSession(stubB);
            }
            if (zNewSession) {
                return new e(this.f23455a, stubB, this.f23456b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public boolean g(long j10) {
        try {
            return this.f23455a.warmup(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
