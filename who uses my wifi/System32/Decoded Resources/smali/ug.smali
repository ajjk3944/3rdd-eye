.class public final synthetic Lug;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Ly50;


# instance fields
.field public final synthetic f:Laj0;

.field public final synthetic g:Lch;


# direct methods
.method public synthetic constructor <init>(Laj0;Lch;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lug;->f:Laj0;

    .line 5
    .line 6
    iput-object p2, p0, Lug;->g:Lch;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lb60;Lt50;)V
    .locals 0

    .line 1
    sget-object p1, Lt50;->ON_CREATE:Lt50;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lug;->g:Lch;

    .line 6
    .line 7
    invoke-static {p1}, Lyg;->a(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p2, p0, Lug;->f:Laj0;

    .line 12
    .line 13
    iput-object p1, p2, Laj0;->e:Landroid/window/OnBackInvokedDispatcher;

    .line 14
    .line 15
    iget-boolean p1, p2, Laj0;->g:Z

    .line 16
    .line 17
    invoke-virtual {p2, p1}, Laj0;->d(Z)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method
