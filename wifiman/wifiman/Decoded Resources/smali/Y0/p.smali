.class public final LY0/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY0/p$a;
    }
.end annotation


# static fields
.field public static final e:LY0/p$a;

.field private static final f:LY0/p;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LY0/p$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LY0/p$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LY0/p;->e:LY0/p$a;

    new-instance v0, LY0/p;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1, v1}, LY0/p;-><init>(IIII)V

    sput-object v0, LY0/p;->f:LY0/p;

    return-void
.end method

.method public constructor <init>(IIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LY0/p;->a:I

    iput p2, p0, LY0/p;->b:I

    iput p3, p0, LY0/p;->c:I

    iput p4, p0, LY0/p;->d:I

    return-void
.end method

.method public static final synthetic a()LY0/p;
    .locals 1

    sget-object v0, LY0/p;->f:LY0/p;

    return-object v0
.end method

.method public static synthetic c(LY0/p;IIIIILjava/lang/Object;)LY0/p;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, LY0/p;->a:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, LY0/p;->b:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, LY0/p;->c:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, LY0/p;->d:I

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, LY0/p;->b(IIII)LY0/p;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(IIII)LY0/p;
    .locals 1

    new-instance v0, LY0/p;

    invoke-direct {v0, p1, p2, p3, p4}, LY0/p;-><init>(IIII)V

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, LY0/p;->d:I

    return v0
.end method

.method public final e()I
    .locals 2

    iget v0, p0, LY0/p;->d:I

    iget v1, p0, LY0/p;->b:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LY0/p;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LY0/p;

    iget v1, p0, LY0/p;->a:I

    iget v3, p1, LY0/p;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, LY0/p;->b:I

    iget v3, p1, LY0/p;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, LY0/p;->c:I

    iget v3, p1, LY0/p;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, LY0/p;->d:I

    iget p1, p1, LY0/p;->d:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, LY0/p;->a:I

    return v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, LY0/p;->c:I

    return v0
.end method

.method public final h()I
    .locals 1

    iget v0, p0, LY0/p;->b:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, LY0/p;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LY0/p;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LY0/p;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LY0/p;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final i()J
    .locals 2

    iget v0, p0, LY0/p;->a:I

    iget v1, p0, LY0/p;->b:I

    invoke-static {v0, v1}, LY0/o;->a(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public final j()I
    .locals 2

    iget v0, p0, LY0/p;->c:I

    iget v1, p0, LY0/p;->a:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final k()Z
    .locals 2

    iget v0, p0, LY0/p;->a:I

    iget v1, p0, LY0/p;->c:I

    if-ge v0, v1, :cond_1

    iget v0, p0, LY0/p;->b:I

    iget v1, p0, LY0/p;->d:I

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final l(II)LY0/p;
    .locals 4

    new-instance v0, LY0/p;

    iget v1, p0, LY0/p;->a:I

    add-int/2addr v1, p1

    iget v2, p0, LY0/p;->b:I

    add-int/2addr v2, p2

    iget v3, p0, LY0/p;->c:I

    add-int/2addr v3, p1

    iget p1, p0, LY0/p;->d:I

    add-int/2addr p1, p2

    invoke-direct {v0, v1, v2, v3, p1}, LY0/p;-><init>(IIII)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IntRect.fromLTRB("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LY0/p;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, LY0/p;->b:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, LY0/p;->c:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LY0/p;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
