.class public final Llb/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LVi/n;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb/d$a;,
        Llb/d$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u000e\u0008\u0081\u0008\u0018\u0000 !2\u00020\u0001:\u0002\u0012\u001fB\u001b\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006B+\u0008\u0010\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u0005\u0010\u000bJ\'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00022\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u001c\u001a\u0004\u0008 \u0010\u001e\u00a8\u0006\""
    }
    d2 = {
        "Llb/d;",
        "",
        "",
        "withTurn",
        "generateToken",
        "<init>",
        "(ZZ)V",
        "",
        "seen0",
        "LZi/R0;",
        "serializationConstructorMarker",
        "(IZZLZi/R0;)V",
        "self",
        "LYi/d;",
        "output",
        "LXi/f;",
        "serialDesc",
        "LYg/J;",
        "a",
        "(Llb/d;LYi/d;LXi/f;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Z",
        "getWithTurn",
        "()Z",
        "b",
        "getGenerateToken",
        "Companion",
        "unificore_release"
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
.field public static final Companion:Llb/d$b;


# instance fields
.field private final a:Z

.field private final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llb/d$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llb/d$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llb/d;->Companion:Llb/d$b;

    return-void
.end method

.method public synthetic constructor <init>(IZZLZi/R0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p4, p1, 0x1

    const/4 v0, 0x1

    if-nez p4, :cond_0

    iput-boolean v0, p0, Llb/d;->a:Z

    goto :goto_0

    :cond_0
    iput-boolean p2, p0, Llb/d;->a:Z

    :goto_0
    and-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_1

    iput-boolean v0, p0, Llb/d;->b:Z

    goto :goto_1

    :cond_1
    iput-boolean p3, p0, Llb/d;->b:Z

    :goto_1
    return-void
.end method

.method public constructor <init>(ZZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Llb/d;->a:Z

    .line 4
    iput-boolean p2, p0, Llb/d;->b:Z

    return-void
.end method

.method public static final synthetic a(Llb/d;LYi/d;LXi/f;)V
    .locals 3

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, LYi/d;->o(LXi/f;I)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Llb/d;->a:Z

    if-eq v1, v2, :cond_1

    :goto_0
    iget-boolean v1, p0, Llb/d;->a:Z

    invoke-interface {p1, p2, v0, v1}, LYi/d;->i(LXi/f;IZ)V

    :cond_1
    invoke-interface {p1, p2, v2}, LYi/d;->o(LXi/f;I)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget-boolean v0, p0, Llb/d;->b:Z

    if-eq v0, v2, :cond_3

    :goto_1
    iget-boolean p0, p0, Llb/d;->b:Z

    invoke-interface {p1, p2, v2, p0}, LYi/d;->i(LXi/f;IZ)V

    :cond_3
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llb/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llb/d;

    iget-boolean v1, p0, Llb/d;->a:Z

    iget-boolean v3, p1, Llb/d;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Llb/d;->b:Z

    iget-boolean p1, p1, Llb/d;->b:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Llb/d;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Llb/d;->b:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-boolean v0, p0, Llb/d;->a:Z

    iget-boolean v1, p0, Llb/d;->b:Z

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "CreateCredentials(withTurn="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", generateToken="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
