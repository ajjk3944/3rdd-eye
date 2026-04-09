.class public final Lo0/k;
.super Lo0/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo0/k$a;
    }
.end annotation


# static fields
.field public static final f:Lo0/k$a;

.field private static final g:I

.field private static final h:I


# instance fields
.field private final a:F

.field private final b:F

.field private final c:I

.field private final d:I

.field private final e:Lm0/V0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo0/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo0/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lo0/k;->f:Lo0/k$a;

    sget-object v0, Lm0/k1;->a:Lm0/k1$a;

    invoke-virtual {v0}, Lm0/k1$a;->a()I

    move-result v0

    sput v0, Lo0/k;->g:I

    sget-object v0, Lm0/l1;->a:Lm0/l1$a;

    invoke-virtual {v0}, Lm0/l1$a;->b()I

    move-result v0

    sput v0, Lo0/k;->h:I

    return-void
.end method

.method private constructor <init>(FFIILm0/V0;)V
    .locals 1

    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, v0}, Lo0/g;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    iput p1, p0, Lo0/k;->a:F

    .line 7
    iput p2, p0, Lo0/k;->b:F

    .line 8
    iput p3, p0, Lo0/k;->c:I

    .line 9
    iput p4, p0, Lo0/k;->d:I

    .line 10
    iput-object p5, p0, Lo0/k;->e:Lm0/V0;

    return-void
.end method

.method public synthetic constructor <init>(FFIILm0/V0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    const/4 p1, 0x0

    :cond_0
    move v1, p1

    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    const/high16 p2, 0x40800000    # 4.0f

    :cond_1
    move v2, p2

    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    .line 2
    sget p3, Lo0/k;->g:I

    :cond_2
    move v3, p3

    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    .line 3
    sget p4, Lo0/k;->h:I

    :cond_3
    move v4, p4

    and-int/lit8 p1, p6, 0x10

    if-eqz p1, :cond_4

    const/4 p5, 0x0

    :cond_4
    move-object v5, p5

    const/4 v6, 0x0

    move-object v0, p0

    .line 4
    invoke-direct/range {v0 .. v6}, Lo0/k;-><init>(FFIILm0/V0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(FFIILm0/V0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lo0/k;-><init>(FFIILm0/V0;)V

    return-void
.end method

.method public static final synthetic a()I
    .locals 1

    sget v0, Lo0/k;->g:I

    return v0
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, Lo0/k;->c:I

    return v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lo0/k;->d:I

    return v0
.end method

.method public final d()F
    .locals 1

    iget v0, p0, Lo0/k;->b:F

    return v0
.end method

.method public final e()Lm0/V0;
    .locals 1

    iget-object v0, p0, Lo0/k;->e:Lm0/V0;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lo0/k;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget v1, p0, Lo0/k;->a:F

    check-cast p1, Lo0/k;

    iget v3, p1, Lo0/k;->a:F

    cmpg-float v1, v1, v3

    if-nez v1, :cond_5

    iget v1, p0, Lo0/k;->b:F

    iget v3, p1, Lo0/k;->b:F

    cmpg-float v1, v1, v3

    if-nez v1, :cond_5

    iget v1, p0, Lo0/k;->c:I

    iget v3, p1, Lo0/k;->c:I

    invoke-static {v1, v3}, Lm0/k1;->e(II)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lo0/k;->d:I

    iget v3, p1, Lo0/k;->d:I

    invoke-static {v1, v3}, Lm0/l1;->e(II)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lo0/k;->e:Lm0/V0;

    iget-object p1, p1, Lo0/k;->e:Lm0/V0;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0

    :cond_5
    return v2
.end method

.method public final f()F
    .locals 1

    iget v0, p0, Lo0/k;->a:F

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lo0/k;->a:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lo0/k;->b:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lo0/k;->c:I

    invoke-static {v1}, Lm0/k1;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lo0/k;->d:I

    invoke-static {v1}, Lm0/l1;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lo0/k;->e:Lm0/V0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Stroke(width="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lo0/k;->a:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", miter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lo0/k;->b:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", cap="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lo0/k;->c:I

    invoke-static {v1}, Lm0/k1;->g(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", join="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lo0/k;->d:I

    invoke-static {v1}, Lm0/l1;->g(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pathEffect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lo0/k;->e:Lm0/V0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
