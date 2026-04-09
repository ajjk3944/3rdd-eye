.class final Ld/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private final b:LKi/g;

.field private final c:LIi/y0;


# direct methods
.method public constructor <init>(LIi/N;ZLmh/p;Lc/F;)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Ld/e;->a:Z

    sget-object p2, LKi/a;->SUSPEND:LKi/a;

    const/4 v0, 0x4

    const/4 v1, -0x2

    const/4 v2, 0x0

    invoke-static {v1, p2, v2, v0, v2}, LKi/j;->b(ILKi/a;Lmh/l;ILjava/lang/Object;)LKi/g;

    move-result-object p2

    iput-object p2, p0, Ld/e;->b:LKi/g;

    new-instance v6, Ld/e$a;

    invoke-direct {v6, p4, p3, p0, v2}, Ld/e$a;-><init>(Lc/F;Lmh/p;Ld/e;Ldh/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, p1

    invoke-static/range {v3 .. v8}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    move-result-object p1

    iput-object p1, p0, Ld/e;->c:LIi/y0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Ld/e;->b:LKi/g;

    new-instance v1, Ljava/util/concurrent/CancellationException;

    const-string v2, "onBack cancelled"

    invoke-direct {v1, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, LKi/v;->cancel(Ljava/util/concurrent/CancellationException;)V

    iget-object v0, p0, Ld/e;->c:LIi/y0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LIi/y0$a;->b(LIi/y0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    return-void
.end method

.method public final b()Z
    .locals 3

    iget-object v0, p0, Ld/e;->b:LKi/g;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, LKi/w$a;->a(LKi/w;Ljava/lang/Throwable;ILjava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final c()LKi/g;
    .locals 1

    iget-object v0, p0, Ld/e;->b:LKi/g;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Ld/e;->a:Z

    return v0
.end method

.method public final e(Lc/b;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ld/e;->b:LKi/g;

    invoke-interface {v0, p1}, LKi/w;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final f(Z)V
    .locals 0

    iput-boolean p1, p0, Ld/e;->a:Z

    return-void
.end method
