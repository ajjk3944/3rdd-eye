package com.singular.sdk.internal;

import A5.b;
import com.google.gson.Gson;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SLRemoteConfiguration {
    private static final SingularLog logger = SingularLog.getLogger("SLRemoteConfiguration");

    @b("admon_batching")
    private SLRemoteConfigurationAdmonBatching slRemoteConfigurationAdmonBatching = new SLRemoteConfigurationAdmonBatching();

    public static class SLRemoteConfigurationAdmonBatching {
        private static final SingularLog logger = SingularLog.getLogger("SLRemoteConfiguration");

        @b("AggregateAdmonEvents")
        private boolean aggregateAdmonEvents = false;

        @b("debug")
        private boolean debug = false;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SLRemoteConfigurationAdmonBatching sLRemoteConfigurationAdmonBatching = (SLRemoteConfigurationAdmonBatching) obj;
            return this.aggregateAdmonEvents == sLRemoteConfigurationAdmonBatching.aggregateAdmonEvents && this.debug == sLRemoteConfigurationAdmonBatching.debug;
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(this.aggregateAdmonEvents), Boolean.valueOf(this.debug));
        }

        public boolean isAggregateAdmonEvents() {
            return this.aggregateAdmonEvents;
        }

        public boolean isDebug() {
            return this.debug;
        }
    }

    private SLRemoteConfiguration() {
    }

    public static SLRemoteConfiguration defaultConfig() {
        return new SLRemoteConfiguration();
    }

    public static SLRemoteConfiguration fromJson(JSONObject jSONObject) {
        try {
            return (SLRemoteConfiguration) new Gson().b(SLRemoteConfiguration.class, jSONObject.toString());
        } catch (Throwable th) {
            logger.error(Utils.formatException(th));
            return new SLRemoteConfiguration();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.slRemoteConfigurationAdmonBatching.equals(((SLRemoteConfiguration) obj).slRemoteConfigurationAdmonBatching);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.slRemoteConfigurationAdmonBatching);
    }

    public boolean isAdmonEventsDebug() {
        return this.slRemoteConfigurationAdmonBatching.isDebug();
    }

    public boolean isAggregateAdmonEvents() {
        return this.slRemoteConfigurationAdmonBatching.isAggregateAdmonEvents();
    }

    public JSONObject toJson() {
        try {
            return new JSONObject(new Gson().g(this));
        } catch (Throwable th) {
            logger.error(Utils.formatException(th));
            return new JSONObject();
        }
    }
}
