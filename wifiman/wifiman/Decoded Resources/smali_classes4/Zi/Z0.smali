.class public abstract LZi/Z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYi/e;
.implements LYi/c;


# instance fields
.field private final b:Ljava/util/ArrayList;

.field private c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LZi/Z0;->b:Ljava/util/ArrayList;

    return-void
.end method

.method public static synthetic J(LZi/Z0;LVi/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LZi/Z0;->L(LZi/Z0;LVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K(LZi/Z0;LVi/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, LZi/Z0;->M(LZi/Z0;LVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final L(LZi/Z0;LVi/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-interface {p1}, LVi/a;->a()LXi/f;

    move-result-object v0

    invoke-interface {v0}, LXi/f;->c()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p0}, LYi/e;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LYi/e;->r()Ljava/lang/Void;

    move-result-object p0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2}, LZi/Z0;->N(LVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_1
    return-object p0
.end method

.method private static final M(LZi/Z0;LVi/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LZi/Z0;->N(LVi/a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final e0(Ljava/lang/Object;Lmh/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LZi/Z0;->d0(Ljava/lang/Object;)V

    invoke-interface {p2}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    iget-boolean p2, p0, LZi/Z0;->c:Z

    if-nez p2, :cond_0

    invoke-virtual {p0}, LZi/Z0;->c0()Ljava/lang/Object;

    :cond_0
    const/4 p2, 0x0

    iput-boolean p2, p0, LZi/Z0;->c:Z

    return-object p1
.end method


# virtual methods
.method public final A(LXi/f;I)F
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LZi/Z0;->a0(LXi/f;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LZi/Z0;->T(Ljava/lang/Object;)F

    move-result p1

    return p1
.end method

.method public final C(LXi/f;I)S
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LZi/Z0;->a0(LXi/f;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LZi/Z0;->X(Ljava/lang/Object;)S

    move-result p1

    return p1
.end method

.method public final D()B
    .locals 1

    invoke-virtual {p0}, LZi/Z0;->c0()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, LZi/Z0;->P(Ljava/lang/Object;)B

    move-result v0

    return v0
.end method

.method public final E(LXi/f;I)LYi/e;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LZi/Z0;->a0(LXi/f;I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, p2}, LXi/f;->i(I)LXi/f;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, LZi/Z0;->U(Ljava/lang/Object;LXi/f;)LYi/e;

    move-result-object p1

    return-object p1
.end method

.method public final F()S
    .locals 1

    invoke-virtual {p0}, LZi/Z0;->c0()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, LZi/Z0;->X(Ljava/lang/Object;)S

    move-result v0

    return v0
.end method

.method public final G()F
    .locals 1

    invoke-virtual {p0}, LZi/Z0;->c0()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, LZi/Z0;->T(Ljava/lang/Object;)F

    move-result v0

    return v0
.end method

.method public final H(LXi/f;I)B
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LZi/Z0;->a0(LXi/f;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LZi/Z0;->P(Ljava/lang/Object;)B

    move-result p1

    return p1
.end method

.method public final I()D
    .locals 2

    invoke-virtual {p0}, LZi/Z0;->c0()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, LZi/Z0;->R(Ljava/lang/Object;)D

    move-result-wide v0

    return-wide v0
.end method

.method protected N(LVi/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    const-string p2, "deserializer"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, LYi/e;->t(LVi/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected abstract O(Ljava/lang/Object;)Z
.end method

.method protected abstract P(Ljava/lang/Object;)B
.end method

.method protected abstract Q(Ljava/lang/Object;)C
.end method

.method protected abstract R(Ljava/lang/Object;)D
.end method

.method protected abstract S(Ljava/lang/Object;LXi/f;)I
.end method

.method protected abstract T(Ljava/lang/Object;)F
.end method

.method protected U(Ljava/lang/Object;LXi/f;)LYi/e;
    .locals 1

    const-string v0, "inlineDescriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LZi/Z0;->d0(Ljava/lang/Object;)V

    return-object p0
.end method

.method protected abstract V(Ljava/lang/Object;)I
.end method

.method protected abstract W(Ljava/lang/Object;)J
.end method

.method protected abstract X(Ljava/lang/Object;)S
.end method

.method protected abstract Y(Ljava/lang/Object;)Ljava/lang/String;
.end method

.method protected final Z()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LZi/Z0;->b:Ljava/util/ArrayList;

    invoke-static {v0}, LZg/v;->D0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected abstract a0(LXi/f;I)Ljava/lang/Object;
.end method

.method public final b0()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, LZi/Z0;->b:Ljava/util/ArrayList;

    return-object v0
.end method

.method protected final c0()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LZi/Z0;->b:Ljava/util/ArrayList;

    invoke-static {v0}, LZg/v;->n(Ljava/util/List;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, p0, LZi/Z0;->c:Z

    return-object v0
.end method

.method protected final d0(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LZi/Z0;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final e(LXi/f;)I
    .locals 1

    const-string v0, "enumDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LZi/Z0;->c0()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, LZi/Z0;->S(Ljava/lang/Object;LXi/f;)I

    move-result p1

    return p1
.end method

.method public final f()Z
    .locals 1

    invoke-virtual {p0}, LZi/Z0;->c0()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, LZi/Z0;->O(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final g()C
    .locals 1

    invoke-virtual {p0}, LZi/Z0;->c0()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, LZi/Z0;->Q(Ljava/lang/Object;)C

    move-result v0

    return v0
.end method

.method public final h(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LZi/Z0;->a0(LXi/f;I)Ljava/lang/Object;

    move-result-object p1

    new-instance p2, LZi/Y0;

    invoke-direct {p2, p0, p3, p4}, LZi/Y0;-><init>(LZi/Z0;LVi/a;Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2}, LZi/Z0;->e0(Ljava/lang/Object;Lmh/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final i(LXi/f;I)I
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LZi/Z0;->a0(LXi/f;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LZi/Z0;->V(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public l(LXi/f;)LYi/e;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LZi/Z0;->c0()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, LZi/Z0;->U(Ljava/lang/Object;LXi/f;)LYi/e;

    move-result-object p1

    return-object p1
.end method

.method public final n()I
    .locals 1

    invoke-virtual {p0}, LZi/Z0;->c0()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, LZi/Z0;->V(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final o(LXi/f;I)D
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LZi/Z0;->a0(LXi/f;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LZi/Z0;->R(Ljava/lang/Object;)D

    move-result-wide p1

    return-wide p1
.end method

.method public final p(LXi/f;ILVi/a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LZi/Z0;->a0(LXi/f;I)Ljava/lang/Object;

    move-result-object p1

    new-instance p2, LZi/X0;

    invoke-direct {p2, p0, p3, p4}, LZi/X0;-><init>(LZi/Z0;LVi/a;Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2}, LZi/Z0;->e0(Ljava/lang/Object;Lmh/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final q(LXi/f;I)J
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LZi/Z0;->a0(LXi/f;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LZi/Z0;->W(Ljava/lang/Object;)J

    move-result-wide p1

    return-wide p1
.end method

.method public final r()Ljava/lang/Void;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final s()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LZi/Z0;->c0()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, LZi/Z0;->Y(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(LXi/f;I)Z
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LZi/Z0;->a0(LXi/f;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LZi/Z0;->O(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final v()J
    .locals 2

    invoke-virtual {p0}, LZi/Z0;->c0()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, LZi/Z0;->W(Ljava/lang/Object;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final w(LXi/f;I)Ljava/lang/String;
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LZi/Z0;->a0(LXi/f;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LZi/Z0;->Y(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final z(LXi/f;I)C
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LZi/Z0;->a0(LXi/f;I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, LZi/Z0;->Q(Ljava/lang/Object;)C

    move-result p1

    return p1
.end method
