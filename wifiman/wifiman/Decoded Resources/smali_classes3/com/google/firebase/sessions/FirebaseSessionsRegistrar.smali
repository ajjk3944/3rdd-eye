.class public final Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0006\u0008\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J=\u0010\u0008\u001a0\u0012,\u0012*\u0012\u000e\u0008\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;",
        "Lcom/google/firebase/components/ComponentRegistrar;",
        "<init>",
        "()V",
        "",
        "LF4/c;",
        "",
        "kotlin.jvm.PlatformType",
        "getComponents",
        "()Ljava/util/List;",
        "Companion",
        "a",
        "com.google.firebase-firebase-sessions"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final Companion:Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;

.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-sessions"

.field private static final backgroundDispatcher:LF4/A;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LF4/A;"
        }
    .end annotation
.end field

.field private static final blockingDispatcher:LF4/A;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LF4/A;"
        }
    .end annotation
.end field

.field private static final firebaseApp:LF4/A;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LF4/A;"
        }
    .end annotation
.end field

.field private static final firebaseInstallationsApi:LF4/A;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LF4/A;"
        }
    .end annotation
.end field

.field private static final sessionLifecycleServiceBinder:LF4/A;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LF4/A;"
        }
    .end annotation
.end field

.field private static final sessionsSettings:LF4/A;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LF4/A;"
        }
    .end annotation
.end field

.field private static final transportFactory:LF4/A;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LF4/A;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->Companion:Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;

    const-class v0, Lcom/google/firebase/f;

    invoke-static {v0}, LF4/A;->b(Ljava/lang/Class;)LF4/A;

    move-result-object v0

    const-string/jumbo v1, "unqualified(FirebaseApp::class.java)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:LF4/A;

    const-class v0, Lg5/e;

    invoke-static {v0}, LF4/A;->b(Ljava/lang/Class;)LF4/A;

    move-result-object v0

    const-string/jumbo v1, "unqualified(FirebaseInstallationsApi::class.java)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:LF4/A;

    const-class v0, LE4/a;

    const-class v1, LIi/J;

    invoke-static {v0, v1}, LF4/A;->a(Ljava/lang/Class;Ljava/lang/Class;)LF4/A;

    move-result-object v0

    const-string/jumbo v2, "qualified(Background::cl\u2026neDispatcher::class.java)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:LF4/A;

    const-class v0, LE4/b;

    invoke-static {v0, v1}, LF4/A;->a(Ljava/lang/Class;Ljava/lang/Class;)LF4/A;

    move-result-object v0

    const-string/jumbo v1, "qualified(Blocking::clas\u2026neDispatcher::class.java)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:LF4/A;

    const-class v0, La3/i;

    invoke-static {v0}, LF4/A;->b(Ljava/lang/Class;)LF4/A;

    move-result-object v0

    const-string/jumbo v1, "unqualified(TransportFactory::class.java)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:LF4/A;

    const-class v0, Lq5/f;

    invoke-static {v0}, LF4/A;->b(Ljava/lang/Class;)LF4/A;

    move-result-object v0

    const-string/jumbo v1, "unqualified(SessionsSettings::class.java)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionsSettings:LF4/A;

    const-class v0, Lo5/F;

    invoke-static {v0}, LF4/A;->b(Ljava/lang/Class;)LF4/A;

    move-result-object v0

    const-string/jumbo v1, "unqualified(SessionLifec\u2026erviceBinder::class.java)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionLifecycleServiceBinder:LF4/A;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LF4/d;)Lcom/google/firebase/sessions/a;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$4(LF4/d;)Lcom/google/firebase/sessions/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LF4/d;)Lo5/F;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$5(LF4/d;)Lo5/F;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(LF4/d;)Lq5/f;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$3(LF4/d;)Lq5/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(LF4/d;)Lcom/google/firebase/sessions/b;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$2(LF4/d;)Lcom/google/firebase/sessions/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LF4/d;)Lcom/google/firebase/sessions/c;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$1(LF4/d;)Lcom/google/firebase/sessions/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(LF4/d;)Lo5/k;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda$0(LF4/d;)Lo5/k;

    move-result-object p0

    return-object p0
.end method

.method private static final getComponents$lambda$0(LF4/d;)Lo5/k;
    .locals 5

    new-instance v0, Lo5/k;

    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:LF4/A;

    invoke-interface {p0, v1}, LF4/d;->f(LF4/A;)Ljava/lang/Object;

    move-result-object v1

    const-string/jumbo v2, "container[firebaseApp]"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/google/firebase/f;

    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionsSettings:LF4/A;

    invoke-interface {p0, v2}, LF4/d;->f(LF4/A;)Ljava/lang/Object;

    move-result-object v2

    const-string/jumbo v3, "container[sessionsSettings]"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lq5/f;

    sget-object v3, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:LF4/A;

    invoke-interface {p0, v3}, LF4/d;->f(LF4/A;)Ljava/lang/Object;

    move-result-object v3

    const-string/jumbo v4, "container[backgroundDispatcher]"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ldh/i;

    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionLifecycleServiceBinder:LF4/A;

    invoke-interface {p0, v4}, LF4/d;->f(LF4/A;)Ljava/lang/Object;

    move-result-object p0

    const-string/jumbo v4, "container[sessionLifecycleServiceBinder]"

    invoke-static {p0, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lo5/F;

    invoke-direct {v0, v1, v2, v3, p0}, Lo5/k;-><init>(Lcom/google/firebase/f;Lq5/f;Ldh/i;Lo5/F;)V

    return-object v0
.end method

.method private static final getComponents$lambda$1(LF4/d;)Lcom/google/firebase/sessions/c;
    .locals 3

    new-instance p0, Lcom/google/firebase/sessions/c;

    sget-object v0, Lo5/J;->a:Lo5/J;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {p0, v0, v1, v2, v1}, Lcom/google/firebase/sessions/c;-><init>(Lo5/I;Lmh/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method

.method private static final getComponents$lambda$2(LF4/d;)Lcom/google/firebase/sessions/b;
    .locals 7

    new-instance v6, Lo5/B;

    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:LF4/A;

    invoke-interface {p0, v0}, LF4/d;->f(LF4/A;)Ljava/lang/Object;

    move-result-object v0

    const-string/jumbo v1, "container[firebaseApp]"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, Lcom/google/firebase/f;

    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:LF4/A;

    invoke-interface {p0, v0}, LF4/d;->f(LF4/A;)Ljava/lang/Object;

    move-result-object v0

    const-string/jumbo v2, "container[firebaseInstallationsApi]"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Lg5/e;

    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionsSettings:LF4/A;

    invoke-interface {p0, v0}, LF4/d;->f(LF4/A;)Ljava/lang/Object;

    move-result-object v0

    const-string/jumbo v3, "container[sessionsSettings]"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v0

    check-cast v3, Lq5/f;

    new-instance v4, Lo5/g;

    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:LF4/A;

    invoke-interface {p0, v0}, LF4/d;->d(LF4/A;)Lf5/b;

    move-result-object v0

    const-string/jumbo v5, "container.getProvider(transportFactory)"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v0}, Lo5/g;-><init>(Lf5/b;)V

    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:LF4/A;

    invoke-interface {p0, v0}, LF4/d;->f(LF4/A;)Ljava/lang/Object;

    move-result-object p0

    const-string/jumbo v0, "container[backgroundDispatcher]"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p0

    check-cast v5, Ldh/i;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lo5/B;-><init>(Lcom/google/firebase/f;Lg5/e;Lq5/f;Lo5/h;Ldh/i;)V

    return-object v6
.end method

.method private static final getComponents$lambda$3(LF4/d;)Lq5/f;
    .locals 5

    new-instance v0, Lq5/f;

    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:LF4/A;

    invoke-interface {p0, v1}, LF4/d;->f(LF4/A;)Ljava/lang/Object;

    move-result-object v1

    const-string/jumbo v2, "container[firebaseApp]"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/google/firebase/f;

    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:LF4/A;

    invoke-interface {p0, v2}, LF4/d;->f(LF4/A;)Ljava/lang/Object;

    move-result-object v2

    const-string/jumbo v3, "container[blockingDispatcher]"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ldh/i;

    sget-object v3, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:LF4/A;

    invoke-interface {p0, v3}, LF4/d;->f(LF4/A;)Ljava/lang/Object;

    move-result-object v3

    const-string/jumbo v4, "container[backgroundDispatcher]"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ldh/i;

    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:LF4/A;

    invoke-interface {p0, v4}, LF4/d;->f(LF4/A;)Ljava/lang/Object;

    move-result-object p0

    const-string/jumbo v4, "container[firebaseInstallationsApi]"

    invoke-static {p0, v4}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lg5/e;

    invoke-direct {v0, v1, v2, v3, p0}, Lq5/f;-><init>(Lcom/google/firebase/f;Ldh/i;Ldh/i;Lg5/e;)V

    return-object v0
.end method

.method private static final getComponents$lambda$4(LF4/d;)Lcom/google/firebase/sessions/a;
    .locals 3

    new-instance v0, Lo5/x;

    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:LF4/A;

    invoke-interface {p0, v1}, LF4/d;->f(LF4/A;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/firebase/f;

    invoke-virtual {v1}, Lcom/google/firebase/f;->k()Landroid/content/Context;

    move-result-object v1

    const-string/jumbo v2, "container[firebaseApp].applicationContext"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:LF4/A;

    invoke-interface {p0, v2}, LF4/d;->f(LF4/A;)Ljava/lang/Object;

    move-result-object p0

    const-string/jumbo v2, "container[backgroundDispatcher]"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ldh/i;

    invoke-direct {v0, v1, p0}, Lo5/x;-><init>(Landroid/content/Context;Ldh/i;)V

    return-object v0
.end method

.method private static final getComponents$lambda$5(LF4/d;)Lo5/F;
    .locals 2

    new-instance v0, Lo5/G;

    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:LF4/A;

    invoke-interface {p0, v1}, LF4/d;->f(LF4/A;)Ljava/lang/Object;

    move-result-object p0

    const-string/jumbo v1, "container[firebaseApp]"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/google/firebase/f;

    invoke-direct {v0, p0}, Lo5/G;-><init>(Lcom/google/firebase/f;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LF4/c;",
            ">;"
        }
    .end annotation

    const-class v0, Lo5/k;

    invoke-static {v0}, LF4/c;->e(Ljava/lang/Class;)LF4/c$b;

    move-result-object v0

    const-string/jumbo v1, "fire-sessions"

    invoke-virtual {v0, v1}, LF4/c$b;->g(Ljava/lang/String;)LF4/c$b;

    move-result-object v0

    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:LF4/A;

    invoke-static {v2}, LF4/q;->i(LF4/A;)LF4/q;

    move-result-object v3

    invoke-virtual {v0, v3}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    sget-object v3, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionsSettings:LF4/A;

    invoke-static {v3}, LF4/q;->i(LF4/A;)LF4/q;

    move-result-object v4

    invoke-virtual {v0, v4}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:LF4/A;

    invoke-static {v4}, LF4/q;->i(LF4/A;)LF4/q;

    move-result-object v5

    invoke-virtual {v0, v5}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    sget-object v5, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionLifecycleServiceBinder:LF4/A;

    invoke-static {v5}, LF4/q;->i(LF4/A;)LF4/q;

    move-result-object v5

    invoke-virtual {v0, v5}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    new-instance v5, Lo5/m;

    invoke-direct {v5}, Lo5/m;-><init>()V

    invoke-virtual {v0, v5}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object v0

    invoke-virtual {v0}, LF4/c$b;->d()LF4/c$b;

    move-result-object v0

    invoke-virtual {v0}, LF4/c$b;->c()LF4/c;

    move-result-object v5

    const-class v0, Lcom/google/firebase/sessions/c;

    invoke-static {v0}, LF4/c;->e(Ljava/lang/Class;)LF4/c$b;

    move-result-object v0

    const-string/jumbo v6, "session-generator"

    invoke-virtual {v0, v6}, LF4/c$b;->g(Ljava/lang/String;)LF4/c$b;

    move-result-object v0

    new-instance v6, Lo5/n;

    invoke-direct {v6}, Lo5/n;-><init>()V

    invoke-virtual {v0, v6}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object v0

    invoke-virtual {v0}, LF4/c$b;->c()LF4/c;

    move-result-object v6

    const-class v0, Lcom/google/firebase/sessions/b;

    invoke-static {v0}, LF4/c;->e(Ljava/lang/Class;)LF4/c$b;

    move-result-object v0

    const-string/jumbo v7, "session-publisher"

    invoke-virtual {v0, v7}, LF4/c$b;->g(Ljava/lang/String;)LF4/c$b;

    move-result-object v0

    invoke-static {v2}, LF4/q;->i(LF4/A;)LF4/q;

    move-result-object v7

    invoke-virtual {v0, v7}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    sget-object v7, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:LF4/A;

    invoke-static {v7}, LF4/q;->i(LF4/A;)LF4/q;

    move-result-object v8

    invoke-virtual {v0, v8}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    invoke-static {v3}, LF4/q;->i(LF4/A;)LF4/q;

    move-result-object v3

    invoke-virtual {v0, v3}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    sget-object v3, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:LF4/A;

    invoke-static {v3}, LF4/q;->k(LF4/A;)LF4/q;

    move-result-object v3

    invoke-virtual {v0, v3}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    invoke-static {v4}, LF4/q;->i(LF4/A;)LF4/q;

    move-result-object v3

    invoke-virtual {v0, v3}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v0

    new-instance v3, Lo5/o;

    invoke-direct {v3}, Lo5/o;-><init>()V

    invoke-virtual {v0, v3}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object v0

    invoke-virtual {v0}, LF4/c$b;->c()LF4/c;

    move-result-object v0

    const-class v3, Lq5/f;

    invoke-static {v3}, LF4/c;->e(Ljava/lang/Class;)LF4/c$b;

    move-result-object v3

    const-string/jumbo v8, "sessions-settings"

    invoke-virtual {v3, v8}, LF4/c$b;->g(Ljava/lang/String;)LF4/c$b;

    move-result-object v3

    invoke-static {v2}, LF4/q;->i(LF4/A;)LF4/q;

    move-result-object v8

    invoke-virtual {v3, v8}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v3

    sget-object v8, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:LF4/A;

    invoke-static {v8}, LF4/q;->i(LF4/A;)LF4/q;

    move-result-object v8

    invoke-virtual {v3, v8}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v3

    invoke-static {v4}, LF4/q;->i(LF4/A;)LF4/q;

    move-result-object v8

    invoke-virtual {v3, v8}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v3

    invoke-static {v7}, LF4/q;->i(LF4/A;)LF4/q;

    move-result-object v7

    invoke-virtual {v3, v7}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v3

    new-instance v7, Lo5/p;

    invoke-direct {v7}, Lo5/p;-><init>()V

    invoke-virtual {v3, v7}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object v3

    invoke-virtual {v3}, LF4/c$b;->c()LF4/c;

    move-result-object v8

    const-class v3, Lcom/google/firebase/sessions/a;

    invoke-static {v3}, LF4/c;->e(Ljava/lang/Class;)LF4/c$b;

    move-result-object v3

    const-string/jumbo v7, "sessions-datastore"

    invoke-virtual {v3, v7}, LF4/c$b;->g(Ljava/lang/String;)LF4/c$b;

    move-result-object v3

    invoke-static {v2}, LF4/q;->i(LF4/A;)LF4/q;

    move-result-object v7

    invoke-virtual {v3, v7}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v3

    invoke-static {v4}, LF4/q;->i(LF4/A;)LF4/q;

    move-result-object v4

    invoke-virtual {v3, v4}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v3

    new-instance v4, Lo5/q;

    invoke-direct {v4}, Lo5/q;-><init>()V

    invoke-virtual {v3, v4}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object v3

    invoke-virtual {v3}, LF4/c$b;->c()LF4/c;

    move-result-object v9

    const-class v3, Lo5/F;

    invoke-static {v3}, LF4/c;->e(Ljava/lang/Class;)LF4/c$b;

    move-result-object v3

    const-string/jumbo v4, "sessions-service-binder"

    invoke-virtual {v3, v4}, LF4/c$b;->g(Ljava/lang/String;)LF4/c$b;

    move-result-object v3

    invoke-static {v2}, LF4/q;->i(LF4/A;)LF4/q;

    move-result-object v2

    invoke-virtual {v3, v2}, LF4/c$b;->b(LF4/q;)LF4/c$b;

    move-result-object v2

    new-instance v3, Lo5/r;

    invoke-direct {v3}, Lo5/r;-><init>()V

    invoke-virtual {v2, v3}, LF4/c$b;->e(LF4/g;)LF4/c$b;

    move-result-object v2

    invoke-virtual {v2}, LF4/c$b;->c()LF4/c;

    move-result-object v10

    const-string v2, "2.0.9"

    invoke-static {v1, v2}, Lm5/h;->b(Ljava/lang/String;Ljava/lang/String;)LF4/c;

    move-result-object v11

    move-object v7, v0

    filled-new-array/range {v5 .. v11}, [LF4/c;

    move-result-object v0

    invoke-static {v0}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
