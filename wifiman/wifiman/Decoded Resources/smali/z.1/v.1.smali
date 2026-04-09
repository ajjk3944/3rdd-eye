.class public final Lz/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz/v$a;
    }
.end annotation


# instance fields
.field private final a:Lz/u$a;

.field private final b:I

.field private final c:I

.field private d:I

.field private e:I

.field private f:LC0/B;

.field private g:Landroidx/compose/ui/layout/t;

.field private h:LC0/B;

.field private i:Landroidx/compose/ui/layout/t;

.field private j:Lo/j;

.field private k:Lo/j;

.field private l:Lmh/p;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lz/u$a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/v;->a:Lz/u$a;

    iput p2, p0, Lz/v;->b:I

    iput p3, p0, Lz/v;->c:I

    const/4 p1, -0x1

    iput p1, p0, Lz/v;->d:I

    return-void
.end method

.method public static final synthetic a(Lz/v;Landroidx/compose/ui/layout/t;)V
    .locals 0

    iput-object p1, p0, Lz/v;->i:Landroidx/compose/ui/layout/t;

    return-void
.end method

.method public static final synthetic b(Lz/v;Lo/j;)V
    .locals 0

    iput-object p1, p0, Lz/v;->k:Lo/j;

    return-void
.end method

.method public static final synthetic c(Lz/v;Landroidx/compose/ui/layout/t;)V
    .locals 0

    iput-object p1, p0, Lz/v;->g:Landroidx/compose/ui/layout/t;

    return-void
.end method

.method public static final synthetic d(Lz/v;Lo/j;)V
    .locals 0

    iput-object p1, p0, Lz/v;->j:Lo/j;

    return-void
.end method


# virtual methods
.method public final e(ZII)Lz/r$a;
    .locals 11

    iget-object v0, p0, Lz/v;->a:Lz/u$a;

    sget-object v1, Lz/v$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_a

    const/4 v3, 0x2

    if-eq v0, v3, :cond_a

    const/4 v3, 0x3

    if-eq v0, v3, :cond_1

    const/4 v3, 0x4

    if-ne v0, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    if-eqz p1, :cond_5

    iget-object p1, p0, Lz/v;->l:Lmh/p;

    if-eqz p1, :cond_2

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0}, Lz/v;->h()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC0/B;

    if-nez p1, :cond_3

    :cond_2
    iget-object p1, p0, Lz/v;->f:LC0/B;

    :cond_3
    iget-object p2, p0, Lz/v;->j:Lo/j;

    iget-object p3, p0, Lz/v;->l:Lmh/p;

    if-nez p3, :cond_4

    iget-object p3, p0, Lz/v;->g:Landroidx/compose/ui/layout/t;

    :goto_1
    move-object v4, p1

    move-object v5, p3

    goto :goto_3

    :cond_4
    move-object v4, p1

    move-object v5, v2

    goto :goto_3

    :cond_5
    iget p1, p0, Lz/v;->b:I

    sub-int/2addr p1, v1

    if-lt p2, p1, :cond_7

    iget p1, p0, Lz/v;->c:I

    if-lt p3, p1, :cond_7

    iget-object p1, p0, Lz/v;->l:Lmh/p;

    if-eqz p1, :cond_6

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0}, Lz/v;->h()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p1, p2, p3}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LC0/B;

    if-nez p1, :cond_8

    :cond_6
    iget-object p1, p0, Lz/v;->h:LC0/B;

    goto :goto_2

    :cond_7
    move-object p1, v2

    :cond_8
    :goto_2
    iget-object p2, p0, Lz/v;->k:Lo/j;

    iget-object p3, p0, Lz/v;->l:Lmh/p;

    if-nez p3, :cond_4

    iget-object p3, p0, Lz/v;->i:Landroidx/compose/ui/layout/t;

    goto :goto_1

    :goto_3
    if-nez v4, :cond_9

    return-object v2

    :cond_9
    new-instance v2, Lz/r$a;

    invoke-static {p2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p2}, Lo/j;->i()J

    move-result-wide v6

    const/16 v9, 0x8

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v3, v2

    invoke-direct/range {v3 .. v10}, Lz/r$a;-><init>(LC0/B;Landroidx/compose/ui/layout/t;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_a
    return-object v2
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lz/v;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lz/v;

    iget-object v1, p0, Lz/v;->a:Lz/u$a;

    iget-object v3, p1, Lz/v;->a:Lz/u$a;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lz/v;->b:I

    iget v3, p1, Lz/v;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lz/v;->c:I

    iget p1, p1, Lz/v;->c:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final f(ZII)Lo/j;
    .locals 4

    iget-object v0, p0, Lz/v;->a:Lz/u$a;

    sget-object v1, Lz/v$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_3

    const/4 v3, 0x2

    if-eq v0, v3, :cond_3

    const/4 v3, 0x3

    if-eq v0, v3, :cond_2

    const/4 v3, 0x4

    if-ne v0, v3, :cond_1

    if-eqz p1, :cond_0

    iget-object v2, p0, Lz/v;->j:Lo/j;

    goto :goto_0

    :cond_0
    add-int/2addr p2, v1

    iget p1, p0, Lz/v;->b:I

    if-lt p2, p1, :cond_3

    iget p1, p0, Lz/v;->c:I

    if-lt p3, p1, :cond_3

    iget-object v2, p0, Lz/v;->k:Lo/j;

    goto :goto_0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    if-eqz p1, :cond_3

    iget-object v2, p0, Lz/v;->j:Lo/j;

    :cond_3
    :goto_0
    return-object v2
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Lz/v;->b:I

    return v0
.end method

.method public final h()I
    .locals 2

    iget v0, p0, Lz/v;->d:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Accessing noOfItemsShown before it is set. Are you calling this in the Composition phase, rather than in the draw phase? Consider our samples on how to use it during the draw phase or consider using ContextualFlowRow/ContextualFlowColumn which initializes this method in the composition phase."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lz/v;->a:Lz/u$a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lz/v;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lz/v;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Lz/u$a;
    .locals 1

    iget-object v0, p0, Lz/v;->a:Lz/u$a;

    return-object v0
.end method

.method public final j(I)V
    .locals 0

    iput p1, p0, Lz/v;->e:I

    return-void
.end method

.method public final k(I)V
    .locals 0

    iput p1, p0, Lz/v;->d:I

    return-void
.end method

.method public final l(LC0/n;LC0/n;ZJ)V
    .locals 3

    if-eqz p3, :cond_0

    sget-object v0, Lz/K;->Horizontal:Lz/K;

    goto :goto_0

    :cond_0
    sget-object v0, Lz/K;->Vertical:Lz/K;

    :goto_0
    invoke-static {p4, p5, v0}, Lz/M;->c(JLz/K;)J

    move-result-wide p4

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    invoke-static {p4, p5}, LY0/b;->k(J)I

    move-result v1

    invoke-static {p1, p3, v1}, Lz/t;->i(LC0/n;ZI)I

    move-result v1

    invoke-static {p1, p3, v1}, Lz/t;->f(LC0/n;ZI)I

    move-result v2

    invoke-static {v1, v2}, Lo/j;->b(II)J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/j;->a(J)Lo/j;

    move-result-object v1

    iput-object v1, p0, Lz/v;->j:Lo/j;

    instance-of v1, p1, LC0/B;

    if-eqz v1, :cond_1

    check-cast p1, LC0/B;

    goto :goto_1

    :cond_1
    move-object p1, v0

    :goto_1
    iput-object p1, p0, Lz/v;->f:LC0/B;

    iput-object v0, p0, Lz/v;->g:Landroidx/compose/ui/layout/t;

    :cond_2
    if-eqz p2, :cond_4

    invoke-static {p4, p5}, LY0/b;->k(J)I

    move-result p1

    invoke-static {p2, p3, p1}, Lz/t;->i(LC0/n;ZI)I

    move-result p1

    invoke-static {p2, p3, p1}, Lz/t;->f(LC0/n;ZI)I

    move-result p3

    invoke-static {p1, p3}, Lo/j;->b(II)J

    move-result-wide p3

    invoke-static {p3, p4}, Lo/j;->a(J)Lo/j;

    move-result-object p1

    iput-object p1, p0, Lz/v;->k:Lo/j;

    instance-of p1, p2, LC0/B;

    if-eqz p1, :cond_3

    check-cast p2, LC0/B;

    goto :goto_2

    :cond_3
    move-object p2, v0

    :goto_2
    iput-object p2, p0, Lz/v;->h:LC0/B;

    iput-object v0, p0, Lz/v;->i:Landroidx/compose/ui/layout/t;

    :cond_4
    return-void
.end method

.method public final m(Lz/x;LC0/B;LC0/B;J)V
    .locals 9

    invoke-interface {p1}, Lz/x;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lz/K;->Horizontal:Lz/K;

    goto :goto_0

    :cond_0
    sget-object v0, Lz/K;->Vertical:Lz/K;

    :goto_0
    invoke-static {p4, p5, v0}, Lz/M;->c(JLz/K;)J

    move-result-wide v1

    const/16 v7, 0xa

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lz/M;->e(JIIIIILjava/lang/Object;)J

    move-result-wide p4

    invoke-static {p4, p5, v0}, Lz/M;->f(JLz/K;)J

    move-result-wide p4

    if-eqz p2, :cond_1

    new-instance v0, Lz/v$b;

    invoke-direct {v0, p0, p1}, Lz/v$b;-><init>(Lz/v;Lz/x;)V

    invoke-static {p2, p1, p4, p5, v0}, Lz/t;->k(LC0/B;Lz/x;JLmh/l;)J

    iput-object p2, p0, Lz/v;->f:LC0/B;

    :cond_1
    if-eqz p3, :cond_2

    new-instance p2, Lz/v$c;

    invoke-direct {p2, p0, p1}, Lz/v$c;-><init>(Lz/v;Lz/x;)V

    invoke-static {p3, p1, p4, p5, p2}, Lz/t;->k(LC0/B;Lz/x;JLmh/l;)J

    iput-object p3, p0, Lz/v;->h:LC0/B;

    :cond_2
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FlowLayoutOverflowState(type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz/v;->a:Lz/u$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", minLinesToShowCollapse="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lz/v;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", minCrossAxisSizeToShowCollapse="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lz/v;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
