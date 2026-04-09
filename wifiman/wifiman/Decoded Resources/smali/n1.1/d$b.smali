.class Ln1/d$b;
.super Ln1/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic g:Ln1/d;


# direct methods
.method public constructor <init>(Ln1/d;Ln1/c;)V
    .locals 0

    iput-object p1, p0, Ln1/d$b;->g:Ln1/d;

    invoke-direct {p0}, Ln1/b;-><init>()V

    new-instance p1, Ln1/j;

    invoke-direct {p1, p0, p2}, Ln1/j;-><init>(Ln1/b;Ln1/c;)V

    iput-object p1, p0, Ln1/b;->e:Ln1/b$a;

    return-void
.end method
