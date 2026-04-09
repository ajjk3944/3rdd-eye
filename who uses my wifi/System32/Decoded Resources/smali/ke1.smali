.class public final synthetic Lke1;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:Lgw3;

.field public final synthetic g:I

.field public final synthetic h:J


# direct methods
.method public synthetic constructor <init>(IJLgw3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lke1;->f:Lgw3;

    .line 5
    .line 6
    iput p1, p0, Lke1;->g:I

    .line 7
    .line 8
    iput-wide p2, p0, Lke1;->h:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lke1;->f:Lgw3;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, Lv23;->a:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v0, v0, Lgw3;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Loa4;

    .line 11
    .line 12
    iget-object v0, v0, Loa4;->f:Lya4;

    .line 13
    .line 14
    iget-object v0, v0, Lya4;->y:Lmd4;

    .line 15
    .line 16
    iget-object v1, v0, Lmd4;->i:Lbu1;

    .line 17
    .line 18
    iget-object v1, v1, Lbu1;->k:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Lkh4;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lmd4;->x(Lkh4;)Lad4;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lh80;

    .line 27
    .line 28
    iget v3, p0, Lke1;->g:I

    .line 29
    .line 30
    iget-wide v4, p0, Lke1;->h:J

    .line 31
    .line 32
    invoke-direct {v2, v1, v3, v4, v5}, Lh80;-><init>(Lad4;IJ)V

    .line 33
    .line 34
    .line 35
    const/16 v3, 0x3fa

    .line 36
    .line 37
    invoke-virtual {v0, v1, v3, v2}, Lmd4;->s(Lad4;ILks2;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method
