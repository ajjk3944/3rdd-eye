.class public final Lcom/ui/common/semver/SemVer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/common/semver/SemVer$a;,
        Lcom/ui/common/semver/SemVer$FormatException;
    }
.end annotation


# static fields
.field public static final i:Lcom/ui/common/semver/SemVer$a;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:I

.field private final d:Lo9/c;

.field private final e:Lo9/a;

.field private final f:Ljava/lang/String;

.field private final g:Z

.field private final h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/common/semver/SemVer$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/common/semver/SemVer$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/common/semver/SemVer;->i:Lcom/ui/common/semver/SemVer$a;

    return-void
.end method

.method public constructor <init>(IIILjava/lang/String;Ljava/lang/String;)V
    .locals 7

    const/4 v0, 0x0

    if-nez p4, :cond_0

    move-object v5, v0

    goto :goto_0

    .line 14
    :cond_0
    sget-object v1, Lo9/c;->b:Lo9/c$a;

    invoke-virtual {v1, p4}, Lo9/c$a;->a(Ljava/lang/String;)Lo9/c;

    move-result-object p4

    move-object v5, p4

    :goto_0
    if-nez p5, :cond_1

    :goto_1
    move-object v6, v0

    goto :goto_2

    .line 15
    :cond_1
    sget-object p4, Lo9/a;->b:Lo9/a$a;

    invoke-virtual {p4, p5}, Lo9/a$a;->a(Ljava/lang/String;)Lo9/a;

    move-result-object v0

    goto :goto_1

    :goto_2
    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    .line 16
    invoke-direct/range {v1 .. v6}, Lcom/ui/common/semver/SemVer;-><init>(IIILo9/c;Lo9/a;)V

    return-void
.end method

.method public synthetic constructor <init>(IIILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 3

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move p7, v0

    goto :goto_0

    :cond_0
    move p7, p1

    :goto_0
    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    move v1, v0

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    move v0, p3

    :goto_2
    and-int/lit8 p1, p6, 0x8

    const/4 p2, 0x0

    if-eqz p1, :cond_3

    move-object v2, p2

    goto :goto_3

    :cond_3
    move-object v2, p4

    :goto_3
    and-int/lit8 p1, p6, 0x10

    if-eqz p1, :cond_4

    move-object p6, p2

    goto :goto_4

    :cond_4
    move-object p6, p5

    :goto_4
    move-object p1, p0

    move p2, p7

    move p3, v1

    move p4, v0

    move-object p5, v2

    .line 13
    invoke-direct/range {p1 .. p6}, Lcom/ui/common/semver/SemVer;-><init>(IIILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(IIILo9/c;Lo9/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/ui/common/semver/SemVer;->a:I

    .line 3
    iput p2, p0, Lcom/ui/common/semver/SemVer;->b:I

    .line 4
    iput p3, p0, Lcom/ui/common/semver/SemVer;->c:I

    .line 5
    iput-object p4, p0, Lcom/ui/common/semver/SemVer;->d:Lo9/c;

    .line 6
    iput-object p5, p0, Lcom/ui/common/semver/SemVer;->e:Lo9/a;

    if-ltz p1, :cond_5

    if-ltz p2, :cond_4

    if-ltz p3, :cond_3

    const/4 p1, 0x0

    if-nez p4, :cond_0

    move-object p2, p1

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p4}, Lo9/c;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_0
    iput-object p2, p0, Lcom/ui/common/semver/SemVer;->f:Ljava/lang/String;

    if-eqz p4, :cond_1

    const/4 p2, 0x1

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    .line 8
    :goto_1
    iput-boolean p2, p0, Lcom/ui/common/semver/SemVer;->g:Z

    if-nez p5, :cond_2

    goto :goto_2

    .line 9
    :cond_2
    invoke-virtual {p5}, Lo9/a;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_2
    iput-object p1, p0, Lcom/ui/common/semver/SemVer;->h:Ljava/lang/String;

    return-void

    .line 10
    :cond_3
    new-instance p1, Lcom/ui/common/semver/SemVer$FormatException;

    const-string/jumbo p2, "The patch number must be >= 0."

    invoke-direct {p1, p2}, Lcom/ui/common/semver/SemVer$FormatException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 11
    :cond_4
    new-instance p1, Lcom/ui/common/semver/SemVer$FormatException;

    const-string/jumbo p2, "The minor number must be >= 0."

    invoke-direct {p1, p2}, Lcom/ui/common/semver/SemVer$FormatException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 12
    :cond_5
    new-instance p1, Lcom/ui/common/semver/SemVer$FormatException;

    const-string/jumbo p2, "The major number must be >= 0."

    invoke-direct {p1, p2}, Lcom/ui/common/semver/SemVer$FormatException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a(Lcom/ui/common/semver/SemVer;)I
    .locals 4

    const-string/jumbo v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lcom/ui/common/semver/SemVer;->a:I

    iget v1, p1, Lcom/ui/common/semver/SemVer;->a:I

    const/4 v2, 0x1

    if-le v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v3, -0x1

    if-ge v0, v1, :cond_1

    :goto_0
    move v2, v3

    goto :goto_1

    :cond_1
    iget v0, p0, Lcom/ui/common/semver/SemVer;->b:I

    iget v1, p1, Lcom/ui/common/semver/SemVer;->b:I

    if-le v0, v1, :cond_2

    goto :goto_1

    :cond_2
    if-ge v0, v1, :cond_3

    goto :goto_0

    :cond_3
    iget v0, p0, Lcom/ui/common/semver/SemVer;->c:I

    iget v1, p1, Lcom/ui/common/semver/SemVer;->c:I

    if-le v0, v1, :cond_4

    goto :goto_1

    :cond_4
    if-ge v0, v1, :cond_5

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/ui/common/semver/SemVer;->d:Lo9/c;

    if-eqz v0, :cond_6

    iget-object v1, p1, Lcom/ui/common/semver/SemVer;->d:Lo9/c;

    if-nez v1, :cond_6

    goto :goto_0

    :cond_6
    if-nez v0, :cond_7

    iget-object v1, p1, Lcom/ui/common/semver/SemVer;->d:Lo9/c;

    if-eqz v1, :cond_7

    goto :goto_1

    :cond_7
    if-eqz v0, :cond_8

    iget-object p1, p1, Lcom/ui/common/semver/SemVer;->d:Lo9/c;

    if-eqz p1, :cond_8

    invoke-virtual {v0, p1}, Lo9/c;->b(Lo9/c;)I

    move-result v2

    goto :goto_1

    :cond_8
    const/4 v2, 0x0

    :goto_1
    return v2
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/common/semver/SemVer;->h:Ljava/lang/String;

    return-object v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/ui/common/semver/SemVer;

    invoke-virtual {p0, p1}, Lcom/ui/common/semver/SemVer;->a(Lcom/ui/common/semver/SemVer;)I

    move-result p1

    return p1
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lcom/ui/common/semver/SemVer;->a:I

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcom/ui/common/semver/SemVer;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/ui/common/semver/SemVer;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p1}, Lcom/ui/common/semver/SemVer;->a(Lcom/ui/common/semver/SemVer;)I

    move-result p1

    if-nez p1, :cond_2

    const/4 v0, 0x1

    :cond_2
    :goto_1
    return v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Lcom/ui/common/semver/SemVer;->b:I

    return v0
.end method

.method public final h()I
    .locals 1

    iget v0, p0, Lcom/ui/common/semver/SemVer;->c:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/ui/common/semver/SemVer;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    iget v1, p0, Lcom/ui/common/semver/SemVer;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1f

    mul-int/2addr v0, v1

    iget v1, p0, Lcom/ui/common/semver/SemVer;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/ui/common/semver/SemVer;->d:Lo9/c;

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/ui/common/semver/SemVer;->j()Lo9/c;

    move-result-object v1

    invoke-virtual {v1}, Lo9/c;->hashCode()I

    move-result v1

    add-int/lit8 v1, v1, 0x1f

    :goto_0
    mul-int/2addr v0, v1

    return v0
.end method

.method public final j()Lo9/c;
    .locals 1

    iget-object v0, p0, Lcom/ui/common/semver/SemVer;->d:Lo9/c;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lcom/ui/common/semver/SemVer;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/ui/common/semver/SemVer;->b:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ui/common/semver/SemVer;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ui/common/semver/SemVer;->d:Lo9/c;

    const-string v2, ""

    if-nez v1, :cond_0

    :goto_0
    move-object v1, v2

    goto :goto_1

    :cond_0
    const-string v1, "-"

    invoke-virtual {p0}, Lcom/ui/common/semver/SemVer;->j()Lo9/c;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->p(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ui/common/semver/SemVer;->h:Ljava/lang/String;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    const-string v1, "+"

    invoke-virtual {p0}, Lcom/ui/common/semver/SemVer;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->p(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    move-object v2, v1

    :goto_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
