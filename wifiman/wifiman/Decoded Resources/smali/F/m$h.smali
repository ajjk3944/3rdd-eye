.class final LF/m$h;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/m;->a(LR0/Q;Lmh/l;Landroidx/compose/ui/e;LL0/U;LR0/c0;Lmh/l;Ly/m;Lm0/l0;ZIILR0/s;LF/C;ZZLmh/q;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/E;

.field final synthetic b:LR0/Q;

.field final synthetic c:LR0/H;


# direct methods
.method constructor <init>(LF/E;LR0/Q;LR0/H;)V
    .locals 0

    iput-object p1, p0, LF/m$h;->a:LF/E;

    iput-object p2, p0, LF/m$h;->b:LR0/Q;

    iput-object p3, p0, LF/m$h;->c:LR0/H;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lo0/f;)V
    .locals 13

    iget-object v0, p0, LF/m$h;->a:LF/E;

    invoke-virtual {v0}, LF/E;->j()LF/j0;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v3, p0, LF/m$h;->b:LR0/Q;

    iget-object v1, p0, LF/m$h;->a:LF/E;

    iget-object v8, p0, LF/m$h;->c:LR0/H;

    invoke-interface {p1}, Lo0/f;->k1()Lo0/d;

    move-result-object p1

    invoke-interface {p1}, Lo0/d;->d()Lm0/n0;

    move-result-object v2

    sget-object p1, LF/W;->a:LF/W$a;

    invoke-virtual {v1}, LF/E;->q()J

    move-result-wide v4

    invoke-virtual {v1}, LF/E;->c()J

    move-result-wide v6

    invoke-virtual {v0}, LF/j0;->f()LL0/M;

    move-result-object v9

    invoke-virtual {v1}, LF/E;->f()Lm0/S0;

    move-result-object v10

    invoke-virtual {v1}, LF/E;->p()J

    move-result-wide v11

    move-object v1, p1

    invoke-virtual/range {v1 .. v12}, LF/W$a;->b(Lm0/n0;LR0/Q;JJLR0/H;LL0/M;Lm0/S0;J)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo0/f;

    invoke-virtual {p0, p1}, LF/m$h;->a(Lo0/f;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
