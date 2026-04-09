.class public final Lec3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:F

.field public final synthetic g:Lbs2;


# direct methods
.method public constructor <init>(Lbs2;F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lec3;->f:F

    .line 5
    .line 6
    iput-object p1, p0, Lec3;->g:Lbs2;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lec3;->g:Lbs2;

    .line 2
    .line 3
    iget-object v0, v0, Lbs2;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lfc3;

    .line 6
    .line 7
    iget-object v0, v0, Lfc3;->g:Lpc3;

    .line 8
    .line 9
    iget v1, p0, Lec3;->f:F

    .line 10
    .line 11
    iput v1, v0, Lpc3;->a:F

    .line 12
    .line 13
    iget-object v2, v0, Lpc3;->c:Lic3;

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    sget-object v2, Lic3;->c:Lic3;

    .line 18
    .line 19
    iput-object v2, v0, Lpc3;->c:Lic3;

    .line 20
    .line 21
    :cond_0
    iget-object v0, v0, Lpc3;->c:Lic3;

    .line 22
    .line 23
    iget-object v0, v0, Lic3;->b:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Lxb3;

    .line 44
    .line 45
    iget-object v2, v2, Lxb3;->d:Lsc3;

    .line 46
    .line 47
    sget-object v3, Lfr;->q:Lfr;

    .line 48
    .line 49
    invoke-virtual {v2}, Lsc3;->c()Landroid/webkit/WebView;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    iget-object v2, v2, Lsc3;->a:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    filled-new-array {v5, v2}, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    const-string v5, "setDeviceVolume"

    .line 64
    .line 65
    invoke-virtual {v3, v4, v5, v2}, Lfr;->s(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    return-void
.end method
