.class public final Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LVi/n;
.end annotation

.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody$a;,
        Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0081\u0008\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B%\u0008\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0004\u0010\nJ\'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u001f\u001a\u0004\u0008 \u0010\u0015\u00a8\u0006$"
    }
    d2 = {
        "Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody;",
        "",
        "",
        "passwordHash",
        "<init>",
        "(Ljava/lang/String;)V",
        "",
        "seen0",
        "LZi/R0;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;LZi/R0;)V",
        "self",
        "LYi/d;",
        "output",
        "LXi/f;",
        "serialDesc",
        "LYg/J;",
        "write$Self$unificore_release",
        "(Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody;LYi/d;LXi/f;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "copy",
        "(Ljava/lang/String;)Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getPasswordHash",
        "Companion",
        "a",
        "b",
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
.field public static final Companion:Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody$b;


# instance fields
.field private final passwordHash:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody;->Companion:Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody$b;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;LZi/R0;)V
    .locals 1

    and-int/lit8 p3, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p3, :cond_0

    .line 1
    sget-object p3, Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody$a;->a:Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody$a;

    invoke-virtual {p3}, Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody$a;->a()LXi/f;

    move-result-object p3

    invoke-static {p1, v0, p3}, LZi/C0;->a(IILXi/f;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody;->passwordHash:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "passwordHash"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody;->passwordHash:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody;Ljava/lang/String;ILjava/lang/Object;)Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody;->passwordHash:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody;->copy(Ljava/lang/String;)Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$unificore_release(Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody;LYi/d;LXi/f;)V
    .locals 1

    const/4 v0, 0x0

    iget-object p0, p0, Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody;->passwordHash:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, LYi/d;->y(LXi/f;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody;->passwordHash:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;)Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody;
    .locals 1

    const-string/jumbo v0, "passwordHash"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody;

    invoke-direct {v0, p1}, Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody;

    iget-object v1, p0, Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody;->passwordHash:Ljava/lang/String;

    iget-object p1, p1, Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody;->passwordHash:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getPasswordHash()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody;->passwordHash:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody;->passwordHash:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/ui/unifi/core/base/net/models/config/GenerateEncryptionKeyBody;->passwordHash:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "GenerateEncryptionKeyBody(passwordHash="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
