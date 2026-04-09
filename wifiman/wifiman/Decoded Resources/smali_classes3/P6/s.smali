.class public LP6/s;
.super Lgg/s;
.source "SourceFile"


# instance fields
.field final a:LP6/G;

.field final b:Lgg/s;

.field final c:Lgg/s;

.field private final d:LP6/x;

.field private final e:Lgg/y;


# direct methods
.method protected constructor <init>(LP6/G;Lgg/s;Lgg/s;LP6/x;Lgg/y;)V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    iput-object p1, p0, LP6/s;->a:LP6/G;

    iput-object p2, p0, LP6/s;->b:Lgg/s;

    iput-object p3, p0, LP6/s;->c:Lgg/s;

    iput-object p4, p0, LP6/s;->d:LP6/x;

    iput-object p5, p0, LP6/s;->e:Lgg/y;

    return-void
.end method

.method static i1(LP6/G;Lgg/s;Lgg/s;)Lgg/s;
    .locals 0

    invoke-virtual {p0}, LP6/G;->c()Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, LG6/E$b;->c:LG6/E$b;

    goto :goto_0

    :cond_0
    sget-object p0, LG6/E$b;->d:LG6/E$b;

    :goto_0
    invoke-virtual {p1, p0}, Lgg/s;->I0(Ljava/lang/Object;)Lgg/s;

    move-result-object p0

    new-instance p1, LP6/s$c;

    invoke-direct {p1, p2}, LP6/s$c;-><init>(Lgg/s;)V

    invoke-virtual {p0, p1}, Lgg/s;->O0(Lkg/n;)Lgg/s;

    move-result-object p0

    return-object p0
.end method

.method private static j1(LP6/x;Lgg/y;)Lgg/z;
    .locals 6

    const-wide/16 v2, 0x1

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v0, 0x0

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lgg/s;->g0(JJLjava/util/concurrent/TimeUnit;Lgg/y;)Lgg/s;

    move-result-object p1

    new-instance v0, LP6/s$b;

    invoke-direct {v0, p0}, LP6/s$b;-><init>(LP6/x;)V

    invoke-virtual {p1, v0}, Lgg/s;->V0(Lkg/p;)Lgg/s;

    move-result-object p0

    invoke-virtual {p0}, Lgg/s;->n()Lgg/z;

    move-result-object p0

    new-instance p1, LP6/s$a;

    invoke-direct {p1}, LP6/s$a;-><init>()V

    invoke-virtual {p0, p1}, Lgg/z;->A(Lkg/n;)Lgg/z;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 2

    iget-object v0, p0, LP6/s;->a:LP6/G;

    invoke-virtual {v0}, LP6/G;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lhg/c;->r()Lhg/c;

    move-result-object v0

    invoke-interface {p1, v0}, Lgg/x;->c(Lhg/c;)V

    invoke-interface {p1}, Lgg/x;->a()V

    return-void

    :cond_0
    iget-object v0, p0, LP6/s;->d:LP6/x;

    iget-object v1, p0, LP6/s;->e:Lgg/y;

    invoke-static {v0, v1}, LP6/s;->j1(LP6/x;Lgg/y;)Lgg/z;

    move-result-object v0

    new-instance v1, LP6/s$d;

    invoke-direct {v1, p0}, LP6/s$d;-><init>(LP6/s;)V

    invoke-virtual {v0, v1}, Lgg/z;->v(Lkg/n;)Lgg/s;

    move-result-object v0

    invoke-virtual {v0, p1}, Lgg/s;->d(Lgg/x;)V

    return-void
.end method
