.class public abstract LD3/B;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;)LD3/A;
    .locals 1

    new-instance p0, LD3/v;

    invoke-direct {p0}, LD3/v;-><init>()V

    const-string v0, "common"

    invoke-virtual {p0, v0}, LD3/v;->d(Ljava/lang/String;)LD3/A;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LD3/A;->a(Z)LD3/A;

    invoke-virtual {p0, v0}, LD3/A;->b(I)LD3/A;

    return-object p0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()Z
.end method
