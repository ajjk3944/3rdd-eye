.class public final Ls9/b$a;
.super Ls9/b;
.source "SourceFile"

# interfaces
.implements Ls9/a$b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:I

.field private final b:Ls9/b$b;

.field private final c:Ls9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILs9/b$b;Ls9/d;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Ls9/b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput p1, p0, Ls9/b$a;->a:I

    .line 4
    iput-object p2, p0, Ls9/b$a;->b:Ls9/b$b;

    .line 5
    iput-object p3, p0, Ls9/b$a;->c:Ls9/d;

    return-void
.end method

.method public synthetic constructor <init>(ILs9/b$b;Ls9/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    .line 1
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Ls9/b$a;-><init>(ILs9/b$b;Ls9/d;)V

    return-void
.end method

.method public static synthetic i(Ls9/b$a;ILs9/b$b;Ls9/d;ILjava/lang/Object;)Ls9/b$a;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Ls9/b$a;->a:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Ls9/b$a;->b:Ls9/b$b;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Ls9/b$a;->c:Ls9/d;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Ls9/b$a;->h(ILs9/b$b;Ls9/d;)Ls9/b$a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public d()I
    .locals 1

    iget v0, p0, Ls9/b$a;->a:I

    return v0
.end method

.method public e()Ls9/b$b;
    .locals 1

    iget-object v0, p0, Ls9/b$a;->b:Ls9/b$b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ls9/b$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ls9/b$a;

    iget v1, p0, Ls9/b$a;->a:I

    iget v3, p1, Ls9/b$a;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ls9/b$a;->b:Ls9/b$b;

    iget-object v3, p1, Ls9/b$a;->b:Ls9/b$b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ls9/b$a;->c:Ls9/d;

    iget-object p1, p1, Ls9/b$a;->c:Ls9/d;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public getContentDescription()Ls9/d;
    .locals 1

    iget-object v0, p0, Ls9/b$a;->c:Ls9/d;

    return-object v0
.end method

.method public final h(ILs9/b$b;Ls9/d;)Ls9/b$a;
    .locals 1

    new-instance v0, Ls9/b$a;

    invoke-direct {v0, p1, p2, p3}, Ls9/b$a;-><init>(ILs9/b$b;Ls9/d;)V

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Ls9/b$a;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls9/b$a;->b:Ls9/b$b;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ls9/b$b;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ls9/b$a;->c:Ls9/d;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Ls9/b$a;->a:I

    iget-object v1, p0, Ls9/b$a;->b:Ls9/b$b;

    iget-object v2, p0, Ls9/b$a;->c:Ls9/d;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "Res(resource="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", tint="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", contentDescription="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
