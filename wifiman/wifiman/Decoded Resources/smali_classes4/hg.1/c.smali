.class public interface abstract Lhg/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static l(Ljava/lang/Runnable;)Lhg/c;
    .locals 1

    const-string v0, "run is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lhg/f;

    invoke-direct {v0, p0}, Lhg/f;-><init>(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public static n()Lhg/c;
    .locals 1

    sget-object v0, Llg/c;->INSTANCE:Llg/c;

    return-object v0
.end method

.method public static p(Lkg/a;)Lhg/c;
    .locals 1

    const-string v0, "action is null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lhg/a;

    invoke-direct {v0, p0}, Lhg/a;-><init>(Lkg/a;)V

    return-object v0
.end method

.method public static r()Lhg/c;
    .locals 1

    sget-object v0, Lmg/a;->b:Ljava/lang/Runnable;

    invoke-static {v0}, Lhg/c;->l(Ljava/lang/Runnable;)Lhg/c;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract dispose()V
.end method

.method public abstract isDisposed()Z
.end method
