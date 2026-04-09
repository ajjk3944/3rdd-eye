.class final Landroidx/compose/foundation/lazy/layout/b$d$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/layout/b$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lp0/c;

.field final synthetic b:Landroidx/compose/foundation/lazy/layout/b;


# direct methods
.method constructor <init>(Lp0/c;Landroidx/compose/foundation/lazy/layout/b;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/b$d$a;->a:Lp0/c;

    iput-object p2, p0, Landroidx/compose/foundation/lazy/layout/b$d$a;->b:Landroidx/compose/foundation/lazy/layout/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lr/a;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/b$d$a;->a:Lp0/c;

    invoke-virtual {p1}, Lr/a;->m()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {v0, p1}, Lp0/c;->J(F)V

    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/b$d$a;->b:Landroidx/compose/foundation/lazy/layout/b;

    invoke-static {p1}, Landroidx/compose/foundation/lazy/layout/b;->b(Landroidx/compose/foundation/lazy/layout/b;)Lmh/a;

    move-result-object p1

    invoke-interface {p1}, Lmh/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lr/a;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/lazy/layout/b$d$a;->a(Lr/a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
