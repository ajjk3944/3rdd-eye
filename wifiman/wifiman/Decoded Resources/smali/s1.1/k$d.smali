.class public Ls1/k$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field A:Z

.field B:Z

.field C:Ljava/lang/String;

.field D:Landroid/os/Bundle;

.field E:I

.field F:I

.field G:Landroid/app/Notification;

.field H:Landroid/widget/RemoteViews;

.field I:Landroid/widget/RemoteViews;

.field J:Landroid/widget/RemoteViews;

.field K:Ljava/lang/String;

.field L:I

.field M:Ljava/lang/String;

.field N:J

.field O:I

.field P:I

.field Q:Z

.field R:Landroid/app/Notification;

.field S:Z

.field T:Ljava/lang/Object;

.field public U:Ljava/util/ArrayList;

.field public a:Landroid/content/Context;

.field public b:Ljava/util/ArrayList;

.field public c:Ljava/util/ArrayList;

.field d:Ljava/util/ArrayList;

.field e:Ljava/lang/CharSequence;

.field f:Ljava/lang/CharSequence;

.field g:Landroid/app/PendingIntent;

.field h:Landroid/app/PendingIntent;

.field i:Landroid/widget/RemoteViews;

.field j:Landroidx/core/graphics/drawable/IconCompat;

.field k:Ljava/lang/CharSequence;

.field l:I

.field m:I

.field n:Z

.field o:Z

.field p:Ls1/k$e;

.field q:Ljava/lang/CharSequence;

.field r:Ljava/lang/CharSequence;

.field s:[Ljava/lang/CharSequence;

.field t:I

.field u:I

.field v:Z

.field w:Ljava/lang/String;

.field x:Z

.field y:Ljava/lang/String;

.field z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 20
    invoke-direct {p0, p1, v0}, Ls1/k$d;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ls1/k$d;->b:Ljava/util/ArrayList;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ls1/k$d;->c:Ljava/util/ArrayList;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ls1/k$d;->d:Ljava/util/ArrayList;

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Ls1/k$d;->n:Z

    const/4 v1, 0x0

    .line 6
    iput-boolean v1, p0, Ls1/k$d;->z:Z

    .line 7
    iput v1, p0, Ls1/k$d;->E:I

    .line 8
    iput v1, p0, Ls1/k$d;->F:I

    .line 9
    iput v1, p0, Ls1/k$d;->L:I

    .line 10
    iput v1, p0, Ls1/k$d;->O:I

    .line 11
    iput v1, p0, Ls1/k$d;->P:I

    .line 12
    new-instance v2, Landroid/app/Notification;

    invoke-direct {v2}, Landroid/app/Notification;-><init>()V

    iput-object v2, p0, Ls1/k$d;->R:Landroid/app/Notification;

    .line 13
    iput-object p1, p0, Ls1/k$d;->a:Landroid/content/Context;

    .line 14
    iput-object p2, p0, Ls1/k$d;->K:Ljava/lang/String;

    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, v2, Landroid/app/Notification;->when:J

    .line 16
    iget-object p1, p0, Ls1/k$d;->R:Landroid/app/Notification;

    const/4 p2, -0x1

    iput p2, p1, Landroid/app/Notification;->audioStreamType:I

    .line 17
    iput v1, p0, Ls1/k$d;->m:I

    .line 18
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ls1/k$d;->U:Ljava/util/ArrayList;

    .line 19
    iput-boolean v0, p0, Ls1/k$d;->Q:Z

    return-void
.end method

.method protected static d(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 2

    if-nez p0, :cond_0

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/16 v1, 0x1400

    if-le v0, v1, :cond_1

    const/4 v0, 0x0

    invoke-interface {p0, v0, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method private m(IZ)V
    .locals 1

    if-eqz p2, :cond_0

    iget-object p2, p0, Ls1/k$d;->R:Landroid/app/Notification;

    iget v0, p2, Landroid/app/Notification;->flags:I

    or-int/2addr p1, v0

    iput p1, p2, Landroid/app/Notification;->flags:I

    goto :goto_0

    :cond_0
    iget-object p2, p0, Ls1/k$d;->R:Landroid/app/Notification;

    iget v0, p2, Landroid/app/Notification;->flags:I

    not-int p1, p1

    and-int/2addr p1, v0

    iput p1, p2, Landroid/app/Notification;->flags:I

    :goto_0
    return-void
.end method


# virtual methods
.method public a(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Ls1/k$d;
    .locals 2

    iget-object v0, p0, Ls1/k$d;->b:Ljava/util/ArrayList;

    new-instance v1, Ls1/k$a;

    invoke-direct {v1, p1, p2, p3}, Ls1/k$a;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public b()Landroid/app/Notification;
    .locals 1

    new-instance v0, Ls1/l;

    invoke-direct {v0, p0}, Ls1/l;-><init>(Ls1/k$d;)V

    invoke-virtual {v0}, Ls1/l;->c()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method public c()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Ls1/k$d;->D:Landroid/os/Bundle;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Ls1/k$d;->D:Landroid/os/Bundle;

    :cond_0
    iget-object v0, p0, Ls1/k$d;->D:Landroid/os/Bundle;

    return-object v0
.end method

.method public e(Z)Ls1/k$d;
    .locals 1

    const/16 v0, 0x10

    invoke-direct {p0, v0, p1}, Ls1/k$d;->m(IZ)V

    return-object p0
.end method

.method public f(Ljava/lang/String;)Ls1/k$d;
    .locals 0

    iput-object p1, p0, Ls1/k$d;->C:Ljava/lang/String;

    return-object p0
.end method

.method public g(Ljava/lang/String;)Ls1/k$d;
    .locals 0

    iput-object p1, p0, Ls1/k$d;->K:Ljava/lang/String;

    return-object p0
.end method

.method public h(I)Ls1/k$d;
    .locals 0

    iput p1, p0, Ls1/k$d;->E:I

    return-object p0
.end method

.method public i(Z)Ls1/k$d;
    .locals 0

    iput-boolean p1, p0, Ls1/k$d;->A:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Ls1/k$d;->B:Z

    return-object p0
.end method

.method public j(Landroid/app/PendingIntent;)Ls1/k$d;
    .locals 0

    iput-object p1, p0, Ls1/k$d;->g:Landroid/app/PendingIntent;

    return-object p0
.end method

.method public k(Ljava/lang/CharSequence;)Ls1/k$d;
    .locals 0

    invoke-static {p1}, Ls1/k$d;->d(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Ls1/k$d;->f:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public l(Ljava/lang/CharSequence;)Ls1/k$d;
    .locals 0

    invoke-static {p1}, Ls1/k$d;->d(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Ls1/k$d;->e:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public n(I)Ls1/k$d;
    .locals 0

    iput p1, p0, Ls1/k$d;->P:I

    return-object p0
.end method

.method public o(Z)Ls1/k$d;
    .locals 0

    iput-boolean p1, p0, Ls1/k$d;->z:Z

    return-object p0
.end method

.method public p(Z)Ls1/k$d;
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Ls1/k$d;->m(IZ)V

    return-object p0
.end method

.method public q(Z)Ls1/k$d;
    .locals 1

    const/16 v0, 0x8

    invoke-direct {p0, v0, p1}, Ls1/k$d;->m(IZ)V

    return-object p0
.end method

.method public r(I)Ls1/k$d;
    .locals 0

    iput p1, p0, Ls1/k$d;->m:I

    return-object p0
.end method

.method public s(IIZ)Ls1/k$d;
    .locals 0

    iput p1, p0, Ls1/k$d;->t:I

    iput p2, p0, Ls1/k$d;->u:I

    iput-boolean p3, p0, Ls1/k$d;->v:Z

    return-object p0
.end method

.method public t(I)Ls1/k$d;
    .locals 1

    iget-object v0, p0, Ls1/k$d;->R:Landroid/app/Notification;

    iput p1, v0, Landroid/app/Notification;->icon:I

    return-object p0
.end method

.method public u(Ls1/k$e;)Ls1/k$d;
    .locals 1

    iget-object v0, p0, Ls1/k$d;->p:Ls1/k$e;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Ls1/k$d;->p:Ls1/k$e;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, Ls1/k$e;->g(Ls1/k$d;)V

    :cond_0
    return-object p0
.end method

.method public v(Ljava/lang/CharSequence;)Ls1/k$d;
    .locals 1

    iget-object v0, p0, Ls1/k$d;->R:Landroid/app/Notification;

    invoke-static {p1}, Ls1/k$d;->d(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public w(I)Ls1/k$d;
    .locals 0

    iput p1, p0, Ls1/k$d;->F:I

    return-object p0
.end method

.method public x(J)Ls1/k$d;
    .locals 1

    iget-object v0, p0, Ls1/k$d;->R:Landroid/app/Notification;

    iput-wide p1, v0, Landroid/app/Notification;->when:J

    return-object p0
.end method
