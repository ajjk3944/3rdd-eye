.class public final Ll82;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic f:I

.field public final synthetic g:Lm82;


# direct methods
.method public synthetic constructor <init>(Lm82;I)V
    .locals 0

    .line 1
    iput p2, p0, Ll82;->f:I

    .line 2
    .line 3
    iput-object p1, p0, Ll82;->g:Lm82;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 5

    .line 1
    iget p1, p0, Ll82;->f:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ll82;->g:Lm82;

    .line 7
    .line 8
    const-string p2, "Operation denied by user."

    .line 9
    .line 10
    invoke-virtual {p1, p2}, Lgw3;->G(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object p1, p0, Ll82;->g:Lm82;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance p2, Landroid/content/Intent;

    .line 20
    .line 21
    const-string v0, "android.intent.action.EDIT"

    .line 22
    .line 23
    invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sget-object v0, Landroid/provider/CalendarContract$Events;->CONTENT_URI:Landroid/net/Uri;

    .line 27
    .line 28
    invoke-virtual {p2, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    const-string v0, "title"

    .line 33
    .line 34
    iget-object v1, p1, Lm82;->k:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 37
    .line 38
    .line 39
    const-string v0, "eventLocation"

    .line 40
    .line 41
    iget-object v1, p1, Lm82;->o:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 44
    .line 45
    .line 46
    const-string v0, "description"

    .line 47
    .line 48
    iget-object v1, p1, Lm82;->n:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 51
    .line 52
    .line 53
    iget-wide v0, p1, Lm82;->l:J

    .line 54
    .line 55
    const-wide/16 v2, -0x1

    .line 56
    .line 57
    cmp-long v4, v0, v2

    .line 58
    .line 59
    if-lez v4, :cond_0

    .line 60
    .line 61
    const-string v4, "beginTime"

    .line 62
    .line 63
    invoke-virtual {p2, v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 64
    .line 65
    .line 66
    :cond_0
    iget-wide v0, p1, Lm82;->m:J

    .line 67
    .line 68
    cmp-long v2, v0, v2

    .line 69
    .line 70
    if-lez v2, :cond_1

    .line 71
    .line 72
    const-string v2, "endTime"

    .line 73
    .line 74
    invoke-virtual {p2, v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 75
    .line 76
    .line 77
    :cond_1
    const/high16 v0, 0x10000000

    .line 78
    .line 79
    invoke-virtual {p2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 80
    .line 81
    .line 82
    sget-object v0, Lhg4;->C:Lhg4;

    .line 83
    .line 84
    iget-object v0, v0, Lhg4;->c:Llf4;

    .line 85
    .line 86
    iget-object p1, p1, Lm82;->j:Landroid/app/Activity;

    .line 87
    .line 88
    invoke-static {p1, p2}, Llf4;->s(Landroid/content/Context;Landroid/content/Intent;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
