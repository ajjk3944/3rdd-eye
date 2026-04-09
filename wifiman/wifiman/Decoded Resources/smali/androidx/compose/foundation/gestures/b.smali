.class public abstract Landroidx/compose/foundation/gestures/b;
.super LE0/m;
.source "SourceFile"

# interfaces
.implements LE0/s0;
.implements LE0/h;


# instance fields
.field private p:Lw/q;

.field private q:Lmh/l;

.field private r:Z

.field private s:Ly/m;

.field private final t:Lmh/l;

.field private u:LKi/g;

.field private v:Ly/b;

.field private w:Z

.field private x:Ly0/S;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lmh/l;ZLy/m;Lw/q;)V
    .locals 0

    invoke-direct {p0}, LE0/m;-><init>()V

    iput-object p4, p0, Landroidx/compose/foundation/gestures/b;->p:Lw/q;

    iput-object p1, p0, Landroidx/compose/foundation/gestures/b;->q:Lmh/l;

    iput-boolean p2, p0, Landroidx/compose/foundation/gestures/b;->r:Z

    iput-object p3, p0, Landroidx/compose/foundation/gestures/b;->s:Ly/m;

    new-instance p1, Landroidx/compose/foundation/gestures/b$a;

    invoke-direct {p1, p0}, Landroidx/compose/foundation/gestures/b$a;-><init>(Landroidx/compose/foundation/gestures/b;)V

    iput-object p1, p0, Landroidx/compose/foundation/gestures/b;->t:Lmh/l;

    return-void
.end method

.method public static final synthetic J2(Landroidx/compose/foundation/gestures/b;)LKi/g;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/gestures/b;->u:LKi/g;

    return-object p0
.end method

.method public static final synthetic K2(Landroidx/compose/foundation/gestures/b;)Lw/q;
    .locals 0

    iget-object p0, p0, Landroidx/compose/foundation/gestures/b;->p:Lw/q;

    return-object p0
.end method

.method public static final synthetic L2(Landroidx/compose/foundation/gestures/b;)Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/foundation/gestures/b;->w:Z

    return p0
.end method

.method public static final synthetic M2(Landroidx/compose/foundation/gestures/b;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/compose/foundation/gestures/b;->Y2(Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic N2(Landroidx/compose/foundation/gestures/b;Landroidx/compose/foundation/gestures/a$c;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/gestures/b;->Z2(Landroidx/compose/foundation/gestures/a$c;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic O2(Landroidx/compose/foundation/gestures/b;Landroidx/compose/foundation/gestures/a$d;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/gestures/b;->a3(Landroidx/compose/foundation/gestures/a$d;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic P2(Landroidx/compose/foundation/gestures/b;LKi/g;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/b;->u:LKi/g;

    return-void
.end method

.method public static final synthetic Q2(Landroidx/compose/foundation/gestures/b;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/b;->c3()V

    return-void
.end method

.method private final V2()Ly0/S;
    .locals 2

    new-instance v0, Landroidx/compose/foundation/gestures/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/compose/foundation/gestures/b$b;-><init>(Landroidx/compose/foundation/gestures/b;Ldh/e;)V

    invoke-static {v0}, Ly0/P;->a(Lmh/p;)Ly0/S;

    move-result-object v0

    return-object v0
.end method

.method private final Y2(Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Landroidx/compose/foundation/gestures/b$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Landroidx/compose/foundation/gestures/b$c;

    iget v1, v0, Landroidx/compose/foundation/gestures/b$c;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/compose/foundation/gestures/b$c;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/foundation/gestures/b$c;

    invoke-direct {v0, p0, p1}, Landroidx/compose/foundation/gestures/b$c;-><init>(Landroidx/compose/foundation/gestures/b;Ldh/e;)V

    :goto_0
    iget-object p1, v0, Landroidx/compose/foundation/gestures/b$c;->b:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Landroidx/compose/foundation/gestures/b$c;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Landroidx/compose/foundation/gestures/b$c;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/foundation/gestures/b;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Landroidx/compose/foundation/gestures/b;->v:Ly/b;

    if-eqz p1, :cond_4

    iget-object v2, p0, Landroidx/compose/foundation/gestures/b;->s:Ly/m;

    if-eqz v2, :cond_3

    new-instance v4, Ly/a;

    invoke-direct {v4, p1}, Ly/a;-><init>(Ly/b;)V

    iput-object p0, v0, Landroidx/compose/foundation/gestures/b$c;->a:Ljava/lang/Object;

    iput v3, v0, Landroidx/compose/foundation/gestures/b$c;->d:I

    invoke-interface {v2, v4, v0}, Ly/m;->a(Ly/j;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    const/4 p1, 0x0

    iput-object p1, v0, Landroidx/compose/foundation/gestures/b;->v:Ly/b;

    goto :goto_2

    :cond_4
    move-object v0, p0

    :goto_2
    sget-object p1, LY0/y;->b:LY0/y$a;

    invoke-virtual {p1}, LY0/y$a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Landroidx/compose/foundation/gestures/b;->X2(J)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method private final Z2(Landroidx/compose/foundation/gestures/a$c;Ldh/e;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Landroidx/compose/foundation/gestures/b$d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Landroidx/compose/foundation/gestures/b$d;

    iget v1, v0, Landroidx/compose/foundation/gestures/b$d;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/compose/foundation/gestures/b$d;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/foundation/gestures/b$d;

    invoke-direct {v0, p0, p2}, Landroidx/compose/foundation/gestures/b$d;-><init>(Landroidx/compose/foundation/gestures/b;Ldh/e;)V

    :goto_0
    iget-object p2, v0, Landroidx/compose/foundation/gestures/b$d;->d:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Landroidx/compose/foundation/gestures/b$d;->f:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Landroidx/compose/foundation/gestures/b$d;->c:Ljava/lang/Object;

    check-cast p1, Ly/b;

    iget-object v1, v0, Landroidx/compose/foundation/gestures/b$d;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/foundation/gestures/a$c;

    iget-object v0, v0, Landroidx/compose/foundation/gestures/b$d;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/foundation/gestures/b;

    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Landroidx/compose/foundation/gestures/b$d;->b:Ljava/lang/Object;

    check-cast p1, Landroidx/compose/foundation/gestures/a$c;

    iget-object v2, v0, Landroidx/compose/foundation/gestures/b$d;->a:Ljava/lang/Object;

    check-cast v2, Landroidx/compose/foundation/gestures/b;

    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Landroidx/compose/foundation/gestures/b;->v:Ly/b;

    if-eqz p2, :cond_4

    iget-object v2, p0, Landroidx/compose/foundation/gestures/b;->s:Ly/m;

    if-eqz v2, :cond_4

    new-instance v5, Ly/a;

    invoke-direct {v5, p2}, Ly/a;-><init>(Ly/b;)V

    iput-object p0, v0, Landroidx/compose/foundation/gestures/b$d;->a:Ljava/lang/Object;

    iput-object p1, v0, Landroidx/compose/foundation/gestures/b$d;->b:Ljava/lang/Object;

    iput v4, v0, Landroidx/compose/foundation/gestures/b$d;->f:I

    invoke-interface {v2, v5, v0}, Ly/m;->a(Ly/j;Ldh/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    new-instance p2, Ly/b;

    invoke-direct {p2}, Ly/b;-><init>()V

    iget-object v4, v2, Landroidx/compose/foundation/gestures/b;->s:Ly/m;

    if-eqz v4, :cond_6

    iput-object v2, v0, Landroidx/compose/foundation/gestures/b$d;->a:Ljava/lang/Object;

    iput-object p1, v0, Landroidx/compose/foundation/gestures/b$d;->b:Ljava/lang/Object;

    iput-object p2, v0, Landroidx/compose/foundation/gestures/b$d;->c:Ljava/lang/Object;

    iput v3, v0, Landroidx/compose/foundation/gestures/b$d;->f:I

    invoke-interface {v4, p2, v0}, Ly/m;->a(Ly/j;Ldh/e;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5

    return-object v1

    :cond_5
    move-object v1, p1

    move-object p1, p2

    move-object v0, v2

    :goto_2
    move-object p2, p1

    move-object v2, v0

    move-object p1, v1

    :cond_6
    iput-object p2, v2, Landroidx/compose/foundation/gestures/b;->v:Ly/b;

    invoke-virtual {p1}, Landroidx/compose/foundation/gestures/a$c;->a()J

    move-result-wide p1

    invoke-virtual {v2, p1, p2}, Landroidx/compose/foundation/gestures/b;->W2(J)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method private final a3(Landroidx/compose/foundation/gestures/a$d;Ldh/e;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Landroidx/compose/foundation/gestures/b$e;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Landroidx/compose/foundation/gestures/b$e;

    iget v1, v0, Landroidx/compose/foundation/gestures/b$e;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/compose/foundation/gestures/b$e;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/compose/foundation/gestures/b$e;

    invoke-direct {v0, p0, p2}, Landroidx/compose/foundation/gestures/b$e;-><init>(Landroidx/compose/foundation/gestures/b;Ldh/e;)V

    :goto_0
    iget-object p2, v0, Landroidx/compose/foundation/gestures/b$e;->c:Ljava/lang/Object;

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Landroidx/compose/foundation/gestures/b$e;->e:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Landroidx/compose/foundation/gestures/b$e;->b:Ljava/lang/Object;

    check-cast p1, Landroidx/compose/foundation/gestures/a$d;

    iget-object v0, v0, Landroidx/compose/foundation/gestures/b$e;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/foundation/gestures/b;

    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Landroidx/compose/foundation/gestures/b;->v:Ly/b;

    if-eqz p2, :cond_4

    iget-object v2, p0, Landroidx/compose/foundation/gestures/b;->s:Ly/m;

    if-eqz v2, :cond_3

    new-instance v4, Ly/c;

    invoke-direct {v4, p2}, Ly/c;-><init>(Ly/b;)V

    iput-object p0, v0, Landroidx/compose/foundation/gestures/b$e;->a:Ljava/lang/Object;

    iput-object p1, v0, Landroidx/compose/foundation/gestures/b$e;->b:Ljava/lang/Object;

    iput v3, v0, Landroidx/compose/foundation/gestures/b$e;->e:I

    invoke-interface {v2, v4, v0}, Ly/m;->a(Ly/j;Ldh/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    const/4 p2, 0x0

    iput-object p2, v0, Landroidx/compose/foundation/gestures/b;->v:Ly/b;

    goto :goto_2

    :cond_4
    move-object v0, p0

    :goto_2
    invoke-virtual {p1}, Landroidx/compose/foundation/gestures/a$d;->a()J

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Landroidx/compose/foundation/gestures/b;->X2(J)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method private final c3()V
    .locals 7

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/foundation/gestures/b;->w:Z

    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v1

    new-instance v4, Landroidx/compose/foundation/gestures/b$f;

    const/4 v0, 0x0

    invoke-direct {v4, p0, v0}, Landroidx/compose/foundation/gestures/b$f;-><init>(Landroidx/compose/foundation/gestures/b;Ldh/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    return-void
.end method


# virtual methods
.method public C0()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/gestures/b;->x:Ly0/S;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LE0/s0;->C0()V

    :cond_0
    return-void
.end method

.method public final R2()V
    .locals 3

    iget-object v0, p0, Landroidx/compose/foundation/gestures/b;->v:Ly/b;

    if-eqz v0, :cond_1

    iget-object v1, p0, Landroidx/compose/foundation/gestures/b;->s:Ly/m;

    if-eqz v1, :cond_0

    new-instance v2, Ly/a;

    invoke-direct {v2, v0}, Ly/a;-><init>(Ly/b;)V

    invoke-interface {v1, v2}, Ly/m;->c(Ly/j;)Z

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/compose/foundation/gestures/b;->v:Ly/b;

    :cond_1
    return-void
.end method

.method public abstract S2(Lmh/p;Ldh/e;)Ljava/lang/Object;
.end method

.method protected final T2()Lmh/l;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/gestures/b;->q:Lmh/l;

    return-object v0
.end method

.method protected final U2()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/gestures/b;->r:Z

    return v0
.end method

.method public abstract W2(J)V
.end method

.method public abstract X2(J)V
.end method

.method public abstract b3()Z
.end method

.method public final d3(Lmh/l;ZLy/m;Lw/q;Z)V
    .locals 1

    iput-object p1, p0, Landroidx/compose/foundation/gestures/b;->q:Lmh/l;

    iget-boolean p1, p0, Landroidx/compose/foundation/gestures/b;->r:Z

    const/4 v0, 0x1

    if-eq p1, p2, :cond_2

    iput-boolean p2, p0, Landroidx/compose/foundation/gestures/b;->r:Z

    if-nez p2, :cond_1

    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/b;->R2()V

    iget-object p1, p0, Landroidx/compose/foundation/gestures/b;->x:Ly0/S;

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, LE0/m;->G2(LE0/j;)V

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/compose/foundation/gestures/b;->x:Ly0/S;

    :cond_1
    move p5, v0

    :cond_2
    iget-object p1, p0, Landroidx/compose/foundation/gestures/b;->s:Ly/m;

    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/b;->R2()V

    iput-object p3, p0, Landroidx/compose/foundation/gestures/b;->s:Ly/m;

    :cond_3
    iget-object p1, p0, Landroidx/compose/foundation/gestures/b;->p:Lw/q;

    if-eq p1, p4, :cond_4

    iput-object p4, p0, Landroidx/compose/foundation/gestures/b;->p:Lw/q;

    goto :goto_0

    :cond_4
    move v0, p5

    :goto_0
    if-eqz v0, :cond_5

    iget-object p1, p0, Landroidx/compose/foundation/gestures/b;->x:Ly0/S;

    if-eqz p1, :cond_5

    invoke-interface {p1}, Ly0/S;->Z1()V

    :cond_5
    return-void
.end method

.method public o2()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/foundation/gestures/b;->w:Z

    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/b;->R2()V

    return-void
.end method

.method public s0(Ly0/n;Ly0/p;J)V
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/gestures/b;->r:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/foundation/gestures/b;->x:Ly0/S;

    if-nez v0, :cond_0

    invoke-direct {p0}, Landroidx/compose/foundation/gestures/b;->V2()Ly0/S;

    move-result-object v0

    invoke-virtual {p0, v0}, LE0/m;->D2(LE0/j;)LE0/j;

    move-result-object v0

    check-cast v0, Ly0/S;

    iput-object v0, p0, Landroidx/compose/foundation/gestures/b;->x:Ly0/S;

    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/gestures/b;->x:Ly0/S;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2, p3, p4}, LE0/s0;->s0(Ly0/n;Ly0/p;J)V

    :cond_1
    return-void
.end method
