.class public abstract LP/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls/G;


# instance fields
.field private final a:Z

.field private final b:F

.field private final c:LT/z1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(ZFLT/z1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, LP/f;->a:Z

    .line 4
    iput p2, p0, LP/f;->b:F

    .line 5
    iput-object p3, p0, LP/f;->c:LT/z1;

    return-void
.end method

.method public synthetic constructor <init>(ZFLT/z1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LP/f;-><init>(ZFLT/z1;)V

    return-void
.end method


# virtual methods
.method public final b(Ly/k;LT/l;I)Ls/H;
    .locals 11

    const v0, 0x3aef0613

    invoke-interface {p2, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:196)"

    invoke-static {v0, p3, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, LP/s;->d()LT/H0;

    move-result-object v0

    invoke-interface {p2, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP/r;

    iget-object v1, p0, LP/f;->c:LT/z1;

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm0/v0;

    invoke-virtual {v1}, Lm0/v0;->u()J

    move-result-wide v1

    const-wide/16 v3, 0x10

    cmp-long v1, v1, v3

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const v1, -0x12182286

    invoke-interface {p2, v1}, LT/l;->U(I)V

    invoke-interface {p2}, LT/l;->J()V

    iget-object v1, p0, LP/f;->c:LT/z1;

    invoke-interface {v1}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm0/v0;

    invoke-virtual {v1}, Lm0/v0;->u()J

    move-result-wide v3

    goto :goto_0

    :cond_1
    const v1, -0x12175dde    # -8.999566E27f

    invoke-interface {p2, v1}, LT/l;->U(I)V

    invoke-interface {v0, p2, v2}, LP/r;->b(LT/l;I)J

    move-result-wide v3

    invoke-interface {p2}, LT/l;->J()V

    :goto_0
    invoke-static {v3, v4}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v1

    invoke-static {v1, p2, v2}, LT/o1;->n(Ljava/lang/Object;LT/l;I)LT/z1;

    move-result-object v7

    invoke-interface {v0, p2, v2}, LP/r;->a(LT/l;I)LP/g;

    move-result-object v0

    invoke-static {v0, p2, v2}, LT/o1;->n(Ljava/lang/Object;LT/l;I)LT/z1;

    move-result-object v8

    iget-boolean v5, p0, LP/f;->a:Z

    iget v6, p0, LP/f;->b:F

    and-int/lit8 v0, p3, 0xe

    shl-int/lit8 v1, p3, 0xc

    const/high16 v3, 0x70000

    and-int/2addr v1, v3

    or-int v10, v0, v1

    move-object v3, p0

    move-object v4, p1

    move-object v9, p2

    invoke-virtual/range {v3 .. v10}, LP/f;->c(Ly/k;ZFLT/z1;LT/z1;LT/l;I)LP/o;

    move-result-object v1

    xor-int/lit8 v0, v0, 0x6

    const/4 v3, 0x4

    if-le v0, v3, :cond_2

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    and-int/lit8 v0, p3, 0x6

    if-ne v0, v3, :cond_4

    :cond_3
    const/4 v2, 0x1

    :cond_4
    invoke-interface {p2, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v2

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_5

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_6

    :cond_5
    new-instance v2, LP/f$a;

    const/4 v0, 0x0

    invoke-direct {v2, p1, v1, v0}, LP/f$a;-><init>(Ly/k;LP/o;Ldh/e;)V

    invoke-interface {p2, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, Lmh/p;

    shl-int/lit8 p3, p3, 0x3

    and-int/lit8 p3, p3, 0x70

    invoke-static {v1, p1, v2, p2, p3}, LT/O;->e(Ljava/lang/Object;Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    invoke-interface {p2}, LT/l;->J()V

    return-object v1
.end method

.method public abstract c(Ly/k;ZFLT/z1;LT/z1;LT/l;I)LP/o;
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LP/f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-boolean v1, p0, LP/f;->a:Z

    check-cast p1, LP/f;

    iget-boolean v3, p1, LP/f;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, LP/f;->b:F

    iget v3, p1, LP/f;->b:F

    invoke-static {v1, v3}, LY0/h;->n(FF)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LP/f;->c:LT/z1;

    iget-object p1, p1, LP/f;->c:LT/z1;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, LP/f;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LP/f;->b:F

    invoke-static {v1}, LY0/h;->p(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LP/f;->c:LT/z1;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
