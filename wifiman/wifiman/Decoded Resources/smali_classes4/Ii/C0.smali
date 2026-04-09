.class public abstract LIi/C0;
.super LNi/n;
.source "SourceFile"

# interfaces
.implements LIi/e0;
.implements LIi/u0;


# instance fields
.field public d:LIi/D0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LNi/n;-><init>()V

    return-void
.end method


# virtual methods
.method public b()LIi/I0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public dispose()V
    .locals 1

    invoke-virtual {p0}, LIi/C0;->t()LIi/D0;

    move-result-object v0

    invoke-virtual {v0, p0}, LIi/D0;->A0(LIi/C0;)V

    return-void
.end method

.method public isActive()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final t()LIi/D0;
    .locals 1

    iget-object v0, p0, LIi/C0;->d:LIi/D0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "job"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, LIi/S;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, LIi/S;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[job@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LIi/C0;->t()LIi/D0;

    move-result-object v1

    invoke-static {v1}, LIi/S;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract u()Z
.end method

.method public abstract v(Ljava/lang/Throwable;)V
.end method

.method public final w(LIi/D0;)V
    .locals 0

    iput-object p1, p0, LIi/C0;->d:LIi/D0;

    return-void
.end method
