.class public final LK6/M;
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

    iput-object p1, p0, LK6/M;->a:Lz2/a;

    iput-object p2, p0, LK6/M;->b:Lz2/a;

    iput-object p3, p0, LK6/M;->c:Lz2/a;

    iput-object p4, p0, LK6/M;->d:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;Lz2/a;Lz2/a;Lz2/a;)LK6/M;
    .locals 1

    new-instance v0, LK6/M;

    invoke-direct {v0, p0, p1, p2, p3}, LK6/M;-><init>(Lz2/a;Lz2/a;Lz2/a;Lz2/a;)V

    return-object v0
.end method

.method public static c(LO6/d;Ljava/lang/Object;LG6/N;LM6/k;)LK6/L;
    .locals 1

    new-instance v0, LK6/L;

    check-cast p1, LK6/N;

    invoke-direct {v0, p0, p1, p2, p3}, LK6/L;-><init>(LO6/d;LK6/N;LG6/N;LM6/k;)V

    return-object v0
.end method


# virtual methods
.method public b()LK6/L;
    .locals 4

    iget-object v0, p0, LK6/M;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LO6/d;

    iget-object v1, p0, LK6/M;->b:Lz2/a;

    invoke-interface {v1}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, LK6/M;->c:Lz2/a;

    invoke-interface {v2}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LG6/N;

    iget-object v3, p0, LK6/M;->d:Lz2/a;

    invoke-interface {v3}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LM6/k;

    invoke-static {v0, v1, v2, v3}, LK6/M;->c(LO6/d;Ljava/lang/Object;LG6/N;LM6/k;)LK6/L;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LK6/M;->b()LK6/L;

    move-result-object v0

    return-object v0
.end method
