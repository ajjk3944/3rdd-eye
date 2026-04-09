.class public abstract Lv4/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv4/f$b;
    }
.end annotation


# static fields
.field public static final a:Ly4/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv4/f$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lv4/f$b;-><init>(Lv4/f$a;)V

    sput-object v0, Lv4/f;->a:Ly4/b$a;

    return-void
.end method

.method public static a(Lo4/v;)Ly4/c;
    .locals 7

    invoke-static {}, Ly4/c;->a()Ly4/c$b;

    move-result-object v0

    invoke-virtual {p0}, Lo4/v;->d()Ly4/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly4/c$b;->d(Ly4/a;)Ly4/c$b;

    invoke-virtual {p0}, Lo4/v;->c()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo4/v$c;

    invoke-virtual {v3}, Lo4/v$c;->h()LA4/z;

    move-result-object v4

    invoke-static {v4}, Lv4/f;->c(LA4/z;)Lo4/k;

    move-result-object v4

    invoke-virtual {v3}, Lo4/v$c;->d()I

    move-result v5

    invoke-virtual {v3}, Lo4/v$c;->e()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lv4/f;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Lo4/v$c;->f()LA4/I;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v4, v5, v6, v3}, Ly4/c$b;->a(Lo4/k;ILjava/lang/String;Ljava/lang/String;)Ly4/c$b;

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lo4/v;->e()Lo4/v$c;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lo4/v;->e()Lo4/v$c;

    move-result-object p0

    invoke-virtual {p0}, Lo4/v$c;->d()I

    move-result p0

    invoke-virtual {v0, p0}, Ly4/c$b;->e(I)Ly4/c$b;

    :cond_2
    :try_start_0
    invoke-virtual {v0}, Ly4/c$b;->b()Ly4/c;

    move-result-object p0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method private static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string/jumbo v0, "type.googleapis.com/google.crypto."

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    const/16 v0, 0x22

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static c(LA4/z;)Lo4/k;
    .locals 1

    sget-object v0, Lv4/f$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, Lo4/k;->d:Lo4/k;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string/jumbo v0, "Unknown key status"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    sget-object p0, Lo4/k;->c:Lo4/k;

    return-object p0

    :cond_2
    sget-object p0, Lo4/k;->b:Lo4/k;

    return-object p0
.end method
