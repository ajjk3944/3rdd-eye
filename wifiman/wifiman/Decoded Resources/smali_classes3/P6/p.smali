.class public final LP6/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# instance fields
.field private final a:Lz2/a;


# direct methods
.method public constructor <init>(Lz2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP6/p;->a:Lz2/a;

    return-void
.end method

.method public static a(Lz2/a;)LP6/p;
    .locals 1

    new-instance v0, LP6/p;

    invoke-direct {v0, p0}, LP6/p;-><init>(Lz2/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;)LP6/o;
    .locals 1

    new-instance v0, LP6/o;

    invoke-direct {v0, p0}, LP6/o;-><init>(Landroid/content/Context;)V

    return-object v0
.end method


# virtual methods
.method public b()LP6/o;
    .locals 1

    iget-object v0, p0, LP6/p;->a:Lz2/a;

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, LP6/p;->c(Landroid/content/Context;)LP6/o;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LP6/p;->b()LP6/o;

    move-result-object v0

    return-object v0
.end method
