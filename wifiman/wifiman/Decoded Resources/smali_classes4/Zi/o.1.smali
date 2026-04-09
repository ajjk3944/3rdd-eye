.class public abstract LZi/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    :try_start_0
    const-string v0, "java.lang.ClassValue"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x1

    goto :goto_0

    :catchall_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, LZi/o;->a:Z

    return-void
.end method

.method public static final a(Lmh/l;)LZi/S0;
    .locals 1

    const-string v0, "factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, LZi/o;->a:Z

    if-eqz v0, :cond_0

    new-instance v0, LZi/t;

    invoke-direct {v0, p0}, LZi/t;-><init>(Lmh/l;)V

    goto :goto_0

    :cond_0
    new-instance v0, LZi/y;

    invoke-direct {v0, p0}, LZi/y;-><init>(Lmh/l;)V

    :goto_0
    return-object v0
.end method

.method public static final b(Lmh/p;)LZi/z0;
    .locals 1

    const-string v0, "factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, LZi/o;->a:Z

    if-eqz v0, :cond_0

    new-instance v0, LZi/u;

    invoke-direct {v0, p0}, LZi/u;-><init>(Lmh/p;)V

    goto :goto_0

    :cond_0
    new-instance v0, LZi/z;

    invoke-direct {v0, p0}, LZi/z;-><init>(Lmh/p;)V

    :goto_0
    return-object v0
.end method
