.class final Lgd/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgd/h;->b(Lgd/g$b$b;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lgd/h;

.field final synthetic b:Ljava/util/concurrent/atomic/AtomicInteger;

.field final synthetic c:I

.field final synthetic d:Lgd/g$b$b;

.field final synthetic e:Ljava/util/concurrent/CopyOnWriteArraySet;

.field final synthetic f:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method constructor <init>(Lgd/h;Ljava/util/concurrent/atomic/AtomicInteger;ILgd/g$b$b;Ljava/util/concurrent/CopyOnWriteArraySet;Ljava/util/concurrent/atomic/AtomicInteger;)V
    .locals 0

    iput-object p1, p0, Lgd/h$b;->a:Lgd/h;

    iput-object p2, p0, Lgd/h$b;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    iput p3, p0, Lgd/h$b;->c:I

    iput-object p4, p0, Lgd/h$b;->d:Lgd/g$b$b;

    iput-object p5, p0, Lgd/h$b;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    iput-object p6, p0, Lgd/h$b;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/util/concurrent/atomic/AtomicInteger;ILgg/h;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lgd/h$b;->c(Ljava/util/concurrent/atomic/AtomicInteger;ILgg/h;)V

    return-void
.end method

.method private static final c(Ljava/util/concurrent/atomic/AtomicInteger;ILgg/h;)V
    .locals 1

    const-string v0, "emitter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p0

    if-le p0, p1, :cond_0

    invoke-interface {p2}, Lgg/h;->a()V

    goto :goto_0

    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p2, p0}, Lgg/h;->h(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgd/a$a;

    invoke-virtual {p0, p1}, Lgd/h$b;->b(Lgd/a$a;)LDj/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lgd/a$a;)LDj/a;
    .locals 11

    const-string v0, "knownServices"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x32

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lsh/m;->s(II)Lsh/i;

    move-result-object v0

    iget-object v2, p0, Lgd/h$b;->a:Lgd/h;

    iget-object v3, p0, Lgd/h$b;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    iget v4, p0, Lgd/h$b;->c:I

    iget-object v5, p0, Lgd/h$b;->d:Lgd/g$b$b;

    iget-object v6, p0, Lgd/h$b;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    iget-object v7, p0, Lgd/h$b;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v0, v9}, LZg/v;->w(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    move-object v9, v0

    check-cast v9, LZg/Q;

    invoke-virtual {v9}, LZg/Q;->d()I

    new-instance v9, Lgd/i;

    invoke-direct {v9, v3, v4}, Lgd/i;-><init>(Ljava/util/concurrent/atomic/AtomicInteger;I)V

    invoke-static {v9}, Lgg/i;->C0(Lkg/f;)Lgg/i;

    move-result-object v9

    new-instance v10, Lgd/h$b$a;

    invoke-direct {v10, v2, v5, v6, v7}, Lgd/h$b$a;-><init>(Lgd/h;Lgd/g$b$b;Ljava/util/concurrent/CopyOnWriteArraySet;Ljava/util/concurrent/atomic/AtomicInteger;)V

    invoke-virtual {v9, v10}, Lgg/i;->f0(Lkg/f;)Lgg/i;

    move-result-object v9

    invoke-static {v2}, Lgd/h;->d(Lgd/h;)Lgg/y;

    move-result-object v10

    invoke-virtual {v9, v10}, Lgg/i;->F1(Lgg/y;)Lgg/i;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v8}, Lgg/i;->S0(Ljava/lang/Iterable;)Lgg/i;

    move-result-object v0

    const/4 v2, -0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lgg/i;->z1(Ljava/lang/Object;)Lgg/i;

    move-result-object v0

    new-instance v9, Lgd/h$b$b;

    iget-object v4, p0, Lgd/h$b;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    iget v5, p0, Lgd/h$b;->c:I

    iget-object v6, p0, Lgd/h$b;->d:Lgd/g$b$b;

    iget-object v7, p0, Lgd/h$b;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    iget-object v8, p0, Lgd/h$b;->a:Lgd/h;

    move-object v2, v9

    move-object v3, p1

    invoke-direct/range {v2 .. v8}, Lgd/h$b$b;-><init>(Lgd/a$a;Ljava/util/concurrent/atomic/AtomicInteger;ILgd/g$b$b;Ljava/util/concurrent/CopyOnWriteArraySet;Lgd/h;)V

    invoke-virtual {v0, v9}, Lgg/i;->N0(Lkg/n;)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->e1()Lgg/i;

    move-result-object p1

    invoke-static {}, LGg/a;->a()Lgg/y;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, Lgg/i;->Y0(Lgg/y;ZI)Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->W()Lgg/i;

    move-result-object p1

    return-object p1
.end method
