.class final Lb3/f$b;
.super Lb3/p$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Lb3/s;

.field private b:Lb3/p$b;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb3/p$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lb3/p;
    .locals 4

    new-instance v0, Lb3/f;

    iget-object v1, p0, Lb3/f$b;->a:Lb3/s;

    iget-object v2, p0, Lb3/f$b;->b:Lb3/p$b;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lb3/f;-><init>(Lb3/s;Lb3/p$b;Lb3/f$a;)V

    return-object v0
.end method

.method public b(Lb3/s;)Lb3/p$a;
    .locals 0

    iput-object p1, p0, Lb3/f$b;->a:Lb3/s;

    return-object p0
.end method

.method public c(Lb3/p$b;)Lb3/p$a;
    .locals 0

    iput-object p1, p0, Lb3/f$b;->b:Lb3/p$b;

    return-object p0
.end method
