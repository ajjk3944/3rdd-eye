.class LY6/p$d$a;
.super LY6/p$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY6/p$d;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:LY6/p$d;


# direct methods
.method constructor <init>(LY6/p$d;)V
    .locals 0

    iput-object p1, p0, LY6/p$d$a;->e:LY6/p$d;

    iget-object p1, p1, LY6/p$d;->a:LY6/p;

    invoke-direct {p0, p1}, LY6/p$f;-><init>(LY6/p;)V

    return-void
.end method


# virtual methods
.method public c()Ljava/util/Map$Entry;
    .locals 1

    invoke-virtual {p0}, LY6/p$f;->a()LY6/p$g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LY6/p$d$a;->c()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method
