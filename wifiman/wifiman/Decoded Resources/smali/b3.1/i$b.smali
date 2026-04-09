.class final Lb3/i$b;
.super Lb3/s$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Lb3/r;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb3/s$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lb3/s;
    .locals 3

    new-instance v0, Lb3/i;

    iget-object v1, p0, Lb3/i$b;->a:Lb3/r;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lb3/i;-><init>(Lb3/r;Lb3/i$a;)V

    return-object v0
.end method

.method public b(Lb3/r;)Lb3/s$a;
    .locals 0

    iput-object p1, p0, Lb3/i$b;->a:Lb3/r;

    return-object p0
.end method
