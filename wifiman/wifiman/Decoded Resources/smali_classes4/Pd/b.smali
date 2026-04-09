.class public final synthetic LPd/b;
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

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;

    invoke-static {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus;->a(Lcom/ui/wifiman/model/ubiquiti/cloud/status/api/ApiUbiquitiCloudStatus$Component;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
