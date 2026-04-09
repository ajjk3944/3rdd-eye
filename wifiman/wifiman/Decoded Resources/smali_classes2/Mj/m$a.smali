.class final LMj/m$a;
.super LMj/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LMj/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private final d:LMj/e;


# direct methods
.method constructor <init>(LMj/v;Lokhttp3/Call$Factory;LMj/h;LMj/e;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LMj/m;-><init>(LMj/v;Lokhttp3/Call$Factory;LMj/h;)V

    iput-object p4, p0, LMj/m$a;->d:LMj/e;

    return-void
.end method


# virtual methods
.method protected c(LMj/d;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    iget-object p2, p0, LMj/m$a;->d:LMj/e;

    invoke-interface {p2, p1}, LMj/e;->b(LMj/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
