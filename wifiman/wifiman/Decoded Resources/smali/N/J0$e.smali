.class final LN/J0$e;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/J0;->b(LN/K0;Landroidx/compose/ui/e;Lmh/q;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LN/K0;

.field final synthetic b:Landroidx/compose/ui/e;

.field final synthetic c:Lmh/q;

.field final synthetic d:I

.field final synthetic e:I


# direct methods
.method constructor <init>(LN/K0;Landroidx/compose/ui/e;Lmh/q;II)V
    .locals 0

    iput-object p1, p0, LN/J0$e;->a:LN/K0;

    iput-object p2, p0, LN/J0$e;->b:Landroidx/compose/ui/e;

    iput-object p3, p0, LN/J0$e;->c:Lmh/q;

    iput p4, p0, LN/J0$e;->d:I

    iput p5, p0, LN/J0$e;->e:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 6

    iget-object v0, p0, LN/J0$e;->a:LN/K0;

    iget-object v1, p0, LN/J0$e;->b:Landroidx/compose/ui/e;

    iget-object v2, p0, LN/J0$e;->c:Lmh/q;

    iget p2, p0, LN/J0$e;->d:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result v4

    iget v5, p0, LN/J0$e;->e:I

    move-object v3, p1

    invoke-static/range {v0 .. v5}, LN/J0;->b(LN/K0;Landroidx/compose/ui/e;Lmh/q;LT/l;II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LN/J0$e;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
