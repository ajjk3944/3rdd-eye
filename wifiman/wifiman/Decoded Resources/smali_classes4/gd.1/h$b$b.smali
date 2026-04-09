.class final Lgd/h$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgd/h$b;->b(Lgd/a$a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lgd/a$a;

.field final synthetic b:Ljava/util/concurrent/atomic/AtomicInteger;

.field final synthetic c:I

.field final synthetic d:Lgd/g$b$b;

.field final synthetic e:Ljava/util/concurrent/CopyOnWriteArraySet;

.field final synthetic f:Lgd/h;


# direct methods
.method constructor <init>(Lgd/a$a;Ljava/util/concurrent/atomic/AtomicInteger;ILgd/g$b$b;Ljava/util/concurrent/CopyOnWriteArraySet;Lgd/h;)V
    .locals 0

    iput-object p1, p0, Lgd/h$b$b;->a:Lgd/a$a;

    iput-object p2, p0, Lgd/h$b$b;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    iput p3, p0, Lgd/h$b$b;->c:I

    iput-object p4, p0, Lgd/h$b$b;->d:Lgd/g$b$b;

    iput-object p5, p0, Lgd/h$b$b;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    iput-object p6, p0, Lgd/h$b$b;->f:Lgd/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Integer;)Lgd/g$b;
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lgd/h$b$b;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    iget v2, p0, Lgd/h$b$b;->c:I

    iget-object v3, p0, Lgd/h$b$b;->d:Lgd/g$b$b;

    iget-object v4, p0, Lgd/h$b$b;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    iget-object v5, p0, Lgd/h$b$b;->f:Lgd/h;

    iget-object v6, p0, Lgd/h$b$b;->a:Lgd/a$a;

    invoke-static {v6}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-static/range {v1 .. v6}, Lgd/h;->e(Ljava/util/concurrent/atomic/AtomicInteger;ILgd/g$b$b;Ljava/util/concurrent/CopyOnWriteArraySet;Lgd/h;Lgd/a$a;)Lgd/g$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lgd/h$b$b;->a(Ljava/lang/Integer;)Lgd/g$b;

    move-result-object p1

    return-object p1
.end method
