.class final Ltg/p0$a;
.super LCg/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final b:Ltg/p0$b;

.field c:Z


# direct methods
.method constructor <init>(Ltg/p0$b;)V
    .locals 0

    invoke-direct {p0}, LCg/a;-><init>()V

    iput-object p1, p0, Ltg/p0$a;->b:Ltg/p0$b;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-boolean v0, p0, Ltg/p0$a;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/p0$a;->c:Z

    iget-object v0, p0, Ltg/p0$a;->b:Ltg/p0$b;

    invoke-virtual {v0}, Ltg/p0$b;->g()V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 0

    iget-boolean p1, p0, Ltg/p0$a;->c:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Ltg/p0$a;->b:Ltg/p0$b;

    invoke-virtual {p1}, Ltg/p0$b;->m()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Ltg/p0$a;->c:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, LEg/a;->v(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ltg/p0$a;->c:Z

    iget-object v0, p0, Ltg/p0$a;->b:Ltg/p0$b;

    invoke-virtual {v0, p1}, Ltg/p0$b;->j(Ljava/lang/Throwable;)V

    return-void
.end method
