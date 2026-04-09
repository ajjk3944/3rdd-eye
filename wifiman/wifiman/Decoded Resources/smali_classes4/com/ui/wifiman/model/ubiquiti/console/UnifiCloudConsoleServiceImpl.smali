.class public final Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ui/wifiman/model/ubiquiti/console/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$a;,
        Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$InternalError;
    }
.end annotation


# static fields
.field public static final h:Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$a;


# instance fields
.field private final a:LQd/e;

.field private final b:LZc/f;

.field private final c:Lfe/u;

.field private final d:Lgg/i;

.field private final e:Lgg/i;

.field private final f:Lgg/i;

.field private final g:Lgg/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;->h:Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$a;

    return-void
.end method

.method public constructor <init>(LLd/f;LQd/e;LZc/f;Lfe/u;)V
    .locals 3

    const-string v0, "cloud"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cache"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkConnectionManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "schedulers"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;->a:LQd/e;

    iput-object p3, p0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;->b:LZc/f;

    iput-object p4, p0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;->c:Lfe/u;

    invoke-interface {p3}, LZc/f;->getState()Lgg/i;

    move-result-object p3

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$b;->a:Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$b;

    invoke-virtual {p3, v0}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p3

    invoke-virtual {p3}, Lgg/i;->W()Lgg/i;

    move-result-object p3

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$c;

    invoke-direct {v0, p1, p0}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$c;-><init>(LLd/f;Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;)V

    invoke-virtual {p3, v0}, Lgg/i;->I1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-interface {p4}, Lfe/u;->a()Lgg/y;

    move-result-object p3

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p1, p3, v0, v1}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    const-string p3, "refCount(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;->d:Lgg/i;

    invoke-interface {p2}, LQd/e;->a()Lgg/i;

    move-result-object p2

    sget-object v2, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$d;->a:Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$d;

    invoke-static {p1, p2, v2}, Lgg/i;->v(LDj/a;LDj/a;Lkg/b;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->e1()Lgg/i;

    move-result-object p2

    invoke-interface {p4}, Lfe/u;->a()Lgg/y;

    move-result-object p4

    invoke-virtual {p2, p4, v0, v1}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    invoke-virtual {p2, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljg/a;->i2()Lgg/i;

    move-result-object p2

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;->e:Lgg/i;

    new-instance p2, LQd/h;

    invoke-direct {p2}, LQd/h;-><init>()V

    invoke-static {p1, p2}, Lfe/h;->j(Lgg/i;Lmh/l;)Lgg/i;

    move-result-object p2

    invoke-virtual {p2}, Lgg/i;->W()Lgg/i;

    move-result-object p2

    invoke-virtual {p2, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p2

    invoke-virtual {p2}, Ljg/a;->i2()Lgg/i;

    move-result-object p2

    invoke-static {p2, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;->f:Lgg/i;

    sget-object p2, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$g;->a:Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$g;

    invoke-virtual {p1, p2}, Lgg/i;->K(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    invoke-virtual {p1, v1}, Lgg/i;->o1(I)Ljg/a;

    move-result-object p1

    invoke-virtual {p1}, Ljg/a;->i2()Lgg/i;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;->g:Lgg/i;

    return-void
.end method

.method public static synthetic d(Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$a;)Ljava/util/Map;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;->k(Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$a;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Throwable;)Lgg/z;
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;->j(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient;)Lgg/i;
    .locals 0

    invoke-direct {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;->i(Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient;)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;)LQd/e;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;->a:LQd/e;

    return-object p0
.end method

.method public static final synthetic h(Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;)Lfe/u;
    .locals 0

    iget-object p0, p0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;->c:Lfe/u;

    return-object p0
.end method

.method private final i(Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient;)Lgg/i;
    .locals 1

    invoke-interface {p1}, Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient;->a()Lgg/z;

    move-result-object p1

    new-instance v0, LQd/g;

    invoke-direct {v0}, LQd/g;-><init>()V

    invoke-static {p1, v0}, Lfe/h;->d(Lgg/z;Lmh/l;)Lgg/s;

    move-result-object p1

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$e;->a:Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$e;

    invoke-virtual {p1, v0}, Lgg/s;->q0(Lkg/n;)Lgg/s;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$f;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$f;-><init>(Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;)V

    invoke-virtual {p1, v0}, Lgg/s;->v0(Lkg/n;)Lgg/s;

    move-result-object p1

    sget-object v0, Lgg/a;->LATEST:Lgg/a;

    invoke-virtual {p1, v0}, Lgg/s;->d1(Lgg/a;)Lgg/i;

    move-result-object p1

    const-string v0, "toFlowable(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private static final j(Ljava/lang/Throwable;)Lgg/z;
    .locals 1

    const-string v0, "er"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ljava/lang/RuntimeException;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/lang/RuntimeException;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p0, v0

    :cond_2
    :goto_1
    nop

    instance-of v0, p0, Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;

    if-eqz v0, :cond_3

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$Error$Unauthorized;

    check-cast p0, Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$Error$Unauthorized;-><init>(Lcom/ui/unifi/core/http/exceptions/UnauthorisedException;)V

    invoke-static {v0}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p0

    goto :goto_3

    :cond_3
    instance-of v0, p0, Lretrofit2/HttpException;

    if-nez v0, :cond_5

    instance-of v0, p0, Ljava/io/IOException;

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {p0}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p0

    goto :goto_3

    :cond_5
    :goto_2
    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$Error$IO;

    invoke-direct {v0, p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$Error$IO;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v0}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p0

    :goto_3
    invoke-static {p0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object p0
.end method

.method private static final k(Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$a;)Ljava/util/Map;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$a;->a()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;->e:Lgg/i;

    return-object v0
.end method

.method public b()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;->g:Lgg/i;

    return-object v0
.end method

.method public c()Lgg/i;
    .locals 1

    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;->f:Lgg/i;

    return-object v0
.end method
