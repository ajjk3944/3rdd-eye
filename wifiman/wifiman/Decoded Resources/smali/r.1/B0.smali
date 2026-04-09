.class final Lr/B0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/x0;


# instance fields
.field private final a:Lr/J;

.field private b:Lr/q;

.field private c:Lr/q;

.field private d:Lr/q;

.field private final e:F


# direct methods
.method public constructor <init>(Lr/J;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/B0;->a:Lr/J;

    invoke-interface {p1}, Lr/J;->a()F

    move-result p1

    iput p1, p0, Lr/B0;->e:F

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    iget v0, p0, Lr/B0;->e:F

    return v0
.end method

.method public b(JLr/q;Lr/q;)Lr/q;
    .locals 8

    iget-object v0, p0, Lr/B0;->c:Lr/q;

    if-nez v0, :cond_0

    invoke-static {p3}, Lr/r;->g(Lr/q;)Lr/q;

    move-result-object v0

    iput-object v0, p0, Lr/B0;->c:Lr/q;

    :cond_0
    iget-object v0, p0, Lr/B0;->c:Lr/q;

    const/4 v1, 0x0

    const-string v2, "velocityVector"

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    invoke-virtual {v0}, Lr/q;->b()I

    move-result v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_3

    iget-object v4, p0, Lr/B0;->c:Lr/q;

    if-nez v4, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v4, v1

    :cond_2
    iget-object v5, p0, Lr/B0;->a:Lr/J;

    invoke-virtual {p3, v3}, Lr/q;->a(I)F

    move-result v6

    invoke-virtual {p4, v3}, Lr/q;->a(I)F

    move-result v7

    invoke-interface {v5, p1, p2, v6, v7}, Lr/J;->b(JFF)F

    move-result v5

    invoke-virtual {v4, v3, v5}, Lr/q;->e(IF)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lr/B0;->c:Lr/q;

    if-nez p1, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v1, p1

    :goto_1
    return-object v1
.end method

.method public c(Lr/q;Lr/q;)Lr/q;
    .locals 8

    iget-object v0, p0, Lr/B0;->d:Lr/q;

    if-nez v0, :cond_0

    invoke-static {p1}, Lr/r;->g(Lr/q;)Lr/q;

    move-result-object v0

    iput-object v0, p0, Lr/B0;->d:Lr/q;

    :cond_0
    iget-object v0, p0, Lr/B0;->d:Lr/q;

    const/4 v1, 0x0

    const-string v2, "targetVector"

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    invoke-virtual {v0}, Lr/q;->b()I

    move-result v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_3

    iget-object v4, p0, Lr/B0;->d:Lr/q;

    if-nez v4, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v4, v1

    :cond_2
    iget-object v5, p0, Lr/B0;->a:Lr/J;

    invoke-virtual {p1, v3}, Lr/q;->a(I)F

    move-result v6

    invoke-virtual {p2, v3}, Lr/q;->a(I)F

    move-result v7

    invoke-interface {v5, v6, v7}, Lr/J;->d(FF)F

    move-result v5

    invoke-virtual {v4, v3, v5}, Lr/q;->e(IF)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lr/B0;->d:Lr/q;

    if-nez p1, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v1, p1

    :goto_1
    return-object v1
.end method

.method public d(JLr/q;Lr/q;)Lr/q;
    .locals 8

    iget-object v0, p0, Lr/B0;->b:Lr/q;

    if-nez v0, :cond_0

    invoke-static {p3}, Lr/r;->g(Lr/q;)Lr/q;

    move-result-object v0

    iput-object v0, p0, Lr/B0;->b:Lr/q;

    :cond_0
    iget-object v0, p0, Lr/B0;->b:Lr/q;

    const/4 v1, 0x0

    const-string v2, "valueVector"

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    invoke-virtual {v0}, Lr/q;->b()I

    move-result v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_3

    iget-object v4, p0, Lr/B0;->b:Lr/q;

    if-nez v4, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v4, v1

    :cond_2
    iget-object v5, p0, Lr/B0;->a:Lr/J;

    invoke-virtual {p3, v3}, Lr/q;->a(I)F

    move-result v6

    invoke-virtual {p4, v3}, Lr/q;->a(I)F

    move-result v7

    invoke-interface {v5, p1, p2, v6, v7}, Lr/J;->e(JFF)F

    move-result v5

    invoke-virtual {v4, v3, v5}, Lr/q;->e(IF)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lr/B0;->b:Lr/q;

    if-nez p1, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    move-object v1, p1

    :goto_1
    return-object v1
.end method

.method public e(Lr/q;Lr/q;)J
    .locals 7

    iget-object v0, p0, Lr/B0;->c:Lr/q;

    if-nez v0, :cond_0

    invoke-static {p1}, Lr/r;->g(Lr/q;)Lr/q;

    move-result-object v0

    iput-object v0, p0, Lr/B0;->c:Lr/q;

    :cond_0
    iget-object v0, p0, Lr/B0;->c:Lr/q;

    if-nez v0, :cond_1

    const-string v0, "velocityVector"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_1
    invoke-virtual {v0}, Lr/q;->b()I

    move-result v0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    iget-object v4, p0, Lr/B0;->a:Lr/J;

    invoke-virtual {p1, v3}, Lr/q;->a(I)F

    move-result v5

    invoke-virtual {p2, v3}, Lr/q;->a(I)F

    move-result v6

    invoke-interface {v4, v5, v6}, Lr/J;->c(FF)J

    move-result-wide v4

    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-wide v1
.end method
