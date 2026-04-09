.class public final Lnb/c;
.super Lnb/f;
.source "SourceFile"


# annotations
.annotation runtime LVi/n;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnb/c$a;,
        Lnb/c$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u0015BC\u0008\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0016\u001a\u0004\u0008\u0019\u0010\u0018R\"\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010\u001a\u0012\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006!"
    }
    d2 = {
        "Lnb/c;",
        "Lnb/f;",
        "",
        "seen0",
        "seq",
        "",
        "candidate",
        "mid",
        "mlineIndex",
        "LZi/R0;",
        "serializationConstructorMarker",
        "<init>",
        "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;LZi/R0;)V",
        "self",
        "LYi/d;",
        "output",
        "LXi/f;",
        "serialDesc",
        "LYg/J;",
        "f",
        "(Lnb/c;LYi/d;LXi/f;)V",
        "b",
        "Ljava/lang/String;",
        "c",
        "()Ljava/lang/String;",
        "d",
        "Ljava/lang/Integer;",
        "e",
        "()Ljava/lang/Integer;",
        "getMlineIndex$annotations",
        "()V",
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
.field public static final Companion:Lnb/c$b;


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lnb/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lnb/c$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lnb/c;->Companion:Lnb/c$b;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;LZi/R0;)V
    .locals 2

    and-int/lit8 v0, p1, 0x2

    const/4 v1, 0x2

    if-eq v1, v0, :cond_0

    sget-object v0, Lnb/c$a;->a:Lnb/c$a;

    invoke-virtual {v0}, Lnb/c$a;->a()LXi/f;

    move-result-object v0

    invoke-static {p1, v1, v0}, LZi/C0;->a(IILXi/f;)V

    :cond_0
    invoke-direct {p0, p1, p2, p6}, Lnb/f;-><init>(ILjava/lang/Integer;LZi/R0;)V

    iput-object p3, p0, Lnb/c;->b:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lnb/c;->c:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lnb/c;->c:Ljava/lang/String;

    :goto_0
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_2

    iput-object p3, p0, Lnb/c;->d:Ljava/lang/Integer;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lnb/c;->d:Ljava/lang/Integer;

    :goto_1
    return-void
.end method

.method public static final synthetic f(Lnb/c;LYi/d;LXi/f;)V
    .locals 3

    invoke-static {p0, p1, p2}, Lnb/f;->b(Lnb/f;LYi/d;LXi/f;)V

    iget-object v0, p0, Lnb/c;->b:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1, v0}, LYi/d;->y(LXi/f;ILjava/lang/String;)V

    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, LYi/d;->o(LXi/f;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lnb/c;->c:Ljava/lang/String;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, LZi/W0;->a:LZi/W0;

    iget-object v2, p0, Lnb/c;->c:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, LYi/d;->t(LXi/f;ILVi/o;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, LYi/d;->o(LXi/f;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lnb/c;->d:Ljava/lang/Integer;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, LZi/W;->a:LZi/W;

    iget-object p0, p0, Lnb/c;->d:Ljava/lang/Integer;

    invoke-interface {p1, p2, v0, v1, p0}, LYi/d;->t(LXi/f;ILVi/o;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnb/c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnb/c;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lnb/c;->d:Ljava/lang/Integer;

    return-object v0
.end method
