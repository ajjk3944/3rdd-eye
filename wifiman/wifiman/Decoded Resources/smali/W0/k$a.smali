.class public final LW0/k$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LW0/k;
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
    invoke-direct {p0}, LW0/k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)LW0/k;
    .locals 4

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    :goto_0
    if-ge v0, v2, :cond_0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LW0/k;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v3}, LW0/k;->e()I

    move-result v3

    or-int/2addr v1, v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result p1

    new-instance v0, LW0/k;

    invoke-direct {v0, p1}, LW0/k;-><init>(I)V

    return-object v0
.end method

.method public final b()LW0/k;
    .locals 1

    invoke-static {}, LW0/k;->a()LW0/k;

    move-result-object v0

    return-object v0
.end method

.method public final c()LW0/k;
    .locals 1

    invoke-static {}, LW0/k;->b()LW0/k;

    move-result-object v0

    return-object v0
.end method

.method public final d()LW0/k;
    .locals 1

    invoke-static {}, LW0/k;->c()LW0/k;

    move-result-object v0

    return-object v0
.end method
