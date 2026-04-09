.class public final LN6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# instance fields
.field private final a:Lz2/a;

.field private final b:Lz2/a;


# direct methods
.method public constructor <init>(Lz2/a;Lz2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LN6/g;->a:Lz2/a;

    iput-object p2, p0, LN6/g;->b:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;Lz2/a;)LN6/g;
    .locals 1

    new-instance v0, LN6/g;

    invoke-direct {v0, p0, p1}, LN6/g;-><init>(Lz2/a;Lz2/a;)V

    return-object v0
.end method

.method public static c(LP6/I;LN6/j;)LN6/f;
    .locals 1

    new-instance v0, LN6/f;

    invoke-direct {v0, p0, p1}, LN6/f;-><init>(LP6/I;LN6/j;)V

    return-object v0
.end method


# virtual methods
.method public b()LN6/f;
    .locals 2

    iget-object v0, p0, LN6/g;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP6/I;

    iget-object v1, p0, LN6/g;->b:Lz2/a;

    invoke-interface {v1}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LN6/j;

    invoke-static {v0, v1}, LN6/g;->c(LP6/I;LN6/j;)LN6/f;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN6/g;->b()LN6/f;

    move-result-object v0

    return-object v0
.end method
