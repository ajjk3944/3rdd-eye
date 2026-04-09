.class final LQ/g;
.super LE0/m;
.source "SourceFile"

# interfaces
.implements LE0/h;
.implements LE0/h0;


# instance fields
.field private final p:Ly/k;

.field private final q:Z

.field private final r:F

.field private final s:Lm0/y0;

.field private t:LE0/j;


# direct methods
.method private constructor <init>(Ly/k;ZFLm0/y0;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LE0/m;-><init>()V

    .line 3
    iput-object p1, p0, LQ/g;->p:Ly/k;

    .line 4
    iput-boolean p2, p0, LQ/g;->q:Z

    .line 5
    iput p3, p0, LQ/g;->r:F

    .line 6
    iput-object p4, p0, LQ/g;->s:Lm0/y0;

    return-void
.end method

.method public synthetic constructor <init>(Ly/k;ZFLm0/y0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, LQ/g;-><init>(Ly/k;ZFLm0/y0;)V

    return-void
.end method

.method public static final synthetic J2(LQ/g;)V
    .locals 0

    invoke-direct {p0}, LQ/g;->N2()V

    return-void
.end method

.method public static final synthetic K2(LQ/g;)Lm0/y0;
    .locals 0

    iget-object p0, p0, LQ/g;->s:Lm0/y0;

    return-object p0
.end method

.method public static final synthetic L2(LQ/g;)LE0/j;
    .locals 0

    iget-object p0, p0, LQ/g;->t:LE0/j;

    return-object p0
.end method

.method public static final synthetic M2(LQ/g;)V
    .locals 0

    invoke-direct {p0}, LQ/g;->O2()V

    return-void
.end method

.method private final N2()V
    .locals 5

    new-instance v0, LQ/g$a;

    invoke-direct {v0, p0}, LQ/g$a;-><init>(LQ/g;)V

    new-instance v1, LQ/g$b;

    invoke-direct {v1, p0}, LQ/g$b;-><init>(LQ/g;)V

    iget-object v2, p0, LQ/g;->p:Ly/k;

    iget-boolean v3, p0, LQ/g;->q:Z

    iget v4, p0, LQ/g;->r:F

    invoke-static {v2, v3, v4, v0, v1}, LP/p;->c(Ly/k;ZFLm0/y0;Lmh/a;)LE0/j;

    move-result-object v0

    invoke-virtual {p0, v0}, LE0/m;->D2(LE0/j;)LE0/j;

    move-result-object v0

    iput-object v0, p0, LQ/g;->t:LE0/j;

    return-void
.end method

.method private final O2()V
    .locals 1

    iget-object v0, p0, LQ/g;->t:LE0/j;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, LE0/m;->G2(LE0/j;)V

    :cond_0
    return-void
.end method

.method private final P2()V
    .locals 1

    new-instance v0, LQ/g$c;

    invoke-direct {v0, p0}, LQ/g$c;-><init>(LQ/g;)V

    invoke-static {p0, v0}, LE0/i0;->a(Landroidx/compose/ui/e$c;Lmh/a;)V

    return-void
.end method


# virtual methods
.method public n2()V
    .locals 0

    invoke-direct {p0}, LQ/g;->P2()V

    return-void
.end method

.method public q1()V
    .locals 0

    invoke-direct {p0}, LQ/g;->P2()V

    return-void
.end method
