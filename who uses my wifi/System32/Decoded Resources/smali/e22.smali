.class public abstract Le22;
.super Lhv1;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lf22;


# static fields
.field public static final synthetic f:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lhv1;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final A3(ILandroid/os/Parcel;Landroid/os/Parcel;)Z
    .locals 2

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    return p1

    .line 6
    :pswitch_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0, p1}, Lf22;->z1(Lu10;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 21
    .line 22
    .line 23
    goto/16 :goto_1

    .line 24
    .line 25
    :pswitch_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const-string v0, "com.google.android.gms.ads.internal.formats.client.IMediaContent"

    .line 34
    .line 35
    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    instance-of v1, v0, Lz12;

    .line 40
    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    move-object p1, v0

    .line 44
    check-cast p1, Lz12;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    new-instance v0, Ly12;

    .line 48
    .line 49
    invoke-direct {v0, p1}, Ly12;-><init>(Landroid/os/IBinder;)V

    .line 50
    .line 51
    .line 52
    move-object p1, v0

    .line 53
    :goto_0
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p0, p1}, Lf22;->T2(Lz12;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 60
    .line 61
    .line 62
    goto/16 :goto_1

    .line 63
    .line 64
    :pswitch_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {p0, p1}, Lf22;->E0(Lu10;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :pswitch_3
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {p0, p1}, Lf22;->M(Lu10;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :pswitch_4
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 108
    .line 109
    .line 110
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :pswitch_5
    invoke-interface {p0}, Lf22;->b()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :pswitch_6
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-static {p1}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 133
    .line 134
    .line 135
    invoke-interface {p0, p1}, Lf22;->L0(Lu10;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :pswitch_7
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 147
    .line 148
    .line 149
    invoke-interface {p0, p1}, Lf22;->P(Ljava/lang/String;)Lu10;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 154
    .line 155
    .line 156
    invoke-static {p3, p1}, Liv1;->e(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 157
    .line 158
    .line 159
    goto :goto_1

    .line 160
    :pswitch_8
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-static {v0}, Loi0;->X0(Landroid/os/IBinder;)Lu10;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-static {p2}, Liv1;->f(Landroid/os/Parcel;)V

    .line 173
    .line 174
    .line 175
    invoke-interface {p0, v0, p1}, Lf22;->V0(Lu10;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 179
    .line 180
    .line 181
    :goto_1
    const/4 p1, 0x1

    .line 182
    return p1

    .line 183
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
