.class final Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;->i(Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;


# direct methods
.method constructor <init>(Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$f;->a:Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/s;)Lgg/v;
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$f;->a:Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;

    invoke-static {v1}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;->h(Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;)Lfe/u;

    move-result-object v1

    invoke-interface {v1}, Lfe/u;->a()Lgg/y;

    move-result-object v1

    const-wide/16 v2, 0xa

    invoke-virtual {p1, v2, v3, v0, v1}, Lgg/s;->s(JLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgg/s;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$f;->a(Lgg/s;)Lgg/v;

    move-result-object p1

    return-object p1
.end method
