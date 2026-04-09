.class final LPf/d$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPf/d;-><init>(Lcom/ui/wmw/api/v1/a;LKf/e;LMf/s;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LPf/d;


# direct methods
.method constructor <init>(LPf/d;)V
    .locals 0

    iput-object p1, p0, LPf/d$e;->a:LPf/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)Lgg/f;
    .locals 2

    const-string v0, "fwUploadRunning"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lgg/b;->m()Lgg/b;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0xa

    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, p1}, Lgg/z;->U(JLjava/util/concurrent/TimeUnit;)Lgg/z;

    move-result-object p1

    new-instance v0, LPf/d$e$a;

    iget-object v1, p0, LPf/d$e;->a:LPf/d;

    invoke-direct {v0, v1}, LPf/d$e$a;-><init>(LPf/d;)V

    invoke-virtual {p1, v0}, Lgg/z;->s(Lkg/n;)Lgg/z;

    move-result-object p1

    new-instance v0, LPf/d$e$b;

    iget-object v1, p0, LPf/d$e;->a:LPf/d;

    invoke-direct {v0, v1}, LPf/d$e$b;-><init>(LPf/d;)V

    invoke-virtual {p1, v0}, Lgg/z;->o(Lkg/f;)Lgg/z;

    move-result-object p1

    invoke-virtual {p1}, Lgg/z;->I()Lgg/i;

    move-result-object p1

    invoke-virtual {p1}, Lgg/i;->E0()Lgg/b;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LPf/d$e;->a(Ljava/lang/Boolean;)Lgg/f;

    move-result-object p1

    return-object p1
.end method
