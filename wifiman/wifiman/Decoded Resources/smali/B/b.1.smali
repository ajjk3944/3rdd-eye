.class public final LB/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/J;


# instance fields
.field private a:Z

.field private b:Ldh/e;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public B(LC0/r;)V
    .locals 1

    iget-boolean p1, p0, LB/b;->a:Z

    if-nez p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, LB/b;->a:Z

    iget-object p1, p0, LB/b;->b:Ldh/e;

    if-eqz p1, :cond_0

    sget-object v0, LYg/u;->b:LYg/u$a;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-static {v0}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, LB/b;->b:Ldh/e;

    :cond_1
    return-void
.end method

.method public final a(Ldh/e;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, LB/b$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LB/b$a;

    iget v1, v0, LB/b$a;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LB/b$a;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, LB/b$a;

    invoke-direct {v0, p0, p1}, LB/b$a;-><init>(LB/b;Ldh/e;)V

    :goto_0
    iget-object p1, v0, LB/b$a;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LB/b$a;->e:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, LB/b$a;->b:Ljava/lang/Object;

    check-cast v1, Ldh/e;

    iget-object v0, v0, LB/b$a;->a:Ljava/lang/Object;

    check-cast v0, LB/b;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-boolean p1, p0, LB/b;->a:Z

    if-nez p1, :cond_5

    iget-object p1, p0, LB/b;->b:Ldh/e;

    iput-object p0, v0, LB/b$a;->a:Ljava/lang/Object;

    iput-object p1, v0, LB/b$a;->b:Ljava/lang/Object;

    iput v3, v0, LB/b$a;->e:I

    new-instance v2, Ldh/k;

    invoke-static {v0}, Leh/b;->d(Ldh/e;)Ldh/e;

    move-result-object v3

    invoke-direct {v2, v3}, Ldh/k;-><init>(Ldh/e;)V

    iput-object v2, p0, LB/b;->b:Ldh/e;

    invoke-virtual {v2}, Ldh/k;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_3

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/h;->c(Ldh/e;)V

    :cond_3
    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v1, p1

    :goto_1
    if-eqz v1, :cond_5

    sget-object p1, LYg/u;->b:LYg/u$a;

    sget-object p1, LYg/J;->a:LYg/J;

    invoke-static {p1}, LYg/u;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v1, p1}, Ldh/e;->resumeWith(Ljava/lang/Object;)V

    :cond_5
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
