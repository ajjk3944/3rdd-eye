.class public abstract LP/q;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/h;
.implements LE0/r;
.implements LE0/A;


# instance fields
.field private final n:Ly/k;

.field private final o:Z

.field private final p:F

.field private final q:Lm0/y0;

.field private final r:Lmh/a;

.field private final s:Z

.field private t:LP/u;

.field private u:F

.field private v:J

.field private w:Z

.field private final x:Lo/F;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ly/k;ZFLm0/y0;Lmh/a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 3
    iput-object p1, p0, LP/q;->n:Ly/k;

    .line 4
    iput-boolean p2, p0, LP/q;->o:Z

    .line 5
    iput p3, p0, LP/q;->p:F

    .line 6
    iput-object p4, p0, LP/q;->q:Lm0/y0;

    .line 7
    iput-object p5, p0, LP/q;->r:Lmh/a;

    .line 8
    sget-object p1, Ll0/m;->b:Ll0/m$a;

    invoke-virtual {p1}, Ll0/m$a;->b()J

    move-result-wide p1

    iput-wide p1, p0, LP/q;->v:J

    .line 9
    new-instance p1, Lo/F;

    const/4 p2, 0x1

    const/4 p3, 0x0

    const/4 p4, 0x0

    invoke-direct {p1, p4, p2, p3}, Lo/F;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    iput-object p1, p0, LP/q;->x:Lo/F;

    return-void
.end method

.method public synthetic constructor <init>(Ly/k;ZFLm0/y0;Lmh/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, LP/q;-><init>(Ly/k;ZFLm0/y0;Lmh/a;)V

    return-void
.end method

.method public static final synthetic D2(LP/q;)Z
    .locals 0

    iget-boolean p0, p0, LP/q;->w:Z

    return p0
.end method

.method public static final synthetic E2(LP/q;)Ly/k;
    .locals 0

    iget-object p0, p0, LP/q;->n:Ly/k;

    return-object p0
.end method

.method public static final synthetic F2(LP/q;)Lo/F;
    .locals 0

    iget-object p0, p0, LP/q;->x:Lo/F;

    return-object p0
.end method

.method public static final synthetic G2(LP/q;Ly/o;)V
    .locals 0

    invoke-direct {p0, p1}, LP/q;->O2(Ly/o;)V

    return-void
.end method

.method public static final synthetic H2(LP/q;Ly/j;LIi/N;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LP/q;->Q2(Ly/j;LIi/N;)V

    return-void
.end method

.method private final O2(Ly/o;)V
    .locals 3

    instance-of v0, p1, Ly/o$b;

    if-eqz v0, :cond_0

    check-cast p1, Ly/o$b;

    iget-wide v0, p0, LP/q;->v:J

    iget v2, p0, LP/q;->u:F

    invoke-virtual {p0, p1, v0, v1, v2}, LP/q;->I2(Ly/o$b;JF)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ly/o$c;

    if-eqz v0, :cond_1

    check-cast p1, Ly/o$c;

    invoke-virtual {p1}, Ly/o$c;->a()Ly/o$b;

    move-result-object p1

    invoke-virtual {p0, p1}, LP/q;->P2(Ly/o$b;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ly/o$a;

    if-eqz v0, :cond_2

    check-cast p1, Ly/o$a;

    invoke-virtual {p1}, Ly/o$a;->a()Ly/o$b;

    move-result-object p1

    invoke-virtual {p0, p1}, LP/q;->P2(Ly/o$b;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private final Q2(Ly/j;LIi/N;)V
    .locals 3

    iget-object v0, p0, LP/q;->t:LP/u;

    if-nez v0, :cond_0

    new-instance v0, LP/u;

    iget-boolean v1, p0, LP/q;->o:Z

    iget-object v2, p0, LP/q;->r:Lmh/a;

    invoke-direct {v0, v1, v2}, LP/u;-><init>(ZLmh/a;)V

    invoke-static {p0}, LE0/s;->a(LE0/r;)V

    iput-object v0, p0, LP/q;->t:LP/u;

    :cond_0
    invoke-virtual {v0, p1, p2}, LP/u;->c(Ly/j;LIi/N;)V

    return-void
.end method


# virtual methods
.method public abstract I2(Ly/o$b;JF)V
.end method

.method public J(Lo0/c;)V
    .locals 4

    invoke-interface {p1}, Lo0/c;->X1()V

    iget-object v0, p0, LP/q;->t:LP/u;

    if-eqz v0, :cond_0

    iget v1, p0, LP/q;->u:F

    invoke-virtual {p0}, LP/q;->M2()J

    move-result-wide v2

    invoke-virtual {v0, p1, v1, v2, v3}, LP/u;->b(Lo0/f;FJ)V

    :cond_0
    invoke-virtual {p0, p1}, LP/q;->J2(Lo0/f;)V

    return-void
.end method

.method public abstract J2(Lo0/f;)V
.end method

.method protected final K2()Z
    .locals 1

    iget-boolean v0, p0, LP/q;->o:Z

    return v0
.end method

.method protected final L2()Lmh/a;
    .locals 1

    iget-object v0, p0, LP/q;->r:Lmh/a;

    return-object v0
.end method

.method public final M2()J
    .locals 2

    iget-object v0, p0, LP/q;->q:Lm0/y0;

    invoke-interface {v0}, Lm0/y0;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method protected final N2()J
    .locals 2

    iget-wide v0, p0, LP/q;->v:J

    return-wide v0
.end method

.method public abstract P2(Ly/o$b;)V
.end method

.method public a0(J)V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, LP/q;->w:Z

    invoke-static {p0}, LE0/k;->i(LE0/j;)LY0/d;

    move-result-object v0

    invoke-static {p1, p2}, LY0/s;->d(J)J

    move-result-wide p1

    iput-wide p1, p0, LP/q;->v:J

    iget p1, p0, LP/q;->p:F

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, LP/q;->o:Z

    iget-wide v1, p0, LP/q;->v:J

    invoke-static {v0, p1, v1, v2}, LP/i;->a(LY0/d;ZJ)F

    move-result p1

    goto :goto_0

    :cond_0
    iget p1, p0, LP/q;->p:F

    invoke-interface {v0, p1}, LY0/d;->d1(F)F

    move-result p1

    :goto_0
    iput p1, p0, LP/q;->u:F

    iget-object p1, p0, LP/q;->x:Lo/F;

    iget-object p2, p1, Lo/M;->a:[Ljava/lang/Object;

    iget p1, p1, Lo/M;->b:I

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p1, :cond_1

    aget-object v1, p2, v0

    check-cast v1, Ly/o;

    invoke-direct {p0, v1}, LP/q;->O2(Ly/o;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    iget-object p1, p0, LP/q;->x:Lo/F;

    invoke-virtual {p1}, Lo/F;->h()V

    return-void
.end method

.method public final i2()Z
    .locals 1

    iget-boolean v0, p0, LP/q;->s:Z

    return v0
.end method

.method public n2()V
    .locals 6

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v0

    new-instance v3, LP/q$a;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, LP/q$a;-><init>(LP/q;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    return-void
.end method
