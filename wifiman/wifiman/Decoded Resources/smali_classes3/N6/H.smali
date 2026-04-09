.class public final LN6/H;
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

    iput-object p1, p0, LN6/H;->a:Lz2/a;

    iput-object p2, p0, LN6/H;->b:Lz2/a;

    iput-object p3, p0, LN6/H;->c:Lz2/a;

    iput-object p4, p0, LN6/H;->d:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;Lz2/a;Lz2/a;Lz2/a;)LN6/H;
    .locals 1

    new-instance v0, LN6/H;

    invoke-direct {v0, p0, p1, p2, p3}, LN6/H;-><init>(Lz2/a;Lz2/a;Lz2/a;Lz2/a;)V

    return-object v0
.end method

.method public static c(LP6/G;LN6/f;LN6/y;LN6/a;)LN6/G;
    .locals 1

    new-instance v0, LN6/G;

    invoke-direct {v0, p0, p1, p2, p3}, LN6/G;-><init>(LP6/G;LN6/f;LN6/y;LN6/a;)V

    return-object v0
.end method


# virtual methods
.method public b()LN6/G;
    .locals 4

    iget-object v0, p0, LN6/H;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP6/G;

    iget-object v1, p0, LN6/H;->b:Lz2/a;

    invoke-interface {v1}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LN6/f;

    iget-object v2, p0, LN6/H;->c:Lz2/a;

    invoke-interface {v2}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LN6/y;

    iget-object v3, p0, LN6/H;->d:Lz2/a;

    invoke-interface {v3}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LN6/a;

    invoke-static {v0, v1, v2, v3}, LN6/H;->c(LP6/G;LN6/f;LN6/y;LN6/a;)LN6/G;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN6/H;->b()LN6/G;

    move-result-object v0

    return-object v0
.end method
