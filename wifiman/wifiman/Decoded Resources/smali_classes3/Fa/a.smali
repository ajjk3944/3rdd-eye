.class public final LFa/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final a:Ljava/util/UUID;

.field private final b:Lva/c;

.field private final c:Ljava/lang/Boolean;


# direct methods
.method private constructor <init>(Ljava/util/UUID;Lva/c;Ljava/lang/Boolean;)V
    .locals 1

    const-string/jumbo v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LFa/a;->a:Ljava/util/UUID;

    .line 4
    iput-object p2, p0, LFa/a;->b:Lva/c;

    .line 5
    iput-object p3, p0, LFa/a;->c:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/UUID;Lva/c;Ljava/lang/Boolean;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LFa/a;-><init>(Ljava/util/UUID;Lva/c;Ljava/lang/Boolean;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, LFa/a;->a:Ljava/util/UUID;

    return-object v0
.end method

.method public c()Lva/c;
    .locals 1

    iget-object v0, p0, LFa/a;->b:Lva/c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LFa/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-virtual {p0}, LFa/a;->a()Ljava/util/UUID;

    move-result-object v1

    check-cast p1, LFa/a;

    invoke-virtual {p1}, LFa/a;->a()Ljava/util/UUID;

    move-result-object v3

    invoke-static {v1, v3}, Lva/b;->g(Ljava/util/UUID;Ljava/util/UUID;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    invoke-virtual {p0}, LFa/a;->c()Lva/c;

    move-result-object v1

    invoke-virtual {p1}, LFa/a;->c()Lva/c;

    move-result-object v3

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LFa/a;->c:Ljava/lang/Boolean;

    iget-object p1, p1, LFa/a;->c:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 1

    invoke-virtual {p0}, LFa/a;->a()Ljava/util/UUID;

    move-result-object v0

    invoke-static {v0}, Lva/b;->h(Ljava/util/UUID;)I

    move-result v0

    return v0
.end method
