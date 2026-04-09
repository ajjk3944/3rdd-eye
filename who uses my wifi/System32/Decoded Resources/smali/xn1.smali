.class public final Lxn1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lws2;


# instance fields
.field public final f:Lax0;

.field public final g:Lls2;

.field public final h:Lls2;


# direct methods
.method public constructor <init>(Lax0;Lls2;Lls2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxn1;->f:Lax0;

    .line 5
    .line 6
    iput-object p2, p0, Lxn1;->g:Lls2;

    .line 7
    .line 8
    iput-object p3, p0, Lxn1;->h:Lls2;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lxn1;->b()Lp21;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final b()Lp21;
    .locals 5

    .line 1
    iget-object v0, p0, Lxn1;->f:Lax0;

    .line 2
    .line 3
    iget-object v0, v0, Lax0;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/app/Application;

    .line 6
    .line 7
    iget-object v1, p0, Lxn1;->g:Lls2;

    .line 8
    .line 9
    invoke-virtual {v1}, Lls2;->a()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lmo1;

    .line 14
    .line 15
    iget-object v2, p0, Lxn1;->h:Lls2;

    .line 16
    .line 17
    invoke-virtual {v2}, Lls2;->a()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lyb4;

    .line 22
    .line 23
    sget-object v3, Lok2;->b:Ldk2;

    .line 24
    .line 25
    invoke-static {v3}, Lpu1;->s(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    new-instance v4, Lp21;

    .line 29
    .line 30
    invoke-direct {v4, v0, v1, v2, v3}, Lp21;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-object v4
.end method
