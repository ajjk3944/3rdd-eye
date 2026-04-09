.class public final LS8/e$b$a;
.super LS8/e$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS8/e$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final b:LS8/d;

.field private final c:I

.field private final d:I

.field private final e:I


# direct methods
.method public constructor <init>(LS8/d;II)V
    .locals 1

    const-string/jumbo v0, "bandwidth"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LS8/e$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LS8/e$b$a;->b:LS8/d;

    iput p2, p0, LS8/e$b$a;->c:I

    iput p3, p0, LS8/e$b$a;->d:I

    sub-int p1, p2, p3

    div-int/lit8 p1, p1, 0x2

    sub-int/2addr p2, p1

    iput p2, p0, LS8/e$b$a;->e:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, LS8/e$b$a;->e:I

    return v0
.end method

.method public final c()LS8/d;
    .locals 1

    iget-object v0, p0, LS8/e$b$a;->b:LS8/d;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, LS8/e$b$a;->c:I

    return v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, LS8/e$b$a;->d:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LS8/e$b$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LS8/e$b$a;

    iget-object v1, p0, LS8/e$b$a;->b:LS8/d;

    iget-object v3, p1, LS8/e$b$a;->b:LS8/d;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, LS8/e$b$a;->c:I

    iget v3, p1, LS8/e$b$a;->c:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, LS8/e$b$a;->d:I

    iget p1, p1, LS8/e$b$a;->d:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LS8/e$b$a;->b:LS8/d;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LS8/e$b$a;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LS8/e$b$a;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, LS8/e$b$a;->b:LS8/d;

    iget v1, p0, LS8/e$b$a;->c:I

    iget v2, p0, LS8/e$b$a;->d:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Combined(bandwidth="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", controlCenter="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", dataCenter="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
