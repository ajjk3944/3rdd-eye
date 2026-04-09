.class final Lb3/e$b;
.super Lb3/o$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Lb3/o$b;

.field private b:Lb3/a;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb3/o$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lb3/o;
    .locals 4

    new-instance v0, Lb3/e;

    iget-object v1, p0, Lb3/e$b;->a:Lb3/o$b;

    iget-object v2, p0, Lb3/e$b;->b:Lb3/a;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lb3/e;-><init>(Lb3/o$b;Lb3/a;Lb3/e$a;)V

    return-object v0
.end method

.method public b(Lb3/a;)Lb3/o$a;
    .locals 0

    iput-object p1, p0, Lb3/e$b;->b:Lb3/a;

    return-object p0
.end method

.method public c(Lb3/o$b;)Lb3/o$a;
    .locals 0

    iput-object p1, p0, Lb3/e$b;->a:Lb3/o$b;

    return-object p0
.end method
