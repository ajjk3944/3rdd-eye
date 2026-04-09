.class public Landroidx/datastore/preferences/protobuf/l0;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Landroidx/datastore/preferences/protobuf/B;
.implements Ljava/util/RandomAccess;


# instance fields
.field private final a:Landroidx/datastore/preferences/protobuf/B;


# direct methods
.method public constructor <init>(Landroidx/datastore/preferences/protobuf/B;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, Landroidx/datastore/preferences/protobuf/l0;->a:Landroidx/datastore/preferences/protobuf/B;

    return-void
.end method

.method static synthetic b(Landroidx/datastore/preferences/protobuf/l0;)Landroidx/datastore/preferences/protobuf/B;
    .locals 0

    iget-object p0, p0, Landroidx/datastore/preferences/protobuf/l0;->a:Landroidx/datastore/preferences/protobuf/B;

    return-object p0
.end method


# virtual methods
.method public B(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/l0;->a:Landroidx/datastore/preferences/protobuf/B;

    invoke-interface {v0, p1}, Landroidx/datastore/preferences/protobuf/B;->B(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/l0;->a:Landroidx/datastore/preferences/protobuf/B;

    invoke-interface {v0}, Landroidx/datastore/preferences/protobuf/B;->d()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d0(Landroidx/datastore/preferences/protobuf/g;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public e(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/l0;->a:Landroidx/datastore/preferences/protobuf/B;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/datastore/preferences/protobuf/l0;->e(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public h()Landroidx/datastore/preferences/protobuf/B;
    .locals 0

    return-object p0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, Landroidx/datastore/preferences/protobuf/l0$b;

    invoke-direct {v0, p0}, Landroidx/datastore/preferences/protobuf/l0$b;-><init>(Landroidx/datastore/preferences/protobuf/l0;)V

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 1

    new-instance v0, Landroidx/datastore/preferences/protobuf/l0$a;

    invoke-direct {v0, p0, p1}, Landroidx/datastore/preferences/protobuf/l0$a;-><init>(Landroidx/datastore/preferences/protobuf/l0;I)V

    return-object v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/l0;->a:Landroidx/datastore/preferences/protobuf/B;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
