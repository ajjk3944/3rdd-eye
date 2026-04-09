.class final LPf/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPf/d;-><init>(Lcom/ui/wmw/api/v1/a;LKf/e;LMf/s;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LPf/d;


# direct methods
.method constructor <init>(LPf/d;)V
    .locals 0

    iput-object p1, p0, LPf/d$a;->a:LPf/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ui/wmw/api/v1/ApiV1Device;Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;)LPf/a;
    .locals 11

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stats"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ui/wmw/api/v1/ApiV1Device;->d()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_8

    iget-object v0, p0, LPf/d$a;->a:LPf/d;

    invoke-static {v0}, LPf/d;->d(LPf/d;)LKf/e;

    move-result-object v0

    invoke-virtual {v0}, LKf/e;->n()Lh9/a;

    move-result-object v3

    invoke-virtual {p1}, Lcom/ui/wmw/api/v1/ApiV1Device;->a()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {p1}, Lcom/ui/wmw/api/v1/ApiV1Device;->f()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->a()Ljava/lang/Integer;

    move-result-object v0

    const/high16 v1, 0x42c80000    # 100.0f

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->b()Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->i()Ljava/lang/Boolean;

    move-result-object v7

    const/4 v8, 0x0

    if-eqz v7, :cond_1

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    goto :goto_1

    :cond_1
    move v7, v8

    :goto_1
    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->d()Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;

    move-result-object v9

    sget-object v10, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;->PLUGGED:Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;

    if-ne v9, v10, :cond_2

    const/4 v8, 0x1

    :cond_2
    new-instance v9, LPf/a$a;

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-direct {v9, v0, v6, v8, v7}, LPf/a$a;-><init>(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Boolean;Z)V

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->a()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v1

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->f()Ljava/lang/Integer;

    move-result-object v1

    new-instance v7, LPf/a$b;

    invoke-direct {v7, v0, v1}, LPf/a$b;-><init>(FLjava/lang/Integer;)V

    :try_start_0
    sget-object v0, Lcom/ui/common/semver/SemVer;->i:Lcom/ui/common/semver/SemVer$a;

    invoke-virtual {p1}, Lcom/ui/wmw/api/v1/ApiV1Device;->b()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v0, v1}, Lcom/ui/common/semver/SemVer$a;->a(Ljava/lang/String;)Lcom/ui/common/semver/SemVer;

    move-result-object v8
    :try_end_0
    .catch Lcom/ui/common/semver/SemVer$FormatException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p2}, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;->h()Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    new-instance v0, LPf/a;

    move-object v1, v0

    move-object v6, v9

    move-wide v9, p1

    invoke-direct/range {v1 .. v10}, LPf/a;-><init>(Ljava/lang/String;Lh9/a;Ljava/lang/String;Ljava/lang/String;LPf/a$a;LPf/a$b;Lcom/ui/common/semver/SemVer;J)V

    return-object v0

    :cond_4
    new-instance p1, Lcom/ui/wmw/WMWizard$Error$Session$CommunicationProtocol;

    const-string p2, "stats->uptime==null"

    invoke-direct {p1, p2}, Lcom/ui/wmw/WMWizard$Error$Session$CommunicationProtocol;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :try_start_1
    new-instance p2, Lcom/ui/wmw/WMWizard$Error$Session$CommunicationProtocol;

    const-string v0, "Fw->firmwareVersion==null"

    invoke-direct {p2, v0}, Lcom/ui/wmw/WMWizard$Error$Session$CommunicationProtocol;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catch Lcom/ui/common/semver/SemVer$FormatException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    new-instance p2, Lcom/ui/wmw/WMWizard$Error$Session$CommunicationProtocol;

    invoke-virtual {p1}, Lcom/ui/wmw/api/v1/ApiV1Device;->b()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "firmwareVersion in invalid format "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/ui/wmw/WMWizard$Error$Session$CommunicationProtocol;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    new-instance p1, Lcom/ui/wmw/WMWizard$Error$Session$CommunicationProtocol;

    const-string p2, "Device->proId==null"

    invoke-direct {p1, p2}, Lcom/ui/wmw/WMWizard$Error$Session$CommunicationProtocol;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Lcom/ui/wmw/WMWizard$Error$Session$CommunicationProtocol;

    const-string p2, "Device->bomId==null"

    invoke-direct {p1, p2}, Lcom/ui/wmw/WMWizard$Error$Session$CommunicationProtocol;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Lcom/ui/wmw/WMWizard$Error$Session$CommunicationProtocol;

    const-string p2, "Device->Model==null"

    invoke-direct {p1, p2}, Lcom/ui/wmw/WMWizard$Error$Session$CommunicationProtocol;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wmw/api/v1/ApiV1Device;

    check-cast p2, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;

    invoke-virtual {p0, p1, p2}, LPf/d$a;->a(Lcom/ui/wmw/api/v1/ApiV1Device;Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;)LPf/a;

    move-result-object p1

    return-object p1
.end method
