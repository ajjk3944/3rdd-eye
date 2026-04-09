.class public LX9/f;
.super LX9/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX9/f$a;
    }
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

    invoke-direct/range {p0 .. p5}, LX9/c;-><init>(Landroidx/lifecycle/E;Lcom/ui/core/ui/sso/c;LU9/h;Lka/a;Lha/a;)V

    invoke-virtual {p0}, LX9/c;->Y0()LLi/z;

    move-result-object p1

    new-instance p2, Ls9/d$b;

    sget p3, LP9/b;->E:I

    invoke-direct {p2, p3}, Ls9/d$b;-><init>(I)V

    invoke-interface {p1, p2}, LLi/z;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, LX9/c;->a1()LLi/z;

    move-result-object p1

    new-instance p2, Ls9/d$b;

    sget p3, LP9/b;->z:I

    invoke-direct {p2, p3}, Ls9/d$b;-><init>(I)V

    invoke-interface {p1, p2}, LLi/z;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, LW9/e;->k0()LLi/z;

    move-result-object p1

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, p2}, LLi/z;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method protected G0()Lgg/b;
    .locals 2

    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object v0

    const-string/jumbo v1, "complete(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
