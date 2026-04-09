.class public final Lmf0;
.super Lwk;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 6
    sget-object p1, Lvk;->b:Lvk;

    .line 7
    invoke-direct {p0, p1}, Lmf0;-><init>(Lwk;)V

    return-void
.end method

.method public constructor <init>(Lwk;)V
    .locals 1

    const-string v0, "initialExtras"

    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p1, p1, Lwk;->a:Ljava/util/LinkedHashMap;

    .line 2
    invoke-static {p1, v0}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lwk;-><init>()V

    .line 4
    iget-object v0, p0, Lwk;->a:Ljava/util/LinkedHashMap;

    .line 5
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method
