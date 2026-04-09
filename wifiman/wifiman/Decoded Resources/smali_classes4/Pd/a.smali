.class public final synthetic LPd/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;


# direct methods
.method public synthetic constructor <init>(Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPd/a;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LPd/a;->a:Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;

    invoke-static {v0}, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;->b(Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
