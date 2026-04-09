.class LY6/p$e$a;
.super LY6/p$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY6/p$e;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:LY6/p$e;


# direct methods
.method constructor <init>(LY6/p$e;)V
    .locals 0

    iput-object p1, p0, LY6/p$e$a;->e:LY6/p$e;

    iget-object p1, p1, LY6/p$e;->a:LY6/p;

    invoke-direct {p0, p1}, LY6/p$f;-><init>(LY6/p;)V

    return-void
.end method


# virtual methods
.method public next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LY6/p$f;->a()LY6/p$g;

    move-result-object v0

    iget-object v0, v0, LY6/p$g;->f:Ljava/lang/Object;

    return-object v0
.end method
