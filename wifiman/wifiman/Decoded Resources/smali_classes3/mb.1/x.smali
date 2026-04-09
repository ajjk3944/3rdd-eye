.class public abstract Lmb/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime LVi/n;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmb/x$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003B\u001b\u0008\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0002\u0010\u0008J\'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001b\u0082\u0001\u000b\u001f !\"#$%&\'()\u00a8\u0006*"
    }
    d2 = {
        "Lmb/x;",
        "Landroid/os/Parcelable;",
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
        "g",
        "(Lmb/x;LYi/d;LXi/f;)V",
        "Lmb/j;",
        "d",
        "()Lmb/j;",
        "controllerType",
        "",
        "f",
        "()Ljava/lang/String;",
        "version",
        "Lmb/k;",
        "e",
        "()Lmb/k;",
        "ui",
        "Companion",
        "a",
        "Lmb/a;",
        "Lmb/b;",
        "Lmb/d;",
        "Lmb/n;",
        "Lmb/q;",
        "Lmb/r;",
        "Lmb/s;",
        "Lmb/t;",
        "Lmb/u;",
        "Lmb/E;",
        "Lmb/F;",
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
.field public static final Companion:Lmb/x$a;

.field private static final a:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lmb/x$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmb/x$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lmb/x;->Companion:Lmb/x$a;

    sget-object v0, LYg/q;->PUBLICATION:LYg/q;

    new-instance v1, Lmb/w;

    invoke-direct {v1}, Lmb/w;-><init>()V

    invoke-static {v0, v1}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object v0

    sput-object v0, Lmb/x;->a:LYg/m;

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
    invoke-direct {p0}, Lmb/x;-><init>()V

    return-void
.end method

.method public static synthetic a()LVi/b;
    .locals 1

    invoke-static {}, Lmb/x;->b()LVi/b;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic b()LVi/b;
    .locals 16

    new-instance v6, LVi/k;

    const-class v0, Lmb/x;

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v2

    const-class v0, Lmb/a;

    invoke-static {v0}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v0

    const-class v1, Lmb/b;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const-class v3, Lmb/d;

    invoke-static {v3}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v3

    const-class v4, Lmb/n;

    invoke-static {v4}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v4

    const-class v5, Lmb/q;

    invoke-static {v5}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v5

    const-class v7, Lmb/r;

    invoke-static {v7}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v7

    const-class v8, Lmb/s;

    invoke-static {v8}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v8

    const-class v9, Lmb/t;

    invoke-static {v9}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v9

    const-class v10, Lmb/u;

    invoke-static {v10}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v10

    const-class v11, Lmb/E;

    invoke-static {v11}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v11

    const-class v12, Lmb/F;

    invoke-static {v12}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v12

    const/16 v13, 0xb

    new-array v14, v13, [Lth/d;

    const/4 v15, 0x0

    aput-object v0, v14, v15

    const/4 v0, 0x1

    aput-object v1, v14, v0

    const/4 v1, 0x2

    aput-object v3, v14, v1

    const/4 v3, 0x3

    aput-object v4, v14, v3

    const/4 v4, 0x4

    aput-object v5, v14, v4

    const/4 v5, 0x5

    aput-object v7, v14, v5

    const/4 v7, 0x6

    aput-object v8, v14, v7

    const/4 v8, 0x7

    aput-object v9, v14, v8

    const/16 v9, 0x8

    aput-object v10, v14, v9

    const/16 v10, 0x9

    aput-object v11, v14, v10

    const/16 v11, 0xa

    aput-object v12, v14, v11

    new-array v12, v13, [LVi/b;

    sget-object v13, Lmb/a$a;->a:Lmb/a$a;

    aput-object v13, v12, v15

    sget-object v13, Lmb/b$a;->a:Lmb/b$a;

    aput-object v13, v12, v0

    sget-object v0, Lmb/d$a;->a:Lmb/d$a;

    aput-object v0, v12, v1

    sget-object v0, Lmb/n$a;->a:Lmb/n$a;

    aput-object v0, v12, v3

    sget-object v0, Lmb/q$a;->a:Lmb/q$a;

    aput-object v0, v12, v4

    sget-object v0, Lmb/r$a;->a:Lmb/r$a;

    aput-object v0, v12, v5

    sget-object v0, Lmb/s$a;->a:Lmb/s$a;

    aput-object v0, v12, v7

    sget-object v0, Lmb/t$a;->a:Lmb/t$a;

    aput-object v0, v12, v8

    sget-object v0, Lmb/u$a;->a:Lmb/u$a;

    aput-object v0, v12, v9

    sget-object v0, Lmb/E$a;->a:Lmb/E$a;

    aput-object v0, v12, v10

    sget-object v0, Lmb/F$a;->a:Lmb/F$a;

    aput-object v0, v12, v11

    new-array v5, v15, [Ljava/lang/annotation/Annotation;

    const-string/jumbo v1, "com.ui.unifi.core.base.net.models.devices.UcoreController"

    move-object v0, v6

    move-object v3, v14

    move-object v4, v12

    invoke-direct/range {v0 .. v5}, LVi/k;-><init>(Ljava/lang/String;Lth/d;[Lth/d;[LVi/b;[Ljava/lang/annotation/Annotation;)V

    return-object v6
.end method

.method public static final synthetic c()LYg/m;
    .locals 1

    sget-object v0, Lmb/x;->a:LYg/m;

    return-object v0
.end method

.method public static final synthetic g(Lmb/x;LYi/d;LXi/f;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public abstract d()Lmb/j;
.end method

.method public abstract e()Lmb/k;
.end method

.method public abstract f()Ljava/lang/String;
.end method
