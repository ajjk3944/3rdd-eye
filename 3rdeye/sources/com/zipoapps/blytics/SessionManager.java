package com.zipoapps.blytics;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.lifecycle.J;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.l;
import androidx.work.s;
import com.google.gson.Gson;
import com.google.gson.m;
import com.zipoapps.premiumhelper.d;
import com.zipoapps.premiumhelper.e;
import f9.InterfaceC4347e;
import i8.C4461a;
import j8.C5201c;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: SessionManager.kt */
/* loaded from: classes3.dex */
public final class SessionManager {

    /* renamed from: a, reason: collision with root package name */
    public final d f36982a;

    /* renamed from: b, reason: collision with root package name */
    public final l8.b f36983b;

    /* renamed from: c, reason: collision with root package name */
    public SessionData f36984c;

    /* compiled from: SessionManager.kt */
    public static final class CloseSessionWorker extends CoroutineWorker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CloseSessionWorker(Context context, WorkerParameters params) {
            super(context, params);
            l.f(context, "context");
            l.f(params, "params");
        }

        @Override // androidx.work.CoroutineWorker
        public final Object doWork(InterfaceC4347e<? super l.a> interfaceC4347e) {
            String strH = getInputData().h("session");
            if (strH != null) {
                try {
                    SessionData sessionData = (SessionData) new Gson().b(SessionData.class, strH);
                    e.f37006D.getClass();
                    SessionManager sessionManager = e.a.a().f37031u;
                    kotlin.jvm.internal.l.c(sessionData);
                    sessionManager.a(sessionData);
                    return new l.a.c();
                } catch (m e4) {
                    va.a.f47104a.c(s.d("Can't upload session data. Parsing failed. ", e4.getMessage()), new Object[0]);
                }
            }
            return new l.a.c();
        }
    }

    public SessionManager(d dVar, l8.b bVar, C5201c c5201c) {
        this.f36982a = dVar;
        this.f36983b = bVar;
        a aVar = new a(this);
        if (c5201c.f(dVar)) {
            l8.d<Boolean> PH_TOTOLYTICS_ENABLED = i8.d.f38563i0;
            kotlin.jvm.internal.l.e(PH_TOTOLYTICS_ENABLED, "PH_TOTOLYTICS_ENABLED");
            Object objH = bVar.h(PH_TOTOLYTICS_ENABLED);
            kotlin.jvm.internal.l.e(objH, "get(...)");
            if (((Boolean) objH).booleanValue()) {
                J.f16049j.f16055g.addObserver(aVar);
            }
        }
    }

    public final void a(SessionData sessionData) {
        kotlin.jvm.internal.l.f(sessionData, "sessionData");
        l8.d<Boolean> PH_TOTOLYTICS_ENABLED = i8.d.f38563i0;
        kotlin.jvm.internal.l.e(PH_TOTOLYTICS_ENABLED, "PH_TOTOLYTICS_ENABLED");
        Object objH = this.f36983b.h(PH_TOTOLYTICS_ENABLED);
        kotlin.jvm.internal.l.e(objH, "get(...)");
        if (((Boolean) objH).booleanValue()) {
            e.f37006D.getClass();
            e eVarA = e.a.a();
            String sessionId = sessionData.getSessionId();
            long timestamp = sessionData.getTimestamp();
            long duration = sessionData.getDuration();
            C4461a c4461a = eVarA.f37021k;
            c4461a.getClass();
            kotlin.jvm.internal.l.f(sessionId, "sessionId");
            c4461a.r(c4461a.c("toto_session_end", false, G0.d.a(new b9.l("session_id", sessionId), new b9.l("timestamp", Long.valueOf(timestamp)), new b9.l("duration", Long.valueOf(duration)))));
            this.f36984c = null;
        }
    }

    /* compiled from: SessionManager.kt */
    @Keep
    public static final class SessionData {

        @A5.b("duration")
        private long duration;

        @A5.b("sessionId")
        private final String sessionId;

        @A5.b("timestamp")
        private final long timestamp;

        public SessionData(String sessionId, long j4, long j10) {
            kotlin.jvm.internal.l.f(sessionId, "sessionId");
            this.sessionId = sessionId;
            this.timestamp = j4;
            this.duration = j10;
        }

        public static /* synthetic */ SessionData copy$default(SessionData sessionData, String str, long j4, long j10, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sessionData.sessionId;
            }
            if ((i & 2) != 0) {
                j4 = sessionData.timestamp;
            }
            if ((i & 4) != 0) {
                j10 = sessionData.duration;
            }
            return sessionData.copy(str, j4, j10);
        }

        public final void calculateDuration() {
            this.duration = System.currentTimeMillis() - this.timestamp;
        }

        public final String component1() {
            return this.sessionId;
        }

        public final long component2() {
            return this.timestamp;
        }

        public final long component3() {
            return this.duration;
        }

        public final SessionData copy(String sessionId, long j4, long j10) {
            kotlin.jvm.internal.l.f(sessionId, "sessionId");
            return new SessionData(sessionId, j4, j10);
        }

        public final SessionData createCloseSessionData() {
            return new SessionData(this.sessionId, System.currentTimeMillis(), System.currentTimeMillis() - this.timestamp);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionData)) {
                return false;
            }
            SessionData sessionData = (SessionData) obj;
            return kotlin.jvm.internal.l.b(this.sessionId, sessionData.sessionId) && this.timestamp == sessionData.timestamp && this.duration == sessionData.duration;
        }

        public final long getDuration() {
            return this.duration;
        }

        public final String getSessionId() {
            return this.sessionId;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            int iHashCode = this.sessionId.hashCode() * 31;
            long j4 = this.timestamp;
            int i = (iHashCode + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j10 = this.duration;
            return i + ((int) (j10 ^ (j10 >>> 32)));
        }

        public final void setDuration(long j4) {
            this.duration = j4;
        }

        public String toString() {
            return "SessionData(sessionId=" + this.sessionId + ", timestamp=" + this.timestamp + ", duration=" + this.duration + ")";
        }

        public /* synthetic */ SessionData(String str, long j4, long j10, int i, g gVar) {
            this(str, j4, (i & 4) != 0 ? 0L : j10);
        }
    }
}
