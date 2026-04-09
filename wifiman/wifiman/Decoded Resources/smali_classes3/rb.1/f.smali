.class public abstract Lrb/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LVi/n;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrb/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\'\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\'\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0008\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0012"
    }
    d2 = {
        "Lrb/f;",
        "",
        "",
        "seen0",
        "LZi/R0;",
        "serializationConstructorMarker",
        "<init>",
        "(ILZi/R0;)V",
        "self",
        "LYi/d;",
        "output",
        "LXi/f;",
        "serialDesc",
        "LYg/J;",
        "d",
        "(Lrb/f;LYi/d;LXi/f;)V",
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
.field public static final Companion:Lrb/f$a;

.field private static final a:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrb/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrb/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lrb/f;->Companion:Lrb/f$a;

    sget-object v0, LYg/q;->PUBLICATION:LYg/q;

    new-instance v1, Lrb/e;

    invoke-direct {v1}, Lrb/e;-><init>()V

    invoke-static {v0, v1}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object v0

    sput-object v0, Lrb/f;->a:LYg/m;

    return-void
.end method

.method public synthetic constructor <init>(ILZi/R0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()LVi/b;
    .locals 1

    invoke-static {}, Lrb/f;->b()LVi/b;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic b()LVi/b;
    .locals 3

    new-instance v0, LVi/f;

    const-class v1, Lrb/f;

    invoke-static {v1}, Lkotlin/jvm/internal/O;->b(Ljava/lang/Class;)Lth/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/annotation/Annotation;

    invoke-direct {v0, v1, v2}, LVi/f;-><init>(Lth/d;[Ljava/lang/annotation/Annotation;)V

    return-object v0
.end method

.method public static final synthetic c()LYg/m;
    .locals 1

    sget-object v0, Lrb/f;->a:LYg/m;

    return-object v0
.end method

.method public static final synthetic d(Lrb/f;LYi/d;LXi/f;)V
    .locals 0

    return-void
.end method
