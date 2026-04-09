.class public final Lwd/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwd/f;


# instance fields
.field private final a:Lxd/a;

.field private final b:Lxd/i;

.field private final c:Lxd/d;

.field private final d:LSd/d;

.field private final e:Ljd/b;

.field private final f:Lle/g;


# direct methods
.method public constructor <init>(Lxd/a;Lxd/i;Lxd/d;LSd/d;Ljd/b;Lle/g;)V
    .locals 1

    const-string v0, "analyticsService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unifiService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "speedtestNetworkService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localConsoleService"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "topology"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wifiScannerService"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwd/e;->a:Lxd/a;

    iput-object p2, p0, Lwd/e;->b:Lxd/i;

    iput-object p3, p0, Lwd/e;->c:Lxd/d;

    iput-object p4, p0, Lwd/e;->d:LSd/d;

    iput-object p5, p0, Lwd/e;->e:Ljd/b;

    iput-object p6, p0, Lwd/e;->f:Lle/g;

    return-void
.end method

.method public static synthetic b(Ljava/lang/Throwable;)Ll9/a;
    .locals 0

    invoke-static {p0}, Lwd/e;->h(Ljava/lang/Throwable;)Ll9/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Throwable;)Ll9/a;
    .locals 0

    invoke-static {p0}, Lwd/e;->i(Ljava/lang/Throwable;)Ll9/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Throwable;)Ll9/a;
    .locals 0

    invoke-static {p0}, Lwd/e;->g(Ljava/lang/Throwable;)Ll9/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lwd/e;)Lxd/d;
    .locals 0

    iget-object p0, p0, Lwd/e;->c:Lxd/d;

    return-object p0
.end method

.method private final f()Lgg/z;
    .locals 4

    iget-object v0, p0, Lwd/e;->e:Ljd/b;

    invoke-interface {v0}, Ljd/b;->c()Lgg/i;

    move-result-object v0

    invoke-virtual {v0}, Lgg/i;->o0()Lgg/z;

    move-result-object v0

    iget-object v1, p0, Lwd/e;->f:Lle/g;

    invoke-interface {v1}, Lle/g;->b()Lgg/i;

    move-result-object v1

    sget-object v2, Lwd/e$a;->a:Lwd/e$a;

    invoke-virtual {v1, v2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object v1

    invoke-virtual {v1}, Lgg/i;->o0()Lgg/z;

    move-result-object v1

    iget-object v2, p0, Lwd/e;->d:LSd/d;

    invoke-interface {v2}, LSd/d;->c()Lgg/i;

    move-result-object v2

    invoke-virtual {v2}, Lgg/i;->o0()Lgg/z;

    move-result-object v2

    sget-object v3, Lwd/e$b;->a:Lwd/e$b;

    invoke-virtual {v2, v3}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object v2

    sget-object v3, Lwd/e$c;->a:Lwd/e$c;

    invoke-static {v0, v1, v2, v3}, Lgg/z;->d0(Lgg/D;Lgg/D;Lgg/D;Lkg/g;)Lgg/z;

    move-result-object v0

    const-string v1, "zip(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final g(Ljava/lang/Throwable;)Ll9/a;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Ll9/a;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p0
.end method

.method private static final h(Ljava/lang/Throwable;)Ll9/a;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Ll9/a;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p0
.end method

.method private static final i(Ljava/lang/Throwable;)Ll9/a;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Ll9/a;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object p0
.end method


# virtual methods
.method public a(Lwd/f$a;)Lgg/i;
    .locals 5

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lwd/e;->a:Lxd/a;

    invoke-virtual {p1}, Lwd/f$a;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lxd/a;->f(Lcom/ui/wifiman/model/speedtest/Speedtest$d;Lxd/c;)Lgg/z;

    move-result-object v0

    sget-object v1, Lwd/e$f;->a:Lwd/e$f;

    invoke-virtual {v0, v1}, Lgg/z;->m(Lkg/f;)Lgg/z;

    move-result-object v0

    sget-object v1, Lwd/e$g;->a:Lwd/e$g;

    invoke-virtual {v0, v1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v0

    new-instance v1, Lwd/a;

    invoke-direct {v1}, Lwd/a;-><init>()V

    invoke-virtual {v0, v1}, Lgg/z;->G(Lkg/n;)Lgg/z;

    move-result-object v0

    iget-object v1, p0, Lwd/e;->b:Lxd/i;

    invoke-virtual {p1}, Lwd/f$a;->a()Lcom/ui/wifiman/model/speedtest/Speedtest$d;

    move-result-object v3

    invoke-virtual {v1, v3, v2}, Lxd/i;->a(Lcom/ui/wifiman/model/speedtest/Speedtest$d;Lxd/c;)Lgg/z;

    move-result-object v1

    sget-object v3, Lwd/e$h;->a:Lwd/e$h;

    invoke-virtual {v1, v3}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v1

    sget-object v3, Lwd/e$i;->a:Lwd/e$i;

    invoke-virtual {v1, v3}, Lgg/z;->m(Lkg/f;)Lgg/z;

    move-result-object v1

    new-instance v3, Lwd/b;

    invoke-direct {v3}, Lwd/b;-><init>()V

    invoke-virtual {v1, v3}, Lgg/z;->G(Lkg/n;)Lgg/z;

    move-result-object v1

    invoke-direct {p0}, Lwd/e;->f()Lgg/z;

    move-result-object v3

    new-instance v4, Lwd/e$j;

    invoke-direct {v4, p0, p1}, Lwd/e$j;-><init>(Lwd/e;Lwd/f$a;)V

    invoke-virtual {v3, v4}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object v3

    sget-object v4, Lwd/e$k;->a:Lwd/e$k;

    invoke-virtual {v3, v4}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object v3

    sget-object v4, Lwd/e$l;->a:Lwd/e$l;

    invoke-virtual {v3, v4}, Lgg/z;->m(Lkg/f;)Lgg/z;

    move-result-object v3

    new-instance v4, Lwd/c;

    invoke-direct {v4}, Lwd/c;-><init>()V

    invoke-virtual {v3, v4}, Lgg/z;->G(Lkg/n;)Lgg/z;

    move-result-object v3

    sget-object v4, Lwd/e$d;->a:Lwd/e$d;

    invoke-static {v0, v1, v3, v4}, Lgg/z;->d0(Lgg/D;Lgg/D;Lgg/D;Lkg/g;)Lgg/z;

    move-result-object v0

    invoke-virtual {p1}, Lwd/f$a;->b()J

    move-result-wide v3

    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v3, v4, p1}, Lgg/z;->Q(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object p1

    sget-object v0, Lwd/e$e;->a:Lwd/e$e;

    invoke-virtual {p1, v0}, Lgg/z;->F(Lkg/n;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->W()Lgg/i;

    move-result-object p1

    new-instance v0, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;

    invoke-direct {v0, v2}, Lcom/ui/wifiman/model/speedtest/Speedtest$f$c;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    const-string v0, "startWithItem(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
