.class public final LO6/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# instance fields
.field private final a:Lz2/a;

.field private final b:Lz2/a;

.field private final c:Lz2/a;

.field private final d:Lz2/a;


# direct methods
.method public constructor <init>(Lz2/a;Lz2/a;Lz2/a;Lz2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO6/f;->a:Lz2/a;

    iput-object p2, p0, LO6/f;->b:Lz2/a;

    iput-object p3, p0, LO6/f;->c:Lz2/a;

    iput-object p4, p0, LO6/f;->d:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;Lz2/a;Lz2/a;Lz2/a;)LO6/f;
    .locals 1

    new-instance v0, LO6/f;

    invoke-direct {v0, p0, p1, p2, p3}, LO6/f;-><init>(Lz2/a;Lz2/a;Lz2/a;Lz2/a;)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;LK6/B;Ljava/util/concurrent/ExecutorService;Lgg/y;)LO6/e;
    .locals 1

    new-instance v0, LO6/e;

    invoke-direct {v0, p0, p1, p2, p3}, LO6/e;-><init>(Ljava/lang/String;LK6/B;Ljava/util/concurrent/ExecutorService;Lgg/y;)V

    return-object v0
.end method


# virtual methods
.method public b()LO6/e;
    .locals 4

    iget-object v0, p0, LO6/f;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, LO6/f;->b:Lz2/a;

    invoke-interface {v1}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LK6/B;

    iget-object v2, p0, LO6/f;->c:Lz2/a;

    invoke-interface {v2}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/ExecutorService;

    iget-object v3, p0, LO6/f;->d:Lz2/a;

    invoke-interface {v3}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lgg/y;

    invoke-static {v0, v1, v2, v3}, LO6/f;->c(Ljava/lang/String;LK6/B;Ljava/util/concurrent/ExecutorService;Lgg/y;)LO6/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LO6/f;->b()LO6/e;

    move-result-object v0

    return-object v0
.end method
