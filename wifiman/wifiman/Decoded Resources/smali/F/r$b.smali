.class final LF/r$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/r;->a(Landroidx/compose/ui/e;LL0/U;II)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:LL0/U;


# direct methods
.method constructor <init>(IILL0/U;)V
    .locals 0

    iput p1, p0, LF/r$b;->a:I

    iput p2, p0, LF/r$b;->b:I

    iput-object p3, p0, LF/r$b;->c:LL0/U;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method

.method private static final c(LT/z1;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;
    .locals 8

    const p1, 0x1855405a

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:59)"

    invoke-static {p1, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    iget p1, p0, LF/r$b;->a:I

    iget p3, p0, LF/r$b;->b:I

    invoke-static {p1, p3}, LF/r;->b(II)V

    iget p1, p0, LF/r$b;->a:I

    const p3, 0x7fffffff

    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    iget p1, p0, LF/r$b;->b:I

    if-ne p1, p3, :cond_2

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-static {}, LT/o;->P()V

    :cond_1
    invoke-interface {p2}, LT/l;->J()V

    return-object p1

    :cond_2
    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object p1

    invoke-interface {p2, p1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LY0/d;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->i()LT/H0;

    move-result-object v1

    invoke-interface {p2, v1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LQ0/k$b;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->m()LT/H0;

    move-result-object v2

    invoke-interface {p2, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LY0/t;

    iget-object v3, p0, LF/r$b;->c:LL0/U;

    invoke-interface {p2, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {p2, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    iget-object v4, p0, LF/r$b;->c:LL0/U;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_3

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v5, v3, :cond_4

    :cond_3
    invoke-static {v4, v2}, LL0/V;->d(LL0/U;LY0/t;)LL0/U;

    move-result-object v5

    invoke-interface {p2, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast v5, LL0/U;

    invoke-interface {p2, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {p2, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_5

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_9

    :cond_5
    invoke-virtual {v5}, LL0/U;->j()LQ0/k;

    move-result-object v3

    invoke-virtual {v5}, LL0/U;->o()LQ0/A;

    move-result-object v4

    if-nez v4, :cond_6

    sget-object v4, LQ0/A;->b:LQ0/A$a;

    invoke-virtual {v4}, LQ0/A$a;->e()LQ0/A;

    move-result-object v4

    :cond_6
    invoke-virtual {v5}, LL0/U;->m()LQ0/v;

    move-result-object v6

    if-eqz v6, :cond_7

    invoke-virtual {v6}, LQ0/v;->i()I

    move-result v6

    goto :goto_0

    :cond_7
    sget-object v6, LQ0/v;->b:LQ0/v$a;

    invoke-virtual {v6}, LQ0/v$a;->b()I

    move-result v6

    :goto_0
    invoke-virtual {v5}, LL0/U;->n()LQ0/w;

    move-result-object v7

    if-eqz v7, :cond_8

    invoke-virtual {v7}, LQ0/w;->m()I

    move-result v7

    goto :goto_1

    :cond_8
    sget-object v7, LQ0/w;->b:LQ0/w$a;

    invoke-virtual {v7}, LQ0/w$a;->a()I

    move-result v7

    :goto_1
    invoke-interface {v1, v3, v4, v6, v7}, LQ0/k$b;->a(LQ0/k;LQ0/A;II)LT/z1;

    move-result-object v4

    invoke-interface {p2, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v4, LT/z1;

    invoke-static {v4}, LF/r$b;->c(LT/z1;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    invoke-interface {p2, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    iget-object v7, p0, LF/r$b;->c:LL0/U;

    invoke-interface {p2, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-interface {p2, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-interface {p2, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v3, v6

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_a

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v6, v3, :cond_b

    :cond_a
    invoke-static {}, LF/X;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, p1, v1, v3, v0}, LF/X;->a(LL0/U;LY0/d;LQ0/k$b;Ljava/lang/String;I)J

    move-result-wide v6

    invoke-static {v6, v7}, LY0/r;->f(J)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {p2, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-static {v4}, LF/r$b;->c(LT/z1;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    invoke-interface {p2, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    iget-object v7, p0, LF/r$b;->c:LL0/U;

    invoke-interface {p2, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-interface {p2, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v2, v6

    invoke-interface {p2, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_c

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_d

    :cond_c
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, LF/X;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0xa

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {}, LF/X;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x2

    invoke-static {v5, p1, v1, v2, v4}, LF/X;->a(LL0/U;LY0/d;LQ0/k$b;Ljava/lang/String;I)J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/r;->f(J)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p2, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_d
    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v1

    sub-int/2addr v1, v3

    iget v2, p0, LF/r$b;->a:I

    const/4 v4, 0x0

    if-ne v2, v0, :cond_e

    move-object v2, v4

    goto :goto_2

    :cond_e
    sub-int/2addr v2, v0

    mul-int/2addr v2, v1

    add-int/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :goto_2
    iget v5, p0, LF/r$b;->b:I

    if-ne v5, p3, :cond_f

    goto :goto_3

    :cond_f
    sub-int/2addr v5, v0

    mul-int/2addr v1, v5

    add-int/2addr v3, v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :goto_3
    sget-object p3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    if-eqz v2, :cond_10

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {p1, v0}, LY0/d;->x(I)F

    move-result v0

    goto :goto_4

    :cond_10
    sget-object v0, LY0/h;->b:LY0/h$a;

    invoke-virtual {v0}, LY0/h$a;->c()F

    move-result v0

    :goto_4
    if-eqz v4, :cond_11

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {p1, v1}, LY0/d;->x(I)F

    move-result p1

    goto :goto_5

    :cond_11
    sget-object p1, LY0/h;->b:LY0/h$a;

    invoke-virtual {p1}, LY0/h$a;->c()F

    move-result p1

    :goto_5
    invoke-static {p3, v0, p1}, Landroidx/compose/foundation/layout/r;->j(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_12

    invoke-static {}, LT/o;->P()V

    :cond_12
    invoke-interface {p2}, LT/l;->J()V

    return-object p1
.end method

.method public bridge synthetic s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/e;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, LF/r$b;->a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;

    move-result-object p1

    return-object p1
.end method
