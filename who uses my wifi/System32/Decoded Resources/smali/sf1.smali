.class public abstract Lsf1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lcg1;


# instance fields
.field public final a:Lcg1;


# direct methods
.method public constructor <init>(Lcg1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsf1;->a:Lcg1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 1
    iget-object v0, p0, Lsf1;->a:Lcg1;

    .line 2
    .line 3
    invoke-interface {v0}, Lcg1;->a()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public b(J)Lbg1;
    .locals 1

    .line 1
    iget-object v0, p0, Lsf1;->a:Lcg1;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lcg1;->b(J)Lbg1;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lsf1;->a:Lcg1;

    .line 2
    .line 3
    invoke-interface {v0}, Lcg1;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
