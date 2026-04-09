.class public final LQ0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ0/G;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LQ0/a;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(LQ0/j;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LQ0/a;->d(LQ0/j;)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1
.end method

.method public b(LQ0/j;Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, LQ0/a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LQ0/a$a;

    iget v1, v0, LQ0/a$a;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LQ0/a$a;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, LQ0/a$a;

    invoke-direct {v0, p0, p2}, LQ0/a$a;-><init>(LQ0/a;Ldh/e;)V

    :goto_0
    iget-object p2, v0, LQ0/a$a;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LQ0/a$a;->e:I

    const/4 v3, 0x2

    if-eqz v2, :cond_3

    const/4 p1, 0x1

    if-eq v2, p1, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LQ0/a$a;->b:Ljava/lang/Object;

    check-cast p1, LQ0/j;

    iget-object v0, v0, LQ0/a$a;->a:Ljava/lang/Object;

    check-cast v0, LQ0/a;

    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    return-object p2

    :cond_3
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    instance-of p2, p1, LQ0/N;

    if-eqz p2, :cond_5

    move-object p2, p1

    check-cast p2, LQ0/N;

    iget-object v2, p0, LQ0/a;->a:Landroid/content/Context;

    iput-object p0, v0, LQ0/a$a;->a:Ljava/lang/Object;

    iput-object p1, v0, LQ0/a$a;->b:Ljava/lang/Object;

    iput v3, v0, LQ0/a$a;->e:I

    invoke-static {p2, v2, v0}, LQ0/b;->b(LQ0/N;Landroid/content/Context;Ldh/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v0, p0

    :goto_1
    check-cast p2, Landroid/graphics/Typeface;

    check-cast p1, LQ0/N;

    invoke-virtual {p1}, LQ0/N;->e()LQ0/z;

    move-result-object p1

    iget-object v0, v0, LQ0/a;->a:Landroid/content/Context;

    invoke-static {p2, p1, v0}, LQ0/M;->c(Landroid/graphics/Typeface;LQ0/z;Landroid/content/Context;)Landroid/graphics/Typeface;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown font type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public c()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LQ0/a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public d(LQ0/j;)Landroid/graphics/Typeface;
    .locals 4

    instance-of v0, p1, LQ0/N;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-interface {p1}, LQ0/j;->a()I

    move-result v0

    sget-object v2, LQ0/t;->a:LQ0/t$a;

    invoke-virtual {v2}, LQ0/t$a;->b()I

    move-result v3

    invoke-static {v0, v3}, LQ0/t;->e(II)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v0, p1

    check-cast v0, LQ0/N;

    iget-object v1, p0, LQ0/a;->a:Landroid/content/Context;

    invoke-static {v0, v1}, LQ0/b;->a(LQ0/N;Landroid/content/Context;)Landroid/graphics/Typeface;

    move-result-object v0

    goto :goto_2

    :cond_0
    invoke-virtual {v2}, LQ0/t$a;->c()I

    move-result v3

    invoke-static {v0, v3}, LQ0/t;->e(II)Z

    move-result v3

    if-eqz v3, :cond_2

    :try_start_0
    sget-object v0, LYg/u;->b:LYg/u$a;

    move-object v0, p1

    check-cast v0, LQ0/N;

    iget-object v2, p0, LQ0/a;->a:Landroid/content/Context;

    invoke-static {v0, v2}, LQ0/b;->a(LQ0/N;Landroid/content/Context;)Landroid/graphics/Typeface;

    move-result-object v0

    invoke-static {v0}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v2, LYg/u;->b:LYg/u$a;

    invoke-static {v0}, LYg/v;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {v0}, LYg/u;->l(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v0

    :goto_1
    move-object v0, v1

    check-cast v0, Landroid/graphics/Typeface;

    :goto_2
    check-cast p1, LQ0/N;

    invoke-virtual {p1}, LQ0/N;->e()LQ0/z;

    move-result-object p1

    iget-object v1, p0, LQ0/a;->a:Landroid/content/Context;

    invoke-static {v0, p1, v1}, LQ0/M;->c(Landroid/graphics/Typeface;LQ0/z;Landroid/content/Context;)Landroid/graphics/Typeface;

    move-result-object v1

    goto :goto_3

    :cond_2
    invoke-virtual {v2}, LQ0/t$a;->a()I

    move-result v1

    invoke-static {v0, v1}, LQ0/t;->e(II)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Unsupported Async font load path"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown loading type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, LQ0/j;->a()I

    move-result p1

    invoke-static {p1}, LQ0/t;->g(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_3
    return-object v1
.end method
