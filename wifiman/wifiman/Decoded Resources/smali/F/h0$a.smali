.class final LF/h0$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/h0;->a(Landroidx/compose/ui/e;LL0/U;)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LL0/U;


# direct methods
.method constructor <init>(LL0/U;)V
    .locals 0

    iput-object p1, p0, LF/h0$a;->a:LL0/U;

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
    .locals 11

    const p1, 0x5e56a525

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.foundation.text.textFieldMinSize.<anonymous> (TextFieldSize.kt:37)"

    invoke-static {p1, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object p1

    invoke-interface {p2, p1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LY0/d;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->i()LT/H0;

    move-result-object p3

    invoke-interface {p2, p3}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, LQ0/k$b;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->m()LT/H0;

    move-result-object v0

    invoke-interface {p2, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LY0/t;

    iget-object v0, p0, LF/h0$a;->a:LL0/U;

    invoke-interface {p2, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p2, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    iget-object v1, p0, LF/h0$a;->a:LL0/U;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_1

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_2

    :cond_1
    invoke-static {v1, v6}, LL0/V;->d(LL0/U;LY0/t;)LL0/U;

    move-result-object v2

    invoke-interface {p2, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    move-object v7, v2

    check-cast v7, LL0/U;

    invoke-interface {p2, p3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p2, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_3

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_7

    :cond_3
    invoke-virtual {v7}, LL0/U;->j()LQ0/k;

    move-result-object v0

    invoke-virtual {v7}, LL0/U;->o()LQ0/A;

    move-result-object v1

    if-nez v1, :cond_4

    sget-object v1, LQ0/A;->b:LQ0/A$a;

    invoke-virtual {v1}, LQ0/A$a;->e()LQ0/A;

    move-result-object v1

    :cond_4
    invoke-virtual {v7}, LL0/U;->m()LQ0/v;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, LQ0/v;->i()I

    move-result v2

    goto :goto_0

    :cond_5
    sget-object v2, LQ0/v;->b:LQ0/v$a;

    invoke-virtual {v2}, LQ0/v$a;->b()I

    move-result v2

    :goto_0
    invoke-virtual {v7}, LL0/U;->n()LQ0/w;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v3}, LQ0/w;->m()I

    move-result v3

    goto :goto_1

    :cond_6
    sget-object v3, LQ0/w;->b:LQ0/w$a;

    invoke-virtual {v3}, LQ0/w$a;->a()I

    move-result v3

    :goto_1
    invoke-interface {p3, v0, v1, v2, v3}, LQ0/k$b;->a(LQ0/k;LQ0/A;II)LT/z1;

    move-result-object v1

    invoke-interface {p2, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    move-object v8, v1

    check-cast v8, LT/z1;

    iget-object v4, p0, LF/h0$a;->a:LL0/U;

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v9, LT/l;->a:LT/l$a;

    invoke-virtual {v9}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_8

    new-instance v10, LF/g0;

    invoke-static {v8}, LF/h0$a;->c(LT/z1;)Ljava/lang/Object;

    move-result-object v5

    move-object v0, v10

    move-object v1, v6

    move-object v2, p1

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, LF/g0;-><init>(LY0/t;LY0/d;LQ0/k$b;LL0/U;Ljava/lang/Object;)V

    invoke-interface {p2, v10}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    move-object v10, v0

    check-cast v10, LF/g0;

    invoke-static {v8}, LF/h0$a;->c(LT/z1;)Ljava/lang/Object;

    move-result-object v5

    move-object v0, v10

    move-object v1, v6

    move-object v2, p1

    move-object v3, p3

    move-object v4, v7

    invoke-virtual/range {v0 .. v5}, LF/g0;->c(LY0/t;LY0/d;LQ0/k$b;LL0/U;Ljava/lang/Object;)V

    sget-object p1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-interface {p2, v10}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_9

    invoke-virtual {v9}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_a

    :cond_9
    new-instance v0, LF/h0$a$a;

    invoke-direct {v0, v10}, LF/h0$a$a;-><init>(LF/g0;)V

    invoke-interface {p2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_a
    check-cast v0, Lmh/q;

    invoke-static {p1, v0}, Landroidx/compose/ui/layout/g;->a(Landroidx/compose/ui/e;Lmh/q;)Landroidx/compose/ui/e;

    move-result-object p1

    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
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

    invoke-virtual {p0, p1, p2, p3}, LF/h0$a;->a(Landroidx/compose/ui/e;LT/l;I)Landroidx/compose/ui/e;

    move-result-object p1

    return-object p1
.end method
