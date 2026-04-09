.class final LF/m$e$a$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/m$e$a;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LM/G;

.field final synthetic b:LF/E;

.field final synthetic c:Z

.field final synthetic d:Z

.field final synthetic e:Lmh/l;

.field final synthetic f:LR0/Q;

.field final synthetic g:LR0/H;

.field final synthetic h:LY0/d;

.field final synthetic i:I


# direct methods
.method constructor <init>(LM/G;LF/E;ZZLmh/l;LR0/Q;LR0/H;LY0/d;I)V
    .locals 0

    iput-object p1, p0, LF/m$e$a$a;->a:LM/G;

    iput-object p2, p0, LF/m$e$a$a;->b:LF/E;

    iput-boolean p3, p0, LF/m$e$a$a;->c:Z

    iput-boolean p4, p0, LF/m$e$a$a;->d:Z

    iput-object p5, p0, LF/m$e$a$a;->e:Lmh/l;

    iput-object p6, p0, LF/m$e$a$a;->f:LR0/Q;

    iput-object p7, p0, LF/m$e$a$a;->g:LR0/H;

    iput-object p8, p0, LF/m$e$a$a;->h:LY0/d;

    iput p9, p0, LF/m$e$a$a;->i:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 10

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LT/l;->C()V

    goto/16 :goto_4

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:721)"

    const v2, -0x15a57eaf

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    new-instance p2, LF/m$e$a$a$a;

    iget-object v4, p0, LF/m$e$a$a;->b:LF/E;

    iget-object v5, p0, LF/m$e$a$a;->e:Lmh/l;

    iget-object v6, p0, LF/m$e$a$a;->f:LR0/Q;

    iget-object v7, p0, LF/m$e$a$a;->g:LR0/H;

    iget-object v8, p0, LF/m$e$a$a;->h:LY0/d;

    iget v9, p0, LF/m$e$a$a;->i:I

    move-object v3, p2

    invoke-direct/range {v3 .. v9}, LF/m$e$a$a$a;-><init>(LF/E;Lmh/l;LR0/Q;LR0/H;LY0/d;I)V

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/4 v1, 0x0

    invoke-static {p1, v1}, LT/j;->a(LT/l;I)I

    move-result v2

    invoke-interface {p1}, LT/l;->G()LT/x;

    move-result-object v3

    invoke-static {p1, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v4, LE0/g;->K:LE0/g$a;

    invoke-virtual {v4}, LE0/g$a;->a()Lmh/a;

    move-result-object v5

    invoke-interface {p1}, LT/l;->x()LT/f;

    move-result-object v6

    if-nez v6, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface {p1}, LT/l;->u()V

    invoke-interface {p1}, LT/l;->o()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {p1, v5}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface {p1}, LT/l;->I()V

    :goto_1
    invoke-static {p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v5

    invoke-virtual {v4}, LE0/g$a;->e()Lmh/p;

    move-result-object v6

    invoke-static {v5, p2, v6}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v4}, LE0/g$a;->g()Lmh/p;

    move-result-object p2

    invoke-static {v5, v3, p2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v4}, LE0/g$a;->b()Lmh/p;

    move-result-object p2

    invoke-interface {v5}, LT/l;->o()Z

    move-result v3

    if-nez v3, :cond_5

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    :cond_5
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v3}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v5, v2, p2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual {v4}, LE0/g$a;->f()Lmh/p;

    move-result-object p2

    invoke-static {v5, v0, p2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-interface {p1}, LT/l;->R()V

    iget-object p2, p0, LF/m$e$a$a;->a:LM/G;

    iget-object v0, p0, LF/m$e$a$a;->b:LF/E;

    invoke-virtual {v0}, LF/E;->d()LF/q;

    move-result-object v0

    sget-object v2, LF/q;->None:LF/q;

    if-eq v0, v2, :cond_7

    iget-object v0, p0, LF/m$e$a$a;->b:LF/E;

    invoke-virtual {v0}, LF/E;->i()LC0/r;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v0, p0, LF/m$e$a$a;->b:LF/E;

    invoke-virtual {v0}, LF/E;->i()LC0/r;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v0}, LC0/r;->M()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-boolean v0, p0, LF/m$e$a$a;->c:Z

    if-eqz v0, :cond_7

    const/4 v0, 0x1

    goto :goto_2

    :cond_7
    move v0, v1

    :goto_2
    invoke-static {p2, v0, p1, v1}, LF/m;->h(LM/G;ZLT/l;I)V

    iget-object p2, p0, LF/m$e$a$a;->b:LF/E;

    invoke-virtual {p2}, LF/E;->d()LF/q;

    move-result-object p2

    sget-object v0, LF/q;->Cursor:LF/q;

    if-ne p2, v0, :cond_8

    iget-boolean p2, p0, LF/m$e$a$a;->d:Z

    if-nez p2, :cond_8

    iget-boolean p2, p0, LF/m$e$a$a;->c:Z

    if-eqz p2, :cond_8

    const p2, -0x1f0292

    invoke-interface {p1, p2}, LT/l;->U(I)V

    iget-object p2, p0, LF/m$e$a$a;->a:LM/G;

    invoke-static {p2, p1, v1}, LF/m;->e(LM/G;LT/l;I)V

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_3

    :cond_8
    const p2, -0x1dd642

    invoke-interface {p1, p2}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->J()V

    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_4
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LF/m$e$a$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
