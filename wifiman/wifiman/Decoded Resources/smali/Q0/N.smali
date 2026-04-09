.class public final LQ0/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ0/j;


# instance fields
.field private final a:I

.field private final b:LQ0/A;

.field private final c:I

.field private final d:LQ0/z;

.field private final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(ILQ0/A;ILQ0/z;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, LQ0/N;->a:I

    .line 4
    iput-object p2, p0, LQ0/N;->b:LQ0/A;

    .line 5
    iput p3, p0, LQ0/N;->c:I

    .line 6
    iput-object p4, p0, LQ0/N;->d:LQ0/z;

    .line 7
    iput p5, p0, LQ0/N;->e:I

    return-void
.end method

.method public synthetic constructor <init>(ILQ0/A;ILQ0/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, LQ0/N;-><init>(ILQ0/A;ILQ0/z;I)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, LQ0/N;->e:I

    return v0
.end method

.method public b()LQ0/A;
    .locals 1

    iget-object v0, p0, LQ0/N;->b:LQ0/A;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, LQ0/N;->c:I

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, LQ0/N;->a:I

    return v0
.end method

.method public final e()LQ0/z;
    .locals 1

    iget-object v0, p0, LQ0/N;->d:LQ0/z;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LQ0/N;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget v1, p0, LQ0/N;->a:I

    check-cast p1, LQ0/N;

    iget v3, p1, LQ0/N;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, LQ0/N;->b()LQ0/A;

    move-result-object v1

    invoke-virtual {p1}, LQ0/N;->b()LQ0/A;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, LQ0/N;->c()I

    move-result v1

    invoke-virtual {p1}, LQ0/N;->c()I

    move-result v3

    invoke-static {v1, v3}, LQ0/v;->f(II)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LQ0/N;->d:LQ0/z;

    iget-object v3, p1, LQ0/N;->d:LQ0/z;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    invoke-virtual {p0}, LQ0/N;->a()I

    move-result v1

    invoke-virtual {p1}, LQ0/N;->a()I

    move-result p1

    invoke-static {v1, p1}, LQ0/t;->e(II)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, LQ0/N;->a:I

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LQ0/N;->b()LQ0/A;

    move-result-object v1

    invoke-virtual {v1}, LQ0/A;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LQ0/N;->c()I

    move-result v1

    invoke-static {v1}, LQ0/v;->g(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, LQ0/N;->a()I

    move-result v1

    invoke-static {v1}, LQ0/t;->f(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LQ0/N;->d:LQ0/z;

    invoke-virtual {v1}, LQ0/z;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ResourceFont(resId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LQ0/N;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", weight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LQ0/N;->b()LQ0/A;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LQ0/N;->c()I

    move-result v1

    invoke-static {v1}, LQ0/v;->h(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", loadingStrategy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LQ0/N;->a()I

    move-result v1

    invoke-static {v1}, LQ0/t;->g(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
