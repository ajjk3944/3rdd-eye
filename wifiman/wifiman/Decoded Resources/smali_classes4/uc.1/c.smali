.class public final Luc/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Luc/c$a;,
        Luc/c$b;
    }
.end annotation


# static fields
.field public static final b:Luc/c$a;


# instance fields
.field private final a:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Luc/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Luc/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Luc/c;->b:Luc/c$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Luc/b;

    invoke-direct {v0, p1}, Luc/b;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, Luc/c;->a:LYg/m;

    return-void
.end method

.method public static synthetic b(Landroid/content/Context;)Landroid/os/Vibrator;
    .locals 0

    invoke-static {p0}, Luc/c;->e(Landroid/content/Context;)Landroid/os/Vibrator;

    move-result-object p0

    return-object p0
.end method

.method private final c()Landroid/os/Vibrator;
    .locals 1

    iget-object v0, p0, Luc/c;->a:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Vibrator;

    return-object v0
.end method

.method private final d(Luc/a$a;Landroid/os/Vibrator;)V
    .locals 2

    sget-object v0, Luc/c$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const-wide/16 v0, 0xc8

    const/16 p1, 0x50

    invoke-static {v0, v1, p1}, Landroid/os/VibrationEffect;->createOneShot(JI)Landroid/os/VibrationEffect;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;)V

    return-void

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private static final e(Landroid/content/Context;)Landroid/os/Vibrator;
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    const/4 v2, 0x0

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "vibrator_manager"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lka/b;->a(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lka/c;->a(Ljava/lang/Object;)Landroid/os/VibratorManager;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v2

    :goto_0
    if-eqz p0, :cond_5

    invoke-static {p0}, Lka/d;->a(Landroid/os/VibratorManager;)Landroid/os/Vibrator;

    move-result-object v2

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "vibrator"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Landroid/os/Vibrator;

    if-eqz v0, :cond_2

    check-cast p0, Landroid/os/Vibrator;

    goto :goto_1

    :cond_2
    move-object p0, v2

    :goto_1
    const/4 v0, 0x2

    if-nez p0, :cond_3

    const-string p0, "Vibrator service unavailable"

    invoke-static {p0, v2, v0, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Landroid/os/Vibrator;->hasVibrator()Z

    move-result v1

    if-nez v1, :cond_4

    const-string p0, "Vibrator unavailable on the device"

    invoke-static {p0, v2, v0, v2}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_2

    :cond_4
    move-object v2, p0

    :cond_5
    :goto_2
    return-object v2
.end method


# virtual methods
.method public a(Luc/a$a;)V
    .locals 2

    const-string v0, "pattern"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Luc/c;->c()Landroid/os/Vibrator;

    move-result-object v0

    if-nez v0, :cond_0

    const-string p1, "Skipping vibration since vibrator is not available on the device"

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_0
    invoke-direct {p0}, Luc/c;->c()Landroid/os/Vibrator;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/os/Vibrator;->cancel()V

    invoke-direct {p0}, Luc/c;->c()Landroid/os/Vibrator;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {p0, p1, v0}, Luc/c;->d(Luc/a$a;Landroid/os/Vibrator;)V

    return-void
.end method
