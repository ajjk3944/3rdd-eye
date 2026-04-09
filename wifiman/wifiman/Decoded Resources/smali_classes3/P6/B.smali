.class public final LP6/B;
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

    iput-object p1, p0, LP6/B;->a:Lz2/a;

    iput-object p2, p0, LP6/B;->b:Lz2/a;

    iput-object p3, p0, LP6/B;->c:Lz2/a;

    iput-object p4, p0, LP6/B;->d:Lz2/a;

    iput-object p5, p0, LP6/B;->e:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;)LP6/B;
    .locals 7

    new-instance v6, LP6/B;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, LP6/B;-><init>(Lz2/a;Lz2/a;Lz2/a;Lz2/a;Lz2/a;)V

    return-object v6
.end method

.method public static c(LP6/m;LP6/q;IIZ)LP6/A;
    .locals 7

    new-instance v6, LP6/A;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, LP6/A;-><init>(LP6/m;LP6/q;IIZ)V

    return-object v6
.end method


# virtual methods
.method public b()LP6/A;
    .locals 5

    iget-object v0, p0, LP6/B;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP6/m;

    iget-object v1, p0, LP6/B;->b:Lz2/a;

    invoke-interface {v1}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LP6/q;

    iget-object v2, p0, LP6/B;->c:Lz2/a;

    invoke-interface {v2}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, LP6/B;->d:Lz2/a;

    invoke-interface {v3}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, p0, LP6/B;->e:Lz2/a;

    invoke-interface {v4}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-static {v0, v1, v2, v3, v4}, LP6/B;->c(LP6/m;LP6/q;IIZ)LP6/A;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LP6/B;->b()LP6/A;

    move-result-object v0

    return-object v0
.end method
