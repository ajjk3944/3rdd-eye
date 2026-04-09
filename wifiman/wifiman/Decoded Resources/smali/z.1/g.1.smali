.class final Lz/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/f;
.implements Lz/d;


# instance fields
.field private final a:LY0/d;

.field private final b:J

.field private final synthetic c:Landroidx/compose/foundation/layout/f;


# direct methods
.method private constructor <init>(LY0/d;J)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lz/g;->a:LY0/d;

    .line 4
    iput-wide p2, p0, Lz/g;->b:J

    .line 5
    sget-object p1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    iput-object p1, p0, Lz/g;->c:Landroidx/compose/foundation/layout/f;

    return-void
.end method

.method public synthetic constructor <init>(LY0/d;JLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lz/g;-><init>(LY0/d;J)V

    return-void
.end method


# virtual methods
.method public a(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;
    .locals 1

    iget-object v0, p0, Lz/g;->c:Landroidx/compose/foundation/layout/f;

    invoke-virtual {v0, p1}, Landroidx/compose/foundation/layout/f;->a(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p1

    return-object p1
.end method

.method public b()F
    .locals 3

    iget-object v0, p0, Lz/g;->a:LY0/d;

    invoke-virtual {p0}, Lz/g;->d()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/b;->h(J)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lz/g;->d()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/b;->l(J)I

    move-result v1

    invoke-interface {v0, v1}, LY0/d;->x(I)F

    move-result v0

    goto :goto_0

    :cond_0
    sget-object v0, LY0/h;->b:LY0/h$a;

    invoke-virtual {v0}, LY0/h$a;->b()F

    move-result v0

    :goto_0
    return v0
.end method

.method public c()F
    .locals 3

    iget-object v0, p0, Lz/g;->a:LY0/d;

    invoke-virtual {p0}, Lz/g;->d()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/b;->n(J)I

    move-result v1

    invoke-interface {v0, v1}, LY0/d;->x(I)F

    move-result v0

    return v0
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lz/g;->b:J

    return-wide v0
.end method

.method public e()F
    .locals 3

    iget-object v0, p0, Lz/g;->a:LY0/d;

    invoke-virtual {p0}, Lz/g;->d()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/b;->g(J)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lz/g;->d()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/b;->k(J)I

    move-result v1

    invoke-interface {v0, v1}, LY0/d;->x(I)F

    move-result v0

    goto :goto_0

    :cond_0
    sget-object v0, LY0/h;->b:LY0/h$a;

    invoke-virtual {v0}, LY0/h$a;->b()F

    move-result v0

    :goto_0
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lz/g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lz/g;

    iget-object v1, p0, Lz/g;->a:LY0/d;

    iget-object v3, p1, Lz/g;->a:LY0/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lz/g;->b:J

    iget-wide v5, p1, Lz/g;->b:J

    invoke-static {v3, v4, v5, v6}, LY0/b;->f(JJ)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public f(Landroidx/compose/ui/e;Lf0/c;)Landroidx/compose/ui/e;
    .locals 1

    iget-object v0, p0, Lz/g;->c:Landroidx/compose/foundation/layout/f;

    invoke-virtual {v0, p1, p2}, Landroidx/compose/foundation/layout/f;->f(Landroidx/compose/ui/e;Lf0/c;)Landroidx/compose/ui/e;

    move-result-object p1

    return-object p1
.end method

.method public g()F
    .locals 3

    iget-object v0, p0, Lz/g;->a:LY0/d;

    invoke-virtual {p0}, Lz/g;->d()J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/b;->m(J)I

    move-result v1

    invoke-interface {v0, v1}, LY0/d;->x(I)F

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lz/g;->a:LY0/d;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lz/g;->b:J

    invoke-static {v1, v2}, LY0/b;->o(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BoxWithConstraintsScopeImpl(density="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz/g;->a:LY0/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", constraints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lz/g;->b:J

    invoke-static {v1, v2}, LY0/b;->q(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
