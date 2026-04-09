.class final LM/a$b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/a$b;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Z

.field final synthetic c:Landroidx/compose/ui/e;

.field final synthetic d:LM/j;


# direct methods
.method constructor <init>(JZLandroidx/compose/ui/e;LM/j;)V
    .locals 0

    iput-wide p1, p0, LM/a$b$a;->a:J

    iput-boolean p3, p0, LM/a$b$a;->b:Z

    iput-object p4, p0, LM/a$b$a;->c:Landroidx/compose/ui/e;

    iput-object p5, p0, LM/a$b$a;->d:LM/j;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 8

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

    const-string v1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous>.<anonymous> (AndroidSelectionHandles.android.kt:83)"

    const v2, -0x5505aa6f

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-wide v0, p0, LM/a$b$a;->a:J

    const-wide v2, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long p2, v0, v2

    const/4 v0, 0x0

    if-eqz p2, :cond_a

    const p2, -0x31eeb398    # -6.094259E8f

    invoke-interface {p1, p2}, LT/l;->U(I)V

    iget-boolean p2, p0, LM/a$b$a;->b:Z

    if-eqz p2, :cond_3

    sget-object p2, Lz/c$a;->a:Lz/c$a;

    invoke-virtual {p2}, Lz/c$a;->b()Lz/c$e;

    move-result-object p2

    goto :goto_1

    :cond_3
    sget-object p2, Lz/c$a;->a:Lz/c$a;

    invoke-virtual {p2}, Lz/c$a;->a()Lz/c$e;

    move-result-object p2

    :goto_1
    iget-object v1, p0, LM/a$b$a;->c:Landroidx/compose/ui/e;

    iget-wide v2, p0, LM/a$b$a;->a:J

    invoke-static {v2, v3}, LY0/k;->h(J)F

    move-result v2

    iget-wide v3, p0, LM/a$b$a;->a:J

    invoke-static {v3, v4}, LY0/k;->g(J)F

    move-result v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/layout/r;->r(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object v2, p0, LM/a$b$a;->d:LM/j;

    iget-boolean v3, p0, LM/a$b$a;->b:Z

    sget-object v4, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v4}, Lf0/c$a;->l()Lf0/c$c;

    move-result-object v4

    invoke-static {p2, v4, p1, v0}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object p2

    invoke-static {p1, v0}, LT/j;->a(LT/l;I)I

    move-result v0

    invoke-interface {p1}, LT/l;->G()LT/x;

    move-result-object v4

    invoke-static {p1, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v5, LE0/g;->K:LE0/g$a;

    invoke-virtual {v5}, LE0/g$a;->a()Lmh/a;

    move-result-object v6

    invoke-interface {p1}, LT/l;->x()LT/f;

    move-result-object v7

    if-nez v7, :cond_4

    invoke-static {}, LT/j;->c()V

    :cond_4
    invoke-interface {p1}, LT/l;->u()V

    invoke-interface {p1}, LT/l;->o()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {p1, v6}, LT/l;->D(Lmh/a;)V

    goto :goto_2

    :cond_5
    invoke-interface {p1}, LT/l;->I()V

    :goto_2
    invoke-static {p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v6

    invoke-virtual {v5}, LE0/g$a;->e()Lmh/p;

    move-result-object v7

    invoke-static {v6, p2, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v5}, LE0/g$a;->g()Lmh/p;

    move-result-object p2

    invoke-static {v6, v4, p2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v5}, LE0/g$a;->b()Lmh/p;

    move-result-object p2

    invoke-interface {v6}, LT/l;->o()Z

    move-result v4

    if-nez v4, :cond_6

    invoke-interface {v6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    :cond_6
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v6, v4}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v0, p2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_7
    invoke-virtual {v5}, LE0/g$a;->f()Lmh/p;

    move-result-object p2

    invoke-static {v6, v1, p2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object p2, Lz/Z;->a:Lz/Z;

    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-interface {p1, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_8

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_9

    :cond_8
    new-instance v1, LM/a$b$a$a;

    invoke-direct {v1, v2}, LM/a$b$a$a;-><init>(LM/j;)V

    invoke-interface {p1, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v1, Lmh/a;

    const/4 v0, 0x6

    invoke-static {p2, v1, v3, p1, v0}, LM/a;->c(Landroidx/compose/ui/e;Lmh/a;ZLT/l;I)V

    invoke-interface {p1}, LT/l;->R()V

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_3

    :cond_a
    const p2, -0x31e194f0

    invoke-interface {p1, p2}, LT/l;->U(I)V

    iget-object p2, p0, LM/a$b$a;->c:Landroidx/compose/ui/e;

    iget-object v1, p0, LM/a$b$a;->d:LM/j;

    invoke-interface {p1, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, p0, LM/a$b$a;->d:LM/j;

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_b

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_c

    :cond_b
    new-instance v3, LM/a$b$a$b;

    invoke-direct {v3, v2}, LM/a$b$a$b;-><init>(LM/j;)V

    invoke-interface {p1, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_c
    check-cast v3, Lmh/a;

    iget-boolean v1, p0, LM/a$b$a;->b:Z

    invoke-static {p2, v3, v1, p1, v0}, LM/a;->c(Landroidx/compose/ui/e;Lmh/a;ZLT/l;I)V

    invoke-interface {p1}, LT/l;->J()V

    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_d

    invoke-static {}, LT/o;->P()V

    :cond_d
    :goto_4
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LM/a$b$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
