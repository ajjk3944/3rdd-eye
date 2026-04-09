.class public final Ltg/c;
.super Lgg/s;
.source "SourceFile"


# instance fields
.field final a:LBg/a;

.field final b:I

.field final c:Lkg/f;

.field final d:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>(LBg/a;ILkg/f;)V
    .locals 0

    invoke-direct {p0}, Lgg/s;-><init>()V

    iput-object p1, p0, Ltg/c;->a:LBg/a;

    iput p2, p0, Ltg/c;->b:I

    iput-object p3, p0, Ltg/c;->c:Lkg/f;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Ltg/c;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method


# virtual methods
.method public L0(Lgg/x;)V
    .locals 1

    iget-object v0, p0, Ltg/c;->a:LBg/a;

    invoke-virtual {v0, p1}, Lgg/s;->d(Lgg/x;)V

    iget-object p1, p0, Ltg/c;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result p1

    iget v0, p0, Ltg/c;->b:I

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Ltg/c;->a:LBg/a;

    iget-object v0, p0, Ltg/c;->c:Lkg/f;

    invoke-virtual {p1, v0}, LBg/a;->k1(Lkg/f;)V

    :cond_0
    return-void
.end method
