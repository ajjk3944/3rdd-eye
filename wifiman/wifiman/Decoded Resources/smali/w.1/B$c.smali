.class final Lw/B$c;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/B;->g(Ly0/b;Ly0/y;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field b:J

.field c:I

.field private synthetic d:Ljava/lang/Object;

.field final synthetic e:Ly0/y;


# direct methods
.method constructor <init>(Ly0/y;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lw/B$c;->e:Ly0/y;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance v0, Lw/B$c;

    iget-object v1, p0, Lw/B$c;->e:Ly0/y;

    invoke-direct {v0, v1, p2}, Lw/B$c;-><init>(Ly0/y;Ldh/e;)V

    iput-object p1, v0, Lw/B$c;->d:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/b;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lw/B$c;->n(Ly0/b;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lw/B$c;->c:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-wide v3, p0, Lw/B$c;->b:J

    iget-object v1, p0, Lw/B$c;->d:Ljava/lang/Object;

    check-cast v1, Ly0/b;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lw/B$c;->d:Ljava/lang/Object;

    check-cast p1, Ly0/b;

    iget-object v1, p0, Lw/B$c;->e:Ly0/y;

    invoke-virtual {v1}, Ly0/y;->o()J

    move-result-wide v3

    invoke-interface {p1}, Ly0/b;->getViewConfiguration()Landroidx/compose/ui/platform/w1;

    move-result-object v1

    invoke-interface {v1}, Landroidx/compose/ui/platform/w1;->b()J

    move-result-wide v5

    add-long/2addr v3, v5

    move-object v1, p1

    :cond_2
    iput-object v1, p0, Lw/B$c;->d:Ljava/lang/Object;

    iput-wide v3, p0, Lw/B$c;->b:J

    iput v2, p0, Lw/B$c;->c:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x3

    const/4 v10, 0x0

    move-object v5, v1

    move-object v8, p0

    invoke-static/range {v5 .. v10}, Lw/B;->f(Ly0/b;ZLy0/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, Ly0/y;

    invoke-virtual {p1}, Ly0/y;->o()J

    move-result-wide v5

    cmp-long v5, v5, v3

    if-ltz v5, :cond_2

    return-object p1
.end method

.method public final n(Ly0/b;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lw/B$c;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lw/B$c;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lw/B$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
