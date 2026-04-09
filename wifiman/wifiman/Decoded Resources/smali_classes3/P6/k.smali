.class public final LP6/k;
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

    iput-object p1, p0, LP6/k;->a:Lz2/a;

    iput-object p2, p0, LP6/k;->b:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;Lz2/a;)LP6/k;
    .locals 1

    new-instance v0, LP6/k;

    invoke-direct {v0, p0, p1}, LP6/k;-><init>(Lz2/a;Lz2/a;)V

    return-object v0
.end method

.method public static c(LP6/o;[[Ljava/lang/String;)LP6/j;
    .locals 1

    new-instance v0, LP6/j;

    invoke-direct {v0, p0, p1}, LP6/j;-><init>(LP6/o;[[Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public b()LP6/j;
    .locals 2

    iget-object v0, p0, LP6/k;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP6/o;

    iget-object v1, p0, LP6/k;->b:Lz2/a;

    invoke-interface {v1}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[Ljava/lang/String;

    invoke-static {v0, v1}, LP6/k;->c(LP6/o;[[Ljava/lang/String;)LP6/j;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LP6/k;->b()LP6/j;

    move-result-object v0

    return-object v0
.end method
