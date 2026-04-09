.class public abstract Lfg/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfg/b$a;
    }
.end annotation


# static fields
.field private static final a:Lgg/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfg/a;

    invoke-direct {v0}, Lfg/a;-><init>()V

    invoke-static {v0}, Leg/a;->d(Ljava/util/concurrent/Callable;)Lgg/y;

    move-result-object v0

    sput-object v0, Lfg/b;->a:Lgg/y;

    return-void
.end method

.method public static synthetic a()Lgg/y;
    .locals 1

    invoke-static {}, Lfg/b;->f()Lgg/y;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Landroid/os/Looper;Z)Lgg/y;
    .locals 0

    invoke-static {p0, p1}, Lfg/b;->e(Landroid/os/Looper;Z)Lgg/y;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/os/Looper;)Lgg/y;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lfg/b;->d(Landroid/os/Looper;Z)Lgg/y;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/os/Looper;Z)Lgg/y;
    .locals 0

    if-eqz p0, :cond_0

    invoke-static {p0, p1}, Lfg/b;->e(Landroid/os/Looper;Z)Lgg/y;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "looper == null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static e(Landroid/os/Looper;Z)Lgg/y;
    .locals 2

    new-instance v0, Lfg/c;

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-direct {v0, v1, p1}, Lfg/c;-><init>(Landroid/os/Handler;Z)V

    return-object v0
.end method

.method private static synthetic f()Lgg/y;
    .locals 1

    sget-object v0, Lfg/b$a;->a:Lgg/y;

    return-object v0
.end method

.method public static g()Lgg/y;
    .locals 1

    sget-object v0, Lfg/b;->a:Lgg/y;

    invoke-static {v0}, Leg/a;->e(Lgg/y;)Lgg/y;

    move-result-object v0

    return-object v0
.end method
