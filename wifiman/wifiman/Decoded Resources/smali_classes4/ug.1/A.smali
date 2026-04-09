.class public final Lug/A;
.super Lgg/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lug/A$a;,
        Lug/A$c;,
        Lug/A$b;
    }
.end annotation


# instance fields
.field final a:[Lgg/D;

.field final b:Lkg/n;


# direct methods
.method public constructor <init>([Lgg/D;Lkg/n;)V
    .locals 0

    invoke-direct {p0}, Lgg/z;-><init>()V

    iput-object p1, p0, Lug/A;->a:[Lgg/D;

    iput-object p2, p0, Lug/A;->b:Lkg/n;

    return-void
.end method


# virtual methods
.method protected N(Lgg/B;)V
    .locals 5

    iget-object v0, p0, Lug/A;->a:[Lgg/D;

    array-length v1, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    aget-object v0, v0, v3

    new-instance v1, Lug/r$a;

    new-instance v2, Lug/A$a;

    invoke-direct {v2, p0}, Lug/A$a;-><init>(Lug/A;)V

    invoke-direct {v1, p1, v2}, Lug/r$a;-><init>(Lgg/B;Lkg/n;)V

    invoke-interface {v0, v1}, Lgg/D;->a(Lgg/B;)V

    return-void

    :cond_0
    new-instance v2, Lug/A$b;

    iget-object v4, p0, Lug/A;->b:Lkg/n;

    invoke-direct {v2, p1, v1, v4}, Lug/A$b;-><init>(Lgg/B;ILkg/n;)V

    invoke-interface {p1, v2}, Lgg/B;->c(Lhg/c;)V

    :goto_0
    if-ge v3, v1, :cond_3

    invoke-virtual {v2}, Lug/A$b;->isDisposed()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    aget-object p1, v0, v3

    if-nez p1, :cond_2

    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "One of the sources is null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1, v3}, Lug/A$b;->c(Ljava/lang/Throwable;I)V

    return-void

    :cond_2
    iget-object v4, v2, Lug/A$b;->c:[Lug/A$c;

    aget-object v4, v4, v3

    invoke-interface {p1, v4}, Lgg/D;->a(Lgg/B;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method
