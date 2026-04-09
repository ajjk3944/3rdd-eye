.class final Lr/c0$i;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr/c0;->X(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lr/c0;

.field final synthetic c:Ljava/lang/Object;

.field final synthetic d:Lr/o0;


# direct methods
.method constructor <init>(Lr/c0;Ljava/lang/Object;Lr/o0;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lr/c0$i;->b:Lr/c0;

    iput-object p2, p0, Lr/c0$i;->c:Ljava/lang/Object;

    iput-object p3, p0, Lr/c0$i;->d:Lr/o0;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ldh/e;)Ldh/e;
    .locals 4

    new-instance v0, Lr/c0$i;

    iget-object v1, p0, Lr/c0$i;->b:Lr/c0;

    iget-object v2, p0, Lr/c0$i;->c:Ljava/lang/Object;

    iget-object v3, p0, Lr/c0$i;->d:Lr/o0;

    invoke-direct {v0, v1, v2, v3, p1}, Lr/c0$i;-><init>(Lr/c0;Ljava/lang/Object;Lr/o0;Ldh/e;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldh/e;

    invoke-virtual {p0, p1}, Lr/c0$i;->n(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lr/c0$i;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lr/c0$i;->b:Lr/c0;

    invoke-static {p1}, Lr/c0;->i(Lr/c0;)V

    iget-object p1, p0, Lr/c0$i;->b:Lr/c0;

    const-wide/high16 v3, -0x8000000000000000L

    invoke-static {p1, v3, v4}, Lr/c0;->x(Lr/c0;J)V

    iget-object p1, p0, Lr/c0$i;->b:Lr/c0;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lr/c0;->w(Lr/c0;F)V

    iget-object p1, p0, Lr/c0$i;->c:Ljava/lang/Object;

    iget-object v3, p0, Lr/c0$i;->b:Lr/c0;

    invoke-virtual {v3}, Lr/c0;->a()Ljava/lang/Object;

    move-result-object v3

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/high16 v4, -0x3fc00000    # -3.0f

    if-eqz v3, :cond_2

    const/high16 p1, -0x3f800000    # -4.0f

    goto :goto_0

    :cond_2
    iget-object v3, p0, Lr/c0$i;->b:Lr/c0;

    invoke-virtual {v3}, Lr/c0;->b()Ljava/lang/Object;

    move-result-object v3

    invoke-static {p1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/high16 p1, -0x3f600000    # -5.0f

    goto :goto_0

    :cond_3
    move p1, v4

    :goto_0
    iget-object v3, p0, Lr/c0$i;->d:Lr/o0;

    iget-object v5, p0, Lr/c0$i;->c:Ljava/lang/Object;

    invoke-virtual {v3, v5}, Lr/o0;->R(Ljava/lang/Object;)V

    iget-object v3, p0, Lr/c0$i;->d:Lr/o0;

    const-wide/16 v5, 0x0

    invoke-virtual {v3, v5, v6}, Lr/o0;->J(J)V

    iget-object v3, p0, Lr/c0$i;->b:Lr/c0;

    iget-object v5, p0, Lr/c0$i;->c:Ljava/lang/Object;

    invoke-virtual {v3, v5}, Lr/c0;->V(Ljava/lang/Object;)V

    iget-object v3, p0, Lr/c0$i;->b:Lr/c0;

    invoke-static {v3, v1}, Lr/c0;->w(Lr/c0;F)V

    iget-object v1, p0, Lr/c0$i;->b:Lr/c0;

    iget-object v3, p0, Lr/c0$i;->c:Ljava/lang/Object;

    invoke-virtual {v1, v3}, Lr/c0;->d(Ljava/lang/Object;)V

    iget-object v1, p0, Lr/c0$i;->d:Lr/o0;

    invoke-virtual {v1, p1}, Lr/o0;->E(F)V

    cmpg-float p1, p1, v4

    if-nez p1, :cond_4

    iget-object p1, p0, Lr/c0$i;->b:Lr/c0;

    iput v2, p0, Lr/c0$i;->a:I

    invoke-static {p1, p0}, Lr/c0;->z(Lr/c0;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    iget-object p1, p0, Lr/c0$i;->d:Lr/o0;

    invoke-virtual {p1}, Lr/o0;->z()V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(Ldh/e;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lr/c0$i;->create(Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lr/c0$i;

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-virtual {p1, v0}, Lr/c0$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
