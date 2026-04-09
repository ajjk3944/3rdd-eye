.class public final synthetic Lub4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f:Lvb4;

.field public final synthetic g:Landroid/util/Pair;

.field public final synthetic h:Lch4;

.field public final synthetic i:Lhh4;

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Lvb4;Landroid/util/Pair;Lch4;Lhh4;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lub4;->f:Lvb4;

    .line 5
    .line 6
    iput-object p2, p0, Lub4;->g:Landroid/util/Pair;

    .line 7
    .line 8
    iput-object p3, p0, Lub4;->h:Lch4;

    .line 9
    .line 10
    iput-object p4, p0, Lub4;->i:Lhh4;

    .line 11
    .line 12
    iput p5, p0, Lub4;->j:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 8

    .line 1
    iget-object v0, p0, Lub4;->g:Landroid/util/Pair;

    .line 2
    .line 3
    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v4, v0

    .line 14
    check-cast v4, Lkh4;

    .line 15
    .line 16
    iget-object v0, p0, Lub4;->f:Lvb4;

    .line 17
    .line 18
    iget-object v0, v0, Lvb4;->g:Luu0;

    .line 19
    .line 20
    iget-object v0, v0, Luu0;->n:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v2, v0

    .line 23
    check-cast v2, Lmd4;

    .line 24
    .line 25
    iget-object v6, p0, Lub4;->i:Lhh4;

    .line 26
    .line 27
    iget v7, p0, Lub4;->j:I

    .line 28
    .line 29
    iget-object v5, p0, Lub4;->h:Lch4;

    .line 30
    .line 31
    invoke-virtual/range {v2 .. v7}, Lmd4;->n(ILkh4;Lch4;Lhh4;I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
