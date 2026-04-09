.class public final Ltd0;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/view/ActionProvider$VisibilityListener;


# instance fields
.field public a:Lug0;

.field public final b:Landroid/view/ActionProvider;


# direct methods
.method public constructor <init>(Lwd0;Landroid/view/ActionProvider;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Ltd0;->b:Landroid/view/ActionProvider;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onActionProviderVisibilityChanged(Z)V
    .locals 1

    .line 1
    iget-object p1, p0, Ltd0;->a:Lug0;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p1, Lug0;->g:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Lsd0;

    .line 8
    .line 9
    iget-object p1, p1, Lsd0;->n:Lod0;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p1, Lod0;->h:Z

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Lod0;->p(Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
