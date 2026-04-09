.class public final LEb/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LVi/n;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LEb/z$a;,
        LEb/z$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 /2\u00020\u0001:\u0002%!BI\u0008\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$R\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008)\u0010*\u001a\u0004\u0008+\u0010\u001aR\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\'\u0010,\u001a\u0004\u0008-\u0010.\u00a8\u00060"
    }
    d2 = {
        "LEb/z;",
        "",
        "",
        "seen0",
        "LEb/C;",
        "user",
        "",
        "LEb/w;",
        "authenticators",
        "",
        "mfaCookie",
        "LEb/d;",
        "publicKeyCredentialRequestOptions",
        "LZi/R0;",
        "serializationConstructorMarker",
        "<init>",
        "(ILEb/C;Ljava/util/List;Ljava/lang/String;LEb/d;LZi/R0;)V",
        "self",
        "LYi/d;",
        "output",
        "LXi/f;",
        "serialDesc",
        "LYg/J;",
        "g",
        "(LEb/z;LYi/d;LXi/f;)V",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "LEb/C;",
        "e",
        "()LEb/C;",
        "b",
        "Ljava/util/List;",
        "d",
        "()Ljava/util/List;",
        "c",
        "Ljava/lang/String;",
        "getMfaCookie",
        "LEb/d;",
        "getPublicKeyCredentialRequestOptions",
        "()LEb/d;",
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
.field public static final Companion:LEb/z$b;

.field private static final e:[LVi/b;

.field private static final f:Laj/b;


# instance fields
.field private final a:LEb/C;

.field private final b:Ljava/util/List;

.field private final c:Ljava/lang/String;

.field private final d:LEb/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LEb/z$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LEb/z$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LEb/z;->Companion:LEb/z$b;

    new-instance v0, LZi/f;

    sget-object v2, LEb/w;->Companion:LEb/w$b;

    invoke-virtual {v2}, LEb/w$b;->serializer()LVi/b;

    move-result-object v2

    invoke-direct {v0, v2}, LZi/f;-><init>(LVi/b;)V

    const/4 v2, 0x4

    new-array v2, v2, [LVi/b;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const/4 v0, 0x3

    aput-object v1, v2, v0

    sput-object v2, LEb/z;->e:[LVi/b;

    new-instance v0, LEb/y;

    invoke-direct {v0}, LEb/y;-><init>()V

    invoke-static {v1, v0, v3, v1}, Laj/w;->b(Laj/b;Lmh/l;ILjava/lang/Object;)Laj/b;

    move-result-object v0

    sput-object v0, LEb/z;->f:Laj/b;

    return-void
.end method

.method public synthetic constructor <init>(ILEb/C;Ljava/util/List;Ljava/lang/String;LEb/d;LZi/R0;)V
    .locals 1

    and-int/lit8 p6, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p6, :cond_0

    sget-object p6, LEb/z$a;->a:LEb/z$a;

    invoke-virtual {p6}, LEb/z$a;->a()LXi/f;

    move-result-object p6

    invoke-static {p1, v0, p6}, LZi/C0;->a(IILXi/f;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LEb/z;->a:LEb/C;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, LEb/z;->b:Ljava/util/List;

    goto :goto_0

    :cond_1
    iput-object p3, p0, LEb/z;->b:Ljava/util/List;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput-object p3, p0, LEb/z;->c:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p4, p0, LEb/z;->c:Ljava/lang/String;

    :goto_1
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_3

    iput-object p3, p0, LEb/z;->d:LEb/d;

    goto :goto_2

    :cond_3
    iput-object p5, p0, LEb/z;->d:LEb/d;

    :goto_2
    return-void
.end method

.method public static synthetic a(Laj/e;)LYg/J;
    .locals 0

    invoke-static {p0}, LEb/z;->f(Laj/e;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b()[LVi/b;
    .locals 1

    sget-object v0, LEb/z;->e:[LVi/b;

    return-object v0
.end method

.method public static final synthetic c()Laj/b;
    .locals 1

    sget-object v0, LEb/z;->f:Laj/b;

    return-object v0
.end method

.method private static final f(Laj/e;)LYg/J;
    .locals 2

    const-string v0, "$this$Json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Laj/e;->f(Z)V

    new-instance v0, Lcj/f;

    invoke-direct {v0}, Lcj/f;-><init>()V

    sget-object v1, LEb/w;->Companion:LEb/w$b;

    invoke-virtual {v1}, LEb/w$b;->b()Lcj/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcj/f;->i(Lcj/e;)V

    invoke-virtual {v0}, Lcj/f;->h()Lcj/e;

    move-result-object v0

    invoke-virtual {p0, v0}, Laj/e;->h(Lcj/e;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic g(LEb/z;LYi/d;LXi/f;)V
    .locals 4

    sget-object v0, LEb/z;->e:[LVi/b;

    sget-object v1, LEb/C$a;->a:LEb/C$a;

    iget-object v2, p0, LEb/z;->a:LEb/C;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, LYi/d;->q(LXi/f;ILVi/o;Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, LYi/d;->o(LXi/f;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, LEb/z;->b:Ljava/util/List;

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    aget-object v0, v0, v1

    iget-object v2, p0, LEb/z;->b:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, LYi/d;->q(LXi/f;ILVi/o;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, LYi/d;->o(LXi/f;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, LEb/z;->c:Ljava/lang/String;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, LZi/W0;->a:LZi/W0;

    iget-object v2, p0, LEb/z;->c:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, LYi/d;->t(LXi/f;ILVi/o;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, LYi/d;->o(LXi/f;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, LEb/z;->d:LEb/d;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, LEb/d$a;->a:LEb/d$a;

    iget-object p0, p0, LEb/z;->d:LEb/d;

    invoke-interface {p1, p2, v0, v1, p0}, LYi/d;->t(LXi/f;ILVi/o;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public final d()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LEb/z;->b:Ljava/util/List;

    return-object v0
.end method

.method public final e()LEb/C;
    .locals 1

    iget-object v0, p0, LEb/z;->a:LEb/C;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LEb/z;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LEb/z;

    iget-object v1, p0, LEb/z;->a:LEb/C;

    iget-object v3, p1, LEb/z;->a:LEb/C;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LEb/z;->b:Ljava/util/List;

    iget-object v3, p1, LEb/z;->b:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LEb/z;->c:Ljava/lang/String;

    iget-object v3, p1, LEb/z;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LEb/z;->d:LEb/d;

    iget-object p1, p1, LEb/z;->d:LEb/d;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LEb/z;->a:LEb/C;

    invoke-virtual {v0}, LEb/C;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LEb/z;->b:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LEb/z;->c:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LEb/z;->d:LEb/d;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, LEb/d;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, LEb/z;->a:LEb/C;

    iget-object v1, p0, LEb/z;->b:Ljava/util/List;

    iget-object v2, p0, LEb/z;->c:Ljava/lang/String;

    iget-object v3, p0, LEb/z;->d:LEb/d;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "TwoFaRequiredResponse(user="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", authenticators="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", mfaCookie="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", publicKeyCredentialRequestOptions="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
