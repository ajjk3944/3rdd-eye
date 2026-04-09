.class public final Li8/q$m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li8/q;->m(Li8/a$b;)Lgg/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Li8/q;

.field final synthetic b:Li8/a$b;


# direct methods
.method public constructor <init>(Li8/q;Li8/a$b;)V
    .locals 0

    iput-object p1, p0, Li8/q$m;->a:Li8/q;

    iput-object p2, p0, Li8/q$m;->b:Li8/a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 9

    :try_start_0
    new-instance v8, Li8/a$a$h;

    iget-object v0, p0, Li8/q$m;->a:Li8/q;

    invoke-static {v0}, Li8/q;->g(Li8/q;)Lnc/a;

    move-result-object v0

    iget-object v1, p0, Li8/q$m;->b:Li8/a$b;

    check-cast v1, Li8/a$b$C;

    invoke-virtual {v1}, Li8/a$b$C;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lnc/a;->c(Ljava/lang/String;)Lmh/l;

    move-result-object v5

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Li8/a$a$h;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v8}, Lgg/o;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
