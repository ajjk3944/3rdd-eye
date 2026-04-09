.class public final Le7/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le7/b$a$a;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Le7/b$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Le7/b$a;Landroid/content/Context;)Le7/b;
    .locals 0

    invoke-direct {p0, p1}, Le7/b$a;->d(Landroid/content/Context;)Le7/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Le7/b$a;Landroid/content/Context;JILjava/lang/Object;)Lgg/i;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const-wide/16 p2, 0x1388

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Le7/b$a;->b(Landroid/content/Context;J)Lgg/i;

    move-result-object p0

    return-object p0
.end method

.method private final d(Landroid/content/Context;)Le7/b;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-static {}, Lcom/google/ar/core/ArCoreApk;->getInstance()Lcom/google/ar/core/ArCoreApk;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/ar/core/ArCoreApk;->checkAvailability(Landroid/content/Context;)Lcom/google/ar/core/ArCoreApk$Availability;

    move-result-object p1

    sget-object v0, Le7/b$a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    const/4 p1, 0x0

    goto :goto_0

    :pswitch_1
    sget-object p1, Le7/b;->UNSUPPORTED:Le7/b;

    goto :goto_0

    :pswitch_2
    sget-object p1, Le7/b;->ERROR:Le7/b;

    goto :goto_0

    :pswitch_3
    sget-object p1, Le7/b;->NOT_INSTALLED:Le7/b;

    goto :goto_0

    :pswitch_4
    sget-object p1, Le7/b;->AVAILABLE:Le7/b;

    goto :goto_0

    :cond_0
    sget-object p1, Le7/b;->UNSUPPORTED:Le7/b;

    :goto_0
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final b(Landroid/content/Context;J)Lgg/i;
    .locals 1

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Le7/b$a$b;

    invoke-direct {v0, p1}, Le7/b$a$b;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lgg/z;->i(Lgg/C;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "crossinline action: () -\u2026or(error)\n        }\n    }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Le7/b$a$c;->a:Le7/b$a$c;

    invoke-virtual {p1, v0}, Lgg/z;->K(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, p2, p3, v0}, Lgg/i;->Z1(JLjava/util/concurrent/TimeUnit;)Lgg/i;

    move-result-object p1

    sget-object p2, Le7/b$a$d;->a:Le7/b$a$d;

    invoke-virtual {p1, p2}, Lgg/i;->f1(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->d()Lgg/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object p1

    sget-object p2, Le7/b$a$e;->a:Le7/b$a$e;

    invoke-virtual {p1, p2}, Lgg/i;->m0(Lkg/p;)Lgg/i;

    move-result-object p1

    sget-object p2, Le7/b$a$f;->a:Le7/b$a$f;

    invoke-virtual {p1, p2}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    sget-object p2, Le7/b$a$g;->a:Le7/b$a$g;

    invoke-virtual {p1, p2}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object p1

    sget-object p2, Le7/b;->ERROR:Le7/b;

    invoke-virtual {p1, p2}, Lgg/i;->Q(Ljava/lang/Object;)Lgg/i;

    move-result-object p1

    const-string/jumbo p2, "defaultIfEmpty(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final e(Landroid/content/Context;)Z
    .locals 1

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Le7/b$a;->d(Landroid/content/Context;)Le7/b;

    move-result-object p1

    sget-object v0, Le7/b;->AVAILABLE:Le7/b;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final f(Landroid/app/Activity;)Le7/b;
    .locals 6

    const-string/jumbo v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    const/4 v1, 0x0

    :try_start_0
    invoke-static {}, Lcom/google/ar/core/ArCoreApk;->getInstance()Lcom/google/ar/core/ArCoreApk;

    move-result-object v2

    sget-object v3, Lcom/google/ar/core/ArCoreApk$InstallBehavior;->OPTIONAL:Lcom/google/ar/core/ArCoreApk$InstallBehavior;

    sget-object v4, Lcom/google/ar/core/ArCoreApk$UserMessageType;->USER_ALREADY_INFORMED:Lcom/google/ar/core/ArCoreApk$UserMessageType;

    const/4 v5, 0x1

    invoke-virtual {v2, p1, v5, v3, v4}, Lcom/google/ar/core/ArCoreApk;->requestInstall(Landroid/app/Activity;ZLcom/google/ar/core/ArCoreApk$InstallBehavior;Lcom/google/ar/core/ArCoreApk$UserMessageType;)Lcom/google/ar/core/ArCoreApk$InstallStatus;

    move-result-object p1

    sget-object v2, Le7/b$a$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    if-eq p1, v5, :cond_1

    const/4 v2, 0x2

    if-ne p1, v2, :cond_0

    sget-object p1, Le7/b;->AVAILABLE:Le7/b;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    :catch_2
    move-exception p1

    goto :goto_3

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Le7/b;->NOT_INSTALLED:Le7/b;
    :try_end_0
    .catch Lcom/google/ar/core/exceptions/UnavailableUserDeclinedInstallationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/google/ar/core/exceptions/UnavailableDeviceNotCompatibleException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/ar/core/exceptions/FatalException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object p1

    :goto_1
    const-string v2, "ARCore requestInstall"

    invoke-static {v2, p1, v1, v0, v1}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object p1, Le7/b;->ERROR:Le7/b;

    return-object p1

    :goto_2
    const-string v2, "ARCore device unsupported"

    invoke-static {v2, p1, v1, v0, v1}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object p1, Le7/b;->UNSUPPORTED:Le7/b;

    return-object p1

    :goto_3
    const-string v2, "ARCore declined by user"

    invoke-static {v2, p1, v1, v0, v1}, LZ7/b;->e(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object p1, Le7/b;->ERROR:Le7/b;

    return-object p1
.end method
