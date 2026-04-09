.class public final LJ7/m$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ7/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LJ7/m$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;)Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;
    .locals 16

    const-string v0, "<this>"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;->c()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Reachability;->a()Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, v2

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;->b()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;->f()Ljava/lang/String;

    move-result-object v0

    move-object v5, v0

    goto :goto_1

    :cond_1
    move-object v5, v2

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;->b()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;->g()Ljava/lang/String;

    move-result-object v0

    move-object v6, v0

    goto :goto_2

    :cond_2
    move-object v6, v2

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;->b()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;->i()Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    goto :goto_3

    :cond_3
    move-object v7, v2

    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;->b()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;->c()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_5

    :cond_4
    :goto_4
    move-object v8, v0

    goto :goto_6

    :cond_5
    :goto_5
    invoke-virtual/range {p1 .. p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;->b()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;->b()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_6
    move-object v8, v2

    :goto_6
    invoke-virtual/range {p1 .. p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;->b()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;->a()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    long-to-int v0, v9

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v9, v0

    goto :goto_7

    :cond_7
    move-object v9, v2

    :goto_7
    invoke-virtual/range {p1 .. p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;->b()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;->h()Ljava/lang/String;

    move-result-object v0

    move-object v10, v0

    goto :goto_8

    :cond_8
    move-object v10, v2

    :goto_8
    invoke-virtual/range {p1 .. p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;->d()Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;->b()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;->d()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Location;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Location;->a()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-static {v3}, Lkotlin/text/t;->n(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v3

    goto :goto_9

    :cond_9
    move-object v3, v2

    :goto_9
    if-eqz v3, :cond_b

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Location;->b()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_a

    invoke-static {v3}, Lkotlin/text/t;->n(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v3

    goto :goto_a

    :cond_a
    move-object v3, v2

    :goto_a
    if-eqz v3, :cond_b

    new-instance v3, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$a;

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Location;->a()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lkotlin/text/t;->n(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v12

    invoke-static {v12}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v12}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v12

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Location;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/text/t;->n(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v14

    invoke-direct {v3, v12, v13, v14, v15}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$a;-><init>(DD)V

    goto :goto_b

    :cond_b
    move-object v3, v2

    :goto_b
    move-object v12, v3

    goto :goto_c

    :cond_c
    move-object v12, v2

    :goto_c
    invoke-virtual/range {p1 .. p1}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo;->b()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Metadata;->d()Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Location;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Lcom/ubnt/teleport/unifi/cloud/api/ApiTeleportSiteInfo$Location;->c()Ljava/lang/String;

    move-result-object v2

    :cond_d
    move-object v13, v2

    new-instance v0, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;

    move-object v3, v0

    invoke-direct/range {v3 .. v13}, Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$b;Lcom/ubnt/teleport/unifi/cloud/TeleportCloud$b$a;Ljava/lang/String;)V

    return-object v0
.end method
