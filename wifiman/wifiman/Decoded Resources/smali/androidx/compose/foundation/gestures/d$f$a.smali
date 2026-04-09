.class final Landroidx/compose/foundation/gestures/d$f$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/d$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/K;

.field final synthetic b:Lw/A;

.field final synthetic c:Lw/p;


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/K;Lw/A;Lw/p;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/d$f$a;->a:Lkotlin/jvm/internal/K;

    iput-object p2, p0, Landroidx/compose/foundation/gestures/d$f$a;->b:Lw/A;

    iput-object p3, p0, Landroidx/compose/foundation/gestures/d$f$a;->c:Lw/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(FF)V
    .locals 3

    iget-object p2, p0, Landroidx/compose/foundation/gestures/d$f$a;->a:Lkotlin/jvm/internal/K;

    iget p2, p2, Lkotlin/jvm/internal/K;->a:F

    sub-float/2addr p1, p2

    iget-object p2, p0, Landroidx/compose/foundation/gestures/d$f$a;->b:Lw/A;

    iget-object v0, p0, Landroidx/compose/foundation/gestures/d$f$a;->c:Lw/p;

    invoke-virtual {p2, p1}, Lw/A;->t(F)F

    move-result p1

    invoke-virtual {p2, p1}, Lw/A;->B(F)J

    move-result-wide v1

    sget-object p1, Lx0/e;->a:Lx0/e$a;

    invoke-virtual {p1}, Lx0/e$a;->b()I

    move-result p1

    invoke-interface {v0, v1, v2, p1}, Lw/p;->b(JI)J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lw/A;->A(J)F

    move-result p1

    invoke-virtual {p2, p1}, Lw/A;->t(F)F

    move-result p1

    iget-object p2, p0, Landroidx/compose/foundation/gestures/d$f$a;->a:Lkotlin/jvm/internal/K;

    iget v0, p2, Lkotlin/jvm/internal/K;->a:F

    add-float/2addr v0, p1

    iput v0, p2, Lkotlin/jvm/internal/K;->a:F

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/gestures/d$f$a;->a(FF)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
