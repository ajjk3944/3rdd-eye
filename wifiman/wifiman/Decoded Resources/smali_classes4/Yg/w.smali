.class final LYg/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYg/m;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYg/w$a;
    }
.end annotation


# static fields
.field public static final d:LYg/w$a;

.field private static final e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile a:Lmh/a;

.field private volatile b:Ljava/lang/Object;

.field private final c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LYg/w$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYg/w$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LYg/w;->d:LYg/w$a;

    const-class v0, Ljava/lang/Object;

    const-string v1, "b"

    const-class v2, LYg/w;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, LYg/w;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lmh/a;)V
    .locals 1

    const-string v0, "initializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYg/w;->a:Lmh/a;

    sget-object p1, LYg/G;->a:LYg/G;

    iput-object p1, p0, LYg/w;->b:Ljava/lang/Object;

    iput-object p1, p0, LYg/w;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getValue()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LYg/w;->b:Ljava/lang/Object;

    sget-object v1, LYg/G;->a:LYg/G;

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, LYg/w;->a:Lmh/a;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LYg/w;->e:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v2, p0, v1, v0}, Landroidx/concurrent/futures/b;->a(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    iput-object v1, p0, LYg/w;->a:Lmh/a;

    return-object v0

    :cond_1
    iget-object v0, p0, LYg/w;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public m()Z
    .locals 2

    iget-object v0, p0, LYg/w;->b:Ljava/lang/Object;

    sget-object v1, LYg/G;->a:LYg/G;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, LYg/w;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LYg/w;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "Lazy value not initialized yet."

    :goto_0
    return-object v0
.end method
