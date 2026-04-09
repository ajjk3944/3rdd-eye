.class LF4/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf5/b;
.implements Lf5/a;


# static fields
.field private static final c:Lf5/a$a;

.field private static final d:Lf5/b;


# instance fields
.field private a:Lf5/a$a;

.field private volatile b:Lf5/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LF4/v;

    invoke-direct {v0}, LF4/v;-><init>()V

    sput-object v0, LF4/y;->c:Lf5/a$a;

    new-instance v0, LF4/w;

    invoke-direct {v0}, LF4/w;-><init>()V

    sput-object v0, LF4/y;->d:Lf5/b;

    return-void
.end method

.method private constructor <init>(Lf5/a$a;Lf5/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF4/y;->a:Lf5/a$a;

    iput-object p2, p0, LF4/y;->b:Lf5/b;

    return-void
.end method

.method public static synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-static {}, LF4/y;->g()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lf5/a$a;Lf5/a$a;Lf5/b;)V
    .locals 0

    invoke-static {p0, p1, p2}, LF4/y;->h(Lf5/a$a;Lf5/a$a;Lf5/b;)V

    return-void
.end method

.method public static synthetic d(Lf5/b;)V
    .locals 0

    invoke-static {p0}, LF4/y;->f(Lf5/b;)V

    return-void
.end method

.method static e()LF4/y;
    .locals 3

    new-instance v0, LF4/y;

    sget-object v1, LF4/y;->c:Lf5/a$a;

    sget-object v2, LF4/y;->d:Lf5/b;

    invoke-direct {v0, v1, v2}, LF4/y;-><init>(Lf5/a$a;Lf5/b;)V

    return-object v0
.end method

.method private static synthetic f(Lf5/b;)V
    .locals 0

    return-void
.end method

.method private static synthetic g()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method private static synthetic h(Lf5/a$a;Lf5/a$a;Lf5/b;)V
    .locals 0

    invoke-interface {p0, p2}, Lf5/a$a;->a(Lf5/b;)V

    invoke-interface {p1, p2}, Lf5/a$a;->a(Lf5/b;)V

    return-void
.end method

.method static i(Lf5/b;)LF4/y;
    .locals 2

    new-instance v0, LF4/y;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, LF4/y;-><init>(Lf5/a$a;Lf5/b;)V

    return-object v0
.end method


# virtual methods
.method public a(Lf5/a$a;)V
    .locals 3

    iget-object v0, p0, LF4/y;->b:Lf5/b;

    sget-object v1, LF4/y;->d:Lf5/b;

    if-eq v0, v1, :cond_0

    invoke-interface {p1, v0}, Lf5/a$a;->a(Lf5/b;)V

    return-void

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LF4/y;->b:Lf5/b;

    if-eq v0, v1, :cond_1

    move-object v1, v0

    goto :goto_0

    :cond_1
    iget-object v1, p0, LF4/y;->a:Lf5/a$a;

    new-instance v2, LF4/x;

    invoke-direct {v2, v1, p1}, LF4/x;-><init>(Lf5/a$a;Lf5/a$a;)V

    iput-object v2, p0, LF4/y;->a:Lf5/a$a;

    const/4 v1, 0x0

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_2

    invoke-interface {p1, v0}, Lf5/a$a;->a(Lf5/b;)V

    :cond_2
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LF4/y;->b:Lf5/b;

    invoke-interface {v0}, Lf5/b;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method j(Lf5/b;)V
    .locals 2

    iget-object v0, p0, LF4/y;->b:Lf5/b;

    sget-object v1, LF4/y;->d:Lf5/b;

    if-ne v0, v1, :cond_0

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LF4/y;->a:Lf5/a$a;

    const/4 v1, 0x0

    iput-object v1, p0, LF4/y;->a:Lf5/a$a;

    iput-object p1, p0, LF4/y;->b:Lf5/b;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0, p1}, Lf5/a$a;->a(Lf5/b;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "provide() can be called only once."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
