.class public final Lr/O;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr/O$a;
    }
.end annotation


# static fields
.field public static final f:I = 0x8


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LV/b;

.field private final c:LT/q0;

.field private d:J

.field private final e:LT/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/O;->a:Ljava/lang/String;

    new-instance p1, LV/b;

    const/16 v0, 0x10

    new-array v0, v0, [Lr/O$a;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, LV/b;-><init>([Ljava/lang/Object;I)V

    iput-object p1, p0, Lr/O;->b:LV/b;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, v0, v1, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, Lr/O;->c:LT/q0;

    const-wide/high16 v2, -0x8000000000000000L

    iput-wide v2, p0, Lr/O;->d:J

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0, v1, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, Lr/O;->e:LT/q0;

    return-void
.end method

.method public static final synthetic a(Lr/O;)J
    .locals 2

    iget-wide v0, p0, Lr/O;->d:J

    return-wide v0
.end method

.method public static final synthetic b(Lr/O;)LV/b;
    .locals 0

    iget-object p0, p0, Lr/O;->b:LV/b;

    return-object p0
.end method

.method public static final synthetic c(Lr/O;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lr/O;->i(J)V

    return-void
.end method

.method public static final synthetic d(Lr/O;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lr/O;->l(Z)V

    return-void
.end method

.method public static final synthetic e(Lr/O;J)V
    .locals 0

    iput-wide p1, p0, Lr/O;->d:J

    return-void
.end method

.method private final g()Z
    .locals 1

    iget-object v0, p0, Lr/O;->c:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method private final h()Z
    .locals 1

    iget-object v0, p0, Lr/O;->e:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method private final i(J)V
    .locals 8

    iget-object v0, p0, Lr/O;->b:LV/b;

    invoke-virtual {v0}, LV/b;->o()I

    move-result v1

    const/4 v2, 0x1

    if-lez v1, :cond_3

    invoke-virtual {v0}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v0

    const/4 v3, 0x0

    move v5, v2

    move v4, v3

    :cond_0
    aget-object v6, v0, v4

    check-cast v6, Lr/O$a;

    invoke-virtual {v6}, Lr/O$a;->j()Z

    move-result v7

    if-nez v7, :cond_1

    invoke-virtual {v6, p1, p2}, Lr/O$a;->p(J)V

    :cond_1
    invoke-virtual {v6}, Lr/O$a;->j()Z

    move-result v6

    if-nez v6, :cond_2

    move v5, v3

    :cond_2
    add-int/lit8 v4, v4, 0x1

    if-lt v4, v1, :cond_0

    goto :goto_0

    :cond_3
    move v5, v2

    :goto_0
    xor-int/lit8 p1, v5, 0x1

    invoke-direct {p0, p1}, Lr/O;->m(Z)V

    return-void
.end method

.method private final l(Z)V
    .locals 1

    iget-object v0, p0, Lr/O;->c:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final m(Z)V
    .locals 1

    iget-object v0, p0, Lr/O;->e:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final f(Lr/O$a;)V
    .locals 1

    iget-object v0, p0, Lr/O;->b:LV/b;

    invoke-virtual {v0, p1}, LV/b;->b(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lr/O;->l(Z)V

    return-void
.end method

.method public final j(Lr/O$a;)V
    .locals 1

    iget-object v0, p0, Lr/O;->b:LV/b;

    invoke-virtual {v0, p1}, LV/b;->x(Ljava/lang/Object;)Z

    return-void
.end method

.method public final k(LT/l;I)V
    .locals 6

    const v0, -0x12f4f699

    invoke-interface {p1, v0}, LT/l;->r(I)LT/l;

    move-result-object p1

    and-int/lit8 v1, p2, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p1, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p2

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v3, v1, 0x3

    if-ne v3, v2, :cond_3

    invoke-interface {p1}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LT/l;->C()V

    goto :goto_5

    :cond_3
    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, -0x1

    const-string v4, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:171)"

    invoke-static {v0, v1, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_4
    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    const/4 v5, 0x0

    if-ne v0, v4, :cond_5

    invoke-static {v5, v5, v2, v5}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    invoke-interface {p1, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v0, LT/q0;

    invoke-direct {p0}, Lr/O;->h()Z

    move-result v2

    if-nez v2, :cond_7

    invoke-direct {p0}, Lr/O;->g()Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    const v0, 0x669b07d8

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-interface {p1}, LT/l;->J()V

    goto :goto_4

    :cond_7
    :goto_3
    const v2, 0x6683d52a

    invoke-interface {p1, v2}, LT/l;->U(I)V

    invoke-interface {p1, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_8

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_9

    :cond_8
    new-instance v4, Lr/O$b;

    invoke-direct {v4, v0, p0, v5}, Lr/O$b;-><init>(LT/q0;Lr/O;Ldh/e;)V

    invoke-interface {p1, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v4, Lmh/p;

    and-int/lit8 v0, v1, 0xe

    invoke-static {p0, v4, p1, v0}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-interface {p1}, LT/l;->J()V

    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    :goto_5
    invoke-interface {p1}, LT/l;->z()LT/X0;

    move-result-object p1

    if-eqz p1, :cond_b

    new-instance v0, Lr/O$c;

    invoke-direct {v0, p0, p2}, Lr/O$c;-><init>(Lr/O;I)V

    invoke-interface {p1, v0}, LT/X0;->a(Lmh/p;)V

    :cond_b
    return-void
.end method
