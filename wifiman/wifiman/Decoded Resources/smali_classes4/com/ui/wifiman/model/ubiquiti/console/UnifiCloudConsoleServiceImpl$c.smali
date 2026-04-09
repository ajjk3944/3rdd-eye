.class final Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;-><init>(LLd/f;LQd/e;LZc/f;Lfe/u;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LLd/f;

.field final synthetic b:Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;


# direct methods
.method constructor <init>(LLd/f;Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$c;->a:LLd/f;

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$c;->b:Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)LDj/a;
    .locals 2

    const-string v0, "isNetworkConnected"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    new-instance p1, LWc/b$a$a;

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$InternalError$NetworkConnectionUnavailable;->a:Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$InternalError$NetworkConnectionUnavailable;

    invoke-direct {p1, v0}, LWc/b$a$a;-><init>(Ljava/lang/Throwable;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$c;->a:LLd/f;

    invoke-interface {p1}, LLd/f;->a()Lgg/i;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$c$a;

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$c;->b:Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$c$a;-><init>(Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;)V

    invoke-virtual {p1, v0}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$c;->a(Ljava/lang/Boolean;)LDj/a;

    move-result-object p1

    return-object p1
.end method
