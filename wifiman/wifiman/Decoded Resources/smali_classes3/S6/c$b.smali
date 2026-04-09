.class public final LS6/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/drawable/Drawable$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS6/c;-><init>(Landroid/graphics/drawable/Drawable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LS6/c;


# direct methods
.method constructor <init>(LS6/c;)V
    .locals 0

    iput-object p1, p0, LS6/c$b;->a:LS6/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    const-string/jumbo v0, "d"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LS6/c$b;->a:LS6/c;

    invoke-static {p1}, LS6/c;->p(LS6/c;)I

    move-result p1

    iget-object v0, p0, LS6/c$b;->a:LS6/c;

    add-int/lit8 p1, p1, 0x1

    invoke-static {v0, p1}, LS6/c;->q(LS6/c;I)V

    iget-object p1, p0, LS6/c$b;->a:LS6/c;

    invoke-virtual {p1}, LS6/c;->v()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0}, LS6/e;->c(Landroid/graphics/drawable/Drawable;)J

    move-result-wide v0

    invoke-static {p1, v0, v1}, LS6/c;->r(LS6/c;J)V

    return-void
.end method

.method public scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    .locals 1

    const-string/jumbo v0, "d"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "what"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LS6/e;->d()Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, p2, p3, p4}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V
    .locals 1

    const-string/jumbo v0, "d"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo p1, "what"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LS6/e;->d()Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method
