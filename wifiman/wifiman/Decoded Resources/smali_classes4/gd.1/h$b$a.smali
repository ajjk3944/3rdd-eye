.class final Lgd/h$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgd/h$b;->b(Lgd/a$a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lgd/h;

.field final synthetic b:Lgd/g$b$b;

.field final synthetic c:Ljava/util/concurrent/CopyOnWriteArraySet;

.field final synthetic d:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method constructor <init>(Lgd/h;Lgd/g$b$b;Ljava/util/concurrent/CopyOnWriteArraySet;Ljava/util/concurrent/atomic/AtomicInteger;)V
    .locals 0

    iput-object p1, p0, Lgd/h$b$a;->a:Lgd/h;

    iput-object p2, p0, Lgd/h$b$a;->b:Lgd/g$b$b;

    iput-object p3, p0, Lgd/h$b$a;->c:Ljava/util/concurrent/CopyOnWriteArraySet;

    iput-object p4, p0, Lgd/h$b$a;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Integer;)V
    .locals 5

    const-string v0, "portToCheck"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lgd/h$b$a;->a:Lgd/h;

    iget-object v1, p0, Lgd/h$b$a;->b:Lgd/g$b$b;

    invoke-virtual {v1}, Lgd/g$b$b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Lgd/h$b$a;->a:Lgd/h;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v3, v4}, Lgd/h;->h(I)I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lgd/h;->c(Lgd/h;Ljava/lang/String;II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lgd/h$b$a;->c:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object p1, p0, Lgd/h$b$a;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lgd/h$b$a;->a(Ljava/lang/Integer;)V

    return-void
.end method
