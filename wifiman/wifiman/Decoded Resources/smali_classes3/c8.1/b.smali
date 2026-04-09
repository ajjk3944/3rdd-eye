.class public interface abstract Lc8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J5\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\n\u0008\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005H\'\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lc8/b;",
        "",
        "",
        "token",
        "userAgent",
        "Lcom/ubnt/usurvey/speedtest/model/SpeedTestReport;",
        "params",
        "Lgg/z;",
        "Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportResult;",
        "a",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/ubnt/usurvey/speedtest/model/SpeedTestReport;)Lgg/z;",
        "speedtest-api_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract a(Ljava/lang/String;Ljava/lang/String;Lcom/ubnt/usurvey/speedtest/model/SpeedTestReport;)Lgg/z;
    .param p1    # Ljava/lang/String;
        .annotation runtime LRj/i;
            value = "x-test-token"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime LRj/i;
            value = "User-Agent"
        .end annotation
    .end param
    .param p3    # Lcom/ubnt/usurvey/speedtest/model/SpeedTestReport;
        .annotation runtime LRj/a;
        .end annotation
    .end param
    .annotation runtime LRj/o;
        value = "/api/v2/results"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/ubnt/usurvey/speedtest/model/SpeedTestReport;",
            ")",
            "Lgg/z<",
            "Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportResult;",
            ">;"
        }
    .end annotation
.end method
