.class final Lb3/m$b;
.super Lb3/w$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Lb3/w$c;

.field private b:Lb3/w$b;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb3/w$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lb3/w;
    .locals 4

    new-instance v0, Lb3/m;

    iget-object v1, p0, Lb3/m$b;->a:Lb3/w$c;

    iget-object v2, p0, Lb3/m$b;->b:Lb3/w$b;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lb3/m;-><init>(Lb3/w$c;Lb3/w$b;Lb3/m$a;)V

    return-object v0
.end method

.method public b(Lb3/w$b;)Lb3/w$a;
    .locals 0

    iput-object p1, p0, Lb3/m$b;->b:Lb3/w$b;

    return-object p0
.end method

.method public c(Lb3/w$c;)Lb3/w$a;
    .locals 0

    iput-object p1, p0, Lb3/m$b;->a:Lb3/w$c;

    return-object p0
.end method
