.class LG6/A$g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz2/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG6/A$g;->j(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LG6/A$g;


# direct methods
.method constructor <init>(LG6/A$g;)V
    .locals 0

    iput-object p1, p0, LG6/A$g$a;->a:LG6/A$g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()LK6/c$a;
    .locals 4

    new-instance v0, LG6/A$d;

    iget-object v1, p0, LG6/A$g$a;->a:LG6/A$g;

    invoke-static {v1}, LG6/A$g;->f(LG6/A$g;)LG6/A$c;

    move-result-object v1

    iget-object v2, p0, LG6/A$g$a;->a:LG6/A$g;

    invoke-static {v2}, LG6/A$g;->g(LG6/A$g;)LG6/A$g;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, LG6/A$d;-><init>(LG6/A$c;LG6/A$g;LG6/A$a;)V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LG6/A$g$a;->a()LK6/c$a;

    move-result-object v0

    return-object v0
.end method
