.class public final LTa/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LTa/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LTa/e$a;
    }
.end annotation


# static fields
.field public static final g:LTa/e$a;

.field private static h:LTa/d;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/content/ContentResolver;

.field private final c:LIi/J;

.field private final d:LTa/a;

.field private final e:LTa/a;

.field private final f:LWa/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LTa/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LTa/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LTa/e;->g:LTa/e$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/ContentResolver;LIi/J;LTa/a;LTa/a;LWa/a;)V
    .locals 1

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "contentResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "dispatcherIO"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "deviceIdStorageAndroidSecure"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "deviceIdStorageSharedPref"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "androidSdkVersion"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LTa/e;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, LTa/e;->b:Landroid/content/ContentResolver;

    .line 4
    iput-object p3, p0, LTa/e;->c:LIi/J;

    .line 5
    iput-object p4, p0, LTa/e;->d:LTa/a;

    .line 6
    iput-object p5, p0, LTa/e;->e:LTa/a;

    .line 7
    iput-object p6, p0, LTa/e;->f:LWa/a;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/content/ContentResolver;LIi/J;LTa/a;LTa/a;LWa/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_0

    .line 8
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p2

    const-string/jumbo p8, "getContentResolver(...)"

    invoke-static {p2, p8}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_1

    .line 9
    invoke-static {}, LIi/c0;->b()LIi/J;

    move-result-object p3

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_2

    .line 10
    new-instance p4, LTa/b;

    invoke-direct {p4, v2, v3}, LTa/b;-><init>(Landroid/content/ContentResolver;LIi/J;)V

    :cond_2
    move-object v4, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_3

    .line 11
    sget-object p2, LVa/a;->a:LVa/a$a;

    invoke-virtual {p2, p1}, LVa/a$a;->a(Landroid/content/Context;)LVa/a;

    move-result-object p5

    :cond_3
    move-object v5, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_4

    .line 12
    sget-object p2, LWa/a;->b:LWa/a$a;

    invoke-virtual {p2}, LWa/a$a;->a()LWa/a;

    move-result-object p6

    :cond_4
    move-object v6, p6

    move-object v0, p0

    move-object v1, p1

    .line 13
    invoke-direct/range {v0 .. v6}, LTa/e;-><init>(Landroid/content/Context;Landroid/content/ContentResolver;LIi/J;LTa/a;LTa/a;LWa/a;)V

    return-void
.end method

.method public static final synthetic b(LTa/e;)LTa/a;
    .locals 0

    iget-object p0, p0, LTa/e;->d:LTa/a;

    return-object p0
.end method

.method public static final synthetic c(LTa/e;)LTa/a;
    .locals 0

    iget-object p0, p0, LTa/e;->e:LTa/a;

    return-object p0
.end method

.method public static final synthetic d(LTa/e;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, LTa/e;->g()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e()LTa/d;
    .locals 1

    sget-object v0, LTa/e;->h:LTa/d;

    return-object v0
.end method

.method public static final synthetic f(LTa/d;)V
    .locals 0

    sput-object p0, LTa/e;->h:LTa/d;

    return-void
.end method

.method private final g()Ljava/lang/String;
    .locals 3

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Ldh/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LTa/e;->c:LIi/J;

    new-instance v1, LTa/e$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, LTa/e$b;-><init>(LTa/e;Ldh/e;)V

    invoke-static {v0, v1, p1}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final h()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LTa/e;->f:LWa/a;

    const/16 v1, 0x19

    invoke-virtual {v0, v1}, LWa/a;->b(I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, LTa/e;->b:Landroid/content/ContentResolver;

    const-string/jumbo v2, "device_name"

    invoke-static {v0, v2}, Landroid/provider/Settings$Global;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_2

    invoke-static {v0}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    move-object v1, v0

    :cond_1
    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-direct {p0}, LTa/e;->g()Ljava/lang/String;

    move-result-object v1

    :goto_1
    return-object v1
.end method
