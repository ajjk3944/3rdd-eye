.class public final Lr/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/D;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Lr/E;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IILr/E;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lr/r0;->a:I

    .line 3
    iput p2, p0, Lr/r0;->b:I

    .line 4
    iput-object p3, p0, Lr/r0;->c:Lr/E;

    return-void
.end method

.method public synthetic constructor <init>(IILr/E;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/16 p1, 0x12c

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 5
    invoke-static {}, Lr/G;->c()Lr/E;

    move-result-object p3

    .line 6
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lr/r0;-><init>(IILr/E;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lr/s0;)Lr/v0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lr/r0;->f(Lr/s0;)Lr/H0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Lr/s0;)Lr/y0;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lr/r0;->f(Lr/s0;)Lr/H0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Lr/s0;)Lr/z0;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lr/r0;->f(Lr/s0;)Lr/H0;

    move-result-object p1

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lr/r0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lr/r0;

    iget v0, p1, Lr/r0;->a:I

    iget v2, p0, Lr/r0;->a:I

    if-ne v0, v2, :cond_0

    iget v0, p1, Lr/r0;->b:I

    iget v2, p0, Lr/r0;->b:I

    if-ne v0, v2, :cond_0

    iget-object p1, p1, Lr/r0;->c:Lr/E;

    iget-object v0, p0, Lr/r0;->c:Lr/E;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public f(Lr/s0;)Lr/H0;
    .locals 3

    new-instance p1, Lr/H0;

    iget v0, p0, Lr/r0;->a:I

    iget v1, p0, Lr/r0;->b:I

    iget-object v2, p0, Lr/r0;->c:Lr/E;

    invoke-direct {p1, v0, v1, v2}, Lr/H0;-><init>(IILr/E;)V

    return-object p1
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lr/r0;->a:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lr/r0;->c:Lr/E;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lr/r0;->b:I

    add-int/2addr v0, v1

    return v0
.end method
