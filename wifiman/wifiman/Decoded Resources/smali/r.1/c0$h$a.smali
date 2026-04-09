.class final Lr/c0$h$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/c0$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Ljava/lang/Object;

.field final synthetic d:Ljava/lang/Object;

.field final synthetic e:Lr/c0;

.field final synthetic f:Lr/o0;

.field final synthetic g:F


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lr/c0;Lr/o0;FLdh/e;)V
    .locals 0

    iput-object p1, p0, Lr/c0$h$a;->c:Ljava/lang/Object;

    iput-object p2, p0, Lr/c0$h$a;->d:Ljava/lang/Object;

    iput-object p3, p0, Lr/c0$h$a;->e:Lr/c0;

    iput-object p4, p0, Lr/c0$h$a;->f:Lr/o0;

    iput p5, p0, Lr/c0$h$a;->g:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 8

    new-instance v7, Lr/c0$h$a;

    iget-object v1, p0, Lr/c0$h$a;->c:Ljava/lang/Object;

    iget-object v2, p0, Lr/c0$h$a;->d:Ljava/lang/Object;

    iget-object v3, p0, Lr/c0$h$a;->e:Lr/c0;

    iget-object v4, p0, Lr/c0$h$a;->f:Lr/o0;

    iget v5, p0, Lr/c0$h$a;->g:F

    move-object v0, v7

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lr/c0$h$a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lr/c0;Lr/o0;FLdh/e;)V

    iput-object p1, v7, Lr/c0$h$a;->b:Ljava/lang/Object;

    return-object v7
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lr/c0$h$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lr/c0$h$a;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lr/c0$h$a;->b:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, LIi/N;

    iget-object p1, p0, Lr/c0$h$a;->c:Ljava/lang/Object;

    iget-object v1, p0, Lr/c0$h$a;->d:Ljava/lang/Object;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_2

    iget-object p1, p0, Lr/c0$h$a;->e:Lr/c0;

    invoke-static {p1}, Lr/c0;->r(Lr/c0;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lr/c0$h$a;->e:Lr/c0;

    invoke-static {p1, v1}, Lr/c0;->v(Lr/c0;Lr/c0$b;)V

    iget-object p1, p0, Lr/c0$h$a;->e:Lr/c0;

    invoke-virtual {p1}, Lr/c0;->a()Ljava/lang/Object;

    move-result-object p1

    iget-object v4, p0, Lr/c0$h$a;->c:Ljava/lang/Object;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_3
    :goto_0
    iget-object p1, p0, Lr/c0$h$a;->c:Ljava/lang/Object;

    iget-object v4, p0, Lr/c0$h$a;->d:Ljava/lang/Object;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lr/c0$h$a;->f:Lr/o0;

    iget-object v4, p0, Lr/c0$h$a;->c:Ljava/lang/Object;

    invoke-virtual {p1, v4}, Lr/o0;->R(Ljava/lang/Object;)V

    iget-object p1, p0, Lr/c0$h$a;->f:Lr/o0;

    const-wide/16 v4, 0x0

    invoke-virtual {p1, v4, v5}, Lr/o0;->J(J)V

    iget-object p1, p0, Lr/c0$h$a;->e:Lr/c0;

    iget-object v4, p0, Lr/c0$h$a;->c:Ljava/lang/Object;

    invoke-virtual {p1, v4}, Lr/c0;->V(Ljava/lang/Object;)V

    iget-object p1, p0, Lr/c0$h$a;->f:Lr/o0;

    iget v4, p0, Lr/c0$h$a;->g:F

    invoke-virtual {p1, v4}, Lr/o0;->E(F)V

    :cond_4
    iget-object p1, p0, Lr/c0$h$a;->e:Lr/c0;

    iget v4, p0, Lr/c0$h$a;->g:F

    invoke-static {p1, v4}, Lr/c0;->w(Lr/c0;F)V

    iget-object p1, p0, Lr/c0$h$a;->e:Lr/c0;

    invoke-static {p1}, Lr/c0;->m(Lr/c0;)Lo/F;

    move-result-object p1

    invoke-virtual {p1}, Lo/M;->d()Z

    move-result p1

    if-eqz p1, :cond_5

    new-instance v6, Lr/c0$h$a$a;

    iget-object p1, p0, Lr/c0$h$a;->e:Lr/c0;

    invoke-direct {v6, p1, v1}, Lr/c0$h$a$a;-><init>(Lr/c0;Ldh/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    goto :goto_1

    :cond_5
    iget-object p1, p0, Lr/c0$h$a;->e:Lr/c0;

    const-wide/high16 v3, -0x8000000000000000L

    invoke-static {p1, v3, v4}, Lr/c0;->x(Lr/c0;J)V

    :goto_1
    iget-object p1, p0, Lr/c0$h$a;->e:Lr/c0;

    iput v2, p0, Lr/c0$h$a;->a:I

    invoke-static {p1, p0}, Lr/c0;->z(Lr/c0;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    return-object v0

    :cond_6
    :goto_2
    iget-object p1, p0, Lr/c0$h$a;->e:Lr/c0;

    invoke-static {p1}, Lr/c0;->u(Lr/c0;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lr/c0$h$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lr/c0$h$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lr/c0$h$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
