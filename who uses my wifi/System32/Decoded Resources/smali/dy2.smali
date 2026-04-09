.class public final Ldy2;
.super Lca2;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic f:Lfy2;


# direct methods
.method public constructor <init>(Lfy2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldy2;->f:Lfy2;

    .line 2
    .line 3
    invoke-direct {p0}, Lca2;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final O2(Lwu1;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldy2;->f:Lfy2;

    .line 2
    .line 3
    iget-object v0, v0, Lfy2;->f:Lpd2;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v1, Lxt1;

    .line 9
    .line 10
    iget-object v2, p1, Lwu1;->f:Ljava/lang/String;

    .line 11
    .line 12
    iget p1, p1, Lwu1;->g:I

    .line 13
    .line 14
    invoke-direct {v1, v2, p1}, Lxt1;-><init>(Ljava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lpd2;->b(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final p1(Landroid/os/ParcelFileDescriptor;Lfa2;)V
    .locals 2

    .line 1
    new-instance v0, Lny2;

    .line 2
    .line 3
    new-instance v1, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1, p2}, Lny2;-><init>(Ljava/io/InputStream;Lfa2;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Ldy2;->f:Lfy2;

    .line 12
    .line 13
    iget-object p1, p1, Lfy2;->f:Lpd2;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lpd2;->a(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final v1(Landroid/os/ParcelFileDescriptor;)V
    .locals 3

    .line 1
    new-instance v0, Lny2;

    .line 2
    .line 3
    new-instance v1, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Ldy2;->f:Lfy2;

    .line 9
    .line 10
    iget-object v2, p1, Lfy2;->j:Lfa2;

    .line 11
    .line 12
    invoke-direct {v0, v1, v2}, Lny2;-><init>(Ljava/io/InputStream;Lfa2;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p1, Lfy2;->f:Lpd2;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lpd2;->a(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    return-void
.end method
