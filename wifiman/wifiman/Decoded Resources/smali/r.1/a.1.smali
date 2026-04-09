.class public final Lr/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final m:I = 0x8


# instance fields
.field private final a:Lr/s0;

.field private final b:Ljava/lang/Object;

.field private final c:Ljava/lang/String;

.field private final d:Lr/k;

.field private final e:LT/q0;

.field private final f:LT/q0;

.field private final g:Lr/Z;

.field private final h:Lr/h0;

.field private final i:Lr/q;

.field private final j:Lr/q;

.field private k:Lr/q;

.field private l:Lr/q;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lr/s0;Ljava/lang/Object;)V
    .locals 1

    .line 29
    const-string v0, "Animatable"

    invoke-direct {p0, p1, p2, p3, v0}, Lr/a;-><init>(Ljava/lang/Object;Lr/s0;Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lr/s0;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 28
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lr/a;-><init>(Ljava/lang/Object;Lr/s0;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lr/s0;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 11

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lr/a;->a:Lr/s0;

    .line 3
    iput-object p3, p0, Lr/a;->b:Ljava/lang/Object;

    .line 4
    iput-object p4, p0, Lr/a;->c:Ljava/lang/String;

    .line 5
    new-instance p4, Lr/k;

    const/16 v9, 0x3c

    const/4 v10, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    move-object v0, p4

    move-object v1, p2

    move-object v2, p1

    invoke-direct/range {v0 .. v10}, Lr/k;-><init>(Lr/s0;Ljava/lang/Object;Lr/q;JJZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p4, p0, Lr/a;->d:Lr/k;

    .line 6
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 p4, 0x0

    const/4 v0, 0x2

    invoke-static {p2, p4, v0, p4}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p2

    iput-object p2, p0, Lr/a;->e:LT/q0;

    .line 7
    invoke-static {p1, p4, v0, p4}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, Lr/a;->f:LT/q0;

    .line 8
    new-instance p1, Lr/Z;

    invoke-direct {p1}, Lr/Z;-><init>()V

    iput-object p1, p0, Lr/a;->g:Lr/Z;

    .line 9
    new-instance p1, Lr/h0;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    move-object v3, p3

    invoke-direct/range {v0 .. v5}, Lr/h0;-><init>(FFLjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lr/a;->h:Lr/h0;

    .line 10
    invoke-virtual {p0}, Lr/a;->o()Lr/q;

    move-result-object p1

    .line 11
    instance-of p2, p1, Lr/m;

    if-eqz p2, :cond_0

    invoke-static {}, Lr/b;->c()Lr/m;

    move-result-object p1

    goto :goto_0

    .line 12
    :cond_0
    instance-of p2, p1, Lr/n;

    if-eqz p2, :cond_1

    invoke-static {}, Lr/b;->d()Lr/n;

    move-result-object p1

    goto :goto_0

    .line 13
    :cond_1
    instance-of p1, p1, Lr/o;

    if-eqz p1, :cond_2

    invoke-static {}, Lr/b;->e()Lr/o;

    move-result-object p1

    goto :goto_0

    .line 14
    :cond_2
    invoke-static {}, Lr/b;->f()Lr/p;

    move-result-object p1

    .line 15
    :goto_0
    const-string p2, "null cannot be cast to non-null type V of androidx.compose.animation.core.Animatable"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    iput-object p1, p0, Lr/a;->i:Lr/q;

    .line 17
    invoke-virtual {p0}, Lr/a;->o()Lr/q;

    move-result-object p3

    .line 18
    instance-of p4, p3, Lr/m;

    if-eqz p4, :cond_3

    invoke-static {}, Lr/b;->g()Lr/m;

    move-result-object p3

    goto :goto_1

    .line 19
    :cond_3
    instance-of p4, p3, Lr/n;

    if-eqz p4, :cond_4

    invoke-static {}, Lr/b;->h()Lr/n;

    move-result-object p3

    goto :goto_1

    .line 20
    :cond_4
    instance-of p3, p3, Lr/o;

    if-eqz p3, :cond_5

    invoke-static {}, Lr/b;->i()Lr/o;

    move-result-object p3

    goto :goto_1

    .line 21
    :cond_5
    invoke-static {}, Lr/b;->j()Lr/p;

    move-result-object p3

    .line 22
    :goto_1
    invoke-static {p3, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    iput-object p3, p0, Lr/a;->j:Lr/q;

    .line 24
    iput-object p1, p0, Lr/a;->k:Lr/q;

    .line 25
    iput-object p3, p0, Lr/a;->l:Lr/q;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lr/s0;Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    const/4 p3, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 26
    const-string p4, "Animatable"

    .line 27
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lr/a;-><init>(Ljava/lang/Object;Lr/s0;Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic a(Lr/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lr/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lr/a;)V
    .locals 0

    invoke-direct {p0}, Lr/a;->i()V

    return-void
.end method

.method public static final synthetic c(Lr/a;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lr/a;->r(Z)V

    return-void
.end method

.method public static final synthetic d(Lr/a;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lr/a;->s(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic f(Lr/a;Ljava/lang/Object;Lr/i;Ljava/lang/Object;Lmh/l;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    iget-object p2, p0, Lr/a;->h:Lr/h0;

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lr/a;->n()Ljava/lang/Object;

    move-result-object p3

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    const/4 p4, 0x0

    :cond_2
    move-object v4, p4

    move-object v0, p0

    move-object v1, p1

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lr/a;->e(Ljava/lang/Object;Lr/i;Ljava/lang/Object;Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lr/a;->k:Lr/q;

    iget-object v1, p0, Lr/a;->i:Lr/q;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lr/a;->l:Lr/q;

    iget-object v1, p0, Lr/a;->j:Lr/q;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, Lr/a;->a:Lr/s0;

    invoke-interface {v0}, Lr/s0;->a()Lmh/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr/q;

    invoke-virtual {v0}, Lr/q;->b()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_3

    invoke-virtual {v0, v2}, Lr/q;->a(I)F

    move-result v4

    iget-object v5, p0, Lr/a;->k:Lr/q;

    invoke-virtual {v5, v2}, Lr/q;->a(I)F

    move-result v5

    cmpg-float v4, v4, v5

    if-ltz v4, :cond_1

    invoke-virtual {v0, v2}, Lr/q;->a(I)F

    move-result v4

    iget-object v5, p0, Lr/a;->l:Lr/q;

    invoke-virtual {v5, v2}, Lr/q;->a(I)F

    move-result v5

    cmpl-float v4, v4, v5

    if-lez v4, :cond_2

    :cond_1
    invoke-virtual {v0, v2}, Lr/q;->a(I)F

    move-result v3

    iget-object v4, p0, Lr/a;->k:Lr/q;

    invoke-virtual {v4, v2}, Lr/q;->a(I)F

    move-result v4

    iget-object v5, p0, Lr/a;->l:Lr/q;

    invoke-virtual {v5, v2}, Lr/q;->a(I)F

    move-result v5

    invoke-static {v3, v4, v5}, Lsh/m;->j(FFF)F

    move-result v3

    invoke-virtual {v0, v2, v3}, Lr/q;->e(IF)V

    const/4 v3, 0x1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    if-eqz v3, :cond_4

    iget-object p1, p0, Lr/a;->a:Lr/s0;

    invoke-interface {p1}, Lr/s0;->b()Lmh/l;

    move-result-object p1

    invoke-interface {p1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :cond_4
    return-object p1
.end method

.method private final i()V
    .locals 3

    iget-object v0, p0, Lr/a;->d:Lr/k;

    invoke-virtual {v0}, Lr/k;->q()Lr/q;

    move-result-object v1

    invoke-virtual {v1}, Lr/q;->d()V

    const-wide/high16 v1, -0x8000000000000000L

    invoke-virtual {v0, v1, v2}, Lr/k;->t(J)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lr/a;->r(Z)V

    return-void
.end method

.method private final q(Lr/d;Ljava/lang/Object;Lmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 15

    move-object v8, p0

    iget-object v0, v8, Lr/a;->d:Lr/k;

    invoke-virtual {v0}, Lr/k;->i()J

    move-result-wide v4

    iget-object v9, v8, Lr/a;->g:Lr/Z;

    new-instance v11, Lr/a$a;

    const/4 v7, 0x0

    move-object v0, v11

    move-object v1, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p1

    move-object/from16 v6, p3

    invoke-direct/range {v0 .. v7}, Lr/a$a;-><init>(Lr/a;Ljava/lang/Object;Lr/d;JLmh/l;Ldh/e;)V

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v10, 0x0

    move-object/from16 v12, p4

    invoke-static/range {v9 .. v14}, Lr/Z;->e(Lr/Z;Lr/X;Lmh/l;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private final r(Z)V
    .locals 1

    iget-object v0, p0, Lr/a;->e:LT/q0;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final s(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lr/a;->f:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lr/i;Ljava/lang/Object;Lmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Lr/a;->m()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lr/a;->a:Lr/s0;

    invoke-static {p2, v1, v0, p1, p3}, Lr/f;->a(Lr/i;Lr/s0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lr/n0;

    move-result-object p1

    invoke-direct {p0, p1, p3, p4, p5}, Lr/a;->q(Lr/d;Ljava/lang/Object;Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final g()LT/z1;
    .locals 1

    iget-object v0, p0, Lr/a;->d:Lr/k;

    return-object v0
.end method

.method public final j()Lr/k;
    .locals 1

    iget-object v0, p0, Lr/a;->d:Lr/k;

    return-object v0
.end method

.method public final k()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr/a;->f:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final l()Lr/s0;
    .locals 1

    iget-object v0, p0, Lr/a;->a:Lr/s0;

    return-object v0
.end method

.method public final m()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr/a;->d:Lr/k;

    invoke-virtual {v0}, Lr/k;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final n()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lr/a;->a:Lr/s0;

    invoke-interface {v0}, Lr/s0;->b()Lmh/l;

    move-result-object v0

    invoke-virtual {p0}, Lr/a;->o()Lr/q;

    move-result-object v1

    invoke-interface {v0, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final o()Lr/q;
    .locals 1

    iget-object v0, p0, Lr/a;->d:Lr/k;

    invoke-virtual {v0}, Lr/k;->q()Lr/q;

    move-result-object v0

    return-object v0
.end method

.method public final p()Z
    .locals 1

    iget-object v0, p0, Lr/a;->e:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final t(Ljava/lang/Object;Ldh/e;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lr/a;->g:Lr/Z;

    new-instance v2, Lr/a$b;

    const/4 v1, 0x0

    invoke-direct {v2, p0, p1, v1}, Lr/a$b;-><init>(Lr/a;Ljava/lang/Object;Ldh/e;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v3, p2

    invoke-static/range {v0 .. v5}, Lr/Z;->e(Lr/Z;Lr/X;Lmh/l;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final u(Ldh/e;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lr/a;->g:Lr/Z;

    new-instance v2, Lr/a$c;

    const/4 v1, 0x0

    invoke-direct {v2, p0, v1}, Lr/a$c;-><init>(Lr/a;Ldh/e;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v3, p1

    invoke-static/range {v0 .. v5}, Lr/Z;->e(Lr/Z;Lr/X;Lmh/l;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
