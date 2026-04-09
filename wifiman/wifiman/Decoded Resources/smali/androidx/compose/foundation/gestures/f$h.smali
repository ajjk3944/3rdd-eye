.class final Landroidx/compose/foundation/gestures/f$h;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/f;->l3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/gestures/f;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/gestures/f;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/f$h;->a:Landroidx/compose/foundation/gestures/f;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/foundation/gestures/f$h;->a:Landroidx/compose/foundation/gestures/f;

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v1

    invoke-static {v0, v1}, LE0/i;->a(LE0/h;LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/d;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/f$h;->a:Landroidx/compose/foundation/gestures/f;

    invoke-static {v1}, Landroidx/compose/foundation/gestures/f;->f3(Landroidx/compose/foundation/gestures/f;)Lw/h;

    move-result-object v1

    invoke-static {v0}, Lq/x;->c(LY0/d;)Lr/z;

    move-result-object v0

    invoke-virtual {v1, v0}, Lw/h;->f(Lr/z;)V

    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/f$h;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
