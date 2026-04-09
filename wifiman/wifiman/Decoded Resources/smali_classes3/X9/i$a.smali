.class public final LX9/i$a;
.super LX9/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX9/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/E;Lcom/ui/core/ui/sso/c;LU9/h;Lka/a;Lha/a;)V
    .locals 1

    const-string/jumbo v0, "savedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "session"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "activityController"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "vibrator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "clipboard"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p5}, LX9/i;-><init>(Landroidx/lifecycle/E;Lcom/ui/core/ui/sso/c;LU9/h;Lka/a;Lha/a;)V

    invoke-virtual {p0}, LX9/c;->b1()LLi/z;

    move-result-object p1

    new-instance p2, Ls9/d$b;

    sget p3, LP9/b;->a0:I

    invoke-direct {p2, p3}, Ls9/d$b;-><init>(I)V

    invoke-interface {p1, p2}, LLi/z;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, LX9/c;->I0()V

    return-void
.end method
