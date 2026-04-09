.class public final Ly0/s;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/A0;
.implements LE0/s0;
.implements LE0/h;


# instance fields
.field private final n:Ljava/lang/String;

.field private o:Ly0/t;

.field private p:Z

.field private q:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ly0/t;Z)V
    .locals 1

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    const-string v0, "androidx.compose.ui.input.pointer.PointerHoverIcon"

    iput-object v0, p0, Ly0/s;->n:Ljava/lang/String;

    iput-object p1, p0, Ly0/s;->o:Ly0/t;

    iput-boolean p2, p0, Ly0/s;->p:Z

    return-void
.end method

.method public static final synthetic D2(Ly0/s;)Z
    .locals 0

    iget-boolean p0, p0, Ly0/s;->q:Z

    return p0
.end method

.method private final E2()V
    .locals 2

    invoke-direct {p0}, Ly0/s;->M2()Ly0/v;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ly0/v;->a(Ly0/t;)V

    :cond_0
    return-void
.end method

.method private final F2()V
    .locals 2

    invoke-direct {p0}, Ly0/s;->K2()Ly0/s;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, Ly0/s;->o:Ly0/t;

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Ly0/s;->o:Ly0/t;

    :cond_1
    invoke-direct {p0}, Ly0/s;->M2()Ly0/v;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-interface {v1, v0}, Ly0/v;->a(Ly0/t;)V

    :cond_2
    return-void
.end method

.method private final G2()V
    .locals 2

    new-instance v0, Lkotlin/jvm/internal/N;

    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v1, Ly0/s$a;

    invoke-direct {v1, v0}, Ly0/s$a;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-static {p0, v1}, LE0/B0;->d(LE0/A0;Lmh/l;)V

    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v0, Ly0/s;

    if-eqz v0, :cond_0

    invoke-direct {v0}, Ly0/s;->F2()V

    sget-object v0, LYg/J;->a:LYg/J;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-direct {p0}, Ly0/s;->E2()V

    :cond_1
    return-void
.end method

.method private final H2()V
    .locals 1

    iget-boolean v0, p0, Ly0/s;->q:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Ly0/s;->p:Z

    if-nez v0, :cond_1

    invoke-direct {p0}, Ly0/s;->J2()Ly0/s;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, p0

    :goto_0
    invoke-direct {v0}, Ly0/s;->F2()V

    return-void
.end method

.method private final I2()V
    .locals 2

    new-instance v0, Lkotlin/jvm/internal/J;

    invoke-direct {v0}, Lkotlin/jvm/internal/J;-><init>()V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lkotlin/jvm/internal/J;->a:Z

    iget-boolean v1, p0, Ly0/s;->p:Z

    if-nez v1, :cond_0

    new-instance v1, Ly0/s$b;

    invoke-direct {v1, v0}, Ly0/s$b;-><init>(Lkotlin/jvm/internal/J;)V

    invoke-static {p0, v1}, LE0/B0;->f(LE0/A0;Lmh/l;)V

    :cond_0
    iget-boolean v0, v0, Lkotlin/jvm/internal/J;->a:Z

    if-eqz v0, :cond_1

    invoke-direct {p0}, Ly0/s;->F2()V

    :cond_1
    return-void
.end method

.method private final J2()Ly0/s;
    .locals 2

    new-instance v0, Lkotlin/jvm/internal/N;

    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v1, Ly0/s$c;

    invoke-direct {v1, v0}, Ly0/s$c;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-static {p0, v1}, LE0/B0;->f(LE0/A0;Lmh/l;)V

    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v0, Ly0/s;

    return-object v0
.end method

.method private final K2()Ly0/s;
    .locals 2

    new-instance v0, Lkotlin/jvm/internal/N;

    invoke-direct {v0}, Lkotlin/jvm/internal/N;-><init>()V

    new-instance v1, Ly0/s$d;

    invoke-direct {v1, v0}, Ly0/s$d;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-static {p0, v1}, LE0/B0;->d(LE0/A0;Lmh/l;)V

    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v0, Ly0/s;

    return-object v0
.end method

.method private final M2()Ly0/v;
    .locals 1

    invoke-static {}, Landroidx/compose/ui/platform/k0;->n()LT/H0;

    move-result-object v0

    invoke-static {p0, v0}, LE0/i;->a(LE0/h;LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly0/v;

    return-object v0
.end method

.method private final O2()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ly0/s;->q:Z

    invoke-direct {p0}, Ly0/s;->I2()V

    return-void
.end method

.method private final P2()V
    .locals 1

    iget-boolean v0, p0, Ly0/s;->q:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Ly0/s;->q:Z

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->k2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Ly0/s;->G2()V

    :cond_0
    return-void
.end method


# virtual methods
.method public C0()V
    .locals 0

    invoke-direct {p0}, Ly0/s;->P2()V

    return-void
.end method

.method public final L2()Z
    .locals 1

    iget-boolean v0, p0, Ly0/s;->p:Z

    return v0
.end method

.method public N2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly0/s;->n:Ljava/lang/String;

    return-object v0
.end method

.method public final Q2(Ly0/t;)V
    .locals 1

    iget-object v0, p0, Ly0/s;->o:Ly0/t;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Ly0/s;->o:Ly0/t;

    iget-boolean p1, p0, Ly0/s;->q:Z

    if-eqz p1, :cond_0

    invoke-direct {p0}, Ly0/s;->I2()V

    :cond_0
    return-void
.end method

.method public final R2(Z)V
    .locals 1

    iget-boolean v0, p0, Ly0/s;->p:Z

    if-eq v0, p1, :cond_1

    iput-boolean p1, p0, Ly0/s;->p:Z

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Ly0/s;->q:Z

    if-eqz p1, :cond_1

    invoke-direct {p0}, Ly0/s;->F2()V

    goto :goto_0

    :cond_0
    iget-boolean p1, p0, Ly0/s;->q:Z

    if-eqz p1, :cond_1

    invoke-direct {p0}, Ly0/s;->H2()V

    :cond_1
    :goto_0
    return-void
.end method

.method public bridge synthetic W()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ly0/s;->N2()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public o2()V
    .locals 0

    invoke-direct {p0}, Ly0/s;->P2()V

    invoke-super {p0}, Landroidx/compose/ui/e$c;->o2()V

    return-void
.end method

.method public s0(Ly0/n;Ly0/p;J)V
    .locals 0

    sget-object p3, Ly0/p;->Main:Ly0/p;

    if-ne p2, p3, :cond_1

    invoke-virtual {p1}, Ly0/n;->f()I

    move-result p2

    sget-object p3, Ly0/q;->a:Ly0/q$a;

    invoke-virtual {p3}, Ly0/q$a;->a()I

    move-result p4

    invoke-static {p2, p4}, Ly0/q;->i(II)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-direct {p0}, Ly0/s;->O2()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ly0/n;->f()I

    move-result p1

    invoke-virtual {p3}, Ly0/q$a;->b()I

    move-result p2

    invoke-static {p1, p2}, Ly0/q;->i(II)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Ly0/s;->P2()V

    :cond_1
    :goto_0
    return-void
.end method
