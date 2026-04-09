.class public final Lvb/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/E;


# instance fields
.field private a:Lgg/z;

.field private final b:Ljava/util/concurrent/Semaphore;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/Semaphore;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object v0, p0, Lvb/c;->b:Ljava/util/concurrent/Semaphore;

    return-void
.end method

.method public static synthetic b(Lvb/c;Lgg/z;)Lgg/D;
    .locals 0

    invoke-static {p0, p1}, Lvb/c;->d(Lvb/c;Lgg/z;)Lgg/D;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lvb/c;Lgg/z;)V
    .locals 0

    iput-object p1, p0, Lvb/c;->a:Lgg/z;

    return-void
.end method

.method private static final d(Lvb/c;Lgg/z;)Lgg/D;
    .locals 1

    iget-object v0, p0, Lvb/c;->b:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->acquireUninterruptibly()V

    iget-object v0, p0, Lvb/c;->a:Lgg/z;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lvb/c;->b:Ljava/util/concurrent/Semaphore;

    invoke-virtual {p1}, Ljava/util/concurrent/Semaphore;->release()V

    iget-object p0, p0, Lvb/c;->a:Lgg/z;

    goto :goto_0

    :cond_0
    new-instance v0, Lvb/c$a;

    invoke-direct {v0, p0}, Lvb/c$a;-><init>(Lvb/c;)V

    invoke-virtual {p1, v0}, Lgg/z;->m(Lkg/f;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->e()Lgg/z;

    move-result-object p1

    iput-object p1, p0, Lvb/c;->a:Lgg/z;

    iget-object p0, p0, Lvb/c;->b:Ljava/util/concurrent/Semaphore;

    invoke-virtual {p0}, Ljava/util/concurrent/Semaphore;->release()V

    move-object p0, p1

    :goto_0
    return-object p0
.end method


# virtual methods
.method public a(Lgg/z;)Lgg/D;
    .locals 1

    const-string/jumbo v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvb/b;

    invoke-direct {v0, p0, p1}, Lvb/b;-><init>(Lvb/c;Lgg/z;)V

    invoke-static {v0}, Lgg/z;->j(Lkg/q;)Lgg/z;

    move-result-object p1

    const-string/jumbo v0, "defer(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
