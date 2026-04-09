package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class O6 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b, reason: collision with root package name */
    public final Application f10163b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f10164c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10162a = 1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10165d = false;

    public O6(Application application, ViewOnAttachStateChangeListenerC0919b7 viewOnAttachStateChangeListenerC0919b7) {
        this.f10164c = new WeakReference(viewOnAttachStateChangeListenerC0919b7);
        this.f10163b = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f10162a) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f10164c.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityCreated(activity, bundle);
                    } else if (!this.f10165d) {
                        this.f10163b.unregisterActivityLifecycleCallbacks(this);
                        this.f10165d = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f10164c.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityCreated(activity, bundle);
                    } else if (!this.f10165d) {
                        this.f10163b.unregisterActivityLifecycleCallbacks(this);
                        this.f10165d = true;
                    }
                    break;
                } catch (Exception e6) {
                    u2.k.f("Error while dispatching lifecycle callback.", e6);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f10162a) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f10164c.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityDestroyed(activity);
                    } else if (!this.f10165d) {
                        this.f10163b.unregisterActivityLifecycleCallbacks(this);
                        this.f10165d = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f10164c.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityDestroyed(activity);
                    } else if (!this.f10165d) {
                        this.f10163b.unregisterActivityLifecycleCallbacks(this);
                        this.f10165d = true;
                    }
                    break;
                } catch (Exception e6) {
                    u2.k.f("Error while dispatching lifecycle callback.", e6);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f10162a) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f10164c.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityPaused(activity);
                    } else if (!this.f10165d) {
                        this.f10163b.unregisterActivityLifecycleCallbacks(this);
                        this.f10165d = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f10164c.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityPaused(activity);
                    } else if (!this.f10165d) {
                        this.f10163b.unregisterActivityLifecycleCallbacks(this);
                        this.f10165d = true;
                    }
                    break;
                } catch (Exception e6) {
                    u2.k.f("Error while dispatching lifecycle callback.", e6);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f10162a) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f10164c.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityResumed(activity);
                    } else if (!this.f10165d) {
                        this.f10163b.unregisterActivityLifecycleCallbacks(this);
                        this.f10165d = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f10164c.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityResumed(activity);
                    } else if (!this.f10165d) {
                        this.f10163b.unregisterActivityLifecycleCallbacks(this);
                        this.f10165d = true;
                    }
                    break;
                } catch (Exception e6) {
                    u2.k.f("Error while dispatching lifecycle callback.", e6);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f10162a) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f10164c.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
                    } else if (!this.f10165d) {
                        this.f10163b.unregisterActivityLifecycleCallbacks(this);
                        this.f10165d = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f10164c.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivitySaveInstanceState(activity, bundle);
                    } else if (!this.f10165d) {
                        this.f10163b.unregisterActivityLifecycleCallbacks(this);
                        this.f10165d = true;
                    }
                    break;
                } catch (Exception e6) {
                    u2.k.f("Error while dispatching lifecycle callback.", e6);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f10162a) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f10164c.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityStarted(activity);
                    } else if (!this.f10165d) {
                        this.f10163b.unregisterActivityLifecycleCallbacks(this);
                        this.f10165d = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f10164c.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityStarted(activity);
                    } else if (!this.f10165d) {
                        this.f10163b.unregisterActivityLifecycleCallbacks(this);
                        this.f10165d = true;
                    }
                    break;
                } catch (Exception e6) {
                    u2.k.f("Error while dispatching lifecycle callback.", e6);
                    return;
                }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.f10162a) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f10164c.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityStopped(activity);
                    } else if (!this.f10165d) {
                        this.f10163b.unregisterActivityLifecycleCallbacks(this);
                        this.f10165d = true;
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f10164c.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityStopped(activity);
                    } else if (!this.f10165d) {
                        this.f10163b.unregisterActivityLifecycleCallbacks(this);
                        this.f10165d = true;
                    }
                    break;
                } catch (Exception e6) {
                    u2.k.f("Error while dispatching lifecycle callback.", e6);
                    return;
                }
        }
    }

    public O6(Application application, N7 n7) {
        this.f10164c = new WeakReference(n7);
        this.f10163b = application;
    }
}
