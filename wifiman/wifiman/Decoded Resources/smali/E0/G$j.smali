.class final LE0/G$j;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE0/G;->I()LJ0/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LE0/G;

.field final synthetic b:Lkotlin/jvm/internal/N;


# direct methods
.method constructor <init>(LE0/G;Lkotlin/jvm/internal/N;)V
    .locals 0

    iput-object p1, p0, LE0/G$j;->a:LE0/G;

    iput-object p2, p0, LE0/G$j;->b:Lkotlin/jvm/internal/N;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 11

    iget-object v0, p0, LE0/G$j;->a:LE0/G;

    invoke-virtual {v0}, LE0/G;->k0()LE0/a0;

    move-result-object v0

    const/16 v1, 0x8

    invoke-static {v1}, LE0/e0;->a(I)I

    move-result v1

    iget-object v2, p0, LE0/G$j;->b:Lkotlin/jvm/internal/N;

    invoke-static {v0}, LE0/a0;->c(LE0/a0;)I

    move-result v3

    and-int/2addr v3, v1

    if-eqz v3, :cond_a

    invoke-virtual {v0}, LE0/a0;->o()Landroidx/compose/ui/e$c;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_a

    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->f2()I

    move-result v3

    and-int/2addr v3, v1

    if-eqz v3, :cond_9

    const/4 v3, 0x0

    move-object v4, v0

    move-object v5, v3

    :goto_1
    if-eqz v4, :cond_9

    instance-of v6, v4, LE0/v0;

    const/4 v7, 0x1

    if-eqz v6, :cond_2

    check-cast v4, LE0/v0;

    invoke-interface {v4}, LE0/v0;->D0()Z

    move-result v6

    if-eqz v6, :cond_0

    new-instance v6, LJ0/j;

    invoke-direct {v6}, LJ0/j;-><init>()V

    iput-object v6, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-virtual {v6, v7}, LJ0/j;->w(Z)V

    :cond_0
    invoke-interface {v4}, LE0/v0;->S1()Z

    move-result v6

    if-eqz v6, :cond_1

    iget-object v6, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v6, LJ0/j;

    invoke-virtual {v6, v7}, LJ0/j;->x(Z)V

    :cond_1
    iget-object v6, v2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v6, LJ0/j;

    invoke-interface {v4, v6}, LE0/v0;->q(LJ0/w;)V

    goto :goto_4

    :cond_2
    invoke-virtual {v4}, Landroidx/compose/ui/e$c;->f2()I

    move-result v6

    and-int/2addr v6, v1

    if-eqz v6, :cond_8

    instance-of v6, v4, LE0/m;

    if-eqz v6, :cond_8

    move-object v6, v4

    check-cast v6, LE0/m;

    invoke-virtual {v6}, LE0/m;->E2()Landroidx/compose/ui/e$c;

    move-result-object v6

    const/4 v8, 0x0

    move v9, v8

    :goto_2
    if-eqz v6, :cond_7

    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->f2()I

    move-result v10

    and-int/2addr v10, v1

    if-eqz v10, :cond_6

    add-int/lit8 v9, v9, 0x1

    if-ne v9, v7, :cond_3

    move-object v4, v6

    goto :goto_3

    :cond_3
    if-nez v5, :cond_4

    new-instance v5, LV/b;

    const/16 v10, 0x10

    new-array v10, v10, [Landroidx/compose/ui/e$c;

    invoke-direct {v5, v10, v8}, LV/b;-><init>([Ljava/lang/Object;I)V

    :cond_4
    if-eqz v4, :cond_5

    invoke-virtual {v5, v4}, LV/b;->b(Ljava/lang/Object;)Z

    move-object v4, v3

    :cond_5
    invoke-virtual {v5, v6}, LV/b;->b(Ljava/lang/Object;)Z

    :cond_6
    :goto_3
    invoke-virtual {v6}, Landroidx/compose/ui/e$c;->b2()Landroidx/compose/ui/e$c;

    move-result-object v6

    goto :goto_2

    :cond_7
    if-ne v9, v7, :cond_8

    goto :goto_1

    :cond_8
    :goto_4
    invoke-static {v5}, LE0/k;->b(LV/b;)Landroidx/compose/ui/e$c;

    move-result-object v4

    goto :goto_1

    :cond_9
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->h2()Landroidx/compose/ui/e$c;

    move-result-object v0

    goto/16 :goto_0

    :cond_a
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LE0/G$j;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
