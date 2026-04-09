.class public final synthetic Lxd/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lle/i;

    invoke-static {p1}, Lxd/d$i$a;->a(Lle/i;)Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvConnection;

    move-result-object p1

    return-object p1
.end method
