.class public abstract Lz/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/e;LT/l;I)V
    .locals 5

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.layout.Spacer (Spacer.kt:38)"

    const v2, -0x4581923

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, Lz/b0;->a:Lz/b0;

    const/4 v0, 0x0

    invoke-static {p1, v0}, LT/j;->a(LT/l;I)I

    move-result v0

    invoke-static {p1, p0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p0

    invoke-interface {p1}, LT/l;->G()LT/x;

    move-result-object v1

    sget-object v2, LE0/g;->K:LE0/g$a;

    invoke-virtual {v2}, LE0/g$a;->a()Lmh/a;

    move-result-object v3

    invoke-interface {p1}, LT/l;->x()LT/f;

    move-result-object v4

    if-nez v4, :cond_1

    invoke-static {}, LT/j;->c()V

    :cond_1
    invoke-interface {p1}, LT/l;->u()V

    invoke-interface {p1}, LT/l;->o()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p1, v3}, LT/l;->D(Lmh/a;)V

    goto :goto_0

    :cond_2
    invoke-interface {p1}, LT/l;->I()V

    :goto_0
    invoke-static {p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v3

    invoke-virtual {v2}, LE0/g$a;->e()Lmh/p;

    move-result-object v4

    invoke-static {v3, p2, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v2}, LE0/g$a;->g()Lmh/p;

    move-result-object p2

    invoke-static {v3, v1, p2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v2}, LE0/g$a;->f()Lmh/p;

    move-result-object p2

    invoke-static {v3, p0, p2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v2}, LE0/g$a;->b()Lmh/p;

    move-result-object p0

    invoke-interface {v3}, LT/l;->o()Z

    move-result p2

    if-nez p2, :cond_3

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object p2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    :cond_3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v3, p2}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v3, p2, p0}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_4
    invoke-interface {p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    return-void
.end method
