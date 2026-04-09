.class public final Lr/T$a;
.super Lr/S;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/T;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;Lr/E;I)V
    .locals 1

    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, p2, v0}, Lr/S;-><init>(Ljava/lang/Object;Lr/E;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    iput p3, p0, Lr/T$a;->c:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lr/E;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 2
    invoke-static {}, Lr/G;->d()Lr/E;

    move-result-object p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 3
    sget-object p3, Lr/t;->a:Lr/t$a;

    invoke-virtual {p3}, Lr/t$a;->a()I

    move-result p3

    :cond_1
    const/4 p4, 0x0

    .line 4
    invoke-direct {p0, p1, p2, p3, p4}, Lr/T$a;-><init>(Ljava/lang/Object;Lr/E;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lr/E;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lr/T$a;-><init>(Ljava/lang/Object;Lr/E;I)V

    return-void
.end method


# virtual methods
.method public final d()I
    .locals 1

    iget v0, p0, Lr/T$a;->c:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lr/T$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lr/T$a;

    invoke-virtual {p1}, Lr/S;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, Lr/S;->b()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lr/S;->a()Lr/E;

    move-result-object v1

    invoke-virtual {p0}, Lr/S;->a()Lr/E;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget p1, p1, Lr/T$a;->c:I

    iget v1, p0, Lr/T$a;->c:I

    invoke-static {p1, v1}, Lr/t;->c(II)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lr/S;->b()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lr/T$a;->c:I

    invoke-static {v1}, Lr/t;->d(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lr/S;->a()Lr/E;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
