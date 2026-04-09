.class final Landroidx/compose/material/a$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/a;->f(LN/b;Ljava/lang/Object;FLdh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field synthetic c:Ljava/lang/Object;

.field synthetic d:Ljava/lang/Object;

.field final synthetic e:LN/b;

.field final synthetic f:F


# direct methods
.method constructor <init>(LN/b;FLdh/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/material/a$b;->e:LN/b;

    iput p2, p0, Landroidx/compose/material/a$b;->f:F

    const/4 p1, 0x4

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Landroidx/compose/material/a$b;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/material/a$b;->b:Ljava/lang/Object;

    check-cast p1, LN/a;

    iget-object v1, p0, Landroidx/compose/material/a$b;->c:Ljava/lang/Object;

    check-cast v1, LN/D;

    iget-object v3, p0, Landroidx/compose/material/a$b;->d:Ljava/lang/Object;

    invoke-interface {v1, v3}, LN/D;->e(Ljava/lang/Object;)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_3

    new-instance v1, Lkotlin/jvm/internal/K;

    invoke-direct {v1}, Lkotlin/jvm/internal/K;-><init>()V

    iget-object v3, p0, Landroidx/compose/material/a$b;->e:LN/b;

    invoke-virtual {v3}, LN/b;->w()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, 0x0

    :goto_0
    move v4, v3

    goto :goto_1

    :cond_2
    iget-object v3, p0, Landroidx/compose/material/a$b;->e:LN/b;

    invoke-virtual {v3}, LN/b;->w()F

    move-result v3

    goto :goto_0

    :goto_1
    iput v4, v1, Lkotlin/jvm/internal/K;->a:F

    iget v6, p0, Landroidx/compose/material/a$b;->f:F

    iget-object v3, p0, Landroidx/compose/material/a$b;->e:LN/b;

    invoke-virtual {v3}, LN/b;->p()Lr/i;

    move-result-object v7

    new-instance v8, Landroidx/compose/material/a$b$a;

    invoke-direct {v8, p1, v1}, Landroidx/compose/material/a$b$a;-><init>(LN/a;Lkotlin/jvm/internal/K;)V

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/compose/material/a$b;->b:Ljava/lang/Object;

    iput-object p1, p0, Landroidx/compose/material/a$b;->c:Ljava/lang/Object;

    iput v2, p0, Landroidx/compose/material/a$b;->a:I

    move-object v9, p0

    invoke-static/range {v4 .. v9}, Lr/m0;->b(FFFLr/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LN/a;LN/D;Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Landroidx/compose/material/a$b;

    iget-object v1, p0, Landroidx/compose/material/a$b;->e:LN/b;

    iget v2, p0, Landroidx/compose/material/a$b;->f:F

    invoke-direct {v0, v1, v2, p4}, Landroidx/compose/material/a$b;-><init>(LN/b;FLdh/e;)V

    iput-object p1, v0, Landroidx/compose/material/a$b;->b:Ljava/lang/Object;

    iput-object p2, v0, Landroidx/compose/material/a$b;->c:Ljava/lang/Object;

    iput-object p3, v0, Landroidx/compose/material/a$b;->d:Ljava/lang/Object;

    sget-object p1, LYg/J;->a:LYg/J;

    invoke-virtual {v0, p1}, Landroidx/compose/material/a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LN/a;

    check-cast p2, LN/D;

    check-cast p4, Ldh/e;

    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/compose/material/a$b;->n(LN/a;LN/D;Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
