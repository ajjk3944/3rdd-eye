.class public final LCc/p$l$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCc/p$l;->a(Ll9/a;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LCc/p;

.field final synthetic b:Lmh/l;

.field final synthetic c:Lh9/a;


# direct methods
.method public constructor <init>(LCc/p;Lmh/l;Lh9/a;)V
    .locals 0

    iput-object p1, p0, LCc/p$l$b;->a:LCc/p;

    iput-object p2, p0, LCc/p$l$b;->b:Lmh/l;

    iput-object p3, p0, LCc/p$l$b;->c:Lh9/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 13

    :try_start_0
    iget-object v0, p0, LCc/p$l$b;->a:LCc/p;

    invoke-static {v0}, LCc/p;->g(LCc/p;)LOb/a;

    move-result-object v0

    iget-object v1, p0, LCc/p$l$b;->a:LCc/p;

    iget-object v2, p0, LCc/p$l$b;->b:Lmh/l;

    new-instance v12, LCc/l;

    iget-object v3, p0, LCc/p$l$b;->c:Lh9/a;

    const-string v4, ":"

    invoke-virtual {v3, v4}, Lh9/a;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget-object v3, La8/b;->c:La8/b$a;

    iget-object v5, p0, LCc/p$l$b;->c:Lh9/a;

    invoke-virtual {v3, v5}, La8/b$a;->b(Lh9/a;)La8/b;

    move-result-object v5

    iget-object v6, p0, LCc/p$l$b;->c:Lh9/a;

    const/16 v10, 0x18

    const/4 v11, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    move-object v3, v12

    invoke-direct/range {v3 .. v11}, LCc/l;-><init>(Ljava/lang/String;La8/b;Lh9/a;Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v12}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LCc/l;

    invoke-static {v1, v2}, LCc/p;->j(LCc/p;LCc/l;)LOb/c;

    move-result-object v1

    invoke-interface {v0, v1}, LOb/a;->a(LOb/c;)J

    invoke-interface {p1}, Lgg/c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/c;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
