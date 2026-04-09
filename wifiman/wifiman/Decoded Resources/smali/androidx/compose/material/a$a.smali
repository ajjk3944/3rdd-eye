.class final Landroidx/compose/material/a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/a;->d(Landroidx/compose/ui/e;LN/b;Lw/q;ZZLy/m;Z)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field synthetic c:F

.field final synthetic d:LN/b;


# direct methods
.method constructor <init>(LN/b;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/material/a$a;->d:LN/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, Landroidx/compose/material/a$a;->a:I

    if-nez v0, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/material/a$a;->b:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, LIi/N;

    iget p1, p0, Landroidx/compose/material/a$a;->c:F

    new-instance v3, Landroidx/compose/material/a$a$a;

    iget-object v1, p0, Landroidx/compose/material/a$a;->d:LN/b;

    const/4 v2, 0x0

    invoke-direct {v3, v1, p1, v2}, Landroidx/compose/material/a$a$a;-><init>(LN/b;FLdh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;FLdh/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Landroidx/compose/material/a$a;

    iget-object v1, p0, Landroidx/compose/material/a$a;->d:LN/b;

    invoke-direct {v0, v1, p3}, Landroidx/compose/material/a$a;-><init>(LN/b;Ldh/e;)V

    iput-object p1, v0, Landroidx/compose/material/a$a;->b:Ljava/lang/Object;

    iput p2, v0, Landroidx/compose/material/a$a;->c:F

    sget-object p1, LYg/J;->a:LYg/J;

    invoke-virtual {v0, p1}, Landroidx/compose/material/a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    check-cast p3, Ldh/e;

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/material/a$a;->n(LIi/N;FLdh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
