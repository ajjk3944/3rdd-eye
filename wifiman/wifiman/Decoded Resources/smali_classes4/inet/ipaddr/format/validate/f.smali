.class public abstract Linet/ipaddr/format/validate/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract c(IILjava/lang/Integer;)LZf/d;
.end method

.method public abstract d(I)[LZf/d;
.end method

.method protected abstract h(LZf/c;LZf/f;)Linet/ipaddr/a;
.end method

.method protected abstract j(LZf/c;Ljava/lang/CharSequence;LZf/f;)Linet/ipaddr/a;
.end method

.method protected abstract l(LZf/c;Ljava/lang/CharSequence;LZf/f;Linet/ipaddr/a;Linet/ipaddr/a;)Linet/ipaddr/a;
.end method

.method protected abstract m([BLjava/lang/CharSequence;)Linet/ipaddr/a;
.end method

.method protected n([LZf/d;LZf/f;Ljava/lang/Integer;)Linet/ipaddr/a;
    .locals 0

    invoke-virtual {p0, p1, p3}, Linet/ipaddr/format/validate/f;->p([LZf/d;Ljava/lang/Integer;)LZf/c;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Linet/ipaddr/format/validate/f;->h(LZf/c;LZf/f;)Linet/ipaddr/a;

    move-result-object p1

    return-object p1
.end method

.method protected o([LZf/d;Ljava/lang/CharSequence;LZf/f;Ljava/lang/Integer;)Linet/ipaddr/a;
    .locals 0

    invoke-virtual {p0, p1, p4}, Linet/ipaddr/format/validate/f;->p([LZf/d;Ljava/lang/Integer;)LZf/c;

    move-result-object p1

    invoke-virtual {p0, p1, p2, p3}, Linet/ipaddr/format/validate/f;->j(LZf/c;Ljava/lang/CharSequence;LZf/f;)Linet/ipaddr/a;

    move-result-object p1

    return-object p1
.end method

.method protected abstract p([LZf/d;Ljava/lang/Integer;)LZf/c;
.end method

.method protected abstract r([LZf/d;Ljava/lang/Integer;Z)LZf/c;
.end method

.method protected abstract s(IILjava/lang/Integer;Ljava/lang/CharSequence;IIZZIII)LZf/d;
.end method

.method protected abstract t([LZf/d;)LZf/c;
.end method

.method protected abstract v(ILjava/lang/Integer;Ljava/lang/CharSequence;IZII)LZf/d;
.end method

.method protected abstract y()I
.end method
