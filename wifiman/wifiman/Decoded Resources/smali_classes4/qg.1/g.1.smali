.class public final Lqg/g;
.super Lqg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/g$e;,
        Lqg/g$f;,
        Lqg/g$c;,
        Lqg/g$g;,
        Lqg/g$d;,
        Lqg/g$b;
    }
.end annotation


# instance fields
.field final c:Lkg/n;

.field final d:I

.field final e:Lzg/g;


# direct methods
.method public constructor <init>(Lgg/i;Lkg/n;ILzg/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lqg/b;-><init>(Lgg/i;)V

    iput-object p2, p0, Lqg/g;->c:Lkg/n;

    iput p3, p0, Lqg/g;->d:I

    iput-object p4, p0, Lqg/g;->e:Lzg/g;

    return-void
.end method

.method public static h2(LDj/b;Lkg/n;ILzg/g;)LDj/b;
    .locals 2

    sget-object v0, Lqg/g$a;->a:[I

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    aget p3, v0, p3

    const/4 v0, 0x1

    if-eq p3, v0, :cond_1

    const/4 v1, 0x2

    if-eq p3, v1, :cond_0

    new-instance p3, Lqg/g$d;

    invoke-direct {p3, p0, p1, p2}, Lqg/g$d;-><init>(LDj/b;Lkg/n;I)V

    return-object p3

    :cond_0
    new-instance p3, Lqg/g$c;

    invoke-direct {p3, p0, p1, p2, v0}, Lqg/g$c;-><init>(LDj/b;Lkg/n;IZ)V

    return-object p3

    :cond_1
    new-instance p3, Lqg/g$c;

    const/4 v0, 0x0

    invoke-direct {p3, p0, p1, p2, v0}, Lqg/g$c;-><init>(LDj/b;Lkg/n;IZ)V

    return-object p3
.end method


# virtual methods
.method protected E1(LDj/b;)V
    .locals 4

    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    iget-object v1, p0, Lqg/g;->c:Lkg/n;

    invoke-static {v0, p1, v1}, Lqg/i0;->b(LDj/a;LDj/b;Lkg/n;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lqg/b;->b:Lgg/i;

    iget-object v1, p0, Lqg/g;->c:Lkg/n;

    iget v2, p0, Lqg/g;->d:I

    iget-object v3, p0, Lqg/g;->e:Lzg/g;

    invoke-static {p1, v1, v2, v3}, Lqg/g;->h2(LDj/b;Lkg/n;ILzg/g;)LDj/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lgg/i;->b(LDj/b;)V

    return-void
.end method
