.class public final LR0/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR0/i;


# instance fields
.field private final a:I

.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LR0/N;->a:I

    iput p2, p0, LR0/N;->b:I

    return-void
.end method


# virtual methods
.method public a(LR0/l;)V
    .locals 4

    invoke-virtual {p1}, LR0/l;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LR0/l;->a()V

    :cond_0
    iget v0, p0, LR0/N;->a:I

    invoke-virtual {p1}, LR0/l;->h()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lsh/m;->k(III)I

    move-result v0

    iget v1, p0, LR0/N;->b:I

    invoke-virtual {p1}, LR0/l;->h()I

    move-result v3

    invoke-static {v1, v2, v3}, Lsh/m;->k(III)I

    move-result v1

    if-eq v0, v1, :cond_2

    if-ge v0, v1, :cond_1

    invoke-virtual {p1, v0, v1}, LR0/l;->n(II)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1, v1, v0}, LR0/l;->n(II)V

    :cond_2
    :goto_0
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LR0/N;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget v1, p0, LR0/N;->a:I

    check-cast p1, LR0/N;

    iget v3, p1, LR0/N;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, LR0/N;->b:I

    iget p1, p1, LR0/N;->b:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, LR0/N;->a:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LR0/N;->b:I

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SetComposingRegionCommand(start="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LR0/N;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", end="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LR0/N;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
