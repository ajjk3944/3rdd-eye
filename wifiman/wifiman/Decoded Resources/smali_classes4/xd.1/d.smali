.class public final Lxd/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxd/d$a;
    }
.end annotation


# instance fields
.field private final a:Ltd/d;

.field private final b:LCc/n;

.field private final c:Lpc/a;

.field private final d:LDc/e;

.field private final e:Ldc/a;

.field private final f:Ldc/a;


# direct methods
.method public constructor <init>(Ltd/d;LCc/n;Lpc/a;LDc/e;Ldc/a;Ldc/a;)V
    .locals 1

    const-string v0, "speedtestApiFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkDiscovery"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appBuildConfiguration"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buildConfig"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxd/d;->a:Ltd/d;

    iput-object p2, p0, Lxd/d;->b:LCc/n;

    iput-object p3, p0, Lxd/d;->c:Lpc/a;

    iput-object p4, p0, Lxd/d;->d:LDc/e;

    iput-object p5, p0, Lxd/d;->e:Ldc/a;

    iput-object p6, p0, Lxd/d;->f:Ldc/a;

    return-void
.end method

.method public static final synthetic a(Lxd/d;)Ldc/a;
    .locals 0

    iget-object p0, p0, Lxd/d;->e:Ldc/a;

    return-object p0
.end method

.method public static final synthetic b(Lxd/d;)Ldc/a;
    .locals 0

    iget-object p0, p0, Lxd/d;->f:Ldc/a;

    return-object p0
.end method

.method public static final synthetic c(Lxd/d;)LCc/n;
    .locals 0

    iget-object p0, p0, Lxd/d;->b:LCc/n;

    return-object p0
.end method

.method public static final synthetic d(Lxd/d;)Lpc/a;
    .locals 0

    iget-object p0, p0, Lxd/d;->c:Lpc/a;

    return-object p0
.end method

.method public static final synthetic e(Lxd/d;)LDc/e;
    .locals 0

    iget-object p0, p0, Lxd/d;->d:LDc/e;

    return-object p0
.end method

.method public static final synthetic f(Lxd/d;)Ltd/d;
    .locals 0

    iget-object p0, p0, Lxd/d;->a:Ltd/d;

    return-object p0
.end method

.method private final h()Lgg/z;
    .locals 2

    new-instance v0, Lxd/d$b;

    invoke-direct {v0}, Lxd/d$b;-><init>()V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final i(Lqd/d;)Lgg/z;
    .locals 2

    new-instance v0, Lxd/d$c;

    invoke-direct {v0, p0}, Lxd/d$c;-><init>(Lxd/d;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lxd/d$d;->a:Lxd/d$d;

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v0

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgg/z;->O(Lgg/y;)Lgg/z;

    move-result-object v0

    new-instance v1, Lxd/d$e;

    invoke-direct {v1, p0, p1}, Lxd/d$e;-><init>(Lxd/d;Lqd/d;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    sget-object v0, Lxd/d$f;->a:Lxd/d$f;

    invoke-virtual {p1, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final j(Lcom/ui/wifiman/model/speedtest/internet/f;Lxd/c;)Lgg/z;
    .locals 3

    sget-object v0, Lcom/ubnt/usurvey/a;->r:Lcom/ubnt/usurvey/a$a;

    invoke-virtual {v0}, Lcom/ubnt/usurvey/a$a;->a()Lcom/ubnt/usurvey/a$b;

    move-result-object v0

    invoke-interface {v0}, Lcom/ubnt/usurvey/a$b;->b()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    sget-object v1, Lxd/d$g;->a:Lxd/d$g;

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    iget-object v1, p0, Lxd/d;->b:LCc/n;

    invoke-interface {v1}, LCc/n;->b()Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    sget-object v2, Lxd/d$h;->a:Lxd/d$h;

    invoke-static {v0, v1, v2}, Lgg/z;->e0(Lgg/D;Lgg/D;Lkg/b;)Lgg/z;

    move-result-object v0

    new-instance v1, Lxd/d$i;

    invoke-direct {v1, p0, p1, p2}, Lxd/d$i;-><init>(Lxd/d;Lcom/ui/wifiman/model/speedtest/internet/f;Lxd/c;)V

    invoke-virtual {v0, v1}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string p2, "flatMap(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final k()Lgg/z;
    .locals 2

    new-instance v0, Lxd/d$j;

    invoke-direct {v0}, Lxd/d$j;-><init>()V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object v0

    const-string v1, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public g(Lcom/ui/wifiman/model/speedtest/Speedtest$d;Lxd/c;)Lgg/z;
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lqd/d;

    if-eqz v0, :cond_0

    check-cast p1, Lqd/d;

    invoke-direct {p0, p1}, Lxd/d;->i(Lqd/d;)Lgg/z;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/ui/wifiman/model/speedtest/internet/f;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/ui/wifiman/model/speedtest/internet/f;

    invoke-direct {p0, p1, p2}, Lxd/d;->j(Lcom/ui/wifiman/model/speedtest/internet/f;Lxd/c;)Lgg/z;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of p2, p1, LCd/n;

    if-eqz p2, :cond_2

    invoke-direct {p0}, Lxd/d;->k()Lgg/z;

    move-result-object p1

    goto :goto_0

    :cond_2
    instance-of p1, p1, Lcom/ui/wifiman/model/speedtest/advanced/b;

    if-eqz p1, :cond_3

    invoke-direct {p0}, Lxd/d;->h()Lgg/z;

    move-result-object p1

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "unknown speedtest state type"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lgg/z;->p(Ljava/lang/Throwable;)Lgg/z;

    move-result-object p1

    const-string p2, "error(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method
