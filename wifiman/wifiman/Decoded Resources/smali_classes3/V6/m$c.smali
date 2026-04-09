.class final LV6/m$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV6/m;->f(Lmh/a;Landroidx/compose/ui/e;LV6/p;Lmh/p;Lmh/p;Lmh/a;LT6/a;LS6/k;ZLmh/l;Lr0/d;Lmh/r;Lmh/s;Lmh/r;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LV6/p;

.field final synthetic b:LT6/a;

.field final synthetic c:LS6/k;

.field final synthetic d:Lmh/r;

.field final synthetic e:Lmh/r;

.field final synthetic f:Lmh/a;

.field final synthetic g:Lmh/s;

.field final synthetic h:Lmh/l;

.field final synthetic i:Lmh/p;


# direct methods
.method constructor <init>(LV6/p;LT6/a;LS6/k;Lmh/r;Lmh/r;Lmh/a;Lmh/s;Lmh/l;Lmh/p;)V
    .locals 0

    iput-object p1, p0, LV6/m$c;->a:LV6/p;

    iput-object p2, p0, LV6/m$c;->b:LT6/a;

    iput-object p3, p0, LV6/m$c;->c:LS6/k;

    iput-object p4, p0, LV6/m$c;->d:Lmh/r;

    iput-object p5, p0, LV6/m$c;->e:Lmh/r;

    iput-object p6, p0, LV6/m$c;->f:Lmh/a;

    iput-object p7, p0, LV6/m$c;->g:Lmh/s;

    iput-object p8, p0, LV6/m$c;->h:Lmh/l;

    iput-object p9, p0, LV6/m$c;->i:Lmh/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lz/f;LS6/j;LT/l;I)V
    .locals 11

    const-string v0, "$this$ImageRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "imageState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    invoke-interface {p3, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    and-int/lit8 p4, p4, 0x30

    if-nez p4, :cond_3

    invoke-interface {p3, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_2

    const/16 p4, 0x20

    goto :goto_2

    :cond_2
    const/16 p4, 0x10

    :goto_2
    or-int/2addr v0, p4

    :cond_3
    and-int/lit16 p4, v0, 0x93

    const/16 v1, 0x92

    if-ne p4, v1, :cond_5

    invoke-interface {p3}, LT/l;->v()Z

    move-result p4

    if-nez p4, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p3}, LT/l;->C()V

    goto/16 :goto_c

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result p4

    if-eqz p4, :cond_6

    const/4 p4, -0x1

    const-string/jumbo v1, "com.skydoves.landscapist.glide.GlideImage.<anonymous> (GlideImage.kt:151)"

    const v2, -0x2feea32f

    invoke-static {v2, v0, p4, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    iget-object p4, p0, LV6/m$c;->a:LV6/p;

    invoke-static {p2, p4}, LV6/g;->a(LS6/j;LV6/p;)LV6/f;

    move-result-object v3

    iget-object p2, p0, LV6/m$c;->h:Lmh/l;

    invoke-interface {p2, v3}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of p2, v3, LV6/f$c;

    if-eqz p2, :cond_7

    const p1, -0x1d6862c7

    invoke-interface {p3, p1}, LT/l;->U(I)V

    invoke-interface {p3}, LT/l;->J()V

    goto/16 :goto_b

    :cond_7
    instance-of p2, v3, LV6/f$b;

    if-eqz p2, :cond_9

    const p2, 0x705cf152

    invoke-interface {p3, p2}, LT/l;->U(I)V

    iget-object v4, p0, LV6/m$c;->b:LT6/a;

    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {p2, p1}, LU6/b;->a(Landroidx/compose/ui/e;Lz/f;)Landroidx/compose/ui/e;

    move-result-object v5

    iget-object v6, p0, LV6/m$c;->c:LS6/k;

    new-instance p2, LV6/m$c$a;

    iget-object p4, p0, LV6/m$c;->f:Lmh/a;

    iget-object v1, p0, LV6/m$c;->i:Lmh/p;

    invoke-direct {p2, p4, v6, v1}, LV6/m$c$a;-><init>(Lmh/a;LS6/k;Lmh/p;)V

    const/16 p4, 0x36

    const v1, -0x43a8d660

    const/4 v2, 0x1

    invoke-static {v1, v2, p2, p3, p4}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const/16 v9, 0xc00

    move-object v8, p3

    invoke-static/range {v4 .. v9}, LT6/e;->f(LT6/a;Landroidx/compose/ui/e;LS6/k;Lmh/q;LT/l;I)V

    iget-object p2, p0, LV6/m$c;->d:Lmh/r;

    if-nez p2, :cond_8

    goto :goto_4

    :cond_8
    and-int/lit8 p4, v0, 0xe

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {p2, p1, v3, p3, p4}, Lmh/r;->y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, LYg/J;->a:LYg/J;

    :goto_4
    invoke-interface {p3}, LT/l;->J()V

    goto/16 :goto_b

    :cond_9
    instance-of p2, v3, LV6/f$a;

    if-eqz p2, :cond_b

    const p2, 0x7066015b

    invoke-interface {p3, p2}, LT/l;->U(I)V

    iget-object v4, p0, LV6/m$c;->b:LT6/a;

    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {p2, p1}, LU6/b;->a(Landroidx/compose/ui/e;Lz/f;)Landroidx/compose/ui/e;

    move-result-object v5

    iget-object v6, p0, LV6/m$c;->c:LS6/k;

    move-object p2, v3

    check-cast p2, LV6/f$a;

    invoke-virtual {p2}, LV6/f$a;->a()Ljava/lang/Throwable;

    move-result-object v7

    const/4 v9, 0x0

    move-object v8, p3

    invoke-static/range {v4 .. v9}, LT6/e;->d(LT6/a;Landroidx/compose/ui/e;LS6/k;Ljava/lang/Throwable;LT/l;I)V

    iget-object p2, p0, LV6/m$c;->e:Lmh/r;

    if-nez p2, :cond_a

    goto :goto_5

    :cond_a
    and-int/lit8 p4, v0, 0xe

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-interface {p2, p1, v3, p3, p4}, Lmh/r;->y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, LYg/J;->a:LYg/J;

    :goto_5
    invoke-interface {p3}, LT/l;->J()V

    goto/16 :goto_b

    :cond_b
    instance-of p2, v3, LV6/f$d;

    if-eqz p2, :cond_13

    const p2, 0x706aa12b

    invoke-interface {p3, p2}, LT/l;->U(I)V

    iget-object v4, p0, LV6/m$c;->b:LT6/a;

    sget-object p2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {p2, p1}, LU6/b;->a(Landroidx/compose/ui/e;Lz/f;)Landroidx/compose/ui/e;

    move-result-object v5

    iget-object v6, p0, LV6/m$c;->f:Lmh/a;

    iget-object v7, p0, LV6/m$c;->c:LS6/k;

    move-object p4, v3

    check-cast p4, LV6/f$d;

    invoke-virtual {p4}, LV6/f$d;->a()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, LV6/m$c;->a:LV6/p;

    invoke-static {v1, v2}, LV6/q;->a(Ljava/lang/Object;LV6/p;)Lm0/J0;

    move-result-object v8

    const/4 v10, 0x0

    move-object v9, p3

    invoke-static/range {v4 .. v10}, LT6/e;->h(LT6/a;Landroidx/compose/ui/e;Ljava/lang/Object;LS6/k;Lm0/J0;LT/l;I)V

    invoke-virtual {p4}, LV6/f$d;->a()Ljava/lang/Object;

    move-result-object p4

    if-nez p4, :cond_d

    invoke-interface {p3}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
    return-void

    :cond_d
    instance-of v1, p4, Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x0

    if-eqz v1, :cond_f

    const v1, 0x70706683

    invoke-interface {p3, v1}, LT/l;->U(I)V

    check-cast p4, Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, LV6/m$c;->b:LT6/a;

    instance-of v4, v1, LT6/f;

    if-eqz v4, :cond_e

    check-cast v1, LT6/f;

    invoke-virtual {v1}, LT6/f;->a()Ljava/util/List;

    move-result-object v1

    goto :goto_6

    :cond_e
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v1

    :goto_6
    invoke-static {p4, v1, p3, v2}, LS6/p;->a(Landroid/graphics/drawable/Drawable;Ljava/util/List;LT/l;I)Lr0/d;

    move-result-object p4

    invoke-interface {p3}, LT/l;->J()V

    :goto_7
    move-object v4, p4

    goto :goto_9

    :cond_f
    const v1, 0x70729acf

    invoke-interface {p3, v1}, LT/l;->U(I)V

    iget-object v1, p0, LV6/m$c;->a:LV6/p;

    invoke-static {p4, v1}, LV6/q;->a(Ljava/lang/Object;LV6/p;)Lm0/J0;

    move-result-object p4

    iget-object v1, p0, LV6/m$c;->b:LT6/a;

    instance-of v4, v1, LT6/f;

    if-eqz v4, :cond_10

    check-cast v1, LT6/f;

    invoke-virtual {v1}, LT6/f;->a()Ljava/util/List;

    move-result-object v1

    goto :goto_8

    :cond_10
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v1

    :goto_8
    invoke-static {v1, p4, p3, v2}, LS6/q;->a(Ljava/util/List;Lm0/J0;LT/l;I)Lr0/d;

    move-result-object p4

    invoke-interface {p3}, LT/l;->J()V

    goto :goto_7

    :goto_9
    iget-object p4, p0, LV6/m$c;->g:Lmh/s;

    if-eqz p4, :cond_11

    const p2, 0x7075e469

    invoke-interface {p3, p2}, LT/l;->U(I)V

    iget-object v1, p0, LV6/m$c;->g:Lmh/s;

    and-int/lit8 p2, v0, 0xe

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    move-object v2, p1

    move-object v5, p3

    invoke-interface/range {v1 .. v6}, Lmh/s;->K(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p3}, LT/l;->J()V

    goto :goto_a

    :cond_11
    const p4, 0x70771344

    invoke-interface {p3, p4}, LT/l;->U(I)V

    iget-object p4, p0, LV6/m$c;->c:LS6/k;

    invoke-static {p2, p1}, LU6/b;->a(Landroidx/compose/ui/e;Lz/f;)Landroidx/compose/ui/e;

    move-result-object p1

    iget-object p2, p0, LV6/m$c;->c:LS6/k;

    invoke-virtual {p2}, LS6/k;->i()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroidx/compose/ui/platform/o1;->a(Landroidx/compose/ui/e;Ljava/lang/String;)Landroidx/compose/ui/e;

    move-result-object p1

    invoke-static {p4, p1, v4, p3, v2}, LS6/o;->b(LS6/k;Landroidx/compose/ui/e;Lr0/d;LT/l;I)V

    invoke-interface {p3}, LT/l;->J()V

    :goto_a
    invoke-interface {p3}, LT/l;->J()V

    :goto_b
    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_12

    invoke-static {}, LT/o;->P()V

    :cond_12
    :goto_c
    return-void

    :cond_13
    const p1, -0x1d687376

    invoke-interface {p3, p1}, LT/l;->U(I)V

    invoke-interface {p3}, LT/l;->J()V

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz/f;

    check-cast p2, LS6/j;

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LV6/m$c;->a(Lz/f;LS6/j;LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
