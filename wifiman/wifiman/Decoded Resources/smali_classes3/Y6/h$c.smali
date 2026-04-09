.class LY6/h$c;
.super LY6/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY6/h;->a()LY6/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LY6/h;

.field final synthetic b:LY6/h;


# direct methods
.method constructor <init>(LY6/h;LY6/h;)V
    .locals 0

    iput-object p1, p0, LY6/h$c;->b:LY6/h;

    iput-object p2, p0, LY6/h$c;->a:LY6/h;

    invoke-direct {p0}, LY6/h;-><init>()V

    return-void
.end method


# virtual methods
.method public b(LY6/k;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p1}, LY6/k;->p()Z

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, LY6/k;->r0(Z)V

    :try_start_0
    iget-object v1, p0, LY6/h$c;->a:LY6/h;

    invoke-virtual {v1, p1}, LY6/h;->b(LY6/k;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1, v0}, LY6/k;->r0(Z)V

    return-object v1

    :catchall_0
    move-exception v1

    invoke-virtual {p1, v0}, LY6/k;->r0(Z)V

    throw v1
.end method

.method d()Z
    .locals 1

    iget-object v0, p0, LY6/h$c;->a:LY6/h;

    invoke-virtual {v0}, LY6/h;->d()Z

    move-result v0

    return v0
.end method

.method public j(LY6/o;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LY6/h$c;->a:LY6/h;

    invoke-virtual {v0, p1, p2}, LY6/h;->j(LY6/o;Ljava/lang/Object;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LY6/h$c;->a:LY6/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".failOnUnknown()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
