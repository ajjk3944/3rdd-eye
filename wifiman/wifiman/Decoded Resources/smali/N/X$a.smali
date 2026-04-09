.class final LN/X$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/X;->a(Lmh/p;Lmh/a;Landroidx/compose/ui/e;Lmh/p;Ly/m;Lm0/i1;JJLN/V;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/p;

.field final synthetic b:Lmh/p;


# direct methods
.method constructor <init>(Lmh/p;Lmh/p;)V
    .locals 0

    iput-object p1, p0, LN/X$a;->a:Lmh/p;

    iput-object p2, p0, LN/X$a;->b:Lmh/p;

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

    goto/16 :goto_5

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:169)"

    const v2, 0x5493f13b

    invoke-static {v2, p2, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, LN/X$a;->a:Lmh/p;

    if-nez p2, :cond_3

    invoke-static {}, LN/X;->d()F

    move-result p2

    :goto_1
    move v1, p2

    goto :goto_2

    :cond_3
    invoke-static {}, LN/X;->c()F

    move-result p2

    goto :goto_1

    :goto_2
    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {}, LN/X;->d()F

    move-result v3

    const/16 v5, 0xa

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v6}, Landroidx/compose/foundation/layout/o;->m(Landroidx/compose/ui/e;FFFFILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v1, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v1}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v1

    iget-object v2, p0, LN/X$a;->a:Lmh/p;

    iget-object v3, p0, LN/X$a;->b:Lmh/p;

    sget-object v4, Lz/c;->a:Lz/c;

    invoke-virtual {v4}, Lz/c;->f()Lz/c$e;

    move-result-object v4

    const/16 v5, 0x30

    invoke-static {v4, v1, p1, v5}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v1

    const/4 v4, 0x0

    invoke-static {p1, v4}, LT/j;->a(LT/l;I)I

    move-result v5

    invoke-interface {p1}, LT/l;->G()LT/x;

    move-result-object v6

    invoke-static {p1, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v0

    sget-object v7, LE0/g;->K:LE0/g$a;

    invoke-virtual {v7}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface {p1}, LT/l;->x()LT/f;

    move-result-object v9

    if-nez v9, :cond_4

    invoke-static {}, LT/j;->c()V

    :cond_4
    invoke-interface {p1}, LT/l;->u()V

    invoke-interface {p1}, LT/l;->o()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {p1, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_3

    :cond_5
    invoke-interface {p1}, LT/l;->I()V

    :goto_3
    invoke-static {p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    invoke-virtual {v7}, LE0/g$a;->e()Lmh/p;

    move-result-object v9

    invoke-static {v8, v1, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->g()Lmh/p;

    move-result-object v1

    invoke-static {v8, v6, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->b()Lmh/p;

    move-result-object v1

    invoke-interface {v8}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_6

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    :cond_6
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v8, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v8, v5, v1}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_7
    invoke-virtual {v7}, LE0/g$a;->f()Lmh/p;

    move-result-object v1

    invoke-static {v8, v0, v1}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v0, Lz/Z;->a:Lz/Z;

    if-eqz v2, :cond_8

    const v0, -0x21afd42e

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, p1, v0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, LN/X;->c()F

    move-result v0

    invoke-static {p2, v0}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object p2

    const/4 v0, 0x6

    invoke-static {p2, p1, v0}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_4

    :cond_8
    const p2, -0x21ae5909

    invoke-interface {p1, p2}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->J()V

    :goto_4
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v3, p1, p2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_5
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/X$a;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
