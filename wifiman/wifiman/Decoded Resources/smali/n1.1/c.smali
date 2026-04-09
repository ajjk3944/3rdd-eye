.class public Ln1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Ln1/f;

.field b:Ln1/f;

.field c:Ln1/f;

.field d:[Ln1/i;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ln1/g;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Ln1/g;-><init>(I)V

    iput-object v0, p0, Ln1/c;->a:Ln1/f;

    new-instance v0, Ln1/g;

    invoke-direct {v0, v1}, Ln1/g;-><init>(I)V

    iput-object v0, p0, Ln1/c;->b:Ln1/f;

    new-instance v0, Ln1/g;

    invoke-direct {v0, v1}, Ln1/g;-><init>(I)V

    iput-object v0, p0, Ln1/c;->c:Ln1/f;

    const/16 v0, 0x20

    new-array v0, v0, [Ln1/i;

    iput-object v0, p0, Ln1/c;->d:[Ln1/i;

    return-void
.end method
