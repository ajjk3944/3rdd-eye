package speedtest;

/* loaded from: classes2.dex */
public interface DirectoryServerApi {
    SpeedtestApiAuthenticateResult authenticate();

    void close();

    SpeedtestApiIpStats fetchIpStats();

    InternetServersEvaluation getInternetServers(InternetServersEvaluationParams internetServersEvaluationParams);

    SpeedTestApiTestReportResult testReport(SpeedTestApiTestReportClientInfo speedTestApiTestReportClientInfo, SpeedTestApiTestReportServers speedTestApiTestReportServers, Duration duration, LinkSpeed linkSpeed, LinkSpeed linkSpeed2);

    SpeedTestApiTestReportResult testReportLocal(SpeedTestApiTestReportClientInfo speedTestApiTestReportClientInfo, SpeedtestApiTestReportLocalParams speedtestApiTestReportLocalParams, Duration duration, LinkSpeed linkSpeed, LinkSpeed linkSpeed2);
}
