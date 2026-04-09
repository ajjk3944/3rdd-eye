.class public abstract Lc3/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc3/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;I)Lc3/i$a;
    .locals 1

    invoke-virtual {p0}, Lc3/i$a;->e()Ljava/util/Map;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final b(Ljava/lang/String;J)Lc3/i$a;
    .locals 1

    invoke-virtual {p0}, Lc3/i$a;->e()Ljava/util/Map;

    move-result-object v0

    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)Lc3/i$a;
    .locals 1

    invoke-virtual {p0}, Lc3/i$a;->e()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public abstract d()Lc3/i;
.end method

.method protected abstract e()Ljava/util/Map;
.end method

.method protected abstract f(Ljava/util/Map;)Lc3/i$a;
.end method

.method public abstract g(Ljava/lang/Integer;)Lc3/i$a;
.end method

.method public abstract h(Lc3/h;)Lc3/i$a;
.end method

.method public abstract i(J)Lc3/i$a;
.end method

.method public abstract j([B)Lc3/i$a;
.end method

.method public abstract k([B)Lc3/i$a;
.end method

.method public abstract l(Ljava/lang/Integer;)Lc3/i$a;
.end method

.method public abstract m(Ljava/lang/String;)Lc3/i$a;
.end method

.method public abstract n(Ljava/lang/String;)Lc3/i$a;
.end method

.method public abstract o(J)Lc3/i$a;
.end method
