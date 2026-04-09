.class public final LB/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB/Q;
.implements LT/S0;
.implements Ljava/lang/Runnable;
.implements Landroid/view/Choreographer$FrameCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB/a$a;,
        LB/a$b;
    }
.end annotation


# static fields
.field public static final g:LB/a$a;

.field public static final h:I

.field private static i:J


# instance fields
.field private final a:Landroid/view/View;

.field private final b:LV/b;

.field private c:Z

.field private final d:Landroid/view/Choreographer;

.field private e:Z

.field private f:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LB/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LB/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LB/a;->g:LB/a$a;

    const/16 v0, 0x8

    sput v0, LB/a;->h:I

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB/a;->a:Landroid/view/View;

    new-instance v0, LV/b;

    const/16 v1, 0x10

    new-array v1, v1, [LB/O;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LV/b;-><init>([Ljava/lang/Object;I)V

    iput-object v0, p0, LB/a;->b:LV/b;

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v0

    iput-object v0, p0, LB/a;->d:Landroid/view/Choreographer;

    sget-object v0, LB/a;->g:LB/a$a;

    invoke-static {v0, p1}, LB/a$a;->a(LB/a$a;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic e()J
    .locals 2

    sget-wide v0, LB/a;->i:J

    return-wide v0
.end method

.method public static final synthetic f(J)V
    .locals 0

    sput-wide p0, LB/a;->i:J

    return-void
.end method


# virtual methods
.method public a(LB/O;)V
    .locals 1

    iget-object v0, p0, LB/a;->b:LV/b;

    invoke-virtual {v0, p1}, LV/b;->b(Ljava/lang/Object;)Z

    iget-boolean p1, p0, LB/a;->c:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, LB/a;->c:Z

    iget-object p1, p0, LB/a;->a:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, LB/a;->e:Z

    iget-object v0, p0, LB/a;->a:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, LB/a;->d:Landroid/view/Choreographer;

    invoke-virtual {v0, p0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    return-void
.end method

.method public d()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LB/a;->e:Z

    return-void
.end method

.method public doFrame(J)V
    .locals 1

    iget-boolean v0, p0, LB/a;->e:Z

    if-eqz v0, :cond_0

    iput-wide p1, p0, LB/a;->f:J

    iget-object p1, p0, LB/a;->a:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public run()V
    .locals 7

    iget-object v0, p0, LB/a;->b:LV/b;

    invoke-virtual {v0}, LV/b;->s()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_5

    iget-boolean v0, p0, LB/a;->c:Z

    if-eqz v0, :cond_5

    iget-boolean v0, p0, LB/a;->e:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, LB/a;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWindowVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    iget-wide v2, p0, LB/a;->f:J

    sget-wide v4, LB/a;->i:J

    add-long/2addr v2, v4

    new-instance v0, LB/a$b;

    invoke-direct {v0, v2, v3}, LB/a$b;-><init>(J)V

    move v2, v1

    :goto_0
    iget-object v3, p0, LB/a;->b:LV/b;

    invoke-virtual {v3}, LV/b;->u()Z

    move-result v3

    if-eqz v3, :cond_3

    if-nez v2, :cond_3

    invoke-virtual {v0}, LB/a$b;->a()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    const/4 v4, 0x1

    if-lez v3, :cond_1

    iget-object v3, p0, LB/a;->b:LV/b;

    invoke-virtual {v3}, LV/b;->m()[Ljava/lang/Object;

    move-result-object v3

    aget-object v3, v3, v1

    check-cast v3, LB/O;

    invoke-interface {v3, v0}, LB/O;->a(LB/P;)Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_1
    move v2, v4

    goto :goto_0

    :cond_2
    iget-object v3, p0, LB/a;->b:LV/b;

    invoke-virtual {v3, v1}, LV/b;->z(I)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    if-eqz v2, :cond_4

    iget-object v0, p0, LB/a;->d:Landroid/view/Choreographer;

    invoke-virtual {v0, p0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    goto :goto_1

    :cond_4
    iput-boolean v1, p0, LB/a;->c:Z

    :goto_1
    return-void

    :cond_5
    :goto_2
    iput-boolean v1, p0, LB/a;->c:Z

    return-void
.end method
