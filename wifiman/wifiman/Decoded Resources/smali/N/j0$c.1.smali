.class final LN/j0$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/j0;->a(Lr/W;LT/q0;Landroidx/compose/foundation/o;Landroidx/compose/ui/e;Lmh/q;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lr/W;

.field final synthetic b:LT/q0;

.field final synthetic c:Landroidx/compose/foundation/o;

.field final synthetic d:Landroidx/compose/ui/e;

.field final synthetic e:Lmh/q;

.field final synthetic f:I

.field final synthetic g:I


# direct methods
.method constructor <init>(Lr/W;LT/q0;Landroidx/compose/foundation/o;Landroidx/compose/ui/e;Lmh/q;II)V
    .locals 0

    iput-object p1, p0, LN/j0$c;->a:Lr/W;

    iput-object p2, p0, LN/j0$c;->b:LT/q0;

    iput-object p3, p0, LN/j0$c;->c:Landroidx/compose/foundation/o;

    iput-object p4, p0, LN/j0$c;->d:Landroidx/compose/ui/e;

    iput-object p5, p0, LN/j0$c;->e:Lmh/q;

    iput p6, p0, LN/j0$c;->f:I

    iput p7, p0, LN/j0$c;->g:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 8

    iget-object v0, p0, LN/j0$c;->a:Lr/W;

    iget-object v1, p0, LN/j0$c;->b:LT/q0;

    iget-object v2, p0, LN/j0$c;->c:Landroidx/compose/foundation/o;

    iget-object v3, p0, LN/j0$c;->d:Landroidx/compose/ui/e;

    iget-object v4, p0, LN/j0$c;->e:Lmh/q;

    iget p2, p0, LN/j0$c;->f:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v6

    iget v7, p0, LN/j0$c;->g:I

    move-object v5, p1

    invoke-static/range {v0 .. v7}, LN/j0;->a(Lr/W;LT/q0;Landroidx/compose/foundation/o;Landroidx/compose/ui/e;Lmh/q;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/j0$c;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
