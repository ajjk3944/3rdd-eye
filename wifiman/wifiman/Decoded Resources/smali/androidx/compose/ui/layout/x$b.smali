.class final Landroidx/compose/ui/layout/x$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/layout/x;-><init>(Landroidx/compose/ui/layout/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/layout/x;


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/x;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/layout/x$b;->a:Landroidx/compose/ui/layout/x;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LE0/G;LT/q;)V
    .locals 0

    iget-object p1, p0, Landroidx/compose/ui/layout/x$b;->a:Landroidx/compose/ui/layout/x;

    invoke-static {p1}, Landroidx/compose/ui/layout/x;->b(Landroidx/compose/ui/layout/x;)Landroidx/compose/ui/layout/h;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/compose/ui/layout/h;->I(LT/q;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LE0/G;

    check-cast p2, LT/q;

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/layout/x$b;->a(LE0/G;LT/q;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
