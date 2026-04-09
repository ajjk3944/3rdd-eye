.class public final LP6/D;
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

    iput-object p1, p0, LP6/D;->a:Lz2/a;

    iput-object p2, p0, LP6/D;->b:Lz2/a;

    iput-object p3, p0, LP6/D;->c:Lz2/a;

    iput-object p4, p0, LP6/D;->d:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;Lz2/a;Lz2/a;Lz2/a;)LP6/D;
    .locals 1

    new-instance v0, LP6/D;

    invoke-direct {v0, p0, p1, p2, p3}, LP6/D;-><init>(Lz2/a;Lz2/a;Lz2/a;Lz2/a;)V

    return-object v0
.end method

.method public static c(LP6/m;LP6/q;ZZ)LP6/C;
    .locals 1

    new-instance v0, LP6/C;

    invoke-direct {v0, p0, p1, p2, p3}, LP6/C;-><init>(LP6/m;LP6/q;ZZ)V

    return-object v0
.end method


# virtual methods
.method public b()LP6/C;
    .locals 4

    iget-object v0, p0, LP6/D;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP6/m;

    iget-object v1, p0, LP6/D;->b:Lz2/a;

    invoke-interface {v1}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LP6/q;

    iget-object v2, p0, LP6/D;->c:Lz2/a;

    invoke-interface {v2}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iget-object v3, p0, LP6/D;->d:Lz2/a;

    invoke-interface {v3}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-static {v0, v1, v2, v3}, LP6/D;->c(LP6/m;LP6/q;ZZ)LP6/C;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LP6/D;->b()LP6/C;

    move-result-object v0

    return-object v0
.end method
