.class public abstract Lgd/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgd/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static synthetic a(Lgd/g;Ljava/lang/String;Lsh/i;ILjava/lang/Object;)Lgg/i;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, Lsh/i;

    const/4 p3, 0x0

    const p4, 0xffff

    invoke-direct {p2, p3, p4}, Lsh/i;-><init>(II)V

    :cond_0
    invoke-interface {p0, p1, p2}, Lgd/g;->a(Ljava/lang/String;Lsh/i;)Lgg/i;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: scan"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
