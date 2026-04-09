.class final Landroidx/compose/ui/tooling/PreviewActivity$b$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/tooling/PreviewActivity$b;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:[Ljava/lang/Object;

.field final synthetic d:LT/n0;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;LT/n0;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/tooling/PreviewActivity$b$b;->a:Ljava/lang/String;

    iput-object p2, p0, Landroidx/compose/ui/tooling/PreviewActivity$b$b;->b:Ljava/lang/String;

    iput-object p3, p0, Landroidx/compose/ui/tooling/PreviewActivity$b$b;->c:[Ljava/lang/Object;

    iput-object p4, p0, Landroidx/compose/ui/tooling/PreviewActivity$b$b;->d:LT/n0;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lz/N;LT/l;I)V
    .locals 9

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr p3, v0

    :cond_1
    and-int/lit8 v0, p3, 0x13

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3

    invoke-interface {p2}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_3

    :cond_3
    :goto_1
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, -0x1

    const-string v1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous>.<anonymous> (PreviewActivity.android.kt:113)"

    const v2, 0x36a7e9b

    invoke-static {v2, p3, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    sget-object p3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {p3, p1}, Landroidx/compose/foundation/layout/o;->h(Landroidx/compose/ui/e;Lz/N;)Landroidx/compose/ui/e;

    move-result-object p1

    iget-object p3, p0, Landroidx/compose/ui/tooling/PreviewActivity$b$b;->a:Ljava/lang/String;

    iget-object v0, p0, Landroidx/compose/ui/tooling/PreviewActivity$b$b;->b:Ljava/lang/String;

    iget-object v1, p0, Landroidx/compose/ui/tooling/PreviewActivity$b$b;->c:[Ljava/lang/Object;

    iget-object v2, p0, Landroidx/compose/ui/tooling/PreviewActivity$b$b;->d:LT/n0;

    sget-object v3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v3}, Lf0/c$a;->o()Lf0/c;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v3

    invoke-static {p2, v4}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface {p2}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {p2, p1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p1

    sget-object v6, LE0/g;->K:LE0/g$a;

    invoke-virtual {v6}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface {p2}, LT/l;->x()LT/f;

    move-result-object v8

    if-nez v8, :cond_5

    invoke-static {}, LT/j;->c()V

    :cond_5
    invoke-interface {p2}, LT/l;->u()V

    invoke-interface {p2}, LT/l;->o()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {p2, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_2

    :cond_6
    invoke-interface {p2}, LT/l;->I()V

    :goto_2
    invoke-static {p2}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual {v6}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v3, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v7, v5, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v7}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_7

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    :cond_7
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v7, v4, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_8
    invoke-virtual {v6}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v7, p1, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object p1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    sget-object p1, LX0/a;->a:LX0/a;

    invoke-interface {v2}, LT/n0;->e()I

    move-result v2

    aget-object v1, v1, v2

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, p3, v0, p2, v1}, LX0/a;->g(Ljava/lang/String;Ljava/lang/String;LT/l;[Ljava/lang/Object;)V

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

    check-cast p1, Lz/N;

    check-cast p2, LT/l;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/ui/tooling/PreviewActivity$b$b;->a(Lz/N;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
