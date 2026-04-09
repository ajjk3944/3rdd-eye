.class final LV6/m$d$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV6/m$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:LV6/b;

.field final synthetic d:Lcom/bumptech/glide/j;

.field final synthetic e:LV6/p;

.field final synthetic f:LS6/r;

.field final synthetic g:LS6/r;

.field final synthetic h:LS6/r;

.field final synthetic i:LS6/k;


# direct methods
.method constructor <init>(LV6/b;Lcom/bumptech/glide/j;LV6/p;LS6/r;LS6/r;LS6/r;LS6/k;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LV6/m$d$a;->c:LV6/b;

    iput-object p2, p0, LV6/m$d$a;->d:Lcom/bumptech/glide/j;

    iput-object p3, p0, LV6/m$d$a;->e:LV6/p;

    iput-object p4, p0, LV6/m$d$a;->f:LS6/r;

    iput-object p5, p0, LV6/m$d$a;->g:LS6/r;

    iput-object p6, p0, LV6/m$d$a;->h:LS6/r;

    iput-object p7, p0, LV6/m$d$a;->i:LS6/k;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method

.method private static final E()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public static synthetic n()LYg/J;
    .locals 1

    invoke-static {}, LV6/m$d$a;->E()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic o(LV6/b;Ljava/lang/Throwable;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LV6/m$d$a;->v(LV6/b;Ljava/lang/Throwable;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final v(LV6/b;Ljava/lang/Throwable;)LYg/J;
    .locals 0

    invoke-virtual {p0, p1}, LV6/b;->p(Ljava/lang/Throwable;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 10

    new-instance v9, LV6/m$d$a;

    iget-object v1, p0, LV6/m$d$a;->c:LV6/b;

    iget-object v2, p0, LV6/m$d$a;->d:Lcom/bumptech/glide/j;

    iget-object v3, p0, LV6/m$d$a;->e:LV6/p;

    iget-object v4, p0, LV6/m$d$a;->f:LS6/r;

    iget-object v5, p0, LV6/m$d$a;->g:LS6/r;

    iget-object v6, p0, LV6/m$d$a;->h:LS6/r;

    iget-object v7, p0, LV6/m$d$a;->i:LS6/k;

    move-object v0, v9

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, LV6/m$d$a;-><init>(LV6/b;Lcom/bumptech/glide/j;LV6/p;LS6/r;LS6/r;LS6/r;LS6/k;Ldh/e;)V

    iput-object p1, v9, LV6/m$d$a;->b:Ljava/lang/Object;

    return-object v9
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LKi/t;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LV6/m$d$a;->t(LKi/t;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LV6/m$d$a;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LV6/m$d$a;->b:Ljava/lang/Object;

    check-cast p1, LKi/t;

    iget-object v1, p0, LV6/m$d$a;->c:LV6/b;

    invoke-virtual {v1, p1}, LV6/b;->o(LKi/t;)V

    new-instance v6, LV6/c;

    iget-object v1, p0, LV6/m$d$a;->c:LV6/b;

    new-instance v3, LV6/n;

    invoke-direct {v3, v1}, LV6/n;-><init>(LV6/b;)V

    invoke-direct {v6, p1, v3}, LV6/c;-><init>(LKi/t;Lmh/l;)V

    iget-object v3, p0, LV6/m$d$a;->d:Lcom/bumptech/glide/j;

    iget-object v4, p0, LV6/m$d$a;->e:LV6/p;

    iget-object v5, p0, LV6/m$d$a;->f:LS6/r;

    iget-object v7, p0, LV6/m$d$a;->g:LS6/r;

    iget-object v8, p0, LV6/m$d$a;->h:LS6/r;

    invoke-static/range {v3 .. v8}, LV6/m;->o(Lcom/bumptech/glide/j;LV6/p;LS6/r;LV6/c;LS6/r;LS6/r;)Lcom/bumptech/glide/i;

    move-result-object v1

    iget-object v3, p0, LV6/m$d$a;->i:LS6/k;

    invoke-virtual {v3}, LS6/k;->h()J

    move-result-wide v4

    invoke-static {v4, v5}, LY0/r;->g(J)I

    move-result v4

    if-lez v4, :cond_2

    invoke-virtual {v3}, LS6/k;->h()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/r;->f(J)I

    move-result v3

    if-lez v3, :cond_2

    iget-object v3, p0, LV6/m$d$a;->i:LS6/k;

    invoke-virtual {v3}, LS6/k;->h()J

    move-result-wide v3

    invoke-static {v3, v4}, LY0/r;->g(J)I

    move-result v3

    iget-object v4, p0, LV6/m$d$a;->i:LS6/k;

    invoke-virtual {v4}, LS6/k;->h()J

    move-result-wide v4

    invoke-static {v4, v5}, LY0/r;->f(J)I

    move-result v4

    invoke-virtual {v1, v3, v4}, Lcom/bumptech/glide/request/a;->Q(II)Lcom/bumptech/glide/request/a;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    check-cast v1, Lcom/bumptech/glide/i;

    :cond_2
    iget-object v3, p0, LV6/m$d$a;->c:LV6/b;

    invoke-virtual {v1, v3}, Lcom/bumptech/glide/i;->l0(LT2/d;)LT2/d;

    new-instance v1, LV6/o;

    invoke-direct {v1}, LV6/o;-><init>()V

    iput v2, p0, LV6/m$d$a;->a:I

    invoke-static {p1, v1, p0}, LKi/r;->a(LKi/t;Lmh/a;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final t(LKi/t;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LV6/m$d$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LV6/m$d$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LV6/m$d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
