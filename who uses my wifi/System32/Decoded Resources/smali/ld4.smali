.class public final synthetic Lld4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lks2;
.implements Lng4;


# instance fields
.field public final synthetic f:Lph4;


# direct methods
.method public synthetic constructor <init>(Lad4;Lph4;Lw34;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lld4;->f:Lph4;

    return-void
.end method

.method public synthetic constructor <init>(Lph4;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lld4;->f:Lph4;

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;)I
    .locals 4

    check-cast p1, Lbg4;

    sget-object v0, Log4;->a:Ljava/util/HashMap;

    .line 1
    iget-object v0, p1, Lbg4;->b:Ljava/lang/String;

    iget-object v1, p0, Lld4;->f:Lph4;

    iget-object v2, v1, Lph4;->m:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    .line 2
    invoke-static {v1}, Log4;->c(Lph4;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return v3

    .line 3
    :cond_1
    :goto_0
    invoke-virtual {p1, v1, v3}, Lbg4;->f(Lph4;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 4
    invoke-virtual {p1, v1}, Lbg4;->g(Lph4;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    return v3
.end method

.method public synthetic c(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lbd4;

    .line 5
    iget-object v0, p0, Lld4;->f:Lph4;

    invoke-interface {p1, v0}, Lbd4;->g(Lph4;)V

    return-void
.end method
