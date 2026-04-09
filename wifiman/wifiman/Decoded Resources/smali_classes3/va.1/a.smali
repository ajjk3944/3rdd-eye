.class public final Lva/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final a:Ljava/util/UUID;

.field private final b:Lva/c;


# direct methods
.method private constructor <init>(Ljava/util/UUID;Lva/c;)V
    .locals 1

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lva/a;->a:Ljava/util/UUID;

    .line 4
    iput-object p2, p0, Lva/a;->b:Lva/c;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/UUID;Lva/c;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lva/a;-><init>(Ljava/util/UUID;Lva/c;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lva/a;->a:Ljava/util/UUID;

    return-object v0
.end method

.method public c()Lva/c;
    .locals 1

    iget-object v0, p0, Lva/a;->b:Lva/c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    const-class v2, Lva/a;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    :cond_2
    const-string/jumbo v1, "null cannot be cast to non-null type com.ui.product.btle.DefaultUiProductBtleService"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lva/a;

    invoke-virtual {p0}, Lva/a;->a()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {p1}, Lva/a;->a()Ljava/util/UUID;

    move-result-object v3

    invoke-static {v1, v3}, Lva/b;->g(Ljava/util/UUID;Ljava/util/UUID;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    invoke-virtual {p0}, Lva/a;->c()Lva/c;

    move-result-object v1

    invoke-virtual {p1}, Lva/a;->c()Lva/c;

    move-result-object p1

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, Lva/a;->a()Ljava/util/UUID;

    move-result-object v0

    invoke-static {v0}, Lva/b;->h(Ljava/util/UUID;)I

    move-result v0

    return v0
.end method
