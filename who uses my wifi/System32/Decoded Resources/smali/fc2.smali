.class public final Lfc2;
.super Ll0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lfc2;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;

.field public final m:Landroid/content/Intent;

.field public final n:Lid1;

.field public final o:Z

.field public final p:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkq0;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lkq0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lfc2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Landroid/content/Intent;Lid1;)V
    .locals 12

    .line 4
    new-instance v9, Loi0;

    invoke-direct {v9, p2}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 5
    new-instance v11, Landroid/os/Bundle;

    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    move-object v0, p0

    move-object v8, p1

    .line 6
    invoke-direct/range {v0 .. v11}, Lfc2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;Landroid/os/IBinder;ZLandroid/os/Bundle;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;Landroid/os/IBinder;ZLandroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lfc2;->f:Ljava/lang/String;

    iput-object p2, p0, Lfc2;->g:Ljava/lang/String;

    iput-object p3, p0, Lfc2;->h:Ljava/lang/String;

    iput-object p4, p0, Lfc2;->i:Ljava/lang/String;

    iput-object p5, p0, Lfc2;->j:Ljava/lang/String;

    iput-object p6, p0, Lfc2;->k:Ljava/lang/String;

    iput-object p7, p0, Lfc2;->l:Ljava/lang/String;

    iput-object p8, p0, Lfc2;->m:Landroid/content/Intent;

    .line 3
    invoke-static {p9}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    move-result-object p1

    invoke-static {p1}, Loi0;->l1(Lu10;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lid1;

    iput-object p1, p0, Lfc2;->n:Lid1;

    iput-boolean p10, p0, Lfc2;->o:Z

    iput-object p11, p0, Lfc2;->p:Landroid/os/Bundle;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid1;)V
    .locals 12

    .line 7
    new-instance v9, Loi0;

    move-object/from16 v0, p8

    invoke-direct {v9, v0}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 8
    new-instance v11, Landroid/os/Bundle;

    invoke-direct {v11}, Landroid/os/Bundle;-><init>()V

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    .line 9
    invoke-direct/range {v0 .. v11}, Lfc2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;Landroid/os/IBinder;ZLandroid/os/Bundle;)V

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
    const/4 v1, 0x2

    .line 8
    iget-object v2, p0, Lfc2;->f:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {p1, v1, v2}, Luk2;->D(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    iget-object v2, p0, Lfc2;->g:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {p1, v1, v2}, Luk2;->D(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lfc2;->h:Ljava/lang/String;

    .line 20
    .line 21
    const/4 v2, 0x4

    .line 22
    invoke-static {p1, v2, v1}, Luk2;->D(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 v1, 0x5

    .line 26
    iget-object v3, p0, Lfc2;->i:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {p1, v1, v3}, Luk2;->D(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x6

    .line 32
    iget-object v3, p0, Lfc2;->j:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {p1, v1, v3}, Luk2;->D(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x7

    .line 38
    iget-object v3, p0, Lfc2;->k:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {p1, v1, v3}, Luk2;->D(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/16 v1, 0x8

    .line 44
    .line 45
    iget-object v3, p0, Lfc2;->l:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {p1, v1, v3}, Luk2;->D(Landroid/os/Parcel;ILjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/16 v1, 0x9

    .line 51
    .line 52
    iget-object v3, p0, Lfc2;->m:Landroid/content/Intent;

    .line 53
    .line 54
    invoke-static {p1, v1, v3, p2}, Luk2;->C(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 55
    .line 56
    .line 57
    new-instance p2, Loi0;

    .line 58
    .line 59
    iget-object v1, p0, Lfc2;->n:Lid1;

    .line 60
    .line 61
    invoke-direct {p2, v1}, Loi0;-><init>(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    const/16 v1, 0xa

    .line 65
    .line 66
    invoke-static {p1, v1, p2}, Luk2;->B(Landroid/os/Parcel;ILandroid/os/IBinder;)V

    .line 67
    .line 68
    .line 69
    const/16 p2, 0xb

    .line 70
    .line 71
    invoke-static {p1, p2, v2}, Luk2;->T(Landroid/os/Parcel;II)V

    .line 72
    .line 73
    .line 74
    iget-boolean p2, p0, Lfc2;->o:Z

    .line 75
    .line 76
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 77
    .line 78
    .line 79
    const/16 p2, 0xc

    .line 80
    .line 81
    iget-object v1, p0, Lfc2;->p:Landroid/os/Bundle;

    .line 82
    .line 83
    invoke-static {p1, p2, v1}, Luk2;->z(Landroid/os/Parcel;ILandroid/os/Bundle;)V

    .line 84
    .line 85
    .line 86
    invoke-static {p1, v0}, Luk2;->O(Landroid/os/Parcel;I)V

    .line 87
    .line 88
    .line 89
    return-void
.end method
