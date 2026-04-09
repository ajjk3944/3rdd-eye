.class public final Ly2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c;


# instance fields
.field private a:Lz2/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lz2/a;Lz2/a;)V
    .locals 1

    invoke-static {p1}, Ly2/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Ly2/a;

    iget-object v0, p0, Ly2/a;->a:Lz2/a;

    if-nez v0, :cond_0

    iput-object p1, p0, Ly2/a;->a:Lz2/a;

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ly2/a;->a:Lz2/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lz2/a;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
