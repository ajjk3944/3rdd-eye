.class public final LQ0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ0/g$a;,
        LQ0/g$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:LP0/b;

.field private final c:LP0/c;

.field private final d:LT0/r;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    invoke-static {v0}, LQ0/g$a;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, LQ0/g;->a:Ljava/lang/Object;

    new-instance v1, LP0/b;

    const/16 v2, 0x10

    invoke-direct {v1, v2}, LP0/b;-><init>(I)V

    iput-object v1, p0, LQ0/g;->b:LP0/b;

    new-instance v1, LP0/c;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v0}, LP0/c;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, p0, LQ0/g;->c:LP0/c;

    invoke-static {}, LT0/q;->a()LT0/r;

    move-result-object v0

    iput-object v0, p0, LQ0/g;->d:LT0/r;

    return-void
.end method

.method public static final synthetic a(LQ0/g;)LT0/r;
    .locals 0

    iget-object p0, p0, LQ0/g;->d:LT0/r;

    return-object p0
.end method

.method public static final synthetic b(LQ0/g;)LP0/c;
    .locals 0

    iget-object p0, p0, LQ0/g;->c:LP0/c;

    return-object p0
.end method

.method public static final synthetic c(LQ0/g;)LP0/b;
    .locals 0

    iget-object p0, p0, LQ0/g;->b:LP0/b;

    return-object p0
.end method

.method public static synthetic f(LQ0/g;LQ0/j;LQ0/G;Ljava/lang/Object;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, LQ0/g;->e(LQ0/j;LQ0/G;Ljava/lang/Object;Z)V

    return-void
.end method


# virtual methods
.method public final d(LQ0/j;LQ0/G;)LQ0/g$a;
    .locals 1

    new-instance v0, LQ0/g$b;

    invoke-interface {p2}, LQ0/G;->c()Ljava/lang/Object;

    move-result-object p2

    invoke-direct {v0, p1, p2}, LQ0/g$b;-><init>(LQ0/j;Ljava/lang/Object;)V

    iget-object p1, p0, LQ0/g;->d:LT0/r;

    monitor-enter p1

    :try_start_0
    iget-object p2, p0, LQ0/g;->b:LP0/b;

    invoke-virtual {p2, v0}, LP0/b;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LQ0/g$a;

    if-nez p2, :cond_0

    iget-object p2, p0, LQ0/g;->c:LP0/c;

    invoke-virtual {p2, v0}, LP0/c;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LQ0/g$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p1

    return-object p2

    :goto_1
    monitor-exit p1

    throw p2
.end method

.method public final e(LQ0/j;LQ0/G;Ljava/lang/Object;Z)V
    .locals 1

    new-instance v0, LQ0/g$b;

    invoke-interface {p2}, LQ0/G;->c()Ljava/lang/Object;

    move-result-object p2

    invoke-direct {v0, p1, p2}, LQ0/g$b;-><init>(LQ0/j;Ljava/lang/Object;)V

    iget-object p1, p0, LQ0/g;->d:LT0/r;

    monitor-enter p1

    if-nez p3, :cond_0

    :try_start_0
    iget-object p2, p0, LQ0/g;->c:LP0/c;

    iget-object p3, p0, LQ0/g;->a:Ljava/lang/Object;

    invoke-static {p3}, LQ0/g$a;->a(Ljava/lang/Object;)LQ0/g$a;

    move-result-object p3

    invoke-virtual {p2, v0, p3}, LP0/c;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LQ0/g$a;

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    if-eqz p4, :cond_1

    iget-object p2, p0, LQ0/g;->c:LP0/c;

    invoke-static {p3}, LQ0/g$a;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, LQ0/g$a;->a(Ljava/lang/Object;)LQ0/g$a;

    move-result-object p3

    invoke-virtual {p2, v0, p3}, LP0/c;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LQ0/g$a;

    goto :goto_0

    :cond_1
    iget-object p2, p0, LQ0/g;->b:LP0/b;

    invoke-static {p3}, LQ0/g$a;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, LQ0/g$a;->a(Ljava/lang/Object;)LQ0/g$a;

    move-result-object p3

    invoke-virtual {p2, v0, p3}, LP0/b;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LQ0/g$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p1

    return-void

    :goto_1
    monitor-exit p1

    throw p2
.end method

.method public final g(LQ0/j;LQ0/G;ZLmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p5, LQ0/g$c;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, LQ0/g$c;

    iget v1, v0, LQ0/g$c;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LQ0/g$c;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, LQ0/g$c;

    invoke-direct {v0, p0, p5}, LQ0/g$c;-><init>(LQ0/g;Ldh/e;)V

    :goto_0
    iget-object p5, v0, LQ0/g$c;->d:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LQ0/g$c;->f:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-boolean p3, v0, LQ0/g$c;->c:Z

    iget-object p1, v0, LQ0/g$c;->b:Ljava/lang/Object;

    check-cast p1, LQ0/g$b;

    iget-object p2, v0, LQ0/g$c;->a:Ljava/lang/Object;

    check-cast p2, LQ0/g;

    invoke-static {p5}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p5}, LYg/v;->b(Ljava/lang/Object;)V

    new-instance p5, LQ0/g$b;

    invoke-interface {p2}, LQ0/G;->c()Ljava/lang/Object;

    move-result-object p2

    invoke-direct {p5, p1, p2}, LQ0/g$b;-><init>(LQ0/j;Ljava/lang/Object;)V

    iget-object p1, p0, LQ0/g;->d:LT0/r;

    monitor-enter p1

    :try_start_0
    iget-object p2, p0, LQ0/g;->b:LP0/b;

    invoke-virtual {p2, p5}, LP0/b;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LQ0/g$a;

    if-nez p2, :cond_3

    iget-object p2, p0, LQ0/g;->c:LP0/c;

    invoke-virtual {p2, p5}, LP0/c;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LQ0/g$a;

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_5

    :cond_3
    :goto_1
    if-eqz p2, :cond_4

    invoke-virtual {p2}, LQ0/g$a;->g()Ljava/lang/Object;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    return-object p2

    :cond_4
    :try_start_1
    sget-object p2, LYg/J;->a:LYg/J;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p1

    iput-object p0, v0, LQ0/g$c;->a:Ljava/lang/Object;

    iput-object p5, v0, LQ0/g$c;->b:Ljava/lang/Object;

    iput-boolean p3, v0, LQ0/g$c;->c:Z

    iput v3, v0, LQ0/g$c;->f:I

    invoke-interface {p4, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    move-object p2, p0

    move-object v4, p5

    move-object p5, p1

    move-object p1, v4

    :goto_2
    iget-object p4, p2, LQ0/g;->d:LT0/r;

    monitor-enter p4

    if-nez p5, :cond_6

    :try_start_2
    iget-object p3, p2, LQ0/g;->c:LP0/c;

    iget-object p2, p2, LQ0/g;->a:Ljava/lang/Object;

    invoke-static {p2}, LQ0/g$a;->a(Ljava/lang/Object;)LQ0/g$a;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, LP0/c;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_4

    :cond_6
    if-eqz p3, :cond_7

    iget-object p2, p2, LQ0/g;->c:LP0/c;

    invoke-static {p5}, LQ0/g$a;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, LQ0/g$a;->a(Ljava/lang/Object;)LQ0/g$a;

    move-result-object p3

    invoke-virtual {p2, p1, p3}, LP0/c;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_7
    iget-object p2, p2, LQ0/g;->b:LP0/b;

    invoke-static {p5}, LQ0/g$a;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, LQ0/g$a;->a(Ljava/lang/Object;)LQ0/g$a;

    move-result-object p3

    invoke-virtual {p2, p1, p3}, LP0/b;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_3
    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p4

    return-object p5

    :goto_4
    monitor-exit p4

    throw p1

    :goto_5
    monitor-exit p1

    throw p2
.end method
