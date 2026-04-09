.class public final Loc0;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:I

.field public final synthetic c:Lpc0;


# direct methods
.method public constructor <init>(Lpc0;ZI)V
    .locals 0

    .line 1
    iput-object p1, p0, Loc0;->c:Lpc0;

    .line 2
    .line 3
    iput-boolean p2, p0, Loc0;->a:Z

    .line 4
    .line 5
    iput p3, p0, Loc0;->b:I

    .line 6
    .line 7
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    .line 1
    iget-object p1, p0, Loc0;->c:Lpc0;

    .line 2
    .line 3
    iget-object v0, p1, Lmb0;->b:Landroid/view/View;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationX(F)V

    .line 7
    .line 8
    .line 9
    iget-boolean v0, p0, Loc0;->a:Z

    .line 10
    .line 11
    iget v2, p0, Loc0;->b:I

    .line 12
    .line 13
    invoke-virtual {p1, v1, v0, v2}, Lpc0;->a(FZI)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
