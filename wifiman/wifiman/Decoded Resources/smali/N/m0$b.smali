.class final LN/m0$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/m0;->b(Lmh/q;Landroidx/compose/ui/e;LN/n0;ZLm0/i1;FJJJLmh/p;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/n0;

.field final synthetic b:LIi/N;


# direct methods
.method constructor <init>(LN/n0;LIi/N;)V
    .locals 0

    iput-object p1, p0, LN/m0$b;->a:LN/n0;

    iput-object p2, p0, LN/m0$b;->b:LIi/N;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    iget-object v0, p0, LN/m0$b;->a:LN/n0;

    invoke-virtual {v0}, LN/n0;->d()LN/b;

    move-result-object v0

    invoke-virtual {v0}, LN/b;->r()Lmh/l;

    move-result-object v0

    sget-object v1, LN/o0;->Hidden:LN/o0;

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LN/m0$b;->b:LIi/N;

    new-instance v4, LN/m0$b$a;

    iget-object v0, p0, LN/m0$b;->a:LN/n0;

    const/4 v2, 0x0

    invoke-direct {v4, v0, v2}, LN/m0$b$a;-><init>(LN/n0;Ldh/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN/m0$b;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
