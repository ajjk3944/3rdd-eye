.class final Lz/X$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/X;->d([Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/m;I[III[IIII)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:[Landroidx/compose/ui/layout/t;

.field final synthetic b:Lz/X;

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:[I


# direct methods
.method constructor <init>([Landroidx/compose/ui/layout/t;Lz/X;II[I)V
    .locals 0

    iput-object p1, p0, Lz/X$a;->a:[Landroidx/compose/ui/layout/t;

    iput-object p2, p0, Lz/X$a;->b:Lz/X;

    iput p3, p0, Lz/X$a;->c:I

    iput p4, p0, Lz/X$a;->d:I

    iput-object p5, p0, Lz/X$a;->e:[I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;)V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lz/X$a;->a:[Landroidx/compose/ui/layout/t;

    iget-object v2, v0, Lz/X$a;->b:Lz/X;

    iget v3, v0, Lz/X$a;->c:I

    iget v4, v0, Lz/X$a;->d:I

    iget-object v5, v0, Lz/X$a;->e:[I

    array-length v6, v1

    const/4 v7, 0x0

    move v8, v7

    :goto_0
    if-ge v7, v6, :cond_0

    aget-object v10, v1, v7

    add-int/lit8 v16, v8, 0x1

    invoke-static {v10}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static {v10}, Lz/S;->d(Landroidx/compose/ui/layout/t;)Lz/V;

    move-result-object v9

    invoke-static {v2, v10, v9, v3, v4}, Lz/X;->q(Lz/X;Landroidx/compose/ui/layout/t;Lz/V;II)I

    move-result v12

    aget v11, v5, v8

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v13, 0x0

    move-object/from16 v9, p1

    invoke-static/range {v9 .. v15}, Landroidx/compose/ui/layout/t$a;->h(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    add-int/lit8 v7, v7, 0x1

    move/from16 v8, v16

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-virtual {p0, p1}, Lz/X$a;->a(Landroidx/compose/ui/layout/t$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
