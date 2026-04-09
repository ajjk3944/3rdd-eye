package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/DefaultLifecycleObserverAdapter;", "Landroidx/lifecycle/j;", "Landroidx/lifecycle/d;", "defaultLifecycleObserver", "lifecycleEventObserver", "<init>", "(Landroidx/lifecycle/d;Landroidx/lifecycle/j;)V", "Landroidx/lifecycle/n;", "source", "Landroidx/lifecycle/Lifecycle$Event;", NotificationCompat.CATEGORY_EVENT, "Ly8/s;", "onStateChanged", "(Landroidx/lifecycle/n;Landroidx/lifecycle/Lifecycle$Event;)V", "a", "Landroidx/lifecycle/d;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Landroidx/lifecycle/j;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final d defaultLifecycleObserver;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final j lifecycleEventObserver;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3422a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f3422a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(d defaultLifecycleObserver, j jVar) {
        kotlin.jvm.internal.p.e(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.defaultLifecycleObserver = defaultLifecycleObserver;
        this.lifecycleEventObserver = jVar;
    }

    @Override // androidx.lifecycle.j
    public void onStateChanged(n source, Lifecycle.Event event) {
        kotlin.jvm.internal.p.e(source, "source");
        kotlin.jvm.internal.p.e(event, "event");
        switch (a.f3422a[event.ordinal()]) {
            case 1:
                this.defaultLifecycleObserver.a(source);
                break;
            case 2:
                this.defaultLifecycleObserver.f(source);
                break;
            case 3:
                this.defaultLifecycleObserver.b(source);
                break;
            case 4:
                this.defaultLifecycleObserver.c(source);
                break;
            case 5:
                this.defaultLifecycleObserver.d(source);
                break;
            case 6:
                this.defaultLifecycleObserver.e(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        j jVar = this.lifecycleEventObserver;
        if (jVar != null) {
            jVar.onStateChanged(source, event);
        }
    }
}
