.class public interface abstract Lspeedtest/TcpSpeedtestServerApi;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract close()V
.end method

.method public abstract evaluate(Lspeedtest/SpeedtestServerEvaluationParams;)Lspeedtest/SpeedtestServerEvaluation;
.end method

.method public abstract testDownload(Lspeedtest/SpeedtestParams;)Lspeedtest/Speedtest_;
.end method

.method public abstract testUpload(Lspeedtest/SpeedtestParams;)Lspeedtest/Speedtest_;
.end method
