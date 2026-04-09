.class final LF/m$l;
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

.field final synthetic b:Landroidx/compose/ui/focus/o;

.field final synthetic c:Z

.field final synthetic d:Z

.field final synthetic e:LM/G;

.field final synthetic f:LR0/H;


# direct methods
.method constructor <init>(LF/E;Landroidx/compose/ui/focus/o;ZZLM/G;LR0/H;)V
    .locals 0

    iput-object p1, p0, LF/m$l;->a:LF/E;

    iput-object p2, p0, LF/m$l;->b:Landroidx/compose/ui/focus/o;

    iput-boolean p3, p0, LF/m$l;->c:Z

    iput-boolean p4, p0, LF/m$l;->d:Z

    iput-object p5, p0, LF/m$l;->e:LM/G;

    iput-object p6, p0, LF/m$l;->f:LR0/H;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 8

    iget-object v0, p0, LF/m$l;->a:LF/E;

    iget-object v1, p0, LF/m$l;->b:Landroidx/compose/ui/focus/o;

    iget-boolean v2, p0, LF/m$l;->c:Z

    xor-int/lit8 v2, v2, 0x1

    invoke-static {v0, v1, v2}, LF/m;->l(LF/E;Landroidx/compose/ui/focus/o;Z)V

    iget-object v0, p0, LF/m$l;->a:LF/E;

    invoke-virtual {v0}, LF/E;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, LF/m$l;->d:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LF/m$l;->a:LF/E;

    invoke-virtual {v0}, LF/E;->d()LF/q;

    move-result-object v0

    sget-object v1, LF/q;->Selection:LF/q;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, LF/m$l;->a:LF/E;

    invoke-virtual {v0}, LF/E;->j()LF/j0;

    move-result-object v4

    if-eqz v4, :cond_1

    iget-object v0, p0, LF/m$l;->a:LF/E;

    iget-object v6, p0, LF/m$l;->f:LR0/H;

    sget-object v1, LF/W;->a:LF/W$a;

    invoke-virtual {v0}, LF/E;->n()LR0/k;

    move-result-object v5

    invoke-virtual {v0}, LF/E;->m()Lmh/l;

    move-result-object v7

    move-wide v2, p1

    invoke-virtual/range {v1 .. v7}, LF/W$a;->j(JLF/j0;LR0/k;LR0/H;Lmh/l;)V

    invoke-virtual {v0}, LF/E;->v()LF/S;

    move-result-object p1

    invoke-virtual {p1}, LF/S;->k()LL0/d;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_1

    sget-object p1, LF/q;->Cursor:LF/q;

    invoke-virtual {v0, p1}, LF/E;->B(LF/q;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LF/m$l;->e:LM/G;

    invoke-static {p1, p2}, Ll0/g;->d(J)Ll0/g;

    move-result-object p1

    invoke-virtual {v0, p1}, LM/G;->t(Ll0/g;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ll0/g;

    invoke-virtual {p1}, Ll0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LF/m$l;->a(J)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
