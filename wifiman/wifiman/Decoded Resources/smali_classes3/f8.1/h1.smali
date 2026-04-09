.class public abstract Lf8/h1;
.super Lg8/l;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lg8/l;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lg8/l;->onCreate(Landroid/os/Bundle;)V

    new-instance p1, Lf8/h1$a;

    invoke-direct {p1, p0}, Lf8/h1$a;-><init>(Lf8/h1;)V

    const v0, 0x23f2b0ed

    const/4 v1, 0x1

    invoke-static {v0, v1, p1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p0, v0, p1, v1, v0}, Ld/b;->b(Lc/j;LT/q;Lmh/p;ILjava/lang/Object;)V

    return-void
.end method
