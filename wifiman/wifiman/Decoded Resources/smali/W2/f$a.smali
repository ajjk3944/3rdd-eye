.class LW2/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW2/f$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW2/f;->a(LW2/f$b;)LW2/f$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private volatile a:Ljava/lang/Object;

.field final synthetic b:LW2/f$b;


# direct methods
.method constructor <init>(LW2/f$b;)V
    .locals 0

    iput-object p1, p0, LW2/f$a;->b:LW2/f$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LW2/f$a;->a:Ljava/lang/Object;

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LW2/f$a;->a:Ljava/lang/Object;

    if-nez v0, :cond_0

    iget-object v0, p0, LW2/f$a;->b:LW2/f$b;

    invoke-interface {v0}, LW2/f$b;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LW2/k;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LW2/f$a;->a:Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    goto :goto_2

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_2
    iget-object v0, p0, LW2/f$a;->a:Ljava/lang/Object;

    return-object v0
.end method
