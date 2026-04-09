.class public final LX9/k$a;
.super LX9/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX9/k;
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

    invoke-direct/range {p0 .. p5}, LX9/k;-><init>(Landroidx/lifecycle/E;Lcom/ui/core/ui/sso/c;LU9/h;Lka/a;Lha/a;)V

    invoke-virtual {p0}, LX9/c;->b1()LLi/z;

    move-result-object p1

    new-instance p2, Ls9/d$b;

    sget p3, LP9/b;->b0:I

    invoke-direct {p2, p3}, Ls9/d$b;-><init>(I)V

    invoke-interface {p1, p2}, LLi/z;->setValue(Ljava/lang/Object;)V

    invoke-virtual {p0}, LX9/k$a;->n1()LEb/w$e;

    move-result-object p1

    invoke-virtual {p0, p1}, LX9/k;->p1(LEb/w$e;)V

    invoke-virtual {p0}, LX9/c;->I0()V

    return-void
.end method


# virtual methods
.method protected n1()LEb/w$e;
    .locals 3

    invoke-virtual {p0}, LW9/e;->p0()Lcom/ui/core/ui/sso/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/c;->d()Lcom/ui/core/ui/sso/UiSSO$d;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ui/core/ui/sso/UiSSO$d;->a()LU9/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LU9/b;->c()LEb/w;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    instance-of v2, v0, LEb/w$e;

    if-eqz v2, :cond_1

    move-object v1, v0

    check-cast v1, LEb/w$e;

    :cond_1
    if-eqz v1, :cond_2

    return-object v1

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "Sms MFA Method params not found"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected v0()Lgg/b;
    .locals 1

    invoke-virtual {p0}, LX9/k;->G0()Lgg/b;

    move-result-object v0

    return-object v0
.end method
