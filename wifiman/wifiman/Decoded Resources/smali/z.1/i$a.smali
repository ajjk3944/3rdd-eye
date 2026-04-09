.class final Lz/i$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/i;->d([Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/m;I[III[IIII)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:[Landroidx/compose/ui/layout/t;

.field final synthetic b:Lz/i;

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:Landroidx/compose/ui/layout/m;

.field final synthetic f:[I


# direct methods
.method constructor <init>([Landroidx/compose/ui/layout/t;Lz/i;IILandroidx/compose/ui/layout/m;[I)V
    .locals 0

    iput-object p1, p0, Lz/i$a;->a:[Landroidx/compose/ui/layout/t;

    iput-object p2, p0, Lz/i$a;->b:Lz/i;

    iput p3, p0, Lz/i$a;->c:I

    iput p4, p0, Lz/i$a;->d:I

    iput-object p5, p0, Lz/i$a;->e:Landroidx/compose/ui/layout/m;

    iput-object p6, p0, Lz/i$a;->f:[I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;)V
    .locals 24

    move-object/from16 v0, p0

    iget-object v1, v0, Lz/i$a;->a:[Landroidx/compose/ui/layout/t;

    iget-object v8, v0, Lz/i$a;->b:Lz/i;

    iget v9, v0, Lz/i$a;->c:I

    iget v10, v0, Lz/i$a;->d:I

    iget-object v11, v0, Lz/i$a;->e:Landroidx/compose/ui/layout/m;

    iget-object v12, v0, Lz/i$a;->f:[I

    array-length v13, v1

    const/4 v2, 0x0

    move v14, v2

    move v15, v14

    :goto_0
    if-ge v14, v13, :cond_0

    aget-object v17, v1, v14

    add-int/lit8 v23, v15, 0x1

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static/range {v17 .. v17}, Lz/S;->d(Landroidx/compose/ui/layout/t;)Lz/V;

    move-result-object v4

    invoke-interface {v11}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v7

    move-object v2, v8

    move-object/from16 v3, v17

    move v5, v9

    move v6, v10

    invoke-static/range {v2 .. v7}, Lz/i;->q(Lz/i;Landroidx/compose/ui/layout/t;Lz/V;IILY0/t;)I

    move-result v18

    aget v19, v12, v15

    const/16 v21, 0x4

    const/16 v22, 0x0

    const/16 v20, 0x0

    move-object/from16 v16, p1

    invoke-static/range {v16 .. v22}, Landroidx/compose/ui/layout/t$a;->h(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    add-int/lit8 v14, v14, 0x1

    move/from16 v15, v23

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-virtual {p0, p1}, Lz/i$a;->a(Landroidx/compose/ui/layout/t$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
