.class public final Lnb/a;
.super Lnb/f;
.source "SourceFile"


# annotations
.annotation runtime LVi/n;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnb/a$a;,
        Lnb/a$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0013B/\u0008\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0019"
    }
    d2 = {
        "Lnb/a;",
        "Lnb/f;",
        "",
        "seen0",
        "seq",
        "",
        "answer",
        "LZi/R0;",
        "serializationConstructorMarker",
        "<init>",
        "(ILjava/lang/Integer;Ljava/lang/String;LZi/R0;)V",
        "self",
        "LYi/d;",
        "output",
        "LXi/f;",
        "serialDesc",
        "LYg/J;",
        "d",
        "(Lnb/a;LYi/d;LXi/f;)V",
        "b",
        "Ljava/lang/String;",
        "c",
        "()Ljava/lang/String;",
        "Companion",
        "a",
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
.field public static final Companion:Lnb/a$b;


# instance fields
.field private final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lnb/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lnb/a$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lnb/a;->Companion:Lnb/a$b;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Integer;Ljava/lang/String;LZi/R0;)V
    .locals 2

    and-int/lit8 v0, p1, 0x2

    const/4 v1, 0x2

    if-eq v1, v0, :cond_0

    sget-object v0, Lnb/a$a;->a:Lnb/a$a;

    invoke-virtual {v0}, Lnb/a$a;->a()LXi/f;

    move-result-object v0

    invoke-static {p1, v1, v0}, LZi/C0;->a(IILXi/f;)V

    :cond_0
    invoke-direct {p0, p1, p2, p4}, Lnb/f;-><init>(ILjava/lang/Integer;LZi/R0;)V

    iput-object p3, p0, Lnb/a;->b:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic d(Lnb/a;LYi/d;LXi/f;)V
    .locals 1

    invoke-static {p0, p1, p2}, Lnb/f;->b(Lnb/f;LYi/d;LXi/f;)V

    const/4 v0, 0x1

    iget-object p0, p0, Lnb/a;->b:Ljava/lang/String;

    invoke-interface {p1, p2, v0, p0}, LYi/d;->y(LXi/f;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnb/a;->b:Ljava/lang/String;

    return-object v0
.end method
