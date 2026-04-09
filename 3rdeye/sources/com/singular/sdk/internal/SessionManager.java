package com.singular.sdk.internal;

import android.app.Application;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import androidx.work.s;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.singular.sdk.internal.BroadcastReceivers;

/* loaded from: classes2.dex */
class SessionManager {
    private static final SingularLog logger = SingularLog.getLogger("Session");
    private final BroadcastReceivers.NetworkChange networkChangeReceiver;
    private final SingularInstance singular;
    private boolean usingForegroundTracking = false;
    private long sessionId = -1;
    private long lastSessionPauseTime = -1;
    private long sequence = 0;
    private boolean inForeground = true;

    public SessionManager(SingularInstance singularInstance) {
        this.singular = singularInstance;
        this.networkChangeReceiver = new BroadcastReceivers.NetworkChange(singularInstance);
        load();
        startNewSessionIfNeeded(Utils.getCurrentTimeMillis());
        enableForegroundTracking((Application) singularInstance.getContext());
        registerNetworkChangeReceiver();
    }

    private void enableForegroundTracking(Application application) {
        if (this.usingForegroundTracking) {
            return;
        }
        if (Utils.getWrapperName() == null || !Utils.getWrapperName().equalsIgnoreCase("mParticle")) {
            new SingularLifecycleCallbacks(this).registerSelf(application);
        }
    }

    private long getSessionLengthInMs() {
        return System.currentTimeMillis() - this.sessionId;
    }

    private boolean inSession() {
        return this.sessionId > 0;
    }

    private boolean isWithinMinTimeBetweenSessions(long j4) {
        return j4 - this.lastSessionPauseTime < this.singular.getSingularConfig().sessionTimeoutSec * 1000;
    }

    private void load() {
        SharedPreferences sharedPreferences = this.singular.getContext().getSharedPreferences(Constants.PREF_SESSION, 0);
        this.sessionId = sharedPreferences.getLong(FacebookMediationAdapter.KEY_ID, -1L);
        long j4 = sharedPreferences.getLong("lastSessionPauseTime", -1L);
        this.lastSessionPauseTime = j4;
        if (j4 < 0) {
            this.lastSessionPauseTime = sharedPreferences.getLong("lastEvent", -1L);
        }
        this.sequence = sharedPreferences.getLong("seq", 0L);
        logger.debug("load() <= %s", toString());
    }

    private void persist() {
        try {
            SharedPreferences.Editor editorEdit = this.singular.getContext().getSharedPreferences(Constants.PREF_SESSION, 0).edit();
            editorEdit.putLong(FacebookMediationAdapter.KEY_ID, this.sessionId);
            editorEdit.putLong("lastSessionPauseTime", this.lastSessionPauseTime);
            editorEdit.putLong("seq", this.sequence);
            editorEdit.commit();
        } catch (Throwable th) {
            logger.error(Utils.formatException(th));
        }
    }

    private void resetSequence() {
        this.sequence = 0L;
    }

    private void sendSessionStartEvent() {
        if (inSession()) {
            this.singular.logSessionStart(this.sessionId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastSessionPauseTime(long j4) {
        this.lastSessionPauseTime = j4;
        persist();
    }

    private void setSessionId(long j4) {
        this.sessionId = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean startNewSessionIfNeeded(long j4) {
        SingularInstance.getInstance().getDeviceInfo().sdid.sendResolveRequestIfNeeded(SingularInstance.getInstance().getDeviceInfo(), SingularInstance.getInstance().getContext());
        if (SingularInstance.getInstance().getSingularConfig().singularLink != null) {
            startNewSession(j4);
            return true;
        }
        if (inSession() && isWithinMinTimeBetweenSessions(j4)) {
            return false;
        }
        startNewSession(j4);
        return true;
    }

    public long getNextSequenceNumber() {
        long j4 = this.sequence + 1;
        this.sequence = j4;
        return j4;
    }

    public long getSessionId() {
        return this.sessionId;
    }

    public void onEnterForeground(final long j4) {
        if (Utils.isOpenedWithDeeplink()) {
            return;
        }
        logger.debug("onEnterForeground() At %d", Long.valueOf(j4));
        this.singular.runOnWorker(new Runnable() { // from class: com.singular.sdk.internal.SessionManager.2
            @Override // java.lang.Runnable
            public void run() {
                SessionManager.this.inForeground = true;
                SessionManager.this.startNewSessionIfNeeded(j4);
                SessionManager.this.registerNetworkChangeReceiver();
            }
        });
    }

    public void onExitForeground(final long j4) {
        logger.debug("onExitForeground() At %d", Long.valueOf(j4));
        this.singular.runOnWorker(new Runnable() { // from class: com.singular.sdk.internal.SessionManager.1
            @Override // java.lang.Runnable
            public void run() {
                SessionManager.this.setLastSessionPauseTime(j4);
                SessionManager.this.inForeground = false;
                SessionManager.this.unregisterNetworkChangeReceiver();
                Utils.appMovedToBackground();
            }
        });
    }

    public void registerNetworkChangeReceiver() {
        if (this.inForeground || !this.usingForegroundTracking) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            this.singular.getContext().registerReceiver(this.networkChangeReceiver, intentFilter);
            logger.debug("registerNetworkChangeReceiver()");
        }
    }

    public void startNewSession(long j4) {
        logger.debug("startNewSession() At %d", Long.valueOf(j4));
        setSessionId(j4);
        resetSequence();
        sendSessionStartEvent();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{id=");
        sb.append(this.sessionId);
        sb.append(", lastSessionPauseTime=");
        sb.append(this.lastSessionPauseTime);
        sb.append(", seq=");
        return s.f(sb, this.sequence, '}');
    }

    public void unregisterNetworkChangeReceiver() {
        if (this.networkChangeReceiver != null) {
            try {
                this.singular.getContext().unregisterReceiver(this.networkChangeReceiver);
                logger.debug("unregisterNetworkChangeReceiver()");
            } catch (Throwable unused) {
            }
        }
    }

    public void useForegroundTracking() {
        this.usingForegroundTracking = true;
    }
}
