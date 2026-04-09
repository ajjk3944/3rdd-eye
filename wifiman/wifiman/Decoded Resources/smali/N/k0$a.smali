.class final LN/k0$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/k0;->b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Landroidx/compose/ui/layout/t;

.field final synthetic c:I


# direct methods
.method constructor <init>(ILandroidx/compose/ui/layout/t;I)V
    .locals 0

    iput p1, p0, LN/k0$a;->a:I

    iput-object p2, p0, LN/k0$a;->b:Landroidx/compose/ui/layout/t;

    iput p3, p0, LN/k0$a;->c:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;)V
    .locals 9

    iget v0, p0, LN/k0$a;->a:I

    iget-object v1, p0, LN/k0$a;->b:Landroidx/compose/ui/layout/t;

    invoke-virtual {v1}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Loh/b;->e(F)I

    move-result v4

    iget v0, p0, LN/k0$a;->c:I

    iget-object v2, p0, LN/k0$a;->b:Landroidx/compose/ui/layout/t;

    invoke-virtual {v2}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v2

    sub-int/2addr v0, v2

    int-to-float v0, v0

    div-float/2addr v0, v1

    invoke-static {v0}, Loh/b;->e(F)I

    move-result v5

    iget-object v3, p0, LN/k0$a;->b:Landroidx/compose/ui/layout/t;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/layout/t$a;->h(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-virtual {p0, p1}, LN/k0$a;->a(Landroidx/compose/ui/layout/t$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
