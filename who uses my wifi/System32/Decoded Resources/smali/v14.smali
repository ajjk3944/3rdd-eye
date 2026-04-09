.class public final Lv14;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lew3;


# static fields
.field public static final a:Lv14;

.field public static final b:Law3;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lv14;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lv14;->a:Lv14;

    .line 7
    .line 8
    sget-object v0, Lvt3;->A:Lvt3;

    .line 9
    .line 10
    new-instance v1, Law3;

    .line 11
    .line 12
    const-class v2, Lfv3;

    .line 13
    .line 14
    const-class v3, Lnr3;

    .line 15
    .line 16
    invoke-direct {v1, v2, v3, v0}, Law3;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lbw3;)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lv14;->b:Law3;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Lnr3;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b(Ljr3;Lhv3;Llv2;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p2, p2, Lhv3;->a:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    sget-object p2, Lnv3;->b:Lnv3;

    .line 10
    .line 11
    invoke-virtual {p2}, Lnv3;->a()Lmv3;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    :cond_0
    new-instance p2, Lv24;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljr3;->i()Lir3;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p3, v0}, Llv2;->g(Lir3;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    check-cast p3, Lnr3;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljr3;->i()Lir3;

    .line 31
    .line 32
    .line 33
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    return-object p2
.end method

.method public final d()Ljava/lang/Class;
    .locals 1

    .line 1
    const-class v0, Lnr3;

    .line 2
    .line 3
    return-object v0
.end method
