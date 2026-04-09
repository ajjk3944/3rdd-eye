.class final Landroidx/datastore/preferences/protobuf/g$e;
.super Landroidx/datastore/preferences/protobuf/g$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/datastore/preferences/protobuf/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation


# instance fields
.field private final f:I

.field private final g:I


# direct methods
.method constructor <init>([BII)V
    .locals 1

    invoke-direct {p0, p1}, Landroidx/datastore/preferences/protobuf/g$i;-><init>([B)V

    add-int v0, p2, p3

    array-length p1, p1

    invoke-static {p2, v0, p1}, Landroidx/datastore/preferences/protobuf/g;->o(III)I

    iput p2, p0, Landroidx/datastore/preferences/protobuf/g$e;->f:I

    iput p3, p0, Landroidx/datastore/preferences/protobuf/g$e;->g:I

    return-void
.end method


# virtual methods
.method C(I)B
    .locals 2

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/g$i;->e:[B

    iget v1, p0, Landroidx/datastore/preferences/protobuf/g$e;->f:I

    add-int/2addr v1, p1

    aget-byte p1, v0, v1

    return p1
.end method

.method protected Y0()I
    .locals 1

    iget v0, p0, Landroidx/datastore/preferences/protobuf/g$e;->f:I

    return v0
.end method

.method public j(I)B
    .locals 2

    invoke-virtual {p0}, Landroidx/datastore/preferences/protobuf/g$e;->size()I

    move-result v0

    invoke-static {p1, v0}, Landroidx/datastore/preferences/protobuf/g;->m(II)V

    iget-object v0, p0, Landroidx/datastore/preferences/protobuf/g$i;->e:[B

    iget v1, p0, Landroidx/datastore/preferences/protobuf/g$e;->f:I

    add-int/2addr v1, p1

    aget-byte p1, v0, v1

    return p1
.end method

.method public size()I
    .locals 1

    iget v0, p0, Landroidx/datastore/preferences/protobuf/g$e;->g:I

    return v0
.end method
