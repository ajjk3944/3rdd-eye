.class public final LEb/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LVi/n;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LEb/m$a;,
        LEb/m$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001b\u0008\u0087\u0008\u0018\u0000 .2\u00020\u0001:\u0002\u001e$BE\u0008\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u00042\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u001e\u0010\u001f\u0012\u0004\u0008\"\u0010#\u001a\u0004\u0008 \u0010!R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008$\u0010%\u0012\u0004\u0008&\u0010#\u001a\u0004\u0008$\u0010\u001aR \u0010\u0008\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\'\u0010(\u0012\u0004\u0008*\u0010#\u001a\u0004\u0008)\u0010\u0018R&\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00070\t8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008)\u0010+\u0012\u0004\u0008-\u0010#\u001a\u0004\u0008\'\u0010,\u00a8\u0006/"
    }
    d2 = {
        "LEb/m;",
        "",
        "",
        "seen0",
        "",
        "isAcceptable",
        "score",
        "",
        "warning",
        "",
        "suggestions",
        "LZi/R0;",
        "serializationConstructorMarker",
        "<init>",
        "(IZILjava/lang/String;Ljava/util/List;LZi/R0;)V",
        "self",
        "LYi/d;",
        "output",
        "LXi/f;",
        "serialDesc",
        "LYg/J;",
        "f",
        "(LEb/m;LYi/d;LXi/f;)V",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Z",
        "e",
        "()Z",
        "isAcceptable$annotations",
        "()V",
        "b",
        "I",
        "getScore$annotations",
        "c",
        "Ljava/lang/String;",
        "d",
        "getWarning$annotations",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "getSuggestions$annotations",
        "Companion",
        "SSO_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:LEb/m$b;

.field private static final e:[LVi/b;


# instance fields
.field private final a:Z

.field private final b:I

.field private final c:Ljava/lang/String;

.field private final d:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LEb/m$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LEb/m$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LEb/m;->Companion:LEb/m$b;

    new-instance v0, LZi/f;

    sget-object v2, LZi/W0;->a:LZi/W0;

    invoke-direct {v0, v2}, LZi/f;-><init>(LVi/b;)V

    const/4 v2, 0x4

    new-array v2, v2, [LVi/b;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v1, 0x3

    aput-object v0, v2, v1

    sput-object v2, LEb/m;->e:[LVi/b;

    return-void
.end method

.method public synthetic constructor <init>(IZILjava/lang/String;Ljava/util/List;LZi/R0;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    sget-object p6, LEb/m$a;->a:LEb/m$a;

    invoke-virtual {p6}, LEb/m$a;->a()LXi/f;

    move-result-object p6

    invoke-static {p1, v0, p6}, LZi/C0;->a(IILXi/f;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, LEb/m;->a:Z

    iput p3, p0, LEb/m;->b:I

    iput-object p4, p0, LEb/m;->c:Ljava/lang/String;

    iput-object p5, p0, LEb/m;->d:Ljava/util/List;

    return-void
.end method

.method public static final synthetic a()[LVi/b;
    .locals 1

    sget-object v0, LEb/m;->e:[LVi/b;

    return-object v0
.end method

.method public static final synthetic f(LEb/m;LYi/d;LXi/f;)V
    .locals 3

    sget-object v0, LEb/m;->e:[LVi/b;

    iget-boolean v1, p0, LEb/m;->a:Z

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v1}, LYi/d;->i(LXi/f;IZ)V

    const/4 v1, 0x1

    iget v2, p0, LEb/m;->b:I

    invoke-interface {p1, p2, v1, v2}, LYi/d;->C(LXi/f;II)V

    const/4 v1, 0x2

    iget-object v2, p0, LEb/m;->c:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, LYi/d;->y(LXi/f;ILjava/lang/String;)V

    const/4 v1, 0x3

    aget-object v0, v0, v1

    iget-object p0, p0, LEb/m;->d:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, LYi/d;->q(LXi/f;ILVi/o;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, LEb/m;->b:I

    return v0
.end method

.method public final c()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LEb/m;->d:Ljava/util/List;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LEb/m;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, LEb/m;->a:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LEb/m;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LEb/m;

    iget-boolean v1, p0, LEb/m;->a:Z

    iget-boolean v3, p1, LEb/m;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, LEb/m;->b:I

    iget v3, p1, LEb/m;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LEb/m;->c:Ljava/lang/String;

    iget-object v3, p1, LEb/m;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LEb/m;->d:Ljava/util/List;

    iget-object p1, p1, LEb/m;->d:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, LEb/m;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LEb/m;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LEb/m;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LEb/m;->d:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-boolean v0, p0, LEb/m;->a:Z

    iget v1, p0, LEb/m;->b:I

    iget-object v2, p0, LEb/m;->c:Ljava/lang/String;

    iget-object v3, p0, LEb/m;->d:Ljava/util/List;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "PasswordStrengthResponse(isAcceptable="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", score="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", warning="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", suggestions="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
