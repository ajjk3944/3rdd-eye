package speedtest;

import go.Seq;

/* loaded from: classes2.dex */
public abstract class Speedtest {
    public static final long ErrCancelled = 2;
    public static final long ErrIO = 5;
    public static final long ErrRest = 3;
    public static final long ErrRestUnexpected = 4;
    public static final long ErrServersUnavailable = 6;
    public static final long ErrTestInternal = 7;
    public static final long ErrUnknown = 1;
    public static final int GoSpeedTestAuthenticateTTLNotSet = -1;
    public static final long InternetServersCheckStateFetch = 1;
    public static final long InternetServersCheckStateFinished = 3;
    public static final long InternetServersCheckStateIdle = 0;
    public static final long InternetServersCheckStateLatencyCheck = 2;
    public static final long SpeedServerStateActive = 3;
    public static final long SpeedServerStateIdle = 2;
    public static final long SpeedServerStateOff = 0;
    public static final long SpeedServerStateStarting = 1;
    public static final String SpeedTestEnvDev = "dev";
    public static final String SpeedTestEnvProduction = "prd";
    public static final String SpeedTestEnvStage = "stg";
    public static final long SpeedTestStateFinished = 2;
    public static final long SpeedTestStateIdle = 0;
    public static final long SpeedTestStateStarted = 1;

    private static final class proxyChangedCallback implements Seq.Proxy, ChangedCallback {
        private final int refnum;

        proxyChangedCallback(int i10) {
            this.refnum = i10;
            Seq.trackGoRef(i10, this);
        }

        @Override // go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        @Override // speedtest.ChangedCallback
        public native void onChanged();
    }

    private static final class proxyDirectoryServerApi implements Seq.Proxy, DirectoryServerApi {
        private final int refnum;

        proxyDirectoryServerApi(int i10) {
            this.refnum = i10;
            Seq.trackGoRef(i10, this);
        }

        @Override // speedtest.DirectoryServerApi
        public native SpeedtestApiAuthenticateResult authenticate();

        @Override // speedtest.DirectoryServerApi
        public native void close();

        @Override // speedtest.DirectoryServerApi
        public native SpeedtestApiIpStats fetchIpStats();

        @Override // speedtest.DirectoryServerApi
        public native InternetServersEvaluation getInternetServers(InternetServersEvaluationParams internetServersEvaluationParams);

        @Override // go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        @Override // speedtest.DirectoryServerApi
        public native SpeedTestApiTestReportResult testReport(SpeedTestApiTestReportClientInfo speedTestApiTestReportClientInfo, SpeedTestApiTestReportServers speedTestApiTestReportServers, Duration duration, LinkSpeed linkSpeed, LinkSpeed linkSpeed2);

        @Override // speedtest.DirectoryServerApi
        public native SpeedTestApiTestReportResult testReportLocal(SpeedTestApiTestReportClientInfo speedTestApiTestReportClientInfo, SpeedtestApiTestReportLocalParams speedtestApiTestReportLocalParams, Duration duration, LinkSpeed linkSpeed, LinkSpeed linkSpeed2);
    }

    private static final class proxyHttpSpeedtestServerApi implements Seq.Proxy, HttpSpeedtestServerApi {
        private final int refnum;

        proxyHttpSpeedtestServerApi(int i10) {
            this.refnum = i10;
            Seq.trackGoRef(i10, this);
        }

        @Override // speedtest.HttpSpeedtestServerApi, speedtest.TcpSpeedtestServerApi
        public native void close();

        @Override // speedtest.HttpSpeedtestServerApi, speedtest.TcpSpeedtestServerApi
        public native SpeedtestServerEvaluation evaluate(SpeedtestServerEvaluationParams speedtestServerEvaluationParams);

        @Override // go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        @Override // speedtest.HttpSpeedtestServerApi
        public native SpeedServerHandshakeResult serverHandshake(String str);

        @Override // speedtest.HttpSpeedtestServerApi, speedtest.TcpSpeedtestServerApi
        public native Speedtest_ testDownload(SpeedtestParams speedtestParams);

        @Override // speedtest.HttpSpeedtestServerApi, speedtest.TcpSpeedtestServerApi
        public native Speedtest_ testUpload(SpeedtestParams speedtestParams);
    }

    private static final class proxyResult implements Seq.Proxy, Result {
        private final int refnum;

        proxyResult(int i10) {
            this.refnum = i10;
            Seq.trackGoRef(i10, this);
        }

        @Override // speedtest.Result
        public native SpeedtestError error();

        @Override // go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }
    }

    private static final class proxySpeedtestParams implements Seq.Proxy, SpeedtestParams {
        private final int refnum;

        proxySpeedtestParams(int i10) {
            this.refnum = i10;
            Seq.trackGoRef(i10, this);
        }

        @Override // speedtest.SpeedtestParams
        public native boolean durationInfinite();

        @Override // speedtest.SpeedtestParams
        public native long durationMaxMillis();

        @Override // speedtest.SpeedtestParams
        public native long durationMinMillis();

        @Override // speedtest.SpeedtestParams
        public native TestServer getServer(long j10);

        @Override // go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        @Override // speedtest.SpeedtestParams
        public native boolean randomTxContent();

        @Override // speedtest.SpeedtestParams
        public native long serverCount();
    }

    private static final class proxySpeedtestStatusCallback implements Seq.Proxy, SpeedtestStatusCallback {
        private final int refnum;

        proxySpeedtestStatusCallback(int i10) {
            this.refnum = i10;
            Seq.trackGoRef(i10, this);
        }

        @Override // go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        @Override // speedtest.SpeedtestStatusCallback
        public native void onChanged(long j10, long j11, long j12, long j13, SpeedtestError speedtestError);
    }

    private static final class proxyTcpSpeedtestServerApi implements Seq.Proxy, TcpSpeedtestServerApi {
        private final int refnum;

        proxyTcpSpeedtestServerApi(int i10) {
            this.refnum = i10;
            Seq.trackGoRef(i10, this);
        }

        @Override // speedtest.TcpSpeedtestServerApi
        public native void close();

        @Override // speedtest.TcpSpeedtestServerApi
        public native SpeedtestServerEvaluation evaluate(SpeedtestServerEvaluationParams speedtestServerEvaluationParams);

        @Override // go.Seq.GoObject
        public final int incRefnum() {
            Seq.incGoRef(this.refnum, this);
            return this.refnum;
        }

        @Override // speedtest.TcpSpeedtestServerApi
        public native Speedtest_ testDownload(SpeedtestParams speedtestParams);

        @Override // speedtest.TcpSpeedtestServerApi
        public native Speedtest_ testUpload(SpeedtestParams speedtestParams);
    }

    static {
        Seq.touch();
        _init();
    }

    private Speedtest() {
    }

    private static native void _init();

    public static native Exception getErrInternal();

    public static native Exception getErrNoServers();

    public static native SpeedtestServer newSpeedtestServer(SpeedtestServerParams speedtestServerParams);

    public static native TcpSpeedTestParamsLocal newTcpSpeedtestParams(String str, long j10, long j11, boolean z10);

    public static native void setDebugLogEnabled(boolean z10, String str);

    public static native void setErrInternal(Exception exc);

    public static native void setErrNoServers(Exception exc);

    public static native void setGOMAXPROCS(long j10);

    public static void touch() {
    }
}
