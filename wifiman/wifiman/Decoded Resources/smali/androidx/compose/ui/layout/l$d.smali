.class final Landroidx/compose/ui/layout/l$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/layout/l;->a(Lmh/q;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lmh/q;

.field final synthetic b:I


# direct methods
.method constructor <init>(Lmh/q;I)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/layout/l$d;->a:Lmh/q;

    iput p2, p0, Landroidx/compose/ui/layout/l$d;->b:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LT/l;I)V
    .locals 1

    iget-object p2, p0, Landroidx/compose/ui/layout/l$d;->a:Lmh/q;

    iget v0, p0, Landroidx/compose/ui/layout/l$d;->b:I

    or-int/lit8 v0, v0, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v0

    invoke-static {p2, p1, v0}, Landroidx/compose/ui/layout/l;->a(Lmh/q;LT/l;I)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/layout/l$d;->a(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
