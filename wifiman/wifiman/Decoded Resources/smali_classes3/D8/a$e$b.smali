.class public final LD8/a$e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LD8/a$e;->a(LWc/b;)Lgg/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ldf/b;

.field final synthetic b:Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;


# direct methods
.method public constructor <init>(Ldf/b;Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;)V
    .locals 0

    iput-object p1, p0, LD8/a$e$b;->a:Ldf/b;

    iput-object p2, p0, LD8/a$e$b;->b:Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/o;)V
    .locals 10

    :try_start_0
    iget-object v0, p0, LD8/a$e$b;->a:Ldf/b;

    sget-object v1, LD8/a$e$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LD8/a$e$b;->b:Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v2, Li8/a$b$o;

    invoke-direct {v2, v0}, Li8/a$b$o;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    iget-object v0, p0, LD8/a$e$b;->b:Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v2, Li8/a$b$D$c;

    invoke-direct {v2, v0}, Li8/a$b$D$c;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, LD8/a$e$b;->b:Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/ui/wifiman/model/ubiquiti/uisp/UispController$a;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v4, Lec/a$b;

    invoke-direct {v4, v0}, Lec/a$b;-><init>(Ljava/lang/CharSequence;)V

    new-instance v2, Li8/a$b$D$d;

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, v2

    invoke-direct/range {v3 .. v9}, Li8/a$b$D$d;-><init>(Lec/a;Lec/a;Lec/a;Ljava/io/File;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_3
    :goto_0
    if-eqz v2, :cond_4

    invoke-interface {p1, v2}, Lgg/o;->onSuccess(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-interface {p1}, Lgg/o;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    invoke-interface {p1, v0}, Lgg/o;->onError(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method
