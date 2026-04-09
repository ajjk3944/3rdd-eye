.class public final LP6/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# instance fields
.field private final a:Lz2/a;

.field private final b:Lz2/a;

.field private final c:Lz2/a;

.field private final d:Lz2/a;

.field private final e:Lz2/a;


# direct methods
.method public constructor <init>(Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP6/t;->a:Lz2/a;

    iput-object p2, p0, LP6/t;->b:Lz2/a;

    iput-object p3, p0, LP6/t;->c:Lz2/a;

    iput-object p4, p0, LP6/t;->d:Lz2/a;

    iput-object p5, p0, LP6/t;->e:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;)LP6/t;
    .locals 7

    new-instance v6, LP6/t;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LP6/t;-><init>(Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;)V

    return-object v6
.end method

.method public static c(LP6/G;Lgg/s;Lgg/s;LP6/x;Lgg/y;)LP6/s;
    .locals 7

    new-instance v6, LP6/s;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LP6/s;-><init>(LP6/G;Lgg/s;Lgg/s;LP6/x;Lgg/y;)V

    return-object v6
.end method


# virtual methods
.method public b()LP6/s;
    .locals 5

    iget-object v0, p0, LP6/t;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP6/G;

    iget-object v1, p0, LP6/t;->b:Lz2/a;

    invoke-interface {v1}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgg/s;

    iget-object v2, p0, LP6/t;->c:Lz2/a;

    invoke-interface {v2}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lgg/s;

    iget-object v3, p0, LP6/t;->d:Lz2/a;

    invoke-interface {v3}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LP6/x;

    iget-object v4, p0, LP6/t;->e:Lz2/a;

    invoke-interface {v4}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lgg/y;

    invoke-static {v0, v1, v2, v3, v4}, LP6/t;->c(LP6/G;Lgg/s;Lgg/s;LP6/x;Lgg/y;)LP6/s;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LP6/t;->b()LP6/s;

    move-result-object v0

    return-object v0
.end method
