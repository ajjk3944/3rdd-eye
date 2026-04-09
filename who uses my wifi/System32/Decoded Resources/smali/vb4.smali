.class public final Lvb4;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lrh4;
.implements Lkf4;


# instance fields
.field public final f:Lbc4;

.field public final synthetic g:Luu0;


# direct methods
.method public constructor <init>(Luu0;Lbc4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvb4;->g:Luu0;

    .line 5
    .line 6
    iput-object p2, p0, Lvb4;->f:Lbc4;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lkh4;)Landroid/util/Pair;
    .locals 7

    .line 1
    iget-object v0, p0, Lvb4;->f:Lbc4;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p1, :cond_3

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    iget-object v3, v0, Lbc4;->c:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-ge v2, v4, :cond_1

    .line 14
    .line 15
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Lkh4;

    .line 20
    .line 21
    iget-wide v3, v3, Lkh4;->d:J

    .line 22
    .line 23
    iget-wide v5, p1, Lkh4;->d:J

    .line 24
    .line 25
    cmp-long v3, v3, v5

    .line 26
    .line 27
    if-nez v3, :cond_0

    .line 28
    .line 29
    iget-object v2, p1, Lkh4;->a:Ljava/lang/Object;

    .line 30
    .line 31
    iget-object v3, v0, Lbc4;->b:Ljava/lang/Object;

    .line 32
    .line 33
    sget v4, Lic4;->k:I

    .line 34
    .line 35
    invoke-static {v3, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {p1, v2}, Lkh4;->a(Ljava/lang/Object;)Lkh4;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    move-object p1, v1

    .line 48
    :goto_1
    if-nez p1, :cond_2

    .line 49
    .line 50
    return-object v1

    .line 51
    :cond_2
    move-object v1, p1

    .line 52
    :cond_3
    iget p1, v0, Lbc4;->d:I

    .line 53
    .line 54
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1
.end method

.method public final j(ILkh4;Lch4;Lhh4;)V
    .locals 6

    .line 1
    invoke-virtual {p0, p2}, Lvb4;->a(Lkh4;)Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    new-instance v0, Ltb4;

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    move-object v1, p0

    .line 11
    move-object v3, p3

    .line 12
    move-object v4, p4

    .line 13
    invoke-direct/range {v0 .. v5}, Ltb4;-><init>(Lvb4;Landroid/util/Pair;Lch4;Lhh4;I)V

    .line 14
    .line 15
    .line 16
    iget-object p1, v1, Lvb4;->g:Luu0;

    .line 17
    .line 18
    iget-object p1, p1, Luu0;->o:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Ld13;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Ld13;->d(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    move-object v1, p0

    .line 27
    return-void
.end method

.method public final n(ILkh4;Lch4;Lhh4;I)V
    .locals 6

    .line 1
    invoke-virtual {p0, p2}, Lvb4;->a(Lkh4;)Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    new-instance v0, Lub4;

    .line 8
    .line 9
    move-object v1, p0

    .line 10
    move-object v3, p3

    .line 11
    move-object v4, p4

    .line 12
    move v5, p5

    .line 13
    invoke-direct/range {v0 .. v5}, Lub4;-><init>(Lvb4;Landroid/util/Pair;Lch4;Lhh4;I)V

    .line 14
    .line 15
    .line 16
    iget-object p1, v1, Lvb4;->g:Luu0;

    .line 17
    .line 18
    iget-object p1, p1, Luu0;->o:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Ld13;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Ld13;->d(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    move-object v1, p0

    .line 27
    return-void
.end method

.method public final o(ILkh4;Lch4;Lhh4;Ljava/io/IOException;Z)V
    .locals 7

    .line 1
    invoke-virtual {p0, p2}, Lvb4;->a(Lkh4;)Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    new-instance v0, Lfg3;

    .line 8
    .line 9
    move-object v1, p0

    .line 10
    move-object v3, p3

    .line 11
    move-object v4, p4

    .line 12
    move-object v5, p5

    .line 13
    move v6, p6

    .line 14
    invoke-direct/range {v0 .. v6}, Lfg3;-><init>(Lvb4;Landroid/util/Pair;Lch4;Lhh4;Ljava/io/IOException;Z)V

    .line 15
    .line 16
    .line 17
    iget-object p1, v1, Lvb4;->g:Luu0;

    .line 18
    .line 19
    iget-object p1, p1, Luu0;->o:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Ld13;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ld13;->d(Ljava/lang/Runnable;)Z

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    move-object v1, p0

    .line 28
    return-void
.end method

.method public final p(ILkh4;Lhh4;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p2}, Lvb4;->a(Lkh4;)Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    new-instance p2, Lgi;

    .line 8
    .line 9
    const/16 v0, 0x1a

    .line 10
    .line 11
    invoke-direct {p2, p0, p1, p3, v0}, Lgi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lvb4;->g:Luu0;

    .line 15
    .line 16
    iget-object p1, p1, Luu0;->o:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Ld13;

    .line 19
    .line 20
    invoke-virtual {p1, p2}, Ld13;->d(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final r(ILkh4;Lch4;Lhh4;)V
    .locals 6

    .line 1
    invoke-virtual {p0, p2}, Lvb4;->a(Lkh4;)Landroid/util/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    new-instance v0, Ltb4;

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    move-object v1, p0

    .line 11
    move-object v3, p3

    .line 12
    move-object v4, p4

    .line 13
    invoke-direct/range {v0 .. v5}, Ltb4;-><init>(Lvb4;Landroid/util/Pair;Lch4;Lhh4;I)V

    .line 14
    .line 15
    .line 16
    iget-object p1, v1, Lvb4;->g:Luu0;

    .line 17
    .line 18
    iget-object p1, p1, Luu0;->o:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Ld13;

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Ld13;->d(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    move-object v1, p0

    .line 27
    return-void
.end method
