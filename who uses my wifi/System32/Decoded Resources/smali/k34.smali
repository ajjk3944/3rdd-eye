.class public final Lk34;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ll34;
.implements Lll3;
.implements Lks2;


# instance fields
.field public final f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lad4;Lt82;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lk34;->f:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk34;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Llj4;

    .line 2
    .line 3
    iget-object v1, p0, Lk34;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/content/Context;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Llj4;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public synthetic c(Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Lbd4;

    .line 2
    .line 3
    iget-object v0, p0, Lk34;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lt82;

    .line 6
    .line 7
    invoke-interface {p1, v0}, Lbd4;->k(Lt82;)V

    .line 8
    .line 9
    .line 10
    iget p1, v0, Lt82;->a:I

    .line 11
    .line 12
    return-void
.end method

.method public l(Ljava/lang/String;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lk34;->f:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lo34;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-interface {v0, p1, v1}, Lo34;->d(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method
