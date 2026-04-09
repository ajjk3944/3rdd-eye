.class public final LN/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/window/q;


# instance fields
.field private final a:J

.field private final b:LY0/d;

.field private final c:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(JLY0/d;Lmh/p;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, LN/J;->a:J

    .line 4
    iput-object p3, p0, LN/J;->b:LY0/d;

    .line 5
    iput-object p4, p0, LN/J;->c:Lmh/p;

    return-void
.end method

.method public synthetic constructor <init>(JLY0/d;Lmh/p;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, LN/J;-><init>(JLY0/d;Lmh/p;)V

    return-void
.end method


# virtual methods
.method public a(LY0/p;JLY0/t;J)J
    .locals 8

    iget-object v0, p0, LN/J;->b:LY0/d;

    invoke-static {}, LN/j0;->j()F

    move-result v1

    invoke-interface {v0, v1}, LY0/d;->x1(F)I

    move-result v0

    iget-object v1, p0, LN/J;->b:LY0/d;

    iget-wide v2, p0, LN/J;->a:J

    invoke-static {v2, v3}, LY0/j;->e(J)F

    move-result v2

    invoke-interface {v1, v2}, LY0/d;->x1(F)I

    move-result v1

    sget-object v2, LY0/t;->Ltr:LY0/t;

    if-ne p4, v2, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, -0x1

    :goto_0
    mul-int/2addr v1, v3

    iget-object v3, p0, LN/J;->b:LY0/d;

    iget-wide v4, p0, LN/J;->a:J

    invoke-static {v4, v5}, LY0/j;->f(J)F

    move-result v4

    invoke-interface {v3, v4}, LY0/d;->x1(F)I

    move-result v3

    invoke-virtual {p1}, LY0/p;->f()I

    move-result v4

    add-int/2addr v4, v1

    invoke-virtual {p1}, LY0/p;->g()I

    move-result v5

    invoke-static {p5, p6}, LY0/r;->g(J)I

    move-result v6

    sub-int/2addr v5, v6

    add-int/2addr v5, v1

    invoke-static {p2, p3}, LY0/r;->g(J)I

    move-result v1

    invoke-static {p5, p6}, LY0/r;->g(J)I

    move-result v6

    sub-int/2addr v1, v6

    const/4 v6, 0x0

    if-ne p4, v2, :cond_2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1}, LY0/p;->f()I

    move-result v4

    if-ltz v4, :cond_1

    goto :goto_1

    :cond_1
    move v1, v6

    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {p4, v2, v1}, [Ljava/lang/Integer;

    move-result-object p4

    invoke-static {p4}, Lzi/m;->s([Ljava/lang/Object;)Lzi/j;

    move-result-object p4

    goto :goto_2

    :cond_2
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1}, LY0/p;->g()I

    move-result v4

    invoke-static {p2, p3}, LY0/r;->g(J)I

    move-result v7

    if-gt v4, v7, :cond_3

    move v1, v6

    :cond_3
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {p4, v2, v1}, [Ljava/lang/Integer;

    move-result-object p4

    invoke-static {p4}, Lzi/m;->s([Ljava/lang/Object;)Lzi/j;

    move-result-object p4

    :goto_2
    invoke-interface {p4}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :cond_4
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    if-ltz v4, :cond_4

    invoke-static {p5, p6}, LY0/r;->g(J)I

    move-result v6

    add-int/2addr v4, v6

    invoke-static {p2, p3}, LY0/r;->g(J)I

    move-result v6

    if-gt v4, v6, :cond_4

    goto :goto_3

    :cond_5
    move-object v1, v2

    :goto_3
    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    :cond_6
    invoke-virtual {p1}, LY0/p;->d()I

    move-result p4

    add-int/2addr p4, v3

    invoke-static {p4, v0}, Ljava/lang/Math;->max(II)I

    move-result p4

    invoke-virtual {p1}, LY0/p;->h()I

    move-result v1

    invoke-static {p5, p6}, LY0/r;->f(J)I

    move-result v4

    sub-int/2addr v1, v4

    add-int/2addr v1, v3

    invoke-virtual {p1}, LY0/p;->h()I

    move-result v4

    invoke-static {p5, p6}, LY0/r;->f(J)I

    move-result v6

    div-int/lit8 v6, v6, 0x2

    sub-int/2addr v4, v6

    add-int/2addr v4, v3

    invoke-static {p2, p3}, LY0/r;->f(J)I

    move-result v3

    invoke-static {p5, p6}, LY0/r;->f(J)I

    move-result v6

    sub-int/2addr v3, v6

    sub-int/2addr v3, v0

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {p4, v6, v4, v3}, [Ljava/lang/Integer;

    move-result-object p4

    invoke-static {p4}, Lzi/m;->s([Ljava/lang/Object;)Lzi/j;

    move-result-object p4

    invoke-interface {p4}, Lzi/j;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :cond_7
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    if-lt v4, v0, :cond_7

    invoke-static {p5, p6}, LY0/r;->f(J)I

    move-result v6

    add-int/2addr v4, v6

    invoke-static {p2, p3}, LY0/r;->f(J)I

    move-result v6

    sub-int/2addr v6, v0

    if-gt v4, v6, :cond_7

    move-object v2, v3

    :cond_8
    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :cond_9
    iget-object p2, p0, LN/J;->c:Lmh/p;

    new-instance p3, LY0/p;

    invoke-static {p5, p6}, LY0/r;->g(J)I

    move-result p4

    add-int/2addr p4, v5

    invoke-static {p5, p6}, LY0/r;->f(J)I

    move-result p5

    add-int/2addr p5, v1

    invoke-direct {p3, v5, v1, p4, p5}, LY0/p;-><init>(IIII)V

    invoke-interface {p2, p1, p3}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v5, v1}, LY0/o;->a(II)J

    move-result-wide p1

    return-wide p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LN/J;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LN/J;

    iget-wide v3, p0, LN/J;->a:J

    iget-wide v5, p1, LN/J;->a:J

    invoke-static {v3, v4, v5, v6}, LY0/j;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LN/J;->b:LY0/d;

    iget-object v3, p1, LN/J;->b:LY0/d;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LN/J;->c:Lmh/p;

    iget-object p1, p1, LN/J;->c:Lmh/p;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-wide v0, p0, LN/J;->a:J

    invoke-static {v0, v1}, LY0/j;->g(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LN/J;->b:LY0/d;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LN/J;->c:Lmh/p;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DropdownMenuPositionProvider(contentOffset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LN/J;->a:J

    invoke-static {v1, v2}, LY0/j;->h(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", density="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LN/J;->b:LY0/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", onPositionCalculated="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LN/J;->c:Lmh/p;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
