.class public final Lcf1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcf1;->a:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lqb1;->F(I)Ljava/util/LinkedHashMap;

    move-result-object p1

    iput-object p1, p0, Lcf1;->a:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lga4;)V
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcf1;->a:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 10
    .line 11
    const-string p2, "provider"

    .line 12
    .line 13
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw p1
.end method

.method public b(Lbf1;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lbf1;->e:[J

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-lez v1, :cond_0

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aget-wide v2, v0, v1

    .line 8
    .line 9
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v3, p0, Lcf1;->a:Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    aget-wide v1, v0, v1

    .line 22
    .line 23
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v3, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public c(Ljava/lang/String;Lga4;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcf1;->a(Ljava/lang/String;Lga4;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public d()Lea4;
    .locals 2

    .line 1
    new-instance v0, Lea4;

    .line 2
    .line 3
    iget-object v1, p0, Lcf1;->a:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Laa4;-><init>(Ljava/util/LinkedHashMap;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
