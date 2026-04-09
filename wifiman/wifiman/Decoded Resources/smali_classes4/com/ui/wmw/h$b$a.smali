.class final Lcom/ui/wmw/h$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wmw/h$b;->a(Lcom/ui/wmw/api/ApiVersion;)Lgg/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wmw/h;

.field final synthetic b:Lcom/ui/wmw/api/ApiVersion;


# direct methods
.method constructor <init>(Lcom/ui/wmw/h;Lcom/ui/wmw/api/ApiVersion;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wmw/h$b$a;->a:Lcom/ui/wmw/h;

    iput-object p2, p0, Lcom/ui/wmw/h$b$a;->b:Lcom/ui/wmw/api/ApiVersion;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/ui/wmw/api/v1/ApiV1Device;

    check-cast p2, Lcom/ui/wmw/api/v1/ApiV1Firmware;

    check-cast p3, Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;

    check-cast p4, Lcom/ui/wmw/api/v1/ApiV1Settings;

    check-cast p5, Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;

    invoke-virtual/range {p0 .. p5}, Lcom/ui/wmw/h$b$a;->b(Lcom/ui/wmw/api/v1/ApiV1Device;Lcom/ui/wmw/api/v1/ApiV1Firmware;Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;Lcom/ui/wmw/api/v1/ApiV1Settings;Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;)Lcom/ui/wmw/k;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/ui/wmw/api/v1/ApiV1Device;Lcom/ui/wmw/api/v1/ApiV1Firmware;Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;Lcom/ui/wmw/api/v1/ApiV1Settings;Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;)Lcom/ui/wmw/k;
    .locals 14

    move-object v0, p0

    const-string v1, "device"

    move-object v6, p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "fw"

    move-object/from16 v7, p2

    invoke-static {v7, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "stats"

    move-object/from16 v9, p3

    invoke-static {v9, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "settings"

    move-object/from16 v8, p4

    invoke-static {v8, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "bleSettings"

    move-object/from16 v10, p5

    invoke-static {v10, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/ui/wmw/k;

    iget-object v2, v0, Lcom/ui/wmw/h$b$a;->a:Lcom/ui/wmw/h;

    invoke-static {v2}, Lcom/ui/wmw/h;->c(Lcom/ui/wmw/h;)Ljava/lang/String;

    move-result-object v11

    iget-object v2, v0, Lcom/ui/wmw/h$b$a;->a:Lcom/ui/wmw/h;

    invoke-static {v2}, Lcom/ui/wmw/h;->a(Lcom/ui/wmw/h;)Lcom/ui/wmw/api/v1/a;

    move-result-object v12

    iget-object v2, v0, Lcom/ui/wmw/h$b$a;->a:Lcom/ui/wmw/h;

    invoke-static {v2}, Lcom/ui/wmw/h;->b(Lcom/ui/wmw/h;)Lh9/a;

    move-result-object v3

    sget-object v2, Lcom/ui/common/semver/SemVer;->i:Lcom/ui/common/semver/SemVer$a;

    iget-object v4, v0, Lcom/ui/wmw/h$b$a;->b:Lcom/ui/wmw/api/ApiVersion;

    invoke-virtual {v4}, Lcom/ui/wmw/api/ApiVersion;->b()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v2, v4}, Lcom/ui/common/semver/SemVer$a;->a(Ljava/lang/String;)Lcom/ui/common/semver/SemVer;

    move-result-object v4

    iget-object v5, v0, Lcom/ui/wmw/h$b$a;->b:Lcom/ui/wmw/api/ApiVersion;

    invoke-static {v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    new-instance v13, LKf/e;

    move-object v2, v13

    move-object v6, p1

    move-object/from16 v7, p2

    move-object/from16 v8, p4

    move-object/from16 v9, p3

    move-object/from16 v10, p5

    invoke-direct/range {v2 .. v10}, LKf/e;-><init>(Lh9/a;Lcom/ui/common/semver/SemVer;Lcom/ui/wmw/api/ApiVersion;Lcom/ui/wmw/api/v1/ApiV1Device;Lcom/ui/wmw/api/v1/ApiV1Firmware;Lcom/ui/wmw/api/v1/ApiV1Settings;Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;)V

    const/4 v2, 0x0

    invoke-direct {v1, v11, v12, v13, v2}, Lcom/ui/wmw/k;-><init>(Ljava/lang/String;Lcom/ui/wmw/api/v1/a;LKf/e;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Firmware version availability should be already checked"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
