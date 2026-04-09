.class LG6/A$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG6/A$c;->m(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LG6/A$c;


# direct methods
.method constructor <init>(LG6/A$c;)V
    .locals 0

    iput-object p1, p0, LG6/A$c$a;->a:LG6/A$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LI6/a$a;
    .locals 3

    new-instance v0, LG6/A$f;

    iget-object v1, p0, LG6/A$c$a;->a:LG6/A$c;

    invoke-static {v1}, LG6/A$c;->g(LG6/A$c;)LG6/A$c;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LG6/A$f;-><init>(LG6/A$c;LG6/A$a;)V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LG6/A$c$a;->a()LI6/a$a;

    move-result-object v0

    return-object v0
.end method
