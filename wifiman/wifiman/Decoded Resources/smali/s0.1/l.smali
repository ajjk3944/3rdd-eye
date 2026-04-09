.class public final Ls0/l;
.super Ls0/k;
.source "SourceFile"


# instance fields
.field private final b:Ls0/c;

.field private c:Ljava/lang/String;

.field private d:Z

.field private final e:Ls0/a;

.field private f:Lmh/a;

.field private final g:LT/q0;

.field private h:Lm0/w0;

.field private final i:LT/q0;

.field private j:J

.field private k:F

.field private l:F

.field private final m:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ls0/c;)V
    .locals 4

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ls0/k;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Ls0/l;->b:Ls0/c;

    new-instance v1, Ls0/l$a;

    invoke-direct {v1, p0}, Ls0/l$a;-><init>(Ls0/l;)V

    invoke-virtual {p1, v1}, Ls0/c;->d(Lmh/l;)V

    const-string p1, ""

    iput-object p1, p0, Ls0/l;->c:Ljava/lang/String;

    const/4 p1, 0x1

    iput-boolean p1, p0, Ls0/l;->d:Z

    new-instance p1, Ls0/a;

    invoke-direct {p1}, Ls0/a;-><init>()V

    iput-object p1, p0, Ls0/l;->e:Ls0/a;

    sget-object p1, Ls0/l$c;->a:Ls0/l$c;

    iput-object p1, p0, Ls0/l;->f:Lmh/a;

    const/4 p1, 0x2

    invoke-static {v0, v0, p1, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v1

    iput-object v1, p0, Ls0/l;->g:LT/q0;

    sget-object v1, Ll0/m;->b:Ll0/m$a;

    invoke-virtual {v1}, Ll0/m$a;->b()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/m;->c(J)Ll0/m;

    move-result-object v2

    invoke-static {v2, v0, p1, v0}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p1

    iput-object p1, p0, Ls0/l;->i:LT/q0;

    invoke-virtual {v1}, Ll0/m$a;->a()J

    move-result-wide v0

    iput-wide v0, p0, Ls0/l;->j:J

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Ls0/l;->k:F

    iput p1, p0, Ls0/l;->l:F

    new-instance p1, Ls0/l$b;

    invoke-direct {p1, p0}, Ls0/l$b;-><init>(Ls0/l;)V

    iput-object p1, p0, Ls0/l;->m:Lmh/l;

    return-void
.end method

.method public static final synthetic e(Ls0/l;)V
    .locals 0

    invoke-direct {p0}, Ls0/l;->h()V

    return-void
.end method

.method public static final synthetic f(Ls0/l;)F
    .locals 0

    iget p0, p0, Ls0/l;->k:F

    return p0
.end method

.method public static final synthetic g(Ls0/l;)F
    .locals 0

    iget p0, p0, Ls0/l;->l:F

    return p0
.end method

.method private final h()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ls0/l;->d:Z

    iget-object v0, p0, Ls0/l;->f:Lmh/a;

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lo0/f;)V
    .locals 2

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Ls0/l;->i(Lo0/f;FLm0/w0;)V

    return-void
.end method

.method public final i(Lo0/f;FLm0/w0;)V
    .locals 9

    iget-object v0, p0, Ls0/l;->b:Ls0/c;

    invoke-virtual {v0}, Ls0/c;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls0/l;->b:Ls0/c;

    invoke-virtual {v0}, Ls0/c;->g()J

    move-result-wide v0

    const-wide/16 v2, 0x10

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ls0/l;->k()Lm0/w0;

    move-result-object v0

    invoke-static {v0}, Ls0/n;->f(Lm0/w0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p3}, Ls0/n;->f(Lm0/w0;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lm0/K0;->b:Lm0/K0$a;

    invoke-virtual {v0}, Lm0/K0$a;->a()I

    move-result v0

    :goto_0
    move v2, v0

    goto :goto_1

    :cond_0
    sget-object v0, Lm0/K0;->b:Lm0/K0$a;

    invoke-virtual {v0}, Lm0/K0$a;->b()I

    move-result v0

    goto :goto_0

    :goto_1
    iget-boolean v0, p0, Ls0/l;->d:Z

    if-nez v0, :cond_1

    iget-wide v0, p0, Ls0/l;->j:J

    invoke-interface {p1}, Lo0/f;->c()J

    move-result-wide v3

    invoke-static {v0, v1, v3, v4}, Ll0/m;->f(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ls0/l;->j()I

    move-result v0

    invoke-static {v2, v0}, Lm0/K0;->i(II)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_1
    sget-object v0, Lm0/K0;->b:Lm0/K0$a;

    invoke-virtual {v0}, Lm0/K0$a;->a()I

    move-result v0

    invoke-static {v2, v0}, Lm0/K0;->i(II)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v3, Lm0/w0;->b:Lm0/w0$a;

    iget-object v0, p0, Ls0/l;->b:Ls0/c;

    invoke-virtual {v0}, Ls0/c;->g()J

    move-result-wide v4

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lm0/w0$a;->b(Lm0/w0$a;JIILjava/lang/Object;)Lm0/w0;

    move-result-object v0

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    iput-object v0, p0, Ls0/l;->h:Lm0/w0;

    invoke-interface {p1}, Lo0/f;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/m;->i(J)F

    move-result v0

    invoke-virtual {p0}, Ls0/l;->m()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll0/m;->i(J)F

    move-result v1

    div-float/2addr v0, v1

    iput v0, p0, Ls0/l;->k:F

    invoke-interface {p1}, Lo0/f;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/m;->g(J)F

    move-result v0

    invoke-virtual {p0}, Ls0/l;->m()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll0/m;->g(J)F

    move-result v1

    div-float/2addr v0, v1

    iput v0, p0, Ls0/l;->l:F

    iget-object v1, p0, Ls0/l;->e:Ls0/a;

    invoke-interface {p1}, Lo0/f;->c()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll0/m;->i(J)F

    move-result v0

    float-to-double v3, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-float v0, v3

    float-to-int v0, v0

    invoke-interface {p1}, Lo0/f;->c()J

    move-result-wide v3

    invoke-static {v3, v4}, Ll0/m;->g(J)F

    move-result v3

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-float v3, v3

    float-to-int v3, v3

    invoke-static {v0, v3}, LY0/s;->a(II)J

    move-result-wide v3

    invoke-interface {p1}, Lo0/f;->getLayoutDirection()LY0/t;

    move-result-object v6

    iget-object v7, p0, Ls0/l;->m:Lmh/l;

    move-object v5, p1

    invoke-virtual/range {v1 .. v7}, Ls0/a;->b(IJLY0/d;LY0/t;Lmh/l;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ls0/l;->d:Z

    invoke-interface {p1}, Lo0/f;->c()J

    move-result-wide v0

    iput-wide v0, p0, Ls0/l;->j:J

    :cond_3
    if-eqz p3, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p0}, Ls0/l;->k()Lm0/w0;

    move-result-object p3

    if-eqz p3, :cond_5

    invoke-virtual {p0}, Ls0/l;->k()Lm0/w0;

    move-result-object p3

    goto :goto_3

    :cond_5
    iget-object p3, p0, Ls0/l;->h:Lm0/w0;

    :goto_3
    iget-object v0, p0, Ls0/l;->e:Ls0/a;

    invoke-virtual {v0, p1, p2, p3}, Ls0/a;->c(Lo0/f;FLm0/w0;)V

    return-void
.end method

.method public final j()I
    .locals 1

    iget-object v0, p0, Ls0/l;->e:Ls0/a;

    invoke-virtual {v0}, Ls0/a;->d()Lm0/J0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lm0/J0;->b()I

    move-result v0

    goto :goto_0

    :cond_0
    sget-object v0, Lm0/K0;->b:Lm0/K0$a;

    invoke-virtual {v0}, Lm0/K0$a;->b()I

    move-result v0

    :goto_0
    return v0
.end method

.method public final k()Lm0/w0;
    .locals 1

    iget-object v0, p0, Ls0/l;->g:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm0/w0;

    return-object v0
.end method

.method public final l()Ls0/c;
    .locals 1

    iget-object v0, p0, Ls0/l;->b:Ls0/c;

    return-object v0
.end method

.method public final m()J
    .locals 2

    iget-object v0, p0, Ls0/l;->i:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll0/m;

    invoke-virtual {v0}, Ll0/m;->m()J

    move-result-wide v0

    return-wide v0
.end method

.method public final n(Lm0/w0;)V
    .locals 1

    iget-object v0, p0, Ls0/l;->g:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final o(Lmh/a;)V
    .locals 0

    iput-object p1, p0, Ls0/l;->f:Lmh/a;

    return-void
.end method

.method public final p(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ls0/l;->c:Ljava/lang/String;

    return-void
.end method

.method public final q(J)V
    .locals 1

    iget-object v0, p0, Ls0/l;->i:LT/q0;

    invoke-static {p1, p2}, Ll0/m;->c(J)Ll0/m;

    move-result-object p1

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Params: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\tname: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ls0/l;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\tviewportWidth: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ls0/l;->m()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/m;->i(J)F

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\tviewportHeight: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ls0/l;->m()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/m;->g(J)F

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
