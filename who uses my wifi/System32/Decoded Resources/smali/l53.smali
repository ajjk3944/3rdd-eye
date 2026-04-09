.class public final Ll53;
.super Ljava/lang/Object;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Lca4;


# instance fields
.field public final a:Lga4;

.field public final b:Lga4;

.field public final c:Lga4;


# direct methods
.method public constructor <init>(Lhh2;Lph2;Llh2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll53;->a:Lga4;

    .line 5
    .line 6
    iput-object p2, p0, Ll53;->b:Lga4;

    .line 7
    .line 8
    iput-object p3, p0, Ll53;->c:Lga4;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Le33;
    .locals 6

    .line 1
    sget-object v1, Lmd2;->a:Lld2;

    .line 2
    .line 3
    invoke-static {v1}, Li41;->M(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ll53;->a:Lga4;

    .line 7
    .line 8
    check-cast v0, Lhh2;

    .line 9
    .line 10
    invoke-virtual {v0}, Lhh2;->a()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iget-object v0, p0, Ll53;->b:Lga4;

    .line 15
    .line 16
    check-cast v0, Lph2;

    .line 17
    .line 18
    invoke-virtual {v0}, Lph2;->a()Le51;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    iget-object v0, p0, Ll53;->c:Lga4;

    .line 23
    .line 24
    check-cast v0, Llh2;

    .line 25
    .line 26
    invoke-virtual {v0}, Llh2;->a()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    new-instance v0, Le33;

    .line 31
    .line 32
    const/4 v5, 0x7

    .line 33
    invoke-direct/range {v0 .. v5}, Le33;-><init>(Lpq3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method public final bridge synthetic d()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ll53;->a()Le33;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
