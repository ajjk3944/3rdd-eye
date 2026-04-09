.class public final LA8/o$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA8/o;->w0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LA8/o;


# direct methods
.method public constructor <init>(LA8/o;)V
    .locals 0

    iput-object p1, p0, LA8/o$o;->a:LA8/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, LA8/o$o;->a:LA8/o;

    invoke-static {v0}, LA8/o;->M0(LA8/o;)LA8/z;

    move-result-object v0

    invoke-virtual {v0}, Lh7/g;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LA8/o$o;->a:LA8/o;

    invoke-static {v0}, LA8/o;->M0(LA8/o;)LA8/z;

    move-result-object v0

    invoke-virtual {v0}, Lh7/g;->F()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LA8/o$o;->a:LA8/o;

    invoke-static {v0}, LA8/o;->M0(LA8/o;)LA8/z;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lh7/g;->d(Z)V

    iget-object v0, p0, LA8/o$o;->a:LA8/o;

    invoke-static {v0}, LA8/o;->M0(LA8/o;)LA8/z;

    move-result-object v0

    invoke-virtual {v0, v1}, Lh7/g;->f(Z)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, LA8/o$o;->a:LA8/o;

    invoke-static {v0}, LA8/o;->M0(LA8/o;)LA8/z;

    move-result-object v0

    invoke-virtual {v0}, Lh7/g;->p()V

    :goto_0
    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
