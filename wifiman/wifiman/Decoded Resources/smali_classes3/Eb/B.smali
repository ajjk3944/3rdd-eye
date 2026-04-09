.class public final LEb/B;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LVi/n;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LEb/B$a;,
        LEb/B$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0087\u0008\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001bB%\u0008\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006!"
    }
    d2 = {
        "LEb/B;",
        "",
        "",
        "seen0",
        "LEb/z;",
        "data",
        "LZi/R0;",
        "serializationConstructorMarker",
        "<init>",
        "(ILEb/z;LZi/R0;)V",
        "self",
        "LYi/d;",
        "output",
        "LXi/f;",
        "serialDesc",
        "LYg/J;",
        "e",
        "(LEb/B;LYi/d;LXi/f;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "LEb/z;",
        "c",
        "()LEb/z;",
        "Companion",
        "b",
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
.field public static final Companion:LEb/B$b;

.field private static final b:Laj/b;


# instance fields
.field private final a:LEb/z;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LEb/B$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LEb/B$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LEb/B;->Companion:LEb/B$b;

    new-instance v0, LEb/A;

    invoke-direct {v0}, LEb/A;-><init>()V

    const/4 v2, 0x1

    invoke-static {v1, v0, v2, v1}, Laj/w;->b(Laj/b;Lmh/l;ILjava/lang/Object;)Laj/b;

    move-result-object v0

    sput-object v0, LEb/B;->b:Laj/b;

    return-void
.end method

.method public synthetic constructor <init>(ILEb/z;LZi/R0;)V
    .locals 1

    and-int/lit8 p3, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p3, :cond_0

    sget-object p3, LEb/B$a;->a:LEb/B$a;

    invoke-virtual {p3}, LEb/B$a;->a()LXi/f;

    move-result-object p3

    invoke-static {p1, v0, p3}, LZi/C0;->a(IILXi/f;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LEb/B;->a:LEb/z;

    return-void
.end method

.method public static synthetic a(Laj/e;)LYg/J;
    .locals 0

    invoke-static {p0}, LEb/B;->d(Laj/e;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b()Laj/b;
    .locals 1

    sget-object v0, LEb/B;->b:Laj/b;

    return-object v0
.end method

.method private static final d(Laj/e;)LYg/J;
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

.method public static final synthetic e(LEb/B;LYi/d;LXi/f;)V
    .locals 2

    sget-object v0, LEb/z$a;->a:LEb/z$a;

    iget-object p0, p0, LEb/B;->a:LEb/z;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1, v0, p0}, LYi/d;->q(LXi/f;ILVi/o;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final c()LEb/z;
    .locals 1

    iget-object v0, p0, LEb/B;->a:LEb/z;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LEb/B;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LEb/B;

    iget-object v1, p0, LEb/B;->a:LEb/z;

    iget-object p1, p1, LEb/B;->a:LEb/z;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LEb/B;->a:LEb/z;

    invoke-virtual {v0}, LEb/z;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LEb/B;->a:LEb/z;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "TwoFaRequiredResponseWrapped(data="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
