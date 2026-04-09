.class public LV4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LW4/c;

.field private final b:LW4/a;


# direct methods
.method public constructor <init>(LW4/a;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, LV4/b;->b:LW4/a;

    iput-object p1, p0, LV4/b;->a:LW4/c;

    return-void

    :cond_0
    invoke-virtual {p1}, LW4/a;->b()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/common/util/g;->d()Lcom/google/android/gms/common/util/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/d;->a()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, LW4/a;->k(J)V

    :cond_1
    iput-object p1, p0, LV4/b;->b:LW4/a;

    new-instance v0, LW4/c;

    invoke-direct {v0, p1}, LW4/c;-><init>(LW4/a;)V

    iput-object v0, p0, LV4/b;->a:LW4/c;

    return-void
.end method


# virtual methods
.method public a()Landroid/net/Uri;
    .locals 2

    iget-object v0, p0, LV4/b;->b:LW4/a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0}, LW4/a;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v1
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, LV4/b;->b:LW4/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, LW4/a;->i()I

    move-result v0

    return v0
.end method
