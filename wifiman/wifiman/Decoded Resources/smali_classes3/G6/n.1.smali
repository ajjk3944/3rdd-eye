.class public final LG6/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# instance fields
.field private final a:Lz2/a;

.field private final b:Lz2/a;

.field private final c:Lz2/a;


# direct methods
.method public constructor <init>(Lz2/a;Lz2/a;Lz2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG6/n;->a:Lz2/a;

    iput-object p2, p0, LG6/n;->b:Lz2/a;

    iput-object p3, p0, LG6/n;->c:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;Lz2/a;Lz2/a;)LG6/n;
    .locals 1

    new-instance v0, LG6/n;

    invoke-direct {v0, p0, p1, p2}, LG6/n;-><init>(Lz2/a;Lz2/a;Lz2/a;)V

    return-object v0
.end method

.method public static c(Ljava/util/concurrent/ExecutorService;Lgg/y;Ljava/util/concurrent/ExecutorService;)LG6/a$b;
    .locals 0

    invoke-static {p0, p1, p2}, LG6/a$c;->m(Ljava/util/concurrent/ExecutorService;Lgg/y;Ljava/util/concurrent/ExecutorService;)LG6/a$b;

    move-result-object p0

    invoke-static {p0}, Ly2/e;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LG6/a$b;

    return-object p0
.end method


# virtual methods
.method public b()LG6/a$b;
    .locals 3

    iget-object v0, p0, LG6/n;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ExecutorService;

    iget-object v1, p0, LG6/n;->b:Lz2/a;

    invoke-interface {v1}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgg/y;

    iget-object v2, p0, LG6/n;->c:Lz2/a;

    invoke-interface {v2}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/ExecutorService;

    invoke-static {v0, v1, v2}, LG6/n;->c(Ljava/util/concurrent/ExecutorService;Lgg/y;Ljava/util/concurrent/ExecutorService;)LG6/a$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LG6/n;->b()LG6/a$b;

    move-result-object v0

    return-object v0
.end method
