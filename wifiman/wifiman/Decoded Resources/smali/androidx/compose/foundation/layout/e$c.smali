.class final Landroidx/compose/foundation/layout/e$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/layout/e;->b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:[Landroidx/compose/ui/layout/t;

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Landroidx/compose/ui/layout/m;

.field final synthetic d:Lkotlin/jvm/internal/L;

.field final synthetic e:Lkotlin/jvm/internal/L;

.field final synthetic f:Landroidx/compose/foundation/layout/e;


# direct methods
.method constructor <init>([Landroidx/compose/ui/layout/t;Ljava/util/List;Landroidx/compose/ui/layout/m;Lkotlin/jvm/internal/L;Lkotlin/jvm/internal/L;Landroidx/compose/foundation/layout/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/e$c;->a:[Landroidx/compose/ui/layout/t;

    iput-object p2, p0, Landroidx/compose/foundation/layout/e$c;->b:Ljava/util/List;

    iput-object p3, p0, Landroidx/compose/foundation/layout/e$c;->c:Landroidx/compose/ui/layout/m;

    iput-object p4, p0, Landroidx/compose/foundation/layout/e$c;->d:Lkotlin/jvm/internal/L;

    iput-object p5, p0, Landroidx/compose/foundation/layout/e$c;->e:Lkotlin/jvm/internal/L;

    iput-object p6, p0, Landroidx/compose/foundation/layout/e$c;->f:Landroidx/compose/foundation/layout/e;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;)V
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/foundation/layout/e$c;->a:[Landroidx/compose/ui/layout/t;

    iget-object v2, v0, Landroidx/compose/foundation/layout/e$c;->b:Ljava/util/List;

    iget-object v3, v0, Landroidx/compose/foundation/layout/e$c;->c:Landroidx/compose/ui/layout/m;

    iget-object v4, v0, Landroidx/compose/foundation/layout/e$c;->d:Lkotlin/jvm/internal/L;

    iget-object v5, v0, Landroidx/compose/foundation/layout/e$c;->e:Lkotlin/jvm/internal/L;

    iget-object v6, v0, Landroidx/compose/foundation/layout/e$c;->f:Landroidx/compose/foundation/layout/e;

    array-length v7, v1

    const/4 v8, 0x0

    move v9, v8

    :goto_0
    if-ge v8, v7, :cond_0

    aget-object v11, v1, v8

    add-int/lit8 v17, v9, 0x1

    const-string v10, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable"

    invoke-static {v11, v10}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v12, v9

    check-cast v12, LC0/B;

    invoke-interface {v3}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v13

    iget v14, v4, Lkotlin/jvm/internal/L;->a:I

    iget v15, v5, Lkotlin/jvm/internal/L;->a:I

    invoke-static {v6}, Landroidx/compose/foundation/layout/e;->a(Landroidx/compose/foundation/layout/e;)Lf0/c;

    move-result-object v16

    move-object/from16 v10, p1

    invoke-static/range {v10 .. v16}, Landroidx/compose/foundation/layout/d;->c(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;LC0/B;LY0/t;IILf0/c;)V

    add-int/lit8 v8, v8, 0x1

    move/from16 v9, v17

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/e$c;->a(Landroidx/compose/ui/layout/t$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
