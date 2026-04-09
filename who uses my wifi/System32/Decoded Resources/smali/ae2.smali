.class public abstract Lae2;
.super Landroid/view/TextureView;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lle2;


# instance fields
.field public final f:Lge2;

.field public final g:Lme2;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/view/TextureView;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lge2;

    .line 5
    .line 6
    invoke-direct {v0}, Lge2;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lae2;->f:Lge2;

    .line 10
    .line 11
    new-instance v0, Lme2;

    .line 12
    .line 13
    invoke-direct {v0, p1, p0}, Lme2;-><init>(Landroid/content/Context;Lae2;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lae2;->g:Lme2;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public A(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lae2;->f(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public B(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public C(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public a(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public b(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public c(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e(Lee2;)V
.end method

.method public abstract f(Ljava/lang/String;)V
.end method

.method public abstract g()V
.end method

.method public abstract h()V
.end method

.method public abstract i()V
.end method

.method public abstract j()I
.end method

.method public abstract k()I
.end method

.method public abstract l(I)V
.end method

.method public abstract n(FF)V
.end method

.method public abstract o()I
.end method

.method public abstract p()I
.end method

.method public abstract q()J
.end method

.method public abstract r()J
.end method

.method public abstract s()J
.end method

.method public abstract y()I
.end method

.method public z()Ljava/lang/Integer;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method
