.class public final LP6/w;
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

    iput-object p1, p0, LP6/w;->a:Lz2/a;

    iput-object p2, p0, LP6/w;->b:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;Lz2/a;)LP6/w;
    .locals 1

    new-instance v0, LP6/w;

    invoke-direct {v0, p0, p1}, LP6/w;-><init>(Lz2/a;Lz2/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;LP6/x;)LP6/v;
    .locals 1

    new-instance v0, LP6/v;

    invoke-direct {v0, p0, p1}, LP6/v;-><init>(Landroid/content/Context;LP6/x;)V

    return-object v0
.end method


# virtual methods
.method public b()LP6/v;
    .locals 2

    iget-object v0, p0, LP6/w;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, LP6/w;->b:Lz2/a;

    invoke-interface {v1}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LP6/x;

    invoke-static {v0, v1}, LP6/w;->c(Landroid/content/Context;LP6/x;)LP6/v;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LP6/w;->b()LP6/v;

    move-result-object v0

    return-object v0
.end method
