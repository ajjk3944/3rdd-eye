.class public final Lyd/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyd/a;


# instance fields
.field private final a:Lcom/ui/wifiman/model/speedtest/result/e;

.field private final b:LZc/f;

.field private final c:Lje/u;

.field private final d:LCc/n;

.field private final e:Ljd/b;

.field private final f:LDc/e;

.field private final g:Lle/g;

.field private final h:Lgg/i;


# direct methods
.method public constructor <init>(Lcom/ui/wifiman/model/speedtest/result/e;LZc/f;Lje/u;LCc/n;Ljd/b;LDc/e;Lle/g;Lkd/d;)V
    .locals 1

    const-string v0, "resultManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkConnection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wifiConnectionService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "topology"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkDiscovery"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wifiScannerService"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "publicIpService"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyd/b;->a:Lcom/ui/wifiman/model/speedtest/result/e;

    iput-object p2, p0, Lyd/b;->b:LZc/f;

    iput-object p3, p0, Lyd/b;->c:Lje/u;

    iput-object p4, p0, Lyd/b;->d:LCc/n;

    iput-object p5, p0, Lyd/b;->e:Ljd/b;

    iput-object p6, p0, Lyd/b;->f:LDc/e;

    iput-object p7, p0, Lyd/b;->g:Lle/g;

    invoke-interface {p8}, Lkd/d;->a()Lgg/i;

    move-result-object p1

    sget-object p2, Lyd/b$h;->a:Lyd/b$h;

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    const-string p2, "map(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lyd/b;->h:Lgg/i;

    return-void
.end method

.method public static final synthetic c(Lyd/b;Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;)Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;
    .locals 0

    invoke-direct {p0, p1}, Lyd/b;->i(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;)Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lyd/b;)Lcom/ui/wifiman/model/speedtest/result/e;
    .locals 0

    iget-object p0, p0, Lyd/b;->a:Lcom/ui/wifiman/model/speedtest/result/e;

    return-object p0
.end method

.method public static final synthetic e(Lyd/b;LCd/n;)Lgg/z;
    .locals 0

    invoke-direct {p0, p1}, Lyd/b;->p(LCd/n;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lyd/b;Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/z;
    .locals 0

    invoke-direct {p0, p1}, Lyd/b;->q(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Lyd/b;Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/z;
    .locals 0

    invoke-direct {p0, p1}, Lyd/b;->r(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(Lyd/b;Lqd/d;)Lgg/z;
    .locals 0

    invoke-direct {p0, p1}, Lyd/b;->s(Lqd/d;)Lgg/z;

    move-result-object p0

    return-object p0
.end method

.method private final i(Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;)Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;
    .locals 7

    new-instance v6, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->n()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/ui/wifiman/model/speedtest/internet/InternetSpeedtest$b$b;->d()Ljava/lang/String;

    move-result-object v5

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/ui/wifiman/model/speedtest/result/b$b$b$b$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v6
.end method

.method private final j(LCd/n;)Lgg/z;
    .locals 2

    iget-object v0, p0, Lyd/b;->f:LDc/e;

    invoke-interface {v0}, LDc/e;->b()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lyd/b$a;

    invoke-direct {v1, p1}, Lyd/b$a;-><init>(LCd/n;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final k(Lqd/d;)Lgg/z;
    .locals 2

    iget-object v0, p0, Lyd/b;->f:LDc/e;

    invoke-interface {v0}, LDc/e;->b()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lyd/b$b;

    invoke-direct {v1, p1}, Lyd/b$b;-><init>(Lqd/d;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final l(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/z;
    .locals 2

    iget-object v0, p0, Lyd/b;->f:LDc/e;

    invoke-interface {v0}, LDc/e;->b()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lyd/b$c;

    invoke-direct {v1, p1}, Lyd/b$c;-><init>(Lcom/ui/wifiman/model/speedtest/advanced/b;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final m(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lgg/z;
    .locals 1

    new-instance v0, Lyd/b$d;

    invoke-direct {v0, p1}, Lyd/b$d;-><init>(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyd/b$e;

    invoke-direct {v0, p0}, Lyd/b$e;-><init>(Lyd/b;)V

    invoke-virtual {p1, v0}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string v0, "flatMap(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final n(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/z;
    .locals 2

    iget-object v0, p0, Lyd/b;->h:Lgg/i;

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lyd/b$g;

    invoke-direct {v1, p1}, Lyd/b$g;-><init>(Lcom/ui/wifiman/model/speedtest/advanced/b;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final o(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/z;
    .locals 2

    iget-object v0, p0, Lyd/b;->h:Lgg/i;

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    new-instance v1, Lyd/b$f;

    invoke-direct {v1, p1, p0}, Lyd/b$f;-><init>(Lcom/ui/wifiman/model/speedtest/internet/f;Lyd/b;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final p(LCd/n;)Lgg/z;
    .locals 2

    invoke-direct {p0, p1}, Lyd/b;->j(LCd/n;)Lgg/z;

    move-result-object v0

    new-instance v1, Lyd/b$j;

    invoke-direct {v1, p1}, Lyd/b$j;-><init>(LCd/n;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final q(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/z;
    .locals 3

    invoke-direct {p0, p1}, Lyd/b;->n(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/z;

    move-result-object v0

    invoke-direct {p0, p1}, Lyd/b;->l(Lcom/ui/wifiman/model/speedtest/advanced/b;)Lgg/z;

    move-result-object v1

    new-instance v2, Lyd/b$l;

    invoke-direct {v2, p1}, Lyd/b$l;-><init>(Lcom/ui/wifiman/model/speedtest/advanced/b;)V

    invoke-static {v0, v1, v2}, Lgg/z;->e0(Lgg/D;Lgg/D;Lkg/b;)Lgg/z;

    move-result-object p1

    const-string v0, "zip(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final r(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/z;
    .locals 2

    invoke-direct {p0, p1}, Lyd/b;->o(Lcom/ui/wifiman/model/speedtest/internet/f;)Lgg/z;

    move-result-object v0

    new-instance v1, Lyd/b$i;

    invoke-direct {v1, p1}, Lyd/b$i;-><init>(Lcom/ui/wifiman/model/speedtest/internet/f;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final s(Lqd/d;)Lgg/z;
    .locals 2

    invoke-direct {p0, p1}, Lyd/b;->k(Lqd/d;)Lgg/z;

    move-result-object v0

    new-instance v1, Lyd/b$k;

    invoke-direct {v1, p1}, Lyd/b$k;-><init>(Lqd/d;)V

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    const-string v0, "map(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public a(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lgg/i;
    .locals 2

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyd/b$r;

    invoke-direct {v0, p1}, Lyd/b$r;-><init>(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyd/b$s;

    invoke-direct {v0, p0}, Lyd/b$s;-><init>(Lyd/b;)V

    invoke-virtual {p1, v0}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    sget-object v0, Lyd/b$t;->a:Lyd/b$t;

    invoke-virtual {p1, v0}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->W()Lgg/i;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    const-string v0, "startWithItem(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public b(Lcom/ui/wifiman/model/speedtest/Speedtest$d;LW7/b;)Lgg/i;
    .locals 8

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lyd/b;->m(Lcom/ui/wifiman/model/speedtest/Speedtest$d;)Lgg/z;

    move-result-object v1

    iget-object v0, p0, Lyd/b;->b:LZc/f;

    invoke-interface {v0}, LZc/f;->getState()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v2

    iget-object v0, p0, Lyd/b;->c:Lje/u;

    invoke-interface {v0}, Lje/u;->a()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v3

    iget-object v0, p0, Lyd/b;->d:LCc/n;

    invoke-interface {v0}, LCc/n;->b()Lgg/i;

    move-result-object v0

    sget-object v4, Lyd/b$m;->a:Lyd/b$m;

    invoke-virtual {v0, v4}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->W()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v4

    iget-object v0, p0, Lyd/b;->e:Ljd/b;

    invoke-interface {v0}, Ljd/b;->c()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v5

    iget-object v0, p0, Lyd/b;->g:Lle/g;

    invoke-interface {v0}, Lle/g;->b()Lgg/i;

    move-result-object v0

    sget-object v6, Lyd/b$n;->a:Lyd/b$n;

    invoke-virtual {v0, v6}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v6

    new-instance v7, Lyd/b$o;

    invoke-direct {v7, p2, p1}, Lyd/b$o;-><init>(LW7/b;Lcom/ui/wifiman/model/speedtest/Speedtest$d;)V

    invoke-static/range {v1 .. v7}, Lgg/z;->b0(Lgg/D;Lgg/D;Lgg/D;Lgg/D;Lgg/D;Lgg/D;Lkg/j;)Lgg/z;

    move-result-object p1

    new-instance p2, Lyd/b$p;

    invoke-direct {p2, p0}, Lyd/b$p;-><init>(Lyd/b;)V

    invoke-virtual {p1, p2}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    sget-object p2, Lyd/b$q;->a:Lyd/b$q;

    invoke-virtual {p1, p2}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->W()Lgg/i;

    move-result-object p1

    new-instance p2, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    const-string p2, "startWithItem(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
