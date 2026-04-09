.class public final LTa/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LTa/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LTa/b$a;
    }
.end annotation


# static fields
.field public static final d:LTa/b$a;


# instance fields
.field private final b:LIi/J;

.field private final c:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LTa/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LTa/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LTa/b;->d:LTa/b$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/ContentResolver;LIi/J;)V
    .locals 1

    const-string/jumbo v0, "resolver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "dispatcherIO"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LTa/b;->b:LIi/J;

    new-instance p2, LTa/b$b;

    invoke-direct {p2, p0, p1}, LTa/b$b;-><init>(LTa/b;Landroid/content/ContentResolver;)V

    invoke-static {p2}, LYg/n;->b(Lmh/a;)LYg/m;

    move-result-object p1

    iput-object p1, p0, LTa/b;->c:LYg/m;

    return-void
.end method

.method public static final synthetic a(LTa/b;)Ljava/util/UUID;
    .locals 0

    invoke-direct {p0}, LTa/b;->b()Ljava/util/UUID;

    move-result-object p0

    return-object p0
.end method

.method private final b()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, LTa/b;->c:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/UUID;

    return-object v0
.end method


# virtual methods
.method public final c(Landroid/content/ContentResolver;)Ljava/lang/String;
    .locals 2

    const-string/jumbo v0, "resolver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    const-string/jumbo v1, "android_id"

    invoke-static {p1, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    return-object p1

    :catchall_0
    move-exception p1

    sget-object v1, LTa/b$d;->a:LTa/b$d;

    invoke-static {v1, p1}, LUa/a;->f(Lmh/a;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public e(Ldh/e;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LTa/b;->b:LIi/J;

    new-instance v1, LTa/b$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, LTa/b$c;-><init>(LTa/b;Ldh/e;)V

    invoke-static {v0, v1, p1}, LIi/i;->g(Ldh/i;Lmh/p;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
