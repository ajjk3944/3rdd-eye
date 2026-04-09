.class public Lnb/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LVi/c;
.end annotation

.annotation runtime LVi/n;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnb/f$a;,
        Lnb/f$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0017\u0018\u0000 \u00142\u00020\u0001:\u0002\u0011\u000fB%\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0011\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lnb/f;",
        "",
        "",
        "seen0",
        "seq",
        "LZi/R0;",
        "serializationConstructorMarker",
        "<init>",
        "(ILjava/lang/Integer;LZi/R0;)V",
        "self",
        "LYi/d;",
        "output",
        "LXi/f;",
        "serialDesc",
        "LYg/J;",
        "b",
        "(Lnb/f;LYi/d;LXi/f;)V",
        "a",
        "Ljava/lang/Integer;",
        "()Ljava/lang/Integer;",
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
.field public static final Companion:Lnb/f$b;


# instance fields
.field private final a:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lnb/f$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lnb/f$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lnb/f;->Companion:Lnb/f$b;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Integer;LZi/R0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p1, p1, 0x1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lnb/f;->a:Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lnb/f;->a:Ljava/lang/Integer;

    :goto_0
    return-void
.end method

.method public static final synthetic b(Lnb/f;LYi/d;LXi/f;)V
    .locals 2

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, LYi/d;->o(LXi/f;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lnb/f;->a:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, LZi/W;->a:LZi/W;

    iget-object p0, p0, Lnb/f;->a:Ljava/lang/Integer;

    invoke-interface {p1, p2, v0, v1, p0}, LYi/d;->t(LXi/f;ILVi/o;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lnb/f;->a:Ljava/lang/Integer;

    return-object v0
.end method
