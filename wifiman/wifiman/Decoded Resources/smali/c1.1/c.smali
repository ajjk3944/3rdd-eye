.class public Lc1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Lc1/f;

.field b:Lc1/f;

.field c:Lc1/f;

.field d:[Lc1/i;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lc1/g;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Lc1/g;-><init>(I)V

    iput-object v0, p0, Lc1/c;->a:Lc1/f;

    new-instance v0, Lc1/g;

    invoke-direct {v0, v1}, Lc1/g;-><init>(I)V

    iput-object v0, p0, Lc1/c;->b:Lc1/f;

    new-instance v0, Lc1/g;

    invoke-direct {v0, v1}, Lc1/g;-><init>(I)V

    iput-object v0, p0, Lc1/c;->c:Lc1/f;

    const/16 v0, 0x20

    new-array v0, v0, [Lc1/i;

    iput-object v0, p0, Lc1/c;->d:[Lc1/i;

    return-void
.end method
