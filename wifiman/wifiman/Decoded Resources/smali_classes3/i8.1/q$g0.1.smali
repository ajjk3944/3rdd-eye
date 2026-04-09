.class public final Li8/q$g0;
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
.field final synthetic a:Li8/a$b;

.field final synthetic b:Li8/q;


# direct methods
.method public constructor <init>(Li8/a$b;Li8/q;)V
    .locals 0

    iput-object p1, p0, Li8/q$g0;->a:Li8/a$b;

    iput-object p2, p0, Li8/q$g0;->b:Li8/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 10

    :try_start_0
    sget-object v0, LO7/a;->SSO_ACCOUNT_DONE:LO7/a;

    invoke-virtual {v0}, LO7/a;->getCode()I

    move-result v0

    new-instance v9, Li8/a$a$h;

    const/high16 v1, 0x10a0000

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const v1, 0x10a0001

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-instance v6, Li8/q$G0;

    iget-object v0, p0, Li8/q$g0;->a:Li8/a$b;

    iget-object v1, p0, Li8/q$g0;->b:Li8/q;

    invoke-direct {v6, v0, v1}, Li8/q$G0;-><init>(Li8/a$b;Li8/q;)V

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Li8/a$a$h;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLmh/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v9}, Lgg/o;->onSuccess(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
