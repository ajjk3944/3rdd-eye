.class final LN/Q0$b$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/Q0$b;->a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LN/R0;

.field final synthetic c:Ljava/util/Map;

.field final synthetic d:LN/x0;

.field final synthetic e:LY0/d;

.field final synthetic f:Lmh/p;

.field final synthetic g:F


# direct methods
.method constructor <init>(LN/R0;Ljava/util/Map;LN/x0;LY0/d;Lmh/p;FLdh/e;)V
    .locals 0

    iput-object p1, p0, LN/Q0$b$a;->b:LN/R0;

    iput-object p2, p0, LN/Q0$b$a;->c:Ljava/util/Map;

    iput-object p3, p0, LN/Q0$b$a;->d:LN/x0;

    iput-object p4, p0, LN/Q0$b$a;->e:LY0/d;

    iput-object p5, p0, LN/Q0$b$a;->f:Lmh/p;

    iput p6, p0, LN/Q0$b$a;->g:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 8

    new-instance p1, LN/Q0$b$a;

    iget-object v1, p0, LN/Q0$b$a;->b:LN/R0;

    iget-object v2, p0, LN/Q0$b$a;->c:Ljava/util/Map;

    iget-object v3, p0, LN/Q0$b$a;->d:LN/x0;

    iget-object v4, p0, LN/Q0$b$a;->e:LY0/d;

    iget-object v5, p0, LN/Q0$b$a;->f:Lmh/p;

    iget v6, p0, LN/Q0$b$a;->g:F

    move-object v0, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, LN/Q0$b$a;-><init>(LN/R0;Ljava/util/Map;LN/x0;LY0/d;Lmh/p;FLdh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LN/Q0$b$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LN/Q0$b$a;->a:I

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

    iget-object p1, p0, LN/Q0$b$a;->b:LN/R0;

    invoke-virtual {p1}, LN/R0;->l()Ljava/util/Map;

    move-result-object p1

    iget-object v1, p0, LN/Q0$b$a;->b:LN/R0;

    iget-object v3, p0, LN/Q0$b$a;->c:Ljava/util/Map;

    invoke-virtual {v1, v3}, LN/R0;->A(Ljava/util/Map;)V

    iget-object v1, p0, LN/Q0$b$a;->b:LN/R0;

    iget-object v3, p0, LN/Q0$b$a;->d:LN/x0;

    invoke-virtual {v1, v3}, LN/R0;->D(LN/x0;)V

    iget-object v1, p0, LN/Q0$b$a;->b:LN/R0;

    new-instance v3, LN/Q0$b$a$a;

    iget-object v4, p0, LN/Q0$b$a;->c:Ljava/util/Map;

    iget-object v5, p0, LN/Q0$b$a;->f:Lmh/p;

    iget-object v6, p0, LN/Q0$b$a;->e:LY0/d;

    invoke-direct {v3, v4, v5, v6}, LN/Q0$b$a$a;-><init>(Ljava/util/Map;Lmh/p;LY0/d;)V

    invoke-virtual {v1, v3}, LN/R0;->E(Lmh/p;)V

    iget-object v1, p0, LN/Q0$b$a;->e:LY0/d;

    iget-object v3, p0, LN/Q0$b$a;->b:LN/R0;

    iget v4, p0, LN/Q0$b$a;->g:F

    invoke-interface {v1, v4}, LY0/d;->d1(F)F

    move-result v1

    invoke-virtual {v3, v1}, LN/R0;->F(F)V

    iget-object v1, p0, LN/Q0$b$a;->b:LN/R0;

    iget-object v3, p0, LN/Q0$b$a;->c:Ljava/util/Map;

    iput v2, p0, LN/Q0$b$a;->a:I

    invoke-virtual {v1, p1, v3, p0}, LN/R0;->z(Ljava/util/Map;Ljava/util/Map;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LN/Q0$b$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LN/Q0$b$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LN/Q0$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
