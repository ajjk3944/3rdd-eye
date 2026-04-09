.class LM6/g$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM6/g$b;->N(Lgg/B;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LM6/g$b;


# direct methods
.method constructor <init>(LM6/g$b;)V
    .locals 0

    iput-object p1, p0, LM6/g$b$b;->a:LM6/g$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LG6/N$b;)Z
    .locals 1

    sget-object v0, LG6/N$b;->DISCONNECTED:LG6/N$b;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, LG6/N$b;

    invoke-virtual {p0, p1}, LM6/g$b$b;->a(LG6/N$b;)Z

    move-result p1

    return p1
.end method
