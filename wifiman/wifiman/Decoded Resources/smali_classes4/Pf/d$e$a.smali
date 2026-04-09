.class final LPf/d$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPf/d$e;->a(Ljava/lang/Boolean;)Lgg/f;
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

    iput-object p1, p0, LPf/d$e$a;->a:LPf/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Long;)Lgg/D;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LPf/d$e$a;->a:LPf/d;

    invoke-static {p1}, LPf/d;->c(LPf/d;)Lcom/ui/wmw/api/v1/a;

    move-result-object p1

    invoke-interface {p1}, Lcom/ui/wmw/api/v1/a;->m()Lgg/z;

    move-result-object p1

    sget-object v0, LPf/d$e$a$a;->a:LPf/d$e$a$a;

    invoke-virtual {p1, v0}, Lgg/z;->L(Lkg/n;)Lgg/z;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, LPf/d$e$a;->a(Ljava/lang/Long;)Lgg/D;

    move-result-object p1

    return-object p1
.end method
