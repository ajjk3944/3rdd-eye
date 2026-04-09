.class public final Ly43;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ln53;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/Integer;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly43;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Ly43;->b:Ljava/lang/Integer;

    .line 7
    .line 8
    iput-object p3, p0, Ly43;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Ly43;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Ly43;->e:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Ly43;->f:Ljava/lang/String;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Ljm2;

    .line 2
    .line 3
    iget-object p1, p1, Ljm2;->a:Landroid/os/Bundle;

    .line 4
    .line 5
    const-string v0, "pn"

    .line 6
    .line 7
    iget-object v1, p0, Ly43;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0, p1, v1}, Li30;->p0(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Ly43;->b:Ljava/lang/Integer;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const-string v1, "vc"

    .line 21
    .line 22
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    :cond_0
    const-string v0, "vnm"

    .line 26
    .line 27
    iget-object v1, p0, Ly43;->c:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v0, p1, v1}, Li30;->p0(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v0, "dl"

    .line 33
    .line 34
    iget-object v1, p0, Ly43;->d:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, p1, v1}, Li30;->p0(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v0, "ins_pn"

    .line 40
    .line 41
    iget-object v1, p0, Ly43;->e:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v0, p1, v1}, Li30;->p0(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v0, "ini_pn"

    .line 47
    .line 48
    iget-object v1, p0, Ly43;->f:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v0, p1, v1}, Li30;->p0(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final bridge synthetic p(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Ljm2;

    .line 2
    .line 3
    iget-object p1, p1, Ljm2;->b:Landroid/os/Bundle;

    .line 4
    .line 5
    const-string v0, "pn"

    .line 6
    .line 7
    iget-object v1, p0, Ly43;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0, p1, v1}, Li30;->p0(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "dl"

    .line 13
    .line 14
    iget-object v1, p0, Ly43;->d:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v0, p1, v1}, Li30;->p0(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
