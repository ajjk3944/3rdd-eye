.class LG6/a$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LG6/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG6/a$c;->m(Ljava/util/concurrent/ExecutorService;Lgg/y;Ljava/util/concurrent/ExecutorService;)LG6/a$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/concurrent/ExecutorService;

.field final synthetic b:Lgg/y;

.field final synthetic c:Ljava/util/concurrent/ExecutorService;


# direct methods
.method constructor <init>(Ljava/util/concurrent/ExecutorService;Lgg/y;Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    iput-object p1, p0, LG6/a$c$a;->a:Ljava/util/concurrent/ExecutorService;

    iput-object p2, p0, LG6/a$c$a;->b:Lgg/y;

    iput-object p3, p0, LG6/a$c$a;->c:Ljava/util/concurrent/ExecutorService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, LG6/a$c$a;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    iget-object v0, p0, LG6/a$c$a;->b:Lgg/y;

    invoke-virtual {v0}, Lgg/y;->h()V

    iget-object v0, p0, LG6/a$c$a;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    return-void
.end method
