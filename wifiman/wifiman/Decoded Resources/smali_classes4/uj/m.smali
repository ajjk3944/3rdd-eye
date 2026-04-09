.class public final Luj/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luj/q;


# instance fields
.field private final a:Luj/w;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Luj/w;

    invoke-direct {v0}, Luj/w;-><init>()V

    iput-object v0, p0, Luj/m;->a:Luj/w;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Luj/s;
    .locals 0

    invoke-virtual {p0, p1}, Luj/m;->b(Ljava/lang/Object;)Luj/w;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Object;)Luj/w;
    .locals 0

    iget-object p1, p0, Luj/m;->a:Luj/w;

    return-object p1
.end method
