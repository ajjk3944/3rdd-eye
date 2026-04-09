.class final Lb3/g$b;
.super Lb3/q$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:[B

.field private b:[B


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb3/q$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lb3/q;
    .locals 4

    new-instance v0, Lb3/g;

    iget-object v1, p0, Lb3/g$b;->a:[B

    iget-object v2, p0, Lb3/g$b;->b:[B

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lb3/g;-><init>([B[BLb3/g$a;)V

    return-object v0
.end method

.method public b([B)Lb3/q$a;
    .locals 0

    iput-object p1, p0, Lb3/g$b;->a:[B

    return-object p0
.end method

.method public c([B)Lb3/q$a;
    .locals 0

    iput-object p1, p0, Lb3/g$b;->b:[B

    return-object p0
.end method
