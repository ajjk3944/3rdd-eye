.class public final Lcom/phuongpn/whousemywifi/networkscanner/SettingsActivity;
.super Li5;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/phuongpn/whousemywifi/networkscanner/SettingsActivity$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Li5;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Li5;->onCreate(Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    const v0, 0x7f0c0022

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Li5;->setContentView(I)V

    .line 15
    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Li5;->o()Lxw;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    new-instance v0, Lg9;

    .line 27
    .line 28
    invoke-direct {v0, p1}, Lg9;-><init>(Lxw;)V

    .line 29
    .line 30
    .line 31
    new-instance p1, Lcom/phuongpn/whousemywifi/networkscanner/SettingsActivity$a;

    .line 32
    .line 33
    invoke-direct {p1}, Lcom/phuongpn/whousemywifi/networkscanner/SettingsActivity$a;-><init>()V

    .line 34
    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    const/4 v2, 0x2

    .line 38
    const v3, 0x7f090213

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v3, p1, v1, v2}, Lg9;->e(ILiw;Ljava/lang/String;I)V

    .line 42
    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    invoke-virtual {v0, p1}, Lg9;->d(Z)I

    .line 46
    .line 47
    .line 48
    :cond_0
    invoke-virtual {p0}, Li5;->n()Lm54;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-eqz p1, :cond_1

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    invoke-virtual {p1, v0}, Lm54;->y(Z)V

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void
.end method

.method public final v()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Li5;->o()Lxw;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, -0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-virtual {v0, v1, v2}, Lxw;->N(II)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    invoke-super {p0}, Li5;->v()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method
