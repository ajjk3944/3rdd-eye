.class public final Luc0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final a:Landroid/adservices/measurement/MeasurementManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-static {}, Ltc0;->m()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v0, "context.getSystemService\u2026:class.java\n            )"

    .line 10
    .line 11
    invoke-static {p1, v0}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Ltc0;->d(Ljava/lang/Object;)Landroid/adservices/measurement/MeasurementManager;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Luc0;->a:Landroid/adservices/measurement/MeasurementManager;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public a(Lco;Loj;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco;",
            "Loj;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p1, Lkd;

    .line 2
    .line 3
    invoke-static {p2}, Luk2;->r(Loj;)Loj;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-direct {p1, v0, p2}, Lkd;-><init>(ILoj;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lkd;->u()V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Ltc0;->o()V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    throw p1
.end method

.method public b(Loj;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loj;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkd;

    .line 2
    .line 3
    invoke-static {p1}, Luk2;->r(Loj;)Loj;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p1}, Lkd;-><init>(ILoj;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lkd;->u()V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Luc0;->a:Landroid/adservices/measurement/MeasurementManager;

    .line 15
    .line 16
    new-instance v1, Li8;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-direct {v1, v2}, Li8;-><init>(I)V

    .line 20
    .line 21
    .line 22
    new-instance v2, Lsj;

    .line 23
    .line 24
    invoke-direct {v2, v0}, Lsj;-><init>(Lkd;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v1, v2}, Ltc0;->p(Landroid/adservices/measurement/MeasurementManager;Li8;Landroid/os/OutcomeReceiver;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lkd;->t()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
.end method

.method public c(Landroid/net/Uri;Landroid/view/InputEvent;Loj;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Landroid/view/InputEvent;",
            "Loj;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkd;

    .line 2
    .line 3
    invoke-static {p3}, Luk2;->r(Loj;)Loj;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p3}, Lkd;-><init>(ILoj;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lkd;->u()V

    .line 12
    .line 13
    .line 14
    iget-object p3, p0, Luc0;->a:Landroid/adservices/measurement/MeasurementManager;

    .line 15
    .line 16
    new-instance v1, Li8;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-direct {v1, v2}, Li8;-><init>(I)V

    .line 20
    .line 21
    .line 22
    new-instance v2, Lsj;

    .line 23
    .line 24
    invoke-direct {v2, v0}, Lsj;-><init>(Lkd;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p3, p1, p2, v1, v2}, Ltc0;->r(Landroid/adservices/measurement/MeasurementManager;Landroid/net/Uri;Landroid/view/InputEvent;Li8;Landroid/os/OutcomeReceiver;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lkd;->t()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    sget-object p2, Lrk;->f:Lrk;

    .line 35
    .line 36
    if-ne p1, p2, :cond_0

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_0
    sget-object p1, Lz31;->a:Lz31;

    .line 40
    .line 41
    return-object p1
.end method

.method public d(Landroid/net/Uri;Loj;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Loj;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkd;

    .line 2
    .line 3
    invoke-static {p2}, Luk2;->r(Loj;)Loj;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p2}, Lkd;-><init>(ILoj;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lkd;->u()V

    .line 12
    .line 13
    .line 14
    iget-object p2, p0, Luc0;->a:Landroid/adservices/measurement/MeasurementManager;

    .line 15
    .line 16
    new-instance v1, Li8;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-direct {v1, v2}, Li8;-><init>(I)V

    .line 20
    .line 21
    .line 22
    new-instance v2, Lsj;

    .line 23
    .line 24
    invoke-direct {v2, v0}, Lsj;-><init>(Lkd;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p2, p1, v1, v2}, Ltc0;->q(Landroid/adservices/measurement/MeasurementManager;Landroid/net/Uri;Li8;Landroid/os/OutcomeReceiver;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lkd;->t()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    sget-object p2, Lrk;->f:Lrk;

    .line 35
    .line 36
    if-ne p1, p2, :cond_0

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_0
    sget-object p1, Lz31;->a:Lz31;

    .line 40
    .line 41
    return-object p1
.end method

.method public e(La81;Loj;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La81;",
            "Loj;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p1, Lkd;

    .line 2
    .line 3
    invoke-static {p2}, Luk2;->r(Loj;)Loj;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-direct {p1, v0, p2}, Lkd;-><init>(ILoj;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lkd;->u()V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Ltc0;->w()V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    throw p1
.end method

.method public f(Lb81;Loj;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb81;",
            "Loj;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p1, Lkd;

    .line 2
    .line 3
    invoke-static {p2}, Luk2;->r(Loj;)Loj;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-direct {p1, v0, p2}, Lkd;-><init>(ILoj;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lkd;->u()V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Ltc0;->x()V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    throw p1
.end method
