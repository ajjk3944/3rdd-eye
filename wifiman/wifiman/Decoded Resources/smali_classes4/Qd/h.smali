.class public final synthetic LQd/h;
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

    check-cast p1, Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$a;

    invoke-static {p1}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;->d(Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$a;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method
