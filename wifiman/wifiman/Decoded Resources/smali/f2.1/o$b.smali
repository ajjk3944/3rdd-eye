.class public final Lf2/o$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf2/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
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
    invoke-direct {p0}, Lf2/o$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/Q;)Lf2/o;
    .locals 7

    const-string v0, "viewModelStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/lifecycle/P;

    invoke-static {}, Lf2/o;->X()Landroidx/lifecycle/P$c;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Landroidx/lifecycle/P;-><init>(Landroidx/lifecycle/Q;Landroidx/lifecycle/P$c;Lb2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-class p1, Lf2/o;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/P;->a(Ljava/lang/Class;)Landroidx/lifecycle/N;

    move-result-object p1

    check-cast p1, Lf2/o;

    return-object p1
.end method
