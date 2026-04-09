.class public final LL4/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LL4/f$a;
    }
.end annotation


# static fields
.field public static final e:LL4/f$a;

.field private static f:Z


# instance fields
.field public final a:LL4/e;

.field public final b:LL4/e;

.field public final c:LL4/e;

.field public final d:LL4/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LL4/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LL4/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LL4/f;->e:LL4/f$a;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    const-string/jumbo v0, "backgroundExecutorService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "blockingExecutorService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LL4/e;

    invoke-direct {v0, p1}, LL4/e;-><init>(Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, LL4/f;->a:LL4/e;

    new-instance v0, LL4/e;

    invoke-direct {v0, p1}, LL4/e;-><init>(Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, LL4/f;->b:LL4/e;

    new-instance v0, LL4/e;

    invoke-direct {v0, p1}, LL4/e;-><init>(Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, p0, LL4/f;->c:LL4/e;

    new-instance p1, LL4/e;

    invoke-direct {p1, p2}, LL4/e;-><init>(Ljava/util/concurrent/ExecutorService;)V

    iput-object p1, p0, LL4/f;->d:LL4/e;

    return-void
.end method

.method public static final synthetic a()Z
    .locals 1

    sget-boolean v0, LL4/f;->f:Z

    return v0
.end method

.method public static final synthetic b(Z)V
    .locals 0

    sput-boolean p0, LL4/f;->f:Z

    return-void
.end method

.method public static final c()V
    .locals 1

    sget-object v0, LL4/f;->e:LL4/f$a;

    invoke-virtual {v0}, LL4/f$a;->e()V

    return-void
.end method

.method public static final d()V
    .locals 1

    sget-object v0, LL4/f;->e:LL4/f$a;

    invoke-virtual {v0}, LL4/f$a;->f()V

    return-void
.end method

.method public static final e()V
    .locals 1

    sget-object v0, LL4/f;->e:LL4/f$a;

    invoke-virtual {v0}, LL4/f$a;->g()V

    return-void
.end method

.method public static final f(Z)V
    .locals 1

    sget-object v0, LL4/f;->e:LL4/f$a;

    invoke-virtual {v0, p0}, LL4/f$a;->n(Z)V

    return-void
.end method
