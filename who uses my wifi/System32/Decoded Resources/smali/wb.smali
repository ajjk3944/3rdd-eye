.class public Lwb;
.super Lk6;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lk6;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public O(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2

    .line 1
    new-instance p1, Lvb;

    .line 2
    .line 3
    invoke-virtual {p0}, Liw;->i()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lxo;->e0:I

    .line 8
    .line 9
    invoke-direct {p1, v0, v1}, Lvb;-><init>(Landroid/content/Context;I)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final R()V
    .locals 5

    .line 1
    iget-object v0, p0, Lxo;->k0:Landroid/app/Dialog;

    .line 2
    .line 3
    instance-of v1, v0, Lvb;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_4

    .line 7
    .line 8
    check-cast v0, Lvb;

    .line 9
    .line 10
    iget-object v1, v0, Lvb;->k:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Lvb;->g()V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v1, v0, Lvb;->k:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 18
    .line 19
    iget-boolean v3, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->I:Z

    .line 20
    .line 21
    if-eqz v3, :cond_4

    .line 22
    .line 23
    iget-boolean v0, v0, Lvb;->o:Z

    .line 24
    .line 25
    if-eqz v0, :cond_4

    .line 26
    .line 27
    iget v0, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N:I

    .line 28
    .line 29
    const/4 v3, 0x5

    .line 30
    if-ne v0, v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0, v2, v2}, Lxo;->N(ZZ)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    iget-object v0, p0, Lxo;->k0:Landroid/app/Dialog;

    .line 37
    .line 38
    instance-of v2, v0, Lvb;

    .line 39
    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    check-cast v0, Lvb;

    .line 43
    .line 44
    iget-object v2, v0, Lvb;->k:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 45
    .line 46
    iget-object v0, v0, Lvb;->v:Ltb;

    .line 47
    .line 48
    iget-object v2, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    :cond_2
    new-instance v0, Ltb;

    .line 54
    .line 55
    move-object v2, p0

    .line 56
    check-cast v2, Ly00;

    .line 57
    .line 58
    const/4 v4, 0x1

    .line 59
    invoke-direct {v0, v4, v2}, Ltb;-><init>(ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object v2, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-nez v4, :cond_3

    .line 69
    .line 70
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    :cond_3
    invoke-virtual {v1, v3}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->I(I)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_4
    invoke-virtual {p0, v2, v2}, Lxo;->N(ZZ)V

    .line 78
    .line 79
    .line 80
    return-void
.end method
