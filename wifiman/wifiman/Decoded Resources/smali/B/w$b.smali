.class final LB/w$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB/w;->a(Lmh/a;Landroidx/compose/ui/e;Landroidx/compose/foundation/lazy/layout/d;Lmh/p;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/a;

.field final synthetic b:Landroidx/compose/ui/e;

.field final synthetic c:Landroidx/compose/foundation/lazy/layout/d;

.field final synthetic d:Lmh/p;

.field final synthetic e:I

.field final synthetic f:I


# direct methods
.method constructor <init>(Lmh/a;Landroidx/compose/ui/e;Landroidx/compose/foundation/lazy/layout/d;Lmh/p;II)V
    .locals 0

    iput-object p1, p0, LB/w$b;->a:Lmh/a;

    iput-object p2, p0, LB/w$b;->b:Landroidx/compose/ui/e;

    iput-object p3, p0, LB/w$b;->c:Landroidx/compose/foundation/lazy/layout/d;

    iput-object p4, p0, LB/w$b;->d:Lmh/p;

    iput p5, p0, LB/w$b;->e:I

    iput p6, p0, LB/w$b;->f:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 7

    iget-object v0, p0, LB/w$b;->a:Lmh/a;

    iget-object v1, p0, LB/w$b;->b:Landroidx/compose/ui/e;

    iget-object v2, p0, LB/w$b;->c:Landroidx/compose/foundation/lazy/layout/d;

    iget-object v3, p0, LB/w$b;->d:Lmh/p;

    iget p2, p0, LB/w$b;->e:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v5

    iget v6, p0, LB/w$b;->f:I

    move-object v4, p1

    invoke-static/range {v0 .. v6}, LB/w;->a(Lmh/a;Landroidx/compose/ui/e;Landroidx/compose/foundation/lazy/layout/d;Lmh/p;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LB/w$b;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
