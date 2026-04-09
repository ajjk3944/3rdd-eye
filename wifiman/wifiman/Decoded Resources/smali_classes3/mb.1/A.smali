.class public final Lmb/A;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LVi/n;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmb/A$a;,
        Lmb/A$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u0000 \u00152\u00020\u0001:\u0002\u0012\u0010B%\u0008\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0012\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lmb/A;",
        "",
        "",
        "seen0",
        "Lmb/B;",
        "reported",
        "LZi/R0;",
        "serializationConstructorMarker",
        "<init>",
        "(ILmb/B;LZi/R0;)V",
        "self",
        "LYi/d;",
        "output",
        "LXi/f;",
        "serialDesc",
        "LYg/J;",
        "b",
        "(Lmb/A;LYi/d;LXi/f;)V",
        "a",
        "Lmb/B;",
        "()Lmb/B;",
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
.field public static final Companion:Lmb/A$b;


# instance fields
.field private final a:Lmb/B;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lmb/A$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmb/A$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lmb/A;->Companion:Lmb/A$b;

    return-void
.end method

.method public synthetic constructor <init>(ILmb/B;LZi/R0;)V
    .locals 1

    and-int/lit8 p3, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p3, :cond_0

    sget-object p3, Lmb/A$a;->a:Lmb/A$a;

    invoke-virtual {p3}, Lmb/A$a;->a()LXi/f;

    move-result-object p3

    invoke-static {p1, v0, p3}, LZi/C0;->a(IILXi/f;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lmb/A;->a:Lmb/B;

    return-void
.end method

.method public static final synthetic b(Lmb/A;LYi/d;LXi/f;)V
    .locals 2

    sget-object v0, Lmb/B$a;->a:Lmb/B$a;

    iget-object p0, p0, Lmb/A;->a:Lmb/B;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1, v0, p0}, LYi/d;->q(LXi/f;ILVi/o;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a()Lmb/B;
    .locals 1

    iget-object v0, p0, Lmb/A;->a:Lmb/B;

    return-object v0
.end method
