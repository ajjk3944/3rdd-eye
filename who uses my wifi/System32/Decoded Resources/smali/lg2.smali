.class public final synthetic Llg2;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lbx1;


# instance fields
.field public final synthetic f:Z

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p2, p0, Llg2;->f:Z

    .line 5
    .line 6
    iput p1, p0, Llg2;->g:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final e(Lyy1;)V
    .locals 3

    .line 1
    sget v0, Log2;->h0:I

    .line 2
    .line 3
    invoke-static {}, Loy1;->B()Lny1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, v0, Ln54;->g:Lp54;

    .line 8
    .line 9
    check-cast v1, Loy1;

    .line 10
    .line 11
    invoke-virtual {v1}, Loy1;->A()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-boolean v2, p0, Llg2;->f:Z

    .line 16
    .line 17
    if-eq v1, v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Ln54;->b()V

    .line 20
    .line 21
    .line 22
    iget-object v1, v0, Ln54;->g:Lp54;

    .line 23
    .line 24
    check-cast v1, Loy1;

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Loy1;->C(Z)V

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {v0}, Ln54;->b()V

    .line 30
    .line 31
    .line 32
    iget-object v1, v0, Ln54;->g:Lp54;

    .line 33
    .line 34
    check-cast v1, Loy1;

    .line 35
    .line 36
    iget v2, p0, Llg2;->g:I

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Loy1;->D(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ln54;->d()Lp54;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Loy1;

    .line 46
    .line 47
    invoke-virtual {p1}, Ln54;->b()V

    .line 48
    .line 49
    .line 50
    iget-object p1, p1, Ln54;->g:Lp54;

    .line 51
    .line 52
    check-cast p1, Lzy1;

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Lzy1;->J(Loy1;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method
