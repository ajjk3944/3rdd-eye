.class public final LM/F;
.super LM/b;
.source "SourceFile"


# instance fields
.field private final j:LR0/Q;

.field private final k:LF/j0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LR0/Q;LR0/H;LF/j0;LM/J;)V
    .locals 8

    invoke-virtual {p1}, LR0/Q;->f()LL0/d;

    move-result-object v1

    invoke-virtual {p1}, LR0/Q;->h()J

    move-result-wide v2

    if-eqz p3, :cond_0

    invoke-virtual {p3}, LF/j0;->f()LL0/M;

    move-result-object v0

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    const/4 v7, 0x0

    move-object v0, p0

    move-object v5, p2

    move-object v6, p4

    invoke-direct/range {v0 .. v7}, LM/b;-><init>(LL0/d;JLL0/M;LR0/H;LM/J;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LM/F;->j:LR0/Q;

    iput-object p3, p0, LM/F;->k:LF/j0;

    return-void
.end method

.method private final a0(LF/j0;I)I
    .locals 5

    invoke-virtual {p1}, LF/j0;->c()LC0/r;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LF/j0;->b()LC0/r;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v1, v0, v3, v4, v2}, LC0/r;->c0(LC0/r;LC0/r;ZILjava/lang/Object;)Ll0/i;

    move-result-object v2

    :cond_0
    if-nez v2, :cond_2

    :cond_1
    sget-object v0, Ll0/i;->e:Ll0/i$a;

    invoke-virtual {v0}, Ll0/i$a;->a()Ll0/i;

    move-result-object v2

    :cond_2
    invoke-virtual {p0}, LM/b;->p()LR0/H;

    move-result-object v0

    iget-object v1, p0, LM/F;->j:LR0/Q;

    invoke-virtual {v1}, LR0/Q;->h()J

    move-result-wide v3

    invoke-static {v3, v4}, LL0/S;->i(J)I

    move-result v1

    invoke-interface {v0, v1}, LR0/H;->b(I)I

    move-result v0

    invoke-virtual {p1}, LF/j0;->f()LL0/M;

    move-result-object v1

    invoke-virtual {v1, v0}, LL0/M;->e(I)Ll0/i;

    move-result-object v0

    invoke-virtual {v0}, Ll0/i;->k()F

    move-result v1

    invoke-virtual {v0}, Ll0/i;->n()F

    move-result v0

    invoke-virtual {v2}, Ll0/i;->m()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/m;->g(J)F

    move-result v2

    int-to-float p2, p2

    mul-float/2addr v2, p2

    add-float/2addr v0, v2

    invoke-virtual {p0}, LM/b;->p()LR0/H;

    move-result-object p2

    invoke-virtual {p1}, LF/j0;->f()LL0/M;

    move-result-object p1

    invoke-static {v1, v0}, Ll0/h;->a(FF)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, LL0/M;->x(J)I

    move-result p1

    invoke-interface {p2, p1}, LR0/H;->a(I)I

    move-result p1

    return p1
.end method


# virtual methods
.method public final Y(Lmh/l;)Ljava/util/List;
    .locals 5

    const/4 v0, 0x0

    invoke-virtual {p0}, LM/b;->u()J

    move-result-wide v1

    invoke-static {v1, v2}, LL0/S;->h(J)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1, p0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LR0/i;

    if-eqz p1, :cond_0

    invoke-static {p1}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    new-instance p1, LR0/a;

    const-string v1, ""

    invoke-direct {p1, v1, v0}, LR0/a;-><init>(Ljava/lang/String;I)V

    new-instance v1, LR0/P;

    invoke-virtual {p0}, LM/b;->u()J

    move-result-wide v2

    invoke-static {v2, v3}, LL0/S;->l(J)I

    move-result v2

    invoke-virtual {p0}, LM/b;->u()J

    move-result-wide v3

    invoke-static {v3, v4}, LL0/S;->l(J)I

    move-result v3

    invoke-direct {v1, v2, v3}, LR0/P;-><init>(II)V

    const/4 v2, 0x2

    new-array v2, v2, [LR0/i;

    aput-object p1, v2, v0

    const/4 p1, 0x1

    aput-object v1, v2, p1

    invoke-static {v2}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final Z()LR0/Q;
    .locals 7

    iget-object v0, p0, LM/F;->j:LR0/Q;

    invoke-virtual {p0}, LM/b;->e()LL0/d;

    move-result-object v1

    invoke-virtual {p0}, LM/b;->u()J

    move-result-wide v2

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, LR0/Q;->d(LR0/Q;LL0/d;JLL0/S;ILjava/lang/Object;)LR0/Q;

    move-result-object v0

    return-object v0
.end method

.method public final b0()LM/F;
    .locals 2

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, LM/F;->k:LF/j0;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, LM/F;->a0(LF/j0;I)I

    move-result v0

    invoke-virtual {p0, v0}, LM/b;->T(I)V

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final c0()LM/F;
    .locals 2

    invoke-virtual {p0}, LM/b;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, LM/F;->k:LF/j0;

    if-eqz v0, :cond_0

    const/4 v1, -0x1

    invoke-direct {p0, v0, v1}, LM/F;->a0(LF/j0;I)I

    move-result v0

    invoke-virtual {p0, v0}, LM/b;->T(I)V

    :cond_0
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
