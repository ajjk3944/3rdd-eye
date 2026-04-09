.class public interface abstract Lspeedtest/HttpSpeedtestServerApi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lspeedtest/TcpSpeedtestServerApi;


# virtual methods
.method public abstract close()V
.end method

.method public abstract evaluate(Lspeedtest/SpeedtestServerEvaluationParams;)Lspeedtest/SpeedtestServerEvaluation;
.end method

.method public abstract serverHandshake(Ljava/lang/String;)Lspeedtest/SpeedServerHandshakeResult;
.end method

.method public abstract testDownload(Lspeedtest/SpeedtestParams;)Lspeedtest/Speedtest_;
.end method

.method public abstract testUpload(Lspeedtest/SpeedtestParams;)Lspeedtest/Speedtest_;
.end method
