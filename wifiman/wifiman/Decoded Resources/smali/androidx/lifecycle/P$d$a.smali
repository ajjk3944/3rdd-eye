.class public final Landroidx/lifecycle/P$d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/P$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/P$d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Landroidx/lifecycle/P$d;
    .locals 1

    invoke-static {}, Landroidx/lifecycle/P$d;->d()Landroidx/lifecycle/P$d;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Landroidx/lifecycle/P$d;

    invoke-direct {v0}, Landroidx/lifecycle/P$d;-><init>()V

    invoke-static {v0}, Landroidx/lifecycle/P$d;->e(Landroidx/lifecycle/P$d;)V

    :cond_0
    invoke-static {}, Landroidx/lifecycle/P$d;->d()Landroidx/lifecycle/P$d;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object v0
.end method
