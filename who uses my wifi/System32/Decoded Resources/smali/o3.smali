.class public final Lo3;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic f:Landroidx/appcompat/app/AlertController$RecycleListView;

.field public final synthetic g:Ls3;

.field public final synthetic h:Lp3;


# direct methods
.method public constructor <init>(Lp3;Landroidx/appcompat/app/AlertController$RecycleListView;Ls3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo3;->h:Lp3;

    .line 5
    .line 6
    iput-object p2, p0, Lo3;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 7
    .line 8
    iput-object p3, p0, Lo3;->g:Ls3;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    iget-object p1, p0, Lo3;->h:Lp3;

    .line 2
    .line 3
    iget-object p2, p1, Lp3;->p:[Z

    .line 4
    .line 5
    iget-object p4, p0, Lo3;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p4, p3}, Landroid/widget/AbsListView;->isItemChecked(I)Z

    .line 10
    .line 11
    .line 12
    move-result p5

    .line 13
    aput-boolean p5, p2, p3

    .line 14
    .line 15
    :cond_0
    iget-object p1, p1, Lp3;->t:Ljf0;

    .line 16
    .line 17
    iget-object p2, p0, Lo3;->g:Ls3;

    .line 18
    .line 19
    iget-object p2, p2, Ls3;->b:Lu3;

    .line 20
    .line 21
    invoke-virtual {p4, p3}, Landroid/widget/AbsListView;->isItemChecked(I)Z

    .line 22
    .line 23
    .line 24
    move-result p4

    .line 25
    invoke-virtual {p1, p2, p3, p4}, Ljf0;->onClick(Landroid/content/DialogInterface;IZ)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
