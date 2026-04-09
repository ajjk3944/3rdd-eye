.class public final Lfa2;
.super Ll0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lfa2;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:Landroid/os/Bundle;

.field public final g:Le51;

.field public final h:Landroid/content/pm/ApplicationInfo;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/util/List;

.field public final k:Landroid/content/pm/PackageInfo;

.field public final l:Ljava/lang/String;

.field public final m:Ljava/lang/String;

.field public n:Ld93;

.field public o:Ljava/lang/String;

.field public final p:Z

.field public final q:Z

.field public final r:Landroid/os/Bundle;

.field public final s:Landroid/os/Bundle;

.field public final t:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lp92;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Lp92;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lfa2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;Le51;Landroid/content/pm/ApplicationInfo;Ljava/lang/String;Ljava/util/ArrayList;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Ld93;Ljava/lang/String;ZZLandroid/os/Bundle;Landroid/os/Bundle;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfa2;->f:Landroid/os/Bundle;

    .line 5
    .line 6
    iput-object p2, p0, Lfa2;->g:Le51;

    .line 7
    .line 8
    iput-object p4, p0, Lfa2;->i:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p3, p0, Lfa2;->h:Landroid/content/pm/ApplicationInfo;

    .line 11
    .line 12
    iput-object p5, p0, Lfa2;->j:Ljava/util/List;

    .line 13
    .line 14
    iput-object p6, p0, Lfa2;->k:Landroid/content/pm/PackageInfo;

    .line 15
    .line 16
    iput-object p7, p0, Lfa2;->l:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p8, p0, Lfa2;->m:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p9, p0, Lfa2;->n:Ld93;

    .line 21
    .line 22
    iput-object p10, p0, Lfa2;->o:Ljava/lang/String;

    .line 23
    .line 24
    iput-boolean p11, p0, Lfa2;->p:Z

    .line 25
    .line 26
    iput-boolean p12, p0, Lfa2;->q:Z

    .line 27
    .line 28
    iput-object p13, p0, Lfa2;->r:Landroid/os/Bundle;

    .line 29
    .line 30
    iput-object p14, p0, Lfa2;->s:Landroid/os/Bundle;

    .line 31
    .line 32
    iput p15, p0, Lfa2;->t:I

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {p1, v0}, Luk2;->I(Landroid/os/Parcel;I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    iget-object v2, p0, Lfa2;->f:Landroid/os/Bundle;

    .line 9
    .line 10
    invoke-static {p1, v1, v2}, Luk2;->z(Landroid/os/Parcel;ILandroid/os/Bundle;)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    iget-object v2, p0, Lfa2;->g:Le51;

    .line 15
    .line 16
    invoke-static {p1, v1, v2, p2}, Luk2;->C(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    iget-object v2, p0, Lfa2;->h:Landroid/content/pm/ApplicationInfo;

    .line 21
    .line 22
    invoke-static {p1, v1, v2, p2}, Luk2;->C(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lfa2;->i:Ljava/lang/String;

    .line 26
    .line 27
    const/4 v2, 0x4

    .line 28
    invoke-static {p1, v2, v1}, Luk2;->D(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x5

    .line 32
    iget-object v3, p0, Lfa2;->j:Ljava/util/List;

    .line 33
    .line 34
    invoke-static {p1, v1, v3}, Luk2;->F(Landroid/os/Parcel;ILjava/util/List;)V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x6

    .line 38
    iget-object v3, p0, Lfa2;->k:Landroid/content/pm/PackageInfo;

    .line 39
    .line 40
    invoke-static {p1, v1, v3, p2}, Luk2;->C(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 41
    .line 42
    .line 43
    const/4 v1, 0x7

    .line 44
    iget-object v3, p0, Lfa2;->l:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {p1, v1, v3}, Luk2;->D(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/16 v1, 0x9

    .line 50
    .line 51
    iget-object v3, p0, Lfa2;->m:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {p1, v1, v3}, Luk2;->D(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/16 v1, 0xa

    .line 57
    .line 58
    iget-object v3, p0, Lfa2;->n:Ld93;

    .line 59
    .line 60
    invoke-static {p1, v1, v3, p2}, Luk2;->C(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 61
    .line 62
    .line 63
    const/16 p2, 0xb

    .line 64
    .line 65
    iget-object v1, p0, Lfa2;->o:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {p1, p2, v1}, Luk2;->D(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const/16 p2, 0xc

    .line 71
    .line 72
    invoke-static {p1, p2, v2}, Luk2;->T(Landroid/os/Parcel;II)V

    .line 73
    .line 74
    .line 75
    iget-boolean p2, p0, Lfa2;->p:Z

    .line 76
    .line 77
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 78
    .line 79
    .line 80
    const/16 p2, 0xd

    .line 81
    .line 82
    invoke-static {p1, p2, v2}, Luk2;->T(Landroid/os/Parcel;II)V

    .line 83
    .line 84
    .line 85
    iget-boolean p2, p0, Lfa2;->q:Z

    .line 86
    .line 87
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 88
    .line 89
    .line 90
    const/16 p2, 0xe

    .line 91
    .line 92
    iget-object v1, p0, Lfa2;->r:Landroid/os/Bundle;

    .line 93
    .line 94
    invoke-static {p1, p2, v1}, Luk2;->z(Landroid/os/Parcel;ILandroid/os/Bundle;)V

    .line 95
    .line 96
    .line 97
    const/16 p2, 0xf

    .line 98
    .line 99
    iget-object v1, p0, Lfa2;->s:Landroid/os/Bundle;

    .line 100
    .line 101
    invoke-static {p1, p2, v1}, Luk2;->z(Landroid/os/Parcel;ILandroid/os/Bundle;)V

    .line 102
    .line 103
    .line 104
    const/16 p2, 0x10

    .line 105
    .line 106
    invoke-static {p1, p2, v2}, Luk2;->T(Landroid/os/Parcel;II)V

    .line 107
    .line 108
    .line 109
    iget p2, p0, Lfa2;->t:I

    .line 110
    .line 111
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 112
    .line 113
    .line 114
    invoke-static {p1, v0}, Luk2;->O(Landroid/os/Parcel;I)V

    .line 115
    .line 116
    .line 117
    return-void
.end method
