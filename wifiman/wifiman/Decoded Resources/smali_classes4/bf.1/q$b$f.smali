.class public final Lbf/q$b$f;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbf/q$b;->f(Lz/N;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Ljj/g;

.field final synthetic c:Landroidx/compose/runtime/snapshots/k;

.field final synthetic d:Ljava/util/Map;

.field final synthetic e:Lbf/j;

.field final synthetic f:Lbf/k;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljj/g;Landroidx/compose/runtime/snapshots/k;Ljava/util/Map;Lbf/j;Lbf/k;)V
    .locals 0

    iput-object p1, p0, Lbf/q$b$f;->a:Ljava/util/List;

    iput-object p2, p0, Lbf/q$b$f;->b:Ljj/g;

    iput-object p3, p0, Lbf/q$b$f;->c:Landroidx/compose/runtime/snapshots/k;

    iput-object p4, p0, Lbf/q$b$f;->d:Ljava/util/Map;

    iput-object p5, p0, Lbf/q$b$f;->e:Lbf/j;

    iput-object p6, p0, Lbf/q$b$f;->f:Lbf/k;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LA/c;ILT/l;I)V
    .locals 12

    move-object v0, p0

    move v1, p2

    move-object v11, p3

    and-int/lit8 v2, p4, 0x6

    if-nez v2, :cond_1

    move-object v2, p1

    invoke-interface {p3, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p4, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p4

    :goto_1
    and-int/lit8 v3, p4, 0x30

    if-nez v3, :cond_3

    invoke-interface {p3, p2}, LT/l;->i(I)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v2, 0x93

    const/16 v4, 0x92

    if-ne v3, v4, :cond_5

    invoke-interface {p3}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p3}, LT/l;->C()V

    goto :goto_4

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_6

    const/4 v3, -0x1

    const-string v4, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)"

    const v5, -0x25b7f321

    invoke-static {v5, v2, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    iget-object v2, v0, Lbf/q$b$f;->a:Ljava/util/List;

    invoke-interface {v2, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lbf/e;

    const v1, -0x784e59e1

    invoke-interface {p3, v1}, LT/l;->U(I)V

    iget-object v1, v0, Lbf/q$b$f;->b:Ljj/g;

    invoke-virtual {v5}, Lbf/e;->b()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Lbf/q$b$a;

    iget-object v3, v0, Lbf/q$b$f;->c:Landroidx/compose/runtime/snapshots/k;

    iget-object v4, v0, Lbf/q$b$f;->d:Ljava/util/Map;

    iget-object v6, v0, Lbf/q$b$f;->e:Lbf/j;

    iget-object v7, v0, Lbf/q$b$f;->f:Lbf/k;

    move-object v2, v9

    invoke-direct/range {v2 .. v7}, Lbf/q$b$a;-><init>(Landroidx/compose/runtime/snapshots/k;Ljava/util/Map;Lbf/e;Lbf/j;Lbf/k;)V

    const/16 v2, 0x36

    const v3, -0x76b744a6

    const/4 v4, 0x1

    invoke-static {v3, v4, v9, p3, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const/high16 v2, 0x180000

    sget v3, Ljj/g;->t:I

    or-int v9, v3, v2

    const/16 v10, 0x3c

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, v8

    move-object v8, p3

    invoke-static/range {v1 .. v10}, Ljj/e;->a(Ljj/i;Ljava/lang/Object;Landroidx/compose/ui/e;Landroidx/compose/ui/e;ZLjava/lang/Integer;Lmh/r;LT/l;II)V

    invoke-interface {p3}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    :goto_4
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LA/c;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, LT/l;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lbf/q$b$f;->a(LA/c;ILT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
