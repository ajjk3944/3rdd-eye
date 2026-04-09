.class final Lw/A$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/A;->q(JLdh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:J

.field b:I

.field synthetic c:J

.field final synthetic d:Lw/A;


# direct methods
.method constructor <init>(Lw/A;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lw/A$d;->d:Lw/A;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 2

    new-instance v0, Lw/A$d;

    iget-object v1, p0, Lw/A$d;->d:Lw/A;

    invoke-direct {v0, v1, p2}, Lw/A$d;-><init>(Lw/A;Ldh/e;)V

    check-cast p1, LY0/y;

    invoke-virtual {p1}, LY0/y;->o()J

    move-result-wide p1

    iput-wide p1, v0, Lw/A$d;->c:J

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LY0/y;

    invoke-virtual {p1}, LY0/y;->o()J

    move-result-wide v0

    check-cast p2, Ldh/e;

    invoke-virtual {p0, v0, v1, p2}, Lw/A$d;->n(JLdh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v6

    iget v0, p0, Lw/A$d;->b:I

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v0, :cond_3

    if-eq v0, v3, :cond_2

    if-eq v0, v2, :cond_1

    if-ne v0, v1, :cond_0

    iget-wide v0, p0, Lw/A$d;->a:J

    iget-wide v2, p0, Lw/A$d;->c:J

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-wide v9, v0

    move-object v0, p1

    goto/16 :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-wide v2, p0, Lw/A$d;->a:J

    iget-wide v4, p0, Lw/A$d;->c:J

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object v0, p1

    move-wide v7, v4

    goto :goto_1

    :cond_2
    iget-wide v3, p0, Lw/A$d;->c:J

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    move-object v0, p1

    goto :goto_0

    :cond_3
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-wide v4, p0, Lw/A$d;->c:J

    iget-object v0, p0, Lw/A$d;->d:Lw/A;

    invoke-static {v0}, Lw/A;->c(Lw/A;)Lx0/b;

    move-result-object v0

    iput-wide v4, p0, Lw/A$d;->c:J

    iput v3, p0, Lw/A$d;->b:I

    invoke-virtual {v0, v4, v5, p0}, Lx0/b;->c(JLdh/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_4

    return-object v6

    :cond_4
    move-wide v3, v4

    :goto_0
    check-cast v0, LY0/y;

    invoke-virtual {v0}, LY0/y;->o()J

    move-result-wide v7

    invoke-static {v3, v4, v7, v8}, LY0/y;->k(JJ)J

    move-result-wide v7

    iget-object v0, p0, Lw/A$d;->d:Lw/A;

    iput-wide v3, p0, Lw/A$d;->c:J

    iput-wide v7, p0, Lw/A$d;->a:J

    iput v2, p0, Lw/A$d;->b:I

    invoke-virtual {v0, v7, v8, p0}, Lw/A;->n(JLdh/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_5

    return-object v6

    :cond_5
    move-wide v11, v3

    move-wide v2, v7

    move-wide v7, v11

    :goto_1
    check-cast v0, LY0/y;

    invoke-virtual {v0}, LY0/y;->o()J

    move-result-wide v9

    iget-object v0, p0, Lw/A$d;->d:Lw/A;

    invoke-static {v0}, Lw/A;->c(Lw/A;)Lx0/b;

    move-result-object v0

    invoke-static {v2, v3, v9, v10}, LY0/y;->k(JJ)J

    move-result-wide v2

    iput-wide v7, p0, Lw/A$d;->c:J

    iput-wide v9, p0, Lw/A$d;->a:J

    iput v1, p0, Lw/A$d;->b:I

    move-wide v1, v2

    move-wide v3, v9

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lx0/b;->a(JJLdh/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_6

    return-object v6

    :cond_6
    move-wide v2, v7

    :goto_2
    check-cast v0, LY0/y;

    invoke-virtual {v0}, LY0/y;->o()J

    move-result-wide v0

    invoke-static {v9, v10, v0, v1}, LY0/y;->k(JJ)J

    move-result-wide v0

    invoke-static {v2, v3, v0, v1}, LY0/y;->k(JJ)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/y;->b(J)LY0/y;

    move-result-object v0

    return-object v0
.end method

.method public final n(JLdh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1, p2}, LY0/y;->b(J)LY0/y;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, Lw/A$d;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lw/A$d;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lw/A$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
