.class public final LT/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/g0;


# instance fields
.field private final a:LT/g0;

.field private final b:LT/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LT/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT/y0;->a:LT/g0;

    new-instance p1, LT/b0;

    invoke-direct {p1}, LT/b0;-><init>()V

    iput-object p1, p0, LT/y0;->b:LT/b0;

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    iget-object v0, p0, LT/y0;->b:LT/b0;

    invoke-virtual {v0}, LT/b0;->d()V

    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, LT/y0;->b:LT/b0;

    invoke-virtual {v0}, LT/b0;->f()V

    return-void
.end method

.method public fold(Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LT/g0$a;->a(LT/g0;Ljava/lang/Object;Lmh/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public get(Ldh/i$c;)Ldh/i$b;
    .locals 0

    invoke-static {p0, p1}, LT/g0$a;->b(LT/g0;Ldh/i$c;)Ldh/i$b;

    move-result-object p1

    return-object p1
.end method

.method public j(Lmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, LT/y0$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LT/y0$a;

    iget v1, v0, LT/y0$a;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LT/y0$a;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, LT/y0$a;

    invoke-direct {v0, p0, p2}, LT/y0$a;-><init>(LT/y0;Ldh/e;)V

    :goto_0
    iget-object p2, v0, LT/y0$a;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LT/y0$a;->e:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, LT/y0$a;->b:Ljava/lang/Object;

    check-cast p1, Lmh/l;

    iget-object v2, v0, LT/y0$a;->a:Ljava/lang/Object;

    check-cast v2, LT/y0;

    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LT/y0;->b:LT/b0;

    iput-object p0, v0, LT/y0$a;->a:Ljava/lang/Object;

    iput-object p1, v0, LT/y0$a;->b:Ljava/lang/Object;

    iput v4, v0, LT/y0$a;->e:I

    invoke-virtual {p2, v0}, LT/b0;->c(Ldh/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    iget-object p2, v2, LT/y0;->a:LT/g0;

    const/4 v2, 0x0

    iput-object v2, v0, LT/y0$a;->a:Ljava/lang/Object;

    iput-object v2, v0, LT/y0$a;->b:Ljava/lang/Object;

    iput v3, v0, LT/y0$a;->e:I

    invoke-interface {p2, p1, v0}, LT/g0;->j(Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    return-object p2
.end method

.method public minusKey(Ldh/i$c;)Ldh/i;
    .locals 0

    invoke-static {p0, p1}, LT/g0$a;->c(LT/g0;Ldh/i$c;)Ldh/i;

    move-result-object p1

    return-object p1
.end method

.method public plus(Ldh/i;)Ldh/i;
    .locals 0

    invoke-static {p0, p1}, LT/g0$a;->d(LT/g0;Ldh/i;)Ldh/i;

    move-result-object p1

    return-object p1
.end method
