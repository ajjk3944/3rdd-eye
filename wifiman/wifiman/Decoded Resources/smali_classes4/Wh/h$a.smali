.class public final LWh/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LWh/h;
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
    invoke-direct {p0}, LWh/h$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LUh/w;)LWh/h;
    .locals 2

    const-string v0, "table"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LUh/w;->K()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LWh/h$a;->b()LWh/h;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance v0, LWh/h;

    invoke-virtual {p1}, LUh/w;->P()Ljava/util/List;

    move-result-object p1

    const-string v1, "getRequirementList(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LWh/h;-><init>(Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public final b()LWh/h;
    .locals 1

    invoke-static {}, LWh/h;->a()LWh/h;

    move-result-object v0

    return-object v0
.end method
