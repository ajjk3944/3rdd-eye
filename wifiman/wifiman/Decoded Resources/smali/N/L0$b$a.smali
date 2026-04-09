.class final LN/L0$b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/L0$b;->b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/layout/t;

.field final synthetic b:I

.field final synthetic c:Landroidx/compose/ui/layout/t;

.field final synthetic d:I

.field final synthetic e:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/t;ILandroidx/compose/ui/layout/t;II)V
    .locals 0

    iput-object p1, p0, LN/L0$b$a;->a:Landroidx/compose/ui/layout/t;

    iput p2, p0, LN/L0$b$a;->b:I

    iput-object p3, p0, LN/L0$b$a;->c:Landroidx/compose/ui/layout/t;

    iput p4, p0, LN/L0$b$a;->d:I

    iput p5, p0, LN/L0$b$a;->e:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;)V
    .locals 14

    iget-object v1, p0, LN/L0$b$a;->a:Landroidx/compose/ui/layout/t;

    iget v3, p0, LN/L0$b$a;->b:I

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/t$a;->l(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    iget-object v8, p0, LN/L0$b$a;->c:Landroidx/compose/ui/layout/t;

    iget v9, p0, LN/L0$b$a;->d:I

    iget v10, p0, LN/L0$b$a;->e:I

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v11, 0x0

    move-object v7, p1

    invoke-static/range {v7 .. v13}, Landroidx/compose/ui/layout/t$a;->l(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-virtual {p0, p1}, LN/L0$b$a;->a(Landroidx/compose/ui/layout/t$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
