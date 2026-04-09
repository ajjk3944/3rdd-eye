.class final LN/m0$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


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

    iput-object p1, p0, LN/m0$c;->a:LN/n0;

    iput-object p2, p0, LN/m0$c;->b:LIi/N;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LJ0/w;)V
    .locals 5

    iget-object v0, p0, LN/m0$c;->a:LN/n0;

    invoke-virtual {v0}, LN/n0;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, LN/m0$c$a;

    iget-object v1, p0, LN/m0$c;->a:LN/n0;

    iget-object v2, p0, LN/m0$c;->b:LIi/N;

    invoke-direct {v0, v1, v2}, LN/m0$c$a;-><init>(LN/n0;LIi/N;)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {p1, v1, v0, v2, v1}, LJ0/t;->n(LJ0/w;Ljava/lang/String;Lmh/a;ILjava/lang/Object;)V

    iget-object v0, p0, LN/m0$c;->a:LN/n0;

    invoke-virtual {v0}, LN/n0;->d()LN/b;

    move-result-object v0

    invoke-virtual {v0}, LN/b;->s()Ljava/lang/Object;

    move-result-object v0

    sget-object v3, LN/o0;->HalfExpanded:LN/o0;

    if-ne v0, v3, :cond_0

    new-instance v0, LN/m0$c$b;

    iget-object v3, p0, LN/m0$c;->a:LN/n0;

    iget-object v4, p0, LN/m0$c;->b:LIi/N;

    invoke-direct {v0, v3, v4}, LN/m0$c$b;-><init>(LN/n0;LIi/N;)V

    invoke-static {p1, v1, v0, v2, v1}, LJ0/t;->q(LJ0/w;Ljava/lang/String;Lmh/a;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LN/m0$c;->a:LN/n0;

    invoke-virtual {v0}, LN/n0;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, LN/m0$c$c;

    iget-object v3, p0, LN/m0$c;->a:LN/n0;

    iget-object v4, p0, LN/m0$c;->b:LIi/N;

    invoke-direct {v0, v3, v4}, LN/m0$c$c;-><init>(LN/n0;LIi/N;)V

    invoke-static {p1, v1, v0, v2, v1}, LJ0/t;->f(LJ0/w;Ljava/lang/String;Lmh/a;ILjava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJ0/w;

    invoke-virtual {p0, p1}, LN/m0$c;->a(LJ0/w;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
