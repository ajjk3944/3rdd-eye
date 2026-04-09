.class public abstract Lkb/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LVi/n;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkb/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003B\u001b\u0008\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0002\u0010\u0008J\'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u0082\u0001\u0002\u0016\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lkb/f;",
        "",
        "<init>",
        "()V",
        "",
        "seen0",
        "LZi/R0;",
        "serializationConstructorMarker",
        "(ILZi/R0;)V",
        "self",
        "LYi/d;",
        "output",
        "LXi/f;",
        "serialDesc",
        "LYg/J;",
        "e",
        "(Lkb/f;LYi/d;LXi/f;)V",
        "",
        "d",
        "()[B",
        "Companion",
        "a",
        "Lkb/d;",
        "Lkb/n;",
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
.field public static final Companion:Lkb/f$a;

.field private static final a:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkb/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkb/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkb/f;->Companion:Lkb/f$a;

    sget-object v0, LYg/q;->PUBLICATION:LYg/q;

    new-instance v1, Lkb/e;

    invoke-direct {v1}, Lkb/e;-><init>()V

    invoke-static {v0, v1}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object v0

    sput-object v0, Lkb/f;->a:LYg/m;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILZi/R0;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkb/f;-><init>()V

    return-void
.end method

.method public static synthetic a()LVi/b;
    .locals 1

    invoke-static {}, Lkb/f;->b()LVi/b;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic b()LVi/b;
    .locals 8

    new-instance v6, LVi/k;

    const-class v0, Lkb/f;

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v2

    const-class v0, Lkb/d;

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v0

    const-class v1, Lkb/n;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const/4 v3, 0x2

    new-array v4, v3, [Lth/d;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    new-array v7, v3, [LVi/b;

    sget-object v1, Lkb/d$a;->a:Lkb/d$a;

    aput-object v1, v7, v5

    sget-object v1, Lkb/n$a;->a:Lkb/n$a;

    aput-object v1, v7, v0

    new-array v5, v5, [Ljava/lang/annotation/Annotation;

    const-string/jumbo v1, "com.ui.unifi.core.base.net.message.Header"

    move-object v0, v6

    move-object v3, v4

    move-object v4, v7

    invoke-direct/range {v0 .. v5}, LVi/k;-><init>(Ljava/lang/String;Lth/d;[Lth/d;[LVi/b;[Ljava/lang/annotation/Annotation;)V

    return-object v6
.end method

.method public static final synthetic c()LYg/m;
    .locals 1

    sget-object v0, Lkb/f;->a:LYg/m;

    return-object v0
.end method

.method public static final synthetic e(Lkb/f;LYi/d;LXi/f;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final d()[B
    .locals 2

    instance-of v0, p0, Lkb/n;

    if-eqz v0, :cond_0

    sget-object v0, Lub/c;->a:Lub/c;

    sget-object v1, Lkb/n;->Companion:Lkb/n$b;

    invoke-virtual {v1}, Lkb/n$b;->serializer()LVi/b;

    move-result-object v1

    invoke-virtual {v0}, Lub/c;->d()Laj/b;

    move-result-object v0

    invoke-virtual {v0, v1, p0}, Laj/b;->c(LVi/o;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lkb/d;

    if-eqz v0, :cond_1

    sget-object v0, Lub/c;->a:Lub/c;

    sget-object v1, Lkb/d;->Companion:Lkb/d$b;

    invoke-virtual {v1}, Lkb/d$b;->serializer()LVi/b;

    move-result-object v1

    invoke-virtual {v0}, Lub/c;->d()Laj/b;

    move-result-object v0

    invoke-virtual {v0, v1, p0}, Laj/b;->c(LVi/o;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    sget-object v1, Lkotlin/text/d;->b:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string/jumbo v1, "getBytes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
