.class final Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$c;->a(Ljava/lang/Boolean;)LDj/a;
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

    iput-object p1, p0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$c$a;->a:Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;LLd/e;LWc/b;)Lgg/b;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$c$a;->d(Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;LLd/e;LWc/b;)Lgg/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LWc/b;LWc/b;)LWc/b;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$c$a;->e(LWc/b;LWc/b;)LWc/b;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;LLd/e;LWc/b;)Lgg/b;
    .locals 1

    const-string v0, "fetch"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, LWc/b$a$b;

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;->g(Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;)LQd/e;

    move-result-object p0

    check-cast p2, LWc/b$a$b;

    invoke-virtual {p2}, LWc/b$a$b;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$a;

    invoke-virtual {p2}, Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$a;->b()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1}, LLd/e;->a()Ljava/util/UUID;

    move-result-object p1

    invoke-interface {p0, p2, p1}, LQd/e;->c(Ljava/util/List;Ljava/util/UUID;)Lgg/b;

    move-result-object p0

    goto :goto_1

    :cond_0
    instance-of p1, p2, LWc/b$c;

    const-string v0, "complete(...)"

    if-nez p1, :cond_4

    instance-of p1, p2, LWc/b$b;

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    instance-of p1, p2, LWc/b$a$a;

    if-eqz p1, :cond_3

    check-cast p2, LWc/b$a$a;

    invoke-virtual {p2}, LWc/b$a$a;->c()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p1, p1, Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient$Error$Unauthorized;

    if-eqz p1, :cond_2

    invoke-static {p0}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;->g(Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;)LQd/e;

    move-result-object p0

    invoke-interface {p0}, LQd/e;->d()Lgg/b;

    move-result-object p0

    goto :goto_1

    :cond_2
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_4
    :goto_0
    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p0

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    return-object p0
.end method

.method private static final e(LWc/b;LWc/b;)LWc/b;
    .locals 1

    const-string v0, "previous"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "current"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LWc/b$a$b;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, LWc/b$b;

    if-eqz v0, :cond_1

    instance-of v0, p0, LWc/b$a;

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    move-object p0, p1

    :goto_1
    return-object p0
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ll9/a;

    invoke-virtual {p0, p1}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$c$a;->c(Ll9/a;)LDj/a;

    move-result-object p1

    return-object p1
.end method

.method public final c(Ll9/a;)LDj/a;
    .locals 3

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LLd/e;

    if-nez p1, :cond_0

    new-instance p1, LWc/b$a$a;

    sget-object v0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$InternalError$SSOSessionUnavailable;->a:Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$InternalError$SSOSessionUnavailable;

    invoke-direct {p1, v0}, LWc/b$a$a;-><init>(Ljava/lang/Throwable;)V

    invoke-static {p1}, Lgg/i;->K0(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    const-string v0, "just(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$c$a;->a:Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;

    invoke-virtual {p1}, LLd/e;->b()Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;->f(Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;Lcom/ui/wifiman/model/ubiquiti/cloud/UnifiCloudClient;)Lgg/i;

    move-result-object v0

    iget-object v1, p0, Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl$c$a;->a:Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;

    new-instance v2, Lcom/ui/wifiman/model/ubiquiti/console/c;

    invoke-direct {v2, v1, p1}, Lcom/ui/wifiman/model/ubiquiti/console/c;-><init>(Lcom/ui/wifiman/model/ubiquiti/console/UnifiCloudConsoleServiceImpl;LLd/e;)V

    invoke-static {v0, v2}, Ln9/c;->c(Lgg/i;Lmh/l;)Lgg/i;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/ubiquiti/console/d;

    invoke-direct {v0}, Lcom/ui/wifiman/model/ubiquiti/console/d;-><init>()V

    invoke-virtual {p1, v0}, Lgg/i;->r1(Lkg/b;)Lgg/i;

    move-result-object p1

    const-string v0, "scan(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method
