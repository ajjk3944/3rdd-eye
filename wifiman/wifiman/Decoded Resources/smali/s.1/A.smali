.class final Ls/A;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/h;
.implements LE0/h0;


# instance fields
.field private n:LC0/L$a;

.field private o:Z

.field private final p:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    return-void
.end method

.method private final D2()LC0/L;
    .locals 2

    new-instance v0, Lkotlin/jvm/internal/N;

    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v1, Ls/A$a;

    invoke-direct {v1, v0, p0}, Ls/A$a;-><init>(Lkotlin/jvm/internal/N;Ls/A;)V

    invoke-static {p0, v1}, LE0/i0;->a(Landroidx/compose/ui/e$c;Lmh/a;)V

    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v0, LC0/L;

    return-object v0
.end method


# virtual methods
.method public final E2(Z)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-direct {p0}, Ls/A;->D2()LC0/L;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, LC0/L;->a()LC0/L$a;

    move-result-object v0

    :cond_0
    iput-object v0, p0, Ls/A;->n:LC0/L$a;

    goto :goto_0

    :cond_1
    iget-object v1, p0, Ls/A;->n:LC0/L$a;

    if-eqz v1, :cond_2

    invoke-interface {v1}, LC0/L$a;->release()V

    :cond_2
    iput-object v0, p0, Ls/A;->n:LC0/L$a;

    :goto_0
    iput-boolean p1, p0, Ls/A;->o:Z

    return-void
.end method

.method public i2()Z
    .locals 1

    iget-boolean v0, p0, Ls/A;->p:Z

    return v0
.end method

.method public p2()V
    .locals 1

    iget-object v0, p0, Ls/A;->n:LC0/L$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LC0/L$a;->release()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Ls/A;->n:LC0/L$a;

    return-void
.end method

.method public q1()V
    .locals 2

    invoke-direct {p0}, Ls/A;->D2()LC0/L;

    move-result-object v0

    iget-boolean v1, p0, Ls/A;->o:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Ls/A;->n:LC0/L$a;

    if-eqz v1, :cond_0

    invoke-interface {v1}, LC0/L$a;->release()V

    :cond_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, LC0/L;->a()LC0/L$a;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Ls/A;->n:LC0/L$a;

    :cond_2
    return-void
.end method
