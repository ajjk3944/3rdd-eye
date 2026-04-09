.class public final LJ/g;
.super LJ/f;
.source "SourceFile"

# interfaces
.implements LE0/h;


# instance fields
.field private p:LI/o1;

.field private q:LJ/j;

.field private r:LI/l1;

.field private s:Z

.field private final t:LT/q0;

.field private final u:Lr/a;

.field private final v:Ls/J;

.field private w:LIi/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LI/o1;LJ/j;LI/l1;Z)V
    .locals 23

    move-object/from16 v0, p0

    invoke-direct/range {p0 .. p0}, LJ/f;-><init>()V

    move-object/from16 v1, p1

    iput-object v1, v0, LJ/g;->p:LI/o1;

    move-object/from16 v1, p2

    iput-object v1, v0, LJ/g;->q:LJ/j;

    move-object/from16 v1, p3

    iput-object v1, v0, LJ/g;->r:LI/l1;

    move/from16 v1, p4

    iput-boolean v1, v0, LJ/g;->s:Z

    sget-object v1, LY0/r;->b:LY0/r$a;

    invoke-virtual {v1}, LY0/r$a;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/r;->b(J)LY0/r;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v1, v2, v3, v2}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v1

    iput-object v1, v0, LJ/g;->t:LT/q0;

    new-instance v1, Lr/a;

    iget-object v2, v0, LJ/g;->p:LI/o1;

    iget-object v3, v0, LJ/g;->q:LJ/j;

    iget-object v4, v0, LJ/g;->r:LI/l1;

    invoke-direct/range {p0 .. p0}, LJ/g;->R2()J

    move-result-wide v5

    invoke-static {v2, v3, v4, v5, v6}, LJ/e;->a(LI/o1;LJ/j;LI/l1;J)J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/g;->d(J)Ll0/g;

    move-result-object v3

    invoke-static {}, LM/z;->g()Lr/s0;

    move-result-object v4

    invoke-static {}, LM/z;->f()J

    move-result-wide v5

    invoke-static {v5, v6}, Ll0/g;->d(J)Ll0/g;

    move-result-object v5

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, v1

    invoke-direct/range {v2 .. v8}, Lr/a;-><init>(Ljava/lang/Object;Lr/s0;Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v0, LJ/g;->u:Lr/a;

    new-instance v1, Ls/J;

    new-instance v10, LJ/g$a;

    invoke-direct {v10, v0}, LJ/g$a;-><init>(LJ/g;)V

    new-instance v12, LJ/g$b;

    invoke-direct {v12, v0}, LJ/g$b;-><init>(LJ/g;)V

    const/16 v21, 0x3ea

    const/16 v22, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x1

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v9, v1

    invoke-direct/range {v9 .. v22}, Ls/J;-><init>(Lmh/l;Lmh/l;Lmh/l;FZJFFZLs/V;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, LE0/m;->D2(LE0/j;)LE0/j;

    move-result-object v1

    check-cast v1, Ls/J;

    iput-object v1, v0, LJ/g;->v:Ls/J;

    return-void
.end method

.method public static final synthetic K2(LJ/g;)Lr/a;
    .locals 0

    iget-object p0, p0, LJ/g;->u:Lr/a;

    return-object p0
.end method

.method public static final synthetic L2(LJ/g;)J
    .locals 2

    invoke-direct {p0}, LJ/g;->R2()J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic M2(LJ/g;)LJ/j;
    .locals 0

    iget-object p0, p0, LJ/g;->q:LJ/j;

    return-object p0
.end method

.method public static final synthetic N2(LJ/g;)LI/o1;
    .locals 0

    iget-object p0, p0, LJ/g;->p:LI/o1;

    return-object p0
.end method

.method public static final synthetic O2(LJ/g;)LI/l1;
    .locals 0

    iget-object p0, p0, LJ/g;->r:LI/l1;

    return-object p0
.end method

.method public static final synthetic P2(LJ/g;)Z
    .locals 0

    iget-boolean p0, p0, LJ/g;->s:Z

    return p0
.end method

.method public static final synthetic Q2(LJ/g;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, LJ/g;->T2(J)V

    return-void
.end method

.method private final R2()J
    .locals 2

    iget-object v0, p0, LJ/g;->t:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/r;

    invoke-virtual {v0}, LY0/r;->j()J

    move-result-wide v0

    return-wide v0
.end method

.method private final S2()V
    .locals 9

    iget-object v0, p0, LJ/g;->w:LIi/y0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0, v2, v1, v2}, LIi/y0$a;->b(LIi/y0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    iput-object v2, p0, LJ/g;->w:LIi/y0;

    const/4 v0, 0x0

    invoke-static {v0, v1, v2}, Ls/K;->d(IILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/e$c;->d2()LIi/N;

    move-result-object v3

    new-instance v6, LJ/g$c;

    invoke-direct {v6, p0, v2}, LJ/g$c;-><init>(LJ/g;Ldh/e;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    move-result-object v0

    iput-object v0, p0, LJ/g;->w:LIi/y0;

    return-void
.end method

.method private final T2(J)V
    .locals 1

    iget-object v0, p0, LJ/g;->t:LT/q0;

    invoke-static {p1, p2}, LY0/r;->b(J)LY0/r;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public B(LC0/r;)V
    .locals 1

    iget-object v0, p0, LJ/g;->v:Ls/J;

    invoke-virtual {v0, p1}, Ls/J;->B(LC0/r;)V

    return-void
.end method

.method public J(Lo0/c;)V
    .locals 1

    invoke-interface {p1}, Lo0/c;->X1()V

    iget-object v0, p0, LJ/g;->v:Ls/J;

    invoke-virtual {v0, p1}, Ls/J;->J(Lo0/c;)V

    return-void
.end method

.method public J2(LI/o1;LJ/j;LI/l1;Z)V
    .locals 4

    iget-object v0, p0, LJ/g;->p:LI/o1;

    iget-object v1, p0, LJ/g;->q:LJ/j;

    iget-object v2, p0, LJ/g;->r:LI/l1;

    iget-boolean v3, p0, LJ/g;->s:Z

    iput-object p1, p0, LJ/g;->p:LI/o1;

    iput-object p2, p0, LJ/g;->q:LJ/j;

    iput-object p3, p0, LJ/g;->r:LI/l1;

    iput-boolean p4, p0, LJ/g;->s:Z

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p2, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p3, v2}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    if-eq p4, v3, :cond_1

    :cond_0
    invoke-direct {p0}, LJ/g;->S2()V

    :cond_1
    return-void
.end method

.method public n2()V
    .locals 0

    invoke-direct {p0}, LJ/g;->S2()V

    return-void
.end method

.method public q(LJ0/w;)V
    .locals 1

    iget-object v0, p0, LJ/g;->v:Ls/J;

    invoke-virtual {v0, p1}, Ls/J;->q(LJ0/w;)V

    return-void
.end method
