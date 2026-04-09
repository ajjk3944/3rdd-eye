.class public final Landroidx/lifecycle/P$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/P;
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
    invoke-direct {p0}, Landroidx/lifecycle/P$b;-><init>()V

    return-void
.end method

.method public static synthetic c(Landroidx/lifecycle/P$b;Landroidx/lifecycle/S;Landroidx/lifecycle/P$c;Lb2/a;ILjava/lang/Object;)Landroidx/lifecycle/P;
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    sget-object p2, Ld2/g;->a:Ld2/g;

    invoke-virtual {p2, p1}, Ld2/g;->b(Landroidx/lifecycle/S;)Landroidx/lifecycle/P$c;

    move-result-object p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    sget-object p3, Ld2/g;->a:Ld2/g;

    invoke-virtual {p3, p1}, Ld2/g;->a(Landroidx/lifecycle/S;)Lb2/a;

    move-result-object p3

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Landroidx/lifecycle/P$b;->b(Landroidx/lifecycle/S;Landroidx/lifecycle/P$c;Lb2/a;)Landroidx/lifecycle/P;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Landroidx/lifecycle/Q;Landroidx/lifecycle/P$c;Lb2/a;)Landroidx/lifecycle/P;
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/lifecycle/P;

    invoke-direct {v0, p1, p2, p3}, Landroidx/lifecycle/P;-><init>(Landroidx/lifecycle/Q;Landroidx/lifecycle/P$c;Lb2/a;)V

    return-object v0
.end method

.method public final b(Landroidx/lifecycle/S;Landroidx/lifecycle/P$c;Lb2/a;)Landroidx/lifecycle/P;
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/lifecycle/P;

    invoke-interface {p1}, Landroidx/lifecycle/S;->o()Landroidx/lifecycle/Q;

    move-result-object p1

    invoke-direct {v0, p1, p2, p3}, Landroidx/lifecycle/P;-><init>(Landroidx/lifecycle/Q;Landroidx/lifecycle/P$c;Lb2/a;)V

    return-object v0
.end method
