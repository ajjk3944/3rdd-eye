.class public final synthetic La10;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, La10;->f:I

    .line 2
    .line 3
    iput-object p1, p0, La10;->g:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, La10;->h:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, La10;->i:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget p1, p0, La10;->f:I

    .line 2
    .line 3
    iget-object v0, p0, La10;->i:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v1, p0, La10;->h:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v2, p0, La10;->g:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v2, Landroid/widget/CheckBox;

    .line 13
    .line 14
    check-cast v1, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;

    .line 15
    .line 16
    check-cast v0, Landroid/app/Dialog;

    .line 17
    .line 18
    sget-object p1, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->d0:[I

    .line 19
    .line 20
    invoke-virtual {v2}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/phuongpn/whousemywifi/networkscanner/MainActivity;->C()Landroid/content/SharedPreferences;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string v1, "ratedialog"

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-interface {p1, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 38
    .line 39
    .line 40
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 41
    .line 42
    .line 43
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_0
    check-cast v2, Lc10;

    .line 51
    .line 52
    check-cast v1, Lb10;

    .line 53
    .line 54
    check-cast v0, Ld10;

    .line 55
    .line 56
    iget-object p1, v2, Lc10;->k:Lpy;

    .line 57
    .line 58
    check-cast p1, Lfa0;

    .line 59
    .line 60
    iget-object v1, v1, Lb10;->A:Landroid/widget/Button;

    .line 61
    .line 62
    invoke-virtual {p1, v1, v0}, Lfa0;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :pswitch_1
    check-cast v2, Lc10;

    .line 67
    .line 68
    check-cast v1, Lb10;

    .line 69
    .line 70
    check-cast v0, Ld10;

    .line 71
    .line 72
    iget-object p1, v2, Lc10;->k:Lpy;

    .line 73
    .line 74
    check-cast p1, Lfa0;

    .line 75
    .line 76
    iget-object v1, v1, Lwo0;->a:Landroid/view/View;

    .line 77
    .line 78
    const-string v2, "itemView"

    .line 79
    .line 80
    invoke-static {v1, v2}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v1, v0}, Lfa0;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
