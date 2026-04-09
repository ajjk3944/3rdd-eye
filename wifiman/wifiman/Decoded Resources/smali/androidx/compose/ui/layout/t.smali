.class public abstract Landroidx/compose/ui/layout/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/E;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/layout/t$a;
    }
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:J

.field private d:J

.field private e:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    invoke-static {v0, v0}, LY0/s;->a(II)J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/layout/t;->c:J

    invoke-static {}, Landroidx/compose/ui/layout/u;->c()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/layout/t;->d:J

    sget-object v0, LY0/n;->b:LY0/n$a;

    invoke-virtual {v0}, LY0/n$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/layout/t;->e:J

    return-void
.end method

.method private final J0()V
    .locals 4

    iget-wide v0, p0, Landroidx/compose/ui/layout/t;->c:J

    invoke-static {v0, v1}, LY0/r;->g(J)I

    move-result v0

    iget-wide v1, p0, Landroidx/compose/ui/layout/t;->d:J

    invoke-static {v1, v2}, LY0/b;->n(J)I

    move-result v1

    iget-wide v2, p0, Landroidx/compose/ui/layout/t;->d:J

    invoke-static {v2, v3}, LY0/b;->l(J)I

    move-result v2

    invoke-static {v0, v1, v2}, Lsh/m;->k(III)I

    move-result v0

    iput v0, p0, Landroidx/compose/ui/layout/t;->a:I

    iget-wide v0, p0, Landroidx/compose/ui/layout/t;->c:J

    invoke-static {v0, v1}, LY0/r;->f(J)I

    move-result v0

    iget-wide v1, p0, Landroidx/compose/ui/layout/t;->d:J

    invoke-static {v1, v2}, LY0/b;->m(J)I

    move-result v1

    iget-wide v2, p0, Landroidx/compose/ui/layout/t;->d:J

    invoke-static {v2, v3}, LY0/b;->k(J)I

    move-result v2

    invoke-static {v0, v1, v2}, Lsh/m;->k(III)I

    move-result v0

    iput v0, p0, Landroidx/compose/ui/layout/t;->b:I

    iget v0, p0, Landroidx/compose/ui/layout/t;->a:I

    iget-wide v1, p0, Landroidx/compose/ui/layout/t;->c:J

    invoke-static {v1, v2}, LY0/r;->g(J)I

    move-result v1

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    iget v1, p0, Landroidx/compose/ui/layout/t;->b:I

    iget-wide v2, p0, Landroidx/compose/ui/layout/t;->c:J

    invoke-static {v2, v3}, LY0/r;->f(J)I

    move-result v2

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, LY0/o;->a(II)J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/layout/t;->e:J

    return-void
.end method

.method public static final synthetic v0(Landroidx/compose/ui/layout/t;)J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/layout/t;->e:J

    return-wide v0
.end method

.method public static final synthetic w0(Landroidx/compose/ui/layout/t;JFLmh/l;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/compose/ui/layout/t;->K0(JFLmh/l;)V

    return-void
.end method

.method public static final synthetic y0(Landroidx/compose/ui/layout/t;JFLp0/c;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/compose/ui/layout/t;->L0(JFLp0/c;)V

    return-void
.end method


# virtual methods
.method protected final A0()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/layout/t;->e:J

    return-wide v0
.end method

.method public final C0()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/layout/t;->b:I

    return v0
.end method

.method public D0()I
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/layout/t;->c:J

    invoke-static {v0, v1}, LY0/r;->f(J)I

    move-result v0

    return v0
.end method

.method protected final E0()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/layout/t;->c:J

    return-wide v0
.end method

.method public G0()I
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/layout/t;->c:J

    invoke-static {v0, v1}, LY0/r;->g(J)I

    move-result v0

    return v0
.end method

.method protected final H0()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/layout/t;->d:J

    return-wide v0
.end method

.method public final I0()I
    .locals 1

    iget v0, p0, Landroidx/compose/ui/layout/t;->a:I

    return v0
.end method

.method protected abstract K0(JFLmh/l;)V
.end method

.method protected L0(JFLp0/c;)V
    .locals 0

    const/4 p4, 0x0

    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/compose/ui/layout/t;->K0(JFLmh/l;)V

    return-void
.end method

.method protected final Q0(J)V
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/layout/t;->c:J

    invoke-static {v0, v1, p1, p2}, LY0/r;->e(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iput-wide p1, p0, Landroidx/compose/ui/layout/t;->c:J

    invoke-direct {p0}, Landroidx/compose/ui/layout/t;->J0()V

    :cond_0
    return-void
.end method

.method protected final S0(J)V
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/layout/t;->d:J

    invoke-static {v0, v1, p1, p2}, LY0/b;->f(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    iput-wide p1, p0, Landroidx/compose/ui/layout/t;->d:J

    invoke-direct {p0}, Landroidx/compose/ui/layout/t;->J0()V

    :cond_0
    return-void
.end method
