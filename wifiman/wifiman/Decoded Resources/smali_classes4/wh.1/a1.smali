.class public abstract Lwh/a1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwh/a1$a;,
        Lwh/a1$b;
    }
.end annotation


# direct methods
.method private static synthetic a(I)V
    .locals 2

    const-string p0, "kotlin/reflect/jvm/internal/ReflectProperties"

    const-string v0, "lazySoft"

    const-string v1, "initializer"

    filled-new-array {v1, p0, v0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static b(Ljava/lang/Object;Lmh/a;)Lwh/a1$a;
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, Lwh/a1;->a(I)V

    :cond_0
    new-instance v0, Lwh/a1$a;

    invoke-direct {v0, p0, p1}, Lwh/a1$a;-><init>(Ljava/lang/Object;Lmh/a;)V

    return-object v0
.end method

.method public static c(Lmh/a;)Lwh/a1$a;
    .locals 1

    if-nez p0, :cond_0

    const/4 v0, 0x1

    invoke-static {v0}, Lwh/a1;->a(I)V

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0, p0}, Lwh/a1;->b(Ljava/lang/Object;Lmh/a;)Lwh/a1$a;

    move-result-object p0

    return-object p0
.end method
