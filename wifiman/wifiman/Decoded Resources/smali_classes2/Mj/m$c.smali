.class final LMj/m$c;
.super LMj/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LMj/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field private final d:LMj/e;


# direct methods
.method constructor <init>(LMj/v;Lokhttp3/Call$Factory;LMj/h;LMj/e;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LMj/m;-><init>(LMj/v;Lokhttp3/Call$Factory;LMj/h;)V

    iput-object p4, p0, LMj/m$c;->d:LMj/e;

    return-void
.end method


# virtual methods
.method protected c(LMj/d;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LMj/m$c;->d:LMj/e;

    invoke-interface {v0, p1}, LMj/e;->b(LMj/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LMj/d;

    array-length v0, p2

    add-int/lit8 v0, v0, -0x1

    aget-object p2, p2, v0

    check-cast p2, Ldh/e;

    :try_start_0
    invoke-static {p1, p2}, LMj/o;->c(LMj/d;Ldh/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-static {p1, p2}, LMj/o;->e(Ljava/lang/Throwable;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
