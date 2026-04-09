.class public abstract Ls3/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls3/c$a;,
        Ls3/c$b;,
        Ls3/c$d;,
        Ls3/c$c;,
        Ls3/c$e;
    }
.end annotation


# static fields
.field public static final D:[Ljava/lang/String;

.field private static final E:[Lr3/d;


# instance fields
.field private A:Z

.field private volatile B:Ls3/d0;

.field protected C:Ljava/util/concurrent/atomic/AtomicInteger;

.field private a:I

.field private b:J

.field private c:J

.field private d:I

.field private e:J

.field private volatile f:Ljava/lang/String;

.field g:Ls3/o0;

.field private final h:Landroid/content/Context;

.field private final i:Landroid/os/Looper;

.field private final j:Ls3/h;

.field private final k:Lr3/f;

.field final l:Landroid/os/Handler;

.field private final m:Ljava/lang/Object;

.field private final n:Ljava/lang/Object;

.field private o:Ls3/l;

.field protected p:Ls3/c$c;

.field private q:Landroid/os/IInterface;

.field private final r:Ljava/util/ArrayList;

.field private s:Ls3/a0;

.field private t:I

.field private final u:Ls3/c$a;

.field private final v:Ls3/c$b;

.field private final w:I

.field private final x:Ljava/lang/String;

.field private volatile y:Ljava/lang/String;

.field private z:Lr3/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Lr3/d;

    sput-object v0, Ls3/c;->E:[Lr3/d;

    const-string v0, "service_esmobile"

    const-string v1, "service_googleme"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls3/c;->D:[Ljava/lang/String;

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Landroid/os/Looper;ILs3/c$a;Ls3/c$b;Ljava/lang/String;)V
    .locals 9

    .line 1
    invoke-static {p1}, Ls3/h;->a(Landroid/content/Context;)Ls3/h;

    move-result-object v3

    .line 2
    invoke-static {}, Lr3/f;->f()Lr3/f;

    move-result-object v4

    .line 3
    invoke-static {p4}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-static {p5}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p3

    move-object v6, p4

    move-object v7, p5

    move-object v8, p6

    .line 5
    invoke-direct/range {v0 .. v8}, Ls3/c;-><init>(Landroid/content/Context;Landroid/os/Looper;Ls3/h;Lr3/f;ILs3/c$a;Ls3/c$b;Ljava/lang/String;)V

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;Landroid/os/Looper;Ls3/h;Lr3/f;ILs3/c$a;Ls3/c$b;Ljava/lang/String;)V
    .locals 2

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Ls3/c;->f:Ljava/lang/String;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Ls3/c;->m:Ljava/lang/Object;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Ls3/c;->n:Ljava/lang/Object;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ls3/c;->r:Ljava/util/ArrayList;

    const/4 v1, 0x1

    iput v1, p0, Ls3/c;->t:I

    iput-object v0, p0, Ls3/c;->z:Lr3/b;

    const/4 v1, 0x0

    iput-boolean v1, p0, Ls3/c;->A:Z

    iput-object v0, p0, Ls3/c;->B:Ls3/d0;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Ls3/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    const-string v0, "Context must not be null"

    .line 8
    invoke-static {p1, v0}, Ls3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ls3/c;->h:Landroid/content/Context;

    const-string p1, "Looper must not be null"

    .line 9
    invoke-static {p2, p1}, Ls3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Ls3/c;->i:Landroid/os/Looper;

    const-string p1, "Supervisor must not be null"

    .line 10
    invoke-static {p3, p1}, Ls3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p3, p0, Ls3/c;->j:Ls3/h;

    const-string p1, "API availability must not be null"

    .line 11
    invoke-static {p4, p1}, Ls3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p4, p0, Ls3/c;->k:Lr3/f;

    new-instance p1, Ls3/X;

    .line 12
    invoke-direct {p1, p0, p2}, Ls3/X;-><init>(Ls3/c;Landroid/os/Looper;)V

    iput-object p1, p0, Ls3/c;->l:Landroid/os/Handler;

    iput p5, p0, Ls3/c;->w:I

    iput-object p6, p0, Ls3/c;->u:Ls3/c$a;

    iput-object p7, p0, Ls3/c;->v:Ls3/c$b;

    iput-object p8, p0, Ls3/c;->x:Ljava/lang/String;

    return-void
.end method

.method static bridge synthetic R(Ls3/c;)Lr3/b;
    .locals 0

    iget-object p0, p0, Ls3/c;->z:Lr3/b;

    return-object p0
.end method

.method static bridge synthetic S(Ls3/c;)Ls3/c$a;
    .locals 0

    iget-object p0, p0, Ls3/c;->u:Ls3/c$a;

    return-object p0
.end method

.method static bridge synthetic T(Ls3/c;)Ls3/c$b;
    .locals 0

    iget-object p0, p0, Ls3/c;->v:Ls3/c$b;

    return-object p0
.end method

.method static bridge synthetic U(Ls3/c;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Ls3/c;->n:Ljava/lang/Object;

    return-object p0
.end method

.method static bridge synthetic W(Ls3/c;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Ls3/c;->r:Ljava/util/ArrayList;

    return-object p0
.end method

.method static bridge synthetic X(Ls3/c;Lr3/b;)V
    .locals 0

    iput-object p1, p0, Ls3/c;->z:Lr3/b;

    return-void
.end method

.method static bridge synthetic Y(Ls3/c;Ls3/l;)V
    .locals 0

    iput-object p1, p0, Ls3/c;->o:Ls3/l;

    return-void
.end method

.method static bridge synthetic Z(Ls3/c;ILandroid/os/IInterface;)V
    .locals 0

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Ls3/c;->g0(ILandroid/os/IInterface;)V

    return-void
.end method

.method static bridge synthetic a0(Ls3/c;Ls3/d0;)V
    .locals 0

    iput-object p1, p0, Ls3/c;->B:Ls3/d0;

    invoke-virtual {p0}, Ls3/c;->Q()Z

    move-result p0

    if-eqz p0, :cond_1

    iget-object p0, p1, Ls3/d0;->d:Ls3/e;

    invoke-static {}, Ls3/q;->b()Ls3/q;

    move-result-object p1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ls3/e;->j()Ls3/r;

    move-result-object p0

    :goto_0
    invoke-virtual {p1, p0}, Ls3/q;->c(Ls3/r;)V

    :cond_1
    return-void
.end method

.method static bridge synthetic b0(Ls3/c;I)V
    .locals 2

    iget-object p1, p0, Ls3/c;->m:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget v0, p0, Ls3/c;->t:I

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x3

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Ls3/c;->A:Z

    const/4 p1, 0x5

    goto :goto_0

    :cond_0
    const/4 p1, 0x4

    :goto_0
    iget-object v0, p0, Ls3/c;->l:Landroid/os/Handler;

    iget-object p0, p0, Ls3/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p0

    const/16 v1, 0x10

    invoke-virtual {v0, p1, p0, v1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method static bridge synthetic d0(Ls3/c;)Z
    .locals 0

    iget-boolean p0, p0, Ls3/c;->A:Z

    return p0
.end method

.method static bridge synthetic e0(Ls3/c;IILandroid/os/IInterface;)Z
    .locals 2

    iget-object v0, p0, Ls3/c;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Ls3/c;->t:I

    if-eq v1, p1, :cond_0

    monitor-exit v0

    const/4 p0, 0x0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    invoke-direct {p0, p2, p3}, Ls3/c;->g0(ILandroid/os/IInterface;)V

    monitor-exit v0

    const/4 p0, 0x1

    :goto_0
    return p0

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method static bridge synthetic f0(Ls3/c;)Z
    .locals 2

    iget-boolean v0, p0, Ls3/c;->A:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ls3/c;->C()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ls3/c;->z()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    :try_start_0
    invoke-virtual {p0}, Ls3/c;->C()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x1

    :catch_0
    :goto_0
    return v1
.end method

.method private final g0(ILandroid/os/IInterface;)V
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x4

    if-eq p1, v2, :cond_0

    move v3, v0

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    if-nez p2, :cond_1

    move v4, v0

    goto :goto_1

    :cond_1
    move v4, v1

    :goto_1
    if-ne v3, v4, :cond_2

    move v0, v1

    :cond_2
    invoke-static {v0}, Ls3/p;->a(Z)V

    iget-object v0, p0, Ls3/c;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput p1, p0, Ls3/c;->t:I

    iput-object p2, p0, Ls3/c;->q:Landroid/os/IInterface;

    const/4 v3, 0x0

    if-eq p1, v1, :cond_b

    const/4 v1, 0x2

    const/4 v4, 0x3

    if-eq p1, v1, :cond_4

    if-eq p1, v4, :cond_4

    if-eq p1, v2, :cond_3

    goto/16 :goto_5

    :cond_3
    invoke-static {p2}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p2, Landroid/os/IInterface;

    invoke-virtual {p0, p2}, Ls3/c;->I(Landroid/os/IInterface;)V

    goto/16 :goto_5

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :cond_4
    iget-object v9, p0, Ls3/c;->s:Ls3/a0;

    if-eqz v9, :cond_5

    iget-object p1, p0, Ls3/c;->g:Ls3/o0;

    if-eqz p1, :cond_5

    const-string p2, "GmsClient"

    invoke-virtual {p1}, Ls3/o0;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ls3/o0;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Calling connect() while still connected, missing disconnect() for "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " on "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v5, p0, Ls3/c;->j:Ls3/h;

    iget-object p1, p0, Ls3/c;->g:Ls3/o0;

    invoke-virtual {p1}, Ls3/o0;->b()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Ls3/c;->g:Ls3/o0;

    invoke-virtual {p1}, Ls3/o0;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Ls3/c;->V()Ljava/lang/String;

    move-result-object v10

    iget-object p1, p0, Ls3/c;->g:Ls3/o0;

    invoke-virtual {p1}, Ls3/o0;->c()Z

    move-result v11

    const/16 v8, 0x1081

    invoke-virtual/range {v5 .. v11}, Ls3/h;->e(Ljava/lang/String;Ljava/lang/String;ILandroid/content/ServiceConnection;Ljava/lang/String;Z)V

    iget-object p1, p0, Ls3/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    :cond_5
    new-instance p1, Ls3/a0;

    iget-object p2, p0, Ls3/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p2

    invoke-direct {p1, p0, p2}, Ls3/a0;-><init>(Ls3/c;I)V

    iput-object p1, p0, Ls3/c;->s:Ls3/a0;

    iget p2, p0, Ls3/c;->t:I

    if-ne p2, v4, :cond_6

    invoke-virtual {p0}, Ls3/c;->z()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance p2, Ls3/o0;

    invoke-virtual {p0}, Ls3/c;->w()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Ls3/c;->z()Ljava/lang/String;

    move-result-object v6

    const/16 v8, 0x1081

    const/4 v9, 0x0

    const/4 v7, 0x1

    move-object v4, p2

    invoke-direct/range {v4 .. v9}, Ls3/o0;-><init>(Ljava/lang/String;Ljava/lang/String;ZIZ)V

    goto :goto_2

    :cond_6
    new-instance p2, Ls3/o0;

    invoke-virtual {p0}, Ls3/c;->E()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Ls3/c;->D()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Ls3/c;->G()Z

    move-result v9

    const/4 v7, 0x0

    const/16 v8, 0x1081

    move-object v4, p2

    invoke-direct/range {v4 .. v9}, Ls3/o0;-><init>(Ljava/lang/String;Ljava/lang/String;ZIZ)V

    :goto_2
    iput-object p2, p0, Ls3/c;->g:Ls3/o0;

    invoke-virtual {p2}, Ls3/o0;->c()Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-virtual {p0}, Ls3/c;->h()I

    move-result p2

    const v1, 0x1110e58

    if-lt p2, v1, :cond_7

    goto :goto_3

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    iget-object p2, p0, Ls3/c;->g:Ls3/o0;

    invoke-virtual {p2}, Ls3/o0;->b()Ljava/lang/String;

    move-result-object p2

    const-string v1, "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_3
    iget-object p2, p0, Ls3/c;->j:Ls3/h;

    iget-object v1, p0, Ls3/c;->g:Ls3/o0;

    invoke-virtual {v1}, Ls3/o0;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Ls3/c;->g:Ls3/o0;

    invoke-virtual {v2}, Ls3/o0;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Ls3/c;->V()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Ls3/c;->g:Ls3/o0;

    invoke-virtual {v5}, Ls3/o0;->c()Z

    move-result v5

    invoke-virtual {p0}, Ls3/c;->u()Ljava/util/concurrent/Executor;

    move-result-object v6

    new-instance v7, Ls3/h0;

    const/16 v8, 0x1081

    invoke-direct {v7, v1, v2, v8, v5}, Ls3/h0;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    invoke-virtual {p2, v7, p1, v4, v6}, Ls3/h;->c(Ls3/h0;Landroid/content/ServiceConnection;Ljava/lang/String;Ljava/util/concurrent/Executor;)Lr3/b;

    move-result-object p1

    invoke-virtual {p1}, Lr3/b;->i()Z

    move-result p2

    if-nez p2, :cond_c

    const-string p2, "GmsClient"

    iget-object v1, p0, Ls3/c;->g:Ls3/o0;

    invoke-virtual {v1}, Ls3/o0;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ls3/c;->g:Ls3/o0;

    invoke-virtual {v2}, Ls3/o0;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "unable to connect to service: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " on "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Lr3/b;->b()I

    move-result p2

    const/4 v1, -0x1

    if-ne p2, v1, :cond_9

    const/16 p2, 0x10

    goto :goto_4

    :cond_9
    invoke-virtual {p1}, Lr3/b;->b()I

    move-result p2

    :goto_4
    invoke-virtual {p1}, Lr3/b;->f()Landroid/app/PendingIntent;

    move-result-object v1

    if-eqz v1, :cond_a

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v1, "pendingIntent"

    invoke-virtual {p1}, Lr3/b;->f()Landroid/app/PendingIntent;

    move-result-object p1

    invoke-virtual {v3, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_a
    iget-object p1, p0, Ls3/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    invoke-virtual {p0, p2, v3, p1}, Ls3/c;->c0(ILandroid/os/Bundle;I)V

    goto :goto_5

    :cond_b
    iget-object v8, p0, Ls3/c;->s:Ls3/a0;

    if-eqz v8, :cond_c

    iget-object v4, p0, Ls3/c;->j:Ls3/h;

    iget-object p1, p0, Ls3/c;->g:Ls3/o0;

    invoke-virtual {p1}, Ls3/o0;->b()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ls3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Ls3/c;->g:Ls3/o0;

    invoke-virtual {p1}, Ls3/o0;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Ls3/c;->V()Ljava/lang/String;

    move-result-object v9

    iget-object p1, p0, Ls3/c;->g:Ls3/o0;

    invoke-virtual {p1}, Ls3/o0;->c()Z

    move-result v10

    const/16 v7, 0x1081

    invoke-virtual/range {v4 .. v10}, Ls3/h;->e(Ljava/lang/String;Ljava/lang/String;ILandroid/content/ServiceConnection;Ljava/lang/String;Z)V

    iput-object v3, p0, Ls3/c;->s:Ls3/a0;

    :cond_c
    :goto_5
    monitor-exit v0

    return-void

    :goto_6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method


# virtual methods
.method protected A()Ljava/util/Set;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final B()Landroid/os/IInterface;
    .locals 3

    iget-object v0, p0, Ls3/c;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Ls3/c;->t:I

    const/4 v2, 0x5

    if-eq v1, v2, :cond_0

    invoke-virtual {p0}, Ls3/c;->p()V

    iget-object v1, p0, Ls3/c;->q:Landroid/os/IInterface;

    const-string v2, "Client is connected but service is null"

    invoke-static {v1, v2}, Ls3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Landroid/os/IInterface;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    new-instance v1, Landroid/os/DeadObjectException;

    invoke-direct {v1}, Landroid/os/DeadObjectException;-><init>()V

    throw v1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method protected abstract C()Ljava/lang/String;
.end method

.method protected abstract D()Ljava/lang/String;
.end method

.method protected E()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms"

    return-object v0
.end method

.method public F()Ls3/e;
    .locals 1

    iget-object v0, p0, Ls3/c;->B:Ls3/d0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Ls3/d0;->d:Ls3/e;

    return-object v0
.end method

.method protected G()Z
    .locals 2

    invoke-virtual {p0}, Ls3/c;->h()I

    move-result v0

    const v1, 0xc9e4920

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public H()Z
    .locals 1

    iget-object v0, p0, Ls3/c;->B:Ls3/d0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected I(Landroid/os/IInterface;)V
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ls3/c;->c:J

    return-void
.end method

.method protected J(Lr3/b;)V
    .locals 2

    invoke-virtual {p1}, Lr3/b;->b()I

    move-result p1

    iput p1, p0, Ls3/c;->d:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ls3/c;->e:J

    return-void
.end method

.method protected K(I)V
    .locals 2

    iput p1, p0, Ls3/c;->a:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ls3/c;->b:J

    return-void
.end method

.method protected L(ILandroid/os/IBinder;Landroid/os/Bundle;I)V
    .locals 1

    new-instance v0, Ls3/b0;

    invoke-direct {v0, p0, p1, p2, p3}, Ls3/b0;-><init>(Ls3/c;ILandroid/os/IBinder;Landroid/os/Bundle;)V

    iget-object p1, p0, Ls3/c;->l:Landroid/os/Handler;

    const/4 p2, 0x1

    const/4 p3, -0x1

    invoke-virtual {p1, p2, p4, p3, v0}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object p2, p0, Ls3/c;->l:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public M()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public N(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ls3/c;->y:Ljava/lang/String;

    return-void
.end method

.method public O(I)V
    .locals 3

    iget-object v0, p0, Ls3/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    iget-object v1, p0, Ls3/c;->l:Landroid/os/Handler;

    const/4 v2, 0x6

    invoke-virtual {v1, v2, v0, p1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object p1

    iget-object v0, p0, Ls3/c;->l:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method protected P(Ls3/c$c;ILandroid/app/PendingIntent;)V
    .locals 2

    const-string v0, "Connection progress callbacks cannot be null."

    invoke-static {p1, v0}, Ls3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ls3/c;->p:Ls3/c$c;

    iget-object p1, p0, Ls3/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    iget-object v0, p0, Ls3/c;->l:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object p2, p0, Ls3/c;->l:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public Q()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected final V()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ls3/c;->x:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Ls3/c;->h:Landroid/content/Context;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ls3/c;->f:Ljava/lang/String;

    invoke-virtual {p0}, Ls3/c;->disconnect()V

    return-void
.end method

.method public c()Z
    .locals 4

    iget-object v0, p0, Ls3/c;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Ls3/c;->t:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :cond_1
    :goto_0
    monitor-exit v0

    return v3

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method protected final c0(ILandroid/os/Bundle;I)V
    .locals 2

    new-instance v0, Ls3/c0;

    invoke-direct {v0, p0, p1, p2}, Ls3/c0;-><init>(Ls3/c;ILandroid/os/Bundle;)V

    iget-object p1, p0, Ls3/c;->l:Landroid/os/Handler;

    const/4 p2, 0x7

    const/4 v1, -0x1

    invoke-virtual {p1, p2, p3, v1, v0}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object p2, p0, Ls3/c;->l:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ls3/c;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls3/c;->g:Ls3/o0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ls3/o0;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Failed to connect when checking package"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public disconnect()V
    .locals 4

    iget-object v0, p0, Ls3/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    iget-object v0, p0, Ls3/c;->r:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ls3/c;->r:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    iget-object v3, p0, Ls3/c;->r:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls3/Y;

    invoke-virtual {v3}, Ls3/Y;->d()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    iget-object v1, p0, Ls3/c;->r:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Ls3/c;->n:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x0

    :try_start_1
    iput-object v0, p0, Ls3/c;->o:Ls3/l;

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v1, 0x1

    invoke-direct {p0, v1, v0}, Ls3/c;->g0(ILandroid/os/IInterface;)V

    return-void

    :catchall_1
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    :goto_1
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method

.method public e(Ls3/c$e;)V
    .locals 0

    invoke-interface {p1}, Ls3/c$e;->a()V

    return-void
.end method

.method public f(Ls3/c$c;)V
    .locals 1

    const-string v0, "Connection progress callbacks cannot be null."

    invoke-static {p1, v0}, Ls3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ls3/c;->p:Ls3/c$c;

    const/4 p1, 0x2

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ls3/c;->g0(ILandroid/os/IInterface;)V

    return-void
.end method

.method public g()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public abstract h()I
.end method

.method public isConnected()Z
    .locals 3

    iget-object v0, p0, Ls3/c;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Ls3/c;->t:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final j()[Lr3/d;
    .locals 1

    iget-object v0, p0, Ls3/c;->B:Ls3/d0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Ls3/d0;->b:[Lr3/d;

    return-object v0
.end method

.method public k(Ls3/j;Ljava/util/Set;)V
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    invoke-virtual/range {p0 .. p0}, Ls3/c;->y()Landroid/os/Bundle;

    move-result-object v2

    new-instance v15, Ls3/f;

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1f

    if-ge v3, v4, :cond_0

    iget-object v3, v1, Ls3/c;->y:Ljava/lang/String;

    :goto_0
    move-object/from16 v17, v3

    goto :goto_1

    :cond_0
    iget-object v3, v1, Ls3/c;->y:Ljava/lang/String;

    goto :goto_0

    :goto_1
    iget v5, v1, Ls3/c;->w:I

    sget v6, Lr3/f;->a:I

    sget-object v9, Ls3/f;->o:[Lcom/google/android/gms/common/api/Scope;

    new-instance v10, Landroid/os/Bundle;

    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    sget-object v13, Ls3/f;->p:[Lr3/d;

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/4 v4, 0x6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x1

    move-object v3, v15

    move-object v12, v13

    move-object/from16 v19, v15

    move/from16 v15, v16

    move/from16 v16, v18

    invoke-direct/range {v3 .. v17}, Ls3/f;-><init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Lr3/d;[Lr3/d;ZIZLjava/lang/String;)V

    iget-object v3, v1, Ls3/c;->h:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v4, v19

    iput-object v3, v4, Ls3/f;->d:Ljava/lang/String;

    iput-object v2, v4, Ls3/f;->g:Landroid/os/Bundle;

    if-eqz v0, :cond_1

    const/4 v2, 0x0

    new-array v2, v2, [Lcom/google/android/gms/common/api/Scope;

    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/common/api/Scope;

    iput-object v0, v4, Ls3/f;->f:[Lcom/google/android/gms/common/api/Scope;

    :cond_1
    invoke-virtual/range {p0 .. p0}, Ls3/c;->m()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual/range {p0 .. p0}, Ls3/c;->s()Landroid/accounts/Account;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Landroid/accounts/Account;

    const-string v2, "<<default account>>"

    const-string v3, "com.google"

    invoke-direct {v0, v2, v3}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    iput-object v0, v4, Ls3/f;->h:Landroid/accounts/Account;

    if-eqz p1, :cond_4

    invoke-interface/range {p1 .. p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    iput-object v0, v4, Ls3/f;->e:Landroid/os/IBinder;

    goto :goto_2

    :cond_3
    invoke-virtual/range {p0 .. p0}, Ls3/c;->M()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual/range {p0 .. p0}, Ls3/c;->s()Landroid/accounts/Account;

    move-result-object v0

    iput-object v0, v4, Ls3/f;->h:Landroid/accounts/Account;

    :cond_4
    :goto_2
    sget-object v0, Ls3/c;->E:[Lr3/d;

    iput-object v0, v4, Ls3/f;->i:[Lr3/d;

    invoke-virtual/range {p0 .. p0}, Ls3/c;->t()[Lr3/d;

    move-result-object v0

    iput-object v0, v4, Ls3/f;->j:[Lr3/d;

    invoke-virtual/range {p0 .. p0}, Ls3/c;->Q()Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x1

    iput-boolean v0, v4, Ls3/f;->m:Z

    :cond_5
    :try_start_0
    iget-object v2, v1, Ls3/c;->n:Ljava/lang/Object;

    monitor-enter v2
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v0, v1, Ls3/c;->o:Ls3/l;

    if-eqz v0, :cond_6

    new-instance v3, Ls3/Z;

    iget-object v5, v1, Ls3/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v5

    invoke-direct {v3, v1, v5}, Ls3/Z;-><init>(Ls3/c;I)V

    invoke-interface {v0, v3, v4}, Ls3/l;->i0(Ls3/k;Ls3/f;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_6
    const-string v0, "GmsClient"

    const-string v3, "mServiceBroker is null, client disconnected"

    invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_3
    monitor-exit v2

    return-void

    :goto_4
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    goto :goto_5

    :catch_1
    move-exception v0

    goto :goto_5

    :catch_2
    move-exception v0

    goto :goto_6

    :catch_3
    move-exception v0

    goto :goto_7

    :goto_5
    const-string v2, "GmsClient"

    const-string v3, "IGmsServiceBroker.getService failed"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v0, v1, Ls3/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/16 v2, 0x8

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v3, v0}, Ls3/c;->L(ILandroid/os/IBinder;Landroid/os/Bundle;I)V

    return-void

    :goto_6
    throw v0

    :goto_7
    const-string v2, "GmsClient"

    const-string v3, "IGmsServiceBroker.getService failed"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v0, 0x3

    invoke-virtual {v1, v0}, Ls3/c;->O(I)V

    return-void
.end method

.method public l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ls3/c;->f:Ljava/lang/String;

    return-object v0
.end method

.method public m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public o()V
    .locals 3

    iget-object v0, p0, Ls3/c;->k:Lr3/f;

    iget-object v1, p0, Ls3/c;->h:Landroid/content/Context;

    invoke-virtual {p0}, Ls3/c;->h()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lr3/f;->h(Landroid/content/Context;I)I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2}, Ls3/c;->g0(ILandroid/os/IInterface;)V

    new-instance v1, Ls3/c$d;

    invoke-direct {v1, p0}, Ls3/c$d;-><init>(Ls3/c;)V

    invoke-virtual {p0, v1, v0, v2}, Ls3/c;->P(Ls3/c$c;ILandroid/app/PendingIntent;)V

    return-void

    :cond_0
    new-instance v0, Ls3/c$d;

    invoke-direct {v0, p0}, Ls3/c$d;-><init>(Ls3/c;)V

    invoke-virtual {p0, v0}, Ls3/c;->f(Ls3/c$c;)V

    return-void
.end method

.method protected final p()V
    .locals 2

    invoke-virtual {p0}, Ls3/c;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not connected. Call connect() and wait for onConnected() to be called."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected abstract q(Landroid/os/IBinder;)Landroid/os/IInterface;
.end method

.method protected r()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public s()Landroid/accounts/Account;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public t()[Lr3/d;
    .locals 1

    sget-object v0, Ls3/c;->E:[Lr3/d;

    return-object v0
.end method

.method protected u()Ljava/util/concurrent/Executor;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public v()Landroid/os/Bundle;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final w()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Ls3/c;->h:Landroid/content/Context;

    return-object v0
.end method

.method public x()I
    .locals 1

    iget v0, p0, Ls3/c;->w:I

    return v0
.end method

.method protected y()Landroid/os/Bundle;
    .locals 1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method protected z()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
