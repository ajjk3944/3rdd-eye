package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class we implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b, reason: collision with root package name */
    public final Application f17990b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f17991c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17989a = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17992d = false;

    public we(Application application, lf lfVar) {
        this.f17991c = new WeakReference(lfVar);
        this.f17990b = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f17989a) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f17991c.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityCreated(activity, bundle);
                    } else if (!this.f17992d) {
                        this.f17990b.unregisterActivityLifecycleCallbacks(this);
                        this.f17992d = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f17991c.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityCreated(activity, bundle);
                    } else if (!this.f17992d) {
                        this.f17990b.unregisterActivityLifecycleCallbacks(this);
                        this.f17992d = true;
                    }
                    break;
                } catch (Exception e2) {
                    za.i.f("Error while dispatching lifecycle callback.", e2);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f17989a) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f17991c.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityDestroyed(activity);
                    } else if (!this.f17992d) {
                        this.f17990b.unregisterActivityLifecycleCallbacks(this);
                        this.f17992d = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f17991c.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityDestroyed(activity);
                    } else if (!this.f17992d) {
                        this.f17990b.unregisterActivityLifecycleCallbacks(this);
                        this.f17992d = true;
                    }
                    break;
                } catch (Exception e2) {
                    za.i.f("Error while dispatching lifecycle callback.", e2);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f17989a) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f17991c.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityPaused(activity);
                    } else if (!this.f17992d) {
                        this.f17990b.unregisterActivityLifecycleCallbacks(this);
                        this.f17992d = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f17991c.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityPaused(activity);
                    } else if (!this.f17992d) {
                        this.f17990b.unregisterActivityLifecycleCallbacks(this);
                        this.f17992d = true;
                    }
                    break;
                } catch (Exception e2) {
                    za.i.f("Error while dispatching lifecycle callback.", e2);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f17989a) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f17991c.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityResumed(activity);
                    } else if (!this.f17992d) {
                        this.f17990b.unregisterActivityLifecycleCallbacks(this);
                        this.f17992d = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f17991c.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityResumed(activity);
                    } else if (!this.f17992d) {
                        this.f17990b.unregisterActivityLifecycleCallbacks(this);
                        this.f17992d = true;
                    }
                    break;
                } catch (Exception e2) {
                    za.i.f("Error while dispatching lifecycle callback.", e2);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f17989a) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f17991c.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
                    } else if (!this.f17992d) {
                        this.f17990b.unregisterActivityLifecycleCallbacks(this);
                        this.f17992d = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f17991c.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivitySaveInstanceState(activity, bundle);
                    } else if (!this.f17992d) {
                        this.f17990b.unregisterActivityLifecycleCallbacks(this);
                        this.f17992d = true;
                    }
                    break;
                } catch (Exception e2) {
                    za.i.f("Error while dispatching lifecycle callback.", e2);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f17989a) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f17991c.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityStarted(activity);
                    } else if (!this.f17992d) {
                        this.f17990b.unregisterActivityLifecycleCallbacks(this);
                        this.f17992d = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f17991c.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityStarted(activity);
                    } else if (!this.f17992d) {
                        this.f17990b.unregisterActivityLifecycleCallbacks(this);
                        this.f17992d = true;
                    }
                    break;
                } catch (Exception e2) {
                    za.i.f("Error while dispatching lifecycle callback.", e2);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.f17989a) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f17991c.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityStopped(activity);
                    } else if (!this.f17992d) {
                        this.f17990b.unregisterActivityLifecycleCallbacks(this);
                        this.f17992d = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f17991c.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityStopped(activity);
                    } else if (!this.f17992d) {
                        this.f17990b.unregisterActivityLifecycleCallbacks(this);
                        this.f17992d = true;
                    }
                    break;
                } catch (Exception e2) {
                    za.i.f("Error while dispatching lifecycle callback.", e2);
                    return;
                }
        }
    }

    public we(Application application, yg ygVar) {
        this.f17991c = new WeakReference(ygVar);
        this.f17990b = application;
    }
}
