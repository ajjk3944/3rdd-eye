.class public final Lxm;
.super Ln41;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public a:Ljava/text/DecimalFormat;

.field public b:I


# virtual methods
.method public final a(F)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lxm;->a:Ljava/text/DecimalFormat;

    .line 2
    .line 3
    float-to-double v1, p1

    .line 4
    invoke-virtual {v0, v1, v2}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method
