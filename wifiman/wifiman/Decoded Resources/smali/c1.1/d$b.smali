.class Lc1/d$b;
.super Lc1/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# direct methods
.method constructor <init>(Lc1/c;)V
    .locals 1

    invoke-direct {p0}, Lc1/b;-><init>()V

    new-instance v0, Lc1/j;

    invoke-direct {v0, p0, p1}, Lc1/j;-><init>(Lc1/b;Lc1/c;)V

    iput-object v0, p0, Lc1/b;->e:Lc1/b$a;

    return-void
.end method
