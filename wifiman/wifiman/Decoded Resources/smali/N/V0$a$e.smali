.class final LN/V0$a$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/V0$a;->a(FJJFLT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:LN/S0;

.field final synthetic c:Z

.field final synthetic d:Lmh/p;


# direct methods
.method constructor <init>(FLN/S0;ZLmh/p;)V
    .locals 0

    iput p1, p0, LN/V0$a$e;->a:F

    iput-object p2, p0, LN/V0$a$e;->b:LN/S0;

    iput-boolean p3, p0, LN/V0$a$e;->c:Z

    iput-object p4, p0, LN/V0$a$e;->d:Lmh/p;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/e;LT/l;I)V
    .locals 10

    const/4 v0, 0x6

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr p3, v1

    :cond_1
    and-int/lit8 v1, p3, 0x13

    const/16 v2, 0x12

    if-ne v1, v2, :cond_3

    invoke-interface {p2}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_3

    :cond_3
    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:140)"

    const v3, -0x18a5eeab

    invoke-static {v3, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    iget p3, p0, LN/V0$a$e;->a:F

    invoke-static {p1, p3}, Lj0/a;->a(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object p1

    iget-object p3, p0, LN/V0$a$e;->b:LN/S0;

    iget-boolean v1, p0, LN/V0$a$e;->c:Z

    iget-object v6, p0, LN/V0$a$e;->d:Lmh/p;

    sget-object v2, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v2}, Lf0/c$a;->o()Lf0/c;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v2

    invoke-static {p2, v3}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface {p2}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {p2, p1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p1

    sget-object v7, LE0/g;->K:LE0/g$a;

    invoke-virtual {v7}, LE0/g$a;->a()Lmh/a;

    move-result-object v8

    invoke-interface {p2}, LT/l;->x()LT/f;

    move-result-object v9

    if-nez v9, :cond_5

    invoke-static {}, LT/j;->c()V

    :cond_5
    invoke-interface {p2}, LT/l;->u()V

    invoke-interface {p2}, LT/l;->o()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-interface {p2, v8}, LT/l;->D(Lmh/a;)V

    goto :goto_2

    :cond_6
    invoke-interface {p2}, LT/l;->I()V

    :goto_2
    invoke-static {p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v8

    invoke-virtual {v7}, LE0/g$a;->e()Lmh/p;

    move-result-object v9

    invoke-static {v8, v2, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v8, v5, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v7}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v8}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_7

    invoke-interface {v8}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v5, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    :cond_7
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v8, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v8, v4, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_8
    invoke-virtual {v7}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v8, p1, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object p1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    invoke-interface {p3, v1, p2, v3}, LN/S0;->b(ZLT/l;I)LT/z1;

    move-result-object p1

    invoke-interface {p1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lm0/v0;

    invoke-virtual {p1}, Lm0/v0;->u()J

    move-result-wide v2

    sget-object p1, LN/f0;->a:LN/f0;

    invoke-virtual {p1, p2, v0}, LN/f0;->c(LT/l;I)LN/c1;

    move-result-object p1

    invoke-virtual {p1}, LN/c1;->e()LL0/U;

    move-result-object v4

    const/4 v8, 0x0

    const/4 v9, 0x4

    const/4 v5, 0x0

    move-object v7, p2

    invoke-static/range {v2 .. v9}, LN/V0;->b(JLL0/U;Ljava/lang/Float;Lmh/p;LT/l;II)V

    invoke-interface {p2}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_3
    return-void
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LN/V0$a$e;->a(Landroidx/compose/ui/e;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
