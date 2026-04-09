.class final LN/v$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/v;->a(ZLy/k;LT/l;I)LT/z1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lr/a;

.field final synthetic c:F

.field final synthetic d:Z

.field final synthetic e:LN/v;

.field final synthetic f:Ly/j;


# direct methods
.method constructor <init>(Lr/a;FZLN/v;Ly/j;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LN/v$b;->b:Lr/a;

    iput p2, p0, LN/v$b;->c:F

    iput-boolean p3, p0, LN/v$b;->d:Z

    iput-object p4, p0, LN/v$b;->e:LN/v;

    iput-object p5, p0, LN/v$b;->f:Ly/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 7

    new-instance p1, LN/v$b;

    iget-object v1, p0, LN/v$b;->b:Lr/a;

    iget v2, p0, LN/v$b;->c:F

    iget-boolean v3, p0, LN/v$b;->d:Z

    iget-object v4, p0, LN/v$b;->e:LN/v;

    iget-object v5, p0, LN/v$b;->f:Ly/j;

    move-object v0, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, LN/v$b;-><init>(Lr/a;FZLN/v;Ly/j;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LN/v$b;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LN/v$b;->a:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LN/v$b;->b:Lr/a;

    invoke-virtual {p1}, Lr/a;->k()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LY0/h;

    invoke-virtual {p1}, LY0/h;->s()F

    move-result p1

    iget v1, p0, LN/v$b;->c:F

    invoke-static {p1, v1}, LY0/h;->n(FF)Z

    move-result p1

    if-nez p1, :cond_7

    iget-boolean p1, p0, LN/v$b;->d:Z

    if-nez p1, :cond_3

    iget-object p1, p0, LN/v$b;->b:Lr/a;

    iget v1, p0, LN/v$b;->c:F

    invoke-static {v1}, LY0/h;->d(F)LY0/h;

    move-result-object v1

    iput v3, p0, LN/v$b;->a:I

    invoke-virtual {p1, v1, p0}, Lr/a;->t(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_3
    iget-object p1, p0, LN/v$b;->b:Lr/a;

    invoke-virtual {p1}, Lr/a;->k()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LY0/h;

    invoke-virtual {p1}, LY0/h;->s()F

    move-result p1

    iget-object v1, p0, LN/v$b;->e:LN/v;

    invoke-static {v1}, LN/v;->d(LN/v;)F

    move-result v1

    invoke-static {p1, v1}, LY0/h;->n(FF)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_4

    new-instance p1, Ly/o$b;

    sget-object v1, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v1}, Ll0/g$a;->c()J

    move-result-wide v4

    invoke-direct {p1, v4, v5, v3}, Ly/o$b;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, p1

    goto :goto_1

    :cond_4
    iget-object v1, p0, LN/v$b;->e:LN/v;

    invoke-static {v1}, LN/v;->c(LN/v;)F

    move-result v1

    invoke-static {p1, v1}, LY0/h;->n(FF)Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v3, Ly/g;

    invoke-direct {v3}, Ly/g;-><init>()V

    goto :goto_1

    :cond_5
    iget-object v1, p0, LN/v$b;->e:LN/v;

    invoke-static {v1}, LN/v;->b(LN/v;)F

    move-result v1

    invoke-static {p1, v1}, LY0/h;->n(FF)Z

    move-result p1

    if-eqz p1, :cond_6

    new-instance v3, Ly/d;

    invoke-direct {v3}, Ly/d;-><init>()V

    :cond_6
    :goto_1
    iget-object p1, p0, LN/v$b;->b:Lr/a;

    iget v1, p0, LN/v$b;->c:F

    iget-object v4, p0, LN/v$b;->f:Ly/j;

    iput v2, p0, LN/v$b;->a:I

    invoke-static {p1, v1, v3, v4, p0}, LN/L;->d(Lr/a;FLy/j;Ly/j;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LN/v$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LN/v$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LN/v$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
