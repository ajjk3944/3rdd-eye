.class public final Lmb/z;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LVi/n;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmb/z$a;,
        Lmb/z$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0014\u0012B/\u0008\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0018\u001a\u0004\u0008\u0014\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lmb/z;",
        "",
        "",
        "seen0",
        "",
        "deviceId",
        "Lmb/A;",
        "state",
        "LZi/R0;",
        "serializationConstructorMarker",
        "<init>",
        "(ILjava/lang/String;Lmb/A;LZi/R0;)V",
        "self",
        "LYi/d;",
        "output",
        "LXi/f;",
        "serialDesc",
        "LYg/J;",
        "b",
        "(Lmb/z;LYi/d;LXi/f;)V",
        "a",
        "Ljava/lang/String;",
        "getDeviceId",
        "()Ljava/lang/String;",
        "Lmb/A;",
        "()Lmb/A;",
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
.field public static final Companion:Lmb/z$b;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lmb/A;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lmb/z$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmb/z$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lmb/z;->Companion:Lmb/z$b;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lmb/A;LZi/R0;)V
    .locals 1

    and-int/lit8 p4, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p4, :cond_0

    sget-object p4, Lmb/z$a;->a:Lmb/z$a;

    invoke-virtual {p4}, Lmb/z$a;->a()LXi/f;

    move-result-object p4

    invoke-static {p1, v0, p4}, LZi/C0;->a(IILXi/f;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lmb/z;->a:Ljava/lang/String;

    iput-object p3, p0, Lmb/z;->b:Lmb/A;

    return-void
.end method

.method public static final synthetic b(Lmb/z;LYi/d;LXi/f;)V
    .locals 2

    iget-object v0, p0, Lmb/z;->a:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1, v0}, LYi/d;->y(LXi/f;ILjava/lang/String;)V

    sget-object v0, Lmb/A$a;->a:Lmb/A$a;

    iget-object p0, p0, Lmb/z;->b:Lmb/A;

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1, v0, p0}, LYi/d;->q(LXi/f;ILVi/o;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a()Lmb/A;
    .locals 1

    iget-object v0, p0, Lmb/z;->b:Lmb/A;

    return-object v0
.end method
