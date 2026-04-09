.class public final LI1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LI1/d$a;,
        LI1/d$b;
    }
.end annotation


# instance fields
.field private final a:LI1/d$b;


# direct methods
.method private constructor <init>(LI1/d$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI1/d;->a:LI1/d$b;

    return-void
.end method

.method public static f(Ljava/lang/Object;)LI1/d;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, LI1/d;

    new-instance v1, LI1/d$a;

    invoke-direct {v1, p0}, LI1/d$a;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, LI1/d;-><init>(LI1/d$b;)V

    return-object v0
.end method


# virtual methods
.method public a()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, LI1/d;->a:LI1/d$b;

    invoke-interface {v0}, LI1/d$b;->b()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public b()Landroid/content/ClipDescription;
    .locals 1

    iget-object v0, p0, LI1/d;->a:LI1/d$b;

    invoke-interface {v0}, LI1/d$b;->a()Landroid/content/ClipDescription;

    move-result-object v0

    return-object v0
.end method

.method public c()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, LI1/d;->a:LI1/d$b;

    invoke-interface {v0}, LI1/d$b;->d()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, LI1/d;->a:LI1/d$b;

    invoke-interface {v0}, LI1/d$b;->c()V

    return-void
.end method

.method public e()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LI1/d;->a:LI1/d$b;

    invoke-interface {v0}, LI1/d$b;->e()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
