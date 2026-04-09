.class public interface abstract Lspeedtest/DirectoryServerApi;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract authenticate()Lspeedtest/SpeedtestApiAuthenticateResult;
.end method

.method public abstract close()V
.end method

.method public abstract fetchIpStats()Lspeedtest/SpeedtestApiIpStats;
.end method

.method public abstract getInternetServers(Lspeedtest/InternetServersEvaluationParams;)Lspeedtest/InternetServersEvaluation;
.end method

.method public abstract testReport(Lspeedtest/SpeedTestApiTestReportClientInfo;Lspeedtest/SpeedTestApiTestReportServers;Lspeedtest/Duration;Lspeedtest/LinkSpeed;Lspeedtest/LinkSpeed;)Lspeedtest/SpeedTestApiTestReportResult;
.end method

.method public abstract testReportLocal(Lspeedtest/SpeedTestApiTestReportClientInfo;Lspeedtest/SpeedtestApiTestReportLocalParams;Lspeedtest/Duration;Lspeedtest/LinkSpeed;Lspeedtest/LinkSpeed;)Lspeedtest/SpeedTestApiTestReportResult;
.end method
