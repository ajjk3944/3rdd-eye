.class final Landroidx/compose/animation/m$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/m;->D2(J)J
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Landroidx/compose/animation/m$a;

.field final synthetic c:J

.field final synthetic d:Landroidx/compose/animation/m;


# direct methods
.method constructor <init>(Landroidx/compose/animation/m$a;JLandroidx/compose/animation/m;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/m$b;->b:Landroidx/compose/animation/m$a;

    iput-wide p2, p0, Landroidx/compose/animation/m$b;->c:J

    iput-object p4, p0, Landroidx/compose/animation/m$b;->d:Landroidx/compose/animation/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 6

    new-instance p1, Landroidx/compose/animation/m$b;

    iget-object v1, p0, Landroidx/compose/animation/m$b;->b:Landroidx/compose/animation/m$a;

    iget-wide v2, p0, Landroidx/compose/animation/m$b;->c:J

    iget-object v4, p0, Landroidx/compose/animation/m$b;->d:Landroidx/compose/animation/m;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/animation/m$b;-><init>(Landroidx/compose/animation/m$a;JLandroidx/compose/animation/m;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/animation/m$b;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/animation/m$b;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/animation/m$b;->b:Landroidx/compose/animation/m$a;

    invoke-virtual {p1}, Landroidx/compose/animation/m$a;->a()Lr/a;

    move-result-object v3

    iget-wide v4, p0, Landroidx/compose/animation/m$b;->c:J

    invoke-static {v4, v5}, LY0/r;->b(J)LY0/r;

    move-result-object v4

    iget-object p1, p0, Landroidx/compose/animation/m$b;->d:Landroidx/compose/animation/m;

    invoke-virtual {p1}, Landroidx/compose/animation/m;->G2()Lr/i;

    move-result-object v5

    iput v2, p0, Landroidx/compose/animation/m$b;->a:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v9, 0xc

    const/4 v10, 0x0

    move-object v8, p0

    invoke-static/range {v3 .. v10}, Lr/a;->f(Lr/a;Ljava/lang/Object;Lr/i;Ljava/lang/Object;Lmh/l;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lr/g;

    invoke-virtual {p1}, Lr/g;->a()Lr/e;

    move-result-object v0

    sget-object v1, Lr/e;->Finished:Lr/e;

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Landroidx/compose/animation/m$b;->d:Landroidx/compose/animation/m;

    invoke-virtual {v0}, Landroidx/compose/animation/m;->H2()Lmh/p;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v1, p0, Landroidx/compose/animation/m$b;->b:Landroidx/compose/animation/m$a;

    invoke-virtual {v1}, Landroidx/compose/animation/m$a;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/r;->b(J)LY0/r;

    move-result-object v1

    invoke-virtual {p1}, Lr/g;->b()Lr/k;

    move-result-object p1

    invoke-virtual {p1}, Lr/k;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/compose/animation/m$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Landroidx/compose/animation/m$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Landroidx/compose/animation/m$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
