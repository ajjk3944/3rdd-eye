.class public final Lo5/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo5/k$b;
    }
.end annotation


# static fields
.field public static final c:Lo5/k$b;


# instance fields
.field private final a:Lcom/google/firebase/f;

.field private final b:Lq5/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo5/k$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo5/k$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lo5/k;->c:Lo5/k$b;

    return-void
.end method

.method public constructor <init>(Lcom/google/firebase/f;Lq5/f;Ldh/i;Lo5/F;)V
    .locals 6

    const-string/jumbo v0, "firebaseApp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "settings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "backgroundDispatcher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "lifecycleServiceBinder"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo5/k;->a:Lcom/google/firebase/f;

    iput-object p2, p0, Lo5/k;->b:Lq5/f;

    const-string/jumbo p2, "Initializing Firebase Sessions SDK."

    const-string/jumbo v0, "FirebaseSessions"

    invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Lcom/google/firebase/f;->k()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    instance-of p2, p1, Landroid/app/Application;

    if-eqz p2, :cond_0

    check-cast p1, Landroid/app/Application;

    sget-object p2, Lo5/H;->a:Lo5/H;

    invoke-virtual {p1, p2}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    invoke-static {p3}, LIi/O;->a(Ldh/i;)LIi/N;

    move-result-object v0

    new-instance v3, Lo5/k$a;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p3, p4, p1}, Lo5/k$a;-><init>(Lo5/k;Ldh/i;Lo5/F;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo p3, "Failed to register lifecycle callbacks, unexpected context "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public static final synthetic a(Lo5/k;)Lcom/google/firebase/f;
    .locals 0

    iget-object p0, p0, Lo5/k;->a:Lcom/google/firebase/f;

    return-object p0
.end method

.method public static final synthetic b(Lo5/k;)Lq5/f;
    .locals 0

    iget-object p0, p0, Lo5/k;->b:Lq5/f;

    return-object p0
.end method
