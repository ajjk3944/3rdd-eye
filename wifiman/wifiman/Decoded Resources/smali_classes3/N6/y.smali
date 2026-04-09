.class public LN6/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:Lgg/y;

.field final b:Lgg/w;

.field final c:Lgg/w;

.field private final d:Lgg/w;


# direct methods
.method public constructor <init>(Lgg/y;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LN6/y$e;

    invoke-direct {v0, p0}, LN6/y$e;-><init>(LN6/y;)V

    iput-object v0, p0, LN6/y;->c:Lgg/w;

    new-instance v0, LN6/y$g;

    invoke-direct {v0, p0}, LN6/y$g;-><init>(LN6/y;)V

    iput-object v0, p0, LN6/y;->d:Lgg/w;

    iput-object p1, p0, LN6/y;->a:Lgg/y;

    new-instance v0, LN6/y$a;

    invoke-direct {v0, p0, p1}, LN6/y$a;-><init>(LN6/y;Lgg/y;)V

    iput-object v0, p0, LN6/y;->b:Lgg/w;

    return-void
.end method

.method private c(I)Lgg/w;
    .locals 4

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x5

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    int-to-long v2, p1

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    new-instance v2, LN6/y$b;

    invoke-direct {v2, p0, p1, v0, v1}, LN6/y$b;-><init>(LN6/y;IJ)V

    return-object v2
.end method

.method private d()Lgg/w;
    .locals 1

    const/16 v0, 0x9c4

    invoke-direct {p0, v0}, LN6/y;->c(I)Lgg/w;

    move-result-object v0

    return-object v0
.end method

.method private e()Lgg/w;
    .locals 1

    const/16 v0, 0x1f4

    invoke-direct {p0, v0}, LN6/y;->c(I)Lgg/w;

    move-result-object v0

    return-object v0
.end method

.method private static f(Lgg/w;)Lgg/w;
    .locals 1

    new-instance v0, LN6/y$c;

    invoke-direct {v0, p0}, LN6/y$c;-><init>(Lgg/w;)V

    return-object v0
.end method

.method static g()Lkg/n;
    .locals 1

    new-instance v0, LN6/y$d;

    invoke-direct {v0}, LN6/y$d;-><init>()V

    return-object v0
.end method

.method static h()Lkg/n;
    .locals 1

    new-instance v0, LN6/y$f;

    invoke-direct {v0}, LN6/y$f;-><init>()V

    return-object v0
.end method


# virtual methods
.method a(I)Lgg/w;
    .locals 1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x6

    if-eq p1, v0, :cond_0

    invoke-static {}, LP6/E;->a()Lgg/w;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, LN6/y;->d:Lgg/w;

    invoke-static {p1}, LN6/y;->f(Lgg/w;)Lgg/w;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object p1, p0, LN6/y;->c:Lgg/w;

    invoke-static {p1}, LN6/y;->f(Lgg/w;)Lgg/w;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object p1, p0, LN6/y;->b:Lgg/w;

    invoke-static {p1}, LN6/y;->f(Lgg/w;)Lgg/w;

    move-result-object p1

    return-object p1
.end method

.method b(I)Lgg/w;
    .locals 1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    invoke-static {}, LP6/E;->a()Lgg/w;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0}, LN6/y;->d()Lgg/w;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "Cannot emulate opportunistic scan mode since it is OS dependent - fallthrough to low power"

    invoke-static {v0, p1}, LI6/q;->q(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    invoke-direct {p0}, LN6/y;->e()Lgg/w;

    move-result-object p1

    return-object p1
.end method
